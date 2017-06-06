package service;
import modle.Actions;

/**
 * Created by hacker on 17-6-6.
 */
public interface ActionService {
        public int insertAction(Actions action);
        public int deleteAction(Actions action);
        public int updateAction(Actions action);

}
