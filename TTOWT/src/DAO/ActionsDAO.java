package DAO;

import modle.*;
import IDAO.*;

import java.sql.SQLException;



/**
 * Created by hacker on 17-6-6.
 */
public class ActionsDAO {

    public  int  insertAction(Actions actions) throws SQLException {
        String sql = "helloworld";
        openSQL.insertsql(sql);
        return 0;
    }

    public  int  deleteAction(Actions actions){

        return 0;
    }

    public  int  updateAction(Actions actions){

        return 0;
    }



}
