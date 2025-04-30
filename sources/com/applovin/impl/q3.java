package com.applovin.impl;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class q3 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f10130a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f10131c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* renamed from: d, reason: collision with root package name */
    private static final Map f10132d;

    static {
        HashMap hashMap = new HashMap();
        f10132d = hashMap;
        L.q(-984833, hashMap, "aliceblue", -332841, "antiquewhite");
        hashMap.put("aqua", -16711681);
        hashMap.put("aquamarine", -8388652);
        L.q(-983041, hashMap, "azure", -657956, "beige");
        L.q(-6972, hashMap, "bisque", ViewCompat.MEASURED_STATE_MASK, "black");
        L.q(-5171, hashMap, "blanchedalmond", -16776961, "blue");
        L.q(-7722014, hashMap, "blueviolet", -5952982, "brown");
        L.q(-2180985, hashMap, "burlywood", -10510688, "cadetblue");
        L.q(-8388864, hashMap, "chartreuse", -2987746, "chocolate");
        L.q(-32944, hashMap, "coral", -10185235, "cornflowerblue");
        L.q(-1828, hashMap, "cornsilk", -2354116, "crimson");
        hashMap.put("cyan", -16711681);
        hashMap.put("darkblue", -16777077);
        L.q(-16741493, hashMap, "darkcyan", -4684277, "darkgoldenrod");
        hashMap.put("darkgray", -5658199);
        hashMap.put("darkgreen", -16751616);
        hashMap.put("darkgrey", -5658199);
        hashMap.put("darkkhaki", -4343957);
        L.q(-7667573, hashMap, "darkmagenta", -11179217, "darkolivegreen");
        L.q(-29696, hashMap, "darkorange", -6737204, "darkorchid");
        L.q(-7667712, hashMap, "darkred", -1468806, "darksalmon");
        L.q(-7357297, hashMap, "darkseagreen", -12042869, "darkslateblue");
        hashMap.put("darkslategray", -13676721);
        hashMap.put("darkslategrey", -13676721);
        hashMap.put("darkturquoise", -16724271);
        hashMap.put("darkviolet", -7077677);
        L.q(-60269, hashMap, "deeppink", -16728065, "deepskyblue");
        hashMap.put("dimgray", -9868951);
        hashMap.put("dimgrey", -9868951);
        hashMap.put("dodgerblue", -14774017);
        hashMap.put("firebrick", -5103070);
        L.q(-1296, hashMap, "floralwhite", -14513374, "forestgreen");
        hashMap.put("fuchsia", -65281);
        hashMap.put("gainsboro", -2302756);
        L.q(-460545, hashMap, "ghostwhite", -10496, "gold");
        hashMap.put("goldenrod", -2448096);
        hashMap.put("gray", -8355712);
        L.q(-16744448, hashMap, "green", -5374161, "greenyellow");
        hashMap.put("grey", -8355712);
        hashMap.put("honeydew", -983056);
        L.q(-38476, hashMap, "hotpink", -3318692, "indianred");
        L.q(-11861886, hashMap, "indigo", -16, "ivory");
        L.q(-989556, hashMap, "khaki", -1644806, "lavender");
        L.q(-3851, hashMap, "lavenderblush", -8586240, "lawngreen");
        L.q(-1331, hashMap, "lemonchiffon", -5383962, "lightblue");
        L.q(-1015680, hashMap, "lightcoral", -2031617, "lightcyan");
        hashMap.put("lightgoldenrodyellow", -329006);
        hashMap.put("lightgray", -2894893);
        hashMap.put("lightgreen", -7278960);
        hashMap.put("lightgrey", -2894893);
        L.q(-18751, hashMap, "lightpink", -24454, "lightsalmon");
        L.q(-14634326, hashMap, "lightseagreen", -7876870, "lightskyblue");
        hashMap.put("lightslategray", -8943463);
        hashMap.put("lightslategrey", -8943463);
        hashMap.put("lightsteelblue", -5192482);
        hashMap.put("lightyellow", -32);
        L.q(-16711936, hashMap, "lime", -13447886, "limegreen");
        hashMap.put("linen", -331546);
        hashMap.put("magenta", -65281);
        L.q(-8388608, hashMap, "maroon", -10039894, "mediumaquamarine");
        L.q(-16777011, hashMap, "mediumblue", -4565549, "mediumorchid");
        L.q(-7114533, hashMap, "mediumpurple", -12799119, "mediumseagreen");
        L.q(-8689426, hashMap, "mediumslateblue", -16713062, "mediumspringgreen");
        L.q(-12004916, hashMap, "mediumturquoise", -3730043, "mediumvioletred");
        L.q(-15132304, hashMap, "midnightblue", -655366, "mintcream");
        L.q(-6943, hashMap, "mistyrose", -6987, "moccasin");
        L.q(-8531, hashMap, "navajowhite", -16777088, "navy");
        L.q(-133658, hashMap, "oldlace", -8355840, "olive");
        L.q(-9728477, hashMap, "olivedrab", -23296, "orange");
        L.q(-47872, hashMap, "orangered", -2461482, "orchid");
        L.q(-1120086, hashMap, "palegoldenrod", -6751336, "palegreen");
        L.q(-5247250, hashMap, "paleturquoise", -2396013, "palevioletred");
        L.q(-4139, hashMap, "papayawhip", -9543, "peachpuff");
        L.q(-3308225, hashMap, "peru", -16181, "pink");
        L.q(-2252579, hashMap, "plum", -5185306, "powderblue");
        L.q(-8388480, hashMap, "purple", -10079335, "rebeccapurple");
        L.q(-65536, hashMap, "red", -4419697, "rosybrown");
        L.q(-12490271, hashMap, "royalblue", -7650029, "saddlebrown");
        L.q(-360334, hashMap, "salmon", -744352, "sandybrown");
        L.q(-13726889, hashMap, "seagreen", -2578, "seashell");
        L.q(-6270419, hashMap, "sienna", -4144960, "silver");
        L.q(-7876885, hashMap, "skyblue", -9807155, "slateblue");
        hashMap.put("slategray", -9404272);
        hashMap.put("slategrey", -9404272);
        hashMap.put("snow", -1286);
        hashMap.put("springgreen", -16711809);
        L.q(-12156236, hashMap, "steelblue", -2968436, "tan");
        L.q(-16744320, hashMap, "teal", -2572328, "thistle");
        L.q(-40121, hashMap, "tomato", 0, "transparent");
        L.q(-12525360, hashMap, "turquoise", -1146130, "violet");
        L.q(-663885, hashMap, "wheat", -1, "white");
        L.q(-657931, hashMap, "whitesmoke", -256, "yellow");
        hashMap.put("yellowgreen", -6632142);
    }

    private static int a(String str, boolean z8) {
        int parseInt;
        AbstractC0669a1.a(!TextUtils.isEmpty(str));
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
            Matcher matcher = (z8 ? f10131c : b).matcher(replace);
            if (matcher.matches()) {
                if (z8) {
                    parseInt = (int) (Float.parseFloat((String) AbstractC0669a1.a((Object) matcher.group(4))) * 255.0f);
                } else {
                    parseInt = Integer.parseInt((String) AbstractC0669a1.a((Object) matcher.group(4)), 10);
                }
                return Color.argb(parseInt, Integer.parseInt((String) AbstractC0669a1.a((Object) matcher.group(1)), 10), Integer.parseInt((String) AbstractC0669a1.a((Object) matcher.group(2)), 10), Integer.parseInt((String) AbstractC0669a1.a((Object) matcher.group(3)), 10));
            }
        } else if (replace.startsWith("rgb")) {
            Matcher matcher2 = f10130a.matcher(replace);
            if (matcher2.matches()) {
                return Color.rgb(Integer.parseInt((String) AbstractC0669a1.a((Object) matcher2.group(1)), 10), Integer.parseInt((String) AbstractC0669a1.a((Object) matcher2.group(2)), 10), Integer.parseInt((String) AbstractC0669a1.a((Object) matcher2.group(3)), 10));
            }
        } else {
            Integer num = (Integer) f10132d.get(Ascii.toLowerCase(replace));
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
