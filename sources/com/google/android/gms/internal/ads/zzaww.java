package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzaww implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzawx zza;

    public zzaww(zzawx zzawxVar) {
        this.zza = zzawxVar;
    }

    public final void onOpActiveChanged(String str, int i2, String str2, boolean z2) {
        long j2;
        long j3;
        long j4;
        if (z2) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        zzawx zzawxVar = this.zza;
        long currentTimeMillis = System.currentTimeMillis();
        j2 = zzawxVar.zzc;
        if (j2 > 0) {
            zzawx zzawxVar2 = this.zza;
            j3 = zzawxVar2.zzc;
            if (currentTimeMillis >= j3) {
                j4 = zzawxVar2.zzc;
                zzawxVar2.zzd = currentTimeMillis - j4;
            }
        }
        this.zza.zze = false;
    }
}
