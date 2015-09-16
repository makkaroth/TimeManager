/*
 * Copyright (C) 2015 Arón Vargas Hernández <aronvargas83@gmail.com>
 * UNED <avargas98@alumno.uned.es>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package timemanager.core;

import java.util.Date;
import java.util.Set;

/**
 *
 * @author Arón Vargas Hernández <aronvargas83@gmail.com>
 */
public class TimeInvest {
    
    private TimePerformance myPerformance;

    public TimePerformance getMyPerformance() {
        return myPerformance;
    }

    public void setMyPerformance(TimePerformance myPerformance) {
        this.myPerformance = myPerformance;
    }
    
    private Date start;

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }
    
    private Date end;

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
    
    private double realTime;

    public double getRealTime() {
        return realTime;
    }

    public void setRealTime(double realTime) {
        this.realTime = realTime;
    }
    
    private 
    private Set<Task> assignedTasks;

    public Set<Task> getAssignedTasks() {
        return assignedTasks;
    }

    public void setAssignedTask(Task assignedTask) {
        this.assignedTasks.add(assignedTask);
    }
    
    public void removeAssignedTask(Task assignedTask){
        this.assignedTasks.remove(assignedTask);
    }

    public TimeInvest(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public TimeInvest() {
    }

    public TimeInvest(double realTime) {
        this.realTime = realTime;
    }
    
    
    
}
