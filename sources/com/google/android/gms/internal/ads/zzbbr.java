package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class zzbbr {
    zzayh zza;
    boolean zzb;
    private final ExecutorService zzc;

    public zzbbr() {
        this.zzc = com.google.android.gms.ads.internal.util.client.zzb.zzb;
    }

    public zzbbr(final Context context) {
        ExecutorService executorService = com.google.android.gms.ads.internal.util.client.zzb.zzb;
        this.zzc = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbbm
            @Override // java.lang.Runnable
            public final void run() {
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzeV)).booleanValue();
                zzbbr zzbbrVar = zzbbr.this;
                Context context2 = context;
                if (booleanValue) {
                    try {
                        zzbbrVar.zza = (zzayh) com.google.android.gms.ads.internal.util.client.zzq.zzb(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.internal.ads.zzbbn
                            @Override // com.google.android.gms.ads.internal.util.client.zzo
                            public final Object zza(Object obj) {
                                return zzayg.zzb((IBinder) obj);
                            }
                        });
                        zzbbrVar.zza.zze(ObjectWrapper.wrap(context2), "GMA_SDK");
                        zzbbrVar.zzb = true;
                    } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzp | NullPointerException unused) {
                        com.google.android.gms.ads.internal.util.client.zzm.zze("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
