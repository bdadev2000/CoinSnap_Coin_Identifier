package h9;

import a9.h;
import a9.j;
import android.text.Layout;
import androidx.core.view.MotionEventCompat;
import c6.k;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n9.h0;
import n9.o;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import v8.u0;

/* loaded from: classes3.dex */
public final class c extends a9.g {

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f18929n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f18930o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f18931p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f18932q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f18933r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f18934s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f18935t = Pattern.compile("^(\\d+) (\\d+)$");
    public static final j2.e u = new j2.e(30.0f, 1, 1);

    /* renamed from: v, reason: collision with root package name */
    public static final ef.b f18936v = new ef.b(32, 15);

    /* renamed from: m, reason: collision with root package name */
    public final XmlPullParserFactory f18937m;

    public c() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f18937m = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    public static f e(f fVar) {
        return fVar == null ? new f() : fVar;
    }

    public static boolean f(String str) {
        if (!str.equals(TtmlNode.TAG_TT) && !str.equals(TtmlNode.TAG_HEAD) && !str.equals(TtmlNode.TAG_BODY) && !str.equals(TtmlNode.TAG_DIV) && !str.equals(TtmlNode.TAG_P) && !str.equals(TtmlNode.TAG_SPAN) && !str.equals(TtmlNode.TAG_BR) && !str.equals(TtmlNode.TAG_STYLE) && !str.equals(TtmlNode.TAG_STYLING) && !str.equals(TtmlNode.TAG_LAYOUT) && !str.equals(TtmlNode.TAG_REGION) && !str.equals(TtmlNode.TAG_METADATA) && !str.equals("image") && !str.equals(DataSchemeDataSource.SCHEME_DATA) && !str.equals("information")) {
            return false;
        }
        return true;
    }

