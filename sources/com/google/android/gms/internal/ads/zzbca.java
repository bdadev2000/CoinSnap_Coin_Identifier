package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public final class zzbca {

    @VisibleForTesting
    zzayq zza;

    @VisibleForTesting
    boolean zzb;
    private final ExecutorService zzc;

    public zzbca() {
        this.zzc = com.google.android.gms.ads.internal.util.client.zzb.zzb;
    }

    public zzbca(final Context context) {
        ExecutorService executorService = com.google.android.gms.ads.internal.util.client.zzb.zzb;
        this.zzc = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbbv
            @Override // java.lang.Runnable
            public final void run() {
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeO)).booleanValue();
                zzbca zzbcaVar = zzbca.this;
                Context context2 = context;
                if (booleanValue) {
                    try {
                        zzbcaVar.zza = (zzayq) com.google.android.gms.ads.internal.util.client.zzq.zzb(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.internal.ads.zzbbw
                            @Override // com.google.android.gms.ads.internal.util.client.zzo
                            public final Object zza(Object obj) {
                                return zzayp.zzb((IBinder) obj);
                            }
                        });
                        zzbcaVar.zza.zze(ObjectWrapper.wrap(context2), "GMA_SDK");
                        zzbcaVar.zzb = true;
                    } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzp | NullPointerException unused) {
                        com.google.android.gms.ads.internal.util.client.zzm.zze("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
