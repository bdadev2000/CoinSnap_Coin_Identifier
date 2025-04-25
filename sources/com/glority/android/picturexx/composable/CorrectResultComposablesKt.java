package com.glority.android.picturexx.composable;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.profileinstaller.ProfileVerifier;
import com.glority.android.cmsui.entity.LikeItem;
import com.glority.android.cmsui2.util.CmsDataUtils;
import com.glority.android.picturexx.business.R;
import com.glority.android.xx.constants.Args;
import com.glority.base.composables.ComposableExtensionsKt;
import com.glority.base.utils.StatusBarUtils;
import com.glority.cmssearch.generatedAPI.kotlinAPI.cmssearch.IndexModel;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsImage;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import com.google.android.exoplayer2.audio.WavUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CorrectResultComposables.kt */
@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aÁ\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062.\u0010\u0007\u001a*\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\u000b¢\u0006\u0002\b\f2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u000b¢\u0006\u0002\b\f2\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u000b¢\u0006\u0002\b\f2*\b\u0001\u0010\u0011\u001a$\b\u0001\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0012H\u0007¢\u0006\u0002\u0010\u0016\u001a9\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u001cH\u0007¢\u0006\u0002\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f\u001a\b\u0010 \u001a\u00020\u001aH\u0002\u001a[\u0010!\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010\u000626\u0010#\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\n¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u00010\u0012H\u0007¢\u0006\u0002\u0010(\u001a\r\u0010)\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f\u001a#\u0010*\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007¢\u0006\u0002\u0010,\u001a\r\u0010-\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u001f\u001a\u0015\u0010.\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010/\u001a\r\u00100\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u001f\u001a7\u00101\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\f\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00142\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u001cH\u0007¢\u0006\u0002\u00104\u001a\f\u0010;\u001a\u00020\u001a*\u000203H\u0002\"\u001a\u00105\u001a\u0004\u0018\u00010\n*\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107\"\u001a\u0010'\u001a\u0004\u0018\u00010\n*\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00107\"\u001a\u00109\u001a\u0004\u0018\u00010\n*\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u00107¨\u0006<²\u0006\n\u0010=\u001a\u00020>X\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010?\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010@\u001a\u00020\nX\u008a\u008e\u0002"}, d2 = {"CorrectResultScreen", "", ExifInterface.GPS_DIRECTION_TRUE, "modifier", "Landroidx/compose/ui/Modifier;", "onClose", "Lkotlin/Function0;", "itemComposable", "Landroidx/compose/runtime/internal/ComposableFunction4;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/runtime/Composable;", "otherResultsComposable", "Landroidx/compose/runtime/internal/ComposableFunction1;", "Landroidx/compose/foundation/layout/ColumnScope;", "emptyContentComposable", "onSearchResult", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function6;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "CorrectResultItem", "searchText", "item", "Lcom/glority/cmssearch/generatedAPI/kotlinAPI/cmssearch/IndexModel;", "onClick", "Lkotlin/Function1;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/glority/cmssearch/generatedAPI/kotlinAPI/cmssearch/IndexModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "CorrectResultScreen_Preview", "(Landroidx/compose/runtime/Composer;I)V", "mock_IndenModel", "SuggestNameScreen", "onCloseClick", "onSendClick", "Lkotlin/ParameterName;", "name", "coinName", Args.year, "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SuggestNameScreen_Preview", "NoResultsFound", "onSuggestNameClick", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "NoResultsFoundPreview", "CoinSearchLoadingScreen", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "CoinSearchLoadingScreenPreview", "OtherResultsLayout", "otherResults", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "reverseImageUrl", "getReverseImageUrl", "(Lcom/glority/cmssearch/generatedAPI/kotlinAPI/cmssearch/IndexModel;)Ljava/lang/String;", "getYear", "composition", "getComposition", "toIndexModel", "businessMod_release", "isLoading", "", "coinNameInput", "coinYearInput"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class CorrectResultComposablesKt {
    public static final /* synthetic */ IndexModel access$mock_IndenModel() {
        return mock_IndenModel();
    }

    public static final <T> void CorrectResultScreen(final Modifier modifier, final Function0<Unit> onClose, final Function6<? super LazyItemScope, ? super Modifier, ? super String, ? super T, ? super Composer, ? super Integer, Unit> itemComposable, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> otherResultsComposable, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> emptyContentComposable, final Function2<? super String, ? super Continuation<? super List<? extends T>>, ? extends Object> onSearchResult, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Intrinsics.checkNotNullParameter(itemComposable, "itemComposable");
        Intrinsics.checkNotNullParameter(otherResultsComposable, "otherResultsComposable");
        Intrinsics.checkNotNullParameter(emptyContentComposable, "emptyContentComposable");
        Intrinsics.checkNotNullParameter(onSearchResult, "onSearchResult");
        Composer startRestartGroup = composer.startRestartGroup(1293408994);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1293408994, i, -1, "com.glority.android.picturexx.composable.CorrectResultScreen (CorrectResultComposables.kt:71)");
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final MutableState mutableState = (MutableState) rememberedValue;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final MutableState mutableState2 = (MutableState) rememberedValue2;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = SnapshotStateKt.mutableStateListOf();
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue3;
        EffectsKt.LaunchedEffect(CorrectResultScreen$lambda$4(mutableState2), new CorrectResultComposablesKt$CorrectResultScreen$1(snapshotStateList, onSearchResult, mutableState2, mutableState, null), startRestartGroup, 64);
        float f = 18;
        SurfaceKt.m2864SurfaceT9BRK9s(modifier, RoundedCornerShapeKt.m1270RoundedCornerShapea9UjIt4$default(Dp.m6997constructorimpl(f), Dp.m6997constructorimpl(f), 0.0f, 0.0f, 12, null), Color.INSTANCE.m4552getWhite0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1225847001, true, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.CorrectResultComposablesKt$CorrectResultScreen$2
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
                String CorrectResultScreen$lambda$4;
                String CorrectResultScreen$lambda$42;
                boolean CorrectResultScreen$lambda$1;
                boolean CorrectResultScreen$lambda$12;
                String CorrectResultScreen$lambda$43;
                if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1225847001, i2, -1, "com.glority.android.picturexx.composable.CorrectResultScreen.<anonymous> (CorrectResultComposables.kt:103)");
                    }
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    final MutableState<String> mutableState3 = mutableState2;
                    Function3<ColumnScope, Composer, Integer, Unit> function3 = otherResultsComposable;
                    final SnapshotStateList<T> snapshotStateList2 = snapshotStateList;
                    Function3<ColumnScope, Composer, Integer, Unit> function32 = emptyContentComposable;
                    final Function6<LazyItemScope, Modifier, String, T, Composer, Integer, Unit> function6 = itemComposable;
                    Function0<Unit> function0 = onClose;
                    MutableState<Boolean> mutableState4 = mutableState;
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
                    float f2 = 16;
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6997constructorimpl(f2), Dp.m6997constructorimpl(18), Dp.m6997constructorimpl(f2), 0.0f, 8, null), 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
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
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    IconButtonKt.IconButton(function0, boxScopeInstance.align(SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(24)), Alignment.INSTANCE.getCenterStart()), false, null, null, ComposableSingletons$CorrectResultComposablesKt.INSTANCE.m7766getLambda1$businessMod_release(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
                    TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.global_correctresult_title, composer2, 0), boxScopeInstance.align(SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null), Alignment.INSTANCE.getCenter()), ComposableExtensionsKt.asColor(R.color.DarkGray, composer2, 0), TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(24), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 6, 130032);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.global_correctresult_text, composer2, 0), SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6997constructorimpl(f2), Dp.m6997constructorimpl(28), Dp.m6997constructorimpl(f2), 0.0f, 8, null), 0.0f, 1, null), null, false, 3, null), ComposableExtensionsKt.asColor(R.color.Grey666666, composer2, 0), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(22), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 6, 130032);
                    CorrectResultScreen$lambda$4 = CorrectResultComposablesKt.CorrectResultScreen$lambda$4(mutableState3);
                    Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(PaddingKt.m989paddingqDBjuR0$default(PaddingKt.m987paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6997constructorimpl(f2), 0.0f, 2, null), 0.0f, Dp.m6997constructorimpl(20), 0.0f, 0.0f, 13, null), 0.0f, 1, null), null, false, 3, null);
                    RoundedCornerShape RoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                    TextFieldColors m2664colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m2664colors0hiis_0(0L, 0L, 0L, 0L, ColorKt.Color(4294309365L), ColorKt.Color(4294309365L), 0L, 0L, 0L, 0L, null, Color.INSTANCE.m4550getTransparent0d7_KjU(), Color.INSTANCE.m4550getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer2, 221184, 432, 0, 0, 3072, 2147477455, 4095);
                    composer2.startReplaceableGroup(1328661755);
                    boolean changed = composer2.changed(mutableState3);
                    Object rememberedValue4 = composer2.rememberedValue();
                    if (changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = (Function1) new Function1<String, Unit>() { // from class: com.glority.android.picturexx.composable.CorrectResultComposablesKt$CorrectResultScreen$2$1$2$1
                            /* JADX INFO: Access modifiers changed from: package-private */
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
                            public final void invoke2(String it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState3.setValue(it);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    OutlinedTextFieldKt.OutlinedTextField(CorrectResultScreen$lambda$4, (Function1<? super String, Unit>) rememberedValue4, wrapContentHeight$default, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$CorrectResultComposablesKt.INSTANCE.m7770getLambda2$businessMod_release(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$CorrectResultComposablesKt.INSTANCE.m7771getLambda3$businessMod_release(), (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composer2, -1310510764, true, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.CorrectResultComposablesKt$CorrectResultScreen$2$1$3
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

                        public final void invoke(Composer composer3, int i3) {
                            String CorrectResultScreen$lambda$44;
                            if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1310510764, i3, -1, "com.glority.android.picturexx.composable.CorrectResultScreen.<anonymous>.<anonymous>.<anonymous> (CorrectResultComposables.kt:178)");
                                }
                                CorrectResultScreen$lambda$44 = CorrectResultComposablesKt.CorrectResultScreen$lambda$4(mutableState3);
                                if (CorrectResultScreen$lambda$44.length() > 0) {
                                    Painter asPainter = ComposableExtensionsKt.asPainter(R.drawable.icon_correct_result_clear_input, composer3, 0);
                                    Modifier m1030size3ABfNKs = SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(16));
                                    composer3.startReplaceableGroup(1328663269);
                                    boolean changed2 = composer3.changed(mutableState3);
                                    final MutableState<String> mutableState5 = mutableState3;
                                    Object rememberedValue5 = composer3.rememberedValue();
                                    if (changed2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue5 = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.composable.CorrectResultComposablesKt$CorrectResultScreen$2$1$3$1$1
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
                                                mutableState5.setValue("");
                                            }
                                        };
                                        composer3.updateRememberedValue(rememberedValue5);
                                    }
                                    composer3.endReplaceableGroup();
                                    ImageKt.Image(asPainter, (String) null, ClickableKt.m573clickableXHw0xAI$default(m1030size3ABfNKs, false, null, null, (Function0) rememberedValue5, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShape, m2664colors0hiis_0, composer2, 918552960, 12582912, 0, 1965176);
                    CorrectResultScreen$lambda$42 = CorrectResultComposablesKt.CorrectResultScreen$lambda$4(mutableState3);
                    if (CorrectResultScreen$lambda$42.length() != 0) {
                        CorrectResultScreen$lambda$1 = CorrectResultComposablesKt.CorrectResultScreen$lambda$1(mutableState4);
                        if (!CorrectResultScreen$lambda$1) {
                            CorrectResultScreen$lambda$12 = CorrectResultComposablesKt.CorrectResultScreen$lambda$1(mutableState4);
                            if (!CorrectResultScreen$lambda$12) {
                                composer2.startReplaceableGroup(1078321326);
                                CorrectResultScreen$lambda$43 = CorrectResultComposablesKt.CorrectResultScreen$lambda$4(mutableState3);
                                if (CorrectResultScreen$lambda$43.length() > 0 && snapshotStateList2.isEmpty()) {
                                    composer2.startReplaceableGroup(1078321399);
                                    function32.invoke(columnScopeInstance, composer2, 6);
                                    composer2.endReplaceableGroup();
                                } else {
                                    composer2.startReplaceableGroup(1078321469);
                                    Modifier weight$default = ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(PaddingKt.m987paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6997constructorimpl(f2), 0.0f, 2, null), 0.0f, 1, null), 1.0f, false, 2, null);
                                    composer2.startReplaceableGroup(1328664136);
                                    boolean changed2 = composer2.changed(snapshotStateList2) | composer2.changed(function6) | composer2.changed(mutableState3);
                                    Object rememberedValue5 = composer2.rememberedValue();
                                    if (changed2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue5 = (Function1) new Function1<LazyListScope, Unit>() { // from class: com.glority.android.picturexx.composable.CorrectResultComposablesKt$CorrectResultScreen$2$1$4$1
                                            /* JADX INFO: Access modifiers changed from: package-private */
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                                                invoke2(lazyListScope);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(LazyListScope LazyColumn) {
                                                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                                final List list = snapshotStateList2;
                                                final Function6<LazyItemScope, Modifier, String, T, Composer, Integer, Unit> function62 = function6;
                                                final MutableState<String> mutableState5 = mutableState3;
                                                final CorrectResultComposablesKt$CorrectResultScreen$2$1$4$1$invoke$$inlined$items$default$1 correctResultComposablesKt$CorrectResultScreen$2$1$4$1$invoke$$inlined$items$default$1 = new Function1() { // from class: com.glority.android.picturexx.composable.CorrectResultComposablesKt$CorrectResultScreen$2$1$4$1$invoke$$inlined$items$default$1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Void invoke(T t) {
                                                        return null;
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                        return invoke((CorrectResultComposablesKt$CorrectResultScreen$2$1$4$1$invoke$$inlined$items$default$1) obj);
                                                    }
                                                };
                                                LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: com.glority.android.picturexx.composable.CorrectResultComposablesKt$CorrectResultScreen$2$1$4$1$invoke$$inlined$items$default$3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                                        return invoke(num.intValue());
                                                    }

                                                    public final Object invoke(int i3) {
                                                        return Function1.this.invoke(list.get(i3));
                                                    }
                                                }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.CorrectResultComposablesKt$CorrectResultScreen$2$1$4$1$invoke$$inlined$items$default$4
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(4);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function4
                                                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer3, Integer num2) {
                                                        invoke(lazyItemScope, num.intValue(), composer3, num2.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(LazyItemScope lazyItemScope, int i3, Composer composer3, int i4) {
                                                        int i5;
                                                        String CorrectResultScreen$lambda$44;
                                                        ComposerKt.sourceInformation(composer3, "C152@7074L22:LazyDsl.kt#428nma");
                                                        if ((i4 & 6) == 0) {
                                                            i5 = (composer3.changed(lazyItemScope) ? 4 : 2) | i4;
                                                        } else {
                                                            i5 = i4;
                                                        }
                                                        if ((i4 & 48) == 0) {
                                                            i5 |= composer3.changed(i3) ? 32 : 16;
                                                        }
                                                        if ((i5 & 147) == 146 && composer3.getSkipping()) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-632812321, i5, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                                                        }
                                                        Object obj = list.get(i3);
                                                        Modifier wrapContentHeight$default2 = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
                                                        Function6 function63 = function62;
                                                        CorrectResultScreen$lambda$44 = CorrectResultComposablesKt.CorrectResultScreen$lambda$4(mutableState5);
                                                        function63.invoke(lazyItemScope, wrapContentHeight$default2, CorrectResultScreen$lambda$44, obj, composer3, Integer.valueOf((i5 & 14) | 48));
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }));
                                            }
                                        };
                                        composer2.updateRememberedValue(rememberedValue5);
                                    }
                                    composer2.endReplaceableGroup();
                                    LazyDslKt.LazyColumn(weight$default, null, null, false, null, null, null, false, (Function1) rememberedValue5, composer2, 0, 254);
                                    composer2.endReplaceableGroup();
                                }
                                composer2.endReplaceableGroup();
                            } else {
                                composer2.startReplaceableGroup(1078322055);
                                composer2.endReplaceableGroup();
                            }
                        } else {
                            composer2.startReplaceableGroup(1078321214);
                            CorrectResultComposablesKt.CoinSearchLoadingScreen(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, 6);
                            composer2.endReplaceableGroup();
                        }
                    } else {
                        composer2.startReplaceableGroup(1078321137);
                        function3.invoke(columnScopeInstance, composer2, 6);
                        composer2.endReplaceableGroup();
                    }
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
        }), startRestartGroup, (i & 14) | 12583296, 120);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.CorrectResultComposablesKt$CorrectResultScreen$3
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
                    CorrectResultComposablesKt.CorrectResultScreen(Modifier.this, onClose, itemComposable, otherResultsComposable, emptyContentComposable, onSearchResult, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void CorrectResultScreen$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void CorrectResultItem(final Modifier modifier, final String searchText, final IndexModel item, final Function1<? super IndexModel, Unit> onClick, Composer composer, final int i) {
        Composer composer2;
        float f;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1003638852);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1003638852, i, -1, "com.glority.android.picturexx.composable.CorrectResultItem (CorrectResultComposables.kt:227)");
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
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
        float f2 = 16;
        Modifier m986paddingVpY3zN4 = PaddingKt.m986paddingVpY3zN4(ClickableKt.m573clickableXHw0xAI$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), false, null, null, new Function0<Unit>() { // from class: com.glority.android.picturexx.composable.CorrectResultComposablesKt$CorrectResultItem$1$1
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
                onClick.invoke(item);
            }
        }, 7, null), Dp.m6997constructorimpl(f2), Dp.m6997constructorimpl(18));
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m986paddingVpY3zN4);
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
        Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null);
        BiasAlignment biasAlignment = new BiasAlignment(-1.0f, 0.0f);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentSize$default);
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
        Updater.m4015setimpl(m4008constructorimpl3, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4015setimpl(m4008constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4008constructorimpl3.getInserting() || !Intrinsics.areEqual(m4008constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m4008constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4008constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        Updater.m4015setimpl(m4008constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        com.glority.android.compose.ui.ImageKt.GlImage(item.getMainImageUrl(), ClipKt.clip(SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(80)), RoundedCornerShapeKt.getCircleShape()), 0.0f, null, 0.0f, null, null, null, null, null, startRestartGroup, 48, 1020);
        com.glority.android.compose.ui.ImageKt.GlImage(getReverseImageUrl(item), ClipKt.clip(SizeKt.m1030size3ABfNKs(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6997constructorimpl(50), 0.0f, 0.0f, 0.0f, 14, null), Dp.m6997constructorimpl(60)), RoundedCornerShapeKt.getCircleShape()), 0.0f, null, 0.0f, null, null, null, null, null, startRestartGroup, 48, 1020);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(RowScope.weight$default(rowScopeInstance, PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6997constructorimpl(f2), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false, 2, null), null, false, 3, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default);
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
        Updater.m4015setimpl(m4008constructorimpl4, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4015setimpl(m4008constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4008constructorimpl4.getInserting() || !Intrinsics.areEqual(m4008constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            m4008constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m4008constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
        }
        Updater.m4015setimpl(m4008constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        String str = (String) CollectionsKt.firstOrNull((List) item.getCommonNames());
        startRestartGroup.startReplaceableGroup(-1560860509);
        if (str != null) {
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(str);
            builder.addStyle(new SpanStyle(Color.INSTANCE.m4541getBlack0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (DefaultConstructorMarker) null), 0, str.length());
            int indexOf$default = StringsKt.indexOf$default((CharSequence) str, searchText, 0, true, 2, (Object) null);
            if (indexOf$default != -1) {
                builder.addStyle(new SpanStyle(ColorKt.Color(4294883892L), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (DefaultConstructorMarker) null), indexOf$default, searchText.length() + indexOf$default);
            }
            AnnotatedString annotatedString = builder.toAnnotatedString();
            long sp = TextUnitKt.getSp(16);
            long sp2 = TextUnitKt.getSp(20);
            f = 0.0f;
            composer2 = startRestartGroup;
            TextKt.m3015TextIbK3jfQ(annotatedString, SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), 0L, sp, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, sp2, 0, false, 0, 0, null, null, null, composer2, 199728, 6, 261076);
        } else {
            composer2 = startRestartGroup;
            f = 0.0f;
        }
        composer2.endReplaceableGroup();
        TextKt.m3014Text4IGK_g(getYear(item) + ", " + getComposition(item), SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, 1, null), null, false, 3, null), ColorKt.Color(4284900966L), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3504, 6, 130032);
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
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.CorrectResultComposablesKt$CorrectResultItem$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i2) {
                    CorrectResultComposablesKt.CorrectResultItem(Modifier.this, searchText, item, onClick, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void CorrectResultScreen_Preview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1159700408);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1159700408, i, -1, "com.glority.android.picturexx.composable.CorrectResultScreen_Preview (CorrectResultComposables.kt:318)");
            }
            SurfaceKt.m2864SurfaceT9BRK9s(null, null, Color.INSTANCE.m4542getBlue0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableSingletons$CorrectResultComposablesKt.INSTANCE.m7775getLambda7$businessMod_release(), startRestartGroup, 12583296, 123);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.CorrectResultComposablesKt$CorrectResultScreen_Preview$1
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
                    CorrectResultComposablesKt.CorrectResultScreen_Preview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final IndexModel mock_IndenModel() {
        IndexModel indexModel = new IndexModel(0, 1, null);
        indexModel.setRank(0);
        indexModel.setUid(LikeItem.DISLIKE);
        indexModel.setLatinName("Latin Name");
        indexModel.setMainImageUrl("");
        indexModel.setCommonNames(CollectionsKt.mutableListOf("Common Name"));
        return indexModel;
    }

    public static final void SuggestNameScreen(final Modifier modifier, final Function0<Unit> onCloseClick, final Function2<? super String, ? super String, Unit> onSendClick, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Intrinsics.checkNotNullParameter(onSendClick, "onSendClick");
        Composer startRestartGroup = composer.startRestartGroup(882099766);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i2 |= startRestartGroup.changedInstance(onCloseClick) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(onSendClick) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(882099766, i2, -1, "com.glority.android.picturexx.composable.SuggestNameScreen (CorrectResultComposables.kt:362)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final MutableState mutableState = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final MutableState mutableState2 = (MutableState) rememberedValue2;
            float f = 18;
            composer2 = startRestartGroup;
            SurfaceKt.m2864SurfaceT9BRK9s(modifier, RoundedCornerShapeKt.m1270RoundedCornerShapea9UjIt4$default(Dp.m6997constructorimpl(f), Dp.m6997constructorimpl(f), 0.0f, 0.0f, 12, null), Color.INSTANCE.m4552getWhite0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1893110481, true, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.CorrectResultComposablesKt$SuggestNameScreen$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Removed duplicated region for block: B:60:0x070d  */
                /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void invoke(androidx.compose.runtime.Composer r104, int r105) {
                    /*
                        Method dump skipped, instructions count: 1809
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.composable.CorrectResultComposablesKt$SuggestNameScreen$1.invoke(androidx.compose.runtime.Composer, int):void");
                }
            }), startRestartGroup, (i2 & 14) | 12583296, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.CorrectResultComposablesKt$SuggestNameScreen$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    CorrectResultComposablesKt.SuggestNameScreen(Modifier.this, onCloseClick, onSendClick, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void SuggestNameScreen_Preview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-496487984);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-496487984, i, -1, "com.glority.android.picturexx.composable.SuggestNameScreen_Preview (CorrectResultComposables.kt:540)");
            }
            SuggestNameScreen(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), new Function0<Unit>() { // from class: com.glority.android.picturexx.composable.CorrectResultComposablesKt$SuggestNameScreen_Preview$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function2<String, String, Unit>() { // from class: com.glority.android.picturexx.composable.CorrectResultComposablesKt$SuggestNameScreen_Preview$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String str, String str2) {
                    Intrinsics.checkNotNullParameter(str, "<unused var>");
                    Intrinsics.checkNotNullParameter(str2, "<unused var>");
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
                    invoke2(str, str2);
                    return Unit.INSTANCE;
                }
            }, startRestartGroup, 438);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.CorrectResultComposablesKt$SuggestNameScreen_Preview$3
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
                    CorrectResultComposablesKt.SuggestNameScreen_Preview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void NoResultsFound(final Modifier modifier, final Function0<Unit> onSuggestNameClick, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(onSuggestNameClick, "onSuggestNameClick");
        Composer startRestartGroup = composer.startRestartGroup(-480009038);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i2 |= startRestartGroup.changedInstance(onSuggestNameClick) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-480009038, i2, -1, "com.glority.android.picturexx.composable.NoResultsFound (CorrectResultComposables.kt:551)");
            }
            float f = 16;
            Modifier m985padding3ABfNKs = PaddingKt.m985padding3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), Dp.m6997constructorimpl(f));
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.HorizontalOrVertical m865spacedBy0680j_4 = Arrangement.INSTANCE.m865spacedBy0680j_4(Dp.m6997constructorimpl(f));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m865spacedBy0680j_4, centerHorizontally, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m985padding3ABfNKs);
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
            float f2 = 40;
            Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(PaddingKt.m987paddingVpY3zN4$default(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(20), 0.0f, 0.0f, 13, null), Dp.m6997constructorimpl(f2), 0.0f, 2, null), null, false, 3, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentSize$default);
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
            ImageKt.Image(ComposableExtensionsKt.asPainter(R.drawable.icon_correct_result_warning_icon, startRestartGroup, 0), "Warning Icon", SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(24)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 440, 120);
            TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.global_correctresult_noresult_title, startRestartGroup, 0), SizeKt.wrapContentSize$default(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6997constructorimpl(10), 0.0f, 0.0f, 0.0f, 14, null), null, false, 3, null), 0L, TextUnitKt.getSp(20), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199728, 0, 130516);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.global_correctresult_noresult_text, startRestartGroup, 0), (Modifier) null, Color.INSTANCE.m4545getGray0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 3456, 0, 130546);
            SpacerKt.Spacer(SizeKt.m1016height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6997constructorimpl(f2)), startRestartGroup, 6);
            long asColor = ComposableExtensionsKt.asColor(R.color.colorAccent, startRestartGroup, 0);
            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
            ButtonColors m2130buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m2130buttonColorsro_MJ88(asColor, 0L, 0L, 0L, startRestartGroup, ButtonDefaults.$stable << 12, 14);
            RoundedCornerShape RoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
            PaddingValues m980PaddingValuesYgX7TsA$default = PaddingKt.m980PaddingValuesYgX7TsA$default(0.0f, Dp.m6997constructorimpl(12), 1, null);
            startRestartGroup.startReplaceableGroup(1328677572);
            boolean changedInstance = startRestartGroup.changedInstance(onSuggestNameClick);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.composable.CorrectResultComposablesKt$NoResultsFound$1$2$1
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
                        onSuggestNameClick.invoke();
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            ButtonKt.Button((Function0) rememberedValue, wrapContentHeight$default, false, RoundedCornerShape, m2130buttonColorsro_MJ88, null, null, m980PaddingValuesYgX7TsA$default, null, ComposableSingletons$CorrectResultComposablesKt.INSTANCE.m7769getLambda12$businessMod_release(), startRestartGroup, 817889328, 356);
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
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.CorrectResultComposablesKt$NoResultsFound$2
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

                public final void invoke(Composer composer3, int i3) {
                    CorrectResultComposablesKt.NoResultsFound(Modifier.this, onSuggestNameClick, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void NoResultsFoundPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-218434073);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-218434073, i, -1, "com.glority.android.picturexx.composable.NoResultsFoundPreview (CorrectResultComposables.kt:625)");
            }
            NoResultsFound(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), new Function0<Unit>() { // from class: com.glority.android.picturexx.composable.CorrectResultComposablesKt$NoResultsFoundPreview$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, startRestartGroup, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.CorrectResultComposablesKt$NoResultsFoundPreview$2
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
                    CorrectResultComposablesKt.NoResultsFoundPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void CoinSearchLoadingScreen(final Modifier modifier, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer startRestartGroup = composer.startRestartGroup(206295620);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(206295620, i2, -1, "com.glority.android.picturexx.composable.CoinSearchLoadingScreen (CorrectResultComposables.kt:636)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
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
            ProgressIndicatorKt.m2688CircularProgressIndicatorLxG7B9w(BoxScopeInstance.INSTANCE.align(SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(40)), new BiasAlignment(0.0f, -0.6f)), ComposableExtensionsKt.asColor(R.color.colorAccent, startRestartGroup, 0), 0.0f, 0L, 0, startRestartGroup, 0, 28);
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
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.CorrectResultComposablesKt$CoinSearchLoadingScreen$2
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
                    CorrectResultComposablesKt.CoinSearchLoadingScreen(Modifier.this, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void CoinSearchLoadingScreenPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(313087649);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(313087649, i, -1, "com.glority.android.picturexx.composable.CoinSearchLoadingScreenPreview (CorrectResultComposables.kt:651)");
            }
            CoinSearchLoadingScreen(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.CorrectResultComposablesKt$CoinSearchLoadingScreenPreview$1
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
                    CorrectResultComposablesKt.CoinSearchLoadingScreenPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void OtherResultsLayout(final Modifier modifier, final List<CmsName> otherResults, final Function1<? super IndexModel, Unit> onClick, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(otherResults, "otherResults");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1094806644);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1094806644, i, -1, "com.glority.android.picturexx.composable.OtherResultsLayout (CorrectResultComposables.kt:662)");
        }
        List<CmsName> list = otherResults;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toIndexModel((CmsName) it.next()));
        }
        final ArrayList arrayList2 = arrayList;
        float f = 20;
        Modifier m989paddingqDBjuR0$default = PaddingKt.m989paddingqDBjuR0$default(PaddingKt.m987paddingVpY3zN4$default(modifier, Dp.m6997constructorimpl(16), 0.0f, 2, null), 0.0f, Dp.m6997constructorimpl(f), 0.0f, 0.0f, 13, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
        TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.global_correctresult_text_mightalsobe, startRestartGroup, 0), (Modifier) null, ColorKt.Color(4280427042L), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(28), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 200064, 6, 130002);
        LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(f), 0.0f, 0.0f, 13, null), 0.0f, 1, null), null, null, false, null, null, null, false, new Function1<LazyListScope, Unit>() { // from class: com.glority.android.picturexx.composable.CorrectResultComposablesKt$OtherResultsLayout$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                invoke2(lazyListScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LazyListScope LazyColumn) {
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                final List<IndexModel> list2 = arrayList2;
                final Function1<IndexModel, Unit> function1 = onClick;
                final CorrectResultComposablesKt$OtherResultsLayout$1$1$invoke$$inlined$items$default$1 correctResultComposablesKt$OtherResultsLayout$1$1$invoke$$inlined$items$default$1 = new Function1() { // from class: com.glority.android.picturexx.composable.CorrectResultComposablesKt$OtherResultsLayout$1$1$invoke$$inlined$items$default$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Void invoke(IndexModel indexModel) {
                        return null;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((IndexModel) obj);
                    }
                };
                LazyColumn.items(list2.size(), null, new Function1<Integer, Object>() { // from class: com.glority.android.picturexx.composable.CorrectResultComposablesKt$OtherResultsLayout$1$1$invoke$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i2) {
                        return Function1.this.invoke(list2.get(i2));
                    }
                }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.CorrectResultComposablesKt$OtherResultsLayout$1$1$invoke$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer2, Integer num2) {
                        invoke(lazyItemScope, num.intValue(), composer2, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer2, int i3) {
                        int i4;
                        ComposerKt.sourceInformation(composer2, "C152@7074L22:LazyDsl.kt#428nma");
                        if ((i3 & 6) == 0) {
                            i4 = (composer2.changed(lazyItemScope) ? 4 : 2) | i3;
                        } else {
                            i4 = i3;
                        }
                        if ((i3 & 48) == 0) {
                            i4 |= composer2.changed(i2) ? 32 : 16;
                        }
                        if ((i4 & 147) == 146 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-632812321, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                        }
                        CorrectResultComposablesKt.CorrectResultItem(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), "", (IndexModel) list2.get(i2), function1, composer2, 566);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
        }, startRestartGroup, 6, 254);
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
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.CorrectResultComposablesKt$OtherResultsLayout$2
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
                    CorrectResultComposablesKt.OtherResultsLayout(Modifier.this, otherResults, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    private static final String getReverseImageUrl(IndexModel indexModel) {
        Object obj;
        Map<String, Object> fields = indexModel.getFields();
        if (fields == null || (obj = fields.get("ReverseImage")) == null) {
            return null;
        }
        return obj.toString();
    }

    private static final String getYear(IndexModel indexModel) {
        Object obj;
        Map<String, Object> fields = indexModel.getFields();
        if (fields == null || (obj = fields.get("Year")) == null) {
            return null;
        }
        return obj.toString();
    }

    private static final String getComposition(IndexModel indexModel) {
        Object obj;
        Map<String, Object> fields = indexModel.getFields();
        if (fields == null || (obj = fields.get("Composition")) == null) {
            return null;
        }
        return obj.toString();
    }

    private static final IndexModel toIndexModel(CmsName cmsName) {
        String str;
        IndexModel indexModel = new IndexModel(0, 1, null);
        indexModel.setRank(0);
        indexModel.setUid(cmsName.getUid());
        indexModel.setLatinName(cmsName.getName().getLatinName());
        ArrayList commonNames = cmsName.getName().getCommonNames();
        if (commonNames == null) {
            commonNames = new ArrayList();
        }
        indexModel.setCommonNames(commonNames);
        CmsImage mainImage = cmsName.getMainImage();
        if (mainImage == null || (str = mainImage.getImageUrl()) == null) {
            str = "";
        }
        indexModel.setMainImageUrl(str);
        indexModel.setFields(MapsKt.mapOf(TuplesKt.to("ReverseImage", CmsDataUtils.INSTANCE.getTagValue(cmsName, "Image:SubjectSide"))));
        return indexModel;
    }

    public static final boolean CorrectResultScreen$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final String CorrectResultScreen$lambda$4(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    public static final String SuggestNameScreen$lambda$14(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    public static final String SuggestNameScreen$lambda$17(MutableState<String> mutableState) {
        return mutableState.getValue();
    }
}
