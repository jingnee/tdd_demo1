package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMember {
    @Test
    public void testAddMember(){
        Member member = new Member();
        member.setName("컴퓨터");

        assertEquals("컴퓨터",member.getName());
    }
}
