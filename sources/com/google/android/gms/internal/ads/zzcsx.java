package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcsx implements zzgee {
    final /* synthetic */ zzcsy zza;

    public zzcsx(zzcsy zzcsyVar) {
        this.zza = zzcsyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        zzdbt zzdbtVar;
        zzdbtVar = this.zza.zzf;
        zzdbtVar.zzl(false);
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        zzdbt zzdbtVar;
        zzdbtVar = this.zza.zzf;
        zzdbtVar.zzl(true);
    }
}
