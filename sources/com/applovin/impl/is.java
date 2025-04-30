package com.applovin.impl;

import com.applovin.impl.ab;
import com.applovin.impl.hf;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
abstract class is {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f8347a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f8348c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static hf a(String str) {
        try {
            return b(str);
        } catch (ah | NumberFormatException | XmlPullParserException unused) {
            kc.d("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static hf b(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (hs.c(newPullParser, "x:xmpmeta")) {
            ab h6 = ab.h();
            long j7 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            do {
                newPullParser.next();
                if (hs.c(newPullParser, "rdf:Description")) {
                    if (!b(newPullParser)) {
                        return null;
                    }
                    j7 = c(newPullParser);
                    h6 = a(newPullParser);
                } else if (hs.c(newPullParser, "Container:Directory")) {
                    h6 = a(newPullParser, "Container", "Item");
                } else if (hs.c(newPullParser, "GContainer:Directory")) {
                    h6 = a(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!hs.b(newPullParser, "x:xmpmeta"));
            if (h6.isEmpty()) {
                return null;
            }
            return new hf(j7, h6);
        }
        throw ah.a("Couldn't find xmp metadata", null);
    }

    private static long c(XmlPullParser xmlPullParser) {
        for (String str : b) {
            String a6 = hs.a(xmlPullParser, str);
            if (a6 != null) {
                long parseLong = Long.parseLong(a6);
                if (parseLong == -1) {
                    return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                }
                return parseLong;
            }
        }
        return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    private static ab a(XmlPullParser xmlPullParser) {
        for (String str : f8348c) {
            String a6 = hs.a(xmlPullParser, str);
            if (a6 != null) {
                return ab.a(new hf.a("image/jpeg", "Primary", 0L, 0L), new hf.a(MimeTypes.VIDEO_MP4, "MotionPhoto", Long.parseLong(a6), 0L));
            }
        }
        return ab.h();
    }

    private static ab a(XmlPullParser xmlPullParser, String str, String str2) {
        ab.a f9 = ab.f();
        String j7 = com.mbridge.msdk.foundation.entity.o.j(str, ":Item");
        String j9 = com.mbridge.msdk.foundation.entity.o.j(str, ":Directory");
        do {
            xmlPullParser.next();
            if (hs.c(xmlPullParser, j7)) {
                String j10 = com.mbridge.msdk.foundation.entity.o.j(str2, ":Mime");
                String j11 = com.mbridge.msdk.foundation.entity.o.j(str2, ":Semantic");
                String j12 = com.mbridge.msdk.foundation.entity.o.j(str2, ":Length");
                String j13 = com.mbridge.msdk.foundation.entity.o.j(str2, ":Padding");
                String a6 = hs.a(xmlPullParser, j10);
                String a9 = hs.a(xmlPullParser, j11);
                String a10 = hs.a(xmlPullParser, j12);
                String a11 = hs.a(xmlPullParser, j13);
                if (a6 != null && a9 != null) {
                    f9.b(new hf.a(a6, a9, a10 != null ? Long.parseLong(a10) : 0L, a11 != null ? Long.parseLong(a11) : 0L));
                } else {
                    return ab.h();
                }
            }
        } while (!hs.b(xmlPullParser, j9));
        return f9.a();
    }

    private static boolean b(XmlPullParser xmlPullParser) {
        for (String str : f8347a) {
            String a6 = hs.a(xmlPullParser, str);
            if (a6 != null) {
                return Integer.parseInt(a6) == 1;
            }
        }
        return false;
    }
}
