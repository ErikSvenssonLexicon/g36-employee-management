package org.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class SystemDeveloperTest {

    public static final int ID = 1;
    public static final String NAME = "Test";
    public static final LocalDate DATE_HIRED = LocalDate.parse("2020-03-12");
    private SystemDeveloper testObject;

    @BeforeEach
    public void setup(){
        testObject = new SystemDeveloper(ID, NAME, DATE_HIRED);
    }

    @Test
    void testObject_successfully_created() {
        assertEquals(ID, testObject.getId());
        assertEquals(NAME, testObject.getName());
        assertEquals(DATE_HIRED, testObject.getDateHired());
        assertEquals(25000.00, testObject.getSalary());
        assertArrayEquals(new String[0], testObject.getCertificates());
        assertArrayEquals(new String[0], testObject.getLanguages());
    }

    @Test
    void addCertificate_success() {
        double expectedSalary = 26000;
        String[] expectedCertificates = {"OCA"};
        String certificate = "OCA";

        testObject.addCertificate(certificate);

        assertEquals(expectedSalary, testObject.getSalary());
        assertArrayEquals(expectedCertificates, testObject.getCertificates());

    }

    @Test
    void addCertificate_duplicate_not_added() {
        double expectedSalary = 26000;
        String[] expectedCertificates = {"OCA"};
        String certificate = "OCA";

        testObject.addCertificate(certificate);
        testObject.addCertificate("oca");

        assertEquals(expectedSalary, testObject.getSalary());
        assertArrayEquals(expectedCertificates, testObject.getCertificates());
    }

    @Test
    void addLanguage_success() {
        double expectedSalary = 26500;
        String[] expectedLanguages = {"Java"};
        String language = "Java";

        testObject.addLanguage(language);

        assertEquals(expectedSalary, testObject.getSalary());
        assertArrayEquals(expectedLanguages, testObject.getLanguages());
    }

    @Test
    void addLanguage_duplicate_not_added() {
        double expectedSalary = 26500;
        String[] expectedLanguages = {"Java"};
        String language = "Java";

        testObject.addLanguage(language);
        testObject.addLanguage("jAva");

        assertEquals(expectedSalary, testObject.getSalary());
        assertArrayEquals(expectedLanguages, testObject.getLanguages());

    }

    @Test
    void equals_and_hashCode_fulfill_contract() {
        SystemDeveloper copy = new SystemDeveloper(ID, NAME, DATE_HIRED);

        assertEquals(copy, testObject);
        assertEquals(copy.hashCode(), testObject.hashCode());
    }
}
