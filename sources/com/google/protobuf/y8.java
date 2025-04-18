package com.google.protobuf;

import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public final class y8 implements PrivilegedExceptionAction {
    @Override // java.security.PrivilegedExceptionAction
    public Unsafe run() throws Exception {
        for (java.lang.reflect.Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        return null;
    }
}
