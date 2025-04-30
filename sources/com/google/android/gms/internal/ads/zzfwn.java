package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes2.dex */
final class zzfwn {
    private static final zzfwv zzb = new zzfwv("OverlayDisplayService");
    private static final Intent zzc = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    @Nullable
    final zzfxg zza;
    private final String zzd;

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.internal.ads.zzfwi] */
    public zzfwn(Context context) {
        if (zzfxj.zza(context)) {
            this.zza = new zzfxg(context.getApplicationContext(), zzb, "OverlayDisplayService", zzc, new Object() { // from class: com.google.android.gms.internal.ads.zzfwi
            }, null);
        } else {
            this.zza = null;
        }
        this.zzd = context.getPackageName();
    }

    public final void zzc() {
        if (this.zza == null) {
            return;
        }
        zzb.zzc("unbind LMD display overlay service", new Object[0]);
        this.zza.zzu();
    }

    public final void zzd(zzfwe zzfweVar, zzfws zzfwsVar) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zza.zzs(new zzfwk(this, taskCompletionSource, zzfweVar, zzfwsVar, taskCompletionSource), taskCompletionSource);
        }
    }

    public final void zze(zzfwp zzfwpVar, zzfws zzfwsVar) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
            return;
        }
        if (zzfwpVar.zzh() == null) {
            zzb.zza("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
            zzfwq zzc2 = zzfwr.zzc();
            zzc2.zzb(8160);
            zzfwsVar.zza(zzc2.zzc());
            return;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zza.zzs(new zzfwj(this, taskCompletionSource, zzfwpVar, zzfwsVar, taskCompletionSource), taskCompletionSource);
    }

    public final void zzf(zzfwu zzfwuVar, zzfws zzfwsVar, int i9) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zza.zzs(new zzfwl(this, taskCompletionSource, zzfwuVar, i9, zzfwsVar, taskCompletionSource), taskCompletionSource);
        }
    }
}
