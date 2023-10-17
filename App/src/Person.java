import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {
    private String name;
    private String civilState;
    private String rg;
    private String cpf;
    private LocalDate birthday;
    private String work; 

    public Person(String name, String civilState, String rg, String cpf, String birthday, String work) {
        this.name = name;
        this.civilState = civilState;
        this.rg = rg;
        this.cpf = cpf;
        setBirthday(birthday);
        this.work = work;
    }

    public int getAge(){
        LocalDate currenDate = LocalDate.now();
        Period period = Period.between(getBirthday(), currenDate);
        return period.getYears();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCivilState() {
        return civilState;
    }

    public void setCivilState(String civilState) {
        this.civilState = civilState;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.birthday = LocalDate.parse(birthday, formatter);
    }
    
    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.cpf = work;
    }
    
    
    @Override
    public String toString() {
        return "name: " + name + "\r\n" +
                "age: " + this.getAge() + "\r\n" +
                "civilState: " + civilState + "\r\n" +
                "rg: " + rg + "\r\n" +
                "work: " + work + "\r\n" +
                "cpf: " + cpf + "\r\n" +
                "was born: " + birthday;
    }
}
