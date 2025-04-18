package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzcdn extends com.google.android.gms.ads.internal.util.zzb {
    final zzccj zza;
    final zzcdv zzb;
    private final String zzc;
    private final String[] zzd;

    public zzcdn(zzccj zzccjVar, zzcdv zzcdvVar, String str, String[] strArr) {
        this.zza = zzccjVar;
        this.zzb = zzcdvVar;
        this.zzc = str;
        this.zzd = strArr;
        com.google.android.gms.ads.internal.zzu.zzy().zzb(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.zzb.zzu(this.zzc, this.zzd);
        } finally {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcdm(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final ListenableFuture zzb() {
        return (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbZ)).booleanValue() && (this.zzb instanceof zzcee)) ? zzcan.zze.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcdl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzcdn.this.zzd();
            }
        }) : super.zzb();
    }

    public final /* synthetic */ Boolean zzd() throws Exception {
        return Boolean.valueOf(this.zzb.zzw(this.zzc, this.zzd, this));
    }

    public final String zze() {
        return this.zzc;
    }
}
