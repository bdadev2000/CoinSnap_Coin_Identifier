package com.glority.android.cmsui.entity;

import android.content.Context;
import android.view.View;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.cms.base.BaseItem;
import com.glority.android.cms.base.ExtraData;
import com.glority.android.cms.listener.ClickListener;
import com.glority.android.cmsui.R;
import com.glority.android.xx.constants.Args;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NoMatchItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\tHÖ\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R$\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/glority/android/cmsui/entity/NoMatchItem;", "Lcom/glority/android/cms/base/BaseItem;", Args.pageName, "", "(Ljava/lang/String;)V", "getPageName", "()Ljava/lang/String;", "suggestNameClick", "Lcom/glority/android/cms/listener/ClickListener;", "", "getSuggestNameClick", "()Lcom/glority/android/cms/listener/ClickListener;", "setSuggestNameClick", "(Lcom/glority/android/cms/listener/ClickListener;)V", "component1", "copy", "equals", "", "other", "getLayoutId", "", "hashCode", "render", "", "context", "Landroid/content/Context;", "helper", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "data", "Lcom/glority/android/cms/base/ExtraData;", "toString", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class NoMatchItem extends BaseItem {
    private final String pageName;
    private ClickListener<Object> suggestNameClick;

    public NoMatchItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ NoMatchItem copy$default(NoMatchItem noMatchItem, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = noMatchItem.pageName;
        }
        return noMatchItem.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPageName() {
        return this.pageName;
    }

    public final NoMatchItem copy(String pageName) {
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        return new NoMatchItem(pageName);
    }

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof NoMatchItem) && Intrinsics.areEqual(this.pageName, ((NoMatchItem) other).pageName);
        }
        return true;
    }

    public int hashCode() {
        String str = this.pageName;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "NoMatchItem(pageName=" + this.pageName + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoMatchItem(String pageName) {
        super(pageName);
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        this.pageName = pageName;
    }

    public /* synthetic */ NoMatchItem(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final ClickListener<Object> getSuggestNameClick() {
        return this.suggestNameClick;
    }

    public final void setSuggestNameClick(ClickListener<Object> clickListener) {
        this.suggestNameClick = clickListener;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public int getLayoutId() {
        return R.layout.item_cms_no_match;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public void render(Context context, BaseViewHolder helper, ExtraData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(data, "data");
        helper.addOnClickListener(R.id.btn_suggest_name);
        helper.getView(R.id.btn_suggest_name).setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.cmsui.entity.NoMatchItem$render$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View it) {
                ClickListener<Object> suggestNameClick = NoMatchItem.this.getSuggestNameClick();
                if (suggestNameClick != null) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    suggestNameClick.onClick(it, null);
                }
            }
        });
    }
}
