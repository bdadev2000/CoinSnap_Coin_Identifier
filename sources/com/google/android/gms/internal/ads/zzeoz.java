package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes3.dex */
public final class zzeoz implements zzexh {
    private final Context zza;

    public zzeoz(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcU)).booleanValue()) {
            return zzgfo.zzh(new zzepa(ContextCompat.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
        }
        return zzgfo.zzh(null);
    }
}
