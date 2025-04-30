package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfju implements zzgfp {
    final /* synthetic */ zzfjx zza;
    final /* synthetic */ zzfjy zzb;

    public zzfju(zzfjy zzfjyVar, zzfjx zzfjxVar) {
        this.zza = zzfjxVar;
        this.zzb = zzfjyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayDeque arrayDeque;
        int i9;
        synchronized (this.zzb) {
            try {
                this.zzb.zze = null;
                arrayDeque = this.zzb.zzd;
                arrayDeque.addFirst(this.zza);
                zzfjy zzfjyVar = this.zzb;
                i9 = zzfjyVar.zzf;
                if (i9 == 1) {
                    zzfjyVar.zzh();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
