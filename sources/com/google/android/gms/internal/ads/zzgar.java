package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;

/* loaded from: classes4.dex */
public abstract class zzgar {
    public static int zze(int i2, int i3) {
        int i4 = i2 + (i2 >> 1) + 1;
        if (i4 < i3) {
            int highestOneBit = Integer.highestOneBit(i3 - 1);
            i4 = highestOneBit + highestOneBit;
        }
        return i4 < 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i4;
    }

    public abstract zzgar zzb(Object obj);
}
