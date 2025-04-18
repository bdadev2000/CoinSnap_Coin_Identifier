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

/* loaded from: classes3.dex */
public final class zzeqg implements zzevz {
    private final zzges zza;
    private final Context zzb;

    public zzeqg(zzges zzgesVar, Context context) {
        this.zza = zzgesVar;
        this.zzb = context;
    }

    @SuppressLint({"UnprotectedReceiver"})
    private final Intent zzd() {
        Intent registerReceiver;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkG)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
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

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    @SuppressLint({"UnprotectedReceiver"})
    public final ua.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqg.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeqh zzc() throws Exception {
        boolean z10;
        double d10 = -1.0d;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlJ)).booleanValue()) {
            BatteryManager batteryManager = (BatteryManager) this.zzb.getSystemService("batterymanager");
            if (batteryManager != null) {
                d10 = batteryManager.getIntProperty(4) / 100.0d;
            }
            if (batteryManager != null) {
                z10 = batteryManager.isCharging();
            } else {
                z10 = zze(zzd());
            }
        } else {
            Intent zzd = zzd();
            boolean zze = zze(zzd);
            if (zzd != null) {
                d10 = zzd.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) / zzd.getIntExtra("scale", -1);
            }
            z10 = zze;
        }
        return new zzeqh(d10, z10);
    }
}
