package com.google.android.gms.internal.ads;

import Q7.n0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class zzgzy extends zzgzx {
    protected final byte[] zza;

    public zzgzy(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhac) || zzd() != ((zzhac) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (obj instanceof zzgzy) {
            zzgzy zzgzyVar = (zzgzy) obj;
            int zzr = zzr();
            int zzr2 = zzgzyVar.zzr();
            if (zzr != 0 && zzr2 != 0 && zzr != zzr2) {
                return false;
            }
            return zzg(zzgzyVar, 0, zzd());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public byte zza(int i9) {
        return this.zza[i9];
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public byte zzb(int i9) {
        return this.zza[i9];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public void zze(byte[] bArr, int i9, int i10, int i11) {
        System.arraycopy(this.zza, i9, bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgzx
    public final boolean zzg(zzhac zzhacVar, int i9, int i10) {
        if (i10 <= zzhacVar.zzd()) {
            int i11 = i9 + i10;
            if (i11 <= zzhacVar.zzd()) {
                if (zzhacVar instanceof zzgzy) {
                    zzgzy zzgzyVar = (zzgzy) zzhacVar;
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzgzyVar.zza;
                    int zzc = zzc() + i10;
                    int zzc2 = zzc();
                    int zzc3 = zzgzyVar.zzc() + i9;
                    while (zzc2 < zzc) {
                        if (bArr[zzc2] != bArr2[zzc3]) {
                            return false;
                        }
                        zzc2++;
                        zzc3++;
                    }
                    return true;
                }
                return zzhacVar.zzk(i9, i11).equals(zzk(0, i10));
            }
            int zzd = zzhacVar.zzd();
            StringBuilder o3 = n0.o(i9, i10, "Ran off end of other: ", ", ", ", ");
            o3.append(zzd);
            throw new IllegalArgumentException(o3.toString());
        }
        throw new IllegalArgumentException("Length too large: " + i10 + zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzi(int i9, int i10, int i11) {
        return zzhcb.zzb(i9, this.zza, zzc() + i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzj(int i9, int i10, int i11) {
        int zzc = zzc() + i10;
        return zzhff.zzf(i9, this.zza, zzc, i11 + zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final zzhac zzk(int i9, int i10) {
        int zzq = zzhac.zzq(i9, i10, zzd());
        if (zzq == 0) {
            return zzhac.zzb;
        }
        return new zzgzu(this.zza, zzc() + i9, zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final zzham zzl() {
        return zzham.zzJ(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final void zzo(zzgzq zzgzqVar) throws IOException {
        zzgzqVar.zza(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final boolean zzp() {
        int zzc = zzc();
        return zzhff.zzj(this.zza, zzc, zzd() + zzc);
    }
}
