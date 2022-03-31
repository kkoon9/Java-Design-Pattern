package facade.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 데이터베이스 이름을 지정하고 그것에 대응하는 Properties를 작성하는 클래스
 */
public class Database {
    private Database() {} // new 인스턴스를 생성시키지 않기 위해 private 선언

    public static Properties getProperties(String dbname) {
        String filename = "/Users/eric/Documents/Java-Design-Pattern/src/facade/" + dbname + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(filename));
        } catch (IOException e) {
            System.out.println("Warning: " + filename + " is not found.");
        }
        return prop;
    }
}
