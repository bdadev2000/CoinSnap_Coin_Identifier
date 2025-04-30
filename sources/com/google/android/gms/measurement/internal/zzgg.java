package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class zzgg extends BroadcastReceiver {
    private final zznc zza;
    private boolean zzb;
    private boolean zzc;

    public zzgg(zznc zzncVar) {
        Preconditions.checkNotNull(zzncVar);
        this.zza = zzncVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.zza.zzs();
        String action = intent.getAction();
        this.zza.zzj().zzp().zza("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean zzu = this.zza.zzh().zzu();
            if (this.zzc != zzu) {
                this.zzc = zzu;
                this.zza.zzl().zzb(new zzgf(this, zzu));
                return;
            }
            return;
        }
        this.zza.zzj().zzu().zza("NetworkBroadcastReceiver received unknown action", action);
    }

    public final void zzb() {
        this.zza.zzs();
        this.zza.zzl().zzt();
        this.zza.zzl().zzt();
        if (!this.zzb) {
            return;
        }
        this.zza.zzj().zzp().zza("Unregistering connectivity change receiver");
        this.zzb = false;
        this.zzc = false;
        try {
            this.zza.zza().unregisterReceiver(this);
        } catch (IllegalArgumentException e4) {
            this.zza.zzj().zzg().zza("Failed to unregister the network broadcast receiver", e4);
        }
    }

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
