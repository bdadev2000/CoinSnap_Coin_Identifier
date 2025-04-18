package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes3.dex */
final class zzaen implements zzaef {
    public final zzfzo zza;
    private final int zzb;

    private zzaen(int i10, zzfzo zzfzoVar) {
        this.zzb = i10;
        this.zza = zzfzoVar;
    }

    public static zzaen zzc(int i10, zzed zzedVar) {
        zzaef zzaefVar;
        String str;
        int i11;
        String str2;
        zzfzl zzfzlVar = new zzfzl();
        int zze = zzedVar.zze();
        int i12 = -2;
        while (zzedVar.zzb() > 8) {
            int zzi = zzedVar.zzi();
            int zzd = zzedVar.zzd() + zzedVar.zzi();
            zzedVar.zzK(zzd);
            if (zzi == 1414744396) {
                zzaefVar = zzc(zzedVar.zzi(), zzedVar);
            } else {
                zzaeo zzaeoVar = null;
                switch (zzi) {
                    case 1718776947:
                        if (i12 == 2) {
                            zzedVar.zzM(4);
                            int zzi2 = zzedVar.zzi();
                            int zzi3 = zzedVar.zzi();
                            zzedVar.zzM(4);
                            int zzi4 = zzedVar.zzi();
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
                                e.r("Ignoring track with unsupported compression ", zzi4, "StreamFormatChunk");
                                break;
                            } else {
                                zzab zzabVar = new zzab();
                                zzabVar.zzae(zzi2);
                                zzabVar.zzJ(zzi3);
                                zzabVar.zzZ(str2);
                                zzaeoVar = new zzaeo(zzabVar.zzaf());
                                break;
                            }
                        } else if (i12 == 1) {
                            int zzk = zzedVar.zzk();
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
                                e.r("Ignoring track with unsupported format tag ", zzk, "StreamFormatChunk");
                                break;
                            } else {
                                int zzk2 = zzedVar.zzk();
                                int zzi5 = zzedVar.zzi();
                                zzedVar.zzM(6);
                                int zzn = zzen.zzn(zzedVar.zzk());
                                if (zzedVar.zzb() > 0) {
                                    i11 = zzedVar.zzk();
                                } else {
                                    i11 = 0;
                                }
                                byte[] bArr = new byte[i11];
                                zzedVar.zzH(bArr, 0, i11);
                                zzab zzabVar2 = new zzab();
                                zzabVar2.zzZ(str);
                                zzabVar2.zzz(zzk2);
                                zzabVar2.zzaa(zzi5);
                                if (MimeTypes.AUDIO_RAW.equals(str) && zzn != 0) {
                                    zzabVar2.zzT(zzn);
                                }
                                if (MimeTypes.AUDIO_AAC.equals(str) && i11 > 0) {
                                    zzabVar2.zzM(zzfzo.zzo(bArr));
                                }
                                zzaefVar = new zzaeo(zzabVar2.zzaf());
                                break;
                            }
                        } else {
                            zzdt.zzf("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzen.zzD(i12)));
                            break;
                        }
                    case 1751742049:
                        zzaefVar = zzaek.zzb(zzedVar);
                        break;
                    case 1752331379:
                        zzaefVar = zzael.zzb(zzedVar);
                        break;
                    case 1852994675:
                        zzaefVar = zzaep.zzb(zzedVar);
                        break;
                }
                zzaefVar = zzaeoVar;
            }
            if (zzaefVar != null) {
                if (zzaefVar.zza() == 1752331379) {
                    int i13 = ((zzael) zzaefVar).zza;
                    if (i13 != 1935960438) {
                        if (i13 != 1935963489) {
                            if (i13 != 1937012852) {
                                zzdt.zzf("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i13))));
                                i12 = -1;
                            } else {
                                i12 = 3;
                            }
                        } else {
                            i12 = 1;
                        }
                    } else {
                        i12 = 2;
                    }
                }
                zzfzlVar.zzf(zzaefVar);
            }
            zzedVar.zzL(zzd);
            zzedVar.zzK(zze);
        }
        return new zzaen(i10, zzfzlVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final int zza() {
        return this.zzb;
    }

    @Nullable
    public final zzaef zzb(Class cls) {
        zzfzo zzfzoVar = this.zza;
        int size = zzfzoVar.size();
        int i10 = 0;
        while (i10 < size) {
            zzaef zzaefVar = (zzaef) zzfzoVar.get(i10);
            i10++;
            if (zzaefVar.getClass() == cls) {
                return zzaefVar;
            }
        }
        return null;
    }
}
