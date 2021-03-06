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
package org.archie.groktls;

import org.archie.groktls.cipher.CipherSuite;
import org.archie.groktls.impl.cipher.CipherSuiteParserImpl;
import org.archie.groktls.impl.cipher.filter.CipherSuiteFilterBuilderImpl;
import org.archie.groktls.impl.cipher.filter.CipherSuiteFilterSpecParserImpl;
import org.archie.groktls.impl.protocol.ProtocolVariantParserImpl;
import org.archie.groktls.impl.protocol.filter.ProtocolVariantFilterBuilderImpl;
import org.archie.groktls.impl.protocol.filter.ProtocolVariantFilterSpecParserImpl;
import org.archie.groktls.protocol.ProtocolVariant;

/**
 * Root entrypoint to GrokTLS functions.
 */
public class GrokTLS {

    /**
     * Constructs a parser that can be used to parse TLS cipher suite names and provide information about their meaning.
     */
    public ItemParser<CipherSuite> createCipherSuiteParser() {
        return new CipherSuiteParserImpl();
    }

    /**
     * Constructs a builder for {@link ItemFilter}s over {@link CipherSuite}s to apply criteria based filters on a set of cipher suites.
     */
    public ItemFilterBuilder<CipherSuite> createCipherSuiteFilterBuilder() {
        return new CipherSuiteFilterBuilderImpl();
    }

    /**
     * Constructs a parser that produces {@link ItemFilter}s over {@link CipherSuite}s from cipher suite filter specification strings.
     */
    public ItemFilterSpecParser<CipherSuite> createCipherSuiteFilterSpecParser() {
        return new CipherSuiteFilterSpecParserImpl();
    }

    /**
     * Constructs a parser that can be used to parse TLS or SSL protocol variant names and provide information about their meaning.
     */
    public ItemParser<ProtocolVariant> createProtocolVariantParser() {
        return new ProtocolVariantParserImpl();
    }

    /**
     * Constructs a builder for {@link ItemFilter}s over {@link ProtocolVariant}s to apply criteria based filters on a set of protocol
     * variants.
     */
    public ItemFilterBuilder<ProtocolVariant> createProtocolVariantFilterBuilder() {
        return new ProtocolVariantFilterBuilderImpl();
    }

    /**
     * Constructs a parser that produces {@link ItemFilter}s over {@link ProtocolVariant}s from protocol variant filter specification
     * strings.
     */
    public ItemFilterSpecParser<ProtocolVariant> createProtocolVariantFilterSpecParser() {
        return new ProtocolVariantFilterSpecParserImpl();
    }

}
