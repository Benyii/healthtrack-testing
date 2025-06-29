package com.healthtrack;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ActualizacionPesoUITest {

 @Test
    void testAbrirPaginaWeb() {
        System.out.println("Test de Selenium");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);

        try 
        {
            driver.get("https://www.google.com");
            System.out.println("Página cargada");
            String title = driver.getTitle();
            System.out.println("Título: " + title);
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destino = new File("selenium/screenshot_google.png");
            Files.copy(screenshot.toPath(), destino.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Captura guardada en: " + destino.getAbsolutePath());
            assertTrue(title.contains("Google"), "No se encontró 'Google' en el título de la página.");
        } 
        catch (Exception e) 
        {
            System.out.println("Error durante el test: " + e.getMessage());
            throw new RuntimeException(e);
        } 
        finally 
        {
            driver.quit();
            System.out.println("Navegador cerrado");
        }
    }
}
