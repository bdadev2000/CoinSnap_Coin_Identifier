package com.google.android.gms.internal.ads;

import java.util.Collection;

/* loaded from: classes3.dex */
public final class zzfzw {
    public static boolean zza(Collection collection, Object obj) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
