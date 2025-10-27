import deals.*;
import taxes.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Пример 1: Компания на УСН 'Доходы' ===");
        Company company1 = new Company("Альфа", new TaxIncome());
        company1.shiftMoney(100000);
        company1.shiftMoney(-20000);
        company1.payTaxes();
        System.out.println();


        System.out.println("=== Пример 2: Компания на УСН 'Доходы минус расходы' ===");
        Company company2 = new Company("Бета", new TaxIncomeMinusOutcome());
        company2.shiftMoney(100000);
        company2.shiftMoney(-20000);
        company2.payTaxes();
        System.out.println();


        System.out.println("=== Пример 3: Применение сделок (продажа и расходы) ===");
        Deal[] deals = {
                new Sale("телефона", 50000),
                new Expenditure("аренды офиса", 15000),
                new Expenditure("рекламы", 10000)
        };

        int profitBeforeTax = company2.applyDeals(deals);
        System.out.println("Прибыль до уплаты налогов: " + profitBeforeTax + " руб.");
        System.out.println();


        System.out.println("=== Пример 4: Смена системы налогообложения ===");
        company2.setTaxSystem(new TaxIncome());
        company2.shiftMoney(50000);
        company2.payTaxes();
        System.out.println();

        System.out.println("=== Программа завершена ===");
    }
}