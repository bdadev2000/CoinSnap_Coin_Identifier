package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class n3 {
    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(eb.j.j("null key in entry: null=", obj2));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static int a(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    public static void a(boolean z10) {
        Preconditions.checkState(z10, "no calls to next() since the last call to remove()");
    }
}
