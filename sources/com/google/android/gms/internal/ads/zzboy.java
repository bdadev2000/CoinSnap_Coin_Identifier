package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zzboy {
    private static zzboy zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    public static zzboy zza() {
        if (zza == null) {
            zza = new zzboy();
        }
        return zza;
    }

    @Nullable
    public final Thread zzb(final Context context, @Nullable final String str) {
        if (!this.zzb.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbox
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                zzbcn.zza(context2);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaD)).booleanValue()) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzas)).booleanValue());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaz)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((zzchj) com.google.android.gms.ads.internal.util.client.zzq.zzb(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.internal.ads.zzbow
                        @Override // com.google.android.gms.ads.internal.util.client.zzo
                        public final Object zza(Object obj) {
                            return zzchi.zzb((IBinder) obj);
                        }
                    })).zze(ObjectWrapper.wrap(context2), new zzbov(AppMeasurementSdk.getInstance(context2, "FA-Ads", "am", str, bundle)));
                } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzp | NullPointerException e2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
                }
            }
        });
        thread.start();
        return thread;
    }
}
