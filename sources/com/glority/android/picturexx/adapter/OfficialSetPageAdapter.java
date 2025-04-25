package com.glority.android.picturexx.adapter;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.Glide;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.database.entities.SeriesItem;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.LayoutOfficialSetPageItemViewBinding;
import com.glority.android.picturexx.definition.SeriesItemWrapper;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: OfficialSetPageAdapter.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0003H\u0002¨\u0006\u0013"}, d2 = {"Lcom/glority/android/picturexx/adapter/OfficialSetPageAdapter;", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "Lcom/glority/android/picturexx/definition/SeriesItemWrapper;", "Lcom/glority/android/picturexx/adapter/OfficialSetPageViewHolder;", "<init>", "()V", "onCreateDefViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "convert", "", "helper", "item", "setImages", "setSeriesProgressCount", "seriesItem", "Lcom/glority/android/database/entities/SeriesItem;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class OfficialSetPageAdapter extends BaseQuickAdapter<SeriesItemWrapper, OfficialSetPageViewHolder> {
    public static final int $stable = 0;

    public OfficialSetPageAdapter() {
        super(CollectionsKt.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public OfficialSetPageViewHolder onCreateDefViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        Intrinsics.checkNotNull(layoutInflater);
        LayoutOfficialSetPageItemViewBinding inflate = LayoutOfficialSetPageItemViewBinding.inflate(layoutInflater, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new OfficialSetPageViewHolder(inflate);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public void convert(OfficialSetPageViewHolder helper, SeriesItemWrapper item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        helper.getTvSeriesName().setText(item.getSeriesItem().getTitle());
        helper.getTvProgressBar().setMax(item.getSeriesItem().getTotalNum());
        ProgressBar tvProgressBar = helper.getTvProgressBar();
        Integer currentCount = item.getSeriesItem().getCurrentCount();
        tvProgressBar.setProgress(currentCount != null ? currentCount.intValue() : 0);
        setImages(helper, item);
        setSeriesProgressCount(item.getSeriesItem(), helper);
        helper.addOnClickListener(R.id.cv_official_set_card, R.id.iv_more);
    }

    private final void setImages(OfficialSetPageViewHolder helper, SeriesItemWrapper item) {
        Object obj;
        List mutableList = CollectionsKt.toMutableList((Collection) item.getCollectionItemList());
        if (mutableList.size() < 4) {
            List list = mutableList;
            int size = 4 - mutableList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(null);
            }
            CollectionsKt.addAll(list, arrayList);
        }
        List listOf = CollectionsKt.listOf((Object[]) new AppCompatImageView[]{helper.getIvSeriesCollectionFolder1(), helper.getIvSeriesCollectionFolder2(), helper.getIvSeriesCollectionFolder3(), helper.getIvSeriesCollectionFolder4()});
        List list2 = mutableList;
        Iterator it = list2.iterator();
        List list3 = listOf;
        Iterator it2 = list3.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(list2, 10), CollectionsKt.collectionSizeOrDefault(list3, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            AppCompatImageView appCompatImageView = (AppCompatImageView) it2.next();
            String str = (String) next;
            String str2 = str;
            if (str2 != null && str2.length() != 0) {
                obj = Glide.with(appCompatImageView.getContext()).load(str).centerCrop().into(appCompatImageView);
                Intrinsics.checkNotNullExpressionValue(obj, "into(...)");
            } else {
                appCompatImageView.setImageResource(R.drawable.icon_custom_series_item_head);
                obj = Unit.INSTANCE;
            }
            arrayList2.add(obj);
        }
    }

    private final void setSeriesProgressCount(SeriesItem seriesItem, OfficialSetPageViewHolder helper) {
        Context context = helper.getContext();
        Integer currentCount = seriesItem.getCurrentCount();
        int totalNum = seriesItem.getTotalNum();
        String string = context.getResources().getString(R.string.collection_customsets_caption_coins);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String lowerCase = string.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(currentCount + RemoteSettings.FORWARD_SLASH_STRING + totalNum + " " + lowerCase);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) spannableStringBuilder2, String.valueOf(seriesItem.getCurrentCount()), 0, false, 6, (Object) null);
        if (indexOf$default != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#43507B")), indexOf$default, String.valueOf(seriesItem.getCurrentCount()).length() + indexOf$default, 33);
        }
        helper.getTvProgressCount().setText(spannableStringBuilder2);
    }
}
