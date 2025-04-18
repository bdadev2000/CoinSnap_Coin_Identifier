package com.mbridge.msdk.playercommon.exoplayer2.text.ttml;

import android.util.Log;
import androidx.core.view.MotionEventCompat;
import com.mbridge.msdk.playercommon.exoplayer2.text.SimpleSubtitleDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleDecoderException;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import com.mbridge.msdk.playercommon.exoplayer2.util.XmlPullParserUtil;
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
import vd.e;

/* loaded from: classes4.dex */
public final class TtmlDecoder extends SimpleSubtitleDecoder {
    private static final String ATTR_BEGIN = "begin";
    private static final String ATTR_DURATION = "dur";
    private static final String ATTR_END = "end";
    private static final String ATTR_REGION = "region";
    private static final String ATTR_STYLE = "style";
    private static final int DEFAULT_FRAME_RATE = 30;
    private static final String TAG = "TtmlDecoder";
    private static final String TTP = "http://www.w3.org/ns/ttml#parameter";
    private final XmlPullParserFactory xmlParserFactory;
    private static final Pattern CLOCK_TIME = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern OFFSET_TIME = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern FONT_SIZE = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    private static final Pattern PERCENTAGE_COORDINATES = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern CELL_RESOLUTION = Pattern.compile("^(\\d+) (\\d+)$");
    private static final FrameAndTickRate DEFAULT_FRAME_AND_TICK_RATE = new FrameAndTickRate(30.0f, 1, 1);
    private static final CellResolution DEFAULT_CELL_RESOLUTION = new CellResolution(32, 15);

    /* loaded from: classes4.dex */
    public static final class CellResolution {
        final int columns;
        final int rows;

        public CellResolution(int i10, int i11) {
            this.columns = i10;
            this.rows = i11;
        }
    }

    /* loaded from: classes4.dex */
    public static final class FrameAndTickRate {
        final float effectiveFrameRate;
        final int subFrameRate;
        final int tickRate;

        public FrameAndTickRate(float f10, int i10, int i11) {
            this.effectiveFrameRate = f10;
            this.subFrameRate = i10;
            this.tickRate = i11;
        }
    }

