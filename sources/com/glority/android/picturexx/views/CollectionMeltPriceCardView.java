package com.glority.android.picturexx.views;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.cmsui.entity.LikeItem;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.ViewMeCollectionSummaryMeltPriceBinding;
import com.glority.android.picturexx.business.databinding.ViewSummaryMeltPriceRowLayoutBinding;
import com.glority.android.picturexx.utils.PriceUtils;
import com.glority.utils.app.ResUtils;
import com.picturecoin.generatedAPI.kotlinAPI.collection.CollectionCompositionSummary;
import com.picturecoin.generatedAPI.kotlinAPI.enums.MetalType;
import com.picturecoin.generatedAPI.kotlinAPI.model.PriceValue;
import com.picturecoin.generatedAPI.kotlinAPI.model.Weight;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectionMeltPriceCardView.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 '2\u00020\u0001:\u0001'B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u001d\"\u00020\u0014¢\u0006\u0002\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\u001a\u0010$\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018¨\u0006("}, d2 = {"Lcom/glority/android/picturexx/views/CollectionMeltPriceCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/glority/android/picturexx/business/databinding/ViewMeCollectionSummaryMeltPriceBinding;", "infoButton", "Landroid/view/View;", "getInfoButton", "()Landroid/view/View;", "moreButton", "getMoreButton", "meltPriceModels", "", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/CollectionCompositionSummary;", "defaultCurrencyCode", "", "getDefaultCurrencyCode", "()Ljava/lang/String;", "defaultWeightUnit", "getDefaultWeightUnit", "setMeltPrice", "", "", "([Lcom/picturecoin/generatedAPI/kotlinAPI/collection/CollectionCompositionSummary;)V", "setPriceValue", "textView", "Landroid/widget/TextView;", "priceValue", "Lcom/picturecoin/generatedAPI/kotlinAPI/model/PriceValue;", "setWeightValue", "weight", "Lcom/picturecoin/generatedAPI/kotlinAPI/model/Weight;", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CollectionMeltPriceCardView extends ConstraintLayout {
    private static final CollectionCompositionSummary zeroGoldCompositionSummary;
    private static final CollectionCompositionSummary zeroPalladiumCompositionSummary;
    private static final CollectionCompositionSummary zeroPlatinumCompositionSummary;
    private static final CollectionCompositionSummary zeroSilverCompositionSummary;
    private final ViewMeCollectionSummaryMeltPriceBinding binding;
    private final List<CollectionCompositionSummary> meltPriceModels;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollectionMeltPriceCardView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollectionMeltPriceCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @JvmStatic
    public static final List<CollectionCompositionSummary> wrapData(List<CollectionCompositionSummary> list) {
        return INSTANCE.wrapData(list);
    }

    public /* synthetic */ CollectionMeltPriceCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionMeltPriceCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewMeCollectionSummaryMeltPriceBinding inflate = ViewMeCollectionSummaryMeltPriceBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        this.meltPriceModels = new ArrayList();
    }

    /* compiled from: CollectionMeltPriceCardView.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/glority/android/picturexx/views/CollectionMeltPriceCardView$Companion;", "", "<init>", "()V", "zeroGoldCompositionSummary", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/CollectionCompositionSummary;", "zeroSilverCompositionSummary", "zeroPlatinumCompositionSummary", "zeroPalladiumCompositionSummary", "wrapData", "", "compositionSummary", "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final List<CollectionCompositionSummary> wrapData(List<CollectionCompositionSummary> compositionSummary) {
            Object obj;
            Object obj2;
            Object obj3;
            Object obj4;
            Intrinsics.checkNotNullParameter(compositionSummary, "compositionSummary");
            List<CollectionCompositionSummary> list = compositionSummary;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((CollectionCompositionSummary) it.next()).getMetalType().getValue() > 0) {
                        Iterator<T> it2 = list.iterator();
                        while (true) {
                            obj = null;
                            if (!it2.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it2.next();
                            if (((CollectionCompositionSummary) obj2).getMetalType() == MetalType.GOLD) {
                                break;
                            }
                        }
                        CollectionCompositionSummary collectionCompositionSummary = (CollectionCompositionSummary) obj2;
                        if (collectionCompositionSummary == null) {
                            collectionCompositionSummary = CollectionMeltPriceCardView.zeroGoldCompositionSummary;
                        }
                        Iterator<T> it3 = list.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it3.next();
                            if (((CollectionCompositionSummary) obj3).getMetalType() == MetalType.SILVER) {
                                break;
                            }
                        }
                        CollectionCompositionSummary collectionCompositionSummary2 = (CollectionCompositionSummary) obj3;
                        if (collectionCompositionSummary2 == null) {
                            collectionCompositionSummary2 = CollectionMeltPriceCardView.zeroSilverCompositionSummary;
                        }
                        Iterator<T> it4 = list.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                obj4 = null;
                                break;
                            }
                            obj4 = it4.next();
                            if (((CollectionCompositionSummary) obj4).getMetalType() == MetalType.PLATINUM) {
                                break;
                            }
                        }
                        CollectionCompositionSummary collectionCompositionSummary3 = (CollectionCompositionSummary) obj4;
                        Iterator<T> it5 = list.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                break;
                            }
                            Object next = it5.next();
                            if (((CollectionCompositionSummary) next).getMetalType() == MetalType.PALLADIUM) {
                                obj = next;
                                break;
                            }
                        }
                        CollectionCompositionSummary collectionCompositionSummary4 = (CollectionCompositionSummary) obj;
                        if (collectionCompositionSummary3 == null && collectionCompositionSummary4 == null) {
                            return CollectionsKt.listOf((Object[]) new CollectionCompositionSummary[]{collectionCompositionSummary, collectionCompositionSummary2});
                        }
                        CollectionCompositionSummary[] collectionCompositionSummaryArr = new CollectionCompositionSummary[4];
                        collectionCompositionSummaryArr[0] = collectionCompositionSummary;
                        collectionCompositionSummaryArr[1] = collectionCompositionSummary2;
                        if (collectionCompositionSummary3 == null) {
                            collectionCompositionSummary3 = CollectionMeltPriceCardView.zeroPlatinumCompositionSummary;
                        }
                        collectionCompositionSummaryArr[2] = collectionCompositionSummary3;
                        if (collectionCompositionSummary4 == null) {
                            collectionCompositionSummary4 = CollectionMeltPriceCardView.zeroPalladiumCompositionSummary;
                        }
                        collectionCompositionSummaryArr[3] = collectionCompositionSummary4;
                        return CollectionsKt.listOf((Object[]) collectionCompositionSummaryArr);
                    }
                }
            }
            return CollectionsKt.emptyList();
        }
    }

    static {
        CollectionCompositionSummary collectionCompositionSummary = new CollectionCompositionSummary(0, 1, null);
        PriceValue priceValue = new PriceValue(0, 1, null);
        priceValue.setValue(0.0d);
        priceValue.setSymbol("");
        priceValue.setCurrencyCode("");
        collectionCompositionSummary.setTotalPrice(priceValue);
        collectionCompositionSummary.setTotalCount(0);
        Weight weight = new Weight(0, 1, null);
        weight.setWeight(0.0d);
        weight.setUnit("");
        collectionCompositionSummary.setTotalWeight(weight);
        collectionCompositionSummary.setMetalType(MetalType.GOLD);
        zeroGoldCompositionSummary = collectionCompositionSummary;
        CollectionCompositionSummary collectionCompositionSummary2 = new CollectionCompositionSummary(0, 1, null);
        PriceValue priceValue2 = new PriceValue(0, 1, null);
        priceValue2.setValue(0.0d);
        priceValue2.setSymbol("");
        priceValue2.setCurrencyCode("");
        collectionCompositionSummary2.setTotalPrice(priceValue2);
        collectionCompositionSummary2.setTotalCount(0);
        Weight weight2 = new Weight(0, 1, null);
        weight2.setWeight(0.0d);
        weight2.setUnit("");
        collectionCompositionSummary2.setTotalWeight(weight2);
        collectionCompositionSummary2.setMetalType(MetalType.SILVER);
        zeroSilverCompositionSummary = collectionCompositionSummary2;
        CollectionCompositionSummary collectionCompositionSummary3 = new CollectionCompositionSummary(0, 1, null);
        PriceValue priceValue3 = new PriceValue(0, 1, null);
        priceValue3.setValue(0.0d);
        priceValue3.setSymbol("");
        priceValue3.setCurrencyCode("");
        collectionCompositionSummary3.setTotalPrice(priceValue3);
        collectionCompositionSummary3.setTotalCount(0);
        Weight weight3 = new Weight(0, 1, null);
        weight3.setWeight(0.0d);
        weight3.setUnit("");
        collectionCompositionSummary3.setTotalWeight(weight3);
        collectionCompositionSummary3.setMetalType(MetalType.PLATINUM);
        zeroPlatinumCompositionSummary = collectionCompositionSummary3;
        CollectionCompositionSummary collectionCompositionSummary4 = new CollectionCompositionSummary(0, 1, null);
        PriceValue priceValue4 = new PriceValue(0, 1, null);
        priceValue4.setValue(0.0d);
        priceValue4.setSymbol("");
        priceValue4.setCurrencyCode("");
        collectionCompositionSummary4.setTotalPrice(priceValue4);
        collectionCompositionSummary4.setTotalCount(0);
        Weight weight4 = new Weight(0, 1, null);
        weight4.setWeight(0.0d);
        weight4.setUnit("");
        collectionCompositionSummary4.setTotalWeight(weight4);
        collectionCompositionSummary4.setMetalType(MetalType.PALLADIUM);
        zeroPalladiumCompositionSummary = collectionCompositionSummary4;
    }

    public final View getInfoButton() {
        AppCompatImageView ivMeltPriceInfo = this.binding.ivMeltPriceInfo;
        Intrinsics.checkNotNullExpressionValue(ivMeltPriceInfo, "ivMeltPriceInfo");
        return ivMeltPriceInfo;
    }

    public final View getMoreButton() {
        AppCompatImageView ivMeltPriceMore = this.binding.ivMeltPriceMore;
        Intrinsics.checkNotNullExpressionValue(ivMeltPriceMore, "ivMeltPriceMore");
        return ivMeltPriceMore;
    }

    private final String getDefaultCurrencyCode() {
        PriceValue totalPrice;
        String symbol;
        CollectionCompositionSummary collectionCompositionSummary = (CollectionCompositionSummary) CollectionsKt.firstOrNull((List) this.meltPriceModels);
        return (collectionCompositionSummary == null || (totalPrice = collectionCompositionSummary.getTotalPrice()) == null || (symbol = totalPrice.getSymbol()) == null) ? "" : symbol;
    }

    private final String getDefaultWeightUnit() {
        Weight totalWeight;
        String unit;
        CollectionCompositionSummary collectionCompositionSummary = (CollectionCompositionSummary) CollectionsKt.firstOrNull((List) this.meltPriceModels);
        return (collectionCompositionSummary == null || (totalWeight = collectionCompositionSummary.getTotalWeight()) == null || (unit = totalWeight.getUnit()) == null) ? "" : unit;
    }

    public final void setMeltPrice(CollectionCompositionSummary... meltPriceModels) {
        Intrinsics.checkNotNullParameter(meltPriceModels, "meltPriceModels");
        this.meltPriceModels.clear();
        CollectionsKt.addAll(this.meltPriceModels, meltPriceModels);
        this.binding.llMeltPriceContainer.removeAllViews();
        int length = meltPriceModels.length;
        int length2 = meltPriceModels.length;
        int i = 0;
        int i2 = 0;
        while (i < length2) {
            CollectionCompositionSummary collectionCompositionSummary = meltPriceModels[i];
            int i3 = i2 + 1;
            ViewSummaryMeltPriceRowLayoutBinding inflate = ViewSummaryMeltPriceRowLayoutBinding.inflate(LayoutInflater.from(getContext()));
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            inflate.setMetalType(collectionCompositionSummary.getMetalType());
            AppCompatTextView tvMeltPrice = inflate.tvMeltPrice;
            Intrinsics.checkNotNullExpressionValue(tvMeltPrice, "tvMeltPrice");
            setPriceValue(tvMeltPrice, collectionCompositionSummary.getTotalPrice());
            AppCompatTextView tvMeltWeight = inflate.tvMeltWeight;
            Intrinsics.checkNotNullExpressionValue(tvMeltWeight, "tvMeltWeight");
            setWeightValue(tvMeltWeight, collectionCompositionSummary.getTotalWeight());
            this.binding.llMeltPriceContainer.addView(inflate.getRoot());
            if (i2 != length - 1) {
                View view = new View(getContext());
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) ResUtils.getDimension(R.dimen.x2)));
                view.setBackgroundColor(Color.parseColor("#F2F2F2"));
                this.binding.llMeltPriceContainer.addView(view);
            }
            i++;
            i2 = i3;
        }
    }

    private final void setPriceValue(TextView textView, PriceValue priceValue) {
        String symbol = priceValue != null ? priceValue.getSymbol() : null;
        Double valueOf = priceValue != null ? Double.valueOf(priceValue.getValue()) : null;
        String str = symbol;
        if (str == null || str.length() == 0 || valueOf == null || Intrinsics.areEqual(valueOf, 0.0d)) {
            textView.setText(getDefaultCurrencyCode() + LikeItem.DISLIKE);
        } else {
            textView.setText(priceValue.getSymbol() + PriceUtils.INSTANCE.formatPrice(BigDecimal.valueOf(valueOf.doubleValue()).setScale(2, RoundingMode.HALF_UP).doubleValue()));
        }
    }

    private final void setWeightValue(TextView textView, Weight weight) {
        String str;
        Double valueOf = weight != null ? Double.valueOf(weight.getWeight()) : null;
        String unit = weight != null ? weight.getUnit() : null;
        if (valueOf == null || Intrinsics.areEqual(valueOf, 0.0d) || (str = unit) == null || str.length() == 0) {
            textView.setText(LikeItem.DISLIKE + getDefaultWeightUnit());
        } else {
            textView.setText(PriceUtils.INSTANCE.formatPrice(BigDecimal.valueOf(valueOf.doubleValue()).setScale(2, RoundingMode.HALF_UP).doubleValue()) + unit);
        }
    }
}
