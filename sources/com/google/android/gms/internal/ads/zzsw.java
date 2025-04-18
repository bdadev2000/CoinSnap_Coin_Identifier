package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.support.v4.media.d;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public final class zzsw {
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

    @VisibleForTesting
    public zzsw(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z2;
        this.zze = z5;
        this.zzf = z7;
        this.zzh = z8;
        this.zzi = zzbn.zzi(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if ("Nexus 10".equals(r3) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r13) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzsw zzc(java.lang.String r13, java.lang.String r14, java.lang.String r15, @androidx.annotation.Nullable android.media.MediaCodecInfo.CodecCapabilities r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21) {
        /*
            r1 = r13
            r4 = r16
            com.google.android.gms.internal.ads.zzsw r12 = new com.google.android.gms.internal.ads.zzsw
            r0 = 1
            r2 = 0
            if (r4 == 0) goto L3c
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r4.isFeatureSupported(r3)
            if (r3 == 0) goto L3c
            int r3 = com.google.android.gms.internal.ads.zzeu.zza
            r5 = 22
            if (r3 > r5) goto L2a
            java.lang.String r3 = com.google.android.gms.internal.ads.zzeu.zzd
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L2c
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L2a
            goto L2c
        L2a:
            r8 = r0
            goto L3d
        L2c:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r13)
            if (r3 != 0) goto L3c
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r13)
            if (r3 == 0) goto L2a
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
            if (r21 != 0) goto L56
            if (r4 == 0) goto L58
            java.lang.String r3 = "secure-playback"
            boolean r3 = r4.isFeatureSupported(r3)
            if (r3 == 0) goto L58
        L56:
            r10 = r0
            goto L59
        L58:
            r10 = r2
        L59:
            int r3 = com.google.android.gms.internal.ads.zzeu.zza
            r5 = 35
            if (r3 < r5) goto L6b
            if (r4 == 0) goto L6b
            java.lang.String r3 = "detached-surface"
            boolean r3 = r4.isFeatureSupported(r3)
            if (r3 == 0) goto L6b
            r11 = r0
            goto L6c
        L6b:
            r11 = r2
        L6c:
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsw.zzc(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.zzsw");
    }

    private static Point zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i4 = zzeu.zza;
        return new Point((((i2 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i3 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private final void zzj(String str) {
        String str2 = zzeu.zze;
        StringBuilder v2 = d.v("NoSupport [", str, "] [");
        v2.append(this.zza);
        v2.append(", ");
        v2.append(this.zzb);
        v2.append("] [");
        v2.append(str2);
        v2.append("]");
        zzea.zzb("MediaCodecInfo", v2.toString());
    }

    private static boolean zzk(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d) {
        Point zzi = zzi(videoCapabilities, i2, i3);
        int i4 = zzi.x;
        int i5 = zzi.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i4, i5) : videoCapabilities.areSizeAndRateSupported(i4, i5, Math.floor(d));
    }

    private final boolean zzl(zzaf zzafVar, boolean z2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair zza = zzts.zza(zzafVar);
        String str = zzafVar.zzn;
        if (str != null && str.equals("video/mv-hevc") && this.zzc.equals("video/hevc")) {
            zza = zzts.zzb(zzafVar);
        }
        if (zza != null) {
            int intValue = ((Integer) zza.first).intValue();
            int intValue2 = ((Integer) zza.second).intValue();
            int i2 = 8;
            if ("video/dolby-vision".equals(zzafVar.zzn)) {
                if ("video/avc".equals(this.zzb)) {
                    intValue = 8;
                } else if ("video/hevc".equals(this.zzb)) {
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
            if (zzeu.zza <= 23 && "video/x-vnd.on2.vp9".equals(this.zzb) && zzh.length == 0) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                if (intValue3 >= 180000000) {
                    i2 = 1024;
                } else if (intValue3 >= 120000000) {
                    i2 = 512;
                } else if (intValue3 >= 60000000) {
                    i2 = 256;
                } else if (intValue3 >= 30000000) {
                    i2 = 128;
                } else if (intValue3 >= 18000000) {
                    i2 = 64;
                } else if (intValue3 >= 12000000) {
                    i2 = 32;
                } else if (intValue3 >= 7200000) {
                    i2 = 16;
                } else if (intValue3 < 3600000) {
                    i2 = intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
                }
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                codecProfileLevel.profile = 1;
                codecProfileLevel.level = i2;
                zzh = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : zzh) {
                if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z2)) {
                    if ("video/hevc".equals(this.zzb) && intValue == 2) {
                        String str2 = zzeu.zzb;
                        if (!"sailfish".equals(str2) && !"marlin".equals(str2)) {
                        }
                    }
                }
            }
            zzj(androidx.compose.foundation.text.input.a.l("codec.profileLevel, ", zzafVar.zzj, ", ", this.zzc));
            return false;
        }
        return true;
    }

    private final boolean zzm(zzaf zzafVar) {
        return this.zzb.equals(zzafVar.zzn) || this.zzb.equals(zzts.zzd(zzafVar));
    }

    public final String toString() {
        return this.zza;
    }

    @Nullable
    public final Point zza(int i2, int i3) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzi(videoCapabilities, i2, i3);
    }

    public final zzib zzb(zzaf zzafVar, zzaf zzafVar2) {
        int i2 = true != Objects.equals(zzafVar.zzn, zzafVar2.zzn) ? 8 : 0;
        if (this.zzi) {
            if (zzafVar.zzw != zzafVar2.zzw) {
                i2 |= 1024;
            }
            if (!this.zze && (zzafVar.zzt != zzafVar2.zzt || zzafVar.zzu != zzafVar2.zzu)) {
                i2 |= 512;
            }
            if ((!zzo.zzg(zzafVar.zzA) || !zzo.zzg(zzafVar2.zzA)) && !Objects.equals(zzafVar.zzA, zzafVar2.zzA)) {
                i2 |= Opcodes.ACC_STRICT;
            }
            String str = this.zza;
            if (zzeu.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzafVar.zzd(zzafVar2)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new zzib(this.zza, zzafVar, zzafVar2, true != zzafVar.zzd(zzafVar2) ? 2 : 3, 0);
            }
        } else {
            if (zzafVar.zzB != zzafVar2.zzB) {
                i2 |= 4096;
            }
            if (zzafVar.zzC != zzafVar2.zzC) {
                i2 |= 8192;
            }
            if (zzafVar.zzD != zzafVar2.zzD) {
                i2 |= 16384;
            }
            if (i2 == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                Pair zza = zzts.zza(zzafVar);
                Pair zza2 = zzts.zza(zzafVar2);
                if (zza != null && zza2 != null) {
                    int intValue = ((Integer) zza.first).intValue();
                    int intValue2 = ((Integer) zza2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new zzib(this.zza, zzafVar, zzafVar2, 3, 0);
                    }
                }
            }
            if (!zzafVar.zzd(zzafVar2)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new zzib(this.zza, zzafVar, zzafVar2, 1, 0);
            }
        }
        return new zzib(this.zza, zzafVar, zzafVar2, 0, i2);
    }

    public final boolean zzd(zzaf zzafVar) {
        return zzm(zzafVar) && zzl(zzafVar, false);
    }

    public final boolean zze(zzaf zzafVar) throws zztm {
        int i2;
        if (!zzm(zzafVar) || !zzl(zzafVar, true)) {
            return false;
        }
        if (this.zzi) {
            int i3 = zzafVar.zzt;
            if (i3 <= 0 || (i2 = zzafVar.zzu) <= 0) {
                return true;
            }
            return zzg(i3, i2, zzafVar.zzv);
        }
        int i4 = zzafVar.zzC;
        if (i4 != -1) {
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
            if (!audioCapabilities.isSampleRateSupported(i4)) {
                zzj(d.i("sampleRate.support, ", i4));
                return false;
            }
        }
        int i5 = zzafVar.zzB;
        if (i5 == -1) {
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
        if (maxInputChannelCount <= 1 && ((zzeu.zza < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
            int i6 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
            zzea.zzf("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i6 + "]");
            maxInputChannelCount = i6;
        }
        if (maxInputChannelCount >= i5) {
            return true;
        }
        zzj(d.i("channelCount.support, ", i5));
        return false;
    }

    public final boolean zzf(zzaf zzafVar) {
        if (this.zzi) {
            return this.zze;
        }
        Pair zza = zzts.zza(zzafVar);
        return zza != null && ((Integer) zza.first).intValue() == 42;
    }

    public final boolean zzg(int i2, int i3, double d) {
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
        if (zzeu.zza >= 29) {
            int zza = zzsy.zza(videoCapabilities, i2, i3, d);
            if (zza != 2) {
                if (zza == 1) {
                    StringBuilder u2 = d.u("sizeAndRate.cover, ", i2, "x", i3, "@");
                    u2.append(d);
                    zzj(u2.toString());
                    return false;
                }
            }
            return true;
        }
        if (!zzk(videoCapabilities, i2, i3, d)) {
            if (i2 >= i3 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) && "mcv5a".equals(zzeu.zzb)) || !zzk(videoCapabilities, i3, i2, d))) {
                StringBuilder u3 = d.u("sizeAndRate.support, ", i2, "x", i3, "@");
                u3.append(d);
                zzj(u3.toString());
                return false;
            }
            StringBuilder u4 = d.u("sizeAndRate.rotated, ", i2, "x", i3, "@");
            u4.append(d);
            String sb = u4.toString();
            String str = this.zza;
            String str2 = this.zzb;
            String str3 = zzeu.zze;
            StringBuilder t2 = androidx.compose.foundation.text.input.a.t("AssumedSupport [", sb, "] [", str, ", ");
            t2.append(str2);
            t2.append("] [");
            t2.append(str3);
            t2.append("]");
            zzea.zzb("MediaCodecInfo", t2.toString());
        }
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzh() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }
}
