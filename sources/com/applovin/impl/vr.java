package com.applovin.impl;

import android.text.TextUtils;
import androidx.core.view.MotionEventCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class vr {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f8625c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f8626d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final yg a = new yg();

    /* renamed from: b, reason: collision with root package name */
    private final StringBuilder f8627b = new StringBuilder();

    private static boolean a(yg ygVar) {
        int d10 = ygVar.d();
        int e2 = ygVar.e();
        byte[] c10 = ygVar.c();
        int i10 = d10 + 2;
        if (i10 > e2) {
            return false;
        }
        int i11 = d10 + 1;
        if (c10[d10] != 47 || c10[i11] != 42) {
            return false;
        }
        while (true) {
            int i12 = i10 + 1;
            if (i12 < e2) {
                if (((char) c10[i10]) == '*' && ((char) c10[i12]) == '/') {
                    i10 += 2;
                    e2 = i10;
                } else {
                    i10 = i12;
                }
            } else {
                ygVar.g(e2 - ygVar.d());
                return true;
            }
        }
    }

    private static boolean b(yg ygVar) {
        char a = a(ygVar, ygVar.d());
        if (a != '\t' && a != '\n' && a != '\f' && a != '\r' && a != ' ') {
            return false;
        }
        ygVar.g(1);
        return true;
    }

    private static String d(yg ygVar, StringBuilder sb2) {
        f(ygVar);
        if (ygVar.a() < 5 || !"::cue".equals(ygVar.c(5))) {
            return null;
        }
        int d10 = ygVar.d();
        String b3 = b(ygVar, sb2);
        if (b3 == null) {
            return null;
        }
        if ("{".equals(b3)) {
            ygVar.f(d10);
            return "";
        }
        String d11 = "(".equals(b3) ? d(ygVar) : null;
        if (")".equals(b(ygVar, sb2))) {
            return d11;
        }
        return null;
    }

    public static void e(yg ygVar) {
        do {
        } while (!TextUtils.isEmpty(ygVar.l()));
    }

    public static void f(yg ygVar) {
        while (true) {
            for (boolean z10 = true; ygVar.a() > 0 && z10; z10 = false) {
                if (!b(ygVar) && !a(ygVar)) {
                }
            }
            return;
        }
    }

    public List c(yg ygVar) {
        this.f8627b.setLength(0);
        int d10 = ygVar.d();
        e(ygVar);
        this.a.a(ygVar.c(), ygVar.d());
        this.a.f(d10);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String d11 = d(this.a, this.f8627b);
            if (d11 == null || !"{".equals(b(this.a, this.f8627b))) {
                return arrayList;
            }
            wr wrVar = new wr();
            a(wrVar, d11);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int d12 = this.a.d();
                String b3 = b(this.a, this.f8627b);
                boolean z11 = b3 == null || "}".equals(b3);
                if (!z11) {
                    this.a.f(d12);
                    a(this.a, wrVar, this.f8627b);
                }
                str = b3;
                z10 = z11;
            }
            if ("}".equals(str)) {
                arrayList.add(wrVar);
            }
        }
    }

    public static String b(yg ygVar, StringBuilder sb2) {
        f(ygVar);
        if (ygVar.a() == 0) {
            return null;
        }
        String a = a(ygVar, sb2);
        if (!"".equals(a)) {
            return a;
        }
        return "" + ((char) ygVar.w());
    }

    private static String a(yg ygVar, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int d10 = ygVar.d();
        int e2 = ygVar.e();
        while (d10 < e2 && !z10) {
            char c10 = (char) ygVar.c()[d10];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                d10++;
                sb2.append(c10);
            }
        }
        ygVar.g(d10 - ygVar.d());
        return sb2.toString();
    }

    private static String d(yg ygVar) {
        int d10 = ygVar.d();
        int e2 = ygVar.e();
        boolean z10 = false;
        while (d10 < e2 && !z10) {
            int i10 = d10 + 1;
            z10 = ((char) ygVar.c()[d10]) == ')';
            d10 = i10;
        }
        return ygVar.c((d10 - 1) - ygVar.d()).trim();
    }

    private static void a(yg ygVar, wr wrVar, StringBuilder sb2) {
        f(ygVar);
        String a = a(ygVar, sb2);
        if (!"".equals(a) && ":".equals(b(ygVar, sb2))) {
            f(ygVar);
            String c10 = c(ygVar, sb2);
            if (c10 == null || "".equals(c10)) {
                return;
            }
            int d10 = ygVar.d();
            String b3 = b(ygVar, sb2);
            if (!";".equals(b3)) {
                if (!"}".equals(b3)) {
                    return;
                } else {
                    ygVar.f(d10);
                }
            }
            if (TtmlNode.ATTR_TTS_COLOR.equals(a)) {
                wrVar.b(q3.a(c10));
                return;
            }
            if ("background-color".equals(a)) {
                wrVar.a(q3.a(c10));
                return;
            }
            boolean z10 = true;
            if ("ruby-position".equals(a)) {
                if ("over".equals(c10)) {
                    wrVar.d(1);
                    return;
                } else {
                    if ("under".equals(c10)) {
                        wrVar.d(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(a)) {
                if (!"all".equals(c10) && !c10.startsWith("digits")) {
                    z10 = false;
                }
                wrVar.b(z10);
                return;
            }
            if ("text-decoration".equals(a)) {
                if (TtmlNode.UNDERLINE.equals(c10)) {
                    wrVar.d(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(a)) {
                wrVar.a(c10);
                return;
            }
            if ("font-weight".equals(a)) {
                if (TtmlNode.BOLD.equals(c10)) {
                    wrVar.a(true);
                }
            } else if ("font-style".equals(a)) {
                if (TtmlNode.ITALIC.equals(c10)) {
                    wrVar.c(true);
                }
            } else if ("font-size".equals(a)) {
                a(c10, wrVar);
            }
        }
    }

    private static String c(yg ygVar, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int d10 = ygVar.d();
            String b3 = b(ygVar, sb2);
            if (b3 == null) {
                return null;
            }
            if (!"}".equals(b3) && !";".equals(b3)) {
                sb3.append(b3);
            } else {
                ygVar.f(d10);
                z10 = true;
            }
        }
        return sb3.toString();
    }

    private static char a(yg ygVar, int i10) {
        return (char) ygVar.c()[i10];
    }

    private static void a(String str, wr wrVar) {
        Matcher matcher = f8626d.matcher(Ascii.toLowerCase(str));
        if (!matcher.matches()) {
            kc.d("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) a1.a((Object) matcher.group(2));
        str2.getClass();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                if (str2.equals("%")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3240:
                if (str2.equals("em")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3592:
                if (str2.equals("px")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
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
        wrVar.a(Float.parseFloat((String) a1.a((Object) matcher.group(1))));
    }

    private void a(wr wrVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = f8625c.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                wrVar.d((String) a1.a((Object) matcher.group(1)));
            }
            str = str.substring(0, indexOf);
        }
        String[] a = yp.a(str, "\\.");
        String str2 = a[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            wrVar.c(str2.substring(0, indexOf2));
            wrVar.b(str2.substring(indexOf2 + 1));
        } else {
            wrVar.c(str2);
        }
        if (a.length > 1) {
            wrVar.a((String[]) yp.a(a, 1, a.length));
        }
    }
}
