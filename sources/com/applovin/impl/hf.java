package com.applovin.impl;

import com.applovin.impl.bf;
import com.applovin.impl.f9;
import com.cooldev.gba.emulator.gameboy.constants.MyKeys;
import com.google.common.net.HttpHeaders;
import com.google.firebase.sessions.settings.RemoteSettings;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class hf {

    /* renamed from: a, reason: collision with root package name */
    static final String[] f24310a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", MyKeys.GAME, "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    private static u3 a(int i2, bh bhVar) {
        int j2 = bhVar.j();
        if (bhVar.j() == 1684108385) {
            bhVar.g(8);
            String b2 = bhVar.b(j2 - 16);
            return new u3("und", b2, b2);
        }
        pc.d("MetadataUtil", "Failed to parse comment attribute: " + j1.a(i2));
        return null;
    }

    public static bf.b b(bh bhVar) {
        int j2 = bhVar.j() + bhVar.d();
        int j3 = bhVar.j();
        int i2 = (j3 >> 24) & 255;
        try {
            if (i2 == 169 || i2 == 253) {
                int i3 = 16777215 & j3;
                if (i3 == 6516084) {
                    return a(j3, bhVar);
                }
                if (i3 == 7233901 || i3 == 7631467) {
                    return b(j3, "TIT2", bhVar);
                }
                if (i3 == 6516589 || i3 == 7828084) {
                    return b(j3, "TCOM", bhVar);
                }
                if (i3 == 6578553) {
                    return b(j3, "TDRC", bhVar);
                }
                if (i3 == 4280916) {
                    return b(j3, "TPE1", bhVar);
                }
                if (i3 == 7630703) {
                    return b(j3, "TSSE", bhVar);
                }
                if (i3 == 6384738) {
                    return b(j3, "TALB", bhVar);
                }
                if (i3 == 7108978) {
                    return b(j3, "USLT", bhVar);
                }
                if (i3 == 6776174) {
                    return b(j3, "TCON", bhVar);
                }
                if (i3 == 6779504) {
                    return b(j3, "TIT1", bhVar);
                }
            } else {
                if (j3 == 1735291493) {
                    return c(bhVar);
                }
                if (j3 == 1684632427) {
                    return a(j3, "TPOS", bhVar);
                }
                if (j3 == 1953655662) {
                    return a(j3, "TRCK", bhVar);
                }
                if (j3 == 1953329263) {
                    return a(j3, "TBPM", bhVar, true, false);
                }
                if (j3 == 1668311404) {
                    return a(j3, "TCMP", bhVar, true, true);
                }
                if (j3 == 1668249202) {
                    return a(bhVar);
                }
                if (j3 == 1631670868) {
                    return b(j3, "TPE2", bhVar);
                }
                if (j3 == 1936682605) {
                    return b(j3, "TSOT", bhVar);
                }
                if (j3 == 1936679276) {
                    return b(j3, "TSO2", bhVar);
                }
                if (j3 == 1936679282) {
                    return b(j3, "TSOA", bhVar);
                }
                if (j3 == 1936679265) {
                    return b(j3, "TSOP", bhVar);
                }
                if (j3 == 1936679791) {
                    return b(j3, "TSOC", bhVar);
                }
                if (j3 == 1920233063) {
                    return a(j3, "ITUNESADVISORY", bhVar, false, false);
                }
                if (j3 == 1885823344) {
                    return a(j3, "ITUNESGAPLESS", bhVar, false, true);
                }
                if (j3 == 1936683886) {
                    return b(j3, "TVSHOWSORT", bhVar);
                }
                if (j3 == 1953919848) {
                    return b(j3, "TVSHOW", bhVar);
                }
                if (j3 == 757935405) {
                    return a(bhVar, j2);
                }
            }
            pc.a("MetadataUtil", "Skipped unknown metadata entry: " + j1.a(j3));
            bhVar.f(j2);
            return null;
        } finally {
            bhVar.f(j2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.applovin.impl.zn c(com.applovin.impl.bh r3) {
        /*
            int r3 = d(r3)
            r0 = 0
            if (r3 <= 0) goto L11
            java.lang.String[] r1 = com.applovin.impl.hf.f24310a
            int r2 = r1.length
            if (r3 > r2) goto L11
            int r3 = r3 + (-1)
            r3 = r1[r3]
            goto L12
        L11:
            r3 = r0
        L12:
            if (r3 == 0) goto L1c
            com.applovin.impl.zn r1 = new com.applovin.impl.zn
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L1c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            com.applovin.impl.pc.d(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.hf.c(com.applovin.impl.bh):com.applovin.impl.zn");
    }

    private static int d(bh bhVar) {
        bhVar.g(4);
        if (bhVar.j() == 1684108385) {
            bhVar.g(8);
            return bhVar.w();
        }
        pc.d("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static v0 a(bh bhVar) {
        int j2 = bhVar.j();
        if (bhVar.j() == 1684108385) {
            int b2 = j1.b(bhVar.j());
            String str = b2 == 13 ? "image/jpeg" : b2 == 14 ? "image/png" : null;
            if (str == null) {
                com.applovin.impl.adview.t.u("Unrecognized cover art flags: ", b2, "MetadataUtil");
                return null;
            }
            bhVar.g(4);
            int i2 = j2 - 16;
            byte[] bArr = new byte[i2];
            bhVar.a(bArr, 0, i2);
            return new v0(str, null, 3, bArr);
        }
        pc.d("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    private static zn a(int i2, String str, bh bhVar) {
        int j2 = bhVar.j();
        if (bhVar.j() == 1684108385 && j2 >= 22) {
            bhVar.g(10);
            int C = bhVar.C();
            if (C > 0) {
                String i3 = android.support.v4.media.d.i("", C);
                int C2 = bhVar.C();
                if (C2 > 0) {
                    i3 = i3 + RemoteSettings.FORWARD_SLASH_STRING + C2;
                }
                return new zn(str, null, i3);
            }
        }
        pc.d("MetadataUtil", "Failed to parse index/count attribute: " + j1.a(i2));
        return null;
    }

    private static ya a(bh bhVar, int i2) {
        String str = null;
        String str2 = null;
        int i3 = -1;
        int i4 = -1;
        while (bhVar.d() < i2) {
            int d = bhVar.d();
            int j2 = bhVar.j();
            int j3 = bhVar.j();
            bhVar.g(4);
            if (j3 == 1835360622) {
                str = bhVar.b(j2 - 12);
            } else if (j3 == 1851878757) {
                str2 = bhVar.b(j2 - 12);
            } else {
                if (j3 == 1684108385) {
                    i3 = d;
                    i4 = j2;
                }
                bhVar.g(j2 - 12);
            }
        }
        if (str == null || str2 == null || i3 == -1) {
            return null;
        }
        bhVar.f(i3);
        bhVar.g(16);
        return new sb(str, str2, bhVar.b(i4 - 16));
    }

    public static fd a(bh bhVar, int i2, String str) {
        while (true) {
            int d = bhVar.d();
            if (d >= i2) {
                return null;
            }
            int j2 = bhVar.j();
            if (bhVar.j() == 1684108385) {
                int j3 = bhVar.j();
                int j4 = bhVar.j();
                int i3 = j2 - 16;
                byte[] bArr = new byte[i3];
                bhVar.a(bArr, 0, i3);
                return new fd(str, bArr, j4, j3);
            }
            bhVar.f(d + j2);
        }
    }

    private static ya a(int i2, String str, bh bhVar, boolean z2, boolean z3) {
        int d = d(bhVar);
        if (z3) {
            d = Math.min(1, d);
        }
        if (d >= 0) {
            if (z2) {
                return new zn(str, null, Integer.toString(d));
            }
            return new u3("und", str, Integer.toString(d));
        }
        pc.d("MetadataUtil", "Failed to parse uint8 attribute: " + j1.a(i2));
        return null;
    }

    public static void a(int i2, z9 z9Var, f9.b bVar) {
        if (i2 == 1 && z9Var.a()) {
            bVar.e(z9Var.f28316a).f(z9Var.f28317b);
        }
    }

    private static zn b(int i2, String str, bh bhVar) {
        int j2 = bhVar.j();
        if (bhVar.j() == 1684108385) {
            bhVar.g(8);
            return new zn(str, null, bhVar.b(j2 - 16));
        }
        pc.d("MetadataUtil", "Failed to parse text attribute: " + j1.a(i2));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        if (r6 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(int r5, com.applovin.impl.bf r6, com.applovin.impl.bf r7, com.applovin.impl.f9.b r8, com.applovin.impl.bf... r9) {
        /*
            com.applovin.impl.bf r0 = new com.applovin.impl.bf
            r1 = 0
            com.applovin.impl.bf$b[] r2 = new com.applovin.impl.bf.b[r1]
            r0.<init>(r2)
            r2 = 1
            if (r5 != r2) goto Le
            if (r6 == 0) goto L3c
            goto L3d
        Le:
            r6 = 2
            if (r5 != r6) goto L3c
            if (r7 == 0) goto L3c
            r5 = r1
        L14:
            int r6 = r7.c()
            if (r5 >= r6) goto L3c
            com.applovin.impl.bf$b r6 = r7.a(r5)
            boolean r3 = r6 instanceof com.applovin.impl.fd
            if (r3 == 0) goto L39
            com.applovin.impl.fd r6 = (com.applovin.impl.fd) r6
            java.lang.String r3 = r6.f23892a
            java.lang.String r4 = "com.android.capture.fps"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L39
            com.applovin.impl.bf r5 = new com.applovin.impl.bf
            com.applovin.impl.bf$b[] r7 = new com.applovin.impl.bf.b[r2]
            r7[r1] = r6
            r5.<init>(r7)
            r6 = r5
            goto L3d
        L39:
            int r5 = r5 + 1
            goto L14
        L3c:
            r6 = r0
        L3d:
            int r5 = r9.length
        L3e:
            if (r1 >= r5) goto L49
            r7 = r9[r1]
            com.applovin.impl.bf r6 = r6.a(r7)
            int r1 = r1 + 1
            goto L3e
        L49:
            int r5 = r6.c()
            if (r5 <= 0) goto L52
            r8.a(r6)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.hf.a(int, com.applovin.impl.bf, com.applovin.impl.bf, com.applovin.impl.f9$b, com.applovin.impl.bf[]):void");
    }
}
