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

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfrl implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzfsp zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;

    public zzfrl(Context context, String str, String str2) {
        this.zzb = str;
        this.zzc = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zze = handlerThread;
        handlerThread.start();
        zzfsp zzfspVar = new zzfsp(context, handlerThread.getLooper(), this, this, 9200000);
        this.zza = zzfspVar;
        this.zzd = new LinkedBlockingQueue();
        zzfspVar.checkAvailabilityAndConnect();
    }

    public static zzaus zza() {
        zzatp zza = zzaus.zza();
        zza.zzJ(32768L);
        return (zzaus) zza.zzbr();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfsu zzd = zzd();
        if (zzd != null) {
            try {
                try {
                    this.zzd.put(zzd.zze(new zzfsq(this.zzb, this.zzc)).zza());
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    zzc();
                    this.zze.quit();
                    throw th;
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
    public final void onConnectionSuspended(int i9) {
        try {
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzaus zzb(int i9) {
        zzaus zzausVar;
        try {
            zzausVar = (zzaus) this.zzd.poll(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzausVar = null;
        }
        if (zzausVar == null) {
            return zza();
        }
        return zzausVar;
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
