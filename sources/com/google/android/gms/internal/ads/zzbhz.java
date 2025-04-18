package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbhz extends zzbhb {
    final /* synthetic */ zzbic zza;

    public /* synthetic */ zzbhz(zzbic zzbicVar, zzbib zzbibVar) {
        this.zza = zzbicVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zze(zzbgs zzbgsVar, String str) {
        com.google.android.gms.ads.formats.zzf zzfVar;
        com.google.android.gms.ads.formats.zzf zzfVar2;
        zzbgt zzf;
        zzbic zzbicVar = this.zza;
        zzfVar = zzbicVar.zzb;
        if (zzfVar == null) {
            return;
        }
        zzfVar2 = zzbicVar.zzb;
        zzf = zzbicVar.zzf(zzbgsVar);
        zzfVar2.zzb(zzf, str);
    }
}
