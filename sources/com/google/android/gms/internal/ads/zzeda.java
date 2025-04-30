package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public abstract class zzeda implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzccn zza = new zzccn();
    protected boolean zzb = false;
    protected boolean zzc = false;
    protected zzbwu zzd;
    protected Context zze;
    protected Looper zzf;
    protected ScheduledExecutorService zzg;

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Locale locale = Locale.US;
        String str = "Remote ad service connection failed, cause: " + connectionResult.getErrorCode() + ".";
        com.google.android.gms.ads.internal.util.client.zzm.zze(str);
        this.zza.zzd(new zzebh(1, str));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public void onConnectionSuspended(int i9) {
        Locale locale = Locale.US;
        String str = "Remote ad service connection suspended, cause: " + i9 + ".";
        com.google.android.gms.ads.internal.util.client.zzm.zze(str);
        this.zza.zzd(new zzebh(1, str));
    }

    public final synchronized void zzb() {
        try {
            if (this.zzd == null) {
                this.zzd = new zzbwu(this.zze, this.zzf, this, this);
            }
            this.zzd.checkAvailabilityAndConnect();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc() {
        try {
            this.zzc = true;
            zzbwu zzbwuVar = this.zzd;
            if (zzbwuVar == null) {
                return;
            }
            if (!zzbwuVar.isConnected()) {
                if (this.zzd.isConnecting()) {
                }
                Binder.flushPendingCommands();
            }
            this.zzd.disconnect();
            Binder.flushPendingCommands();
        } catch (Throwable th) {
            throw th;
        }
    }
}
