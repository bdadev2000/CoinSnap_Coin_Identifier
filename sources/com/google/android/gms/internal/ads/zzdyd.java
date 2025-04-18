package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzdyd extends zzdyh {
    private final Context zzg;
    private final Executor zzh;

    public zzdyd(Context context, Executor executor) {
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
                    zzp.zzg(zzbvxVar, zzdyfVar);
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzdyw(1));
                } catch (Throwable th2) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(th2, "RemoteAdRequestClientTask.onConnected");
                    this.zza.zzd(new zzdyw(1));
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdyh, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        com.google.android.gms.ads.internal.util.client.zzm.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzdyw(1));
    }

    public final ua.b zza(zzbvx zzbvxVar) {
        synchronized (this.zzb) {
            if (this.zzc) {
                return this.zza;
            }
            this.zzc = true;
            this.zze = zzbvxVar;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyc
                @Override // java.lang.Runnable
                public final void run() {
                    zzdyd.this.zzb();
                }
            }, zzcaj.zzf);
            zzdyh.zzc(this.zzg, this.zza, this.zzh);
            return this.zza;
        }
    }
}
