package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzax implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ boolean zzd;

    public zzax(zzay zzayVar, Context context, String str, boolean z8, boolean z9) {
        this.zza = context;
        this.zzb = str;
        this.zzc = z8;
        this.zzd = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzu.zzp();
        AlertDialog.Builder zzK = zzt.zzK(this.zza);
        zzK.setMessage(this.zzb);
        if (this.zzc) {
            zzK.setTitle("Error");
        } else {
            zzK.setTitle("Info");
        }
        if (this.zzd) {
            zzK.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            zzK.setPositiveButton("Learn More", new zzaw(this));
            zzK.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        zzK.create().show();
    }
}
