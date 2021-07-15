import java.sql.*;

public class Jdbc {
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost/hr";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "secret";

    public static void createTable() {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
            boolean b = statement.execute(
                    "CREATE TABLE emp(id int primary key,name varchar(15),department int,salary int,location varchar(20))");
            if (b == true)
                System.out.println("Tables created...");
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
            System.exit(1);
        } catch (ClassNotFoundException clsNotFoundEx) {
            clsNotFoundEx.printStackTrace();
            System.exit(1);
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (Exception e) {
                System.exit(1);
            }
        }
    }

    public static void createEmployee(int id, String name, int dept, int sal, String loc) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            preparedStatement = connection.prepareStatement("INSERT INTO emp VALUES(?,?,?,?,?)");
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, dept);
            preparedStatement.setInt(4, sal);
            preparedStatement.setString(5, loc);
            boolean b = preparedStatement.execute();
            if (b == true)
                System.out.println("1 record inserted...");
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
            System.exit(1);
        } catch (ClassNotFoundException clsNotFoundEx) {
            clsNotFoundEx.printStackTrace();
            System.exit(1);
        } finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (Exception e) {
                System.exit(1);
            }
        }
    }

    public static void updateSalary(int id, int raise) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            preparedStatement = connection.prepareStatement("UPDATE emp SET salary=salary+? WHERE id=?");
            preparedStatement.setInt(1, raise);
            preparedStatement.setInt(2, id);
            boolean b = preparedStatement.execute();
            if (b == true)
                System.out.println("$" + raise + " raised for emp id=" + id);
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
            System.exit(1);
        } catch (ClassNotFoundException clsNotFoundEx) {
            clsNotFoundEx.printStackTrace();
            System.exit(1);
        } finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (Exception e) {
                System.exit(1);
            }
        }
    }

    public static void deleteEmployee(int id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            preparedStatement = connection.prepareStatement("DELETE FROM emp WHERE id=?");
            preparedStatement.setInt(1, id);
            boolean b = preparedStatement.execute();
            if (b == true)
                System.out.println("1 record deleted...");
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
            System.exit(1);
        } catch (ClassNotFoundException clsNotFoundEx) {
            clsNotFoundEx.printStackTrace();
            System.exit(1);
        } finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (Exception e) {
                System.exit(1);
            }
        }
    }

    public static void readEmployees() {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM emp");
            ResultSetMetaData metaData = resultSet.getMetaData();
            int noCols = metaData.getColumnCount();
            for (int i = 1; i <= noCols; i++) {
                if (i != 3)
                    System.out.printf("%-10st", metaData.getColumnName(i).toUpperCase());
            }
            System.out.println();
            while (resultSet.next()) {
                for (int i = 1; i <= noCols; i++) {
                    if (i != 3)
                        System.out.printf("%-10st", resultSet.getObject(i));
                }
                System.out.println();
            }
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
            System.exit(1);
        } catch (ClassNotFoundException clsNotFoundEx) {
            clsNotFoundEx.printStackTrace();
            System.exit(1);
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (Exception e) {
                System.exit(1);
            }
        }
    }

    public static void readEmployee(int id) {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM emp WHERE id=" + id);
            ResultSetMetaData metaData = resultSet.getMetaData();
            int noCols = metaData.getColumnCount();
            for (int i = 1; i <= noCols; i++) {
                if (i != 3)
                    System.out.printf("%-10st", metaData.getColumnName(i).toUpperCase());
            }
            System.out.println();
            while (resultSet.next()) {
                for (int i = 1; i <= noCols; i++) {
                    if (i != 3)
                        System.out.printf("%-10st", resultSet.getObject(i));
                }
                System.out.println();
            }
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
            System.exit(1);
        } catch (ClassNotFoundException clsNotFoundEx) {
            clsNotFoundEx.printStackTrace();
            System.exit(1);
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (Exception e) {
                System.exit(1);
            }
        }
    }

    public static void main(String[] args) {
        createEmployee(1234, "Veer", 123, 1200, "New Delhi");
        createEmployee(5678, "Jay", 123, 1100, "New Delhi ");
        createEmployee(7890, "Kapil", 345, 1600, "Ghaziabad");
        createEmployee(2341, "Mayur", 123, 1800, "New Delhi ");
        createEmployee(6784, "RIDDHI", 345, 2200, "Ghaziabad");
        createEmployee(9636, "Naman", 123, 3200, "New Delhi ");
        updateSalary(1234, 1000);
        createEmployee(1111, "Laxmi", 123, 4400, " New Delhi ");
        deleteEmployee(1111);
        readEmployees();
        readEmployee(6784);
    }
}
