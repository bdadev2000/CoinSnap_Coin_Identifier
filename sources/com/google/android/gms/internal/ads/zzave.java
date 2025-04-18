package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzave implements Runnable {
    final /* synthetic */ zzavf zza;

    public zzave(zzavf zzavfVar) {
        this.zza = zzavfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z2;
        zzfqz zzfqzVar;
        Object obj2;
        obj = this.zza.zzo;
        synchronized (obj) {
            z2 = this.zza.zzp;
            if (z2) {
                return;
            }
            this.zza.zzp = true;
            try {
                zzavf.zzj(this.zza);
            } catch (Exception e) {
                zzfqzVar = this.zza.zzh;
                zzfqzVar.zzc(2023, -1L, e);
            }
            obj2 = this.zza.zzo;
            synchronized (obj2) {
                this.zza.zzp = false;
            }
        }
    }
}
