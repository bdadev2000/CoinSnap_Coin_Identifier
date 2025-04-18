package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzgy extends BroadcastReceiver {
    private final zznv zza;
    private boolean zzb;
    private boolean zzc;

    public zzgy(zznv zznvVar) {
        Preconditions.checkNotNull(zznvVar);
        this.zza = zznvVar;
    }

    @Override // android.content.BroadcastReceiver
    @MainThread
    public void onReceive(Context context, Intent intent) {
        this.zza.zzs();
        String action = intent.getAction();
        this.zza.zzj().zzp().zza("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.zza.zzj().zzu().zza("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zzu = this.zza.zzh().zzu();
        if (this.zzc != zzu) {
            this.zzc = zzu;
            this.zza.zzl().zzb(new zzgx(this, zzu));
        }
    }

    @WorkerThread
    public final void zzb() {
        this.zza.zzs();
        this.zza.zzl().zzt();
        this.zza.zzl().zzt();
        if (this.zzb) {
            this.zza.zzj().zzp().zza("Unregistering connectivity change receiver");
            this.zzb = false;
            this.zzc = false;
            try {
                this.zza.zza().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.zza.zzj().zzg().zza("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @WorkerThread
    public final void zza() {
        this.zza.zzs();
        this.zza.zzl().zzt();
        if (this.zzb) {
            return;
        }
        this.zza.zza().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.zzc = this.zza.zzh().zzu();
        this.zza.zzj().zzp().zza("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.zzc));
        this.zzb = true;
    }
}
