package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzeut implements zzexw {
    private final Context zza;
    private final zzgge zzb;

    public zzeut(zzgge zzggeVar, Context context) {
        this.zzb = zzggeVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 57;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeus
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeut.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeuu zzc() throws Exception {
        com.google.android.gms.ads.internal.zzu.zzp();
        return new zzeuu(com.google.android.gms.ads.internal.util.zzt.zzs(this.zza));
    }
}
