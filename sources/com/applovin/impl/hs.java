package com.applovin.impl;

import com.applovin.impl.eb;
import com.applovin.impl.mf;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
abstract class hs {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f24358a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f24359b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f24360c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static mf a(String str) {
        try {
            return b(str);
        } catch (dh | NumberFormatException | XmlPullParserException unused) {
            pc.d("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static mf b(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (gs.c(newPullParser, "x:xmpmeta")) {
            eb h2 = eb.h();
            long j2 = -9223372036854775807L;
            do {
                newPullParser.next();
                if (gs.c(newPullParser, "rdf:Description")) {
                    if (!b(newPullParser)) {
                        return null;
                    }
                    j2 = c(newPullParser);
                    h2 = a(newPullParser);
                } else if (gs.c(newPullParser, "Container:Directory")) {
                    h2 = a(newPullParser, "Container", "Item");
                } else if (gs.c(newPullParser, "GContainer:Directory")) {
                    h2 = a(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!gs.b(newPullParser, "x:xmpmeta"));
            if (h2.isEmpty()) {
                return null;
            }
            return new mf(j2, h2);
        }
        throw dh.a("Couldn't find xmp metadata", null);
    }

    private static long c(XmlPullParser xmlPullParser) {
        for (String str : f24359b) {
            String a2 = gs.a(xmlPullParser, str);
            if (a2 != null) {
                long parseLong = Long.parseLong(a2);
                if (parseLong == -1) {
                    return -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    private static eb a(XmlPullParser xmlPullParser) {
        for (String str : f24360c) {
            String a2 = gs.a(xmlPullParser, str);
            if (a2 != null) {
                return eb.a(new mf.a("image/jpeg", "Primary", 0L, 0L), new mf.a("video/mp4", "MotionPhoto", Long.parseLong(a2), 0L));
            }
        }
        return eb.h();
    }

    private static eb a(XmlPullParser xmlPullParser, String str, String str2) {
        eb.a f2 = eb.f();
        String j2 = androidx.compose.foundation.text.input.a.j(str, ":Item");
        String j3 = androidx.compose.foundation.text.input.a.j(str, ":Directory");
        do {
            xmlPullParser.next();
            if (gs.c(xmlPullParser, j2)) {
                String j4 = androidx.compose.foundation.text.input.a.j(str2, ":Mime");
                String j5 = androidx.compose.foundation.text.input.a.j(str2, ":Semantic");
                String j6 = androidx.compose.foundation.text.input.a.j(str2, ":Length");
                String j7 = androidx.compose.foundation.text.input.a.j(str2, ":Padding");
                String a2 = gs.a(xmlPullParser, j4);
                String a3 = gs.a(xmlPullParser, j5);
                String a4 = gs.a(xmlPullParser, j6);
                String a5 = gs.a(xmlPullParser, j7);
                if (a2 != null && a3 != null) {
                    f2.b(new mf.a(a2, a3, a4 != null ? Long.parseLong(a4) : 0L, a5 != null ? Long.parseLong(a5) : 0L));
                } else {
                    return eb.h();
                }
            }
        } while (!gs.b(xmlPullParser, j3));
        return f2.a();
    }

    private static boolean b(XmlPullParser xmlPullParser) {
        for (String str : f24358a) {
            String a2 = gs.a(xmlPullParser, str);
            if (a2 != null) {
                return Integer.parseInt(a2) == 1;
            }
        }
        return false;
    }
}
