package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class zzfn extends zzfo {
    public zzfn(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final double zza(Object obj, long j3) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j3));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final float zzb(Object obj, long j3) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j3));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzc(Object obj, long j3, boolean z10) {
        if (zzfp.zzb) {
            zzfp.zzD(obj, j3, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzfp.zzE(obj, j3, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzd(Object obj, long j3, byte b3) {
        if (zzfp.zzb) {
            zzfp.zzD(obj, j3, b3);
        } else {
            zzfp.zzE(obj, j3, b3);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zze(Object obj, long j3, double d10) {
        this.zza.putLong(obj, j3, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzf(Object obj, long j3, float f10) {
        this.zza.putInt(obj, j3, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final boolean zzg(Object obj, long j3) {
        if (zzfp.zzb) {
            return zzfp.zzt(obj, j3);
        }
        return zzfp.zzu(obj, j3);
    }
}
