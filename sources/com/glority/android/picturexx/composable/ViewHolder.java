package com.glority.android.picturexx.composable;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.glority.android.picturexx.business.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectionDistribution.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u001b\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u001b\u0010\u0017\u001a\n \u0018*\u0004\u0018\u00010\u00030\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0019\u0010\u0010¨\u0006$"}, d2 = {"Lcom/glority/android/picturexx/composable/ViewHolder;", "", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "collectionNameTextView", "Landroidx/appcompat/widget/AppCompatTextView;", "getCollectionNameTextView", "()Landroidx/appcompat/widget/AppCompatTextView;", "priceTextView", "getPriceTextView", "gradeTextView", "getGradeTextView", "gradeInfoContainer", "getGradeInfoContainer", "()Landroid/view/View;", "ivCoinHeader", "Landroidx/appcompat/widget/AppCompatImageView;", "getIvCoinHeader", "()Landroidx/appcompat/widget/AppCompatImageView;", "ivCoinToe", "getIvCoinToe", "ivMore", "kotlin.jvm.PlatformType", "getIvMore", "Landroid/view/View;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final /* data */ class ViewHolder {
    public static final int $stable = 8;
    private final AppCompatTextView collectionNameTextView;
    private final View gradeInfoContainer;
    private final AppCompatTextView gradeTextView;
    private final AppCompatImageView ivCoinHeader;
    private final AppCompatImageView ivCoinToe;
    private final View ivMore;
    private final AppCompatTextView priceTextView;
    private final View view;

    /* renamed from: component1, reason: from getter */
    private final View getView() {
        return this.view;
    }

    public final ViewHolder copy(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return new ViewHolder(view);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ViewHolder) && Intrinsics.areEqual(this.view, ((ViewHolder) other).view);
    }

    public int hashCode() {
        return this.view.hashCode();
    }

    public String toString() {
        return "ViewHolder(view=" + this.view + ")";
    }

    public ViewHolder(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        View findViewById = view.findViewById(R.id.tv_me_collection_name);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.collectionNameTextView = (AppCompatTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.price_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.priceTextView = (AppCompatTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.grade_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.gradeTextView = (AppCompatTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.ll_grade_info_container);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.gradeInfoContainer = findViewById4;
        View findViewById5 = view.findViewById(R.id.iv_me_collection_coin_header);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.ivCoinHeader = (AppCompatImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.iv_me_collection_coin_toe);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.ivCoinToe = (AppCompatImageView) findViewById6;
        View findViewById7 = view.findViewById(R.id.iv_me_collection_more);
        this.ivMore = findViewById7;
        Intrinsics.checkNotNull(findViewById7);
        findViewById7.setVisibility(8);
    }

    public static /* synthetic */ ViewHolder copy$default(ViewHolder viewHolder, View view, int i, Object obj) {
        if ((i & 1) != 0) {
            view = viewHolder.view;
        }
        return viewHolder.copy(view);
    }

    public final AppCompatTextView getCollectionNameTextView() {
        return this.collectionNameTextView;
    }

    public final AppCompatTextView getPriceTextView() {
        return this.priceTextView;
    }

    public final AppCompatTextView getGradeTextView() {
        return this.gradeTextView;
    }

    public final View getGradeInfoContainer() {
        return this.gradeInfoContainer;
    }

    public final AppCompatImageView getIvCoinHeader() {
        return this.ivCoinHeader;
    }

    public final AppCompatImageView getIvCoinToe() {
        return this.ivCoinToe;
    }

    public final View getIvMore() {
        return this.ivMore;
    }
}
