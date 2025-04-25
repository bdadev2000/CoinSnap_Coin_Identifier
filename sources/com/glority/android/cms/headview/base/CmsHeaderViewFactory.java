package com.glority.android.cms.headview.base;

import android.content.Context;
import com.glority.android.xx.constants.LogEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CmsHeaderViewFactory.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¨\u0006\u000b"}, d2 = {"Lcom/glority/android/cms/headview/base/CmsHeaderViewFactory;", "", "()V", LogEvents.exportemptyalert_close_click_type_get, "Lcom/glority/android/cms/headview/base/AbsCmsHeaderView;", "context", "Landroid/content/Context;", "memoNo", "", "targetMemo", "defaultMemo", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class CmsHeaderViewFactory {
    public static final CmsHeaderViewFactory INSTANCE = new CmsHeaderViewFactory();

    private CmsHeaderViewFactory() {
    }

    public final AbsCmsHeaderView get(Context context, String targetMemo, String defaultMemo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(targetMemo, "targetMemo");
        Intrinsics.checkNotNullParameter(defaultMemo, "defaultMemo");
        AbsCmsHeaderView absCmsHeaderView = get(context, targetMemo);
        return absCmsHeaderView == null ? get(context, defaultMemo) : absCmsHeaderView;
    }

    private final AbsCmsHeaderView get(Context context, String memoNo) {
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
            Class<?> cls = Class.forName("com.glority.android.cmsheadview.memo" + substring + ".CmsHeadView" + substring + ((char) (StringsKt.last(memoNo) + 16)));
            Intrinsics.checkNotNullExpressionValue(cls, "Class.forName(\"com.glori…ew${memoId}${memoIndex}\")");
            Object newInstance = cls.getConstructor(Context.class).newInstance(context);
            if (newInstance != null) {
                return (AbsCmsHeaderView) newInstance;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.glority.android.cms.headview.base.AbsCmsHeaderView");
        } catch (Throwable unused) {
            return null;
        }
    }
}
