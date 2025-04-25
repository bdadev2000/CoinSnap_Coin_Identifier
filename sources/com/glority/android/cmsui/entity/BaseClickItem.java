package com.glority.android.cmsui.entity;

import com.glority.android.cms.listener.ClickListener;
import com.glority.android.cmsui.model.CmsImage;
import com.glority.android.xx.constants.Args;
import kotlin.Metadata;

/* compiled from: BaseClickItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/glority/android/cmsui/entity/BaseClickItem;", "Lcom/glority/android/cmsui/entity/BaseFontScaleItem;", Args.pageName, "", "(Ljava/lang/String;)V", "imageClick", "Lcom/glority/android/cms/listener/ClickListener;", "Lcom/glority/android/cmsui/model/CmsImage;", "getImageClick", "()Lcom/glority/android/cms/listener/ClickListener;", "setImageClick", "(Lcom/glority/android/cms/listener/ClickListener;)V", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public abstract class BaseClickItem extends BaseFontScaleItem {
    private ClickListener<CmsImage> imageClick;

    public BaseClickItem(String str) {
        super(str);
    }

    public final ClickListener<CmsImage> getImageClick() {
        return this.imageClick;
    }

    public final void setImageClick(ClickListener<CmsImage> clickListener) {
        this.imageClick = clickListener;
    }
}
