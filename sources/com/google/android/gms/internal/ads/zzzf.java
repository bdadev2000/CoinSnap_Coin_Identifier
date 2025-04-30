package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzzf {
    public final zzde zza;
    public final int[] zzb;

    public zzzf(zzde zzdeVar, int[] iArr, int i9) {
        if (iArr.length == 0) {
            zzfk.zzd("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzdeVar;
        this.zzb = iArr;
    }
}
