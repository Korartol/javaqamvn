import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")

        // Пользователь зарегистрирован
    void shouldCalculateForRegisteredAndUnderLimit(long expected, long amount, boolean registered) {
        BonusService service = new BonusService();

        // подготавливаем данные:
//        long amount = 1000;
//        boolean registered = true;
//        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
//
//    @org.junit.jupiter.api.Test  // Пользователь не зарегистрирован
//    void shouldCalculateForUnregisteredAndUnderLimit() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные:
//        long amount = 1000;
//        boolean registered = false;
//        long expected = 10;
//
//        // вызываем целевой метод:
//        long actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }
//
//    @org.junit.jupiter.api.Test  // Лимит по бонусам у зарегистрированного пользователя
//    void shouldCalculateForRegisteredAndOverLimit() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные:
//        long amount = 1_000_000;
//        boolean registered = true;
//        long expected = 500;
//
//        // вызываем целевой метод:
//        long actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }
//
//    @org.junit.jupiter.api.Test  // Лимит по бонусам у не зарегистрированного пользователя
//    void shouldCalculateForUnregisteredAndOverLimit() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные:
//        long amount = 1_000_000;
//        boolean registered = false;
//        long expected = 500;
//
//        // вызываем целевой метод:
//        long actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }
//
//    @org.junit.jupiter.api.Test  // Граничный лимит по бонусам у зарегистрированного пользователя
//    void shouldCalculateForRegisteredAndOverLimitValue() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные:
//        long amount = 16_667;
//        boolean registered = true;
//        long expected = 500;
//
//        // вызываем целевой метод:
//        long actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }
//
//    @org.junit.jupiter.api.Test  // Граничный лимит по бонусам у не зарегистрированного пользователя
//    void shouldCalculateForUnregisteredAndOverLimitValue() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные:
//        long amount = 50_001;
//        boolean registered = false;
//        long expected = 500;
//
//        // вызываем целевой метод:
//        long actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }
//
//    @org.junit.jupiter.api.Test  // Граничный лимит по бонусам у зарегистрированного пользователя
//    void shouldCalculateForRegisteredAndUnderLimitValue() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные:
//        long amount = 16_666;
//        boolean registered = true;
//        long expected = 499;
//
//        // вызываем целевой метод:
//        long actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }
//
//    @org.junit.jupiter.api.Test  // Граничный лимит по бонусам у не зарегистрированного пользователя
//    void shouldCalculateForUnregisteredAndUnderLimitValue() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные:
//        long amount = 49_999;
//        boolean registered = false;
//        long expected = 499;
//
//        // вызываем целевой метод:
//        long actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }
//
//
//    @org.junit.jupiter.api.Test  // Сумма меньше чем нужно для получения бонуса у зарегистрированного пользователя
//    void shouldCalculateForRegisteredAndNoLimitValue() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные:
//        long amount = 1;
//        boolean registered = true;
//        long expected = 0;
//
//        // вызываем целевой метод:
//        long actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }
//
//    @org.junit.jupiter.api.Test  // Сумма меньше чем нужно для получения бонуса у не зарегистрированного пользователя
//    void shouldCalculateForUnregisteredAndNoLimitValue() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные:
//        long amount = 1;
//        boolean registered = false;
//        long expected = 0;
//
//        // вызываем целевой метод:
//        long actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }
//
//    @org.junit.jupiter.api.Test  // Минимальный бонус у зарегистрированного пользователя
//    void shouldCalculateForRegisteredAndMinLimitValue() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные:
//        long amount = 34;
//        boolean registered = true;
//        long expected = 1;
//
//        // вызываем целевой метод:
//        long actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }
//
//    @org.junit.jupiter.api.Test  // Граница минимального бонуса у зарегистрированного пользователя
//    void shouldCalculateForRegisteredAndMinLimitValue2() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные:
//        long amount = 33;
//        boolean registered = true;
//        long expected = 0;
//
//        // вызываем целевой метод:
//        long actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }
//
//    @org.junit.jupiter.api.Test  // Минимальный бонус у не зарегистрированного пользователя
//    void shouldCalculateForUnregisteredAndMinLimitValue() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные:
//        long amount = 100;
//        boolean registered = false;
//        long expected = 1;
//
//        // вызываем целевой метод:
//        long actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }
//
//    @org.junit.jupiter.api.Test  // Граница минимального бонуса у не зарегистрированного пользователя
//    void shouldCalculateForUnregisteredAndMinLimitValue2() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные:
//        long amount = 99;
//        boolean registered = false;
//        long expected = 0;
//
//        // вызываем целевой метод:
//        long actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }
}