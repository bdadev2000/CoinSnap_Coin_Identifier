package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ApicFrame;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.CommentFrame;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Frame;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.InternalFrame;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.TextInformationFrame;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import eb.j;

/* loaded from: classes4.dex */
final class MetadataUtil {
    private static final String LANGUAGE_UNDEFINED = "und";
    private static final String TAG = "MetadataUtil";
    private static final int SHORT_TYPE_NAME_1 = Util.getIntegerCodeForString("nam");
    private static final int SHORT_TYPE_NAME_2 = Util.getIntegerCodeForString("trk");
    private static final int SHORT_TYPE_COMMENT = Util.getIntegerCodeForString("cmt");
    private static final int SHORT_TYPE_YEAR = Util.getIntegerCodeForString("day");
    private static final int SHORT_TYPE_ARTIST = Util.getIntegerCodeForString("ART");
    private static final int SHORT_TYPE_ENCODER = Util.getIntegerCodeForString("too");
    private static final int SHORT_TYPE_ALBUM = Util.getIntegerCodeForString("alb");
    private static final int SHORT_TYPE_COMPOSER_1 = Util.getIntegerCodeForString("com");
    private static final int SHORT_TYPE_COMPOSER_2 = Util.getIntegerCodeForString("wrt");
    private static final int SHORT_TYPE_LYRICS = Util.getIntegerCodeForString("lyr");
    private static final int SHORT_TYPE_GENRE = Util.getIntegerCodeForString("gen");
    private static final int TYPE_COVER_ART = Util.getIntegerCodeForString("covr");
    private static final int TYPE_GENRE = Util.getIntegerCodeForString("gnre");
    private static final int TYPE_GROUPING = Util.getIntegerCodeForString("grp");
    private static final int TYPE_DISK_NUMBER = Util.getIntegerCodeForString("disk");
    private static final int TYPE_TRACK_NUMBER = Util.getIntegerCodeForString("trkn");
    private static final int TYPE_TEMPO = Util.getIntegerCodeForString("tmpo");
    private static final int TYPE_COMPILATION = Util.getIntegerCodeForString("cpil");
    private static final int TYPE_ALBUM_ARTIST = Util.getIntegerCodeForString("aART");
    private static final int TYPE_SORT_TRACK_NAME = Util.getIntegerCodeForString("sonm");
    private static final int TYPE_SORT_ALBUM = Util.getIntegerCodeForString("soal");
    private static final int TYPE_SORT_ARTIST = Util.getIntegerCodeForString("soar");
    private static final int TYPE_SORT_ALBUM_ARTIST = Util.getIntegerCodeForString("soaa");
    private static final int TYPE_SORT_COMPOSER = Util.getIntegerCodeForString("soco");
    private static final int TYPE_RATING = Util.getIntegerCodeForString("rtng");
    private static final int TYPE_GAPLESS_ALBUM = Util.getIntegerCodeForString("pgap");
    private static final int TYPE_TV_SORT_SHOW = Util.getIntegerCodeForString("sosn");
    private static final int TYPE_TV_SHOW = Util.getIntegerCodeForString("tvsh");
    private static final int TYPE_INTERNAL = Util.getIntegerCodeForString(InternalFrame.ID);
    private static final String[] STANDARD_GENRES = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    private MetadataUtil() {
    }

