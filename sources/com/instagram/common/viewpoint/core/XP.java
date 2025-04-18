package com.instagram.common.viewpoint.core;

import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.text.ttml.TtmlRegion;
import com.google.common.primitives.UnsignedBytes;
import com.google.zxing.aztec.encoder.Encoder;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import okio.Utf8;
import org.objectweb.asm.Opcodes;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: assets/audience_network.dex */
public class XP implements InterfaceC0542Fv {
    public static byte[] A00;
    public static String[] A01 = {"q1g32zvoAQJitbnj3kQF8wmNW7veOCWn", "KsaAC8YjoMGJChouvV8VId7KrUuqOJCk", "o6f3mRIKrW8efzr6XwfXPwRcZoghN3oD", "REIwhco5kB4G3k30FaVNZH5vs6sRKT21", "qQ8hwRe1NnEjdiH7DukqvWEYyVCX6RS7", "NOEtA1tjy6NxfLNTeEpIfmePtNQlRpNw", "432pej62syR5Z0UxeGKhT0qGaSDmzBGz", "Pr1x84V6QjFlC6ENVmoBp9zzcVDIgNGT"};

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 63);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{57, 12, 12, 29, 21, 8, 12, 29, 28, 88, 12, 23, 88, 27, 10, 29, 25, 12, 29, 88, 28, 29, 27, 23, 28, 29, 10, 88, 30, 23, 10, 88, 13, 22, 11, 13, 8, 8, 23, 10, 12, 29, 28, 88, 30, 23, 10, 21, 25, 12, 1, 16, 16, 12, 9, 3, 1, 20, 9, 15, 14, 79, 3, 5, 1, 77, 86, 80, 88, 118, 103, 103, 123, 126, 116, 118, 99, 126, 120, 121, 56, 116, 114, 118, 58, 32, 39, 47, 120, 105, 105, 117, 112, 122, 120, 109, 112, 118, 119, 54, 125, 111, 123, 106, 108, 123, 106, 49, 32, 32, 60, 57, 51, 49, 36, 57, Utf8.REPLACEMENT_BYTE, 62, Byte.MAX_VALUE, 32, 55, 35, 13, 28, 28, 0, 5, 15, 13, 24, 5, 3, 2, 67, 24, 24, 1, 0, 71, 20, 1, 0, 100, 117, 117, 105, 108, 102, 100, 113, 108, 106, 107, 42, 125, 40, 104, 117, 49, 40, 102, 96, 100, 40, 51, 53, 61, 20, 5, 5, 25, 28, 22, 20, 1, 28, 26, 27, 90, 13, 88, 24, 5, 65, 88, 3, 1, 1, 1, 16, 16, 12, 9, 3, 1, 20, 9, 15, 14, 79, 24, 77, 17, 21, 9, 3, 11, 20, 9, 13, 5, 77, 20, 24, 83, 7, 126, 111, 111, 115, 118, 124, 126, 107, 118, 112, 113, 48, 103, 50, 108, 106, 125, 109, 118, 111, 77, 92, 65, 77, 22, 79, 77, 77, 17, 0, 29, 17, 74, 29, 72, 22, 22, 4};
    }

    static {
        A01();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0542Fv
    public final XQ A4v(Format format) {
        char c2;
        String str = format.A0O;
        switch (str.hashCode()) {
            case -1351681404:
                if (str.equals(A00(88, 19, 38))) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -1248334819:
                if (str.equals(A00(107, 15, 111))) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case -1026075066:
                if (str.equals(A00(Opcodes.GOTO, 21, 74))) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1004728940:
                if (str.equals(A00(236, 8, 6))) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 691401887:
                if (str.equals(A00(Opcodes.NEWARRAY, 28, 95))) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 822864842:
                if (str.equals(A00(244, 10, 90))) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 930165504:
                if (str.equals(A00(Opcodes.D2I, 25, 58))) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 1566015601:
                if (str.equals(A00(50, 19, 95))) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 1566016562:
                if (str.equals(A00(69, 19, 40))) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 1668750253:
                if (str.equals(A00(216, 20, 32))) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1693976202:
                if (str.equals(A00(122, 20, 83))) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return new DP() { // from class: com.facebook.ads.redexgen.X.44
                    public static byte[] A05;
                    public static String[] A06 = {"5F5cxYdx0LKPil0ajw3GbpYLT7etgF31", "fOxzE9ZV4JlsRGjdoo7dV8KulyNBfr9E", "eEUtzxx4vW", "aDPglCd54FV7XTVXwPGrLoRK5PMilD0L", "T8", "NkWz0HAqjAnp44zCa91cwSe9MeY1HrSH", "IMzm5Ejj5mH4jimf0JzHbRqQJ285LAhr", "T9e7N5pQDbPcuWmbFwNGAPupqQB687yI"};
                    public final GN A00;
                    public final GT A01;
                    public final GW A02;
                    public final I4 A03;
                    public final List<GR> A04;

                    public static String A02(int i2, int i3, int i4) {
                        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
                        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
                            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 93);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A03() {
                        A05 = new byte[]{-51, -84, -1, 0, 5, -8, -15, -84, -18, -8, -5, -17, -9, -84, 3, -19, -1, -84, -14, -5, 1, -6, -16, -84, -19, -14, 0, -15, -2, -84, 0, -12, -15, -84, -14, -11, -2, -1, 0, -84, -17, 1, -15, -70, -84, -83, -78, -93, -15, -14, -9, -22, -29, -66, -52, -55, -35, -37, -37, -85, -52, -54, -42, -53, -52, -39};
                    }

                    static {
                        A03();
                    }

                    {
                        A02(53, 13, 10);
                        this.A02 = new GW();
                        this.A03 = new I4();
                        this.A01 = new GT();
                        this.A00 = new GN();
                        this.A04 = new ArrayList();
                    }

                    public static int A00(I4 i4) {
                        int currentInputPosition = -1;
                        int i2 = 0;
                        while (currentInputPosition == -1) {
                            i2 = i4.A06();
                            String A0P = i4.A0P();
                            if (A0P == null) {
                                currentInputPosition = 0;
                            } else if (A02(48, 5, 65).equals(A0P)) {
                                currentInputPosition = 2;
                            } else if (A02(44, 4, 1).startsWith(A0P)) {
                                currentInputPosition = 1;
                            } else {
                                currentInputPosition = 3;
                            }
                        }
                        i4.A0Y(i2);
                        return currentInputPosition;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.instagram.common.viewpoint.core.DP
                    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
                    public final XE A0b(byte[] bArr, int i2, boolean z2) throws C0541Fu {
                        this.A03.A0b(bArr, i2);
                        this.A01.A0E();
                        this.A04.clear();
                        GX.A04(this.A03);
                        do {
                        } while (!TextUtils.isEmpty(this.A03.A0P()));
                        ArrayList arrayList = new ArrayList();
                        while (true) {
                            int A002 = A00(this.A03);
                            if (A002 != 0) {
                                if (A002 == 1) {
                                    A04(this.A03);
                                } else if (A002 == 2) {
                                    if (arrayList.isEmpty()) {
                                        this.A03.A0P();
                                        GR styleBlock = this.A00.A0E(this.A03);
                                        if (styleBlock != null) {
                                            this.A04.add(styleBlock);
                                        }
                                    } else {
                                        throw new C0541Fu(A02(0, 44, 47));
                                    }
                                } else if (A002 == 3 && this.A02.A0G(this.A03, this.A01, this.A04)) {
                                    arrayList.add(this.A01.A0D());
                                    this.A01.A0E();
                                }
                            } else {
                                return new XE(arrayList);
                            }
                        }
                    }

                    public static void A04(I4 i4) {
                        boolean isEmpty;
                        do {
                            isEmpty = TextUtils.isEmpty(i4.A0P());
                            if (A06[0].charAt(19) != 'G') {
                                throw new RuntimeException();
                            }
                            A06[6] = "CZqzLdLpoWwYlPjJuNUsakBQS84mnH0T";
                        } while (!isEmpty);
                    }
                };
            case 1:
                return new C02724g(format.A0P);
            case 2:
                return new DP() { // from class: com.facebook.ads.redexgen.X.45
                    public static byte[] A02;
                    public static String[] A03 = {"jrvdoaDBM3cqePrWf", "m40r4JyL3iKqeGLO2h6Tk", "RcvraOg6mbbP34aEVmi7jYPv5OcRlKTM", "myTPvQ3QT6z6", "YpxDkO8RECuwBTRpYFK7ysMlySnmjB", "CwlHvyUXkKbItp91Wk", "ZsF2mL", "xPpZ8RCHbSet6uyWCTIV2"};
                    public static final int A04;
                    public static final int A05;
                    public static final int A06;
                    public final GT A00;
                    public final I4 A01;

                    public static String A02(int i2, int i3, int i4) {
                        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
                        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
                            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 9);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A03() {
                        A02 = new byte[]{124, -95, -106, -94, -96, -93, -97, -104, -89, -104, 83, UnsignedBytes.MAX_POWER_OF_TWO, -93, 103, -118, -104, -107, -87, -89, -89, 83, -121, -94, -93, 83, Byte.MAX_VALUE, -104, -87, -104, -97, 83, -107, -94, -85, 83, -101, -104, -108, -105, -104, -91, 83, -103, -94, -88, -95, -105, 97, 83, 120, 109, 121, 119, 122, 118, 111, 126, 111, 42, UnsignedBytes.MAX_POWER_OF_TWO, 126, 126, 42, 109, Byte.MAX_VALUE, 111, 42, 108, 121, -126, 42, 114, 111, 107, 110, 111, 124, 42, 112, 121, Byte.MAX_VALUE, 120, 110, 56, -61, -26, -86, -51, -37, -40, -20, -22, -22, -70, -37, -39, -27, -38, -37, -24, -80, -95, -71, -84, -55, -54, -54, -67, -109, -111, -111, UnsignedBytes.MAX_POWER_OF_TWO};
                    }

                    static {
                        A03();
                        A04 = IK.A08(A02(100, 4, 55));
                        A05 = IK.A08(A02(104, 4, 77));
                        A06 = IK.A08(A02(108, 4, 20));
                    }

                    {
                        A02(84, 16, 109);
                        this.A01 = new I4();
                        this.A00 = new GT();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.instagram.common.viewpoint.core.DP
                    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
                    public final XG A0b(byte[] bArr, int i2, boolean z2) throws C0541Fu {
                        this.A01.A0b(bArr, i2);
                        ArrayList arrayList = new ArrayList();
                        while (true) {
                            int A042 = this.A01.A04();
                            String[] strArr = A03;
                            if (strArr[6].length() == strArr[5].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A03;
                            strArr2[3] = "2AOvC9NWdqZd";
                            strArr2[0] = "YZRt9rHsEfBtjbBQ4";
                            if (A042 > 0) {
                                if (this.A01.A04() >= 8) {
                                    int A08 = this.A01.A08();
                                    int boxSize = this.A01.A08();
                                    if (boxSize == A06) {
                                        arrayList.add(A01(this.A01, this.A00, A08 - 8));
                                    } else {
                                        this.A01.A0Z(A08 - 8);
                                    }
                                } else {
                                    throw new C0541Fu(A02(0, 48, 42));
                                }
                            } else {
                                return new XG(arrayList);
                            }
                        }
                    }

                    public static XF A01(I4 i4, GT gt, int i2) throws C0541Fu {
                        gt.A0E();
                        while (i2 > 0) {
                            if (i2 >= 8) {
                                int boxSize = i4.A08();
                                int A08 = i4.A08();
                                int payloadLength = boxSize - 8;
                                byte[] bArr = i4.A00;
                                int boxSize2 = i4.A06();
                                String A0R = IK.A0R(bArr, boxSize2, payloadLength);
                                i4.A0Z(payloadLength);
                                i2 = (i2 - 8) - payloadLength;
                                int boxSize3 = A05;
                                if (A08 == boxSize3) {
                                    GW.A08(A0R, gt);
                                } else {
                                    int boxSize4 = A04;
                                    if (A08 == boxSize4) {
                                        GW.A0C(null, A0R.trim(), gt, Collections.emptyList());
                                    }
                                }
                            } else {
                                throw new C0541Fu(A02(48, 36, 1));
                            }
                        }
                        return gt.A0D();
                    }
                };
            case 3:
                return new DP() { // from class: com.facebook.ads.redexgen.X.47
                    public static byte[] A01;
                    public static String[] A02 = {"Q7JJv3z7PkgXqFR6EtNnsFWUhkJfDLEs", "gmWMr9Qk53qaXSdnVHvemR", "OW99De4FTdA6Oa6qk4bO3w", "WoL", "rm8iY0Glnb70LQ8B0", "dizBvxRUVycGfpYpaNZ336Cn8ei27tcP", "ilEcyhsvi9H23eDmjQBvPkD3CdelIFai", "Rua8GDCisFLxJnBCYVdBnrEUaSrihtBi"};
                    public static final GE A03;
                    public static final GF A04;
                    public static final Pattern A05;
                    public static final Pattern A06;
                    public static final Pattern A07;
                    public static final Pattern A08;
                    public static final Pattern A09;
                    public final XmlPullParserFactory A00;

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code restructure failed: missing block: B:45:0x012a, code lost:
                    
                        if (r3.equals(A08(1374, 1, 62)) != false) goto L22;
                     */
                    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x008e. Please report as an issue. */
                    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0092. Please report as an issue. */
                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 12
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
                    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                     */
                    /* JADX WARN: Removed duplicated region for block: B:23:0x0095 A[PHI: r6
                      0x0095: PHI (r6v7 double) = (r6v0 double), (r6v1 double), (r6v2 double), (r6v3 double), (r6v4 double), (r6v5 double), (r6v6 double) binds: [B:22:0x0092, B:36:0x00e3, B:35:0x00df, B:34:0x00d8, B:33:0x00cf, B:32:0x00cd, B:27:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
                    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
                    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
                    /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
                    /* JADX WARN: Removed duplicated region for block: B:36:0x00e3  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public static long A00(java.lang.String r10, com.instagram.common.viewpoint.core.GF r11) throws com.instagram.common.viewpoint.core.C0541Fu {
                        /*
                            Method dump skipped, instructions count: 480
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.AnonymousClass47.A00(java.lang.String, com.facebook.ads.redexgen.X.GF):long");
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 23
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
                    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                     */
                    private GG A03(XmlPullParser xmlPullParser, GG gg, Map<String, GH> map, GF gf) throws C0541Fu {
                        char c3;
                        AnonymousClass47 anonymousClass47 = this;
                        long j2 = -9223372036854775807L;
                        long j3 = -9223372036854775807L;
                        long j4 = -9223372036854775807L;
                        String A082 = A08(0, 0, 90);
                        String[] strArr = null;
                        int attributeCount = xmlPullParser.getAttributeCount();
                        GM A062 = anonymousClass47.A06(xmlPullParser, null);
                        int i2 = 0;
                        while (i2 < attributeCount) {
                            String attributeName = xmlPullParser.getAttributeName(i2);
                            String[] strArr2 = A02;
                            if (strArr2[1].length() == strArr2[2].length()) {
                                A02[4] = "YixuFoEwtSnXH8w7l";
                                String attributeValue = xmlPullParser.getAttributeValue(i2);
                                switch (attributeName.hashCode()) {
                                    case -934795532:
                                        if (attributeName.equals(A08(1291, 6, 32))) {
                                            c3 = 4;
                                            break;
                                        }
                                        break;
                                    case 99841:
                                        if (attributeName.equals(A08(1058, 3, 21))) {
                                            c3 = 2;
                                            break;
                                        }
                                        break;
                                    case 100571:
                                        if (attributeName.equals(A08(1063, 3, 72))) {
                                            c3 = 1;
                                            break;
                                        }
                                        break;
                                    case 93616297:
                                        if (attributeName.equals(A08(1003, 5, 98))) {
                                            c3 = 0;
                                            break;
                                        }
                                        break;
                                    case 109780401:
                                        if (attributeName.equals(A08(1350, 5, 103))) {
                                            c3 = 3;
                                            break;
                                        }
                                        break;
                                }
                                c3 = 65535;
                                switch (c3) {
                                    case 0:
                                        j3 = A00(attributeValue, gf);
                                        if (A02[3].length() == 29) {
                                            throw new RuntimeException();
                                        }
                                        A02[4] = "dQoDQglF0B7EvNpDs";
                                        break;
                                    case 1:
                                        j4 = A00(attributeValue, gf);
                                        if (A02[0].charAt(22) == 'S') {
                                            break;
                                        } else {
                                            A02[4] = "ntIDxfuQXDdGI2t9y";
                                            break;
                                        }
                                    case 2:
                                        j2 = A00(attributeValue, gf);
                                        break;
                                    case 3:
                                        String[] A0D = anonymousClass47.A0D(attributeValue);
                                        if (A0D.length <= 0) {
                                            break;
                                        } else {
                                            strArr = A0D;
                                            break;
                                        }
                                    case 4:
                                        boolean containsKey = map.containsKey(attributeValue);
                                        String[] strArr3 = A02;
                                        if (strArr3[6].charAt(31) != strArr3[7].charAt(31)) {
                                            A02[0] = "5h0BzYvwjwJJ0RRHlMSIfGfJueQmiYKk";
                                            if (!containsKey) {
                                                break;
                                            }
                                            A082 = attributeValue;
                                            break;
                                        } else {
                                            A02[3] = "L0ZtifNqpxSGUOW";
                                            if (!containsKey) {
                                                break;
                                            }
                                            A082 = attributeValue;
                                        }
                                }
                                i2++;
                                anonymousClass47 = this;
                            }
                            throw new RuntimeException();
                        }
                        if (gg != null && gg.A02 != -9223372036854775807L) {
                            if (j3 != -9223372036854775807L) {
                                j3 += gg.A02;
                            }
                            if (j4 != -9223372036854775807L) {
                                j4 += gg.A02;
                            }
                        }
                        if (j4 == -9223372036854775807L) {
                            if (j2 != -9223372036854775807L) {
                                j4 = j3 + j2;
                            } else if (gg != null) {
                                long j5 = gg.A01;
                                if (A02[5].charAt(13) != 'p') {
                                    throw new RuntimeException();
                                }
                                A02[0] = "hz7aEmxbm3wpG3zoF0cWffVXztLcHnN4";
                                if (j5 != -9223372036854775807L) {
                                    j4 = gg.A01;
                                }
                            }
                        }
                        return GG.A05(xmlPullParser.getName(), j3, j4, A062, strArr, A082);
                    }

                    public static String A08(int i2, int i3, int i4) {
                        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
                        int i5 = 0;
                        while (true) {
                            int length = copyOfRange.length;
                            if (A02[3].length() == 29) {
                                throw new RuntimeException();
                            }
                            A02[5] = "lfPYUvG2csO3ophSdE9ghMM7c7M5WNIy";
                            if (i5 >= length) {
                                return new String(copyOfRange);
                            }
                            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 70);
                            i5++;
                        }
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
                    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                     */
                    private Map<String, GM> A09(XmlPullParser xmlPullParser, Map<String, GM> map, Map<String, GH> map2, GE ge) throws IOException, XmlPullParserException {
                        GH A042;
                        do {
                            xmlPullParser.next();
                            String A082 = A08(1350, 5, 103);
                            if (IL.A04(xmlPullParser, A082)) {
                                String A002 = IL.A00(xmlPullParser, A082);
                                GM A062 = A06(xmlPullParser, new GM());
                                if (A002 != null) {
                                    String[] A0D = A0D(A002);
                                    for (String str2 : A0D) {
                                        A062.A0E(map.get(str2));
                                    }
                                }
                                String A0M = A062.A0M();
                                if (A02[4].length() != 17) {
                                    throw new RuntimeException();
                                }
                                A02[5] = "7fn6ufwdKmfvopYXTYWOtezKPVwS6HMn";
                                if (A0M != null) {
                                    map.put(A062.A0M(), A062);
                                }
                            } else if (IL.A04(xmlPullParser, A08(1291, 6, 32)) && (A042 = A04(xmlPullParser, ge)) != null) {
                                map2.put(A042.A07, A042);
                            }
                        } while (!IL.A03(xmlPullParser, A08(1179, 4, 5)));
                        return map;
                    }

                    public static void A0A() {
                        A01 = new byte[]{13, 60, 13, 4, 70, 33, 13, 23, 14, 6, 12, 69, 22, 66, 1, 16, 7, 3, 22, 7, 66, 58, 15, 14, 50, 23, 14, 14, 50, 3, 16, 17, 7, 16, 36, 3, 1, 22, 13, 16, 27, 66, 11, 12, 17, 22, 3, 12, 1, 7, 83, 116, 124, 121, 112, 113, 53, 101, 116, 103, 102, 124, 123, 114, 53, 119, 116, 118, 126, 114, 103, 122, 96, 123, 113, 53, 99, 116, 121, 96, 112, 47, 53, 28, 59, 51, 54, Utf8.REPLACEMENT_BYTE, 62, 122, 42, 59, 40, 41, 51, 52, 61, 122, 57, 53, 54, 53, 40, 122, 44, 59, 54, 47, Utf8.REPLACEMENT_BYTE, 96, 122, 96, 71, 79, 74, 67, 66, 6, 86, 71, 84, 85, 79, 72, 65, 6, 64, 73, 72, 82, 117, 79, 92, 67, 6, 80, 71, 74, 83, 67, 28, 6, 94, 112, 121, 120, 101, 126, 121, 112, 55, 122, 118, 123, 113, 120, 101, 122, 114, 115, 55, 116, 114, 123, 123, 55, 101, 114, 100, 120, 123, 98, 99, 126, 120, 121, 45, 55, 64, 110, 103, 102, 123, 96, 103, 110, 41, 123, 108, 110, 96, 102, 103, 41, 126, 96, 125, 97, 41, 100, 104, 101, 111, 102, 123, 100, 108, 109, 41, 108, 113, 125, 108, 103, 125, 51, 41, Utf8.REPLACEMENT_BYTE, 17, 24, 25, 4, 31, 24, 17, 86, 4, 19, 17, 31, 25, 24, 86, 1, 31, 2, 30, 86, 27, 23, 26, 16, 25, 4, 27, 19, 18, 86, 25, 4, 31, 17, 31, 24, 76, 86, Utf8.REPLACEMENT_BYTE, 17, 24, 25, 4, 31, 24, 17, 86, 4, 19, 17, 31, 25, 24, 86, 1, 31, 2, 30, 86, 3, 24, 5, 3, 6, 6, 25, 4, 2, 19, 18, 86, 19, 14, 2, 19, 24, 2, 76, 86, 25, 55, 62, Utf8.REPLACEMENT_BYTE, 34, 57, 62, 55, 112, 34, 53, 55, 57, Utf8.REPLACEMENT_BYTE, 62, 112, 39, 57, 36, 56, 112, 37, 62, 35, 37, 32, 32, Utf8.REPLACEMENT_BYTE, 34, 36, 53, 52, 112, Utf8.REPLACEMENT_BYTE, 34, 57, 55, 57, 62, 106, 112, 84, 122, 115, 114, 111, 116, 115, 122, 61, 111, 120, 122, 116, 114, 115, 61, 106, 116, 105, 117, 114, 104, 105, 61, 124, 115, 61, 120, 101, 105, 120, 115, 105, 37, 11, 2, 3, 30, 5, 2, 11, 76, 30, 9, 11, 5, 3, 2, 76, 27, 5, 24, 4, 3, 25, 24, 76, 13, 2, 76, 3, 30, 5, 11, 5, 2, 112, 94, 87, 86, 75, 80, 87, 94, 25, 76, 87, 74, 76, 73, 73, 86, 75, 77, 92, 93, 25, 77, 88, 94, 3, 25, 99, 68, 92, 75, 70, 67, 78, 10, 73, 79, 70, 70, 10, 88, 79, 89, 69, 70, 95, 94, 67, 69, 68, 10, 123, 92, 68, 83, 94, 91, 86, 18, 87, 74, 66, 64, 87, 65, 65, 91, 93, 92, 18, 84, 93, 64, 18, 84, 93, 92, 70, 97, 91, 72, 87, 8, 18, 21, 32, 7, 31, 8, 5, 0, 13, 73, 7, 28, 4, 11, 12, 27, 73, 6, 15, 73, 12, 7, 29, 27, 0, 12, 26, 73, 15, 6, 27, 73, 15, 6, 7, 29, 58, 0, 19, 12, 83, 73, 25, 62, 38, 49, 60, 57, 52, 112, 37, 62, 57, 36, 112, 54, Utf8.REPLACEMENT_BYTE, 34, 112, 54, Utf8.REPLACEMENT_BYTE, 62, 36, 3, 57, 42, 53, 106, 112, 119, 23, 59, 54, 60, 53, 40, 55, Utf8.REPLACEMENT_BYTE, 62, 122, 46, 51, 55, Utf8.REPLACEMENT_BYTE, 122, Utf8.REPLACEMENT_BYTE, 34, 42, 40, Utf8.REPLACEMENT_BYTE, 41, 41, 51, 53, 52, 96, 122, 73, 113, 104, 112, 109, 116, 104, 97, 36, 114, 101, 104, 113, 97, 119, 36, 109, 106, 36, 98, 107, 106, 112, 87, 109, 126, 97, 36, 101, 112, 112, 118, 109, 102, 113, 112, 97, 42, 36, 84, 109, 103, 111, 109, 106, 99, 36, 112, 108, 97, 36, 119, 97, 103, 107, 106, 96, 36, 114, 101, 104, 113, 97, 36, 98, 107, 118, 36, 114, 97, 118, 112, 109, 103, 101, 104, 36, 98, 107, 106, 112, 36, 119, 109, 126, 97, 36, 101, 106, 96, 36, 109, 99, 106, 107, 118, 109, 106, 99, 36, 112, 108, 97, 36, 98, 109, 118, 119, 112, 42, 40, 14, 11, 11, 9, 30, 8, 8, 18, 21, 28, 91, 11, 26, 9, 8, 30, 9, 91, 30, 9, 9, 20, 9, 99, 67, 90, 91, 115, 82, 84, 88, 83, 82, 69, 117, 78, 65, 66, 76, 69, 0, 84, 79, 0, 68, 69, 67, 79, 68, 69, 0, 83, 79, 85, 82, 67, 69, 14, 53, 62, 35, 43, 62, 56, 47, 62, Utf8.REPLACEMENT_BYTE, 123, 62, 41, 41, 52, 41, 123, 44, 51, 62, 53, 123, 41, 62, 58, Utf8.REPLACEMENT_BYTE, 50, 53, 60, 123, 50, 53, 43, 46, 47, 117, 68, 107, 51, 21, 99, 99, 16, 123, 102, 114, 22, 97, 101, 98, 116, 16, 123, 102, 114, 22, 96, 98, 99, 59, 51, 55, 46, 38, 55, 110, 98, 111, 107, 29, 110, 5, 24, 12, 104, 30, 29, 10, 15, 105, 27, 110, 5, 24, 12, 104, 30, 28, 10, 28, 29, 93, 73, 88, 73, 70, 73, 88, 70, 73, 83, 73, 65, 28, 17, 45, 91, 40, 67, 94, 74, 46, 40, 67, 94, 74, 46, 88, 90, 73, 91, 40, 67, 94, 74, 46, 40, 67, 94, 74, 46, 90, 73, 91, 40, 67, 94, 74, 46, 40, 67, 94, 74, 46, 90, 91, 76, 73, 91, 47, 93, 40, 67, 94, 74, 46, 88, 90, 15, 73, 91, 40, 67, 94, 74, 46, 40, 67, 94, 74, 46, 90, 91, 76, 73, 47, 93, 91, 40, 67, 94, 74, 46, 88, 90, 90, 76, 90, 76, 87, 39, 81, 37, 29, 82, 80, 89, 81, 37, 29, 82, 80, 93, 40, 94, 42, 18, 93, 42, 88, 73, 42, 18, 92, 73, 95, 83, 86, 94, 42, 18, 93, 42, 88, 73, 42, 18, 92, 73, 95, 83, 82, 111, 104, 122, 107, 124, 72, 75, 73, 65, 77, 88, 69, 95, 68, 78, 105, 69, 
                        70, 69, 88, 70, 65, 67, 77, 74, 26, 23, 28, 1, 36, 41, 42, 34, 116, 100, 10, 12, 5, 5, 59, 12, 26, 6, 5, 28, 29, 0, 6, 7, 84, 82, 89, 67, 82, 69, 0, 12, 15, 12, 17, 37, 40, 50, 49, 45, 32, 56, 0, 45, 40, 38, 47, 98, 111, 112, 55, 38, 33, 121, 113, 107, 96, 106, 40, 53, 57, 40, 35, 57, 96, 74, 67, 66, 88, 106, 77, 65, 69, 64, 85, 80, 89, 88, 66, 101, 95, 76, 83, 0, 9, 8, 18, 53, 18, 31, 10, 3, 118, Byte.MAX_VALUE, 126, 100, 71, 117, 121, 119, 120, 100, 21, 1, 18, 30, 22, 33, 18, 7, 22, 105, 125, 110, 98, 106, 93, 110, 123, 106, 66, 122, 99, 123, 102, Byte.MAX_VALUE, 99, 102, 106, 125, 58, 46, 61, 49, 57, 14, 61, 40, 57, 17, 41, 48, 40, 53, 44, 48, 53, 57, 46, 124, 56, 51, 57, 47, 50, 123, 40, 124, 52, 61, 42, 57, 124, 110, 124, 44, 61, 46, 40, 47, 64, 43, 38, 34, 39, 45, 49, 49, 53, Byte.MAX_VALUE, 106, 106, 50, 50, 50, 107, 50, 118, 107, 42, 55, 34, 106, 43, 54, 106, 49, 49, 40, 41, 102, 53, 36, 55, 36, 40, 32, 49, 32, 55, 91, 86, 75, 86, 67, 78, 75, 65, 11, 6, 30, 8, 18, 19, 118, Byte.MAX_VALUE, 124, 110, 13, 8, 15, 4, 21, 9, 19, 14, 20, 6, 9, 26, 52, 60, 45, 56, 61, 56, 45, 56, 122, 100, 17, 16, 19, 22, 17, 26, 11, 23, 13, 16, 10, 24, 23, 64, 65, 91, 64, 74, 75, 92, 66, 71, 64, 75, 25, 4, 31, 17, 31, 24, 45, 110, 102, 20, 3, 1, 15, 9, 8, 125, 102, 104, 103, 123, 124, 56, 38, 59, Utf8.REPLACEMENT_BYTE, 46, 113, 47, 42, Utf8.REPLACEMENT_BYTE, 42, 29, 3, 30, 26, 11, 84, 7, 3, 15, 9, 11, 49, 47, 50, 54, 39, 120, 43, 44, 36, 45, 48, 47, 35, 54, 43, 45, 44, 58, 57, 40, 39, 40, 47, 58, 41, 47, 82, 85, 88, 77, 68, Byte.MAX_VALUE, 120, 117, 96, 101, 98, 107, 51, 53, 34, 6, 50, 33, 45, 37, 18, 33, 52, 37, 12, 106, 123, 102, 106, 95, 114, 119, 121, 112, 22, 7, 26, 22, 38, 7, 1, 13, 16, 3, 22, 11, 13, 12, 52, 41, 35, 43, 18, 33, 52, 37, 70, 70, 76, 87, 93, 92, 75, 85, 80, 87, 92};
                        String[] strArr = A02;
                        if (strArr[6].charAt(31) != strArr[7].charAt(31)) {
                            throw new RuntimeException();
                        }
                        A02[3] = "o1LT8QyoUiXDPP";
                    }

                    static {
                        A0A();
                        A06 = Pattern.compile(A08(856, 85, 53));
                        A08 = Pattern.compile(A08(819, 37, Opcodes.DREM));
                        A07 = Pattern.compile(A08(790, 29, 13));
                        A09 = Pattern.compile(A08(954, 29, 48));
                        A05 = Pattern.compile(A08(941, 13, 63));
                        A04 = new GF(30.0f, 1, 1);
                        A03 = new GE(32, 15);
                    }

                    {
                        A08(717, 11, Opcodes.LREM);
                        try {
                            this.A00 = XmlPullParserFactory.newInstance();
                            this.A00.setNamespaceAware(true);
                        } catch (XmlPullParserException e) {
                            throw new RuntimeException(A08(5, 45, 36), e);
                        }
                    }

                    private GE A01(XmlPullParser xmlPullParser, GE ge) throws C0541Fu {
                        String attributeValue = xmlPullParser.getAttributeValue(A08(1183, 35, 3), A08(1018, 14, 47));
                        if (attributeValue == null) {
                            return ge;
                        }
                        Matcher matcher = A05.matcher(attributeValue);
                        boolean matches = matcher.matches();
                        String A082 = A08(Opcodes.D2I, 36, 81);
                        String A083 = A08(717, 11, Opcodes.LREM);
                        if (!matches) {
                            String cellResolution = A082 + attributeValue;
                            Log.w(A083, cellResolution);
                            return ge;
                        }
                        try {
                            String cellResolution2 = matcher.group(1);
                            int parseInt = Integer.parseInt(cellResolution2);
                            String cellResolution3 = matcher.group(2);
                            int parseInt2 = Integer.parseInt(cellResolution3);
                            if (parseInt != 0 && parseInt2 != 0) {
                                return new GE(parseInt, parseInt2);
                            }
                            StringBuilder sb = new StringBuilder();
                            String cellResolution4 = A08(430, 24, 108);
                            StringBuilder append = sb.append(cellResolution4).append(parseInt);
                            String cellResolution5 = A08(0, 1, 107);
                            throw new C0541Fu(append.append(cellResolution5).append(parseInt2).toString());
                        } catch (NumberFormatException unused) {
                            String cellResolution6 = A082 + attributeValue;
                            Log.w(A083, cellResolution6);
                            return ge;
                        }
                    }

                    private GF A02(XmlPullParser xmlPullParser) throws C0541Fu {
                        int i2 = 30;
                        String A082 = A08(1110, 9, 53);
                        String A083 = A08(1183, 35, 3);
                        String attributeValue = xmlPullParser.getAttributeValue(A083, A082);
                        if (attributeValue != null) {
                            i2 = Integer.parseInt(attributeValue);
                        }
                        float f2 = 1.0f;
                        String attributeValue2 = xmlPullParser.getAttributeValue(A083, A08(1119, 19, 73));
                        if (attributeValue2 != null) {
                            String[] A0l = IK.A0l(attributeValue2, A08(0, 1, 107));
                            if (A0l.length == 2) {
                                int frameRate = Integer.parseInt(A0l[0]);
                                float f3 = frameRate;
                                int frameRate2 = Integer.parseInt(A0l[1]);
                                f2 = f3 / frameRate2;
                            } else {
                                String frameRateString = A08(1138, 40, 26);
                                throw new C0541Fu(frameRateString);
                            }
                        }
                        int i3 = A04.A01;
                        String attributeValue3 = xmlPullParser.getAttributeValue(A083, A08(1362, 12, 6));
                        if (attributeValue3 != null) {
                            i3 = Integer.parseInt(attributeValue3);
                        }
                        int i4 = A04.A02;
                        String attributeValue4 = xmlPullParser.getAttributeValue(A083, A08(1398, 8, 6));
                        if (attributeValue4 != null) {
                            i4 = Integer.parseInt(attributeValue4);
                        }
                        return new GF(i2 * f2, i3, i4);
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c2, code lost:
                    
                        if (r3.equals(A08(983, 5, 72)) != false) goto L21;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    private com.instagram.common.viewpoint.core.GH A04(org.xmlpull.v1.XmlPullParser r19, com.instagram.common.viewpoint.core.GE r20) {
                        /*
                            Method dump skipped, instructions count: 440
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.AnonymousClass47.A04(org.xmlpull.v1.XmlPullParser, com.facebook.ads.redexgen.X.GE):com.facebook.ads.redexgen.X.GH");
                    }

                    private GM A05(GM gm) {
                        return gm == null ? new GM() : gm;
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code restructure failed: missing block: B:37:0x0098, code lost:
                    
                        if (r5.equals(A08(1408, 9, 127)) != false) goto L17;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:69:0x0137, code lost:
                    
                        if (r3.equals(A08(1032, 6, org.objectweb.asm.Opcodes.LREM)) != false) goto L38;
                     */
                    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0017. Please report as an issue. */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
                    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
                    /* JADX WARN: Removed duplicated region for block: B:70:0x0176  */
                    /* JADX WARN: Removed duplicated region for block: B:72:0x018d  */
                    /* JADX WARN: Removed duplicated region for block: B:74:0x0197  */
                    /* JADX WARN: Removed duplicated region for block: B:81:0x01c4  */
                    /* JADX WARN: Removed duplicated region for block: B:88:0x01f1  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
                    /* JADX WARN: Removed duplicated region for block: B:93:0x020e A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:99:0x0028 A[SYNTHETIC] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    private com.instagram.common.viewpoint.core.GM A06(org.xmlpull.v1.XmlPullParser r14, com.instagram.common.viewpoint.core.GM r15) {
                        /*
                            Method dump skipped, instructions count: 902
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.AnonymousClass47.A06(org.xmlpull.v1.XmlPullParser, com.facebook.ads.redexgen.X.GM):com.facebook.ads.redexgen.X.GM");
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.instagram.common.viewpoint.core.DP
                    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
                    public final XI A0b(byte[] bArr, int i2, boolean z2) throws C0541Fu {
                        XmlPullParser newPullParser;
                        HashMap hashMap;
                        Map<String, TtmlRegion> regionMap;
                        try {
                            newPullParser = this.A00.newPullParser();
                            hashMap = new HashMap();
                            regionMap = new HashMap<>();
                            regionMap.put(A08(0, 0, 90), new GH(null));
                        } catch (IOException e) {
                            e = e;
                        } catch (XmlPullParserException e2) {
                            e = e2;
                        }
                        try {
                            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i2), null);
                            XI xi = null;
                            ArrayDeque arrayDeque = new ArrayDeque();
                            int i3 = 0;
                            GF gf = A04;
                            GE ge = A03;
                            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                                GG gg = (GG) arrayDeque.peek();
                                if (i3 == 0) {
                                    String name = newPullParser.getName();
                                    String A082 = A08(1406, 2, 116);
                                    if (eventType == 2) {
                                        if (A082.equals(name)) {
                                            gf = A02(newPullParser);
                                            ge = A01(newPullParser, A03);
                                        }
                                        boolean A0C = A0C(name);
                                        String A083 = A08(717, 11, Opcodes.LREM);
                                        if (!A0C) {
                                            Log.i(A083, A08(404, 26, 127) + newPullParser.getName());
                                            i3++;
                                        } else if (A08(1179, 4, 5).equals(name)) {
                                            A09(newPullParser, hashMap, regionMap, ge);
                                        } else {
                                            try {
                                                GG node = A03(newPullParser, gg, regionMap, gf);
                                                arrayDeque.push(node);
                                                if (gg != null) {
                                                    gg.A0E(node);
                                                }
                                            } catch (C0541Fu e3) {
                                                Log.w(A083, A08(693, 24, 61), e3);
                                                i3++;
                                                if (A02[4].length() != 17) {
                                                    throw new RuntimeException();
                                                }
                                                A02[3] = "wLwBbwjFX";
                                            }
                                        }
                                    } else if (eventType != 4) {
                                        if (eventType == 3) {
                                            if (newPullParser.getName().equals(A082)) {
                                                xi = new XI((GG) arrayDeque.peek(), hashMap, regionMap);
                                            }
                                            arrayDeque.pop();
                                        }
                                    } else {
                                        gg.A0E(GG.A04(newPullParser.getText()));
                                    }
                                } else if (eventType == 2) {
                                    i3++;
                                } else if (eventType == 3) {
                                    i3--;
                                }
                                newPullParser.next();
                            }
                            return xi;
                        } catch (IOException e4) {
                            e = e4;
                            throw new IllegalStateException(A08(751, 36, 29), e);
                        } catch (XmlPullParserException e5) {
                            e = e5;
                            throw new C0541Fu(A08(728, 23, 102), e);
                        }
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    public static void A0B(String str2, GM gm) throws C0541Fu {
                        Matcher matcher;
                        char c3;
                        String[] A0l = IK.A0l(str2, A08(787, 3, 94));
                        if (A0l.length == 1) {
                            Pattern pattern = A07;
                            if (A02[4].length() != 17) {
                                throw new RuntimeException();
                            }
                            A02[3] = "DcJ2SXub95tq9AheLlcOmjYh8kVu";
                            matcher = pattern.matcher(str2);
                        } else if (A0l.length == 2) {
                            matcher = A07.matcher(A0l[1]);
                            Log.w(A08(717, 11, Opcodes.LREM), A08(583, 110, 66));
                        } else {
                            throw new C0541Fu(A08(488, 40, 47) + A0l.length + A08(4, 1, 46));
                        }
                        boolean matches = matcher.matches();
                        String A082 = A08(2, 2, 108);
                        if (matches) {
                            String group = matcher.group(3);
                            switch (group.hashCode()) {
                                case 37:
                                    if (group.equals(A08(1, 1, 95))) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 3240:
                                    if (group.equals(A08(1061, 2, 90))) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 3592:
                                    if (group.equals(A08(1289, 2, 88))) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            switch (c3) {
                                case 0:
                                    gm.A0C(1);
                                    break;
                                case 1:
                                    gm.A0C(2);
                                    break;
                                case 2:
                                    gm.A0C(3);
                                    break;
                                default:
                                    throw new C0541Fu(A08(528, 28, 22) + group + A082);
                            }
                            gm.A09(Float.valueOf(matcher.group(1)).floatValue());
                            return;
                        }
                        throw new C0541Fu(A08(454, 34, 116) + str2 + A082);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:32:0x010a, code lost:
                    
                        if (r3 == false) goto L34;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:34:0x011a, code lost:
                    
                        if (r5.equals(A08(1303, 10, 13)) != false) goto L38;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:36:0x0129, code lost:
                    
                        if (r5.equals(A08(1324, 17, 4)) == false) goto L40;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:37:0x012d, code lost:
                    
                        return false;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:40:0x0136, code lost:
                    
                        if (r3 == false) goto L34;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public static boolean A0C(java.lang.String r5) {
                        /*
                            Method dump skipped, instructions count: 325
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.AnonymousClass47.A0C(java.lang.String):boolean");
                    }

                    private String[] A0D(String str2) {
                        String trim = str2.trim();
                        return trim.isEmpty() ? new String[0] : IK.A0l(trim, A08(787, 3, 94));
                    }
                };
            case 4:
                return new DP() { // from class: com.facebook.ads.redexgen.X.4Q
                    public static byte[] A01;
                    public static String[] A02 = {"OtT0LVQqk9RRHcQl9suaXVs0lQy2Xi2B", "6vOb", "M1GK", "Q3AOLP3m2yMSgayKU1WrD6hHOweB9S3H", "F1kiItxEw59xVPIC9WgcG0LVYvZuut6s", "hrS3LC0HlCWsxOkana5b4FKEJhzBz64C", "cblU074", "WiaS5fbm8COclwCTLJ"};
                    public static final Pattern A03;
                    public final StringBuilder A00;

                    public static String A02(int i2, int i3, int i4) {
                        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
                        int i5 = 0;
                        while (true) {
                            int length = copyOfRange.length;
                            String[] strArr = A02;
                            if (strArr[2].length() != strArr[1].length()) {
                                throw new RuntimeException();
                            }
                            A02[6] = "OHBI6AMzh";
                            if (i5 >= length) {
                                return new String(copyOfRange);
                            }
                            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 61);
                            i5++;
                        }
                    }

                    public static void A03() {
                        String[] strArr = A02;
                        if (strArr[3].charAt(27) != strArr[5].charAt(27)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A02;
                        strArr2[0] = "Nx0nP4euuoKlaME2hNpQquavIXdn2ckR";
                        strArr2[4] = "3saTitcRJ2ReIxQT7kbEn3BtIwhGo3t4";
                        A01 = new byte[]{-12, 26, 42, -10, -14, 10, 8, 15, 15, 8, 13, 6, -65, 8, 13, 21, 0, 11, 8, 3, -65, 8, 13, 3, 4, 23, -39, -65, -83, -59, -61, -54, -54, -61, -56, -63, 122, -61, -56, -48, -69, -58, -61, -66, 122, -50, -61, -57, -61, -56, -63, -108, 122, -39, -5, -24, -8, -17, -10, -54, -21, -23, -11, -22, -21, -8, -83, -58, -67, -48, -56, -67, -69, -52, -67, -68, 120, -67, -58, -68, -27, -4, -77, -79, -79, -56, -61, -79, -27, -19, -76, -78, -61, -78, -56, -79, -27, -19, -76, -78, -61, -79, -27, -19, -76, -78, -75, -79, -27, -19, -76, -78, -78, -27, -4, -77, -74, -74, -57, -27, -4, -77, -79, -79, -56, -61, -79, -27, -19, -76, -78, -61, -78, -56, -79, -27, -19, -76, -78, -61, -79, -27, -19, -76, -78, -75, -79, -27, -19, -76, -78, -78, -56, -27, -4, -77};
                    }

                    static {
                        A03();
                        A03 = Pattern.compile(A02(80, 76, 76));
                    }

                    {
                        A02(53, 13, 73);
                        this.A00 = new StringBuilder();
                    }

                    public static long A00(Matcher matcher, int i2) {
                        long parseLong = Long.parseLong(matcher.group(i2 + 1)) * 60 * 60 * 1000;
                        long timestampMs = Long.parseLong(matcher.group(i2 + 2));
                        long j2 = parseLong + (timestampMs * 60 * 1000);
                        long timestampMs2 = Long.parseLong(matcher.group(i2 + 3));
                        long j3 = j2 + (timestampMs2 * 1000);
                        long timestampMs3 = Long.parseLong(matcher.group(i2 + 4));
                        return 1000 * (j3 + timestampMs3);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.instagram.common.viewpoint.core.DP
                    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
                    public final XJ A0b(byte[] bArr, int i2, boolean z2) {
                        String A022 = A02(53, 13, 73);
                        ArrayList arrayList = new ArrayList();
                        C0591Hu c0591Hu = new C0591Hu();
                        I4 subripData = new I4(bArr, i2);
                        while (true) {
                            String A0P = subripData.A0P();
                            if (A0P == null) {
                                break;
                            }
                            if (A0P.length() != 0) {
                                try {
                                    Integer.parseInt(A0P);
                                    boolean z3 = false;
                                    String A0P2 = subripData.A0P();
                                    if (A0P2 == null) {
                                        Log.w(A022, A02(66, 14, 27));
                                        break;
                                    }
                                    Matcher matcher = A03.matcher(A0P2);
                                    if (A02[7].length() != 18) {
                                        throw new RuntimeException();
                                    }
                                    A02[7] = "1qm0qGLZ04MjzjLSxI";
                                    if (matcher.matches()) {
                                        c0591Hu.A04(A00(matcher, 1));
                                        if (!TextUtils.isEmpty(matcher.group(6))) {
                                            z3 = true;
                                            c0591Hu.A04(A00(matcher, 6));
                                        }
                                        this.A00.setLength(0);
                                        while (true) {
                                            String A0P3 = subripData.A0P();
                                            if (TextUtils.isEmpty(A0P3)) {
                                                break;
                                            }
                                            if (this.A00.length() > 0) {
                                                this.A00.append(A02(0, 4, Opcodes.LSHR));
                                            }
                                            this.A00.append(A0P3.trim());
                                        }
                                        arrayList.add(new C0539Fs(Html.fromHtml(this.A00.toString())));
                                        if (z3) {
                                            arrayList.add(null);
                                        }
                                    } else {
                                        Log.w(A022, A02(28, 25, 29) + A0P2);
                                    }
                                } catch (NumberFormatException unused) {
                                    Log.w(A022, A02(4, 24, 98) + A0P);
                                }
                            }
                        }
                        C0539Fs[] c0539FsArr = new C0539Fs[arrayList.size()];
                        arrayList.toArray(c0539FsArr);
                        return new XJ(c0539FsArr, c0591Hu.A05());
                    }
                };
            case 5:
                final List<byte[]> list = format.A0P;
                return new DP(list) { // from class: com.facebook.ads.redexgen.X.46
                    public static byte[] A07;
                    public static String[] A08 = {"sj6Q1BeWjF6K1JUJsYy6pD", "UWU3GT", "YBjsjOcLll", "qdxWVIRB3qQm1B3o2sbKY5IbL9FH0hor", "FAZgRoMoQSemNfZfZZuAf", "nuzZ152GP4LbG", "bCqOeUg8Y6EuywmPRf", "YV0eqaSi"};
                    public static final int A09;
                    public static final int A0A;
                    public float A00;
                    public int A01;
                    public int A02;
                    public int A03;
                    public String A04;
                    public boolean A05;
                    public final I4 A06;

                    public static String A00(int i2, int i3, int i4) {
                        byte[] copyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
                        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
                            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 52);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A02() {
                        A07 = new byte[]{33, 23, 0, 27, 20, 8, 36, 111, 59, 24, 57, Utf8.REPLACEMENT_BYTE, 51, 56, 57, 46, 8, 9, 27, 112, 108, 107, Utf8.REPLACEMENT_BYTE, 62, 44, 71, 82, 59, 0, 11, 22, 30, 11, 13, 26, 11, 10, 78, 29, 27, 12, 26, 7, 26, 2, 11, 78, 8, 1, 28, 3, 15, 26, 64, 12, 30, 17, 12, 82, 12, 26, 13, 22, 25, 44, 58, 45, 54, 57, 78, 73, 68, 81, 47, 57, 52, 35};
                    }

                    static {
                        A02();
                        A09 = IK.A08(A00(69, 4, 9));
                        A0A = IK.A08(A00(73, 4, 111));
                    }

                    {
                        super(A00(5, 11, 104));
                        this.A06 = new I4();
                        A07(list);
                    }

                    public static String A01(I4 i4) throws C0541Fu {
                        char firstChar;
                        A08(i4.A04() >= 2);
                        int A0I = i4.A0I();
                        if (A0I == 0) {
                            return A00(0, 0, 88);
                        }
                        int A04 = i4.A04();
                        if (A08[2].length() != 10) {
                            throw new RuntimeException();
                        }
                        A08[2] = "HPbsPvSCkr";
                        if (A04 >= 2 && ((firstChar = i4.A02()) == 65279 || firstChar == 65534)) {
                            return i4.A0T(A0I, Charset.forName(A00(16, 6, 105)));
                        }
                        String A002 = A00(22, 5, 94);
                        String[] strArr = A08;
                        String str2 = strArr[0];
                        String str3 = strArr[5];
                        int length = str2.length();
                        int textLength = str3.length();
                        if (length != textLength) {
                            A08[3] = "rvE6pRP6oc75068eKKdpjEgvFDLvSRuA";
                            return i4.A0T(A0I, Charset.forName(A002));
                        }
                        A08[7] = "YAbwhueU";
                        return i4.A0T(A0I, Charset.forName(A002));
                    }

                    public static void A03(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
                        if (i2 != i3) {
                            int colorArgb = i6 | 33;
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(((i2 & 255) << 24) | (i2 >>> 8)), i4, i5, colorArgb);
                        }
                    }

                    public static void A04(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
                        if (i2 != i3) {
                            int i7 = i6 | 33;
                            int flags = i2 & 1;
                            boolean z2 = flags != 0;
                            int flags2 = i2 & 2;
                            boolean z3 = flags2 != 0;
                            if (z2) {
                                if (z3) {
                                    spannableStringBuilder.setSpan(new StyleSpan(3), i4, i5, i7);
                                } else {
                                    spannableStringBuilder.setSpan(new StyleSpan(1), i4, i5, i7);
                                }
                            } else if (z3) {
                                spannableStringBuilder.setSpan(new StyleSpan(2), i4, i5, i7);
                            }
                            int flags3 = i2 & 4;
                            boolean z4 = flags3 != 0;
                            if (z4) {
                                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, i5, i7);
                            }
                            if (!z4 && !z2 && !z3) {
                                spannableStringBuilder.setSpan(new StyleSpan(0), i4, i5, i7);
                            }
                        }
                    }

                    public static void A05(SpannableStringBuilder spannableStringBuilder, String str2, String str3, int i2, int i3, int i4) {
                        if (str2 != str3) {
                            spannableStringBuilder.setSpan(new TypefaceSpan(str2), i2, i3, i4 | 33);
                        }
                    }

                    private void A06(I4 i4, SpannableStringBuilder spannableStringBuilder) throws C0541Fu {
                        A08(i4.A04() >= 12);
                        int A0I = i4.A0I();
                        int A0I2 = i4.A0I();
                        i4.A0Z(2);
                        int colorRgba = i4.A0E();
                        i4.A0Z(1);
                        int A082 = i4.A08();
                        A04(spannableStringBuilder, colorRgba, this.A03, A0I, A0I2, 0);
                        int fontFace = this.A02;
                        A03(spannableStringBuilder, A082, fontFace, A0I, A0I2, 0);
                    }

                    private void A07(List<byte[]> list2) {
                        String A002 = A00(54, 10, 75);
                        if (list2 != null && list2.size() == 1 && (list2.get(0).length == 48 || list2.get(0).length == 53)) {
                            byte[] initializationBytes = list2.get(0);
                            this.A03 = initializationBytes[24];
                            this.A02 = ((initializationBytes[26] & UnsignedBytes.MAX_VALUE) << 24) | ((initializationBytes[27] & UnsignedBytes.MAX_VALUE) << 16) | ((initializationBytes[28] & UnsignedBytes.MAX_VALUE) << 8) | (initializationBytes[29] & UnsignedBytes.MAX_VALUE);
                            if (A00(0, 5, 70).equals(IK.A0R(initializationBytes, 43, initializationBytes.length - 43))) {
                                A002 = A00(64, 5, 107);
                            }
                            this.A04 = A002;
                            this.A01 = initializationBytes[25] * 20;
                            this.A05 = (initializationBytes[0] & 32) != 0;
                            if (this.A05) {
                                float f2 = ((initializationBytes[10] & UnsignedBytes.MAX_VALUE) << 8) | (initializationBytes[11] & UnsignedBytes.MAX_VALUE);
                                int requestedVerticalPlacement = this.A01;
                                this.A00 = f2 / requestedVerticalPlacement;
                                this.A00 = IK.A00(this.A00, 0.0f, 0.95f);
                                return;
                            }
                            this.A00 = 0.85f;
                            return;
                        }
                        this.A03 = 0;
                        this.A02 = -1;
                        this.A04 = A002;
                        this.A05 = false;
                        this.A00 = 0.85f;
                    }

                    public static void A08(boolean z2) throws C0541Fu {
                        if (z2) {
                        } else {
                            throw new C0541Fu(A00(27, 27, 90));
                        }
                    }

                    @Override // com.instagram.common.viewpoint.core.DP
                    public final InterfaceC0540Ft A0b(byte[] bArr, int i2, boolean z2) throws C0541Fu {
                        this.A06.A0b(bArr, i2);
                        String cueTextString = A01(this.A06);
                        if (cueTextString.isEmpty()) {
                            XH xh = XH.A01;
                            if (A08[2].length() == 10) {
                                A08[7] = "3cYR8cSPmC5bjkzTt";
                                return xh;
                            }
                        } else {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cueTextString);
                            A04(spannableStringBuilder, this.A03, 0, 0, spannableStringBuilder.length(), 16711680);
                            A03(spannableStringBuilder, this.A02, -1, 0, spannableStringBuilder.length(), 16711680);
                            A05(spannableStringBuilder, this.A04, A00(54, 10, 75), 0, spannableStringBuilder.length(), 16711680);
                            float f2 = this.A00;
                            while (this.A06.A04() >= 8) {
                                int A06 = this.A06.A06();
                                int requestedVerticalPlacement = this.A06.A08();
                                int A082 = this.A06.A08();
                                if (A082 == A09) {
                                    A08(this.A06.A04() >= 2);
                                    int atomType = this.A06.A0I();
                                    for (int atomSize = 0; atomSize < atomType; atomSize++) {
                                        I4 i4 = this.A06;
                                        if (A08[1].length() == 6) {
                                            A08[7] = "K6DxG7jCQQet2xH5VdPl5OgFKzFbW";
                                            A06(i4, spannableStringBuilder);
                                        }
                                    }
                                } else if (A082 == A0A && this.A05) {
                                    int position = this.A06.A04();
                                    String[] strArr = A08;
                                    if (strArr[6].length() == strArr[4].length()) {
                                        throw new RuntimeException();
                                    }
                                    A08[7] = "iBd2tHQU60lGQ74NnW";
                                    A08(position >= 2);
                                    f2 = IK.A00(this.A06.A0I() / this.A01, 0.0f, 0.95f);
                                }
                                this.A06.A0Y(A06 + requestedVerticalPlacement);
                            }
                            return new XH(new C0539Fs(spannableStringBuilder, null, f2, 0, 0, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE));
                        }
                        throw new RuntimeException();
                    }
                };
            case 6:
            case 7:
                return new C5A(format.A0O, format.A03);
            case '\b':
                final int i2 = format.A03;
                return new DD(i2) { // from class: com.facebook.ads.redexgen.X.52
                    public static byte[] A09;
                    public static String[] A0A = {"EWwn6kg", "sEDXBDjrWp0Vneo976MhoJrsYcWIYN6Q", "S7VRRu9Yx770AGv7wX8aTsHMlPhnJMSA", "CWg8HfU", "qgbV75i4foMMAXtqLGhU3LERU50xbQB4", "VV27SlS", "2iyarXf7dWJxe7qXUXDD0TZONEHNOfMn", "7b0wVmZ"};
                    public int A00;
                    public G0 A01;
                    public G1 A02;
                    public List<C0539Fs> A03;
                    public List<C0539Fs> A04;
                    public final int A05;
                    public final G0[] A08;
                    public final I4 A07 = new I4();
                    public final I3 A06 = new I3();

                    public static String A00(int i3, int i4, int i5) {
                        byte[] copyOfRange = Arrays.copyOfRange(A09, i3, i3 + i4);
                        for (int i6 = 0; i6 < copyOfRange.length; i6++) {
                            copyOfRange[i6] = (byte) ((copyOfRange[i6] ^ i5) ^ 104);
                        }
                        return new String(copyOfRange);
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
                    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                     */
                    private void A03() {
                        this.A01.A0C(this.A06.A04(4), this.A06.A04(2), this.A06.A04(2), this.A06.A0F(), this.A06.A0F(), this.A06.A04(3), this.A06.A04(3));
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
                    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                     */
                    private void A04() {
                        int A012 = G0.A01(this.A06.A04(2), this.A06.A04(2), this.A06.A04(2), this.A06.A04(2));
                        int A013 = G0.A01(this.A06.A04(2), this.A06.A04(2), this.A06.A04(2), this.A06.A04(2));
                        this.A06.A08(2);
                        this.A01.A0B(A012, A013, G0.A00(this.A06.A04(2), this.A06.A04(2), this.A06.A04(2)));
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 13
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
                    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                     */
                    private void A06() {
                        int A012 = G0.A01(this.A06.A04(2), this.A06.A04(2), this.A06.A04(2), this.A06.A04(2));
                        int A04 = this.A06.A04(2);
                        int A002 = G0.A00(this.A06.A04(2), this.A06.A04(2), this.A06.A04(2));
                        if (this.A06.A0F()) {
                            A04 |= 4;
                        }
                        boolean A0F = this.A06.A0F();
                        int A042 = this.A06.A04(2);
                        int A043 = this.A06.A04(2);
                        int A044 = this.A06.A04(2);
                        this.A06.A08(8);
                        this.A01.A0D(A012, A002, A0F, A04, A042, A043, A044);
                    }

                    public static void A09() {
                        A09 = new byte[]{95, 87, 12, 26, 14, 10, 26, 17, 28, 26, 95, 17, 10, 18, 29, 26, 13, 95, 13, 4, 83, 76, 65, 74, 4, 70, 72, 75, 71, 79, 119, 77, 94, 65, 4, 77, 87, 4, 20, 80, 66, 89, 16, 30, 23, 22, 11, 16, 23, 30, 89, 9, 24, 26, 18, 28, 13, 50, 62, 124, 107, 106, 62, 125, 107, 108, 108, 123, 112, 106, 62, 119, 112, 122, 123, 102, 62, 119, 109, 62, 111, 73, 77, 27, 28, 20, 104, 73, 79, 67, 72, 73, 94, 100, 82, 85, 85, 66, 73, 83, 75, 94, 7, 82, 73, 84, 82, 87, 87, 72, 85, 83, 66, 67, 7, 100, 104, 106, 106, 102, 105, 99, 120, 98, Byte.MAX_VALUE, 115, 22, 7, 100, 72, 74, 74, 70, 73, 67, 29, 7, 10, 60, 59, 59, 44, 39, 61, 37, 48, 105, 60, 39, 58, 60, 57, 57, 38, 59, 61, 44, 45, 105, 10, 6, 4, 4, 8, 7, 13, 22, 25, 120, Byte.MAX_VALUE, 105, 10, 38, 36, 36, 40, 39, 45, 115, 105, 31, 47, 45, 24, 56, 11, 58, 56, 48, 62, 47, 123, 62, 53, Utf8.REPLACEMENT_BYTE, 62, Utf8.REPLACEMENT_BYTE, 123, 43, 41, 62, 54, 58, 47, 46, 41, 62, 55, 34, 96, 123, 40, 50, 33, 62, 123, 50, 40, 123, 28, 55, 58, 54, 44, 55, 45, 60, 43, 60, 61, 121, 29, 13, 15, 26, 26, 6, 9, 24, 26, 18, 28, 13, 6, 29, 24, 13, 24, 121, 59, 60, Utf8.REPLACEMENT_BYTE, 54, 43, 60, 121, 29, 13, 15, 26, 26, 6, 9, 24, 26, 18, 28, 13, 6, 10, 13, 24, 11, 13, 114, 85, 77, 90, 87, 82, 95, 27, 120, 11, 27, 88, 84, 86, 86, 90, 85, 95, 1, 27, 88, Byte.MAX_VALUE, 103, 112, 125, 120, 117, 49, 82, 32, 49, 114, 126, 124, 124, 112, Byte.MAX_VALUE, 117, 43, 49, 62, 25, 1, 22, 27, 30, 19, 87, 48, 69, 87, 20, 31, 22, 5, 22, 20, 3, 18, 5, 77, 87, 46, 9, 17, 6, 11, 14, 3, 71, 32, 84, 71, 4, 15, 6, 21, 6, 4, 19, 2, 21, 93, 71, 96, 71, 95, 72, 69, 64, 77, 9, 75, 72, 90, 76, 9, 74, 70, 68, 68, 72, 71, 77, 19, 9, 104, 79, 87, 64, 77, 72, 69, 1, 68, 89, 85, 68, 79, 69, 68, 69, 1, 66, 78, 76, 76, 64, 79, 69, 27, 1, 99, 117, 98, 102, 121, 115, 117, 94, 101, 125, 114, 117, 98, 48, 121, 99, 48, 126, Byte.MAX_VALUE, 126, 61, 106, 117, 98, Byte.MAX_VALUE, 48, 56};
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 20
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
                    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                     */
                    private void A0E(int i3) {
                        G0 g02 = this.A08[i3];
                        this.A06.A08(2);
                        boolean A0F = this.A06.A0F();
                        boolean A0F2 = this.A06.A0F();
                        boolean A0F3 = this.A06.A0F();
                        int A04 = this.A06.A04(3);
                        boolean A0F4 = this.A06.A0F();
                        int A042 = this.A06.A04(7);
                        int A043 = this.A06.A04(8);
                        int A044 = this.A06.A04(4);
                        int A045 = this.A06.A04(4);
                        this.A06.A08(2);
                        int A046 = this.A06.A04(6);
                        this.A06.A08(2);
                        g02.A0F(A0F, A0F2, A0F3, A04, A0F4, A042, A043, A045, A046, A044, this.A06.A04(3), this.A06.A04(3));
                    }

                    static {
                        A09();
                    }

                    {
                        this.A05 = i2 == -1 ? 1 : i2;
                        this.A08 = new G0[8];
                        for (int i3 = 0; i3 < 8; i3++) {
                            this.A08[i3] = new G0();
                        }
                        this.A01 = this.A08[0];
                        A08();
                    }

                    private List<C0539Fs> A01() {
                        ArrayList arrayList = new ArrayList();
                        for (int i3 = 0; i3 < 8; i3++) {
                            if (!this.A08[i3].A0H() && this.A08[i3].A0I()) {
                                arrayList.add(this.A08[i3].A05());
                            }
                        }
                        Collections.sort(arrayList);
                        return Collections.unmodifiableList(arrayList);
                    }

                    private void A02() {
                        if (this.A02 == null) {
                            return;
                        }
                        A07();
                        this.A02 = null;
                    }

                    private void A05() {
                        this.A06.A08(4);
                        int A04 = this.A06.A04(4);
                        this.A06.A08(2);
                        int column = this.A06.A04(6);
                        this.A01.A0A(A04, column);
                    }

                    /* JADX WARN: Incorrect condition in loop: B:23:0x0105 */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    private void A07() {
                        /*
                            Method dump skipped, instructions count: 456
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.AnonymousClass52.A07():void");
                    }

                    private void A08() {
                        for (int i3 = 0; i3 < 8; i3++) {
                            this.A08[i3].A08();
                        }
                    }

                    private void A0A(int i3) {
                        switch (i3) {
                            case 0:
                            case 14:
                                return;
                            case 3:
                                List<C0539Fs> A012 = A01();
                                String[] strArr = A0A;
                                if (strArr[0].length() != strArr[3].length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A0A;
                                strArr2[0] = "cYQNrPy";
                                strArr2[3] = "NObDRxg";
                                this.A03 = A012;
                                return;
                            case 8:
                                this.A01.A06();
                                return;
                            case 12:
                                A08();
                                return;
                            case 13:
                                this.A01.A09('\n');
                                return;
                            default:
                                String A002 = A00(80, 13, 68);
                                if (i3 >= 17 && i3 <= 23) {
                                    Log.w(A002, A00(93, 44, 79) + i3);
                                    this.A06.A08(8);
                                    return;
                                }
                                String[] strArr3 = A0A;
                                if (strArr3[5].length() != strArr3[7].length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr4 = A0A;
                                strArr4[6] = "9gEQCvPFdreLq8ucaHGbo1FFHbhoOPYc";
                                strArr4[2] = "adIHl6UCoaxd1uqvYvCbAbAxB8winlNV";
                                if (i3 >= 24 && i3 <= 31) {
                                    Log.w(A002, A00(Opcodes.L2F, 43, 33) + i3);
                                    this.A06.A08(16);
                                    return;
                                } else {
                                    Log.w(A002, A00(274, 20, 83) + i3);
                                    return;
                                }
                        }
                    }

                    private void A0B(int i3) {
                        switch (i3) {
                            case 128:
                            case Opcodes.LOR /* 129 */:
                            case 130:
                            case Opcodes.LXOR /* 131 */:
                            case Opcodes.IINC /* 132 */:
                            case Opcodes.I2L /* 133 */:
                            case Opcodes.I2F /* 134 */:
                            case Opcodes.I2D /* 135 */:
                                int i4 = i3 - 128;
                                int window = this.A00;
                                if (window == i4) {
                                    return;
                                }
                                this.A00 = i4;
                                this.A01 = this.A08[i4];
                                return;
                            case Opcodes.L2I /* 136 */:
                                for (int i5 = 1; i5 <= 8; i5++) {
                                    boolean A0F = this.A06.A0F();
                                    String[] strArr = A0A;
                                    String str2 = strArr[1];
                                    String str3 = strArr[4];
                                    int charAt = str2.charAt(25);
                                    int i6 = str3.charAt(25);
                                    if (charAt == i6) {
                                        break;
                                    } else {
                                        String[] strArr2 = A0A;
                                        strArr2[6] = "VSRryxZmfi4amJJNw0pQQYma4vvNhg8X";
                                        strArr2[2] = "BL4DcjhEJuwqzgj4jkdydFuK8kSbCD4I";
                                        if (A0F) {
                                            int i7 = 8 - i5;
                                            this.A08[i7].A07();
                                        }
                                    }
                                }
                                return;
                            case Opcodes.L2F /* 137 */:
                                for (int i8 = 1; i8 <= 8; i8++) {
                                    if (this.A06.A0F()) {
                                        int i9 = 8 - i8;
                                        this.A08[i9].A0E(true);
                                    }
                                }
                                return;
                            case Opcodes.L2D /* 138 */:
                                for (int i10 = 1; i10 <= 8; i10++) {
                                    if (this.A06.A0F()) {
                                        int i11 = 8 - i10;
                                        this.A08[i11].A0E(false);
                                    }
                                }
                                return;
                            case Opcodes.F2I /* 139 */:
                                for (int i12 = 1; i12 <= 8; i12++) {
                                    if (this.A06.A0F()) {
                                        int i13 = 8 - i12;
                                        this.A08[i13].A0E(!r1.A0I());
                                    }
                                }
                                return;
                            case Opcodes.F2L /* 140 */:
                                for (int i14 = 1; i14 <= 8; i14++) {
                                    if (this.A06.A0F()) {
                                        int i15 = 8 - i14;
                                        this.A08[i15].A08();
                                    }
                                }
                                return;
                            case Opcodes.F2D /* 141 */:
                                this.A06.A08(8);
                                return;
                            case Opcodes.D2I /* 142 */:
                                return;
                            case Opcodes.D2L /* 143 */:
                                A08();
                                return;
                            case Opcodes.D2F /* 144 */:
                                if (!this.A01.A0G()) {
                                    this.A06.A08(16);
                                    return;
                                } else {
                                    A03();
                                    return;
                                }
                            case Opcodes.I2B /* 145 */:
                                if (!this.A01.A0G()) {
                                    this.A06.A08(24);
                                    return;
                                } else {
                                    A04();
                                    return;
                                }
                            case Opcodes.I2C /* 146 */:
                                if (!this.A01.A0G()) {
                                    this.A06.A08(16);
                                    return;
                                } else {
                                    A05();
                                    return;
                                }
                            case Opcodes.I2S /* 147 */:
                            case Opcodes.LCMP /* 148 */:
                            case Opcodes.FCMPL /* 149 */:
                            case Opcodes.FCMPG /* 150 */:
                            default:
                                Log.w(A00(80, 13, 68), A00(294, 20, Opcodes.LSHL) + i3);
                                return;
                            case Opcodes.DCMPL /* 151 */:
                                if (!this.A01.A0G()) {
                                    this.A06.A08(32);
                                    return;
                                } else {
                                    A06();
                                    return;
                                }
                            case Opcodes.DCMPG /* 152 */:
                            case 153:
                            case 154:
                            case 155:
                            case 156:
                            case 157:
                            case 158:
                            case Opcodes.IF_ICMPEQ /* 159 */:
                                int i16 = i3 - 152;
                                A0E(i16);
                                int window2 = this.A00;
                                if (window2 == i16) {
                                    return;
                                }
                                this.A00 = i16;
                                G0[] g0Arr = this.A08;
                                String[] strArr3 = A0A;
                                String str4 = strArr3[0];
                                String str5 = strArr3[3];
                                int length = str4.length();
                                int window3 = str5.length();
                                if (length == window3) {
                                    String[] strArr4 = A0A;
                                    strArr4[6] = "c4ioSCGe7KNKl4RmGo77tuqVZW7GRO5r";
                                    strArr4[2] = "kTXdjMmR3ZZloMRgG8kAyk2rxzgndvqM";
                                    this.A01 = g0Arr[i16];
                                    return;
                                }
                                break;
                        }
                        throw new RuntimeException();
                    }

                    private void A0C(int i3) {
                        if (i3 <= 7) {
                            return;
                        }
                        if (i3 <= 15) {
                            this.A06.A08(8);
                            return;
                        }
                        if (i3 <= 23) {
                            I3 i32 = this.A06;
                            String[] strArr = A0A;
                            if (strArr[0].length() != strArr[3].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A0A;
                            strArr2[6] = "PcALpDXfdKTOGVICfCKaZZ0xZ5oW4rSk";
                            strArr2[2] = "2XC1KBXrSpvLkiHBNbmrl8w830zrIApy";
                            i32.A08(16);
                            return;
                        }
                        if (i3 > 31) {
                            return;
                        }
                        this.A06.A08(24);
                    }

                    private void A0D(int i3) {
                        if (i3 <= 135) {
                            this.A06.A08(32);
                            return;
                        }
                        if (i3 <= 143) {
                            this.A06.A08(40);
                        } else {
                            if (i3 > 159) {
                                return;
                            }
                            this.A06.A08(2);
                            int length = this.A06.A04(6);
                            this.A06.A08(length * 8);
                        }
                    }

                    private void A0F(int i3) {
                        if (i3 == 127) {
                            this.A01.A09((char) 9835);
                        } else {
                            this.A01.A09((char) (i3 & 255));
                        }
                    }

                    private void A0G(int i3) {
                        this.A01.A09((char) (i3 & 255));
                    }

                    private void A0H(int i3) {
                        switch (i3) {
                            case 32:
                                G0 g02 = this.A01;
                                String[] strArr = A0A;
                                if (strArr[5].length() == strArr[7].length()) {
                                    String[] strArr2 = A0A;
                                    strArr2[0] = "YILzIjH";
                                    strArr2[3] = "ddyJCuS";
                                    g02.A09(' ');
                                    return;
                                }
                                break;
                            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                                this.A01.A09((char) 160);
                                return;
                            case 37:
                                this.A01.A09((char) 8230);
                                return;
                            case 42:
                                this.A01.A09((char) 352);
                                return;
                            case 44:
                                this.A01.A09((char) 338);
                                return;
                            case 48:
                                this.A01.A09((char) 9608);
                                return;
                            case 49:
                                this.A01.A09((char) 8216);
                                return;
                            case 50:
                                G0 g03 = this.A01;
                                String[] strArr3 = A0A;
                                if (strArr3[0].length() == strArr3[3].length()) {
                                    String[] strArr4 = A0A;
                                    strArr4[0] = "Xjh0Xhk";
                                    strArr4[3] = "lPudXCI";
                                    g03.A09((char) 8217);
                                    return;
                                }
                                break;
                            case 51:
                                this.A01.A09((char) 8220);
                                return;
                            case 52:
                                this.A01.A09((char) 8221);
                                return;
                            case 53:
                                this.A01.A09((char) 8226);
                                return;
                            case 57:
                                this.A01.A09((char) 8482);
                                return;
                            case 58:
                                this.A01.A09((char) 353);
                                return;
                            case Opcodes.V16 /* 60 */:
                                this.A01.A09((char) 339);
                                return;
                            case Opcodes.V17 /* 61 */:
                                this.A01.A09((char) 8480);
                                return;
                            case 63:
                                this.A01.A09((char) 376);
                                return;
                            case Opcodes.FNEG /* 118 */:
                                this.A01.A09((char) 8539);
                                return;
                            case Opcodes.DNEG /* 119 */:
                                this.A01.A09((char) 8540);
                                return;
                            case 120:
                                this.A01.A09((char) 8541);
                                return;
                            case Opcodes.LSHL /* 121 */:
                                this.A01.A09((char) 8542);
                                return;
                            case 122:
                                this.A01.A09((char) 9474);
                                return;
                            case Opcodes.LSHR /* 123 */:
                                this.A01.A09((char) 9488);
                                return;
                            case 124:
                                this.A01.A09((char) 9492);
                                return;
                            case Opcodes.LUSHR /* 125 */:
                                this.A01.A09((char) 9472);
                                return;
                            case 126:
                                this.A01.A09((char) 9496);
                                return;
                            case 127:
                                this.A01.A09((char) 9484);
                                return;
                            default:
                                Log.w(A00(80, 13, 68), A00(314, 22, 31) + i3);
                                return;
                        }
                        throw new RuntimeException();
                    }

                    private void A0I(int i3) {
                        if (i3 == 160) {
                            this.A01.A09((char) 13252);
                            return;
                        }
                        Log.w(A00(80, 13, 68), A00(336, 22, 15) + i3);
                        this.A01.A09('_');
                    }

                    @Override // com.instagram.common.viewpoint.core.DD
                    /* renamed from: A0L */
                    public final /* bridge */ /* synthetic */ DO A5Q() throws C0541Fu {
                        return super.A5Q();
                    }

                    @Override // com.instagram.common.viewpoint.core.DD
                    /* renamed from: A0M */
                    public final /* bridge */ /* synthetic */ DM A5R() throws C0541Fu {
                        return super.A5R();
                    }

                    @Override // com.instagram.common.viewpoint.core.DD
                    public final XN A0N() {
                        this.A04 = this.A03;
                        return new XN(this.A03);
                    }

                    @Override // com.instagram.common.viewpoint.core.DD
                    /* renamed from: A0O */
                    public final /* bridge */ /* synthetic */ void AEj(DO r1) throws C0541Fu {
                        super.AEj(r1);
                    }

                    @Override // com.instagram.common.viewpoint.core.DD
                    public final void A0P(DO r9) {
                        this.A07.A0b(r9.A01.array(), r9.A01.limit());
                        while (this.A07.A04() >= 3) {
                            int A0E = this.A07.A0E() & 7;
                            int ccType = A0E & 3;
                            int ccTypeAndValid = A0E & 4;
                            int ccTypeAndValid2 = ccTypeAndValid == 4 ? 1 : 0;
                            byte A0E2 = (byte) this.A07.A0E();
                            byte A0E3 = (byte) this.A07.A0E();
                            if (ccType == 2 || ccType == 3) {
                                if (ccTypeAndValid2 != 0) {
                                    if (ccType == 3) {
                                        A02();
                                        int sequenceNumber = (A0E2 & 192) >> 6;
                                        int ccTypeAndValid3 = A0E2 & Utf8.REPLACEMENT_BYTE;
                                        if (ccTypeAndValid3 == 0) {
                                            ccTypeAndValid3 = 64;
                                        }
                                        this.A02 = new G1(sequenceNumber, ccTypeAndValid3);
                                        byte[] bArr = this.A02.A03;
                                        G1 g12 = this.A02;
                                        int ccTypeAndValid4 = g12.A00;
                                        g12.A00 = ccTypeAndValid4 + 1;
                                        bArr[ccTypeAndValid4] = A0E3;
                                    } else {
                                        AbstractC0576Hf.A03(ccType == 2);
                                        if (this.A02 == null) {
                                            Log.e(A00(80, 13, 68), A00(219, 55, 49));
                                        } else {
                                            byte[] bArr2 = this.A02.A03;
                                            G1 g13 = this.A02;
                                            int ccTypeAndValid5 = g13.A00;
                                            g13.A00 = ccTypeAndValid5 + 1;
                                            bArr2[ccTypeAndValid5] = A0E2;
                                            byte[] bArr3 = this.A02.A03;
                                            G1 g14 = this.A02;
                                            int ccTypeAndValid6 = g14.A00;
                                            g14.A00 = ccTypeAndValid6 + 1;
                                            bArr3[ccTypeAndValid6] = A0E3;
                                        }
                                    }
                                    int ccTypeAndValid7 = this.A02.A00;
                                    if (ccTypeAndValid7 == (this.A02.A01 * 2) - 1) {
                                        A02();
                                    }
                                }
                            }
                        }
                    }

                    @Override // com.instagram.common.viewpoint.core.DD
                    public final boolean A0R() {
                        return this.A03 != this.A04;
                    }

                    @Override // com.instagram.common.viewpoint.core.DD, com.instagram.common.viewpoint.core.BG
                    public final /* bridge */ /* synthetic */ void AEy() {
                        super.AEy();
                    }

                    @Override // com.instagram.common.viewpoint.core.DD, com.instagram.common.viewpoint.core.XQ
                    public final /* bridge */ /* synthetic */ void AGb(long j2) {
                        super.AGb(j2);
                    }

                    @Override // com.instagram.common.viewpoint.core.DD, com.instagram.common.viewpoint.core.BG
                    public final void flush() {
                        super.flush();
                        this.A03 = null;
                        this.A04 = null;
                        this.A00 = 0;
                        this.A01 = this.A08[this.A00];
                        A08();
                        this.A02 = null;
                    }
                };
            case '\t':
                final List<byte[]> list2 = format.A0P;
                return new DP(list2) { // from class: com.facebook.ads.redexgen.X.4l
                    public static byte[] A01;
                    public final GC A00;

                    static {
                        A02();
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
                    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                     */
                    {
                        super(A01(0, 10, 34));
                        I4 i4 = new I4(list2.get(0));
                        this.A00 = new GC(i4.A0I(), i4.A0I());
                    }

                    public static String A01(int i3, int i4, int i5) {
                        byte[] copyOfRange = Arrays.copyOfRange(A01, i3, i3 + i4);
                        for (int i6 = 0; i6 < copyOfRange.length; i6++) {
                            copyOfRange[i6] = (byte) ((copyOfRange[i6] ^ i5) ^ 15);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A02() {
                        A01 = new byte[]{105, 91, 79, 105, 72, 78, 66, 73, 72, 95};
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.instagram.common.viewpoint.core.DP
                    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
                    public final XM A0b(byte[] bArr, int i3, boolean z2) {
                        if (z2) {
                            this.A00.A0J();
                        }
                        return new XM(this.A00.A0I(bArr, i3));
                    }
                };
            case '\n':
                return new DP() { // from class: com.facebook.ads.redexgen.X.4h
                    public static byte[] A05;
                    public static String[] A06 = {"UvMYifKJN5XlDmqCGtoDO0VU32zAs0FL", "LFobEXKDhJRa7BUCwy1CSsuZBtPalNbY", "ro3O9ZnhusAXVRGM6YuStMwfegsJiS0G", "gsFfqdBKr6navDc5yRQhzfKcOOsGbQ", "SHwoitQ0ze1bIMgolnOCecLrl", "CWI1un3bs31rMxD1NtaCqa2ehlmyLiT7", "lv3cYkOFFWI0GOqNSEdNKMwlCNEEK2B6", "PQFtR4q9OWZxFn8N6coU55QUIwEDXAuT"};
                    public int A00;
                    public Inflater A01;
                    public byte[] A02;
                    public final GD A03;
                    public final I4 A04;

                    public static String A01(int i3, int i4, int i5) {
                        byte[] copyOfRange = Arrays.copyOfRange(A05, i3, i3 + i4);
                        for (int i6 = 0; i6 < copyOfRange.length; i6++) {
                            copyOfRange[i6] = (byte) ((copyOfRange[i6] - i5) - 20);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A02() {
                        A05 = new byte[]{-74, -51, -39, -86, -53, -55, -43, -54, -53, -40};
                    }

                    static {
                        A02();
                    }

                    {
                        A01(0, 10, 82);
                        this.A04 = new I4();
                        this.A03 = new GD();
                    }

                    public static C0539Fs A00(I4 i4, GD gd) {
                        int limit = i4.A07();
                        int nextSectionPosition = i4.A0E();
                        int sectionLength = i4.A0I();
                        int sectionType = i4.A06() + sectionLength;
                        if (sectionType > limit) {
                            i4.A0Y(limit);
                            return null;
                        }
                        C0539Fs c0539Fs = null;
                        switch (nextSectionPosition) {
                            case 20:
                                gd.A05(i4, sectionLength);
                                break;
                            case 21:
                                gd.A03(i4, sectionLength);
                                break;
                            case 22:
                                gd.A04(i4, sectionLength);
                                break;
                            case 128:
                                c0539Fs = gd.A06();
                                gd.A07();
                                break;
                        }
                        i4.A0Y(sectionType);
                        return c0539Fs;
                    }

                    private boolean A03(byte[] bArr, int i3) {
                        if (i3 != 0) {
                            byte b2 = bArr[0];
                            if (A06[4].length() != 8) {
                                String[] strArr = A06;
                                strArr[5] = "6pK7fmhXCRN42blRkXgjJqqaTbJzjww9";
                                strArr[0] = "5cyMB82Qe4eQ9b0iXLvblRB56WWXPKQX";
                                if (b2 == 120) {
                                    if (this.A01 == null) {
                                        this.A01 = new Inflater();
                                        this.A02 = new byte[i3];
                                    }
                                    this.A00 = 0;
                                    if (A06[4].length() != 8) {
                                        String[] strArr2 = A06;
                                        strArr2[7] = "JfGFZwjGFYzvyVPtO8XWKYF6pfAF7Jfg";
                                        strArr2[1] = "RpDMGSzow5LfXP9Y2O2bh4szGjZC1AcN";
                                        this.A01.setInput(bArr, 0, i3);
                                        while (!this.A01.finished() && !this.A01.needsDictionary() && !this.A01.needsInput()) {
                                            try {
                                                if (this.A00 == this.A02.length) {
                                                    this.A02 = Arrays.copyOf(this.A02, this.A02.length * 2);
                                                }
                                                this.A00 += this.A01.inflate(this.A02, this.A00, this.A02.length - this.A00);
                                            } catch (DataFormatException unused) {
                                                Inflater inflater = this.A01;
                                                String[] strArr3 = A06;
                                                if (strArr3[2].charAt(2) != strArr3[6].charAt(2)) {
                                                    throw new RuntimeException();
                                                }
                                                String[] strArr4 = A06;
                                                strArr4[2] = "Dj3w457lu91y2nqDmk4H7qNB2BzBHZDv";
                                                strArr4[6] = "4Q3Gz3VI2xUNooldbcStPnBcvxw4W1CH";
                                                inflater.reset();
                                                return false;
                                            } catch (Throwable th) {
                                                this.A01.reset();
                                                throw th;
                                            }
                                        }
                                        boolean finished = this.A01.finished();
                                        this.A01.reset();
                                        return finished;
                                    }
                                }
                            }
                            throw new RuntimeException();
                        }
                        return false;
                    }

                    @Override // com.instagram.common.viewpoint.core.DP
                    public final InterfaceC0540Ft A0b(byte[] bArr, int i3, boolean z2) throws C0541Fu {
                        if (A03(bArr, i3)) {
                            this.A04.A0b(this.A02, this.A00);
                        } else {
                            this.A04.A0b(bArr, i3);
                        }
                        this.A03.A07();
                        ArrayList arrayList = new ArrayList();
                        while (this.A04.A04() >= 3) {
                            C0539Fs A002 = A00(this.A04, this.A03);
                            if (A002 != null) {
                                arrayList.add(A002);
                            }
                        }
                        return new XL(Collections.unmodifiableList(arrayList));
                    }
                };
            default:
                throw new IllegalArgumentException(A00(0, 50, 71));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0542Fv
    public final boolean AH7(Format format) {
        String str = format.A0O;
        String mimeType = A00(236, 8, 6);
        if (!mimeType.equals(str)) {
            String mimeType2 = A00(244, 10, 90);
            if (!mimeType2.equals(str)) {
                String mimeType3 = A00(122, 20, 83);
                if (!mimeType3.equals(str)) {
                    String mimeType4 = A00(Opcodes.GOTO, 21, 74);
                    if (!mimeType4.equals(str)) {
                        String mimeType5 = A00(216, 20, 32);
                        if (!mimeType5.equals(str)) {
                            String mimeType6 = A00(Opcodes.NEWARRAY, 28, 95);
                            if (!mimeType6.equals(str)) {
                                String mimeType7 = A00(50, 19, 95);
                                if (!mimeType7.equals(str)) {
                                    String mimeType8 = A00(Opcodes.D2I, 25, 58);
                                    if (!mimeType8.equals(str)) {
                                        String A002 = A00(69, 19, 40);
                                        if (A01[0].charAt(25) != '7') {
                                            throw new RuntimeException();
                                        }
                                        A01[6] = "W6hkZ8M6OfBj1T0wHxtu1K3YRZUS86qO";
                                        if (!A002.equals(str)) {
                                            String mimeType9 = A00(88, 19, 38);
                                            if (!mimeType9.equals(str)) {
                                                String mimeType10 = A00(107, 15, 111);
                                                if (!mimeType10.equals(str)) {
                                                    return false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
