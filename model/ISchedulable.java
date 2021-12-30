package model;

import java.util.Date;

public interface ISchedulable {

    //LLevará sólo un método con los valores que deberá recibir, fecha y hora

    void schedule(Date date, String time);
    
}
