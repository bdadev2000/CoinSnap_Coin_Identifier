package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class zzabr {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 320, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int zza(ByteBuffer byteBuffer) {
        int i10 = 3;
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
                i10 = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
            }
            return zzb[i10] * NotificationCompat.FLAG_LOCAL_ONLY;
        }
        return 1536;
    }

    public static int zzb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            int i10 = bArr[2] & 7;
            int i11 = ((bArr[3] & UByte.MAX_VALUE) | (i10 << 8)) + 1;
            return i11 + i11;
        }
        byte b3 = bArr[4];
        return zzf((b3 & 192) >> 6, b3 & 63);
    }

    public static zzad zzc(zzed zzedVar, String str, String str2, @Nullable zzw zzwVar) {
        zzec zzecVar = new zzec();
        zzecVar.zzj(zzedVar);
        int i10 = zzc[zzecVar.zzd(2)];
        zzecVar.zzn(8);
        int i11 = zze[zzecVar.zzd(3)];
        if (zzecVar.zzd(1) != 0) {
            i11++;
        }
        int i12 = zzf[zzecVar.zzd(5)] * 1000;
        zzecVar.zzf();
        zzedVar.zzL(zzecVar.zzb());
        zzab zzabVar = new zzab();
        zzabVar.zzL(str);
        zzabVar.zzZ(MimeTypes.AUDIO_AC3);
        zzabVar.zzz(i11);
        zzabVar.zzaa(i10);
        zzabVar.zzF(zzwVar);
        zzabVar.zzP(str2);
        zzabVar.zzy(i12);
        zzabVar.zzU(i12);
        return zzabVar.zzaf();
    }

    public static zzad zzd(zzed zzedVar, String str, String str2, @Nullable zzw zzwVar) {
        String str3;
        zzec zzecVar = new zzec();
        zzecVar.zzj(zzedVar);
        int zzd2 = zzecVar.zzd(13) * 1000;
        zzecVar.zzn(3);
        int i10 = zzc[zzecVar.zzd(2)];
        zzecVar.zzn(10);
        int i11 = zze[zzecVar.zzd(3)];
        if (zzecVar.zzd(1) != 0) {
            i11++;
        }
        zzecVar.zzn(3);
        int zzd3 = zzecVar.zzd(4);
        zzecVar.zzn(1);
        if (zzd3 > 0) {
            zzecVar.zzn(6);
            if (zzecVar.zzd(1) != 0) {
                i11 += 2;
            }
            zzecVar.zzn(1);
        }
        if (zzecVar.zza() > 7) {
            zzecVar.zzn(7);
            if (zzecVar.zzd(1) != 0) {
                str3 = MimeTypes.AUDIO_E_AC3_JOC;
                zzecVar.zzf();
                zzedVar.zzL(zzecVar.zzb());
                zzab zzabVar = new zzab();
                zzabVar.zzL(str);
                zzabVar.zzZ(str3);
                zzabVar.zzz(i11);
                zzabVar.zzaa(i10);
                zzabVar.zzF(zzwVar);
                zzabVar.zzP(str2);
                zzabVar.zzU(zzd2);
                return zzabVar.zzaf();
            }
        }
        str3 = MimeTypes.AUDIO_E_AC3;
        zzecVar.zzf();
        zzedVar.zzL(zzecVar.zzb());
        zzab zzabVar2 = new zzab();
        zzabVar2.zzL(str);
        zzabVar2.zzZ(str3);
        zzabVar2.zzz(i11);
        zzabVar2.zzaa(i10);
        zzabVar2.zzF(zzwVar);
        zzabVar2.zzP(str2);
        zzabVar2.zzU(zzd2);
        return zzabVar2.zzaf();
    }

    public static zzabp zze(zzec zzecVar) {
        String str;
        int i10;
        int i11;
        int i12;
        String str2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        String str3;
        int zzc2 = zzecVar.zzc();
        zzecVar.zzn(40);
        int zzd2 = zzecVar.zzd(5);
        zzecVar.zzl(zzc2);
        int i22 = -1;
        if (zzd2 > 10) {
            zzecVar.zzn(16);
            int zzd3 = zzecVar.zzd(2);
            if (zzd3 != 0) {
                if (zzd3 != 1) {
                    if (zzd3 == 2) {
                        i22 = 2;
                    }
                } else {
                    i22 = 1;
                }
            } else {
                i22 = 0;
            }
            zzecVar.zzn(3);
            int zzd4 = zzecVar.zzd(11) + 1;
            int zzd5 = zzecVar.zzd(2);
            if (zzd5 == 3) {
                i18 = zzd[zzecVar.zzd(2)];
                i19 = 6;
                i17 = 3;
            } else {
                int zzd6 = zzecVar.zzd(2);
                int i23 = zzb[zzd6];
                i17 = zzd6;
                i18 = zzc[zzd5];
                i19 = i23;
            }
            int i24 = zzd4 + zzd4;
            int i25 = (i24 * i18) / (i19 * 32);
            int zzd7 = zzecVar.zzd(3);
            boolean zzp = zzecVar.zzp();
            i11 = zze[zzd7] + (zzp ? 1 : 0);
            zzecVar.zzn(10);
            if (zzecVar.zzp()) {
                zzecVar.zzn(8);
            }
            if (zzd7 == 0) {
                zzecVar.zzn(5);
                if (zzecVar.zzp()) {
                    zzecVar.zzn(8);
                }
                i20 = 0;
                zzd7 = 0;
            } else {
                i20 = zzd7;
            }
            if (i22 == 1) {
                if (zzecVar.zzp()) {
                    zzecVar.zzn(16);
                }
                i21 = 1;
            } else {
                i21 = i22;
            }
            if (zzecVar.zzp()) {
                if (i20 > 2) {
                    zzecVar.zzn(2);
                }
                if ((i20 & 1) != 0 && i20 > 2) {
                    zzecVar.zzn(6);
                }
                if ((i20 & 4) != 0) {
                    zzecVar.zzn(6);
                }
                if (zzp && zzecVar.zzp()) {
                    zzecVar.zzn(5);
                }
                if (i21 == 0) {
                    if (zzecVar.zzp()) {
                        zzecVar.zzn(6);
                    }
                    if (i20 == 0 && zzecVar.zzp()) {
                        zzecVar.zzn(6);
                    }
                    if (zzecVar.zzp()) {
                        zzecVar.zzn(6);
                    }
                    int zzd8 = zzecVar.zzd(2);
                    if (zzd8 == 1) {
                        zzecVar.zzn(5);
                    } else if (zzd8 == 2) {
                        zzecVar.zzn(12);
                    } else if (zzd8 == 3) {
                        int zzd9 = zzecVar.zzd(5);
                        if (zzecVar.zzp()) {
                            zzecVar.zzn(5);
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(4);
                            }
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(4);
                            }
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(4);
                            }
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(4);
                            }
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(4);
                            }
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(4);
                            }
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(4);
                            }
                            if (zzecVar.zzp()) {
                                if (zzecVar.zzp()) {
                                    zzecVar.zzn(4);
                                }
                                if (zzecVar.zzp()) {
                                    zzecVar.zzn(4);
                                }
                            }
                        }
                        if (zzecVar.zzp()) {
                            zzecVar.zzn(5);
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(7);
                                if (zzecVar.zzp()) {
                                    zzecVar.zzn(8);
                                }
                            }
                        }
                        zzecVar.zzn((zzd9 + 2) * 8);
                        zzecVar.zzf();
                    }
                    if (i20 < 2) {
                        if (zzecVar.zzp()) {
                            zzecVar.zzn(14);
                        }
                        if (zzd7 == 0 && zzecVar.zzp()) {
                            zzecVar.zzn(14);
                        }
                    }
                    if (zzecVar.zzp()) {
                        if (i17 == 0) {
                            zzecVar.zzn(5);
                            i21 = 0;
                            i17 = 0;
                        } else {
                            for (int i26 = 0; i26 < i19; i26++) {
                                if (zzecVar.zzp()) {
                                    zzecVar.zzn(5);
                                }
                            }
                        }
                    }
                    i21 = 0;
                }
            }
            if (zzecVar.zzp()) {
                zzecVar.zzn(5);
                if (i20 == 2) {
                    zzecVar.zzn(4);
                    i20 = 2;
                }
                if (i20 >= 6) {
                    zzecVar.zzn(2);
                }
                if (zzecVar.zzp()) {
                    zzecVar.zzn(8);
                }
                if (i20 == 0 && zzecVar.zzp()) {
                    zzecVar.zzn(8);
                }
                if (zzd5 < 3) {
                    zzecVar.zzm();
                }
            }
            if (i21 == 0 && i17 != 3) {
                zzecVar.zzm();
            }
            if (i21 == 2 && (i17 == 3 || zzecVar.zzp())) {
                zzecVar.zzn(6);
            }
            if (zzecVar.zzp() && zzecVar.zzd(6) == 1 && zzecVar.zzd(8) == 1) {
                str3 = MimeTypes.AUDIO_E_AC3_JOC;
            } else {
                str3 = MimeTypes.AUDIO_E_AC3;
            }
            str2 = str3;
            i12 = i22;
            i14 = i24;
            i15 = i18;
            i16 = i19 * NotificationCompat.FLAG_LOCAL_ONLY;
            i13 = i25;
        } else {
            zzecVar.zzn(32);
            int zzd10 = zzecVar.zzd(2);
            if (zzd10 == 3) {
                str = null;
            } else {
                str = MimeTypes.AUDIO_AC3;
            }
            int zzd11 = zzecVar.zzd(6);
            int i27 = zzf[zzd11 / 2] * 1000;
            int zzf2 = zzf(zzd10, zzd11);
            zzecVar.zzn(8);
            int zzd12 = zzecVar.zzd(3);
            if ((zzd12 & 1) != 0 && zzd12 != 1) {
                zzecVar.zzn(2);
            }
            if ((zzd12 & 4) != 0) {
                zzecVar.zzn(2);
            }
            if (zzd12 == 2) {
                zzecVar.zzn(2);
            }
            if (zzd10 < 3) {
                i10 = zzc[zzd10];
            } else {
                i10 = -1;
            }
            i11 = zze[zzd12] + (zzecVar.zzp() ? 1 : 0);
            i12 = -1;
            str2 = str;
            i13 = i27;
            i14 = zzf2;
            i15 = i10;
            i16 = 1536;
        }
        return new zzabp(str2, i12, i11, i15, i14, i16, i13, null);
    }

    private static int zzf(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 >= 3 || i11 < 0 || (i12 = i11 >> 1) >= 19) {
            return -1;
        }
        int i13 = zzc[i10];
        if (i13 == 44100) {
            int i14 = zzg[i12] + (i11 & 1);
            return i14 + i14;
        }
        int i15 = zzf[i12];
        return i13 == 32000 ? i15 * 6 : i15 * 4;
    }
}
