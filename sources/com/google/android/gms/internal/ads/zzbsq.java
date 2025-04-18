package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzbsq extends zzbhb {
    final /* synthetic */ zzbst zza;

    public /* synthetic */ zzbsq(zzbst zzbstVar, zzbss zzbssVar) {
        this.zza = zzbstVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zze(zzbgs zzbgsVar, String str) {
        zzbst zzbstVar = this.zza;
        if (zzbst.zzc(zzbstVar) == null) {
            return;
        }
        zzbst.zzc(zzbstVar).onCustomClick(zzbst.zze(zzbstVar, zzbgsVar), str);
    }
}
