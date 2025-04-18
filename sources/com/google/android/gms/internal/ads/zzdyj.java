package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzdyj extends zzdyh {
    private final Context zzg;
    private final Executor zzh;

    public zzdyj(Context context, Executor executor) {
        this.zzg = context;
        this.zzh = executor;
        this.zzf = new zzbur(context, com.google.android.gms.ads.internal.zzv.zzu().zzb(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbvp zzdyfVar;
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    zzbvf zzp = this.zzf.zzp();
                    zzbvx zzbvxVar = this.zze;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzmD)).booleanValue()) {
                        zzdyfVar = new zzdyg(this.zza, this.zze);
                    } else {
                        zzdyfVar = new zzdyf(this);
                    }
                    zzp.zzf(zzbvxVar, zzdyfVar);
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzdyw(1));
                } catch (Throwable th2) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(th2, "RemoteSignalsClientTask.onConnected");
                    this.zza.zzd(new zzdyw(1));
                }
            }
        }
    }

    public final ua.b zza(zzbvx zzbvxVar) {
        synchronized (this.zzb) {
            if (this.zzc) {
                return this.zza;
            }
            this.zzc = true;
            this.zze = zzbvxVar;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyi
                @Override // java.lang.Runnable
                public final void run() {
                    zzdyj.this.zzb();
                }
            }, zzcaj.zzf);
            zzdyh.zzc(this.zzg, this.zza, this.zzh);
            return this.zza;
        }
    }
}
