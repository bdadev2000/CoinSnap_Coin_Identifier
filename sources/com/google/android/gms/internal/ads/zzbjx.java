package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzbjx extends zzbiy {
    final /* synthetic */ zzbka zza;

    public /* synthetic */ zzbjx(zzbka zzbkaVar, zzbjw zzbjwVar) {
        this.zza = zzbkaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zze(zzbip zzbipVar, String str) {
        zzbka zzbkaVar = this.zza;
        if (zzbka.zza(zzbkaVar) == null) {
            return;
        }
        zzbka.zza(zzbkaVar).zzb(zzbka.zze(zzbkaVar, zzbipVar), str);
    }
}
