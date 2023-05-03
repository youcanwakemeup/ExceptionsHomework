package ExceptionsHomework;

import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Main {
    public static void register(String login, String password, String confirmPassword)  {
        if (login.length() > 20 || !login.matches("^[a-zA-Z0-9_]*$")) {
            throw new WrongLoginException("Неверный логин");
        }
        if (!password.equals(confirmPassword) || password.length() >= 20 || !password.matches("^[a-zA-Z0-9_]*$")) {
            throw new WrongPasswordException("Неверный пароль");
        }
    }
    public static void main(String[] args) {
        try {
            register("sky_pro", "skyprojava", "skypro");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Недопустимый логин или пароль!");
            e.printStackTrace();
        } finally {
            System.out.println("Попытка зарегистрироваться завершена");
        }
    }
}