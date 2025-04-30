package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.applovin.impl.L;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzajw {
    private static final byte[] zza;

    static {
        int i9 = zzgd.zza;
        zza = "OpusHead".getBytes(zzfxs.zzc);
    }

    @Nullable
    public static zzcd zza(zzajm zzajmVar) {
        zzgh zzghVar;
        zzajn zzb = zzajmVar.zzb(1751411826);
        zzajn zzb2 = zzajmVar.zzb(1801812339);
        zzajn zzb3 = zzajmVar.zzb(1768715124);
        if (zzb != null && zzb2 != null && zzb3 != null && zzg(zzb.zza) == 1835299937) {
            zzfu zzfuVar = zzb2.zza;
            zzfuVar.zzK(12);
            int zzg = zzfuVar.zzg();
            String[] strArr = new String[zzg];
            for (int i9 = 0; i9 < zzg; i9++) {
                int zzg2 = zzfuVar.zzg();
                zzfuVar.zzL(4);
                strArr[i9] = zzfuVar.zzA(zzg2 - 8, zzfxs.zzc);
            }
            zzfu zzfuVar2 = zzb3.zza;
            zzfuVar2.zzK(8);
            ArrayList arrayList = new ArrayList();
            while (zzfuVar2.zzb() > 8) {
                int zzg3 = zzfuVar2.zzg() + zzfuVar2.zzd();
                int zzg4 = zzfuVar2.zzg() - 1;
                if (zzg4 >= 0 && zzg4 < zzg) {
                    String str = strArr[zzg4];
                    while (true) {
                        int zzd = zzfuVar2.zzd();
                        if (zzd < zzg3) {
                            int zzg5 = zzfuVar2.zzg();
                            if (zzfuVar2.zzg() == 1684108385) {
                                int zzg6 = zzfuVar2.zzg();
                                int zzg7 = zzfuVar2.zzg();
                                int i10 = zzg5 - 16;
                                byte[] bArr = new byte[i10];
                                zzfuVar2.zzG(bArr, 0, i10);
                                zzghVar = new zzgh(str, bArr, zzg7, zzg6);
                                break;
                            }
                            zzfuVar2.zzK(zzd + zzg5);
                        } else {
                            zzghVar = null;
                            break;
                        }
                    }
                    if (zzghVar != null) {
                        arrayList.add(zzghVar);
                    }
                } else {
                    L.z(zzg4, "Skipped metadata with unknown key index: ", "AtomParsers");
                }
                zzfuVar2.zzK(zzg3);
            }
            if (!arrayList.isEmpty()) {
                return new zzcd(arrayList);
            }
        }
        return null;
    }

    public static zzcd zzb(zzajn zzajnVar) {
        int zzn;
        zzfu zzfuVar = zzajnVar.zza;
        zzfuVar.zzK(8);
        zzcd zzcdVar = new zzcd(C.TIME_UNSET, new zzcc[0]);
        while (zzfuVar.zzb() >= 8) {
            int zzd = zzfuVar.zzd();
            int zzg = zzfuVar.zzg() + zzd;
            int zzg2 = zzfuVar.zzg();
            zzcd zzcdVar2 = null;
            if (zzg2 == 1835365473) {
                zzfuVar.zzK(zzd);
                zzfuVar.zzL(8);
                zze(zzfuVar);
                while (true) {
                    if (zzfuVar.zzd() >= zzg) {
                        break;
                    }
                    int zzd2 = zzfuVar.zzd();
                    int zzg3 = zzfuVar.zzg() + zzd2;
                    if (zzfuVar.zzg() == 1768715124) {
                        zzfuVar.zzK(zzd2);
                        zzfuVar.zzL(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzfuVar.zzd() < zzg3) {
                            zzcc zza2 = zzakf.zza(zzfuVar);
                            if (zza2 != null) {
                                arrayList.add(zza2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzcdVar2 = new zzcd(arrayList);
                        }
                    } else {
                        zzfuVar.zzK(zzg3);
                    }
                }
                zzcdVar = zzcdVar.zzd(zzcdVar2);
            } else if (zzg2 == 1936553057) {
                zzfuVar.zzK(zzd);
                zzfuVar.zzL(12);
                while (true) {
                    if (zzfuVar.zzd() >= zzg) {
                        break;
                    }
                    int zzd3 = zzfuVar.zzd();
                    int zzg4 = zzfuVar.zzg();
                    if (zzfuVar.zzg() == 1935766900) {
                        if (zzg4 >= 16) {
                            zzfuVar.zzL(4);
                            int i9 = -1;
                            int i10 = 0;
                            for (int i11 = 0; i11 < 2; i11++) {
                                int zzm = zzfuVar.zzm();
                                int zzm2 = zzfuVar.zzm();
                                if (zzm == 0) {
                                    i9 = zzm2;
                                } else if (zzm == 1) {
                                    i10 = zzm2;
                                }
                            }
                            if (i9 == 12) {
                                zzn = PsExtractor.VIDEO_STREAM_MASK;
                            } else if (i9 == 13) {
                                zzn = 120;
                            } else {
                                if (i9 == 21 && zzfuVar.zzb() >= 8 && zzfuVar.zzd() + 8 <= zzg) {
                                    int zzg5 = zzfuVar.zzg();
                                    int zzg6 = zzfuVar.zzg();
                                    if (zzg5 >= 12 && zzg6 == 1936877170) {
                                        zzn = zzfuVar.zzn();
                                    }
                                }
                                zzn = -2147483647;
                            }
                            if (zzn != -2147483647) {
                                zzcdVar2 = new zzcd(C.TIME_UNSET, new zzaim(zzn, i10));
                            }
                        }
                    } else {
                        zzfuVar.zzK(zzd3 + zzg4);
                    }
                }
                zzcdVar = zzcdVar.zzd(zzcdVar2);
            } else if (zzg2 == -1451722374) {
                zzcdVar = zzcdVar.zzd(zzi(zzfuVar));
            }
            zzfuVar.zzK(zzg);
        }
        return zzcdVar;
    }

    public static zzgn zzc(zzfu zzfuVar) {
        long zzt;
        long zzt2;
        zzfuVar.zzK(8);
        if (zzajo.zze(zzfuVar.zzg()) == 0) {
            zzt = zzfuVar.zzu();
            zzt2 = zzfuVar.zzu();
        } else {
            zzt = zzfuVar.zzt();
            zzt2 = zzfuVar.zzt();
        }
        return new zzgn(zzt, zzt2, zzfuVar.zzu());
    }

    /* JADX WARN: Code restructure failed: missing block: B:338:0x0754, code lost:
    
        if (r15 == 1) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0730, code lost:
    
        if (r8.zzd(1) > 0) goto L354;
     */
    /* JADX WARN: Removed duplicated region for block: B:265:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x098b  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0b03  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0b07  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0b6d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:511:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List zzd(com.google.android.gms.internal.ads.zzajm r56, com.google.android.gms.internal.ads.zzaej r57, long r58, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzae r60, boolean r61, boolean r62, com.google.android.gms.internal.ads.zzfxu r63) throws com.google.android.gms.internal.ads.zzch {
        /*
            Method dump skipped, instructions count: 2935
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajw.zzd(com.google.android.gms.internal.ads.zzajm, com.google.android.gms.internal.ads.zzaej, long, com.google.android.gms.internal.ads.zzae, boolean, boolean, com.google.android.gms.internal.ads.zzfxu):java.util.List");
    }

    public static void zze(zzfu zzfuVar) {
        int zzd = zzfuVar.zzd();
        zzfuVar.zzL(4);
        if (zzfuVar.zzg() != 1751411826) {
            zzd += 4;
        }
        zzfuVar.zzK(zzd);
    }

    private static int zzf(zzfu zzfuVar) {
        int zzm = zzfuVar.zzm();
        int i9 = zzm & 127;
        while ((zzm & 128) == 128) {
            zzm = zzfuVar.zzm();
            i9 = (i9 << 7) | (zzm & 127);
        }
        return i9;
    }

    private static int zzg(zzfu zzfuVar) {
        zzfuVar.zzK(16);
        return zzfuVar.zzg();
    }

    @Nullable
    private static Pair zzh(zzfu zzfuVar, int i9, int i10) throws zzch {
        boolean z8;
        boolean z9;
        boolean z10;
        Integer num;
        zzakq zzakqVar;
        Pair create;
        int i11;
        int i12;
        boolean z11;
        byte[] bArr;
        int zzd = zzfuVar.zzd();
        while (zzd - i9 < i10) {
            zzfuVar.zzK(zzd);
            int zzg = zzfuVar.zzg();
            boolean z12 = true;
            if (zzg > 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            zzady.zzb(z8, "childAtomSize must be positive");
            if (zzfuVar.zzg() == 1936289382) {
                int i13 = zzd + 8;
                int i14 = 0;
                int i15 = -1;
                String str = null;
                Integer num2 = null;
                while (i13 - zzd < zzg) {
                    zzfuVar.zzK(i13);
                    int zzg2 = zzfuVar.zzg();
                    int zzg3 = zzfuVar.zzg();
                    if (zzg3 == 1718775137) {
                        num2 = Integer.valueOf(zzfuVar.zzg());
                    } else if (zzg3 == 1935894637) {
                        zzfuVar.zzL(4);
                        str = zzfuVar.zzA(4, zzfxs.zzc);
                    } else if (zzg3 == 1935894633) {
                        i15 = i13;
                        i14 = zzg2;
                    }
                    i13 += zzg2;
                }
                if (!C.CENC_TYPE_cenc.equals(str) && !C.CENC_TYPE_cbc1.equals(str) && !C.CENC_TYPE_cens.equals(str) && !C.CENC_TYPE_cbcs.equals(str)) {
                    create = null;
                } else {
                    if (num2 != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    zzady.zzb(z9, "frma atom is mandatory");
                    if (i15 != -1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zzady.zzb(z10, "schi atom is mandatory");
                    int i16 = i15 + 8;
                    while (true) {
                        if (i16 - i15 < i14) {
                            zzfuVar.zzK(i16);
                            int zzg4 = zzfuVar.zzg();
                            if (zzfuVar.zzg() == 1952804451) {
                                int zze = zzajo.zze(zzfuVar.zzg());
                                zzfuVar.zzL(1);
                                if (zze == 0) {
                                    zzfuVar.zzL(1);
                                    i11 = 0;
                                    i12 = 0;
                                } else {
                                    int zzm = zzfuVar.zzm();
                                    int i17 = (zzm & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                                    i11 = zzm & 15;
                                    i12 = i17;
                                }
                                if (zzfuVar.zzm() == 1) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                int zzm2 = zzfuVar.zzm();
                                byte[] bArr2 = new byte[16];
                                zzfuVar.zzG(bArr2, 0, 16);
                                if (z11 && zzm2 == 0) {
                                    int zzm3 = zzfuVar.zzm();
                                    byte[] bArr3 = new byte[zzm3];
                                    zzfuVar.zzG(bArr3, 0, zzm3);
                                    bArr = bArr3;
                                } else {
                                    bArr = null;
                                }
                                num = num2;
                                zzakqVar = new zzakq(z11, str, zzm2, bArr2, i12, i11, bArr);
                            } else {
                                i16 += zzg4;
                            }
                        } else {
                            num = num2;
                            zzakqVar = null;
                            break;
                        }
                    }
                    if (zzakqVar == null) {
                        z12 = false;
                    }
                    zzady.zzb(z12, "tenc atom is mandatory");
                    int i18 = zzgd.zza;
                    create = Pair.create(num, zzakqVar);
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
    private static zzcd zzi(zzfu zzfuVar) {
        short zzD = zzfuVar.zzD();
        zzfuVar.zzL(2);
        String zzA = zzfuVar.zzA(zzD, zzfxs.zzc);
        int max = Math.max(zzA.lastIndexOf(43), zzA.lastIndexOf(45));
        try {
            return new zzcd(C.TIME_UNSET, new zzgk(Float.parseFloat(zzA.substring(0, max)), Float.parseFloat(zzA.substring(max, zzA.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static zzajq zzj(zzfu zzfuVar, int i9) {
        long j7;
        long j9;
        zzfuVar.zzK(i9 + 12);
        zzfuVar.zzL(1);
        zzf(zzfuVar);
        zzfuVar.zzL(2);
        int zzm = zzfuVar.zzm();
        if ((zzm & 128) != 0) {
            zzfuVar.zzL(2);
        }
        if ((zzm & 64) != 0) {
            zzfuVar.zzL(zzfuVar.zzm());
        }
        if ((zzm & 32) != 0) {
            zzfuVar.zzL(2);
        }
        zzfuVar.zzL(1);
        zzf(zzfuVar);
        String zzd = zzcg.zzd(zzfuVar.zzm());
        if (!MimeTypes.AUDIO_MPEG.equals(zzd) && !MimeTypes.AUDIO_DTS.equals(zzd) && !MimeTypes.AUDIO_DTS_HD.equals(zzd)) {
            zzfuVar.zzL(4);
            long zzu = zzfuVar.zzu();
            long zzu2 = zzfuVar.zzu();
            zzfuVar.zzL(1);
            int zzf = zzf(zzfuVar);
            byte[] bArr = new byte[zzf];
            zzfuVar.zzG(bArr, 0, zzf);
            if (zzu2 <= 0) {
                j7 = -1;
            } else {
                j7 = zzu2;
            }
            if (zzu > 0) {
                j9 = zzu;
            } else {
                j9 = -1;
            }
            return new zzajq(zzd, bArr, j7, j9);
        }
        return new zzajq(zzd, null, -1L, -1L);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x04c5 A[EDGE_INSN: B:114:0x04c5->B:115:0x04c5 BREAK  A[LOOP:5: B:94:0x0463->B:110:0x04bf], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0468  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzaks zzk(com.google.android.gms.internal.ads.zzakp r36, com.google.android.gms.internal.ads.zzajm r37, com.google.android.gms.internal.ads.zzaej r38) throws com.google.android.gms.internal.ads.zzch {
        /*
            Method dump skipped, instructions count: 1483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajw.zzk(com.google.android.gms.internal.ads.zzakp, com.google.android.gms.internal.ads.zzajm, com.google.android.gms.internal.ads.zzaej):com.google.android.gms.internal.ads.zzaks");
    }

    private static ByteBuffer zzl() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzm(com.google.android.gms.internal.ads.zzfu r26, int r27, int r28, int r29, int r30, java.lang.String r31, boolean r32, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzae r33, com.google.android.gms.internal.ads.zzajs r34, int r35) throws com.google.android.gms.internal.ads.zzch {
        /*
            Method dump skipped, instructions count: 1385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajw.zzm(com.google.android.gms.internal.ads.zzfu, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzae, com.google.android.gms.internal.ads.zzajs, int):void");
    }
}
