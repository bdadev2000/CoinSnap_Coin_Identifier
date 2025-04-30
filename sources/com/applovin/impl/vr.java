package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class vr {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f11841c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f11842d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    private final yg f11843a = new yg();
    private final StringBuilder b = new StringBuilder();

    private static boolean a(yg ygVar) {
        int d2 = ygVar.d();
        int e4 = ygVar.e();
        byte[] c9 = ygVar.c();
        int i9 = d2 + 2;
        if (i9 > e4) {
            return false;
        }
        int i10 = d2 + 1;
        if (c9[d2] != 47 || c9[i10] != 42) {
            return false;
        }
        while (true) {
            int i11 = i9 + 1;
            if (i11 < e4) {
                if (((char) c9[i9]) == '*' && ((char) c9[i11]) == '/') {
                    i9 += 2;
                    e4 = i9;
                } else {
                    i9 = i11;
                }
            } else {
                ygVar.g(e4 - ygVar.d());
                return true;
            }
        }
    }

    private static boolean b(yg ygVar) {
        char a6 = a(ygVar, ygVar.d());
        if (a6 != '\t' && a6 != '\n' && a6 != '\f' && a6 != '\r' && a6 != ' ') {
            return false;
        }
        ygVar.g(1);
        return true;
    }

    private static String d(yg ygVar, StringBuilder sb) {
        f(ygVar);
        if (ygVar.a() < 5 || !"::cue".equals(ygVar.c(5))) {
            return null;
        }
        int d2 = ygVar.d();
        String b = b(ygVar, sb);
        if (b == null) {
            return null;
        }
        if ("{".equals(b)) {
            ygVar.f(d2);
            return "";
        }
        String d9 = "(".equals(b) ? d(ygVar) : null;
        if (")".equals(b(ygVar, sb))) {
            return d9;
        }
        return null;
    }

    public static void e(yg ygVar) {
        do {
        } while (!TextUtils.isEmpty(ygVar.l()));
    }

    public static void f(yg ygVar) {
        while (true) {
            for (boolean z8 = true; ygVar.a() > 0 && z8; z8 = false) {
                if (!b(ygVar) && !a(ygVar)) {
                }
            }
            return;
        }
    }

    public List c(yg ygVar) {
        this.b.setLength(0);
        int d2 = ygVar.d();
        e(ygVar);
        this.f11843a.a(ygVar.c(), ygVar.d());
        this.f11843a.f(d2);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String d9 = d(this.f11843a, this.b);
            if (d9 == null || !"{".equals(b(this.f11843a, this.b))) {
                return arrayList;
            }
            wr wrVar = new wr();
            a(wrVar, d9);
            String str = null;
            boolean z8 = false;
            while (!z8) {
                int d10 = this.f11843a.d();
                String b = b(this.f11843a, this.b);
                boolean z9 = b == null || "}".equals(b);
                if (!z9) {
                    this.f11843a.f(d10);
                    a(this.f11843a, wrVar, this.b);
                }
                str = b;
                z8 = z9;
            }
            if ("}".equals(str)) {
                arrayList.add(wrVar);
            }
        }
    }

    public static String b(yg ygVar, StringBuilder sb) {
        f(ygVar);
        if (ygVar.a() == 0) {
            return null;
        }
        String a6 = a(ygVar, sb);
        if (!"".equals(a6)) {
            return a6;
        }
        return "" + ((char) ygVar.w());
    }

    private static String a(yg ygVar, StringBuilder sb) {
        boolean z8 = false;
        sb.setLength(0);
        int d2 = ygVar.d();
        int e4 = ygVar.e();
        while (d2 < e4 && !z8) {
            char c9 = (char) ygVar.c()[d2];
            if ((c9 < 'A' || c9 > 'Z') && ((c9 < 'a' || c9 > 'z') && !((c9 >= '0' && c9 <= '9') || c9 == '#' || c9 == '-' || c9 == '.' || c9 == '_'))) {
                z8 = true;
            } else {
                d2++;
                sb.append(c9);
            }
        }
        ygVar.g(d2 - ygVar.d());
        return sb.toString();
    }

    private static String d(yg ygVar) {
        int d2 = ygVar.d();
        int e4 = ygVar.e();
        boolean z8 = false;
        while (d2 < e4 && !z8) {
            int i9 = d2 + 1;
            z8 = ((char) ygVar.c()[d2]) == ')';
            d2 = i9;
        }
        return ygVar.c((d2 - 1) - ygVar.d()).trim();
    }

    private static void a(yg ygVar, wr wrVar, StringBuilder sb) {
        f(ygVar);
        String a6 = a(ygVar, sb);
        if (!"".equals(a6) && ":".equals(b(ygVar, sb))) {
            f(ygVar);
            String c9 = c(ygVar, sb);
            if (c9 == null || "".equals(c9)) {
                return;
            }
            int d2 = ygVar.d();
            String b = b(ygVar, sb);
            if (!";".equals(b)) {
                if (!"}".equals(b)) {
                    return;
                } else {
                    ygVar.f(d2);
                }
            }
            if (TtmlNode.ATTR_TTS_COLOR.equals(a6)) {
                wrVar.b(q3.a(c9));
                return;
            }
            if ("background-color".equals(a6)) {
                wrVar.a(q3.a(c9));
                return;
            }
            boolean z8 = true;
            if ("ruby-position".equals(a6)) {
                if ("over".equals(c9)) {
                    wrVar.d(1);
                    return;
                } else {
                    if ("under".equals(c9)) {
                        wrVar.d(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(a6)) {
                if (!"all".equals(c9) && !c9.startsWith("digits")) {
                    z8 = false;
                }
                wrVar.b(z8);
                return;
            }
            if ("text-decoration".equals(a6)) {
                if (TtmlNode.UNDERLINE.equals(c9)) {
                    wrVar.d(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(a6)) {
                wrVar.a(c9);
                return;
            }
            if ("font-weight".equals(a6)) {
                if (TtmlNode.BOLD.equals(c9)) {
                    wrVar.a(true);
                }
            } else if ("font-style".equals(a6)) {
                if (TtmlNode.ITALIC.equals(c9)) {
                    wrVar.c(true);
                }
            } else if ("font-size".equals(a6)) {
                a(c9, wrVar);
            }
        }
    }

    private static String c(yg ygVar, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z8 = false;
        while (!z8) {
            int d2 = ygVar.d();
            String b = b(ygVar, sb);
            if (b == null) {
                return null;
            }
            if (!"}".equals(b) && !";".equals(b)) {
                sb2.append(b);
            } else {
                ygVar.f(d2);
                z8 = true;
            }
        }
        return sb2.toString();
    }

    private static char a(yg ygVar, int i9) {
        return (char) ygVar.c()[i9];
    }

    private static void a(String str, wr wrVar) {
        Matcher matcher = f11842d.matcher(Ascii.toLowerCase(str));
        if (!matcher.matches()) {
            kc.d("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) AbstractC0669a1.a((Object) matcher.group(2));
        str2.getClass();
        char c9 = 65535;
        switch (str2.hashCode()) {
            case 37:
                if (str2.equals("%")) {
                    c9 = 0;
                    break;
                }
                break;
            case 3240:
                if (str2.equals("em")) {
                    c9 = 1;
                    break;
                }
                break;
            case 3592:
                if (str2.equals("px")) {
                    c9 = 2;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                wrVar.c(3);
                break;
            case 1:
                wrVar.c(2);
                break;
            case 2:
                wrVar.c(1);
                break;
            default:
                throw new IllegalStateException();
        }
        wrVar.a(Float.parseFloat((String) AbstractC0669a1.a((Object) matcher.group(1))));
    }

    private void a(wr wrVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = f11841c.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                wrVar.d((String) AbstractC0669a1.a((Object) matcher.group(1)));
            }
            str = str.substring(0, indexOf);
        }
        String[] a6 = yp.a(str, "\\.");
        String str2 = a6[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            wrVar.c(str2.substring(0, indexOf2));
            wrVar.b(str2.substring(indexOf2 + 1));
        } else {
            wrVar.c(str2);
        }
        if (a6.length > 1) {
            wrVar.a((String[]) yp.a(a6, 1, a6.length));
        }
    }
}
