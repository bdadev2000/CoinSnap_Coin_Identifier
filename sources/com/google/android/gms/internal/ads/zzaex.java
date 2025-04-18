package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.applovin.impl.adview.t;

/* loaded from: classes.dex */
final class zzaex implements zzaep {
    public final zzgax zza;
    private final int zzb;

    private zzaex(int i2, zzgax zzgaxVar) {
        this.zzb = i2;
        this.zza = zzgaxVar;
    }

    public static zzaex zzc(int i2, zzek zzekVar) {
        zzaep zzaeyVar;
        String str;
        zzgau zzgauVar = new zzgau();
        int zze = zzekVar.zze();
        int i3 = -2;
        while (zzekVar.zzb() > 8) {
            int zzi = zzekVar.zzi();
            int zzd = zzekVar.zzd() + zzekVar.zzi();
            zzekVar.zzK(zzd);
            if (zzi == 1414744396) {
                zzaeyVar = zzc(zzekVar.zzi(), zzekVar);
            } else {
                zzaey zzaeyVar2 = null;
                switch (zzi) {
                    case 1718776947:
                        if (i3 != 2) {
                            if (i3 != 1) {
                                zzea.zzf("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzeu.zzC(i3)));
                                break;
                            } else {
                                int zzk = zzekVar.zzk();
                                String str2 = zzk != 1 ? zzk != 85 ? zzk != 255 ? zzk != 8192 ? zzk != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int zzk2 = zzekVar.zzk();
                                    int zzi2 = zzekVar.zzi();
                                    zzekVar.zzM(6);
                                    int zzm = zzeu.zzm(zzekVar.zzk());
                                    int zzk3 = zzekVar.zzb() > 0 ? zzekVar.zzk() : 0;
                                    byte[] bArr = new byte[zzk3];
                                    zzekVar.zzH(bArr, 0, zzk3);
                                    zzad zzadVar = new zzad();
                                    zzadVar.zzZ(str2);
                                    zzadVar.zzz(zzk2);
                                    zzadVar.zzaa(zzi2);
                                    if ("audio/raw".equals(str2) && zzm != 0) {
                                        zzadVar.zzT(zzm);
                                    }
                                    if ("audio/mp4a-latm".equals(str2) && zzk3 > 0) {
                                        zzadVar.zzM(zzgax.zzo(bArr));
                                    }
                                    zzaeyVar = new zzaey(zzadVar.zzaf());
                                    break;
                                } else {
                                    t.C("Ignoring track with unsupported format tag ", zzk, "StreamFormatChunk");
                                    break;
                                }
                            }
                        } else {
                            zzekVar.zzM(4);
                            int zzi3 = zzekVar.zzi();
                            int zzi4 = zzekVar.zzi();
                            zzekVar.zzM(4);
                            int zzi5 = zzekVar.zzi();
                            switch (zzi5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                zzad zzadVar2 = new zzad();
                                zzadVar2.zzae(zzi3);
                                zzadVar2.zzJ(zzi4);
                                zzadVar2.zzZ(str);
                                zzaeyVar2 = new zzaey(zzadVar2.zzaf());
                                break;
                            } else {
                                t.C("Ignoring track with unsupported compression ", zzi5, "StreamFormatChunk");
                                break;
                            }
                        }
                    case 1751742049:
                        zzaeyVar = zzaeu.zzb(zzekVar);
                        break;
                    case 1752331379:
                        zzaeyVar = zzaev.zzb(zzekVar);
                        break;
                    case 1852994675:
                        zzaeyVar = zzaez.zzb(zzekVar);
                        break;
                }
                zzaeyVar = zzaeyVar2;
            }
            if (zzaeyVar != null) {
                if (zzaeyVar.zza() == 1752331379) {
                    int i4 = ((zzaev) zzaeyVar).zza;
                    if (i4 == 1935960438) {
                        i3 = 2;
                    } else if (i4 == 1935963489) {
                        i3 = 1;
                    } else if (i4 != 1937012852) {
                        zzea.zzf("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i4))));
                        i3 = -1;
                    } else {
                        i3 = 3;
                    }
                }
                zzgauVar.zzf(zzaeyVar);
            }
            zzekVar.zzL(zzd);
            zzekVar.zzK(zze);
        }
        return new zzaex(i2, zzgauVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    public final int zza() {
        return this.zzb;
    }

    @Nullable
    public final zzaep zzb(Class cls) {
        zzgax zzgaxVar = this.zza;
        int size = zzgaxVar.size();
        int i2 = 0;
        while (i2 < size) {
            zzaep zzaepVar = (zzaep) zzgaxVar.get(i2);
            i2++;
            if (zzaepVar.getClass() == cls) {
                return zzaepVar;
            }
        }
        return null;
    }
}
