package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzuh implements zzgd {
    private final zzgd zza;
    private final int zzb;
    private final zzug zzc;
    private final byte[] zzd;
    private int zze;

    public zzuh(zzgd zzgdVar, int i10, zzug zzugVar) {
        zzdb.zzd(i10 > 0);
        this.zza = zzgdVar;
        this.zzb = i10;
        this.zzc = zzugVar;
        this.zzd = new byte[1];
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzn
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.zze;
        if (i12 == 0) {
            int i13 = 0;
            if (this.zza.zza(this.zzd, 0, 1) != -1) {
                int i14 = (this.zzd[0] & 255) << 4;
                if (i14 != 0) {
                    byte[] bArr2 = new byte[i14];
                    int i15 = i14;
                    while (i15 > 0) {
                        int zza = this.zza.zza(bArr2, i13, i15);
                        if (zza != -1) {
                            i13 += zza;
                            i15 -= zza;
                        }
                    }
                    while (i14 > 0) {
                        int i16 = i14 - 1;
                        if (bArr2[i16] != 0) {
                            break;
                        }
                        i14 = i16;
                    }
                    if (i14 > 0) {
                        this.zzc.zza(new zzed(bArr2, i14));
                    }
                }
                i12 = this.zzb;
                this.zze = i12;
            }
            return -1;
        }
        int zza2 = this.zza.zza(bArr, i10, Math.min(i12, i11));
        if (zza2 != -1) {
            this.zze -= zza2;
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final long zzb(zzgi zzgiVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    @Nullable
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final Map zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzf(zzhd zzhdVar) {
        zzhdVar.getClass();
        this.zza.zzf(zzhdVar);
    }
}
