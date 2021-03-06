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

/**************************************************************
 ********          THIS IS A GENERATED FILE         ***********
 **************************************************************/

package org.qeo.test;

import org.qeo.QeoType;
import org.qeo.QeoType.Behavior;

/**
 * This struct represents an event containing only primitive types.
 */
@QeoType(behavior = Behavior.EVENT)
public class EventWithPrimitives
{
    public boolean MyBoolean;

    public byte MyByte;

    /**
     * This is an int16
     */
    public short MyInt16;

    public int MyInt32;

    /**
     * This is an int64
     */
    public long MyInt64;

    public float MyFloat32;

    public String MyString;

    /**
     * Default constructor.  This is used by Qeo to construct new objects.
     */
    public EventWithPrimitives()
    {
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }
        final EventWithPrimitives myObj = (EventWithPrimitives) obj;
        if (MyBoolean != myObj.MyBoolean) {
            return false;
        }
        if (MyByte != myObj.MyByte) {
            return false;
        }
        if (MyInt16 != myObj.MyInt16) {
            return false;
        }
        if (MyInt32 != myObj.MyInt32) {
            return false;
        }
        if (MyInt64 != myObj.MyInt64) {
            return false;
        }
        if (MyFloat32 != myObj.MyFloat32) {
            return false;
        }
        if (!MyString.equals(myObj.MyString)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + (MyBoolean ? 1 : 0);
        result = prime * result + MyByte;
        result = prime * result + MyInt16;
        result = prime * result + MyInt32;
        result = prime * result + (int) (MyInt64 ^ (MyInt64 >>> 32));
        result = prime * result + Float.floatToIntBits(MyFloat32);
        result = prime * result + ((MyString == null) ? 0 : MyString.hashCode());
        return result;
    }
}
