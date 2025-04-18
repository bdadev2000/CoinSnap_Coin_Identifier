package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.applovin.impl.adview.t;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaiz {
    private static final byte[] zza;

    static {
        int i2 = zzeu.zza;
        zza = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    @Nullable
    public static zzbk zza(zzaim zzaimVar) {
        zzey zzeyVar;
        zzain zzb = zzaimVar.zzb(1751411826);
        zzain zzb2 = zzaimVar.zzb(1801812339);
        zzain zzb3 = zzaimVar.zzb(1768715124);
        if (zzb != null && zzb2 != null && zzb3 != null && zzg(zzb.zza) == 1835299937) {
            zzek zzekVar = zzb2.zza;
            zzekVar.zzL(12);
            int zzg = zzekVar.zzg();
            String[] strArr = new String[zzg];
            for (int i2 = 0; i2 < zzg; i2++) {
                int zzg2 = zzekVar.zzg();
                zzekVar.zzM(4);
                strArr[i2] = zzekVar.zzB(zzg2 - 8, StandardCharsets.UTF_8);
            }
            zzek zzekVar2 = zzb3.zza;
            zzekVar2.zzL(8);
            ArrayList arrayList = new ArrayList();
            while (zzekVar2.zzb() > 8) {
                int zzg3 = zzekVar2.zzg() + zzekVar2.zzd();
                int zzg4 = zzekVar2.zzg() - 1;
                if (zzg4 < 0 || zzg4 >= zzg) {
                    t.C("Skipped metadata with unknown key index: ", zzg4, "AtomParsers");
                } else {
                    String str = strArr[zzg4];
                    while (true) {
                        int zzd = zzekVar2.zzd();
                        if (zzd >= zzg3) {
                            zzeyVar = null;
                            break;
                        }
                        int zzg5 = zzekVar2.zzg();
                        if (zzekVar2.zzg() == 1684108385) {
                            int zzg6 = zzekVar2.zzg();
                            int zzg7 = zzekVar2.zzg();
                            int i3 = zzg5 - 16;
                            byte[] bArr = new byte[i3];
                            zzekVar2.zzH(bArr, 0, i3);
                            zzeyVar = new zzey(str, bArr, zzg7, zzg6);
                            break;
                        }
                        zzekVar2.zzL(zzd + zzg5);
                    }
                    if (zzeyVar != null) {
                        arrayList.add(zzeyVar);
                    }
                }
                zzekVar2.zzL(zzg3);
            }
            if (!arrayList.isEmpty()) {
                return new zzbk(arrayList);
            }
        }
        return null;
    }

    public static zzbk zzb(zzain zzainVar) {
        int zzn;
        zzek zzekVar = zzainVar.zza;
        zzekVar.zzL(8);
        zzbk zzbkVar = new zzbk(-9223372036854775807L, new zzbj[0]);
        while (zzekVar.zzb() >= 8) {
            int zzd = zzekVar.zzd();
            int zzg = zzekVar.zzg() + zzd;
            int zzg2 = zzekVar.zzg();
            zzbk zzbkVar2 = null;
            if (zzg2 == 1835365473) {
                zzekVar.zzL(zzd);
                zzekVar.zzM(8);
                zze(zzekVar);
                while (true) {
                    if (zzekVar.zzd() >= zzg) {
                        break;
                    }
                    int zzd2 = zzekVar.zzd();
                    int zzg3 = zzekVar.zzg() + zzd2;
                    if (zzekVar.zzg() == 1768715124) {
                        zzekVar.zzL(zzd2);
                        zzekVar.zzM(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzekVar.zzd() < zzg3) {
                            zzbj zza2 = zzaji.zza(zzekVar);
                            if (zza2 != null) {
                                arrayList.add(zza2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzbkVar2 = new zzbk(arrayList);
                        }
                    } else {
                        zzekVar.zzL(zzg3);
                    }
                }
                zzbkVar = zzbkVar.zzd(zzbkVar2);
            } else if (zzg2 == 1936553057) {
                zzekVar.zzL(zzd);
                zzekVar.zzM(12);
                while (true) {
                    if (zzekVar.zzd() >= zzg) {
                        break;
                    }
                    int zzd3 = zzekVar.zzd();
                    int zzg4 = zzekVar.zzg();
                    if (zzekVar.zzg() != 1935766900) {
                        zzekVar.zzL(zzd3 + zzg4);
                    } else if (zzg4 >= 16) {
                        zzekVar.zzM(4);
                        int i2 = -1;
                        int i3 = 0;
                        for (int i4 = 0; i4 < 2; i4++) {
                            int zzm = zzekVar.zzm();
                            int zzm2 = zzekVar.zzm();
                            if (zzm == 0) {
                                i2 = zzm2;
                            } else if (zzm == 1) {
                                i3 = zzm2;
                            }
                        }
                        if (i2 == 12) {
                            zzn = 240;
                        } else if (i2 == 13) {
                            zzn = 120;
                        } else {
                            if (i2 == 21 && zzekVar.zzb() >= 8 && zzekVar.zzd() + 8 <= zzg) {
                                int zzg5 = zzekVar.zzg();
                                int zzg6 = zzekVar.zzg();
                                if (zzg5 >= 12 && zzg6 == 1936877170) {
                                    zzn = zzekVar.zzn();
                                }
                            }
                            zzn = -2147483647;
                        }
                        if (zzn != -2147483647) {
                            zzbkVar2 = new zzbk(-9223372036854775807L, new zzahq(zzn, i3));
                        }
                    }
                }
                zzbkVar = zzbkVar.zzd(zzbkVar2);
            } else if (zzg2 == -1451722374) {
                zzbkVar = zzbkVar.zzd(zzi(zzekVar));
            }
            zzekVar.zzL(zzg);
        }
        return zzbkVar;
    }

    public static zzfe zzc(zzek zzekVar) {
        long zzt;
        long zzt2;
        zzekVar.zzL(8);
        if (zzaio.zze(zzekVar.zzg()) == 0) {
            zzt = zzekVar.zzu();
            zzt2 = zzekVar.zzu();
        } else {
            zzt = zzekVar.zzt();
            zzt2 = zzekVar.zzt();
        }
        return new zzfe(zzt, zzt2, zzekVar.zzu());
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e0, code lost:
    
        r8 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x0931, code lost:
    
        if (r10 == 1) goto L470;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0d23  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0d4d  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0942  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0970  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0972  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0b87  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0b89  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0cef  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0cf3  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0d5a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:618:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List zzd(com.google.android.gms.internal.ads.zzaim r58, com.google.android.gms.internal.ads.zzadp r59, long r60, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzy r62, boolean r63, boolean r64, com.google.android.gms.internal.ads.zzfxq r65) throws com.google.android.gms.internal.ads.zzbo {
        /*
            Method dump skipped, instructions count: 3428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiz.zzd(com.google.android.gms.internal.ads.zzaim, com.google.android.gms.internal.ads.zzadp, long, com.google.android.gms.internal.ads.zzy, boolean, boolean, com.google.android.gms.internal.ads.zzfxq):java.util.List");
    }

    public static void zze(zzek zzekVar) {
        int zzd = zzekVar.zzd();
        zzekVar.zzM(4);
        if (zzekVar.zzg() != 1751411826) {
            zzd += 4;
        }
        zzekVar.zzL(zzd);
    }

    private static int zzf(zzek zzekVar) {
        int zzm = zzekVar.zzm();
        int i2 = zzm & 127;
        while ((zzm & 128) == 128) {
            zzm = zzekVar.zzm();
            i2 = (i2 << 7) | (zzm & 127);
        }
        return i2;
    }

    private static int zzg(zzek zzekVar) {
        zzekVar.zzL(16);
        return zzekVar.zzg();
    }

    @Nullable
    private static Pair zzh(zzek zzekVar, int i2, int i3) throws zzbo {
        Integer num;
        zzajs zzajsVar;
        Pair create;
        int i4;
        int i5;
        byte[] bArr;
        int zzd = zzekVar.zzd();
        while (zzd - i2 < i3) {
            zzekVar.zzL(zzd);
            int zzg = zzekVar.zzg();
            zzadf.zzb(zzg > 0, "childAtomSize must be positive");
            if (zzekVar.zzg() == 1936289382) {
                int i6 = zzd + 8;
                int i7 = 0;
                int i8 = -1;
                String str = null;
                Integer num2 = null;
                while (i6 - zzd < zzg) {
                    zzekVar.zzL(i6);
                    int zzg2 = zzekVar.zzg();
                    int zzg3 = zzekVar.zzg();
                    if (zzg3 == 1718775137) {
                        num2 = Integer.valueOf(zzekVar.zzg());
                    } else if (zzg3 == 1935894637) {
                        zzekVar.zzM(4);
                        str = zzekVar.zzB(4, StandardCharsets.UTF_8);
                    } else if (zzg3 == 1935894633) {
                        i8 = i6;
                        i7 = zzg2;
                    }
                    i6 += zzg2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    zzadf.zzb(num2 != null, "frma atom is mandatory");
                    zzadf.zzb(i8 != -1, "schi atom is mandatory");
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            num = num2;
                            zzajsVar = null;
                            break;
                        }
                        zzekVar.zzL(i9);
                        int zzg4 = zzekVar.zzg();
                        if (zzekVar.zzg() == 1952804451) {
                            int zze = zzaio.zze(zzekVar.zzg());
                            zzekVar.zzM(1);
                            if (zze == 0) {
                                zzekVar.zzM(1);
                                i4 = 0;
                                i5 = 0;
                            } else {
                                int zzm = zzekVar.zzm();
                                int i10 = (zzm & 240) >> 4;
                                i4 = zzm & 15;
                                i5 = i10;
                            }
                            boolean z2 = zzekVar.zzm() == 1;
                            int zzm2 = zzekVar.zzm();
                            byte[] bArr2 = new byte[16];
                            zzekVar.zzH(bArr2, 0, 16);
                            if (z2 && zzm2 == 0) {
                                int zzm3 = zzekVar.zzm();
                                byte[] bArr3 = new byte[zzm3];
                                zzekVar.zzH(bArr3, 0, zzm3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            zzajsVar = new zzajs(z2, str, zzm2, bArr2, i5, i4, bArr);
                        } else {
                            i9 += zzg4;
                        }
                    }
                    zzadf.zzb(zzajsVar != null, "tenc atom is mandatory");
                    int i11 = zzeu.zza;
                    create = Pair.create(num, zzajsVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            zzd += zzg;
        }
        return null;
    }

    @Nullable
    private static zzbk zzi(zzek zzekVar) {
        short zzE = zzekVar.zzE();
        zzekVar.zzM(2);
        String zzB = zzekVar.zzB(zzE, StandardCharsets.UTF_8);
        int max = Math.max(zzB.lastIndexOf(43), zzB.lastIndexOf(45));
        try {
            return new zzbk(-9223372036854775807L, new zzfb(Float.parseFloat(zzB.substring(0, max)), Float.parseFloat(zzB.substring(max, zzB.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static zzaiq zzj(zzek zzekVar, int i2) {
        zzekVar.zzL(i2 + 12);
        zzekVar.zzM(1);
        zzf(zzekVar);
        zzekVar.zzM(2);
        int zzm = zzekVar.zzm();
        if ((zzm & 128) != 0) {
            zzekVar.zzM(2);
        }
        if ((zzm & 64) != 0) {
            zzekVar.zzM(zzekVar.zzm());
        }
        if ((zzm & 32) != 0) {
            zzekVar.zzM(2);
        }
        zzekVar.zzM(1);
        zzf(zzekVar);
        String zzd = zzbn.zzd(zzekVar.zzm());
        if ("audio/mpeg".equals(zzd) || "audio/vnd.dts".equals(zzd) || "audio/vnd.dts.hd".equals(zzd)) {
            return new zzaiq(zzd, null, -1L, -1L);
        }
        zzekVar.zzM(4);
        long zzu = zzekVar.zzu();
        long zzu2 = zzekVar.zzu();
        zzekVar.zzM(1);
        int zzf = zzf(zzekVar);
        byte[] bArr = new byte[zzf];
        zzekVar.zzH(bArr, 0, zzf);
        return new zzaiq(zzd, bArr, zzu2 <= 0 ? -1L : zzu2, zzu > 0 ? zzu : -1L);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x04d9 A[EDGE_INSN: B:114:0x04d9->B:115:0x04d9 BREAK  A[LOOP:5: B:93:0x0473->B:109:0x04d2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0272 A[ADDED_TO_REGION, LOOP:12: B:214:0x0272->B:217:0x027c, LOOP_START, PHI: r16
      0x0272: PHI (r16v6 int) = (r16v2 int), (r16v7 int) binds: [B:213:0x0270, B:217:0x027c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0478  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzaju zzk(com.google.android.gms.internal.ads.zzajr r40, com.google.android.gms.internal.ads.zzaim r41, com.google.android.gms.internal.ads.zzadp r42) throws com.google.android.gms.internal.ads.zzbo {
        /*
            Method dump skipped, instructions count: 1501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiz.zzk(com.google.android.gms.internal.ads.zzajr, com.google.android.gms.internal.ads.zzaim, com.google.android.gms.internal.ads.zzadp):com.google.android.gms.internal.ads.zzaju");
    }

    private static ByteBuffer zzl() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzm(com.google.android.gms.internal.ads.zzek r26, int r27, int r28, int r29, int r30, java.lang.String r31, boolean r32, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzy r33, com.google.android.gms.internal.ads.zzaiu r34, int r35) throws com.google.android.gms.internal.ads.zzbo {
        /*
            Method dump skipped, instructions count: 1424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiz.zzm(com.google.android.gms.internal.ads.zzek, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzy, com.google.android.gms.internal.ads.zzaiu, int):void");
    }
}
