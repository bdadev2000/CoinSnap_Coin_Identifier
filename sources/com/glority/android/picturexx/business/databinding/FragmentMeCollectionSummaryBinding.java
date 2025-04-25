package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.views.CollectionBestOfficialSetCardView;
import com.glority.android.picturexx.views.CollectionBestVarietiesCardView;
import com.glority.android.picturexx.views.CollectionGeoDistributionCardView;
import com.glority.android.picturexx.views.CollectionMeltPriceCardView;
import com.glority.android.picturexx.views.SummaryCardView;

/* loaded from: classes2.dex */
public abstract class FragmentMeCollectionSummaryBinding extends ViewDataBinding {
    public final ConstraintLayout clEmptyView;
    public final LayoutNoneCollectionEmptyViewBinding icEmptyLayout;
    public final NestedScrollView nsvContent;
    public final CollectionBestOfficialSetCardView summaryBestOfficialSetCard;
    public final CollectionBestVarietiesCardView summaryBestVarietiesCard;
    public final SummaryCardView summaryCard;
    public final CollectionGeoDistributionCardView summaryGeoDistributionCard;
    public final CollectionMeltPriceCardView summaryMeltPriceCard;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentMeCollectionSummaryBinding(Object _bindingComponent, View _root, int _localFieldCount, ConstraintLayout clEmptyView, LayoutNoneCollectionEmptyViewBinding icEmptyLayout, NestedScrollView nsvContent, CollectionBestOfficialSetCardView summaryBestOfficialSetCard, CollectionBestVarietiesCardView summaryBestVarietiesCard, SummaryCardView summaryCard, CollectionGeoDistributionCardView summaryGeoDistributionCard, CollectionMeltPriceCardView summaryMeltPriceCard) {
        super(_bindingComponent, _root, _localFieldCount);
        this.clEmptyView = clEmptyView;
        this.icEmptyLayout = icEmptyLayout;
        this.nsvContent = nsvContent;
        this.summaryBestOfficialSetCard = summaryBestOfficialSetCard;
        this.summaryBestVarietiesCard = summaryBestVarietiesCard;
        this.summaryCard = summaryCard;
        this.summaryGeoDistributionCard = summaryGeoDistributionCard;
        this.summaryMeltPriceCard = summaryMeltPriceCard;
    }

    public static FragmentMeCollectionSummaryBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentMeCollectionSummaryBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentMeCollectionSummaryBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_me_collection_summary, root, attachToRoot, component);
    }

    public static FragmentMeCollectionSummaryBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentMeCollectionSummaryBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentMeCollectionSummaryBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_me_collection_summary, null, false, component);
    }

    public static FragmentMeCollectionSummaryBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentMeCollectionSummaryBinding bind(View view, Object component) {
        return (FragmentMeCollectionSummaryBinding) bind(component, view, R.layout.fragment_me_collection_summary);
    }
}
