package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzepa implements zzevz {
    private final Context zza;
    private final zzges zzb;

    public zzepa(zzges zzgesVar, Context context) {
        this.zzb = zzgesVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 61;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzmA)).booleanValue()) {
            return zzgei.zzh(new zzepb(null, false));
        }
        final ContentResolver contentResolver = this.zza.getContentResolver();
        if (contentResolver == null) {
            return zzgei.zzh(new zzepb(null, false));
        }
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeoz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ContentResolver contentResolver2 = contentResolver;
                String string = Settings.Secure.getString(contentResolver2, "advertising_id");
                boolean z10 = false;
                if (Settings.Secure.getInt(contentResolver2, "limit_ad_tracking", 0) == 1) {
                    z10 = true;
                }
                return new zzepb(string, z10);
            }
        });
    }
}
