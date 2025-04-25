package com.glority.android.cmsui.entity;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.cms.base.BaseItem;
import com.glority.android.cms.base.ExtraData;
import com.glority.android.cms.listener.ClickListener;
import com.glority.android.cmsui.R;
import com.glority.android.cmsui.model.CmsObject;
import com.glority.android.cmsui.util.NameCardUtil;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.xx.constants.Args;
import com.glority.utils.app.ResUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LikeItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 #2\u00020\u0001:\u0001#B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0016J \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000b¨\u0006$"}, d2 = {"Lcom/glority/android/cmsui/entity/LikeItem;", "Lcom/glority/android/cms/base/BaseItem;", "cmsObject", "Lcom/glority/android/cmsui/model/CmsObject;", "currentStatus", "", Args.pageName, "(Lcom/glority/android/cmsui/model/CmsObject;Ljava/lang/String;Ljava/lang/String;)V", "getCmsObject", "()Lcom/glority/android/cmsui/model/CmsObject;", "getCurrentStatus", "()Ljava/lang/String;", "setCurrentStatus", "(Ljava/lang/String;)V", "likeClick", "Lcom/glority/android/cms/listener/ClickListener;", "getLikeClick", "()Lcom/glority/android/cms/listener/ClickListener;", "setLikeClick", "(Lcom/glority/android/cms/listener/ClickListener;)V", "getPageName", "getLayoutId", "", "render", "", "context", "Landroid/content/Context;", "helper", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "data", "Lcom/glority/android/cms/base/ExtraData;", "udpateStatus", "likeView", "Landroid/widget/LinearLayout;", "dislikeView", "Companion", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class LikeItem extends BaseItem {
    public static final String DISLIKE = "0";
    public static final String LIKE = "1";
    private final CmsObject cmsObject;
    private String currentStatus;
    private ClickListener<String> likeClick;
    private final String pageName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LikeItem(CmsObject cmsObject, String currentStatus, String pageName) {
        super(pageName);
        Intrinsics.checkNotNullParameter(cmsObject, "cmsObject");
        Intrinsics.checkNotNullParameter(currentStatus, "currentStatus");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        this.cmsObject = cmsObject;
        this.currentStatus = currentStatus;
        this.pageName = pageName;
    }

    public /* synthetic */ LikeItem(CmsObject cmsObject, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cmsObject, str, (i & 4) != 0 ? "" : str2);
    }

    public final CmsObject getCmsObject() {
        return this.cmsObject;
    }

    public final String getCurrentStatus() {
        return this.currentStatus;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final void setCurrentStatus(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentStatus = str;
    }

    public final ClickListener<String> getLikeClick() {
        return this.likeClick;
    }

    public final void setLikeClick(ClickListener<String> clickListener) {
        this.likeClick = clickListener;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public int getLayoutId() {
        return R.layout.cms_item_like;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public void render(Context context, BaseViewHolder helper, ExtraData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(data, "data");
        helper.setText(R.id.tv_title, ResUtils.getString(R.string.text_customize_all_like_title, NameCardUtil.INSTANCE.getName(this.cmsObject)));
        final LinearLayout linearLayout = (LinearLayout) helper.getView(R.id.ll_like);
        final LinearLayout linearLayout2 = (LinearLayout) helper.getView(R.id.ll_dislike);
        udpateStatus(linearLayout, linearLayout2);
        ViewExtensionsKt.setSingleClickListener$default(linearLayout, 0L, new Function1<View, Unit>() { // from class: com.glority.android.cmsui.entity.LikeItem$render$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (Intrinsics.areEqual(LikeItem.this.getCurrentStatus(), "1")) {
                    return;
                }
                LikeItem.this.setCurrentStatus("1");
                ClickListener<String> likeClick = LikeItem.this.getLikeClick();
                if (likeClick != null) {
                    likeClick.onClick(it, "1");
                }
                LikeItem.this.udpateStatus(linearLayout, linearLayout2);
            }
        }, 1, (Object) null);
        ViewExtensionsKt.setSingleClickListener$default(linearLayout2, 0L, new Function1<View, Unit>() { // from class: com.glority.android.cmsui.entity.LikeItem$render$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (Intrinsics.areEqual(LikeItem.this.getCurrentStatus(), LikeItem.DISLIKE)) {
                    return;
                }
                LikeItem.this.setCurrentStatus(LikeItem.DISLIKE);
                ClickListener<String> likeClick = LikeItem.this.getLikeClick();
                if (likeClick != null) {
                    likeClick.onClick(it, LikeItem.DISLIKE);
                }
                LikeItem.this.udpateStatus(linearLayout, linearLayout2);
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void udpateStatus(LinearLayout likeView, LinearLayout dislikeView) {
        if (Intrinsics.areEqual(this.currentStatus, "1")) {
            likeView.setSelected(true);
            dislikeView.setSelected(false);
        } else if (Intrinsics.areEqual(this.currentStatus, DISLIKE)) {
            likeView.setSelected(false);
            dislikeView.setSelected(true);
        } else {
            likeView.setSelected(false);
            dislikeView.setSelected(false);
        }
    }
}
