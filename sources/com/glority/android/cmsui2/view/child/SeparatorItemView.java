package com.glority.android.cmsui2.view.child;

import android.content.Context;
import android.view.View;
import com.glority.android.cmsui2.R;
import com.glority.android.cmsui2.entity.ExtraData;
import com.glority.android.cmsui2.view.BaseCmsItemView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SeparatorItemView.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/glority/android/cmsui2/view/child/SeparatorItemView;", "Lcom/glority/android/cmsui2/view/BaseCmsItemView;", "<init>", "()V", "getLayoutId", "", "render", "", "context", "Landroid/content/Context;", "rootView", "Landroid/view/View;", "data", "Lcom/glority/android/cmsui2/entity/ExtraData;", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes14.dex */
public final class SeparatorItemView extends BaseCmsItemView {
    @Override // com.glority.android.cmsui2.view.BaseCmsItemView
    public void render(Context context, View rootView, ExtraData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public SeparatorItemView() {
        super("");
    }

    @Override // com.glority.android.cmsui2.view.BaseCmsItemView
    public int getLayoutId() {
        return R.layout.cms_separator;
    }
}
