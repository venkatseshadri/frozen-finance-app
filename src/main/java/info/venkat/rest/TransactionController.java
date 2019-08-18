package info.venkat.rest;

import info.venkat.model.TransactionEntity;
import info.venkat.service.impl.TransactionServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/finance/Transaction")
public class TransactionController {

    Logger logger = LoggerFactory.getLogger(TransactionController.class);

    @Autowired
    TransactionServiceImpl TransactionService;

    @RequestMapping("/create")
    public TransactionEntity createTransaction(TransactionEntity myTransaction)
    {
        logger.debug(">> createTransaction");
        return TransactionService.addTransaction(myTransaction);
    }

    @RequestMapping("/create/default")
    public TransactionEntity createDefaultTransaction()
    {
        logger.debug(">> createDefaultTransaction");
        return TransactionService.createDefaultTransaction();
    }
}
