package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaym implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzayn zza;

    public zzaym(zzayn zzaynVar) {
        this.zza = zzaynVar;
    }

    public final void onOpActiveChanged(String str, int i9, String str2, boolean z8) {
        long j7;
        long j9;
        long j10;
        if (z8) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        zzayn zzaynVar = this.zza;
        long currentTimeMillis = System.currentTimeMillis();
        j7 = zzaynVar.zzc;
        if (j7 > 0) {
            zzayn zzaynVar2 = this.zza;
            j9 = zzaynVar2.zzc;
            if (currentTimeMillis >= j9) {
                j10 = zzaynVar2.zzc;
                zzaynVar2.zzd = currentTimeMillis - j10;
            }
        }
        this.zza.zze = false;
    }
}
