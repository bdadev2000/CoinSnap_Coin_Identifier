package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* loaded from: classes4.dex */
final class zzhl extends zzhm {
    public zzhl(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhm
    public final double zza(Object obj, long j2) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j2));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhm
    public final float zzb(Object obj, long j2) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j2));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhm
    public final void zzc(Object obj, long j2, boolean z2) {
        if (zzhn.zzb) {
            zzhn.zzD(obj, j2, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzhn.zzE(obj, j2, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhm
    public final void zzd(Object obj, long j2, byte b2) {
        if (zzhn.zzb) {
            zzhn.zzD(obj, j2, b2);
        } else {
            zzhn.zzE(obj, j2, b2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhm
    public final void zze(Object obj, long j2, double d) {
        this.zza.putLong(obj, j2, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhm
    public final void zzf(Object obj, long j2, float f2) {
        this.zza.putInt(obj, j2, Float.floatToIntBits(f2));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhm
    public final boolean zzg(Object obj, long j2) {
        return zzhn.zzb ? zzhn.zzt(obj, j2) : zzhn.zzu(obj, j2);
    }
}
