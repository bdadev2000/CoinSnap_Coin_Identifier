package com.glority.android.picturexx.view.catalog;

import android.app.Activity;
import android.content.Context;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TabPosition;
import androidx.compose.material3.TabRowDefaults;
import androidx.compose.material3.TabRowKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintSetRef;
import androidx.constraintlayout.compose.ConstraintSetScope;
import androidx.constraintlayout.compose.DebugFlags;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.InvalidationStrategy;
import androidx.constraintlayout.compose.MotionLayoutKt;
import androidx.constraintlayout.compose.MotionLayoutScope;
import androidx.constraintlayout.compose.MotionScene;
import androidx.constraintlayout.compose.MotionSceneScope;
import androidx.constraintlayout.compose.MotionSceneScopeKt;
import androidx.constraintlayout.compose.TransitionScope;
import androidx.constraintlayout.compose.VerticalAnchorable;
import androidx.core.os.BundleKt;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.glority.android.cmsui2.util.CmsDataUtils;
import com.glority.android.compose.extensions.UnitExtensionsKt;
import com.glority.android.compose.ui.ResizableTextKt;
import com.glority.android.compose.utils.ComposeUtilsKt;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.theme.CoinColor;
import com.glority.android.picturexx.view.search.SearchCmsDetailFragment;
import com.glority.android.picturexx.vm.CatalogViewModel;
import com.glority.android.picturexx.widget.CoinLoadingKt;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.utils.StatusBarUtils;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.picturecoin.generatedAPI.kotlinAPI.series.CatalogCoin;
import com.picturecoin.generatedAPI.kotlinAPI.series.CatalogDetailMessage;
import com.picturecoin.generatedAPI.kotlinAPI.series.CatalogInfo;
import java.util.List;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CatalogDetailFragmentView.kt */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n\u001a#\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0003¢\u0006\u0002\u0010\u0010\u001a\u001f\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010\u0016\u001a@\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00152!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00010\u001aH\u0007¢\u0006\u0002\u0010\u001f\u001a=\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0007¢\u0006\u0004\b'\u0010(¨\u0006)²\u0006\u0010\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00180+X\u008a\u008e\u0002²\u0006\n\u0010,\u001a\u00020\u001bX\u008a\u008e\u0002"}, d2 = {"CatalogDetailFragmentView", "", "catalogViewModel", "Lcom/glority/android/picturexx/vm/CatalogViewModel;", "catalogUid", "", "navController", "Landroidx/navigation/NavController;", "(Lcom/glority/android/picturexx/vm/CatalogViewModel;Ljava/lang/String;Landroidx/navigation/NavController;Landroidx/compose/runtime/Composer;I)V", "EmptyItem", "(Landroidx/compose/runtime/Composer;I)V", "CatalogItem", "item", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/CatalogCoin;", "onClick", "Lkotlin/Function0;", "(Lcom/picturecoin/generatedAPI/kotlinAPI/series/CatalogCoin;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Description", "detail", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/CatalogInfo;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/picturecoin/generatedAPI/kotlinAPI/series/CatalogInfo;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TypeTabRow", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/CatalogDetailMessage;", "onSelectedIndex", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "index", "(Lcom/picturecoin/generatedAPI/kotlinAPI/series/CatalogDetailMessage;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "CollapsingToolbarLayout", "maxHeight", "Landroidx/compose/ui/unit/Dp;", "minHeight", "progress", "", "onBackClick", "CollapsingToolbarLayout-pBklqvs", "(FFFLcom/picturecoin/generatedAPI/kotlinAPI/series/CatalogInfo;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "businessMod_release", "catalogDetailData", "Lcom/glority/network/model/Resource;", "selectedTabIndex"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CatalogDetailFragmentViewKt {
    public static final void CatalogDetailFragmentView(final CatalogViewModel catalogViewModel, final String catalogUid, final NavController navController, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(catalogViewModel, "catalogViewModel");
        Intrinsics.checkNotNullParameter(catalogUid, "catalogUid");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Composer startRestartGroup = composer.startRestartGroup(-412148097);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-412148097, i, -1, "com.glority.android.picturexx.view.catalog.CatalogDetailFragmentView (CatalogDetailFragmentView.kt:99)");
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Resource.INSTANCE.loading(null), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final MutableState mutableState = (MutableState) rememberedValue;
        final PagerState rememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, new Function0<Integer>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CatalogDetailFragmentView$pagerState$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return 3;
            }
        }, startRestartGroup, 384, 3);
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Intrinsics.checkNotNull(consume, "null cannot be cast to non-null type android.app.Activity");
        final Activity activity = (Activity) consume;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
            startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue2 = compositionScopedCoroutineScopeCanceller;
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final float m6997constructorimpl = Dp.m6997constructorimpl(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
        final float m6997constructorimpl2 = Dp.m6997constructorimpl(56);
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final float mo671roundToPx0680j_4 = ((Density) consume2).mo671roundToPx0680j_4(m6997constructorimpl);
        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume3 = startRestartGroup.consume(localDensity2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final float mo671roundToPx0680j_42 = ((Density) consume3).mo671roundToPx0680j_4(m6997constructorimpl2);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(mo671roundToPx0680j_4), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final MutableState mutableState2 = (MutableState) rememberedValue3;
        LazyGridState rememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, startRestartGroup, 0, 3);
        LazyGridState rememberLazyGridState2 = LazyGridStateKt.rememberLazyGridState(0, 0, startRestartGroup, 0, 3);
        LazyGridState rememberLazyGridState3 = LazyGridStateKt.rememberLazyGridState(0, 0, startRestartGroup, 0, 3);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = CollectionsKt.listOf((Object[]) new LazyGridState[]{rememberLazyGridState, rememberLazyGridState2, rememberLazyGridState3});
            startRestartGroup.updateRememberedValue(rememberedValue4);
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final List list = (List) rememberedValue4;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new NestedScrollConnection() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CatalogDetailFragmentView$nestedScrollConnection$1$1
                @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
                /* renamed from: onPreScroll-OzD1aCk */
                public long mo1061onPreScrollOzD1aCk(long available, int source) {
                    float floatValue = mutableState2.getValue().floatValue();
                    float m4275getYimpl = Offset.m4275getYimpl(available) + floatValue;
                    float f = mo671roundToPx0680j_4;
                    if (m4275getYimpl > f) {
                        mutableState2.setValue(Float.valueOf(f));
                        return OffsetKt.Offset(0.0f, mo671roundToPx0680j_4 - floatValue);
                    }
                    float m4275getYimpl2 = Offset.m4275getYimpl(available) + floatValue;
                    float f2 = mo671roundToPx0680j_42;
                    if (m4275getYimpl2 < f2) {
                        mutableState2.setValue(Float.valueOf(f2));
                        return OffsetKt.Offset(0.0f, mo671roundToPx0680j_42 - floatValue);
                    }
                    LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt.firstOrNull((List) list.get(rememberPagerState.getCurrentPage()).getLayoutInfo().getVisibleItemsInfo());
                    if (lazyGridItemInfo != null && IntOffset.m7126getYimpl(lazyGridItemInfo.getOffset()) < 0) {
                        return OffsetKt.Offset(0.0f, 0.0f);
                    }
                    MutableState<Float> mutableState3 = mutableState2;
                    mutableState3.setValue(Float.valueOf(mutableState3.getValue().floatValue() + Offset.m4275getYimpl(available)));
                    return OffsetKt.Offset(0.0f, Offset.m4275getYimpl(available));
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue5);
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final CatalogDetailFragmentViewKt$CatalogDetailFragmentView$nestedScrollConnection$1$1 catalogDetailFragmentViewKt$CatalogDetailFragmentView$nestedScrollConnection$1$1 = (CatalogDetailFragmentViewKt$CatalogDetailFragmentView$nestedScrollConnection$1$1) rememberedValue5;
        final float floatValue = 1 - ((((Number) mutableState2.getValue()).floatValue() - mo671roundToPx0680j_42) / (mo671roundToPx0680j_4 - mo671roundToPx0680j_42));
        AnimatedContentKt.AnimatedContent(CatalogDetailFragmentView$lambda$1(mutableState).getStatus(), BackgroundKt.m540backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), CoinColor.INSTANCE.m7875whiteWaAFU9c(startRestartGroup, 6), null, 2, null), null, null, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, -440995766, true, new Function4<AnimatedContentScope, Status, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CatalogDetailFragmentView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Status status, Composer composer2, Integer num) {
                invoke(animatedContentScope, status, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedContentScope AnimatedContent, Status it, Composer composer2, int i2) {
                Resource CatalogDetailFragmentView$lambda$1;
                Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                Intrinsics.checkNotNullParameter(it, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-440995766, i2, -1, "com.glority.android.picturexx.view.catalog.CatalogDetailFragmentView.<anonymous> (CatalogDetailFragmentView.kt:149)");
                }
                if (it == Status.LOADING) {
                    composer2.startReplaceableGroup(-1775003428);
                    CoinLoadingKt.CoinLoading(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, 6);
                    composer2.endReplaceableGroup();
                } else if (it == Status.SUCCESS) {
                    composer2.startReplaceableGroup(-1775003350);
                    CatalogDetailFragmentView$lambda$1 = CatalogDetailFragmentViewKt.CatalogDetailFragmentView$lambda$1(mutableState);
                    final CatalogDetailMessage catalogDetailMessage = (CatalogDetailMessage) CatalogDetailFragmentView$lambda$1.getData();
                    if (catalogDetailMessage == null) {
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    float f = m6997constructorimpl;
                    float f2 = m6997constructorimpl2;
                    float f3 = floatValue;
                    final PagerState pagerState = rememberPagerState;
                    final NavController navController2 = navController;
                    final CoroutineScope coroutineScope2 = coroutineScope;
                    final List<LazyGridState> list2 = list;
                    final CatalogDetailFragmentViewKt$CatalogDetailFragmentView$nestedScrollConnection$1$1 catalogDetailFragmentViewKt$CatalogDetailFragmentView$nestedScrollConnection$1$12 = catalogDetailFragmentViewKt$CatalogDetailFragmentView$nestedScrollConnection$1$1;
                    final String str = catalogUid;
                    final Activity activity2 = activity;
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
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
                    Updater.m4015setimpl(m4008constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    CatalogDetailFragmentViewKt.m7876CollapsingToolbarLayoutpBklqvs(f, f2, f3, catalogDetailMessage.getDetail(), new Function0<Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CatalogDetailFragmentView$1$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
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
                            NavController.this.navigateUp();
                        }
                    }, composer2, 4150);
                    CatalogDetailFragmentViewKt.Description(catalogDetailMessage.getDetail(), PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(6), 0.0f, Dp.m6997constructorimpl(30), 5, null), composer2, 56, 0);
                    CatalogDetailFragmentViewKt.TypeTabRow(catalogDetailMessage, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), new Function1<Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CatalogDetailFragmentView$1$1$2
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
                            if (i3 == 0) {
                                new LogEventRequest(LogEvents.catalogdetail_circulation_click, null, 2, null).post();
                            } else if (i3 == 1) {
                                new LogEventRequest(LogEvents.catalogdetail_commemorotive_click, null, 2, null).post();
                            } else if (i3 == 2) {
                                new LogEventRequest(LogEvents.catalogdetail_collector_click, null, 2, null).post();
                            }
                            BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass1(pagerState, i3, null), 3, null);
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* compiled from: CatalogDetailFragmentView.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                        @DebugMetadata(c = "com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CatalogDetailFragmentView$1$1$2$1", f = "CatalogDetailFragmentView.kt", i = {}, l = {TsExtractor.TS_STREAM_TYPE_AC4}, m = "invokeSuspend", n = {}, s = {})
                        /* renamed from: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CatalogDetailFragmentView$1$1$2$1, reason: invalid class name */
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
                    }, composer2, 56);
                    PagerKt.m1222HorizontalPageroI3XNZo(pagerState, ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, ComposableLambdaKt.composableLambda(composer2, -1916471578, true, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CatalogDetailFragmentView$1$1$3
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(4);
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer3, Integer num2) {
                            invoke(pagerScope, num.intValue(), composer3, num2.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PagerScope HorizontalPager, int i3, Composer composer3, int i4) {
                            final List<CatalogCoin> circulationList;
                            Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1916471578, i4, -1, "com.glority.android.picturexx.view.catalog.CatalogDetailFragmentView.<anonymous>.<anonymous>.<anonymous> (CatalogDetailFragmentView.kt:178)");
                            }
                            if (i3 == 0) {
                                circulationList = CatalogDetailMessage.this.getCirculationList();
                            } else if (i3 == 1) {
                                circulationList = CatalogDetailMessage.this.getCommemorotiveList();
                            } else if (i3 == 2) {
                                circulationList = CatalogDetailMessage.this.getCollectorList();
                            } else {
                                circulationList = CollectionsKt.emptyList();
                            }
                            if (circulationList.isEmpty()) {
                                composer3.startReplaceableGroup(-1328273917);
                                CatalogDetailFragmentViewKt.EmptyItem(composer3, 0);
                                composer3.endReplaceableGroup();
                            } else {
                                composer3.startReplaceableGroup(-1328273852);
                                LazyGridState lazyGridState = list2.get(i3);
                                GridCells.Fixed fixed = new GridCells.Fixed(ComposeUtilsKt.windowSizeClassMapper(1, composer3, 6));
                                float f4 = 12;
                                PaddingValues m979PaddingValuesYgX7TsA = PaddingKt.m979PaddingValuesYgX7TsA(Dp.m6997constructorimpl(16), Dp.m6997constructorimpl(f4));
                                Arrangement.HorizontalOrVertical m865spacedBy0680j_4 = Arrangement.INSTANCE.m865spacedBy0680j_4(Dp.m6997constructorimpl(f4));
                                Arrangement.HorizontalOrVertical m865spacedBy0680j_42 = Arrangement.INSTANCE.m865spacedBy0680j_4(Dp.m6997constructorimpl(f4));
                                final String str2 = str;
                                final Activity activity3 = activity2;
                                LazyGridDslKt.LazyVerticalGrid(fixed, SizeKt.fillMaxSize$default(NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, catalogDetailFragmentViewKt$CatalogDetailFragmentView$nestedScrollConnection$1$12, null, 2, null), 0.0f, 1, null), lazyGridState, m979PaddingValuesYgX7TsA, false, m865spacedBy0680j_4, m865spacedBy0680j_42, null, false, new Function1<LazyGridScope, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CatalogDetailFragmentView$1$1$3.1
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
                                        int size = circulationList.size();
                                        final List<CatalogCoin> list3 = circulationList;
                                        final String str3 = str2;
                                        final Activity activity4 = activity3;
                                        LazyGridScope.items$default(LazyVerticalGrid, size, null, null, null, ComposableLambdaKt.composableLambdaInstance(1017160511, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt.CatalogDetailFragmentView.1.1.3.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer4, Integer num2) {
                                                invoke(lazyGridItemScope, num.intValue(), composer4, num2.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(LazyGridItemScope items, int i5, Composer composer4, int i6) {
                                                Intrinsics.checkNotNullParameter(items, "$this$items");
                                                if ((i6 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
                                                    i6 |= composer4.changed(i5) ? 32 : 16;
                                                }
                                                if ((i6 & 721) != 144 || !composer4.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1017160511, i6, -1, "com.glority.android.picturexx.view.catalog.CatalogDetailFragmentView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CatalogDetailFragmentView.kt:198)");
                                                    }
                                                    final CatalogCoin catalogCoin = list3.get(i5);
                                                    final String str4 = str3;
                                                    final Activity activity5 = activity4;
                                                    CatalogDetailFragmentViewKt.CatalogItem(catalogCoin, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt.CatalogDetailFragmentView.1.1.3.1.1.1
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
                                                            new LogEventRequest(LogEvents.catalogdetail_item_click, BundleKt.bundleOf(TuplesKt.to(LogEventArguments.ARG_STRING_1, CatalogCoin.this.getUid()), TuplesKt.to("id", str4))).post();
                                                            SearchCmsDetailFragment.INSTANCE.openByUid(activity5, CatalogCoin.this.getUid(), (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : LogEvents.catalogdetail, (r18 & 16) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null);
                                                        }
                                                    }, composer4, 8);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }), 14, null);
                                    }
                                }, composer3, 1772544, 400);
                                composer3.endReplaceableGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, 100663296, 3072, 7932);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(-1775000078);
                    composer2.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), startRestartGroup, 1572864, 60);
        EffectsKt.LaunchedEffect(catalogUid, new CatalogDetailFragmentViewKt$CatalogDetailFragmentView$2(catalogViewModel, catalogUid, mutableState, null), startRestartGroup, ((i >> 3) & 14) | 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CatalogDetailFragmentView$3
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
                    CatalogDetailFragmentViewKt.CatalogDetailFragmentView(CatalogViewModel.this, catalogUid, navController, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EmptyItem(Composer composer, final int i) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(2052217959);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2052217959, i, -1, "com.glority.android.picturexx.view.catalog.EmptyItem (CatalogDetailFragmentView.kt:231)");
            }
            float f = 16;
            Modifier m989paddingqDBjuR0$default = PaddingKt.m989paddingqDBjuR0$default(BackgroundKt.m540backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), CoinColor.INSTANCE.m7872surfaceColorWaAFU9c(startRestartGroup, 6), null, 2, null), Dp.m6997constructorimpl(f), Dp.m6997constructorimpl(50), Dp.m6997constructorimpl(f), 0.0f, 8, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m989paddingqDBjuR0$default);
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
            Updater.m4015setimpl(m4008constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ImageKt.Image(UnitExtensionsKt.getPr(R.drawable.icon_my_official_series_empty, startRestartGroup, 0), (String) null, SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(122)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 440, 120);
            String sr = UnitExtensionsKt.getSr(R.string.catalog_periods_caption_nocoinsavailable, startRestartGroup, 0);
            long m7866blackWaAFU9c = CoinColor.INSTANCE.m7866blackWaAFU9c(startRestartGroup, 6);
            long sp = TextUnitKt.getSp(18);
            FontWeight fontWeight = new FontWeight(600);
            float f2 = 55;
            Modifier.Companion companion = Modifier.INSTANCE;
            composer2 = startRestartGroup;
            TextKt.m3014Text4IGK_g(sr, PaddingKt.m989paddingqDBjuR0$default(companion, Dp.m6997constructorimpl(f2), Dp.m6997constructorimpl(8), Dp.m6997constructorimpl(f2), 0.0f, 8, null), m7866blackWaAFU9c, sp, (FontStyle) null, fontWeight, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 130512);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$EmptyItem$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i2) {
                    CatalogDetailFragmentViewKt.EmptyItem(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CatalogItem(final CatalogCoin catalogCoin, final Function0<Unit> function0, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1625832323);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1625832323, i, -1, "com.glority.android.picturexx.view.catalog.CatalogItem (CatalogDetailFragmentView.kt:256)");
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
        Updater.m4015setimpl(m4008constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        float f = 80;
        Modifier m1015defaultMinSizeVpY3zN4$default = SizeKt.m1015defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(f), 1, null);
        startRestartGroup.startReplaceableGroup(642947355);
        boolean changedInstance = startRestartGroup.changedInstance(function0);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CatalogItem$1$1$1
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
        Modifier m573clickableXHw0xAI$default = ClickableKt.m573clickableXHw0xAI$default(m1015defaultMinSizeVpY3zN4$default, false, null, null, (Function0) rememberedValue, 7, null);
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m573clickableXHw0xAI$default);
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
        Updater.m4015setimpl(m4008constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        Modifier weight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
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
        Updater.m4015setimpl(m4008constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4015setimpl(m4008constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4008constructorimpl3.getInserting() || !Intrinsics.areEqual(m4008constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m4008constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4008constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        Updater.m4015setimpl(m4008constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        TextKt.m3014Text4IGK_g(catalogCoin.getName(), (Modifier) Modifier.INSTANCE, CoinColor.INSTANCE.m7866blackWaAFU9c(startRestartGroup, 6), TextUnitKt.getSp(16), (FontStyle) null, new FontWeight(700), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199728, 0, 131024);
        TextKt.m3014Text4IGK_g(catalogCoin.getTimeRange(), PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(4), 0.0f, 0.0f, 13, null), CoinColor.INSTANCE.m7874textColor66WaAFU9c(startRestartGroup, 6), TextUnitKt.getSp(14), (FontStyle) null, new FontWeight(500), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199728, 0, 131024);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Alignment center = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Modifier.Companion companion2 = Modifier.INSTANCE;
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor4);
        } else {
            startRestartGroup.useNode();
        }
        Composer m4008constructorimpl4 = Updater.m4008constructorimpl(startRestartGroup);
        Updater.m4015setimpl(m4008constructorimpl4, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4015setimpl(m4008constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4008constructorimpl4.getInserting() || !Intrinsics.areEqual(m4008constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            m4008constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m4008constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
        }
        Updater.m4015setimpl(m4008constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        com.glority.android.compose.ui.ImageKt.GlImage(catalogCoin.getSubjectSideUrl(), ClipKt.clip(SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(f)), RoundedCornerShapeKt.getCircleShape()), 0.0f, null, 0.0f, null, null, null, null, null, startRestartGroup, 48, 1020);
        com.glority.android.compose.ui.ImageKt.GlImage(catalogCoin.getDenominationSideUrl(), ClipKt.clip(SizeKt.m1030size3ABfNKs(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6997constructorimpl(50), 0.0f, 0.0f, 0.0f, 14, null), Dp.m6997constructorimpl(60)), RoundedCornerShapeKt.getCircleShape()), 0.0f, null, 0.0f, null, null, null, null, null, startRestartGroup, 48, 1020);
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
        DividerKt.m2392Divider9IZ8Weo(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(12), 0.0f, 0.0f, 13, null), Dp.m6997constructorimpl((float) 0.5d), CoinColor.INSTANCE.m7870dividerColorWaAFU9c(startRestartGroup, 6), startRestartGroup, 54, 0);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CatalogItem$2
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
                    CatalogDetailFragmentViewKt.CatalogItem(CatalogCoin.this, function0, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void Description(final CatalogInfo detail, Modifier modifier, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(detail, "detail");
        Composer startRestartGroup = composer.startRestartGroup(1602336807);
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1602336807, i, -1, "com.glority.android.picturexx.view.catalog.Description (CatalogDetailFragmentView.kt:307)");
        }
        float f = 16;
        Modifier m987paddingVpY3zN4$default = PaddingKt.m987paddingVpY3zN4$default(modifier2, Dp.m6997constructorimpl(f), 0.0f, 2, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m987paddingVpY3zN4$default);
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
        Updater.m4015setimpl(m4008constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
        Updater.m4015setimpl(m4008constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        final Modifier modifier3 = modifier2;
        TextKt.m3014Text4IGK_g(detail.getTimeRange(), (Modifier) null, CoinColor.INSTANCE.m7866blackWaAFU9c(startRestartGroup, 6), TextUnitKt.getSp(16), FontStyle.m6567boximpl(FontStyle.INSTANCE.m6576getItalic_LCdwA()), new FontWeight(500), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199680, 0, 131010);
        SpacerKt.Spacer(SizeKt.m1016height3ABfNKs(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m6997constructorimpl(1)), startRestartGroup, 0);
        com.glority.android.compose.ui.ImageKt.GlImage(CmsDataUtils.INSTANCE.getCountryFlagIconUrl(detail.getCountryInfo().getCountryCode()), SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(18)), 0.0f, null, 0.0f, null, null, null, null, null, startRestartGroup, 48, 1020);
        TextKt.m3014Text4IGK_g(detail.getCountryInfo().getCountryCode(), PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6997constructorimpl(4), 0.0f, 0.0f, 0.0f, 14, null), CoinColor.INSTANCE.m7866blackWaAFU9c(startRestartGroup, 6), TextUnitKt.getSp(16), (FontStyle) null, new FontWeight(500), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(22), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199728, 6, 130000);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        TextKt.m3014Text4IGK_g(detail.getDescription(), PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(f), 0.0f, 0.0f, 13, null), CoinColor.INSTANCE.m7873textColor33WaAFU9c(startRestartGroup, 6), TextUnitKt.getSp(14), (FontStyle) null, new FontWeight(500), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199728, 0, 131024);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$Description$2
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
                    CatalogDetailFragmentViewKt.Description(CatalogInfo.this, modifier3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static final void TypeTabRow(final CatalogDetailMessage detail, final Modifier modifier, final Function1<? super Integer, Unit> onSelectedIndex, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(detail, "detail");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(onSelectedIndex, "onSelectedIndex");
        Composer startRestartGroup = composer.startRestartGroup(-1062154679);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1062154679, i, -1, "com.glority.android.picturexx.view.catalog.TypeTabRow (CatalogDetailFragmentView.kt:350)");
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final MutableIntState mutableIntState = (MutableIntState) rememberedValue;
        final List listOf = CollectionsKt.listOf((Object[]) new String[]{UnitExtensionsKt.getSr(R.string.global_caption_circulation, startRestartGroup, 0), UnitExtensionsKt.getSr(R.string.global_caption_commemorative, startRestartGroup, 0), UnitExtensionsKt.getSr(R.string.global_caption_collector, startRestartGroup, 0)});
        final List listOf2 = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(detail.getCirculationList().size()), Integer.valueOf(detail.getCommemorotiveList().size()), Integer.valueOf(detail.getCollectorList().size())});
        TabRowKt.m2914ScrollableTabRowsKfQg0A(TypeTabRow$lambda$17(mutableIntState), modifier, CoinColor.INSTANCE.m7875whiteWaAFU9c(startRestartGroup, 6), 0L, Dp.m6997constructorimpl(0), ComposableLambdaKt.composableLambda(startRestartGroup, 769596777, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$TypeTabRow$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                invoke((List<TabPosition>) list, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(List<TabPosition> tabPositions, Composer composer2, int i2) {
                int TypeTabRow$lambda$17;
                Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(769596777, i2, -1, "com.glority.android.picturexx.view.catalog.TypeTabRow.<anonymous> (CatalogDetailFragmentView.kt:372)");
                }
                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                TabRowDefaults tabRowDefaults2 = TabRowDefaults.INSTANCE;
                Modifier.Companion companion = Modifier.INSTANCE;
                TypeTabRow$lambda$17 = CatalogDetailFragmentViewKt.TypeTabRow$lambda$17(MutableIntState.this);
                tabRowDefaults.m2907Indicator9IZ8Weo(tabRowDefaults2.tabIndicatorOffset(companion, tabPositions.get(TypeTabRow$lambda$17)), 0.0f, CoinColor.INSTANCE.m7871primaryColorWaAFU9c(composer2, 6), composer2, TabRowDefaults.$stable << 9, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), ComposableSingletons$CatalogDetailFragmentViewKt.INSTANCE.m7877getLambda1$businessMod_release(), ComposableLambdaKt.composableLambda(startRestartGroup, -65918103, true, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$TypeTabRow$2
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

            public final void invoke(Composer composer2, int i2) {
                int TypeTabRow$lambda$17;
                if ((i2 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-65918103, i2, -1, "com.glority.android.picturexx.view.catalog.TypeTabRow.<anonymous> (CatalogDetailFragmentView.kt:379)");
                }
                List<String> list = listOf;
                final MutableIntState mutableIntState2 = mutableIntState;
                final Function1<Integer, Unit> function1 = onSelectedIndex;
                final List<Integer> list2 = listOf2;
                final int i3 = 0;
                for (Object obj : list) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    final String str = (String) obj;
                    TypeTabRow$lambda$17 = CatalogDetailFragmentViewKt.TypeTabRow$lambda$17(mutableIntState2);
                    final boolean z = i3 == TypeTabRow$lambda$17;
                    composer2.startReplaceableGroup(642951208);
                    boolean changed = composer2.changed(mutableIntState2) | composer2.changed(i3) | composer2.changedInstance(function1);
                    Object rememberedValue2 = composer2.rememberedValue();
                    if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$TypeTabRow$2$1$1$1
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                mutableIntState2.setIntValue(i3);
                                function1.invoke(Integer.valueOf(i3));
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    TabKt.m2899TabbogVsAg(z, (Function0) rememberedValue2, null, false, 0L, 0L, null, ComposableLambdaKt.composableLambda(composer2, -22182800, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$TypeTabRow$2$1$2
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                            invoke(columnScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(ColumnScope Tab, Composer composer3, int i5) {
                            String str2;
                            Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                            if ((i5 & 81) != 16 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-22182800, i5, -1, "com.glority.android.picturexx.view.catalog.TypeTabRow.<anonymous>.<anonymous>.<anonymous> (CatalogDetailFragmentView.kt:385)");
                                }
                                if (z) {
                                    str2 = str + " (" + list2.get(i3) + ")";
                                } else {
                                    str2 = str;
                                }
                                long sp = z ? TextUnitKt.getSp(16) : TextUnitKt.getSp(14);
                                FontWeight fontWeight = z ? new FontWeight(700) : new FontWeight(500);
                                composer3.startReplaceableGroup(-306007162);
                                long m7871primaryColorWaAFU9c = z ? CoinColor.INSTANCE.m7871primaryColorWaAFU9c(composer3, 6) : ColorKt.Color(4281545523L);
                                composer3.endReplaceableGroup();
                                TextKt.m3014Text4IGK_g(str2, PaddingKt.m986paddingVpY3zN4(Modifier.INSTANCE, Dp.m6997constructorimpl(16), Dp.m6997constructorimpl(10)), m7871primaryColorWaAFU9c, sp, (FontStyle) null, fontWeight, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131024);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 12582912, 124);
                    i3 = i4;
                    function1 = function1;
                    list2 = list2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), startRestartGroup, (i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | 14376960, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$TypeTabRow$3
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

                public final void invoke(Composer composer2, int i2) {
                    CatalogDetailFragmentViewKt.TypeTabRow(CatalogDetailMessage.this, modifier, onSelectedIndex, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* renamed from: CollapsingToolbarLayout-pBklqvs, reason: not valid java name */
    public static final void m7876CollapsingToolbarLayoutpBklqvs(final float f, final float f2, final float f3, final CatalogInfo detail, final Function0<Unit> onBackClick, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(detail, "detail");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer startRestartGroup = composer.startRestartGroup(-1490775847);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1490775847, i, -1, "com.glority.android.picturexx.view.catalog.CollapsingToolbarLayout (CatalogDetailFragmentView.kt:406)");
        }
        startRestartGroup.startReplaceableGroup(-1752031326);
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density = (Density) consume;
        final float mo674toDpu2uoSUM = density.mo674toDpu2uoSUM(WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, startRestartGroup, 8).getTop(density));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(642952125);
        boolean changed = startRestartGroup.changed(f) | startRestartGroup.changed(mo674toDpu2uoSUM) | startRestartGroup.changed(f2);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = (Function1) new Function1<MotionSceneScope, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CollapsingToolbarLayout$scene$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MotionSceneScope motionSceneScope) {
                    invoke2(motionSceneScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(final MotionSceneScope MotionScene) {
                    Intrinsics.checkNotNullParameter(MotionScene, "$this$MotionScene");
                    final ConstrainedLayoutReference createRefFor = MotionScene.createRefFor(Args.title);
                    final ConstrainedLayoutReference createRefFor2 = MotionScene.createRefFor("image");
                    final ConstrainedLayoutReference createRefFor3 = MotionScene.createRefFor("icon");
                    final ConstrainedLayoutReference createRefFor4 = MotionScene.createRefFor("icon2");
                    final float f4 = f;
                    final float f5 = mo674toDpu2uoSUM;
                    ConstraintSetRef constraintSet$default = MotionSceneScope.constraintSet$default(MotionScene, null, null, new Function1<ConstraintSetScope, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CollapsingToolbarLayout$scene$1$1$start1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ConstraintSetScope constraintSetScope) {
                            invoke2(constraintSetScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(ConstraintSetScope constraintSet) {
                            Intrinsics.checkNotNullParameter(constraintSet, "$this$constraintSet");
                            ConstrainedLayoutReference constrainedLayoutReference = ConstrainedLayoutReference.this;
                            final ConstrainedLayoutReference constrainedLayoutReference2 = createRefFor2;
                            constraintSet.constrain(constrainedLayoutReference, new Function1<ConstrainScope, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CollapsingToolbarLayout$scene$1$1$start1$1.1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                    invoke2(constrainScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(ConstrainScope constrain) {
                                    Intrinsics.checkNotNullParameter(constrain, "$this$constrain");
                                    HorizontalAnchorable.m7376linkToVpY3zN4$default(constrain.getBottom(), ConstrainedLayoutReference.this.getBottom(), 0.0f, 0.0f, 6, (Object) null);
                                    VerticalAnchorable.m7470linkToVpY3zN4$default(constrain.getStart(), ConstrainedLayoutReference.this.getStart(), Dp.m6997constructorimpl(16), 0.0f, 4, null);
                                }
                            });
                            ConstrainedLayoutReference constrainedLayoutReference3 = createRefFor2;
                            final float f6 = f4;
                            constraintSet.constrain(constrainedLayoutReference3, new Function1<ConstrainScope, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CollapsingToolbarLayout$scene$1$1$start1$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                    invoke2(constrainScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(ConstrainScope constrain) {
                                    Intrinsics.checkNotNullParameter(constrain, "$this$constrain");
                                    constrain.setWidth(Dimension.INSTANCE.getMatchParent());
                                    constrain.setHeight(Dimension.INSTANCE.m7358value0680j_4(f6));
                                    HorizontalAnchorable.m7376linkToVpY3zN4$default(constrain.getTop(), constrain.getParent().getTop(), 0.0f, 0.0f, 6, (Object) null);
                                }
                            });
                            ConstrainedLayoutReference constrainedLayoutReference4 = createRefFor3;
                            final ConstrainedLayoutReference constrainedLayoutReference5 = createRefFor2;
                            final float f7 = f5;
                            final MotionSceneScope motionSceneScope = MotionScene;
                            constraintSet.constrain(constrainedLayoutReference4, new Function1<ConstrainScope, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CollapsingToolbarLayout$scene$1$1$start1$1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                    invoke2(constrainScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(ConstrainScope constrain) {
                                    Intrinsics.checkNotNullParameter(constrain, "$this$constrain");
                                    HorizontalAnchorable.m7376linkToVpY3zN4$default(constrain.getTop(), ConstrainedLayoutReference.this.getTop(), f7, 0.0f, 4, (Object) null);
                                    VerticalAnchorable.m7470linkToVpY3zN4$default(constrain.getStart(), constrain.getParent().getStart(), Dp.m6997constructorimpl(16), 0.0f, 4, null);
                                    motionSceneScope.customFloat(constrain, "iconAlpha", 1.0f);
                                }
                            });
                            ConstrainedLayoutReference constrainedLayoutReference6 = createRefFor4;
                            final ConstrainedLayoutReference constrainedLayoutReference7 = createRefFor2;
                            final float f8 = f5;
                            final MotionSceneScope motionSceneScope2 = MotionScene;
                            constraintSet.constrain(constrainedLayoutReference6, new Function1<ConstrainScope, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CollapsingToolbarLayout$scene$1$1$start1$1.4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                    invoke2(constrainScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(ConstrainScope constrain) {
                                    Intrinsics.checkNotNullParameter(constrain, "$this$constrain");
                                    HorizontalAnchorable.m7376linkToVpY3zN4$default(constrain.getTop(), ConstrainedLayoutReference.this.getTop(), f8, 0.0f, 4, (Object) null);
                                    VerticalAnchorable.m7470linkToVpY3zN4$default(constrain.getStart(), constrain.getParent().getStart(), Dp.m6997constructorimpl(16), 0.0f, 4, null);
                                    motionSceneScope2.customFloat(constrain, "iconAlpha", 0.0f);
                                }
                            });
                        }
                    }, 3, null);
                    final float f6 = f2;
                    final float f7 = mo674toDpu2uoSUM;
                    MotionScene.transition(constraintSet$default, MotionSceneScope.constraintSet$default(MotionScene, null, null, new Function1<ConstraintSetScope, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CollapsingToolbarLayout$scene$1$1$end1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ConstraintSetScope constraintSetScope) {
                            invoke2(constraintSetScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(ConstraintSetScope constraintSet) {
                            Intrinsics.checkNotNullParameter(constraintSet, "$this$constraintSet");
                            ConstrainedLayoutReference constrainedLayoutReference = ConstrainedLayoutReference.this;
                            final ConstrainedLayoutReference constrainedLayoutReference2 = createRefFor3;
                            constraintSet.constrain(constrainedLayoutReference, new Function1<ConstrainScope, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CollapsingToolbarLayout$scene$1$1$end1$1.1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                    invoke2(constrainScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(ConstrainScope constrain) {
                                    Intrinsics.checkNotNullParameter(constrain, "$this$constrain");
                                    HorizontalAnchorable.m7376linkToVpY3zN4$default(constrain.getTop(), ConstrainedLayoutReference.this.getTop(), 0.0f, 0.0f, 6, (Object) null);
                                    VerticalAnchorable.m7470linkToVpY3zN4$default(constrain.getStart(), ConstrainedLayoutReference.this.getEnd(), Dp.m6997constructorimpl(4), 0.0f, 4, null);
                                    constrain.setScaleX(0.64f);
                                    constrain.setScaleY(0.64f);
                                    constrain.setPivotX(0.0f);
                                    constrain.setPivotY(0.0f);
                                }
                            });
                            ConstrainedLayoutReference constrainedLayoutReference3 = createRefFor2;
                            final float f8 = f6;
                            constraintSet.constrain(constrainedLayoutReference3, new Function1<ConstrainScope, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CollapsingToolbarLayout$scene$1$1$end1$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                    invoke2(constrainScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(ConstrainScope constrain) {
                                    Intrinsics.checkNotNullParameter(constrain, "$this$constrain");
                                    constrain.setWidth(Dimension.INSTANCE.getMatchParent());
                                    constrain.setHeight(Dimension.INSTANCE.m7358value0680j_4(f8));
                                    HorizontalAnchorable.m7376linkToVpY3zN4$default(constrain.getTop(), constrain.getParent().getTop(), 0.0f, 0.0f, 6, (Object) null);
                                }
                            });
                            ConstrainedLayoutReference constrainedLayoutReference4 = createRefFor3;
                            final ConstrainedLayoutReference constrainedLayoutReference5 = createRefFor2;
                            final float f9 = f7;
                            final MotionSceneScope motionSceneScope = MotionScene;
                            constraintSet.constrain(constrainedLayoutReference4, new Function1<ConstrainScope, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CollapsingToolbarLayout$scene$1$1$end1$1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                    invoke2(constrainScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(ConstrainScope constrain) {
                                    Intrinsics.checkNotNullParameter(constrain, "$this$constrain");
                                    HorizontalAnchorable.m7376linkToVpY3zN4$default(constrain.getTop(), ConstrainedLayoutReference.this.getTop(), f9, 0.0f, 4, (Object) null);
                                    VerticalAnchorable.m7470linkToVpY3zN4$default(constrain.getStart(), constrain.getParent().getStart(), Dp.m6997constructorimpl(16), 0.0f, 4, null);
                                    motionSceneScope.customFloat(constrain, "iconAlpha", 0.0f);
                                }
                            });
                            ConstrainedLayoutReference constrainedLayoutReference6 = createRefFor4;
                            final ConstrainedLayoutReference constrainedLayoutReference7 = createRefFor2;
                            final float f10 = f7;
                            final MotionSceneScope motionSceneScope2 = MotionScene;
                            constraintSet.constrain(constrainedLayoutReference6, new Function1<ConstrainScope, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CollapsingToolbarLayout$scene$1$1$end1$1.4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                    invoke2(constrainScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(ConstrainScope constrain) {
                                    Intrinsics.checkNotNullParameter(constrain, "$this$constrain");
                                    HorizontalAnchorable.m7376linkToVpY3zN4$default(constrain.getTop(), ConstrainedLayoutReference.this.getTop(), f10, 0.0f, 4, (Object) null);
                                    VerticalAnchorable.m7470linkToVpY3zN4$default(constrain.getStart(), constrain.getParent().getStart(), Dp.m6997constructorimpl(16), 0.0f, 4, null);
                                    motionSceneScope2.customFloat(constrain, "iconAlpha", 1.0f);
                                }
                            });
                        }
                    }, 3, null), "default", new Function1<TransitionScope, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CollapsingToolbarLayout$scene$1$1.1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(TransitionScope transition) {
                            Intrinsics.checkNotNullParameter(transition, "$this$transition");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TransitionScope transitionScope) {
                            invoke2(transitionScope);
                            return Unit.INSTANCE;
                        }
                    });
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        MotionScene MotionScene = MotionSceneScopeKt.MotionScene((Function1) rememberedValue);
        int i2 = i >> 3;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -808697931, "CC(MotionLayout)P(4,6,3,7,1:androidx.constraintlayout.compose.DebugFlags,5,2)253@10965L53,254@11047L93,259@11302L627,275@11935L412:MotionLayout.kt#fysre8");
        Modifier.Companion companion = Modifier.INSTANCE;
        int m7356getNonebfy_xzQ = DebugFlags.INSTANCE.m7356getNonebfy_xzQ();
        final InvalidationStrategy defaultInvalidationStrategy = InvalidationStrategy.INSTANCE.getDefaultInvalidationStrategy();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1692857043, "CC(remember):MotionLayout.kt#9igjgp");
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        final MutableState mutableState = (MutableState) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1692859707, "CC(remember):MotionLayout.kt#9igjgp");
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        Object obj = rememberedValue3;
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            Ref ref = new Ref();
            ref.setValue(CompositionSource.Unknown);
            startRestartGroup.updateRememberedValue(ref);
            obj = ref;
        }
        final Ref ref2 = (Ref) obj;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        MotionLayoutKt.m7415MotionLayoutCoreSehEMGo(MotionScene, f3, "default", 257, m7356getNonebfy_xzQ, companion, mutableState, ref2, defaultInvalidationStrategy, ComposableLambdaKt.rememberComposableLambda(-23317463, true, new Function3<MotionLayoutScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CollapsingToolbarLayout-pBklqvs$$inlined$MotionLayout-6oYECBM$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(MotionLayoutScope motionLayoutScope, Composer composer2, Integer num) {
                invoke(motionLayoutScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(MotionLayoutScope motionLayoutScope, Composer composer2, int i3) {
                ComposerKt.sourceInformation(composer2, "C272@11914L9:MotionLayout.kt#fysre8");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-23317463, i3, -1, "androidx.constraintlayout.compose.MotionLayout.<anonymous> (MotionLayout.kt:262)");
                }
                MutableState.this.setValue(Unit.INSTANCE);
                if (defaultInvalidationStrategy.getOnObservedStateChange() == null && ref2.getValue() == CompositionSource.Unknown) {
                    ref2.setValue(CompositionSource.Content);
                }
                Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, "image");
                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, layoutId);
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
                com.glority.android.compose.ui.ImageKt.GlImage(detail.getHeadBackgroudUrl(), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, ContentScale.INSTANCE.getCrop(), 0.0f, null, null, null, null, null, composer2, 3120, 1012);
                float f4 = 1;
                com.glority.android.compose.ui.ImageKt.GlImage(detail.getSubjectSideUrl(), boxScopeInstance.align(SizeKt.m1030size3ABfNKs(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m6997constructorimpl(54), Dp.m6997constructorimpl(56 * (f4 - f3)), 3, null), Dp.m6997constructorimpl(160)), Alignment.INSTANCE.getBottomEnd()), 0.0f, null, 0.0f, null, null, null, null, null, composer2, 0, 1020);
                float f5 = 12;
                com.glority.android.compose.ui.ImageKt.GlImage(detail.getDenominationSideUrl(), boxScopeInstance.align(SizeKt.m1030size3ABfNKs(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m6997constructorimpl(f5), Dp.m6997constructorimpl(82 * (f4 - f3)), 3, null), Dp.m6997constructorimpl(100)), Alignment.INSTANCE.getBottomEnd()), 0.0f, null, 0.0f, null, null, null, null, null, composer2, 0, 1020);
                BoxKt.Box(boxScopeInstance.align(BackgroundKt.m539backgroundbw27NRU(SizeKt.m1016height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6997constructorimpl(55)), CoinColor.INSTANCE.m7875whiteWaAFU9c(composer2, 6), RoundedCornerShapeKt.m1270RoundedCornerShapea9UjIt4$default(Dp.m6997constructorimpl(f5), Dp.m6997constructorimpl(f5), 0.0f, 0.0f, 12, null)), Alignment.INSTANCE.getBottomCenter()), composer2, 0);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                Painter pr = UnitExtensionsKt.getPr(R.drawable.icon_back, composer2, 0);
                float f6 = 24;
                Modifier alpha = AlphaKt.alpha(LayoutIdKt.layoutId(SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(f6)), "icon"), motionLayoutScope.customFloat("icon", "iconAlpha"));
                composer2.startReplaceableGroup(642955452);
                boolean changedInstance = composer2.changedInstance(onBackClick);
                Object rememberedValue4 = composer2.rememberedValue();
                if (changedInstance || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    final Function0 function0 = onBackClick;
                    rememberedValue4 = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CollapsingToolbarLayout$1$2$1
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
                    composer2.updateRememberedValue(rememberedValue4);
                }
                composer2.endReplaceableGroup();
                ImageKt.Image(pr, (String) null, ClickableKt.m573clickableXHw0xAI$default(alpha, false, null, null, (Function0) rememberedValue4, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                Painter pr2 = UnitExtensionsKt.getPr(R.drawable.icon_back_black, composer2, 0);
                Modifier alpha2 = AlphaKt.alpha(LayoutIdKt.layoutId(SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(f6)), "icon2"), motionLayoutScope.customFloat("icon2", "iconAlpha"));
                composer2.startReplaceableGroup(642955800);
                boolean changedInstance2 = composer2.changedInstance(onBackClick);
                Object rememberedValue5 = composer2.rememberedValue();
                if (changedInstance2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    final Function0 function02 = onBackClick;
                    rememberedValue5 = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CollapsingToolbarLayout$1$3$1
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
                            function02.invoke();
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue5);
                }
                composer2.endReplaceableGroup();
                ImageKt.Image(pr2, (String) null, ClickableKt.m573clickableXHw0xAI$default(alpha2, false, null, null, (Function0) rememberedValue5, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                ResizableTextKt.m7716ResizableText4IGK_g(detail.getName(), LayoutIdKt.layoutId(Modifier.INSTANCE, Args.title), CoinColor.INSTANCE.m7866blackWaAFU9c(composer2, 6), TextUnitKt.getSp(28), null, new FontWeight(700), null, 0L, null, null, 0L, 0, false, 1, 0, null, 0, composer2, 199728, 3072, 122832);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), startRestartGroup, (i2 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | 806879232 | (Ref.$stable << 21));
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CollapsingToolbarLayout$2
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
                    CatalogDetailFragmentViewKt.m7876CollapsingToolbarLayoutpBklqvs(f, f2, f3, detail, onBackClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Resource<CatalogDetailMessage> CatalogDetailFragmentView$lambda$1(MutableState<Resource<CatalogDetailMessage>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int TypeTabRow$lambda$17(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }
}
