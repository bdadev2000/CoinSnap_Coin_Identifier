package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzfzy {
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
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= collection.add(it.next());
        }
        return z10;
    }
}
