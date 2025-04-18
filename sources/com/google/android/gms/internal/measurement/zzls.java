package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzls implements zzla {
    private final zzlc zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzls(zzlc zzlcVar, String str, Object[] objArr) {
        this.zza = zzlcVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 >= 55296) {
                i10 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            } else {
                this.zzd = i10 | (charAt2 << i11);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzla
    public final zzlc zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzla
    public final zzln zzb() {
        int i10 = this.zzd;
        if ((i10 & 1) != 0) {
            return zzln.PROTO2;
        }
        if ((i10 & 4) == 4) {
            return zzln.EDITIONS;
        }
        return zzln.PROTO3;
    }

    @Override // com.google.android.gms.internal.measurement.zzla
    public final boolean zzc() {
        return (this.zzd & 2) == 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
