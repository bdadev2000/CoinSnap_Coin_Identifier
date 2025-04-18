package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcul implements zzgfk {
    final /* synthetic */ zzcum zza;

    public zzcul(zzcum zzcumVar) {
        this.zza = zzcumVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
        zzddi zzddiVar;
        zzddiVar = this.zza.zzf;
        zzddiVar.zzl(false);
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        zzddi zzddiVar;
        zzddiVar = this.zza.zzf;
        zzddiVar.zzl(true);
    }
}
