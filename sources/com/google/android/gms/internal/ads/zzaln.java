package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class zzaln implements zzaki {
    private final zzed zza = new zzed();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzaln(List list) {
        int size = list.size();
        String str = C.SANS_SERIF_NAME;
        if (size == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.zzc = bArr[24];
            this.zzd = ((bArr[26] & UByte.MAX_VALUE) << 24) | ((bArr[27] & UByte.MAX_VALUE) << 16) | ((bArr[28] & UByte.MAX_VALUE) << 8) | (bArr[29] & UByte.MAX_VALUE);
            this.zze = true == "Serif".equals(zzen.zzC(bArr, 43, bArr.length + (-43))) ? C.SERIF_NAME : str;
            int i10 = bArr[25] * Ascii.DC4;
            this.zzg = i10;
            boolean z10 = (bArr[0] & 32) != 0;
            this.zzb = z10;
            if (z10) {
                this.zzf = Math.max(0.0f, Math.min(((bArr[11] & UByte.MAX_VALUE) | ((bArr[10] & UByte.MAX_VALUE) << 8)) / i10, 0.95f));
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

    private static void zzb(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    private static void zzc(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            int i16 = i10 & 1;
            int i17 = i10 & 2;
            boolean z10 = true;
            if (i16 != 0) {
                if (i17 != 0) {
                    e.k(3, spannableStringBuilder, i12, i13, i15);
                } else {
                    e.k(1, spannableStringBuilder, i12, i13, i15);
                    z10 = false;
                }
            } else {
                if (i17 != 0) {
                    e.k(2, spannableStringBuilder, i12, i13, i15);
                }
                z10 = false;
            }
            if ((i10 & 4) == 0) {
                if (i16 == 0 && !z10) {
                    e.k(0, spannableStringBuilder, i12, i13, i15);
                    return;
                }
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzaki
    public final void zza(byte[] bArr, int i10, int i11, zzakh zzakhVar, zzdg zzdgVar) {
        boolean z10;
        String zzB;
        int i12;
        boolean z11;
        boolean z12;
        int i13;
        this.zza.zzJ(bArr, i10 + i11);
        this.zza.zzL(i10);
        zzed zzedVar = this.zza;
        int i14 = 1;
        int i15 = 0;
        int i16 = 2;
        if (zzedVar.zzb() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzd(z10);
        int zzq = zzedVar.zzq();
        if (zzq == 0) {
            zzB = "";
        } else {
            int zzd = zzedVar.zzd();
            Charset zzC = zzedVar.zzC();
            int zzd2 = zzedVar.zzd() - zzd;
            if (zzC == null) {
                zzC = StandardCharsets.UTF_8;
            }
            zzB = zzedVar.zzB(zzq - zzd2, zzC);
        }
        if (zzB.isEmpty()) {
            zzdgVar.zza(new zzaka(zzfzo.zzn(), C.TIME_UNSET, C.TIME_UNSET));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zzB);
        zzc(spannableStringBuilder, this.zzc, 0, 0, spannableStringBuilder.length(), 16711680);
        zzb(spannableStringBuilder, this.zzd, -1, 0, spannableStringBuilder.length(), 16711680);
        String str = this.zze;
        int length = spannableStringBuilder.length();
        if (str != C.SANS_SERIF_NAME) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f10 = this.zzf;
        while (true) {
            zzed zzedVar2 = this.zza;
            if (zzedVar2.zzb() >= 8) {
                int zzd3 = zzedVar2.zzd();
                int zzg = zzedVar2.zzg();
                int zzg2 = this.zza.zzg();
                if (zzg2 == 1937013100) {
                    if (this.zza.zzb() >= i16) {
                        z12 = i14;
                    } else {
                        z12 = i15;
                    }
                    zzdb.zzd(z12);
                    int zzq2 = this.zza.zzq();
                    int i17 = i16;
                    int i18 = i15;
                    while (i15 < zzq2) {
                        zzed zzedVar3 = this.zza;
                        boolean z13 = i18;
                        if (zzedVar3.zzb() >= 12) {
                            z13 = i14;
                        }
                        zzdb.zzd(z13);
                        int zzq3 = zzedVar3.zzq();
                        int zzq4 = zzedVar3.zzq();
                        zzedVar3.zzM(i17);
                        int zzm = zzedVar3.zzm();
                        zzedVar3.zzM(i14);
                        int zzg3 = zzedVar3.zzg();
                        if (zzq4 > spannableStringBuilder.length()) {
                            i13 = zzq2;
                            zzdt.zzf("Tx3gParser", kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.j("Truncating styl end (", zzq4, ") to cueText.length() (", spannableStringBuilder.length(), ")."));
                            zzq4 = spannableStringBuilder.length();
                        } else {
                            i13 = zzq2;
                        }
                        if (zzq3 >= zzq4) {
                            zzdt.zzf("Tx3gParser", kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.j("Ignoring styl with start (", zzq3, ") >= end (", zzq4, ")."));
                        } else {
                            int i19 = zzq4;
                            zzc(spannableStringBuilder, zzm, this.zzc, zzq3, i19, 0);
                            zzb(spannableStringBuilder, zzg3, this.zzd, zzq3, i19, 0);
                        }
                        i15++;
                        i14 = 1;
                        i18 = 0;
                        i17 = 2;
                        zzq2 = i13;
                    }
                    i16 = i17;
                } else {
                    if (zzg2 == 1952608120 && this.zzb) {
                        i12 = 2;
                        if (this.zza.zzb() >= 2) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zzdb.zzd(z11);
                        f10 = Math.max(0.0f, Math.min(this.zza.zzq() / this.zzg, 0.95f));
                    } else {
                        i12 = 2;
                    }
                    i16 = i12;
                }
                this.zza.zzL(zzd3 + zzg);
                i14 = 1;
                i15 = 0;
            } else {
                zzcr zzcrVar = new zzcr();
                zzcrVar.zzl(spannableStringBuilder);
                zzcrVar.zze(f10, 0);
                zzcrVar.zzf(0);
                zzdgVar.zza(new zzaka(zzfzo.zzo(zzcrVar.zzp()), C.TIME_UNSET, C.TIME_UNSET));
                return;
            }
        }
    }
}
