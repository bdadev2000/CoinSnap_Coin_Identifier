package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzadg {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final float zzi;
    public final int zzj;

    @Nullable
    public final String zzk;

    @Nullable
    public final zzfm zzl;

    private zzadg(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, int i19, @Nullable String str, @Nullable zzfm zzfmVar) {
        this.zza = list;
        this.zzb = i10;
        this.zzc = i13;
        this.zzd = i14;
        this.zze = i15;
        this.zzf = i16;
        this.zzg = i17;
        this.zzh = i18;
        this.zzi = f10;
        this.zzj = i19;
        this.zzk = str;
        this.zzl = zzfmVar;
    }

    public static zzadg zza(zzed zzedVar) throws zzbh {
        return zzc(zzedVar, false, null);
    }

    public static zzadg zzb(zzed zzedVar, zzfm zzfmVar) throws zzbh {
        return zzc(zzedVar, true, zzfmVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static zzadg zzc(zzed zzedVar, boolean z10, @Nullable zzfm zzfmVar) throws zzbh {
        boolean z11;
        String str;
        List singletonList;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        zzfi zzfiVar;
        int max;
        boolean z12;
        int max2;
        int i15;
        int i16;
        int i17;
        int i18 = 4;
        boolean z13 = true;
        try {
            if (z10) {
                zzedVar.zzM(4);
            } else {
                zzedVar.zzM(21);
            }
            int zzm = zzedVar.zzm() & 3;
            int zzm2 = zzedVar.zzm();
            int zzd = zzedVar.zzd();
            int i19 = 0;
            int i20 = 0;
            for (int i21 = 0; i21 < zzm2; i21++) {
                zzedVar.zzM(1);
                int zzq = zzedVar.zzq();
                for (int i22 = 0; i22 < zzq; i22++) {
                    int zzq2 = zzedVar.zzq();
                    i20 += zzq2 + 4;
                    zzedVar.zzM(zzq2);
                }
            }
            zzedVar.zzL(zzd);
            byte[] bArr = new byte[i20];
            zzfm zzfmVar2 = zzfmVar;
            int i23 = 0;
            float f10 = 1.0f;
            int i24 = -1;
            int i25 = -1;
            int i26 = -1;
            int i27 = -1;
            int i28 = -1;
            int i29 = -1;
            int i30 = -1;
            int i31 = -1;
            int i32 = -1;
            String str2 = null;
            int i33 = 0;
            while (i33 < zzm2) {
                int zzm3 = zzedVar.zzm() & 63;
                int zzq3 = zzedVar.zzq();
                int i34 = i19;
                zzfm zzfmVar3 = zzfmVar2;
                while (i34 < zzq3) {
                    try {
                        int zzq4 = zzedVar.zzq();
                        int i35 = zzm2;
                        System.arraycopy(zzfp.zza, i19, bArr, i23, i18);
                        int i36 = i23 + 4;
                        System.arraycopy(zzedVar.zzN(), zzedVar.zzd(), bArr, i36, zzq4);
                        int i37 = 32;
                        if (zzm3 == 32) {
                            if (i34 == 0) {
                                zzfmVar3 = zzfp.zzd(bArr, i36, i36 + zzq4);
                                i34 = i19;
                                i10 = zzq3;
                                i11 = zzm3;
                                i23 = i36 + zzq4;
                                zzedVar.zzM(zzq4);
                                i34++;
                                zzm2 = i35;
                                zzq3 = i10;
                                zzm3 = i11;
                                i18 = 4;
                            }
                        } else {
                            i37 = zzm3;
                        }
                        if (i37 == 33) {
                            if (i34 == 0) {
                                zzfj zzc = zzfp.zzc(bArr, i36, i36 + zzq4, zzfmVar3);
                                int i38 = zzc.zzd;
                                int i39 = zzc.zze;
                                int i40 = zzc.zzb + 8;
                                int i41 = zzc.zzc + 8;
                                int i42 = zzc.zzh;
                                int i43 = zzc.zzi;
                                int i44 = zzc.zzj;
                                float f11 = zzc.zzf;
                                int i45 = zzc.zzg;
                                zzfe zzfeVar = zzc.zza;
                                if (zzfeVar != null) {
                                    i15 = i45;
                                    i16 = i40;
                                    i10 = zzq3;
                                    i11 = zzm3;
                                    i17 = i39;
                                    str2 = zzdd.zzd(zzfeVar.zza, zzfeVar.zzb, zzfeVar.zzc, zzfeVar.zzd, zzfeVar.zze, zzfeVar.zzf);
                                } else {
                                    i15 = i45;
                                    i16 = i40;
                                    i10 = zzq3;
                                    i11 = zzm3;
                                    i17 = i39;
                                }
                                i24 = i38;
                                i26 = i16;
                                i19 = 0;
                                i32 = i15;
                                f10 = f11;
                                i30 = i44;
                                i29 = i43;
                                i28 = i42;
                                i27 = i41;
                                i25 = i17;
                                i23 = i36 + zzq4;
                                zzedVar.zzM(zzq4);
                                i34++;
                                zzm2 = i35;
                                zzq3 = i10;
                                zzm3 = i11;
                                i18 = 4;
                            } else {
                                i10 = zzq3;
                                i11 = zzm3;
                                i13 = i34;
                                i14 = i24;
                            }
                        } else {
                            i10 = zzq3;
                            i11 = zzm3;
                            if (i37 == 39 && i34 == 0) {
                                int i46 = i36 + 2;
                                int i47 = (i36 + zzq4) - 1;
                                while (true) {
                                    byte b3 = bArr[i47];
                                    if (b3 == 0) {
                                        if (i47 <= i46) {
                                            break;
                                        }
                                        i47--;
                                    } else if (b3 != 0 && i47 > i46) {
                                        zzfq zzfqVar = new zzfq(bArr, i46, i47 + 1);
                                        while (zzfqVar.zzg(16)) {
                                            int zza = zzfqVar.zza(8);
                                            int i48 = 0;
                                            while (zza == 255) {
                                                i48 += 255;
                                                zza = zzfqVar.zza(8);
                                            }
                                            int i49 = i48 + zza;
                                            int zza2 = zzfqVar.zza(8);
                                            int i50 = 0;
                                            while (zza2 == 255) {
                                                i50 += 255;
                                                zza2 = zzfqVar.zza(8);
                                            }
                                            int i51 = i50 + zza2;
                                            if (i51 == 0 || !zzfqVar.zzg(i51)) {
                                                break;
                                            }
                                            if (i49 == 176) {
                                                int zzc2 = zzfqVar.zzc();
                                                boolean zzh = zzfqVar.zzh();
                                                if (zzh) {
                                                    i12 = zzfqVar.zzc();
                                                } else {
                                                    i12 = 0;
                                                }
                                                int zzc3 = zzfqVar.zzc();
                                                int i52 = 0;
                                                int i53 = -1;
                                                int i54 = -1;
                                                int i55 = -1;
                                                int i56 = -1;
                                                int i57 = -1;
                                                int i58 = -1;
                                                while (i52 <= zzc3) {
                                                    i53 = zzfqVar.zzc();
                                                    i54 = zzfqVar.zzc();
                                                    i13 = i34;
                                                    int zza3 = zzfqVar.zza(6);
                                                    if (zza3 != 63) {
                                                        if (zza3 == 0) {
                                                            i14 = i24;
                                                            max = Math.max(0, zzc2 - 30);
                                                        } else {
                                                            i14 = i24;
                                                            max = Math.max(0, (zza3 + zzc2) - 31);
                                                        }
                                                        i56 = zzfqVar.zza(max);
                                                        if (zzh) {
                                                            int zza4 = zzfqVar.zza(6);
                                                            if (zza4 != 63) {
                                                                if (zza4 == 0) {
                                                                    z12 = zzh;
                                                                    max2 = Math.max(0, i12 - 30);
                                                                } else {
                                                                    z12 = zzh;
                                                                    max2 = Math.max(0, (zza4 + i12) - 31);
                                                                }
                                                                i58 = zzfqVar.zza(max2);
                                                                i57 = zza4;
                                                            }
                                                        } else {
                                                            z12 = zzh;
                                                        }
                                                        if (zzfqVar.zzh()) {
                                                            zzfqVar.zzf(10);
                                                        }
                                                        i52++;
                                                        i55 = zza3;
                                                        i34 = i13;
                                                        zzh = z12;
                                                        i24 = i14;
                                                    }
                                                }
                                                i13 = i34;
                                                i14 = i24;
                                                zzfiVar = new zzfi(zzc2, i12, zzc3 + 1, i53, i54, i55, i56, i57, i58);
                                            }
                                        }
                                    }
                                }
                                i13 = i34;
                                i14 = i24;
                                zzfiVar = null;
                                if (zzfiVar != null && zzfmVar3 != null) {
                                    i19 = 0;
                                    if (zzfiVar.zza == ((zzfc) zzfmVar3.zza.get(0)).zzb) {
                                        i34 = i13;
                                        i24 = i14;
                                        i31 = 4;
                                        i23 = i36 + zzq4;
                                        zzedVar.zzM(zzq4);
                                        i34++;
                                        zzm2 = i35;
                                        zzq3 = i10;
                                        zzm3 = i11;
                                        i18 = 4;
                                    } else {
                                        i31 = 5;
                                        i34 = i13;
                                        i24 = i14;
                                        i23 = i36 + zzq4;
                                        zzedVar.zzM(zzq4);
                                        i34++;
                                        zzm2 = i35;
                                        zzq3 = i10;
                                        zzm3 = i11;
                                        i18 = 4;
                                    }
                                }
                            }
                            i13 = i34;
                            i14 = i24;
                        }
                        i19 = 0;
                        i34 = i13;
                        i24 = i14;
                        i23 = i36 + zzq4;
                        zzedVar.zzM(zzq4);
                        i34++;
                        zzm2 = i35;
                        zzq3 = i10;
                        zzm3 = i11;
                        i18 = 4;
                    } catch (ArrayIndexOutOfBoundsException e2) {
                        e = e2;
                        z11 = true;
                        if (z11 != z10) {
                            str = "HEVC config";
                        } else {
                            str = "L-HEVC config";
                        }
                        throw zzbh.zza("Error parsing".concat(str), e);
                    }
                }
                i33++;
                zzfmVar2 = zzfmVar3;
                i18 = 4;
                z13 = true;
            }
            if (i20 == 0) {
                singletonList = Collections.emptyList();
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new zzadg(singletonList, zzm + 1, i24, i25, i26, i27, i28, i29, i30, i31, f10, i32, str2, zzfmVar2);
        } catch (ArrayIndexOutOfBoundsException e10) {
            e = e10;
            z11 = z13;
        }
    }
}
