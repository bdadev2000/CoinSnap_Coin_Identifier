package com.glority.android.cmsui.entity;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.cms.base.BaseItem;
import com.glority.android.cms.base.ExtraData;
import com.glority.android.cms.listener.ClickListener;
import com.glority.android.cmsui.R;
import com.glority.android.cmsui.common.CmsUILogEvents;
import com.glority.android.cmsui.model.CmsImage;
import com.glority.android.cmsui.model.CmsLayout;
import com.glority.android.cmsui.model.CmsTag;
import com.glority.android.cmsui.util.CmsTagValueUtil;
import com.glority.android.core.app.AppContext;
import com.glority.android.xx.constants.Args;
import com.glority.utils.stability.LogUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MainImageItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/glority/android/cmsui/entity/MainImageItem;", "Lcom/glority/android/cmsui/entity/BaseClickItem;", "cmsImage", "Lcom/glority/android/cmsui/model/CmsImage;", Args.pageName, "", "(Lcom/glority/android/cmsui/model/CmsImage;Ljava/lang/String;)V", "getCmsImage", "()Lcom/glority/android/cmsui/model/CmsImage;", "getPageName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "getLayoutId", "", "hashCode", "render", "", "context", "Landroid/content/Context;", "helper", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "data", "Lcom/glority/android/cms/base/ExtraData;", "toString", "Companion", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class MainImageItem extends BaseClickItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final CmsImage cmsImage;
    private final String pageName;

    public static /* synthetic */ MainImageItem copy$default(MainImageItem mainImageItem, CmsImage cmsImage, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            cmsImage = mainImageItem.cmsImage;
        }
        if ((i & 2) != 0) {
            str = mainImageItem.pageName;
        }
        return mainImageItem.copy(cmsImage, str);
    }

    /* renamed from: component1, reason: from getter */
    public final CmsImage getCmsImage() {
        return this.cmsImage;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPageName() {
        return this.pageName;
    }

    public final MainImageItem copy(CmsImage cmsImage, String pageName) {
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        return new MainImageItem(cmsImage, pageName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MainImageItem)) {
            return false;
        }
        MainImageItem mainImageItem = (MainImageItem) other;
        return Intrinsics.areEqual(this.cmsImage, mainImageItem.cmsImage) && Intrinsics.areEqual(this.pageName, mainImageItem.pageName);
    }

    public int hashCode() {
        CmsImage cmsImage = this.cmsImage;
        int hashCode = (cmsImage != null ? cmsImage.hashCode() : 0) * 31;
        String str = this.pageName;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "MainImageItem(cmsImage=" + this.cmsImage + ", pageName=" + this.pageName + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainImageItem(CmsImage cmsImage, String pageName) {
        super(pageName);
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        this.cmsImage = cmsImage;
        this.pageName = pageName;
    }

    public /* synthetic */ MainImageItem(CmsImage cmsImage, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cmsImage, (i & 2) != 0 ? "" : str);
    }

    public final CmsImage getCmsImage() {
        return this.cmsImage;
    }

    public final String getPageName() {
        return this.pageName;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public int getLayoutId() {
        return R.layout.item_main_imge;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public void render(Context context, BaseViewHolder helper, ExtraData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(data, "data");
        ImageView imageView = (ImageView) helper.getView(R.id.detail_header_iv);
        RequestManager with = Glide.with(imageView);
        CmsImage cmsImage = this.cmsImage;
        with.load(cmsImage != null ? cmsImage.getImageUrl() : null).centerCrop().skipMemoryCache(true).placeholder(R.drawable.common_background_banner).into(imageView);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.cmsui.entity.MainImageItem$render$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClickListener<CmsImage> imageClick;
                BaseItem.logEvent$default(MainImageItem.this, CmsUILogEvents.MAIN_IMAGE, null, 2, null);
                CmsImage cmsImage2 = MainImageItem.this.getCmsImage();
                if (cmsImage2 == null || (imageClick = MainImageItem.this.getImageClick()) == null) {
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(view, "view");
                imageClick.onClick(view, cmsImage2);
            }
        });
    }

    /* compiled from: MainImageItem.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/glority/android/cmsui/entity/MainImageItem$Companion;", "", "()V", "create", "Lcom/glority/android/cmsui/entity/MainImageItem;", TtmlNode.TAG_LAYOUT, "Lcom/glority/android/cmsui/model/CmsLayout;", "cmsTags", "", "Lcom/glority/android/cmsui/model/CmsTag;", Args.pageName, "", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ MainImageItem create$default(Companion companion, CmsLayout cmsLayout, List list, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = "";
            }
            return companion.create(cmsLayout, list, str);
        }

        public final MainImageItem create(CmsLayout layout, List<CmsTag> cmsTags, String pageName) {
            String str;
            Object obj;
            List<Map<String, Object>> tagValues;
            Object obj2;
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(cmsTags, "cmsTags");
            Intrinsics.checkNotNullParameter(pageName, "pageName");
            List<String> tagNames = layout.getTagNames();
            CmsImage cmsImage = null;
            if (tagNames != null && (str = (String) CollectionsKt.firstOrNull((List) tagNames)) != null) {
                Iterator<T> it = cmsTags.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual(((CmsTag) obj).getTagName(), str)) {
                        break;
                    }
                }
                CmsTag cmsTag = (CmsTag) obj;
                if (cmsTag != null && (tagValues = cmsTag.getTagValues()) != null) {
                    Iterator<T> it2 = tagValues.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        if (CmsTagValueUtil.INSTANCE.isCmsImage((Map) obj2)) {
                            break;
                        }
                    }
                    Map<String, ? extends Object> map = (Map) obj2;
                    if (map != null) {
                        try {
                            cmsImage = CmsTagValueUtil.INSTANCE.convert2CmsImage(map);
                        } catch (Exception e) {
                            if (AppContext.INSTANCE.isDebugMode()) {
                                LogUtils.e(Log.getStackTraceString(e));
                            }
                        }
                        return new MainImageItem(cmsImage, pageName);
                    }
                }
            }
            return null;
        }
    }
}
