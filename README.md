# Selenium Framework (Lab)

Automatsko testiranje web aplikacije https://the-internet.herokuapp.com koristeći:
- Java 23 + Maven
- Selenium WebDriver
- JUnit 5
- Page Object Model (POM)
- WebDriverWait 
- WebDriverManager
- Cross-browser (Chrome/Firefox)
- GitHub Actions CI

## Pokretanje lokalno
Pokreni sve testove (Chrome):
```bash
mvn test -Dbrowser=chrome
