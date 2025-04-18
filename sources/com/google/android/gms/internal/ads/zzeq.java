package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzeq {
    private long[] zza;
    private Object[] zzb;
    private int zzc;
    private int zzd;

    public zzeq() {
        throw null;
    }

    @Nullable
    private final Object zzf() {
        zzdi.zzf(this.zzd > 0);
        Object[] objArr = this.zzb;
        int i2 = this.zzc;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.zzc = (i2 + 1) % objArr.length;
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
    public final synchronized Object zzc(long j2) {
        Object obj;
        obj = null;
        while (this.zzd > 0 && j2 - this.zza[this.zzc] >= 0) {
            obj = zzf();
        }
        return obj;
    }

    public final synchronized void zzd(long j2, Object obj) {
        try {
            if (this.zzd > 0) {
                if (j2 <= this.zza[((this.zzc + r0) - 1) % this.zzb.length]) {
                    zze();
                }
            }
            int length = this.zzb.length;
            if (this.zzd >= length) {
                int i2 = length + length;
                long[] jArr = new long[i2];
                Object[] objArr = new Object[i2];
                int i3 = this.zzc;
                int i4 = length - i3;
                System.arraycopy(this.zza, i3, jArr, 0, i4);
                System.arraycopy(this.zzb, this.zzc, objArr, 0, i4);
                int i5 = this.zzc;
                if (i5 > 0) {
                    System.arraycopy(this.zza, 0, jArr, i4, i5);
                    System.arraycopy(this.zzb, 0, objArr, i4, this.zzc);
                }
                this.zza = jArr;
                this.zzb = objArr;
                this.zzc = 0;
            }
            int i6 = this.zzc;
            int i7 = this.zzd;
            Object[] objArr2 = this.zzb;
            int length2 = (i6 + i7) % objArr2.length;
            this.zza[length2] = j2;
            objArr2[length2] = obj;
            this.zzd = i7 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zze() {
        this.zzc = 0;
        this.zzd = 0;
        Arrays.fill(this.zzb, (Object) null);
    }

    public zzeq(int i2) {
        this.zza = new long[10];
        this.zzb = new Object[10];
    }
}
