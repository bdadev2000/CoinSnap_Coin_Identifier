package com.glority.android.picturexx.view.catalog;

import android.content.Context;
import android.net.Uri;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavController;
import androidx.profileinstaller.ProfileVerifier;
import com.glority.android.compose.extensions.UnitExtensionsKt;
import com.glority.android.compose.ui.ImageKt;
import com.glority.android.compose.ui.ResizableTextKt;
import com.glority.android.compose.utils.ComposeUtilsKt;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.theme.CoinColor;
import com.glority.android.picturexx.vm.CatalogViewModel;
import com.glority.android.picturexx.widget.CountrySearchBarKt;
import com.glority.android.picturexx.widget.CountrySearchBarState;
import com.glority.android.picturexx.widget.GlTableRowKt;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.routers.OpenBillingActivityRequest;
import com.glority.base.utils.NavigationAnimaUtils;
import com.glority.base.utils.StatusBarUtils;
import com.glority.base.viewmodel.AppViewModel;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.picturecoin.generatedAPI.kotlinAPI.series.CatalogInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CatalogPage.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a-\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0003¢\u0006\u0002\u0010\u000e\u001a\u0015\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"CatalogPage", "", "modifier", "Landroidx/compose/ui/Modifier;", "catalogViewModel", "Lcom/glority/android/picturexx/vm/CatalogViewModel;", "navController", "Landroidx/navigation/NavController;", "(Landroidx/compose/ui/Modifier;Lcom/glority/android/picturexx/vm/CatalogViewModel;Landroidx/navigation/NavController;Landroidx/compose/runtime/Composer;II)V", "CatalogItem", "catalogInfo", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/CatalogInfo;", "onClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lcom/picturecoin/generatedAPI/kotlinAPI/series/CatalogInfo;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "CatalogAndSeriesTab", "pagerState", "Landroidx/compose/foundation/pager/PagerState;", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/runtime/Composer;I)V", "businessMod_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CatalogPageKt {
    public static final void CatalogPage(Modifier modifier, CatalogViewModel catalogViewModel, final NavController navController, Composer composer, final int i, final int i2) {
        final CatalogViewModel catalogViewModel2;
        int i3;
        CreationExtras.Empty empty;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Composer startRestartGroup = composer.startRestartGroup(12506893);
        Modifier.Companion companion = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if ((i2 & 2) != 0) {
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
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CatalogViewModel.class), current, (String) null, (ViewModelProvider.Factory) null, empty, startRestartGroup, 0, 0);
            startRestartGroup.endReplaceableGroup();
            i3 = i & (-113);
            catalogViewModel2 = (CatalogViewModel) viewModel;
        } else {
            catalogViewModel2 = catalogViewModel;
            i3 = i;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(12506893, i3, -1, "com.glority.android.picturexx.view.catalog.CatalogPage (CatalogPage.kt:72)");
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Intrinsics.checkNotNull(consume, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        final FragmentActivity fragmentActivity = (FragmentActivity) consume;
        ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localFocusManager);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final FocusManager focusManager = (FocusManager) consume2;
        ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController = CompositionLocalsKt.getLocalSoftwareKeyboardController();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume3 = startRestartGroup.consume(localSoftwareKeyboardController);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) consume3;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new CountrySearchBarState(catalogViewModel2.getFilterCountryCode(), null, false, false, 12, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final CountrySearchBarState countrySearchBarState = (CountrySearchBarState) rememberedValue;
        final int windowSizeClassMapper = ComposeUtilsKt.windowSizeClassMapper(1, startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m4008constructorimpl = Updater.m4008constructorimpl(startRestartGroup);
        Updater.m4015setimpl(m4008constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        Modifier.Companion companion2 = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor2);
        } else {
            startRestartGroup.useNode();
        }
        Composer m4008constructorimpl2 = Updater.m4008constructorimpl(startRestartGroup);
        Updater.m4015setimpl(m4008constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        final Modifier modifier2 = companion;
        CountrySearchBarKt.CountrySearchBar(SizeKt.fillMaxWidth$default(PaddingKt.m987paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6997constructorimpl(16), 0.0f, 2, null), 0.0f, 1, null), countrySearchBarState, false, new Function1<Boolean, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogPageKt$CatalogPage$1$1$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                if (z) {
                    new LogEventRequest(LogEvents.catalog_search_click, null, 2, null).post();
                }
            }
        }, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogPageKt$CatalogPage$1$1$2
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                new LogEventRequest(LogEvents.catalog_flag_click, null, 2, null).post();
            }
        }, null, startRestartGroup, 27702, 36);
        float f = 12;
        DividerKt.m2393HorizontalDivider9IZ8Weo(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(10), 0.0f, 0.0f, 13, null), Dp.m6997constructorimpl(f), CoinColor.INSTANCE.m7867colorF2F2F2WaAFU9c(startRestartGroup, 6), startRestartGroup, 54, 0);
        Modifier m540backgroundbw27NRU$default = BackgroundKt.m540backgroundbw27NRU$default(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), CoinColor.INSTANCE.m7872surfaceColorWaAFU9c(startRestartGroup, 6), null, 2, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m540backgroundbw27NRU$default);
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor3);
        } else {
            startRestartGroup.useNode();
        }
        Composer m4008constructorimpl3 = Updater.m4008constructorimpl(startRestartGroup);
        Updater.m4015setimpl(m4008constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4015setimpl(m4008constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4008constructorimpl3.getInserting() || !Intrinsics.areEqual(m4008constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m4008constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4008constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        Updater.m4015setimpl(m4008constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        final CatalogViewModel catalogViewModel3 = catalogViewModel2;
        LazyGridDslKt.LazyVerticalGrid(new GridCells.Fixed(windowSizeClassMapper), null, null, PaddingKt.m978PaddingValues0680j_4(Dp.m6997constructorimpl(f)), false, Arrangement.INSTANCE.m865spacedBy0680j_4(Dp.m6997constructorimpl(f)), Arrangement.INSTANCE.m865spacedBy0680j_4(Dp.m6997constructorimpl(f)), null, false, new Function1<LazyGridScope, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogPageKt$CatalogPage$1$1$3$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LazyGridScope lazyGridScope) {
                invoke2(lazyGridScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LazyGridScope LazyVerticalGrid) {
                Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
                int size = CatalogViewModel.this.getDisplayCatalogList().size();
                final CatalogViewModel catalogViewModel4 = CatalogViewModel.this;
                final NavController navController2 = navController;
                final FragmentActivity fragmentActivity2 = fragmentActivity;
                LazyGridScope.items$default(LazyVerticalGrid, size, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1383388284, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogPageKt$CatalogPage$1$1$3$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer2, Integer num2) {
                        invoke(lazyGridItemScope, num.intValue(), composer2, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyGridItemScope items, int i4, Composer composer2, int i5) {
                        int i6;
                        Intrinsics.checkNotNullParameter(items, "$this$items");
                        if ((i5 & 14) == 0) {
                            i6 = (composer2.changed(items) ? 4 : 2) | i5;
                        } else {
                            i6 = i5;
                        }
                        if ((i5 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
                            i6 |= composer2.changed(i4) ? 32 : 16;
                        }
                        if ((i6 & 731) != 146 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1383388284, i6, -1, "com.glority.android.picturexx.view.catalog.CatalogPage.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CatalogPage.kt:113)");
                            }
                            final CatalogInfo catalogInfo = CatalogViewModel.this.getDisplayCatalogList().get(i4);
                            Modifier animateItemPlacement$default = LazyGridItemScope.animateItemPlacement$default(items, Modifier.INSTANCE, null, 1, null);
                            final NavController navController3 = navController2;
                            final FragmentActivity fragmentActivity3 = fragmentActivity2;
                            CatalogPageKt.CatalogItem(animateItemPlacement$default, catalogInfo, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogPageKt.CatalogPage.1.1.3.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    new LogEventRequest(LogEvents.catalog_period_click, BundleKt.bundleOf(TuplesKt.to("id", CatalogInfo.this.getCatelogUid()))).post();
                                    NavController navController4 = navController3;
                                    Uri parse = Uri.parse("coin://catalog/detail?uid=" + CatalogInfo.this.getCatelogUid());
                                    Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
                                    navController4.navigate(parse, NavigationAnimaUtils.INSTANCE.getSlideAnima(fragmentActivity3));
                                }
                            }, composer2, 64, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), 14, null);
                LazyGridScope.items$default(LazyVerticalGrid, windowSizeClassMapper, null, null, null, ComposableSingletons$CatalogPageKt.INSTANCE.m7878getLambda1$businessMod_release(), 14, null);
            }
        }, startRestartGroup, 1772544, 406);
        AnimatedContentKt.AnimatedContent(countrySearchBarState, null, null, null, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 2095175526, true, new Function4<AnimatedContentScope, CountrySearchBarState, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogPageKt$CatalogPage$1$1$3$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, CountrySearchBarState countrySearchBarState2, Composer composer2, Integer num) {
                invoke(animatedContentScope, countrySearchBarState2, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedContentScope AnimatedContent, CountrySearchBarState it, Composer composer2, int i4) {
                Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                Intrinsics.checkNotNullParameter(it, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2095175526, i4, -1, "com.glority.android.picturexx.view.catalog.CatalogPage.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CatalogPage.kt:132)");
                }
                if (it.isFocused()) {
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    String selectedCountry = CountrySearchBarState.this.getSelectedCountry();
                    String searchText = CountrySearchBarState.this.getSearchText();
                    final CatalogViewModel catalogViewModel4 = catalogViewModel3;
                    final CountrySearchBarState countrySearchBarState2 = CountrySearchBarState.this;
                    final FocusManager focusManager2 = focusManager;
                    final SoftwareKeyboardController softwareKeyboardController2 = softwareKeyboardController;
                    SelectedCountryViewKt.SelectedCountryView(companion3, selectedCountry, searchText, false, new Function1<String, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogPageKt$CatalogPage$1$1$3$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(String str) {
                            invoke2(str);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(String str) {
                            new LogEventRequest(LogEvents.catalog_country_click, BundleKt.bundleOf(TuplesKt.to(LogEventArguments.ARG_STRING_1, str))).post();
                            if (!Intrinsics.areEqual(str, AppViewModel.INSTANCE.getInstance().getCountryCode()) && !AppViewModel.INSTANCE.isVip()) {
                                new OpenBillingActivityRequest("catalog", "100052", null, 4, null).post();
                                return;
                            }
                            CatalogViewModel.this.setFilterCountryCode(str == null ? AppViewModel.INSTANCE.getInstance().getCountryCode() : str);
                            countrySearchBarState2.setSelectedCountry(str);
                            countrySearchBarState2.setFocused(false);
                            countrySearchBarState2.setSearchText(null);
                            focusManager2.clearFocus(true);
                            SoftwareKeyboardController softwareKeyboardController3 = softwareKeyboardController2;
                            if (softwareKeyboardController3 != null) {
                                softwareKeyboardController3.hide();
                            }
                        }
                    }, composer2, 6, 8);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), startRestartGroup, 1572870, 62);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        EffectsKt.LaunchedEffect(countrySearchBarState.getSelectedCountry(), new CatalogPageKt$CatalogPage$2(catalogViewModel3, countrySearchBarState, null), startRestartGroup, 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogPageKt$CatalogPage$3
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

                public final void invoke(Composer composer2, int i4) {
                    CatalogPageKt.CatalogPage(Modifier.this, catalogViewModel3, navController, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CatalogItem(Modifier modifier, final CatalogInfo catalogInfo, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Composer startRestartGroup = composer.startRestartGroup(-531745648);
        if ((i2 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-531745648, i, -1, "com.glority.android.picturexx.view.catalog.CatalogItem (CatalogPage.kt:169)");
        }
        CornerBasedShape extraSmall = MaterialTheme.INSTANCE.getShapes(startRestartGroup, MaterialTheme.$stable).getExtraSmall();
        Modifier m1016height3ABfNKs = SizeKt.m1016height3ABfNKs(modifier, Dp.m6997constructorimpl(TsExtractor.TS_STREAM_TYPE_HDMV_DTS));
        startRestartGroup.startReplaceableGroup(-1952258782);
        boolean changedInstance = startRestartGroup.changedInstance(function0);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogPageKt$CatalogItem$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    function0.invoke();
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        CardKt.Card(ClickableKt.m573clickableXHw0xAI$default(m1016height3ABfNKs, false, null, null, (Function0) rememberedValue, 7, null), extraSmall, null, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, -798806434, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogPageKt$CatalogItem$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                invoke(columnScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ColumnScope Card, Composer composer2, int i3) {
                Intrinsics.checkNotNullParameter(Card, "$this$Card");
                if ((i3 & 81) != 16 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-798806434, i3, -1, "com.glority.android.picturexx.view.catalog.CatalogItem.<anonymous> (CatalogPage.kt:177)");
                    }
                    CatalogInfo catalogInfo2 = CatalogInfo.this;
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m4008constructorimpl = Updater.m4008constructorimpl(composer2);
                    Updater.m4015setimpl(m4008constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ImageKt.GlImage(catalogInfo2.getHeadBackgroudUrl(), null, 0.0f, ContentScale.INSTANCE.getCrop(), 0.0f, null, null, null, null, null, composer2, 1575936, 950);
                    ImageKt.GlImage(catalogInfo2.getSubjectSideUrl(), OffsetKt.m945offsetVpY3zN4(boxScopeInstance.align(SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(100)), Alignment.INSTANCE.getBottomStart()), Dp.m6997constructorimpl(-30), Dp.m6997constructorimpl(20)), 0.0f, null, 0.0f, null, null, null, null, null, composer2, 0, 1020);
                    ImageKt.GlImage(catalogInfo2.getDenominationSideUrl(), OffsetKt.m946offsetVpY3zN4$default(boxScopeInstance.align(SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(TsExtractor.TS_STREAM_TYPE_HDMV_DTS)), Alignment.INSTANCE.getTopEnd()), Dp.m6997constructorimpl(65), 0.0f, 2, null), 0.0f, null, 0.0f, null, null, null, null, null, composer2, 0, 1020);
                    Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(PaddingKt.m987paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6997constructorimpl(75), 0.0f, 2, null), 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, Alignment.INSTANCE.getStart(), composer2, 6);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, fillMaxHeight$default);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer m4008constructorimpl2 = Updater.m4008constructorimpl(composer2);
                    Updater.m4015setimpl(m4008constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    ResizableTextKt.m7716ResizableText4IGK_g(catalogInfo2.getName(), null, Color.INSTANCE.m4552getWhite0d7_KjU(), TextUnitKt.getSp(18), null, new FontWeight(700), null, 0L, null, null, 0L, 0, false, 2, 0, null, 0, composer2, 200064, 3072, 122834);
                    TextKt.m3014Text4IGK_g(catalogInfo2.getTimeRange(), PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(4), 0.0f, 0.0f, 13, null), Color.INSTANCE.m4552getWhite0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, new FontWeight(500), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 200112, 0, 131024);
                    Modifier m986paddingVpY3zN4 = PaddingKt.m986paddingVpY3zN4(BackgroundKt.m539backgroundbw27NRU(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(12), 0.0f, 0.0f, 13, null), CoinColor.INSTANCE.m7875whiteWaAFU9c(composer2, 6), MaterialTheme.INSTANCE.getShapes(composer2, MaterialTheme.$stable).getExtraSmall()), Dp.m6997constructorimpl(10), Dp.m6997constructorimpl(2));
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, m986paddingVpY3zN4);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer m4008constructorimpl3 = Updater.m4008constructorimpl(composer2);
                    Updater.m4015setimpl(m4008constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4015setimpl(m4008constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4008constructorimpl3.getInserting() || !Intrinsics.areEqual(m4008constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        m4008constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m4008constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m4015setimpl(m4008constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    TextKt.m3014Text4IGK_g(catalogInfo2.getCount() + " " + UnitExtensionsKt.getSr(R.string.me_collection_series_content, composer2, 0), PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6997constructorimpl(5), 0.0f, 0.0f, 0.0f, 14, null), CoinColor.INSTANCE.m7866blackWaAFU9c(composer2, 6), TextUnitKt.getSp(14), (FontStyle) null, new FontWeight(500), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199728, 0, 131024);
                    IconKt.m2470Iconww6aTOc(UnitExtensionsKt.getPr(R.drawable.ic_gl_right_arrow, composer2, 0), (String) null, SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(14)), CoinColor.INSTANCE.m7866blackWaAFU9c(composer2, 6), composer2, 440, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier2 = modifier;
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogPageKt$CatalogItem$3
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

                public final void invoke(Composer composer2, int i3) {
                    CatalogPageKt.CatalogItem(Modifier.this, catalogInfo, function0, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static final void CatalogAndSeriesTab(final PagerState pagerState, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        Composer startRestartGroup = composer.startRestartGroup(-1961758420);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(pagerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1961758420, i2, -1, "com.glority.android.picturexx.view.catalog.CatalogAndSeriesTab (CatalogPage.kt:245)");
            }
            ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController = CompositionLocalsKt.getLocalSoftwareKeyboardController();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localSoftwareKeyboardController);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float f = 16;
            GlTableRowKt.GlTabRow(pagerState.getCurrentPage(), CollectionsKt.listOf((Object[]) new String[]{UnitExtensionsKt.getRs(R.string.global_caption_catalog, startRestartGroup, 0), UnitExtensionsKt.getRs(R.string.global_caption_officialseries, startRestartGroup, 0)}), MaterialTheme.INSTANCE.getShapes(startRestartGroup, MaterialTheme.$stable).getExtraSmall(), SizeKt.fillMaxWidth$default(PaddingKt.m989paddingqDBjuR0$default(WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE), Dp.m6997constructorimpl(f), Dp.m6997constructorimpl(8), Dp.m6997constructorimpl(f), 0.0f, 8, null), 0.0f, 1, null), new Function1<Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogPageKt$CatalogAndSeriesTab$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i3) {
                    SoftwareKeyboardController softwareKeyboardController2 = SoftwareKeyboardController.this;
                    if (softwareKeyboardController2 != null) {
                        softwareKeyboardController2.hide();
                    }
                    if (i3 == 0) {
                        new LogEventRequest(LogEvents.catalogtab_catalog_click, null, 2, null).post();
                    } else {
                        new LogEventRequest(LogEvents.catalogtab_series_click, null, 2, null).post();
                    }
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(pagerState, i3, null), 3, null);
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: CatalogPage.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                @DebugMetadata(c = "com.glority.android.picturexx.view.catalog.CatalogPageKt$CatalogAndSeriesTab$1$1", f = "CatalogPage.kt", i = {}, l = {267}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.glority.android.picturexx.view.catalog.CatalogPageKt$CatalogAndSeriesTab$1$1, reason: invalid class name */
                /* loaded from: classes5.dex */
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ int $it;
                    final /* synthetic */ PagerState $pagerState;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(PagerState pagerState, int i, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$pagerState = pagerState;
                        this.$it = i;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass1(this.$pagerState, this.$it, continuation);
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
                            this.label = 1;
                            if (PagerState.animateScrollToPage$default(this.$pagerState, this.$it, 0.0f, null, this, 6, null) == coroutine_suspended) {
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
                }
            }, startRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogPageKt$CatalogAndSeriesTab$2
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

                public final void invoke(Composer composer2, int i3) {
                    CatalogPageKt.CatalogAndSeriesTab(PagerState.this, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
