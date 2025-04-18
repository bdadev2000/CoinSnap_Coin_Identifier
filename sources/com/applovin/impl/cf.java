package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.we;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes.dex */
abstract class cf {
    static final String[] a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    private static s3 a(int i10, yg ygVar) {
        int j3 = ygVar.j();
        if (ygVar.j() == 1684108385) {
            ygVar.g(8);
            String b3 = ygVar.b(j3 - 16);
            return new s3(C.LANGUAGE_UNDETERMINED, b3, b3);
        }
        kc.d("MetadataUtil", "Failed to parse comment attribute: " + i1.a(i10));
        return null;
    }

    public static we.b b(yg ygVar) {
        int j3 = ygVar.j() + ygVar.d();
        int j10 = ygVar.j();
        int i10 = (j10 >> 24) & 255;
        try {
            if (i10 == 169 || i10 == 253) {
                int i11 = 16777215 & j10;
                if (i11 == 6516084) {
                    return a(j10, ygVar);
                }
                if (i11 == 7233901 || i11 == 7631467) {
                    return b(j10, "TIT2", ygVar);
                }
                if (i11 == 6516589 || i11 == 7828084) {
                    return b(j10, "TCOM", ygVar);
                }
                if (i11 == 6578553) {
                    return b(j10, "TDRC", ygVar);
                }
                if (i11 == 4280916) {
                    return b(j10, "TPE1", ygVar);
                }
                if (i11 == 7630703) {
                    return b(j10, "TSSE", ygVar);
                }
                if (i11 == 6384738) {
                    return b(j10, "TALB", ygVar);
                }
                if (i11 == 7108978) {
                    return b(j10, "USLT", ygVar);
                }
                if (i11 == 6776174) {
                    return b(j10, "TCON", ygVar);
                }
                if (i11 == 6779504) {
                    return b(j10, "TIT1", ygVar);
                }
            } else {
                if (j10 == 1735291493) {
                    return c(ygVar);
                }
                if (j10 == 1684632427) {
                    return a(j10, "TPOS", ygVar);
                }
                if (j10 == 1953655662) {
                    return a(j10, "TRCK", ygVar);
                }
                if (j10 == 1953329263) {
                    return a(j10, "TBPM", ygVar, true, false);
                }
                if (j10 == 1668311404) {
                    return a(j10, "TCMP", ygVar, true, true);
                }
                if (j10 == 1668249202) {
                    return a(ygVar);
                }
                if (j10 == 1631670868) {
                    return b(j10, "TPE2", ygVar);
                }
                if (j10 == 1936682605) {
                    return b(j10, "TSOT", ygVar);
                }
                if (j10 == 1936679276) {
                    return b(j10, "TSO2", ygVar);
                }
                if (j10 == 1936679282) {
                    return b(j10, "TSOA", ygVar);
                }
                if (j10 == 1936679265) {
                    return b(j10, "TSOP", ygVar);
                }
                if (j10 == 1936679791) {
                    return b(j10, "TSOC", ygVar);
                }
                if (j10 == 1920233063) {
                    return a(j10, "ITUNESADVISORY", ygVar, false, false);
                }
                if (j10 == 1885823344) {
                    return a(j10, "ITUNESGAPLESS", ygVar, false, true);
                }
                if (j10 == 1936683886) {
                    return b(j10, "TVSHOWSORT", ygVar);
                }
                if (j10 == 1953919848) {
                    return b(j10, "TVSHOW", ygVar);
                }
                if (j10 == 757935405) {
                    return a(ygVar, j3);
                }
            }
            kc.a("MetadataUtil", "Skipped unknown metadata entry: " + i1.a(j10));
            ygVar.f(j3);
            return null;
        } finally {
            ygVar.f(j3);
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
            java.lang.String[] r1 = com.applovin.impl.cf.a
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

    private static u0 a(yg ygVar) {
        int j3 = ygVar.j();
        if (ygVar.j() == 1684108385) {
            int b3 = i1.b(ygVar.j());
            String str = b3 == 13 ? "image/jpeg" : b3 == 14 ? "image/png" : null;
            if (str == null) {
                a4.j.u("Unrecognized cover art flags: ", b3, "MetadataUtil");
                return null;
            }
            ygVar.g(4);
            int i10 = j3 - 16;
            byte[] bArr = new byte[i10];
            ygVar.a(bArr, 0, i10);
            return new u0(str, null, 3, bArr);
        }
        kc.d("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    private static ao a(int i10, String str, yg ygVar) {
        int j3 = ygVar.j();
        if (ygVar.j() == 1684108385 && j3 >= 22) {
            ygVar.g(10);
            int C = ygVar.C();
            if (C > 0) {
                String i11 = eb.j.i("", C);
                int C2 = ygVar.C();
                if (C2 > 0) {
                    i11 = i11 + "/" + C2;
                }
                return new ao(str, null, i11);
            }
        }
        kc.d("MetadataUtil", "Failed to parse index/count attribute: " + i1.a(i10));
        return null;
    }

    private static ua a(yg ygVar, int i10) {
        String str = null;
        String str2 = null;
        int i11 = -1;
        int i12 = -1;
        while (ygVar.d() < i10) {
            int d10 = ygVar.d();
            int j3 = ygVar.j();
            int j10 = ygVar.j();
            ygVar.g(4);
            if (j10 == 1835360622) {
                str = ygVar.b(j3 - 12);
            } else if (j10 == 1851878757) {
                str2 = ygVar.b(j3 - 12);
            } else {
                if (j10 == 1684108385) {
                    i11 = d10;
                    i12 = j3;
                }
                ygVar.g(j3 - 12);
            }
        }
        if (str == null || str2 == null || i11 == -1) {
            return null;
        }
        ygVar.f(i11);
        ygVar.g(16);
        return new nb(str, str2, ygVar.b(i12 - 16));
    }

    public static ad a(yg ygVar, int i10, String str) {
        while (true) {
            int d10 = ygVar.d();
            if (d10 >= i10) {
                return null;
            }
            int j3 = ygVar.j();
            if (ygVar.j() == 1684108385) {
                int j10 = ygVar.j();
                int j11 = ygVar.j();
                int i11 = j3 - 16;
                byte[] bArr = new byte[i11];
                ygVar.a(bArr, 0, i11);
                return new ad(str, bArr, j11, j10);
            }
            ygVar.f(d10 + j3);
        }
    }

    private static ua a(int i10, String str, yg ygVar, boolean z10, boolean z11) {
        int d10 = d(ygVar);
        if (z11) {
            d10 = Math.min(1, d10);
        }
        if (d10 >= 0) {
            if (z10) {
                return new ao(str, null, Integer.toString(d10));
            }
            return new s3(C.LANGUAGE_UNDETERMINED, str, Integer.toString(d10));
        }
        kc.d("MetadataUtil", "Failed to parse uint8 attribute: " + i1.a(i10));
        return null;
    }

    public static void a(int i10, x9 x9Var, d9.b bVar) {
        if (i10 == 1 && x9Var.a()) {
            bVar.e(x9Var.a).f(x9Var.f8961b);
        }
    }

    private static ao b(int i10, String str, yg ygVar) {
        int j3 = ygVar.j();
        if (ygVar.j() == 1684108385) {
            ygVar.g(8);
            return new ao(str, null, ygVar.b(j3 - 16));
        }
        kc.d("MetadataUtil", "Failed to parse text attribute: " + i1.a(i10));
        return null;
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
            com.applovin.impl.we$b r6 = r7.a(r5)
            boolean r3 = r6 instanceof com.applovin.impl.ad
            if (r3 == 0) goto L39
            com.applovin.impl.ad r6 = (com.applovin.impl.ad) r6
            java.lang.String r3 = r6.a
            java.lang.String r4 = "com.android.capture.fps"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L39
            com.applovin.impl.we r5 = new com.applovin.impl.we
            com.applovin.impl.we$b[] r7 = new com.applovin.impl.we.b[r2]
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
            com.applovin.impl.we r6 = r6.a(r7)
            int r1 = r1 + 1
            goto L3e
        L49:
            int r5 = r6.c()
            if (r5 <= 0) goto L52
            r8.a(r6)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.cf.a(int, com.applovin.impl.we, com.applovin.impl.we, com.applovin.impl.d9$b, com.applovin.impl.we[]):void");
    }
}
