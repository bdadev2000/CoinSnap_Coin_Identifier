package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzeau extends zzeas {
    private final Context zzg;
    private final Executor zzh;

    public zzeau(Context context, Executor executor) {
        this.zzg = context;
        this.zzh = executor;
        this.zzf = new zzbwr(context, com.google.android.gms.ads.internal.zzu.zzt().zzb(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    try {
                        try {
                            this.zzf.zzp().zzf(this.zze, new zzear(this));
                        } catch (Throwable th) {
                            com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "RemoteSignalsClientTask.onConnected");
                            this.zza.zzd(new zzebh(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zzd(new zzebh(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final f4.c zza(zzbxu zzbxuVar) {
        synchronized (this.zzb) {
            try {
                if (this.zzc) {
                    return this.zza;
                }
                this.zzc = true;
                this.zze = zzbxuVar;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeat
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeau.this.zzb();
                    }
                }, zzcci.zzf);
                zzeas.zzc(this.zzg, this.zza, this.zzh);
                return this.zza;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
