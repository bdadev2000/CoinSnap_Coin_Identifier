package com.glority.android.picturexx.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.cardview.widget.CardView;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.LayoutSummaryCardBinding;
import com.glority.android.picturexx.repository.SyncCollectionManager;
import com.glority.widget.GlTextView;
import java.text.NumberFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SummaryCardView.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/glority/android/picturexx/views/SummaryCardView;", "Landroidx/cardview/widget/CardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/glority/android/picturexx/business/databinding/LayoutSummaryCardBinding;", "setSummary", "", "summaryInfo", "Lcom/glority/android/picturexx/repository/SyncCollectionManager$SummaryInfo;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SummaryCardView extends CardView {
    public static final int $stable = 8;
    private final LayoutSummaryCardBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SummaryCardView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SummaryCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SummaryCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutSummaryCardBinding inflate = LayoutSummaryCardBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
    }

    public final void setSummary(SyncCollectionManager.SummaryInfo summaryInfo) {
        Intrinsics.checkNotNullParameter(summaryInfo, "summaryInfo");
        GlTextView countLabelTv = this.binding.countLabelTv;
        Intrinsics.checkNotNullExpressionValue(countLabelTv, "countLabelTv");
        if (summaryInfo.getTotalCount() > 1) {
            countLabelTv.setText(R.string.collection_summary_caption_coins);
        } else {
            countLabelTv.setText(R.string.collection_summary_caption_coin);
        }
        GlTextView countTv = this.binding.countTv;
        Intrinsics.checkNotNullExpressionValue(countTv, "countTv");
        countTv.setText(NumberFormat.getInstance().format(Integer.valueOf(summaryInfo.getTotalCount())));
        GlTextView priceTv = this.binding.priceTv;
        Intrinsics.checkNotNullExpressionValue(priceTv, "priceTv");
        GlTextView priceLabelTv = this.binding.priceLabelTv;
        Intrinsics.checkNotNullExpressionValue(priceLabelTv, "priceLabelTv");
        priceTv.setText(summaryInfo.getDisplayPrice());
        priceLabelTv.setText(getContext().getString(R.string.collection_summary_caption_value) + "(" + summaryInfo.getPriceValue().getCurrencyCode() + ")");
        GlTextView counrtyTv = this.binding.counrtyTv;
        Intrinsics.checkNotNullExpressionValue(counrtyTv, "counrtyTv");
        GlTextView countryLabelTv = this.binding.countryLabelTv;
        Intrinsics.checkNotNullExpressionValue(countryLabelTv, "countryLabelTv");
        counrtyTv.setText(String.valueOf(summaryInfo.getCountryCount()));
        if (summaryInfo.getCountryCount() > 1) {
            countryLabelTv.setText(R.string.collection_summary_caption_countries);
        } else {
            countryLabelTv.setText(R.string.collection_summary_caption_country);
        }
    }
}
