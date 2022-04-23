package classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;

public class StringClass {
    public static void print(Object args) {
        System.out.println(args);
    }

    public static void main(String[] args) {
        String name = "Dicky Julian";
        String[] names = {"Dicky", "Julian", "Pratama"};

        propertiesFile();
    }

    // MUTABLE STRING
    static void mutableString(String args) {
        StringBuilder name = new StringBuilder(args);
        name.append(" " + "Pratama");
        print(name);
    }

    // JOIN STRING
    static void joinString(String[] args) {
        StringJoiner name = new StringJoiner(" ", "[", "]");

        for (String n : args) {
            name.add(n);
        }

        print(name);
    }

    // TOKENIZER STRING
    static void tokenizeString(String args) {
        StringTokenizer name = new StringTokenizer(args, " ");

        while(name.hasMoreTokens()) {
            String token = name.nextToken();
            print(token);
        }
    }

    // BIG NUMBER OPERATOR
    static void bigNumberOperator() {
        // BigInteger => bigger than long
        // BigDecimal => bigger than float
        BigInteger a = new BigInteger("10000000000");
        BigInteger b = new BigInteger("10000000000");

        // Big Number operators
        BigInteger c = a.add(b); // a + b
        BigInteger d = a.subtract(b); // a - b
        BigInteger e = a.multiply(b); // a * b
        BigInteger f = a.divide(b); // a / b
        BigInteger g = a.mod(b); // a % b
    }

    // SCANNER (IO - Input Output)
    static void scannerClasses() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.print("hallo " + name + " !!!");
    }

    // DATE & CALENDAR
    static void dateCalendarClasses() {
        Date today = new Date(); // Sat Apr 23 13:11:28 ICT 2022
        Date birthDate = new Date(1658124900000L); // Mon Jul 18 13:15:00 ICT 2022

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2022);
        calendar.set(Calendar.MONTH, 6);
        calendar.set(Calendar.DATE, 18);
        calendar.set(Calendar.HOUR_OF_DAY, 0);

        Date myDay = calendar.getTime(); // Mon Jul 18 00:20:26 ICT 2022
    }

    // SYSTEM CLASS
    static void systemClasses() {
        // currentTimeMillis() -> get time as millisecond
        long millisTime = System.currentTimeMillis(); // 1650695080634

        // nanoTime() -> get time as nanosecond
        long nanoTime = System.nanoTime(); // 344537785163400

        // getenv() -> get environment's variable
        String mySysPath = System.getenv("APP");

        // exit() -> end program
        System.exit(0);
    }

    // RUNTIME CLASS
    static void runtimeClasses() {
        Runtime runtime = Runtime.getRuntime();

        int cpuCore = runtime.availableProcessors(); // core cpu
        long freeMemory = runtime.freeMemory(); // free space JVM memory
        long totalMemory = runtime.totalMemory(); // total space JVM memory
        long maxMemory = runtime.maxMemory(); // max space JVM memory
    }

    // UUID CLASS (UNIVERSALLY UNIQUE IDENTIFIER)
    static void uuidClasses() {
        for (int i=0; i < 10; i++) {
            UUID uuid = UUID.randomUUID(); // 5d896c0e-4cc2-4ac6-b702-cfaaa28bbf30
        }
    }

    // BASE64 CLASS (ENCODING BASE64 -> BINARY KE TEXT_
    static void base64Classes() {
        String query = "5d896c0e-4cc2-4ac6-b702-cfaaa28bbf30";
        String encoded = Base64.getEncoder().encodeToString(query.getBytes());

        print(encoded); // NWQ4OTZjMGUtNGNjMi00YWM2LWI3MDItY2ZhYWEyOGJiZjMw

        byte[] decoded = Base64.getDecoder().decode(encoded); // [B@1b6d3586
        String stringDecoded = new String(decoded);
        print(stringDecoded); // 5d896c0e-4cc2-4ac6-b702-cfaaa28bbf30
    }

    // OBJECT CLASS
    static void objectClasses(Object name) {
        // name.toString will return exception
        // Objects.toString(name) its be fine

        print(Objects.toString(name)); // null
        print(Objects.hashCode(name)); // 0
        print(Objects.isNull(name)); // true
    }

    // GENERATE RANDOM DATA
    static void randomClasses() {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(999);
            print(num);
        }
    }

    // PROPERTIES FILE
    static void propertiesFile() {
        // properties file -> key value data
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("config.properties"));
            String host = properties.getProperty("database.host");

            print(host); // localhost
        } catch (FileNotFoundException exception) {
            print(exception.getMessage());
        } catch (IOException exception) {
            print("Gagal load data file.");
        }
    }
}
