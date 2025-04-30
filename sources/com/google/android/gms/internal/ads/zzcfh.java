package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzcfh extends com.google.android.gms.ads.internal.util.zzb {
    final zzcee zza;
    final zzcfp zzb;
    private final String zzc;
    private final String[] zzd;

    public zzcfh(zzcee zzceeVar, zzcfp zzcfpVar, String str, String[] strArr) {
        this.zza = zzceeVar;
        this.zzb = zzcfpVar;
        this.zzc = str;
        this.zzd = strArr;
        com.google.android.gms.ads.internal.zzu.zzy().zzb(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.zzb.zzu(this.zzc, this.zzd);
        } finally {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcfg(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final f4.c zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbX)).booleanValue() && (this.zzb instanceof zzcfy)) {
            return zzcci.zze.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcff
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzcfh.this.zzd();
                }
            });
        }
        return super.zzb();
    }

    public final /* synthetic */ Boolean zzd() throws Exception {
        return Boolean.valueOf(this.zzb.zzw(this.zzc, this.zzd, this));
    }

    public final String zze() {
        return this.zzc;
    }
}
