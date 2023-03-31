package com.example.demo;

public class Test {
    private BeanTest beanTest;

    int number=1;

    public int getNumber() {
        return number;
    }
    public void setNumber(int value) {
        number=value;
    }

/*    public Test(BeanTest beanTest){
    this.beanTest=beanTest;

    }*/

    public BeanTest getBeanTest(){
        return beanTest;
    };
    public void setBeanTest(BeanTest value){
        beanTest=value;
    };

}
