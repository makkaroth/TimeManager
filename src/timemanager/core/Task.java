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
 *
 * @author Arón Vargas Hernández <aronvargas83@gmail.com>
 */
public class Task {
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    private Set<Task> subTasks;

    public Set<Task> getSubTasks() {
        return subTasks;
    }
    
    public void addSubTask(Task task){
        this.subTasks.add(task);
    }
    
    public void removeSubTask(Task task){
        
    }
    private Set<Goal> Goals;

    public Set<Goal> getGoals() {
        return Goals;
    }
    
    public void addGoal(Goal goal){
        this.Goals.add(goal);
    }
    
    public void removeGoal(Goal goal){
        this.Goals.remove(goal);
    }
    
    private Set<TimeInvest> timeInvested;
   
    public Set<TimeInvest> getTimeInvested() {
        return timeInvested;
    }
    
    public void addTimeInvested(TimeInvest time){
        this.timeInvested.add(time);
    }
    
    public void removeTimeInvested(TimeInvest time){
        this.timeInvested.remove(time);
    }
    
    private TimeInvest projectedTime;

    public TimeInvest getProjectedTime() {
        return projectedTime;
    }

    public void setProjectedTime(TimeInvest projectedTime) {
        this.projectedTime = projectedTime;
    }
    
    private Set<Milestone> Milestones;

    public Set<Milestone> getMilestones() {
        return Milestones;
    }

    public void setMilestones(Set<Milestone> Milestones) {
        this.Milestones = Milestones;
    }

    public Task() {
    }
    
}
