package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class zzhbr extends zzhbt {
    public zzhbr(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final byte zza(long j3) {
        return Memory.peekByte((int) j3);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final double zzb(Object obj, long j3) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j3));
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final float zzc(Object obj, long j3) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j3));
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zzd(long j3, byte[] bArr, long j10, long j11) {
        Memory.peekByteArray((int) j3, bArr, (int) j10, (int) j11);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zze(Object obj, long j3, boolean z10) {
        if (zzhbu.zzb) {
            zzhbu.zzG(obj, j3, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzhbu.zzH(obj, j3, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zzf(Object obj, long j3, byte b3) {
        if (zzhbu.zzb) {
            zzhbu.zzG(obj, j3, b3);
        } else {
            zzhbu.zzH(obj, j3, b3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zzg(Object obj, long j3, double d10) {
        this.zza.putLong(obj, j3, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zzh(Object obj, long j3, float f10) {
        this.zza.putInt(obj, j3, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final boolean zzi(Object obj, long j3) {
        if (zzhbu.zzb) {
            return zzhbu.zzw(obj, j3);
        }
        return zzhbu.zzx(obj, j3);
    }
}
