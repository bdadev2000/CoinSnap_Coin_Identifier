package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public abstract class zzdyh implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzcao zza = new zzcao();
    protected final Object zzb = new Object();
    protected boolean zzc = false;
    protected boolean zzd = false;
    protected zzbvx zze;
    protected zzbur zzf;

    public static void zzc(Context context, ua.b bVar, Executor executor) {
        if (!((Boolean) zzbef.zzj.zze()).booleanValue() && !((Boolean) zzbef.zzh.zze()).booleanValue()) {
            return;
        }
        zzgei.zzr(bVar, new zzdye(context), executor);
    }

    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        com.google.android.gms.ads.internal.util.client.zzm.zze("Disconnected from remote ad request service.");
        this.zza.zzd(new zzdyw(1));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        com.google.android.gms.ads.internal.util.client.zzm.zze("Cannot connect to remote service, fallback to local instance.");
    }

    public final void zzb() {
        synchronized (this.zzb) {
            this.zzd = true;
            if (this.zzf.isConnected() || this.zzf.isConnecting()) {
                this.zzf.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }
}
