/*
 * Copyright (c) 2016 - Qeo LLC
 *
 * The source code form of this Qeo Open Source Project component is subject
 * to the terms of the Clear BSD license.
 *
 * You can redistribute it and/or modify it under the terms of the Clear BSD
 * License (http://directory.fsf.org/wiki/License:ClearBSD). See LICENSE file
 * for more details.
 *
 * The Qeo Open Source Project also includes third party Open Source Software.
 * See LICENSE file for more details.
 */

package org.qeo.internal.common;

/**
 * Enum representing the type of reader/writer.
 * 
 * Remark: At the moment this needs to be lined up with the Qeo-C enum qeo_entity_t
 */
public enum EntityType {
    /** Unknwon reader/writer type. */
    UNKNOWN,
    /** Evented data reader/writer. */
    EVENT_DATA,
    /** Evented state data reader/writer. */
    STATE_DATA,
    /** Iterating state data reader/writer with update notification. */
    STATE_UPDATE,
}
