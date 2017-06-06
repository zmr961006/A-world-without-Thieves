package modle;

/**
 * Created by hacker on 17-6-6.
 */
public class Bpeople {
    private int Bpeople_id;
    private String name;
    private int   age;
    private int   sex;

    public int getBpeople_id() {
        return Bpeople_id;
    }

    public void setBpeople_id(int bpeople_id) {
        Bpeople_id = bpeople_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getWork() {
        return Work;
    }

    public void setWork(String work) {
        Work = work;
    }

    private String Work;
}