    private static CommentFrame parseCommentAttribute(int i10, ParsableByteArray parsableByteArray) {
        int readInt = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == Atom.TYPE_data) {
            parsableByteArray.skipBytes(8);
            String readNullTerminatedString = parsableByteArray.readNullTerminatedString(readInt - 16);
            return new CommentFrame("und", readNullTerminatedString, readNullTerminatedString);
        }
        Log.w(TAG, "Failed to parse comment attribute: " + Atom.getAtomTypeString(i10));
        return null;
    }

    private static ApicFrame parseCoverArt(ParsableByteArray parsableByteArray) {
        String str;
        int readInt = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == Atom.TYPE_data) {
            int parseFullAtomFlags = Atom.parseFullAtomFlags(parsableByteArray.readInt());
            if (parseFullAtomFlags == 13) {
                str = "image/jpeg";
            } else if (parseFullAtomFlags == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                j.v("Unrecognized cover art flags: ", parseFullAtomFlags, TAG);
                return null;
            }
            parsableByteArray.skipBytes(4);
            int i10 = readInt - 16;
            byte[] bArr = new byte[i10];
            parsableByteArray.readBytes(bArr, 0, i10);
            return new ApicFrame(str, null, 3, bArr);
        }
        Log.w(TAG, "Failed to parse cover art attribute");
        return null;
    }

    public static Metadata.Entry parseIlstElement(ParsableByteArray parsableByteArray) {
        int readInt = parsableByteArray.readInt() + parsableByteArray.getPosition();
        int readInt2 = parsableByteArray.readInt();
        int i10 = (readInt2 >> 24) & 255;
        try {
            if (i10 != 169 && i10 != 65533) {
                if (readInt2 == TYPE_GENRE) {
                    return parseStandardGenreAttribute(parsableByteArray);
                }
                if (readInt2 == TYPE_DISK_NUMBER) {
                    return parseIndexAndCountAttribute(readInt2, "TPOS", parsableByteArray);
                }
                if (readInt2 == TYPE_TRACK_NUMBER) {
                    return parseIndexAndCountAttribute(readInt2, "TRCK", parsableByteArray);
                }
                if (readInt2 == TYPE_TEMPO) {
                    return parseUint8Attribute(readInt2, "TBPM", parsableByteArray, true, false);
                }
                if (readInt2 == TYPE_COMPILATION) {
                    return parseUint8Attribute(readInt2, "TCMP", parsableByteArray, true, true);
                }
                if (readInt2 == TYPE_COVER_ART) {
                    return parseCoverArt(parsableByteArray);
                }
                if (readInt2 == TYPE_ALBUM_ARTIST) {
                    return parseTextAttribute(readInt2, "TPE2", parsableByteArray);
                }
                if (readInt2 == TYPE_SORT_TRACK_NAME) {
                    return parseTextAttribute(readInt2, "TSOT", parsableByteArray);
                }
                if (readInt2 == TYPE_SORT_ALBUM) {
                    return parseTextAttribute(readInt2, "TSO2", parsableByteArray);
                }
                if (readInt2 == TYPE_SORT_ARTIST) {
                    return parseTextAttribute(readInt2, "TSOA", parsableByteArray);
                }
                if (readInt2 == TYPE_SORT_ALBUM_ARTIST) {
                    return parseTextAttribute(readInt2, "TSOP", parsableByteArray);
                }
                if (readInt2 == TYPE_SORT_COMPOSER) {
                    return parseTextAttribute(readInt2, "TSOC", parsableByteArray);
                }
                if (readInt2 == TYPE_RATING) {
                    return parseUint8Attribute(readInt2, "ITUNESADVISORY", parsableByteArray, false, false);
                }
                if (readInt2 == TYPE_GAPLESS_ALBUM) {
                    return parseUint8Attribute(readInt2, "ITUNESGAPLESS", parsableByteArray, false, true);
                }
                if (readInt2 == TYPE_TV_SORT_SHOW) {
                    return parseTextAttribute(readInt2, "TVSHOWSORT", parsableByteArray);
                }
                if (readInt2 == TYPE_TV_SHOW) {
                    return parseTextAttribute(readInt2, "TVSHOW", parsableByteArray);
                }
                if (readInt2 == TYPE_INTERNAL) {
                    return parseInternalAttribute(parsableByteArray, readInt);
                }
            } else {
                int i11 = 16777215 & readInt2;
                if (i11 == SHORT_TYPE_COMMENT) {
                    return parseCommentAttribute(readInt2, parsableByteArray);
                }
                if (i11 != SHORT_TYPE_NAME_1 && i11 != SHORT_TYPE_NAME_2) {
                    if (i11 != SHORT_TYPE_COMPOSER_1 && i11 != SHORT_TYPE_COMPOSER_2) {
                        if (i11 == SHORT_TYPE_YEAR) {
                            return parseTextAttribute(readInt2, "TDRC", parsableByteArray);
                        }
                        if (i11 == SHORT_TYPE_ARTIST) {
                            return parseTextAttribute(readInt2, "TPE1", parsableByteArray);
                        }
                        if (i11 == SHORT_TYPE_ENCODER) {
                            return parseTextAttribute(readInt2, "TSSE", parsableByteArray);
                        }
                        if (i11 == SHORT_TYPE_ALBUM) {
                            return parseTextAttribute(readInt2, "TALB", parsableByteArray);
                        }
                        if (i11 == SHORT_TYPE_LYRICS) {
                            return parseTextAttribute(readInt2, "USLT", parsableByteArray);
                        }
                        if (i11 == SHORT_TYPE_GENRE) {
                            return parseTextAttribute(readInt2, "TCON", parsableByteArray);
                        }
                        if (i11 == TYPE_GROUPING) {
                            return parseTextAttribute(readInt2, "TIT1", parsableByteArray);
                        }
                    }
                    return parseTextAttribute(readInt2, "TCOM", parsableByteArray);
                }
                return parseTextAttribute(readInt2, "TIT2", parsableByteArray);
            }
            Log.d(TAG, "Skipped unknown metadata entry: " + Atom.getAtomTypeString(readInt2));
            parsableByteArray.setPosition(readInt);
            return null;
        } finally {
            parsableByteArray.setPosition(readInt);
        }
    }

    private static TextInformationFrame parseIndexAndCountAttribute(int i10, String str, ParsableByteArray parsableByteArray) {
        int readInt = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == Atom.TYPE_data && readInt >= 22) {
            parsableByteArray.skipBytes(10);
            int readUnsignedShort = parsableByteArray.readUnsignedShort();
            if (readUnsignedShort > 0) {
                String i11 = j.i("", readUnsignedShort);
                int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
                if (readUnsignedShort2 > 0) {
                    i11 = i11 + "/" + readUnsignedShort2;
                }
                return new TextInformationFrame(str, null, i11);
            }
        }
        Log.w(TAG, "Failed to parse index/count attribute: " + Atom.getAtomTypeString(i10));
        return null;
    }

    private static Id3Frame parseInternalAttribute(ParsableByteArray parsableByteArray, int i10) {
        String str = null;
        String str2 = null;
        int i11 = -1;
        int i12 = -1;
        while (parsableByteArray.getPosition() < i10) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            if (readInt2 == Atom.TYPE_mean) {
                str = parsableByteArray.readNullTerminatedString(readInt - 12);
            } else if (readInt2 == Atom.TYPE_name) {
                str2 = parsableByteArray.readNullTerminatedString(readInt - 12);
            } else {
                if (readInt2 == Atom.TYPE_data) {
                    i11 = position;
                    i12 = readInt;
                }
                parsableByteArray.skipBytes(readInt - 12);
            }
        }
        if (str == null || str2 == null || i11 == -1) {
            return null;
        }
        parsableByteArray.setPosition(i11);
        parsableByteArray.skipBytes(16);
        return new InternalFrame(str, str2, parsableByteArray.readNullTerminatedString(i12 - 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.TextInformationFrame parseStandardGenreAttribute(com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray r3) {
        /*
            int r3 = parseUint8AttributeValue(r3)
            r0 = 0
            if (r3 <= 0) goto L11
            java.lang.String[] r1 = com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.MetadataUtil.STANDARD_GENRES
            int r2 = r1.length
            if (r3 > r2) goto L11
            int r3 = r3 + (-1)
            r3 = r1[r3]
            goto L12
        L11:
            r3 = r0
        L12:
            if (r3 == 0) goto L1c
            com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.TextInformationFrame r1 = new com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.TextInformationFrame
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L1c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            android.util.Log.w(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.MetadataUtil.parseStandardGenreAttribute(com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray):com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.TextInformationFrame");
    }

    private static TextInformationFrame parseTextAttribute(int i10, String str, ParsableByteArray parsableByteArray) {
        int readInt = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == Atom.TYPE_data) {
            parsableByteArray.skipBytes(8);
            return new TextInformationFrame(str, null, parsableByteArray.readNullTerminatedString(readInt - 16));
        }
        Log.w(TAG, "Failed to parse text attribute: " + Atom.getAtomTypeString(i10));
        return null;
    }

    private static Id3Frame parseUint8Attribute(int i10, String str, ParsableByteArray parsableByteArray, boolean z10, boolean z11) {
        int parseUint8AttributeValue = parseUint8AttributeValue(parsableByteArray);
        if (z11) {
            parseUint8AttributeValue = Math.min(1, parseUint8AttributeValue);
        }
        if (parseUint8AttributeValue >= 0) {
            if (z10) {
                return new TextInformationFrame(str, null, Integer.toString(parseUint8AttributeValue));
            }
            return new CommentFrame("und", str, Integer.toString(parseUint8AttributeValue));
        }
        Log.w(TAG, "Failed to parse uint8 attribute: " + Atom.getAtomTypeString(i10));
        return null;
    }

    private static int parseUint8AttributeValue(ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() == Atom.TYPE_data) {
            parsableByteArray.skipBytes(8);
            return parsableByteArray.readUnsignedByte();
        }
        Log.w(TAG, "Failed to parse uint8 attribute value");
        return -1;
    }
}
