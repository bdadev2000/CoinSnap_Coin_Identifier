package com.glority.android.picturexx.view.me;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.graphics.Color;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentKt;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.database.DBManager;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.database.entities.SeriesItem;
import com.glority.android.database.entities.UserSeriesDetailItem;
import com.glority.android.picturexx.GlobalLiveBus;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.FragmentMeCollectionSummaryBinding;
import com.glority.android.picturexx.definition.CatalogTab;
import com.glority.android.picturexx.extensions.MarkerTag;
import com.glority.android.picturexx.extensions.UserSeriesListExtKt;
import com.glority.android.picturexx.recognize.CoreActivity;
import com.glority.android.picturexx.recognize.logevents.RecognizeLogEvents;
import com.glority.android.picturexx.repository.CollectionRepository;
import com.glority.android.picturexx.repository.SeriesRepository;
import com.glority.android.picturexx.repository.SyncCollectionManager;
import com.glority.android.picturexx.view.dialog.ContentFeedbackDialog;
import com.glority.android.picturexx.view.dialog.MeltPriceHintDialog;
import com.glority.android.picturexx.view.mapview.OnMarkerClickListener;
import com.glority.android.picturexx.views.CollectionBestOfficialSetCardView;
import com.glority.android.picturexx.views.CollectionBestVarietiesCardView;
import com.glority.android.picturexx.views.CollectionGeoDistributionCardView;
import com.glority.android.picturexx.views.CollectionMeltPriceCardView;
import com.glority.android.picturexx.views.OnBestVarietiesClickListener;
import com.glority.android.picturexx.views.OnCollectionCountryClickListener;
import com.glority.android.picturexx.views.SummaryCardView;
import com.glority.android.picturexx.vm.CollectionSummaryViewModel;
import com.glority.android.picturexx.vm.CollectionViewModel;
import com.glority.android.picturexx.vm.MainRecognizeProcess;
import com.glority.android.picturexx.vm.SeriesViewModel;
import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.android.xx.constants.KeyLogEvents;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.abtest.CoinAbTestUtils;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.utils.NavigationAnimaUtils;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.glority.utils.stability.LogUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.picturecoin.generatedAPI.kotlinAPI.collection.BestCollection;
import com.picturecoin.generatedAPI.kotlinAPI.collection.CollectionCompositionSummary;
import com.picturecoin.generatedAPI.kotlinAPI.collection.CollectionCountrySummary;
import com.picturecoin.generatedAPI.kotlinAPI.collection.GetCollectionsSummaryNewMessage;
import com.picturecoin.generatedAPI.kotlinAPI.enums.BestCollectionType;
import com.picturecoin.generatedAPI.kotlinAPI.series.UserSeriesDetail;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* compiled from: MeCollectionSummaryFragment.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\b\u0010\u001e\u001a\u00020\u0019H\u0002J\b\u0010\u001f\u001a\u00020\u0019H\u0002J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"H\u0002J\u0014\u0010#\u001a\u00020\u00192\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0015H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/glority/android/picturexx/view/me/MeCollectionSummaryFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentMeCollectionSummaryBinding;", "<init>", "()V", "vm", "Lcom/glority/android/picturexx/vm/CollectionSummaryViewModel;", "getVm", "()Lcom/glority/android/picturexx/vm/CollectionSummaryViewModel;", "vm$delegate", "Lkotlin/Lazy;", "collectionVm", "Lcom/glority/android/picturexx/vm/CollectionViewModel;", "getCollectionVm", "()Lcom/glority/android/picturexx/vm/CollectionViewModel;", "collectionVm$delegate", "syncCollectionManager", "Lcom/glority/android/picturexx/repository/SyncCollectionManager;", "collectionRetrievingJob", "Lkotlinx/coroutines/Job;", "getLogPageName", "", "getLayoutId", "", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "initView", "initListener", "addSubscriptions", "initData", "showMoreFeedbackDialog", "type", "Lcom/glority/android/picturexx/view/me/SummarySectionType;", "openGeoDistributionMapActivity", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class MeCollectionSummaryFragment extends BaseFragment<FragmentMeCollectionSummaryBinding> {
    public static final int $stable = 8;
    private Job collectionRetrievingJob;

    /* renamed from: collectionVm$delegate, reason: from kotlin metadata */
    private final Lazy collectionVm;
    private final SyncCollectionManager syncCollectionManager = new SyncCollectionManager();

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    private final Lazy vm;

    public MeCollectionSummaryFragment() {
        CompletableJob Job$default;
        final MeCollectionSummaryFragment meCollectionSummaryFragment = this;
        final Function0 function0 = null;
        this.vm = FragmentViewModelLazyKt.createViewModelLazy(meCollectionSummaryFragment, Reflection.getOrCreateKotlinClass(CollectionSummaryViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = meCollectionSummaryFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$special$$inlined$activityViewModels$default$3
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
        this.collectionVm = FragmentViewModelLazyKt.createViewModelLazy(meCollectionSummaryFragment, Reflection.getOrCreateKotlinClass(CollectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$special$$inlined$activityViewModels$default$5
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
                CreationExtras defaultViewModelCreationExtras = meCollectionSummaryFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$special$$inlined$activityViewModels$default$6
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
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.collectionRetrievingJob = Job$default;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FragmentMeCollectionSummaryBinding access$getBinding(MeCollectionSummaryFragment meCollectionSummaryFragment) {
        return (FragmentMeCollectionSummaryBinding) meCollectionSummaryFragment.getBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CollectionSummaryViewModel getVm() {
        return (CollectionSummaryViewModel) this.vm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CollectionViewModel getCollectionVm() {
        return (CollectionViewModel) this.collectionVm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    public String getPageName() {
        return "mesummary";
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_me_collection_summary;
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        initData();
        initView();
        initListener();
        addSubscriptions();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        if (getContext() != null) {
            ((FragmentMeCollectionSummaryBinding) getBinding()).summaryGeoDistributionCard.setOnMapMarkerClickListener(new OnMarkerClickListener() { // from class: com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$$ExternalSyntheticLambda1
                @Override // com.glority.android.picturexx.view.mapview.OnMarkerClickListener
                public final void onMarkerClick(MarkerTag markerTag) {
                    MeCollectionSummaryFragment.initView$lambda$2$lambda$0(MeCollectionSummaryFragment.this, markerTag);
                }
            });
            ((FragmentMeCollectionSummaryBinding) getBinding()).summaryGeoDistributionCard.setOnCollectionCountryClickListener(new OnCollectionCountryClickListener() { // from class: com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$$ExternalSyntheticLambda2
                @Override // com.glority.android.picturexx.views.OnCollectionCountryClickListener
                public final void onClick(String str) {
                    MeCollectionSummaryFragment.initView$lambda$2$lambda$1(MeCollectionSummaryFragment.this, str);
                }
            });
        }
        ((FragmentMeCollectionSummaryBinding) getBinding()).summaryCard.setBackgroundColor((int) Color.INSTANCE.m4550getTransparent0d7_KjU());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2$lambda$0(MeCollectionSummaryFragment this$0, MarkerTag it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.openGeoDistributionMapActivity(it.getCountryCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2$lambda$1(MeCollectionSummaryFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.openGeoDistributionMapActivity(it);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initListener() {
        ((FragmentMeCollectionSummaryBinding) getBinding()).nsvContent.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$initListener$1
            private boolean hasRecordedScroll;
            private boolean hasRecordedScrollToBottom;
            private boolean hasSetDistributionCard;

            @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                Intrinsics.checkNotNullParameter(v, "v");
                if (!this.hasRecordedScroll && scrollY > 0) {
                    this.hasRecordedScroll = true;
                    com.glority.android.ui.base.v2.BaseFragment.logEvent$default(MeCollectionSummaryFragment.this, LogEvents.Me_Summary_Scroll, null, 2, null);
                }
                if (!this.hasRecordedScrollToBottom && !v.canScrollVertically(1)) {
                    this.hasRecordedScrollToBottom = true;
                    com.glority.android.ui.base.v2.BaseFragment.logEvent$default(MeCollectionSummaryFragment.this, LogEvents.Me_Summary_Scroll_To_Bottom, null, 2, null);
                }
                if (this.hasSetDistributionCard) {
                    return;
                }
                MeCollectionSummaryFragment meCollectionSummaryFragment = MeCollectionSummaryFragment.this;
                try {
                    Rect rect = new Rect();
                    MeCollectionSummaryFragment.access$getBinding(meCollectionSummaryFragment).nsvContent.getHitRect(rect);
                    if (MeCollectionSummaryFragment.access$getBinding(meCollectionSummaryFragment).summaryGeoDistributionCard.getLocalVisibleRect(rect)) {
                        LogUtils.e("Launch when resumed");
                        this.hasSetDistributionCard = true;
                        MeCollectionSummaryFragment.access$getBinding(meCollectionSummaryFragment).summaryGeoDistributionCard.setMapVisible(CoinAbTestUtils.INSTANCE.enableCoinDistributionMap());
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e) {
                    if (AppContext.INSTANCE.isDebugMode()) {
                        LogUtils.e(Log.getStackTraceString(e));
                    }
                }
            }
        });
        LinearLayout llEmptyCollectionAddCoins = ((FragmentMeCollectionSummaryBinding) getBinding()).icEmptyLayout.llEmptyCollectionAddCoins;
        Intrinsics.checkNotNullExpressionValue(llEmptyCollectionAddCoins, "llEmptyCollectionAddCoins");
        ViewExtensionsKt.setSingleClickListener$default(llEmptyCollectionAddCoins, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$initListener$2
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
                Bundle newUserIdentifyA = KeyLogEvents.INSTANCE.newUserIdentifyA();
                MeCollectionSummaryFragment.this.logEvent(LogEvents.tabbarv2_camera_click, newUserIdentifyA);
                CoreActivity.Companion companion = CoreActivity.INSTANCE;
                FragmentActivity requireActivity = MeCollectionSummaryFragment.this.requireActivity();
                Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.glority.android.ui.base.RuntimePermissionActivity");
                companion.start((RuntimePermissionActivity) requireActivity, new MainRecognizeProcess(), 2, true, "camera tab v2", RecognizeLogEvents.camera, newUserIdentifyA);
            }
        }, 1, (Object) null);
        ViewExtensionsKt.setSingleClickListener$default(((FragmentMeCollectionSummaryBinding) getBinding()).summaryMeltPriceCard.getInfoButton(), 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$initListener$3
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
                FragmentActivity activity = MeCollectionSummaryFragment.this.getActivity();
                if (activity == null) {
                    return;
                }
                MeltPriceHintDialog.MeltHintDialogListener meltHintDialogListener = new MeltPriceHintDialog.MeltHintDialogListener() { // from class: com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$initListener$3$listener$1
                    @Override // com.glority.android.picturexx.view.dialog.MeltPriceHintDialog.MeltHintDialogListener
                    public void onCloseClick(DialogFragment dialog) {
                        Intrinsics.checkNotNullParameter(dialog, "dialog");
                        dialog.dismiss();
                    }

                    @Override // com.glority.android.picturexx.view.dialog.MeltPriceHintDialog.MeltHintDialogListener
                    public void onGotItClick(DialogFragment dialog) {
                        Intrinsics.checkNotNullParameter(dialog, "dialog");
                        dialog.dismiss();
                    }
                };
                MeltPriceHintDialog.Companion companion = MeltPriceHintDialog.INSTANCE;
                FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                companion.show(supportFragmentManager, meltHintDialogListener);
            }
        }, 1, (Object) null);
        ViewExtensionsKt.setSingleClickListener$default(((FragmentMeCollectionSummaryBinding) getBinding()).summaryMeltPriceCard.getMoreButton(), 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$initListener$4
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
                MeCollectionSummaryFragment.this.showMoreFeedbackDialog(SummarySectionType.MELT_PRICE);
            }
        }, 1, (Object) null);
        ViewExtensionsKt.setSingleClickListener$default(((FragmentMeCollectionSummaryBinding) getBinding()).summaryBestVarietiesCard.getMoreButton(), 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$initListener$5
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
                MeCollectionSummaryFragment.this.showMoreFeedbackDialog(SummarySectionType.BEST_VARIETIES);
            }
        }, 1, (Object) null);
        ((FragmentMeCollectionSummaryBinding) getBinding()).summaryBestVarietiesCard.setOnBestVarietiesClickListener(new OnBestVarietiesClickListener() { // from class: com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$$ExternalSyntheticLambda0
            @Override // com.glority.android.picturexx.views.OnBestVarietiesClickListener
            public final void onBestVarietiesClick(BestCollection bestCollection, int i) {
                MeCollectionSummaryFragment.initListener$lambda$3(MeCollectionSummaryFragment.this, bestCollection, i);
            }
        });
        ViewExtensionsKt.setSingleClickListener$default(((FragmentMeCollectionSummaryBinding) getBinding()).summaryGeoDistributionCard.getMoreButton(), 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$initListener$7
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
                MeCollectionSummaryFragment.this.showMoreFeedbackDialog(SummarySectionType.GEOGRAPHIC_DISTRIBUTION);
            }
        }, 1, (Object) null);
        ViewExtensionsKt.setSingleClickListener$default(((FragmentMeCollectionSummaryBinding) getBinding()).summaryGeoDistributionCard.getMapView(), 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$initListener$8
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
                MeCollectionSummaryFragment.openGeoDistributionMapActivity$default(MeCollectionSummaryFragment.this, null, 1, null);
            }
        }, 1, (Object) null);
        ViewExtensionsKt.setSingleClickListener$default(((FragmentMeCollectionSummaryBinding) getBinding()).summaryGeoDistributionCard.getZoomButton(), 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$initListener$9
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
                MeCollectionSummaryFragment.openGeoDistributionMapActivity$default(MeCollectionSummaryFragment.this, null, 1, null);
            }
        }, 1, (Object) null);
        CollectionGeoDistributionCardView summaryGeoDistributionCard = ((FragmentMeCollectionSummaryBinding) getBinding()).summaryGeoDistributionCard;
        Intrinsics.checkNotNullExpressionValue(summaryGeoDistributionCard, "summaryGeoDistributionCard");
        ViewExtensionsKt.setSingleClickListener$default(summaryGeoDistributionCard, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$initListener$10
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
                MeCollectionSummaryFragment.openGeoDistributionMapActivity$default(MeCollectionSummaryFragment.this, null, 1, null);
            }
        }, 1, (Object) null);
        ViewExtensionsKt.setSingleClickListener$default(((FragmentMeCollectionSummaryBinding) getBinding()).summaryBestOfficialSetCard.getMoreButton(), 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$initListener$11
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
                MeCollectionSummaryFragment.this.showMoreFeedbackDialog(SummarySectionType.BEST_OFFICIAL_SET);
            }
        }, 1, (Object) null);
        ViewExtensionsKt.setSingleClickListener$default(((FragmentMeCollectionSummaryBinding) getBinding()).summaryBestOfficialSetCard.getCheckAllOfficialSetButton(), 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$initListener$12
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
                MeCollectionSummaryFragment meCollectionSummaryFragment = MeCollectionSummaryFragment.this;
                meCollectionSummaryFragment.logEvent(LogEvents.Me_Summary_Best_Official_Check_All, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to(LogEventArguments.ARG_STRING_1, MeCollectionSummaryFragment.access$getBinding(meCollectionSummaryFragment).summaryBestOfficialSetCard.getIndexListUid())));
                GlobalLiveBus.INSTANCE.getChangeMainTab().setValue(CatalogTab.INSTANCE);
                GlobalLiveBus.INSTANCE.getChangeCatalogTab().setValue(1);
                GlobalLiveBus.INSTANCE.getChangeCatalogFilter().setValue(SeriesViewModel.SeriesType.OFFICIAL);
                GlobalLiveBus.INSTANCE.getChangeCatalogFilterCountry().setValue(null);
            }
        }, 1, (Object) null);
        ViewExtensionsKt.setSingleClickListener$default(((FragmentMeCollectionSummaryBinding) getBinding()).summaryBestOfficialSetCard.getOfficialSetCardView(), 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$initListener$13
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
                String indexListUid = MeCollectionSummaryFragment.access$getBinding(MeCollectionSummaryFragment.this).summaryBestOfficialSetCard.getIndexListUid();
                long seriesId = MeCollectionSummaryFragment.access$getBinding(MeCollectionSummaryFragment.this).summaryBestOfficialSetCard.getSeriesId();
                String str = indexListUid;
                if (str == null || str.length() == 0) {
                    return;
                }
                MeCollectionSummaryFragment.this.logEvent(LogEvents.Me_Summary_Best_Official_Click, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to(LogEventArguments.ARG_STRING_1, indexListUid)));
                NavController findNavController = FragmentKt.findNavController(MeCollectionSummaryFragment.this);
                Uri parse = Uri.parse("coin://series/detail?indexListUid=" + indexListUid + "&amp;from=summary&amp;seriesId=" + seriesId);
                Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
                findNavController.navigate(parse, NavigationAnimaUtils.INSTANCE.getSlideAnima(MeCollectionSummaryFragment.this.getActivity()));
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$3(MeCollectionSummaryFragment this$0, BestCollection it, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Integer collectionId = it.getCollection().getCollectionId();
        if (collectionId != null) {
            int intValue = collectionId.intValue();
            this$0.logEvent(LogEvents.Me_Best_Variety_Item_Click, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("type", Integer.valueOf(i))));
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new MeCollectionSummaryFragment$initListener$6$1(this$0, intValue, null), 3, null);
        }
    }

    private final void addSubscriptions() {
        MeCollectionSummaryFragment meCollectionSummaryFragment = this;
        GlobalLiveBus.INSTANCE.getCurrencyChangedLiveData().observe(meCollectionSummaryFragment, new MeCollectionSummaryFragment$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$addSubscriptions$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                if (z) {
                    MeCollectionSummaryFragment.this.initData();
                }
            }
        }));
        this.syncCollectionManager.getSummaryLivedata().observe(meCollectionSummaryFragment, new MeCollectionSummaryFragment$sam$androidx_lifecycle_Observer$0(new Function1<SyncCollectionManager.SummaryInfo, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$addSubscriptions$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SyncCollectionManager.SummaryInfo summaryInfo) {
                invoke2(summaryInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SyncCollectionManager.SummaryInfo summaryInfo) {
                SummaryCardView summaryCard = MeCollectionSummaryFragment.access$getBinding(MeCollectionSummaryFragment.this).summaryCard;
                Intrinsics.checkNotNullExpressionValue(summaryCard, "summaryCard");
                summaryCard.setVisibility(summaryInfo != null && summaryInfo.getTotalCount() > 0 ? 0 : 8);
                if (summaryInfo != null) {
                    MeCollectionSummaryFragment.access$getBinding(MeCollectionSummaryFragment.this).summaryCard.setSummary(summaryInfo);
                }
            }
        }));
        DBManager.INSTANCE.getCollectionItemDao().getAll().observe(meCollectionSummaryFragment, new MeCollectionSummaryFragment$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends CollectionItem>, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$addSubscriptions$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends CollectionItem> list) {
                invoke2((List<CollectionItem>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<CollectionItem> list) {
                Job job;
                Job launch$default;
                Job job2;
                List<CollectionItem> list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    ConstraintLayout clEmptyView = MeCollectionSummaryFragment.access$getBinding(MeCollectionSummaryFragment.this).clEmptyView;
                    Intrinsics.checkNotNullExpressionValue(clEmptyView, "clEmptyView");
                    clEmptyView.setVisibility(0);
                    NestedScrollView nsvContent = MeCollectionSummaryFragment.access$getBinding(MeCollectionSummaryFragment.this).nsvContent;
                    Intrinsics.checkNotNullExpressionValue(nsvContent, "nsvContent");
                    nsvContent.setVisibility(8);
                    return;
                }
                ConstraintLayout clEmptyView2 = MeCollectionSummaryFragment.access$getBinding(MeCollectionSummaryFragment.this).clEmptyView;
                Intrinsics.checkNotNullExpressionValue(clEmptyView2, "clEmptyView");
                clEmptyView2.setVisibility(8);
                NestedScrollView nsvContent2 = MeCollectionSummaryFragment.access$getBinding(MeCollectionSummaryFragment.this).nsvContent;
                Intrinsics.checkNotNullExpressionValue(nsvContent2, "nsvContent");
                nsvContent2.setVisibility(0);
                job = MeCollectionSummaryFragment.this.collectionRetrievingJob;
                if (job.isActive()) {
                    job2 = MeCollectionSummaryFragment.this.collectionRetrievingJob;
                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                }
                MeCollectionSummaryFragment meCollectionSummaryFragment2 = MeCollectionSummaryFragment.this;
                launch$default = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(meCollectionSummaryFragment2), null, null, new AnonymousClass1(MeCollectionSummaryFragment.this, null), 3, null);
                meCollectionSummaryFragment2.collectionRetrievingJob = launch$default;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: MeCollectionSummaryFragment.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
            @DebugMetadata(c = "com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$addSubscriptions$3$1", f = "MeCollectionSummaryFragment.kt", i = {}, l = {277}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$addSubscriptions$3$1, reason: invalid class name */
            /* loaded from: classes5.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ MeCollectionSummaryFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(MeCollectionSummaryFragment meCollectionSummaryFragment, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = meCollectionSummaryFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CollectionSummaryViewModel vm;
                    BestCollection bestCollection;
                    BestCollection bestCollection2;
                    List<BestCollection> bestCollections;
                    List<BestCollection> bestCollections2;
                    Object obj2;
                    List<BestCollection> bestCollections3;
                    Object obj3;
                    ArrayList arrayList;
                    CollectionSummaryViewModel vm2;
                    CollectionSummaryViewModel vm3;
                    ArrayList arrayList2;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        obj = CollectionRepository.INSTANCE.getCollectionsSummaryNew(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    Resource<GetCollectionsSummaryNewMessage> resource = (Resource) obj;
                    vm = this.this$0.getVm();
                    vm.setCollectionSummaryRes(resource);
                    if (resource.getStatus() == Status.SUCCESS) {
                        vm2 = this.this$0.getVm();
                        vm2.getIssuerCountrySummaries().clear();
                        vm3 = this.this$0.getVm();
                        List<CollectionCountrySummary> issuerCountrySummaries = vm3.getIssuerCountrySummaries();
                        GetCollectionsSummaryNewMessage data = resource.getData();
                        if (data == null || (arrayList2 = data.getIssuerCountrySummaries()) == null) {
                            arrayList2 = new ArrayList();
                        }
                        issuerCountrySummaries.addAll(arrayList2);
                    }
                    if (resource.getStatus() == Status.SUCCESS) {
                        GetCollectionsSummaryNewMessage data2 = resource.getData();
                        if (data2 == null || (arrayList = data2.getCompositionSummaries()) == null) {
                            arrayList = new ArrayList();
                        }
                        List<CollectionCompositionSummary> wrapData = CollectionMeltPriceCardView.INSTANCE.wrapData(arrayList);
                        CollectionMeltPriceCardView summaryMeltPriceCard = MeCollectionSummaryFragment.access$getBinding(this.this$0).summaryMeltPriceCard;
                        Intrinsics.checkNotNullExpressionValue(summaryMeltPriceCard, "summaryMeltPriceCard");
                        List<CollectionCompositionSummary> list = wrapData;
                        summaryMeltPriceCard.setVisibility(true ^ list.isEmpty() ? 0 : 8);
                        CollectionMeltPriceCardView collectionMeltPriceCardView = MeCollectionSummaryFragment.access$getBinding(this.this$0).summaryMeltPriceCard;
                        CollectionCompositionSummary[] collectionCompositionSummaryArr = (CollectionCompositionSummary[]) list.toArray(new CollectionCompositionSummary[0]);
                        collectionMeltPriceCardView.setMeltPrice((CollectionCompositionSummary[]) Arrays.copyOf(collectionCompositionSummaryArr, collectionCompositionSummaryArr.length));
                    } else {
                        CollectionMeltPriceCardView summaryMeltPriceCard2 = MeCollectionSummaryFragment.access$getBinding(this.this$0).summaryMeltPriceCard;
                        Intrinsics.checkNotNullExpressionValue(summaryMeltPriceCard2, "summaryMeltPriceCard");
                        summaryMeltPriceCard2.setVisibility(8);
                    }
                    BestCollection bestCollection3 = null;
                    if (resource.getStatus() == Status.SUCCESS) {
                        GetCollectionsSummaryNewMessage data3 = resource.getData();
                        List<CollectionCountrySummary> issuerCountrySummaries2 = data3 != null ? data3.getIssuerCountrySummaries() : null;
                        List<CollectionCountrySummary> list2 = issuerCountrySummaries2;
                        if (list2 == null || list2.isEmpty()) {
                            CollectionGeoDistributionCardView summaryGeoDistributionCard = MeCollectionSummaryFragment.access$getBinding(this.this$0).summaryGeoDistributionCard;
                            Intrinsics.checkNotNullExpressionValue(summaryGeoDistributionCard, "summaryGeoDistributionCard");
                            summaryGeoDistributionCard.setVisibility(8);
                        } else {
                            CollectionGeoDistributionCardView summaryGeoDistributionCard2 = MeCollectionSummaryFragment.access$getBinding(this.this$0).summaryGeoDistributionCard;
                            Intrinsics.checkNotNullExpressionValue(summaryGeoDistributionCard2, "summaryGeoDistributionCard");
                            summaryGeoDistributionCard2.setVisibility(0);
                            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.this$0), null, null, new C01241(this.this$0, issuerCountrySummaries2, null), 3, null);
                        }
                    } else {
                        CollectionGeoDistributionCardView summaryGeoDistributionCard3 = MeCollectionSummaryFragment.access$getBinding(this.this$0).summaryGeoDistributionCard;
                        Intrinsics.checkNotNullExpressionValue(summaryGeoDistributionCard3, "summaryGeoDistributionCard");
                        summaryGeoDistributionCard3.setVisibility(8);
                    }
                    if (resource.getStatus() == Status.SUCCESS) {
                        GetCollectionsSummaryNewMessage data4 = resource.getData();
                        if (data4 == null || (bestCollections3 = data4.getBestCollections()) == null) {
                            bestCollection = null;
                        } else {
                            Iterator<T> it = bestCollections3.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = it.next();
                                if (((BestCollection) obj3).getType() == BestCollectionType.MOST_VALUABLE) {
                                    break;
                                }
                            }
                            bestCollection = (BestCollection) obj3;
                        }
                        GetCollectionsSummaryNewMessage data5 = resource.getData();
                        if (data5 == null || (bestCollections2 = data5.getBestCollections()) == null) {
                            bestCollection2 = null;
                        } else {
                            Iterator<T> it2 = bestCollections2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it2.next();
                                if (((BestCollection) obj2).getType() == BestCollectionType.MOST_ANCIENT) {
                                    break;
                                }
                            }
                            bestCollection2 = (BestCollection) obj2;
                        }
                        GetCollectionsSummaryNewMessage data6 = resource.getData();
                        if (data6 != null && (bestCollections = data6.getBestCollections()) != null) {
                            Iterator<T> it3 = bestCollections.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Object next = it3.next();
                                if (((BestCollection) next).getType() == BestCollectionType.RAREST) {
                                    bestCollection3 = next;
                                    break;
                                }
                            }
                            bestCollection3 = bestCollection3;
                        }
                        List listOfNotNull = CollectionsKt.listOfNotNull((Object[]) new BestCollection[]{bestCollection, bestCollection2, bestCollection3});
                        if (listOfNotNull.isEmpty()) {
                            CollectionBestVarietiesCardView summaryBestVarietiesCard = MeCollectionSummaryFragment.access$getBinding(this.this$0).summaryBestVarietiesCard;
                            Intrinsics.checkNotNullExpressionValue(summaryBestVarietiesCard, "summaryBestVarietiesCard");
                            summaryBestVarietiesCard.setVisibility(8);
                        } else {
                            CollectionBestVarietiesCardView summaryBestVarietiesCard2 = MeCollectionSummaryFragment.access$getBinding(this.this$0).summaryBestVarietiesCard;
                            Intrinsics.checkNotNullExpressionValue(summaryBestVarietiesCard2, "summaryBestVarietiesCard");
                            summaryBestVarietiesCard2.setVisibility(0);
                            CollectionBestVarietiesCardView collectionBestVarietiesCardView = MeCollectionSummaryFragment.access$getBinding(this.this$0).summaryBestVarietiesCard;
                            BestCollection[] bestCollectionArr = (BestCollection[]) listOfNotNull.toArray(new BestCollection[0]);
                            collectionBestVarietiesCardView.setVarietiesModel((BestCollection[]) Arrays.copyOf(bestCollectionArr, bestCollectionArr.length));
                        }
                    } else {
                        CollectionBestVarietiesCardView summaryBestVarietiesCard3 = MeCollectionSummaryFragment.access$getBinding(this.this$0).summaryBestVarietiesCard;
                        Intrinsics.checkNotNullExpressionValue(summaryBestVarietiesCard3, "summaryBestVarietiesCard");
                        summaryBestVarietiesCard3.setVisibility(8);
                    }
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: MeCollectionSummaryFragment.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                @DebugMetadata(c = "com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$addSubscriptions$3$1$1", f = "MeCollectionSummaryFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$addSubscriptions$3$1$1, reason: invalid class name and collision with other inner class name */
                /* loaded from: classes5.dex */
                public static final class C01241 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ List<CollectionCountrySummary> $geoDistribution;
                    int label;
                    final /* synthetic */ MeCollectionSummaryFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C01241(MeCollectionSummaryFragment meCollectionSummaryFragment, List<CollectionCountrySummary> list, Continuation<? super C01241> continuation) {
                        super(2, continuation);
                        this.this$0 = meCollectionSummaryFragment;
                        this.$geoDistribution = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C01241(this.this$0, this.$geoDistribution, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C01241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        MeCollectionSummaryFragment.access$getBinding(this.this$0).summaryGeoDistributionCard.setIssuerCountrySummaries(this.$geoDistribution);
                        return Unit.INSTANCE;
                    }
                }
            }
        }));
        DBManager.INSTANCE.getSeriesItemDao().getAll().observe(meCollectionSummaryFragment, new MeCollectionSummaryFragment$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends SeriesItem>, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$addSubscriptions$4
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends SeriesItem> list) {
                invoke2((List<SeriesItem>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<SeriesItem> list) {
                SeriesItem findMostCollectedSeries;
                Long seriesId;
                CollectionBestOfficialSetCardView summaryBestOfficialSetCard = MeCollectionSummaryFragment.access$getBinding(MeCollectionSummaryFragment.this).summaryBestOfficialSetCard;
                Intrinsics.checkNotNullExpressionValue(summaryBestOfficialSetCard, "summaryBestOfficialSetCard");
                summaryBestOfficialSetCard.setVisibility(8);
                if (list == null || (findMostCollectedSeries = UserSeriesListExtKt.findMostCollectedSeries(list)) == null || (seriesId = findMostCollectedSeries.getSeriesId()) == null) {
                    return;
                }
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(MeCollectionSummaryFragment.this), null, null, new AnonymousClass1(seriesId.longValue(), MeCollectionSummaryFragment.this, findMostCollectedSeries, null), 3, null);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: MeCollectionSummaryFragment.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
            @DebugMetadata(c = "com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$addSubscriptions$4$1", f = "MeCollectionSummaryFragment.kt", i = {}, l = {339}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$addSubscriptions$4$1, reason: invalid class name */
            /* loaded from: classes5.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ SeriesItem $mostCollectedSeriesListItem;
                final /* synthetic */ long $seriesId;
                int label;
                final /* synthetic */ MeCollectionSummaryFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(long j, MeCollectionSummaryFragment meCollectionSummaryFragment, SeriesItem seriesItem, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$seriesId = j;
                    this.this$0 = meCollectionSummaryFragment;
                    this.$mostCollectedSeriesListItem = seriesItem;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$seriesId, this.this$0, this.$mostCollectedSeriesListItem, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    ArrayList emptyList;
                    List<UserSeriesDetail> seriesDetailList;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        obj = SeriesRepository.INSTANCE.getUserSeriesDetailBySeriesIdMessageSync(this.$seriesId, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    UserSeriesDetailItem userSeriesDetailItem = (UserSeriesDetailItem) obj;
                    if (userSeriesDetailItem == null || (seriesDetailList = userSeriesDetailItem.getSeriesDetailList()) == null) {
                        emptyList = CollectionsKt.emptyList();
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (UserSeriesDetail userSeriesDetail : seriesDetailList) {
                            CollectionsKt.addAll(arrayList, CollectionsKt.listOf((Object[]) new String[]{userSeriesDetail.getSubjectSideUrl(), userSeriesDetail.getDenominationUrl()}));
                        }
                        emptyList = arrayList;
                    }
                    CollectionBestOfficialSetCardView summaryBestOfficialSetCard = MeCollectionSummaryFragment.access$getBinding(this.this$0).summaryBestOfficialSetCard;
                    Intrinsics.checkNotNullExpressionValue(summaryBestOfficialSetCard, "summaryBestOfficialSetCard");
                    summaryBestOfficialSetCard.setVisibility(0);
                    MeCollectionSummaryFragment.access$getBinding(this.this$0).summaryBestOfficialSetCard.setOfficialSetInfo(this.$mostCollectedSeriesListItem, emptyList);
                    return Unit.INSTANCE;
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initData() {
        this.syncCollectionManager.observeSummary(this);
        this.syncCollectionManager.syncCollectionList(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMoreFeedbackDialog(SummarySectionType type) {
        if (isAdded()) {
            String lowerCase = type.getLogTag().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            logEvent(LogEvents.Me_Summary_Feedback_Click, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("type", lowerCase)));
            ContentFeedbackDialog contentFeedbackDialog = ContentFeedbackDialog.INSTANCE;
            Context context = getContext();
            if (context == null) {
                return;
            }
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            contentFeedbackDialog.openMeSummaryFeedbackDialog(context, parentFragmentManager, getPageName(), type.getLogTag());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void openGeoDistributionMapActivity$default(MeCollectionSummaryFragment meCollectionSummaryFragment, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        meCollectionSummaryFragment.openGeoDistributionMapActivity(str);
    }

    private final void openGeoDistributionMapActivity(String countryCode) {
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this, LogEvents.Me_Summary_Geodistribution_Click, null, 2, null);
        CollectionDistributionActivity.INSTANCE.start(getActivity(), getVm().getIssuerCountrySummaries(), countryCode);
    }
}
