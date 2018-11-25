package test.java;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.java.builder.BeehiveBuilderTest;
import test.java.builder.BeehiveTest;
import test.java.decorator.DecoratorTest;
import test.java.prototype.BeeTest;
import test.java.singleton.SingletonTest;

@RunWith(Suite.class)
@SuiteClasses(
        {BeehiveTest.class, BeehiveBuilderTest.class, SingletonTest.class,
         DecoratorTest.class, BeeTest.class})

public class TestSuite {}
