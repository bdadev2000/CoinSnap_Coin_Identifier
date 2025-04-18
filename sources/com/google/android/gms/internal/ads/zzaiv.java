package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzaiv {
    @Nullable
    public static zzbc zza(zzed zzedVar) {
        String str;
        zzbc zzafxVar;
        int zzg = zzedVar.zzg() + zzedVar.zzd();
        int zzg2 = zzedVar.zzg();
        int i10 = (zzg2 >> 24) & 255;
        zzbc zzbcVar = null;
        try {
            if (i10 != 169 && i10 != 253) {
                if (zzg2 == 1735291493) {
                    String zza = zzagm.zza(zzb(zzedVar) - 1);
                    if (zza != null) {
                        zzafxVar = new zzagu("TCON", null, zzfzo.zzo(zza));
                        zzbcVar = zzafxVar;
                    } else {
                        zzdt.zzf("MetadataUtil", "Failed to parse standard genre code");
                    }
                } else if (zzg2 == 1684632427) {
                    zzbcVar = zzd(1684632427, "TPOS", zzedVar);
                } else if (zzg2 == 1953655662) {
                    zzbcVar = zzd(1953655662, "TRCK", zzedVar);
                } else if (zzg2 == 1953329263) {
                    zzbcVar = zzc(1953329263, "TBPM", zzedVar, true, false);
                } else if (zzg2 == 1668311404) {
                    zzbcVar = zzc(1668311404, "TCMP", zzedVar, true, true);
                } else if (zzg2 == 1668249202) {
                    int zzg3 = zzedVar.zzg();
                    if (zzedVar.zzg() == 1684108385) {
                        int zzg4 = zzedVar.zzg();
                        int i11 = zzain.zza;
                        int i12 = zzg4 & ViewCompat.MEASURED_SIZE_MASK;
                        if (i12 == 13) {
                            str = "image/jpeg";
                        } else if (i12 == 14) {
                            str = "image/png";
                            i12 = 14;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            zzdt.zzf("MetadataUtil", "Unrecognized cover art flags: " + i12);
                        } else {
                            zzedVar.zzM(4);
                            int i13 = zzg3 - 16;
                            byte[] bArr = new byte[i13];
                            zzedVar.zzH(bArr, 0, i13);
                            zzafxVar = new zzafx(str, null, 3, bArr);
                            zzbcVar = zzafxVar;
                        }
                    } else {
                        zzdt.zzf("MetadataUtil", "Failed to parse cover art attribute");
                    }
                } else if (zzg2 == 1631670868) {
                    zzbcVar = zze(1631670868, "TPE2", zzedVar);
                } else if (zzg2 == 1936682605) {
                    zzbcVar = zze(1936682605, "TSOT", zzedVar);
                } else if (zzg2 == 1936679276) {
                    zzbcVar = zze(1936679276, "TSOA", zzedVar);
                } else if (zzg2 == 1936679282) {
                    zzbcVar = zze(1936679282, "TSOP", zzedVar);
                } else if (zzg2 == 1936679265) {
                    zzbcVar = zze(1936679265, "TSO2", zzedVar);
                } else if (zzg2 == 1936679791) {
                    zzbcVar = zze(1936679791, "TSOC", zzedVar);
                } else if (zzg2 == 1920233063) {
                    zzbcVar = zzc(1920233063, "ITUNESADVISORY", zzedVar, false, false);
                } else if (zzg2 == 1885823344) {
                    zzbcVar = zzc(1885823344, "ITUNESGAPLESS", zzedVar, false, true);
                } else if (zzg2 == 1936683886) {
                    zzbcVar = zze(1936683886, "TVSHOWSORT", zzedVar);
                } else if (zzg2 == 1953919848) {
                    zzbcVar = zze(1953919848, "TVSHOW", zzedVar);
                } else {
                    if (zzg2 == 757935405) {
                        int i14 = -1;
                        int i15 = -1;
                        String str2 = null;
                        String str3 = null;
                        while (zzedVar.zzd() < zzg) {
                            int zzd = zzedVar.zzd();
                            int zzg5 = zzedVar.zzg();
                            int zzg6 = zzedVar.zzg();
                            zzedVar.zzM(4);
                            if (zzg6 == 1835360622) {
                                str2 = zzedVar.zzA(zzg5 - 12);
                            } else {
                                int i16 = zzg5 - 12;
                                if (zzg6 == 1851878757) {
                                    str3 = zzedVar.zzA(i16);
                                } else {
                                    if (zzg6 == 1684108385) {
                                        i15 = zzg5;
                                    }
                                    if (zzg6 == 1684108385) {
                                        i14 = zzd;
                                    }
                                    zzedVar.zzM(i16);
                                }
                            }
                        }
                        if (str2 != null && str3 != null && i14 != -1) {
                            zzedVar.zzL(i14);
                            zzedVar.zzM(16);
                            zzbcVar = new zzago(str2, str3, zzedVar.zzA(i15 - 16));
                        }
                    }
                    zzdt.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzev.zze(zzg2));
                }
            } else {
                int i17 = zzg2 & ViewCompat.MEASURED_SIZE_MASK;
                if (i17 == 6516084) {
                    int zzg7 = zzedVar.zzg();
                    if (zzedVar.zzg() == 1684108385) {
                        zzedVar.zzM(8);
                        String zzA = zzedVar.zzA(zzg7 - 16);
                        zzbcVar = new zzagf(C.LANGUAGE_UNDETERMINED, zzA, zzA);
                    } else {
                        zzdt.zzf("MetadataUtil", "Failed to parse comment attribute: ".concat(zzev.zze(zzg2)));
                    }
                } else {
                    if (i17 != 7233901 && i17 != 7631467) {
                        if (i17 != 6516589 && i17 != 7828084) {
                            if (i17 == 6578553) {
                                zzbcVar = zze(zzg2, "TDRC", zzedVar);
                            } else if (i17 == 4280916) {
                                zzbcVar = zze(zzg2, "TPE1", zzedVar);
                            } else if (i17 == 7630703) {
                                zzbcVar = zze(zzg2, "TSSE", zzedVar);
                            } else if (i17 == 6384738) {
                                zzbcVar = zze(zzg2, "TALB", zzedVar);
                            } else if (i17 == 7108978) {
                                zzbcVar = zze(zzg2, "USLT", zzedVar);
                            } else if (i17 == 6776174) {
                                zzbcVar = zze(zzg2, "TCON", zzedVar);
                            } else {
                                if (i17 == 6779504) {
                                    zzbcVar = zze(zzg2, "TIT1", zzedVar);
                                }
                                zzdt.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzev.zze(zzg2));
                            }
                        }
                        zzbcVar = zze(zzg2, "TCOM", zzedVar);
                    }
                    zzbcVar = zze(zzg2, "TIT2", zzedVar);
                }
            }
            return zzbcVar;
        } finally {
            zzedVar.zzL(zzg);
        }
    }

    private static int zzb(zzed zzedVar) {
        int zzg = zzedVar.zzg();
        if (zzedVar.zzg() == 1684108385) {
            zzedVar.zzM(8);
            int i10 = zzg - 16;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4 && (zzedVar.zzf() & 128) == 0) {
                            return zzedVar.zzp();
                        }
                    } else {
                        return zzedVar.zzo();
                    }
                } else {
                    return zzedVar.zzq();
                }
            } else {
                return zzedVar.zzm();
            }
        }
        zzdt.zzf("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    @Nullable
    private static zzagl zzc(int i10, String str, zzed zzedVar, boolean z10, boolean z11) {
        int zzb = zzb(zzedVar);
        if (z11) {
            zzb = Math.min(1, zzb);
        }
        if (zzb >= 0) {
            if (z10) {
                return new zzagu(str, null, zzfzo.zzo(Integer.toString(zzb)));
            }
            return new zzagf(C.LANGUAGE_UNDETERMINED, str, Integer.toString(zzb));
        }
        zzdt.zzf("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzev.zze(i10)));
        return null;
    }

    @Nullable
    private static zzagu zzd(int i10, String str, zzed zzedVar) {
        int zzg = zzedVar.zzg();
        if (zzedVar.zzg() == 1684108385 && zzg >= 22) {
            zzedVar.zzM(10);
            int zzq = zzedVar.zzq();
            if (zzq > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(zzq);
                String sb3 = sb2.toString();
                int zzq2 = zzedVar.zzq();
                if (zzq2 > 0) {
                    sb3 = sb3 + "/" + zzq2;
                }
                return new zzagu(str, null, zzfzo.zzo(sb3));
            }
        }
        zzdt.zzf("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzev.zze(i10)));
        return null;
    }

    @Nullable
    private static zzagu zze(int i10, String str, zzed zzedVar) {
        int zzg = zzedVar.zzg();
        if (zzedVar.zzg() == 1684108385) {
            zzedVar.zzM(8);
            return new zzagu(str, null, zzfzo.zzo(zzedVar.zzA(zzg - 16)));
        }
        zzdt.zzf("MetadataUtil", "Failed to parse text attribute: ".concat(zzev.zze(i10)));
        return null;
    }
}
