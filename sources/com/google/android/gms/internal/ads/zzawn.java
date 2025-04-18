package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzawn implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzawo zza;

    public zzawn(zzawo zzawoVar) {
        this.zza = zzawoVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i10, String str2, boolean z10) {
        long j3;
        long j10;
        long j11;
        if (z10) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        zzawo zzawoVar = this.zza;
        long currentTimeMillis = System.currentTimeMillis();
        j3 = zzawoVar.zzc;
        if (j3 > 0) {
            zzawo zzawoVar2 = this.zza;
            j10 = zzawoVar2.zzc;
            if (currentTimeMillis >= j10) {
                j11 = zzawoVar2.zzc;
                zzawoVar2.zzd = currentTimeMillis - j11;
            }
        }
        this.zza.zze = false;
    }
}
