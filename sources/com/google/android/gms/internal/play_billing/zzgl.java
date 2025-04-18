package com.google.android.gms.internal.play_billing;

/* loaded from: classes3.dex */
final class zzgl implements zzfz {
    private final zzgc zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzgl(zzgc zzgcVar, String str, Object[] objArr) {
        this.zza = zzgcVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i2 = charAt & 8191;
        int i3 = 1;
        int i4 = 13;
        while (true) {
            int i5 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.zzd = i2 | (charAt2 << i4);
                return;
            } else {
                i2 |= (charAt2 & 8191) << i4;
                i4 += 13;
                i3 = i5;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfz
    public final zzgc zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfz
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfz
    public final int zzc() {
        int i2 = this.zzd;
        if ((i2 & 1) != 0) {
            return 1;
        }
        return (i2 & 4) == 4 ? 3 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
