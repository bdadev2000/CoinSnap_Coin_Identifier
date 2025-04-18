package com.applovin.impl;

import android.graphics.Color;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public abstract class s3 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f26408a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f26409b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f26410c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    private static final Map d;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        com.applovin.impl.adview.t.s(-984833, hashMap, "aliceblue", -332841, "antiquewhite");
        hashMap.put("aqua", -16711681);
        hashMap.put("aquamarine", -8388652);
        com.applovin.impl.adview.t.s(-983041, hashMap, "azure", -657956, "beige");
        com.applovin.impl.adview.t.s(-6972, hashMap, "bisque", -16777216, "black");
        com.applovin.impl.adview.t.s(-5171, hashMap, "blanchedalmond", -16776961, "blue");
        com.applovin.impl.adview.t.s(-7722014, hashMap, "blueviolet", -5952982, "brown");
        com.applovin.impl.adview.t.s(-2180985, hashMap, "burlywood", -10510688, "cadetblue");
        com.applovin.impl.adview.t.s(-8388864, hashMap, "chartreuse", -2987746, "chocolate");
        com.applovin.impl.adview.t.s(-32944, hashMap, "coral", -10185235, "cornflowerblue");
        com.applovin.impl.adview.t.s(-1828, hashMap, "cornsilk", -2354116, "crimson");
        hashMap.put("cyan", -16711681);
        hashMap.put("darkblue", -16777077);
        com.applovin.impl.adview.t.s(-16741493, hashMap, "darkcyan", -4684277, "darkgoldenrod");
        hashMap.put("darkgray", -5658199);
        hashMap.put("darkgreen", -16751616);
        hashMap.put("darkgrey", -5658199);
        hashMap.put("darkkhaki", -4343957);
        com.applovin.impl.adview.t.s(-7667573, hashMap, "darkmagenta", -11179217, "darkolivegreen");
        com.applovin.impl.adview.t.s(-29696, hashMap, "darkorange", -6737204, "darkorchid");
        com.applovin.impl.adview.t.s(-7667712, hashMap, "darkred", -1468806, "darksalmon");
        com.applovin.impl.adview.t.s(-7357297, hashMap, "darkseagreen", -12042869, "darkslateblue");
        hashMap.put("darkslategray", -13676721);
        hashMap.put("darkslategrey", -13676721);
        hashMap.put("darkturquoise", -16724271);
        hashMap.put("darkviolet", -7077677);
        com.applovin.impl.adview.t.s(-60269, hashMap, "deeppink", -16728065, "deepskyblue");
        hashMap.put("dimgray", -9868951);
        hashMap.put("dimgrey", -9868951);
        hashMap.put("dodgerblue", -14774017);
        hashMap.put("firebrick", -5103070);
        com.applovin.impl.adview.t.s(-1296, hashMap, "floralwhite", -14513374, "forestgreen");
        hashMap.put("fuchsia", -65281);
        hashMap.put("gainsboro", -2302756);
        com.applovin.impl.adview.t.s(-460545, hashMap, "ghostwhite", -10496, "gold");
        hashMap.put("goldenrod", -2448096);
        hashMap.put("gray", -8355712);
        com.applovin.impl.adview.t.s(-16744448, hashMap, "green", -5374161, "greenyellow");
        hashMap.put("grey", -8355712);
        hashMap.put("honeydew", -983056);
        com.applovin.impl.adview.t.s(-38476, hashMap, "hotpink", -3318692, "indianred");
        com.applovin.impl.adview.t.s(-11861886, hashMap, "indigo", -16, "ivory");
        com.applovin.impl.adview.t.s(-989556, hashMap, "khaki", -1644806, "lavender");
        com.applovin.impl.adview.t.s(-3851, hashMap, "lavenderblush", -8586240, "lawngreen");
        com.applovin.impl.adview.t.s(-1331, hashMap, "lemonchiffon", -5383962, "lightblue");
        com.applovin.impl.adview.t.s(-1015680, hashMap, "lightcoral", -2031617, "lightcyan");
        hashMap.put("lightgoldenrodyellow", -329006);
        hashMap.put("lightgray", -2894893);
        hashMap.put("lightgreen", -7278960);
        hashMap.put("lightgrey", -2894893);
        com.applovin.impl.adview.t.s(-18751, hashMap, "lightpink", -24454, "lightsalmon");
        com.applovin.impl.adview.t.s(-14634326, hashMap, "lightseagreen", -7876870, "lightskyblue");
        hashMap.put("lightslategray", -8943463);
        hashMap.put("lightslategrey", -8943463);
        hashMap.put("lightsteelblue", -5192482);
        hashMap.put("lightyellow", -32);
        com.applovin.impl.adview.t.s(-16711936, hashMap, "lime", -13447886, "limegreen");
        hashMap.put("linen", -331546);
        hashMap.put("magenta", -65281);
        com.applovin.impl.adview.t.s(-8388608, hashMap, "maroon", -10039894, "mediumaquamarine");
        com.applovin.impl.adview.t.s(-16777011, hashMap, "mediumblue", -4565549, "mediumorchid");
        com.applovin.impl.adview.t.s(-7114533, hashMap, "mediumpurple", -12799119, "mediumseagreen");
        com.applovin.impl.adview.t.s(-8689426, hashMap, "mediumslateblue", -16713062, "mediumspringgreen");
        com.applovin.impl.adview.t.s(-12004916, hashMap, "mediumturquoise", -3730043, "mediumvioletred");
        com.applovin.impl.adview.t.s(-15132304, hashMap, "midnightblue", -655366, "mintcream");
        com.applovin.impl.adview.t.s(-6943, hashMap, "mistyrose", -6987, "moccasin");
        com.applovin.impl.adview.t.s(-8531, hashMap, "navajowhite", -16777088, "navy");
        com.applovin.impl.adview.t.s(-133658, hashMap, "oldlace", -8355840, "olive");
        com.applovin.impl.adview.t.s(-9728477, hashMap, "olivedrab", -23296, "orange");
        com.applovin.impl.adview.t.s(-47872, hashMap, "orangered", -2461482, "orchid");
        com.applovin.impl.adview.t.s(-1120086, hashMap, "palegoldenrod", -6751336, "palegreen");
        com.applovin.impl.adview.t.s(-5247250, hashMap, "paleturquoise", -2396013, "palevioletred");
        com.applovin.impl.adview.t.s(-4139, hashMap, "papayawhip", -9543, "peachpuff");
        com.applovin.impl.adview.t.s(-3308225, hashMap, "peru", -16181, "pink");
        com.applovin.impl.adview.t.s(-2252579, hashMap, "plum", -5185306, "powderblue");
        com.applovin.impl.adview.t.s(-8388480, hashMap, "purple", -10079335, "rebeccapurple");
        com.applovin.impl.adview.t.s(Opcodes.V_PREVIEW, hashMap, "red", -4419697, "rosybrown");
        com.applovin.impl.adview.t.s(-12490271, hashMap, "royalblue", -7650029, "saddlebrown");
        com.applovin.impl.adview.t.s(-360334, hashMap, "salmon", -744352, "sandybrown");
        com.applovin.impl.adview.t.s(-13726889, hashMap, "seagreen", -2578, "seashell");
        com.applovin.impl.adview.t.s(-6270419, hashMap, "sienna", -4144960, "silver");
        com.applovin.impl.adview.t.s(-7876885, hashMap, "skyblue", -9807155, "slateblue");
        hashMap.put("slategray", -9404272);
        hashMap.put("slategrey", -9404272);
        hashMap.put("snow", -1286);
        hashMap.put("springgreen", -16711809);
        com.applovin.impl.adview.t.s(-12156236, hashMap, "steelblue", -2968436, "tan");
        com.applovin.impl.adview.t.s(-16744320, hashMap, "teal", -2572328, "thistle");
        com.applovin.impl.adview.t.s(-40121, hashMap, "tomato", 0, "transparent");
        com.applovin.impl.adview.t.s(-12525360, hashMap, "turquoise", -1146130, "violet");
        com.applovin.impl.adview.t.s(-663885, hashMap, "wheat", -1, "white");
        com.applovin.impl.adview.t.s(-657931, hashMap, "whitesmoke", -256, "yellow");
        hashMap.put("yellowgreen", -6632142);
    }

    private static int a(String str, boolean z2) {
        int parseInt;
        b1.a(!TextUtils.isEmpty(str));
        String replace = str.replace(" ", "");
        if (replace.charAt(0) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            if (replace.length() == 7) {
                return (-16777216) | parseLong;
            }
            if (replace.length() == 9) {
                return ((parseLong & 255) << 24) | (parseLong >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (replace.startsWith("rgba")) {
            Matcher matcher = (z2 ? f26410c : f26409b).matcher(replace);
            if (matcher.matches()) {
                if (z2) {
                    parseInt = (int) (Float.parseFloat((String) b1.a((Object) matcher.group(4))) * 255.0f);
                } else {
                    parseInt = Integer.parseInt((String) b1.a((Object) matcher.group(4)), 10);
                }
                return Color.argb(parseInt, Integer.parseInt((String) b1.a((Object) matcher.group(1)), 10), Integer.parseInt((String) b1.a((Object) matcher.group(2)), 10), Integer.parseInt((String) b1.a((Object) matcher.group(3)), 10));
            }
        } else if (replace.startsWith("rgb")) {
            Matcher matcher2 = f26408a.matcher(replace);
            if (matcher2.matches()) {
                return Color.rgb(Integer.parseInt((String) b1.a((Object) matcher2.group(1)), 10), Integer.parseInt((String) b1.a((Object) matcher2.group(2)), 10), Integer.parseInt((String) b1.a((Object) matcher2.group(3)), 10));
            }
        } else {
            Integer num = (Integer) d.get(Ascii.toLowerCase(replace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    public static int b(String str) {
        return a(str, false);
    }

    public static int a(String str) {
        return a(str, true);
    }
}
