package com.google.android.gms.internal.ads;

import a4.j;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzgxm extends zzgxl {
    protected final byte[] zza;

    public zzgxm(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgxp) || zzd() != ((zzgxp) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (obj instanceof zzgxm) {
            zzgxm zzgxmVar = (zzgxm) obj;
            int zzr = zzr();
            int zzr2 = zzgxmVar.zzr();
            if (zzr != 0 && zzr2 != 0 && zzr != zzr2) {
                return false;
            }
            return zzg(zzgxmVar, 0, zzd());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public byte zza(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final boolean zzg(zzgxp zzgxpVar, int i10, int i11) {
        if (i11 <= zzgxpVar.zzd()) {
            int i12 = i10 + i11;
            if (i12 <= zzgxpVar.zzd()) {
                if (zzgxpVar instanceof zzgxm) {
                    zzgxm zzgxmVar = (zzgxm) zzgxpVar;
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzgxmVar.zza;
                    int zzc = zzc() + i11;
                    int zzc2 = zzc();
                    int zzc3 = zzgxmVar.zzc() + i10;
                    while (zzc2 < zzc) {
                        if (bArr[zzc2] != bArr2[zzc3]) {
                            return false;
                        }
                        zzc2++;
                        zzc3++;
                    }
                    return true;
                }
                return zzgxpVar.zzk(i10, i12).equals(zzk(0, i11));
            }
            int zzd = zzgxpVar.zzd();
            StringBuilder n10 = j.n("Ran off end of other: ", i10, ", ", i11, ", ");
            n10.append(zzd);
            throw new IllegalArgumentException(n10.toString());
        }
        throw new IllegalArgumentException("Length too large: " + i11 + zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final int zzi(int i10, int i11, int i12) {
        return zzgzk.zzb(i10, this.zza, zzc() + i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final int zzj(int i10, int i11, int i12) {
        int zzc = zzc() + i11;
        return zzhbz.zzf(i10, this.zza, zzc, i12 + zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final zzgxp zzk(int i10, int i11) {
        int zzq = zzgxp.zzq(i10, i11, zzd());
        if (zzq == 0) {
            return zzgxp.zzb;
        }
        return new zzgxj(this.zza, zzc() + i10, zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final zzgxv zzl() {
        return zzgxv.zzH(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final void zzo(zzgxg zzgxgVar) throws IOException {
        zzgxgVar.zza(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final boolean zzp() {
        int zzc = zzc();
        return zzhbz.zzi(this.zza, zzc, zzd() + zzc);
    }
}
