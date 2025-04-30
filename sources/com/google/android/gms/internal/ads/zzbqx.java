package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzbqx {
    private static zzbqx zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    public static zzbqx zza() {
        if (zza == null) {
            zza = new zzbqx();
        }
        return zza;
    }

    @Nullable
    public final Thread zzb(final Context context, @Nullable final String str) {
        if (!this.zzb.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbqw
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                zzbep.zza(context2);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzau)).booleanValue()) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzai)).booleanValue());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzap)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((zzcjc) com.google.android.gms.ads.internal.util.client.zzq.zzb(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.internal.ads.zzbqv
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.google.android.gms.ads.internal.util.client.zzo
                        public final Object zza(Object obj) {
                            return zzcjb.zzb(obj);
                        }
                    })).zze(ObjectWrapper.wrap(context2), new zzbqu(AppMeasurementSdk.getInstance(context2, "FA-Ads", "am", str, bundle)));
                } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzp | NullPointerException e4) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
                }
            }
        });
        thread.start();
        return thread;
    }
}
