package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public final class zzalh implements zzakv {
    private static final byte[] zza = {0, 7, 8, 15};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzala zzg;
    private final zzakz zzh;
    private final zzalg zzi;
    private Bitmap zzj;

    public zzalh(List list) {
        zzek zzekVar = new zzek((byte[]) list.get(0));
        int zzq = zzekVar.zzq();
        int zzq2 = zzekVar.zzq();
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
        this.zzg = new zzala(719, 575, 0, 719, 0, 575);
        this.zzh = new zzakz(0, zzg(), zzh(), zzi());
        this.zzi = new zzalg(zzq, zzq2);
    }

    private static int zzb(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    private static zzakz zzc(zzej zzejVar, int i2) {
        int zzd;
        int zzd2;
        int i3;
        int i4;
        int i5 = 8;
        int zzd3 = zzejVar.zzd(8);
        zzejVar.zzn(8);
        int[] zzg = zzg();
        int[] zzh = zzh();
        int[] zzi = zzi();
        int i6 = i2 - 2;
        while (i6 > 0) {
            int zzd4 = zzejVar.zzd(i5);
            int zzd5 = zzejVar.zzd(i5);
            int[] iArr = (zzd5 & 128) != 0 ? zzg : (zzd5 & 64) != 0 ? zzh : zzi;
            if ((zzd5 & 1) != 0) {
                i3 = zzejVar.zzd(i5);
                i4 = zzejVar.zzd(i5);
                zzd = zzejVar.zzd(i5);
                zzd2 = zzejVar.zzd(i5);
                i6 -= 6;
            } else {
                int zzd6 = zzejVar.zzd(6) << 2;
                int zzd7 = zzejVar.zzd(4) << 4;
                i6 -= 4;
                zzd = zzejVar.zzd(4) << 4;
                zzd2 = zzejVar.zzd(2) << 6;
                i3 = zzd6;
                i4 = zzd7;
            }
            if (i3 == 0) {
                zzd2 = 255;
            }
            if (i3 == 0) {
                zzd = 0;
            }
            if (i3 == 0) {
                i4 = 0;
            }
            double d = i3;
            double d2 = i4 - 128;
            double d3 = zzd - 128;
            iArr[zzd4] = zzb((byte) (255 - (zzd2 & 255)), Math.max(0, Math.min((int) ((1.402d * d2) + d), 255)), Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)), Math.max(0, Math.min((int) ((d3 * 1.772d) + d), 255)));
            zzd3 = zzd3;
            i5 = 8;
        }
        return new zzakz(zzd3, zzg, zzh, zzi);
    }

    private static zzalb zzd(zzej zzejVar) {
        byte[] bArr;
        int zzd = zzejVar.zzd(16);
        zzejVar.zzn(4);
        int zzd2 = zzejVar.zzd(2);
        boolean zzp = zzejVar.zzp();
        zzejVar.zzn(1);
        byte[] bArr2 = zzeu.zzf;
        if (zzd2 == 1) {
            zzejVar.zzn(zzejVar.zzd(8) * 16);
        } else if (zzd2 == 0) {
            int zzd3 = zzejVar.zzd(16);
            int zzd4 = zzejVar.zzd(16);
            if (zzd3 > 0) {
                bArr2 = new byte[zzd3];
                zzejVar.zzi(bArr2, 0, zzd3);
            }
            if (zzd4 > 0) {
                bArr = new byte[zzd4];
                zzejVar.zzi(bArr, 0, zzd4);
                return new zzalb(zzd, zzp, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new zzalb(zzd, zzp, bArr2, bArr);
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalh.zze(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static byte[] zzf(int i2, int i3, zzej zzejVar) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) zzejVar.zzd(i3);
        }
        return bArr;
    }

    private static int[] zzg() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] zzh() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            int i3 = i2 & 4;
            int i4 = i2 & 2;
            int i5 = i2 & 1;
            if (i2 < 8) {
                iArr[i2] = zzb(255, 1 != i5 ? 0 : 255, i4 != 0 ? 255 : 0, i3 != 0 ? 255 : 0);
            } else {
                iArr[i2] = zzb(255, 1 != i5 ? 0 : 127, i4 != 0 ? 127 : 0, i3 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] zzi() {
        int i2;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            if (i3 < 8) {
                iArr[i3] = zzb(63, 1 != (i3 & 1) ? 0 : 255, (i3 & 2) != 0 ? 255 : 0, (i3 & 4) == 0 ? 0 : 255);
            } else {
                int i4 = i3 & Opcodes.L2I;
                int i5 = Opcodes.TABLESWITCH;
                if (i4 == 0) {
                    int i6 = i3 & 16;
                    int i7 = i3 & 32;
                    int i8 = i3 & 2;
                    int i9 = i3 & 64;
                    int i10 = i3 & 4;
                    int i11 = 1 != (i3 & 1) ? 0 : 85;
                    int i12 = i6 != 0 ? 170 : 0;
                    int i13 = i8 != 0 ? 85 : 0;
                    int i14 = i7 != 0 ? 170 : 0;
                    i2 = i10 == 0 ? 0 : 85;
                    if (i9 == 0) {
                        i5 = 0;
                    }
                    iArr[i3] = zzb(255, i11 + i12, i13 + i14, i2 + i5);
                } else if (i4 == 8) {
                    int i15 = i3 & 16;
                    int i16 = i3 & 32;
                    int i17 = i3 & 2;
                    int i18 = i3 & 64;
                    int i19 = i3 & 4;
                    int i20 = 1 != (i3 & 1) ? 0 : 85;
                    int i21 = i15 != 0 ? 170 : 0;
                    int i22 = i17 != 0 ? 85 : 0;
                    int i23 = i16 != 0 ? 170 : 0;
                    i2 = i19 == 0 ? 0 : 85;
                    if (i18 == 0) {
                        i5 = 0;
                    }
                    iArr[i3] = zzb(127, i20 + i21, i22 + i23, i2 + i5);
                } else if (i4 == 128) {
                    iArr[i3] = zzb(255, (1 != (i3 & 1) ? 0 : 43) + 127 + ((i3 & 16) != 0 ? 85 : 0), ((i3 & 2) != 0 ? 43 : 0) + 127 + ((i3 & 32) != 0 ? 85 : 0), ((i3 & 4) == 0 ? 0 : 43) + 127 + ((i3 & 64) == 0 ? 0 : 85));
                } else if (i4 == 136) {
                    iArr[i3] = zzb(255, (1 != (i3 & 1) ? 0 : 43) + ((i3 & 16) != 0 ? 85 : 0), ((i3 & 2) != 0 ? 43 : 0) + ((i3 & 32) != 0 ? 85 : 0), ((i3 & 4) == 0 ? 0 : 43) + ((i3 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ff, code lost:
    
        r3.zzo(r12 - r3.zzb());
     */
    @Override // com.google.android.gms.internal.ads.zzakv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(byte[] r34, int r35, int r36, com.google.android.gms.internal.ads.zzaku r37, com.google.android.gms.internal.ads.zzdn r38) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalh.zza(byte[], int, int, com.google.android.gms.internal.ads.zzaku, com.google.android.gms.internal.ads.zzdn):void");
    }
}
