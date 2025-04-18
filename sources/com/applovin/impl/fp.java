package com.applovin.impl;

import android.text.Layout;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.appevents.UserDataStore;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.AnalyticsEvents;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
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

/* loaded from: classes3.dex */
public final class fp extends ek {

    /* renamed from: p, reason: collision with root package name */
    private static final Pattern f23977p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: q, reason: collision with root package name */
    private static final Pattern f23978q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: r, reason: collision with root package name */
    private static final Pattern f23979r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: s, reason: collision with root package name */
    static final Pattern f23980s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: t, reason: collision with root package name */
    static final Pattern f23981t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: u, reason: collision with root package name */
    private static final Pattern f23982u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: v, reason: collision with root package name */
    private static final Pattern f23983v = Pattern.compile("^(\\d+) (\\d+)$");
    private static final b w = new b(30.0f, 1, 1);
    private static final a x = new a(32, 15);

    /* renamed from: o, reason: collision with root package name */
    private final XmlPullParserFactory f23984o;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final int f23985a;

        /* renamed from: b, reason: collision with root package name */
        final int f23986b;

        public a(int i2, int i3) {
            this.f23985a = i2;
            this.f23986b = i3;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final float f23987a;

        /* renamed from: b, reason: collision with root package name */
        final int f23988b;

        /* renamed from: c, reason: collision with root package name */
        final int f23989c;

        public b(float f2, int i2, int i3) {
            this.f23987a = f2;
            this.f23988b = i2;
            this.f23989c = i3;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        final int f23990a;

        /* renamed from: b, reason: collision with root package name */
        final int f23991b;

        public c(int i2, int i3) {
            this.f23990a = i2;
            this.f23991b = i3;
        }
    }

    public fp() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f23984o = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    private static jp a(jp jpVar) {
        return jpVar == null ? new jp() : jpVar;
    }

    private static Layout.Alignment b(String str) {
        String lowerCase = Ascii.toLowerCase(str);
        lowerCase.getClass();
        char c2 = 65535;
        switch (lowerCase.hashCode()) {
            case -1364013995:
                if (lowerCase.equals("center")) {
                    c2 = 0;
                    break;
                }
                break;
            case 100571:
                if (lowerCase.equals("end")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3317767:
                if (lowerCase.equals(ViewHierarchyConstants.DIMENSION_LEFT_KEY)) {
                    c2 = 2;
                    break;
                }
                break;
            case 108511772:
                if (lowerCase.equals("right")) {
                    c2 = 3;
                    break;
                }
                break;
            case 109757538:
                if (lowerCase.equals("start")) {
                    c2 = 4;
                    break;
                }
                break;
        }
        switch (c2) {
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
        Matcher matcher = f23980s.matcher(str);
        if (!matcher.matches()) {
            androidx.compose.foundation.text.input.a.x("Invalid value for shear: ", str, "TtmlDecoder");
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) b1.a((Object) matcher.group(1)))));
        } catch (NumberFormatException e) {
            pc.c("TtmlDecoder", "Failed to parse shear: " + str, e);
            return Float.MAX_VALUE;
        }
    }

    private static String[] d(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : xp.a(trim, "\\s+");
    }

    @Override // com.applovin.impl.ek
    public nl a(byte[] bArr, int i2, boolean z2) {
        b bVar;
        try {
            XmlPullParser newPullParser = this.f23984o.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new hp(""));
            c cVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVar2 = w;
            a aVar = x;
            int i3 = 0;
            kp kpVar = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                gp gpVar = (gp) arrayDeque.peek();
                if (i3 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = a(newPullParser);
                            aVar = a(newPullParser, x);
                            cVar = b(newPullParser);
                        }
                        c cVar2 = cVar;
                        b bVar3 = bVar2;
                        a aVar2 = aVar;
                        if (a(name)) {
                            if ("head".equals(name)) {
                                bVar = bVar3;
                                a(newPullParser, hashMap, aVar2, cVar2, hashMap2, hashMap3);
                            } else {
                                bVar = bVar3;
                                try {
                                    gp a2 = a(newPullParser, gpVar, hashMap2, bVar);
                                    arrayDeque.push(a2);
                                    if (gpVar != null) {
                                        gpVar.a(a2);
                                    }
                                } catch (pl e) {
                                    pc.c("TtmlDecoder", "Suppressing parser error", e);
                                }
                            }
                            bVar2 = bVar;
                            cVar = cVar2;
                            aVar = aVar2;
                        } else {
                            pc.c("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            bVar = bVar3;
                        }
                        bVar2 = bVar;
                        cVar = cVar2;
                        aVar = aVar2;
                        i3++;
                    } else if (eventType == 4) {
                        ((gp) b1.a(gpVar)).a(gp.a(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            kpVar = new kp((gp) b1.a((gp) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                    newPullParser.next();
                } else {
                    if (eventType != 2) {
                        if (eventType == 3) {
                            i3--;
                        }
                        newPullParser.next();
                    }
                    i3++;
                    newPullParser.next();
                }
            }
            if (kpVar != null) {
                return kpVar;
            }
            throw new pl("No TTML subtitles found");
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new pl("Unable to decode source", e3);
        }
    }

    private static c b(XmlPullParser xmlPullParser) {
        String a2 = gs.a(xmlPullParser, "extent");
        if (a2 == null) {
            return null;
        }
        Matcher matcher = f23982u.matcher(a2);
        if (!matcher.matches()) {
            pc.d("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(a2));
            return null;
        }
        try {
            return new c(Integer.parseInt((String) b1.a((Object) matcher.group(1))), Integer.parseInt((String) b1.a((Object) matcher.group(2))));
        } catch (NumberFormatException unused) {
            pc.d("TtmlDecoder", "Ignoring malformed tts extent: ".concat(a2));
            return null;
        }
    }

    private static boolean a(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals(AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE) || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    private static a a(XmlPullParser xmlPullParser, a aVar) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f23983v.matcher(attributeValue);
        if (!matcher.matches()) {
            pc.d("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return aVar;
        }
        try {
            int parseInt = Integer.parseInt((String) b1.a((Object) matcher.group(1)));
            int parseInt2 = Integer.parseInt((String) b1.a((Object) matcher.group(2)));
            if (parseInt != 0 && parseInt2 != 0) {
                return new a(parseInt, parseInt2);
            }
            throw new pl("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            pc.d("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return aVar;
        }
    }

    private static void a(String str, jp jpVar) {
        Matcher matcher;
        String[] a2 = xp.a(str, "\\s+");
        if (a2.length == 1) {
            matcher = f23979r.matcher(str);
        } else if (a2.length == 2) {
            matcher = f23979r.matcher(a2[1]);
            pc.d("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new pl(androidx.compose.foundation.text.input.a.n(new StringBuilder("Invalid number of entries for fontSize: "), a2.length, "."));
        }
        if (matcher.matches()) {
            String str2 = (String) b1.a((Object) matcher.group(3));
            str2.getClass();
            str2.hashCode();
            char c2 = 65535;
            switch (str2.hashCode()) {
                case 37:
                    if (str2.equals("%")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (str2.equals(UserDataStore.EMAIL)) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (str2.equals("px")) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    jpVar.c(3);
                    break;
                case 1:
                    jpVar.c(2);
                    break;
                case 2:
                    jpVar.c(1);
                    break;
                default:
                    throw new pl(androidx.compose.foundation.text.input.a.A("Invalid unit for fontSize: '", str2, "'."));
            }
            jpVar.a(Float.parseFloat((String) b1.a((Object) matcher.group(1))));
            return;
        }
        throw new pl(androidx.compose.foundation.text.input.a.A("Invalid expression for fontSize: '", str, "'."));
    }

    private static b a(XmlPullParser xmlPullParser) {
        float f2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            if (xp.a(attributeValue2, " ").length == 2) {
                f2 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
            } else {
                throw new pl("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f2 = 1.0f;
        }
        b bVar = w;
        int i2 = bVar.f23988b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = bVar.f23989c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new b(parseInt * f2, i2, i3);
    }

    private static Map a(XmlPullParser xmlPullParser, Map map, a aVar, c cVar, Map map2, Map map3) {
        do {
            xmlPullParser.next();
            if (gs.c(xmlPullParser, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE)) {
                String a2 = gs.a(xmlPullParser, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE);
                jp a3 = a(xmlPullParser, new jp());
                if (a2 != null) {
                    for (String str : d(a2)) {
                        a3.a((jp) map.get(str));
                    }
                }
                String f2 = a3.f();
                if (f2 != null) {
                    map.put(f2, a3);
                }
            } else if (gs.c(xmlPullParser, "region")) {
                hp a4 = a(xmlPullParser, aVar, cVar);
                if (a4 != null) {
                    map2.put(a4.f24342a, a4);
                }
            } else if (gs.c(xmlPullParser, "metadata")) {
                a(xmlPullParser, map3);
            }
        } while (!gs.b(xmlPullParser, "head"));
        return map;
    }

    private static void a(XmlPullParser xmlPullParser, Map map) {
        String a2;
        do {
            xmlPullParser.next();
            if (gs.c(xmlPullParser, "image") && (a2 = gs.a(xmlPullParser, "id")) != null) {
                map.put(a2, xmlPullParser.nextText());
            }
        } while (!gs.b(xmlPullParser, "metadata"));
    }

    private static gp a(XmlPullParser xmlPullParser, gp gpVar, Map map, b bVar) {
        long j2;
        long j3;
        char c2;
        int attributeCount = xmlPullParser.getAttributeCount();
        jp a2 = a(xmlPullParser, (jp) null);
        String[] strArr = null;
        String str = null;
        String str2 = "";
        long j4 = -9223372036854775807L;
        long j5 = -9223372036854775807L;
        long j6 = -9223372036854775807L;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = xmlPullParser.getAttributeName(i2);
            String attributeValue = xmlPullParser.getAttributeValue(i2);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 109780401:
                    if (attributeName.equals(AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE)) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c2 = 5;
                        break;
                    }
                    break;
            }
            c2 = 65535;
            switch (c2) {
                case 0:
                    if (!map.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j6 = a(attributeValue, bVar);
                    break;
                case 2:
                    j5 = a(attributeValue, bVar);
                    break;
                case 3:
                    j4 = a(attributeValue, bVar);
                    break;
                case 4:
                    String[] d = d(attributeValue);
                    if (d.length > 0) {
                        strArr = d;
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
        if (gpVar != null) {
            long j7 = gpVar.d;
            j2 = -9223372036854775807L;
            if (j7 != -9223372036854775807L) {
                if (j4 != -9223372036854775807L) {
                    j4 += j7;
                }
                if (j5 != -9223372036854775807L) {
                    j5 += j7;
                }
            }
        } else {
            j2 = -9223372036854775807L;
        }
        long j8 = j4;
        if (j5 == j2) {
            if (j6 != j2) {
                j3 = j8 + j6;
            } else if (gpVar != null) {
                long j9 = gpVar.e;
                if (j9 != j2) {
                    j3 = j9;
                }
            }
            return gp.a(xmlPullParser.getName(), j8, j3, a2, strArr, str2, str, gpVar);
        }
        j3 = j5;
        return gp.a(xmlPullParser.getName(), j8, j3, a2, strArr, str2, str, gpVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x017d, code lost:
    
        if (r0.equals("tb") == false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.applovin.impl.hp a(org.xmlpull.v1.XmlPullParser r17, com.applovin.impl.fp.a r18, com.applovin.impl.fp.c r19) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.fp.a(org.xmlpull.v1.XmlPullParser, com.applovin.impl.fp$a, com.applovin.impl.fp$c):com.applovin.impl.hp");
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x009a, code lost:
    
        if (r4.equals("id") == false) goto L6;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:48:0x01aa. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:85:0x0251. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.applovin.impl.jp a(org.xmlpull.v1.XmlPullParser r12, com.applovin.impl.jp r13) {
        /*
            Method dump skipped, instructions count: 890
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.fp.a(org.xmlpull.v1.XmlPullParser, com.applovin.impl.jp):com.applovin.impl.jp");
    }

    private static long a(String str, b bVar) {
        double d;
        double d2;
        Matcher matcher = f23977p.matcher(str);
        if (matcher.matches()) {
            double parseLong = (Long.parseLong((String) b1.a((Object) matcher.group(1))) * 3600) + (Long.parseLong((String) b1.a((Object) matcher.group(2))) * 60) + Long.parseLong((String) b1.a((Object) matcher.group(3)));
            String group = matcher.group(4);
            double d3 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            double parseDouble = parseLong + (group != null ? Double.parseDouble(group) : 0.0d) + (matcher.group(5) != null ? ((float) Long.parseLong(r13)) / bVar.f23987a : 0.0d);
            if (matcher.group(6) != null) {
                d3 = (Long.parseLong(r13) / bVar.f23988b) / bVar.f23987a;
            }
            return (long) ((parseDouble + d3) * 1000000.0d);
        }
        Matcher matcher2 = f23978q.matcher(str);
        if (matcher2.matches()) {
            double parseDouble2 = Double.parseDouble((String) b1.a((Object) matcher2.group(1)));
            String str2 = (String) b1.a((Object) matcher2.group(2));
            str2.getClass();
            str2.hashCode();
            char c2 = 65535;
            switch (str2.hashCode()) {
                case 102:
                    if (str2.equals("f")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 104:
                    if (str2.equals("h")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 109:
                    if (str2.equals("m")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 116:
                    if (str2.equals("t")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 3494:
                    if (str2.equals("ms")) {
                        c2 = 4;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    d = bVar.f23987a;
                    parseDouble2 /= d;
                    break;
                case 1:
                    d2 = 3600.0d;
                    break;
                case 2:
                    d2 = 60.0d;
                    break;
                case 3:
                    d = bVar.f23989c;
                    parseDouble2 /= d;
                    break;
                case 4:
                    d = 1000.0d;
                    parseDouble2 /= d;
                    break;
            }
            parseDouble2 *= d2;
            return (long) (parseDouble2 * 1000000.0d);
        }
        throw new pl(androidx.compose.ui.platform.j.b("Malformed time expression: ", str));
    }
}
