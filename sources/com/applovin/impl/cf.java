package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.we;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class cf {

    /* renamed from: a, reason: collision with root package name */
    static final String[] f7085a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    private static s3 a(int i9, yg ygVar) {
        int j7 = ygVar.j();
        if (ygVar.j() == 1684108385) {
            ygVar.g(8);
            String b = ygVar.b(j7 - 16);
            return new s3(com.mbridge.msdk.playercommon.exoplayer2.C.LANGUAGE_UNDETERMINED, b, b);
        }
        kc.d("MetadataUtil", "Failed to parse comment attribute: " + AbstractC0708i1.a(i9));
        return null;
    }

    public static we.b b(yg ygVar) {
        int j7 = ygVar.j() + ygVar.d();
        int j9 = ygVar.j();
        int i9 = (j9 >> 24) & 255;
        try {
            if (i9 == 169 || i9 == 253) {
                int i10 = 16777215 & j9;
                if (i10 == 6516084) {
                    return a(j9, ygVar);
                }
                if (i10 == 7233901 || i10 == 7631467) {
                    return b(j9, "TIT2", ygVar);
                }
                if (i10 == 6516589 || i10 == 7828084) {
                    return b(j9, "TCOM", ygVar);
                }
                if (i10 == 6578553) {
                    return b(j9, "TDRC", ygVar);
                }
                if (i10 == 4280916) {
                    return b(j9, "TPE1", ygVar);
                }
                if (i10 == 7630703) {
                    return b(j9, "TSSE", ygVar);
                }
                if (i10 == 6384738) {
                    return b(j9, "TALB", ygVar);
                }
                if (i10 == 7108978) {
                    return b(j9, "USLT", ygVar);
                }
                if (i10 == 6776174) {
                    return b(j9, "TCON", ygVar);
                }
                if (i10 == 6779504) {
                    return b(j9, "TIT1", ygVar);
                }
            } else {
                if (j9 == 1735291493) {
                    return c(ygVar);
                }
                if (j9 == 1684632427) {
                    return a(j9, "TPOS", ygVar);
                }
                if (j9 == 1953655662) {
                    return a(j9, "TRCK", ygVar);
                }
                if (j9 == 1953329263) {
                    return a(j9, "TBPM", ygVar, true, false);
                }
                if (j9 == 1668311404) {
                    return a(j9, "TCMP", ygVar, true, true);
                }
                if (j9 == 1668249202) {
                    return a(ygVar);
                }
                if (j9 == 1631670868) {
                    return b(j9, "TPE2", ygVar);
                }
                if (j9 == 1936682605) {
                    return b(j9, "TSOT", ygVar);
                }
                if (j9 == 1936679276) {
                    return b(j9, "TSO2", ygVar);
                }
                if (j9 == 1936679282) {
                    return b(j9, "TSOA", ygVar);
                }
                if (j9 == 1936679265) {
                    return b(j9, "TSOP", ygVar);
                }
                if (j9 == 1936679791) {
                    return b(j9, "TSOC", ygVar);
                }
                if (j9 == 1920233063) {
                    return a(j9, "ITUNESADVISORY", ygVar, false, false);
                }
                if (j9 == 1885823344) {
                    return a(j9, "ITUNESGAPLESS", ygVar, false, true);
                }
                if (j9 == 1936683886) {
                    return b(j9, "TVSHOWSORT", ygVar);
                }
                if (j9 == 1953919848) {
                    return b(j9, "TVSHOW", ygVar);
                }
                if (j9 == 757935405) {
                    return a(ygVar, j7);
                }
            }
            kc.a("MetadataUtil", "Skipped unknown metadata entry: " + AbstractC0708i1.a(j9));
            ygVar.f(j7);
            return null;
        } finally {
            ygVar.f(j7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.applovin.impl.ao c(com.applovin.impl.yg r3) {
        /*
            int r3 = d(r3)
            r0 = 0
            if (r3 <= 0) goto L11
            java.lang.String[] r1 = com.applovin.impl.cf.f7085a
            int r2 = r1.length
            if (r3 > r2) goto L11
            int r3 = r3 + (-1)
            r3 = r1[r3]
            goto L12
        L11:
            r3 = r0
        L12:
            if (r3 == 0) goto L1c
            com.applovin.impl.ao r1 = new com.applovin.impl.ao
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L1c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            com.applovin.impl.kc.d(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.cf.c(com.applovin.impl.yg):com.applovin.impl.ao");
    }

    private static int d(yg ygVar) {
        ygVar.g(4);
        if (ygVar.j() == 1684108385) {
            ygVar.g(8);
            return ygVar.w();
        }
        kc.d("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static C0762u0 a(yg ygVar) {
        String str;
        int j7 = ygVar.j();
        if (ygVar.j() == 1684108385) {
            int b = AbstractC0708i1.b(ygVar.j());
            if (b == 13) {
                str = "image/jpeg";
            } else {
                str = b == 14 ? "image/png" : null;
            }
            if (str == null) {
                L.p(b, "Unrecognized cover art flags: ", "MetadataUtil");
                return null;
            }
            ygVar.g(4);
            int i9 = j7 - 16;
            byte[] bArr = new byte[i9];
            ygVar.a(bArr, 0, i9);
            return new C0762u0(str, null, 3, bArr);
        }
        kc.d("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    private static ao a(int i9, String str, yg ygVar) {
        int j7 = ygVar.j();
        if (ygVar.j() == 1684108385 && j7 >= 22) {
            ygVar.g(10);
            int C8 = ygVar.C();
            if (C8 > 0) {
                String h6 = com.mbridge.msdk.foundation.entity.o.h(C8, "");
                int C9 = ygVar.C();
                if (C9 > 0) {
                    h6 = h6 + "/" + C9;
                }
                return new ao(str, null, h6);
            }
        }
        kc.d("MetadataUtil", "Failed to parse index/count attribute: " + AbstractC0708i1.a(i9));
        return null;
    }

    private static ua a(yg ygVar, int i9) {
        String str = null;
        String str2 = null;
        int i10 = -1;
        int i11 = -1;
        while (ygVar.d() < i9) {
            int d2 = ygVar.d();
            int j7 = ygVar.j();
            int j9 = ygVar.j();
            ygVar.g(4);
            if (j9 == 1835360622) {
                str = ygVar.b(j7 - 12);
            } else if (j9 == 1851878757) {
                str2 = ygVar.b(j7 - 12);
            } else {
                if (j9 == 1684108385) {
                    i10 = d2;
                    i11 = j7;
                }
                ygVar.g(j7 - 12);
            }
        }
        if (str == null || str2 == null || i10 == -1) {
            return null;
        }
        ygVar.f(i10);
        ygVar.g(16);
        return new nb(str, str2, ygVar.b(i11 - 16));
    }

    public static ad a(yg ygVar, int i9, String str) {
        while (true) {
            int d2 = ygVar.d();
            if (d2 >= i9) {
                return null;
            }
            int j7 = ygVar.j();
            if (ygVar.j() == 1684108385) {
                int j9 = ygVar.j();
                int j10 = ygVar.j();
                int i10 = j7 - 16;
                byte[] bArr = new byte[i10];
                ygVar.a(bArr, 0, i10);
                return new ad(str, bArr, j10, j9);
            }
            ygVar.f(d2 + j7);
        }
    }

    private static ua a(int i9, String str, yg ygVar, boolean z8, boolean z9) {
        int d2 = d(ygVar);
        if (z9) {
            d2 = Math.min(1, d2);
        }
        if (d2 >= 0) {
            if (z8) {
                return new ao(str, null, Integer.toString(d2));
            }
            return new s3(com.mbridge.msdk.playercommon.exoplayer2.C.LANGUAGE_UNDETERMINED, str, Integer.toString(d2));
        }
        kc.d("MetadataUtil", "Failed to parse uint8 attribute: " + AbstractC0708i1.a(i9));
        return null;
    }

    private static ao b(int i9, String str, yg ygVar) {
        int j7 = ygVar.j();
        if (ygVar.j() == 1684108385) {
            ygVar.g(8);
            return new ao(str, null, ygVar.b(j7 - 16));
        }
        kc.d("MetadataUtil", "Failed to parse text attribute: " + AbstractC0708i1.a(i9));
        return null;
    }

    public static void a(int i9, x9 x9Var, d9.b bVar) {
        if (i9 == 1 && x9Var.a()) {
            bVar.e(x9Var.f12162a).f(x9Var.b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        if (r6 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(int r5, com.applovin.impl.we r6, com.applovin.impl.we r7, com.applovin.impl.d9.b r8, com.applovin.impl.we... r9) {
        /*
            com.applovin.impl.we r0 = new com.applovin.impl.we
            r1 = 0
            com.applovin.impl.we$b[] r2 = new com.applovin.impl.we.b[r1]
            r0.<init>(r2)
            r2 = 1
            if (r5 != r2) goto Le
            if (r6 == 0) goto L3b
            goto L3c
        Le:
            r6 = 2
            if (r5 != r6) goto L3b
            if (r7 == 0) goto L3b
            r5 = r1
        L14:
            int r6 = r7.c()
            if (r5 >= r6) goto L3b
            com.applovin.impl.we$b r6 = r7.a(r5)
            boolean r3 = r6 instanceof com.applovin.impl.ad
            if (r3 == 0) goto L39
            com.applovin.impl.ad r6 = (com.applovin.impl.ad) r6
            java.lang.String r3 = r6.f6619a
            java.lang.String r4 = "com.android.capture.fps"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L39
            com.applovin.impl.we r5 = new com.applovin.impl.we
            com.applovin.impl.we$b[] r7 = new com.applovin.impl.we.b[r2]
            r7[r1] = r6
            r5.<init>(r7)
            r6 = r5
            goto L3c
        L39:
            int r5 = r5 + r2
            goto L14
        L3b:
            r6 = r0
        L3c:
            int r5 = r9.length
        L3d:
            if (r1 >= r5) goto L47
            r7 = r9[r1]
            com.applovin.impl.we r6 = r6.a(r7)
            int r1 = r1 + r2
            goto L3d
        L47:
            int r5 = r6.c()
            if (r5 <= 0) goto L50
            r8.a(r6)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.cf.a(int, com.applovin.impl.we, com.applovin.impl.we, com.applovin.impl.d9$b, com.applovin.impl.we[]):void");
    }
}
