package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public class zzbp extends Exception {
    public final int zza;
    public final long zzb;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public zzbp(@Nullable String str, @Nullable Throwable th, int i2, Bundle bundle, long j2) {
        super(str, th);
        this.zza = i2;
        this.zzb = j2;
    }
}
