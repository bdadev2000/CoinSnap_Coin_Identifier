package com.google.android.gms.internal.ads;

import a4.j;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Objects;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* loaded from: classes3.dex */
public final class zzsq {
    public final String zza;
    public final String zzb;
    public final String zzc;

    @Nullable
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    private final boolean zzi;

    public zzsq(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z10;
        this.zze = z13;
        this.zzf = z15;
        this.zzh = z16;
        this.zzi = zzbg.zzi(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if ("Nexus 10".equals(r3) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r13) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzsq zzc(java.lang.String r13, java.lang.String r14, java.lang.String r15, @androidx.annotation.Nullable android.media.MediaCodecInfo.CodecCapabilities r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21) {
        /*
            r1 = r13
            r4 = r16
            com.google.android.gms.internal.ads.zzsq r12 = new com.google.android.gms.internal.ads.zzsq
            r0 = 1
            r2 = 0
            if (r4 == 0) goto L3c
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r4.isFeatureSupported(r3)
            if (r3 == 0) goto L3c
            int r3 = com.google.android.gms.internal.ads.zzen.zza
            r5 = 22
            if (r3 > r5) goto L3a
            java.lang.String r3 = com.google.android.gms.internal.ads.zzen.zzd
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L29
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L3a
        L29:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r13)
            if (r3 != 0) goto L3c
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r13)
            if (r3 == 0) goto L3a
            goto L3c
        L3a:
            r8 = r0
            goto L3d
        L3c:
            r8 = r2
        L3d:
            if (r4 == 0) goto L49
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r4.isFeatureSupported(r3)
            if (r3 == 0) goto L49
            r9 = r0
            goto L4a
        L49:
            r9 = r2
        L4a:
            if (r21 != 0) goto L59
            if (r4 == 0) goto L57
            java.lang.String r3 = "secure-playback"
            boolean r3 = r4.isFeatureSupported(r3)
            if (r3 == 0) goto L57
            goto L59
        L57:
            r10 = r2
            goto L5a
        L59:
            r10 = r0
        L5a:
            int r3 = com.google.android.gms.internal.ads.zzen.zza
            r5 = 35
            if (r3 < r5) goto L6c
            if (r4 == 0) goto L6c
            java.lang.String r3 = "detached-surface"
            boolean r3 = r4.isFeatureSupported(r3)
            if (r3 == 0) goto L6c
            r11 = r0
            goto L6d
        L6c:
            r11 = r2
        L6d:
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsq.zzc(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.zzsq");
    }

    private static Point zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i12 = zzen.zza;
        return new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private final void zzj(String str) {
        String str2 = zzen.zze;
        StringBuilder o10 = j.o("NoSupport [", str, "] [");
        o10.append(this.zza);
        o10.append(", ");
        zzdt.zzb(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, j.k(o10, this.zzb, "] [", str2, "]"));
    }

    private static boolean zzk(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point zzi = zzi(videoCapabilities, i10, i11);
        int i12 = zzi.x;
        int i13 = zzi.y;
        if (d10 != -1.0d && d10 >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
        }
        return videoCapabilities.isSizeSupported(i12, i13);
    }

    private final boolean zzl(zzad zzadVar, boolean z10) {
        int i10;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i11 = zztl.zza;
        Pair zza = zzdd.zza(zzadVar);
        String str = zzadVar.zzo;
        if (str != null && str.equals("video/mv-hevc") && this.zzc.equals(MimeTypes.VIDEO_H265)) {
            String zzg = zzfp.zzg(zzadVar.zzr);
            if (zzg == null) {
                zza = null;
            } else {
                String trim = zzg.trim();
                int i12 = zzen.zza;
                zza = zzdd.zzb(zzg, trim.split("\\.", -1), zzadVar.zzB);
            }
        }
        if (zza != null) {
            int intValue = ((Integer) zza.first).intValue();
            int intValue2 = ((Integer) zza.second).intValue();
            int i13 = 8;
            if ("video/dolby-vision".equals(zzadVar.zzo)) {
                if (MimeTypes.VIDEO_H264.equals(this.zzb)) {
                    intValue = 8;
                } else if (MimeTypes.VIDEO_H265.equals(this.zzb)) {
                    intValue = 2;
                }
                intValue2 = 0;
            }
            if (!this.zzi) {
                if (intValue == 42) {
                    intValue = 42;
                }
            }
            MediaCodecInfo.CodecProfileLevel[] zzh = zzh();
            if (zzen.zza <= 23 && MimeTypes.VIDEO_VP9.equals(this.zzb) && zzh.length == 0) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                    i10 = videoCapabilities.getBitrateRange().getUpper().intValue();
                } else {
                    i10 = 0;
                }
                if (i10 >= 180000000) {
                    i13 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                } else if (i10 >= 120000000) {
                    i13 = 512;
                } else if (i10 >= 60000000) {
                    i13 = NotificationCompat.FLAG_LOCAL_ONLY;
                } else if (i10 >= 30000000) {
                    i13 = 128;
                } else if (i10 >= 18000000) {
                    i13 = 64;
                } else if (i10 >= 12000000) {
                    i13 = 32;
                } else if (i10 >= 7200000) {
                    i13 = 16;
                } else if (i10 < 3600000) {
                    if (i10 >= 1800000) {
                        i13 = 4;
                    } else if (i10 >= 800000) {
                        i13 = 2;
                    } else {
                        i13 = 1;
                    }
                }
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                codecProfileLevel.profile = 1;
                codecProfileLevel.level = i13;
                zzh = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : zzh) {
                if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z10)) {
                    if (MimeTypes.VIDEO_H265.equals(this.zzb) && intValue == 2) {
                        String str2 = zzen.zzb;
                        if (!"sailfish".equals(str2) && !"marlin".equals(str2)) {
                        }
                    }
                }
            }
            zzj(eb.j.l("codec.profileLevel, ", zzadVar.zzk, ", ", this.zzc));
            return false;
        }
        return true;
    }

    private final boolean zzm(zzad zzadVar) {
        if (!this.zzb.equals(zzadVar.zzo) && !this.zzb.equals(zztl.zzb(zzadVar))) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.zza;
    }

    @Nullable
    public final Point zza(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
            return zzi(videoCapabilities, i10, i11);
        }
        return null;
    }

    public final zzhy zzb(zzad zzadVar, zzad zzadVar2) {
        int i10;
        int i11;
        if (true != Objects.equals(zzadVar.zzo, zzadVar2.zzo)) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        if (this.zzi) {
            if (zzadVar.zzx != zzadVar2.zzx) {
                i10 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            if (!this.zze && (zzadVar.zzu != zzadVar2.zzu || zzadVar.zzv != zzadVar2.zzv)) {
                i10 |= 512;
            }
            if ((!zzm.zzg(zzadVar.zzB) || !zzm.zzg(zzadVar2.zzB)) && !Objects.equals(zzadVar.zzB, zzadVar2.zzB)) {
                i10 |= 2048;
            }
            String str = this.zza;
            if (zzen.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzadVar.zzd(zzadVar2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                String str2 = this.zza;
                if (true != zzadVar.zzd(zzadVar2)) {
                    i11 = 2;
                } else {
                    i11 = 3;
                }
                return new zzhy(str2, zzadVar, zzadVar2, i11, 0);
            }
        } else {
            if (zzadVar.zzC != zzadVar2.zzC) {
                i10 |= 4096;
            }
            if (zzadVar.zzD != zzadVar2.zzD) {
                i10 |= 8192;
            }
            if (zzadVar.zzE != zzadVar2.zzE) {
                i10 |= JsonLexerKt.BATCH_SIZE;
            }
            if (i10 == 0 && MimeTypes.AUDIO_AAC.equals(this.zzb)) {
                int i12 = zztl.zza;
                Pair zza = zzdd.zza(zzadVar);
                Pair zza2 = zzdd.zza(zzadVar2);
                if (zza != null && zza2 != null) {
                    int intValue = ((Integer) zza.first).intValue();
                    int intValue2 = ((Integer) zza2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new zzhy(this.zza, zzadVar, zzadVar2, 3, 0);
                    }
                }
            }
            if (!zzadVar.zzd(zzadVar2)) {
                i10 |= 32;
            }
            if (MimeTypes.AUDIO_OPUS.equals(this.zzb)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new zzhy(this.zza, zzadVar, zzadVar2, 1, 0);
            }
        }
        return new zzhy(this.zza, zzadVar, zzadVar2, 0, i10);
    }

    public final boolean zzd(zzad zzadVar) {
        if (!zzm(zzadVar) || !zzl(zzadVar, false)) {
            return false;
        }
        return true;
    }

    public final boolean zze(zzad zzadVar) throws zztf {
        int i10;
        int i11;
        if (!zzm(zzadVar) || !zzl(zzadVar, true)) {
            return false;
        }
        if (this.zzi) {
            int i12 = zzadVar.zzu;
            if (i12 <= 0 || (i11 = zzadVar.zzv) <= 0) {
                return true;
            }
            return zzg(i12, i11, zzadVar.zzw);
        }
        int i13 = zzadVar.zzD;
        if (i13 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities == null) {
                zzj("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                zzj("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i13)) {
                zzj(eb.j.i("sampleRate.support, ", i13));
                return false;
            }
        }
        int i14 = zzadVar.zzC;
        if (i14 == -1) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
        if (codecCapabilities2 == null) {
            zzj("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
        if (audioCapabilities2 == null) {
            zzj("channelCount.aCaps");
            return false;
        }
        String str = this.zza;
        String str2 = this.zzb;
        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
        if (maxInputChannelCount <= 1 && ((zzen.zza < 26 || maxInputChannelCount <= 0) && !MimeTypes.AUDIO_MPEG.equals(str2) && !MimeTypes.AUDIO_AMR_NB.equals(str2) && !MimeTypes.AUDIO_AMR_WB.equals(str2) && !MimeTypes.AUDIO_AAC.equals(str2) && !MimeTypes.AUDIO_VORBIS.equals(str2) && !MimeTypes.AUDIO_OPUS.equals(str2) && !MimeTypes.AUDIO_RAW.equals(str2) && !MimeTypes.AUDIO_FLAC.equals(str2) && !MimeTypes.AUDIO_ALAW.equals(str2) && !MimeTypes.AUDIO_MLAW.equals(str2) && !MimeTypes.AUDIO_MSGSM.equals(str2))) {
            if (MimeTypes.AUDIO_AC3.equals(str2)) {
                i10 = 6;
            } else if (MimeTypes.AUDIO_E_AC3.equals(str2)) {
                i10 = 16;
            } else {
                i10 = 30;
            }
            zzdt.zzf(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i10 + "]");
            maxInputChannelCount = i10;
        }
        if (maxInputChannelCount >= i14) {
            return true;
        }
        zzj(eb.j.i("channelCount.support, ", i14));
        return false;
    }

    public final boolean zzf(zzad zzadVar) {
        if (this.zzi) {
            return this.zze;
        }
        int i10 = zztl.zza;
        Pair zza = zzdd.zza(zzadVar);
        if (zza != null && ((Integer) zza.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    public final boolean zzg(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzj("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzj("sizeAndRate.vCaps");
            return false;
        }
        if (zzen.zza >= 29) {
            int zza = zzss.zza(videoCapabilities, i10, i11, d10);
            if (zza != 2) {
                if (zza == 1) {
                    StringBuilder n10 = j.n("sizeAndRate.cover, ", i10, "x", i11, "@");
                    n10.append(d10);
                    zzj(n10.toString());
                    return false;
                }
            }
            return true;
        }
        if (!zzk(videoCapabilities, i10, i11, d10)) {
            if (i10 < i11 && ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) || !"mcv5a".equals(zzen.zzb)) && zzk(videoCapabilities, i11, i10, d10))) {
                StringBuilder n11 = j.n("sizeAndRate.rotated, ", i10, "x", i11, "@");
                n11.append(d10);
                String sb2 = n11.toString();
                String str = this.zza;
                zzdt.zzb(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, j.k(j.p("AssumedSupport [", sb2, "] [", str, ", "), this.zzb, "] [", zzen.zze, "]"));
            } else {
                StringBuilder n12 = j.n("sizeAndRate.support, ", i10, "x", i11, "@");
                n12.append(d10);
                zzj(n12.toString());
                return false;
            }
        }
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzh() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }
}
