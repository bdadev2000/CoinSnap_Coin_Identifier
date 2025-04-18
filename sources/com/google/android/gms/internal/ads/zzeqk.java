package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeqk implements zzexh {
    private final Context zza;
    private final zzgfz zzb;

    public zzeqk(zzgfz zzgfzVar, Context context) {
        this.zzb = zzgfzVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 61;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        final ContentResolver contentResolver;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzmv)).booleanValue() && (contentResolver = this.zza.getContentResolver()) != null) {
            return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqj
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ContentResolver contentResolver2 = contentResolver;
                    return new zzeql(Settings.Secure.getString(contentResolver2, "advertising_id"), Settings.Secure.getInt(contentResolver2, "limit_ad_tracking", 0) == 1);
                }
            });
        }
        return zzgfo.zzh(new zzeql(null, false));
    }
}
