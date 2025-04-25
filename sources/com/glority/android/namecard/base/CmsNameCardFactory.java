package com.glority.android.namecard.base;

import android.content.Context;
import com.glority.android.xx.constants.LogEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CmsNameCardFactory.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¨\u0006\u000b"}, d2 = {"Lcom/glority/android/namecard/base/CmsNameCardFactory;", "", "()V", LogEvents.exportemptyalert_close_click_type_get, "Lcom/glority/android/namecard/base/AbsCmsNameCardView;", "context", "Landroid/content/Context;", "memoNo", "", "targetMemo", "defaultMemo", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class CmsNameCardFactory {
    public static final CmsNameCardFactory INSTANCE = new CmsNameCardFactory();

    private CmsNameCardFactory() {
    }

    public final AbsCmsNameCardView get(Context context, String targetMemo, String defaultMemo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(targetMemo, "targetMemo");
        Intrinsics.checkNotNullParameter(defaultMemo, "defaultMemo");
        AbsCmsNameCardView absCmsNameCardView = get(context, targetMemo);
        return absCmsNameCardView == null ? get(context, defaultMemo) : absCmsNameCardView;
    }

    private final AbsCmsNameCardView get(Context context, String memoNo) {
        if (memoNo.length() < 5) {
            return null;
        }
        int length = memoNo.length() - 1;
        if (memoNo == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = memoNo.substring(0, length);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        try {
            Class<?> cls = Class.forName("com.glority.android.namecard.memo" + substring + ".NameCard" + substring + ((char) (StringsKt.last(memoNo) + 16)));
            Intrinsics.checkNotNullExpressionValue(cls, "Class.forName(\"com.glori…rd${memoId}${memoIndex}\")");
            Object newInstance = cls.getConstructor(Context.class).newInstance(context);
            if (newInstance != null) {
                return (AbsCmsNameCardView) newInstance;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.glority.android.namecard.base.AbsCmsNameCardView");
        } catch (Throwable unused) {
            return null;
        }
    }
}
