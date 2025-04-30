package com.google.android.gms.internal.play_billing;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzau {
    public static int zza(Set set) {
        int i9;
        int i10 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i9 = obj.hashCode();
            } else {
                i9 = 0;
            }
            i10 += i9;
        }
        return i10;
    }
}
