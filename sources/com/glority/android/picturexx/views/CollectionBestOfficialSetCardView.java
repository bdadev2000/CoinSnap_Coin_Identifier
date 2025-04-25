package com.glority.android.picturexx.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import com.glority.android.database.entities.SeriesItem;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.ViewMeCollectionSummaryBestOfficialSetBinding;
import com.glority.android.xx.constants.Args;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CollectionBestOfficialSetCardView.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0$J\u0010\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\"H\u0002J\u0010\u0010'\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010(\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0016\u0010)\u001a\u00020 2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0$H\u0002R$\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000f8F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/glority/android/picturexx/views/CollectionBestOfficialSetCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "", Args.indexListUid, "getIndexListUid", "()Ljava/lang/String;", "", Args.seriesId, "getSeriesId", "()J", "moreButton", "Landroidx/appcompat/widget/AppCompatImageView;", "getMoreButton", "()Landroidx/appcompat/widget/AppCompatImageView;", "checkAllOfficialSetButton", "Landroid/view/View;", "getCheckAllOfficialSetButton", "()Landroid/view/View;", "officialSetCardView", "getOfficialSetCardView", "binding", "Lcom/glority/android/picturexx/business/databinding/ViewMeCollectionSummaryBestOfficialSetBinding;", "setOfficialSetInfo", "", "seriesItem", "Lcom/glority/android/database/entities/SeriesItem;", "images", "", "setCollectedProgressText", "seriesListItem", "setSeriesProgressCount", "setSeriesCollectionName", "setSeriesImages", "collectionItemList", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CollectionBestOfficialSetCardView extends ConstraintLayout {
    public static final int $stable = 8;
    private final ViewMeCollectionSummaryBestOfficialSetBinding binding;
    private String indexListUid;
    private long seriesId;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollectionBestOfficialSetCardView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollectionBestOfficialSetCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CollectionBestOfficialSetCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionBestOfficialSetCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewMeCollectionSummaryBestOfficialSetBinding inflate = ViewMeCollectionSummaryBestOfficialSetBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
    }

    public final String getIndexListUid() {
        return this.indexListUid;
    }

    public final long getSeriesId() {
        return this.seriesId;
    }

    public final AppCompatImageView getMoreButton() {
        AppCompatImageView ivMore = this.binding.ivMore;
        Intrinsics.checkNotNullExpressionValue(ivMore, "ivMore");
        return ivMore;
    }

    public final View getCheckAllOfficialSetButton() {
        AppCompatTextView tvCheckAllOfficialSet = this.binding.tvCheckAllOfficialSet;
        Intrinsics.checkNotNullExpressionValue(tvCheckAllOfficialSet, "tvCheckAllOfficialSet");
        return tvCheckAllOfficialSet;
    }

    public final View getOfficialSetCardView() {
        LinearLayout llOfficialSetContainer = this.binding.officialSetProgressView.llOfficialSetContainer;
        Intrinsics.checkNotNullExpressionValue(llOfficialSetContainer, "llOfficialSetContainer");
        return llOfficialSetContainer;
    }

    public final void setOfficialSetInfo(SeriesItem seriesItem, List<String> images) {
        Intrinsics.checkNotNullParameter(seriesItem, "seriesItem");
        Intrinsics.checkNotNullParameter(images, "images");
        this.indexListUid = seriesItem.getIndexListUid();
        Long seriesId = seriesItem.getSeriesId();
        this.seriesId = seriesId != null ? seriesId.longValue() : 0L;
        setSeriesCollectionName(seriesItem);
        setCollectedProgressText(seriesItem);
        setSeriesProgressCount(seriesItem);
        setSeriesImages(images);
    }

    private final void setCollectedProgressText(SeriesItem seriesListItem) {
        String str = new BigDecimal(String.valueOf(((seriesListItem.getCurrentCount() != null ? r0.intValue() : 0.0f) / seriesListItem.getTotalNum()) * 100)).setScale(2, RoundingMode.HALF_UP) + "%";
        String string = getContext().getResources().getString(R.string.collection_summary_bestofficial_coinnumber, str);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) spannableStringBuilder2, str, 0, false, 6, (Object) null);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(14, true), 0, spannableStringBuilder.length(), 33);
        if (indexOf$default != -1) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(16, true), indexOf$default, str.length() + indexOf$default, 33);
            spannableStringBuilder.setSpan(new TypefaceSpan(Typeface.DEFAULT_BOLD), indexOf$default, str.length() + indexOf$default, 33);
        }
        this.binding.tvSetPercentageSummary.setText(spannableStringBuilder2);
    }

    private final void setSeriesProgressCount(SeriesItem seriesItem) {
        Integer currentCount = seriesItem.getCurrentCount();
        int totalNum = seriesItem.getTotalNum();
        String string = getContext().getResources().getString(R.string.collection_customsets_caption_coins);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String lowerCase = string.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(currentCount + RemoteSettings.FORWARD_SLASH_STRING + totalNum + " " + lowerCase);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) spannableStringBuilder2, String.valueOf(seriesItem.getCurrentCount()), 0, false, 6, (Object) null);
        if (indexOf$default != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#43507B")), indexOf$default, String.valueOf(seriesItem.getCurrentCount()).length() + indexOf$default, 33);
        }
        this.binding.officialSetProgressView.tvMeSeriesProgress.setText(spannableStringBuilder2);
        this.binding.officialSetProgressView.pbMeSeriesProgress.setMax(seriesItem.getTotalNum());
        ProgressBar progressBar = this.binding.officialSetProgressView.pbMeSeriesProgress;
        Integer currentCount2 = seriesItem.getCurrentCount();
        progressBar.setProgress(currentCount2 != null ? currentCount2.intValue() : 0);
    }

    private final void setSeriesCollectionName(SeriesItem seriesItem) {
        this.binding.officialSetProgressView.tvMeSeriesName.setText(seriesItem.getTitle());
    }

    private final void setSeriesImages(List<String> collectionItemList) {
        List listOf = CollectionsKt.listOf((Object[]) new AppCompatImageView[]{this.binding.officialSetProgressView.icSeriesCollectionFolder.ivSeriesCollectionFolder1, this.binding.officialSetProgressView.icSeriesCollectionFolder.ivSeriesCollectionFolder2, this.binding.officialSetProgressView.icSeriesCollectionFolder.ivSeriesCollectionFolder3, this.binding.officialSetProgressView.icSeriesCollectionFolder.ivSeriesCollectionFolder4});
        List<String> list = collectionItemList;
        Iterator<T> it = list.iterator();
        List list2 = listOf;
        Iterator it2 = list2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(list, 10), CollectionsKt.collectionSizeOrDefault(list2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            arrayList.add(Glide.with(getContext()).load((String) next).centerCrop().into((AppCompatImageView) it2.next()));
        }
    }
}
