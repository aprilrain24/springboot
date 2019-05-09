package com.ajacom.listener;

import org.springframework.boot.CommandLineRunner;

import java.util.Arrays;

/**
 * @author liucm
 *         Date 2019/4/9
 *         Time 15:00
 */
public class HelloCommandLineRunner implements CommandLineRunner {
    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner...run..."+ Arrays.asList(args));
    }
}
