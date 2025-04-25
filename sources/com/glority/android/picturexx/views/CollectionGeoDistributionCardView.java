package com.glority.android.picturexx.views;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import com.glority.android.cmsui2.util.CmsDataUtils;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.ViewMeCollectionSummaryGeoDistributionBinding;
import com.glority.android.picturexx.business.databinding.ViewSummaryGeoDistributionEntryLayoutBinding;
import com.glority.android.picturexx.utils.PriceUtils;
import com.glority.android.picturexx.view.mapview.OnMarkerClickListener;
import com.glority.utils.app.ResUtils;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.picturecoin.generatedAPI.kotlinAPI.collection.CollectionCountrySummary;
import com.picturecoin.generatedAPI.kotlinAPI.model.CountryInfo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CollectionGeoDistributionCardView.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 92\u00020\u0001:\u00019B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010 \u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u0015J\u0014\u0010!\u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#J\u0016\u0010%\u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002J\u0016\u0010&\u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002J(\u0010'\u001a\u0014\u0012\u0004\u0012\u00020)\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0*0(2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002J4\u0010+\u001a\u0014\u0012\u0004\u0012\u00020)\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0*0(2\u0018\u0010,\u001a\u0014\u0012\u0004\u0012\u00020)\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0*0(H\u0002J\u0016\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201J\b\u00102\u001a\u0004\u0018\u00010/J\r\u00103\u001a\u0004\u0018\u000101¢\u0006\u0002\u00104J\u0006\u00105\u001a\u000206J\u000e\u00107\u001a\u00020\u001f2\u0006\u00108\u001a\u000206R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\rR\u0011\u0010\u001a\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\rR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/glority/android/picturexx/views/CollectionGeoDistributionCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "moreButton", "Landroidx/appcompat/widget/AppCompatImageView;", "getMoreButton", "()Landroidx/appcompat/widget/AppCompatImageView;", "layoutInflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "Landroid/view/LayoutInflater;", "onMarkerClickListener", "Lcom/glority/android/picturexx/view/mapview/OnMarkerClickListener;", "onCollectionCountryClickListener", "Lcom/glority/android/picturexx/views/OnCollectionCountryClickListener;", "binding", "Lcom/glority/android/picturexx/business/databinding/ViewMeCollectionSummaryGeoDistributionBinding;", "mapView", "getMapView", "zoomButton", "getZoomButton", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "setOnMapMarkerClickListener", "", "setOnCollectionCountryClickListener", "setIssuerCountrySummaries", "summaries", "", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/CollectionCountrySummary;", "setGeoDistributionSummary", "setTopThreeGeoDistribution", "groupCollectionsByCountry", "", "", "", "fetchTopThreeCountries", "collectionMap", "setMapCenterAndZoom", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "zoomLevel", "", "getMapCenterLatLng", "getMapZoomLevel", "()Ljava/lang/Float;", "isMapReady", "", "setMapVisible", "visible", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CollectionGeoDistributionCardView extends ConstraintLayout {
    private static final int MAX_COUNTRY_COUNT = 3;
    private final ViewMeCollectionSummaryGeoDistributionBinding binding;
    private GoogleMap googleMap;
    private final LayoutInflater layoutInflater;
    private OnCollectionCountryClickListener onCollectionCountryClickListener;
    private OnMarkerClickListener onMarkerClickListener;
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollectionGeoDistributionCardView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollectionGeoDistributionCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CollectionGeoDistributionCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionGeoDistributionCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater from = LayoutInflater.from(context);
        this.layoutInflater = from;
        ViewMeCollectionSummaryGeoDistributionBinding inflate = ViewMeCollectionSummaryGeoDistributionBinding.inflate(from, this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
    }

    public final AppCompatImageView getMoreButton() {
        AppCompatImageView ivMore = this.binding.ivMore;
        Intrinsics.checkNotNullExpressionValue(ivMore, "ivMore");
        return ivMore;
    }

    public final AppCompatImageView getMapView() {
        AppCompatImageView map = this.binding.map;
        Intrinsics.checkNotNullExpressionValue(map, "map");
        return map;
    }

    public final AppCompatImageView getZoomButton() {
        AppCompatImageView mapZoom = this.binding.mapZoom;
        Intrinsics.checkNotNullExpressionValue(mapZoom, "mapZoom");
        return mapZoom;
    }

    public final void setOnMapMarkerClickListener(OnMarkerClickListener onMarkerClickListener) {
        Intrinsics.checkNotNullParameter(onMarkerClickListener, "onMarkerClickListener");
        this.onMarkerClickListener = onMarkerClickListener;
    }

    public final void setOnCollectionCountryClickListener(OnCollectionCountryClickListener onCollectionCountryClickListener) {
        Intrinsics.checkNotNullParameter(onCollectionCountryClickListener, "onCollectionCountryClickListener");
        this.onCollectionCountryClickListener = onCollectionCountryClickListener;
    }

    public final void setIssuerCountrySummaries(List<CollectionCountrySummary> summaries) {
        Intrinsics.checkNotNullParameter(summaries, "summaries");
        setGeoDistributionSummary(summaries);
        setTopThreeGeoDistribution(summaries);
    }

    private final void setGeoDistributionSummary(List<CollectionCountrySummary> summaries) {
        int i;
        int size = groupCollectionsByCountry(summaries).size();
        Iterator<T> it = summaries.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((CollectionCountrySummary) it.next()).getTotalCount();
        }
        if (size > 1 && i2 > 1) {
            i = R.string.collection_summary_geomap_coinnumber;
        } else if (size == 1 && i2 > 1) {
            i = R.string.collection_summary_geomap_coinnumbers;
        } else {
            i = R.string.collection_summary_geomap_coinnumberss;
        }
        String string = getContext().getString(i, Integer.valueOf(i2), Integer.valueOf(size));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) spannableStringBuilder2, String.valueOf(i2), 0, false, 6, (Object) null);
        int indexOf$default2 = StringsKt.indexOf$default((CharSequence) spannableStringBuilder2, String.valueOf(size), 0, false, 6, (Object) null);
        if (indexOf$default2 == indexOf$default) {
            indexOf$default2 = StringsKt.indexOf$default((CharSequence) spannableStringBuilder2, String.valueOf(size), indexOf$default2 + 1, false, 4, (Object) null);
        }
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(getContext().getResources().getDimensionPixelSize(R.dimen.x28), false), 0, spannableStringBuilder.length(), 33);
        if (indexOf$default != -1) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(getContext().getResources().getDimensionPixelSize(R.dimen.x36), false), indexOf$default, String.valueOf(i2).length() + indexOf$default, 33);
            spannableStringBuilder.setSpan(new StyleSpan(1), indexOf$default, String.valueOf(i2).length() + indexOf$default, 33);
        }
        if (indexOf$default2 != -1) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(getContext().getResources().getDimensionPixelSize(R.dimen.x36), false), indexOf$default2, String.valueOf(size).length() + indexOf$default2, 33);
            spannableStringBuilder.setSpan(new StyleSpan(1), indexOf$default2, String.valueOf(size).length() + indexOf$default2, 33);
        }
        this.binding.tvGeoDistributionSummary.setText(spannableStringBuilder2);
    }

    private final void setTopThreeGeoDistribution(List<CollectionCountrySummary> summaries) {
        String lowerCase;
        CountryInfo issuerCountry;
        this.binding.llGeoDistributionContainer.removeAllViews();
        for (Map.Entry<String, List<CollectionCountrySummary>> entry : fetchTopThreeCountries(groupCollectionsByCountry(summaries)).entrySet()) {
            final String key = entry.getKey();
            List<CollectionCountrySummary> value = entry.getValue();
            int i = 0;
            ViewSummaryGeoDistributionEntryLayoutBinding inflate = ViewSummaryGeoDistributionEntryLayoutBinding.inflate(this.layoutInflater, this.binding.llGeoDistributionContainer, false);
            inflate.getRoot().setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            Intrinsics.checkNotNullExpressionValue(inflate, "apply(...)");
            Glide.with(inflate.ivGeoDistributionCountryFlag).load(CmsDataUtils.INSTANCE.getCountryFlagIconUrl(key)).into(inflate.ivGeoDistributionCountryFlag);
            AppCompatTextView appCompatTextView = inflate.tvGeoDistributionCountryName;
            CollectionCountrySummary collectionCountrySummary = (CollectionCountrySummary) CollectionsKt.firstOrNull((List) value);
            appCompatTextView.setText((collectionCountrySummary == null || (issuerCountry = collectionCountrySummary.getIssuerCountry()) == null) ? null : issuerCountry.getCountryCode3());
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                i += ((CollectionCountrySummary) it.next()).getTotalCount();
            }
            if (i <= 1) {
                String string = ResUtils.getString(R.string.collection_summary_caption_coin);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                lowerCase = string.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            } else {
                String string2 = ResUtils.getString(R.string.collection_summary_caption_coins);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                lowerCase = string2.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            }
            inflate.tvGeoDistributionCoinCount.setText(PriceUtils.INSTANCE.formatNumber(i) + " " + lowerCase);
            View root = inflate.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            ViewExtensionsKt.setSingleClickListener$default(root, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.views.CollectionGeoDistributionCardView$setTopThreeGeoDistribution$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke2(view);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(View it2) {
                    OnCollectionCountryClickListener onCollectionCountryClickListener;
                    Intrinsics.checkNotNullParameter(it2, "it");
                    onCollectionCountryClickListener = CollectionGeoDistributionCardView.this.onCollectionCountryClickListener;
                    if (onCollectionCountryClickListener != null) {
                        onCollectionCountryClickListener.onClick(key);
                    }
                }
            }, 1, (Object) null);
            this.binding.llGeoDistributionContainer.addView(inflate.getRoot());
        }
    }

    private final Map<String, List<CollectionCountrySummary>> groupCollectionsByCountry(List<CollectionCountrySummary> summaries) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : summaries) {
            String countryCode = ((CollectionCountrySummary) obj).getIssuerCountry().getCountryCode();
            Object obj2 = linkedHashMap.get(countryCode);
            if (obj2 == null) {
                obj2 = (List) new ArrayList();
                linkedHashMap.put(countryCode, obj2);
            }
            ((List) obj2).add(obj);
        }
        return linkedHashMap;
    }

    private final Map<String, List<CollectionCountrySummary>> fetchTopThreeCountries(Map<String, ? extends List<CollectionCountrySummary>> collectionMap) {
        return MapsKt.toMap(CollectionsKt.take(CollectionsKt.sortedWith(MapsKt.toList(collectionMap), new Comparator() { // from class: com.glority.android.picturexx.views.CollectionGeoDistributionCardView$fetchTopThreeCountries$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Iterator<T> it = ((List) ((Pair) t2).component2()).iterator();
                int i = 0;
                int i2 = 0;
                while (it.hasNext()) {
                    i2 += ((CollectionCountrySummary) it.next()).getTotalCount();
                }
                Integer valueOf = Integer.valueOf(i2);
                Iterator<T> it2 = ((List) ((Pair) t).component2()).iterator();
                while (it2.hasNext()) {
                    i += ((CollectionCountrySummary) it2.next()).getTotalCount();
                }
                return ComparisonsKt.compareValues(valueOf, Integer.valueOf(i));
            }
        }), 3));
    }

    public final void setMapCenterAndZoom(LatLng latLng, float zoomLevel) {
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        GoogleMap googleMap = this.googleMap;
        if (googleMap != null) {
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoomLevel));
        }
    }

    public final LatLng getMapCenterLatLng() {
        CameraPosition cameraPosition;
        GoogleMap googleMap = this.googleMap;
        if (googleMap == null || (cameraPosition = googleMap.getCameraPosition()) == null) {
            return null;
        }
        return cameraPosition.target;
    }

    public final Float getMapZoomLevel() {
        CameraPosition cameraPosition;
        GoogleMap googleMap = this.googleMap;
        if (googleMap == null || (cameraPosition = googleMap.getCameraPosition()) == null) {
            return null;
        }
        return Float.valueOf(cameraPosition.zoom);
    }

    public final boolean isMapReady() {
        return this.googleMap != null;
    }

    public final void setMapVisible(boolean visible) {
        ConstraintLayout clMapContainer = this.binding.clMapContainer;
        Intrinsics.checkNotNullExpressionValue(clMapContainer, "clMapContainer");
        clMapContainer.setVisibility(visible ? 0 : 8);
    }
}
