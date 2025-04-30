package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfec implements zzfxu {
    final /* synthetic */ zzfeg zza;

    public zzfec(zzfeg zzfegVar) {
        this.zza = zzfegVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxu
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzfjm zze;
        zzfef zzfefVar;
        com.google.android.gms.ads.internal.util.client.zzm.zzh("", (zzebh) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzfeg zzfegVar = this.zza;
        zze = zzfegVar.zze();
        zzfegVar.zzd = new zzfef(null, zze, null);
        zzfefVar = this.zza.zzd;
        return zzfefVar;
    }
}
