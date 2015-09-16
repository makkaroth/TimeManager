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

import java.util.logging.Logger;

/**
 *
 * @author Arón Vargas Hernández <aronvargas83@gmail.com>
 */
public class TimePerformance {
    
    private static final Logger LOG = Logger.getLogger(TimePerformance.class.getName());
    
    private float motivation;
    
    public float getMotivation() {
        return motivation;
    }

    public void setMotivation(float motivation) {
        this.motivation = motivation;
    }
    
    private float effort;
        
    public float getEffort() {
        return effort;
    }

    public void setEffort(float effort) {
        this.effort = effort;
    }
    
    private float efficiency;
    
    public float getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(float efficiency) {
        this.efficiency = efficiency;
    }
    
    
    
}
