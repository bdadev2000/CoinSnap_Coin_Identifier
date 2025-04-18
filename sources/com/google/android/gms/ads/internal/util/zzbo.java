package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzapk;
import com.google.android.gms.internal.ads.zzaqf;
import com.google.android.gms.internal.ads.zzarj;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzcas;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbo {
    private static zzaqf zza;
    private static final Object zzb = new Object();

    public zzbo(Context context) {
        zzaqf zza2;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzb) {
            try {
                if (zza == null) {
                    zzbcv.zza(context);
                    if (!ClientLibraryUtils.isPackageSide()) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeo)).booleanValue()) {
                            zza2 = zzaz.zzb(context);
                            zza = zza2;
                        }
                    }
                    zza2 = zzarj.zza(context, null);
                    zza = zza2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ListenableFuture zza(String str) {
        zzcas zzcasVar = new zzcas();
        zza.zza(new zzbn(str, null, zzcasVar));
        return zzcasVar;
    }

    public final ListenableFuture zzb(int i2, String str, @Nullable Map map, @Nullable byte[] bArr) {
        zzbl zzblVar = new zzbl(null);
        zzbi zzbiVar = new zzbi(this, str, zzblVar);
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        zzbj zzbjVar = new zzbj(this, i2, str, zzblVar, zzbiVar, bArr, map, zzlVar);
        if (com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
            try {
                zzlVar.zzd(str, "GET", zzbjVar.zzl(), zzbjVar.zzx());
            } catch (zzapk e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj(e.getMessage());
            }
        }
        zza.zza(zzbjVar);
        return zzblVar;
    }
}
