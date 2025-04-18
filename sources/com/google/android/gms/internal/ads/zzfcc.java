package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfcc implements zzfwh {
    final /* synthetic */ zzfcg zza;

    public zzfcc(zzfcg zzfcgVar) {
        this.zza = zzfcgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwh
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzfhm zze;
        zzfce zzfceVar;
        com.google.android.gms.ads.internal.util.client.zzm.zzh("", (zzdyw) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzfcg zzfcgVar = this.zza;
        zze = zzfcgVar.zze();
        zzfcgVar.zzd = new zzfce(null, zze, 0 == true ? 1 : 0);
        zzfceVar = this.zza.zzd;
        return zzfceVar;
    }
}
