package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzeyn implements zzexh {
    private final Executor zza;
    private final String zzb;

    public zzeyn(zzbzu zzbzuVar, Executor executor, String str, @Nullable PackageInfo packageInfo, int i2) {
        this.zza = executor;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        return zzgfo.zzf(zzgfo.zzm(zzgfo.zzh(this.zzb), new zzfxq() { // from class: com.google.android.gms.internal.ads.zzeyl
            @Override // com.google.android.gms.internal.ads.zzfxq
            public final Object apply(Object obj) {
                return new zzeyo((String) obj);
            }
        }, this.zza), Throwable.class, new zzgev() { // from class: com.google.android.gms.internal.ads.zzeym
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzeyn.this.zzc((Throwable) obj);
            }
        }, this.zza);
    }

    public final /* synthetic */ ListenableFuture zzc(Throwable th) throws Exception {
        return zzgfo.zzh(new zzeyo(this.zzb));
    }
}
