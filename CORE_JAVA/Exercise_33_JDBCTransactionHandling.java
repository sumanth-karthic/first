import java.sql.*;

public class Exercise_33_JDBCTransactionHandling {

    public static void main(String[] args) {

        try {

            Connection con =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/bank",
                            "root",
                            "root");

            con.setAutoCommit(false);

            PreparedStatement debit =
                    con.prepareStatement(
                            "UPDATE accounts SET balance=balance-1000 WHERE id=1");

            PreparedStatement credit =
                    con.prepareStatement(
                            "UPDATE accounts SET balance=balance+1000 WHERE id=2");

            debit.executeUpdate();
            credit.executeUpdate();

            con.commit();

            System.out.println(
                    "Transfer Successful");

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}