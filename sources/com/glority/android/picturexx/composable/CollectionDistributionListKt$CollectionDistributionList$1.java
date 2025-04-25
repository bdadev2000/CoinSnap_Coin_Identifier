package com.glority.android.picturexx.composable;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.gestures.DraggableKt;
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
import com.glority.android.picturexx.composable.CollectionDistributionListKt$CollectionDistributionList$1;
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
/* compiled from: CollectionDistributionList.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class CollectionDistributionListKt$CollectionDistributionList$1 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ String $initCountryCode;
    final /* synthetic */ Function1<CollectionItem, Unit> $onCollectionClick;
    final /* synthetic */ Function1<CollectionCountrySummaryWrapper, Unit> $onCountrySelected;
    final /* synthetic */ List<CollectionCountrySummaryWrapper> $summaryWrapper;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CollectionDistributionListKt$CollectionDistributionList$1(String str, List<CollectionCountrySummaryWrapper> list, Function1<? super CollectionItem, Unit> function1, Function1<? super CollectionCountrySummaryWrapper, Unit> function12) {
        super(3);
        this.$initCountryCode = str;
        this.$summaryWrapper = list;
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
                ComposerKt.traceEventStart(-47231223, i2, -1, "com.glority.android.picturexx.composable.CollectionDistributionList.<anonymous> (CollectionDistributionList.kt:110)");
            }
            float mo893getMaxHeightD9Ej5fM = BoxWithConstraints.mo893getMaxHeightD9Ej5fM();
            min_height = CollectionDistributionListKt.getMIN_HEIGHT(composer, 0);
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
            ((Density) consume4).mo673toDpu2uoSUM(invoke$lambda$4(mutableFloatState));
            composer.startReplaceableGroup(658504300);
            boolean changed = composer.changed(mutableFloatState) | composer.changed(mo677toPx0680j_42) | composer.changed(mo677toPx0680j_4);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function1) new Function1<Float, Unit>() { // from class: com.glority.android.picturexx.composable.CollectionDistributionListKt$CollectionDistributionList$1$draggableState$1$1
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
                        invoke$lambda$4 = CollectionDistributionListKt$CollectionDistributionList$1.invoke$lambda$4(mutableFloatState);
                        mutableFloatState.setFloatValue(RangesKt.coerceIn(invoke$lambda$4 - f, Math.min(mo677toPx0680j_42, mo677toPx0680j_4), Math.max(mo677toPx0680j_42, mo677toPx0680j_4)));
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            DraggableKt.rememberDraggableState((Function1) rememberedValue2, composer, 0);
            final PagerState rememberPagerState = PagerStateKt.rememberPagerState(this.$initCountryCode != null ? 1 : 0, 0.0f, new Function0<Integer>() { // from class: com.glority.android.picturexx.composable.CollectionDistributionListKt$CollectionDistributionList$1$pagerState$1
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
            BackHandlerKt.BackHandler(rememberPagerState.getCurrentPage() == 1, new Function0<Unit>() { // from class: com.glority.android.picturexx.composable.CollectionDistributionListKt$CollectionDistributionList$1.1
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
                /* compiled from: CollectionDistributionList.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                @DebugMetadata(c = "com.glority.android.picturexx.composable.CollectionDistributionListKt$CollectionDistributionList$1$1$1", f = "CollectionDistributionList.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.glority.android.picturexx.composable.CollectionDistributionListKt$CollectionDistributionList$1$1$1, reason: invalid class name and collision with other inner class name */
                /* loaded from: classes2.dex */
                public static final class C00951 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ PagerState $pagerState;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00951(PagerState pagerState, Continuation<? super C00951> continuation) {
                        super(2, continuation);
                        this.$pagerState = pagerState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C00951(this.$pagerState, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C00951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C00951(PagerState.this, null), 3, null);
                    }
                }
            }, composer, 0, 0);
            SurfaceKt.m2864SurfaceT9BRK9s(BoxWithConstraints.align(SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 1, null), Alignment.INSTANCE.getBottomCenter()), null, Color.INSTANCE.m4552getWhite0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composer, -1060318748, true, new AnonymousClass2(rememberPagerState, this.$initCountryCode, this.$summaryWrapper, this.$onCollectionClick, coroutineScope, this.$onCountrySelected)), composer, 12583296, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CollectionDistributionList.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 0, 0}, xi = 82)
    /* renamed from: com.glority.android.picturexx.composable.CollectionDistributionListKt$CollectionDistributionList$1$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ CoroutineScope $coroutineScope;
        final /* synthetic */ String $initCountryCode;
        final /* synthetic */ Function1<CollectionItem, Unit> $onCollectionClick;
        final /* synthetic */ Function1<CollectionCountrySummaryWrapper, Unit> $onCountrySelected;
        final /* synthetic */ PagerState $pagerState;
        final /* synthetic */ List<CollectionCountrySummaryWrapper> $summaryWrapper;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(PagerState pagerState, String str, List<CollectionCountrySummaryWrapper> list, Function1<? super CollectionItem, Unit> function1, CoroutineScope coroutineScope, Function1<? super CollectionCountrySummaryWrapper, Unit> function12) {
            super(2);
            this.$pagerState = pagerState;
            this.$initCountryCode = str;
            this.$summaryWrapper = list;
            this.$onCollectionClick = function1;
            this.$coroutineScope = coroutineScope;
            this.$onCountrySelected = function12;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            CollectionCountrySummaryWrapper collectionCountrySummaryWrapper;
            Object obj;
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1060318748, i, -1, "com.glority.android.picturexx.composable.CollectionDistributionList.<anonymous>.<anonymous> (CollectionDistributionList.kt:160)");
                }
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                final PagerState pagerState = this.$pagerState;
                String str = this.$initCountryCode;
                final List<CollectionCountrySummaryWrapper> list = this.$summaryWrapper;
                final Function1<CollectionItem, Unit> function1 = this.$onCollectionClick;
                final CoroutineScope coroutineScope = this.$coroutineScope;
                final Function1<CollectionCountrySummaryWrapper, Unit> function12 = this.$onCountrySelected;
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxSize$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer m4008constructorimpl = Updater.m4008constructorimpl(composer);
                Updater.m4015setimpl(m4008constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier m1016height3ABfNKs = SizeKt.m1016height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen.x36, composer, 0));
                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, m1016height3ABfNKs);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer m4008constructorimpl2 = Updater.m4008constructorimpl(composer);
                Updater.m4015setimpl(m4008constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerStart(composer, -492369756, "CC(remember):Composables.kt#9igjgp");
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    if (str == null) {
                        collectionCountrySummaryWrapper = (CollectionCountrySummaryWrapper) CollectionsKt.firstOrNull((List) list);
                        if (collectionCountrySummaryWrapper == null) {
                            collectionCountrySummaryWrapper = new CollectionCountrySummaryWrapper("", CollectionsKt.emptyList());
                        }
                    } else {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            } else {
                                obj = it.next();
                                if (Intrinsics.areEqual(((CollectionCountrySummaryWrapper) obj).getCountryCode(), str)) {
                                    break;
                                }
                            }
                        }
                        collectionCountrySummaryWrapper = (CollectionCountrySummaryWrapper) obj;
                        if (collectionCountrySummaryWrapper == null) {
                            collectionCountrySummaryWrapper = new CollectionCountrySummaryWrapper("", CollectionsKt.emptyList());
                        }
                    }
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(collectionCountrySummaryWrapper, null, 2, null);
                    composer.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                final MutableState mutableState = (MutableState) rememberedValue;
                PagerKt.m1222HorizontalPageroI3XNZo(pagerState, ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null), null, null, 0, 0.0f, Alignment.INSTANCE.getTop(), null, false, false, null, null, null, ComposableLambdaKt.composableLambda(composer, -227212852, true, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.CollectionDistributionListKt$CollectionDistributionList$1$2$1$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer2, Integer num2) {
                        invoke(pagerScope, num.intValue(), composer2, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PagerScope HorizontalPager, int i2, Composer composer2, int i3) {
                        CollectionCountrySummaryWrapper invoke$lambda$5$lambda$3;
                        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-227212852, i3, -1, "com.glority.android.picturexx.composable.CollectionDistributionList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CollectionDistributionList.kt:204)");
                        }
                        if (i2 == 0) {
                            composer2.startReplaceableGroup(-311076976);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            List<CollectionCountrySummaryWrapper> list2 = list;
                            final CoroutineScope coroutineScope2 = coroutineScope;
                            final MutableState<CollectionCountrySummaryWrapper> mutableState2 = mutableState;
                            final Function1<CollectionCountrySummaryWrapper, Unit> function13 = function12;
                            final PagerState pagerState2 = pagerState;
                            CollectionDistributionListKt.CollectionDistributionPage1(companion, list2, new Function1<CollectionCountrySummaryWrapper, Unit>() { // from class: com.glority.android.picturexx.composable.CollectionDistributionListKt$CollectionDistributionList$1$2$1$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(CollectionCountrySummaryWrapper collectionCountrySummaryWrapper2) {
                                    invoke2(collectionCountrySummaryWrapper2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* compiled from: CollectionDistributionList.kt */
                                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                                @DebugMetadata(c = "com.glority.android.picturexx.composable.CollectionDistributionListKt$CollectionDistributionList$1$2$1$2$1$1", f = "CollectionDistributionList.kt", i = {}, l = {217}, m = "invokeSuspend", n = {}, s = {})
                                /* renamed from: com.glority.android.picturexx.composable.CollectionDistributionListKt$CollectionDistributionList$1$2$1$2$1$1, reason: invalid class name and collision with other inner class name */
                                /* loaded from: classes2.dex */
                                public static final class C00961 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    final /* synthetic */ CollectionCountrySummaryWrapper $it;
                                    final /* synthetic */ Function1<CollectionCountrySummaryWrapper, Unit> $onCountrySelected;
                                    final /* synthetic */ PagerState $pagerState;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    C00961(CollectionCountrySummaryWrapper collectionCountrySummaryWrapper, Function1<? super CollectionCountrySummaryWrapper, Unit> function1, PagerState pagerState, Continuation<? super C00961> continuation) {
                                        super(2, continuation);
                                        this.$it = collectionCountrySummaryWrapper;
                                        this.$onCountrySelected = function1;
                                        this.$pagerState = pagerState;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                        return new C00961(this.$it, this.$onCountrySelected, this.$pagerState, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                        return ((C00961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(CollectionCountrySummaryWrapper it2) {
                                    Intrinsics.checkNotNullParameter(it2, "it");
                                    mutableState2.setValue(it2);
                                    BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new C00961(it2, function13, pagerState2, null), 3, null);
                                }
                            }, composer2, 70);
                            composer2.endReplaceableGroup();
                        } else if (i2 == 1) {
                            composer2.startReplaceableGroup(-311076112);
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            invoke$lambda$5$lambda$3 = CollectionDistributionListKt$CollectionDistributionList$1.AnonymousClass2.invoke$lambda$5$lambda$3(mutableState);
                            Modifier.Companion companion3 = companion2;
                            composer2.startReplaceableGroup(658508439);
                            boolean changed = composer2.changed(mutableState) | composer2.changedInstance(function1);
                            final Function1<CollectionItem, Unit> function14 = function1;
                            final MutableState<CollectionCountrySummaryWrapper> mutableState3 = mutableState;
                            Object rememberedValue2 = composer2.rememberedValue();
                            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = (Function1) new Function1<CollectionItem, Unit>() { // from class: com.glority.android.picturexx.composable.CollectionDistributionListKt$CollectionDistributionList$1$2$1$2$2$1
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
                                    public final void invoke2(CollectionItem it2) {
                                        CollectionCountrySummaryWrapper invoke$lambda$5$lambda$32;
                                        Intrinsics.checkNotNullParameter(it2, "it");
                                        invoke$lambda$5$lambda$32 = CollectionDistributionListKt$CollectionDistributionList$1.AnonymousClass2.invoke$lambda$5$lambda$3(mutableState3);
                                        new LogEventRequest(LogEvents.Collection_Map_Detail_Item_Click, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("id", invoke$lambda$5$lambda$32.getCountryCode()), TuplesKt.to(LogEventArguments.ARG_INTEGER_1, it2.getCustomSeriesId())));
                                        function14.invoke(it2);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            final CoroutineScope coroutineScope3 = coroutineScope;
                            final PagerState pagerState3 = pagerState;
                            CollectionDistributionListKt.CollectionDistributionPage2(companion3, invoke$lambda$5$lambda$3, (Function1) rememberedValue2, new Function0<Unit>() { // from class: com.glority.android.picturexx.composable.CollectionDistributionListKt$CollectionDistributionList$1$2$1$2.3
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
                                /* compiled from: CollectionDistributionList.kt */
                                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                                @DebugMetadata(c = "com.glority.android.picturexx.composable.CollectionDistributionListKt$CollectionDistributionList$1$2$1$2$3$1", f = "CollectionDistributionList.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
                                /* renamed from: com.glority.android.picturexx.composable.CollectionDistributionListKt$CollectionDistributionList$1$2$1$2$3$1, reason: invalid class name */
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
                                }
                            }, composer2, 70);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(-311075058);
                            composer2.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer, 102236160, 3072, 7868);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CollectionCountrySummaryWrapper invoke$lambda$5$lambda$3(MutableState<CollectionCountrySummaryWrapper> mutableState) {
            return mutableState.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$4(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }
}
