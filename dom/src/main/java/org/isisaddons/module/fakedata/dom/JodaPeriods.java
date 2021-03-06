/*
 *  Copyright 2015 Dan Haywood
 *
 *  Licensed under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.isisaddons.module.fakedata.dom;

import org.joda.time.Period;
import org.apache.isis.applib.annotation.Programmatic;

public class JodaPeriods extends AbstractRandomValueGenerator{

    public JodaPeriods(final FakeDataService fakeDataService) {
        super(fakeDataService);
    }

    @Programmatic
    public Period daysBetween(final int minDays, final int maxDays) {
        return Period.days(fake.ints().between(minDays, maxDays));
    }

    @Programmatic
    public Period daysUpTo(final int maxDays) {
        return daysBetween(0, maxDays);
    }

    @Programmatic
    public Period monthsBetween(final int minMonths, final int maxMonths) {
        return Period.months(fake.ints().between(minMonths, maxMonths));
    }

    @Programmatic
    public Period monthsUpTo(final int months) {
        return monthsBetween(0, months);
    }

    @Programmatic
    public Period yearsBetween(final int minYears, final int maxYears) {
        return Period.years(fake.ints().between(minYears, maxYears));
    }

    @Programmatic
    public Period yearsUpTo(final int years) {
        return yearsBetween(0, years);
    }

}
