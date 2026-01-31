# Selenium Framework (Lab)

Automatsko testiranje web aplikacije https://the-internet.herokuapp.com koristeći:
- Java 17 + Maven
- Selenium WebDriver
- JUnit 5
- Page Object Model (POM)
- WebDriverWait (explicit waits)
- WebDriverManager
- Cross-browser (Chrome/Firefox)
- GitHub Actions CI

## Pokretanje lokalno
Pokreni sve testove (Chrome):
```bash
mvn test -Dbrowser=chrome
