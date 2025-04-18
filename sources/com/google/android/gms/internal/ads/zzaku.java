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

/* loaded from: classes3.dex */
public final class zzaku implements zzaki {
    private static final byte[] zza = {0, 7, 8, Ascii.SI};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzakn zzg;
    private final zzakm zzh;
    private final zzakt zzi;
    private Bitmap zzj;

    public zzaku(List list) {
        zzed zzedVar = new zzed((byte[]) list.get(0));
        int zzq = zzedVar.zzq();
        int zzq2 = zzedVar.zzq();
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
        this.zzg = new zzakn(719, 575, 0, 719, 0, 575);
        this.zzh = new zzakm(0, zzg(), zzh(), zzi());
        this.zzi = new zzakt(zzq, zzq2);
    }

    private static int zzb(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    private static zzakm zzc(zzec zzecVar, int i10) {
        int[] iArr;
        int zzd;
        int zzd2;
        int i11;
        int i12;
        int i13 = 8;
        int zzd3 = zzecVar.zzd(8);
        zzecVar.zzn(8);
        int[] zzg = zzg();
        int[] zzh = zzh();
        int[] zzi = zzi();
        int i14 = i10 - 2;
        while (i14 > 0) {
            int zzd4 = zzecVar.zzd(i13);
            int zzd5 = zzecVar.zzd(i13);
            int i15 = i14 - 2;
            if ((zzd5 & 128) != 0) {
                iArr = zzg;
            } else if ((zzd5 & 64) != 0) {
                iArr = zzh;
            } else {
                iArr = zzi;
            }
            if ((zzd5 & 1) != 0) {
                i11 = zzecVar.zzd(i13);
                i12 = zzecVar.zzd(i13);
                zzd = zzecVar.zzd(i13);
                zzd2 = zzecVar.zzd(i13);
                i14 = i15 - 4;
            } else {
                int zzd6 = zzecVar.zzd(6) << 2;
                int zzd7 = zzecVar.zzd(4) << 4;
                i14 = i15 - 2;
                zzd = zzecVar.zzd(4) << 4;
                zzd2 = zzecVar.zzd(2) << 6;
                i11 = zzd6;
                i12 = zzd7;
            }
            if (i11 == 0) {
                zzd2 = 255;
            }
            if (i11 == 0) {
                zzd = 0;
            }
            if (i11 == 0) {
                i12 = 0;
            }
            double d10 = i11;
            double d11 = i12 - 128;
            double d12 = zzd - 128;
            iArr[zzd4] = zzb((byte) (255 - (zzd2 & 255)), Math.max(0, Math.min((int) ((1.402d * d11) + d10), 255)), Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 255)), Math.max(0, Math.min((int) ((d12 * 1.772d) + d10), 255)));
            zzd3 = zzd3;
            i13 = 8;
        }
        return new zzakm(zzd3, zzg, zzh, zzi);
    }

    private static zzako zzd(zzec zzecVar) {
        byte[] bArr;
        int zzd = zzecVar.zzd(16);
        zzecVar.zzn(4);
        int zzd2 = zzecVar.zzd(2);
        boolean zzp = zzecVar.zzp();
        zzecVar.zzn(1);
        byte[] bArr2 = zzen.zzf;
        if (zzd2 == 1) {
            zzecVar.zzn(zzecVar.zzd(8) * 16);
        } else if (zzd2 == 0) {
            int zzd3 = zzecVar.zzd(16);
            int zzd4 = zzecVar.zzd(16);
            if (zzd3 > 0) {
                bArr2 = new byte[zzd3];
                zzecVar.zzi(bArr2, 0, zzd3);
            }
            if (zzd4 > 0) {
                bArr = new byte[zzd4];
                zzecVar.zzi(bArr, 0, zzd4);
                return new zzako(zzd, zzp, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new zzako(zzd, zzp, bArr2, bArr);
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaku.zze(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static byte[] zzf(int i10, int i11, zzec zzecVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) zzecVar.zzd(i11);
        }
        return bArr;
    }

    private static int[] zzg() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    private static int[] zzh() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i15 = 1; i15 < 16; i15++) {
            int i16 = i15 & 4;
            int i17 = i15 & 2;
            int i18 = i15 & 1;
            if (i15 < 8) {
                if (1 != i18) {
                    i12 = 0;
                } else {
                    i12 = 255;
                }
                if (i17 != 0) {
                    i13 = 255;
                } else {
                    i13 = 0;
                }
                if (i16 != 0) {
                    i14 = 255;
                } else {
                    i14 = 0;
                }
                iArr[i15] = zzb(255, i12, i13, i14);
            } else {
                int i19 = 127;
                if (1 != i18) {
                    i10 = 0;
                } else {
                    i10 = 127;
                }
                if (i17 != 0) {
                    i11 = 127;
                } else {
                    i11 = 0;
                }
                if (i16 == 0) {
                    i19 = 0;
                }
                iArr[i15] = zzb(255, i10, i11, i19);
            }
        }
        return iArr;
    }

    private static int[] zzi() {
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
        int i27;
        int[] iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        iArr[0] = 0;
        for (int i28 = 0; i28 < 256; i28++) {
            int i29 = 255;
            if (i28 < 8) {
                int i30 = i28 & 2;
                int i31 = i28 & 4;
                if (1 != (i28 & 1)) {
                    i26 = 0;
                } else {
                    i26 = 255;
                }
                if (i30 != 0) {
                    i27 = 255;
                } else {
                    i27 = 0;
                }
                if (i31 == 0) {
                    i29 = 0;
                }
                iArr[i28] = zzb(63, i26, i27, i29);
            } else {
                int i32 = i28 & 136;
                int i33 = 170;
                int i34 = 85;
                if (i32 != 0) {
                    if (i32 != 8) {
                        int i35 = 43;
                        if (i32 != 128) {
                            if (i32 == 136) {
                                int i36 = i28 & 16;
                                int i37 = i28 & 32;
                                int i38 = i28 & 2;
                                int i39 = i28 & 64;
                                int i40 = i28 & 4;
                                if (1 != (i28 & 1)) {
                                    i22 = 0;
                                } else {
                                    i22 = 43;
                                }
                                if (i36 != 0) {
                                    i23 = 85;
                                } else {
                                    i23 = 0;
                                }
                                if (i38 != 0) {
                                    i24 = 43;
                                } else {
                                    i24 = 0;
                                }
                                if (i37 != 0) {
                                    i25 = 85;
                                } else {
                                    i25 = 0;
                                }
                                if (i40 == 0) {
                                    i35 = 0;
                                }
                                if (i39 == 0) {
                                    i34 = 0;
                                }
                                iArr[i28] = zzb(255, i22 + i23, i24 + i25, i35 + i34);
                            }
                        } else {
                            int i41 = i28 & 16;
                            int i42 = i28 & 32;
                            int i43 = i28 & 2;
                            int i44 = i28 & 64;
                            int i45 = i28 & 4;
                            if (1 != (i28 & 1)) {
                                i18 = 0;
                            } else {
                                i18 = 43;
                            }
                            int i46 = i18 + 127;
                            if (i41 != 0) {
                                i19 = 85;
                            } else {
                                i19 = 0;
                            }
                            if (i43 != 0) {
                                i20 = 43;
                            } else {
                                i20 = 0;
                            }
                            int i47 = i20 + 127;
                            if (i42 != 0) {
                                i21 = 85;
                            } else {
                                i21 = 0;
                            }
                            if (i45 == 0) {
                                i35 = 0;
                            }
                            int i48 = i35 + 127;
                            if (i44 == 0) {
                                i34 = 0;
                            }
                            iArr[i28] = zzb(255, i46 + i19, i47 + i21, i48 + i34);
                        }
                    } else {
                        int i49 = i28 & 16;
                        int i50 = i28 & 32;
                        int i51 = i28 & 2;
                        int i52 = i28 & 64;
                        int i53 = i28 & 4;
                        if (1 != (i28 & 1)) {
                            i14 = 0;
                        } else {
                            i14 = 85;
                        }
                        if (i49 != 0) {
                            i15 = 170;
                        } else {
                            i15 = 0;
                        }
                        if (i51 != 0) {
                            i16 = 85;
                        } else {
                            i16 = 0;
                        }
                        if (i50 != 0) {
                            i17 = 170;
                        } else {
                            i17 = 0;
                        }
                        if (i53 == 0) {
                            i34 = 0;
                        }
                        if (i52 == 0) {
                            i33 = 0;
                        }
                        iArr[i28] = zzb(127, i14 + i15, i16 + i17, i34 + i33);
                    }
                } else {
                    int i54 = i28 & 16;
                    int i55 = i28 & 32;
                    int i56 = i28 & 2;
                    int i57 = i28 & 64;
                    int i58 = i28 & 4;
                    if (1 != (i28 & 1)) {
                        i10 = 0;
                    } else {
                        i10 = 85;
                    }
                    if (i54 != 0) {
                        i11 = 170;
                    } else {
                        i11 = 0;
                    }
                    if (i56 != 0) {
                        i12 = 85;
                    } else {
                        i12 = 0;
                    }
                    if (i55 != 0) {
                        i13 = 170;
                    } else {
                        i13 = 0;
                    }
                    if (i58 == 0) {
                        i34 = 0;
                    }
                    if (i57 == 0) {
                        i33 = 0;
                    }
                    iArr[i28] = zzb(255, i10 + i11, i12 + i13, i34 + i33);
                }
            }
        }
        return iArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01fe, code lost:
    
        r3.zzo(r12 - r3.zzb());
     */
    @Override // com.google.android.gms.internal.ads.zzaki
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(byte[] r34, int r35, int r36, com.google.android.gms.internal.ads.zzakh r37, com.google.android.gms.internal.ads.zzdg r38) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaku.zza(byte[], int, int, com.google.android.gms.internal.ads.zzakh, com.google.android.gms.internal.ads.zzdg):void");
    }
}
