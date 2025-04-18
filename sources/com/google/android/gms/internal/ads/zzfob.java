package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzfob {

    @SuppressLint({"StaticFieldLeak"})
    private static final zzfob zza = new zzfob();
    private WeakReference zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public static zzfob zza() {
        return zza;
    }

    public final void zzc() {
        Context context = (Context) this.zzb.get();
        if (context == null) {
            return;
        }
        boolean isDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        zzd(this.zzc, isDeviceLocked);
        this.zzd = isDeviceLocked;
    }

    public final void zzd(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        if (!z11 && !z10) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!this.zzd && !this.zzc) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z12 != z13) {
            Iterator it = zzfnr.zza().zzc().iterator();
            while (it.hasNext()) {
                zzfoh zzg = ((zzfna) it.next()).zzg();
                if (!z11 && !z10) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                zzg.zzm(z14);
            }
        }
    }

    public final void zze(Context context) {
        if (context == null) {
            return;
        }
        this.zzb = new WeakReference(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new zzfoa(this), intentFilter);
    }
}
