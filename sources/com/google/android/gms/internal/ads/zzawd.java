package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzawd implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzawf zzb;

    public zzawd(zzawf zzawfVar, int i10, boolean z10) {
        this.zza = i10;
        this.zzb = zzawfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzata zzataVar;
        int i10 = this.zza;
        zzawf zzawfVar = this.zzb;
        if (i10 > 0) {
            try {
                Thread.sleep(i10 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = zzawfVar.zza.getPackageManager().getPackageInfo(zzawfVar.zza.getPackageName(), 0);
            Context context = zzawfVar.zza;
            zzataVar = zzfpx.zza(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            zzataVar = null;
        }
        this.zzb.zzm = zzataVar;
        if (this.zza < 4) {
            if (zzataVar == null || !zzataVar.zzaj() || zzataVar.zzh().equals("0000000000000000000000000000000000000000000000000000000000000000") || !zzataVar.zzak() || !zzataVar.zzf().zzg() || zzataVar.zzf().zza() == -2) {
                this.zzb.zzo(this.zza + 1, true);
            }
        }
    }
}
