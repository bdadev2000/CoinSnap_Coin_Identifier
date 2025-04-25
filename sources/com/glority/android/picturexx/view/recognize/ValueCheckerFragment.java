package com.glority.android.picturexx.view.recognize;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowBackIosNewKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavController;
import androidx.navigation.NavGraph;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.NavOptionsBuilderKt;
import androidx.navigation.PopUpToBuilder;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.glority.android.cmsui2.bean.VarietyV2Entity;
import com.glority.android.cmsui2.entity.GradeItem;
import com.glority.android.cmsui2.util.GradingLevelScaleConvertor;
import com.glority.android.compose.base.fragment.ComposeBaseFragment;
import com.glority.android.compose.extensions.UnitExtensionsKt;
import com.glority.android.compose.ui.ImageKt;
import com.glority.android.compose.ui.ResizableTextKt;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.entity.ValueCheckUiEntity;
import com.glority.android.picturexx.js.BusinessJsWebviewBottomSheetFragment;
import com.glority.android.picturexx.recognize.CoreActivity;
import com.glority.android.picturexx.repository.CmsRepository;
import com.glority.android.picturexx.theme.ThemeKt;
import com.glority.android.picturexx.view.dialog.GradeLevelDialog;
import com.glority.android.picturexx.view.dialog.VarietySelectDialog;
import com.glority.android.picturexx.view.dialog.YearSelectDialog;
import com.glority.android.picturexx.vm.IdentificationResultViewModel;
import com.glority.android.picturexx.vm.MainRecognizeProcess;
import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.utils.StatusBarUtils;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsStaticUrl;
import com.glority.utils.stability.LogUtils;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: ValueCheckerFragment.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\r\u0010\u000e\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010\u0017JA\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u001fH\u0003¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u001aH\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006#"}, d2 = {"Lcom/glority/android/picturexx/view/recognize/ValueCheckerFragment;", "Lcom/glority/android/compose/base/fragment/ComposeBaseFragment;", "<init>", "()V", "vm", "Lcom/glority/android/picturexx/vm/IdentificationResultViewModel;", "getVm", "()Lcom/glority/android/picturexx/vm/IdentificationResultViewModel;", "vm$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Content", "valueCheckUiEntity", "Lcom/glority/android/picturexx/entity/ValueCheckUiEntity;", "findNavController", "Landroidx/navigation/NavController;", "(Lcom/glority/android/picturexx/entity/ValueCheckUiEntity;Landroidx/navigation/NavController;Landroidx/compose/runtime/Composer;I)V", "ValueCheckTable", "(Lcom/glority/android/picturexx/entity/ValueCheckUiEntity;Landroidx/compose/runtime/Composer;I)V", "TableCell", Args.title, "", "content", "visibleTips", "", "onTipsClick", "Lkotlin/Function0;", "onClick", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "getLogPageName", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ValueCheckerFragment extends ComposeBaseFragment {
    public static final int $stable = 8;

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    private final Lazy vm;

    public ValueCheckerFragment() {
        final ValueCheckerFragment valueCheckerFragment = this;
        final Function0 function0 = null;
        this.vm = FragmentViewModelLazyKt.createViewModelLazy(valueCheckerFragment, Reflection.getOrCreateKotlinClass(IdentificationResultViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.recognize.ValueCheckerFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.recognize.ValueCheckerFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = valueCheckerFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.recognize.ValueCheckerFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: Access modifiers changed from: private */
    public final IdentificationResultViewModel getVm() {
        return (IdentificationResultViewModel) this.vm.getValue();
    }

    @Override // com.glority.android.compose.base.fragment.ComposeBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        updateCommonEventArgs(TuplesKt.to("from", getLogPageName()), TuplesKt.to("id", String.valueOf(CollectionsKt.firstOrNull((List) getVm().getItemIds()))));
    }

    @Override // com.glority.android.compose.base.fragment.ComposeBaseFragment
    public void ComposeContent(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1283584090);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1283584090, i, -1, "com.glority.android.picturexx.view.recognize.ValueCheckerFragment.ComposeContent (ValueCheckerFragment.kt:92)");
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = getVm().getValueCheckUiEntity();
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ValueCheckUiEntity valueCheckUiEntity = (ValueCheckUiEntity) rememberedValue;
        if (valueCheckUiEntity != null) {
            Content(valueCheckUiEntity, FragmentKt.findNavController(this), startRestartGroup, 584);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.recognize.ValueCheckerFragment$ComposeContent$1
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
                    ValueCheckerFragment.this.ComposeContent(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Content(final ValueCheckUiEntity valueCheckUiEntity, final NavController navController, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1019842705);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1019842705, i, -1, "com.glority.android.picturexx.view.recognize.ValueCheckerFragment.Content (ValueCheckerFragment.kt:106)");
        }
        ThemeKt.AppTheme(false, ComposableLambdaKt.composableLambda(startRestartGroup, -1027258149, true, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.recognize.ValueCheckerFragment$Content$1
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
                if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1027258149, i2, -1, "com.glority.android.picturexx.view.recognize.ValueCheckerFragment.Content.<anonymous> (ValueCheckerFragment.kt:108)");
                    }
                    final ValueCheckerFragment valueCheckerFragment = ValueCheckerFragment.this;
                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, -1503679081, true, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.recognize.ValueCheckerFragment$Content$1.1
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i3) {
                            if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1503679081, i3, -1, "com.glority.android.picturexx.view.recognize.ValueCheckerFragment.Content.<anonymous>.<anonymous> (ValueCheckerFragment.kt:110)");
                                }
                                Function2<Composer, Integer, Unit> m7906getLambda1$businessMod_release = ComposableSingletons$ValueCheckerFragmentKt.INSTANCE.m7906getLambda1$businessMod_release();
                                final ValueCheckerFragment valueCheckerFragment2 = ValueCheckerFragment.this;
                                AppBarKt.m2090CenterAlignedTopAppBarGHTll3U(m7906getLambda1$businessMod_release, null, ComposableLambdaKt.composableLambda(composer3, 1398111952, true, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.recognize.ValueCheckerFragment.Content.1.1.1
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i4) {
                                        if ((i4 & 11) != 2 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1398111952, i4, -1, "com.glority.android.picturexx.view.recognize.ValueCheckerFragment.Content.<anonymous>.<anonymous>.<anonymous> (ValueCheckerFragment.kt:113)");
                                            }
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            final ValueCheckerFragment valueCheckerFragment3 = ValueCheckerFragment.this;
                                            IconKt.m2471Iconww6aTOc(ArrowBackIosNewKt.getArrowBackIosNew(Icons.INSTANCE.getDefault()), (String) null, ClickableKt.m573clickableXHw0xAI$default(companion, false, null, null, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.recognize.ValueCheckerFragment.Content.1.1.1.1
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
                                                    ComposeBaseFragment.logEvent$default(ValueCheckerFragment.this, LogEvents.valuechecker_back_click, null, 2, null);
                                                    CoreActivity.Companion companion2 = CoreActivity.INSTANCE;
                                                    FragmentActivity requireActivity = ValueCheckerFragment.this.requireActivity();
                                                    Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.glority.android.ui.base.RuntimePermissionActivity");
                                                    companion2.start((RuntimePermissionActivity) requireActivity, new MainRecognizeProcess(), (r17 & 4) != 0 ? 1 : 2, (r17 & 8) != 0 ? false : true, LogEvents.valuechecker, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null);
                                                    ViewExtensionsKt.finish(ValueCheckerFragment.this);
                                                }
                                            }, 7, null), 0L, composer4, 48, 8);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), null, 0.0f, null, null, null, composer3, 390, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    });
                    final ValueCheckUiEntity valueCheckUiEntity2 = valueCheckUiEntity;
                    final ValueCheckerFragment valueCheckerFragment2 = ValueCheckerFragment.this;
                    final NavController navController2 = navController;
                    ScaffoldKt.m2729ScaffoldTvnljyQ(null, composableLambda, null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.composableLambda(composer2, -1717096724, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.recognize.ValueCheckerFragment$Content$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues it, Composer composer3, int i3) {
                            int i4;
                            Intrinsics.checkNotNullParameter(it, "it");
                            if ((i3 & 14) == 0) {
                                i4 = i3 | (composer3.changed(it) ? 4 : 2);
                            } else {
                                i4 = i3;
                            }
                            if ((i4 & 91) != 18 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1717096724, i4, -1, "com.glority.android.picturexx.view.recognize.ValueCheckerFragment.Content.<anonymous>.<anonymous> (ValueCheckerFragment.kt:130)");
                                }
                                float f = 16;
                                Modifier m987paddingVpY3zN4$default = PaddingKt.m987paddingVpY3zN4$default(PaddingKt.padding(Modifier.INSTANCE, it), Dp.m6997constructorimpl(f), 0.0f, 2, null);
                                final ValueCheckUiEntity valueCheckUiEntity3 = ValueCheckUiEntity.this;
                                final ValueCheckerFragment valueCheckerFragment3 = valueCheckerFragment2;
                                final NavController navController3 = navController2;
                                ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m987paddingVpY3zN4$default);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer m4008constructorimpl = Updater.m4008constructorimpl(composer3);
                                Updater.m4015setimpl(m4008constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                Modifier verticalScroll$default = ScrollKt.verticalScroll$default(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                                ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, verticalScroll$default);
                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor2);
                                } else {
                                    composer3.useNode();
                                }
                                Composer m4008constructorimpl2 = Updater.m4008constructorimpl(composer3);
                                Updater.m4015setimpl(m4008constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                ImageKt.GlImage(valueCheckUiEntity3.getMergeImage(), ClipKt.clip(AspectRatioKt.aspectRatio$default(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 1.8770053f, false, 2, null), RoundedCornerShapeKt.m1268RoundedCornerShape0680j_4(Dp.m6997constructorimpl(10))), 0.0f, ContentScale.INSTANCE.getCrop(), 0.0f, null, null, null, null, null, composer3, 3072, 1012);
                                TextKt.m3014Text4IGK_g(valueCheckUiEntity3.getTitle(), PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(32), 0.0f, 0.0f, 13, null), ColorKt.Color(4280427042L), TextUnitKt.getSp(20), (FontStyle) null, new FontWeight(600), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 200112, 0, 131024);
                                valueCheckerFragment3.ValueCheckTable(valueCheckUiEntity3, composer3, 72);
                                ResizableTextKt.m7716ResizableText4IGK_g(UnitExtensionsKt.getSr(R.string.coinselect_selectgrade_caption_prefillpolicy, composer3, 0), PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(20), 0.0f, 0.0f, 13, null), ColorKt.Color(4280427042L), TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, 0, composer3, 3504, 0, 131056);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ValueCheckerFragmentKt.m7917GlButtonTgFrcIs(SizeKt.fillMaxWidth$default(WindowInsetsPadding_androidKt.navigationBarsPadding(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(f), 0.0f, Dp.m6997constructorimpl(30), 5, null)), 0.0f, 1, null), UnitExtensionsKt.getSr(R.string.coinselect_selectgrade_action_check, composer3, 0), 0L, RoundedCornerShapeKt.m1268RoundedCornerShape0680j_4(Dp.m6997constructorimpl(4)), false, false, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.recognize.ValueCheckerFragment$Content$1$2$1$2
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
                                        ComposeBaseFragment.logEvent$default(ValueCheckerFragment.this, LogEvents.valuechecker_viewprice_click, null, 2, null);
                                        ValueCheckerFragment.this.getVm().setGrade(valueCheckUiEntity3.getSelectedGrade());
                                        ValueCheckerFragment.this.getVm().setYear(valueCheckUiEntity3.getSelectedYear());
                                        ValueCheckerFragment.this.getVm().setVarietyUid(valueCheckUiEntity3.getSelectedVarietyUid());
                                        ValueCheckerFragment.this.getVm().setSpeciesUid(valueCheckUiEntity3.getSelectedSpeciesUid());
                                        ValueCheckerFragment valueCheckerFragment4 = ValueCheckerFragment.this;
                                        int i5 = R.id.action_value_check_fragment_to_nav_graph_grading_identify2;
                                        final NavController navController4 = navController3;
                                        com.glority.base.ext.ViewExtensionsKt.navigateWithHandOnBundle$default(valueCheckerFragment4, i5, null, NavOptionsBuilderKt.navOptions(new Function1<NavOptionsBuilder, Unit>() { // from class: com.glority.android.picturexx.view.recognize.ValueCheckerFragment$Content$1$2$1$2.1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(NavOptionsBuilder navOptionsBuilder) {
                                                invoke2(navOptionsBuilder);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(NavOptionsBuilder navOptions) {
                                                Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
                                                navOptions.popUpTo(NavGraph.INSTANCE.findStartDestination(NavController.this.getGraph()).getId(), new Function1<PopUpToBuilder, Unit>() { // from class: com.glority.android.picturexx.view.recognize.ValueCheckerFragment.Content.1.2.1.2.1.1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(PopUpToBuilder popUpToBuilder) {
                                                        invoke2(popUpToBuilder);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(PopUpToBuilder popUpTo) {
                                                        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
                                                        popUpTo.setInclusive(true);
                                                    }
                                                });
                                            }
                                        }), null, 10, null);
                                    }
                                }, composer3, 0, 52);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 805306416, 509);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, 48, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.recognize.ValueCheckerFragment$Content$2
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
                    ValueCheckerFragment.this.Content(valueCheckUiEntity, navController, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ValueCheckTable(final ValueCheckUiEntity valueCheckUiEntity, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1908875008);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1908875008, i, -1, "com.glority.android.picturexx.view.recognize.ValueCheckerFragment.ValueCheckTable (ValueCheckerFragment.kt:199)");
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context context = (Context) consume;
        float f = 10;
        Modifier clip = ClipKt.clip(BorderKt.m551borderxT4_qwU(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(20), 0.0f, 0.0f, 13, null), Dp.m6997constructorimpl(1), ColorKt.Color(4292861919L), RoundedCornerShapeKt.m1268RoundedCornerShape0680j_4(Dp.m6997constructorimpl(f))), RoundedCornerShapeKt.m1268RoundedCornerShape0680j_4(Dp.m6997constructorimpl(f)));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, clip);
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
        String sr = UnitExtensionsKt.getSr(R.string.collection_popups_yeartitle, startRestartGroup, 0);
        String selectedYear = valueCheckUiEntity.getSelectedYear();
        startRestartGroup.startReplaceableGroup(450910328);
        if (selectedYear == null) {
            selectedYear = UnitExtensionsKt.getSr(R.string.coinselect_selectgrade_option_uncertain, startRestartGroup, 0);
        }
        startRestartGroup.endReplaceableGroup();
        TableCell(sr, selectedYear, false, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.recognize.ValueCheckerFragment$ValueCheckTable$1$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.recognize.ValueCheckerFragment$ValueCheckTable$1$2
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
                ComposeBaseFragment.logEvent$default(ValueCheckerFragment.this, LogEvents.valuechecker_year_click, null, 2, null);
                if (!valueCheckUiEntity.getYearRange().isEmpty()) {
                    YearSelectDialog yearSelectDialog = YearSelectDialog.INSTANCE;
                    Context context2 = context;
                    List<String> yearRange = valueCheckUiEntity.getYearRange();
                    String selectedYear2 = valueCheckUiEntity.getSelectedYear();
                    if (selectedYear2 == null) {
                        selectedYear2 = "";
                    }
                    final ValueCheckUiEntity valueCheckUiEntity2 = valueCheckUiEntity;
                    yearSelectDialog.show(context2, yearRange, selectedYear2, new Function1<String, Unit>() { // from class: com.glority.android.picturexx.view.recognize.ValueCheckerFragment$ValueCheckTable$1$2.1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(String str) {
                            invoke2(str);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(String it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            ValueCheckUiEntity.this.setYear(it);
                        }
                    });
                }
            }
        }, startRestartGroup, 265600);
        float f2 = 14;
        float f3 = (float) 0.5d;
        DividerKt.m2393HorizontalDivider9IZ8Weo(PaddingKt.m987paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6997constructorimpl(f2), 0.0f, 2, null), Dp.m6997constructorimpl(f3), 0L, startRestartGroup, 54, 4);
        String sr2 = UnitExtensionsKt.getSr(R.string.id_price_variety, startRestartGroup, 0);
        String selectedVarietyDisplayName = valueCheckUiEntity.getSelectedVarietyDisplayName();
        startRestartGroup.startReplaceableGroup(450911280);
        if (selectedVarietyDisplayName == null) {
            selectedVarietyDisplayName = UnitExtensionsKt.getSr(R.string.coinselect_selectgrade_option_uncertain, startRestartGroup, 0);
        }
        startRestartGroup.endReplaceableGroup();
        TableCell(sr2, selectedVarietyDisplayName, true, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.recognize.ValueCheckerFragment$ValueCheckTable$1$3
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
                ValueCheckerFragment valueCheckerFragment = ValueCheckerFragment.this;
                valueCheckerFragment.logEvent(LogEvents.variety_tips_click, BundleKt.bundleOf(TuplesKt.to("from", valueCheckerFragment.getLogPageName())));
                ComposeBaseFragment.showProgress$default(ValueCheckerFragment.this, null, false, 3, null);
                CmsRepository cmsRepository = CmsRepository.INSTANCE;
                final ValueCheckerFragment valueCheckerFragment2 = ValueCheckerFragment.this;
                final Context context2 = context;
                cmsRepository.getStaticUrlMessageByCacheOrNetwork(null, CollectionDetailEditDialogFragment.VARIETY_TIP, new Function1<CmsStaticUrl, Unit>() { // from class: com.glority.android.picturexx.view.recognize.ValueCheckerFragment$ValueCheckTable$1$3.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(CmsStaticUrl cmsStaticUrl) {
                        invoke2(cmsStaticUrl);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(CmsStaticUrl cmsStaticUrl) {
                        ValueCheckerFragment.this.hideProgress();
                        FragmentActivity activity = ValueCheckerFragment.this.getActivity();
                        if (activity != null) {
                            BusinessJsWebviewBottomSheetFragment.INSTANCE.open(activity, cmsStaticUrl != null ? cmsStaticUrl.getLightUrl() : null, context2.getString(R.string.id_price_variety), null);
                        }
                    }
                });
            }
        }, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.recognize.ValueCheckerFragment$ValueCheckTable$1$4
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
                ComposeBaseFragment.logEvent$default(ValueCheckerFragment.this, LogEvents.valuechecker_variety_click, null, 2, null);
                List<VarietyV2Entity> currentYearVarietyList = valueCheckUiEntity.getCurrentYearVarietyList();
                if (currentYearVarietyList == null || !(!currentYearVarietyList.isEmpty())) {
                    return;
                }
                VarietySelectDialog varietySelectDialog = VarietySelectDialog.INSTANCE;
                Context context2 = context;
                String selectedVarietyUid = valueCheckUiEntity.getSelectedVarietyUid();
                if (selectedVarietyUid == null) {
                    selectedVarietyUid = "";
                }
                final ValueCheckUiEntity valueCheckUiEntity2 = valueCheckUiEntity;
                varietySelectDialog.show(context2, currentYearVarietyList, selectedVarietyUid, new Function1<VarietyV2Entity, Unit>() { // from class: com.glority.android.picturexx.view.recognize.ValueCheckerFragment$ValueCheckTable$1$4.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(VarietyV2Entity varietyV2Entity) {
                        invoke2(varietyV2Entity);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(VarietyV2Entity varietyV2Entity) {
                        ValueCheckUiEntity.this.setSelectedVarietyUid(varietyV2Entity != null ? varietyV2Entity.getVarietyUid() : null);
                        ValueCheckUiEntity.this.setSelectedSpeciesUid(varietyV2Entity != null ? varietyV2Entity.getSpeciesUid() : null);
                    }
                });
            }
        }, startRestartGroup, 262528);
        DividerKt.m2393HorizontalDivider9IZ8Weo(PaddingKt.m987paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6997constructorimpl(f2), 0.0f, 2, null), Dp.m6997constructorimpl(f3), 0L, startRestartGroup, 54, 4);
        String sr3 = UnitExtensionsKt.getSr(R.string.collection_grade, startRestartGroup, 0);
        String selectedGrade = valueCheckUiEntity.getSelectedGrade();
        startRestartGroup.startReplaceableGroup(450913281);
        if (selectedGrade == null) {
            selectedGrade = UnitExtensionsKt.getSr(R.string.coinselect_selectgrade_option_uncertain, startRestartGroup, 0);
        }
        startRestartGroup.endReplaceableGroup();
        TableCell(sr3, selectedGrade, true, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.recognize.ValueCheckerFragment$ValueCheckTable$1$5
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
                ValueCheckerFragment valueCheckerFragment = ValueCheckerFragment.this;
                valueCheckerFragment.logEvent(LogEvents.grade_tips_click, BundleKt.bundleOf(TuplesKt.to("from", valueCheckerFragment.getLogPageName())));
                ComposeBaseFragment.showProgress$default(ValueCheckerFragment.this, null, false, 3, null);
                CmsRepository cmsRepository = CmsRepository.INSTANCE;
                final ValueCheckerFragment valueCheckerFragment2 = ValueCheckerFragment.this;
                final Context context2 = context;
                cmsRepository.getStaticUrlMessageByCacheOrNetwork(null, "grade_tip", new Function1<CmsStaticUrl, Unit>() { // from class: com.glority.android.picturexx.view.recognize.ValueCheckerFragment$ValueCheckTable$1$5.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(CmsStaticUrl cmsStaticUrl) {
                        invoke2(cmsStaticUrl);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(CmsStaticUrl cmsStaticUrl) {
                        ValueCheckerFragment.this.hideProgress();
                        ValueCheckerFragment valueCheckerFragment3 = ValueCheckerFragment.this;
                        Context context3 = context2;
                        try {
                            BusinessJsWebviewBottomSheetFragment.Companion companion = BusinessJsWebviewBottomSheetFragment.INSTANCE;
                            FragmentActivity requireActivity = valueCheckerFragment3.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                            companion.open(requireActivity, cmsStaticUrl != null ? cmsStaticUrl.getLightUrl() : null, context3.getString(R.string.collection_grade), null);
                            Unit unit = Unit.INSTANCE;
                        } catch (Exception e) {
                            if (AppContext.INSTANCE.isDebugMode()) {
                                LogUtils.e(Log.getStackTraceString(e));
                            }
                        }
                    }
                });
            }
        }, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.recognize.ValueCheckerFragment$ValueCheckTable$1$6
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

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ComposeBaseFragment.logEvent$default(ValueCheckerFragment.this, LogEvents.valuechecker_grade_click, null, 2, null);
                List<? extends GradeItem> list = GradingLevelScaleConvertor.INSTANCE.getTypeLevelMap().get(GradingLevelScaleConvertor.INSTANCE.getDefaultScaleType(AppViewModel.INSTANCE.getInstance().getCountryCode()));
                List<? extends GradeItem> list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    return;
                }
                GradeLevelDialog gradeLevelDialog = GradeLevelDialog.INSTANCE;
                Context context2 = context;
                String selectedGrade2 = valueCheckUiEntity.getSelectedGrade();
                final ValueCheckUiEntity valueCheckUiEntity2 = valueCheckUiEntity;
                gradeLevelDialog.open(context2, list, selectedGrade2, new Function1<String, Unit>() { // from class: com.glority.android.picturexx.view.recognize.ValueCheckerFragment$ValueCheckTable$1$6.1
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
                        ValueCheckUiEntity.this.setSelectedGrade(str);
                    }
                });
            }
        }, startRestartGroup, 262528);
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
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.recognize.ValueCheckerFragment$ValueCheckTable$2
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
                    ValueCheckerFragment.this.ValueCheckTable(valueCheckUiEntity, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void TableCell(final String str, final String str2, final boolean z, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(203176333);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        if ((46811 & i2) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(203176333, i2, -1, "com.glority.android.picturexx.view.recognize.ValueCheckerFragment.TableCell (ValueCheckerFragment.kt:322)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            startRestartGroup.startReplaceableGroup(918329877);
            boolean changedInstance = startRestartGroup.changedInstance(function02);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.view.recognize.ValueCheckerFragment$TableCell$1$1
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
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m985padding3ABfNKs(ClickableKt.m573clickableXHw0xAI$default(companion, false, null, null, (Function0) rememberedValue, 7, null), Dp.m6997constructorimpl(14)), 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
            Updater.m4015setimpl(m4008constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
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
            Updater.m4015setimpl(m4008constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            ResizableTextKt.m7716ResizableText4IGK_g(str, null, ColorKt.Color(4280427042L), TextUnitKt.getSp(16), null, new FontWeight(500), null, 0L, null, null, TextUnitKt.getSp(22), 0, false, 0, 0, null, 0, startRestartGroup, (i2 & 14) | 200064, 6, 130002);
            startRestartGroup.startReplaceableGroup(66219990);
            if (z) {
                Modifier m1030size3ABfNKs = SizeKt.m1030size3ABfNKs(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6997constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), Dp.m6997constructorimpl(16));
                startRestartGroup.startReplaceableGroup(918330648);
                boolean changedInstance2 = startRestartGroup.changedInstance(function0);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.view.recognize.ValueCheckerFragment$TableCell$2$1$1$1
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
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                i3 = 8;
                ImageKt.GlImage(UnitExtensionsKt.getPr(R.drawable.icon_tips, startRestartGroup, 0), ClickableKt.m573clickableXHw0xAI$default(m1030size3ABfNKs, false, null, null, (Function0) rememberedValue2, 7, null), 0.0f, null, 0.0f, null, null, null, null, null, startRestartGroup, 8, 1020);
            } else {
                i3 = 8;
            }
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float f = i3;
            Modifier weight$default = RowScope.weight$default(rowScopeInstance, PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6997constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false, 2, null);
            Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(end, centerVertically2, startRestartGroup, 54);
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
            Updater.m4015setimpl(m4008constructorimpl3, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl3.getInserting() || !Intrinsics.areEqual(m4008constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m4008constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m4008constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m4015setimpl(m4008constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            ResizableTextKt.m7716ResizableText4IGK_g(str2, PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m6997constructorimpl(f), 0.0f, 11, null), ColorKt.Color(4280427042L), TextUnitKt.getSp(16), null, new FontWeight(600), null, 0L, null, null, TextUnitKt.getSp(22), 0, false, 0, 0, null, 0, startRestartGroup, ((i2 >> 3) & 14) | 200112, 6, 130000);
            ImageKt.GlImage(UnitExtensionsKt.getPr(R.drawable.icon_more_black_circle, startRestartGroup, 0), SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(16)), 0.0f, null, 0.0f, null, null, null, null, null, startRestartGroup, 1572920, 956);
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
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.recognize.ValueCheckerFragment$TableCell$3
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
                    ValueCheckerFragment.this.TableCell(str, str2, z, function0, function02, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.compose.base.fragment.ComposeBaseFragment
    public String getLogPageName() {
        return LogEvents.valuechecker;
    }
}
