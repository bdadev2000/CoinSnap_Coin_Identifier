package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class zzhed extends zzhee {
    public zzhed(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzhee
    public final byte zza(long j2) {
        return Memory.peekByte(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzhee
    public final double zzb(Object obj, long j2) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j2));
    }

    @Override // com.google.android.gms.internal.ads.zzhee
    public final float zzc(Object obj, long j2) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j2));
    }

    @Override // com.google.android.gms.internal.ads.zzhee
    public final void zzd(long j2, byte[] bArr, long j3, long j4) {
        Memory.peekByteArray(j2, bArr, (int) j3, (int) j4);
    }

    @Override // com.google.android.gms.internal.ads.zzhee
    public final void zze(Object obj, long j2, boolean z2) {
        if (zzhef.zzb) {
            zzhef.zzG(obj, j2, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzhef.zzH(obj, j2, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhee
    public final void zzf(Object obj, long j2, byte b2) {
        if (zzhef.zzb) {
            zzhef.zzG(obj, j2, b2);
        } else {
            zzhef.zzH(obj, j2, b2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhee
    public final void zzg(Object obj, long j2, double d) {
        this.zza.putLong(obj, j2, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.zzhee
    public final void zzh(Object obj, long j2, float f2) {
        this.zza.putInt(obj, j2, Float.floatToIntBits(f2));
    }

    @Override // com.google.android.gms.internal.ads.zzhee
    public final boolean zzi(Object obj, long j2) {
        return zzhef.zzb ? zzhef.zzw(obj, j2) : zzhef.zzx(obj, j2);
    }
}
