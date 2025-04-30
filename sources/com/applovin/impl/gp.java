package com.applovin.impl;

import android.text.Layout;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class gp extends bk {

    /* renamed from: p, reason: collision with root package name */
    private static final Pattern f7961p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: q, reason: collision with root package name */
    private static final Pattern f7962q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: r, reason: collision with root package name */
    private static final Pattern f7963r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: s, reason: collision with root package name */
    static final Pattern f7964s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: t, reason: collision with root package name */
    static final Pattern f7965t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: u, reason: collision with root package name */
    private static final Pattern f7966u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: v, reason: collision with root package name */
    private static final Pattern f7967v = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: w, reason: collision with root package name */
    private static final b f7968w = new b(30.0f, 1, 1);

    /* renamed from: x, reason: collision with root package name */
    private static final a f7969x = new a(32, 15);

    /* renamed from: o, reason: collision with root package name */
    private final XmlPullParserFactory f7970o;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final int f7971a;
        final int b;

        public a(int i9, int i10) {
            this.f7971a = i9;
            this.b = i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final float f7972a;
        final int b;

        /* renamed from: c, reason: collision with root package name */
        final int f7973c;

        public b(float f9, int i9, int i10) {
            this.f7972a = f9;
            this.b = i9;
            this.f7973c = i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        final int f7974a;
        final int b;

        public c(int i9, int i10) {
            this.f7974a = i9;
            this.b = i10;
        }
    }

    public gp() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f7970o = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e4) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e4);
        }
    }

    private static kp a(kp kpVar) {
        return kpVar == null ? new kp() : kpVar;
    }

    private static Layout.Alignment b(String str) {
        String lowerCase = Ascii.toLowerCase(str);
        lowerCase.getClass();
        char c9 = 65535;
        switch (lowerCase.hashCode()) {
            case -1364013995:
                if (lowerCase.equals(TtmlNode.CENTER)) {
                    c9 = 0;
                    break;
                }
                break;
            case 100571:
                if (lowerCase.equals(TtmlNode.END)) {
                    c9 = 1;
                    break;
                }
                break;
            case 3317767:
                if (lowerCase.equals(TtmlNode.LEFT)) {
                    c9 = 2;
                    break;
                }
                break;
            case 108511772:
                if (lowerCase.equals(TtmlNode.RIGHT)) {
                    c9 = 3;
                    break;
                }
                break;
            case 109757538:
                if (lowerCase.equals("start")) {
                    c9 = 4;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                return Layout.Alignment.ALIGN_CENTER;
            case 1:
            case 3:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 2:
            case 4:
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    private static float c(String str) {
        Matcher matcher = f7964s.matcher(str);
        if (!matcher.matches()) {
            L.u("Invalid value for shear: ", str, "TtmlDecoder");
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) AbstractC0669a1.a((Object) matcher.group(1)))));
        } catch (NumberFormatException e4) {
            kc.c("TtmlDecoder", "Failed to parse shear: " + str, e4);
            return Float.MAX_VALUE;
        }
    }

    private static String[] d(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        return yp.a(trim, "\\s+");
    }

    @Override // com.applovin.impl.bk
    public kl a(byte[] bArr, int i9, boolean z8) {
        b bVar;
        try {
            XmlPullParser newPullParser = this.f7970o.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new ip(""));
            c cVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i9), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVar2 = f7968w;
            a aVar = f7969x;
            int i10 = 0;
            lp lpVar = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                hp hpVar = (hp) arrayDeque.peek();
                if (i10 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if (TtmlNode.TAG_TT.equals(name)) {
                            bVar2 = a(newPullParser);
                            aVar = a(newPullParser, f7969x);
                            cVar = b(newPullParser);
                        }
                        c cVar2 = cVar;
                        b bVar3 = bVar2;
                        a aVar2 = aVar;
                        if (a(name)) {
                            if (TtmlNode.TAG_HEAD.equals(name)) {
                                bVar = bVar3;
                                a(newPullParser, hashMap, aVar2, cVar2, hashMap2, hashMap3);
                            } else {
                                bVar = bVar3;
                                try {
                                    hp a6 = a(newPullParser, hpVar, hashMap2, bVar);
                                    arrayDeque.push(a6);
                                    if (hpVar != null) {
                                        hpVar.a(a6);
                                    }
                                } catch (ml e4) {
                                    kc.c("TtmlDecoder", "Suppressing parser error", e4);
                                }
                            }
                            bVar2 = bVar;
                            cVar = cVar2;
                            aVar = aVar2;
                        } else {
                            kc.c("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            bVar = bVar3;
                        }
                        bVar2 = bVar;
                        cVar = cVar2;
                        aVar = aVar2;
                        i10++;
                    } else if (eventType == 4) {
                        ((hp) AbstractC0669a1.a(hpVar)).a(hp.a(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals(TtmlNode.TAG_TT)) {
                            lpVar = new lp((hp) AbstractC0669a1.a((hp) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                    newPullParser.next();
                } else {
                    if (eventType != 2) {
                        if (eventType == 3) {
                            i10--;
                        }
                        newPullParser.next();
                    }
                    i10++;
                    newPullParser.next();
                }
            }
            if (lpVar != null) {
                return lpVar;
            }
            throw new ml("No TTML subtitles found");
        } catch (IOException e9) {
            throw new IllegalStateException("Unexpected error when reading input.", e9);
        } catch (XmlPullParserException e10) {
            throw new ml("Unable to decode source", e10);
        }
    }

    private static c b(XmlPullParser xmlPullParser) {
        String a6 = hs.a(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (a6 == null) {
            return null;
        }
        Matcher matcher = f7966u.matcher(a6);
        if (!matcher.matches()) {
            kc.d("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(a6));
            return null;
        }
        try {
            return new c(Integer.parseInt((String) AbstractC0669a1.a((Object) matcher.group(1))), Integer.parseInt((String) AbstractC0669a1.a((Object) matcher.group(2))));
        } catch (NumberFormatException unused) {
            kc.d("TtmlDecoder", "Ignoring malformed tts extent: ".concat(a6));
            return null;
        }
    }

    private static boolean a(String str) {
        return str.equals(TtmlNode.TAG_TT) || str.equals(TtmlNode.TAG_HEAD) || str.equals(TtmlNode.TAG_BODY) || str.equals(TtmlNode.TAG_DIV) || str.equals(TtmlNode.TAG_P) || str.equals(TtmlNode.TAG_SPAN) || str.equals(TtmlNode.TAG_BR) || str.equals(TtmlNode.TAG_STYLE) || str.equals(TtmlNode.TAG_STYLING) || str.equals(TtmlNode.TAG_LAYOUT) || str.equals(TtmlNode.TAG_REGION) || str.equals(TtmlNode.TAG_METADATA) || str.equals("image") || str.equals(DataSchemeDataSource.SCHEME_DATA) || str.equals("information");
    }

    private static a a(XmlPullParser xmlPullParser, a aVar) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f7967v.matcher(attributeValue);
        if (!matcher.matches()) {
            kc.d("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return aVar;
        }
        try {
            int parseInt = Integer.parseInt((String) AbstractC0669a1.a((Object) matcher.group(1)));
            int parseInt2 = Integer.parseInt((String) AbstractC0669a1.a((Object) matcher.group(2)));
            if (parseInt == 0 || parseInt2 == 0) {
                throw new ml("Invalid cell resolution " + parseInt + " " + parseInt2);
            }
            return new a(parseInt, parseInt2);
        } catch (NumberFormatException unused) {
            kc.d("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return aVar;
        }
    }

    private static void a(String str, kp kpVar) {
        Matcher matcher;
        String[] a6 = yp.a(str, "\\s+");
        if (a6.length == 1) {
            matcher = f7963r.matcher(str);
        } else if (a6.length == 2) {
            matcher = f7963r.matcher(a6[1]);
            kc.d("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new ml(AbstractC2914a.g(new StringBuilder("Invalid number of entries for fontSize: "), a6.length, "."));
        }
        if (matcher.matches()) {
            String str2 = (String) AbstractC0669a1.a((Object) matcher.group(3));
            str2.getClass();
            char c9 = 65535;
            switch (str2.hashCode()) {
                case 37:
                    if (str2.equals("%")) {
                        c9 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (str2.equals("em")) {
                        c9 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (str2.equals("px")) {
                        c9 = 2;
                        break;
                    }
                    break;
            }
            switch (c9) {
                case 0:
                    kpVar.c(3);
                    break;
                case 1:
                    kpVar.c(2);
                    break;
                case 2:
                    kpVar.c(1);
                    break;
                default:
                    throw new ml(AbstractC2914a.e("Invalid unit for fontSize: '", str2, "'."));
            }
            kpVar.a(Float.parseFloat((String) AbstractC0669a1.a((Object) matcher.group(1))));
            return;
        }
        throw new ml(AbstractC2914a.e("Invalid expression for fontSize: '", str, "'."));
    }

    private static b a(XmlPullParser xmlPullParser) {
        float f9;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            if (yp.a(attributeValue2, " ").length == 2) {
                f9 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
            } else {
                throw new ml("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f9 = 1.0f;
        }
        b bVar = f7968w;
        int i9 = bVar.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i9 = Integer.parseInt(attributeValue3);
        }
        int i10 = bVar.f7973c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i10 = Integer.parseInt(attributeValue4);
        }
        return new b(parseInt * f9, i9, i10);
    }

    private static Map a(XmlPullParser xmlPullParser, Map map, a aVar, c cVar, Map map2, Map map3) {
        do {
            xmlPullParser.next();
            if (hs.c(xmlPullParser, TtmlNode.TAG_STYLE)) {
                String a6 = hs.a(xmlPullParser, TtmlNode.TAG_STYLE);
                kp a9 = a(xmlPullParser, new kp());
                if (a6 != null) {
                    for (String str : d(a6)) {
                        a9.a((kp) map.get(str));
                    }
                }
                String f9 = a9.f();
                if (f9 != null) {
                    map.put(f9, a9);
                }
            } else if (hs.c(xmlPullParser, TtmlNode.TAG_REGION)) {
                ip a10 = a(xmlPullParser, aVar, cVar);
                if (a10 != null) {
                    map2.put(a10.f8330a, a10);
                }
            } else if (hs.c(xmlPullParser, TtmlNode.TAG_METADATA)) {
                a(xmlPullParser, map3);
            }
        } while (!hs.b(xmlPullParser, TtmlNode.TAG_HEAD));
        return map;
    }

    private static void a(XmlPullParser xmlPullParser, Map map) {
        String a6;
        do {
            xmlPullParser.next();
            if (hs.c(xmlPullParser, "image") && (a6 = hs.a(xmlPullParser, "id")) != null) {
                map.put(a6, xmlPullParser.nextText());
            }
        } while (!hs.b(xmlPullParser, TtmlNode.TAG_METADATA));
    }

    private static hp a(XmlPullParser xmlPullParser, hp hpVar, Map map, b bVar) {
        long j7;
        long j9;
        char c9;
        int attributeCount = xmlPullParser.getAttributeCount();
        kp a6 = a(xmlPullParser, (kp) null);
        String str = null;
        String str2 = "";
        long j10 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        long j11 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        long j12 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        String[] strArr = null;
        for (int i9 = 0; i9 < attributeCount; i9++) {
            String attributeName = xmlPullParser.getAttributeName(i9);
            String attributeValue = xmlPullParser.getAttributeValue(i9);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals(TtmlNode.TAG_REGION)) {
                        c9 = 0;
                        break;
                    }
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c9 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (attributeName.equals(TtmlNode.END)) {
                        c9 = 2;
                        break;
                    }
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c9 = 3;
                        break;
                    }
                    break;
                case 109780401:
                    if (attributeName.equals(TtmlNode.TAG_STYLE)) {
                        c9 = 4;
                        break;
                    }
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c9 = 5;
                        break;
                    }
                    break;
            }
            c9 = 65535;
            switch (c9) {
                case 0:
                    if (!map.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j12 = a(attributeValue, bVar);
                    break;
                case 2:
                    j11 = a(attributeValue, bVar);
                    break;
                case 3:
                    j10 = a(attributeValue, bVar);
                    break;
                case 4:
                    String[] d2 = d(attributeValue);
                    if (d2.length > 0) {
                        strArr = d2;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (hpVar != null) {
            long j13 = hpVar.f8165d;
            j7 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            if (j13 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                if (j10 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    j10 += j13;
                }
                if (j11 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    j11 += j13;
                }
            }
        } else {
            j7 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        long j14 = j10;
        if (j11 == j7) {
            if (j12 != j7) {
                j9 = j14 + j12;
            } else if (hpVar != null) {
                long j15 = hpVar.f8166e;
                if (j15 != j7) {
                    j9 = j15;
                }
            }
            return hp.a(xmlPullParser.getName(), j14, j9, a6, strArr, str2, str, hpVar);
        }
        j9 = j11;
        return hp.a(xmlPullParser.getName(), j14, j9, a6, strArr, str2, str, hpVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0181, code lost:
    
        if (r0.equals("tb") == false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.applovin.impl.ip a(org.xmlpull.v1.XmlPullParser r18, com.applovin.impl.gp.a r19, com.applovin.impl.gp.c r20) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.gp.a(org.xmlpull.v1.XmlPullParser, com.applovin.impl.gp$a, com.applovin.impl.gp$c):com.applovin.impl.ip");
    }

    private static kp a(XmlPullParser xmlPullParser, kp kpVar) {
        char c9;
        boolean z8;
        boolean z9;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i9 = 0; i9 < attributeCount; i9++) {
            String attributeValue = xmlPullParser.getAttributeValue(i9);
            String attributeName = xmlPullParser.getAttributeName(i9);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_STYLE)) {
                        c9 = 0;
                        break;
                    }
                    break;
                case -1224696685:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_FAMILY)) {
                        c9 = 1;
                        break;
                    }
                    break;
                case -1065511464:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_ALIGN)) {
                        c9 = 2;
                        break;
                    }
                    break;
                case -879295043:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_DECORATION)) {
                        c9 = 3;
                        break;
                    }
                    break;
                case -734428249:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_WEIGHT)) {
                        c9 = 4;
                        break;
                    }
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c9 = 5;
                        break;
                    }
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c9 = 6;
                        break;
                    }
                    break;
                case 94842723:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_COLOR)) {
                        c9 = 7;
                        break;
                    }
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c9 = '\b';
                        break;
                    }
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c9 = '\t';
                        break;
                    }
                    break;
                case 365601008:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_SIZE)) {
                        c9 = '\n';
                        break;
                    }
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c9 = 11;
                        break;
                    }
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c9 = '\f';
                        break;
                    }
                    break;
                case 1287124693:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                        c9 = '\r';
                        break;
                    }
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c9 = 14;
                        break;
                    }
                    break;
            }
            c9 = 65535;
            switch (c9) {
                case 0:
                    kpVar = a(kpVar).b(TtmlNode.ITALIC.equalsIgnoreCase(attributeValue));
                    break;
                case 1:
                    kpVar = a(kpVar).a(attributeValue);
                    break;
                case 2:
                    kpVar = a(kpVar).b(b(attributeValue));
                    break;
                case 3:
                    String lowerCase = Ascii.toLowerCase(attributeValue);
                    lowerCase.getClass();
                    switch (lowerCase.hashCode()) {
                        case -1461280213:
                            if (lowerCase.equals(TtmlNode.NO_UNDERLINE)) {
                                z8 = false;
                                break;
                            }
                            break;
                        case -1026963764:
                            if (lowerCase.equals(TtmlNode.UNDERLINE)) {
                                z8 = true;
                                break;
                            }
                            break;
                        case 913457136:
                            if (lowerCase.equals(TtmlNode.NO_LINETHROUGH)) {
                                z8 = 2;
                                break;
                            }
                            break;
                        case 1679736913:
                            if (lowerCase.equals(TtmlNode.LINETHROUGH)) {
                                z8 = 3;
                                break;
                            }
                            break;
                    }
                    z8 = -1;
                    switch (z8) {
                        case false:
                            kpVar = a(kpVar).e(false);
                            break;
                        case true:
                            kpVar = a(kpVar).e(true);
                            break;
                        case true:
                            kpVar = a(kpVar).c(false);
                            break;
                        case true:
                            kpVar = a(kpVar).c(true);
                            break;
                    }
                case 4:
                    kpVar = a(kpVar).a(TtmlNode.BOLD.equalsIgnoreCase(attributeValue));
                    break;
                case 5:
                    if (TtmlNode.TAG_STYLE.equals(xmlPullParser.getName())) {
                        kpVar = a(kpVar).b(attributeValue);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    String lowerCase2 = Ascii.toLowerCase(attributeValue);
                    lowerCase2.getClass();
                    switch (lowerCase2.hashCode()) {
                        case -618561360:
                            if (lowerCase2.equals("baseContainer")) {
                                z9 = false;
                                break;
                            }
                            break;
                        case -410956671:
                            if (lowerCase2.equals("container")) {
                                z9 = true;
                                break;
                            }
                            break;
                        case -250518009:
                            if (lowerCase2.equals("delimiter")) {
                                z9 = 2;
                                break;
                            }
                            break;
                        case -136074796:
                            if (lowerCase2.equals("textContainer")) {
                                z9 = 3;
                                break;
                            }
                            break;
                        case 3016401:
                            if (lowerCase2.equals("base")) {
                                z9 = 4;
                                break;
                            }
                            break;
                        case 3556653:
                            if (lowerCase2.equals(MimeTypes.BASE_TYPE_TEXT)) {
                                z9 = 5;
                                break;
                            }
                            break;
                    }
                    z9 = -1;
                    switch (z9) {
                        case false:
                        case true:
                            kpVar = a(kpVar).e(2);
                            break;
                        case true:
                            kpVar = a(kpVar).e(1);
                            break;
                        case true:
                            kpVar = a(kpVar).e(4);
                            break;
                        case true:
                        case true:
                            kpVar = a(kpVar).e(3);
                            break;
                    }
                case 7:
                    kpVar = a(kpVar);
                    try {
                        kpVar.b(q3.b(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        L.u("Failed parsing color value: ", attributeValue, "TtmlDecoder");
                        break;
                    }
                case '\b':
                    kpVar = a(kpVar).b(c(attributeValue));
                    break;
                case '\t':
                    String lowerCase3 = Ascii.toLowerCase(attributeValue);
                    lowerCase3.getClass();
                    if (lowerCase3.equals("all")) {
                        kpVar = a(kpVar).d(true);
                        break;
                    } else if (lowerCase3.equals("none")) {
                        kpVar = a(kpVar).d(false);
                        break;
                    } else {
                        break;
                    }
                case '\n':
                    try {
                        kpVar = a(kpVar);
                        a(attributeValue, kpVar);
                        break;
                    } catch (ml unused2) {
                        L.u("Failed parsing fontSize value: ", attributeValue, "TtmlDecoder");
                        break;
                    }
                case 11:
                    kpVar = a(kpVar).a(yn.a(attributeValue));
                    break;
                case '\f':
                    String lowerCase4 = Ascii.toLowerCase(attributeValue);
                    lowerCase4.getClass();
                    if (lowerCase4.equals("before")) {
                        kpVar = a(kpVar).d(1);
                        break;
                    } else if (lowerCase4.equals("after")) {
                        kpVar = a(kpVar).d(2);
                        break;
                    } else {
                        break;
                    }
                case '\r':
                    kpVar = a(kpVar);
                    try {
                        kpVar.a(q3.b(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        L.u("Failed parsing background value: ", attributeValue, "TtmlDecoder");
                        break;
                    }
                case 14:
                    kpVar = a(kpVar).a(b(attributeValue));
                    break;
            }
        }
        return kpVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bb, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long a(java.lang.String r13, com.applovin.impl.gp.b r14) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.gp.a(java.lang.String, com.applovin.impl.gp$b):long");
    }
}
