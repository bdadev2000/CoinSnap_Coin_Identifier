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
abstract class jp {
    public static void a(Spannable spannable, int i9, int i10, kp kpVar, hp hpVar, Map map, int i11) {
        hp b;
        kp a6;
        int i12;
        if (kpVar.k() != -1) {
            spannable.setSpan(new StyleSpan(kpVar.k()), i9, i10, 33);
        }
        if (kpVar.q()) {
            spannable.setSpan(new StrikethroughSpan(), i9, i10, 33);
        }
        if (kpVar.r()) {
            spannable.setSpan(new UnderlineSpan(), i9, i10, 33);
        }
        if (kpVar.p()) {
            mk.a(spannable, new ForegroundColorSpan(kpVar.b()), i9, i10, 33);
        }
        if (kpVar.o()) {
            mk.a(spannable, new BackgroundColorSpan(kpVar.a()), i9, i10, 33);
        }
        if (kpVar.c() != null) {
            mk.a(spannable, new TypefaceSpan(kpVar.c()), i9, i10, 33);
        }
        if (kpVar.n() != null) {
            yn ynVar = (yn) AbstractC0669a1.a(kpVar.n());
            int i13 = ynVar.f12449a;
            if (i13 == -1) {
                i13 = (i11 == 2 || i11 == 1) ? 3 : 1;
                i12 = 1;
            } else {
                i12 = ynVar.b;
            }
            int i14 = ynVar.f12450c;
            if (i14 == -2) {
                i14 = 1;
            }
            mk.a(spannable, new zn(i13, i12, i14), i9, i10, 33);
        }
        int i15 = kpVar.i();
        if (i15 == 2) {
            hp a9 = a(hpVar, map);
            if (a9 != null && (b = b(a9, map)) != null) {
                if (b.a() == 1 && b.a(0).b != null) {
                    String str = (String) yp.a((Object) b.a(0).b);
                    kp a10 = a(b.f8167f, b.c(), map);
                    int h6 = a10 != null ? a10.h() : -1;
                    if (h6 == -1 && (a6 = a(a9.f8167f, a9.c(), map)) != null) {
                        h6 = a6.h();
                    }
                    spannable.setSpan(new ui(str, h6), i9, i10, 33);
                } else {
                    kc.c("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                }
            }
        } else if (i15 == 3 || i15 == 4) {
            spannable.setSpan(new m6(), i9, i10, 33);
        }
        if (kpVar.m()) {
            mk.a(spannable, new la(), i9, i10, 33);
        }
        int e4 = kpVar.e();
        if (e4 == 1) {
            mk.a(spannable, new AbsoluteSizeSpan((int) kpVar.d(), true), i9, i10, 33);
        } else if (e4 == 2) {
            mk.a(spannable, new RelativeSizeSpan(kpVar.d()), i9, i10, 33);
        } else {
            if (e4 != 3) {
                return;
            }
            mk.a(spannable, new RelativeSizeSpan(kpVar.d() / 100.0f), i9, i10, 33);
        }
    }

    private static hp b(hp hpVar, Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(hpVar);
        while (!arrayDeque.isEmpty()) {
            hp hpVar2 = (hp) arrayDeque.pop();
            kp a6 = a(hpVar2.f8167f, hpVar2.c(), map);
            if (a6 != null && a6.i() == 3) {
                return hpVar2;
            }
            for (int a9 = hpVar2.a() - 1; a9 >= 0; a9--) {
                arrayDeque.push(hpVar2.a(a9));
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

    private static hp a(hp hpVar, Map map) {
        while (hpVar != null) {
            kp a6 = a(hpVar.f8167f, hpVar.c(), map);
            if (a6 != null && a6.i() == 1) {
                return hpVar;
            }
            hpVar = hpVar.f8171j;
        }
        return null;
    }

    public static kp a(kp kpVar, String[] strArr, Map map) {
        int i9 = 0;
        if (kpVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (kp) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                kp kpVar2 = new kp();
                int length = strArr.length;
                while (i9 < length) {
                    kpVar2.a((kp) map.get(strArr[i9]));
                    i9++;
                }
                return kpVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return kpVar.a((kp) map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i9 < length2) {
                    kpVar.a((kp) map.get(strArr[i9]));
                    i9++;
                }
            }
        }
        return kpVar;
    }
}
