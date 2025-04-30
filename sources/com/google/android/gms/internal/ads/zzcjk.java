package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class zzcjk implements zzhkp {
    private final zzcjg zza;

    public zzcjk(zzcjg zzcjgVar) {
        this.zza = zzcjgVar;
    }

    public final WeakReference zza() {
        WeakReference zzg = this.zza.zzg();
        zzhkx.zzb(zzg);
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* synthetic */ Object zzb() {
        WeakReference zzg = this.zza.zzg();
        zzhkx.zzb(zzg);
        return zzg;
    }
}
