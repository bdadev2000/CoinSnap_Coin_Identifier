package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class zzfn extends zzfo {
    public zzfn(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final double zza(Object obj, long j7) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j7));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final float zzb(Object obj, long j7) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j7));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzc(Object obj, long j7, boolean z8) {
        if (zzfp.zzb) {
            zzfp.zzD(obj, j7, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzfp.zzE(obj, j7, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzd(Object obj, long j7, byte b) {
        if (zzfp.zzb) {
            zzfp.zzD(obj, j7, b);
        } else {
            zzfp.zzE(obj, j7, b);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zze(Object obj, long j7, double d2) {
        this.zza.putLong(obj, j7, Double.doubleToLongBits(d2));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzf(Object obj, long j7, float f9) {
        this.zza.putInt(obj, j7, Float.floatToIntBits(f9));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final boolean zzg(Object obj, long j7) {
        if (zzfp.zzb) {
            return zzfp.zzt(obj, j7);
        }
        return zzfp.zzu(obj, j7);
    }
}
