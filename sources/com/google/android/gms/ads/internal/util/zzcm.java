package com.google.android.gms.ads.internal.util;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.internal.ads.zzbep;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class zzcm {
    private boolean zzd;
    private Context zze;
    private boolean zzc = false;
    private final Map zzb = new WeakHashMap();
    private final BroadcastReceiver zza = new zzcl(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zze(Context context, Intent intent) {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : this.zzb.entrySet()) {
                if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                    arrayList.add((BroadcastReceiver) entry.getKey());
                }
            }
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                ((BroadcastReceiver) arrayList.get(i9)).onReceive(context, intent);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final synchronized void zzb(Context context) {
        try {
            if (this.zzc) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.zze = applicationContext;
            if (applicationContext == null) {
                this.zze = context;
            }
            zzbep.zza(this.zze);
            this.zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdP)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkW)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
                this.zze.registerReceiver(this.zza, intentFilter, 4);
            } else {
                this.zze.registerReceiver(this.zza, intentFilter);
            }
            this.zzc = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final synchronized void zzc(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.zzd) {
            this.zzb.put(broadcastReceiver, intentFilter);
            return;
        }
        zzbep.zza(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkW)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public final synchronized void zzd(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.zzd) {
            this.zzb.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
