package de.fw.backend.Logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LogService {

    public static final Logger logger = LoggerFactory.getLogger(LogService.class);

}