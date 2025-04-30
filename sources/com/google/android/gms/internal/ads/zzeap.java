package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzeap extends zzeas {
    private final Context zzg;
    private final Executor zzh;

    public zzeap(Context context, Executor executor) {
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
                            this.zzf.zzp().zzg(this.zze, new zzear(this));
                        } catch (Throwable th) {
                            com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "RemoteAdRequestClientTask.onConnected");
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

    @Override // com.google.android.gms.internal.ads.zzeas, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        com.google.android.gms.ads.internal.util.client.zzm.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzebh(1));
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
                this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeao
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeap.this.zzb();
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
