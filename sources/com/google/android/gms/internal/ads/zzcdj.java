package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzcdj extends com.google.android.gms.ads.internal.util.zzb {
    final zzccf zza;
    final zzcdr zzb;
    private final String zzc;
    private final String[] zzd;

    public zzcdj(zzccf zzccfVar, zzcdr zzcdrVar, String str, String[] strArr) {
        this.zza = zzccfVar;
        this.zzb = zzcdrVar;
        this.zzc = str;
        this.zzd = strArr;
        com.google.android.gms.ads.internal.zzv.zzz().zzb(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.zzb.zzu(this.zzc, this.zzd);
        } finally {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcdi(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final ua.b zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcc)).booleanValue() && (this.zzb instanceof zzcea)) {
            return zzcaj.zze.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcdh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzcdj.this.zzd();
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
