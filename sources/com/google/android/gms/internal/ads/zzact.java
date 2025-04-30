package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class zzact {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 320, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int zza(ByteBuffer byteBuffer) {
        int i9 = 3;
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
                i9 = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
            }
            return zzb[i9] * NotificationCompat.FLAG_LOCAL_ONLY;
        }
        return 1536;
    }

    public static int zzb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            int i9 = bArr[2] & 7;
            int i10 = ((bArr[3] & 255) | (i9 << 8)) + 1;
            return i10 + i10;
        }
        byte b = bArr[4];
        return zzf((b & 192) >> 6, b & 63);
    }

    public static zzan zzc(zzfu zzfuVar, String str, String str2, @Nullable zzae zzaeVar) {
        zzft zzftVar = new zzft();
        zzftVar.zzi(zzfuVar);
        int i9 = zzc[zzftVar.zzd(2)];
        zzftVar.zzm(8);
        int i10 = zze[zzftVar.zzd(3)];
        if (zzftVar.zzd(1) != 0) {
            i10++;
        }
        int i11 = zzf[zzftVar.zzd(5)] * 1000;
        zzftVar.zze();
        zzfuVar.zzK(zzftVar.zzb());
        zzal zzalVar = new zzal();
        zzalVar.zzK(str);
        zzalVar.zzX(MimeTypes.AUDIO_AC3);
        zzalVar.zzy(i10);
        zzalVar.zzY(i9);
        zzalVar.zzE(zzaeVar);
        zzalVar.zzO(str2);
        zzalVar.zzx(i11);
        zzalVar.zzS(i11);
        return zzalVar.zzad();
    }

    public static zzan zzd(zzfu zzfuVar, String str, String str2, @Nullable zzae zzaeVar) {
        String str3;
        zzft zzftVar = new zzft();
        zzftVar.zzi(zzfuVar);
        int zzd2 = zzftVar.zzd(13) * 1000;
        zzftVar.zzm(3);
        int i9 = zzc[zzftVar.zzd(2)];
        zzftVar.zzm(10);
        int i10 = zze[zzftVar.zzd(3)];
        if (zzftVar.zzd(1) != 0) {
            i10++;
        }
        zzftVar.zzm(3);
        int zzd3 = zzftVar.zzd(4);
        zzftVar.zzm(1);
        if (zzd3 > 0) {
            zzftVar.zzm(6);
            if (zzftVar.zzd(1) != 0) {
                i10 += 2;
            }
            zzftVar.zzm(1);
        }
        if (zzftVar.zza() > 7) {
            zzftVar.zzm(7);
            if (zzftVar.zzd(1) != 0) {
                str3 = MimeTypes.AUDIO_E_AC3_JOC;
                zzftVar.zze();
                zzfuVar.zzK(zzftVar.zzb());
                zzal zzalVar = new zzal();
                zzalVar.zzK(str);
                zzalVar.zzX(str3);
                zzalVar.zzy(i10);
                zzalVar.zzY(i9);
                zzalVar.zzE(zzaeVar);
                zzalVar.zzO(str2);
                zzalVar.zzS(zzd2);
                return zzalVar.zzad();
            }
        }
        str3 = MimeTypes.AUDIO_E_AC3;
        zzftVar.zze();
        zzfuVar.zzK(zzftVar.zzb());
        zzal zzalVar2 = new zzal();
        zzalVar2.zzK(str);
        zzalVar2.zzX(str3);
        zzalVar2.zzy(i10);
        zzalVar2.zzY(i9);
        zzalVar2.zzE(zzaeVar);
        zzalVar2.zzO(str2);
        zzalVar2.zzS(zzd2);
        return zzalVar2.zzad();
    }

    public static zzacs zze(zzft zzftVar) {
        String str;
        int i9;
        int i10;
        int i11;
        String str2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        String str3;
        int zzc2 = zzftVar.zzc();
        zzftVar.zzm(40);
        int zzd2 = zzftVar.zzd(5);
        zzftVar.zzk(zzc2);
        int i21 = -1;
        if (zzd2 > 10) {
            zzftVar.zzm(16);
            int zzd3 = zzftVar.zzd(2);
            if (zzd3 != 0) {
                if (zzd3 != 1) {
                    if (zzd3 == 2) {
                        i21 = 2;
                    }
                } else {
                    i21 = 1;
                }
            } else {
                i21 = 0;
            }
            zzftVar.zzm(3);
            int zzd4 = zzftVar.zzd(11) + 1;
            int zzd5 = zzftVar.zzd(2);
            if (zzd5 == 3) {
                i17 = zzd[zzftVar.zzd(2)];
                i18 = 6;
                i16 = 3;
            } else {
                int zzd6 = zzftVar.zzd(2);
                int i22 = zzb[zzd6];
                i16 = zzd6;
                i17 = zzc[zzd5];
                i18 = i22;
            }
            int i23 = zzd4 + zzd4;
            int i24 = (i23 * i17) / (i18 * 32);
            int zzd7 = zzftVar.zzd(3);
            boolean zzo = zzftVar.zzo();
            i10 = zze[zzd7] + (zzo ? 1 : 0);
            zzftVar.zzm(10);
            if (zzftVar.zzo()) {
                zzftVar.zzm(8);
            }
            if (zzd7 == 0) {
                zzftVar.zzm(5);
                if (zzftVar.zzo()) {
                    zzftVar.zzm(8);
                }
                i19 = 0;
                zzd7 = 0;
            } else {
                i19 = zzd7;
            }
            if (i21 == 1) {
                if (zzftVar.zzo()) {
                    zzftVar.zzm(16);
                }
                i20 = 1;
            } else {
                i20 = i21;
            }
            if (zzftVar.zzo()) {
                if (i19 > 2) {
                    zzftVar.zzm(2);
                }
                if ((i19 & 1) != 0 && i19 > 2) {
                    zzftVar.zzm(6);
                }
                if ((i19 & 4) != 0) {
                    zzftVar.zzm(6);
                }
                if (zzo && zzftVar.zzo()) {
                    zzftVar.zzm(5);
                }
                if (i20 == 0) {
                    if (zzftVar.zzo()) {
                        zzftVar.zzm(6);
                    }
                    if (i19 == 0 && zzftVar.zzo()) {
                        zzftVar.zzm(6);
                    }
                    if (zzftVar.zzo()) {
                        zzftVar.zzm(6);
                    }
                    int zzd8 = zzftVar.zzd(2);
                    if (zzd8 == 1) {
                        zzftVar.zzm(5);
                    } else if (zzd8 == 2) {
                        zzftVar.zzm(12);
                    } else if (zzd8 == 3) {
                        int zzd9 = zzftVar.zzd(5);
                        if (zzftVar.zzo()) {
                            zzftVar.zzm(5);
                            if (zzftVar.zzo()) {
                                zzftVar.zzm(4);
                            }
                            if (zzftVar.zzo()) {
                                zzftVar.zzm(4);
                            }
                            if (zzftVar.zzo()) {
                                zzftVar.zzm(4);
                            }
                            if (zzftVar.zzo()) {
                                zzftVar.zzm(4);
                            }
                            if (zzftVar.zzo()) {
                                zzftVar.zzm(4);
                            }
                            if (zzftVar.zzo()) {
                                zzftVar.zzm(4);
                            }
                            if (zzftVar.zzo()) {
                                zzftVar.zzm(4);
                            }
                            if (zzftVar.zzo()) {
                                if (zzftVar.zzo()) {
                                    zzftVar.zzm(4);
                                }
                                if (zzftVar.zzo()) {
                                    zzftVar.zzm(4);
                                }
                            }
                        }
                        if (zzftVar.zzo()) {
                            zzftVar.zzm(5);
                            if (zzftVar.zzo()) {
                                zzftVar.zzm(7);
                                if (zzftVar.zzo()) {
                                    zzftVar.zzm(8);
                                }
                            }
                        }
                        zzftVar.zzm((zzd9 + 2) * 8);
                        zzftVar.zze();
                    }
                    if (i19 < 2) {
                        if (zzftVar.zzo()) {
                            zzftVar.zzm(14);
                        }
                        if (zzd7 == 0 && zzftVar.zzo()) {
                            zzftVar.zzm(14);
                        }
                    }
                    if (zzftVar.zzo()) {
                        if (i16 == 0) {
                            zzftVar.zzm(5);
                            i20 = 0;
                            i16 = 0;
                        } else {
                            for (int i25 = 0; i25 < i18; i25++) {
                                if (zzftVar.zzo()) {
                                    zzftVar.zzm(5);
                                }
                            }
                        }
                    }
                    i20 = 0;
                }
            }
            if (zzftVar.zzo()) {
                zzftVar.zzm(5);
                if (i19 == 2) {
                    zzftVar.zzm(4);
                    i19 = 2;
                }
                if (i19 >= 6) {
                    zzftVar.zzm(2);
                }
                if (zzftVar.zzo()) {
                    zzftVar.zzm(8);
                }
                if (i19 == 0 && zzftVar.zzo()) {
                    zzftVar.zzm(8);
                }
                if (zzd5 < 3) {
                    zzftVar.zzl();
                }
            }
            if (i20 == 0 && i16 != 3) {
                zzftVar.zzl();
            }
            if (i20 == 2 && (i16 == 3 || zzftVar.zzo())) {
                zzftVar.zzm(6);
            }
            if (zzftVar.zzo() && zzftVar.zzd(6) == 1 && zzftVar.zzd(8) == 1) {
                str3 = MimeTypes.AUDIO_E_AC3_JOC;
            } else {
                str3 = MimeTypes.AUDIO_E_AC3;
            }
            str2 = str3;
            i11 = i21;
            i13 = i23;
            i14 = i17;
            i15 = i18 * NotificationCompat.FLAG_LOCAL_ONLY;
            i12 = i24;
        } else {
            zzftVar.zzm(32);
            int zzd10 = zzftVar.zzd(2);
            if (zzd10 == 3) {
                str = null;
            } else {
                str = MimeTypes.AUDIO_AC3;
            }
            int zzd11 = zzftVar.zzd(6);
            int i26 = zzf[zzd11 / 2] * 1000;
            int zzf2 = zzf(zzd10, zzd11);
            zzftVar.zzm(8);
            int zzd12 = zzftVar.zzd(3);
            if ((zzd12 & 1) != 0 && zzd12 != 1) {
                zzftVar.zzm(2);
            }
            if ((zzd12 & 4) != 0) {
                zzftVar.zzm(2);
            }
            if (zzd12 == 2) {
                zzftVar.zzm(2);
            }
            if (zzd10 < 3) {
                i9 = zzc[zzd10];
            } else {
                i9 = -1;
            }
            i10 = zze[zzd12] + (zzftVar.zzo() ? 1 : 0);
            i11 = -1;
            str2 = str;
            i12 = i26;
            i13 = zzf2;
            i14 = i9;
            i15 = 1536;
        }
        return new zzacs(str2, i11, i10, i14, i13, i15, i12, null);
    }

    private static int zzf(int i9, int i10) {
        int i11;
        if (i9 < 0 || i9 >= 3 || i10 < 0 || (i11 = i10 >> 1) >= 19) {
            return -1;
        }
        int i12 = zzc[i9];
        if (i12 == 44100) {
            int i13 = zzg[i11] + (i10 & 1);
            return i13 + i13;
        }
        int i14 = zzf[i11];
        return i12 == 32000 ? i14 * 6 : i14 * 4;
    }
}
