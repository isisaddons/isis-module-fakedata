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

import org.apache.isis.applib.annotation.Programmatic;

public class Shorts extends AbstractRandomValueGenerator{

    public Shorts(final FakeDataService fakeDataService) {
        super(fakeDataService);
    }

    @Programmatic
    public short upTo(final short upTo) {
        return (short) fake.ints().upTo(upTo);
    }

    @Programmatic
    public short between(final short min, final short max) {
        return (short) fake.ints().between(min, max);
    }

    @Programmatic
    public short any() {
        return (short) fake.ints().any();
    }
}
