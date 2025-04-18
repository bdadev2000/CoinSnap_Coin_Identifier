package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzama implements zzakv {
    private final zzek zza = new zzek();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzama(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.zzc = 0;
            this.zzd = -1;
            this.zze = "sans-serif";
            this.zzb = false;
            this.zzf = 0.85f;
            this.zzg = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.zzc = bArr[24];
        this.zzd = ((bArr[26] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[27] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[28] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[29] & UnsignedBytes.MAX_VALUE);
        this.zze = true == "Serif".equals(zzeu.zzB(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i2 = bArr[25] * 20;
        this.zzg = i2;
        boolean z2 = (bArr[0] & 32) != 0;
        this.zzb = z2;
        if (z2) {
            this.zzf = Math.max(0.0f, Math.min(((bArr[11] & UnsignedBytes.MAX_VALUE) | ((bArr[10] & UnsignedBytes.MAX_VALUE) << 8)) / i2, 0.95f));
        } else {
            this.zzf = 0.85f;
        }
    }

    private static void zzb(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
        if (i2 != i3) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i2 >>> 8) | ((i2 & 255) << 24)), i4, i5, i6 | 33);
        }
    }

    private static void zzc(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
        if (i2 != i3) {
            int i7 = i6 | 33;
            int i8 = i2 & 1;
            int i9 = i2 & 2;
            boolean z2 = true;
            if (i8 == 0) {
                if (i9 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i4, i5, i7);
                }
                z2 = false;
            } else if (i9 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(3), i4, i5, i7);
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(1), i4, i5, i7);
                z2 = false;
            }
            if ((i2 & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, i5, i7);
            } else {
                if (i8 != 0 || z2) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i4, i5, i7);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzakv
    public final void zza(byte[] bArr, int i2, int i3, zzaku zzakuVar, zzdn zzdnVar) {
        String zzB;
        int i4;
        int i5;
        int i6;
        this.zza.zzJ(bArr, i2 + i3);
        this.zza.zzL(i2);
        zzek zzekVar = this.zza;
        int i7 = 1;
        int i8 = 0;
        int i9 = 2;
        zzdi.zzd(zzekVar.zzb() >= 2);
        int zzq = zzekVar.zzq();
        if (zzq == 0) {
            zzB = "";
        } else {
            int zzd = zzekVar.zzd();
            Charset zzC = zzekVar.zzC();
            int zzd2 = zzekVar.zzd() - zzd;
            if (zzC == null) {
                zzC = zzfxo.zzc;
            }
            zzB = zzekVar.zzB(zzq - zzd2, zzC);
        }
        if (zzB.isEmpty()) {
            zzdnVar.zza(new zzakn(zzgax.zzn(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zzB);
        zzc(spannableStringBuilder, this.zzc, 0, 0, spannableStringBuilder.length(), 16711680);
        zzb(spannableStringBuilder, this.zzd, -1, 0, spannableStringBuilder.length(), 16711680);
        String str = this.zze;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f2 = this.zzf;
        while (true) {
            zzek zzekVar2 = this.zza;
            if (zzekVar2.zzb() < 8) {
                zzcz zzczVar = new zzcz();
                zzczVar.zzl(spannableStringBuilder);
                zzczVar.zze(f2, 0);
                zzczVar.zzf(0);
                zzdnVar.zza(new zzakn(zzgax.zzo(zzczVar.zzp()), -9223372036854775807L, -9223372036854775807L));
                return;
            }
            int zzd3 = zzekVar2.zzd();
            int zzg = zzekVar2.zzg();
            int zzg2 = this.zza.zzg();
            if (zzg2 == 1937013100) {
                zzdi.zzd(this.zza.zzb() >= i9 ? i7 : i8);
                int zzq2 = this.zza.zzq();
                int i10 = i8;
                while (i10 < zzq2) {
                    zzek zzekVar3 = this.zza;
                    zzdi.zzd(zzekVar3.zzb() >= 12 ? i7 : i8);
                    int zzq3 = zzekVar3.zzq();
                    int zzq4 = zzekVar3.zzq();
                    zzekVar3.zzM(i9);
                    int zzm = zzekVar3.zzm();
                    zzekVar3.zzM(i7);
                    int zzg3 = zzekVar3.zzg();
                    if (zzq4 > spannableStringBuilder.length()) {
                        i5 = zzq2;
                        zzea.zzf("Tx3gParser", d.l("Truncating styl end (", zzq4, ") to cueText.length() (", spannableStringBuilder.length(), ")."));
                        i6 = spannableStringBuilder.length();
                    } else {
                        i5 = zzq2;
                        i6 = zzq4;
                    }
                    if (zzq3 >= i6) {
                        zzea.zzf("Tx3gParser", d.l("Ignoring styl with start (", zzq3, ") >= end (", i6, ")."));
                    } else {
                        int i11 = i6;
                        zzc(spannableStringBuilder, zzm, this.zzc, zzq3, i11, 0);
                        zzb(spannableStringBuilder, zzg3, this.zzd, zzq3, i11, 0);
                    }
                    i10++;
                    zzq2 = i5;
                    i7 = 1;
                    i8 = 0;
                    i9 = 2;
                }
                i4 = i9;
            } else if (zzg2 == 1952608120 && this.zzb) {
                i4 = 2;
                zzdi.zzd(this.zza.zzb() >= 2);
                f2 = Math.max(0.0f, Math.min(this.zza.zzq() / this.zzg, 0.95f));
            } else {
                i4 = 2;
            }
            this.zza.zzL(zzd3 + zzg);
            i9 = i4;
            i7 = 1;
            i8 = 0;
        }
    }
}
