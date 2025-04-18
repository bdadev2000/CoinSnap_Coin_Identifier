package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class zzchr implements zzhfx {
    private final zzchn zza;

    public zzchr(zzchn zzchnVar) {
        this.zza = zzchnVar;
    }

    public static WeakReference zzc(zzchn zzchnVar) {
        WeakReference zzg = zzchnVar.zzg();
        zzhgf.zzb(zzg);
        return zzg;
    }

    public final WeakReference zza() {
        return zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}
