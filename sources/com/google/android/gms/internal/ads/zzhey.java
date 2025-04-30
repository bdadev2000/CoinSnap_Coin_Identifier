package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class zzhey extends zzhez {
    public zzhey(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzhez
    public final byte zza(long j7) {
        return Memory.peekByte(j7);
    }

    @Override // com.google.android.gms.internal.ads.zzhez
    public final double zzb(Object obj, long j7) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j7));
    }

    @Override // com.google.android.gms.internal.ads.zzhez
    public final float zzc(Object obj, long j7) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j7));
    }

    @Override // com.google.android.gms.internal.ads.zzhez
    public final void zzd(long j7, byte[] bArr, long j9, long j10) {
        Memory.peekByteArray(j7, bArr, (int) j9, (int) j10);
    }

    @Override // com.google.android.gms.internal.ads.zzhez
    public final void zze(Object obj, long j7, boolean z8) {
        if (zzhfa.zzb) {
            zzhfa.zzG(obj, j7, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzhfa.zzH(obj, j7, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhez
    public final void zzf(Object obj, long j7, byte b) {
        if (zzhfa.zzb) {
            zzhfa.zzG(obj, j7, b);
        } else {
            zzhfa.zzH(obj, j7, b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhez
    public final void zzg(Object obj, long j7, double d2) {
        this.zza.putLong(obj, j7, Double.doubleToLongBits(d2));
    }

    @Override // com.google.android.gms.internal.ads.zzhez
    public final void zzh(Object obj, long j7, float f9) {
        this.zza.putInt(obj, j7, Float.floatToIntBits(f9));
    }

    @Override // com.google.android.gms.internal.ads.zzhez
    public final boolean zzi(Object obj, long j7) {
        if (zzhfa.zzb) {
            return zzhfa.zzw(obj, j7);
        }
        return zzhfa.zzx(obj, j7);
    }
}
