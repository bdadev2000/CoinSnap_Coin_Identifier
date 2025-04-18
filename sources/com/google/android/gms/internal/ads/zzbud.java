package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes4.dex */
public final class zzbud {
    private static zzbzl zza;
    private final Context zzb;
    private final AdFormat zzc;

    @Nullable
    private final com.google.android.gms.ads.internal.client.zzei zzd;

    @Nullable
    private final String zze;

    public zzbud(Context context, AdFormat adFormat, @Nullable com.google.android.gms.ads.internal.client.zzei zzeiVar, @Nullable String str) {
        this.zzb = context;
        this.zzc = adFormat;
        this.zzd = zzeiVar;
        this.zze = str;
    }

    @Nullable
    public static zzbzl zza(Context context) {
        zzbzl zzbzlVar;
        synchronized (zzbud.class) {
            try {
                if (zza == null) {
                    zza = com.google.android.gms.ads.internal.client.zzbc.zza().zzt(context, new zzbph());
                }
                zzbzlVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbzlVar;
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.client.zzm zza2;
        long currentTimeMillis = System.currentTimeMillis();
        zzbzl zza3 = zza(this.zzb);
        if (zza3 == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        Context context = this.zzb;
        com.google.android.gms.ads.internal.client.zzei zzeiVar = this.zzd;
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        if (zzeiVar == null) {
            com.google.android.gms.ads.internal.client.zzn zznVar = new com.google.android.gms.ads.internal.client.zzn();
            zznVar.zzg(currentTimeMillis);
            zza2 = zznVar.zza();
        } else {
            zzeiVar.zzq(currentTimeMillis);
            zza2 = com.google.android.gms.ads.internal.client.zzr.zza.zza(this.zzb, this.zzd);
        }
        try {
            zza3.zzf(wrap, new zzbzp(this.zze, this.zzc.name(), null, zza2), new zzbuc(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
