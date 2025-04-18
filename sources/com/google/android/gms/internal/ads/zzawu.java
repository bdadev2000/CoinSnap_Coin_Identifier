package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzawu extends zzaxt {
    public zzawu(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i10, int i11) {
        super(zzawfVar, "GvR+eAwGnG9v3CGqMDhazUVumHdJLt60TSBx5Df5j9bg+ZMppmesgixP833S80RN", "cPmD560wQtvtgfdpMZNJUfXZwJNhRKcjeHNf5LBrqDo=", zzasfVar, i10, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzm(-1L);
        this.zzd.zzl(-1L);
        int[] iArr = (int[]) this.zze.invoke(null, this.zza.zzb());
        synchronized (this.zzd) {
            this.zzd.zzm(iArr[0]);
            this.zzd.zzl(iArr[1]);
            int i10 = iArr[2];
            if (i10 != Integer.MIN_VALUE) {
                this.zzd.zzk(i10);
            }
        }
    }
}
