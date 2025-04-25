package com.glority.android.cms.adapter;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.DiffUtil;
import com.glority.android.adapterhelper.BaseMultiItemQuickAdapter;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.adapterhelper.diff.BaseQuickDiffCallback;
import com.glority.android.cms.base.BaseItem;
import com.glority.android.cms.base.CmsMultiEntity;
import com.glority.android.cms.base.ExtraData;
import com.glority.android.xx.constants.Args;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CmsAdapter.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u0018\u0010\u000f\u001a\u00020\f2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005H\u0002J\u0018\u0010\u0010\u001a\u00020\f2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005H\u0016J\u001e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016J\u0016\u0010\u0011\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0016J\u001e\u0010\u0011\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/glority/android/cms/adapter/CmsAdapter;", "Lcom/glority/android/adapterhelper/BaseMultiItemQuickAdapter;", "Lcom/glority/android/cms/base/CmsMultiEntity;", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "data", "", Args.pageName, "", "(Ljava/util/List;Ljava/lang/String;)V", "getPageName", "()Ljava/lang/String;", "convert", "", "helper", "item", "setItemType", "setNewData", "setNewDiffData", "diffResult", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "newData", "", "baseQuickDiffCallback", "Lcom/glority/android/adapterhelper/diff/BaseQuickDiffCallback;", "detectMoves", "", "base-cms_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class CmsAdapter extends BaseMultiItemQuickAdapter<CmsMultiEntity, BaseViewHolder> {
    private final String pageName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CmsAdapter(List<CmsMultiEntity> list, String pageName) {
        super(list);
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        this.pageName = pageName;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ CmsAdapter(java.util.List r1, java.lang.String r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 1
            if (r3 == 0) goto L8
            r1 = 0
            r3 = r1
            java.util.List r3 = (java.util.List) r3
        L8:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cms.adapter.CmsAdapter.<init>(java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getPageName() {
        return this.pageName;
    }

    private final void setItemType(List<CmsMultiEntity> data) {
        if (data != null) {
            for (CmsMultiEntity cmsMultiEntity : data) {
                BaseItem item = cmsMultiEntity.getItem();
                if (item != null) {
                    addItemType(cmsMultiEntity.getItemType(), item.getLayoutId());
                }
            }
        }
    }

    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public void setNewData(List<CmsMultiEntity> data) {
        setItemType(data);
        super.setNewData(data);
    }

    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public void setNewDiffData(BaseQuickDiffCallback<CmsMultiEntity> baseQuickDiffCallback) {
        Intrinsics.checkNotNullParameter(baseQuickDiffCallback, "baseQuickDiffCallback");
        setItemType(baseQuickDiffCallback.getNewList());
        super.setNewDiffData(baseQuickDiffCallback);
    }

    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public void setNewDiffData(BaseQuickDiffCallback<CmsMultiEntity> baseQuickDiffCallback, boolean detectMoves) {
        Intrinsics.checkNotNullParameter(baseQuickDiffCallback, "baseQuickDiffCallback");
        setItemType(baseQuickDiffCallback.getNewList());
        super.setNewDiffData(baseQuickDiffCallback, detectMoves);
    }

    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public void setNewDiffData(DiffUtil.DiffResult diffResult, List<CmsMultiEntity> newData) {
        Intrinsics.checkNotNullParameter(diffResult, "diffResult");
        Intrinsics.checkNotNullParameter(newData, "newData");
        setItemType(newData);
        super.setNewDiffData(diffResult, newData);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public void convert(BaseViewHolder helper, CmsMultiEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        BaseItem item2 = item.getItem();
        if (item2 != null) {
            View view = helper.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "helper.itemView");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "helper.itemView.context");
            item2.render(context, helper, new ExtraData(item, getData()));
        }
    }
}