    public static Layout.Alignment g(String str) {
        String C = k.C(str);
        C.getClass();
        char c10 = 65535;
        switch (C.hashCode()) {
            case -1364013995:
                if (C.equals(TtmlNode.CENTER)) {
                    c10 = 0;
                    break;
                }
                break;
            case 100571:
                if (C.equals(TtmlNode.END)) {
                    c10 = 1;
                    break;
                }
                break;
            case 3317767:
                if (C.equals(TtmlNode.LEFT)) {
                    c10 = 2;
                    break;
                }
                break;
            case 108511772:
                if (C.equals(TtmlNode.RIGHT)) {
                    c10 = 3;
                    break;
                }
                break;
            case 109757538:
                if (C.equals("start")) {
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

    public static ef.b h(XmlPullParser xmlPullParser, ef.b bVar) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return bVar;
        }
        Matcher matcher = f18935t.matcher(attributeValue);
        if (!matcher.matches()) {
            o.f("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return bVar;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt != 0 && parseInt2 != 0) {
                return new ef.b(parseInt, parseInt2);
            }
            throw new j("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            o.f("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return bVar;
        }
    }

    public static void i(String str, f fVar) {
        Matcher matcher;
        int i10 = h0.a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = f18931p;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else if (split.length == 2) {
            matcher = pattern.matcher(split[1]);
            o.f("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new j(vd.e.g(new StringBuilder("Invalid number of entries for fontSize: "), split.length, "."));
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            group.getClass();
            group.hashCode();
            char c10 = 65535;
            switch (group.hashCode()) {
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                    if (group.equals("%")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (group.equals("em")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (group.equals("px")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    fVar.f18967j = 3;
                    break;
                case 1:
                    fVar.f18967j = 2;
                    break;
                case 2:
                    fVar.f18967j = 1;
                    break;
                default:
                    throw new j(com.applovin.impl.mediation.ads.e.f("Invalid unit for fontSize: '", group, "'."));
            }
            String group2 = matcher.group(1);
            group2.getClass();
            fVar.f18968k = Float.parseFloat(group2);
            return;
        }
        throw new j(com.applovin.impl.mediation.ads.e.f("Invalid expression for fontSize: '", str, "'."));
    }

    public static j2.e j(XmlPullParser xmlPullParser) {
        int i10;
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        if (attributeValue != null) {
            i10 = Integer.parseInt(attributeValue);
        } else {
            i10 = 30;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i11 = h0.a;
            if (attributeValue2.split(" ", -1).length == 2) {
                f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
            } else {
                throw new j("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f10 = 1.0f;
        }
        j2.e eVar = u;
        int i12 = eVar.f19716b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i12 = Integer.parseInt(attributeValue3);
        }
        int i13 = eVar.f19717c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i13 = Integer.parseInt(attributeValue4);
        }
        return new j2.e(i10 * f10, i12, i13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0229, code lost:
    
        if (v8.u0.N(r20, com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x022b, code lost:
    
        r20.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0234, code lost:
    
        if (v8.u0.N(r20, "image") == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0236, code lost:
    
        r6 = v8.u0.w(r20, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x023a, code lost:
    
        if (r6 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x023c, code lost:
    
        r25.put(r6, r20.nextText());
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x024c, code lost:
    
        if (v8.u0.J(r20, com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA) == false) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void k(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, ef.b r22, ef.b r23, java.util.HashMap r24, java.util.HashMap r25) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.c.k(org.xmlpull.v1.XmlPullParser, java.util.HashMap, ef.b, ef.b, java.util.HashMap, java.util.HashMap):void");
    }

    public static d l(XmlPullParser xmlPullParser, d dVar, HashMap hashMap, j2.e eVar) {
        long j3;
        long j10;
        char c10;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        f m10 = m(xmlPullParser, null);
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
            if (c10 != 0) {
                if (c10 != 1) {
                    if (c10 != 2) {
                        if (c10 != 3) {
                            if (c10 != 4) {
                                if (c10 == 5 && attributeValue.startsWith("#")) {
                                    str = attributeValue.substring(1);
                                }
                            } else {
                                String trim = attributeValue.trim();
                                if (trim.isEmpty()) {
                                    split = new String[0];
                                } else {
                                    int i11 = h0.a;
                                    split = trim.split("\\s+", -1);
                                }
                                if (split.length > 0) {
                                    strArr = split;
                                }
                            }
                        } else {
                            j11 = n(attributeValue, eVar);
                        }
                    } else {
                        j12 = n(attributeValue, eVar);
                    }
                } else {
                    j13 = n(attributeValue, eVar);
                }
            } else if (hashMap.containsKey(attributeValue)) {
                str2 = attributeValue;
            }
        }
        if (dVar != null) {
            long j14 = dVar.f18940d;
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
        if (j12 == j3) {
            if (j13 != j3) {
                j10 = j11 + j13;
            } else if (dVar != null) {
                long j15 = dVar.f18941e;
                if (j15 != j3) {
                    j10 = j15;
                }
            }
            return new d(xmlPullParser.getName(), null, j11, j10, m10, strArr, str2, str, dVar);
        }
        j10 = j12;
        return new d(xmlPullParser.getName(), null, j11, j10, m10, strArr, str2, str, dVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0359, code lost:
    
        switch(r4) {
            case 0: goto L226;
            case 1: goto L225;
            case 2: goto L224;
            case 3: goto L223;
            case 4: goto L226;
            case 5: goto L223;
            default: goto L300;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x035e, code lost:
    
        r15 = e(r15);
        r15.f18970m = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0366, code lost:
    
        r15 = e(r15);
        r15.f18970m = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x036e, code lost:
    
        r15 = e(r15);
        r15.f18970m = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0376, code lost:
    
        r15 = e(r15);
        r15.f18970m = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03df, code lost:
    
        switch(r4) {
            case 0: goto L255;
            case 1: goto L254;
            case 2: goto L253;
            case 3: goto L252;
            default: goto L301;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03e3, code lost:
    
        r15 = e(r15);
        r15.f18963f = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03ea, code lost:
    
        r15 = e(r15);
        r15.f18963f = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03f1, code lost:
    
        r15 = e(r15);
        r15.f18964g = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03f8, code lost:
    
        r15 = e(r15);
        r15.f18964g = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ce, code lost:
    
        if (r3.equals(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO) != false) goto L125;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static h9.f m(org.xmlpull.v1.XmlPullParser r14, h9.f r15) {
        /*
            Method dump skipped, instructions count: 1226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.c.m(org.xmlpull.v1.XmlPullParser, h9.f):h9.f");
    }

    public static long n(String str, j2.e eVar) {
        double d10;
        double d11;
        double d12;
        double d13;
        Matcher matcher = f18929n.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            double parseLong = Long.parseLong(group) * 3600;
            matcher.group(2).getClass();
            double parseLong2 = parseLong + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double parseLong3 = parseLong2 + Long.parseLong(r13);
            String group2 = matcher.group(4);
            double d14 = 0.0d;
            if (group2 != null) {
                d12 = Double.parseDouble(group2);
            } else {
                d12 = 0.0d;
            }
            double d15 = parseLong3 + d12;
            String group3 = matcher.group(5);
            if (group3 != null) {
                d13 = ((float) Long.parseLong(group3)) / eVar.a;
            } else {
                d13 = 0.0d;
            }
            double d16 = d15 + d13;
            if (matcher.group(6) != null) {
                d14 = (Long.parseLong(r13) / eVar.f19716b) / eVar.a;
            }
            return (long) ((d16 + d14) * 1000000.0d);
        }
        Matcher matcher2 = f18930o.matcher(str);
        if (matcher2.matches()) {
            String group4 = matcher2.group(1);
            group4.getClass();
            double parseDouble = Double.parseDouble(group4);
            String group5 = matcher2.group(2);
            group5.getClass();
            group5.hashCode();
            char c10 = 65535;
            switch (group5.hashCode()) {
                case 102:
                    if (group5.equals("f")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 104:
                    if (group5.equals("h")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 109:
                    if (group5.equals("m")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 116:
                    if (group5.equals("t")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 3494:
                    if (group5.equals("ms")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    d10 = eVar.a;
                    parseDouble /= d10;
                    break;
                case 1:
                    d11 = 3600.0d;
                    break;
                case 2:
                    d11 = 60.0d;
                    break;
                case 3:
                    d10 = eVar.f19717c;
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
        throw new j(vd.e.e("Malformed time expression: ", str));
    }

    public static ef.b o(XmlPullParser xmlPullParser) {
        String w10 = u0.w(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (w10 == null) {
            return null;
        }
        Matcher matcher = f18934s.matcher(w10);
        if (!matcher.matches()) {
            o.f("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(w10));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new ef.b(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            o.f("TtmlDecoder", "Ignoring malformed tts extent: ".concat(w10));
            return null;
        }
    }

    @Override // a9.g
    public final h b(byte[] bArr, int i10, boolean z10) {
        ef.b bVar;
        j2.e eVar;
        try {
            XmlPullParser newPullParser = this.f18937m.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new e("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            ef.b bVar2 = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            j2.e eVar2 = u;
            ef.b bVar3 = f18936v;
            int i11 = 0;
            g gVar = null;
            ef.b bVar4 = bVar3;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                d dVar = (d) arrayDeque.peek();
                if (i11 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if (TtmlNode.TAG_TT.equals(name)) {
                            eVar2 = j(newPullParser);
                            bVar4 = h(newPullParser, bVar3);
                            bVar2 = o(newPullParser);
                        }
                        ef.b bVar5 = bVar4;
                        ef.b bVar6 = bVar2;
                        j2.e eVar3 = eVar2;
                        if (!f(name)) {
                            o.e("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            i11++;
                            bVar = bVar5;
                            eVar = eVar3;
                        } else if (TtmlNode.TAG_HEAD.equals(name)) {
                            bVar = bVar5;
                            eVar = eVar3;
                            k(newPullParser, hashMap, bVar5, bVar6, hashMap2, hashMap3);
                        } else {
                            bVar = bVar5;
                            eVar = eVar3;
                            try {
                                d l10 = l(newPullParser, dVar, hashMap2, eVar);
                                arrayDeque.push(l10);
                                if (dVar != null) {
                                    if (dVar.f18949m == null) {
                                        dVar.f18949m = new ArrayList();
                                    }
                                    dVar.f18949m.add(l10);
                                }
                            } catch (j e2) {
                                o.g("TtmlDecoder", "Suppressing parser error", e2);
                                i11++;
                            }
                        }
                        bVar4 = bVar;
                        eVar2 = eVar;
                        bVar2 = bVar6;
                    } else if (eventType == 4) {
                        dVar.getClass();
                        d a = d.a(newPullParser.getText());
                        if (dVar.f18949m == null) {
                            dVar.f18949m = new ArrayList();
                        }
                        dVar.f18949m.add(a);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals(TtmlNode.TAG_TT)) {
                            d dVar2 = (d) arrayDeque.peek();
                            dVar2.getClass();
                            gVar = new g(dVar2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i11++;
                } else if (eventType == 3) {
                    i11--;
                }
                newPullParser.next();
            }
            if (gVar != null) {
                return gVar;
            }
            throw new j("No TTML subtitles found");
        } catch (IOException e10) {
            throw new IllegalStateException("Unexpected error when reading input.", e10);
        } catch (XmlPullParserException e11) {
            throw new j("Unable to decode source", e11);
        }
    }
}
