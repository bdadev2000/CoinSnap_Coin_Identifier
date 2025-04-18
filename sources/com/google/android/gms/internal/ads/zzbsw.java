package com.google.android.gms.internal.ads;

/* loaded from: classes4.dex */
final class zzbsw extends zzbhf {
    final /* synthetic */ zzbsz zza;

    public /* synthetic */ zzbsw(zzbsz zzbszVar, zzbsv zzbsvVar) {
        this.zza = zzbszVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhg
    public final void zze(zzbgw zzbgwVar, String str) {
        zzbsz zzbszVar = this.zza;
        if (zzbsz.zzc(zzbszVar) == null) {
            return;
        }
        zzbsz.zzc(zzbszVar).onCustomClick(zzbsz.zze(zzbszVar, zzbgwVar), str);
    }
}
