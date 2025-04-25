package com.glority.android.picturexx.view.catalog;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.FragmentKt;
import com.glority.android.compose.base.fragment.ComposeBaseFragment;
import com.glority.android.picturexx.vm.CatalogViewModel;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: CatalogDetailFragment.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0014R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/glority/android/picturexx/view/catalog/CatalogDetailFragment;", "Lcom/glority/android/compose/base/fragment/ComposeBaseFragment;", "<init>", "()V", "catalogViewModel", "Lcom/glority/android/picturexx/vm/CatalogViewModel;", "getCatalogViewModel", "()Lcom/glority/android/picturexx/vm/CatalogViewModel;", "catalogViewModel$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "getLogPageName", "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CatalogDetailFragment extends ComposeBaseFragment {
    public static final int $stable = 8;

    /* renamed from: catalogViewModel$delegate, reason: from kotlin metadata */
    private final Lazy catalogViewModel;

    public CatalogDetailFragment() {
        final CatalogDetailFragment catalogDetailFragment = this;
        final Function0 function0 = null;
        this.catalogViewModel = FragmentViewModelLazyKt.createViewModelLazy(catalogDetailFragment, Reflection.getOrCreateKotlinClass(CatalogViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = catalogDetailFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragment$special$$inlined$activityViewModels$default$3
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

    public final CatalogViewModel getCatalogViewModel() {
        return (CatalogViewModel) this.catalogViewModel.getValue();
    }

    @Override // com.glority.android.compose.base.fragment.ComposeBaseFragment
    public void ComposeContent(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1183636973);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1183636973, i, -1, "com.glority.android.picturexx.view.catalog.CatalogDetailFragment.ComposeContent (CatalogDetailFragment.kt:13)");
        }
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(Args.uid) : null;
        if (string == null) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        } else {
            CatalogDetailFragmentViewKt.CatalogDetailFragmentView(getCatalogViewModel(), string, FragmentKt.findNavController(this), startRestartGroup, 520);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragment$ComposeContent$1
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
                    CatalogDetailFragment.this.ComposeContent(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @Override // com.glority.android.compose.base.fragment.ComposeBaseFragment
    protected String getLogPageName() {
        return LogEvents.catalogdetail;
    }
}
