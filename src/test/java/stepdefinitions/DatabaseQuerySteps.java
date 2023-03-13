package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.w3c.dom.Text;
import utilities.ConfigReader;

import java.sql.*;

public class DatabaseQuerySteps {
    String url = ConfigReader.getProperty("db_url");
    String username = ConfigReader.getProperty("db_username");
    String password = ConfigReader.getProperty("db_password");

    Connection connection;
    Statement statement;
    ResultSet resultSet;
    @Given("user connects to the database")
    public void userConnectsToTheDatabase() throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    }

    @Given("user connects to the market table")
    public void userConnectsToTheMarketTable() throws SQLException {
        resultSet = statement.executeQuery("SELECT * FROM market2");
    }

    @Then("the total number of products is found and print")
    public void theTotalNumberOfProductsIsFoundAndPrint() throws SQLException {
        int rowCount = 0;
        while (resultSet.next()) {
            rowCount++;
        }
        System.out.println("Total row count: " + rowCount);
        Assert.assertEquals(rowCount, 5);
    }

    @Then("the higher price is found and print")
    public void theHigherPriceIsFoundAndPrint() throws SQLException {
        resultSet=statement.executeQuery("SELECT*FROM market2 order by fiyat desc");
        resultSet.first();
        String highername =resultSet.getString("urunler");
        Assert.assertEquals(highername,"hediyelik");
        System.out.println(highername);

    }

    @Then("product name change is verified and print")
    public void productNameChangeIsVerifiedAndPrint() throws SQLException {


            }

    @Then("print average price")
    public void printAveragePrice() throws SQLException {
        resultSet = statement.executeQuery("SELECT AVG(fiyat) FROM market2");
        if (resultSet.next()) {
            double AVG = resultSet.getDouble(1);
            System.out.println("AVG: " + AVG);
        }

    }

    @Then("print headers differently")
    public void printHeadersDifferently() {

    }

    @Then("Capitalize product names")
    public void capitalizeProductNames() throws SQLException {

        resultSet = statement.executeQuery("SELECT Upper(urunler) AS buyukurunler FROM market2");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("buyukurunler"));
        }
    }

    @Then("Lowercase product names")
    public void lowercaseProductNames() throws SQLException {
        resultSet = statement.executeQuery("SELECT Lower(urunler) AS buyukurunler FROM market2");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("buyukurunler"));
        }
    }

    @Then("The first letter of the product name must be lowercase")
    public void theFirstLetterOfTheProductNameMustBeLowercase() throws SQLException {
        resultSet = statement.executeQuery("SELECT INITCAP(urunler) AS ilkbuyuk FROM market2");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("ilkbuyuk"));
        }
    }

    @Then("products below a certain price are printed in descending order")
    public void productsBelowACertainPriceArePrintedInDescendingOrder() throws SQLException {
        resultSet = statement.executeQuery("SELECT urunler,fiyat FROM market2 where fiyat<15000 order by urunler,fiyat ASC");
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("fiyat") + "   :   " + resultSet.getString("urunler"));


        }
    }
}
