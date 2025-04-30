package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzakf {
    static final String[] zza = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final /* synthetic */ int zzb = 0;

    @Nullable
    public static zzcc zza(zzfu zzfuVar) {
        String str;
        String str2;
        int zzg = zzfuVar.zzg() + zzfuVar.zzd();
        int zzg2 = zzfuVar.zzg();
        int i9 = (zzg2 >> 24) & 255;
        zzcc zzccVar = null;
        try {
            if (i9 != 169 && i9 != 253) {
                if (zzg2 == 1735291493) {
                    int zzb2 = zzb(zzfuVar);
                    if (zzb2 > 0 && zzb2 <= 192) {
                        str2 = zza[zzb2 - 1];
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        zzccVar = new zzahz("TCON", null, zzgbc.zzn(str2));
                    } else {
                        zzfk.zzf("MetadataUtil", "Failed to parse standard genre code");
                    }
                } else if (zzg2 == 1684632427) {
                    zzccVar = zzd(1684632427, "TPOS", zzfuVar);
                } else if (zzg2 == 1953655662) {
                    zzccVar = zzd(1953655662, "TRCK", zzfuVar);
                } else if (zzg2 == 1953329263) {
                    zzccVar = zzc(1953329263, "TBPM", zzfuVar, true, false);
                } else if (zzg2 == 1668311404) {
                    zzccVar = zzc(1668311404, "TCMP", zzfuVar, true, true);
                } else if (zzg2 == 1668249202) {
                    int zzg3 = zzfuVar.zzg();
                    if (zzfuVar.zzg() == 1684108385) {
                        int zzg4 = zzfuVar.zzg() & ViewCompat.MEASURED_SIZE_MASK;
                        if (zzg4 == 13) {
                            str = "image/jpeg";
                        } else if (zzg4 == 14) {
                            str = "image/png";
                            zzg4 = 14;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            zzfk.zzf("MetadataUtil", "Unrecognized cover art flags: " + zzg4);
                        } else {
                            zzfuVar.zzL(4);
                            int i10 = zzg3 - 16;
                            byte[] bArr = new byte[i10];
                            zzfuVar.zzG(bArr, 0, i10);
                            zzccVar = new zzahc(str, null, 3, bArr);
                        }
                    } else {
                        zzfk.zzf("MetadataUtil", "Failed to parse cover art attribute");
                    }
                } else if (zzg2 == 1631670868) {
                    zzccVar = zze(1631670868, "TPE2", zzfuVar);
                } else if (zzg2 == 1936682605) {
                    zzccVar = zze(1936682605, "TSOT", zzfuVar);
                } else if (zzg2 == 1936679276) {
                    zzccVar = zze(1936679276, "TSOA", zzfuVar);
                } else if (zzg2 == 1936679282) {
                    zzccVar = zze(1936679282, "TSOP", zzfuVar);
                } else if (zzg2 == 1936679265) {
                    zzccVar = zze(1936679265, "TSO2", zzfuVar);
                } else if (zzg2 == 1936679791) {
                    zzccVar = zze(1936679791, "TSOC", zzfuVar);
                } else if (zzg2 == 1920233063) {
                    zzccVar = zzc(1920233063, "ITUNESADVISORY", zzfuVar, false, false);
                } else if (zzg2 == 1885823344) {
                    zzccVar = zzc(1885823344, "ITUNESGAPLESS", zzfuVar, false, true);
                } else if (zzg2 == 1936683886) {
                    zzccVar = zze(1936683886, "TVSHOWSORT", zzfuVar);
                } else if (zzg2 == 1953919848) {
                    zzccVar = zze(1953919848, "TVSHOW", zzfuVar);
                } else {
                    if (zzg2 == 757935405) {
                        int i11 = -1;
                        int i12 = -1;
                        String str3 = null;
                        String str4 = null;
                        while (zzfuVar.zzd() < zzg) {
                            int zzd = zzfuVar.zzd();
                            int zzg5 = zzfuVar.zzg();
                            int zzg6 = zzfuVar.zzg();
                            zzfuVar.zzL(4);
                            if (zzg6 == 1835360622) {
                                str3 = zzfuVar.zzz(zzg5 - 12);
                            } else {
                                int i13 = zzg5 - 12;
                                if (zzg6 == 1851878757) {
                                    str4 = zzfuVar.zzz(i13);
                                } else {
                                    if (zzg6 == 1684108385) {
                                        i12 = zzg5;
                                    }
                                    if (zzg6 == 1684108385) {
                                        i11 = zzd;
                                    }
                                    zzfuVar.zzL(i13);
                                }
                            }
                        }
                        if (str3 != null && str4 != null && i11 != -1) {
                            zzfuVar.zzK(i11);
                            zzfuVar.zzL(16);
                            zzccVar = new zzaht(str3, str4, zzfuVar.zzz(i12 - 16));
                        }
                    }
                    zzfk.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzajo.zzf(zzg2));
                }
            } else {
                int i14 = zzg2 & ViewCompat.MEASURED_SIZE_MASK;
                if (i14 == 6516084) {
                    int zzg7 = zzfuVar.zzg();
                    if (zzfuVar.zzg() == 1684108385) {
                        zzfuVar.zzL(8);
                        String zzz = zzfuVar.zzz(zzg7 - 16);
                        zzccVar = new zzahk(C.LANGUAGE_UNDETERMINED, zzz, zzz);
                    } else {
                        zzfk.zzf("MetadataUtil", "Failed to parse comment attribute: ".concat(zzajo.zzf(zzg2)));
                    }
                } else {
                    if (i14 != 7233901 && i14 != 7631467) {
                        if (i14 != 6516589 && i14 != 7828084) {
                            if (i14 == 6578553) {
                                zzccVar = zze(zzg2, "TDRC", zzfuVar);
                            } else if (i14 == 4280916) {
                                zzccVar = zze(zzg2, "TPE1", zzfuVar);
                            } else if (i14 == 7630703) {
                                zzccVar = zze(zzg2, "TSSE", zzfuVar);
                            } else if (i14 == 6384738) {
                                zzccVar = zze(zzg2, "TALB", zzfuVar);
                            } else if (i14 == 7108978) {
                                zzccVar = zze(zzg2, "USLT", zzfuVar);
                            } else if (i14 == 6776174) {
                                zzccVar = zze(zzg2, "TCON", zzfuVar);
                            } else {
                                if (i14 == 6779504) {
                                    zzccVar = zze(zzg2, "TIT1", zzfuVar);
                                }
                                zzfk.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzajo.zzf(zzg2));
                            }
                        }
                        zzccVar = zze(zzg2, "TCOM", zzfuVar);
                    }
                    zzccVar = zze(zzg2, "TIT2", zzfuVar);
                }
            }
            return zzccVar;
        } finally {
            zzfuVar.zzK(zzg);
        }
    }

    private static int zzb(zzfu zzfuVar) {
        int zzg = zzfuVar.zzg();
        if (zzfuVar.zzg() == 1684108385) {
            zzfuVar.zzL(8);
            int i9 = zzg - 16;
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 == 4 && (zzfuVar.zzf() & 128) == 0) {
                            return zzfuVar.zzp();
                        }
                    } else {
                        return zzfuVar.zzo();
                    }
                } else {
                    return zzfuVar.zzq();
                }
            } else {
                return zzfuVar.zzm();
            }
        }
        zzfk.zzf("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    @Nullable
    private static zzahr zzc(int i9, String str, zzfu zzfuVar, boolean z8, boolean z9) {
        int zzb2 = zzb(zzfuVar);
        if (z9) {
            zzb2 = Math.min(1, zzb2);
        }
        if (zzb2 >= 0) {
            if (z8) {
                return new zzahz(str, null, zzgbc.zzn(Integer.toString(zzb2)));
            }
            return new zzahk(C.LANGUAGE_UNDETERMINED, str, Integer.toString(zzb2));
        }
        zzfk.zzf("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzajo.zzf(i9)));
        return null;
    }

    @Nullable
    private static zzahz zzd(int i9, String str, zzfu zzfuVar) {
        int zzg = zzfuVar.zzg();
        if (zzfuVar.zzg() == 1684108385 && zzg >= 22) {
            zzfuVar.zzL(10);
            int zzq = zzfuVar.zzq();
            if (zzq > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(zzq);
                String sb2 = sb.toString();
                int zzq2 = zzfuVar.zzq();
                if (zzq2 > 0) {
                    sb2 = sb2 + "/" + zzq2;
                }
                return new zzahz(str, null, zzgbc.zzn(sb2));
            }
        }
        zzfk.zzf("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzajo.zzf(i9)));
        return null;
    }

    @Nullable
    private static zzahz zze(int i9, String str, zzfu zzfuVar) {
        int zzg = zzfuVar.zzg();
        if (zzfuVar.zzg() == 1684108385) {
            zzfuVar.zzL(8);
            return new zzahz(str, null, zzgbc.zzn(zzfuVar.zzz(zzg - 16)));
        }
        zzfk.zzf("MetadataUtil", "Failed to parse text attribute: ".concat(zzajo.zzf(i9)));
        return null;
    }
}
