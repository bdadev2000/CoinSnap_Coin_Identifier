package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class zzfpw implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzfqw zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;

    public zzfpw(Context context, String str, String str2) {
        this.zzb = str;
        this.zzc = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zze = handlerThread;
        handlerThread.start();
        zzfqw zzfqwVar = new zzfqw(context, handlerThread.getLooper(), this, this, 9200000);
        this.zza = zzfqwVar;
        this.zzd = new LinkedBlockingQueue();
        zzfqwVar.checkAvailabilityAndConnect();
    }

    public static zzata zza() {
        zzasf zza = zzata.zza();
        zza.zzD(32768L);
        return (zzata) zza.zzbr();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfrb zzd = zzd();
        if (zzd != null) {
            try {
                try {
                    this.zzd.put(zzd.zze(new zzfqx(this.zzb, this.zzc)).zza());
                } catch (InterruptedException unused) {
                } catch (Throwable th2) {
                    zzc();
                    this.zze.quit();
                    throw th2;
                }
            } catch (Throwable unused2) {
                this.zzd.put(zza());
            }
            zzc();
            this.zze.quit();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        try {
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzata zzb(int i10) {
        zzata zzataVar;
        try {
            zzataVar = (zzata) this.zzd.poll(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzataVar = null;
        }
        if (zzataVar == null) {
            return zza();
        }
        return zzataVar;
    }

    public final void zzc() {
        zzfqw zzfqwVar = this.zza;
        if (zzfqwVar != null) {
            if (zzfqwVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    public final zzfrb zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
