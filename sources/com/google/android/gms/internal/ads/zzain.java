package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzain {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;

    static {
        int i10 = zzen.zza;
        zzb = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int zza(int i10) {
        return (i10 >> 24) & 255;
    }

    @Nullable
    public static zzbd zzb(zzes zzesVar) {
        zzer zzerVar;
        zzet zzb2 = zzesVar.zzb(1751411826);
        zzet zzb3 = zzesVar.zzb(1801812339);
        zzet zzb4 = zzesVar.zzb(1768715124);
        if (zzb2 != null && zzb3 != null && zzb4 != null && zzi(zzb2.zza) == 1835299937) {
            zzed zzedVar = zzb3.zza;
            zzedVar.zzL(12);
            int zzg = zzedVar.zzg();
            String[] strArr = new String[zzg];
            for (int i10 = 0; i10 < zzg; i10++) {
                int zzg2 = zzedVar.zzg();
                zzedVar.zzM(4);
                strArr[i10] = zzedVar.zzB(zzg2 - 8, StandardCharsets.UTF_8);
            }
            zzed zzedVar2 = zzb4.zza;
            zzedVar2.zzL(8);
            ArrayList arrayList = new ArrayList();
            while (zzedVar2.zzb() > 8) {
                int zzg3 = zzedVar2.zzg() + zzedVar2.zzd();
                int zzg4 = zzedVar2.zzg() - 1;
                if (zzg4 >= 0 && zzg4 < zzg) {
                    String str = strArr[zzg4];
                    while (true) {
                        int zzd = zzedVar2.zzd();
                        if (zzd < zzg3) {
                            int zzg5 = zzedVar2.zzg();
                            if (zzedVar2.zzg() == 1684108385) {
                                int zzg6 = zzedVar2.zzg();
                                int zzg7 = zzedVar2.zzg();
                                int i11 = zzg5 - 16;
                                byte[] bArr = new byte[i11];
                                zzedVar2.zzH(bArr, 0, i11);
                                zzerVar = new zzer(str, bArr, zzg7, zzg6);
                                break;
                            }
                            zzedVar2.zzL(zzd + zzg5);
                        } else {
                            zzerVar = null;
                            break;
                        }
                    }
                    if (zzerVar != null) {
                        arrayList.add(zzerVar);
                    }
                } else {
                    e.r("Skipped metadata with unknown key index: ", zzg4, "BoxParsers");
                }
                zzedVar2.zzL(zzg3);
            }
            if (!arrayList.isEmpty()) {
                return new zzbd(arrayList);
            }
        }
        return null;
    }

    public static zzbd zzc(zzet zzetVar) {
        int zzn;
        zzed zzedVar = zzetVar.zza;
        zzedVar.zzL(8);
        zzbd zzbdVar = new zzbd(C.TIME_UNSET, new zzbc[0]);
        while (zzedVar.zzb() >= 8) {
            int zzd = zzedVar.zzd();
            int zzg = zzedVar.zzg() + zzd;
            int zzg2 = zzedVar.zzg();
            zzbd zzbdVar2 = null;
            if (zzg2 == 1835365473) {
                zzedVar.zzL(zzd);
                zzedVar.zzM(8);
                zzg(zzedVar);
                while (true) {
                    if (zzedVar.zzd() >= zzg) {
                        break;
                    }
                    int zzd2 = zzedVar.zzd();
                    int zzg3 = zzedVar.zzg() + zzd2;
                    if (zzedVar.zzg() == 1768715124) {
                        zzedVar.zzL(zzd2);
                        zzedVar.zzM(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzedVar.zzd() < zzg3) {
                            zzbc zza2 = zzaiv.zza(zzedVar);
                            if (zza2 != null) {
                                arrayList.add(zza2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzbdVar2 = new zzbd(arrayList);
                        }
                    } else {
                        zzedVar.zzL(zzg3);
                    }
                }
                zzbdVar = zzbdVar.zzd(zzbdVar2);
            } else if (zzg2 == 1936553057) {
                zzedVar.zzL(zzd);
                zzedVar.zzM(12);
                while (true) {
                    if (zzedVar.zzd() >= zzg) {
                        break;
                    }
                    int zzd3 = zzedVar.zzd();
                    int zzg4 = zzedVar.zzg();
                    if (zzedVar.zzg() == 1935766900) {
                        if (zzg4 >= 16) {
                            zzedVar.zzM(4);
                            int i10 = -1;
                            int i11 = 0;
                            for (int i12 = 0; i12 < 2; i12++) {
                                int zzm = zzedVar.zzm();
                                int zzm2 = zzedVar.zzm();
                                if (zzm == 0) {
                                    i10 = zzm2;
                                } else if (zzm == 1) {
                                    i11 = zzm2;
                                }
                            }
                            if (i10 == 12) {
                                zzn = PsExtractor.VIDEO_STREAM_MASK;
                            } else if (i10 == 13) {
                                zzn = 120;
                            } else {
                                if (i10 == 21 && zzedVar.zzb() >= 8 && zzedVar.zzd() + 8 <= zzg) {
                                    int zzg5 = zzedVar.zzg();
                                    int zzg6 = zzedVar.zzg();
                                    if (zzg5 >= 12 && zzg6 == 1936877170) {
                                        zzn = zzedVar.zzn();
                                    }
                                }
                                zzn = -2147483647;
                            }
                            if (zzn != -2147483647) {
                                zzbdVar2 = new zzbd(C.TIME_UNSET, new zzahg(zzn, i11));
                            }
                        }
                    } else {
                        zzedVar.zzL(zzd3 + zzg4);
                    }
                }
                zzbdVar = zzbdVar.zzd(zzbdVar2);
            } else if (zzg2 == -1451722374) {
                zzbdVar = zzbdVar.zzd(zzk(zzedVar));
            }
            zzedVar.zzL(zzg);
        }
        return zzbdVar;
    }

    public static zzfb zzd(zzed zzedVar) {
        long zzt;
        long zzt2;
        zzedVar.zzL(8);
        if (zza(zzedVar.zzg()) == 0) {
            zzt = zzedVar.zzu();
            zzt2 = zzedVar.zzu();
        } else {
            zzt = zzedVar.zzt();
            zzt2 = zzedVar.zzt();
        }
        return new zzfb(zzt, zzt2, zzedVar.zzu());
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0290 A[ADDED_TO_REGION, LOOP:12: B:211:0x0290->B:214:0x029a, LOOP_START, PHI: r17
      0x0290: PHI (r17v6 int) = (r17v2 int), (r17v7 int) binds: [B:210:0x028e, B:214:0x029a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x027f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x035c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzajh zze(com.google.android.gms.internal.ads.zzaje r39, com.google.android.gms.internal.ads.zzes r40, com.google.android.gms.internal.ads.zzadf r41) throws com.google.android.gms.internal.ads.zzbh {
        /*
            Method dump skipped, instructions count: 1487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzain.zze(com.google.android.gms.internal.ads.zzaje, com.google.android.gms.internal.ads.zzes, com.google.android.gms.internal.ads.zzadf):com.google.android.gms.internal.ads.zzajh");
    }

    /* JADX WARN: Code restructure failed: missing block: B:456:0x0984, code lost:
    
        if (r9 == 1) goto L477;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0d8a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0db4  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0995  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x09bf  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x09c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0bcc  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0bce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x0d56  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x0d5a  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0dc1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:623:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List zzf(com.google.android.gms.internal.ads.zzes r60, com.google.android.gms.internal.ads.zzadf r61, long r62, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzw r64, boolean r65, boolean r66, com.google.android.gms.internal.ads.zzfwh r67) throws com.google.android.gms.internal.ads.zzbh {
        /*
            Method dump skipped, instructions count: 3531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzain.zzf(com.google.android.gms.internal.ads.zzes, com.google.android.gms.internal.ads.zzadf, long, com.google.android.gms.internal.ads.zzw, boolean, boolean, com.google.android.gms.internal.ads.zzfwh):java.util.List");
    }

    public static void zzg(zzed zzedVar) {
        int zzd = zzedVar.zzd();
        zzedVar.zzM(4);
        if (zzedVar.zzg() != 1751411826) {
            zzd += 4;
        }
        zzedVar.zzL(zzd);
    }

    private static int zzh(zzed zzedVar) {
        int zzm = zzedVar.zzm();
        int i10 = zzm & 127;
        while ((zzm & 128) == 128) {
            zzm = zzedVar.zzm();
            i10 = (i10 << 7) | (zzm & 127);
        }
        return i10;
    }

    private static int zzi(zzed zzedVar) {
        zzedVar.zzL(16);
        return zzedVar.zzg();
    }

    @Nullable
    private static Pair zzj(zzed zzedVar, int i10, int i11) throws zzbh {
        boolean z10;
        boolean z11;
        boolean z12;
        Integer num;
        zzajf zzajfVar;
        Pair create;
        int i12;
        int i13;
        boolean z13;
        byte[] bArr;
        int zzd = zzedVar.zzd();
        while (zzd - i10 < i11) {
            zzedVar.zzL(zzd);
            int zzg = zzedVar.zzg();
            boolean z14 = true;
            if (zzg > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            zzacv.zzb(z10, "childAtomSize must be positive");
            if (zzedVar.zzg() == 1936289382) {
                int i14 = zzd + 8;
                int i15 = 0;
                int i16 = -1;
                String str = null;
                Integer num2 = null;
                while (i14 - zzd < zzg) {
                    zzedVar.zzL(i14);
                    int zzg2 = zzedVar.zzg();
                    int zzg3 = zzedVar.zzg();
                    if (zzg3 == 1718775137) {
                        num2 = Integer.valueOf(zzedVar.zzg());
                    } else if (zzg3 == 1935894637) {
                        zzedVar.zzM(4);
                        str = zzedVar.zzB(4, StandardCharsets.UTF_8);
                    } else if (zzg3 == 1935894633) {
                        i16 = i14;
                        i15 = zzg2;
                    }
                    i14 += zzg2;
                }
                if (!C.CENC_TYPE_cenc.equals(str) && !C.CENC_TYPE_cbc1.equals(str) && !C.CENC_TYPE_cens.equals(str) && !C.CENC_TYPE_cbcs.equals(str)) {
                    create = null;
                } else {
                    if (num2 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zzacv.zzb(z11, "frma atom is mandatory");
                    if (i16 != -1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    zzacv.zzb(z12, "schi atom is mandatory");
                    int i17 = i16 + 8;
                    while (true) {
                        if (i17 - i16 < i15) {
                            zzedVar.zzL(i17);
                            int zzg4 = zzedVar.zzg();
                            if (zzedVar.zzg() == 1952804451) {
                                int zza2 = zza(zzedVar.zzg());
                                zzedVar.zzM(1);
                                if (zza2 == 0) {
                                    zzedVar.zzM(1);
                                    i12 = 0;
                                    i13 = 0;
                                } else {
                                    int zzm = zzedVar.zzm();
                                    int i18 = (zzm & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                                    i12 = zzm & 15;
                                    i13 = i18;
                                }
                                if (zzedVar.zzm() == 1) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                int zzm2 = zzedVar.zzm();
                                byte[] bArr2 = new byte[16];
                                zzedVar.zzH(bArr2, 0, 16);
                                if (z13 && zzm2 == 0) {
                                    int zzm3 = zzedVar.zzm();
                                    byte[] bArr3 = new byte[zzm3];
                                    zzedVar.zzH(bArr3, 0, zzm3);
                                    bArr = bArr3;
                                } else {
                                    bArr = null;
                                }
                                num = num2;
                                zzajfVar = new zzajf(z13, str, zzm2, bArr2, i13, i12, bArr);
                            } else {
                                i17 += zzg4;
                            }
                        } else {
                            num = num2;
                            zzajfVar = null;
                            break;
                        }
                    }
                    if (zzajfVar == null) {
                        z14 = false;
                    }
                    zzacv.zzb(z14, "tenc atom is mandatory");
                    int i19 = zzen.zza;
                    create = Pair.create(num, zzajfVar);
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
    private static zzbd zzk(zzed zzedVar) {
        short zzE = zzedVar.zzE();
        zzedVar.zzM(2);
        String zzB = zzedVar.zzB(zzE, StandardCharsets.UTF_8);
        int max = Math.max(zzB.lastIndexOf(43), zzB.lastIndexOf(45));
        try {
            return new zzbd(C.TIME_UNSET, new zzey(Float.parseFloat(zzB.substring(0, max)), Float.parseFloat(zzB.substring(max, zzB.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static zzaie zzl(zzed zzedVar, int i10) {
        long j3;
        long j10;
        zzedVar.zzL(i10 + 12);
        zzedVar.zzM(1);
        zzh(zzedVar);
        zzedVar.zzM(2);
        int zzm = zzedVar.zzm();
        if ((zzm & 128) != 0) {
            zzedVar.zzM(2);
        }
        if ((zzm & 64) != 0) {
            zzedVar.zzM(zzedVar.zzm());
        }
        if ((zzm & 32) != 0) {
            zzedVar.zzM(2);
        }
        zzedVar.zzM(1);
        zzh(zzedVar);
        String zzd = zzbg.zzd(zzedVar.zzm());
        if (!MimeTypes.AUDIO_MPEG.equals(zzd) && !MimeTypes.AUDIO_DTS.equals(zzd) && !MimeTypes.AUDIO_DTS_HD.equals(zzd)) {
            zzedVar.zzM(4);
            long zzu = zzedVar.zzu();
            long zzu2 = zzedVar.zzu();
            zzedVar.zzM(1);
            int zzh = zzh(zzedVar);
            byte[] bArr = new byte[zzh];
            zzedVar.zzH(bArr, 0, zzh);
            if (zzu2 <= 0) {
                j3 = -1;
            } else {
                j3 = zzu2;
            }
            if (zzu > 0) {
                j10 = zzu;
            } else {
                j10 = -1;
            }
            return new zzaie(zzd, bArr, j3, j10);
        }
        return new zzaie(zzd, null, -1L, -1L);
    }

    private static ByteBuffer zzm() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzn(com.google.android.gms.internal.ads.zzed r26, int r27, int r28, int r29, int r30, java.lang.String r31, boolean r32, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzw r33, com.google.android.gms.internal.ads.zzaii r34, int r35) throws com.google.android.gms.internal.ads.zzbh {
        /*
            Method dump skipped, instructions count: 1394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzain.zzn(com.google.android.gms.internal.ads.zzed, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzw, com.google.android.gms.internal.ads.zzaii, int):void");
    }
}
