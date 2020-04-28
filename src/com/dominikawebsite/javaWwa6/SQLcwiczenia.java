package com.dominikawebsite.javaWwa6;

public class SQLcwiczenia {

    /*
0. Wydrukuj nazwy oraz przewidywaną długość życia wszystkich krajów, w których przewidywana długość życia jest większa lub równa 70 lat
1. Wydrukuj nazwy oraz przewidywaną długość życia wszystkich krajów, w których przewidywana długość życia jest większa lub równa 70 lat przy czym wypisz tylko 5 krajów o najdłuższej długości życia i posortuj je malejąco od najdłuższej do najkrótszej
2. Znajdź nazwy wszystkich krajów, w których mówi się po angielsku
2A. Znajdź nazwy wszystkich krajów, w których mówi się po angielsku lub hiszpańsku
2B. Znajdź nazwy wszystkich krajów, w których mówi się na raz po angielsku oraz francusku.
3.Znajdź nazwy wszystkich krajów, w których mówi się po angielsku i posortuj je alfabetycznie rosnąco po nazwie
4. Znajdź średnią przewidywaną długość życia na świecie
5. Znajdź średnią przewidywaną długość życia na świecie per kontynent
6. Znajdź kontynenty w których średnia przewidywana długość życia jest wyższa niż 65 lat
7. Znajdź kontynenty na których nie mówi się po hiszpańsku
8. Znajdź średni produkt krajowy brutto (GNP) dla
a) republik
b) monarchii
c) pozostałych ustrojówprzy czym chodzi o wszystkie odmiany, np. Constitutional Monarchy oraz  Parlementary Monarchy to jest monarchia
9. Znajdź średni produkt krajowy brutto (GNP) dla
a) republik
b) monarchii
c) pozostałych ustrojów
*dla każdego z kontynentów osobno*przy czym chodzi o wszystkie odmiany, np. Constitutional Monarchy oraz Parlementary Monarchy to jest monarchia
10. Znajdź kraje, które mają tylko jeden język oficjalny
11. Znajdź miasta powyżej 1 mln osób z krajów, które mają język angielski jako oficjalny i wypisz te miasta wraz z nazwą kraju sortując je po nazwie kraju alfabetycznie, a następnie po nazwie miasta alfabetycznie

Odpowiedzi:
zadanie 0: select name,lifeexpectancy from country where lifeexpectancy >=70;
zad 1  select name, lifeexpectancy from country where lifeexpectancy >= 70 order by lifeexpectancy desc limit 5;
zad 2 : select name from country left join countrylanguage on countrylanguage.countrycode=country.code where countrylanguage.language = 'English';
zad 2a: select name from country left join countrylanguage on countrylanguage.countrycode=country.code where countrylanguage.language = 'English' or countrylanguage.language = 'Spanish';
zad 2b select a.name from (select country.name  from country right join countrylanguage on country.code = countrylanguage.countrycode where countrylanguage.language = 'English') a inner join ( select country.name  from country right join countrylanguage on country.code = countrylanguage.countrycode where countrylanguage.language = 'French') b on a.name = b.name;
zad 3 select name from country left join countrylanguage on countrylanguage.countrycode=country.code where countrylanguage.language = 'English' order by name asc;
zad 4 select avg(lifeexpectancy) from country;
zad 5 select continent,avg(lifeexpectancy) from country group by continent;
zad 3: select country.name  from country right join countrylanguage on country.code = countrylanguage.countrycode where countrylanguage.language = 'English' order by name;
zad 2b bez subselect  select country.name from country right join countrylanguage on country.code = countrylanguage.countrycode where countrylanguage.language = 'English' or countrylanguage.language = 'French' group by name having count(name)>1;
zad 6: select continent,avg(lifeexpectancy) from country group by continent having avg(lifeexpectancy)>=65;
zad 7 bez subselecta `select distinct continent, Count(language) from country left join countrylanguage on country.code = countrylanguage.countrycode
where language in('Spanish') or language is null group by continent having count(language)=0;`
zad 10. select name from country left join countrylanguage on countrylanguage.countrycode = country.code where countrylanguage.isofficial='t' group by name having count(name)=1;\
Poprawione zad 8a select avg(gnp) from country where governmentform LIKE '%Republic%';
Zad 8c: select avg(gnp) from country where governmentform NOT LIKE '%Monarchy%' AND governmentform NOT LIKE '%Republic%';
9a select continent, avg(gnp) from country where governmentform LIKE '%Monarchy%' group by continent;
zad 11: select city.name,country.name from city left join countrylanguage on countrylanguage.countrycode = city.countrycode left join country on country.code = city.countrycode where countrylanguage.language = 'English' AND countrylanguage.isOfficial = 't' AND city.population > 1000000 order by country.name,city.name;
Trener:
SELECT continent, ARRAY_AGG(language) FROM country LEFT JOIN countrylanguage ON country.code = countrylanguage.countrycode GROUP BY continent;
SELECT continent FROM country LEFT JOIN countrylanguage ON country.code = countrylanguage.countrycode GROUP BY continent HAVING ARRAY_POSITION(ARRAY_AGG(language), 'Spanish') IS NULL;
*/
/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
​
    public class Main {
        public static void main(String[] args) {
            try {
​
                Class.forName("org.postgresql.Driver");
​
            } catch (ClassNotFoundException e) {
​
                System.out.println("Where is your PostgreSQL JDBC Driver? "
                        + "Include in your library path!");
                e.printStackTrace();
                return;
​
            }
​
            System.out.println("PostgreSQL JDBC Driver Registered!");
​
            Connection connection = null;
​
            try {
​
                connection = DriverManager.getConnection(
                        "jdbc:postgresql://127.0.0.1:5432/zenek", "zenek",
                        "123");
​
            } catch (SQLException e) {
​
                System.out.println("Connection Failed! Check output console");
                e.printStackTrace();
                return;
​
            }
​
            if (connection != null) {
                System.out.println("You made it, take control your database now!");
            } else {
                System.out.println("Failed to make connection!");
            }
​
        }
    }
*/

/*
 import java.sql.*;

    public class Main {
        public static void main(String[] args) {
            try {
                Class.forName("org.postgresql.Driver");
​
            } catch (ClassNotFoundException e) {
                System.out.println("Where is your PostgreSQL JDBC Driver? "
                        + "Include in your library path!");
                e.printStackTrace();
                return;
            }
​
            System.out.println("PostgreSQL JDBC Driver Registered!");
​
            Connection connection = null;
​
            try {
                connection = DriverManager.getConnection(
                        "jdbc:postgresql://127.0.0.1:5432/zenek", "zenek",
                        "123");
​
            } catch (SQLException e) {
​
                System.out.println("Connection Failed! Check output console");
                e.printStackTrace();
                return;
​
            }
​
            if (connection != null) {
                System.out.println("You made it, take control your database now!");
            } else {
                System.out.println("Failed to make connection!");
            }
​
        }
​
        ​
        private void doSomething(Connection con) throws SQLException {
​
            Statement stmt = null;
            String query =
                    "select COF_NAME, SUP_ID, PRICE, " +
                            "SALES, TOTAL " +
                            "from coffees";
            try {
                stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    String coffeeName = rs.getString("COF_NAME");
                    int supplierID = rs.getInt("SUP_ID");
                    float price = rs.getFloat("PRICE");
                    int sales = rs.getInt("SALES");
                    int total = rs.getInt("TOTAL");
                    System.out.println(coffeeName + "\t" + supplierID +
                            "\t" + price + "\t" + sales +
                            "\t" + total);
                }
            } catch (SQLException e ) {
                System.out.println("Coś nie działa");

            } finally {
                if (stmt != null) { stmt.close(); }
            }
        }
    }

     */

/*
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
​
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your PostgreSQL JDBC Driver? "
                    + "Include in your library path!");
            e.printStackTrace();
            return;
        }
​
        System.out.println("PostgreSQL JDBC Driver Registered!");
​
        Connection connection = null;
​
        try {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1:5432/library", "zenek",
                    "123");
​
        } catch (SQLException e) {
​
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;
​
        }
​
        if (connection != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }
​
        Scanner scanner = new Scanner(System.in);
        System.out.println("Czy chcesz się zalogować czy zarejestrować?");
        System.out.println(" - 1 - zalogować");
        System.out.println(" - 2 - zarejestrować");
​
        int answer = scanner.nextInt();
        scanner.nextLine();
​
        switch (answer) {
            case 1:
                System.out.println("Podaj login:");
                String login = scanner.nextLine();
​
                System.out.println("Podaj hasło:");
                String password = scanner.nextLine();
​
                String query =
                        "SELECT * FROM users WHERE login = '" + login + "'" +
                                " AND password = '" + password + "'";
​
                System.out.println(query);
                Statement statement = null;
                try {
                    statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(query);
                    if(resultSet.next()) {
                        System.out.println("Jest taki użytkownik, ID = " + resultSet.getInt("id"));
                    } else {
                        System.out.println("Nie ma takiego użytkownika");
                    }
                    statement.close();
​
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
​
            case 2:
                // TODO
                break;
​
            default:
                System.out.println("Wybrano złą odpowiedź");
                break;
        }
​
    }
​
}

 */
/*
PreparedStatement statement = null;
                try {
                    statement = connection.prepareStatement("SELECT * FROM users WHERE login = ? AND password = ?");
                    statement.setString(1, login);
                    statement.setString(2, password);
​
                    ResultSet resultSet = statement.executeQuery();
                    if(resultSet.next()) {
                        System.out.println("Jest taki użytkownik, ID = " + resultSet.getInt("id"));
                    } else {
                        System.out.println("Nie ma takiego użytkownika");
                    }
                    statement.close();
 */
/*
package pl.sdacademy;
​
public class Main {
​
    public static void main(String[] args) {
	    Category root = new Category("Wszystko");
	    Category poetry = new Category("Poezja");
	    Category haiku = new Category("Haiku");
	    Category literature = new Category("Beletrystyka");
​
	    root.addSubcategory(poetry);
	    poetry.addSubcategory(haiku);
	    root.addSubcategory(literature);
​
	    printTree(root);
    }
​
    private static void printTree(Category category) {
		System.out.println(category.getName());
		for(Category subcategory : category.getSubcategories()) {
			printTree(subcategory);
		}
 	}
​
}
 */

/*
package pl.sdacademy;
​
import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private List<Category> subcategories = new ArrayList<>();
​
    public Category(String name) {
        this.name = name;
    }
​
    public void addSubcategory(Category category) {
        this.subcategories.add(category);
    }
​
    public String getName() {
        return name;
    }
​
    public List<Category> getSubcategories() {
        return subcategories;
    }
}
 */

}
