package com.google.android.gms.internal.measurement;

import a4.j;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zziv extends zzis {
    protected final byte[] zzb;

    public zziv(byte[] bArr) {
        super();
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzik) || zzb() != ((zzik) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (obj instanceof zziv) {
            zziv zzivVar = (zziv) obj;
            int zza = zza();
            int zza2 = zzivVar.zza();
            if (zza != 0 && zza2 != 0 && zza != zza2) {
                return false;
            }
            return zza(zzivVar, 0, zzb());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public byte zza(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public byte zzb(int i10) {
        return this.zzb[i10];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public final zzik zza(int i10, int i11) {
        int zza = zzik.zza(0, i11, zzb());
        if (zza == 0) {
            return zzik.zza;
        }
        return new zzio(this.zzb, zzc(), zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public final int zzb(int i10, int i11, int i12) {
        return zzjv.zza(i10, this.zzb, zzc(), i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public final void zza(zzil zzilVar) throws IOException {
        zzilVar.zza(this.zzb, zzc(), zzb());
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final boolean zza(zzik zzikVar, int i10, int i11) {
        if (i11 <= zzikVar.zzb()) {
            if (i11 <= zzikVar.zzb()) {
                if (zzikVar instanceof zziv) {
                    zziv zzivVar = (zziv) zzikVar;
                    byte[] bArr = this.zzb;
                    byte[] bArr2 = zzivVar.zzb;
                    int zzc = zzc() + i11;
                    int zzc2 = zzc();
                    int zzc3 = zzivVar.zzc();
                    while (zzc2 < zzc) {
                        if (bArr[zzc2] != bArr2[zzc3]) {
                            return false;
                        }
                        zzc2++;
                        zzc3++;
                    }
                    return true;
                }
                return zzikVar.zza(0, i11).equals(zza(0, i11));
            }
            throw new IllegalArgumentException(j.e("Ran off end of other: 0, ", i11, ", ", zzikVar.zzb()));
        }
        throw new IllegalArgumentException("Length too large: " + i11 + zzb());
    }
}
