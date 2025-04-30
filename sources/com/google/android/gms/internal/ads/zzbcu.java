package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzbcu {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzbcq(this);
    private final Object zzc = new Object();

    @Nullable
    private zzbcx zzd;

    @Nullable
    private Context zze;

    @Nullable
    private zzbda zzf;

    public static /* bridge */ /* synthetic */ void zzh(zzbcu zzbcuVar) {
        synchronized (zzbcuVar.zzc) {
            try {
                zzbcx zzbcxVar = zzbcuVar.zzd;
                if (zzbcxVar == null) {
                    return;
                }
                if (zzbcxVar.isConnected() || zzbcuVar.zzd.isConnecting()) {
                    zzbcuVar.zzd.disconnect();
                }
                zzbcuVar.zzd = null;
                zzbcuVar.zzf = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl() {
        synchronized (this.zzc) {
            try {
                if (this.zze != null && this.zzd == null) {
                    zzbcx zzd = zzd(new zzbcs(this), new zzbct(this));
                    this.zzd = zzd;
                    zzd.checkAvailabilityAndConnect();
                }
            } finally {
            }
        }
    }

    public final long zza(zzbcy zzbcyVar) {
        synchronized (this.zzc) {
            try {
                if (this.zzf == null) {
                    return -2L;
                }
                if (this.zzd.zzp()) {
                    try {
                        return this.zzf.zze(zzbcyVar);
                    } catch (RemoteException e4) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to call into cache service.", e4);
                    }
                }
                return -2L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzbcv zzb(zzbcy zzbcyVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new zzbcv();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzg(zzbcyVar);
                }
                return this.zzf.zzf(zzbcyVar);
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to call into cache service.", e4);
                return new zzbcv();
            }
        }
    }

    public final synchronized zzbcx zzd(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzbcx(this.zze, com.google.android.gms.ads.internal.zzu.zzt().zzb(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    public final void zzi(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            try {
                if (this.zze != null) {
                    return;
                }
                this.zze = context.getApplicationContext();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzek)).booleanValue()) {
                    zzl();
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzej)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzu.zzb().zzc(new zzbcr(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzj() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzel)).booleanValue()) {
            synchronized (this.zzc) {
                try {
                    zzl();
                    ScheduledFuture scheduledFuture = this.zza;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.zza = zzcci.zzd.schedule(this.zzb, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzem)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
