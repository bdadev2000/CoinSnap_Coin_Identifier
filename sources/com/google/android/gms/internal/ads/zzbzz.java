package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
final class zzbzz implements zzgfp {
    final /* synthetic */ f4.c zza;

    public zzbzz(zzcaa zzcaaVar, f4.c cVar) {
        this.zza = cVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        List list;
        list = zzcaa.zzc;
        list.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list;
        list = zzcaa.zzc;
        list.remove(this.zza);
    }
}
