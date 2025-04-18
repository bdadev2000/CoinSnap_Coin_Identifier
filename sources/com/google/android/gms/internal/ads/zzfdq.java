package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzfdq implements zzfxq {
    final /* synthetic */ zzfdu zza;

    public zzfdq(zzfdu zzfduVar) {
        this.zza = zzfduVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzfja zze;
        zzfdt zzfdtVar;
        com.google.android.gms.ads.internal.util.client.zzm.zzh("", (zzeag) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzfdu zzfduVar = this.zza;
        zze = zzfduVar.zze();
        zzfduVar.zzd = new zzfdt(null, zze, null);
        zzfdtVar = this.zza.zzd;
        return zzfdtVar;
    }
}
