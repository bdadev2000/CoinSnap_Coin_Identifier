package com.glority.android.cmsui.entity;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.cms.base.BaseItem;
import com.glority.android.cms.base.ExtraData;
import com.glority.android.cms.listener.ClickListener;
import com.glority.android.cmsui.R;
import com.glority.android.cmsui.common.CmsUILogEvents;
import com.glority.android.cmsui.model.CmsImage;
import com.glority.android.cmsui.widget.AppFlowLayout;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.xx.constants.Args;
import com.glority.utils.app.ResUtils;
import com.glority.utils.ui.ViewUtils;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: FlowerImagesItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b%\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 D2\u00020\u0001:\u0001DB7\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0002\u0010\u000bJ\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\t\u00103\u001a\u00020\bHÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003JA\u00106\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\u0013\u00107\u001a\u00020\b2\b\u00108\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\b\u00109\u001a\u00020\u0016H\u0016J\t\u0010:\u001a\u00020\u0016HÖ\u0001J \u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0016J\t\u0010C\u001a\u00020\u0006HÖ\u0001R$\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001c\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b\u001f\u0010\u0018R\u001b\u0010!\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b\"\u0010\u0018R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0010\"\u0004\b*\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u001b\u0010.\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u001a\u001a\u0004\b/\u0010\u0018¨\u0006E"}, d2 = {"Lcom/glority/android/cmsui/entity/FlowerImagesItem;", "Lcom/glority/android/cms/base/BaseItem;", "flowerImages", "", "Lcom/glority/android/cmsui/model/CmsImage;", "name", "", "isLatin", "", "feedbackEnable", Args.pageName, "(Ljava/util/List;Ljava/lang/String;ZZLjava/lang/String;)V", "feedbackClick", "Lcom/glority/android/cms/listener/ClickListener;", "", "getFeedbackClick", "()Lcom/glority/android/cms/listener/ClickListener;", "setFeedbackClick", "(Lcom/glority/android/cms/listener/ClickListener;)V", "getFeedbackEnable", "()Z", "flowerImageHeight1", "", "getFlowerImageHeight1", "()I", "flowerImageHeight1$delegate", "Lkotlin/Lazy;", "flowerImageHeight2", "getFlowerImageHeight2", "flowerImageHeight2$delegate", "flowerImageWidth1", "getFlowerImageWidth1", "flowerImageWidth1$delegate", "flowerImageWidth2", "getFlowerImageWidth2", "flowerImageWidth2$delegate", "getFlowerImages", "()Ljava/util/List;", "setFlowerImages", "(Ljava/util/List;)V", "imageClick", "getImageClick", "setImageClick", "getName", "()Ljava/lang/String;", "getPageName", "roundRadius", "getRoundRadius", "roundRadius$delegate", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "getLayoutId", "hashCode", "render", "", "context", "Landroid/content/Context;", "helper", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "data", "Lcom/glority/android/cms/base/ExtraData;", "toString", "Companion", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class FlowerImagesItem extends BaseItem {
    public static final String layoutName = "SimilarImage";
    private ClickListener<Object> feedbackClick;
    private final boolean feedbackEnable;

    /* renamed from: flowerImageHeight1$delegate, reason: from kotlin metadata */
    private final Lazy flowerImageHeight1;

    /* renamed from: flowerImageHeight2$delegate, reason: from kotlin metadata */
    private final Lazy flowerImageHeight2;

    /* renamed from: flowerImageWidth1$delegate, reason: from kotlin metadata */
    private final Lazy flowerImageWidth1;

    /* renamed from: flowerImageWidth2$delegate, reason: from kotlin metadata */
    private final Lazy flowerImageWidth2;
    private List<CmsImage> flowerImages;
    private ClickListener<Integer> imageClick;
    private final boolean isLatin;
    private final String name;
    private final String pageName;

    /* renamed from: roundRadius$delegate, reason: from kotlin metadata */
    private final Lazy roundRadius;

    public static /* synthetic */ FlowerImagesItem copy$default(FlowerImagesItem flowerImagesItem, List list, String str, boolean z, boolean z2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = flowerImagesItem.flowerImages;
        }
        if ((i & 2) != 0) {
            str = flowerImagesItem.name;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            z = flowerImagesItem.isLatin;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = flowerImagesItem.feedbackEnable;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            str2 = flowerImagesItem.pageName;
        }
        return flowerImagesItem.copy(list, str3, z3, z4, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getFlowerImageHeight1() {
        return ((Number) this.flowerImageHeight1.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getFlowerImageHeight2() {
        return ((Number) this.flowerImageHeight2.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getFlowerImageWidth1() {
        return ((Number) this.flowerImageWidth1.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getFlowerImageWidth2() {
        return ((Number) this.flowerImageWidth2.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getRoundRadius() {
        return ((Number) this.roundRadius.getValue()).intValue();
    }

    public final List<CmsImage> component1() {
        return this.flowerImages;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLatin() {
        return this.isLatin;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getFeedbackEnable() {
        return this.feedbackEnable;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPageName() {
        return this.pageName;
    }

    public final FlowerImagesItem copy(List<CmsImage> flowerImages, String name, boolean isLatin, boolean feedbackEnable, String pageName) {
        Intrinsics.checkNotNullParameter(flowerImages, "flowerImages");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        return new FlowerImagesItem(flowerImages, name, isLatin, feedbackEnable, pageName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlowerImagesItem)) {
            return false;
        }
        FlowerImagesItem flowerImagesItem = (FlowerImagesItem) other;
        return Intrinsics.areEqual(this.flowerImages, flowerImagesItem.flowerImages) && Intrinsics.areEqual(this.name, flowerImagesItem.name) && this.isLatin == flowerImagesItem.isLatin && this.feedbackEnable == flowerImagesItem.feedbackEnable && Intrinsics.areEqual(this.pageName, flowerImagesItem.pageName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        List<CmsImage> list = this.flowerImages;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.isLatin;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.feedbackEnable;
        int i3 = (i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        String str2 = this.pageName;
        return i3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "FlowerImagesItem(flowerImages=" + this.flowerImages + ", name=" + this.name + ", isLatin=" + this.isLatin + ", feedbackEnable=" + this.feedbackEnable + ", pageName=" + this.pageName + ")";
    }

    public final List<CmsImage> getFlowerImages() {
        return this.flowerImages;
    }

    public final String getName() {
        return this.name;
    }

    public final void setFlowerImages(List<CmsImage> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.flowerImages = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowerImagesItem(List<CmsImage> flowerImages, String name, boolean z, boolean z2, String pageName) {
        super(pageName);
        Intrinsics.checkNotNullParameter(flowerImages, "flowerImages");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        this.flowerImages = flowerImages;
        this.name = name;
        this.isLatin = z;
        this.feedbackEnable = z2;
        this.pageName = pageName;
        this.flowerImageWidth1 = LazyKt.lazy(new Function0<Integer>() { // from class: com.glority.android.cmsui.entity.FlowerImagesItem$flowerImageWidth1$2
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Integer invoke() {
                return Integer.valueOf(invoke2());
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final int invoke2() {
                return ViewUtils.getScreenWidth() - ((int) ResUtils.getDimension(R.dimen.x72));
            }
        });
        this.flowerImageWidth2 = LazyKt.lazy(new Function0<Integer>() { // from class: com.glority.android.cmsui.entity.FlowerImagesItem$flowerImageWidth2$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Integer invoke() {
                return Integer.valueOf(invoke2());
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final int invoke2() {
                int flowerImageWidth1;
                flowerImageWidth1 = FlowerImagesItem.this.getFlowerImageWidth1();
                return (flowerImageWidth1 - ((int) ResUtils.getDimension(R.dimen.x18))) / 2;
            }
        });
        this.flowerImageHeight1 = LazyKt.lazy(new Function0<Integer>() { // from class: com.glority.android.cmsui.entity.FlowerImagesItem$flowerImageHeight1$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Integer invoke() {
                return Integer.valueOf(invoke2());
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final int invoke2() {
                int flowerImageWidth1;
                flowerImageWidth1 = FlowerImagesItem.this.getFlowerImageWidth1();
                return (int) ((flowerImageWidth1 * 106) / 165.0f);
            }
        });
        this.flowerImageHeight2 = LazyKt.lazy(new Function0<Integer>() { // from class: com.glority.android.cmsui.entity.FlowerImagesItem$flowerImageHeight2$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Integer invoke() {
                return Integer.valueOf(invoke2());
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final int invoke2() {
                int flowerImageWidth2;
                flowerImageWidth2 = FlowerImagesItem.this.getFlowerImageWidth2();
                return (int) ((flowerImageWidth2 * 215) / 335.0f);
            }
        });
        this.roundRadius = LazyKt.lazy(new Function0<Integer>() { // from class: com.glority.android.cmsui.entity.FlowerImagesItem$roundRadius$2
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Integer invoke() {
                return Integer.valueOf(invoke2());
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final int invoke2() {
                return (int) ResUtils.getDimension(R.dimen.x12);
            }
        });
    }

    public /* synthetic */ FlowerImagesItem(List list, String str, boolean z, boolean z2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? "" : str2);
    }

    public final boolean getFeedbackEnable() {
        return this.feedbackEnable;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final boolean isLatin() {
        return this.isLatin;
    }

    public final ClickListener<Integer> getImageClick() {
        return this.imageClick;
    }

    public final void setImageClick(ClickListener<Integer> clickListener) {
        this.imageClick = clickListener;
    }

    public final ClickListener<Object> getFeedbackClick() {
        return this.feedbackClick;
    }

    public final void setFeedbackClick(ClickListener<Object> clickListener) {
        this.feedbackClick = clickListener;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public int getLayoutId() {
        return R.layout.item_flower_images;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public void render(Context context, BaseViewHolder helper, ExtraData data) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(data, "data");
        helper.setGone(R.id.v_feedBack, this.feedbackEnable);
        String rawTitle = ResUtils.getString(R.string.item_detail_similar_images_title, this.name);
        if (this.isLatin) {
            String str2 = rawTitle;
            SpannableString spannableString = new SpannableString(str2);
            Intrinsics.checkNotNullExpressionValue(rawTitle, "rawTitle");
            int indexOf$default = StringsKt.indexOf$default((CharSequence) str2, this.name, 0, false, 6, (Object) null);
            spannableString.setSpan(new StyleSpan(2), indexOf$default, this.name.length() + indexOf$default, 33);
            str = spannableString;
        } else {
            str = rawTitle;
        }
        helper.setText(R.id.tv_images_title, str);
        final List<CmsImage> list = this.flowerImages;
        boolean z = list.size() % 2 == 1;
        AppFlowLayout appFlowLayout = (AppFlowLayout) helper.getView(R.id.flow_layout);
        boolean z2 = list.size() > 4;
        final View view = helper.getView(R.id.show_more_container);
        view.setVisibility(z2 ? 0 : 8);
        final FlowerImagesItem$render$render$1 flowerImagesItem$render$render$1 = new FlowerImagesItem$render$render$1(this, appFlowLayout, list, z2, z);
        flowerImagesItem$render$render$1.invoke((FlowerImagesItem$render$render$1) 4);
        ViewExtensionsKt.setSingleClickListener$default(view, 0L, new Function1<View, Unit>() { // from class: com.glority.android.cmsui.entity.FlowerImagesItem$render$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                BaseItem.logEvent$default(FlowerImagesItem.this, CmsUILogEvents.CMS_SHOW_MORE_IMAGES, null, 2, null);
                BaseItem.logEvent$default(FlowerImagesItem.this, FlowerImagesItem.this.getPageName() + "_learnmoreitemcontent_click", null, 2, null);
                view.setVisibility(8);
                flowerImagesItem$render$render$1.invoke(Integer.valueOf(list.size()));
            }
        }, 1, (Object) null);
        ViewExtensionsKt.setSingleClickListener$default(helper.getView(R.id.v_feedBack), 0L, new Function1<View, Unit>() { // from class: com.glority.android.cmsui.entity.FlowerImagesItem$render$2
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
                FlowerImagesItem.this.logEvent(CmsUILogEvents.CMS_FEED_BACK, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("name", FlowerImagesItem.layoutName)));
                ClickListener<Object> feedbackClick = FlowerImagesItem.this.getFeedbackClick();
                if (feedbackClick != null) {
                    feedbackClick.onClick(it, null);
                }
            }
        }, 1, (Object) null);
    }
}
