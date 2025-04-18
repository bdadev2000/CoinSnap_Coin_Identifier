package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeub implements zzexh {
    private final Context zza;
    private final zzgfz zzb;

    public zzeub(zzgfz zzgfzVar, Context context) {
        this.zzb = zzgfzVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 57;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeua
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeub.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeuc zzc() throws Exception {
        com.google.android.gms.ads.internal.zzu.zzp();
        return new zzeuc(com.google.android.gms.ads.internal.util.zzt.zzs(this.zza));
    }
}
