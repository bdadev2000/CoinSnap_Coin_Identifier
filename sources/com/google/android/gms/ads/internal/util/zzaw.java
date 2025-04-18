package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzaw implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ boolean zzd;

    public zzaw(zzax zzaxVar, Context context, String str, boolean z10, boolean z11) {
        this.zza = context;
        this.zzb = str;
        this.zzc = z10;
        this.zzd = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzv.zzq();
        AlertDialog.Builder zzK = zzs.zzK(this.zza);
        zzK.setMessage(this.zzb);
        if (this.zzc) {
            zzK.setTitle("Error");
        } else {
            zzK.setTitle("Info");
        }
        if (this.zzd) {
            zzK.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            zzK.setPositiveButton("Learn More", new zzav(this));
            zzK.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        zzK.create().show();
    }
}
