package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzaut implements Runnable {
    final /* synthetic */ zzauu zza;

    public zzaut(zzauu zzauuVar) {
        this.zza = zzauuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z10;
        zzfpp zzfppVar;
        Object obj2;
        obj = this.zza.zzo;
        synchronized (obj) {
            z10 = this.zza.zzp;
            if (!z10) {
                this.zza.zzp = true;
                try {
                    zzauu.zzj(this.zza);
                } catch (Exception e2) {
                    zzfppVar = this.zza.zzh;
                    zzfppVar.zzc(2023, -1L, e2);
                }
                obj2 = this.zza.zzo;
                synchronized (obj2) {
                    this.zza.zzp = false;
                }
            }
        }
    }
}
