package com.applovin.impl;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class wk {

    /* renamed from: a, reason: collision with root package name */
    public final String f11994a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f11995c;

    /* renamed from: d, reason: collision with root package name */
    public final float f11996d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11997e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11998f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11999g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f12000h;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f12001a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final int f12002c;

        /* renamed from: d, reason: collision with root package name */
        public final int f12003d;

        /* renamed from: e, reason: collision with root package name */
        public final int f12004e;

        /* renamed from: f, reason: collision with root package name */
        public final int f12005f;

        /* renamed from: g, reason: collision with root package name */
        public final int f12006g;

        /* renamed from: h, reason: collision with root package name */
        public final int f12007h;

        /* renamed from: i, reason: collision with root package name */
        public final int f12008i;

        private a(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f12001a = i9;
            this.b = i10;
            this.f12002c = i11;
            this.f12003d = i12;
            this.f12004e = i13;
            this.f12005f = i14;
            this.f12006g = i15;
            this.f12007h = i16;
            this.f12008i = i17;
        }

        public static a a(String str) {
            char c9;
            String[] split = TextUtils.split(str.substring(7), ",");
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            for (int i17 = 0; i17 < split.length; i17++) {
                String lowerCase = Ascii.toLowerCase(split[i17].trim());
                lowerCase.getClass();
                switch (lowerCase.hashCode()) {
                    case -1178781136:
                        if (lowerCase.equals(TtmlNode.ITALIC)) {
                            c9 = 0;
                            break;
                        }
                        break;
                    case -1026963764:
                        if (lowerCase.equals(TtmlNode.UNDERLINE)) {
                            c9 = 1;
                            break;
                        }
                        break;
                    case -192095652:
                        if (lowerCase.equals("strikeout")) {
                            c9 = 2;
                            break;
                        }
                        break;
                    case -70925746:
                        if (lowerCase.equals("primarycolour")) {
                            c9 = 3;
                            break;
                        }
                        break;
                    case 3029637:
                        if (lowerCase.equals(TtmlNode.BOLD)) {
                            c9 = 4;
                            break;
                        }
                        break;
                    case 3373707:
                        if (lowerCase.equals("name")) {
                            c9 = 5;
                            break;
                        }
                        break;
                    case 366554320:
                        if (lowerCase.equals("fontsize")) {
                            c9 = 6;
                            break;
                        }
                        break;
                    case 1767875043:
                        if (lowerCase.equals("alignment")) {
                            c9 = 7;
                            break;
                        }
                        break;
                }
                c9 = 65535;
                switch (c9) {
                    case 0:
                        i14 = i17;
                        break;
                    case 1:
                        i15 = i17;
                        break;
                    case 2:
                        i16 = i17;
                        break;
                    case 3:
                        i11 = i17;
                        break;
                    case 4:
                        i13 = i17;
                        break;
                    case 5:
                        i9 = i17;
                        break;
                    case 6:
                        i12 = i17;
                        break;
                    case 7:
                        i10 = i17;
                        break;
                }
            }
            if (i9 != -1) {
                return new a(i9, i10, i11, i12, i13, i14, i15, i16, split.length);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        private static final Pattern f12009c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d, reason: collision with root package name */
        private static final Pattern f12010d = Pattern.compile(yp.a("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e, reason: collision with root package name */
        private static final Pattern f12011e = Pattern.compile(yp.a("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f, reason: collision with root package name */
        private static final Pattern f12012f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a, reason: collision with root package name */
        public final int f12013a;
        public final PointF b;

        private b(int i9, PointF pointF) {
            this.f12013a = i9;
            this.b = pointF;
        }

        private static int a(String str) {
            Matcher matcher = f12012f.matcher(str);
            if (matcher.find()) {
                return wk.b((String) AbstractC0669a1.a((Object) matcher.group(1)));
            }
            return -1;
        }

        public static b b(String str) {
            Matcher matcher = f12009c.matcher(str);
            PointF pointF = null;
            int i9 = -1;
            while (matcher.find()) {
                String str2 = (String) AbstractC0669a1.a((Object) matcher.group(1));
                try {
                    PointF c9 = c(str2);
                    if (c9 != null) {
                        pointF = c9;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int a6 = a(str2);
                    if (a6 != -1) {
                        i9 = a6;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i9, pointF);
        }

        private static PointF c(String str) {
            String group;
            String group2;
            Matcher matcher = f12010d.matcher(str);
            Matcher matcher2 = f12011e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    kc.c("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else if (find2) {
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            } else {
                return null;
            }
            return new PointF(Float.parseFloat(((String) AbstractC0669a1.a((Object) group)).trim()), Float.parseFloat(((String) AbstractC0669a1.a((Object) group2)).trim()));
        }

        public static String d(String str) {
            return f12009c.matcher(str).replaceAll("");
        }
    }

    private wk(String str, int i9, Integer num, float f9, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.f11994a = str;
        this.b = i9;
        this.f11995c = num;
        this.f11996d = f9;
        this.f11997e = z8;
        this.f11998f = z9;
        this.f11999g = z10;
        this.f12000h = z11;
    }

    private static boolean a(int i9) {
        switch (i9) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (a(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        L.u("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    private static boolean c(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt != 1 && parseInt != -1) {
                return false;
            }
            return true;
        } catch (NumberFormatException e4) {
            kc.c("SsaStyle", "Failed to parse boolean value: '" + str + "'", e4);
            return false;
        }
    }

    public static Integer d(String str) {
        long parseLong;
        boolean z8;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            if (parseLong <= 4294967295L) {
                z8 = true;
            } else {
                z8 = false;
            }
            AbstractC0669a1.a(z8);
            return Integer.valueOf(Color.argb(pb.a(((parseLong >> 24) & 255) ^ 255), pb.a(parseLong & 255), pb.a((parseLong >> 8) & 255), pb.a((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e4) {
            kc.c("SsaStyle", "Failed to parse color expression: '" + str + "'", e4);
            return null;
        }
    }

    private static float e(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e4) {
            kc.c("SsaStyle", "Failed to parse font size: '" + str + "'", e4);
            return -3.4028235E38f;
        }
    }

    public static wk a(String str, a aVar) {
        AbstractC0669a1.a(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i9 = aVar.f12008i;
        if (length != i9) {
            kc.d("SsaStyle", yp.a("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i9), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[aVar.f12001a].trim();
            int i10 = aVar.b;
            int b8 = i10 != -1 ? b(split[i10].trim()) : -1;
            int i11 = aVar.f12002c;
            Integer d2 = i11 != -1 ? d(split[i11].trim()) : null;
            int i12 = aVar.f12003d;
            float e4 = i12 != -1 ? e(split[i12].trim()) : -3.4028235E38f;
            int i13 = aVar.f12004e;
            boolean z8 = i13 != -1 && c(split[i13].trim());
            int i14 = aVar.f12005f;
            boolean z9 = i14 != -1 && c(split[i14].trim());
            int i15 = aVar.f12006g;
            boolean z10 = i15 != -1 && c(split[i15].trim());
            int i16 = aVar.f12007h;
            return new wk(trim, b8, d2, e4, z8, z9, z10, i16 != -1 && c(split[i16].trim()));
        } catch (RuntimeException e9) {
            kc.c("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e9);
            return null;
        }
    }
}
