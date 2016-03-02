/*
 *  Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.wso2.carbon.caching.internal;

/**
 * Converts values of a specified type to and from an internal representation.
 * <p>
 * {@link InternalConverter}s are typically used convert cache keys and values
 * to and from an appropriate internal representation, that of which is managed
 * by a cache.
 * </p>
 * The internal representation is declared as an Object as the type is typically
 * unknown until runtime.
 *
 * @param <T> the type of value to convert from and to
 * @see ReferenceInternalConverter
 * @see SerializingInternalConverter
 */
public interface InternalConverter<T> {
    /**
     * Converts the value to an internal representation.
     *
     * @param value the value to convert
     * @return an internal representation of the value
     */
    Object toInternal(T value);

    /**
     * Converts an internal representation of a value to a value.
     *
     * @param internal the internal representation of the value
     * @return the value
     */
    T fromInternal(Object internal);
}
