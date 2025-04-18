package com.applovin.impl;

import android.text.Layout;
import androidx.core.view.MotionEventCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
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

/* loaded from: classes.dex */
public final class gp extends bk {

    /* renamed from: p, reason: collision with root package name */
    private static final Pattern f4986p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: q, reason: collision with root package name */
    private static final Pattern f4987q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: r, reason: collision with root package name */
    private static final Pattern f4988r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: s, reason: collision with root package name */
    static final Pattern f4989s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: t, reason: collision with root package name */
    static final Pattern f4990t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: v, reason: collision with root package name */
    private static final Pattern f4991v = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: w, reason: collision with root package name */
    private static final b f4992w = new b(30.0f, 1, 1);

    /* renamed from: x, reason: collision with root package name */
    private static final a f4993x = new a(32, 15);

    /* renamed from: o, reason: collision with root package name */
    private final XmlPullParserFactory f4994o;

    /* loaded from: classes.dex */
    public static final class a {
        final int a;

        /* renamed from: b, reason: collision with root package name */
        final int f4995b;

        public a(int i10, int i11) {
            this.a = i10;
            this.f4995b = i11;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        final float a;

        /* renamed from: b, reason: collision with root package name */
        final int f4996b;

        /* renamed from: c, reason: collision with root package name */
        final int f4997c;

        public b(float f10, int i10, int i11) {
            this.a = f10;
            this.f4996b = i10;
            this.f4997c = i11;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        final int a;

        /* renamed from: b, reason: collision with root package name */
        final int f4998b;

        public c(int i10, int i11) {
            this.a = i10;
            this.f4998b = i11;
        }
    }

    public gp() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f4994o = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    private static kp a(kp kpVar) {
        return kpVar == null ? new kp() : kpVar;
    }

    private static Layout.Alignment b(String str) {
        String lowerCase = Ascii.toLowerCase(str);
        lowerCase.getClass();
        char c10 = 65535;
        switch (lowerCase.hashCode()) {
            case -1364013995:
                if (lowerCase.equals(TtmlNode.CENTER)) {
                    c10 = 0;
                    break;
                }
                break;
            case 100571:
                if (lowerCase.equals(TtmlNode.END)) {
                    c10 = 1;
                    break;
                }
                break;
            case 3317767:
                if (lowerCase.equals(TtmlNode.LEFT)) {
                    c10 = 2;
                    break;
                }
                break;
            case 108511772:
                if (lowerCase.equals(TtmlNode.RIGHT)) {
                    c10 = 3;
                    break;
                }
                break;
            case 109757538:
                if (lowerCase.equals("start")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
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
        Matcher matcher = f4989s.matcher(str);
        if (!matcher.matches()) {
            a4.j.w("Invalid value for shear: ", str, "TtmlDecoder");
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) a1.a((Object) matcher.group(1)))));
        } catch (NumberFormatException e2) {
            kc.c("TtmlDecoder", "Failed to parse shear: " + str, e2);
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
    public kl a(byte[] bArr, int i10, boolean z10) {
        b bVar;
        try {
            XmlPullParser newPullParser = this.f4994o.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new ip(""));
            c cVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVar2 = f4992w;
            a aVar = f4993x;
            int i11 = 0;
            lp lpVar = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                hp hpVar = (hp) arrayDeque.peek();
                if (i11 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if (TtmlNode.TAG_TT.equals(name)) {
                            bVar2 = a(newPullParser);
                            aVar = a(newPullParser, f4993x);
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
                                    hp a10 = a(newPullParser, hpVar, hashMap2, bVar);
                                    arrayDeque.push(a10);
                                    if (hpVar != null) {
                                        hpVar.a(a10);
                                    }
                                } catch (ml e2) {
                                    kc.c("TtmlDecoder", "Suppressing parser error", e2);
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
                        i11++;
                    } else if (eventType == 4) {
                        ((hp) a1.a(hpVar)).a(hp.a(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals(TtmlNode.TAG_TT)) {
                            lpVar = new lp((hp) a1.a((hp) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                    newPullParser.next();
                } else {
                    if (eventType != 2) {
                        if (eventType == 3) {
                            i11--;
                        }
                        newPullParser.next();
                    }
                    i11++;
                    newPullParser.next();
                }
            }
            if (lpVar != null) {
                return lpVar;
            }
            throw new ml("No TTML subtitles found");
        } catch (IOException e10) {
            throw new IllegalStateException("Unexpected error when reading input.", e10);
        } catch (XmlPullParserException e11) {
            throw new ml("Unable to decode source", e11);
        }
    }

    private static c b(XmlPullParser xmlPullParser) {
        String a10 = hs.a(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (a10 == null) {
            return null;
        }
        Matcher matcher = u.matcher(a10);
        if (!matcher.matches()) {
            kc.d("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(a10));
            return null;
        }
        try {
            return new c(Integer.parseInt((String) a1.a((Object) matcher.group(1))), Integer.parseInt((String) a1.a((Object) matcher.group(2))));
        } catch (NumberFormatException unused) {
            kc.d("TtmlDecoder", "Ignoring malformed tts extent: ".concat(a10));
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
        Matcher matcher = f4991v.matcher(attributeValue);
        if (!matcher.matches()) {
            kc.d("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return aVar;
        }
        try {
            int parseInt = Integer.parseInt((String) a1.a((Object) matcher.group(1)));
            int parseInt2 = Integer.parseInt((String) a1.a((Object) matcher.group(2)));
            if (parseInt != 0 && parseInt2 != 0) {
                return new a(parseInt, parseInt2);
            }
            throw new ml("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            kc.d("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return aVar;
        }
    }

    private static void a(String str, kp kpVar) {
        Matcher matcher;
        String[] a10 = yp.a(str, "\\s+");
        if (a10.length == 1) {
            matcher = f4988r.matcher(str);
        } else if (a10.length == 2) {
            matcher = f4988r.matcher(a10[1]);
            kc.d("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new ml(vd.e.g(new StringBuilder("Invalid number of entries for fontSize: "), a10.length, "."));
        }
        if (matcher.matches()) {
            String str2 = (String) a1.a((Object) matcher.group(3));
            str2.getClass();
            str2.hashCode();
            char c10 = 65535;
            switch (str2.hashCode()) {
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                    if (str2.equals("%")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (str2.equals("em")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (str2.equals("px")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
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
                    throw new ml(com.applovin.impl.mediation.ads.e.f("Invalid unit for fontSize: '", str2, "'."));
            }
            kpVar.a(Float.parseFloat((String) a1.a((Object) matcher.group(1))));
            return;
        }
        throw new ml(com.applovin.impl.mediation.ads.e.f("Invalid expression for fontSize: '", str, "'."));
    }

    private static b a(XmlPullParser xmlPullParser) {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            if (yp.a(attributeValue2, " ").length == 2) {
                f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
            } else {
                throw new ml("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f10 = 1.0f;
        }
        b bVar = f4992w;
        int i10 = bVar.f4996b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i10 = Integer.parseInt(attributeValue3);
        }
        int i11 = bVar.f4997c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i11 = Integer.parseInt(attributeValue4);
        }
        return new b(parseInt * f10, i10, i11);
    }

    private static Map a(XmlPullParser xmlPullParser, Map map, a aVar, c cVar, Map map2, Map map3) {
        do {
            xmlPullParser.next();
            if (hs.c(xmlPullParser, TtmlNode.TAG_STYLE)) {
                String a10 = hs.a(xmlPullParser, TtmlNode.TAG_STYLE);
                kp a11 = a(xmlPullParser, new kp());
                if (a10 != null) {
                    for (String str : d(a10)) {
                        a11.a((kp) map.get(str));
                    }
                }
                String f10 = a11.f();
                if (f10 != null) {
                    map.put(f10, a11);
                }
            } else if (hs.c(xmlPullParser, TtmlNode.TAG_REGION)) {
                ip a12 = a(xmlPullParser, aVar, cVar);
                if (a12 != null) {
                    map2.put(a12.a, a12);
                }
            } else if (hs.c(xmlPullParser, TtmlNode.TAG_METADATA)) {
                a(xmlPullParser, map3);
            }
        } while (!hs.b(xmlPullParser, TtmlNode.TAG_HEAD));
        return map;
    }

    private static void a(XmlPullParser xmlPullParser, Map map) {
        String a10;
        do {
            xmlPullParser.next();
            if (hs.c(xmlPullParser, "image") && (a10 = hs.a(xmlPullParser, "id")) != null) {
                map.put(a10, xmlPullParser.nextText());
            }
        } while (!hs.b(xmlPullParser, TtmlNode.TAG_METADATA));
    }

    private static hp a(XmlPullParser xmlPullParser, hp hpVar, Map map, b bVar) {
        long j3;
        long j10;
        char c10;
        int attributeCount = xmlPullParser.getAttributeCount();
        kp a10 = a(xmlPullParser, (kp) null);
        String[] strArr = null;
        String str = null;
        String str2 = "";
        long j11 = C.TIME_UNSET;
        long j12 = C.TIME_UNSET;
        long j13 = C.TIME_UNSET;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals(TtmlNode.TAG_REGION)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (attributeName.equals(TtmlNode.END)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 109780401:
                    if (attributeName.equals(TtmlNode.TAG_STYLE)) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            c10 = 65535;
            switch (c10) {
                case 0:
                    if (!map.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j13 = a(attributeValue, bVar);
                    break;
                case 2:
                    j12 = a(attributeValue, bVar);
                    break;
                case 3:
                    j11 = a(attributeValue, bVar);
                    break;
                case 4:
                    String[] d10 = d(attributeValue);
                    if (d10.length > 0) {
                        strArr = d10;
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
            long j14 = hpVar.f5185d;
            j3 = C.TIME_UNSET;
            if (j14 != C.TIME_UNSET) {
                if (j11 != C.TIME_UNSET) {
                    j11 += j14;
                }
                if (j12 != C.TIME_UNSET) {
                    j12 += j14;
                }
            }
        } else {
            j3 = C.TIME_UNSET;
        }
        long j15 = j11;
        if (j12 == j3) {
            if (j13 != j3) {
                j10 = j15 + j13;
            } else if (hpVar != null) {
                long j16 = hpVar.f5186e;
                if (j16 != j3) {
                    j10 = j16;
                }
            }
            return hp.a(xmlPullParser.getName(), j15, j10, a10, strArr, str2, str, hpVar);
        }
        j10 = j12;
        return hp.a(xmlPullParser.getName(), j15, j10, a10, strArr, str2, str, hpVar);
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
    private static com.applovin.impl.ip a(org.xmlpull.v1.XmlPullParser r17, com.applovin.impl.gp.a r18, com.applovin.impl.gp.c r19) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.gp.a(org.xmlpull.v1.XmlPullParser, com.applovin.impl.gp$a, com.applovin.impl.gp$c):com.applovin.impl.ip");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0283, code lost:
    
        switch(r4) {
            case 0: goto L159;
            case 1: goto L158;
            case 2: goto L157;
            case 3: goto L156;
            default: goto L203;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0287, code lost:
    
        r13 = a(r13).c(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0290, code lost:
    
        r13 = a(r13).c(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0299, code lost:
    
        r13 = a(r13).e(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02a2, code lost:
    
        r13 = a(r13).e(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x00a0, code lost:
    
        if (r4.equals("id") == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01f2, code lost:
    
        switch(r4) {
            case 0: goto L130;
            case 1: goto L129;
            case 2: goto L128;
            case 3: goto L127;
            case 4: goto L130;
            case 5: goto L127;
            default: goto L202;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f7, code lost:
    
        r13 = a(r13).e(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0201, code lost:
    
        r13 = a(r13).e(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x020b, code lost:
    
        r13 = a(r13).e(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0215, code lost:
    
        r13 = a(r13).e(2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.applovin.impl.kp a(org.xmlpull.v1.XmlPullParser r12, com.applovin.impl.kp r13) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.gp.a(org.xmlpull.v1.XmlPullParser, com.applovin.impl.kp):com.applovin.impl.kp");
    }

    private static long a(String str, b bVar) {
        double d10;
        double d11;
        Matcher matcher = f4986p.matcher(str);
        if (matcher.matches()) {
            double parseLong = (Long.parseLong((String) a1.a((Object) matcher.group(1))) * 3600) + (Long.parseLong((String) a1.a((Object) matcher.group(2))) * 60) + Long.parseLong((String) a1.a((Object) matcher.group(3)));
            String group = matcher.group(4);
            return (long) ((parseLong + (group != null ? Double.parseDouble(group) : 0.0d) + (matcher.group(5) != null ? ((float) Long.parseLong(r13)) / bVar.a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / bVar.f4996b) / bVar.a : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f4987q.matcher(str);
        if (matcher2.matches()) {
            double parseDouble = Double.parseDouble((String) a1.a((Object) matcher2.group(1)));
            String str2 = (String) a1.a((Object) matcher2.group(2));
            str2.getClass();
            str2.hashCode();
            char c10 = 65535;
            switch (str2.hashCode()) {
                case 102:
                    if (str2.equals("f")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 104:
                    if (str2.equals("h")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 109:
                    if (str2.equals("m")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 116:
                    if (str2.equals("t")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 3494:
                    if (str2.equals("ms")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    d10 = bVar.a;
                    parseDouble /= d10;
                    break;
                case 1:
                    d11 = 3600.0d;
                    break;
                case 2:
                    d11 = 60.0d;
                    break;
                case 3:
                    d10 = bVar.f4997c;
                    parseDouble /= d10;
                    break;
                case 4:
                    d10 = 1000.0d;
                    parseDouble /= d10;
                    break;
            }
            parseDouble *= d11;
            return (long) (parseDouble * 1000000.0d);
        }
        throw new ml(vd.e.e("Malformed time expression: ", str));
    }
}
