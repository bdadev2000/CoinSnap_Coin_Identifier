package com.glority.base.utils;

import android.content.Context;
import android.util.TypedValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AttributeUtils.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/glority/base/utils/AttributeUtils;", "", "<init>", "()V", "getId", "", "attrId", "context", "Landroid/content/Context;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class AttributeUtils {
    public static final int $stable = 0;
    public static final AttributeUtils INSTANCE = new AttributeUtils();

    private AttributeUtils() {
    }

    public final int getId(int attrId, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(attrId, typedValue, true);
        return typedValue.resourceId;
    }
}
