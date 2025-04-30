package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes2.dex */
public final class zzeay extends zzeas {
    private String zzg;
    private int zzh = 1;

    public zzeay(Context context) {
        this.zzf = new zzbwr(context, com.google.android.gms.ads.internal.zzu.zzt().zzb(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        synchronized (this.zzb) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    try {
                        int i9 = this.zzh;
                        if (i9 == 2) {
                            this.zzf.zzp().zze(this.zze, new zzear(this));
                        } else if (i9 == 3) {
                            this.zzf.zzp().zzh(this.zzg, new zzear(this));
                        } else {
                            this.zza.zzd(new zzebh(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zzd(new zzebh(1));
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
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
                int i9 = this.zzh;
                if (i9 != 1 && i9 != 2) {
                    return zzgft.zzg(new zzebh(2));
                }
                if (this.zzc) {
                    return this.zza;
                }
                this.zzh = 2;
                this.zzc = true;
                this.zze = zzbxuVar;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeaw
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeay.this.zzb();
                    }
                }, zzcci.zzf);
                return this.zza;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final f4.c zzd(String str) {
        synchronized (this.zzb) {
            try {
                int i9 = this.zzh;
                if (i9 != 1 && i9 != 3) {
                    return zzgft.zzg(new zzebh(2));
                }
                if (this.zzc) {
                    return this.zza;
                }
                this.zzh = 3;
                this.zzc = true;
                this.zzg = str;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeax
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeay.this.zzb();
                    }
                }, zzcci.zzf);
                return this.zza;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
