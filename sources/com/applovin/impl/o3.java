package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class o3 {
    public static StringBuilder a(int i9) {
        n3.a(i9, "size");
        return new StringBuilder((int) Math.min(i9 * 8, 1073741824L));
    }

    public static boolean a(Collection collection, Object obj) {
        Preconditions.checkNotNull(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
