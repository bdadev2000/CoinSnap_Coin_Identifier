package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzbat {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzbap(this);
    private final Object zzc = new Object();

    @Nullable
    private zzbaw zzd;

    @Nullable
    private Context zze;

    @Nullable
    private zzbaz zzf;

    public static /* bridge */ /* synthetic */ void zzh(zzbat zzbatVar) {
        synchronized (zzbatVar.zzc) {
            zzbaw zzbawVar = zzbatVar.zzd;
            if (zzbawVar == null) {
                return;
            }
            if (zzbawVar.isConnected() || zzbatVar.zzd.isConnecting()) {
                zzbatVar.zzd.disconnect();
            }
            zzbatVar.zzd = null;
            zzbatVar.zzf = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl() {
        synchronized (this.zzc) {
            if (this.zze != null && this.zzd == null) {
                zzbaw zzd = zzd(new zzbar(this), new zzbas(this));
                this.zzd = zzd;
                zzd.checkAvailabilityAndConnect();
            }
        }
    }

    public final long zza(zzbax zzbaxVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return -2L;
            }
            if (this.zzd.zzp()) {
                try {
                    return this.zzf.zze(zzbaxVar);
                } catch (RemoteException e2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to call into cache service.", e2);
                }
            }
            return -2L;
        }
    }

    public final zzbau zzb(zzbax zzbaxVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new zzbau();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzg(zzbaxVar);
                }
                return this.zzf.zzf(zzbaxVar);
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to call into cache service.", e2);
                return new zzbau();
            }
        }
    }

    public final synchronized zzbaw zzd(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzbaw(this.zze, com.google.android.gms.ads.internal.zzv.zzu().zzb(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    public final void zzi(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            if (this.zze != null) {
                return;
            }
            this.zze = context.getApplicationContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzel)).booleanValue()) {
                zzl();
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzek)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.zzb().zzc(new zzbaq(this));
                }
            }
        }
    }

    public final void zzj() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzem)).booleanValue()) {
            synchronized (this.zzc) {
                zzl();
                ScheduledFuture scheduledFuture = this.zza;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.zza = zzcaj.zzd.schedule(this.zzb, ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzen)).longValue(), TimeUnit.MILLISECONDS);
            }
        }
    }
}
