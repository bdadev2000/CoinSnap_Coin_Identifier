package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzamh implements zzalv {
    private static final byte[] zza = {0, 7, 8, Ascii.SI};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzama zzg;
    private final zzalz zzh;
    private final zzamg zzi;
    private Bitmap zzj;

    public zzamh(List list) {
        zzfu zzfuVar = new zzfu((byte[]) list.get(0));
        int zzq = zzfuVar.zzq();
        int zzq2 = zzfuVar.zzq();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zzf = new Canvas();
        this.zzg = new zzama(719, 575, 0, 719, 0, 575);
        this.zzh = new zzalz(0, zzg(), zzh(), zzi());
        this.zzi = new zzamg(zzq, zzq2);
    }

    private static int zzb(int i9, int i10, int i11, int i12) {
        return (i9 << 24) | (i10 << 16) | (i11 << 8) | i12;
    }

    private static zzalz zzc(zzft zzftVar, int i9) {
        int[] iArr;
        int zzd;
        int zzd2;
        int i10;
        int i11;
        int i12 = 8;
        int zzd3 = zzftVar.zzd(8);
        zzftVar.zzm(8);
        int[] zzg = zzg();
        int[] zzh = zzh();
        int[] zzi = zzi();
        int i13 = i9 - 2;
        while (i13 > 0) {
            int zzd4 = zzftVar.zzd(i12);
            int zzd5 = zzftVar.zzd(i12);
            if ((zzd5 & 128) != 0) {
                iArr = zzg;
            } else if ((zzd5 & 64) != 0) {
                iArr = zzh;
            } else {
                iArr = zzi;
            }
            if ((zzd5 & 1) != 0) {
                i10 = zzftVar.zzd(i12);
                i11 = zzftVar.zzd(i12);
                zzd = zzftVar.zzd(i12);
                zzd2 = zzftVar.zzd(i12);
                i13 -= 6;
            } else {
                int zzd6 = zzftVar.zzd(6) << 2;
                int zzd7 = zzftVar.zzd(4) << 4;
                i13 -= 4;
                zzd = zzftVar.zzd(4) << 4;
                zzd2 = zzftVar.zzd(2) << 6;
                i10 = zzd6;
                i11 = zzd7;
            }
            if (i10 == 0) {
                zzd2 = 255;
            }
            if (i10 == 0) {
                zzd = 0;
            }
            if (i10 == 0) {
                i11 = 0;
            }
            double d2 = i10;
            double d9 = i11 - 128;
            double d10 = zzd - 128;
            iArr[zzd4] = zzb((byte) (255 - (zzd2 & 255)), Math.max(0, Math.min((int) ((1.402d * d9) + d2), 255)), Math.max(0, Math.min((int) ((d2 - (0.34414d * d10)) - (d9 * 0.71414d)), 255)), Math.max(0, Math.min((int) ((d10 * 1.772d) + d2), 255)));
            zzd3 = zzd3;
            i12 = 8;
        }
        return new zzalz(zzd3, zzg, zzh, zzi);
    }

    private static zzamb zzd(zzft zzftVar) {
        byte[] bArr;
        int zzd = zzftVar.zzd(16);
        zzftVar.zzm(4);
        int zzd2 = zzftVar.zzd(2);
        boolean zzo = zzftVar.zzo();
        zzftVar.zzm(1);
        byte[] bArr2 = zzgd.zzf;
        if (zzd2 == 1) {
            zzftVar.zzm(zzftVar.zzd(8) * 16);
        } else if (zzd2 == 0) {
            int zzd3 = zzftVar.zzd(16);
            int zzd4 = zzftVar.zzd(16);
            if (zzd3 > 0) {
                bArr2 = new byte[zzd3];
                zzftVar.zzh(bArr2, 0, zzd3);
            }
            if (zzd4 > 0) {
                bArr = new byte[zzd4];
                zzftVar.zzh(bArr, 0, zzd4);
                return new zzamb(zzd, zzo, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new zzamb(zzd, zzo, bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0228 A[LOOP:3: B:88:0x0172->B:101:0x0228, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ef A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zze(byte[] r24, int[] r25, int r26, int r27, int r28, @androidx.annotation.Nullable android.graphics.Paint r29, android.graphics.Canvas r30) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamh.zze(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static byte[] zzf(int i9, int i10, zzft zzftVar) {
        byte[] bArr = new byte[i9];
        for (int i11 = 0; i11 < i9; i11++) {
            bArr[i11] = (byte) zzftVar.zzd(i10);
        }
        return bArr;
    }

    private static int[] zzg() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    private static int[] zzh() {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i14 = 1; i14 < 16; i14++) {
            int i15 = i14 & 4;
            int i16 = i14 & 2;
            int i17 = i14 & 1;
            if (i14 < 8) {
                if (1 != i17) {
                    i11 = 0;
                } else {
                    i11 = 255;
                }
                if (i16 != 0) {
                    i12 = 255;
                } else {
                    i12 = 0;
                }
                if (i15 != 0) {
                    i13 = 255;
                } else {
                    i13 = 0;
                }
                iArr[i14] = zzb(255, i11, i12, i13);
            } else {
                int i18 = 127;
                if (1 != i17) {
                    i9 = 0;
                } else {
                    i9 = 127;
                }
                if (i16 != 0) {
                    i10 = 127;
                } else {
                    i10 = 0;
                }
                if (i15 == 0) {
                    i18 = 0;
                }
                iArr[i14] = zzb(255, i9, i10, i18);
            }
        }
        return iArr;
    }

    private static int[] zzi() {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int[] iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        iArr[0] = 0;
        for (int i27 = 0; i27 < 256; i27++) {
            int i28 = 255;
            if (i27 < 8) {
                int i29 = i27 & 2;
                int i30 = i27 & 4;
                if (1 != (i27 & 1)) {
                    i25 = 0;
                } else {
                    i25 = 255;
                }
                if (i29 != 0) {
                    i26 = 255;
                } else {
                    i26 = 0;
                }
                if (i30 == 0) {
                    i28 = 0;
                }
                iArr[i27] = zzb(63, i25, i26, i28);
            } else {
                int i31 = i27 & 136;
                int i32 = 170;
                int i33 = 85;
                if (i31 != 0) {
                    if (i31 != 8) {
                        int i34 = 43;
                        if (i31 != 128) {
                            if (i31 == 136) {
                                int i35 = i27 & 16;
                                int i36 = i27 & 32;
                                int i37 = i27 & 2;
                                int i38 = i27 & 64;
                                int i39 = i27 & 4;
                                if (1 != (i27 & 1)) {
                                    i21 = 0;
                                } else {
                                    i21 = 43;
                                }
                                if (i35 != 0) {
                                    i22 = 85;
                                } else {
                                    i22 = 0;
                                }
                                if (i37 != 0) {
                                    i23 = 43;
                                } else {
                                    i23 = 0;
                                }
                                if (i36 != 0) {
                                    i24 = 85;
                                } else {
                                    i24 = 0;
                                }
                                if (i39 == 0) {
                                    i34 = 0;
                                }
                                if (i38 == 0) {
                                    i33 = 0;
                                }
                                iArr[i27] = zzb(255, i21 + i22, i23 + i24, i34 + i33);
                            }
                        } else {
                            int i40 = i27 & 16;
                            int i41 = i27 & 32;
                            int i42 = i27 & 2;
                            int i43 = i27 & 64;
                            int i44 = i27 & 4;
                            if (1 != (i27 & 1)) {
                                i17 = 0;
                            } else {
                                i17 = 43;
                            }
                            int i45 = i17 + 127;
                            if (i40 != 0) {
                                i18 = 85;
                            } else {
                                i18 = 0;
                            }
                            if (i42 != 0) {
                                i19 = 43;
                            } else {
                                i19 = 0;
                            }
                            int i46 = i19 + 127;
                            if (i41 != 0) {
                                i20 = 85;
                            } else {
                                i20 = 0;
                            }
                            if (i44 == 0) {
                                i34 = 0;
                            }
                            int i47 = i34 + 127;
                            if (i43 == 0) {
                                i33 = 0;
                            }
                            iArr[i27] = zzb(255, i45 + i18, i46 + i20, i47 + i33);
                        }
                    } else {
                        int i48 = i27 & 16;
                        int i49 = i27 & 32;
                        int i50 = i27 & 2;
                        int i51 = i27 & 64;
                        int i52 = i27 & 4;
                        if (1 != (i27 & 1)) {
                            i13 = 0;
                        } else {
                            i13 = 85;
                        }
                        if (i48 != 0) {
                            i14 = 170;
                        } else {
                            i14 = 0;
                        }
                        if (i50 != 0) {
                            i15 = 85;
                        } else {
                            i15 = 0;
                        }
                        if (i49 != 0) {
                            i16 = 170;
                        } else {
                            i16 = 0;
                        }
                        if (i52 == 0) {
                            i33 = 0;
                        }
                        if (i51 == 0) {
                            i32 = 0;
                        }
                        iArr[i27] = zzb(127, i13 + i14, i15 + i16, i33 + i32);
                    }
                } else {
                    int i53 = i27 & 16;
                    int i54 = i27 & 32;
                    int i55 = i27 & 2;
                    int i56 = i27 & 64;
                    int i57 = i27 & 4;
                    if (1 != (i27 & 1)) {
                        i9 = 0;
                    } else {
                        i9 = 85;
                    }
                    if (i53 != 0) {
                        i10 = 170;
                    } else {
                        i10 = 0;
                    }
                    if (i55 != 0) {
                        i11 = 85;
                    } else {
                        i11 = 0;
                    }
                    if (i54 != 0) {
                        i12 = 170;
                    } else {
                        i12 = 0;
                    }
                    if (i57 == 0) {
                        i33 = 0;
                    }
                    if (i56 == 0) {
                        i32 = 0;
                    }
                    iArr[i27] = zzb(255, i9 + i10, i11 + i12, i33 + i32);
                }
            }
        }
        return iArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ff, code lost:
    
        r3.zzn(r12 - r3.zzb());
     */
    @Override // com.google.android.gms.internal.ads.zzalv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(byte[] r34, int r35, int r36, com.google.android.gms.internal.ads.zzalu r37, com.google.android.gms.internal.ads.zzev r38) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamh.zza(byte[], int, int, com.google.android.gms.internal.ads.zzalu, com.google.android.gms.internal.ads.zzev):void");
    }
}
