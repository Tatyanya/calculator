package com.epam.tam.task4.runner;

import com.epam.tam.task4.listener.TestListener;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        TestListenerAdapter tla = new TestListenerAdapter();
        TestNG tng = new TestNG();

        tng.addListener(tla);
        tng.addListener(new TestListener());

        XmlSuite suite = new XmlSuite();
        suite.setName("TmpSuite");

        List<String> files = new ArrayList<String>();
        files.addAll(new ArrayList<String>() {
            {
                add("./src/test/resources/calcAllTest.xml");
                add("./src/test/resources/parallel.xml");
                add("./src/test/resources/group.xml");

            }
        });

        suite.setSuiteFiles(files);
       // suite.setParallel(XmlSuite.ParallelMode.METHODS);
        //suite.setThreadCount(2);

        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(suite);
        tng.setXmlSuites(suites);

        tng.run();
    }
}
