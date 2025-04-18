package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import com.applovin.impl.adview.t;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public final class zzdl {
    private static final Pattern zza = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern zzb = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern zzc = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    private static final Map zzd;

    static {
        HashMap hashMap = new HashMap();
        zzd = hashMap;
        t.B(-984833, hashMap, "aliceblue", -332841, "antiquewhite");
        hashMap.put("aqua", -16711681);
        hashMap.put("aquamarine", -8388652);
        t.B(-983041, hashMap, "azure", -657956, "beige");
        t.B(-6972, hashMap, "bisque", -16777216, "black");
        t.B(-5171, hashMap, "blanchedalmond", -16776961, "blue");
        t.B(-7722014, hashMap, "blueviolet", -5952982, "brown");
        t.B(-2180985, hashMap, "burlywood", -10510688, "cadetblue");
        t.B(-8388864, hashMap, "chartreuse", -2987746, "chocolate");
        t.B(-32944, hashMap, "coral", -10185235, "cornflowerblue");
        t.B(-1828, hashMap, "cornsilk", -2354116, "crimson");
        hashMap.put("cyan", -16711681);
        hashMap.put("darkblue", -16777077);
        t.B(-16741493, hashMap, "darkcyan", -4684277, "darkgoldenrod");
        hashMap.put("darkgray", -5658199);
        hashMap.put("darkgreen", -16751616);
        hashMap.put("darkgrey", -5658199);
        hashMap.put("darkkhaki", -4343957);
        t.B(-7667573, hashMap, "darkmagenta", -11179217, "darkolivegreen");
        t.B(-29696, hashMap, "darkorange", -6737204, "darkorchid");
        t.B(-7667712, hashMap, "darkred", -1468806, "darksalmon");
        t.B(-7357297, hashMap, "darkseagreen", -12042869, "darkslateblue");
        hashMap.put("darkslategray", -13676721);
        hashMap.put("darkslategrey", -13676721);
        hashMap.put("darkturquoise", -16724271);
        hashMap.put("darkviolet", -7077677);
        t.B(-60269, hashMap, "deeppink", -16728065, "deepskyblue");
        hashMap.put("dimgray", -9868951);
        hashMap.put("dimgrey", -9868951);
        hashMap.put("dodgerblue", -14774017);
        hashMap.put("firebrick", -5103070);
        t.B(-1296, hashMap, "floralwhite", -14513374, "forestgreen");
        hashMap.put("fuchsia", -65281);
        hashMap.put("gainsboro", -2302756);
        t.B(-460545, hashMap, "ghostwhite", -10496, "gold");
        hashMap.put("goldenrod", -2448096);
        hashMap.put("gray", -8355712);
        t.B(-16744448, hashMap, "green", -5374161, "greenyellow");
        hashMap.put("grey", -8355712);
        hashMap.put("honeydew", -983056);
        t.B(-38476, hashMap, "hotpink", -3318692, "indianred");
        t.B(-11861886, hashMap, "indigo", -16, "ivory");
        t.B(-989556, hashMap, "khaki", -1644806, "lavender");
        t.B(-3851, hashMap, "lavenderblush", -8586240, "lawngreen");
        t.B(-1331, hashMap, "lemonchiffon", -5383962, "lightblue");
        t.B(-1015680, hashMap, "lightcoral", -2031617, "lightcyan");
        hashMap.put("lightgoldenrodyellow", -329006);
        hashMap.put("lightgray", -2894893);
        hashMap.put("lightgreen", -7278960);
        hashMap.put("lightgrey", -2894893);
        t.B(-18751, hashMap, "lightpink", -24454, "lightsalmon");
        t.B(-14634326, hashMap, "lightseagreen", -7876870, "lightskyblue");
        hashMap.put("lightslategray", -8943463);
        hashMap.put("lightslategrey", -8943463);
        hashMap.put("lightsteelblue", -5192482);
        hashMap.put("lightyellow", -32);
        t.B(-16711936, hashMap, "lime", -13447886, "limegreen");
        hashMap.put("linen", -331546);
        hashMap.put("magenta", -65281);
        t.B(-8388608, hashMap, "maroon", -10039894, "mediumaquamarine");
        t.B(-16777011, hashMap, "mediumblue", -4565549, "mediumorchid");
        t.B(-7114533, hashMap, "mediumpurple", -12799119, "mediumseagreen");
        t.B(-8689426, hashMap, "mediumslateblue", -16713062, "mediumspringgreen");
        t.B(-12004916, hashMap, "mediumturquoise", -3730043, "mediumvioletred");
        t.B(-15132304, hashMap, "midnightblue", -655366, "mintcream");
        t.B(-6943, hashMap, "mistyrose", -6987, "moccasin");
        t.B(-8531, hashMap, "navajowhite", -16777088, "navy");
        t.B(-133658, hashMap, "oldlace", -8355840, "olive");
        t.B(-9728477, hashMap, "olivedrab", -23296, "orange");
        t.B(-47872, hashMap, "orangered", -2461482, "orchid");
        t.B(-1120086, hashMap, "palegoldenrod", -6751336, "palegreen");
        t.B(-5247250, hashMap, "paleturquoise", -2396013, "palevioletred");
        t.B(-4139, hashMap, "papayawhip", -9543, "peachpuff");
        t.B(-3308225, hashMap, "peru", -16181, "pink");
        t.B(-2252579, hashMap, "plum", -5185306, "powderblue");
        t.B(-8388480, hashMap, "purple", -10079335, "rebeccapurple");
        t.B(Opcodes.V_PREVIEW, hashMap, "red", -4419697, "rosybrown");
        t.B(-12490271, hashMap, "royalblue", -7650029, "saddlebrown");
        t.B(-360334, hashMap, "salmon", -744352, "sandybrown");
        t.B(-13726889, hashMap, "seagreen", -2578, "seashell");
        t.B(-6270419, hashMap, "sienna", -4144960, "silver");
        t.B(-7876885, hashMap, "skyblue", -9807155, "slateblue");
        hashMap.put("slategray", -9404272);
        hashMap.put("slategrey", -9404272);
        hashMap.put("snow", -1286);
        hashMap.put("springgreen", -16711809);
        t.B(-12156236, hashMap, "steelblue", -2968436, "tan");
        t.B(-16744320, hashMap, "teal", -2572328, "thistle");
        t.B(-40121, hashMap, "tomato", 0, "transparent");
        t.B(-12525360, hashMap, "turquoise", -1146130, "violet");
        t.B(-663885, hashMap, "wheat", -1, "white");
        t.B(-657931, hashMap, "whitesmoke", -256, "yellow");
        hashMap.put("yellowgreen", -6632142);
    }

    @ColorInt
    public static int zza(String str) {
        return zzc(str, true);
    }

    @ColorInt
    public static int zzb(String str) {
        return zzc(str, false);
    }

    @ColorInt
    private static int zzc(String str, boolean z2) {
        int parseInt;
        zzdi.zzd(!TextUtils.isEmpty(str));
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
            Matcher matcher = (z2 ? zzc : zzb).matcher(replace);
            if (matcher.matches()) {
                if (z2) {
                    String group = matcher.group(4);
                    group.getClass();
                    parseInt = (int) (Float.parseFloat(group) * 255.0f);
                } else {
                    String group2 = matcher.group(4);
                    group2.getClass();
                    parseInt = Integer.parseInt(group2, 10);
                }
                String group3 = matcher.group(1);
                group3.getClass();
                int parseInt2 = Integer.parseInt(group3, 10);
                String group4 = matcher.group(2);
                group4.getClass();
                int parseInt3 = Integer.parseInt(group4, 10);
                String group5 = matcher.group(3);
                group5.getClass();
                return Color.argb(parseInt, parseInt2, parseInt3, Integer.parseInt(group5, 10));
            }
        } else if (replace.startsWith("rgb")) {
            Matcher matcher2 = zza.matcher(replace);
            if (matcher2.matches()) {
                String group6 = matcher2.group(1);
                group6.getClass();
                int parseInt4 = Integer.parseInt(group6, 10);
                String group7 = matcher2.group(2);
                group7.getClass();
                int parseInt5 = Integer.parseInt(group7, 10);
                String group8 = matcher2.group(3);
                group8.getClass();
                return Color.rgb(parseInt4, parseInt5, Integer.parseInt(group8, 10));
            }
        } else {
            Integer num = (Integer) zzd.get(zzfxi.zza(replace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
