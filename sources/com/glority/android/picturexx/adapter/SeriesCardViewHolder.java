package com.glority.android.picturexx.adapter;

import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.picturexx.business.databinding.ItemCustomSeriesCardBinding;
import kotlin.Metadata;

/* compiled from: CustomSeriesCardAdapter.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u0013X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u0017X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001dX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u0017X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019¨\u0006\""}, d2 = {"Lcom/glority/android/picturexx/adapter/SeriesCardViewHolder;", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "binding", "Lcom/glority/android/picturexx/business/databinding/ItemCustomSeriesCardBinding;", "<init>", "(Lcom/glority/android/picturexx/business/databinding/ItemCustomSeriesCardBinding;)V", "getBinding", "()Lcom/glority/android/picturexx/business/databinding/ItemCustomSeriesCardBinding;", "ivAddCoin", "Landroidx/appcompat/widget/AppCompatImageView;", "getIvAddCoin", "()Landroidx/appcompat/widget/AppCompatImageView;", "iv1", "getIv1", "iv2", "getIv2", "iv3", "getIv3", "cardView", "Landroidx/cardview/widget/CardView;", "getCardView", "()Landroidx/cardview/widget/CardView;", "updateTv", "Landroidx/appcompat/widget/AppCompatTextView;", "getUpdateTv", "()Landroidx/appcompat/widget/AppCompatTextView;", "countTv", "getCountTv", "moreIv", "Landroid/widget/FrameLayout;", "getMoreIv", "()Landroid/widget/FrameLayout;", "nameTv", "getNameTv", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class SeriesCardViewHolder extends BaseViewHolder {
    public static final int $stable = 8;
    private final ItemCustomSeriesCardBinding binding;
    private final CardView cardView;
    private final AppCompatTextView countTv;
    private final AppCompatImageView iv1;
    private final AppCompatImageView iv2;
    private final AppCompatImageView iv3;
    private final AppCompatImageView ivAddCoin;
    private final FrameLayout moreIv;
    private final AppCompatTextView nameTv;
    private final AppCompatTextView updateTv;

    public final ItemCustomSeriesCardBinding getBinding() {
        return this.binding;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SeriesCardViewHolder(com.glority.android.picturexx.business.databinding.ItemCustomSeriesCardBinding r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.view.View r0 = r3.getRoot()
            java.lang.String r1 = "getRoot(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.binding = r3
            com.glority.android.picturexx.business.databinding.ViewSeriesCollectionFolderLayoutBinding r0 = r3.icSeriesFolder
            androidx.appcompat.widget.AppCompatImageView r0 = r0.ivSeriesCollectionFolder1
            java.lang.String r1 = "ivSeriesCollectionFolder1"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.ivAddCoin = r0
            com.glority.android.picturexx.business.databinding.ViewSeriesCollectionFolderLayoutBinding r0 = r3.icSeriesFolder
            androidx.appcompat.widget.AppCompatImageView r0 = r0.ivSeriesCollectionFolder2
            java.lang.String r1 = "ivSeriesCollectionFolder2"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.iv1 = r0
            com.glority.android.picturexx.business.databinding.ViewSeriesCollectionFolderLayoutBinding r0 = r3.icSeriesFolder
            androidx.appcompat.widget.AppCompatImageView r0 = r0.ivSeriesCollectionFolder3
            java.lang.String r1 = "ivSeriesCollectionFolder3"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.iv2 = r0
            com.glority.android.picturexx.business.databinding.ViewSeriesCollectionFolderLayoutBinding r0 = r3.icSeriesFolder
            androidx.appcompat.widget.AppCompatImageView r0 = r0.ivSeriesCollectionFolder4
            java.lang.String r1 = "ivSeriesCollectionFolder4"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.iv3 = r0
            androidx.cardview.widget.CardView r0 = r3.cardView
            java.lang.String r1 = "cardView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.cardView = r0
            androidx.appcompat.widget.AppCompatTextView r0 = r3.updateTv
            java.lang.String r1 = "updateTv"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.updateTv = r0
            androidx.appcompat.widget.AppCompatTextView r0 = r3.countTv
            java.lang.String r1 = "countTv"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.countTv = r0
            android.widget.FrameLayout r0 = r3.ivMeSeriesMore
            java.lang.String r1 = "ivMeSeriesMore"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.moreIv = r0
            androidx.appcompat.widget.AppCompatTextView r3 = r3.tvMeSeriesName
            java.lang.String r0 = "tvMeSeriesName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            r2.nameTv = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.adapter.SeriesCardViewHolder.<init>(com.glority.android.picturexx.business.databinding.ItemCustomSeriesCardBinding):void");
    }

    public final AppCompatImageView getIvAddCoin() {
        return this.ivAddCoin;
    }

    public final AppCompatImageView getIv1() {
        return this.iv1;
    }

    public final AppCompatImageView getIv2() {
        return this.iv2;
    }

    public final AppCompatImageView getIv3() {
        return this.iv3;
    }

    public final CardView getCardView() {
        return this.cardView;
    }

    public final AppCompatTextView getUpdateTv() {
        return this.updateTv;
    }

    public final AppCompatTextView getCountTv() {
        return this.countTv;
    }

    public final FrameLayout getMoreIv() {
        return this.moreIv;
    }

    public final AppCompatTextView getNameTv() {
        return this.nameTv;
    }
}
