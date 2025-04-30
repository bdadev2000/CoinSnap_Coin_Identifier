package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbvx {
    private static zzcbg zza;
    private final Context zzb;
    private final AdFormat zzc;

    @Nullable
    private final com.google.android.gms.ads.internal.client.zzdx zzd;

    @Nullable
    private final String zze;

    public zzbvx(Context context, AdFormat adFormat, @Nullable com.google.android.gms.ads.internal.client.zzdx zzdxVar, @Nullable String str) {
        this.zzb = context;
        this.zzc = adFormat;
        this.zzd = zzdxVar;
        this.zze = str;
    }

    @Nullable
    public static zzcbg zza(Context context) {
        zzcbg zzcbgVar;
        synchronized (zzbvx.class) {
            try {
                if (zza == null) {
                    zza = com.google.android.gms.ads.internal.client.zzay.zza().zzr(context, new zzbrb());
                }
                zzcbgVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzcbgVar;
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.client.zzl zza2;
        zzcbg zza3 = zza(this.zzb);
        if (zza3 == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        Context context = this.zzb;
        com.google.android.gms.ads.internal.client.zzdx zzdxVar = this.zzd;
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        if (zzdxVar == null) {
            com.google.android.gms.ads.internal.client.zzm zzmVar = new com.google.android.gms.ads.internal.client.zzm();
            zzmVar.zzg(System.currentTimeMillis());
            zza2 = zzmVar.zza();
        } else {
            zza2 = com.google.android.gms.ads.internal.client.zzp.zza.zza(this.zzb, zzdxVar);
        }
        try {
            zza3.zzf(wrap, new zzcbk(this.zze, this.zzc.name(), null, zza2), new zzbvw(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
