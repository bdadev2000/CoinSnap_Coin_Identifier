package com.glority.android.cmsui.entity;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.glority.android.cms.base.BaseItem;
import com.glority.android.cms.listener.ClickListener;
import com.glority.android.cmsui.R;
import com.glority.android.cmsui.common.CmsUILogEvents;
import com.glority.android.cmsui.model.CmsImage;
import com.glority.android.cmsui.routers.GetDefaultImageDrawableRequest;
import com.glority.android.cmsui.widget.AppFlowLayout;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.utils.stability.LogUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: FlowerImagesItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
/* loaded from: classes14.dex */
final class FlowerImagesItem$render$render$1 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ AppFlowLayout $flowLayout;
    final /* synthetic */ List $flowerImages;
    final /* synthetic */ boolean $isFold;
    final /* synthetic */ boolean $isOdd;
    final /* synthetic */ FlowerImagesItem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowerImagesItem$render$render$1(FlowerImagesItem flowerImagesItem, AppFlowLayout appFlowLayout, List list, boolean z, boolean z2) {
        super(1);
        this.this$0 = flowerImagesItem;
        this.$flowLayout = appFlowLayout;
        this.$flowerImages = list;
        this.$isFold = z;
        this.$isOdd = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(final int i) {
        int roundRadius;
        int i2;
        this.$flowLayout.removeAllViews();
        final int i3 = 0;
        for (Object obj : this.$flowerImages) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final CmsImage cmsImage = (CmsImage) obj;
            if (!this.$isFold || i3 < i) {
                final int flowerImageWidth1 = (this.$isOdd && i3 == this.$flowerImages.size() - 1) ? this.this$0.getFlowerImageWidth1() : this.this$0.getFlowerImageWidth2();
                final int flowerImageHeight1 = (this.$isOdd && i3 == this.$flowerImages.size() - 1) ? this.this$0.getFlowerImageHeight1() : this.this$0.getFlowerImageHeight2();
                ImageView imageView = new ImageView(this.$flowLayout.getContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setLayoutParams(new ViewGroup.LayoutParams(flowerImageWidth1, flowerImageHeight1));
                ImageView imageView2 = imageView;
                RequestBuilder<Drawable> load = Glide.with(imageView2).load(cmsImage.getImageUrl());
                CenterCrop centerCrop = new CenterCrop();
                roundRadius = this.this$0.getRoundRadius();
                RequestBuilder transform = load.transform(centerCrop, new RoundedCorners(roundRadius));
                try {
                    i2 = new GetDefaultImageDrawableRequest().toResult().intValue();
                } catch (Exception e) {
                    if (AppContext.INSTANCE.isDebugMode()) {
                        LogUtils.e(Log.getStackTraceString(e));
                    }
                    i2 = R.drawable.common_background_banner;
                }
                transform.placeholder(i2).into(imageView);
                ViewExtensionsKt.setRipple$default(imageView2, false, 1, null);
                ViewExtensionsKt.setSingleClickListener$default(imageView2, 0L, new Function1<View, Unit>() { // from class: com.glority.android.cmsui.entity.FlowerImagesItem$render$render$1$$special$$inlined$forEachIndexed$lambda$1
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
                        BaseItem.logEvent$default(this.this$0, CmsUILogEvents.CMS_FLOWER_IMAGE, null, 2, null);
                        ClickListener<Integer> imageClick = this.this$0.getImageClick();
                        if (imageClick != null) {
                            imageClick.onClick(it, Integer.valueOf(i3));
                        }
                    }
                }, 1, (Object) null);
                this.$flowLayout.addView(imageView2);
            }
            i3 = i4;
        }
    }
}
