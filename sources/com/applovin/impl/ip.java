package com.applovin.impl;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Map;

/* loaded from: classes.dex */
abstract class ip {
    public static void a(Spannable spannable, int i2, int i3, jp jpVar, gp gpVar, Map map, int i4) {
        gp b2;
        jp a2;
        int i5;
        if (jpVar.k() != -1) {
            spannable.setSpan(new StyleSpan(jpVar.k()), i2, i3, 33);
        }
        if (jpVar.q()) {
            spannable.setSpan(new StrikethroughSpan(), i2, i3, 33);
        }
        if (jpVar.r()) {
            spannable.setSpan(new UnderlineSpan(), i2, i3, 33);
        }
        if (jpVar.p()) {
            pk.a(spannable, new ForegroundColorSpan(jpVar.b()), i2, i3, 33);
        }
        if (jpVar.o()) {
            pk.a(spannable, new BackgroundColorSpan(jpVar.a()), i2, i3, 33);
        }
        if (jpVar.c() != null) {
            pk.a(spannable, new TypefaceSpan(jpVar.c()), i2, i3, 33);
        }
        if (jpVar.n() != null) {
            xn xnVar = (xn) b1.a(jpVar.n());
            int i6 = xnVar.f27959a;
            if (i6 == -1) {
                i6 = (i4 == 2 || i4 == 1) ? 3 : 1;
                i5 = 1;
            } else {
                i5 = xnVar.f27960b;
            }
            int i7 = xnVar.f27961c;
            if (i7 == -2) {
                i7 = 1;
            }
            pk.a(spannable, new yn(i6, i5, i7), i2, i3, 33);
        }
        int i8 = jpVar.i();
        if (i8 == 2) {
            gp a3 = a(gpVar, map);
            if (a3 != null && (b2 = b(a3, map)) != null) {
                if (b2.a() == 1 && b2.a(0).f24153b != null) {
                    String str = (String) xp.a((Object) b2.a(0).f24153b);
                    jp a4 = a(b2.f24155f, b2.c(), map);
                    int h2 = a4 != null ? a4.h() : -1;
                    if (h2 == -1 && (a2 = a(a3.f24155f, a3.c(), map)) != null) {
                        h2 = a2.h();
                    }
                    spannable.setSpan(new zi(str, h2), i2, i3, 33);
                } else {
                    pc.c("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                }
            }
        } else if (i8 == 3 || i8 == 4) {
            spannable.setSpan(new o6(), i2, i3, 33);
        }
        if (jpVar.m()) {
            pk.a(spannable, new pa(), i2, i3, 33);
        }
        int e = jpVar.e();
        if (e == 1) {
            pk.a(spannable, new AbsoluteSizeSpan((int) jpVar.d(), true), i2, i3, 33);
        } else if (e == 2) {
            pk.a(spannable, new RelativeSizeSpan(jpVar.d()), i2, i3, 33);
        } else {
            if (e != 3) {
                return;
            }
            pk.a(spannable, new RelativeSizeSpan(jpVar.d() / 100.0f), i2, i3, 33);
        }
    }

    private static gp b(gp gpVar, Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gpVar);
        while (!arrayDeque.isEmpty()) {
            gp gpVar2 = (gp) arrayDeque.pop();
            jp a2 = a(gpVar2.f24155f, gpVar2.c(), map);
            if (a2 != null && a2.i() == 3) {
                return gpVar2;
            }
            for (int a3 = gpVar2.a() - 1; a3 >= 0; a3--) {
                arrayDeque.push(gpVar2.a(a3));
            }
        }
        return null;
    }

    public static String a(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    private static gp a(gp gpVar, Map map) {
        while (gpVar != null) {
            jp a2 = a(gpVar.f24155f, gpVar.c(), map);
            if (a2 != null && a2.i() == 1) {
                return gpVar;
            }
            gpVar = gpVar.f24159j;
        }
        return null;
    }

    public static jp a(jp jpVar, String[] strArr, Map map) {
        int i2 = 0;
        if (jpVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (jp) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                jp jpVar2 = new jp();
                int length = strArr.length;
                while (i2 < length) {
                    jpVar2.a((jp) map.get(strArr[i2]));
                    i2++;
                }
                return jpVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return jpVar.a((jp) map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i2 < length2) {
                    jpVar.a((jp) map.get(strArr[i2]));
                    i2++;
                }
            }
        }
        return jpVar;
    }
}
