package com.glority.android.cmsui.util;

import android.content.Context;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import androidx.webkit.ProxyConfig;
import com.glority.android.cmsui.R;
import com.glority.android.cmsui.common.SpanStyle;
import com.glority.utils.app.ResUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CmsUtil.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/android/cmsui/util/CmsViewUtil;", "", "()V", "getMedicinalView", "Landroid/widget/TextView;", "context", "Landroid/content/Context;", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class CmsViewUtil {
    public static final CmsViewUtil INSTANCE = new CmsViewUtil();

    private CmsViewUtil() {
    }

    public final TextView getMedicinalView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = ProxyConfig.MATCH_ALL_SCHEMES + ResUtils.getString(R.string.text_plant_medicinal_value_desc);
        TextView textView = new TextView(context);
        textView.setPadding(0, (int) ResUtils.getDimension(R.dimen.x10), 0, 0);
        textView.setLineSpacing(0.0f, 1.3f);
        textView.setText(new SpanStyle(str, ProxyConfig.MATCH_ALL_SCHEMES).setTextColor(SupportMenu.CATEGORY_MASK).create());
        textView.setTextSize(0, ResUtils.getDimension(R.dimen.x26));
        textView.setTextColor(ResUtils.getColor(R.color.Gray));
        return textView;
    }
}
