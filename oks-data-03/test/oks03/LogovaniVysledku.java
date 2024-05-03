package oks03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.platform.engine.TestExecutionResult;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestIdentifier;

public class LogovaniVysledku implements TestExecutionListener {

    private static final Logger logger = LogManager.getLogger(LogovaniVysledku.class);

    @Override
    public void executionStarted(TestIdentifier testIdentifier) {
        String displayName = testIdentifier.getDisplayName();

        // Check if the line contains test data
        if (displayName.matches("\\d+:.*")) {
//            System.err.println(displayName);
            logger.info(displayName);
        }
    }

    @Override
    public void executionFinished(TestIdentifier testIdentifier, TestExecutionResult testExecutionResult) {
        String testName = testIdentifier.getDisplayName();

        if (testExecutionResult.getStatus() == TestExecutionResult.Status.FAILED) {
//            logger.error(testName);
            Throwable exception = testExecutionResult.getThrowable().orElse(null);
            if (exception != null) {
                logger.error(exception.getMessage());
            }
        } else {
//            logger.info(testName, testExecutionResult.getStatus());
        }
    }
}
