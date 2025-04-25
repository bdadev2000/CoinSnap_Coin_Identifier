package com.glority.android.picturexx.view.catalog;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.FragmentKt;
import com.glority.android.compose.base.fragment.ComposeBaseFragment;
import com.glority.android.picturexx.GlobalLiveBus;
import com.glority.android.picturexx.vm.CatalogViewModel;
import com.glority.android.picturexx.vm.SeriesViewModel;
import com.glority.android.xx.constants.LogEvents;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: CatalogFragment.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\r\u0010\u0013\u001a\u00020\u0010H\u0017¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/glority/android/picturexx/view/catalog/CatalogFragment;", "Lcom/glority/android/compose/base/fragment/ComposeBaseFragment;", "<init>", "()V", "catalogViewModel", "Lcom/glority/android/picturexx/vm/CatalogViewModel;", "getCatalogViewModel", "()Lcom/glority/android/picturexx/vm/CatalogViewModel;", "catalogViewModel$delegate", "Lkotlin/Lazy;", "seriesViewModel", "Lcom/glority/android/picturexx/vm/SeriesViewModel;", "getSeriesViewModel", "()Lcom/glority/android/picturexx/vm/SeriesViewModel;", "seriesViewModel$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "getLogPageName", "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CatalogFragment extends ComposeBaseFragment {
    public static final int $stable = 8;

    /* renamed from: catalogViewModel$delegate, reason: from kotlin metadata */
    private final Lazy catalogViewModel;

    /* renamed from: seriesViewModel$delegate, reason: from kotlin metadata */
    private final Lazy seriesViewModel;

    public CatalogFragment() {
        final CatalogFragment catalogFragment = this;
        final Function0 function0 = null;
        this.catalogViewModel = FragmentViewModelLazyKt.createViewModelLazy(catalogFragment, Reflection.getOrCreateKotlinClass(CatalogViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.catalog.CatalogFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.catalog.CatalogFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = catalogFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.catalog.CatalogFragment$special$$inlined$activityViewModels$default$3
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
        this.seriesViewModel = FragmentViewModelLazyKt.createViewModelLazy(catalogFragment, Reflection.getOrCreateKotlinClass(SeriesViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.catalog.CatalogFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.catalog.CatalogFragment$special$$inlined$activityViewModels$default$5
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
                CreationExtras defaultViewModelCreationExtras = catalogFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.catalog.CatalogFragment$special$$inlined$activityViewModels$default$6
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

    private final CatalogViewModel getCatalogViewModel() {
        return (CatalogViewModel) this.catalogViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SeriesViewModel getSeriesViewModel() {
        return (SeriesViewModel) this.seriesViewModel.getValue();
    }

    @Override // com.glority.android.compose.base.fragment.ComposeBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GlobalLiveBus.INSTANCE.getCollectionCountChanged().observe(this, new CatalogFragment$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogFragment$onCreate$1
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
                SeriesViewModel seriesViewModel;
                seriesViewModel = CatalogFragment.this.getSeriesViewModel();
                seriesViewModel.getUserSeriesListMessage();
            }
        }));
        getSeriesViewModel().fetchRecommendSeriesListMessage();
    }

    @Override // com.glority.android.compose.base.fragment.ComposeBaseFragment
    public void ComposeContent(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1391205941);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1391205941, i, -1, "com.glority.android.picturexx.view.catalog.CatalogFragment.ComposeContent (CatalogFragment.kt:25)");
        }
        CatalogFragmentViewKt.CatalogFragmentView(getCatalogViewModel(), getSeriesViewModel(), FragmentKt.findNavController(this), startRestartGroup, 584, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogFragment$ComposeContent$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    CatalogFragment.this.ComposeContent(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @Override // com.glority.android.compose.base.fragment.ComposeBaseFragment
    protected String getLogPageName() {
        return LogEvents.catalogv2;
    }
}
