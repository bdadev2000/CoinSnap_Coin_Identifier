package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzga {
    private long[] zza;
    private Object[] zzb;
    private int zzc;
    private int zzd;

    public zzga() {
        throw null;
    }

    @Nullable
    private final Object zzf() {
        boolean z8;
        if (this.zzd > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzf(z8);
        Object[] objArr = this.zzb;
        int i9 = this.zzc;
        Object obj = objArr[i9];
        objArr[i9] = null;
        this.zzc = (i9 + 1) % objArr.length;
        this.zzd--;
        return obj;
    }

    public final synchronized int zza() {
        return this.zzd;
    }

    @Nullable
    public final synchronized Object zzb() {
        if (this.zzd == 0) {
            return null;
        }
        return zzf();
    }

    @Nullable
    public final synchronized Object zzc(long j7) {
        Object obj;
        obj = null;
        while (this.zzd > 0 && j7 - this.zza[this.zzc] >= 0) {
            obj = zzf();
        }
        return obj;
    }

    public final synchronized void zzd(long j7, Object obj) {
        try {
            if (this.zzd > 0) {
                if (j7 <= this.zza[((this.zzc + r0) - 1) % this.zzb.length]) {
                    zze();
                }
            }
            int length = this.zzb.length;
            if (this.zzd >= length) {
                int i9 = length + length;
                long[] jArr = new long[i9];
                Object[] objArr = new Object[i9];
                int i10 = this.zzc;
                int i11 = length - i10;
                System.arraycopy(this.zza, i10, jArr, 0, i11);
                System.arraycopy(this.zzb, this.zzc, objArr, 0, i11);
                int i12 = this.zzc;
                if (i12 > 0) {
                    System.arraycopy(this.zza, 0, jArr, i11, i12);
                    System.arraycopy(this.zzb, 0, objArr, i11, this.zzc);
                }
                this.zza = jArr;
                this.zzb = objArr;
                this.zzc = 0;
            }
            int i13 = this.zzc;
            int i14 = this.zzd;
            Object[] objArr2 = this.zzb;
            int length2 = (i13 + i14) % objArr2.length;
            this.zza[length2] = j7;
            objArr2[length2] = obj;
            this.zzd = i14 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zze() {
        this.zzc = 0;
        this.zzd = 0;
        Arrays.fill(this.zzb, (Object) null);
    }

    public zzga(int i9) {
        this.zza = new long[10];
        this.zzb = new Object[10];
    }
}
