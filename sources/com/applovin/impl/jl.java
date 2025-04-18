package com.applovin.impl;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.applovin.impl.b5;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class jl extends ek {

    /* renamed from: q, reason: collision with root package name */
    private static final Pattern f24705q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: r, reason: collision with root package name */
    private static final Pattern f24706r = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: o, reason: collision with root package name */
    private final StringBuilder f24707o;

    /* renamed from: p, reason: collision with root package name */
    private final ArrayList f24708p;

    public jl() {
        super("SubripDecoder");
        this.f24707o = new StringBuilder();
        this.f24708p = new ArrayList();
    }

    private static long a(Matcher matcher, int i2) {
        String group = matcher.group(i2 + 1);
        long parseLong = (Long.parseLong((String) b1.a((Object) matcher.group(i2 + 3))) * 1000) + (Long.parseLong((String) b1.a((Object) matcher.group(i2 + 2))) * 60000) + (group != null ? Long.parseLong(group) * 3600000 : 0L);
        String group2 = matcher.group(i2 + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    public static float b(int i2) {
        if (i2 == 0) {
            return 0.08f;
        }
        if (i2 == 1) {
            return 0.5f;
        }
        if (i2 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private String a(String str, ArrayList arrayList) {
        String trim = str.trim();
        StringBuilder sb = new StringBuilder(trim);
        Matcher matcher = f24706r.matcher(trim);
        int i2 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i2;
            int length = group.length();
            sb.replace(start, start + length, "");
            i2 += length;
        }
        return sb.toString();
    }

    @Override // com.applovin.impl.ek
    public nl a(byte[] bArr, int i2, boolean z2) {
        String str;
        ArrayList arrayList = new ArrayList();
        rc rcVar = new rc();
        bh bhVar = new bh(bArr, i2);
        while (true) {
            String l2 = bhVar.l();
            int i3 = 0;
            if (l2 == null) {
                break;
            }
            if (l2.length() != 0) {
                try {
                    Integer.parseInt(l2);
                    String l3 = bhVar.l();
                    if (l3 == null) {
                        pc.d("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f24705q.matcher(l3);
                    if (matcher.matches()) {
                        rcVar.a(a(matcher, 1));
                        rcVar.a(a(matcher, 6));
                        this.f24707o.setLength(0);
                        this.f24708p.clear();
                        for (String l4 = bhVar.l(); !TextUtils.isEmpty(l4); l4 = bhVar.l()) {
                            if (this.f24707o.length() > 0) {
                                this.f24707o.append("<br>");
                            }
                            this.f24707o.append(a(l4, this.f24708p));
                        }
                        Spanned fromHtml = Html.fromHtml(this.f24707o.toString());
                        while (true) {
                            if (i3 >= this.f24708p.size()) {
                                str = null;
                                break;
                            }
                            str = (String) this.f24708p.get(i3);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i3++;
                        }
                        arrayList.add(a(fromHtml, str));
                        arrayList.add(b5.f22988s);
                    } else {
                        pc.d("SubripDecoder", "Skipping invalid timing: ".concat(l3));
                    }
                } catch (NumberFormatException unused) {
                    pc.d("SubripDecoder", "Skipping invalid index: ".concat(l2));
                }
            }
        }
        return new kl((b5[]) arrayList.toArray(new b5[0]), rcVar.b());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private b5 a(Spanned spanned, String str) {
        char c2;
        char c3;
        b5.b a2 = new b5.b().a(spanned);
        if (str == null) {
            return a2.a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0 || c2 == 1 || c2 == 2) {
            a2.b(0);
        } else if (c2 != 3 && c2 != 4 && c2 != 5) {
            a2.b(1);
        } else {
            a2.b(2);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        if (c3 == 0 || c3 == 1 || c3 == 2) {
            a2.a(2);
        } else if (c3 != 3 && c3 != 4 && c3 != 5) {
            a2.a(1);
        } else {
            a2.a(0);
        }
        return a2.b(b(a2.d())).a(b(a2.c()), 0).a();
    }
}
