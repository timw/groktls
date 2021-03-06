/**
 * Copyright 2013 Tim Whittington
 *
 * Licensed under the The Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.archie.groktls.impl.protocol;

import org.archie.groktls.protocol.ProtocolVariant;

public class ProtocolVariantImpl implements ProtocolVariant {

    private final String family;
    private final int major;
    private final int minor;
    private final String name;
    private final String pseudoProtocol;

    public ProtocolVariantImpl(final String name, final String family, final int major, final int minor, final String pseudoProtocol) {
        this.name = name;
        this.family = family;
        this.major = major;
        this.minor = minor;
        this.pseudoProtocol = pseudoProtocol;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getFamily() {
        return this.family;
    }

    @Override
    public int getMajorVersion() {
        return this.major;
    }

    @Override
    public int getMinorVersion() {
        return this.minor;
    }

    @Override
    public String getPseudoProtocol() {
        return this.pseudoProtocol;
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public int compareTo(final ProtocolVariant o) {
        final int majorDiff = this.major - o.getMajorVersion();
        if (majorDiff != 0) {
            return majorDiff;
        }
        final int minorDiff = this.minor - o.getMinorVersion();
        return minorDiff;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + ((this.name == null) ? 0 : this.name.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProtocolVariantImpl other = (ProtocolVariantImpl) obj;
        if (this.name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!this.name.equals(other.name)) {
            return false;
        }
        return true;
    }

}
