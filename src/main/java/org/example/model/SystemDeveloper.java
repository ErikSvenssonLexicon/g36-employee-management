package org.example.model;

import java.time.LocalDate;
import java.util.Arrays;

import static org.example.util.StringArrayUtils.addToStringArray;
import static org.example.util.StringArrayUtils.isNotPresent;

public class SystemDeveloper extends Employee{

    private String[] certificates;
    private String[] languages;

    public SystemDeveloper(String[] certificates, String[] languages,int id, String name, LocalDate dateHired){
        super(id, name, dateHired);
        this.certificates = certificates;
        this.languages = languages;
    }

    public SystemDeveloper(int id, String name, LocalDate dateHired){
        this(new String[0], new String[0], id, name, dateHired);
    }

    @Override
    public double getSalary() {
        return  (1000 * certificates.length) + (1500 * languages.length) + super.salary;
    }

    public String[] getCertificates() {
        return certificates;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void addCertificate(String certificate){
        if(certificate != null && isNotPresent(certificates, certificate)){
            certificates = addToStringArray(certificates, certificate);
        }
    }

    public void addLanguage(String language){
        if(language != null && isNotPresent(languages, language)){
            languages = addToStringArray(languages, language);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SystemDeveloper that = (SystemDeveloper) o;
        return Arrays.equals(getCertificates(), that.getCertificates()) && Arrays.equals(getLanguages(), that.getLanguages());
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(getCertificates());
        result = 31 * result + Arrays.hashCode(getLanguages());
        return result;
    }

    @Override
    public String toString() {
        return "SystemDeveloper{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", dateHired=" + getDateHired() +
                ", certificates=" + Arrays.toString(certificates) +
                ", languages=" + Arrays.toString(languages) +
                ", salary=" + getSalary() +
                '}';
    }
}
