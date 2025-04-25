package com.glority.android.picturexx.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.os.BundleKt;
import androidx.palette.graphics.Palette;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.FutureTarget;
import com.glority.android.cmsui2.util.CmsDataUtils;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.picturexx.business.databinding.ViewRecognizeHeaderBinding;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.ext.ViewExtensionsKt;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import com.glority.utils.stability.LogUtils;
import com.glority.widget.GlTextView;
import com.glority.widget.imagepager.GlNormalImagePagerActivity;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: RecognizeHeaderView.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J8\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013J*\u0010\u0018\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013H\u0002J:\u0010\u001b\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u0013H\u0002JN\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010\u00132\b\u0010 \u001a\u0004\u0018\u00010\u0013H\u0002JO\u0010!\u001a\u00020\u00102\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u00132#\u0010#\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0013¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u00100$H\u0002J&\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010\u00132\b\u0010+\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u001e\u0010,\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006-"}, d2 = {"Lcom/glority/android/picturexx/widget/RecognizeHeaderView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "logBundle", "Landroid/os/Bundle;", "binding", "Lcom/glority/android/picturexx/business/databinding/ViewRecognizeHeaderBinding;", "currentSelectedIndex", "", "Ljava/lang/Integer;", "loadData", "", "userImages", "", "", Args.cmsName, "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", Args.speciesUid, Args.varietyUid, "setSingleImage", "denominationSideImage", "subjectSide", "setMultiImages", "subjectSideImage", "onSelected", "index", "nonDenominationSideDesign", "denominationSideDesign", "getHeaderImageRealPath", "userImage", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "path", "createMergeImage", "Landroid/graphics/Bitmap;", "image1", "image2", "visibleCount", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class RecognizeHeaderView extends FrameLayout {
    public static final int $stable = 8;
    private final ViewRecognizeHeaderBinding binding;
    private Integer currentSelectedIndex;
    private Bundle logBundle;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecognizeHeaderView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RecognizeHeaderView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecognizeHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.logBundle = BundleKt.bundleOf(new Pair[0]);
        ViewRecognizeHeaderBinding inflate = ViewRecognizeHeaderBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(3:4|5|(3:7|(3:9|(4:12|(4:14|15|(4:18|(3:23|24|25)|26|16)|29)(1:31)|30|10)|32)(1:123)|(11:34|35|(8:39|(1:41)(1:96)|42|43|(3:75|76|(2:87|88)(3:89|90|91))(5:45|46|(1:48)(1:74)|49|(1:73)(3:51|52|(2:63|64)(3:66|67|68)))|65|36|37)|97|98|99|100|(1:102)(1:113)|(1:104)(1:112)|105|(2:107|108)(2:110|111))))|126|99|100|(0)(0)|(0)(0)|105|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x012a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void loadData(java.util.List<java.lang.String> r16, com.glority.component.generatedAPI.kotlinAPI.cms.CmsName r17, android.os.Bundle r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.widget.RecognizeHeaderView.loadData(java.util.List, com.glority.component.generatedAPI.kotlinAPI.cms.CmsName, android.os.Bundle, java.lang.String, java.lang.String):void");
    }

    private final void setSingleImage(List<String> userImages, String denominationSideImage, String subjectSide) {
        getHeaderImageRealPath(userImages, denominationSideImage, subjectSide, new Function1<String, Unit>() { // from class: com.glority.android.picturexx.widget.RecognizeHeaderView$setSingleImage$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                ViewRecognizeHeaderBinding viewRecognizeHeaderBinding;
                try {
                    viewRecognizeHeaderBinding = RecognizeHeaderView.this.binding;
                    ImageView singleIv = viewRecognizeHeaderBinding.singleIv;
                    Intrinsics.checkNotNullExpressionValue(singleIv, "singleIv");
                    ViewExtensionsKt.load(singleIv, str);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e) {
                    if (AppContext.INSTANCE.isDebugMode()) {
                        LogUtils.e(Log.getStackTraceString(e));
                    }
                }
            }
        });
    }

    private final void setMultiImages(final List<String> userImages, final CmsName cmsName, final Bundle logBundle, final String denominationSideImage, final String subjectSideImage) {
        int i;
        int i2;
        int i3;
        String str;
        final String tagValue = CmsDataUtils.INSTANCE.getTagValue(cmsName, "Image:NonDenominationSideDesign");
        final String tagValue2 = CmsDataUtils.INSTANCE.getTagValue(cmsName, "Image:DenominationSideDesign");
        if (userImages.size() > 1) {
            Integer num = this.currentSelectedIndex;
            this.currentSelectedIndex = Integer.valueOf(num != null ? num.intValue() : 0);
            ImageView photo1Iv = this.binding.photo1Iv;
            Intrinsics.checkNotNullExpressionValue(photo1Iv, "photo1Iv");
            ViewExtensionsKt.load(photo1Iv, userImages.get(0));
            ImageView photo2Iv = this.binding.photo2Iv;
            Intrinsics.checkNotNullExpressionValue(photo2Iv, "photo2Iv");
            ViewExtensionsKt.load(photo2Iv, userImages.get(1));
            LinearLayout photoLl = this.binding.photoLl;
            Intrinsics.checkNotNullExpressionValue(photoLl, "photoLl");
            i = 1;
            i2 = 8;
            i3 = 0;
            com.glority.android.core.ext.ViewExtensionsKt.setSingleClickListener$default(photoLl, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.widget.RecognizeHeaderView$setMultiImages$1
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
                    logBundle.putString("type", "userImage");
                    new LogEventRequest(LogEvents.headerimage_switch_click, new Bundle(logBundle)).post();
                    this.onSelected(0, userImages, cmsName, denominationSideImage, subjectSideImage, tagValue, tagValue2);
                }
            }, 1, (Object) null);
        } else {
            i = 1;
            i2 = 8;
            i3 = 0;
            LinearLayout photoLl2 = this.binding.photoLl;
            Intrinsics.checkNotNullExpressionValue(photoLl2, "photoLl");
            photoLl2.setVisibility(8);
        }
        String str2 = denominationSideImage;
        if (str2 != null && str2.length() != 0 && (str = subjectSideImage) != null && str.length() != 0) {
            Integer num2 = this.currentSelectedIndex;
            this.currentSelectedIndex = Integer.valueOf(num2 != null ? num2.intValue() : i);
            ImageView official1Iv = this.binding.official1Iv;
            Intrinsics.checkNotNullExpressionValue(official1Iv, "official1Iv");
            ViewExtensionsKt.load(official1Iv, subjectSideImage);
            ImageView official2Iv = this.binding.official2Iv;
            Intrinsics.checkNotNullExpressionValue(official2Iv, "official2Iv");
            ViewExtensionsKt.load(official2Iv, denominationSideImage);
            LinearLayout officialLl = this.binding.officialLl;
            Intrinsics.checkNotNullExpressionValue(officialLl, "officialLl");
            com.glority.android.core.ext.ViewExtensionsKt.setSingleClickListener$default(officialLl, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.widget.RecognizeHeaderView$setMultiImages$2
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
                    logBundle.putString("type", "refrenceImage");
                    new LogEventRequest(LogEvents.headerimage_switch_click, new Bundle(logBundle)).post();
                    this.onSelected(1, userImages, cmsName, denominationSideImage, subjectSideImage, tagValue, tagValue2);
                }
            }, 1, (Object) null);
        } else {
            LinearLayout officialLl2 = this.binding.officialLl;
            Intrinsics.checkNotNullExpressionValue(officialLl2, "officialLl");
            officialLl2.setVisibility(i2);
        }
        if ((tagValue != null && tagValue.length() > 0) || (tagValue2 != null && tagValue2.length() > 0)) {
            Integer num3 = this.currentSelectedIndex;
            this.currentSelectedIndex = Integer.valueOf(num3 != null ? num3.intValue() : 2);
            ShapeableImageView themeIv = this.binding.themeIv;
            Intrinsics.checkNotNullExpressionValue(themeIv, "themeIv");
            ViewExtensionsKt.load(themeIv, tagValue == null ? tagValue2 : tagValue);
            LinearLayout themeLl = this.binding.themeLl;
            Intrinsics.checkNotNullExpressionValue(themeLl, "themeLl");
            com.glority.android.core.ext.ViewExtensionsKt.setSingleClickListener$default(themeLl, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.widget.RecognizeHeaderView$setMultiImages$3
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
                    logBundle.putString("type", "designImage");
                    new LogEventRequest(LogEvents.headerimage_switch_click, new Bundle(logBundle)).post();
                    this.onSelected(2, userImages, cmsName, denominationSideImage, subjectSideImage, tagValue, tagValue2);
                }
            }, 1, (Object) null);
        } else {
            LinearLayout themeLl2 = this.binding.themeLl;
            Intrinsics.checkNotNullExpressionValue(themeLl2, "themeLl");
            themeLl2.setVisibility(i2);
        }
        Integer num4 = this.currentSelectedIndex;
        onSelected(num4 != null ? num4.intValue() : i3, userImages, cmsName, denominationSideImage, subjectSideImage, tagValue, tagValue2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSelected(int index, final List<String> userImages, CmsName cmsName, final String denominationSideImage, final String subjectSideImage, final String nonDenominationSideDesign, final String denominationSideDesign) {
        this.currentSelectedIndex = Integer.valueOf(index);
        FrameLayout doubleImageLayout = this.binding.doubleImageLayout;
        Intrinsics.checkNotNullExpressionValue(doubleImageLayout, "doubleImageLayout");
        doubleImageLayout.setVisibility(index < 2 ? 0 : 8);
        LinearLayout singleImageLayout = this.binding.singleImageLayout;
        Intrinsics.checkNotNullExpressionValue(singleImageLayout, "singleImageLayout");
        singleImageLayout.setVisibility(index == 2 ? 0 : 8);
        GlTextView photoMask = this.binding.photoMask;
        Intrinsics.checkNotNullExpressionValue(photoMask, "photoMask");
        photoMask.setVisibility(index == 0 ? 0 : 8);
        ImageView photoMaskArrow = this.binding.photoMaskArrow;
        Intrinsics.checkNotNullExpressionValue(photoMaskArrow, "photoMaskArrow");
        photoMaskArrow.setVisibility(index != 0 ? 4 : 0);
        GlTextView officialMask = this.binding.officialMask;
        Intrinsics.checkNotNullExpressionValue(officialMask, "officialMask");
        officialMask.setVisibility(index == 1 ? 0 : 8);
        ImageView officialMaskArrow = this.binding.officialMaskArrow;
        Intrinsics.checkNotNullExpressionValue(officialMaskArrow, "officialMaskArrow");
        officialMaskArrow.setVisibility(index != 1 ? 4 : 0);
        GlTextView themeMask = this.binding.themeMask;
        Intrinsics.checkNotNullExpressionValue(themeMask, "themeMask");
        themeMask.setVisibility(index == 2 ? 0 : 8);
        ImageView themeMaskArrow = this.binding.themeMaskArrow;
        Intrinsics.checkNotNullExpressionValue(themeMaskArrow, "themeMaskArrow");
        themeMaskArrow.setVisibility(index != 2 ? 4 : 0);
        if (index == 0) {
            ImageView iv1 = this.binding.iv1;
            Intrinsics.checkNotNullExpressionValue(iv1, "iv1");
            ViewExtensionsKt.load(iv1, CollectionsKt.getOrNull(userImages, 0));
            ImageView iv2 = this.binding.iv2;
            Intrinsics.checkNotNullExpressionValue(iv2, "iv2");
            ViewExtensionsKt.load(iv2, CollectionsKt.getOrNull(userImages, 1));
            FrameLayout doubleImageLayout2 = this.binding.doubleImageLayout;
            Intrinsics.checkNotNullExpressionValue(doubleImageLayout2, "doubleImageLayout");
            com.glority.android.core.ext.ViewExtensionsKt.setSingleClickListener$default(doubleImageLayout2, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.widget.RecognizeHeaderView$onSelected$1
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
                    Bundle bundle;
                    Bundle bundle2;
                    Intrinsics.checkNotNullParameter(it, "it");
                    bundle = RecognizeHeaderView.this.logBundle;
                    bundle.putString("type", "userImage");
                    bundle2 = RecognizeHeaderView.this.logBundle;
                    new LogEventRequest(LogEvents.result_headerimage_click, new Bundle(bundle2)).post();
                    GlNormalImagePagerActivity.Companion companion = GlNormalImagePagerActivity.INSTANCE;
                    Context context = it.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    companion.open(context, (String[]) userImages.toArray(new String[0]), 0);
                }
            }, 1, (Object) null);
            return;
        }
        if (index != 1) {
            if (index != 2) {
                return;
            }
            String tagValue = CmsDataUtils.INSTANCE.getTagValue(cmsName, "NonDenominationSideDesignDesc");
            String tagValue2 = CmsDataUtils.INSTANCE.getTagValue(cmsName, "DenominationSideDesignDesc");
            Glide.with(getContext()).load(nonDenominationSideDesign == null ? denominationSideDesign : nonDenominationSideDesign).centerCrop().into(this.binding.themeBigIv);
            this.binding.themeDescTv.setText(tagValue != null ? tagValue : tagValue2);
            LinearLayout singleImageLayout2 = this.binding.singleImageLayout;
            Intrinsics.checkNotNullExpressionValue(singleImageLayout2, "singleImageLayout");
            com.glority.android.core.ext.ViewExtensionsKt.setSingleClickListener$default(singleImageLayout2, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.widget.RecognizeHeaderView$onSelected$3
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
                    Bundle bundle;
                    Bundle bundle2;
                    Intrinsics.checkNotNullParameter(it, "it");
                    bundle = RecognizeHeaderView.this.logBundle;
                    bundle.putString("type", "designImage");
                    bundle2 = RecognizeHeaderView.this.logBundle;
                    new LogEventRequest(LogEvents.result_headerimage_click, new Bundle(bundle2)).post();
                    GlNormalImagePagerActivity.Companion companion = GlNormalImagePagerActivity.INSTANCE;
                    Context context = it.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    companion.open(context, (String[]) CollectionsKt.filterNotNull(CollectionsKt.arrayListOf(nonDenominationSideDesign, denominationSideDesign)).toArray(new String[0]), 0);
                }
            }, 1, (Object) null);
            return;
        }
        ImageView iv12 = this.binding.iv1;
        Intrinsics.checkNotNullExpressionValue(iv12, "iv1");
        ViewExtensionsKt.load(iv12, denominationSideImage);
        ImageView iv22 = this.binding.iv2;
        Intrinsics.checkNotNullExpressionValue(iv22, "iv2");
        ViewExtensionsKt.load(iv22, subjectSideImage);
        FrameLayout doubleImageLayout3 = this.binding.doubleImageLayout;
        Intrinsics.checkNotNullExpressionValue(doubleImageLayout3, "doubleImageLayout");
        com.glority.android.core.ext.ViewExtensionsKt.setSingleClickListener$default(doubleImageLayout3, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.widget.RecognizeHeaderView$onSelected$2
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
                Bundle bundle;
                Bundle bundle2;
                Intrinsics.checkNotNullParameter(it, "it");
                bundle = RecognizeHeaderView.this.logBundle;
                bundle.putString("type", "refrenceImage");
                bundle2 = RecognizeHeaderView.this.logBundle;
                new LogEventRequest(LogEvents.result_headerimage_click, new Bundle(bundle2)).post();
                GlNormalImagePagerActivity.Companion companion = GlNormalImagePagerActivity.INSTANCE;
                Context context = it.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                companion.open(context, (String[]) CollectionsKt.filterNotNull(CollectionsKt.arrayListOf(subjectSideImage, denominationSideImage)).toArray(new String[0]), 0);
            }
        }, 1, (Object) null);
    }

    private final void getHeaderImageRealPath(List<String> userImage, String denominationSideImage, String subjectSideImage, Function1<? super String, Unit> callback) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new RecognizeHeaderView$getHeaderImageRealPath$1(getContext(), userImage, denominationSideImage, subjectSideImage, this, callback, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap createMergeImage(String image1, String image2, Context context) {
        if (image1 != null && image2 != null) {
            try {
                FutureTarget<Bitmap> submit = Glide.with(context).asBitmap().load(image1).submit(290, 290);
                Intrinsics.checkNotNullExpressionValue(submit, "submit(...)");
                FutureTarget<Bitmap> submit2 = Glide.with(context).asBitmap().load(image2).submit(290, 290);
                Intrinsics.checkNotNullExpressionValue(submit2, "submit(...)");
                Bitmap createBitmap = Bitmap.createBitmap(880, 550, Bitmap.Config.RGB_565);
                Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
                Bitmap bitmap = submit.get();
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(Palette.from(bitmap).generate().getDarkMutedColor(Color.parseColor("#2C2825")));
                canvas.drawBitmap(bitmap, 145.0f, 130.0f, (Paint) null);
                canvas.drawBitmap(submit2.get(), 445.0f, 130.0f, (Paint) null);
                return createBitmap;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private final int visibleCount(List<String> userImages, CmsName cmsName) {
        String str;
        int i = userImages.size() <= 1 ? 0 : 1;
        String tagValue = CmsDataUtils.INSTANCE.getTagValue(cmsName, "Image:DenominationSide");
        String tagValue2 = CmsDataUtils.INSTANCE.getTagValue(cmsName, "Image:SubjectSide");
        String str2 = tagValue;
        if ((str2 != null && str2.length() != 0) || ((str = tagValue2) != null && str.length() != 0)) {
            i++;
        }
        String tagValue3 = CmsDataUtils.INSTANCE.getTagValue(cmsName, "Image:NonDenominationSideDesign");
        String tagValue4 = CmsDataUtils.INSTANCE.getTagValue(cmsName, "Image:DenominationSideDesign");
        return ((tagValue3 == null || tagValue3.length() <= 0) && (tagValue4 == null || tagValue4.length() <= 0)) ? i : i + 1;
    }
}
