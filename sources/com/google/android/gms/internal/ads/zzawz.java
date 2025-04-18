package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzawz extends zzaxt {
    private final zzawg zzh;

    public zzawz(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i10, int i11, zzawg zzawgVar) {
        super(zzawfVar, "F3b/A5v6wf4vIgkFPpHbBE4QF+7kAwNXBYNdW+58EM84yoPYR42ji8mEXh7tsTu8", "0hPI01hyl9gRqyFiGkD5f6txe9kPcrO1Amh2RTTvv44=", zzasfVar, i10, 85);
        this.zzh = zzawgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = (long[]) this.zze.invoke(null, Long.valueOf(this.zzh.zzd()), Long.valueOf(this.zzh.zzh()), Long.valueOf(this.zzh.zzb()), Long.valueOf(this.zzh.zzf()));
        synchronized (this.zzd) {
            this.zzd.zzv(jArr[0]);
            this.zzd.zzu(jArr[1]);
        }
    }
}
