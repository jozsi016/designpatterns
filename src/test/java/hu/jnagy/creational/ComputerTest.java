package hu.jnagy.creational;

import org.junit.Test;

public class ComputerTest {

    @Test
    public void shouldCreateComputer(){
        Computer computer = new Computer.Builder().withCPU("400000").withHDD("HDD").build();
        System.out.println(computer);
    }
}
