package com.google.android.gms.internal.ads;

import eb.j;
import java.io.IOException;
import kotlin.UByte;

/* loaded from: classes3.dex */
final class zzgby extends zzgca {
    private zzgby(zzgbw zzgbwVar, Character ch2) {
        super(zzgbwVar, ch2);
        char[] cArr;
        cArr = zzgbwVar.zzf;
        zzfwq.zze(cArr.length == 64);
    }

    @Override // com.google.android.gms.internal.ads.zzgca, com.google.android.gms.internal.ads.zzgcb
    public final int zza(byte[] bArr, CharSequence charSequence) throws zzgbz {
        CharSequence zzg = zzg(charSequence);
        if (this.zzb.zzd(zzg.length())) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < zzg.length()) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                int zzb = (this.zzb.zzb(zzg.charAt(i10)) << 18) | (this.zzb.zzb(zzg.charAt(i12)) << 12);
                bArr[i11] = (byte) (zzb >>> 16);
                int i14 = i12 + 1;
                if (i14 < zzg.length()) {
                    int i15 = i14 + 1;
                    int zzb2 = zzb | (this.zzb.zzb(zzg.charAt(i14)) << 6);
                    i11 = i13 + 1;
                    bArr[i13] = (byte) ((zzb2 >>> 8) & 255);
                    if (i15 < zzg.length()) {
                        bArr[i11] = (byte) ((zzb2 | this.zzb.zzb(zzg.charAt(i15))) & 255);
                        i11++;
                        i10 = i15 + 1;
                    } else {
                        i10 = i15;
                    }
                } else {
                    i10 = i14;
                    i11 = i13;
                }
            }
            return i11;
        }
        throw new zzgbz(j.i("Invalid input length ", zzg.length()));
    }

    @Override // com.google.android.gms.internal.ads.zzgca
    public final zzgcb zzb(zzgbw zzgbwVar, Character ch2) {
        return new zzgby(zzgbwVar, ch2);
    }

    @Override // com.google.android.gms.internal.ads.zzgca, com.google.android.gms.internal.ads.zzgcb
    public final void zzc(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        zzfwq.zzj(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = i12 + 1;
            int i15 = bArr[i12] & UByte.MAX_VALUE;
            int i16 = bArr[i14] & UByte.MAX_VALUE;
            int i17 = i14 + 1;
            int i18 = (i15 << 16) | (i16 << 8) | (bArr[i17] & UByte.MAX_VALUE);
            appendable.append(this.zzb.zza(i18 >>> 18));
            appendable.append(this.zzb.zza((i18 >>> 12) & 63));
            appendable.append(this.zzb.zza((i18 >>> 6) & 63));
            appendable.append(this.zzb.zza(i18 & 63));
            i12 = i17 + 1;
        }
        if (i12 < i11) {
            zzh(appendable, bArr, i12, i11 - i12);
        }
    }

    public zzgby(String str, String str2, Character ch2) {
        this(new zzgbw(str, str2.toCharArray()), ch2);
    }
}
