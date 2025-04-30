package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.applovin.sdk.AppLovinEventTypes;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzesn implements zzexw {
    private final zzgge zza;
    private final Context zzb;

    public zzesn(zzgge zzggeVar, Context context) {
        this.zza = zzggeVar;
        this.zzb = context;
    }

    @SuppressLint({"UnprotectedReceiver"})
    private final Intent zzd() {
        Intent registerReceiver;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkW)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            registerReceiver = this.zzb.registerReceiver(null, intentFilter, 4);
            return registerReceiver;
        }
        return this.zzb.registerReceiver(null, intentFilter);
    }

    private static final boolean zze(Intent intent) {
        if (intent == null) {
            return false;
        }
        int intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        if (intExtra != 2 && intExtra != 5) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    @SuppressLint({"UnprotectedReceiver"})
    public final f4.c zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzesn.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeso zzc() throws Exception {
        boolean z8;
        double d2 = -1.0d;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlX)).booleanValue()) {
            BatteryManager batteryManager = (BatteryManager) this.zzb.getSystemService("batterymanager");
            if (batteryManager != null) {
                d2 = batteryManager.getIntProperty(4) / 100.0d;
            }
            if (batteryManager != null) {
                z8 = batteryManager.isCharging();
            } else {
                z8 = zze(zzd());
            }
        } else {
            Intent zzd = zzd();
            boolean zze = zze(zzd);
            if (zzd != null) {
                d2 = zzd.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) / zzd.getIntExtra("scale", -1);
            }
            z8 = zze;
        }
        return new zzeso(d2, z8);
    }
}
