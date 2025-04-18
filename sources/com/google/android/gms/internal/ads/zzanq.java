package com.google.android.gms.internal.ads;

import com.google.android.material.internal.ViewUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
final class zzanq {
    public static zzanp zza(zzej zzejVar) throws zzbo {
        int i2;
        int i3;
        char c2;
        int i4;
        int i5;
        char c3;
        int zzd = zzejVar.zzd(8);
        int i6 = 5;
        int zzd2 = zzejVar.zzd(5);
        if (zzd2 != 31) {
            switch (zzd2) {
                case 0:
                    i2 = 96000;
                    break;
                case 1:
                    i2 = 88200;
                    break;
                case 2:
                    i2 = 64000;
                    break;
                case 3:
                    i2 = 48000;
                    break;
                case 4:
                    i2 = 44100;
                    break;
                case 5:
                    i2 = 32000;
                    break;
                case 6:
                    i2 = 24000;
                    break;
                case 7:
                    i2 = 22050;
                    break;
                case 8:
                    i2 = 16000;
                    break;
                case 9:
                    i2 = 12000;
                    break;
                case 10:
                    i2 = 11025;
                    break;
                case 11:
                    i2 = 8000;
                    break;
                case 12:
                    i2 = 7350;
                    break;
                case 13:
                case 14:
                default:
                    throw zzbo.zzc("Unsupported sampling rate index " + zzd2);
                case 15:
                    i2 = 57600;
                    break;
                case 16:
                    i2 = 51200;
                    break;
                case 17:
                    i2 = 40000;
                    break;
                case 18:
                    i2 = 38400;
                    break;
                case 19:
                    i2 = 34150;
                    break;
                case 20:
                    i2 = 28800;
                    break;
                case 21:
                    i2 = 25600;
                    break;
                case 22:
                    i2 = BrandSafetyUtils.f29185h;
                    break;
                case 23:
                    i2 = 19200;
                    break;
                case 24:
                    i2 = 17075;
                    break;
                case 25:
                    i2 = 14400;
                    break;
                case 26:
                    i2 = 12800;
                    break;
                case 27:
                    i2 = 9600;
                    break;
            }
        } else {
            i2 = zzejVar.zzd(24);
        }
        int zzd3 = zzejVar.zzd(3);
        int i7 = 1;
        if (zzd3 == 0) {
            i3 = ViewUtils.EDGE_TO_EDGE_FLAGS;
        } else if (zzd3 == 1) {
            i3 = 1024;
        } else if (zzd3 == 2 || zzd3 == 3) {
            i3 = Opcodes.ACC_STRICT;
        } else {
            if (zzd3 != 4) {
                throw zzbo.zzc("Unsupported coreSbrFrameLengthIndex " + zzd3);
            }
            i3 = 4096;
        }
        if (zzd3 == 0 || zzd3 == 1) {
            c2 = 0;
        } else if (zzd3 == 2) {
            c2 = 2;
        } else if (zzd3 == 3) {
            c2 = 3;
        } else {
            if (zzd3 != 4) {
                throw zzbo.zzc("Unsupported coreSbrFrameLengthIndex " + zzd3);
            }
            c2 = 1;
        }
        zzejVar.zzn(2);
        zze(zzejVar);
        int zzd4 = zzejVar.zzd(5);
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int i10 = 16;
            if (i8 < zzd4 + 1) {
                int zzd5 = zzejVar.zzd(3);
                i9 += zzc(zzejVar, 5, 8, 16) + 1;
                if ((zzd5 == 0 || zzd5 == 2) && zzejVar.zzp()) {
                    zze(zzejVar);
                }
                i8++;
            } else {
                int zzc = zzc(zzejVar, 4, 8, 16) + 1;
                zzejVar.zzm();
                int i11 = 0;
                while (true) {
                    double d = 2.0d;
                    if (i11 >= zzc) {
                        int i12 = zzd;
                        byte[] bArr = null;
                        if (zzejVar.zzp()) {
                            int zzc2 = zzc(zzejVar, 2, 4, 8) + 1;
                            for (int i13 = 0; i13 < zzc2; i13++) {
                                int zzc3 = zzc(zzejVar, 4, 8, 16);
                                int zzc4 = zzc(zzejVar, 4, 8, 16);
                                if (zzc3 == 7) {
                                    int zzd6 = zzejVar.zzd(4) + 1;
                                    zzejVar.zzn(4);
                                    byte[] bArr2 = new byte[zzd6];
                                    for (int i14 = 0; i14 < zzd6; i14++) {
                                        bArr2[i14] = (byte) zzejVar.zzd(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    zzejVar.zzn(zzc4 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (i2) {
                            case 14700:
                            case 16000:
                                d = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d = 1.0d;
                                break;
                            default:
                                throw zzbo.zzc("Unsupported sampling rate " + i2);
                        }
                        return new zzanp(i12, (int) (i2 * d), (int) (i3 * d), bArr3, null);
                    }
                    int zzd7 = zzejVar.zzd(2);
                    if (zzd7 == 0) {
                        i4 = zzd;
                        zzf(zzejVar);
                        if (c2 > 0) {
                            zzd(zzejVar);
                        }
                    } else if (zzd7 != i7) {
                        if (zzd7 == 3) {
                            zzc(zzejVar, 4, 8, i10);
                            int zzc5 = zzc(zzejVar, 4, 8, i10);
                            if (zzejVar.zzp()) {
                                zzc(zzejVar, 8, i10, 0);
                            }
                            zzejVar.zzm();
                            if (zzc5 > 0) {
                                zzejVar.zzn(zzc5 * 8);
                            }
                        }
                        i4 = zzd;
                    } else {
                        if (zzf(zzejVar)) {
                            zzejVar.zzm();
                        }
                        if (c2 > 0) {
                            zzd(zzejVar);
                            i5 = zzejVar.zzd(2);
                            c3 = c2;
                        } else {
                            i5 = 0;
                            c3 = 0;
                        }
                        if (i5 > 0) {
                            zzejVar.zzn(6);
                            int zzd8 = zzejVar.zzd(2);
                            zzejVar.zzn(4);
                            if (zzejVar.zzp()) {
                                zzejVar.zzn(i6);
                            }
                            if (i5 == 2 || i5 == 3) {
                                zzejVar.zzn(6);
                            }
                            if (zzd8 == 2) {
                                zzejVar.zzm();
                            }
                        }
                        i4 = zzd;
                        int floor = ((int) Math.floor(Math.log(i9 - 1) / Math.log(2.0d))) + 1;
                        int zzd9 = zzejVar.zzd(2);
                        if (zzd9 > 0 && zzejVar.zzp()) {
                            zzejVar.zzn(floor);
                        }
                        if (zzejVar.zzp()) {
                            zzejVar.zzn(floor);
                        }
                        if (c3 == 0 && zzd9 == 0) {
                            zzejVar.zzm();
                        }
                    }
                    i11++;
                    zzd = i4;
                    i6 = 5;
                    i7 = 1;
                    i10 = 16;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zzb(com.google.android.gms.internal.ads.zzej r17, com.google.android.gms.internal.ads.zzann r18) throws com.google.android.gms.internal.ads.zzbo {
        /*
            r0 = r17
            r1 = r18
            r17.zzb()
            r2 = 3
            r3 = 8
            int r2 = zzc(r0, r2, r3, r3)
            r1.zza = r2
            r4 = 0
            r5 = -1
            if (r2 == r5) goto Lc0
            r2 = 2
            int r6 = java.lang.Math.max(r2, r3)
            r7 = 32
            int r6 = java.lang.Math.max(r6, r7)
            r8 = 63
            r9 = 1
            if (r6 > r8) goto L26
            r6 = r9
            goto L27
        L26:
            r6 = r4
        L27:
            com.google.android.gms.internal.ads.zzdi.zzd(r6)
            r10 = 3
            r12 = 255(0xff, double:1.26E-321)
            long r14 = com.google.android.gms.internal.ads.zzgdp.zza(r10, r12)
            r5 = 4294967296(0x100000000, double:2.121995791E-314)
            com.google.android.gms.internal.ads.zzgdp.zza(r14, r5)
            int r5 = r17.zza()
            r14 = -1
            if (r5 >= r2) goto L44
        L42:
            r5 = r14
            goto L6a
        L44:
            long r5 = r0.zze(r2)
            int r16 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r16 != 0) goto L6a
            int r5 = r17.zza()
            if (r5 >= r3) goto L53
            goto L42
        L53:
            long r5 = r0.zze(r3)
            long r10 = r10 + r5
            int r3 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r3 != 0) goto L69
            int r3 = r17.zza()
            if (r3 >= r7) goto L63
            goto L42
        L63:
            long r5 = r0.zze(r7)
            long r5 = r5 + r10
            goto L6a
        L69:
            r5 = r10
        L6a:
            r1.zzb = r5
            int r3 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r3 != 0) goto L71
            return r4
        L71:
            r10 = 16
            int r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r3 > 0) goto Lad
            r10 = 0
            int r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r3 != 0) goto L9e
            int r3 = r1.zza
            r5 = 0
            if (r3 == r9) goto L97
            if (r3 == r2) goto L90
            r2 = 17
            if (r3 == r2) goto L89
            goto L9e
        L89:
            java.lang.String r0 = "AudioTruncation packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r0, r5)
            throw r0
        L90:
            java.lang.String r0 = "Mpegh3daFrame packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r0, r5)
            throw r0
        L97:
            java.lang.String r0 = "Mpegh3daConfig packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r0, r5)
            throw r0
        L9e:
            r2 = 11
            r3 = 24
            int r0 = zzc(r0, r2, r3, r3)
            r1.zzc = r0
            r1 = -1
            if (r0 == r1) goto Lac
            return r9
        Lac:
            return r4
        Lad:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Contains sub-stream with an invalid packet label "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zzc(r0)
            throw r0
        Lc0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanq.zzb(com.google.android.gms.internal.ads.zzej, com.google.android.gms.internal.ads.zzann):boolean");
    }

    private static int zzc(zzej zzejVar, int i2, int i3, int i4) {
        zzdi.zzd(Math.max(Math.max(i2, i3), i4) <= 31);
        int i5 = (1 << i2) - 1;
        int i6 = (1 << i3) - 1;
        zzgdn.zza(zzgdn.zza(i5, i6), 1 << i4);
        if (zzejVar.zza() < i2) {
            return -1;
        }
        int zzd = zzejVar.zzd(i2);
        if (zzd != i5) {
            return zzd;
        }
        if (zzejVar.zza() < i3) {
            return -1;
        }
        int zzd2 = zzejVar.zzd(i3);
        int i7 = zzd + zzd2;
        if (zzd2 != i6) {
            return i7;
        }
        if (zzejVar.zza() < i4) {
            return -1;
        }
        return i7 + zzejVar.zzd(i4);
    }

    private static void zzd(zzej zzejVar) {
        zzejVar.zzn(3);
        zzejVar.zzn(8);
        boolean zzp = zzejVar.zzp();
        boolean zzp2 = zzejVar.zzp();
        if (zzp) {
            zzejVar.zzn(5);
        }
        if (zzp2) {
            zzejVar.zzn(6);
        }
    }

    private static void zze(zzej zzejVar) {
        int zzd;
        int zzd2 = zzejVar.zzd(2);
        if (zzd2 == 0) {
            zzejVar.zzn(6);
            return;
        }
        int zzc = zzc(zzejVar, 5, 8, 16) + 1;
        if (zzd2 == 1) {
            zzejVar.zzn(zzc * 7);
            return;
        }
        if (zzd2 == 2) {
            boolean zzp = zzejVar.zzp();
            int i2 = true != zzp ? 5 : 1;
            int i3 = true == zzp ? 7 : 5;
            int i4 = true == zzp ? 8 : 6;
            int i5 = 0;
            while (i5 < zzc) {
                if (zzejVar.zzp()) {
                    zzejVar.zzn(7);
                    zzd = 0;
                } else {
                    if (zzejVar.zzd(2) == 3 && zzejVar.zzd(i3) * i2 != 0) {
                        zzejVar.zzm();
                    }
                    zzd = zzejVar.zzd(i4) * i2;
                    if (zzd != 0 && zzd != 180) {
                        zzejVar.zzm();
                    }
                    zzejVar.zzm();
                }
                if (zzd != 0 && zzd != 180 && zzejVar.zzp()) {
                    i5++;
                }
                i5++;
            }
        }
    }

    private static boolean zzf(zzej zzejVar) {
        zzejVar.zzn(3);
        boolean zzp = zzejVar.zzp();
        if (zzp) {
            zzejVar.zzn(13);
        }
        return zzp;
    }
}
