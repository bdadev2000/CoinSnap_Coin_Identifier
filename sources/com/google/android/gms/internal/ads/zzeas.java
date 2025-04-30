package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class zzeas implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzccn zza = new zzccn();
    protected final Object zzb = new Object();
    protected boolean zzc = false;
    protected boolean zzd = false;
    protected zzbxu zze;
    protected zzbwr zzf;

    public static void zzc(Context context, f4.c cVar, Executor executor) {
        if (!((Boolean) zzbgc.zzj.zze()).booleanValue() && !((Boolean) zzbgc.zzh.zze()).booleanValue()) {
            return;
        }
        zzgft.zzr(cVar, new zzeaq(context), executor);
    }

    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        com.google.android.gms.ads.internal.util.client.zzm.zze("Disconnected from remote ad request service.");
        this.zza.zzd(new zzebh(1));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i9) {
        com.google.android.gms.ads.internal.util.client.zzm.zze("Cannot connect to remote service, fallback to local instance.");
    }

    public final void zzb() {
        synchronized (this.zzb) {
            try {
                this.zzd = true;
                if (!this.zzf.isConnected()) {
                    if (this.zzf.isConnecting()) {
                    }
                    Binder.flushPendingCommands();
                }
                this.zzf.disconnect();
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
