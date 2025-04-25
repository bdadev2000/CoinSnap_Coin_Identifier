package com.glority.android.picturexx.composable;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.unit.Density;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.extensions.CollectionCountrySummaryWrapper;
import com.glority.android.xx.constants.LogEvents;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CollectionDistribution.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class CollectionDistributionKt$CollectionDistribution$1 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ String $countryCode;
    final /* synthetic */ Function1<CollectionItem, Unit> $onCollectionClick;
    final /* synthetic */ Function1<CollectionCountrySummaryWrapper, Unit> $onCountrySelected;
    final /* synthetic */ List<CollectionCountrySummaryWrapper> $summaries;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CollectionDistributionKt$CollectionDistribution$1(String str, List<CollectionCountrySummaryWrapper> list, Function1<? super CollectionItem, Unit> function1, Function1<? super CollectionCountrySummaryWrapper, Unit> function12) {
        super(3);
        this.$countryCode = str;
        this.$summaries = list;
        this.$onCollectionClick = function1;
        this.$onCountrySelected = function12;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
        int i2;
        float min_height;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i & 14) == 0) {
            i2 = i | (composer.changed(BoxWithConstraints) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1782586501, i2, -1, "com.glority.android.picturexx.composable.CollectionDistribution.<anonymous> (CollectionDistribution.kt:116)");
            }
            float mo893getMaxHeightD9Ej5fM = BoxWithConstraints.mo893getMaxHeightD9Ej5fM();
            min_height = CollectionDistributionKt.getMIN_HEIGHT(composer, 0);
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composer);
            final float mo677toPx0680j_4 = ((Density) consume).mo677toPx0680j_4(mo893getMaxHeightD9Ej5fM);
            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(localDensity2);
            ComposerKt.sourceInformationMarkerEnd(composer);
            final float mo677toPx0680j_42 = ((Density) consume2).mo677toPx0680j_4(min_height);
            ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume3 = composer.consume(localDensity3);
            ComposerKt.sourceInformationMarkerEnd(composer);
            float mo677toPx0680j_43 = ((Density) consume3).mo677toPx0680j_4(min_height);
            ComposerKt.sourceInformationMarkerStart(composer, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(mo677toPx0680j_43);
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            final MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue;
            ProvidableCompositionLocal<Density> localDensity4 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume4 = composer.consume(localDensity4);
            ComposerKt.sourceInformationMarkerEnd(composer);
            float mo673toDpu2uoSUM = ((Density) consume4).mo673toDpu2uoSUM(invoke$lambda$4(mutableFloatState));
            composer.startReplaceableGroup(960057481);
            boolean changed = composer.changed(mutableFloatState) | composer.changed(mo677toPx0680j_42) | composer.changed(mo677toPx0680j_4);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function1) new Function1<Float, Unit>() { // from class: com.glority.android.picturexx.composable.CollectionDistributionKt$CollectionDistribution$1$draggableState$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                        invoke(f.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(float f) {
                        float invoke$lambda$4;
                        invoke$lambda$4 = CollectionDistributionKt$CollectionDistribution$1.invoke$lambda$4(mutableFloatState);
                        mutableFloatState.setFloatValue(RangesKt.coerceIn(invoke$lambda$4 - f, Math.min(mo677toPx0680j_42, mo677toPx0680j_4), Math.max(mo677toPx0680j_42, mo677toPx0680j_4)));
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            final DraggableState rememberDraggableState = DraggableKt.rememberDraggableState((Function1) rememberedValue2, composer, 0);
            final PagerState rememberPagerState = PagerStateKt.rememberPagerState(this.$countryCode != null ? 1 : 0, 0.0f, new Function0<Integer>() { // from class: com.glority.android.picturexx.composable.CollectionDistributionKt$CollectionDistribution$1$pagerState$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Integer invoke() {
                    return 2;
                }
            }, composer, 384, 2);
            ComposerKt.sourceInformationMarkerStart(composer, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composer, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue3 = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue3).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composer);
            BackHandlerKt.BackHandler(rememberPagerState.getCurrentPage() == 1, new Function0<Unit>() { // from class: com.glority.android.picturexx.composable.CollectionDistributionKt$CollectionDistribution$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: CollectionDistribution.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                @DebugMetadata(c = "com.glority.android.picturexx.composable.CollectionDistributionKt$CollectionDistribution$1$1$1", f = "CollectionDistribution.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.glority.android.picturexx.composable.CollectionDistributionKt$CollectionDistribution$1$1$1, reason: invalid class name and collision with other inner class name */
                /* loaded from: classes2.dex */
                public static final class C00931 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ PagerState $pagerState;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00931(PagerState pagerState, Continuation<? super C00931> continuation) {
                        super(2, continuation);
                        this.$pagerState = pagerState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C00931(this.$pagerState, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C00931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.label = 1;
                            if (PagerState.animateScrollToPage$default(this.$pagerState, 0, 0.0f, null, this, 6, null) == coroutine_suspended) {
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

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (PagerState.this.getCurrentPage() == 1) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C00931(PagerState.this, null), 3, null);
                    }
                }
            }, composer, 0, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new CollectionCountrySummaryWrapper("", CollectionsKt.emptyList()), null, 2, null);
                composer.updateRememberedValue(rememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            final MutableState mutableState = (MutableState) rememberedValue4;
            EffectsKt.LaunchedEffect(this.$countryCode, new AnonymousClass2(this.$countryCode, rememberPagerState, this.$summaries, mutableState, null), composer, 64);
            Modifier align = BoxWithConstraints.align(SizeKt.fillMaxHeight$default(SizeKt.m1016height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), mo673toDpu2uoSUM), 0.0f, 1, null), Alignment.INSTANCE.getBottomCenter());
            RoundedCornerShape m1270RoundedCornerShapea9UjIt4$default = RoundedCornerShapeKt.m1270RoundedCornerShapea9UjIt4$default(PrimitiveResources_androidKt.dimensionResource(R.dimen.x36, composer, 0), PrimitiveResources_androidKt.dimensionResource(R.dimen.x36, composer, 0), 0.0f, 0.0f, 12, null);
            long m4552getWhite0d7_KjU = Color.INSTANCE.m4552getWhite0d7_KjU();
            final List<CollectionCountrySummaryWrapper> list = this.$summaries;
            final String str = this.$countryCode;
            final Function1<CollectionItem, Unit> function1 = this.$onCollectionClick;
            final Function1<CollectionCountrySummaryWrapper, Unit> function12 = this.$onCountrySelected;
            SurfaceKt.m2864SurfaceT9BRK9s(align, m1270RoundedCornerShapea9UjIt4$default, m4552getWhite0d7_KjU, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composer, 87009888, true, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.CollectionDistributionKt$CollectionDistribution$1.3
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
                    Modifier draggable;
                    if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(87009888, i3, -1, "com.glority.android.picturexx.composable.CollectionDistribution.<anonymous>.<anonymous> (CollectionDistribution.kt:182)");
                        }
                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        DraggableState draggableState = DraggableState.this;
                        final PagerState pagerState = rememberPagerState;
                        final List<CollectionCountrySummaryWrapper> list2 = list;
                        final String str2 = str;
                        final MutableState<CollectionCountrySummaryWrapper> mutableState2 = mutableState;
                        final Function1<CollectionItem, Unit> function13 = function1;
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        final Function1<CollectionCountrySummaryWrapper, Unit> function14 = function12;
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default);
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
                        draggable = DraggableKt.draggable(SizeKt.m1016height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen.x36, composer2, 0)), draggableState, Orientation.Vertical, (r20 & 4) != 0, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? DraggableKt.NoOpOnDragStarted : null, (r20 & 64) != 0 ? DraggableKt.NoOpOnDragStopped : null, (r20 & 128) != 0 ? false : false);
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, draggable);
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
                        Updater.m4015setimpl(m4008constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxKt.Box(BoxScopeInstance.INSTANCE.align(BackgroundKt.m539backgroundbw27NRU(SizeKt.m1035width3ABfNKs(SizeKt.m1016height3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen.x8, composer2, 0)), PrimitiveResources_androidKt.dimensionResource(R.dimen.x60, composer2, 0)), ColorKt.Color(4293322470L), RoundedCornerShapeKt.RoundedCornerShape(50)), Alignment.INSTANCE.getCenter()), composer2, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        PagerKt.m1222HorizontalPageroI3XNZo(pagerState, ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null), null, null, 0, 0.0f, Alignment.INSTANCE.getTop(), null, false, false, null, null, null, ComposableLambdaKt.composableLambda(composer2, 1163543112, true, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.CollectionDistributionKt$CollectionDistribution$1$3$1$2
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(4);
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer3, Integer num2) {
                                invoke(pagerScope, num.intValue(), composer3, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PagerScope HorizontalPager, int i4, Composer composer3, int i5) {
                                CollectionCountrySummaryWrapper invoke$lambda$9;
                                Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1163543112, i5, -1, "com.glority.android.picturexx.composable.CollectionDistribution.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CollectionDistribution.kt:213)");
                                }
                                if (i4 == 0) {
                                    composer3.startReplaceableGroup(68348472);
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    List<CollectionCountrySummaryWrapper> list3 = list2;
                                    final CoroutineScope coroutineScope3 = coroutineScope2;
                                    final Function1<CollectionCountrySummaryWrapper, Unit> function15 = function14;
                                    final PagerState pagerState2 = pagerState;
                                    CollectionDistributionKt.CollectionDistributionPage1(companion, list3, new Function1<CollectionCountrySummaryWrapper, Unit>() { // from class: com.glority.android.picturexx.composable.CollectionDistributionKt$CollectionDistribution$1$3$1$2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        /* JADX INFO: Access modifiers changed from: package-private */
                                        /* compiled from: CollectionDistribution.kt */
                                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                                        @DebugMetadata(c = "com.glority.android.picturexx.composable.CollectionDistributionKt$CollectionDistribution$1$3$1$2$1$1", f = "CollectionDistribution.kt", i = {}, l = {226}, m = "invokeSuspend", n = {}, s = {})
                                        /* renamed from: com.glority.android.picturexx.composable.CollectionDistributionKt$CollectionDistribution$1$3$1$2$1$1, reason: invalid class name and collision with other inner class name */
                                        /* loaded from: classes2.dex */
                                        public static final class C00941 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            final /* synthetic */ CollectionCountrySummaryWrapper $it;
                                            final /* synthetic */ Function1<CollectionCountrySummaryWrapper, Unit> $onCountrySelected;
                                            final /* synthetic */ PagerState $pagerState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            C00941(CollectionCountrySummaryWrapper collectionCountrySummaryWrapper, Function1<? super CollectionCountrySummaryWrapper, Unit> function1, PagerState pagerState, Continuation<? super C00941> continuation) {
                                                super(2, continuation);
                                                this.$it = collectionCountrySummaryWrapper;
                                                this.$onCountrySelected = function1;
                                                this.$pagerState = pagerState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                return new C00941(this.$it, this.$onCountrySelected, this.$pagerState, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                return ((C00941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Object invokeSuspend(Object obj) {
                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    new LogEventRequest(LogEvents.Collection_Map_Detail_Country_Click, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("id", this.$it.getCountryCode()), TuplesKt.to(LogEventArguments.ARG_INTEGER_1, Boxing.boxInt(this.$it.getCount()))));
                                                    this.$onCountrySelected.invoke(this.$it);
                                                    this.label = 1;
                                                    if (PagerState.animateScrollToPage$default(this.$pagerState, 1, 0.0f, null, this, 6, null) == coroutine_suspended) {
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

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(CollectionCountrySummaryWrapper collectionCountrySummaryWrapper) {
                                            invoke2(collectionCountrySummaryWrapper);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(CollectionCountrySummaryWrapper it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new C00941(it, function15, pagerState2, null), 3, null);
                                        }
                                    }, composer3, 70);
                                    composer3.endReplaceableGroup();
                                } else if (i4 == 1) {
                                    composer3.startReplaceableGroup(68349312);
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    String str3 = str2;
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    String str4 = str3;
                                    invoke$lambda$9 = CollectionDistributionKt$CollectionDistribution$1.invoke$lambda$9(mutableState2);
                                    Modifier.Companion companion3 = companion2;
                                    composer3.startReplaceableGroup(960061832);
                                    boolean changed2 = composer3.changed(mutableState2) | composer3.changedInstance(function13);
                                    final Function1<CollectionItem, Unit> function16 = function13;
                                    final MutableState<CollectionCountrySummaryWrapper> mutableState3 = mutableState2;
                                    Object rememberedValue5 = composer3.rememberedValue();
                                    if (changed2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue5 = (Function1) new Function1<CollectionItem, Unit>() { // from class: com.glority.android.picturexx.composable.CollectionDistributionKt$CollectionDistribution$1$3$1$2$2$1
                                            /* JADX INFO: Access modifiers changed from: package-private */
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(CollectionItem collectionItem) {
                                                invoke2(collectionItem);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(CollectionItem it) {
                                                CollectionCountrySummaryWrapper invoke$lambda$92;
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                invoke$lambda$92 = CollectionDistributionKt$CollectionDistribution$1.invoke$lambda$9(mutableState3);
                                                new LogEventRequest(LogEvents.Collection_Map_Detail_Item_Click, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("id", invoke$lambda$92.getCountryCode()), TuplesKt.to(LogEventArguments.ARG_INTEGER_1, it.getCustomSeriesId())));
                                                function16.invoke(it);
                                            }
                                        };
                                        composer3.updateRememberedValue(rememberedValue5);
                                    }
                                    composer3.endReplaceableGroup();
                                    final CoroutineScope coroutineScope4 = coroutineScope2;
                                    final Function1<CollectionCountrySummaryWrapper, Unit> function17 = function14;
                                    final PagerState pagerState3 = pagerState;
                                    CollectionDistributionKt.CollectionDistributionPage2(companion3, str4, invoke$lambda$9, (Function1) rememberedValue5, new Function0<Unit>() { // from class: com.glority.android.picturexx.composable.CollectionDistributionKt$CollectionDistribution$1$3$1$2.3
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

                                        /* JADX INFO: Access modifiers changed from: package-private */
                                        /* compiled from: CollectionDistribution.kt */
                                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                                        @DebugMetadata(c = "com.glority.android.picturexx.composable.CollectionDistributionKt$CollectionDistribution$1$3$1$2$3$1", f = "CollectionDistribution.kt", i = {}, l = {238}, m = "invokeSuspend", n = {}, s = {})
                                        /* renamed from: com.glority.android.picturexx.composable.CollectionDistributionKt$CollectionDistribution$1$3$1$2$3$1, reason: invalid class name */
                                        /* loaded from: classes2.dex */
                                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            final /* synthetic */ PagerState $pagerState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            AnonymousClass1(PagerState pagerState, Continuation<? super AnonymousClass1> continuation) {
                                                super(2, continuation);
                                                this.$pagerState = pagerState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                return new AnonymousClass1(this.$pagerState, continuation);
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
                                                    if (PagerState.animateScrollToPage$default(this.$pagerState, 0, 0.0f, null, this, 6, null) == coroutine_suspended) {
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

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass1(pagerState3, null), 3, null);
                                            function17.invoke(null);
                                        }
                                    }, composer3, 518);
                                    composer3.endReplaceableGroup();
                                } else {
                                    composer3.startReplaceableGroup(68350523);
                                    composer3.endReplaceableGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 102236160, 3072, 7868);
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
            }), composer, 12583296, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CollectionDistribution.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.composable.CollectionDistributionKt$CollectionDistribution$1$2", f = "CollectionDistribution.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.composable.CollectionDistributionKt$CollectionDistribution$1$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $countryCode;
        final /* synthetic */ PagerState $pagerState;
        final /* synthetic */ MutableState<CollectionCountrySummaryWrapper> $selectedSummaryWrapper$delegate;
        final /* synthetic */ List<CollectionCountrySummaryWrapper> $summaries;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, PagerState pagerState, List<CollectionCountrySummaryWrapper> list, MutableState<CollectionCountrySummaryWrapper> mutableState, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$countryCode = str;
            this.$pagerState = pagerState;
            this.$summaries = list;
            this.$selectedSummaryWrapper$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$countryCode, this.$pagerState, this.$summaries, this.$selectedSummaryWrapper$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CollectionCountrySummaryWrapper collectionCountrySummaryWrapper;
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.$countryCode;
                if (str != null && str.length() != 0) {
                    this.label = 1;
                    if (PagerState.animateScrollToPage$default(this.$pagerState, 1, 0.0f, null, this, 6, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            MutableState<CollectionCountrySummaryWrapper> mutableState = this.$selectedSummaryWrapper$delegate;
            String str2 = this.$countryCode;
            if (str2 == null) {
                collectionCountrySummaryWrapper = (CollectionCountrySummaryWrapper) CollectionsKt.firstOrNull((List) this.$summaries);
                if (collectionCountrySummaryWrapper == null) {
                    collectionCountrySummaryWrapper = new CollectionCountrySummaryWrapper("", CollectionsKt.emptyList());
                }
            } else {
                Iterator<T> it = this.$summaries.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (Intrinsics.areEqual(((CollectionCountrySummaryWrapper) obj2).getCountryCode(), str2)) {
                        break;
                    }
                }
                collectionCountrySummaryWrapper = (CollectionCountrySummaryWrapper) obj2;
                if (collectionCountrySummaryWrapper == null) {
                    collectionCountrySummaryWrapper = new CollectionCountrySummaryWrapper("", CollectionsKt.emptyList());
                }
            }
            CollectionDistributionKt$CollectionDistribution$1.invoke$lambda$10(mutableState, collectionCountrySummaryWrapper);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$4(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CollectionCountrySummaryWrapper invoke$lambda$9(MutableState<CollectionCountrySummaryWrapper> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$10(MutableState<CollectionCountrySummaryWrapper> mutableState, CollectionCountrySummaryWrapper collectionCountrySummaryWrapper) {
        mutableState.setValue(collectionCountrySummaryWrapper);
    }
}
