package com.applovin.impl;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zk {

    /* renamed from: a, reason: collision with root package name */
    public final String f28351a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28352b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f28353c;
    public final float d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f28354f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f28355g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f28356h;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f28357a;

        /* renamed from: b, reason: collision with root package name */
        public final int f28358b;

        /* renamed from: c, reason: collision with root package name */
        public final int f28359c;
        public final int d;
        public final int e;

        /* renamed from: f, reason: collision with root package name */
        public final int f28360f;

        /* renamed from: g, reason: collision with root package name */
        public final int f28361g;

        /* renamed from: h, reason: collision with root package name */
        public final int f28362h;

        /* renamed from: i, reason: collision with root package name */
        public final int f28363i;

        private a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            this.f28357a = i2;
            this.f28358b = i3;
            this.f28359c = i4;
            this.d = i5;
            this.e = i6;
            this.f28360f = i7;
            this.f28361g = i8;
            this.f28362h = i9;
            this.f28363i = i10;
        }

        public static a a(String str) {
            char c2;
            String[] split = TextUtils.split(str.substring(7), ",");
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            for (int i10 = 0; i10 < split.length; i10++) {
                String lowerCase = Ascii.toLowerCase(split[i10].trim());
                lowerCase.getClass();
                switch (lowerCase.hashCode()) {
                    case -1178781136:
                        if (lowerCase.equals("italic")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -1026963764:
                        if (lowerCase.equals("underline")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -192095652:
                        if (lowerCase.equals("strikeout")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case -70925746:
                        if (lowerCase.equals("primarycolour")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 3029637:
                        if (lowerCase.equals("bold")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 3373707:
                        if (lowerCase.equals("name")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case 366554320:
                        if (lowerCase.equals("fontsize")) {
                            c2 = 6;
                            break;
                        }
                        break;
                    case 1767875043:
                        if (lowerCase.equals("alignment")) {
                            c2 = 7;
                            break;
                        }
                        break;
                }
                c2 = 65535;
                switch (c2) {
                    case 0:
                        i7 = i10;
                        break;
                    case 1:
                        i8 = i10;
                        break;
                    case 2:
                        i9 = i10;
                        break;
                    case 3:
                        i4 = i10;
                        break;
                    case 4:
                        i6 = i10;
                        break;
                    case 5:
                        i2 = i10;
                        break;
                    case 6:
                        i5 = i10;
                        break;
                    case 7:
                        i3 = i10;
                        break;
                }
            }
            if (i2 != -1) {
                return new a(i2, i3, i4, i5, i6, i7, i8, i9, split.length);
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        private static final Pattern f28364c = Pattern.compile("\\{([^}]*)\\}");
        private static final Pattern d = Pattern.compile(xp.a("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        private static final Pattern e = Pattern.compile(xp.a("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f, reason: collision with root package name */
        private static final Pattern f28365f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a, reason: collision with root package name */
        public final int f28366a;

        /* renamed from: b, reason: collision with root package name */
        public final PointF f28367b;

        private b(int i2, PointF pointF) {
            this.f28366a = i2;
            this.f28367b = pointF;
        }

        private static int a(String str) {
            Matcher matcher = f28365f.matcher(str);
            if (matcher.find()) {
                return zk.b((String) b1.a((Object) matcher.group(1)));
            }
            return -1;
        }

        public static b b(String str) {
            Matcher matcher = f28364c.matcher(str);
            PointF pointF = null;
            int i2 = -1;
            while (matcher.find()) {
                String str2 = (String) b1.a((Object) matcher.group(1));
                try {
                    PointF c2 = c(str2);
                    if (c2 != null) {
                        pointF = c2;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int a2 = a(str2);
                    if (a2 != -1) {
                        i2 = a2;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i2, pointF);
        }

        private static PointF c(String str) {
            String group;
            String group2;
            Matcher matcher = d.matcher(str);
            Matcher matcher2 = e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    pc.c("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else {
                if (!find2) {
                    return null;
                }
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) b1.a((Object) group)).trim()), Float.parseFloat(((String) b1.a((Object) group2)).trim()));
        }

        public static String d(String str) {
            return f28364c.matcher(str).replaceAll("");
        }
    }

    private zk(String str, int i2, Integer num, float f2, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f28351a = str;
        this.f28352b = i2;
        this.f28353c = num;
        this.d = f2;
        this.e = z2;
        this.f28354f = z3;
        this.f28355g = z4;
        this.f28356h = z5;
    }

    private static boolean a(int i2) {
        switch (i2) {
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
        androidx.compose.foundation.text.input.a.x("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    private static boolean c(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            pc.c("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    public static Integer d(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            b1.a(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(ub.a(((parseLong >> 24) & 255) ^ 255), ub.a(parseLong & 255), ub.a((parseLong >> 8) & 255), ub.a((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            pc.c("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    private static float e(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            pc.c("SsaStyle", "Failed to parse font size: '" + str + "'", e);
            return -3.4028235E38f;
        }
    }

    public static zk a(String str, a aVar) {
        b1.a(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i2 = aVar.f28363i;
        if (length != i2) {
            pc.d("SsaStyle", xp.a("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i2), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[aVar.f28357a].trim();
            int i3 = aVar.f28358b;
            int b2 = i3 != -1 ? b(split[i3].trim()) : -1;
            int i4 = aVar.f28359c;
            Integer d = i4 != -1 ? d(split[i4].trim()) : null;
            int i5 = aVar.d;
            float e = i5 != -1 ? e(split[i5].trim()) : -3.4028235E38f;
            int i6 = aVar.e;
            boolean z2 = i6 != -1 && c(split[i6].trim());
            int i7 = aVar.f28360f;
            boolean z3 = i7 != -1 && c(split[i7].trim());
            int i8 = aVar.f28361g;
            boolean z4 = i8 != -1 && c(split[i8].trim());
            int i9 = aVar.f28362h;
            return new zk(trim, b2, d, e, z2, z3, z4, i9 != -1 && c(split[i9].trim()));
        } catch (RuntimeException e2) {
            pc.c("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e2);
            return null;
        }
    }
}
