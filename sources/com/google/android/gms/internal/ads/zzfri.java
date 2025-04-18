package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.AdError;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

@VisibleForTesting
/* loaded from: classes4.dex */
final class zzfri implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    @VisibleForTesting
    protected final zzfsg zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;
    private final zzfqz zzf;
    private final long zzg;
    private final int zzh;

    public zzfri(Context context, int i2, int i3, String str, String str2, String str3, zzfqz zzfqzVar) {
        this.zzb = str;
        this.zzh = i3;
        this.zzc = str2;
        this.zzf = zzfqzVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zze = handlerThread;
        handlerThread.start();
        this.zzg = System.currentTimeMillis();
        zzfsg zzfsgVar = new zzfsg(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfsgVar;
        this.zzd = new LinkedBlockingQueue();
        zzfsgVar.checkAvailabilityAndConnect();
    }

    private final void zzd(int i2, long j2, Exception exc) {
        this.zzf.zzc(i2, System.currentTimeMillis() - j2, exc);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfsl zzc = zzc();
        if (zzc != null) {
            try {
                zzfss zzf = zzc.zzf(new zzfsq(1, this.zzh, this.zzb, this.zzc));
                zzd(5011, this.zzg, null);
                this.zzd.put(zzf);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            zzd(4012, this.zzg, null);
            this.zzd.put(new zzfss(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
        try {
            zzd(4011, this.zzg, null);
            this.zzd.put(new zzfss(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    public final zzfss zza(int i2) {
        zzfss zzfssVar;
        try {
            zzfssVar = (zzfss) this.zzd.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zzd(AdError.INTERSTITIAL_AD_TIMEOUT, this.zzg, e);
            zzfssVar = null;
        }
        zzd(3004, this.zzg, null);
        if (zzfssVar != null) {
            if (zzfssVar.zzc == 7) {
                zzfqz.zzg(3);
            } else {
                zzfqz.zzg(2);
            }
        }
        return zzfssVar == null ? new zzfss(null, 1) : zzfssVar;
    }

    public final void zzb() {
        zzfsg zzfsgVar = this.zza;
        if (zzfsgVar != null) {
            if (zzfsgVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    public final zzfsl zzc() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
