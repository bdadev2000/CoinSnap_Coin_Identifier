package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class n3 {
    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(L.i(obj2, "null key in entry: null="));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static int a(int i9, String str) {
        if (i9 >= 0) {
            return i9;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i9);
    }

    public static void a(boolean z8) {
        Preconditions.checkState(z8, "no calls to next() since the last call to remove()");
    }
}
