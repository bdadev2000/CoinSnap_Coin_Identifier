package com.applovin.exoplayer2.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import com.applovin.exoplayer2.common.base.Predicate;
import com.applovin.impl.AbstractC0669a1;
import com.applovin.impl.vb;
import com.applovin.impl.z4;

/* loaded from: classes.dex */
abstract class h {
    public static float a(int i9, float f9, int i10, int i11) {
        float f10;
        if (f9 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i9 == 0) {
            f10 = i11;
        } else {
            if (i9 != 1) {
                if (i9 != 2) {
                    return -3.4028235E38f;
                }
                return f9;
            }
            f10 = i10;
        }
        return f9 * f10;
    }

    public static void b(z4.b bVar) {
        bVar.b(-3.4028235E38f, Integer.MIN_VALUE);
        if (bVar.e() instanceof Spanned) {
            if (!(bVar.e() instanceof Spannable)) {
                bVar.a(SpannableString.valueOf(bVar.e()));
            }
            a((Spannable) AbstractC0669a1.a(bVar.e()), new m(1));
        }
    }

    public static void a(z4.b bVar) {
        bVar.b();
        if (bVar.e() instanceof Spanned) {
            if (!(bVar.e() instanceof Spannable)) {
                bVar.a(SpannableString.valueOf(bVar.e()));
            }
            a((Spannable) AbstractC0669a1.a(bVar.e()), new m(0));
        }
        b(bVar);
    }

    public static /* synthetic */ boolean b(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static /* synthetic */ boolean a(Object obj) {
        return !(obj instanceof vb);
    }

    private static void a(Spannable spannable, Predicate predicate) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (predicate.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }
}
