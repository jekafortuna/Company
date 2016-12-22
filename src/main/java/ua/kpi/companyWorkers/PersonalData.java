package ua.kpi.companyWorkers;

import java.util.Date;

/**
 * Created by Evgeniy on 22.12.2016.
 * Full information about employee
 */
public class PersonalData {

    /**
     * Full name of employee
     */
    private String fullName;

    /**
     * Date of birth
     */
    private Date birthDate;

    /**
     * Date of hiring to company
     */
    private Date hiringDate;

    public PersonalData(String fullName, Date birthDate, Date hiringDate) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.hiringDate = hiringDate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(Date hiringDate) {
        this.hiringDate = hiringDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonalData that = (PersonalData) o;

        if (birthDate != null ? !birthDate.equals(that.birthDate) : that.birthDate != null) return false;
        if (fullName != null ? !fullName.equals(that.fullName) : that.fullName != null) return false;
        if (hiringDate != null ? !hiringDate.equals(that.hiringDate) : that.hiringDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fullName != null ? fullName.hashCode() : 0;
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (hiringDate != null ? hiringDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PersonalData{" +
                "fullName='" + fullName + '\'' +
                ", birthDate=" + birthDate +
                ", hiringDate=" + hiringDate +
                '}';
    }
}
