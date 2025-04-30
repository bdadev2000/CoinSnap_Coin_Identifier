package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzlj implements zzkr {
    private final zzkt zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzlj(zzkt zzktVar, String str, Object[] objArr) {
        this.zza = zzktVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i9 = charAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 >= 55296) {
                i9 |= (charAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            } else {
                this.zzd = i9 | (charAt2 << i10);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzkr
    public final zzkt zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzkr
    public final zzle zzb() {
        int i9 = this.zzd;
        if ((i9 & 1) != 0) {
            return zzle.PROTO2;
        }
        if ((i9 & 4) == 4) {
            return zzle.EDITIONS;
        }
        return zzle.PROTO3;
    }

    @Override // com.google.android.gms.internal.measurement.zzkr
    public final boolean zzc() {
        if ((this.zzd & 2) == 2) {
            return true;
        }
        return false;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
