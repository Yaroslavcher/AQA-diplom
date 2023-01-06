package ru.netology.diplom.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import ru.netology.diplom.page.BuyPage;

public class BuyTest {

    @BeforeEach
    void setUp() {
        buyPage = open("http://localhost:8080", BuyPage.class);
    }

    @AfterAll
    static void teardown() {
        cleanDatabase();
    }
}
