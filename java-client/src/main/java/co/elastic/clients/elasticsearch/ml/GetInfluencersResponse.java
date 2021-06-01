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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_influencers.Response
public final class GetInfluencersResponse implements ToJsonp {
	private final Number count;

	private final List<BucketInfluencer> influencers;

	// ---------------------------------------------------------------------------------------------

	protected GetInfluencersResponse(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.influencers = Objects.requireNonNull(builder.influencers, "influencers");

	}

	/**
	 * API name: {@code count}
	 */
	public Number count() {
		return this.count;
	}

	/**
	 * Array of influencer objects
	 *
	 * API name: {@code influencers}
	 */
	public List<BucketInfluencer> influencers() {
		return this.influencers;
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

		generator.writeKey("count");
		generator.write(this.count.doubleValue());

		generator.writeKey("influencers");
		generator.writeStartArray();
		for (BucketInfluencer item0 : this.influencers) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetInfluencersResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetInfluencersResponse> {
		private Number count;

		private List<BucketInfluencer> influencers;

		/**
		 * API name: {@code count}
		 */
		public Builder count(Number value) {
			this.count = value;
			return this;
		}

		/**
		 * Array of influencer objects
		 *
		 * API name: {@code influencers}
		 */
		public Builder influencers(List<BucketInfluencer> value) {
			this.influencers = value;
			return this;
		}

		/**
		 * Array of influencer objects
		 *
		 * API name: {@code influencers}
		 */
		public Builder influencers(BucketInfluencer... value) {
			this.influencers = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #influencers(List)}, creating the list if needed.
		 */
		public Builder addInfluencers(BucketInfluencer value) {
			if (this.influencers == null) {
				this.influencers = new ArrayList<>();
			}
			this.influencers.add(value);
			return this;
		}

		/**
		 * Set {@link #influencers(List)} to a singleton list.
		 */
		public Builder influencers(Function<BucketInfluencer.Builder, ObjectBuilder<BucketInfluencer>> fn) {
			return this.influencers(fn.apply(new BucketInfluencer.Builder()).build());
		}

		/**
		 * Add a value to {@link #influencers(List)}, creating the list if needed.
		 */
		public Builder addInfluencers(Function<BucketInfluencer.Builder, ObjectBuilder<BucketInfluencer>> fn) {
			return this.addInfluencers(fn.apply(new BucketInfluencer.Builder()).build());
		}

		/**
		 * Builds a {@link GetInfluencersResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetInfluencersResponse build() {

			return new GetInfluencersResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for GetInfluencersResponse
	 */
	public static final JsonpValueParser<GetInfluencersResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, GetInfluencersResponse::setupGetInfluencersResponseParser);

	protected static void setupGetInfluencersResponseParser(
			DelegatingJsonpValueParser<GetInfluencersResponse.Builder> op) {

		op.add(Builder::count, JsonpValueParser.numberParser(), "count");
		op.add(Builder::influencers, JsonpValueParser.arrayParser(BucketInfluencer.JSONP_PARSER), "influencers");

	}

}