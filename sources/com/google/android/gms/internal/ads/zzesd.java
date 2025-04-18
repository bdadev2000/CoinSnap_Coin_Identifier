package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzesd implements zzexh {
    private final zzgfz zza;
    private final zzdrz zzb;
    private final String zzc;
    private final zzfhc zzd;

    public zzesd(zzgfz zzgfzVar, zzdrz zzdrzVar, zzfhc zzfhcVar, String str) {
        this.zza = zzgfzVar;
        this.zzb = zzdrzVar;
        this.zzd = zzfhcVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzesd.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzese zzc() throws Exception {
        zzdrz zzdrzVar = this.zzb;
        return new zzese(zzdrzVar.zzb(this.zzd.zzf, this.zzc), zzdrzVar.zza());
    }
}
