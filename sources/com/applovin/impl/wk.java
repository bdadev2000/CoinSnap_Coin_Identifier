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
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8781b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f8782c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8783d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8784e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8785f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8786g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f8787h;

    /* loaded from: classes.dex */
    public static final class a {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8788b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8789c;

        /* renamed from: d, reason: collision with root package name */
        public final int f8790d;

        /* renamed from: e, reason: collision with root package name */
        public final int f8791e;

        /* renamed from: f, reason: collision with root package name */
        public final int f8792f;

        /* renamed from: g, reason: collision with root package name */
        public final int f8793g;

        /* renamed from: h, reason: collision with root package name */
        public final int f8794h;

        /* renamed from: i, reason: collision with root package name */
        public final int f8795i;

        private a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.a = i10;
            this.f8788b = i11;
            this.f8789c = i12;
            this.f8790d = i13;
            this.f8791e = i14;
            this.f8792f = i15;
            this.f8793g = i16;
            this.f8794h = i17;
            this.f8795i = i18;
        }

        public static a a(String str) {
            char c10;
            String[] split = TextUtils.split(str.substring(7), ",");
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            for (int i18 = 0; i18 < split.length; i18++) {
                String lowerCase = Ascii.toLowerCase(split[i18].trim());
                lowerCase.getClass();
                switch (lowerCase.hashCode()) {
                    case -1178781136:
                        if (lowerCase.equals(TtmlNode.ITALIC)) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1026963764:
                        if (lowerCase.equals(TtmlNode.UNDERLINE)) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -192095652:
                        if (lowerCase.equals("strikeout")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -70925746:
                        if (lowerCase.equals("primarycolour")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 3029637:
                        if (lowerCase.equals(TtmlNode.BOLD)) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 3373707:
                        if (lowerCase.equals("name")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 366554320:
                        if (lowerCase.equals("fontsize")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case 1767875043:
                        if (lowerCase.equals("alignment")) {
                            c10 = 7;
                            break;
                        }
                        break;
                }
                c10 = 65535;
                switch (c10) {
                    case 0:
                        i15 = i18;
                        break;
                    case 1:
                        i16 = i18;
                        break;
                    case 2:
                        i17 = i18;
                        break;
                    case 3:
                        i12 = i18;
                        break;
                    case 4:
                        i14 = i18;
                        break;
                    case 5:
                        i10 = i18;
                        break;
                    case 6:
                        i13 = i18;
                        break;
                    case 7:
                        i11 = i18;
                        break;
                }
            }
            if (i10 != -1) {
                return new a(i10, i11, i12, i13, i14, i15, i16, i17, split.length);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        private static final Pattern f8796c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d, reason: collision with root package name */
        private static final Pattern f8797d = Pattern.compile(yp.a("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e, reason: collision with root package name */
        private static final Pattern f8798e = Pattern.compile(yp.a("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f, reason: collision with root package name */
        private static final Pattern f8799f = Pattern.compile("\\\\an(\\d+)");
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final PointF f8800b;

        private b(int i10, PointF pointF) {
            this.a = i10;
            this.f8800b = pointF;
        }

        private static int a(String str) {
            Matcher matcher = f8799f.matcher(str);
            if (matcher.find()) {
                return wk.b((String) a1.a((Object) matcher.group(1)));
            }
            return -1;
        }

        public static b b(String str) {
            Matcher matcher = f8796c.matcher(str);
            PointF pointF = null;
            int i10 = -1;
            while (matcher.find()) {
                String str2 = (String) a1.a((Object) matcher.group(1));
                try {
                    PointF c10 = c(str2);
                    if (c10 != null) {
                        pointF = c10;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int a = a(str2);
                    if (a != -1) {
                        i10 = a;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i10, pointF);
        }

        private static PointF c(String str) {
            String group;
            String group2;
            Matcher matcher = f8797d.matcher(str);
            Matcher matcher2 = f8798e.matcher(str);
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
            return new PointF(Float.parseFloat(((String) a1.a((Object) group)).trim()), Float.parseFloat(((String) a1.a((Object) group2)).trim()));
        }

        public static String d(String str) {
            return f8796c.matcher(str).replaceAll("");
        }
    }

    private wk(String str, int i10, Integer num, float f10, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.a = str;
        this.f8781b = i10;
        this.f8782c = num;
        this.f8783d = f10;
        this.f8784e = z10;
        this.f8785f = z11;
        this.f8786g = z12;
        this.f8787h = z13;
    }

    private static boolean a(int i10) {
        switch (i10) {
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
        a4.j.w("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    private static boolean c(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt != 1 && parseInt != -1) {
                return false;
            }
            return true;
        } catch (NumberFormatException e2) {
            kc.c("SsaStyle", "Failed to parse boolean value: '" + str + "'", e2);
            return false;
        }
    }

    public static Integer d(String str) {
        long parseLong;
        boolean z10;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            if (parseLong <= 4294967295L) {
                z10 = true;
            } else {
                z10 = false;
            }
            a1.a(z10);
            return Integer.valueOf(Color.argb(pb.a(((parseLong >> 24) & 255) ^ 255), pb.a(parseLong & 255), pb.a((parseLong >> 8) & 255), pb.a((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e2) {
            kc.c("SsaStyle", "Failed to parse color expression: '" + str + "'", e2);
            return null;
        }
    }

    private static float e(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e2) {
            kc.c("SsaStyle", "Failed to parse font size: '" + str + "'", e2);
            return -3.4028235E38f;
        }
    }

    public static wk a(String str, a aVar) {
        a1.a(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i10 = aVar.f8795i;
        if (length != i10) {
            kc.d("SsaStyle", yp.a("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i10), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[aVar.a].trim();
            int i11 = aVar.f8788b;
            int b3 = i11 != -1 ? b(split[i11].trim()) : -1;
            int i12 = aVar.f8789c;
            Integer d10 = i12 != -1 ? d(split[i12].trim()) : null;
            int i13 = aVar.f8790d;
            float e2 = i13 != -1 ? e(split[i13].trim()) : -3.4028235E38f;
            int i14 = aVar.f8791e;
            boolean z10 = i14 != -1 && c(split[i14].trim());
            int i15 = aVar.f8792f;
            boolean z11 = i15 != -1 && c(split[i15].trim());
            int i16 = aVar.f8793g;
            boolean z12 = i16 != -1 && c(split[i16].trim());
            int i17 = aVar.f8794h;
            return new wk(trim, b3, d10, e2, z10, z11, z12, i17 != -1 && c(split[i17].trim()));
        } catch (RuntimeException e10) {
            kc.c("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e10);
            return null;
        }
    }
}
