package com.glority.android.ui.ext;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.webkit.ProxyConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: OSSUtil.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"ossResize", "", "shortLength", "", "mod_release"}, k = 2, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class OSSUtilKt {
    public static final String ossResize(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.startsWith$default(str, ProxyConfig.MATCH_HTTP, false, 2, (Object) null) ? str + "?x-oss-process=image/resize,s_" + i : str;
    }
}
