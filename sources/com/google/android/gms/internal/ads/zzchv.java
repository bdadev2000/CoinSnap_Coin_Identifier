package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class zzchv implements zzhii {
    private final zzchr zza;

    public zzchv(zzchr zzchrVar) {
        this.zza = zzchrVar;
    }

    public static WeakReference zzc(zzchr zzchrVar) {
        WeakReference zzg = zzchrVar.zzg();
        zzhiq.zzb(zzg);
        return zzg;
    }

    public final WeakReference zza() {
        return zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}
