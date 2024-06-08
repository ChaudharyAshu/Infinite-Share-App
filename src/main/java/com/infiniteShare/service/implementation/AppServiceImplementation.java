package com.infiniteShare.service.implementation;

import com.infiniteShare.service.AppService;
import com.infiniteShare.shared.utils.FileUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AppServiceImplementation implements AppService {

    @Autowired
    FileUtils fileUtils;

    @Value("${download-source-location}")
    String downloadSourceLocation;
    @Override
    public void shutdownApp() {
        fileUtils.deleteDirectory(downloadSourceLocation);
        System.exit(0);
    }
}
