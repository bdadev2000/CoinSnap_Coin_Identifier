package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class zzbdu {
    zzbai zza;
    boolean zzb;
    private final ExecutorService zzc;

    public zzbdu() {
        this.zzc = com.google.android.gms.ads.internal.util.client.zzb.zzb;
    }

    public zzbdu(final Context context) {
        ExecutorService executorService = com.google.android.gms.ads.internal.util.client.zzb.zzb;
        this.zzc = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdp
            @Override // java.lang.Runnable
            public final void run() {
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeT)).booleanValue();
                zzbdu zzbduVar = zzbdu.this;
                Context context2 = context;
                if (booleanValue) {
                    try {
                        zzbduVar.zza = (zzbai) com.google.android.gms.ads.internal.util.client.zzq.zzb(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.internal.ads.zzbdq
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.google.android.gms.ads.internal.util.client.zzo
                            public final Object zza(Object obj) {
                                return zzbah.zzb(obj);
                            }
                        });
                        zzbduVar.zza.zze(ObjectWrapper.wrap(context2), "GMA_SDK");
                        zzbduVar.zzb = true;
                    } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzp | NullPointerException unused) {
                        com.google.android.gms.ads.internal.util.client.zzm.zze("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
