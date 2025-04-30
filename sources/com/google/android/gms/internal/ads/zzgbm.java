package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zzgbm {
    public static Object zza(Iterator it) {
        if (it.hasNext()) {
            Object next = it.next();
            it.remove();
            return next;
        }
        return null;
    }

    public static void zzb(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean zzc(Collection collection, Iterator it) {
        boolean z8 = false;
        while (it.hasNext()) {
            z8 |= collection.add(it.next());
        }
        return z8;
    }
}
