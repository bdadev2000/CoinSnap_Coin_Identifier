package com.google.android.gms.internal.ads;

import Q7.n0;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentTransaction;
import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zztp {
    public final String zza;
    public final String zzb;
    public final String zzc;

    @Nullable
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    private final boolean zzh;

    public zztp(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z8;
        this.zze = z11;
        this.zzf = z13;
        this.zzh = zzcg.zzh(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if ("Nexus 10".equals(r3) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r12) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (r15.isFeatureSupported("secure-playback") != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zztp zzc(java.lang.String r12, java.lang.String r13, java.lang.String r14, @androidx.annotation.Nullable android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r1 = r12
            r4 = r15
            com.google.android.gms.internal.ads.zztp r11 = new com.google.android.gms.internal.ads.zztp
            r0 = 1
            r2 = 0
            if (r4 == 0) goto L3b
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L3b
            int r3 = com.google.android.gms.internal.ads.zzgd.zza
            r5 = 22
            if (r3 > r5) goto L29
            java.lang.String r3 = com.google.android.gms.internal.ads.zzgd.zzd
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L2b
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L29
            goto L2b
        L29:
            r8 = r0
            goto L3c
        L2b:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L3b
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L29
        L3b:
            r8 = r2
        L3c:
            if (r4 == 0) goto L4a
            int r3 = com.google.android.gms.internal.ads.zzgd.zza
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L4a
            r9 = r0
            goto L4b
        L4a:
            r9 = r2
        L4b:
            if (r20 != 0) goto L59
            if (r4 == 0) goto L5b
            int r3 = com.google.android.gms.internal.ads.zzgd.zza
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L5b
        L59:
            r10 = r0
            goto L5c
        L5b:
            r10 = r2
        L5c:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztp.zzc(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.zztp");
    }

    @RequiresApi(21)
    private static Point zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i9, int i10) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i11 = zzgd.zza;
        return new Point((((i9 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i10 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private final void zzj(String str) {
        String str2 = zzgd.zze;
        StringBuilder n2 = o.n("NoSupport [", str, "] [");
        n2.append(this.zza);
        n2.append(", ");
        zzfk.zzb(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, n0.m(n2, this.zzb, "] [", str2, "]"));
    }

    @RequiresApi(21)
    private static boolean zzk(MediaCodecInfo.VideoCapabilities videoCapabilities, int i9, int i10, double d2) {
        Point zzi = zzi(videoCapabilities, i9, i10);
        int i11 = zzi.x;
        int i12 = zzi.y;
        if (d2 != -1.0d && d2 >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i11, i12, Math.floor(d2));
        }
        return videoCapabilities.isSizeSupported(i11, i12);
    }

    private final boolean zzl(zzan zzanVar, boolean z8) {
        int i9;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair zza = zzuj.zza(zzanVar);
        if (zza != null) {
            int intValue = ((Integer) zza.first).intValue();
            int intValue2 = ((Integer) zza.second).intValue();
            int i10 = 8;
            if ("video/dolby-vision".equals(zzanVar.zzn)) {
                if (MimeTypes.VIDEO_H264.equals(this.zzb)) {
                    intValue = 8;
                } else if (MimeTypes.VIDEO_H265.equals(this.zzb)) {
                    intValue = 2;
                }
                intValue2 = 0;
            }
            if (!this.zzh) {
                if (intValue == 42) {
                    intValue = 42;
                }
            }
            MediaCodecInfo.CodecProfileLevel[] zzh = zzh();
            if (zzgd.zza <= 23 && MimeTypes.VIDEO_VP9.equals(this.zzb) && zzh.length == 0) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                    i9 = videoCapabilities.getBitrateRange().getUpper().intValue();
                } else {
                    i9 = 0;
                }
                if (i9 >= 180000000) {
                    i10 = 1024;
                } else if (i9 >= 120000000) {
                    i10 = 512;
                } else if (i9 >= 60000000) {
                    i10 = NotificationCompat.FLAG_LOCAL_ONLY;
                } else if (i9 >= 30000000) {
                    i10 = 128;
                } else if (i9 >= 18000000) {
                    i10 = 64;
                } else if (i9 >= 12000000) {
                    i10 = 32;
                } else if (i9 >= 7200000) {
                    i10 = 16;
                } else if (i9 < 3600000) {
                    if (i9 >= 1800000) {
                        i10 = 4;
                    } else if (i9 >= 800000) {
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                }
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                codecProfileLevel.profile = 1;
                codecProfileLevel.level = i10;
                zzh = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : zzh) {
                if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z8)) {
                    if (MimeTypes.VIDEO_H265.equals(this.zzb) && intValue == 2) {
                        String str = zzgd.zzb;
                        if (!"sailfish".equals(str) && !"marlin".equals(str)) {
                        }
                    }
                }
            }
            zzj(AbstractC2914a.k("codec.profileLevel, ", zzanVar.zzk, ", ", this.zzc));
            return false;
        }
        return true;
    }

    private final boolean zzm(zzan zzanVar) {
        if (!this.zzb.equals(zzanVar.zzn) && !this.zzb.equals(zzuj.zzc(zzanVar))) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.zza;
    }

    @Nullable
    @RequiresApi(21)
    public final Point zza(int i9, int i10) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
            return zzi(videoCapabilities, i9, i10);
        }
        return null;
    }

    public final zziy zzb(zzan zzanVar, zzan zzanVar2) {
        int i9;
        int i10;
        if (true != zzgd.zzG(zzanVar.zzn, zzanVar2.zzn)) {
            i9 = 8;
        } else {
            i9 = 0;
        }
        if (this.zzh) {
            if (zzanVar.zzv != zzanVar2.zzv) {
                i9 |= 1024;
            }
            if (!this.zze && (zzanVar.zzs != zzanVar2.zzs || zzanVar.zzt != zzanVar2.zzt)) {
                i9 |= 512;
            }
            if ((!zzt.zzg(zzanVar.zzz) || !zzt.zzg(zzanVar2.zzz)) && !zzgd.zzG(zzanVar.zzz, zzanVar2.zzz)) {
                i9 |= 2048;
            }
            String str = this.zza;
            if (zzgd.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzanVar.zzd(zzanVar2)) {
                i9 |= 2;
            }
            if (i9 == 0) {
                String str2 = this.zza;
                if (true != zzanVar.zzd(zzanVar2)) {
                    i10 = 2;
                } else {
                    i10 = 3;
                }
                return new zziy(str2, zzanVar, zzanVar2, i10, 0);
            }
        } else {
            if (zzanVar.zzA != zzanVar2.zzA) {
                i9 |= 4096;
            }
            if (zzanVar.zzB != zzanVar2.zzB) {
                i9 |= FragmentTransaction.TRANSIT_EXIT_MASK;
            }
            if (zzanVar.zzC != zzanVar2.zzC) {
                i9 |= 16384;
            }
            if (i9 == 0 && MimeTypes.AUDIO_AAC.equals(this.zzb)) {
                Pair zza = zzuj.zza(zzanVar);
                Pair zza2 = zzuj.zza(zzanVar2);
                if (zza != null && zza2 != null) {
                    int intValue = ((Integer) zza.first).intValue();
                    int intValue2 = ((Integer) zza2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new zziy(this.zza, zzanVar, zzanVar2, 3, 0);
                    }
                }
            }
            if (!zzanVar.zzd(zzanVar2)) {
                i9 |= 32;
            }
            if (MimeTypes.AUDIO_OPUS.equals(this.zzb)) {
                i9 |= 2;
            }
            if (i9 == 0) {
                return new zziy(this.zza, zzanVar, zzanVar2, 1, 0);
            }
        }
        return new zziy(this.zza, zzanVar, zzanVar2, 0, i9);
    }

    public final boolean zzd(zzan zzanVar) {
        if (!zzm(zzanVar) || !zzl(zzanVar, false)) {
            return false;
        }
        return true;
    }

    public final boolean zze(zzan zzanVar) throws zzud {
        int i9;
        int i10;
        if (!zzm(zzanVar) || !zzl(zzanVar, true)) {
            return false;
        }
        if (this.zzh) {
            int i11 = zzanVar.zzs;
            if (i11 <= 0 || (i10 = zzanVar.zzt) <= 0) {
                return true;
            }
            int i12 = zzgd.zza;
            return zzg(i11, i10, zzanVar.zzu);
        }
        int i13 = zzgd.zza;
        int i14 = zzanVar.zzB;
        if (i14 != -1) {
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
            if (!audioCapabilities.isSampleRateSupported(i14)) {
                zzj(o.h(i14, "sampleRate.support, "));
                return false;
            }
        }
        int i15 = zzanVar.zzA;
        if (i15 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
            if (codecCapabilities2 == null) {
                zzj("channelCount.caps");
            } else {
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    zzj("channelCount.aCaps");
                } else {
                    String str = this.zza;
                    String str2 = this.zzb;
                    int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                    if (maxInputChannelCount <= 1 && ((zzgd.zza < 26 || maxInputChannelCount <= 0) && !MimeTypes.AUDIO_MPEG.equals(str2) && !MimeTypes.AUDIO_AMR_NB.equals(str2) && !MimeTypes.AUDIO_AMR_WB.equals(str2) && !MimeTypes.AUDIO_AAC.equals(str2) && !MimeTypes.AUDIO_VORBIS.equals(str2) && !MimeTypes.AUDIO_OPUS.equals(str2) && !MimeTypes.AUDIO_RAW.equals(str2) && !MimeTypes.AUDIO_FLAC.equals(str2) && !MimeTypes.AUDIO_ALAW.equals(str2) && !MimeTypes.AUDIO_MLAW.equals(str2) && !MimeTypes.AUDIO_MSGSM.equals(str2))) {
                        if (MimeTypes.AUDIO_AC3.equals(str2)) {
                            i9 = 6;
                        } else if (MimeTypes.AUDIO_E_AC3.equals(str2)) {
                            i9 = 16;
                        } else {
                            i9 = 30;
                        }
                        zzfk.zzf(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i9 + "]");
                        maxInputChannelCount = i9;
                    }
                    if (maxInputChannelCount < i15) {
                        zzj(o.h(i15, "channelCount.support, "));
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean zzf(zzan zzanVar) {
        if (this.zzh) {
            return this.zze;
        }
        Pair zza = zzuj.zza(zzanVar);
        if (zza != null && ((Integer) zza.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    @RequiresApi(21)
    public final boolean zzg(int i9, int i10, double d2) {
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
        if (zzgd.zza >= 29) {
            int zza = zztr.zza(videoCapabilities, i9, i10, d2);
            if (zza != 2) {
                if (zza == 1) {
                    StringBuilder o3 = n0.o(i9, i10, "sizeAndRate.cover, ", "x", "@");
                    o3.append(d2);
                    zzj(o3.toString());
                    return false;
                }
            }
            return true;
        }
        if (!zzk(videoCapabilities, i9, i10, d2)) {
            if (i9 < i10 && ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) || !"mcv5a".equals(zzgd.zzb)) && zzk(videoCapabilities, i10, i9, d2))) {
                StringBuilder o9 = n0.o(i9, i10, "sizeAndRate.rotated, ", "x", "@");
                o9.append(d2);
                String sb = o9.toString();
                String str = this.zza;
                zzfk.zzb(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, n0.m(o.o("AssumedSupport [", sb, "] [", str, ", "), this.zzb, "] [", zzgd.zze, "]"));
            } else {
                StringBuilder o10 = n0.o(i9, i10, "sizeAndRate.support, ", "x", "@");
                o10.append(d2);
                zzj(o10.toString());
                return false;
            }
        }
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzh() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            return new MediaCodecInfo.CodecProfileLevel[0];
        }
        return codecProfileLevelArr;
    }
}
