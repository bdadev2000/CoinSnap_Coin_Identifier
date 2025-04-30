package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzve implements zzhb {
    private final zzhb zza;
    private final int zzb;
    private final zzvd zzc;
    private final byte[] zzd;
    private int zze;

    public zzve(zzhb zzhbVar, int i9, zzvd zzvdVar) {
        boolean z8;
        if (i9 > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzd(z8);
        this.zza = zzhbVar;
        this.zzb = i9;
        this.zzc = zzvdVar;
        this.zzd = new byte[1];
        this.zze = i9;
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i9, int i10) throws IOException {
        int i11 = this.zze;
        if (i11 == 0) {
            int i12 = 0;
            if (this.zza.zza(this.zzd, 0, 1) != -1) {
                int i13 = (this.zzd[0] & 255) << 4;
                if (i13 != 0) {
                    byte[] bArr2 = new byte[i13];
                    int i14 = i13;
                    while (i14 > 0) {
                        int zza = this.zza.zza(bArr2, i12, i14);
                        if (zza != -1) {
                            i12 += zza;
                            i14 -= zza;
                        }
                    }
                    while (i13 > 0) {
                        int i15 = i13 - 1;
                        if (bArr2[i15] != 0) {
                            break;
                        }
                        i13 = i15;
                    }
                    if (i13 > 0) {
                        this.zzc.zza(new zzfu(bArr2, i13));
                    }
                }
                i11 = this.zzb;
                this.zze = i11;
            }
            return -1;
        }
        int zza2 = this.zza.zza(bArr, i9, Math.min(i11, i10));
        if (zza2 != -1) {
            this.zze -= zza2;
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhh zzhhVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Map zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzf(zzie zzieVar) {
        zzieVar.getClass();
        this.zza.zzf(zzieVar);
    }
}
