/*
 * Copyright 2017-2020 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.configuration.openapi.docs.controllers;

// tag::imports[]
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;
import io.reactivex.Single;

// end::imports[]
// tag::clazz[]
@Validated
@Controller("/")
public class HelloController {

    /**
     * @param name The person's name
     * @return The greeting
     */
    @Get(uri = "/hello/{name}", produces = MediaType.TEXT_PLAIN)
    public Single<String> index(String name) {
        return Single.just("Hello " + name + "!");
    }
}
// end::clazz[]