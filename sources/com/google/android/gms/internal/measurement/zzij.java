package com.google.android.gms.internal.measurement;

import Q7.n0;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class zzij extends zzih {
    protected final byte[] zzb;

    public zzij(byte[] bArr) {
        super();
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzia) || zzb() != ((zzia) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (obj instanceof zzij) {
            zzij zzijVar = (zzij) obj;
            int zza = zza();
            int zza2 = zzijVar.zza();
            if (zza != 0 && zza2 != 0 && zza != zza2) {
                return false;
            }
            return zza(zzijVar, 0, zzb());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    public byte zza(int i9) {
        return this.zzb[i9];
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    public byte zzb(int i9) {
        return this.zzb[i9];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    public final zzia zza(int i9, int i10) {
        int zza = zzia.zza(0, i10, zzb());
        if (zza == 0) {
            return zzia.zza;
        }
        return new zzie(this.zzb, zzc(), zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    public final int zzb(int i9, int i10, int i11) {
        return zzjm.zza(i9, this.zzb, zzc(), i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    public final void zza(zzhx zzhxVar) throws IOException {
        zzhxVar.zza(this.zzb, zzc(), zzb());
    }

    @Override // com.google.android.gms.internal.measurement.zzih
    public final boolean zza(zzia zziaVar, int i9, int i10) {
        if (i10 <= zziaVar.zzb()) {
            if (i10 <= zziaVar.zzb()) {
                if (zziaVar instanceof zzij) {
                    zzij zzijVar = (zzij) zziaVar;
                    byte[] bArr = this.zzb;
                    byte[] bArr2 = zzijVar.zzb;
                    int zzc = zzc() + i10;
                    int zzc2 = zzc();
                    int zzc3 = zzijVar.zzc();
                    while (zzc2 < zzc) {
                        if (bArr[zzc2] != bArr2[zzc3]) {
                            return false;
                        }
                        zzc2++;
                        zzc3++;
                    }
                    return true;
                }
                return zziaVar.zza(0, i10).equals(zza(0, i10));
            }
            throw new IllegalArgumentException(n0.e(i10, zziaVar.zzb(), "Ran off end of other: 0, ", ", "));
        }
        throw new IllegalArgumentException("Length too large: " + i10 + zzb());
    }
}
