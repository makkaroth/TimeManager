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
package timemanager.enums;

/**
 *
 * @author Arón Vargas Hernández <aronvargas83@gmail.com>
 */
public enum TimeInvestMeasureUnits {
    
    SECONDS, MINUTES, HOURS, DAYS, WEEKS,
    FORTNIGHTS, MONTHS, BIMESTERS,
    TRIMESTERS, SEMESTERS, YEARS, LUSTRUMS, DECADES, CENTURYS, MILLENNIALS;
    
    
    public static float ConvertUnits( float units, TimeInvestMeasureUnits originalValue, TimeInvestMeasureUnits finalValue){
        float finalUnits;
        int scaleSeparation;
        scaleSeparation = finalValue.compareTo(originalValue);
        
        if(scaleSeparation > 0){
            switch(originalValue){
                case SECONDS:
                    break;
                case MINUTES:
                    break;
                case HOURS:
                    break;
                case DAYS:
                    break;
                case WEEKS:
                    break;
                case FORTNIGHTS:
                    break;
                case MONTHS:
                    break;
                case BIMESTERS:
                    break;
                case TRIMESTERS:
                    break;
                case SECONDS:
                    break;
                case SECONDS:
                    break;
                case SECONDS:
                    break;
                case SECONDS:
                    break;
                case SECONDS:
                    break;
                case SECONDS:
                    break;
            }
        }
        
        
    }
}
