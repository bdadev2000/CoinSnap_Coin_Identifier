package com.google.android.gms.internal.maps;

import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes12.dex */
public final class zzbv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }
}
