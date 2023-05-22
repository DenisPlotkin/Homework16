public class Main {
    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();
        try {
            bankApplication.process("accountId000", 50, "USD");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        try {
            bankApplication.process("accountId003", 250, "HRV");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        try {
            bankApplication.process("accountId001", 50, "EUR");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        try {
            bankApplication.process("accountId001", 50, "USD");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        try {
            bankApplication.process("accountId001", 50, "USD");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }
    }
}
