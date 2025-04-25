package com.glority.android.picturexx.adapter;

import android.content.Context;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.picturexx.business.databinding.LayoutOfficialSetPageItemViewBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OfficialSetPageAdapter.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0015X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u0015X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u0015X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\rX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000f¨\u0006 "}, d2 = {"Lcom/glority/android/picturexx/adapter/OfficialSetPageViewHolder;", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "binding", "Lcom/glority/android/picturexx/business/databinding/LayoutOfficialSetPageItemViewBinding;", "<init>", "(Lcom/glority/android/picturexx/business/databinding/LayoutOfficialSetPageItemViewBinding;)V", "getBinding", "()Lcom/glority/android/picturexx/business/databinding/LayoutOfficialSetPageItemViewBinding;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "tvSeriesName", "Landroidx/appcompat/widget/AppCompatTextView;", "getTvSeriesName", "()Landroidx/appcompat/widget/AppCompatTextView;", "tvProgressBar", "Landroid/widget/ProgressBar;", "getTvProgressBar", "()Landroid/widget/ProgressBar;", "ivSeriesCollectionFolder1", "Landroidx/appcompat/widget/AppCompatImageView;", "getIvSeriesCollectionFolder1", "()Landroidx/appcompat/widget/AppCompatImageView;", "ivSeriesCollectionFolder2", "getIvSeriesCollectionFolder2", "ivSeriesCollectionFolder3", "getIvSeriesCollectionFolder3", "ivSeriesCollectionFolder4", "getIvSeriesCollectionFolder4", "tvProgressCount", "getTvProgressCount", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class OfficialSetPageViewHolder extends BaseViewHolder {
    public static final int $stable = 8;
    private final LayoutOfficialSetPageItemViewBinding binding;
    private final AppCompatImageView ivSeriesCollectionFolder1;
    private final AppCompatImageView ivSeriesCollectionFolder2;
    private final AppCompatImageView ivSeriesCollectionFolder3;
    private final AppCompatImageView ivSeriesCollectionFolder4;
    private final ProgressBar tvProgressBar;
    private final AppCompatTextView tvProgressCount;
    private final AppCompatTextView tvSeriesName;

    public final LayoutOfficialSetPageItemViewBinding getBinding() {
        return this.binding;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public OfficialSetPageViewHolder(com.glority.android.picturexx.business.databinding.LayoutOfficialSetPageItemViewBinding r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.view.View r0 = r3.getRoot()
            java.lang.String r1 = "getRoot(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.binding = r3
            com.glority.android.picturexx.business.databinding.LayoutOfficialSetProgressBaseViewBinding r0 = r3.officialSetProgressView
            androidx.appcompat.widget.AppCompatTextView r0 = r0.tvMeSeriesName
            java.lang.String r1 = "tvMeSeriesName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.tvSeriesName = r0
            com.glority.android.picturexx.business.databinding.LayoutOfficialSetProgressBaseViewBinding r0 = r3.officialSetProgressView
            android.widget.ProgressBar r0 = r0.pbMeSeriesProgress
            java.lang.String r1 = "pbMeSeriesProgress"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.tvProgressBar = r0
            com.glority.android.picturexx.business.databinding.LayoutOfficialSetProgressBaseViewBinding r0 = r3.officialSetProgressView
            com.glority.android.picturexx.business.databinding.ViewSeriesCollectionFolderLayoutBinding r0 = r0.icSeriesCollectionFolder
            androidx.appcompat.widget.AppCompatImageView r0 = r0.ivSeriesCollectionFolder1
            java.lang.String r1 = "ivSeriesCollectionFolder1"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.ivSeriesCollectionFolder1 = r0
            com.glority.android.picturexx.business.databinding.LayoutOfficialSetProgressBaseViewBinding r0 = r3.officialSetProgressView
            com.glority.android.picturexx.business.databinding.ViewSeriesCollectionFolderLayoutBinding r0 = r0.icSeriesCollectionFolder
            androidx.appcompat.widget.AppCompatImageView r0 = r0.ivSeriesCollectionFolder2
            java.lang.String r1 = "ivSeriesCollectionFolder2"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.ivSeriesCollectionFolder2 = r0
            com.glority.android.picturexx.business.databinding.LayoutOfficialSetProgressBaseViewBinding r0 = r3.officialSetProgressView
            com.glority.android.picturexx.business.databinding.ViewSeriesCollectionFolderLayoutBinding r0 = r0.icSeriesCollectionFolder
            androidx.appcompat.widget.AppCompatImageView r0 = r0.ivSeriesCollectionFolder3
            java.lang.String r1 = "ivSeriesCollectionFolder3"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.ivSeriesCollectionFolder3 = r0
            com.glority.android.picturexx.business.databinding.LayoutOfficialSetProgressBaseViewBinding r0 = r3.officialSetProgressView
            com.glority.android.picturexx.business.databinding.ViewSeriesCollectionFolderLayoutBinding r0 = r0.icSeriesCollectionFolder
            androidx.appcompat.widget.AppCompatImageView r0 = r0.ivSeriesCollectionFolder4
            java.lang.String r1 = "ivSeriesCollectionFolder4"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.ivSeriesCollectionFolder4 = r0
            com.glority.android.picturexx.business.databinding.LayoutOfficialSetProgressBaseViewBinding r3 = r3.officialSetProgressView
            androidx.appcompat.widget.AppCompatTextView r3 = r3.tvMeSeriesProgress
            java.lang.String r0 = "tvMeSeriesProgress"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            r2.tvProgressCount = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.adapter.OfficialSetPageViewHolder.<init>(com.glority.android.picturexx.business.databinding.LayoutOfficialSetPageItemViewBinding):void");
    }

    public final Context getContext() {
        Context context = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    public final AppCompatTextView getTvSeriesName() {
        return this.tvSeriesName;
    }

    public final ProgressBar getTvProgressBar() {
        return this.tvProgressBar;
    }

    public final AppCompatImageView getIvSeriesCollectionFolder1() {
        return this.ivSeriesCollectionFolder1;
    }

    public final AppCompatImageView getIvSeriesCollectionFolder2() {
        return this.ivSeriesCollectionFolder2;
    }

    public final AppCompatImageView getIvSeriesCollectionFolder3() {
        return this.ivSeriesCollectionFolder3;
    }

    public final AppCompatImageView getIvSeriesCollectionFolder4() {
        return this.ivSeriesCollectionFolder4;
    }

    public final AppCompatTextView getTvProgressCount() {
        return this.tvProgressCount;
    }
}
