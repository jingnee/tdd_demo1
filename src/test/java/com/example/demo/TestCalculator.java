package com.example.demo;

import com.example.demo.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 * Application SRS(요구사항) : 계산기(Calculator)
 * 1. 2가지 숫자의 정수 덧셈
 * 2. 2가지 숫자의 정수 뺄셈
 * */
public class TestCalculator {
    //annotation -> 부가 설명, 기능을 코드 없이 설정
    @Test
    public void testAdd(){
        Calculator calc = new Calculator();
        int result = calc.add(10,20);
        //print문으로 테스트하면 항상 테스트 통과로 나온다.
        assertTrue(result == 30);

    }

    @Test
    public void testSub(){
        Calculator calc = new Calculator();
        int result = calc.sub(20,10);
        assertTrue(result == 10);

    }

    @Test
    public void testAddError(){
        Calculator calc = new Calculator();
        int result = calc.add(20,10);
        assertFalse(result != 30);

    }

    @Test
    public void testSubError(){
        Calculator calc = new Calculator();
        int result = calc.sub(10,20);
        //assertFalse(result != -20);
        assertEquals(result,-10,"결과는 -10이어야 합니다.");
    }
}
