package com.glority.android.cmsui.entity;

import android.content.Context;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.cms.base.BaseItem;
import com.glority.android.cms.base.ExtraData;
import com.glority.android.cmsui.R;
import com.glority.android.xx.constants.Args;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelfSuggestNameItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/glority/android/cmsui/entity/SelfSuggestNameItem;", "Lcom/glority/android/cms/base/BaseItem;", "name", "", Args.pageName, "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getPageName", "getLayoutId", "", "render", "", "context", "Landroid/content/Context;", "helper", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "data", "Lcom/glority/android/cms/base/ExtraData;", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class SelfSuggestNameItem extends BaseItem {
    private final String name;
    private final String pageName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfSuggestNameItem(String name, String pageName) {
        super(pageName);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        this.name = name;
        this.pageName = pageName;
    }

    public /* synthetic */ SelfSuggestNameItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2);
    }

    public final String getName() {
        return this.name;
    }

    public final String getPageName() {
        return this.pageName;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public int getLayoutId() {
        return R.layout.item_self_suggest_name;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public void render(Context context, BaseViewHolder helper, ExtraData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(data, "data");
        helper.setText(R.id.tv_name, this.name);
    }
}
