package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes3.dex */
public final class zzdyn extends zzdyh {
    private String zzg;
    private int zzh = 1;

    public zzdyn(Context context) {
        this.zzf = new zzbur(context, com.google.android.gms.ads.internal.zzv.zzu().zzb(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        zzbvp zzdyfVar;
        zzbvp zzdyfVar2;
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    int i10 = this.zzh;
                    if (i10 == 2) {
                        zzbvf zzp = this.zzf.zzp();
                        zzbvx zzbvxVar = this.zze;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzmD)).booleanValue()) {
                            zzdyfVar2 = new zzdyg(this.zza, this.zze);
                        } else {
                            zzdyfVar2 = new zzdyf(this);
                        }
                        zzp.zze(zzbvxVar, zzdyfVar2);
                    } else if (i10 == 3) {
                        zzbvf zzp2 = this.zzf.zzp();
                        String str = this.zzg;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzmD)).booleanValue()) {
                            zzdyfVar = new zzdyg(this.zza, this.zze);
                        } else {
                            zzdyfVar = new zzdyf(this);
                        }
                        zzp2.zzh(str, zzdyfVar);
                    } else {
                        this.zza.zzd(new zzdyw(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzdyw(1));
                } catch (Throwable th2) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(th2, "RemoteUrlAndCacheKeyClientTask.onConnected");
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
            int i10 = this.zzh;
            if (i10 != 1 && i10 != 2) {
                return zzgei.zzg(new zzdyw(2));
            }
            if (this.zzc) {
                return this.zza;
            }
            this.zzh = 2;
            this.zzc = true;
            this.zze = zzbvxVar;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyl
                @Override // java.lang.Runnable
                public final void run() {
                    zzdyn.this.zzb();
                }
            }, zzcaj.zzf);
            return this.zza;
        }
    }

    public final ua.b zzd(String str) {
        synchronized (this.zzb) {
            int i10 = this.zzh;
            if (i10 != 1 && i10 != 3) {
                return zzgei.zzg(new zzdyw(2));
            }
            if (this.zzc) {
                return this.zza;
            }
            this.zzh = 3;
            this.zzc = true;
            this.zzg = str;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdym
                @Override // java.lang.Runnable
                public final void run() {
                    zzdyn.this.zzb();
                }
            }, zzcaj.zzf);
            return this.zza;
        }
    }
}
