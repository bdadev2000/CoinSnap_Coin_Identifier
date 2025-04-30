package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzayc implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzaye zzb;

    public zzayc(zzaye zzayeVar, int i9, boolean z8) {
        this.zza = i9;
        this.zzb = zzayeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaus zzausVar;
        int i9 = this.zza;
        zzaye zzayeVar = this.zzb;
        if (i9 > 0) {
            try {
                Thread.sleep(i9 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = zzayeVar.zza.getPackageManager().getPackageInfo(zzayeVar.zza.getPackageName(), 0);
            Context context = zzayeVar.zza;
            zzausVar = zzfrm.zza(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            zzausVar = null;
        }
        this.zzb.zzm = zzausVar;
        if (this.zza < 4) {
            if (zzausVar == null || !zzausVar.zzar() || zzausVar.zzi().equals("0000000000000000000000000000000000000000000000000000000000000000") || !zzausVar.zzas() || !zzausVar.zzg().zze() || zzausVar.zzg().zza() == -2) {
                this.zzb.zzo(this.zza + 1, true);
            }
        }
    }
}
