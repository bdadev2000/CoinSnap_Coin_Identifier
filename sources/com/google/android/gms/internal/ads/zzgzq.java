package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzgzq extends zzgzp {
    protected final byte[] zza;

    public zzgzq(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgzs) || zzd() != ((zzgzs) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzgzq)) {
            return obj.equals(this);
        }
        zzgzq zzgzqVar = (zzgzq) obj;
        int zzr = zzr();
        int zzr2 = zzgzqVar.zzr();
        if (zzr == 0 || zzr2 == 0 || zzr == zzr2) {
            return zzg(zzgzqVar, 0, zzd());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public byte zza(int i2) {
        return this.zza[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public byte zzb(int i2) {
        return this.zza[i2];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public void zze(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.zza, i2, bArr, i3, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final boolean zzg(zzgzs zzgzsVar, int i2, int i3) {
        if (i3 > zzgzsVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + i3 + zzd());
        }
        int i4 = i2 + i3;
        if (i4 > zzgzsVar.zzd()) {
            int zzd = zzgzsVar.zzd();
            StringBuilder u2 = d.u("Ran off end of other: ", i2, ", ", i3, ", ");
            u2.append(zzd);
            throw new IllegalArgumentException(u2.toString());
        }
        if (!(zzgzsVar instanceof zzgzq)) {
            return zzgzsVar.zzk(i2, i4).equals(zzk(0, i3));
        }
        zzgzq zzgzqVar = (zzgzq) zzgzsVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzgzqVar.zza;
        int zzc = zzc() + i3;
        int zzc2 = zzc();
        int zzc3 = zzgzqVar.zzc() + i2;
        while (zzc2 < zzc) {
            if (bArr[zzc2] != bArr2[zzc3]) {
                return false;
            }
            zzc2++;
            zzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final int zzi(int i2, int i3, int i4) {
        return zzhbr.zzb(i2, this.zza, zzc() + i3, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final int zzj(int i2, int i3, int i4) {
        int zzc = zzc() + i3;
        return zzhek.zzf(i2, this.zza, zzc, i4 + zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final zzgzs zzk(int i2, int i3) {
        int zzq = zzgzs.zzq(i2, i3, zzd());
        return zzq == 0 ? zzgzs.zzb : new zzgzm(this.zza, zzc() + i2, zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final zzhac zzl() {
        return zzhac.zzH(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final void zzo(zzgzj zzgzjVar) throws IOException {
        zzgzjVar.zza(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgzs
    public final boolean zzp() {
        int zzc = zzc();
        return zzhek.zzi(this.zza, zzc, zzd() + zzc);
    }
}
