package com.google.protobuf;

import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: com.google.protobuf.x5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2032x5 implements PrivilegedExceptionAction {
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
