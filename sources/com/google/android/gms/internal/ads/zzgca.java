package com.google.android.gms.internal.ads;

import eb.j;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;
import kotlin.UByte;

/* loaded from: classes3.dex */
class zzgca extends zzgcb {
    private volatile zzgcb zza;
    final zzgbw zzb;
    final Character zzc;

    public zzgca(zzgbw zzgbwVar, Character ch2) {
        this.zzb = zzgbwVar;
        if (ch2 != null) {
            ch2.charValue();
            if (zzgbwVar.zze('=')) {
                throw new IllegalArgumentException(zzfxf.zzb("Padding character %s was already in alphabet", ch2));
            }
        }
        this.zzc = ch2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgca) {
            zzgca zzgcaVar = (zzgca) obj;
            if (this.zzb.equals(zzgcaVar.zzb) && Objects.equals(this.zzc, zzgcaVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch2 = this.zzc;
        return Objects.hashCode(ch2) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.zzc);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    public int zza(byte[] bArr, CharSequence charSequence) throws zzgbz {
        zzgbw zzgbwVar;
        CharSequence zzg = zzg(charSequence);
        if (this.zzb.zzd(zzg.length())) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < zzg.length()) {
                long j3 = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    zzgbwVar = this.zzb;
                    if (i12 >= zzgbwVar.zzc) {
                        break;
                    }
                    j3 <<= zzgbwVar.zzb;
                    if (i10 + i12 < zzg.length()) {
                        j3 |= this.zzb.zzb(zzg.charAt(i13 + i10));
                        i13++;
                    }
                    i12++;
                }
                int i14 = zzgbwVar.zzd;
                int i15 = i13 * zzgbwVar.zzb;
                int i16 = (i14 - 1) * 8;
                while (i16 >= (i14 * 8) - i15) {
                    bArr[i11] = (byte) ((j3 >>> i16) & 255);
                    i16 -= 8;
                    i11++;
                }
                i10 += this.zzb.zzc;
            }
            return i11;
        }
        throw new zzgbz(j.i("Invalid input length ", zzg.length()));
    }

    public zzgcb zzb(zzgbw zzgbwVar, Character ch2) {
        return new zzgca(zzgbwVar, ch2);
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    public void zzc(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        zzfwq.zzj(0, i11, bArr.length);
        while (i12 < i11) {
            zzh(appendable, bArr, i12, Math.min(this.zzb.zzd, i11 - i12));
            i12 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    public final int zzd(int i10) {
        return (int) (((this.zzb.zzb * i10) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    public final int zze(int i10) {
        zzgbw zzgbwVar = this.zzb;
        return zzgbwVar.zzc * zzgck.zzb(i10, zzgbwVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    public final zzgcb zzf() {
        zzgcb zzgcbVar = this.zza;
        if (zzgcbVar == null) {
            zzgbw zzgbwVar = this.zzb;
            zzgbw zzc = zzgbwVar.zzc();
            if (zzc == zzgbwVar) {
                zzgcbVar = this;
            } else {
                zzgcbVar = zzb(zzc, this.zzc);
            }
            this.zza = zzgcbVar;
        }
        return zzgcbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    public final CharSequence zzg(CharSequence charSequence) {
        charSequence.getClass();
        Character ch2 = this.zzc;
        if (ch2 == null) {
            return charSequence;
        }
        ch2.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final void zzh(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        boolean z10;
        zzfwq.zzj(i10, i10 + i11, bArr.length);
        int i12 = 0;
        if (i11 <= this.zzb.zzd) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzfwq.zze(z10);
        long j3 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            j3 = (j3 | (bArr[i10 + i13] & UByte.MAX_VALUE)) << 8;
        }
        int i14 = (i11 + 1) * 8;
        zzgbw zzgbwVar = this.zzb;
        while (i12 < i11 * 8) {
            long j10 = j3 >>> ((i14 - zzgbwVar.zzb) - i12);
            zzgbw zzgbwVar2 = this.zzb;
            appendable.append(zzgbwVar2.zza(((int) j10) & zzgbwVar2.zza));
            i12 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i12 < this.zzb.zzd * 8) {
                this.zzc.charValue();
                appendable.append('=');
                i12 += this.zzb.zzb;
            }
        }
    }

    public zzgca(String str, String str2, Character ch2) {
        this(new zzgbw(str, str2.toCharArray()), ch2);
    }
}
