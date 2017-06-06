package modle;

/**
 * Created by hacker on 17-6-6.
 */
public class Actions {
    private int action_id;
    private String action_time;
    private String action_where;
    private int Bpeople_id;
    private int Apeople_id;
    private int action_type_id;

    public int getAction_id() {
        return action_id;
    }

    public void setAction_id(int action_id) {
        this.action_id = action_id;
    }

    public String getAction_time() {
        return action_time;
    }

    public void setAction_time(String action_time) {
        this.action_time = action_time;
    }

    public String getAction_where() {
        return action_where;
    }

    public void setAction_where(String action_where) {
        this.action_where = action_where;
    }

    public int getBpeople_id() {
        return Bpeople_id;
    }

    public void setBpeople_id(int bpeople_id) {
        Bpeople_id = bpeople_id;
    }

    public int getApeople_id() {
        return Apeople_id;
    }

    public void setApeople_id(int apeople_id) {
        Apeople_id = apeople_id;
    }

    public int getAction_type_id() {
        return action_type_id;
    }

    public void setAction_type_id(int action_type_id) {
        this.action_type_id = action_type_id;
    }
}
