package com.glority.android.picturexx.view.me;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.database.DBManager;
import com.glority.android.database.dao.UserCustomSeriesItemDao;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.picturexx.business.databinding.FragmentCollectionDistributionListBinding;
import com.glority.android.picturexx.composable.CollectionDistributionListKt;
import com.glority.android.picturexx.extensions.CollectionCountrySummaryWrapper;
import com.glority.android.picturexx.vm.CollectionViewModel;
import com.glority.android.ui.base.v2.BaseFragment;
import com.glority.android.xx.constants.LogEvents;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.picturecoin.generatedAPI.kotlinAPI.collection.CollectionCountrySummary;
import com.picturecoin.generatedAPI.kotlinAPI.model.CountryInfo;
import com.picturecoin.generatedAPI.kotlinAPI.model.Location;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
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

/* compiled from: CollectionDistributionListFragment.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\u001a\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0012\u0010\u0016\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u0016\u001a\u00020\fH\u0002J\b\u0010\u0017\u001a\u00020\fH\u0002J\b\u0010\u0018\u001a\u00020\fH\u0002J\b\u0010\u0019\u001a\u00020\fH\u0002J\b\u0010\u001a\u001a\u00020\fH\u0002J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 H\u0002J(\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0&H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006("}, d2 = {"Lcom/glority/android/picturexx/view/me/CollectionDistributionListFragment;", "Lcom/glority/android/ui/base/v2/BaseFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentCollectionDistributionListBinding;", "<init>", "()V", "collectionVm", "Lcom/glority/android/picturexx/vm/CollectionViewModel;", "getCollectionVm", "()Lcom/glority/android/picturexx/vm/CollectionViewModel;", "collectionVm$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "getLogPageName", "", "getViewBinding", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "doCreateView", "initMap", "initData", "initListener", "initComposeView", "onCountrySelected", "collectionCountrySummaryWrapper", "Lcom/glority/android/picturexx/extensions/CollectionCountrySummaryWrapper;", "onItemClick", "item", "Lcom/glority/android/database/entities/CollectionItem;", "groupCollectionsByCountry", "", "", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/CollectionCountrySummary;", "summaries", "", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CollectionDistributionListFragment extends BaseFragment<FragmentCollectionDistributionListBinding> {
    private static String countryCode;

    /* renamed from: collectionVm$delegate, reason: from kotlin metadata */
    private final Lazy collectionVm;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final List<CollectionCountrySummary> issuerCountrySummaries = new ArrayList();

    private final void initMap() {
    }

    @JvmStatic
    public static final void setIssuerCountryCode(String str) {
        INSTANCE.setIssuerCountryCode(str);
    }

    @JvmStatic
    public static final void setIssuerCountrySummaries(List<CollectionCountrySummary> list) {
        INSTANCE.setIssuerCountrySummaries(list);
    }

    public CollectionDistributionListFragment() {
        final CollectionDistributionListFragment collectionDistributionListFragment = this;
        final Function0 function0 = null;
        this.collectionVm = FragmentViewModelLazyKt.createViewModelLazy(collectionDistributionListFragment, Reflection.getOrCreateKotlinClass(CollectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.me.CollectionDistributionListFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.me.CollectionDistributionListFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = collectionDistributionListFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.me.CollectionDistributionListFragment$special$$inlined$activityViewModels$default$3
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

    /* compiled from: CollectionDistributionListFragment.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0007J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/glority/android/picturexx/view/me/CollectionDistributionListFragment$Companion;", "", "<init>", "()V", "issuerCountrySummaries", "", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/CollectionCountrySummary;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "setIssuerCountrySummaries", "", "summaries", "", "setIssuerCountryCode", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
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
            CollectionDistributionListFragment.issuerCountrySummaries.clear();
            CollectionDistributionListFragment.issuerCountrySummaries.addAll(summaries);
        }

        @JvmStatic
        public final void setIssuerCountryCode(String countryCode) {
            CollectionDistributionListFragment.countryCode = countryCode;
        }
    }

    private final CollectionViewModel getCollectionVm() {
        return (CollectionViewModel) this.collectionVm.getValue();
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    protected String getPageName() {
        return "collectiongeo";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    public FragmentCollectionDistributionListBinding getViewBinding(LayoutInflater inflater, ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentCollectionDistributionListBinding inflate = FragmentCollectionDistributionListBinding.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        doCreateView();
    }

    private final void doCreateView() {
        initMap();
        initData();
        initComposeView();
        initListener();
    }

    private final void initData() {
        Object obj;
        CountryInfo issuerCountry;
        Location capitalLocation;
        CountryInfo issuerCountry2;
        Location capitalLocation2;
        CountryInfo issuerCountry3;
        Location capitalLocation3;
        CountryInfo issuerCountry4;
        Location capitalLocation4;
        Map<String, List<CollectionCountrySummary>> groupCollectionsByCountry = groupCollectionsByCountry(issuerCountrySummaries);
        Iterator<Map.Entry<String, List<CollectionCountrySummary>>> it = groupCollectionsByCountry.entrySet().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, List<CollectionCountrySummary>> next = it.next();
            next.getKey();
            List<CollectionCountrySummary> value = next.getValue();
            CollectionCountrySummary collectionCountrySummary = (CollectionCountrySummary) CollectionsKt.firstOrNull((List) value);
            if (collectionCountrySummary != null && (issuerCountry4 = collectionCountrySummary.getIssuerCountry()) != null && (capitalLocation4 = issuerCountry4.getCapitalLocation()) != null) {
                capitalLocation4.getLatitude();
            }
            CollectionCountrySummary collectionCountrySummary2 = (CollectionCountrySummary) CollectionsKt.firstOrNull((List) value);
            if (collectionCountrySummary2 != null && (issuerCountry3 = collectionCountrySummary2.getIssuerCountry()) != null && (capitalLocation3 = issuerCountry3.getCapitalLocation()) != null) {
                capitalLocation3.getLongitude();
            }
            Iterator<T> it2 = value.iterator();
            while (it2.hasNext()) {
                ((CollectionCountrySummary) it2.next()).getTotalCount();
            }
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CollectionDistributionListFragment$initData$1$1(null), 3, null);
        }
        String str = countryCode;
        if (str != null && str.length() != 0) {
            Iterator<T> it3 = issuerCountrySummaries.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                if (Intrinsics.areEqual(((CollectionCountrySummary) next2).getIssuerCountry().getCountryCode(), countryCode)) {
                    obj = next2;
                    break;
                }
            }
            CollectionCountrySummary collectionCountrySummary3 = (CollectionCountrySummary) obj;
            if (collectionCountrySummary3 != null) {
                Location capitalLocation5 = collectionCountrySummary3.getIssuerCountry().getCapitalLocation();
                if (capitalLocation5 != null) {
                    capitalLocation5.getLatitude();
                }
                Location capitalLocation6 = collectionCountrySummary3.getIssuerCountry().getCapitalLocation();
                if (capitalLocation6 != null) {
                    capitalLocation6.getLongitude();
                    return;
                }
                return;
            }
        }
        Pair pair = (Pair) CollectionsKt.firstOrNull(MapsKt.toList(groupCollectionsByCountry));
        if (pair != null) {
            CollectionCountrySummary collectionCountrySummary4 = (CollectionCountrySummary) CollectionsKt.firstOrNull((List) pair.getSecond());
            if (collectionCountrySummary4 != null && (issuerCountry2 = collectionCountrySummary4.getIssuerCountry()) != null && (capitalLocation2 = issuerCountry2.getCapitalLocation()) != null) {
                capitalLocation2.getLatitude();
            }
            CollectionCountrySummary collectionCountrySummary5 = (CollectionCountrySummary) CollectionsKt.firstOrNull((List) pair.getSecond());
            if (collectionCountrySummary5 == null || (issuerCountry = collectionCountrySummary5.getIssuerCountry()) == null || (capitalLocation = issuerCountry.getCapitalLocation()) == null) {
                return;
            }
            capitalLocation.getLongitude();
        }
    }

    private final void initListener() {
        AppCompatImageView ivClose = getBinding().ivClose;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        ViewExtensionsKt.setSingleClickListener$default(ivClose, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.me.CollectionDistributionListFragment$initListener$1
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
                FragmentActivity activity = CollectionDistributionListFragment.this.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        }, 1, (Object) null);
    }

    private final void initComposeView() {
        getBinding().composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-136819290, true, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.me.CollectionDistributionListFragment$initComposeView$1
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
                String str;
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-136819290, i, -1, "com.glority.android.picturexx.view.me.CollectionDistributionListFragment.initComposeView.<anonymous> (CollectionDistributionListFragment.kt:130)");
                    }
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    List list = CollectionDistributionListFragment.issuerCountrySummaries;
                    str = CollectionDistributionListFragment.countryCode;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(CollectionDistributionListFragment.this);
                    final CollectionDistributionListFragment collectionDistributionListFragment = CollectionDistributionListFragment.this;
                    CollectionDistributionListKt.CollectionDistributionList(fillMaxSize$default, list, str, anonymousClass1, new Function1<CollectionItem, Unit>() { // from class: com.glority.android.picturexx.view.me.CollectionDistributionListFragment$initComposeView$1.2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(CollectionItem collectionItem) {
                            invoke2(collectionItem);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* compiled from: CollectionDistributionListFragment.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                        @DebugMetadata(c = "com.glority.android.picturexx.view.me.CollectionDistributionListFragment$initComposeView$1$2$1", f = "CollectionDistributionListFragment.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
                        /* renamed from: com.glority.android.picturexx.view.me.CollectionDistributionListFragment$initComposeView$1$2$1, reason: invalid class name */
                        /* loaded from: classes5.dex */
                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ CollectionItem $item;
                            int label;
                            final /* synthetic */ CollectionDistributionListFragment this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(CollectionItem collectionItem, CollectionDistributionListFragment collectionDistributionListFragment, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$item = collectionItem;
                                this.this$0 = collectionDistributionListFragment;
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
                                    if (BuildersKt.withContext(Dispatchers.getMain(), new C01201(this.this$0, this.$item, null), this) == coroutine_suspended) {
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
                            /* compiled from: CollectionDistributionListFragment.kt */
                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                            @DebugMetadata(c = "com.glority.android.picturexx.view.me.CollectionDistributionListFragment$initComposeView$1$2$1$1", f = "CollectionDistributionListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                            /* renamed from: com.glority.android.picturexx.view.me.CollectionDistributionListFragment$initComposeView$1$2$1$1, reason: invalid class name and collision with other inner class name */
                            /* loaded from: classes5.dex */
                            public static final class C01201 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ CollectionItem $item;
                                int label;
                                final /* synthetic */ CollectionDistributionListFragment this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C01201(CollectionDistributionListFragment collectionDistributionListFragment, CollectionItem collectionItem, Continuation<? super C01201> continuation) {
                                    super(2, continuation);
                                    this.this$0 = collectionDistributionListFragment;
                                    this.$item = collectionItem;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C01201(this.this$0, this.$item, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((C01201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(CollectionDistributionListFragment.this), Dispatchers.getIO(), null, new AnonymousClass1(item, CollectionDistributionListFragment.this, null), 2, null);
                            } else {
                                CollectionDistributionListFragment.this.onItemClick(item);
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
            /* compiled from: CollectionDistributionListFragment.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
            /* renamed from: com.glority.android.picturexx.view.me.CollectionDistributionListFragment$initComposeView$1$1, reason: invalid class name */
            /* loaded from: classes5.dex */
            public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<CollectionCountrySummaryWrapper, Unit> {
                AnonymousClass1(Object obj) {
                    super(1, obj, CollectionDistributionListFragment.class, "onCountrySelected", "onCountrySelected(Lcom/glority/android/picturexx/extensions/CollectionCountrySummaryWrapper;)V", 0);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CollectionCountrySummaryWrapper collectionCountrySummaryWrapper) {
                    invoke2(collectionCountrySummaryWrapper);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(CollectionCountrySummaryWrapper p0) {
                    Intrinsics.checkNotNullParameter(p0, "p0");
                    ((CollectionDistributionListFragment) this.receiver).onCountrySelected(p0);
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCountrySelected(CollectionCountrySummaryWrapper collectionCountrySummaryWrapper) {
        CountryInfo issuerCountry;
        CollectionCountrySummary collectionCountrySummary = (CollectionCountrySummary) CollectionsKt.firstOrNull((List) collectionCountrySummaryWrapper.getSummaries());
        if (collectionCountrySummary == null || (issuerCountry = collectionCountrySummary.getIssuerCountry()) == null) {
            return;
        }
        issuerCountry.getCapitalLocation();
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

    private final Map<String, List<CollectionCountrySummary>> groupCollectionsByCountry(List<CollectionCountrySummary> summaries) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : summaries) {
            String countryCode2 = ((CollectionCountrySummary) obj).getIssuerCountry().getCountryCode();
            Object obj2 = linkedHashMap.get(countryCode2);
            if (obj2 == null) {
                obj2 = (List) new ArrayList();
                linkedHashMap.put(countryCode2, obj2);
            }
            ((List) obj2).add(obj);
        }
        return linkedHashMap;
    }
}
