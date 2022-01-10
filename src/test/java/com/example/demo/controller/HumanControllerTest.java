package com.example.demo.controller;

import com.example.demo.entity.Human;
import com.example.demo.repository.HumanRepository;
import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.testng.annotations.BeforeClass;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

public class HumanControllerTest {

    private static HumanController HumanController;
    private static HumanRepository mockedHumanRepository;
    private static BindingResult mockedBindingResult;
    private static Model mockedModel;

    @BeforeClass
    public static void setUpHumanControllerInstance() {
        mockedHumanRepository = mock(HumanRepository.class);
        mockedBindingResult = mock(BindingResult.class);
        mockedModel = mock(Model.class);
        HumanController = new HumanController(mockedHumanRepository);
    }
/*
    @Test
    public void whenCalledIndex_thenCorrect() {
        assertThat(HumanController.showUserList(mockedModel)).isEqualTo("showHuman");
    }

    @Test
    public void whenCalledshowSignUpForm_thenCorrect() {
        Human human = new Human();
        human.setName("Sidr");
        human.setSurname("Sidrov");
        human.setAge((new Long(25)));

        assertThat(HumanController.showSignUpForm(human)).isEqualTo("addHuman");
    }

    @Test
    public void whenCalledaddUserAndValidUser_thenCorrect() {
        User user = new User("John", "john@domain.com");

        when(mockedBindingResult.hasErrors()).thenReturn(false);

        assertThat(HumanController.addUser(user, mockedBindingResult, mockedModel)).isEqualTo("redirect:/index");
    }

    @Test
    public void whenCalledaddUserAndInValidUser_thenCorrect() {
        User user = new User("John", "john@domain.com");

        when(mockedBindingResult.hasErrors()).thenReturn(true);

        assertThat(HumanController.addUser(user, mockedBindingResult, mockedModel)).isEqualTo("add-user");
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenCalledshowUpdateForm_thenIllegalArgumentException() {
        assertThat(HumanController.showUpdateForm(0, mockedModel)).isEqualTo("update-user");
    }

    @Test
    public void whenCalledupdateUserAndValidUser_thenCorrect() {
        User user = new User("John", "john@domain.com");

        when(mockedBindingResult.hasErrors()).thenReturn(false);

        assertThat(HumanController.updateUser(1l, user, mockedBindingResult, mockedModel)).isEqualTo("redirect:/index");
    }

    @Test
    public void whenCalledupdateUserAndInValidUser_thenCorrect() {
        User user = new User("John", "john@domain.com");

        when(mockedBindingResult.hasErrors()).thenReturn(true);

        assertThat(HumanController.updateUser(1l, user, mockedBindingResult, mockedModel)).isEqualTo("update-user");
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenCalleddeleteUser_thenIllegalArgumentException() {
        assertThat(HumanController.deleteUser(1l, mockedModel)).isEqualTo("redirect:/index");
    }

 */
}