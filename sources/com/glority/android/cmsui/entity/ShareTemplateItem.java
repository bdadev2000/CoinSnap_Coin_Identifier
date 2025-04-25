package com.glority.android.cmsui.entity;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.cms.base.BaseItem;
import com.glority.android.cms.base.ExtraData;
import com.glority.android.cms.listener.ClickListener;
import com.glority.android.cmsui.R;
import com.glority.android.cmsui.common.CmsUILogEvents;
import com.glority.android.cmsui.entity.ShareTemplateItem;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.xx.constants.Args;
import com.glority.utils.app.ResUtils;
import com.glority.utils.ui.ViewUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShareTemplateItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 +2\u00020\u0001:\u0002*+B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010 \u001a\u00020!H\u0016J \u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016R$\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\r¨\u0006,"}, d2 = {"Lcom/glority/android/cmsui/entity/ShareTemplateItem;", "Lcom/glority/android/cms/base/BaseItem;", Args.pageName, "", "feedbackEnable", "", "(Ljava/lang/String;Z)V", "feedbackClick", "Lcom/glority/android/cms/listener/ClickListener;", "", "getFeedbackClick", "()Lcom/glority/android/cms/listener/ClickListener;", "setFeedbackClick", "(Lcom/glority/android/cms/listener/ClickListener;)V", "getFeedbackEnable", "()Z", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "images", "Landroidx/lifecycle/MutableLiveData;", "", "Landroid/graphics/Bitmap;", "getImages", "()Landroidx/lifecycle/MutableLiveData;", "setImages", "(Landroidx/lifecycle/MutableLiveData;)V", "getPageName", "()Ljava/lang/String;", "shareClick", "Lcom/glority/android/cmsui/entity/ShareTemplateItem$ClickType;", "getShareClick", "setShareClick", "getLayoutId", "", "render", "", "context", "Landroid/content/Context;", "helper", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "data", "Lcom/glority/android/cms/base/ExtraData;", "ClickType", "Companion", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class ShareTemplateItem extends BaseItem {
    public static final String layoutName = "TemplateShare";
    private ClickListener<Object> feedbackClick;
    private final boolean feedbackEnable;
    private ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
    private MutableLiveData<List<Bitmap>> images;
    private final String pageName;
    private ClickListener<ClickType> shareClick;

    /* compiled from: ShareTemplateItem.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/glority/android/cmsui/entity/ShareTemplateItem$ClickType;", "", "(Ljava/lang/String;I)V", "IMAGE_CLICK1", "IMAGE_CLICK2", "BUTTON_CLICK", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public enum ClickType {
        IMAGE_CLICK1,
        IMAGE_CLICK2,
        BUTTON_CLICK
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareTemplateItem(String pageName, boolean z) {
        super(pageName);
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        this.pageName = pageName;
        this.feedbackEnable = z;
        this.images = new MutableLiveData<>();
    }

    public /* synthetic */ ShareTemplateItem(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }

    public final boolean getFeedbackEnable() {
        return this.feedbackEnable;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final MutableLiveData<List<Bitmap>> getImages() {
        return this.images;
    }

    public final void setImages(MutableLiveData<List<Bitmap>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.images = mutableLiveData;
    }

    public final ClickListener<ClickType> getShareClick() {
        return this.shareClick;
    }

    public final void setShareClick(ClickListener<ClickType> clickListener) {
        this.shareClick = clickListener;
    }

    public final ClickListener<Object> getFeedbackClick() {
        return this.feedbackClick;
    }

    public final void setFeedbackClick(ClickListener<Object> clickListener) {
        this.feedbackClick = clickListener;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public int getLayoutId() {
        return R.layout.item_share_template;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public void render(final Context context, final BaseViewHolder helper, final ExtraData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(data, "data");
        helper.setGone(R.id.v_feedBack, this.feedbackEnable);
        final ImageView imageView = (ImageView) helper.getView(R.id.iv_img1);
        final ImageView imageView2 = (ImageView) helper.getView(R.id.iv_img2);
        List<Bitmap> value = this.images.getValue();
        if (value != null && value.size() >= 2) {
            List<Bitmap> value2 = this.images.getValue();
            Intrinsics.checkNotNull(value2);
            imageView.setImageBitmap(value2.get(0));
            List<Bitmap> value3 = this.images.getValue();
            Intrinsics.checkNotNull(value3);
            imageView2.setImageBitmap(value3.get(1));
            ViewExtensionsKt.setSingleClickListener$default(imageView, 0L, new Function1<View, Unit>() { // from class: com.glority.android.cmsui.entity.ShareTemplateItem$render$1
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
                    imageView2.setSelected(false);
                    imageView.setSelected(true);
                }
            }, 1, (Object) null);
            ViewExtensionsKt.setSingleClickListener$default(imageView2, 0L, new Function1<View, Unit>() { // from class: com.glority.android.cmsui.entity.ShareTemplateItem$render$2
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
                    imageView2.setSelected(true);
                    imageView.setSelected(false);
                }
            }, 1, (Object) null);
        } else {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) (!(context instanceof LifecycleOwner) ? null : context);
            if (lifecycleOwner != null) {
                this.images.observe(lifecycleOwner, new Observer<List<? extends Bitmap>>() { // from class: com.glority.android.cmsui.entity.ShareTemplateItem$render$$inlined$let$lambda$1
                    @Override // androidx.lifecycle.Observer
                    public /* bridge */ /* synthetic */ void onChanged(List<? extends Bitmap> list) {
                        onChanged2((List<Bitmap>) list);
                    }

                    /* renamed from: onChanged, reason: avoid collision after fix types in other method */
                    public final void onChanged2(List<Bitmap> list) {
                        ShareTemplateItem.this.render(context, helper, data);
                    }
                });
            }
            this.globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.glority.android.cmsui.entity.ShareTemplateItem$render$4
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
                    ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2;
                    double screenWidth = (ViewUtils.getScreenWidth() - ResUtils.getDimension(R.dimen.x50)) / 2;
                    imageView.getLayoutParams().height = (int) (((ViewUtils.getScreenHeight() * 0.75d) / ViewUtils.getScreenWidth()) * screenWidth);
                    imageView2.getLayoutParams().height = (int) (screenWidth * ((ViewUtils.getScreenHeight() * 0.75d) / ViewUtils.getScreenWidth()));
                    onGlobalLayoutListener = ShareTemplateItem.this.globalLayoutListener;
                    if (onGlobalLayoutListener != null) {
                        View view = helper.itemView;
                        Intrinsics.checkNotNullExpressionValue(view, "helper.itemView");
                        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                        onGlobalLayoutListener2 = ShareTemplateItem.this.globalLayoutListener;
                        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener2);
                    }
                }
            };
            View view = helper.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "helper.itemView");
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
        }
        ViewExtensionsKt.setSingleClickListener$default(imageView, 0L, new Function1<View, Unit>() { // from class: com.glority.android.cmsui.entity.ShareTemplateItem$render$5
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                invoke2(view2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ShareTemplateItem.this.logEvent(CmsUILogEvents.TEMPLATE_SHARE_CLICK, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("index", 1)));
                ClickListener<ShareTemplateItem.ClickType> shareClick = ShareTemplateItem.this.getShareClick();
                if (shareClick != null) {
                    shareClick.onClick(it, ShareTemplateItem.ClickType.IMAGE_CLICK1);
                }
            }
        }, 1, (Object) null);
        ViewExtensionsKt.setSingleClickListener$default(imageView2, 0L, new Function1<View, Unit>() { // from class: com.glority.android.cmsui.entity.ShareTemplateItem$render$6
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                invoke2(view2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ShareTemplateItem.this.logEvent(CmsUILogEvents.TEMPLATE_SHARE_CLICK, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("index", 2)));
                ClickListener<ShareTemplateItem.ClickType> shareClick = ShareTemplateItem.this.getShareClick();
                if (shareClick != null) {
                    shareClick.onClick(it, ShareTemplateItem.ClickType.IMAGE_CLICK2);
                }
            }
        }, 1, (Object) null);
        ViewExtensionsKt.setSingleClickListener$default(helper.getView(R.id.ll_share), 0L, new Function1<View, Unit>() { // from class: com.glority.android.cmsui.entity.ShareTemplateItem$render$7
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                invoke2(view2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ShareTemplateItem.this.logEvent(CmsUILogEvents.TEMPLATE_SHARE_CLICK, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("index", 0)));
                ClickListener<ShareTemplateItem.ClickType> shareClick = ShareTemplateItem.this.getShareClick();
                if (shareClick != null) {
                    shareClick.onClick(it, ShareTemplateItem.ClickType.BUTTON_CLICK);
                }
            }
        }, 1, (Object) null);
        ViewExtensionsKt.setSingleClickListener$default(helper.getView(R.id.v_feedBack), 0L, new Function1<View, Unit>() { // from class: com.glority.android.cmsui.entity.ShareTemplateItem$render$8
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                invoke2(view2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ShareTemplateItem.this.logEvent(CmsUILogEvents.CMS_FEED_BACK, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("name", ShareTemplateItem.layoutName)));
                ClickListener<Object> feedbackClick = ShareTemplateItem.this.getFeedbackClick();
                if (feedbackClick != null) {
                    feedbackClick.onClick(it, null);
                }
            }
        }, 1, (Object) null);
    }
}
