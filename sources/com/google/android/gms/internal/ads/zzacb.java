package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public final class zzacb {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, Opcodes.IF_ICMPNE, Opcodes.CHECKCAST, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, Opcodes.LSHL, Opcodes.F2I, Opcodes.FRETURN, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int zza(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return zzb[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int zzb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b2 = bArr[4];
            return zzf((b2 & 192) >> 6, b2 & Utf8.REPLACEMENT_BYTE);
        }
        int i2 = bArr[2] & 7;
        int i3 = ((bArr[3] & UnsignedBytes.MAX_VALUE) | (i2 << 8)) + 1;
        return i3 + i3;
    }

    public static zzaf zzc(zzek zzekVar, String str, String str2, @Nullable zzy zzyVar) {
        zzej zzejVar = new zzej();
        zzejVar.zzj(zzekVar);
        int i2 = zzc[zzejVar.zzd(2)];
        zzejVar.zzn(8);
        int i3 = zze[zzejVar.zzd(3)];
        if (zzejVar.zzd(1) != 0) {
            i3++;
        }
        int i4 = zzf[zzejVar.zzd(5)] * 1000;
        zzejVar.zzf();
        zzekVar.zzL(zzejVar.zzb());
        zzad zzadVar = new zzad();
        zzadVar.zzL(str);
        zzadVar.zzZ("audio/ac3");
        zzadVar.zzz(i3);
        zzadVar.zzaa(i2);
        zzadVar.zzF(zzyVar);
        zzadVar.zzP(str2);
        zzadVar.zzy(i4);
        zzadVar.zzU(i4);
        return zzadVar.zzaf();
    }

    public static zzaf zzd(zzek zzekVar, String str, String str2, @Nullable zzy zzyVar) {
        String str3;
        zzej zzejVar = new zzej();
        zzejVar.zzj(zzekVar);
        int zzd2 = zzejVar.zzd(13) * 1000;
        zzejVar.zzn(3);
        int i2 = zzc[zzejVar.zzd(2)];
        zzejVar.zzn(10);
        int i3 = zze[zzejVar.zzd(3)];
        if (zzejVar.zzd(1) != 0) {
            i3++;
        }
        zzejVar.zzn(3);
        int zzd3 = zzejVar.zzd(4);
        zzejVar.zzn(1);
        if (zzd3 > 0) {
            zzejVar.zzn(6);
            if (zzejVar.zzd(1) != 0) {
                i3 += 2;
            }
            zzejVar.zzn(1);
        }
        if (zzejVar.zza() > 7) {
            zzejVar.zzn(7);
            if (zzejVar.zzd(1) != 0) {
                str3 = "audio/eac3-joc";
                zzejVar.zzf();
                zzekVar.zzL(zzejVar.zzb());
                zzad zzadVar = new zzad();
                zzadVar.zzL(str);
                zzadVar.zzZ(str3);
                zzadVar.zzz(i3);
                zzadVar.zzaa(i2);
                zzadVar.zzF(zzyVar);
                zzadVar.zzP(str2);
                zzadVar.zzU(zzd2);
                return zzadVar.zzaf();
            }
        }
        str3 = "audio/eac3";
        zzejVar.zzf();
        zzekVar.zzL(zzejVar.zzb());
        zzad zzadVar2 = new zzad();
        zzadVar2.zzL(str);
        zzadVar2.zzZ(str3);
        zzadVar2.zzz(i3);
        zzadVar2.zzaa(i2);
        zzadVar2.zzF(zzyVar);
        zzadVar2.zzP(str2);
        zzadVar2.zzU(zzd2);
        return zzadVar2.zzaf();
    }

    public static zzaca zze(zzej zzejVar) {
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int zzc2 = zzejVar.zzc();
        zzejVar.zzn(40);
        int zzd2 = zzejVar.zzd(5);
        zzejVar.zzl(zzc2);
        int i13 = -1;
        if (zzd2 > 10) {
            zzejVar.zzn(16);
            int zzd3 = zzejVar.zzd(2);
            if (zzd3 == 0) {
                i13 = 0;
            } else if (zzd3 == 1) {
                i13 = 1;
            } else if (zzd3 == 2) {
                i13 = 2;
            }
            zzejVar.zzn(3);
            int zzd4 = zzejVar.zzd(11) + 1;
            int zzd5 = zzejVar.zzd(2);
            if (zzd5 == 3) {
                i9 = zzd[zzejVar.zzd(2)];
                i10 = 6;
                i8 = 3;
            } else {
                int zzd6 = zzejVar.zzd(2);
                int i14 = zzb[zzd6];
                i8 = zzd6;
                i9 = zzc[zzd5];
                i10 = i14;
            }
            int i15 = zzd4 + zzd4;
            int i16 = (i15 * i9) / (i10 * 32);
            int zzd7 = zzejVar.zzd(3);
            boolean zzp = zzejVar.zzp();
            i2 = zze[zzd7] + (zzp ? 1 : 0);
            zzejVar.zzn(10);
            if (zzejVar.zzp()) {
                zzejVar.zzn(8);
            }
            if (zzd7 == 0) {
                zzejVar.zzn(5);
                if (zzejVar.zzp()) {
                    zzejVar.zzn(8);
                }
                i11 = 0;
                zzd7 = 0;
            } else {
                i11 = zzd7;
            }
            if (i13 == 1) {
                if (zzejVar.zzp()) {
                    zzejVar.zzn(16);
                }
                i12 = 1;
            } else {
                i12 = i13;
            }
            if (zzejVar.zzp()) {
                if (i11 > 2) {
                    zzejVar.zzn(2);
                }
                if ((i11 & 1) != 0 && i11 > 2) {
                    zzejVar.zzn(6);
                }
                if ((i11 & 4) != 0) {
                    zzejVar.zzn(6);
                }
                if (zzp && zzejVar.zzp()) {
                    zzejVar.zzn(5);
                }
                if (i12 == 0) {
                    if (zzejVar.zzp()) {
                        zzejVar.zzn(6);
                    }
                    if (i11 == 0 && zzejVar.zzp()) {
                        zzejVar.zzn(6);
                    }
                    if (zzejVar.zzp()) {
                        zzejVar.zzn(6);
                    }
                    int zzd8 = zzejVar.zzd(2);
                    if (zzd8 == 1) {
                        zzejVar.zzn(5);
                    } else if (zzd8 == 2) {
                        zzejVar.zzn(12);
                    } else if (zzd8 == 3) {
                        int zzd9 = zzejVar.zzd(5);
                        if (zzejVar.zzp()) {
                            zzejVar.zzn(5);
                            if (zzejVar.zzp()) {
                                zzejVar.zzn(4);
                            }
                            if (zzejVar.zzp()) {
                                zzejVar.zzn(4);
                            }
                            if (zzejVar.zzp()) {
                                zzejVar.zzn(4);
                            }
                            if (zzejVar.zzp()) {
                                zzejVar.zzn(4);
                            }
                            if (zzejVar.zzp()) {
                                zzejVar.zzn(4);
                            }
                            if (zzejVar.zzp()) {
                                zzejVar.zzn(4);
                            }
                            if (zzejVar.zzp()) {
                                zzejVar.zzn(4);
                            }
                            if (zzejVar.zzp()) {
                                if (zzejVar.zzp()) {
                                    zzejVar.zzn(4);
                                }
                                if (zzejVar.zzp()) {
                                    zzejVar.zzn(4);
                                }
                            }
                        }
                        if (zzejVar.zzp()) {
                            zzejVar.zzn(5);
                            if (zzejVar.zzp()) {
                                zzejVar.zzn(7);
                                if (zzejVar.zzp()) {
                                    zzejVar.zzn(8);
                                }
                            }
                        }
                        zzejVar.zzn((zzd9 + 2) * 8);
                        zzejVar.zzf();
                    }
                    if (i11 < 2) {
                        if (zzejVar.zzp()) {
                            zzejVar.zzn(14);
                        }
                        if (zzd7 == 0 && zzejVar.zzp()) {
                            zzejVar.zzn(14);
                        }
                    }
                    if (zzejVar.zzp()) {
                        if (i8 == 0) {
                            zzejVar.zzn(5);
                            i12 = 0;
                            i8 = 0;
                        } else {
                            for (int i17 = 0; i17 < i10; i17++) {
                                if (zzejVar.zzp()) {
                                    zzejVar.zzn(5);
                                }
                            }
                        }
                    }
                    i12 = 0;
                }
            }
            if (zzejVar.zzp()) {
                zzejVar.zzn(5);
                if (i11 == 2) {
                    zzejVar.zzn(4);
                    i11 = 2;
                }
                if (i11 >= 6) {
                    zzejVar.zzn(2);
                }
                if (zzejVar.zzp()) {
                    zzejVar.zzn(8);
                }
                if (i11 == 0 && zzejVar.zzp()) {
                    zzejVar.zzn(8);
                }
                if (zzd5 < 3) {
                    zzejVar.zzm();
                }
            }
            if (i12 == 0 && i8 != 3) {
                zzejVar.zzm();
            }
            if (i12 == 2 && (i8 == 3 || zzejVar.zzp())) {
                zzejVar.zzn(6);
            }
            str = (zzejVar.zzp() && zzejVar.zzd(6) == 1 && zzejVar.zzd(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i3 = i13;
            i5 = i15;
            i6 = i9;
            i7 = i10 * 256;
            i4 = i16;
        } else {
            zzejVar.zzn(32);
            int zzd10 = zzejVar.zzd(2);
            String str2 = zzd10 == 3 ? null : "audio/ac3";
            int zzd11 = zzejVar.zzd(6);
            int i18 = zzf[zzd11 / 2] * 1000;
            int zzf2 = zzf(zzd10, zzd11);
            zzejVar.zzn(8);
            int zzd12 = zzejVar.zzd(3);
            if ((zzd12 & 1) != 0 && zzd12 != 1) {
                zzejVar.zzn(2);
            }
            if ((zzd12 & 4) != 0) {
                zzejVar.zzn(2);
            }
            if (zzd12 == 2) {
                zzejVar.zzn(2);
            }
            int i19 = zzd10 < 3 ? zzc[zzd10] : -1;
            i2 = zze[zzd12] + (zzejVar.zzp() ? 1 : 0);
            i3 = -1;
            str = str2;
            i4 = i18;
            i5 = zzf2;
            i6 = i19;
            i7 = 1536;
        }
        return new zzaca(str, i3, i2, i6, i5, i7, i4, null);
    }

    private static int zzf(int i2, int i3) {
        int i4;
        if (i2 < 0 || i2 >= 3 || i3 < 0 || (i4 = i3 >> 1) >= 19) {
            return -1;
        }
        int i5 = zzc[i2];
        if (i5 == 44100) {
            int i6 = zzg[i4] + (i3 & 1);
            return i6 + i6;
        }
        int i7 = zzf[i4];
        return i5 == 32000 ? i7 * 6 : i7 * 4;
    }
}
