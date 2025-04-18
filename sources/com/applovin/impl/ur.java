package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.appevents.UserDataStore;
import com.facebook.internal.security.CertificateUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class ur {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f27430c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    private final bh f27431a = new bh();

    /* renamed from: b, reason: collision with root package name */
    private final StringBuilder f27432b = new StringBuilder();

    private static boolean a(bh bhVar) {
        int d2 = bhVar.d();
        int e = bhVar.e();
        byte[] c2 = bhVar.c();
        int i2 = d2 + 2;
        if (i2 > e) {
            return false;
        }
        int i3 = d2 + 1;
        if (c2[d2] != 47 || c2[i3] != 42) {
            return false;
        }
        while (true) {
            int i4 = i2 + 1;
            if (i4 < e) {
                if (((char) c2[i2]) == '*' && ((char) c2[i4]) == '/') {
                    i2 += 2;
                    e = i2;
                } else {
                    i2 = i4;
                }
            } else {
                bhVar.g(e - bhVar.d());
                return true;
            }
        }
    }

    private static boolean b(bh bhVar) {
        char a2 = a(bhVar, bhVar.d());
        if (a2 != '\t' && a2 != '\n' && a2 != '\f' && a2 != '\r' && a2 != ' ') {
            return false;
        }
        bhVar.g(1);
        return true;
    }

    private static String d(bh bhVar, StringBuilder sb) {
        f(bhVar);
        if (bhVar.a() < 5 || !"::cue".equals(bhVar.c(5))) {
            return null;
        }
        int d2 = bhVar.d();
        String b2 = b(bhVar, sb);
        if (b2 == null) {
            return null;
        }
        if ("{".equals(b2)) {
            bhVar.f(d2);
            return "";
        }
        String d3 = "(".equals(b2) ? d(bhVar) : null;
        if (")".equals(b(bhVar, sb))) {
            return d3;
        }
        return null;
    }

    public static void e(bh bhVar) {
        do {
        } while (!TextUtils.isEmpty(bhVar.l()));
    }

    public static void f(bh bhVar) {
        while (true) {
            for (boolean z2 = true; bhVar.a() > 0 && z2; z2 = false) {
                if (!b(bhVar) && !a(bhVar)) {
                }
            }
            return;
        }
    }

    public List c(bh bhVar) {
        this.f27432b.setLength(0);
        int d2 = bhVar.d();
        e(bhVar);
        this.f27431a.a(bhVar.c(), bhVar.d());
        this.f27431a.f(d2);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String d3 = d(this.f27431a, this.f27432b);
            if (d3 == null || !"{".equals(b(this.f27431a, this.f27432b))) {
                return arrayList;
            }
            vr vrVar = new vr();
            a(vrVar, d3);
            String str = null;
            boolean z2 = false;
            while (!z2) {
                int d4 = this.f27431a.d();
                String b2 = b(this.f27431a, this.f27432b);
                boolean z3 = b2 == null || "}".equals(b2);
                if (!z3) {
                    this.f27431a.f(d4);
                    a(this.f27431a, vrVar, this.f27432b);
                }
                str = b2;
                z2 = z3;
            }
            if ("}".equals(str)) {
                arrayList.add(vrVar);
            }
        }
    }

    public static String b(bh bhVar, StringBuilder sb) {
        f(bhVar);
        if (bhVar.a() == 0) {
            return null;
        }
        String a2 = a(bhVar, sb);
        if (!"".equals(a2)) {
            return a2;
        }
        return "" + ((char) bhVar.w());
    }

    private static String a(bh bhVar, StringBuilder sb) {
        boolean z2 = false;
        sb.setLength(0);
        int d2 = bhVar.d();
        int e = bhVar.e();
        while (d2 < e && !z2) {
            char c2 = (char) bhVar.c()[d2];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z2 = true;
            } else {
                d2++;
                sb.append(c2);
            }
        }
        bhVar.g(d2 - bhVar.d());
        return sb.toString();
    }

    private static String d(bh bhVar) {
        int d2 = bhVar.d();
        int e = bhVar.e();
        boolean z2 = false;
        while (d2 < e && !z2) {
            int i2 = d2 + 1;
            z2 = ((char) bhVar.c()[d2]) == ')';
            d2 = i2;
        }
        return bhVar.c((d2 - 1) - bhVar.d()).trim();
    }

    private static void a(bh bhVar, vr vrVar, StringBuilder sb) {
        f(bhVar);
        String a2 = a(bhVar, sb);
        if (!"".equals(a2) && CertificateUtil.DELIMITER.equals(b(bhVar, sb))) {
            f(bhVar);
            String c2 = c(bhVar, sb);
            if (c2 == null || "".equals(c2)) {
                return;
            }
            int d2 = bhVar.d();
            String b2 = b(bhVar, sb);
            if (!";".equals(b2)) {
                if (!"}".equals(b2)) {
                    return;
                } else {
                    bhVar.f(d2);
                }
            }
            if ("color".equals(a2)) {
                vrVar.b(s3.a(c2));
                return;
            }
            if ("background-color".equals(a2)) {
                vrVar.a(s3.a(c2));
                return;
            }
            boolean z2 = true;
            if ("ruby-position".equals(a2)) {
                if ("over".equals(c2)) {
                    vrVar.d(1);
                    return;
                } else {
                    if ("under".equals(c2)) {
                        vrVar.d(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(a2)) {
                if (!"all".equals(c2) && !c2.startsWith("digits")) {
                    z2 = false;
                }
                vrVar.b(z2);
                return;
            }
            if ("text-decoration".equals(a2)) {
                if ("underline".equals(c2)) {
                    vrVar.d(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(a2)) {
                vrVar.a(c2);
                return;
            }
            if ("font-weight".equals(a2)) {
                if ("bold".equals(c2)) {
                    vrVar.a(true);
                }
            } else if ("font-style".equals(a2)) {
                if ("italic".equals(c2)) {
                    vrVar.c(true);
                }
            } else if ("font-size".equals(a2)) {
                a(c2, vrVar);
            }
        }
    }

    private static String c(bh bhVar, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z2 = false;
        while (!z2) {
            int d2 = bhVar.d();
            String b2 = b(bhVar, sb);
            if (b2 == null) {
                return null;
            }
            if (!"}".equals(b2) && !";".equals(b2)) {
                sb2.append(b2);
            } else {
                bhVar.f(d2);
                z2 = true;
            }
        }
        return sb2.toString();
    }

    private static char a(bh bhVar, int i2) {
        return (char) bhVar.c()[i2];
    }

    private static void a(String str, vr vrVar) {
        Matcher matcher = d.matcher(Ascii.toLowerCase(str));
        if (!matcher.matches()) {
            pc.d("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) b1.a((Object) matcher.group(2));
        str2.getClass();
        char c2 = 65535;
        switch (str2.hashCode()) {
            case 37:
                if (str2.equals("%")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3240:
                if (str2.equals(UserDataStore.EMAIL)) {
                    c2 = 1;
                    break;
                }
                break;
            case 3592:
                if (str2.equals("px")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                vrVar.c(3);
                break;
            case 1:
                vrVar.c(2);
                break;
            case 2:
                vrVar.c(1);
                break;
            default:
                throw new IllegalStateException();
        }
        vrVar.a(Float.parseFloat((String) b1.a((Object) matcher.group(1))));
    }

    private void a(vr vrVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = f27430c.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                vrVar.d((String) b1.a((Object) matcher.group(1)));
            }
            str = str.substring(0, indexOf);
        }
        String[] a2 = xp.a(str, "\\.");
        String str2 = a2[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            vrVar.c(str2.substring(0, indexOf2));
            vrVar.b(str2.substring(indexOf2 + 1));
        } else {
            vrVar.c(str2);
        }
        if (a2.length > 1) {
            vrVar.a((String[]) xp.a(a2, 1, a2.length));
        }
    }
}
