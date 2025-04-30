package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.applovin.impl.L;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes2.dex */
final class zzafr implements zzafj {
    public final zzgbc zza;
    private final int zzb;

    private zzafr(int i9, zzgbc zzgbcVar) {
        this.zzb = i9;
        this.zza = zzgbcVar;
    }

    public static zzafr zzc(int i9, zzfu zzfuVar) {
        String str;
        zzafj zzafsVar;
        String str2;
        zzgaz zzgazVar = new zzgaz();
        int zze = zzfuVar.zze();
        int i10 = -2;
        while (zzfuVar.zzb() > 8) {
            int zzi = zzfuVar.zzi();
            int zzd = zzfuVar.zzd() + zzfuVar.zzi();
            zzfuVar.zzJ(zzd);
            if (zzi == 1414744396) {
                zzafsVar = zzc(zzfuVar.zzi(), zzfuVar);
            } else {
                zzafs zzafsVar2 = null;
                switch (zzi) {
                    case 1718776947:
                        if (i10 == 2) {
                            zzfuVar.zzL(4);
                            int zzi2 = zzfuVar.zzi();
                            int zzi3 = zzfuVar.zzi();
                            zzfuVar.zzL(4);
                            int zzi4 = zzfuVar.zzi();
                            switch (zzi4) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = MimeTypes.VIDEO_MP4V;
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = MimeTypes.VIDEO_H264;
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                L.z(zzi4, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                break;
                            } else {
                                zzal zzalVar = new zzal();
                                zzalVar.zzac(zzi2);
                                zzalVar.zzI(zzi3);
                                zzalVar.zzX(str2);
                                zzafsVar2 = new zzafs(zzalVar.zzad());
                                break;
                            }
                        } else if (i10 == 1) {
                            int zzk = zzfuVar.zzk();
                            if (zzk != 1) {
                                if (zzk != 85) {
                                    if (zzk != 255) {
                                        if (zzk != 8192) {
                                            if (zzk != 8193) {
                                                str = null;
                                            } else {
                                                str = MimeTypes.AUDIO_DTS;
                                            }
                                        } else {
                                            str = MimeTypes.AUDIO_AC3;
                                        }
                                    } else {
                                        str = MimeTypes.AUDIO_AAC;
                                    }
                                } else {
                                    str = MimeTypes.AUDIO_MPEG;
                                }
                            } else {
                                str = MimeTypes.AUDIO_RAW;
                            }
                            if (str == null) {
                                L.z(zzk, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                break;
                            } else {
                                int zzk2 = zzfuVar.zzk();
                                int zzi5 = zzfuVar.zzi();
                                zzfuVar.zzL(6);
                                int zzl = zzgd.zzl(zzfuVar.zzq());
                                int zzk3 = zzfuVar.zzk();
                                byte[] bArr = new byte[zzk3];
                                zzfuVar.zzG(bArr, 0, zzk3);
                                zzal zzalVar2 = new zzal();
                                zzalVar2.zzX(str);
                                zzalVar2.zzy(zzk2);
                                zzalVar2.zzY(zzi5);
                                if (MimeTypes.AUDIO_RAW.equals(str) && zzl != 0) {
                                    zzalVar2.zzR(zzl);
                                }
                                if (MimeTypes.AUDIO_AAC.equals(str) && zzk3 > 0) {
                                    zzalVar2.zzL(zzgbc.zzn(bArr));
                                }
                                zzafsVar = new zzafs(zzalVar2.zzad());
                                break;
                            }
                        } else {
                            zzfk.zzf("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzgd.zzC(i10)));
                            break;
                        }
                    case 1751742049:
                        zzafsVar = zzafo.zzb(zzfuVar);
                        break;
                    case 1752331379:
                        zzafsVar = zzafp.zzb(zzfuVar);
                        break;
                    case 1852994675:
                        zzafsVar = zzaft.zzb(zzfuVar);
                        break;
                }
                zzafsVar = zzafsVar2;
            }
            if (zzafsVar != null) {
                if (zzafsVar.zza() == 1752331379) {
                    int i11 = ((zzafp) zzafsVar).zza;
                    if (i11 != 1935960438) {
                        if (i11 != 1935963489) {
                            if (i11 != 1937012852) {
                                zzfk.zzf("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i11))));
                                i10 = -1;
                            } else {
                                i10 = 3;
                            }
                        } else {
                            i10 = 1;
                        }
                    } else {
                        i10 = 2;
                    }
                }
                zzgazVar.zzf(zzafsVar);
            }
            zzfuVar.zzK(zzd);
            zzfuVar.zzJ(zze);
        }
        return new zzafr(i9, zzgazVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzafj
    public final int zza() {
        return this.zzb;
    }

    @Nullable
    public final zzafj zzb(Class cls) {
        zzgbc zzgbcVar = this.zza;
        int size = zzgbcVar.size();
        int i9 = 0;
        while (i9 < size) {
            zzafj zzafjVar = (zzafj) zzgbcVar.get(i9);
            i9++;
            if (zzafjVar.getClass() == cls) {
                return zzafjVar;
            }
        }
        return null;
    }
}
