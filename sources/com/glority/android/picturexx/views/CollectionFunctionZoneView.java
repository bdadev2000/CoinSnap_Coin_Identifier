package com.glority.android.picturexx.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.picturexx.business.databinding.ViewMeCollectionFunctionZoneBinding;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectionFunctionZoneView.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/glority/android/picturexx/views/CollectionFunctionZoneView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/glority/android/picturexx/business/databinding/ViewMeCollectionFunctionZoneBinding;", "zoneItemClickListener", "Lcom/glority/android/picturexx/views/CollectionFunctionZoneView$ZoneItemClickListener;", "setZoneItemClickListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setRedDotVisibility", "isVisible", "", "ZoneItemClickListener", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CollectionFunctionZoneView extends LinearLayout {
    public static final int $stable = 8;
    private final ViewMeCollectionFunctionZoneBinding binding;
    private ZoneItemClickListener zoneItemClickListener;

    /* compiled from: CollectionFunctionZoneView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/glority/android/picturexx/views/CollectionFunctionZoneView$ZoneItemClickListener;", "", "onSearchClick", "", "onWishClick", "onHistoryClick", "onSettingClick", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public interface ZoneItemClickListener {
        void onHistoryClick();

        void onSearchClick();

        void onSettingClick();

        void onWishClick();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollectionFunctionZoneView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollectionFunctionZoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CollectionFunctionZoneView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionFunctionZoneView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewMeCollectionFunctionZoneBinding inflate = ViewMeCollectionFunctionZoneBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        AppCompatImageView ivMeCollectionSearch = inflate.ivMeCollectionSearch;
        Intrinsics.checkNotNullExpressionValue(ivMeCollectionSearch, "ivMeCollectionSearch");
        ViewExtensionsKt.setSingleClickListener$default(ivMeCollectionSearch, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.views.CollectionFunctionZoneView.1
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
                ZoneItemClickListener zoneItemClickListener = CollectionFunctionZoneView.this.zoneItemClickListener;
                if (zoneItemClickListener != null) {
                    zoneItemClickListener.onSearchClick();
                }
            }
        }, 1, (Object) null);
        AppCompatImageView ivMeCollectionWish = inflate.ivMeCollectionWish;
        Intrinsics.checkNotNullExpressionValue(ivMeCollectionWish, "ivMeCollectionWish");
        ViewExtensionsKt.setSingleClickListener$default(ivMeCollectionWish, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.views.CollectionFunctionZoneView.2
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
                ZoneItemClickListener zoneItemClickListener = CollectionFunctionZoneView.this.zoneItemClickListener;
                if (zoneItemClickListener != null) {
                    zoneItemClickListener.onWishClick();
                }
            }
        }, 1, (Object) null);
        AppCompatImageView ivMeCollectionHistory = inflate.ivMeCollectionHistory;
        Intrinsics.checkNotNullExpressionValue(ivMeCollectionHistory, "ivMeCollectionHistory");
        ViewExtensionsKt.setSingleClickListener$default(ivMeCollectionHistory, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.views.CollectionFunctionZoneView.3
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
                ZoneItemClickListener zoneItemClickListener = CollectionFunctionZoneView.this.zoneItemClickListener;
                if (zoneItemClickListener != null) {
                    zoneItemClickListener.onHistoryClick();
                }
            }
        }, 1, (Object) null);
        AppCompatImageView ivMeCollectionSettings = inflate.ivMeCollectionSettings;
        Intrinsics.checkNotNullExpressionValue(ivMeCollectionSettings, "ivMeCollectionSettings");
        ViewExtensionsKt.setSingleClickListener$default(ivMeCollectionSettings, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.views.CollectionFunctionZoneView.4
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
                ZoneItemClickListener zoneItemClickListener = CollectionFunctionZoneView.this.zoneItemClickListener;
                if (zoneItemClickListener != null) {
                    zoneItemClickListener.onSettingClick();
                }
            }
        }, 1, (Object) null);
    }

    public final void setZoneItemClickListener(ZoneItemClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.zoneItemClickListener = listener;
    }

    public final void setRedDotVisibility(boolean isVisible) {
        this.binding.setRedDotVisible(Boolean.valueOf(isVisible));
    }
}
