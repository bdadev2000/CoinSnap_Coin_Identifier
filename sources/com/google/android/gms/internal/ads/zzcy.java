package com.google.android.gms.internal.ads;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;

/* loaded from: classes3.dex */
public final class zzcy {
    public static void zza(Spannable spannable, float f10, int i10, int i11, int i12) {
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannable.getSpans(i10, i11, RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i10 && spannable.getSpanEnd(relativeSizeSpan) >= i11) {
                f10 = relativeSizeSpan.getSizeChange() * f10;
            }
            zzc(spannable, relativeSizeSpan, i10, i11, 33);
        }
        spannable.setSpan(new RelativeSizeSpan(f10), i10, i11, 33);
    }

    public static void zzb(Spannable spannable, Object obj, int i10, int i11, int i12) {
        for (Object obj2 : spannable.getSpans(i10, i11, obj.getClass())) {
            zzc(spannable, obj2, i10, i11, 33);
        }
        spannable.setSpan(obj, i10, i11, 33);
    }

    private static void zzc(Spannable spannable, Object obj, int i10, int i11, int i12) {
        if (spannable.getSpanStart(obj) == i10 && spannable.getSpanEnd(obj) == i11 && spannable.getSpanFlags(obj) == 33) {
            spannable.removeSpan(obj);
        }
    }
}
