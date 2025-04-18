package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class zzfpy implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzfqw zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;
    private final zzfpp zzf;
    private final long zzg;
    private final int zzh;

    public zzfpy(Context context, int i10, int i11, String str, String str2, String str3, zzfpp zzfppVar) {
        this.zzb = str;
        this.zzh = i11;
        this.zzc = str2;
        this.zzf = zzfppVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zze = handlerThread;
        handlerThread.start();
        this.zzg = System.currentTimeMillis();
        zzfqw zzfqwVar = new zzfqw(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfqwVar;
        this.zzd = new LinkedBlockingQueue();
        zzfqwVar.checkAvailabilityAndConnect();
    }

    private final void zzd(int i10, long j3, Exception exc) {
        this.zzf.zzc(i10, System.currentTimeMillis() - j3, exc);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfrb zzc = zzc();
        if (zzc != null) {
            try {
                zzfri zzf = zzc.zzf(new zzfrg(1, this.zzh, this.zzb, this.zzc));
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
            this.zzd.put(new zzfri(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        try {
            zzd(4011, this.zzg, null);
            this.zzd.put(new zzfri(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    public final zzfri zza(int i10) {
        zzfri zzfriVar;
        try {
            zzfriVar = (zzfri) this.zzd.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            zzd(2009, this.zzg, e2);
            zzfriVar = null;
        }
        zzd(3004, this.zzg, null);
        if (zzfriVar != null) {
            if (zzfriVar.zzc == 7) {
                zzfpp.zzg(3);
            } else {
                zzfpp.zzg(2);
            }
        }
        if (zzfriVar == null) {
            return new zzfri(null, 1);
        }
        return zzfriVar;
    }

    public final void zzb() {
        zzfqw zzfqwVar = this.zza;
        if (zzfqwVar != null) {
            if (zzfqwVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    public final zzfrb zzc() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