    public TtmlDecoder() {
        super(TAG);
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.xmlParserFactory = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    private TtmlStyle createIfNull(TtmlStyle ttmlStyle) {
        return ttmlStyle == null ? new TtmlStyle() : ttmlStyle;
    }

    private static boolean isSupportedTag(String str) {
        if (!str.equals(TtmlNode.TAG_TT) && !str.equals(TtmlNode.TAG_HEAD) && !str.equals(TtmlNode.TAG_BODY) && !str.equals(TtmlNode.TAG_DIV) && !str.equals(TtmlNode.TAG_P) && !str.equals(TtmlNode.TAG_SPAN) && !str.equals(TtmlNode.TAG_BR) && !str.equals("style") && !str.equals(TtmlNode.TAG_STYLING) && !str.equals(TtmlNode.TAG_LAYOUT) && !str.equals("region") && !str.equals(TtmlNode.TAG_METADATA) && !str.equals(TtmlNode.TAG_SMPTE_IMAGE) && !str.equals(TtmlNode.TAG_SMPTE_DATA) && !str.equals(TtmlNode.TAG_SMPTE_INFORMATION)) {
            return false;
        }
        return true;
    }

    private CellResolution parseCellResolution(XmlPullParser xmlPullParser, CellResolution cellResolution) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue(TTP, "cellResolution");
        if (attributeValue == null) {
            return cellResolution;
        }
        Matcher matcher = CELL_RESOLUTION.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w(TAG, "Ignoring malformed cell resolution: ".concat(attributeValue));
            return cellResolution;
        }
        try {
            int parseInt = Integer.parseInt(matcher.group(1));
            int parseInt2 = Integer.parseInt(matcher.group(2));
            if (parseInt != 0 && parseInt2 != 0) {
                return new CellResolution(parseInt, parseInt2);
            }
            throw new SubtitleDecoderException("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed cell resolution: ".concat(attributeValue));
            return cellResolution;
        }
    }

    private static void parseFontSize(String str, TtmlStyle ttmlStyle) throws SubtitleDecoderException {
        Matcher matcher;
        String[] split = Util.split(str, "\\s+");
        if (split.length == 1) {
            matcher = FONT_SIZE.matcher(str);
        } else if (split.length == 2) {
            matcher = FONT_SIZE.matcher(split[1]);
            Log.w(TAG, "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new SubtitleDecoderException(e.g(new StringBuilder("Invalid number of entries for fontSize: "), split.length, "."));
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
                    ttmlStyle.setFontSizeUnit(3);
                    break;
                case 1:
                    ttmlStyle.setFontSizeUnit(2);
                    break;
                case 2:
                    ttmlStyle.setFontSizeUnit(1);
                    break;
                default:
                    throw new SubtitleDecoderException(com.applovin.impl.mediation.ads.e.f("Invalid unit for fontSize: '", group, "'."));
            }
            ttmlStyle.setFontSize(Float.valueOf(matcher.group(1)).floatValue());
            return;
        }
        throw new SubtitleDecoderException(com.applovin.impl.mediation.ads.e.f("Invalid expression for fontSize: '", str, "'."));
    }

    private FrameAndTickRate parseFrameAndTickRates(XmlPullParser xmlPullParser) throws SubtitleDecoderException {
        int i10;
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue(TTP, "frameRate");
        if (attributeValue != null) {
            i10 = Integer.parseInt(attributeValue);
        } else {
            i10 = 30;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(TTP, "frameRateMultiplier");
        if (attributeValue2 != null) {
            if (Util.split(attributeValue2, " ").length == 2) {
                f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
            } else {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f10 = 1.0f;
        }
        FrameAndTickRate frameAndTickRate = DEFAULT_FRAME_AND_TICK_RATE;
        int i11 = frameAndTickRate.subFrameRate;
        String attributeValue3 = xmlPullParser.getAttributeValue(TTP, "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = frameAndTickRate.tickRate;
        String attributeValue4 = xmlPullParser.getAttributeValue(TTP, "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new FrameAndTickRate(i10 * f10, i11, i12);
    }

    private Map<String, TtmlStyle> parseHeader(XmlPullParser xmlPullParser, Map<String, TtmlStyle> map, Map<String, TtmlRegion> map2, CellResolution cellResolution) throws IOException, XmlPullParserException {
        TtmlRegion parseRegionAttributes;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "style")) {
                String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "style");
                TtmlStyle parseStyleAttributes = parseStyleAttributes(xmlPullParser, new TtmlStyle());
                if (attributeValue != null) {
                    for (String str : parseStyleIds(attributeValue)) {
                        parseStyleAttributes.chain(map.get(str));
                    }
                }
                if (parseStyleAttributes.getId() != null) {
                    map.put(parseStyleAttributes.getId(), parseStyleAttributes);
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "region") && (parseRegionAttributes = parseRegionAttributes(xmlPullParser, cellResolution)) != null) {
                map2.put(parseRegionAttributes.f14739id, parseRegionAttributes);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, TtmlNode.TAG_HEAD));
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode parseNode(org.xmlpull.v1.XmlPullParser r23, com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode r24, java.util.Map<java.lang.String, com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlRegion> r25, com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlDecoder.FrameAndTickRate r26) throws com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleDecoderException {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r26
            int r4 = r23.getAttributeCount()
            r5 = 0
            com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlStyle r11 = r0.parseStyleAttributes(r1, r5)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.String r8 = ""
            r12 = r5
            r14 = r6
            r16 = r14
            r18 = r16
            r13 = r8
            r5 = 0
        L20:
            if (r5 >= r4) goto L9c
            java.lang.String r8 = r1.getAttributeName(r5)
            java.lang.String r10 = r1.getAttributeValue(r5)
            r8.getClass()
            int r20 = r8.hashCode()
            r21 = -1
            switch(r20) {
                case -934795532: goto L67;
                case 99841: goto L5b;
                case 100571: goto L4f;
                case 93616297: goto L43;
                case 109780401: goto L37;
                default: goto L36;
            }
        L36:
            goto L72
        L37:
            java.lang.String r9 = "style"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L40
            goto L72
        L40:
            r21 = 4
            goto L72
        L43:
            java.lang.String r9 = "begin"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L4c
            goto L72
        L4c:
            r21 = 3
            goto L72
        L4f:
            java.lang.String r9 = "end"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L58
            goto L72
        L58:
            r21 = 2
            goto L72
        L5b:
            java.lang.String r9 = "dur"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L64
            goto L72
        L64:
            r21 = 1
            goto L72
        L67:
            java.lang.String r9 = "region"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L70
            goto L72
        L70:
            r21 = 0
        L72:
            switch(r21) {
                case 0: goto L90;
                case 1: goto L8b;
                case 2: goto L86;
                case 3: goto L7f;
                case 4: goto L76;
                default: goto L75;
            }
        L75:
            goto L83
        L76:
            java.lang.String[] r8 = r0.parseStyleIds(r10)
            int r9 = r8.length
            if (r9 <= 0) goto L83
            r12 = r8
            goto L83
        L7f:
            long r14 = parseTimeExpression(r10, r3)
        L83:
            r8 = r25
            goto L99
        L86:
            long r16 = parseTimeExpression(r10, r3)
            goto L83
        L8b:
            long r18 = parseTimeExpression(r10, r3)
            goto L83
        L90:
            r8 = r25
            boolean r9 = r8.containsKey(r10)
            if (r9 == 0) goto L99
            r13 = r10
        L99:
            int r5 = r5 + 1
            goto L20
        L9c:
            if (r2 == 0) goto Laf
            long r3 = r2.startTimeUs
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 == 0) goto Laf
            int r5 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r5 == 0) goto La9
            long r14 = r14 + r3
        La9:
            int r5 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r5 == 0) goto Laf
            long r16 = r16 + r3
        Laf:
            int r3 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r3 != 0) goto Lc6
            int r3 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
            if (r3 == 0) goto Lbc
            long r18 = r14 + r18
            r9 = r18
            goto Lc8
        Lbc:
            if (r2 == 0) goto Lc6
            long r2 = r2.endTimeUs
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 == 0) goto Lc6
            r9 = r2
            goto Lc8
        Lc6:
            r9 = r16
        Lc8:
            java.lang.String r6 = r23.getName()
            r7 = r14
            com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode r1 = com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.buildNode(r6, r7, r9, r11, r12, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlDecoder.parseNode(org.xmlpull.v1.XmlPullParser, com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode, java.util.Map, com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlDecoder$FrameAndTickRate):com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode");
    }

    private TtmlRegion parseRegionAttributes(XmlPullParser xmlPullParser, CellResolution cellResolution) {
        float f10;
        String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "id");
        if (attributeValue == null) {
            return null;
        }
        String attributeValue2 = XmlPullParserUtil.getAttributeValue(xmlPullParser, "origin");
        if (attributeValue2 != null) {
            Pattern pattern = PERCENTAGE_COORDINATES;
            Matcher matcher = pattern.matcher(attributeValue2);
            if (matcher.matches()) {
                int i10 = 1;
                try {
                    float parseFloat = Float.parseFloat(matcher.group(1)) / 100.0f;
                    float parseFloat2 = Float.parseFloat(matcher.group(2)) / 100.0f;
                    String attributeValue3 = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
                    if (attributeValue3 != null) {
                        Matcher matcher2 = pattern.matcher(attributeValue3);
                        if (matcher2.matches()) {
                            try {
                                float parseFloat3 = Float.parseFloat(matcher2.group(1)) / 100.0f;
                                float parseFloat4 = Float.parseFloat(matcher2.group(2)) / 100.0f;
                                String attributeValue4 = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                if (attributeValue4 != null) {
                                    String lowerInvariant = Util.toLowerInvariant(attributeValue4);
                                    lowerInvariant.getClass();
                                    if (!lowerInvariant.equals(TtmlNode.CENTER)) {
                                        if (lowerInvariant.equals("after")) {
                                            f10 = parseFloat2 + parseFloat4;
                                            i10 = 2;
                                        }
                                    } else {
                                        f10 = (parseFloat4 / 2.0f) + parseFloat2;
                                    }
                                    return new TtmlRegion(attributeValue, parseFloat, f10, 0, i10, parseFloat3, 1, 1.0f / cellResolution.rows);
                                }
                                i10 = 0;
                                f10 = parseFloat2;
                                return new TtmlRegion(attributeValue, parseFloat, f10, 0, i10, parseFloat3, 1, 1.0f / cellResolution.rows);
                            } catch (NumberFormatException unused) {
                                Log.w(TAG, "Ignoring region with malformed extent: ".concat(attributeValue2));
                                return null;
                            }
                        }
                        Log.w(TAG, "Ignoring region with unsupported extent: ".concat(attributeValue2));
                        return null;
                    }
                    Log.w(TAG, "Ignoring region without an extent");
                    return null;
                } catch (NumberFormatException unused2) {
                    Log.w(TAG, "Ignoring region with malformed origin: ".concat(attributeValue2));
                    return null;
                }
            }
            Log.w(TAG, "Ignoring region with unsupported origin: ".concat(attributeValue2));
            return null;
        }
        Log.w(TAG, "Ignoring region without an origin");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0125, code lost:
    
        if (r3.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LINETHROUGH) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018b, code lost:
    
        if (r3.equals("start") == false) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlStyle parseStyleAttributes(org.xmlpull.v1.XmlPullParser r12, com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlStyle r13) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlDecoder.parseStyleAttributes(org.xmlpull.v1.XmlPullParser, com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlStyle):com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlStyle");
    }

    private String[] parseStyleIds(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        return Util.split(trim, "\\s+");
    }

    private static long parseTimeExpression(String str, FrameAndTickRate frameAndTickRate) throws SubtitleDecoderException {
        double d10;
        double d11;
        double d12;
        double d13;
        Matcher matcher = CLOCK_TIME.matcher(str);
        if (matcher.matches()) {
            double parseLong = (Long.parseLong(matcher.group(1)) * 3600) + (Long.parseLong(matcher.group(2)) * 60) + Long.parseLong(matcher.group(3));
            String group = matcher.group(4);
            double d14 = 0.0d;
            if (group != null) {
                d12 = Double.parseDouble(group);
            } else {
                d12 = 0.0d;
            }
            double d15 = parseLong + d12;
            String group2 = matcher.group(5);
            if (group2 != null) {
                d13 = ((float) Long.parseLong(group2)) / frameAndTickRate.effectiveFrameRate;
            } else {
                d13 = 0.0d;
            }
            double d16 = d15 + d13;
            if (matcher.group(6) != null) {
                d14 = (Long.parseLong(r13) / frameAndTickRate.subFrameRate) / frameAndTickRate.effectiveFrameRate;
            }
            return (long) ((d16 + d14) * 1000000.0d);
        }
        Matcher matcher2 = OFFSET_TIME.matcher(str);
        if (matcher2.matches()) {
            double parseDouble = Double.parseDouble(matcher2.group(1));
            String group3 = matcher2.group(2);
            group3.getClass();
            group3.hashCode();
            char c10 = 65535;
            switch (group3.hashCode()) {
                case 102:
                    if (group3.equals("f")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 104:
                    if (group3.equals("h")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 109:
                    if (group3.equals("m")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 116:
                    if (group3.equals("t")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 3494:
                    if (group3.equals("ms")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    d10 = frameAndTickRate.effectiveFrameRate;
                    parseDouble /= d10;
                    break;
                case 1:
                    d11 = 3600.0d;
                    break;
                case 2:
                    d11 = 60.0d;
                    break;
                case 3:
                    d10 = frameAndTickRate.tickRate;
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
        throw new SubtitleDecoderException(e.e("Malformed time expression: ", str));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.SimpleSubtitleDecoder
    public final TtmlSubtitle decode(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        try {
            XmlPullParser newPullParser = this.xmlParserFactory.newPullParser();
            Map<String, TtmlStyle> hashMap = new HashMap<>();
            HashMap hashMap2 = new HashMap();
            TtmlSubtitle ttmlSubtitle = null;
            hashMap2.put("", new TtmlRegion(null));
            int i11 = 0;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            FrameAndTickRate frameAndTickRate = DEFAULT_FRAME_AND_TICK_RATE;
            CellResolution cellResolution = DEFAULT_CELL_RESOLUTION;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                TtmlNode ttmlNode = (TtmlNode) arrayDeque.peek();
                if (i11 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if (TtmlNode.TAG_TT.equals(name)) {
                            frameAndTickRate = parseFrameAndTickRates(newPullParser);
                            cellResolution = parseCellResolution(newPullParser, DEFAULT_CELL_RESOLUTION);
                        }
                        if (!isSupportedTag(name)) {
                            Log.i(TAG, "Ignoring unsupported tag: " + newPullParser.getName());
                        } else if (TtmlNode.TAG_HEAD.equals(name)) {
                            parseHeader(newPullParser, hashMap, hashMap2, cellResolution);
                        } else {
                            try {
                                TtmlNode parseNode = parseNode(newPullParser, ttmlNode, hashMap2, frameAndTickRate);
                                arrayDeque.push(parseNode);
                                if (ttmlNode != null) {
                                    ttmlNode.addChild(parseNode);
                                }
                            } catch (SubtitleDecoderException e2) {
                                Log.w(TAG, "Suppressing parser error", e2);
                            }
                        }
                        i11++;
                    } else if (eventType == 4) {
                        ttmlNode.addChild(TtmlNode.buildTextNode(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals(TtmlNode.TAG_TT)) {
                            ttmlSubtitle = new TtmlSubtitle((TtmlNode) arrayDeque.peek(), hashMap, hashMap2);
                        }
                        arrayDeque.pop();
                    }
                } else {
                    if (eventType != 2) {
                        if (eventType == 3) {
                            i11--;
                        }
                    }
                    i11++;
                }
                newPullParser.next();
            }
            return ttmlSubtitle;
        } catch (IOException e10) {
            throw new IllegalStateException("Unexpected error when reading input.", e10);
        } catch (XmlPullParserException e11) {
            throw new SubtitleDecoderException("Unable to decode source", e11);
        }
    }
}
