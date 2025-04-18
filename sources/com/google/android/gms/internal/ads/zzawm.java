package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzawm implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzawo zzb;

    public zzawm(zzawo zzawoVar, int i2, boolean z2) {
        this.zza = i2;
        this.zzb = zzawoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzath zzathVar;
        int i2 = this.zza;
        zzawo zzawoVar = this.zzb;
        if (i2 > 0) {
            try {
                Thread.sleep(i2 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = zzawoVar.zza.getPackageManager().getPackageInfo(zzawoVar.zza.getPackageName(), 0);
            Context context = zzawoVar.zza;
            zzathVar = zzfrh.zza(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            zzathVar = null;
        }
        this.zzb.zzm = zzathVar;
        if (this.zza < 4) {
            if (zzathVar != null && zzathVar.zzaj() && !zzathVar.zzh().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzathVar.zzak() && zzathVar.zzf().zze() && zzathVar.zzf().zza() != -2) {
                return;
            }
            this.zzb.zzo(this.zza + 1, true);
        }
    }
}
