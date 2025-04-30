package com.google.android.gms.internal.ads;

import android.text.Spannable;

/* loaded from: classes2.dex */
public final class zzeo {
    public static void zza(Spannable spannable, Object obj, int i9, int i10, int i11) {
        for (Object obj2 : spannable.getSpans(i9, i10, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i9 && spannable.getSpanEnd(obj2) == i10 && spannable.getSpanFlags(obj2) == 33) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i9, i10, 33);
    }
}
