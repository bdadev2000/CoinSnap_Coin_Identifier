package com.glority.android.picturexx.adapter;

import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.picturexx.business.databinding.ItemMeCollectionCardBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MeCollectionItemCardAdapter.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/glority/android/picturexx/adapter/CardViewHolder;", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "binding", "Lcom/glority/android/picturexx/business/databinding/ItemMeCollectionCardBinding;", "<init>", "(Lcom/glority/android/picturexx/business/databinding/ItemMeCollectionCardBinding;)V", "getBinding", "()Lcom/glority/android/picturexx/business/databinding/ItemMeCollectionCardBinding;", "collectionNameTextView", "Landroidx/appcompat/widget/AppCompatTextView;", "getCollectionNameTextView", "()Landroidx/appcompat/widget/AppCompatTextView;", "priceTextView", "getPriceTextView", "gradeTextView", "getGradeTextView", "gradeInfoContainer", "Landroid/widget/LinearLayout;", "getGradeInfoContainer", "()Landroid/widget/LinearLayout;", "ivCoinHeader", "Landroidx/appcompat/widget/AppCompatImageView;", "getIvCoinHeader", "()Landroidx/appcompat/widget/AppCompatImageView;", "ivCoinToe", "getIvCoinToe", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class CardViewHolder extends BaseViewHolder {
    public static final int $stable = 8;
    private final ItemMeCollectionCardBinding binding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CardViewHolder(com.glority.android.picturexx.business.databinding.ItemMeCollectionCardBinding r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.view.View r0 = r3.getRoot()
            java.lang.String r1 = "getRoot(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.binding = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.adapter.CardViewHolder.<init>(com.glority.android.picturexx.business.databinding.ItemMeCollectionCardBinding):void");
    }

    public final ItemMeCollectionCardBinding getBinding() {
        return this.binding;
    }

    public final AppCompatTextView getCollectionNameTextView() {
        AppCompatTextView tvMeCollectionName = this.binding.tvMeCollectionName;
        Intrinsics.checkNotNullExpressionValue(tvMeCollectionName, "tvMeCollectionName");
        return tvMeCollectionName;
    }

    public final AppCompatTextView getPriceTextView() {
        AppCompatTextView priceTv = this.binding.priceTv;
        Intrinsics.checkNotNullExpressionValue(priceTv, "priceTv");
        return priceTv;
    }

    public final AppCompatTextView getGradeTextView() {
        AppCompatTextView gradeTv = this.binding.gradeTv;
        Intrinsics.checkNotNullExpressionValue(gradeTv, "gradeTv");
        return gradeTv;
    }

    public final LinearLayout getGradeInfoContainer() {
        LinearLayout llGradeInfoContainer = this.binding.llGradeInfoContainer;
        Intrinsics.checkNotNullExpressionValue(llGradeInfoContainer, "llGradeInfoContainer");
        return llGradeInfoContainer;
    }

    public final AppCompatImageView getIvCoinHeader() {
        AppCompatImageView ivMeCollectionCoinHeader = this.binding.ivMeCollectionCoinHeader;
        Intrinsics.checkNotNullExpressionValue(ivMeCollectionCoinHeader, "ivMeCollectionCoinHeader");
        return ivMeCollectionCoinHeader;
    }

    public final AppCompatImageView getIvCoinToe() {
        AppCompatImageView ivMeCollectionCoinToe = this.binding.ivMeCollectionCoinToe;
        Intrinsics.checkNotNullExpressionValue(ivMeCollectionCoinToe, "ivMeCollectionCoinToe");
        return ivMeCollectionCoinToe;
    }
}
