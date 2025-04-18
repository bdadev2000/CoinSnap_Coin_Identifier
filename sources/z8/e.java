package z8;

import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.JsonLexerKt;
import m9.p0;
import n9.h0;
import n9.w;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import s7.x1;
import v8.u0;

/* loaded from: classes3.dex */
public final class e extends DefaultHandler implements p0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f28611c = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f28612d = Pattern.compile("CC([1-4])=.*");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f28613f = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f28614g = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: b, reason: collision with root package name */
    public final XmlPullParserFactory f28615b;

    public e() {
        try {
            this.f28615b = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    public static long a(ArrayList arrayList, long j3, long j10, int i10, long j11) {
        int i11;
        if (i10 >= 0) {
            i11 = i10 + 1;
        } else {
            int i12 = h0.a;
            i11 = (int) ((((j11 - j3) + j10) - 1) / j10);
        }
        for (int i13 = 0; i13 < i11; i13++) {
            arrayList.add(new q(j3, j10));
            j3 += j10;
        }
        return j3;
    }

    public static void b(XmlPullParser xmlPullParser) {
        boolean z10;
        if (!u0.M(xmlPullParser)) {
            return;
        }
        int i10 = 1;
        while (i10 != 0) {
            xmlPullParser.next();
            if (u0.M(xmlPullParser)) {
                i10++;
            } else {
                if (xmlPullParser.getEventType() == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i10--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0082, code lost:
    
        if (r0 == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d4, code lost:
    
        if (r0.equals("4000") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f2, code lost:
    
        if (r0 < 33) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(org.xmlpull.v1.XmlPullParser r9) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z8.e.c(org.xmlpull.v1.XmlPullParser):int");
    }

    public static long e(XmlPullParser xmlPullParser, long j3) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j3;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return Float.parseFloat(attributeValue) * 1000000.0f;
    }

    public static ArrayList f(XmlPullParser xmlPullParser, List list, boolean z10) {
        int i10;
        int i11;
        boolean z11;
        String str;
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        if (attributeValue != null) {
            i10 = Integer.parseInt(attributeValue);
        } else if (z10) {
            i10 = 1;
        } else {
            i10 = Integer.MIN_VALUE;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        if (attributeValue2 != null) {
            i11 = Integer.parseInt(attributeValue2);
        } else {
            i11 = 1;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!u0.J(xmlPullParser, "BaseURL"));
        if (str2 != null && u0.E(str2)[0] != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (attributeValue3 == null) {
                attributeValue3 = str2;
            }
            return u0.V(new b(str2, attributeValue3, i10, i11));
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            b bVar = (b) list.get(i12);
            String e02 = u0.e0(bVar.a, str2);
            if (attributeValue3 == null) {
                str = e02;
            } else {
                str = attributeValue3;
            }
            if (z10) {
                i10 = bVar.f28589c;
                i11 = bVar.f28590d;
                str = bVar.f28588b;
            }
            arrayList.add(new b(e02, str, i10, i11));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair g(org.xmlpull.v1.XmlPullParser r13) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z8.e.g(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public static int h(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (!TextUtils.isEmpty(attributeValue)) {
            if (MimeTypes.BASE_TYPE_AUDIO.equals(attributeValue)) {
                return 1;
            }
            if (MimeTypes.BASE_TYPE_VIDEO.equals(attributeValue)) {
                return 2;
            }
            if (MimeTypes.BASE_TYPE_TEXT.equals(attributeValue)) {
                return 3;
            }
            if ("image".equals(attributeValue)) {
                return 4;
            }
        }
        return -1;
    }

    public static f i(XmlPullParser xmlPullParser, String str) {
        String str2 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        if (attributeValue3 != null) {
            str2 = attributeValue3;
        }
        do {
            xmlPullParser.next();
        } while (!u0.J(xmlPullParser, str));
        return new f(attributeValue, attributeValue2, str2);
    }

    public static long j(XmlPullParser xmlPullParser, String str, long j3) {
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j3;
        }
        Matcher matcher = h0.f22550h.matcher(attributeValue);
        if (matcher.matches()) {
            boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
            String group = matcher.group(3);
            double d15 = 0.0d;
            if (group != null) {
                d10 = Double.parseDouble(group) * 3.1556908E7d;
            } else {
                d10 = 0.0d;
            }
            String group2 = matcher.group(5);
            if (group2 != null) {
                d11 = Double.parseDouble(group2) * 2629739.0d;
            } else {
                d11 = 0.0d;
            }
            double d16 = d10 + d11;
            String group3 = matcher.group(7);
            if (group3 != null) {
                d12 = Double.parseDouble(group3) * 86400.0d;
            } else {
                d12 = 0.0d;
            }
            double d17 = d16 + d12;
            String group4 = matcher.group(10);
            if (group4 != null) {
                d13 = Double.parseDouble(group4) * 3600.0d;
            } else {
                d13 = 0.0d;
            }
            double d18 = d17 + d13;
            String group5 = matcher.group(12);
            if (group5 != null) {
                d14 = Double.parseDouble(group5) * 60.0d;
            } else {
                d14 = 0.0d;
            }
            double d19 = d18 + d14;
            String group6 = matcher.group(14);
            if (group6 != null) {
                d15 = Double.parseDouble(group6);
            }
            long j10 = (long) ((d19 + d15) * 1000.0d);
            if (isEmpty) {
                return -j10;
            }
            return j10;
        }
        return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
    }

    public static float k(XmlPullParser xmlPullParser, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = f28611c.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                if (!TextUtils.isEmpty(matcher.group(2))) {
                    return parseInt / Integer.parseInt(r2);
                }
                return parseInt;
            }
            return f10;
        }
        return f10;
    }

    public static int l(XmlPullParser xmlPullParser, String str, int i10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            return Integer.parseInt(attributeValue);
        }
        return i10;
    }

    public static long m(XmlPullParser xmlPullParser, String str, long j3) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            return Long.parseLong(attributeValue);
        }
        return j3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0860, code lost:
    
        if (com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_E_AC3_JOC.equals(r0) != false) goto L274;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:622:0x0f48. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0e37 A[LOOP:5: B:153:0x0396->B:162:0x0e37, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0cc7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0da6 A[LOOP:9: B:193:0x0d74->B:207:0x0da6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0da2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0b49 A[LOOP:11: B:310:0x05bf->B:318:0x0b49, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x07d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x089d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x11e9 A[LOOP:1: B:34:0x00d3->B:43:0x11e9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0ade  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0afc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x11ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0b1c  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0aff  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0ae1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static z8.c n(org.xmlpull.v1.XmlPullParser r157, android.net.Uri r158) {
        /*
            Method dump skipped, instructions count: 4648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z8.e.n(org.xmlpull.v1.XmlPullParser, android.net.Uri):z8.c");
    }

    public static j o(XmlPullParser xmlPullParser, String str, String str2) {
        long j3;
        long j10;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j3 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j10 = (Long.parseLong(split[1]) - j3) + 1;
                return new j(attributeValue, j3, j10);
            }
        } else {
            j3 = 0;
        }
        j10 = -1;
        return new j(attributeValue, j3, j10);
    }

    public static int p(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2060497896:
                if (str.equals("subtitle")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1724546052:
                if (str.equals("description")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1574842690:
                if (str.equals("forced_subtitle")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1408024454:
                if (str.equals("alternate")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1396432756:
                if (str.equals("forced-subtitle")) {
                    c10 = 5;
                    break;
                }
                break;
            case 99825:
                if (str.equals("dub")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3343801:
                if (str.equals("main")) {
                    c10 = 7;
                    break;
                }
                break;
            case 3530173:
                if (str.equals("sign")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 552573414:
                if (str.equals("caption")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 899152809:
                if (str.equals("commentary")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1629013393:
                if (str.equals("emergency")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1855372047:
                if (str.equals("supplementary")) {
                    c10 = '\f';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 3:
            case 5:
                return 128;
            case 1:
                return 512;
            case 2:
                return 2048;
            case 4:
                return 2;
            case 6:
                return 16;
            case 7:
                return 1;
            case '\b':
                return NotificationCompat.FLAG_LOCAL_ONLY;
            case '\t':
                return 64;
            case '\n':
                return 8;
            case 11:
                return 32;
            case '\f':
                return 4;
            default:
                return 0;
        }
    }

    public static int q(ArrayList arrayList) {
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (c6.k.l("http://dashif.org/guidelines/trickmode", ((f) arrayList.get(i11)).a)) {
                i10 |= JsonLexerKt.BATCH_SIZE;
            }
        }
        return i10;
    }

    public static r r(XmlPullParser xmlPullParser, r rVar) {
        long j3;
        long j10;
        long j11;
        long j12;
        long j13;
        if (rVar != null) {
            j3 = rVar.f28655b;
        } else {
            j3 = 1;
        }
        long m10 = m(xmlPullParser, "timescale", j3);
        long j14 = 0;
        if (rVar != null) {
            j10 = rVar.f28656c;
        } else {
            j10 = 0;
        }
        long m11 = m(xmlPullParser, "presentationTimeOffset", j10);
        if (rVar != null) {
            j11 = rVar.f28653d;
        } else {
            j11 = 0;
        }
        if (rVar != null) {
            j14 = rVar.f28654e;
        }
        j jVar = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j12 = (Long.parseLong(split[1]) - parseLong) + 1;
            j13 = parseLong;
        } else {
            j12 = j14;
            j13 = j11;
        }
        if (rVar != null) {
            jVar = rVar.a;
        }
        do {
            xmlPullParser.next();
            if (u0.N(xmlPullParser, "Initialization")) {
                jVar = o(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
        } while (!u0.J(xmlPullParser, "SegmentBase"));
        return new r(jVar, m10, m11, j13, j12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    public static o s(XmlPullParser xmlPullParser, o oVar, long j3, long j10, long j11, long j12, long j13) {
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        ArrayList arrayList;
        long j19 = 1;
        if (oVar != null) {
            j14 = oVar.f28655b;
        } else {
            j14 = 1;
        }
        long m10 = m(xmlPullParser, "timescale", j14);
        if (oVar != null) {
            j15 = oVar.f28656c;
        } else {
            j15 = 0;
        }
        long m11 = m(xmlPullParser, "presentationTimeOffset", j15);
        if (oVar != null) {
            j16 = oVar.f28643e;
        } else {
            j16 = -9223372036854775807L;
        }
        long m12 = m(xmlPullParser, "duration", j16);
        if (oVar != null) {
            j19 = oVar.f28642d;
        }
        long m13 = m(xmlPullParser, "startNumber", j19);
        if (j12 == C.TIME_UNSET) {
            j17 = j11;
        } else {
            j17 = j12;
        }
        if (j17 == Long.MAX_VALUE) {
            j18 = -9223372036854775807L;
        } else {
            j18 = j17;
        }
        ArrayList arrayList2 = null;
        j jVar = null;
        List list = null;
        do {
            xmlPullParser.next();
            if (u0.N(xmlPullParser, "Initialization")) {
                jVar = o(xmlPullParser, "sourceURL", "range");
            } else if (u0.N(xmlPullParser, "SegmentTimeline")) {
                list = u(xmlPullParser, m10, j10);
            } else if (u0.N(xmlPullParser, "SegmentURL")) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(o(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!u0.J(xmlPullParser, "SegmentList"));
        if (oVar != null) {
            if (jVar == null) {
                jVar = oVar.a;
            }
            if (list == null) {
                list = oVar.f28644f;
            }
            if (arrayList2 == null) {
                arrayList = oVar.f28648j;
                return new o(jVar, m10, m11, m13, m12, list, j18, arrayList, h0.H(j13), h0.H(j3));
            }
        }
        arrayList = arrayList2;
        return new o(jVar, m10, m11, m13, m12, list, j18, arrayList, h0.H(j13), h0.H(j3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    public static p t(XmlPullParser xmlPullParser, p pVar, List list, long j3, long j10, long j11, long j12, long j13) {
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        w wVar;
        w wVar2;
        j jVar;
        ArrayList arrayList;
        long j20 = 1;
        if (pVar != null) {
            j14 = pVar.f28655b;
        } else {
            j14 = 1;
        }
        long m10 = m(xmlPullParser, "timescale", j14);
        if (pVar != null) {
            j15 = pVar.f28656c;
        } else {
            j15 = 0;
        }
        long m11 = m(xmlPullParser, "presentationTimeOffset", j15);
        if (pVar != null) {
            j16 = pVar.f28643e;
        } else {
            j16 = -9223372036854775807L;
        }
        long m12 = m(xmlPullParser, "duration", j16);
        if (pVar != null) {
            j20 = pVar.f28642d;
        }
        long m13 = m(xmlPullParser, "startNumber", j20);
        int i10 = 0;
        while (true) {
            if (i10 < list.size()) {
                f fVar = (f) list.get(i10);
                if (c6.k.l("http://dashif.org/guidelines/last-segment-number", fVar.a)) {
                    j17 = Long.parseLong(fVar.f28616b);
                    break;
                }
                i10++;
            } else {
                j17 = -1;
                break;
            }
        }
        long j21 = j17;
        if (j12 == C.TIME_UNSET) {
            j18 = j11;
        } else {
            j18 = j12;
        }
        if (j18 == Long.MAX_VALUE) {
            j19 = -9223372036854775807L;
        } else {
            j19 = j18;
        }
        j jVar2 = null;
        if (pVar != null) {
            wVar = pVar.f28650k;
        } else {
            wVar = null;
        }
        w v10 = v(xmlPullParser, "media", wVar);
        if (pVar != null) {
            wVar2 = pVar.f28649j;
        } else {
            wVar2 = null;
        }
        w v11 = v(xmlPullParser, "initialization", wVar2);
        ArrayList arrayList2 = null;
        do {
            xmlPullParser.next();
            if (u0.N(xmlPullParser, "Initialization")) {
                jVar2 = o(xmlPullParser, "sourceURL", "range");
            } else if (u0.N(xmlPullParser, "SegmentTimeline")) {
                arrayList2 = u(xmlPullParser, m10, j10);
            } else {
                b(xmlPullParser);
            }
        } while (!u0.J(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (jVar2 == null) {
                jVar2 = pVar.a;
            }
            if (arrayList2 == null) {
                arrayList = pVar.f28644f;
                jVar = jVar2;
                return new p(jVar, m10, m11, m13, j21, m12, arrayList, j19, v11, v10, h0.H(j13), h0.H(j3));
            }
        }
        jVar = jVar2;
        arrayList = arrayList2;
        return new p(jVar, m10, m11, m13, j21, m12, arrayList, j19, v11, v10, h0.H(j13), h0.H(j3));
    }

    public static ArrayList u(XmlPullParser xmlPullParser, long j3, long j10) {
        ArrayList arrayList = new ArrayList();
        long j11 = 0;
        long j12 = -9223372036854775807L;
        boolean z10 = false;
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (u0.N(xmlPullParser, "S")) {
                long m10 = m(xmlPullParser, "t", C.TIME_UNSET);
                if (z10) {
                    j11 = a(arrayList, j11, j12, i10, m10);
                }
                if (m10 == C.TIME_UNSET) {
                    m10 = j11;
                }
                long m11 = m(xmlPullParser, "d", C.TIME_UNSET);
                i10 = l(xmlPullParser, CampaignEx.JSON_KEY_AD_R, 0);
                z10 = true;
                j12 = m11;
                j11 = m10;
            } else {
                b(xmlPullParser);
            }
        } while (!u0.J(xmlPullParser, "SegmentTimeline"));
        if (z10) {
            a(arrayList, j11, j12, i10, h0.M(j10, j3, 1000L));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00c6. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String[], java.io.Serializable] */
    public static w v(XmlPullParser xmlPullParser, String str, w wVar) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            String[] strArr = new String[5];
            int[] iArr = new int[4];
            ?? r12 = new String[4];
            strArr[0] = "";
            int i10 = 0;
            int i11 = 0;
            while (i10 < attributeValue.length()) {
                int indexOf = attributeValue.indexOf("$", i10);
                if (indexOf == -1) {
                    strArr[i11] = strArr[i11] + attributeValue.substring(i10);
                    i10 = attributeValue.length();
                } else if (indexOf != i10) {
                    strArr[i11] = strArr[i11] + attributeValue.substring(i10, indexOf);
                    i10 = indexOf;
                } else if (attributeValue.startsWith("$$", i10)) {
                    strArr[i11] = vd.e.h(new StringBuilder(), strArr[i11], "$");
                    i10 += 2;
                } else {
                    int i12 = i10 + 1;
                    int indexOf2 = attributeValue.indexOf("$", i12);
                    String substring = attributeValue.substring(i12, indexOf2);
                    if (substring.equals("RepresentationID")) {
                        iArr[i11] = 1;
                    } else {
                        int indexOf3 = substring.indexOf("%0");
                        if (indexOf3 != -1) {
                            str2 = substring.substring(indexOf3);
                            if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                                str2 = str2.concat("d");
                            }
                            substring = substring.substring(0, indexOf3);
                        } else {
                            str2 = "%01d";
                        }
                        substring.getClass();
                        substring.hashCode();
                        char c10 = 65535;
                        switch (substring.hashCode()) {
                            case -1950496919:
                                if (substring.equals("Number")) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                            case 2606829:
                                if (substring.equals("Time")) {
                                    c10 = 1;
                                    break;
                                }
                                break;
                            case 38199441:
                                if (substring.equals("Bandwidth")) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c10) {
                            case 0:
                                iArr[i11] = 2;
                                break;
                            case 1:
                                iArr[i11] = 4;
                                break;
                            case 2:
                                iArr[i11] = 3;
                                break;
                            default:
                                throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                        }
                        r12[i11] = str2;
                    }
                    i11++;
                    strArr[i11] = "";
                    i10 = indexOf2 + 1;
                }
            }
            return new w(strArr, iArr, (Serializable) r12, i11);
        }
        return wVar;
    }

    @Override // m9.p0
    public final Object d(Uri uri, m9.n nVar) {
        try {
            XmlPullParser newPullParser = this.f28615b.newPullParser();
            newPullParser.setInput(nVar, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return n(newPullParser, uri);
            }
            throw x1.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e2) {
            throw x1.b(null, e2);
        }
    }
}
