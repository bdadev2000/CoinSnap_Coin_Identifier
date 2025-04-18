package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfcd implements zzfwh {
    final /* synthetic */ zzfcg zza;

    public zzfcd(zzfcg zzfcgVar) {
        this.zza = zzfcgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwh
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzfce zzfceVar;
        zzbvx zzbvxVar = (zzbvx) obj;
        this.zza.zzd = new zzfce(zzbvxVar, new zzfho(zzbvxVar.zzj), null);
        zzfceVar = this.zza.zzd;
        return zzfceVar;
    }
}
