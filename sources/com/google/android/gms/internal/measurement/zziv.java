package com.google.android.gms.internal.measurement;

import android.support.v4.media.d;
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
        if (!(obj instanceof zziv)) {
            return obj.equals(this);
        }
        zziv zzivVar = (zziv) obj;
        int zza = zza();
        int zza2 = zzivVar.zza();
        if (zza == 0 || zza2 == 0 || zza == zza2) {
            return zza(zzivVar, 0, zzb());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public byte zza(int i2) {
        return this.zzb[i2];
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public byte zzb(int i2) {
        return this.zzb[i2];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public final zzik zza(int i2, int i3) {
        int zza = zzik.zza(0, i3, zzb());
        return zza == 0 ? zzik.zza : new zzio(this.zzb, zzc(), zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public final int zzb(int i2, int i3, int i4) {
        return zzjv.zza(i2, this.zzb, zzc(), i4);
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
    public final boolean zza(zzik zzikVar, int i2, int i3) {
        if (i3 <= zzikVar.zzb()) {
            if (i3 <= zzikVar.zzb()) {
                if (zzikVar instanceof zziv) {
                    zziv zzivVar = (zziv) zzikVar;
                    byte[] bArr = this.zzb;
                    byte[] bArr2 = zzivVar.zzb;
                    int zzc = zzc() + i3;
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
                return zzikVar.zza(0, i3).equals(zza(0, i3));
            }
            throw new IllegalArgumentException(d.k("Ran off end of other: 0, ", i3, ", ", zzikVar.zzb()));
        }
        throw new IllegalArgumentException("Length too large: " + i3 + zzb());
    }
}
