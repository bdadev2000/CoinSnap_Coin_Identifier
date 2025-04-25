package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import com.glority.base.utils.StatusBarUtils;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: NavBackStackEntryProvider.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0002\u0010\b\u001a$\u0010\t\u001a\u00020\u0001*\u00020\u00042\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"LocalOwnersProvider", "", "Landroidx/navigation/NavBackStackEntry;", "saveableStateHolder", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/saveable/SaveableStateHolder;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SaveableStateProvider", "(Landroidx/compose/runtime/saveable/SaveableStateHolder;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class NavBackStackEntryProviderKt {
    public static final void LocalOwnersProvider(final NavBackStackEntry navBackStackEntry, final SaveableStateHolder saveableStateHolder, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1579360880);
        ComposerKt.sourceInformation(startRestartGroup, "C(LocalOwnersProvider)P(1)50@2072L66,46@1898L240:NavBackStackEntryProvider.kt#opm8kd");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(navBackStackEntry) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(saveableStateHolder) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1579360880, i2, -1, "androidx.navigation.compose.LocalOwnersProvider (NavBackStackEntryProvider.kt:45)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalViewModelStoreOwner.INSTANCE.provides(navBackStackEntry), LocalLifecycleOwnerKt.getLocalLifecycleOwner().provides(navBackStackEntry), AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner().provides(navBackStackEntry)}, ComposableLambdaKt.rememberComposableLambda(-52928304, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavBackStackEntryProviderKt$LocalOwnersProvider$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    ComposerKt.sourceInformation(composer2, "C51@2102L30:NavBackStackEntryProvider.kt#opm8kd");
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-52928304, i3, -1, "androidx.navigation.compose.LocalOwnersProvider.<anonymous> (NavBackStackEntryProvider.kt:51)");
                    }
                    NavBackStackEntryProviderKt.SaveableStateProvider(SaveableStateHolder.this, function2, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavBackStackEntryProviderKt$LocalOwnersProvider$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    NavBackStackEntryProviderKt.LocalOwnersProvider(NavBackStackEntry.this, saveableStateHolder, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SaveableStateProvider(final SaveableStateHolder saveableStateHolder, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        CreationExtras.Empty empty;
        Composer startRestartGroup = composer.startRestartGroup(1211832233);
        ComposerKt.sourceInformation(startRestartGroup, "C(SaveableStateProvider)57@2263L38,64@2776L44:NavBackStackEntryProvider.kt#opm8kd");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(saveableStateHolder) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1211832233, i3, -1, "androidx.navigation.compose.SaveableStateProvider (NavBackStackEntryProvider.kt:56)");
            }
            startRestartGroup.startReplaceableGroup(1729797275);
            ComposerKt.sourceInformation(startRestartGroup, "CC(viewModel)P(3,2,1)*54@2502L7,64@2877L63:ViewModel.kt#3tja67");
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                empty = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                empty = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(BackStackEntryIdViewModel.class), current, (String) null, (ViewModelProvider.Factory) null, empty, startRestartGroup, 0, 0);
            startRestartGroup.endReplaceableGroup();
            BackStackEntryIdViewModel backStackEntryIdViewModel = (BackStackEntryIdViewModel) viewModel;
            backStackEntryIdViewModel.setSaveableStateHolderRef(new WeakReference<>(saveableStateHolder));
            saveableStateHolder.SaveableStateProvider(backStackEntryIdViewModel.getId(), function2, startRestartGroup, (i3 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | ((i3 << 6) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavBackStackEntryProviderKt$SaveableStateProvider$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    NavBackStackEntryProviderKt.SaveableStateProvider(SaveableStateHolder.this, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
