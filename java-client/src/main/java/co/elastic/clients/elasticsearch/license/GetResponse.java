/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.license;

import co.elastic.clients.elasticsearch.license.get.LicenseInformation;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: license.get.Response
public final class GetResponse implements ToJsonp {
	private final LicenseInformation license;

	// ---------------------------------------------------------------------------------------------

	protected GetResponse(Builder builder) {

		this.license = Objects.requireNonNull(builder.license, "license");

	}

	/**
	 * API name: {@code license}
	 */
	public LicenseInformation license() {
		return this.license;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("license");
		this.license.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetResponse> {
		private LicenseInformation license;

		/**
		 * API name: {@code license}
		 */
		public Builder license(LicenseInformation value) {
			this.license = value;
			return this;
		}

		/**
		 * API name: {@code license}
		 */
		public Builder license(Function<LicenseInformation.Builder, ObjectBuilder<LicenseInformation>> fn) {
			return this.license(fn.apply(new LicenseInformation.Builder()).build());
		}

		/**
		 * Builds a {@link GetResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetResponse build() {

			return new GetResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for GetResponse
	 */
	public static final JsonpValueParser<GetResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, GetResponse::setupGetResponseParser);

	protected static void setupGetResponseParser(DelegatingJsonpValueParser<GetResponse.Builder> op) {

		op.add(Builder::license, LicenseInformation.JSONP_PARSER, "license");

	}

}