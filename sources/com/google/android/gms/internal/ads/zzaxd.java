package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class zzaxd extends zzayc {
    public zzaxd(zzawo zzawoVar, String str, String str2, zzasm zzasmVar, int i2, int i3) {
        super(zzawoVar, "c/axzSlC5CKyeVvYpod083FD/YK+zLXfDqtD5AYe9EXr6xyYayRD+veafiAlev8F", "JFMtS6Z9bzmnMwoeWTxjTTnvJVVZDuewSTBrvx9CdBc=", zzasmVar, i2, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzm(-1L);
        this.zzd.zzl(-1L);
        int[] iArr = (int[]) this.zze.invoke(null, this.zza.zzb());
        synchronized (this.zzd) {
            try {
                this.zzd.zzm(iArr[0]);
                this.zzd.zzl(iArr[1]);
                int i2 = iArr[2];
                if (i2 != Integer.MIN_VALUE) {
                    this.zzd.zzk(i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
