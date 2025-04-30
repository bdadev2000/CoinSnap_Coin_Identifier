package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class zzfrn implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzfsp zza;
    private final String zzb;
    private final String zzc;
    private final zzazw zzd;
    private final LinkedBlockingQueue zze;
    private final HandlerThread zzf;
    private final zzfre zzg;
    private final long zzh;

    public zzfrn(Context context, int i9, zzazw zzazwVar, String str, String str2, String str3, zzfre zzfreVar) {
        this.zzb = str;
        this.zzd = zzazwVar;
        this.zzc = str2;
        this.zzg = zzfreVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zzf = handlerThread;
        handlerThread.start();
        this.zzh = System.currentTimeMillis();
        zzfsp zzfspVar = new zzfsp(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfspVar;
        this.zze = new LinkedBlockingQueue();
        zzfspVar.checkAvailabilityAndConnect();
    }

    public static zzftb zza() {
        return new zzftb(null, 1);
    }

    private final void zze(int i9, long j7, Exception exc) {
        this.zzg.zzc(i9, System.currentTimeMillis() - j7, exc);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfsu zzd = zzd();
        if (zzd != null) {
            try {
                zzftb zzf = zzd.zzf(new zzfsz(1, this.zzd, this.zzb, this.zzc));
                zze(5011, this.zzh, null);
                this.zze.put(zzf);
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
            zze(4012, this.zzh, null);
            this.zze.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i9) {
        try {
            zze(4011, this.zzh, null);
            this.zze.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzftb zzb(int i9) {
        zzftb zzftbVar;
        try {
            zzftbVar = (zzftb) this.zze.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e4) {
            zze(2009, this.zzh, e4);
            zzftbVar = null;
        }
        zze(3004, this.zzh, null);
        if (zzftbVar != null) {
            if (zzftbVar.zzc == 7) {
                zzfre.zzg(zzatc.DISABLED);
            } else {
                zzfre.zzg(zzatc.ENABLED);
            }
        }
        if (zzftbVar == null) {
            return zza();
        }
        return zzftbVar;
    }

    public final void zzc() {
        zzfsp zzfspVar = this.zza;
        if (zzfspVar != null) {
            if (zzfspVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    public final zzfsu zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
