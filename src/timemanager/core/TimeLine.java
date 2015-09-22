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

import java.util.Set;

/**
 * Defines the place where the TimeInvest is set. 
 * @author Arón Vargas Hernández <aronvargas83@gmail.com>
 */
public class TimeLine {
    private Set<Goal> goals;

    public Set<Goal> getGoals() {
        return goals;
    }

    public void addGoal(Goal goal) {
        this.goals.add(goal);
    }
    
    public void removeGoal(Goal goal){
        this.goals.remove(goal);
    }

    private Set<TimeInvest> timeline;

    public Set<TimeInvest> getTimeline() {
        return timeline;
    }
    
    public void addTime(TimeInvest time){
        if(isTimeAvailable(time)){
            this.timeline.add(time);
        }
    }
    
    public void removeTime(TimeInvest time){
        this.timeline.remove(time);
    }
    
    public boolean isTimeAvailable(TimeInvest time){
        for (TimeInvest currTime : timeline) { //look for the time available on the set
            if(time.getStart().after(currTime.getStart()) && time.getStart().before(currTime.getEnd())
                    || time.getEnd().before(currTime.getEnd()) && time.getEnd().after(currTime.getStart())){
                return false;
            }
        }
        return true;
    }
    
}
