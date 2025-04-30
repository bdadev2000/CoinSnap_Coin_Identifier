package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzawv implements Runnable {
    final /* synthetic */ zzaww zza;

    public zzawv(zzaww zzawwVar) {
        this.zza = zzawwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z8;
        zzfre zzfreVar;
        Object obj2;
        obj = this.zza.zzp;
        synchronized (obj) {
            z8 = this.zza.zzq;
            if (!z8) {
                this.zza.zzq = true;
                try {
                    zzaww.zzj(this.zza);
                } catch (Exception e4) {
                    zzfreVar = this.zza.zzh;
                    zzfreVar.zzc(2023, -1L, e4);
                }
                obj2 = this.zza.zzp;
                synchronized (obj2) {
                    this.zza.zzq = false;
                }
            }
        }
    }
}
