package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhdq implements zzhdb {
    private final zzhde zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzhdq(zzhde zzhdeVar, String str, Object[] objArr) {
        this.zza = zzhdeVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i9 = charAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 >= 55296) {
                i9 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            } else {
                this.zzd = i9 | (charAt2 << i11);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdb
    public final zzhde zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdb
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.ads.zzhdb
    public final int zzc() {
        int i9 = this.zzd;
        if ((i9 & 1) != 0) {
            return 1;
        }
        return (i9 & 4) == 4 ? 3 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
