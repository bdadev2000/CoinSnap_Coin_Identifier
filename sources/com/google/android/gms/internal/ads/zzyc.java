package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzyc {
    public final zzbw zza;
    public final int[] zzb;

    public zzyc(zzbw zzbwVar, int[] iArr, int i10) {
        if (iArr.length == 0) {
            zzdt.zzd("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzbwVar;
        this.zzb = iArr;
    }
}
