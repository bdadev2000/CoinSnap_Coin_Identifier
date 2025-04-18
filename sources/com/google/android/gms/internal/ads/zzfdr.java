package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzfdr implements zzfxq {
    final /* synthetic */ zzfdu zza;

    public zzfdr(zzfdu zzfduVar) {
        this.zza = zzfduVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzfdt zzfdtVar;
        zzbwa zzbwaVar = (zzbwa) obj;
        this.zza.zzd = new zzfdt(zzbwaVar, new zzfjc(zzbwaVar.zzj), null);
        zzfdtVar = this.zza.zzd;
        return zzfdtVar;
    }
}
