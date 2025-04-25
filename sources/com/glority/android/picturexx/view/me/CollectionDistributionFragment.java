package com.glority.android.picturexx.view.me;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Modifier;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.database.DBManager;
import com.glority.android.database.dao.UserCustomSeriesItemDao;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.picturexx.business.databinding.FragmentCollectionDistributionBinding;
import com.glority.android.picturexx.composable.CollectionDistributionKt;
import com.glority.android.picturexx.extensions.CollectionCountrySummaryListExtKt;
import com.glority.android.picturexx.extensions.CollectionCountrySummaryWrapper;
import com.glority.android.picturexx.extensions.MarkerTag;
import com.glority.android.picturexx.vm.CollectionViewModel;
import com.glority.android.picturexx.vm.SummaryDistributionViewModel;
import com.glority.android.ui.base.v2.BaseFragment;
import com.glority.android.xx.constants.LogEvents;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.picturecoin.generatedAPI.kotlinAPI.collection.CollectionCountrySummary;
import com.picturecoin.generatedAPI.kotlinAPI.model.CountryInfo;
import com.picturecoin.generatedAPI.kotlinAPI.model.Location;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: CollectionDistributionFragment.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00015B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\u001a\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\b\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010#\u001a\u00020 2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0015H\u0016J\u0010\u0010'\u001a\u00020 2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010(\u001a\u00020 2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010)\u001a\u00020 H\u0002J\b\u0010*\u001a\u00020 H\u0002J\u0012\u0010+\u001a\u00020 2\b\u0010,\u001a\u0004\u0018\u00010-H\u0002J\u0010\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u000200H\u0002J\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020-022\f\u00103\u001a\b\u0012\u0004\u0012\u0002040\u0017H\u0002R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/glority/android/picturexx/view/me/CollectionDistributionFragment;", "Lcom/glority/android/ui/base/v2/BaseFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentCollectionDistributionBinding;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;", "<init>", "()V", "collectionVm", "Lcom/glority/android/picturexx/vm/CollectionViewModel;", "getCollectionVm", "()Lcom/glority/android/picturexx/vm/CollectionViewModel;", "collectionVm$delegate", "Lkotlin/Lazy;", "distributionViewModel", "Lcom/glority/android/picturexx/vm/SummaryDistributionViewModel;", "getDistributionViewModel", "()Lcom/glority/android/picturexx/vm/SummaryDistributionViewModel;", "distributionViewModel$delegate", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "selectedMarker", "Lcom/google/android/gms/maps/model/Marker;", "allMarkers", "", "getLogPageName", "", "getViewBinding", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "onMapReady", "onMarkerClick", "", "marker", "initMapView", "initData", "initListener", "initComposeView", "onCountrySelected", "collectionCountrySummaryWrapper", "Lcom/glority/android/picturexx/extensions/CollectionCountrySummaryWrapper;", "onItemClick", "item", "Lcom/glority/android/database/entities/CollectionItem;", "groupCollectionsByCountry", "", "summaries", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/CollectionCountrySummary;", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CollectionDistributionFragment extends BaseFragment<FragmentCollectionDistributionBinding> implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {
    private static String countryCode;
    private final List<Marker> allMarkers = new ArrayList();

    /* renamed from: collectionVm$delegate, reason: from kotlin metadata */
    private final Lazy collectionVm;

    /* renamed from: distributionViewModel$delegate, reason: from kotlin metadata */
    private final Lazy distributionViewModel;
    private GoogleMap googleMap;
    private Marker selectedMarker;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final List<CollectionCountrySummary> issuerCountrySummaries = new ArrayList();

    @JvmStatic
    public static final void setIssuerCountryCode(String str) {
        INSTANCE.setIssuerCountryCode(str);
    }

    @JvmStatic
    public static final void setIssuerCountrySummaries(List<CollectionCountrySummary> list) {
        INSTANCE.setIssuerCountrySummaries(list);
    }

    public CollectionDistributionFragment() {
        final CollectionDistributionFragment collectionDistributionFragment = this;
        final Function0 function0 = null;
        this.collectionVm = FragmentViewModelLazyKt.createViewModelLazy(collectionDistributionFragment, Reflection.getOrCreateKotlinClass(CollectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.me.CollectionDistributionFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = Fragment.this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.me.CollectionDistributionFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = Function0.this;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = collectionDistributionFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.me.CollectionDistributionFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = Fragment.this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.distributionViewModel = FragmentViewModelLazyKt.createViewModelLazy(collectionDistributionFragment, Reflection.getOrCreateKotlinClass(SummaryDistributionViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.me.CollectionDistributionFragment$special$$inlined$activityViewModels$default$4
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = Fragment.this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.me.CollectionDistributionFragment$special$$inlined$activityViewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = Function0.this;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = collectionDistributionFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.me.CollectionDistributionFragment$special$$inlined$activityViewModels$default$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = Fragment.this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* compiled from: CollectionDistributionFragment.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0007J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/glority/android/picturexx/view/me/CollectionDistributionFragment$Companion;", "", "<init>", "()V", "issuerCountrySummaries", "", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/CollectionCountrySummary;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "setIssuerCountrySummaries", "", "summaries", "", "setIssuerCountryCode", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final void setIssuerCountrySummaries(List<CollectionCountrySummary> summaries) {
            Intrinsics.checkNotNullParameter(summaries, "summaries");
            CollectionDistributionFragment.issuerCountrySummaries.clear();
            CollectionDistributionFragment.issuerCountrySummaries.addAll(summaries);
        }

        @JvmStatic
        public final void setIssuerCountryCode(String countryCode) {
            CollectionDistributionFragment.countryCode = countryCode;
        }
    }

    private final CollectionViewModel getCollectionVm() {
        return (CollectionViewModel) this.collectionVm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SummaryDistributionViewModel getDistributionViewModel() {
        return (SummaryDistributionViewModel) this.distributionViewModel.getValue();
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected String getLogPageName() {
        return "collectiongeo";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    public FragmentCollectionDistributionBinding getViewBinding(LayoutInflater inflater, ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentCollectionDistributionBinding inflate = FragmentCollectionDistributionBinding.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        Fragment findFragmentById = getChildFragmentManager().findFragmentById(getBinding().mapViewFragment.getId());
        SupportMapFragment supportMapFragment = findFragmentById instanceof SupportMapFragment ? (SupportMapFragment) findFragmentById : null;
        if (supportMapFragment != null) {
            supportMapFragment.getMapAsync(this);
        }
        doCreateView();
    }

    private final void doCreateView() {
        initListener();
    }

    @Override // com.google.android.gms.maps.OnMapReadyCallback
    public void onMapReady(GoogleMap googleMap) {
        Intrinsics.checkNotNullParameter(googleMap, "googleMap");
        this.googleMap = googleMap;
        googleMap.setOnMarkerClickListener(this);
        initMapView(googleMap);
        initComposeView();
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    public boolean onMarkerClick(Marker marker) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        if (this.googleMap == null) {
            return true;
        }
        Object tag = marker.getTag();
        Object obj = null;
        MarkerTag markerTag = tag instanceof MarkerTag ? (MarkerTag) tag : null;
        if (markerTag == null) {
            return true;
        }
        String countryCode2 = markerTag.getCountryCode();
        logEvent(LogEvents.Collection_Map_Detail_Annotation_Click, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("id", countryCode2), TuplesKt.to(LogEventArguments.ARG_INTEGER_1, Integer.valueOf(markerTag.getCount()))));
        Iterator<T> it = getDistributionViewModel().getGroup().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((CollectionCountrySummaryWrapper) next).getCountryCode(), countryCode2)) {
                obj = next;
                break;
            }
        }
        CollectionCountrySummaryWrapper collectionCountrySummaryWrapper = (CollectionCountrySummaryWrapper) obj;
        if (collectionCountrySummaryWrapper == null) {
            return true;
        }
        onCountrySelected(collectionCountrySummaryWrapper);
        return true;
    }

    private final void initMapView(GoogleMap googleMap) {
        googleMap.setTrafficEnabled(false);
        googleMap.setBuildingsEnabled(false);
        googleMap.setIndoorEnabled(false);
        initData(googleMap);
    }

    private final void initData(GoogleMap googleMap) {
        double d;
        CountryInfo issuerCountry;
        Location capitalLocation;
        CountryInfo issuerCountry2;
        Location capitalLocation2;
        Object obj;
        CountryInfo issuerCountry3;
        Location capitalLocation3;
        CountryInfo issuerCountry4;
        Location capitalLocation4;
        List<CollectionCountrySummaryWrapper> groupCollectionsByCountry = groupCollectionsByCountry(issuerCountrySummaries);
        getDistributionViewModel().getGroup().clear();
        getDistributionViewModel().getGroup().addAll(groupCollectionsByCountry);
        getDistributionViewModel().getSelectedCountryCode().setValue(countryCode);
        Iterator<T> it = groupCollectionsByCountry.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            CollectionCountrySummaryWrapper collectionCountrySummaryWrapper = (CollectionCountrySummaryWrapper) it.next();
            String countryCode2 = collectionCountrySummaryWrapper.getCountryCode();
            List<CollectionCountrySummary> component2 = collectionCountrySummaryWrapper.component2();
            CollectionCountrySummary collectionCountrySummary = (CollectionCountrySummary) CollectionsKt.firstOrNull((List) component2);
            double latitude = (collectionCountrySummary == null || (issuerCountry4 = collectionCountrySummary.getIssuerCountry()) == null || (capitalLocation4 = issuerCountry4.getCapitalLocation()) == null) ? 0.0d : capitalLocation4.getLatitude();
            CollectionCountrySummary collectionCountrySummary2 = (CollectionCountrySummary) CollectionsKt.firstOrNull((List) component2);
            if (collectionCountrySummary2 != null && (issuerCountry3 = collectionCountrySummary2.getIssuerCountry()) != null && (capitalLocation3 = issuerCountry3.getCapitalLocation()) != null) {
                d = capitalLocation3.getLongitude();
            }
            double d2 = d;
            Iterator<T> it2 = component2.iterator();
            int i = 0;
            while (it2.hasNext()) {
                i += ((CollectionCountrySummary) it2.next()).getTotalCount();
            }
            Context context = getContext();
            if (context != null) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CollectionDistributionFragment$initData$1$1(googleMap, context, latitude, d2, i, countryCode2, this, null), 3, null);
            }
        }
        String str = countryCode;
        if (str != null && str.length() != 0) {
            Iterator<T> it3 = issuerCountrySummaries.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it3.next();
                    if (Intrinsics.areEqual(((CollectionCountrySummary) obj).getIssuerCountry().getCountryCode(), countryCode)) {
                        break;
                    }
                }
            }
            CollectionCountrySummary collectionCountrySummary3 = (CollectionCountrySummary) obj;
            if (collectionCountrySummary3 != null) {
                Location capitalLocation5 = collectionCountrySummary3.getIssuerCountry().getCapitalLocation();
                double latitude2 = capitalLocation5 != null ? capitalLocation5.getLatitude() : 0.0d;
                Location capitalLocation6 = collectionCountrySummary3.getIssuerCountry().getCapitalLocation();
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(latitude2, capitalLocation6 != null ? capitalLocation6.getLongitude() : 0.0d), 4.0f));
                return;
            }
        }
        CollectionCountrySummaryWrapper collectionCountrySummaryWrapper2 = (CollectionCountrySummaryWrapper) CollectionsKt.firstOrNull((List) groupCollectionsByCountry);
        if (collectionCountrySummaryWrapper2 != null) {
            CollectionCountrySummary collectionCountrySummary4 = (CollectionCountrySummary) CollectionsKt.firstOrNull((List) collectionCountrySummaryWrapper2.getSummaries());
            double latitude3 = (collectionCountrySummary4 == null || (issuerCountry2 = collectionCountrySummary4.getIssuerCountry()) == null || (capitalLocation2 = issuerCountry2.getCapitalLocation()) == null) ? 0.0d : capitalLocation2.getLatitude();
            CollectionCountrySummary collectionCountrySummary5 = (CollectionCountrySummary) CollectionsKt.firstOrNull((List) collectionCountrySummaryWrapper2.getSummaries());
            if (collectionCountrySummary5 != null && (issuerCountry = collectionCountrySummary5.getIssuerCountry()) != null && (capitalLocation = issuerCountry.getCapitalLocation()) != null) {
                d = capitalLocation.getLongitude();
            }
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(latitude3, d), 4.0f));
        }
    }

    private final void initListener() {
        AppCompatImageView ivClose = getBinding().ivClose;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        ViewExtensionsKt.setSingleClickListener$default(ivClose, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.me.CollectionDistributionFragment$initListener$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                new LogEventRequest(LogEvents.Collection_Map_Detail_Back_Click, null, 2, null).post();
                FragmentActivity activity = CollectionDistributionFragment.this.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        }, 1, (Object) null);
    }

    private final void initComposeView() {
        getBinding().composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1867993950, true, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.me.CollectionDistributionFragment$initComposeView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                SummaryDistributionViewModel distributionViewModel;
                SummaryDistributionViewModel distributionViewModel2;
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1867993950, i, -1, "com.glority.android.picturexx.view.me.CollectionDistributionFragment.initComposeView.<anonymous> (CollectionDistributionFragment.kt:191)");
                    }
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    distributionViewModel = CollectionDistributionFragment.this.getDistributionViewModel();
                    List<CollectionCountrySummaryWrapper> group = distributionViewModel.getGroup();
                    distributionViewModel2 = CollectionDistributionFragment.this.getDistributionViewModel();
                    String str = (String) LiveDataAdapterKt.observeAsState(distributionViewModel2.getSelectedCountryCode(), composer, 8).getValue();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(CollectionDistributionFragment.this);
                    final CollectionDistributionFragment collectionDistributionFragment = CollectionDistributionFragment.this;
                    CollectionDistributionKt.CollectionDistribution(fillMaxSize$default, group, str, anonymousClass1, new Function1<CollectionItem, Unit>() { // from class: com.glority.android.picturexx.view.me.CollectionDistributionFragment$initComposeView$1.2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(CollectionItem collectionItem) {
                            invoke2(collectionItem);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* compiled from: CollectionDistributionFragment.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                        @DebugMetadata(c = "com.glority.android.picturexx.view.me.CollectionDistributionFragment$initComposeView$1$2$1", f = "CollectionDistributionFragment.kt", i = {}, l = {ComposerKt.compositionLocalMapKey}, m = "invokeSuspend", n = {}, s = {})
                        /* renamed from: com.glority.android.picturexx.view.me.CollectionDistributionFragment$initComposeView$1$2$1, reason: invalid class name */
                        /* loaded from: classes5.dex */
                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ CollectionItem $item;
                            int label;
                            final /* synthetic */ CollectionDistributionFragment this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(CollectionItem collectionItem, CollectionDistributionFragment collectionDistributionFragment, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$item = collectionItem;
                                this.this$0 = collectionDistributionFragment;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new AnonymousClass1(this.$item, this.this$0, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    UserCustomSeriesItemDao userCustomSeriesItemDao = DBManager.INSTANCE.getUserCustomSeriesItemDao();
                                    Integer customSeriesId = this.$item.getCustomSeriesId();
                                    Intrinsics.checkNotNull(customSeriesId);
                                    this.$item.setCustomSeriesName(userCustomSeriesItemDao.getCustomSeriesTitleByIdSync(customSeriesId.intValue()));
                                    this.label = 1;
                                    if (BuildersKt.withContext(Dispatchers.getMain(), new C01191(this.this$0, this.$item, null), this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* compiled from: CollectionDistributionFragment.kt */
                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                            @DebugMetadata(c = "com.glority.android.picturexx.view.me.CollectionDistributionFragment$initComposeView$1$2$1$1", f = "CollectionDistributionFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                            /* renamed from: com.glority.android.picturexx.view.me.CollectionDistributionFragment$initComposeView$1$2$1$1, reason: invalid class name and collision with other inner class name */
                            /* loaded from: classes5.dex */
                            public static final class C01191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ CollectionItem $item;
                                int label;
                                final /* synthetic */ CollectionDistributionFragment this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C01191(CollectionDistributionFragment collectionDistributionFragment, CollectionItem collectionItem, Continuation<? super C01191> continuation) {
                                    super(2, continuation);
                                    this.this$0 = collectionDistributionFragment;
                                    this.$item = collectionItem;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C01191(this.this$0, this.$item, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((C01191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    if (this.label == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        this.this$0.onItemClick(this.$item);
                                        return Unit.INSTANCE;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            }
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(CollectionItem item) {
                            Intrinsics.checkNotNullParameter(item, "item");
                            if (item.getCustomSeriesId() != null) {
                                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(CollectionDistributionFragment.this), Dispatchers.getIO(), null, new AnonymousClass1(item, CollectionDistributionFragment.this, null), 2, null);
                            } else {
                                CollectionDistributionFragment.this.onItemClick(item);
                            }
                        }
                    }, composer, 70);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CollectionDistributionFragment.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
            /* renamed from: com.glority.android.picturexx.view.me.CollectionDistributionFragment$initComposeView$1$1, reason: invalid class name */
            /* loaded from: classes5.dex */
            public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<CollectionCountrySummaryWrapper, Unit> {
                AnonymousClass1(Object obj) {
                    super(1, obj, CollectionDistributionFragment.class, "onCountrySelected", "onCountrySelected(Lcom/glority/android/picturexx/extensions/CollectionCountrySummaryWrapper;)V", 0);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CollectionCountrySummaryWrapper collectionCountrySummaryWrapper) {
                    invoke2(collectionCountrySummaryWrapper);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(CollectionCountrySummaryWrapper collectionCountrySummaryWrapper) {
                    ((CollectionDistributionFragment) this.receiver).onCountrySelected(collectionCountrySummaryWrapper);
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCountrySelected(CollectionCountrySummaryWrapper collectionCountrySummaryWrapper) {
        CollectionCountrySummary collectionCountrySummary;
        CountryInfo issuerCountry;
        Location capitalLocation;
        GoogleMap googleMap;
        Context context = getContext();
        if (context == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CollectionDistributionFragment$onCountrySelected$1(this, context, collectionCountrySummaryWrapper, null), 3, null);
        getDistributionViewModel().getSelectedCountryCode().setValue(collectionCountrySummaryWrapper != null ? collectionCountrySummaryWrapper.getCountryCode() : null);
        if (collectionCountrySummaryWrapper == null || (collectionCountrySummary = (CollectionCountrySummary) CollectionsKt.firstOrNull((List) collectionCountrySummaryWrapper.getSummaries())) == null || (issuerCountry = collectionCountrySummary.getIssuerCountry()) == null || (capitalLocation = issuerCountry.getCapitalLocation()) == null || (googleMap = this.googleMap) == null) {
            return;
        }
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(capitalLocation.getLatitude(), capitalLocation.getLongitude()), 4.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onItemClick(CollectionItem item) {
        getCollectionVm().setCurrentItem(item);
        FragmentActivity activity = getActivity();
        CollectionDistributionActivity collectionDistributionActivity = activity instanceof CollectionDistributionActivity ? (CollectionDistributionActivity) activity : null;
        if (collectionDistributionActivity != null) {
            collectionDistributionActivity.openCollectionDetailFragment();
        }
    }

    private final List<CollectionCountrySummaryWrapper> groupCollectionsByCountry(List<CollectionCountrySummary> summaries) {
        return CollectionCountrySummaryListExtKt.sortByMaxCount(CollectionCountrySummaryListExtKt.groupByCountry(summaries));
    }
}
