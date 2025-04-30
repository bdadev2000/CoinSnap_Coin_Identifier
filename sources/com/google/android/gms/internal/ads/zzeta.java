package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzeta implements zzexw {
    private final zzgge zza;
    private final zzdsy zzb;
    private final String zzc;
    private final zzfho zzd;

    public zzeta(zzgge zzggeVar, zzdsy zzdsyVar, zzfho zzfhoVar, String str) {
        this.zza = zzggeVar;
        this.zzb = zzdsyVar;
        this.zzd = zzfhoVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeta.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzetb zzc() throws Exception {
        zzfho zzfhoVar = this.zzd;
        zzdsy zzdsyVar = this.zzb;
        return new zzetb(zzdsyVar.zzb(zzfhoVar.zzf, this.zzc), zzdsyVar.zza());
    }
}
