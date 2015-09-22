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
    TRIMESTERS, SEMESTERS, YEARS, LUSTRUMS, DECADES, CENTURYS, MILLENNIUMS;
    
    public static float SECONDS_IN_A_MINUTE = 60;
    public static float MINUTES_IN_AN_HOUR = 60;
    public static float HOURS_IN_A_DAY = 24;
    public static float DAYS_IN_A_WEEK = 7;
    public static float WEEKS_IN_A_FORTNIGHT = 2;
    public static float FORTNIGHTS_IN_A_MONTH = (1/2)*(1/7)*365*(1/12);
    public static float MONTHS_IN_A_BIMESTER = 2;
    public static float BIMESTERS_IN_A_TRIMESTER= 3/2;
    public static float TRIMESTERS_IN_A_SEMESTER = 2;
    public static float SEMESTERS_IN_A_YEAR = 2;
    public static float YEARS_IN_A_LUSTRUM = 5;
    public static float LUSTRUMS_IN_A_DECADE = 2;
    public static float DECADES_IN_A_CENTURY = 10;
    public static float CENTURIES_IN_A_MILLENIUM = 10;
    
    public static float ConvertUnits( float units, TimeInvestMeasureUnits originalValue, TimeInvestMeasureUnits finalValue){
        float finalUnits = 0;
        int scaleSeparation;
        //are we going up or down?
        scaleSeparation = finalValue.compareTo(originalValue);
        
        if(scaleSeparation > 0){//going up, so we are dividing
            switch(originalValue){
                case SECONDS:
                    units = units / SECONDS_IN_A_MINUTE;
                    finalUnits=ConvertUnits(units, MINUTES, finalValue);
                    break;
                case MINUTES:
                    units = units / MINUTES_IN_AN_HOUR;
                    finalUnits=ConvertUnits(units, HOURS, finalValue);
                    break;
                case HOURS:
                    units = units / HOURS_IN_A_DAY;
                    finalUnits=ConvertUnits(units, DAYS, finalValue);
                    break;
                case DAYS:
                    units = units / DAYS_IN_A_WEEK;
                    finalUnits=ConvertUnits(units, WEEKS, finalValue);
                    break;
                case WEEKS:
                    units = units / WEEKS_IN_A_FORTNIGHT;
                    finalUnits=ConvertUnits(units, FORTNIGHTS, finalValue);
                    break;
                case FORTNIGHTS:
                    units = units / FORTNIGHTS_IN_A_MONTH;
                    finalUnits=ConvertUnits(units, MONTHS, finalValue);
                    break;
                case MONTHS:
                    units = units / MONTHS_IN_A_BIMESTER;
                    finalUnits=ConvertUnits(units, BIMESTERS, finalValue);
                    break;
                case BIMESTERS:
                    units = units / BIMESTERS_IN_A_TRIMESTER;
                    finalUnits=ConvertUnits(units, TRIMESTERS, finalValue);
                     break;
                case TRIMESTERS:
                    units = units / TRIMESTERS_IN_A_SEMESTER;
                    finalUnits=ConvertUnits(units, SEMESTERS, finalValue);
                    break;
                case SEMESTERS:
                    units = units / SEMESTERS_IN_A_YEAR;
                    finalUnits=ConvertUnits(units, YEARS, finalValue);
                    break;
                case YEARS:
                    units = units / YEARS_IN_A_LUSTRUM;
                    finalUnits=ConvertUnits(units, LUSTRUMS, finalValue);
                    break;
                case LUSTRUMS:
                    units = units / LUSTRUMS_IN_A_DECADE;
                    finalUnits = ConvertUnits(units, DECADES, finalValue);
                    break;
                case DECADES:
                    units = units / DECADES_IN_A_CENTURY;
                    finalUnits=ConvertUnits(units, CENTURYS, finalValue);
                    break;
                case CENTURYS:
                    units = units / CENTURIES_IN_A_MILLENIUM;
                    finalUnits=ConvertUnits(units, MILLENNIUMS, finalValue);
                    break;
                case MILLENNIUMS://never is going to happen
                    break;
            }
        }else if(scaleSeparation == 0)//this is the type of units we want
        {
            finalUnits = units;
        }else{//we are going down, so we are multiplying
            switch(originalValue){
                case SECONDS://never is going to happen
                    break;
                case MINUTES:
                    units = units * SECONDS_IN_A_MINUTE;
                    finalUnits=ConvertUnits(units, SECONDS, finalValue);
                    break;
                case HOURS:
                    units = units * MINUTES_IN_AN_HOUR;
                    finalUnits=ConvertUnits(units, MINUTES, finalValue);
                    break;
                case DAYS:
                    units = units * HOURS_IN_A_DAY;
                    finalUnits=ConvertUnits(units, HOURS, finalValue);
                    break;
                case WEEKS:
                    units = units * DAYS_IN_A_WEEK;
                    finalUnits=ConvertUnits(units, DAYS, finalValue);
                    break;
                case FORTNIGHTS:
                    units = units * WEEKS_IN_A_FORTNIGHT;
                    finalUnits=ConvertUnits(units, WEEKS, finalValue);
                    break;
                case MONTHS:
                    units = units * FORTNIGHTS_IN_A_MONTH;
                    finalUnits=ConvertUnits(units, FORTNIGHTS, finalValue);
                    break;
                case BIMESTERS:
                    units = units * MONTHS_IN_A_BIMESTER;
                    finalUnits=ConvertUnits(units, MONTHS, finalValue);
                    break;
                case TRIMESTERS:
                    units = units * BIMESTERS_IN_A_TRIMESTER;
                    finalUnits=ConvertUnits(units, BIMESTERS, finalValue);
                    break;
                case SEMESTERS:
                    units = units * TRIMESTERS_IN_A_SEMESTER;
                    finalUnits=ConvertUnits(units, TRIMESTERS, finalValue);
                    break;
                case YEARS:
                    units = units * SEMESTERS_IN_A_YEAR;
                    finalUnits=ConvertUnits(units, SEMESTERS, finalValue);
                    break;
                case LUSTRUMS:
                    units = units * YEARS_IN_A_LUSTRUM;
                    finalUnits=ConvertUnits(units, YEARS, finalValue);
                    break;
                case DECADES:
                    units = units * LUSTRUMS_IN_A_DECADE;
                    finalUnits = ConvertUnits(units, LUSTRUMS, finalValue);
                    break;
                case CENTURYS:
                    units = units * DECADES_IN_A_CENTURY;
                    finalUnits=ConvertUnits(units, DECADES, finalValue);
                    break;
                case MILLENNIUMS:
                    units = units * CENTURIES_IN_A_MILLENIUM;
                    finalUnits=ConvertUnits(units, CENTURYS, finalValue);
                    break;
            }
        }
        return finalUnits;
    }
}
