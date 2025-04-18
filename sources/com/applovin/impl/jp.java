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

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class jp {
    public static void a(Spannable spannable, int i10, int i11, kp kpVar, hp hpVar, Map map, int i12) {
        hp b3;
        kp a;
        int i13;
        if (kpVar.k() != -1) {
            spannable.setSpan(new StyleSpan(kpVar.k()), i10, i11, 33);
        }
        if (kpVar.q()) {
            spannable.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (kpVar.r()) {
            spannable.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (kpVar.p()) {
            mk.a(spannable, new ForegroundColorSpan(kpVar.b()), i10, i11, 33);
        }
        if (kpVar.o()) {
            mk.a(spannable, new BackgroundColorSpan(kpVar.a()), i10, i11, 33);
        }
        if (kpVar.c() != null) {
            mk.a(spannable, new TypefaceSpan(kpVar.c()), i10, i11, 33);
        }
        if (kpVar.n() != null) {
            yn ynVar = (yn) a1.a(kpVar.n());
            int i14 = ynVar.a;
            if (i14 == -1) {
                i14 = (i12 == 2 || i12 == 1) ? 3 : 1;
                i13 = 1;
            } else {
                i13 = ynVar.f9251b;
            }
            int i15 = ynVar.f9252c;
            if (i15 == -2) {
                i15 = 1;
            }
            mk.a(spannable, new zn(i14, i13, i15), i10, i11, 33);
        }
        int i16 = kpVar.i();
        if (i16 == 2) {
            hp a10 = a(hpVar, map);
            if (a10 != null && (b3 = b(a10, map)) != null) {
                if (b3.a() == 1 && b3.a(0).f5183b != null) {
                    String str = (String) yp.a((Object) b3.a(0).f5183b);
                    kp a11 = a(b3.f5187f, b3.c(), map);
                    int h10 = a11 != null ? a11.h() : -1;
                    if (h10 == -1 && (a = a(a10.f5187f, a10.c(), map)) != null) {
                        h10 = a.h();
                    }
                    spannable.setSpan(new ui(str, h10), i10, i11, 33);
                } else {
                    kc.c("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                }
            }
        } else if (i16 == 3 || i16 == 4) {
            spannable.setSpan(new m6(), i10, i11, 33);
        }
        if (kpVar.m()) {
            mk.a(spannable, new la(), i10, i11, 33);
        }
        int e2 = kpVar.e();
        if (e2 == 1) {
            mk.a(spannable, new AbsoluteSizeSpan((int) kpVar.d(), true), i10, i11, 33);
        } else if (e2 == 2) {
            mk.a(spannable, new RelativeSizeSpan(kpVar.d()), i10, i11, 33);
        } else {
            if (e2 != 3) {
                return;
            }
            mk.a(spannable, new RelativeSizeSpan(kpVar.d() / 100.0f), i10, i11, 33);
        }
    }

    private static hp b(hp hpVar, Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(hpVar);
        while (!arrayDeque.isEmpty()) {
            hp hpVar2 = (hp) arrayDeque.pop();
            kp a = a(hpVar2.f5187f, hpVar2.c(), map);
            if (a != null && a.i() == 3) {
                return hpVar2;
            }
            for (int a10 = hpVar2.a() - 1; a10 >= 0; a10--) {
                arrayDeque.push(hpVar2.a(a10));
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
            kp a = a(hpVar.f5187f, hpVar.c(), map);
            if (a != null && a.i() == 1) {
                return hpVar;
            }
            hpVar = hpVar.f5191j;
        }
        return null;
    }

    public static kp a(kp kpVar, String[] strArr, Map map) {
        int i10 = 0;
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
                while (i10 < length) {
                    kpVar2.a((kp) map.get(strArr[i10]));
                    i10++;
                }
                return kpVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return kpVar.a((kp) map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    kpVar.a((kp) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return kpVar;
    }
}
