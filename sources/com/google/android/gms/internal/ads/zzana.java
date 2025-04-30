package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.L;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzana implements zzalv {
    private final zzfu zza = new zzfu();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzana(List list) {
        int size = list.size();
        String str = C.SANS_SERIF_NAME;
        if (size == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.zzc = bArr[24];
            this.zzd = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.zze = true == "Serif".equals(zzgd.zzB(bArr, 43, bArr.length + (-43))) ? C.SERIF_NAME : str;
            int i9 = bArr[25] * Ascii.DC4;
            this.zzg = i9;
            boolean z8 = (bArr[0] & 32) != 0;
            this.zzb = z8;
            if (z8) {
                this.zzf = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i9, 0.95f));
                return;
            } else {
                this.zzf = 0.85f;
                return;
            }
        }
        this.zzc = 0;
        this.zzd = -1;
        this.zze = C.SANS_SERIF_NAME;
        this.zzb = false;
        this.zzf = 0.85f;
        this.zzg = -1;
    }

    private static void zzb(SpannableStringBuilder spannableStringBuilder, int i9, int i10, int i11, int i12, int i13) {
        if (i9 != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i9 >>> 8) | ((i9 & 255) << 24)), i11, i12, i13 | 33);
        }
    }

    private static void zzc(SpannableStringBuilder spannableStringBuilder, int i9, int i10, int i11, int i12, int i13) {
        if (i9 != i10) {
            int i14 = i13 | 33;
            int i15 = i9 & 1;
            int i16 = i9 & 2;
            boolean z8 = true;
            if (i15 != 0) {
                if (i16 != 0) {
                    L.o(3, spannableStringBuilder, i11, i12, i14);
                } else {
                    L.o(1, spannableStringBuilder, i11, i12, i14);
                    z8 = false;
                }
            } else {
                if (i16 != 0) {
                    L.o(2, spannableStringBuilder, i11, i12, i14);
                }
                z8 = false;
            }
            if ((i9 & 4) == 0) {
                if (i15 == 0 && !z8) {
                    L.o(0, spannableStringBuilder, i11, i12, i14);
                    return;
                }
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i12, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzalv
    public final void zza(byte[] bArr, int i9, int i10, zzalu zzaluVar, zzev zzevVar) {
        boolean z8;
        String zzA;
        int i11;
        boolean z9;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        this.zza.zzI(bArr, i9 + i10);
        this.zza.zzK(i9);
        zzfu zzfuVar = this.zza;
        int i14 = 1;
        int i15 = 0;
        int i16 = 2;
        if (zzfuVar.zzb() >= 2) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzd(z8);
        int zzq = zzfuVar.zzq();
        if (zzq == 0) {
            zzA = "";
        } else {
            int zzd = zzfuVar.zzd();
            Charset zzB = zzfuVar.zzB();
            int zzd2 = zzfuVar.zzd() - zzd;
            if (zzB == null) {
                zzB = zzfxs.zzc;
            }
            zzA = zzfuVar.zzA(zzq - zzd2, zzB);
        }
        if (zzA.isEmpty()) {
            zzevVar.zza(new zzaln(zzgbc.zzm(), C.TIME_UNSET, C.TIME_UNSET));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zzA);
        zzc(spannableStringBuilder, this.zzc, 0, 0, spannableStringBuilder.length(), 16711680);
        zzb(spannableStringBuilder, this.zzd, -1, 0, spannableStringBuilder.length(), 16711680);
        String str = this.zze;
        int length = spannableStringBuilder.length();
        if (str != C.SANS_SERIF_NAME) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f9 = this.zzf;
        while (true) {
            zzfu zzfuVar2 = this.zza;
            if (zzfuVar2.zzb() >= 8) {
                int zzd3 = zzfuVar2.zzd();
                int zzg = zzfuVar2.zzg();
                int zzg2 = this.zza.zzg();
                if (zzg2 == 1937013100) {
                    if (this.zza.zzb() >= i16) {
                        z10 = i14;
                    } else {
                        z10 = i15;
                    }
                    zzeq.zzd(z10);
                    int zzq2 = this.zza.zzq();
                    int i17 = i15;
                    while (i17 < zzq2) {
                        zzfu zzfuVar3 = this.zza;
                        if (zzfuVar3.zzb() >= 12) {
                            z11 = i14;
                        } else {
                            z11 = i15;
                        }
                        zzeq.zzd(z11);
                        int zzq3 = zzfuVar3.zzq();
                        int zzq4 = zzfuVar3.zzq();
                        zzfuVar3.zzL(i16);
                        int zzm = zzfuVar3.zzm();
                        zzfuVar3.zzL(i14);
                        int zzg3 = zzfuVar3.zzg();
                        if (zzq4 > spannableStringBuilder.length()) {
                            i12 = zzq2;
                            zzfk.zzf("Tx3gParser", AbstractC2914a.c(zzq4, spannableStringBuilder.length(), "Truncating styl end (", ") to cueText.length() (", ")."));
                            i13 = spannableStringBuilder.length();
                        } else {
                            i12 = zzq2;
                            i13 = zzq4;
                        }
                        if (zzq3 >= i13) {
                            zzfk.zzf("Tx3gParser", AbstractC2914a.c(zzq3, i13, "Ignoring styl with start (", ") >= end (", ")."));
                        } else {
                            int i18 = i13;
                            zzc(spannableStringBuilder, zzm, this.zzc, zzq3, i18, 0);
                            zzb(spannableStringBuilder, zzg3, this.zzd, zzq3, i18, 0);
                        }
                        i17++;
                        zzq2 = i12;
                        i14 = 1;
                        i15 = 0;
                        i16 = 2;
                    }
                    i11 = i16;
                } else if (zzg2 == 1952608120 && this.zzb) {
                    i11 = 2;
                    if (this.zza.zzb() >= 2) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    zzeq.zzd(z9);
                    f9 = Math.max(0.0f, Math.min(this.zza.zzq() / this.zzg, 0.95f));
                } else {
                    i11 = 2;
                }
                this.zza.zzK(zzd3 + zzg);
                i16 = i11;
                i14 = 1;
                i15 = 0;
            } else {
                zzeg zzegVar = new zzeg();
                zzegVar.zzl(spannableStringBuilder);
                zzegVar.zze(f9, 0);
                zzegVar.zzf(0);
                zzevVar.zza(new zzaln(zzgbc.zzn(zzegVar.zzp()), C.TIME_UNSET, C.TIME_UNSET));
                return;
            }
        }
    }
}
