package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes4.dex */
public final class zzdzx extends zzdzr {
    private String zzg;
    private int zzh = 1;

    public zzdzx(Context context) {
        this.zzf = new zzbux(context, com.google.android.gms.ads.internal.zzu.zzt().zzb(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        synchronized (this.zzb) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    try {
                        int i2 = this.zzh;
                        if (i2 == 2) {
                            this.zzf.zzp().zze(this.zze, new zzdzq(this));
                        } else if (i2 == 3) {
                            this.zzf.zzp().zzh(this.zzg, new zzdzq(this));
                        } else {
                            this.zza.zzd(new zzeag(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zzd(new zzeag(1));
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                        this.zza.zzd(new zzeag(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdzr, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        com.google.android.gms.ads.internal.util.client.zzm.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzeag(1));
    }

    public final ListenableFuture zza(zzbwa zzbwaVar) {
        synchronized (this.zzb) {
            try {
                int i2 = this.zzh;
                if (i2 != 1 && i2 != 2) {
                    return zzgfo.zzg(new zzeag(2));
                }
                if (this.zzc) {
                    return this.zza;
                }
                this.zzh = 2;
                this.zzc = true;
                this.zze = zzbwaVar;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzv
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdzx.this.zzb();
                    }
                }, zzcan.zzf);
                return this.zza;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ListenableFuture zzd(String str) {
        synchronized (this.zzb) {
            try {
                int i2 = this.zzh;
                if (i2 != 1 && i2 != 3) {
                    return zzgfo.zzg(new zzeag(2));
                }
                if (this.zzc) {
                    return this.zza;
                }
                this.zzh = 3;
                this.zzc = true;
                this.zzg = str;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzw
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdzx.this.zzb();
                    }
                }, zzcan.zzf);
                return this.zza;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
