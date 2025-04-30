package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcvw implements zzgfp {
    final /* synthetic */ zzcvx zza;

    public zzcvw(zzcvx zzcvxVar) {
        this.zza = zzcvxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        zzdeq zzdeqVar;
        zzdeqVar = this.zza.zzf;
        zzdeqVar.zzl(false);
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        zzdeq zzdeqVar;
        zzdeqVar = this.zza.zzf;
        zzdeqVar.zzl(true);
    }
}
