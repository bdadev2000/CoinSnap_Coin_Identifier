package com.applovin.impl;

import com.applovin.impl.ab;
import com.applovin.impl.hf;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
abstract class is {
    private static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f5380b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f5381c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

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
            ab h10 = ab.h();
            long j3 = C.TIME_UNSET;
            do {
                newPullParser.next();
                if (hs.c(newPullParser, "rdf:Description")) {
                    if (!b(newPullParser)) {
                        return null;
                    }
                    j3 = c(newPullParser);
                    h10 = a(newPullParser);
                } else if (hs.c(newPullParser, "Container:Directory")) {
                    h10 = a(newPullParser, "Container", "Item");
                } else if (hs.c(newPullParser, "GContainer:Directory")) {
                    h10 = a(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!hs.b(newPullParser, "x:xmpmeta"));
            if (h10.isEmpty()) {
                return null;
            }
            return new hf(j3, h10);
        }
        throw ah.a("Couldn't find xmp metadata", null);
    }

    private static long c(XmlPullParser xmlPullParser) {
        for (String str : f5380b) {
            String a10 = hs.a(xmlPullParser, str);
            if (a10 != null) {
                long parseLong = Long.parseLong(a10);
                if (parseLong == -1) {
                    return C.TIME_UNSET;
                }
                return parseLong;
            }
        }
        return C.TIME_UNSET;
    }

    private static ab a(XmlPullParser xmlPullParser) {
        for (String str : f5381c) {
            String a10 = hs.a(xmlPullParser, str);
            if (a10 != null) {
                return ab.a(new hf.a("image/jpeg", "Primary", 0L, 0L), new hf.a(MimeTypes.VIDEO_MP4, "MotionPhoto", Long.parseLong(a10), 0L));
            }
        }
        return ab.h();
    }

    private static ab a(XmlPullParser xmlPullParser, String str, String str2) {
        ab.a f10 = ab.f();
        String k10 = eb.j.k(str, ":Item");
        String k11 = eb.j.k(str, ":Directory");
        do {
            xmlPullParser.next();
            if (hs.c(xmlPullParser, k10)) {
                String k12 = eb.j.k(str2, ":Mime");
                String k13 = eb.j.k(str2, ":Semantic");
                String k14 = eb.j.k(str2, ":Length");
                String k15 = eb.j.k(str2, ":Padding");
                String a10 = hs.a(xmlPullParser, k12);
                String a11 = hs.a(xmlPullParser, k13);
                String a12 = hs.a(xmlPullParser, k14);
                String a13 = hs.a(xmlPullParser, k15);
                if (a10 != null && a11 != null) {
                    f10.b(new hf.a(a10, a11, a12 != null ? Long.parseLong(a12) : 0L, a13 != null ? Long.parseLong(a13) : 0L));
                } else {
                    return ab.h();
                }
            }
        } while (!hs.b(xmlPullParser, k11));
        return f10.a();
    }

    private static boolean b(XmlPullParser xmlPullParser) {
        for (String str : a) {
            String a10 = hs.a(xmlPullParser, str);
            if (a10 != null) {
                return Integer.parseInt(a10) == 1;
            }
        }
        return false;
    }
}
