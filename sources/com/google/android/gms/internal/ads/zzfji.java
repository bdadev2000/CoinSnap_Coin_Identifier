package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzfji implements zzgfk {
    final /* synthetic */ zzfjl zza;
    final /* synthetic */ zzfjm zzb;

    public zzfji(zzfjm zzfjmVar, zzfjl zzfjlVar) {
        this.zza = zzfjlVar;
        this.zzb = zzfjmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayDeque arrayDeque;
        int i2;
        synchronized (this.zzb) {
            try {
                this.zzb.zze = null;
                arrayDeque = this.zzb.zzd;
                arrayDeque.addFirst(this.zza);
                zzfjm zzfjmVar = this.zzb;
                i2 = zzfjmVar.zzf;
                if (i2 == 1) {
                    zzfjmVar.zzh();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
