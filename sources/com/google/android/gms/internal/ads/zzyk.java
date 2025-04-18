package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzyk {
    public final zzcd zza;
    public final int[] zzb;

    public zzyk(zzcd zzcdVar, int[] iArr, int i2) {
        if (iArr.length == 0) {
            zzea.zzd("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzcdVar;
        this.zzb = iArr;
    }
}
