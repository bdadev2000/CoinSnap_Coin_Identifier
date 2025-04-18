package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public abstract class zzeap implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzcao zza = new zzcao();
    protected boolean zzb = false;
    protected boolean zzc = false;
    protected zzbuu zzd;
    protected Context zze;
    protected Looper zzf;
    protected ScheduledExecutorService zzg;

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        String format = String.format(Locale.US, "Remote ad service connection failed, cause: %d.", Integer.valueOf(connectionResult.getErrorCode()));
        com.google.android.gms.ads.internal.util.client.zzm.zze(format);
        this.zza.zzd(new zzdyw(1, format));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public void onConnectionSuspended(int i10) {
        String format = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i10));
        com.google.android.gms.ads.internal.util.client.zzm.zze(format);
        this.zza.zzd(new zzdyw(1, format));
    }

    public final synchronized void zzb() {
        if (this.zzd == null) {
            this.zzd = new zzbuu(this.zze, this.zzf, this, this);
        }
        this.zzd.checkAvailabilityAndConnect();
    }

    public final synchronized void zzc() {
        this.zzc = true;
        zzbuu zzbuuVar = this.zzd;
        if (zzbuuVar == null) {
            return;
        }
        if (zzbuuVar.isConnected() || this.zzd.isConnecting()) {
            this.zzd.disconnect();
        }
        Binder.flushPendingCommands();
    }
}
