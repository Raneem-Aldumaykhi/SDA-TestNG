package sda.tests.day18;

import org.testng.annotations.Test;
import sda.utility.TestBase;

public class C01ParallelTest01  {

    @Test
    public void test01(){
        String threadName =Thread.currentThread().getName();
        System.out.println("Thread executing for Test01"+threadName);

    }

    @Test
    public void test02(){
        String threadName =Thread.currentThread().getName();
        System.out.println("Thread executing for Test02"+threadName);
    }

    @Test
    public void test03(){
        String threadName =Thread.currentThread().getName();
        System.out.println("Thread executing for Test03"+threadName);
    }

    @Test
    public void test04(){
        String threadName =Thread.currentThread().getName();
        System.out.println("Thread executing for Test04"+threadName);
    }

    @Test
    public void test05(){
        String threadName =Thread.currentThread().getName();
        System.out.println("Thread executing for Test05"+threadName);
    }

    @Test
    public void test06(){
        String threadName =Thread.currentThread().getName();
        System.out.println("Thread executing for Test06"+threadName);
    }

    @Test
    public void test07(){
        String threadName =Thread.currentThread().getName();
        System.out.println("Thread executing for Test07"+threadName);
    }

    @Test
    public void test08(){
        String threadName =Thread.currentThread().getName();
        System.out.println("Thread executing for Test08"+threadName);
    }


}
