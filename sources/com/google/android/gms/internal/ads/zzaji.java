package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.firebase.sessions.settings.RemoteSettings;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaji {
    @Nullable
    public static zzbj zza(zzek zzekVar) {
        String str;
        int zzg = zzekVar.zzg() + zzekVar.zzd();
        int zzg2 = zzekVar.zzg();
        int i2 = (zzg2 >> 24) & 255;
        zzbj zzbjVar = null;
        try {
            if (i2 == 169 || i2 == 253) {
                int i3 = zzg2 & 16777215;
                if (i3 == 6516084) {
                    int zzg3 = zzekVar.zzg();
                    if (zzekVar.zzg() == 1684108385) {
                        zzekVar.zzM(8);
                        String zzA = zzekVar.zzA(zzg3 - 16);
                        zzbjVar = new zzagp("und", zzA, zzA);
                    } else {
                        zzea.zzf("MetadataUtil", "Failed to parse comment attribute: ".concat(zzaio.zzf(zzg2)));
                    }
                } else {
                    if (i3 != 7233901 && i3 != 7631467) {
                        if (i3 != 6516589 && i3 != 7828084) {
                            if (i3 == 6578553) {
                                zzbjVar = zze(zzg2, "TDRC", zzekVar);
                            } else if (i3 == 4280916) {
                                zzbjVar = zze(zzg2, "TPE1", zzekVar);
                            } else if (i3 == 7630703) {
                                zzbjVar = zze(zzg2, "TSSE", zzekVar);
                            } else if (i3 == 6384738) {
                                zzbjVar = zze(zzg2, "TALB", zzekVar);
                            } else if (i3 == 7108978) {
                                zzbjVar = zze(zzg2, "USLT", zzekVar);
                            } else if (i3 == 6776174) {
                                zzbjVar = zze(zzg2, "TCON", zzekVar);
                            } else {
                                if (i3 == 6779504) {
                                    zzbjVar = zze(zzg2, "TIT1", zzekVar);
                                }
                                zzea.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzaio.zzf(zzg2));
                            }
                        }
                        zzbjVar = zze(zzg2, "TCOM", zzekVar);
                    }
                    zzbjVar = zze(zzg2, "TIT2", zzekVar);
                }
            } else if (zzg2 == 1735291493) {
                String zza = zzagw.zza(zzb(zzekVar) - 1);
                if (zza != null) {
                    zzbjVar = new zzahe("TCON", null, zzgax.zzo(zza));
                } else {
                    zzea.zzf("MetadataUtil", "Failed to parse standard genre code");
                }
            } else if (zzg2 == 1684632427) {
                zzbjVar = zzd(1684632427, "TPOS", zzekVar);
            } else if (zzg2 == 1953655662) {
                zzbjVar = zzd(1953655662, "TRCK", zzekVar);
            } else if (zzg2 == 1953329263) {
                zzbjVar = zzc(1953329263, "TBPM", zzekVar, true, false);
            } else if (zzg2 == 1668311404) {
                zzbjVar = zzc(1668311404, "TCMP", zzekVar, true, true);
            } else if (zzg2 == 1668249202) {
                int zzg4 = zzekVar.zzg();
                if (zzekVar.zzg() == 1684108385) {
                    int zzg5 = zzekVar.zzg() & 16777215;
                    if (zzg5 == 13) {
                        str = "image/jpeg";
                    } else if (zzg5 == 14) {
                        str = "image/png";
                        zzg5 = 14;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        zzea.zzf("MetadataUtil", "Unrecognized cover art flags: " + zzg5);
                    } else {
                        zzekVar.zzM(4);
                        int i4 = zzg4 - 16;
                        byte[] bArr = new byte[i4];
                        zzekVar.zzH(bArr, 0, i4);
                        zzbjVar = new zzagh(str, null, 3, bArr);
                    }
                } else {
                    zzea.zzf("MetadataUtil", "Failed to parse cover art attribute");
                }
            } else if (zzg2 == 1631670868) {
                zzbjVar = zze(1631670868, "TPE2", zzekVar);
            } else if (zzg2 == 1936682605) {
                zzbjVar = zze(1936682605, "TSOT", zzekVar);
            } else if (zzg2 == 1936679276) {
                zzbjVar = zze(1936679276, "TSOA", zzekVar);
            } else if (zzg2 == 1936679282) {
                zzbjVar = zze(1936679282, "TSOP", zzekVar);
            } else if (zzg2 == 1936679265) {
                zzbjVar = zze(1936679265, "TSO2", zzekVar);
            } else if (zzg2 == 1936679791) {
                zzbjVar = zze(1936679791, "TSOC", zzekVar);
            } else if (zzg2 == 1920233063) {
                zzbjVar = zzc(1920233063, "ITUNESADVISORY", zzekVar, false, false);
            } else if (zzg2 == 1885823344) {
                zzbjVar = zzc(1885823344, "ITUNESGAPLESS", zzekVar, false, true);
            } else if (zzg2 == 1936683886) {
                zzbjVar = zze(1936683886, "TVSHOWSORT", zzekVar);
            } else if (zzg2 == 1953919848) {
                zzbjVar = zze(1953919848, "TVSHOW", zzekVar);
            } else {
                if (zzg2 == 757935405) {
                    int i5 = -1;
                    int i6 = -1;
                    String str2 = null;
                    String str3 = null;
                    while (zzekVar.zzd() < zzg) {
                        int zzd = zzekVar.zzd();
                        int zzg6 = zzekVar.zzg();
                        int zzg7 = zzekVar.zzg();
                        zzekVar.zzM(4);
                        if (zzg7 == 1835360622) {
                            str2 = zzekVar.zzA(zzg6 - 12);
                        } else {
                            int i7 = zzg6 - 12;
                            if (zzg7 == 1851878757) {
                                str3 = zzekVar.zzA(i7);
                            } else {
                                if (zzg7 == 1684108385) {
                                    i6 = zzg6;
                                }
                                if (zzg7 == 1684108385) {
                                    i5 = zzd;
                                }
                                zzekVar.zzM(i7);
                            }
                        }
                    }
                    if (str2 != null && str3 != null && i5 != -1) {
                        zzekVar.zzL(i5);
                        zzekVar.zzM(16);
                        zzbjVar = new zzagy(str2, str3, zzekVar.zzA(i6 - 16));
                    }
                }
                zzea.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzaio.zzf(zzg2));
            }
            return zzbjVar;
        } finally {
            zzekVar.zzL(zzg);
        }
    }

    private static int zzb(zzek zzekVar) {
        int zzg = zzekVar.zzg();
        if (zzekVar.zzg() == 1684108385) {
            zzekVar.zzM(8);
            int i2 = zzg - 16;
            if (i2 == 1) {
                return zzekVar.zzm();
            }
            if (i2 == 2) {
                return zzekVar.zzq();
            }
            if (i2 == 3) {
                return zzekVar.zzo();
            }
            if (i2 == 4 && (zzekVar.zzf() & 128) == 0) {
                return zzekVar.zzp();
            }
        }
        zzea.zzf("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    @Nullable
    private static zzagv zzc(int i2, String str, zzek zzekVar, boolean z2, boolean z3) {
        int zzb = zzb(zzekVar);
        if (z3) {
            zzb = Math.min(1, zzb);
        }
        if (zzb >= 0) {
            return z2 ? new zzahe(str, null, zzgax.zzo(Integer.toString(zzb))) : new zzagp("und", str, Integer.toString(zzb));
        }
        zzea.zzf("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzaio.zzf(i2)));
        return null;
    }

    @Nullable
    private static zzahe zzd(int i2, String str, zzek zzekVar) {
        int zzg = zzekVar.zzg();
        if (zzekVar.zzg() == 1684108385 && zzg >= 22) {
            zzekVar.zzM(10);
            int zzq = zzekVar.zzq();
            if (zzq > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(zzq);
                String sb2 = sb.toString();
                int zzq2 = zzekVar.zzq();
                if (zzq2 > 0) {
                    sb2 = sb2 + RemoteSettings.FORWARD_SLASH_STRING + zzq2;
                }
                return new zzahe(str, null, zzgax.zzo(sb2));
            }
        }
        zzea.zzf("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzaio.zzf(i2)));
        return null;
    }

    @Nullable
    private static zzahe zze(int i2, String str, zzek zzekVar) {
        int zzg = zzekVar.zzg();
        if (zzekVar.zzg() == 1684108385) {
            zzekVar.zzM(8);
            return new zzahe(str, null, zzgax.zzo(zzekVar.zzA(zzg - 16)));
        }
        zzea.zzf("MetadataUtil", "Failed to parse text attribute: ".concat(zzaio.zzf(i2)));
        return null;
    }
}
