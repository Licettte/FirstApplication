package com.example.firstapplication1.service;

import static com.example.firstapplication1.model.Kind.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.util.AssertionErrors.assertTrue;

import com.example.firstapplication1.model.BankAccount;
import com.example.firstapplication1.model.Kind;
import java.io.File;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class BankAccountClassTest {

  @Autowired
  private BankAccountClass bankAccountClass;
  Kind kind;
  BankAccount bankAccount;

  @Test
  public void testCorrectAnyKind() throws Exception {
    assertTrue("Correct Any Kind", (MALE.equals(bankAccountClass.bankAccount(ANY).getKind())
        || FEMALE.equals(bankAccountClass.bankAccount(ANY).getKind())));
  }

  @Test
  public void testCorrectFemaleKind() throws Exception {
    assertEquals(FEMALE, bankAccountClass.bankAccount(FEMALE).getKind());
  }

  @Test
  public void testCorrectMaleKind() throws Exception {
    assertEquals(MALE, bankAccountClass.bankAccount(MALE).getKind());
  }

  @MockBean
  Reader reader;

  @Test
  public void testCheckFile() throws Exception {

    when(reader.reader(new File("D:\\lp2\\NamesForBankAccounts\\MansNames.txt")))
        .thenReturn("Ваня");
    when(reader.reader(new File("D:\\lp2\\NamesForBankAccounts\\MansPatronymics.txt")))
        .thenReturn("Эдуардович");
    when(reader.reader(new File("D:\\lp2\\NamesForBankAccounts\\MansSurnames.txt")))
        .thenReturn("Дмитриев");

    assertEquals("Ваня", bankAccountClass.bankAccount(MALE).getFirstName());
    assertEquals("Дмитриев", bankAccountClass.bankAccount(MALE).getLastName());
    assertEquals("Эдуардович", bankAccountClass.bankAccount(MALE).getPatronymic());

    when(reader.reader(new File("D:\\lp2\\NamesForBankAccounts\\WomansNames.txt")))
        .thenReturn("Анфиса");
    when(reader.reader(new File("D:\\lp2\\NamesForBankAccounts\\WomansPatronymics.txt")))
        .thenReturn("Эдуардовна");
    when(reader.reader(new File("D:\\lp2\\NamesForBankAccounts\\WomansSurnames.txt")))
        .thenReturn("Дмитриева");

    assertEquals("Анфиса", bankAccountClass.bankAccount(FEMALE).getFirstName());
    assertEquals("Дмитриева", bankAccountClass.bankAccount(FEMALE).getLastName());
    assertEquals("Эдуардовна", bankAccountClass.bankAccount(FEMALE).getPatronymic());
  }
}