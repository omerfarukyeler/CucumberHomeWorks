package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ConfigReader;

import java.sql.*;

public class DataBaseQueryhw2steps {

    String url = ConfigReader.getProperty("db_url");
    String username = ConfigReader.getProperty("db_username");
    String password = ConfigReader.getProperty("db_password");

    Connection connection;
    Statement statement;
    ResultSet resultSet;
    @Given("user connects to the employess table")
    public void userConnectsToTheEmployessTable() throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        resultSet = statement.executeQuery("SELECT * FROM employess");
   }

    @Then("Bring the even number below the id row in the table")
    public void bringTheEvenNumberBelowTheIdRowInTheTable() throws SQLException {
        resultSet=statement.executeQuery("SELECT*FROM employess WHERE MOD(id,2)=0");

            while (resultSet.next()) {
            for (int i = 1; i <= 5; i++) {
                System.out.print(resultSet.getString(i) + " " );
            }
            System.out.println();
        }
    }

    @Then("find the total number of rows")
    public void findTheTotalNumberOfRows() throws SQLException {
        int rowCount = 0;
        while (resultSet.next()) {
            rowCount++;
        }
        System.out.println("Total row count: " + rowCount);
        Assert.assertEquals(rowCount, 7);
    }

    @Then("find the max salary in table")
    public void findTheMaxSalaryInTable() throws SQLException {
        resultSet=statement.executeQuery("SELECT*FROM employess order by salary desc");
        resultSet.first();
        String highersalary =resultSet.getString("salary");
        System.out.println(highersalary);
    }

    @Then("find the second high salary")
    public void findTheSecondHighSalary() throws SQLException {

        resultSet=statement.executeQuery("SELECT MAX(salary) AS second_maximum_salary  FROM employess WHERE salary < (SELECT MAX(salary) FROM employess)");
        while (resultSet.next()) {
            for (int i = 1; i <= 1; i++) {
                System.out.print(resultSet.getString(i)+" " );
            }
            System.out.println();
        }

    }

    @Then("find the maximum salary info")
    public void findTheMaximumSalaryInfo() throws SQLException {
    resultSet=statement.executeQuery("select * from employess where salary=(select max(salary) from employess)");

        while (resultSet.next()) {
            for (int i = 1; i <= 5; i++) {
                System.out.print(resultSet.getString(i) + " ");
            }
            System.out.println();
        }


    }

    @Then("find the second high salary info")
    public void findTheSecondHighSalaryInfo() throws SQLException {

        String code ="select * from employess  WHERE salary < (SELECT MAX(salary) FROM employees) ORDER BY salary DESC) WHERE ROWNUM<=1 ";

        while (resultSet.next()) {
            for (int i = 1; i <= 5; i++) {
                System.out.print(resultSet.getString(i) + " ");
            }
            System.out.println();
        }
    }
}
