package com.glority.android.guide.memo50741.activity;

import android.content.res.Configuration;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.location.LocationRequestCompat;
import androidx.core.os.EnvironmentCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.exifinterface.media.ExifInterface;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.glority.android.compose.preview.PreviewUi;
import com.glority.android.compose.ui.ResizableTextKt;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.guide.BillingUIGetCurrencyCodeRequest;
import com.glority.android.core.route.guide.BillingUIGetPriceBySkuRequest;
import com.glority.android.core.route.guide.GuidePurchaseRequest;
import com.glority.android.core.route.guide.GuideRestoreRequest;
import com.glority.android.core.route.vipEvent.VipEventRequest;
import com.glority.android.guide.base.BasePurchaseActivity;
import com.glority.android.guide.memo50741.R;
import com.google.android.exoplayer2.audio.WavUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Vip50741AActivity.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0017\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"H\u0003¢\u0006\u0002\u0010#J\r\u0010$\u001a\u00020 H\u0003¢\u0006\u0002\u0010%J\r\u0010&\u001a\u00020 H\u0007¢\u0006\u0002\u0010%J!\u0010'\u001a\u00020 2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020 0)H\u0007¢\u0006\u0002\u0010+J\u001f\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020.2\b\b\u0002\u0010!\u001a\u00020\"H\u0007¢\u0006\u0002\u0010/J\u0017\u00100\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"H\u0007¢\u0006\u0002\u0010#J%\u00101\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0003¢\u0006\u0002\u00103J\b\u00104\u001a\u00020 H\u0016J\b\u00105\u001a\u000206H\u0002J\u0012\u00107\u001a\u00020 2\b\u00108\u001a\u0004\u0018\u000106H\u0014J\r\u00109\u001a\u00020 H\u0003¢\u0006\u0002\u0010%J\r\u0010:\u001a\u00020 H\u0003¢\u0006\u0002\u0010%J\b\u0010;\u001a\u00020\u0011H\u0014J\b\u0010<\u001a\u00020 H\u0002R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/glority/android/guide/memo50741/activity/Vip50741AActivity;", "Lcom/glority/android/guide/base/BasePurchaseActivity;", "()V", "<set-?>", "", "currentSku", "getCurrentSku", "()Ljava/lang/String;", "setCurrentSku", "(Ljava/lang/String;)V", "currentSku$delegate", "Landroidx/compose/runtime/MutableState;", "infoTexts", "", "", "isTrialSkuSelected", "Landroidx/compose/runtime/MutableState;", "", "monthPrice", "monthlySKU", "priceSymbol", "reminderOpen", "getReminderOpen", "()Z", "setReminderOpen", "(Z)V", "reminderOpen$delegate", "weekPrice", "weeklySKU", "yearPrice", "yearlySKU", "ContinueButton", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DescriptionView", "(Landroidx/compose/runtime/Composer;I)V", "HeaderImage", "LoadingPage", "finishedListener", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "PolicyView", "scrollState", "Landroidx/compose/foundation/ScrollState;", "(Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PurchaseView", "ReminderBar", "visible", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;II)V", "changePrice", "getBundle1", "Landroid/os/Bundle;", "onCreate", "savedInstanceState", "purchasePage", "restoreAndCloseBar", "showBackPressedCloseRetain", "startPurchase", "guide-ui_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes11.dex */
public final class Vip50741AActivity extends BasePurchaseActivity {
    public static final int $stable = 8;

    /* renamed from: currentSku$delegate, reason: from kotlin metadata */
    private final MutableState currentSku;
    private List<Integer> infoTexts;
    private MutableState<Boolean> isTrialSkuSelected;
    private MutableState<String> monthPrice;
    private MutableState<String> priceSymbol;

    /* renamed from: reminderOpen$delegate, reason: from kotlin metadata */
    private final MutableState reminderOpen;
    private MutableState<String> weekPrice;
    private MutableState<String> yearPrice;
    private String yearlySKU = "sub_yearly_7dt_2";
    private String monthlySKU = "sub_month";
    private String weeklySKU = "sub_week";

    @Override // com.glority.android.guide.base.BasePurchaseActivity
    protected boolean showBackPressedCloseRetain() {
        return true;
    }

    public Vip50741AActivity() {
        MutableState mutableStateOf$default;
        MutableState<Boolean> mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState<String> mutableStateOf$default4;
        MutableState<String> mutableStateOf$default5;
        MutableState<String> mutableStateOf$default6;
        MutableState<String> mutableStateOf$default7;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("sub_yearly_7dt_2", null, 2, null);
        this.currentSku = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        this.isTrialSkuSelected = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.reminderOpen = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.yearPrice = mutableStateOf$default4;
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.monthPrice = mutableStateOf$default5;
        mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.weekPrice = mutableStateOf$default6;
        mutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.priceSymbol = mutableStateOf$default7;
        this.infoTexts = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.string.text_feature_1), Integer.valueOf(R.string.text_feature_3), Integer.valueOf(R.string.text_feature_4)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String getCurrentSku() {
        return (String) this.currentSku.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentSku(String str) {
        this.currentSku.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getReminderOpen() {
        return ((Boolean) this.reminderOpen.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setReminderOpen(boolean z) {
        this.reminderOpen.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.guide.base.BasePurchaseActivity, com.glority.android.core.route.RouteableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        if (getResources().getConfiguration().fontScale > 1.3f) {
            getResources().getConfiguration().fontScale = 1.3f;
        }
        super.onCreate(savedInstanceState);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-36144990, true, new Vip50741AActivity$onCreate$1(this)), 1, null);
    }

    public final void LoadingPage(final Function1<? super Float, Unit> finishedListener, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(finishedListener, "finishedListener");
        Composer startRestartGroup = composer.startRestartGroup(-1831999254);
        ComposerKt.sourceInformation(startRestartGroup, "C(LoadingPage)");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(finishedListener) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1831999254, i2, -1, "com.glority.android.guide.memo50741.activity.Vip50741AActivity.LoadingPage (Vip50741AActivity.kt:138)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(LoadingPage$lambda$1(mutableState) ? 1.0f : 2.2f, AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: com.glority.android.guide.memo50741.activity.Vip50741AActivity$LoadingPage$scale$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                    Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(1000);
                    keyframes.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(2.2f), 0);
                    Float valueOf = Float.valueOf(1.0f);
                    keyframes.at((KeyframesSpec.KeyframesSpecConfig<Float>) valueOf, 500);
                    keyframes.at((KeyframesSpec.KeyframesSpecConfig<Float>) valueOf, 1000);
                }
            }), 0.0f, "scale", finishedListener, startRestartGroup, ((i2 << 12) & 57344) | 3120, 4);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(BackgroundKt.m540backgroundbw27NRU$default(Modifier.INSTANCE, DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0) ? Color.INSTANCE.m4541getBlack0d7_KjU() : Color.INSTANCE.m4552getWhite0d7_KjU(), null, 2, null), 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(animateFloatAsState);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: com.glority.android.guide.memo50741.activity.Vip50741AActivity$LoadingPage$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                        invoke2(graphicsLayerScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(GraphicsLayerScope graphicsLayer) {
                        float LoadingPage$lambda$3;
                        float LoadingPage$lambda$32;
                        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                        LoadingPage$lambda$3 = Vip50741AActivity.LoadingPage$lambda$3(animateFloatAsState);
                        graphicsLayer.setScaleY(LoadingPage$lambda$3);
                        LoadingPage$lambda$32 = Vip50741AActivity.LoadingPage$lambda$3(animateFloatAsState);
                        graphicsLayer.setScaleX(LoadingPage$lambda$32);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(fillMaxSize$default, (Function1) rememberedValue2);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(graphicsLayer);
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
            modifierMaterializerOf.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693570, "C77@3893L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            SpacerKt.Spacer(SizeKt.fillMaxHeight(Modifier.INSTANCE, 0.4f), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-2014551555);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            String stringResource = StringResources_androidKt.stringResource(R.string.coversionpage_loading_start7dayfreetrial, startRestartGroup, 0);
            String stringResource2 = StringResources_androidKt.stringResource(R.string.coversionpage_loading_free, startRestartGroup, 0);
            builder.append(stringResource);
            String str = stringResource;
            builder.addStyle(new SpanStyle(ColorKt.Color(4294618905L), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (DefaultConstructorMarker) null), StringsKt.indexOf$default((CharSequence) str, stringResource2, 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) str, stringResource2, 0, false, 6, (Object) null) + stringResource2.length());
            AnnotatedString annotatedString = builder.toAnnotatedString();
            startRestartGroup.endReplaceableGroup();
            long sp = TextUnitKt.getSp(24);
            FontWeight bold = FontWeight.INSTANCE.getBold();
            long m4552getWhite0d7_KjU = DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0) ? Color.INSTANCE.m4552getWhite0d7_KjU() : Color.INSTANCE.m4541getBlack0d7_KjU();
            int m6864getCentere0LSkKk = TextAlign.INSTANCE.m6864getCentere0LSkKk();
            Modifier m987paddingVpY3zN4$default = PaddingKt.m987paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6997constructorimpl(32), 0.0f, 2, null);
            TextAlign m6857boximpl = TextAlign.m6857boximpl(m6864getCentere0LSkKk);
            composer2 = startRestartGroup;
            TextKt.m3015TextIbK3jfQ(annotatedString, m987paddingVpY3zN4$default, m4552getWhite0d7_KjU, sp, null, bold, null, 0L, null, m6857boximpl, 0L, 0, false, 0, 0, null, null, null, composer2, 199728, 0, 261584);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            Unit unit = Unit.INSTANCE;
            composer2.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = composer2.changed(mutableState);
            Vip50741AActivity$LoadingPage$3$1 rememberedValue3 = composer2.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Vip50741AActivity$LoadingPage$3$1(mutableState, null);
                composer2.updateRememberedValue(rememberedValue3);
            }
            composer2.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, composer2, 70);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.guide.memo50741.activity.Vip50741AActivity$LoadingPage$4
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
                Vip50741AActivity.this.LoadingPage(finishedListener, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    private static final boolean LoadingPage$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadingPage$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @PreviewUi
    public final void purchasePage(Composer composer, final int i) {
        ColorScheme m2212copyG1PFcw;
        Composer startRestartGroup = composer.startRestartGroup(-936669754);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-936669754, i, -1, "com.glority.android.guide.memo50741.activity.Vip50741AActivity.purchasePage (Vip50741AActivity.kt:187)");
        }
        final ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
        ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localConfiguration);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final float m6997constructorimpl = Dp.m6997constructorimpl(Dp.m6997constructorimpl(((Configuration) consume).screenHeightDp) * 0.364f);
        m2212copyG1PFcw = r11.m2212copyG1PFcw((r76 & 1) != 0 ? r11.primary : ColorKt.Color(4294618905L), (r76 & 2) != 0 ? r11.onPrimary : 0L, (r76 & 4) != 0 ? r11.primaryContainer : 0L, (r76 & 8) != 0 ? r11.onPrimaryContainer : 0L, (r76 & 16) != 0 ? r11.inversePrimary : 0L, (r76 & 32) != 0 ? r11.secondary : 0L, (r76 & 64) != 0 ? r11.onSecondary : 0L, (r76 & 128) != 0 ? r11.secondaryContainer : 0L, (r76 & 256) != 0 ? r11.onSecondaryContainer : 0L, (r76 & 512) != 0 ? r11.tertiary : 0L, (r76 & 1024) != 0 ? r11.onTertiary : 0L, (r76 & 2048) != 0 ? r11.tertiaryContainer : 0L, (r76 & 4096) != 0 ? r11.onTertiaryContainer : 0L, (r76 & 8192) != 0 ? r11.background : 0L, (r76 & 16384) != 0 ? r11.onBackground : 0L, (r76 & 32768) != 0 ? r11.surface : 0L, (r76 & 65536) != 0 ? r11.onSurface : 0L, (r76 & 131072) != 0 ? r11.surfaceVariant : 0L, (r76 & 262144) != 0 ? r11.onSurfaceVariant : 0L, (r76 & 524288) != 0 ? r11.surfaceTint : 0L, (r76 & 1048576) != 0 ? r11.inverseSurface : 0L, (r76 & 2097152) != 0 ? r11.inverseOnSurface : 0L, (r76 & 4194304) != 0 ? r11.error : 0L, (r76 & 8388608) != 0 ? r11.onError : 0L, (r76 & 16777216) != 0 ? r11.errorContainer : 0L, (r76 & 33554432) != 0 ? r11.onErrorContainer : 0L, (r76 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? r11.outline : 0L, (r76 & 134217728) != 0 ? r11.outlineVariant : 0L, (r76 & 268435456) != 0 ? MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).scrim : 0L);
        MaterialThemeKt.MaterialTheme(m2212copyG1PFcw, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1635164826, true, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.guide.memo50741.activity.Vip50741AActivity$purchasePage$1
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
                MutableState mutableState;
                if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1635164826, i2, -1, "com.glority.android.guide.memo50741.activity.Vip50741AActivity.purchasePage.<anonymous> (Vip50741AActivity.kt:191)");
                    }
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    ScrollState scrollState = ScrollState.this;
                    Vip50741AActivity vip50741AActivity = this;
                    float f = m6997constructorimpl;
                    composer2.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxSize$default);
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
                    Updater.m4015setimpl(m4008constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    modifierMaterializerOf.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier verticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(BackgroundKt.m540backgroundbw27NRU$default(Modifier.INSTANCE, Color.INSTANCE.m4541getBlack0d7_KjU(), null, 2, null), 0.0f, 1, null), scrollState, false, null, false, 14, null);
                    composer2.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(verticalScroll$default);
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
                    Updater.m4015setimpl(m4008constructorimpl2, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    modifierMaterializerOf2.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    vip50741AActivity.HeaderImage(composer2, 8);
                    Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    composer2.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(fillMaxSize$default2);
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
                    Updater.m4015setimpl(m4008constructorimpl3, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4015setimpl(m4008constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4008constructorimpl3.getInserting() || !Intrinsics.areEqual(m4008constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        m4008constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m4008constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    modifierMaterializerOf3.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, 276693570, "C77@3893L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.md5_2b8f2c7bb292da76a0f2906980f81c48, composer2, 0), (String) null, SizeKt.m1035width3ABfNKs(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, f, 0.0f, 0.0f, 13, null), Dp.m6997constructorimpl(158)), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composer2, 24632, LocationRequestCompat.QUALITY_LOW_POWER);
                    vip50741AActivity.DescriptionView(composer2, 8);
                    vip50741AActivity.PurchaseView(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(16), 0.0f, 0.0f, 13, null), composer2, 70, 0);
                    float f2 = 10;
                    Modifier m989paddingqDBjuR0$default = PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(f2), 0.0f, 0.0f, 13, null);
                    mutableState = vip50741AActivity.isTrialSkuSelected;
                    vip50741AActivity.ReminderBar(m989paddingqDBjuR0$default, mutableState, composer2, 518, 0);
                    vip50741AActivity.ContinueButton(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(f2), 0.0f, 0.0f, 13, null), composer2, 70, 0);
                    SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer2, 0);
                    vip50741AActivity.PolicyView(scrollState, null, composer2, 512, 2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    vip50741AActivity.restoreAndCloseBar(composer2, 8);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, 3072, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.guide.memo50741.activity.Vip50741AActivity$purchasePage$2
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
                Vip50741AActivity.this.purchasePage(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restoreAndCloseBar(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(320198514);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(320198514, i, -1, "com.glority.android.guide.memo50741.activity.Vip50741AActivity.restoreAndCloseBar (Vip50741AActivity.kt:229)");
        }
        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
        float f = 16;
        Modifier m989paddingqDBjuR0$default = PaddingKt.m989paddingqDBjuR0$default(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null)), Dp.m6997constructorimpl(f), 0.0f, Dp.m6997constructorimpl(f), 0.0f, 10, null);
        startRestartGroup.startReplaceableGroup(693286680);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m989paddingqDBjuR0$default);
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
        modifierMaterializerOf.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        ResizableTextKt.m7716ResizableText4IGK_g(StringResources_androidKt.stringResource(R.string.base_widget_text_restore, startRestartGroup, 0), ClickableKt.m573clickableXHw0xAI$default(SizeKt.m1037widthInVpY3zN4$default(AlphaKt.alpha(Modifier.INSTANCE, 0.8f), Dp.m6997constructorimpl(160), 0.0f, 2, null), false, null, null, new Function0<Unit>() { // from class: com.glority.android.guide.memo50741.activity.Vip50741AActivity$restoreAndCloseBar$1$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                new GuideRestoreRequest(false, null, 3, null).post();
            }
        }, 7, null), ColorKt.Color(4290493371L), TextUnitKt.getSp(16), null, new FontWeight(500), null, 0L, null, null, 0L, 0, false, 1, 0, null, 0, startRestartGroup, 200064, 3072, 122832);
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.md5_6a2d1ce47e05102d914a6d21126966ac, startRestartGroup, 0), "", ClickableKt.m573clickableXHw0xAI$default(rowScopeInstance.align(SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(12)), Alignment.INSTANCE.getCenterVertically()), false, null, null, new Function0<Unit>() { // from class: com.glority.android.guide.memo50741.activity.Vip50741AActivity$restoreAndCloseBar$1$2
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
                Vip50741AActivity.this.trackClose();
                Vip50741AActivity.this.postUiCloseRequest();
            }
        }, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 56, 120);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.guide.memo50741.activity.Vip50741AActivity$restoreAndCloseBar$2
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
                Vip50741AActivity.this.restoreAndCloseBar(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    public final void HeaderImage(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1050133860);
        ComposerKt.sourceInformation(startRestartGroup, "C(HeaderImage)");
        if ((i & 1) != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1050133860, i, -1, "com.glority.android.guide.memo50741.activity.Vip50741AActivity.HeaderImage (Vip50741AActivity.kt:265)");
            }
            ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localConfiguration);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float m6997constructorimpl = Dp.m6997constructorimpl(((Configuration) consume).screenWidthDp * 0.89166665f);
            ProvidableCompositionLocal<Configuration> localConfiguration2 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localConfiguration2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float m7011unboximpl = ((Dp) ComparisonsKt.minOf(Dp.m6995boximpl(m6997constructorimpl), Dp.m6995boximpl(Dp.m6997constructorimpl(((Configuration) consume2).screenHeightDp * 0.5015625f)))).m7011unboximpl();
            float m6997constructorimpl2 = Dp.m6997constructorimpl(0.4f * m7011unboximpl);
            float m6997constructorimpl3 = Dp.m6997constructorimpl(0.66f * m7011unboximpl);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
            Updater.m4015setimpl(m4008constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.md5_b3fd93872630576c4450f20e5d071797, startRestartGroup, 0), "", SizeKt.m1016height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), m7011unboximpl), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, startRestartGroup, 24632, LocationRequestCompat.QUALITY_LOW_POWER);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.md5_7ea16de1825babff3563bfa99f0c33f4, startRestartGroup, 0), "", SizeKt.fillMaxWidth$default(SizeKt.m1016height3ABfNKs(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, m6997constructorimpl3, 0.0f, 0.0f, 13, null), m6997constructorimpl2), 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 24632, LocationRequestCompat.QUALITY_LOW_POWER);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.guide.memo50741.activity.Vip50741AActivity$HeaderImage$2
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
                Vip50741AActivity.this.HeaderImage(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void DescriptionView(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(337376721);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(337376721, i, -1, "com.glority.android.guide.memo50741.activity.Vip50741AActivity.DescriptionView (Vip50741AActivity.kt:293)");
        }
        Modifier m989paddingqDBjuR0$default = PaddingKt.m989paddingqDBjuR0$default(SizeKt.m1035width3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(340)), 0.0f, Dp.m6997constructorimpl(6), 0.0f, 0.0f, 13, null);
        startRestartGroup.startReplaceableGroup(-483455358);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
        int i2 = 0;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        int i3 = -1323940314;
        startRestartGroup.startReplaceableGroup(-1323940314);
        String str = "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh";
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m989paddingqDBjuR0$default);
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
        modifierMaterializerOf.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(startRestartGroup)), startRestartGroup, 0);
        int i4 = 2058660585;
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693570, "C77@3893L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Iterator<T> it = this.infoTexts.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            Modifier m989paddingqDBjuR0$default2 = PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(2), 0.0f, 0.0f, 13, null);
            startRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), startRestartGroup, i2);
            startRestartGroup.startReplaceableGroup(i3);
            ComposerKt.sourceInformation(startRestartGroup, str);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i2);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m989paddingqDBjuR0$default2);
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
            modifierMaterializerOf2.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf(i2));
            startRestartGroup.startReplaceableGroup(i4);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.md5_7b9ba6119966d71e264394066b53d66a, startRestartGroup, i2), "", SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(20)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 440, 120);
            Composer composer2 = startRestartGroup;
            TextKt.m3014Text4IGK_g(StringResources_androidKt.stringResource(intValue, startRestartGroup, i2), PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6997constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), ColorKt.Color(4294967295L), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3504, 6, 130032);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            i3 = i3;
            str = str;
            i2 = i2;
            startRestartGroup = composer2;
            i4 = 2058660585;
        }
        Composer composer3 = startRestartGroup;
        ComposerKt.sourceInformationMarkerEnd(composer3);
        composer3.endReplaceableGroup();
        composer3.endNode();
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.guide.memo50741.activity.Vip50741AActivity$DescriptionView$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                invoke(composer4, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer4, int i5) {
                Vip50741AActivity.this.DescriptionView(composer4, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    public final void PurchaseView(Modifier modifier, Composer composer, final int i, final int i2) {
        long m4550getTransparent0d7_KjU;
        long m4550getTransparent0d7_KjU2;
        Composer startRestartGroup = composer.startRestartGroup(377126471);
        ComposerKt.sourceInformation(startRestartGroup, "C(PurchaseView)");
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(377126471, i, -1, "com.glority.android.guide.memo50741.activity.Vip50741AActivity.PurchaseView (Vip50741AActivity.kt:323)");
        }
        startRestartGroup.startReplaceableGroup(-483455358);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
        modifierMaterializerOf.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693570, "C77@3893L9:Column.kt#2w3rfo");
        Modifier align = ColumnScopeInstance.INSTANCE.align(SizeKt.m1035width3ABfNKs(modifier2, Dp.m6997constructorimpl(340)), Alignment.INSTANCE.getCenterHorizontally());
        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        startRestartGroup.startReplaceableGroup(693286680);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, startRestartGroup, 54);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(align);
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
        modifierMaterializerOf2.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        float f = (float) 3.5d;
        float f2 = 115;
        final Modifier modifier3 = modifier2;
        Modifier weight$default = RowScope.weight$default(rowScopeInstance, SizeKt.m1018heightInVpY3zN4$default(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m6997constructorimpl(f), 0.0f, 11, null), Dp.m6997constructorimpl(f2), 0.0f, 2, null), 102.0f, false, 2, null);
        float f3 = 2;
        float m6997constructorimpl = Dp.m6997constructorimpl(f3);
        if (Intrinsics.areEqual(getCurrentSku(), this.weeklySKU)) {
            m4550getTransparent0d7_KjU = ColorKt.Color(4294618905L);
        } else {
            m4550getTransparent0d7_KjU = Color.INSTANCE.m4550getTransparent0d7_KjU();
        }
        Modifier m573clickableXHw0xAI$default = ClickableKt.m573clickableXHw0xAI$default(BackgroundKt.m540backgroundbw27NRU$default(ClipKt.clip(BorderKt.m551borderxT4_qwU(weight$default, m6997constructorimpl, m4550getTransparent0d7_KjU, RoundedCornerShapeKt.RoundedCornerShape(10)), RoundedCornerShapeKt.RoundedCornerShape(10)), ColorKt.Color(818201796), null, 2, null), false, null, null, new Function0<Unit>() { // from class: com.glority.android.guide.memo50741.activity.Vip50741AActivity$PurchaseView$1$1$1
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
                String str;
                MutableState mutableState;
                Vip50741AActivity vip50741AActivity = Vip50741AActivity.this;
                str = vip50741AActivity.weeklySKU;
                vip50741AActivity.setCurrentSku(str);
                mutableState = Vip50741AActivity.this.isTrialSkuSelected;
                mutableState.setValue(false);
                Vip50741AActivity.this.startPurchase();
            }
        }, 7, null);
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
        startRestartGroup.startReplaceableGroup(-483455358);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(center2, centerHorizontally, startRestartGroup, 54);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m573clickableXHw0xAI$default);
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
        modifierMaterializerOf3.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693570, "C77@3893L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        ResizableTextKt.m7716ResizableText4IGK_g(StringResources_androidKt.stringResource(R.string.base_widget_text_weekly, startRestartGroup, 0), PaddingKt.m987paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6997constructorimpl(f3), 0.0f, 2, null), ColorKt.Color(4294967295L), TextUnitKt.getSp(14), null, new FontWeight(700), null, 0L, null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), 0L, 0, false, 1, 0, null, 0, startRestartGroup, 200112, 3072, 122320);
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        String str = this.priceSymbol.getValue() + ' ' + this.weekPrice.getValue();
        builder.append(str);
        String str2 = str;
        builder.addStyle(new SpanStyle(0L, 0L, new FontWeight(700), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null), StringsKt.indexOf$default((CharSequence) str2, this.weekPrice.getValue(), 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) str2, this.weekPrice.getValue(), 0, false, 6, (Object) null) + this.weekPrice.getValue().length());
        float f4 = 4;
        ResizableTextKt.m7717ResizableTextIbK3jfQ(builder.toAnnotatedString(), PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(f4), 0.0f, 0.0f, 13, null), ColorKt.Color(4294967295L), TextUnitKt.getSp(14), FontStyle.m6567boximpl(FontStyle.INSTANCE.m6577getNormal_LCdwA()), new FontWeight(400), null, 0L, null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), 0L, 0, false, 2, 0, null, null, 0, startRestartGroup, 200112, 3072, 253376);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        Modifier m573clickableXHw0xAI$default2 = ClickableKt.m573clickableXHw0xAI$default(BackgroundKt.m540backgroundbw27NRU$default(ClipKt.clip(RowScope.weight$default(rowScopeInstance, BorderKt.m551borderxT4_qwU(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6997constructorimpl(f), 0.0f, Dp.m6997constructorimpl(f), 0.0f, 10, null), Dp.m6997constructorimpl(f3), Intrinsics.areEqual(getCurrentSku(), this.yearlySKU) ? ColorKt.Color(4294618905L) : ColorKt.Color(4290624957L), RoundedCornerShapeKt.RoundedCornerShape(10)), 120.0f, false, 2, null), RoundedCornerShapeKt.RoundedCornerShape(10)), ColorKt.Color(818201796), null, 2, null), false, null, null, new Function0<Unit>() { // from class: com.glority.android.guide.memo50741.activity.Vip50741AActivity$PurchaseView$1$1$3
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
                String str3;
                MutableState mutableState;
                Vip50741AActivity vip50741AActivity = Vip50741AActivity.this;
                str3 = vip50741AActivity.yearlySKU;
                vip50741AActivity.setCurrentSku(str3);
                mutableState = Vip50741AActivity.this.isTrialSkuSelected;
                mutableState.setValue(true);
                Vip50741AActivity.this.startPurchase();
            }
        }, 7, null);
        Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
        startRestartGroup.startReplaceableGroup(-483455358);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(m573clickableXHw0xAI$default2);
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
        Updater.m4015setimpl(m4008constructorimpl4, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4015setimpl(m4008constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4008constructorimpl4.getInserting() || !Intrinsics.areEqual(m4008constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            m4008constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m4008constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
        }
        modifierMaterializerOf4.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693570, "C77@3893L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        ResizableTextKt.m7716ResizableText4IGK_g(StringResources_androidKt.stringResource(R.string.base_widget_text_most_popular, startRestartGroup, 0), PaddingKt.m986paddingVpY3zN4(BackgroundKt.m540backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Intrinsics.areEqual(getCurrentSku(), this.yearlySKU) ? ColorKt.Color(4294618905L) : ColorKt.Color(4290624957L), null, 2, null), Dp.m6997constructorimpl(f4), Dp.m6997constructorimpl((float) 2.5d)), ColorKt.Color(4280624421L), TextUnitKt.getSp(12), null, new FontWeight(700), null, 0L, null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), 0L, 0, false, 2, 0, null, 0, startRestartGroup, 200064, 3072, 122320);
        Modifier m1018heightInVpY3zN4$default = SizeKt.m1018heightInVpY3zN4$default(Modifier.INSTANCE, Dp.m6997constructorimpl(110), 0.0f, 2, null);
        Alignment center3 = Alignment.INSTANCE.getCenter();
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center3, false, startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(m1018heightInVpY3zN4$default);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor5);
        } else {
            startRestartGroup.useNode();
        }
        Composer m4008constructorimpl5 = Updater.m4008constructorimpl(startRestartGroup);
        Updater.m4015setimpl(m4008constructorimpl5, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4015setimpl(m4008constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4008constructorimpl5.getInserting() || !Intrinsics.areEqual(m4008constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
            m4008constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
            m4008constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
        }
        modifierMaterializerOf5.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ResizableTextKt.m7716ResizableText4IGK_g(StringResources_androidKt.stringResource(R.string.base_widget_text_7_day_free_trial, startRestartGroup, 0), PaddingKt.m985padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6997constructorimpl(f4)), ColorKt.Color(4294967295L), TextUnitKt.getSp(17), null, new FontWeight(700), null, 0L, null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), 0L, 0, false, 3, 0, null, 0, startRestartGroup, 200112, 3072, 122320);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        Modifier weight$default2 = RowScope.weight$default(rowScopeInstance, SizeKt.m1018heightInVpY3zN4$default(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6997constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), Dp.m6997constructorimpl(f2), 0.0f, 2, null), 102.0f, false, 2, null);
        float m6997constructorimpl2 = Dp.m6997constructorimpl(f3);
        if (Intrinsics.areEqual(getCurrentSku(), this.monthlySKU)) {
            m4550getTransparent0d7_KjU2 = ColorKt.Color(4294618905L);
        } else {
            m4550getTransparent0d7_KjU2 = Color.INSTANCE.m4550getTransparent0d7_KjU();
        }
        Modifier m573clickableXHw0xAI$default3 = ClickableKt.m573clickableXHw0xAI$default(BackgroundKt.m539backgroundbw27NRU(ClipKt.clip(BorderKt.m551borderxT4_qwU(weight$default2, m6997constructorimpl2, m4550getTransparent0d7_KjU2, RoundedCornerShapeKt.RoundedCornerShape(10)), RoundedCornerShapeKt.RoundedCornerShape(10)), ColorKt.Color(818201796), RoundedCornerShapeKt.RoundedCornerShape(10)), false, null, null, new Function0<Unit>() { // from class: com.glority.android.guide.memo50741.activity.Vip50741AActivity$PurchaseView$1$1$5
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
                String str3;
                MutableState mutableState;
                Vip50741AActivity vip50741AActivity = Vip50741AActivity.this;
                str3 = vip50741AActivity.monthlySKU;
                vip50741AActivity.setCurrentSku(str3);
                mutableState = Vip50741AActivity.this.isTrialSkuSelected;
                mutableState.setValue(false);
                Vip50741AActivity.this.startPurchase();
            }
        }, 7, null);
        Alignment.Horizontal centerHorizontally3 = Alignment.INSTANCE.getCenterHorizontally();
        Arrangement.HorizontalOrVertical center4 = Arrangement.INSTANCE.getCenter();
        startRestartGroup.startReplaceableGroup(-483455358);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(center4, centerHorizontally3, startRestartGroup, 54);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(m573clickableXHw0xAI$default3);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor6);
        } else {
            startRestartGroup.useNode();
        }
        Composer m4008constructorimpl6 = Updater.m4008constructorimpl(startRestartGroup);
        Updater.m4015setimpl(m4008constructorimpl6, columnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4015setimpl(m4008constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4008constructorimpl6.getInserting() || !Intrinsics.areEqual(m4008constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
            m4008constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
            m4008constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
        }
        modifierMaterializerOf6.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693570, "C77@3893L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
        ResizableTextKt.m7716ResizableText4IGK_g(StringResources_androidKt.stringResource(R.string.base_widget_text_monthly, startRestartGroup, 0), PaddingKt.m987paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6997constructorimpl(f3), 0.0f, 2, null), ColorKt.Color(4294967295L), TextUnitKt.getSp(14), null, new FontWeight(700), null, 0L, null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), 0L, 0, false, 1, 0, null, 0, startRestartGroup, 200112, 3072, 122320);
        AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
        String str3 = this.priceSymbol.getValue() + ' ' + this.monthPrice.getValue();
        builder2.append(str3);
        String str4 = str3;
        builder2.addStyle(new SpanStyle(0L, 0L, new FontWeight(700), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null), StringsKt.indexOf$default((CharSequence) str4, this.monthPrice.getValue(), 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) str4, this.monthPrice.getValue(), 0, false, 6, (Object) null) + this.monthPrice.getValue().length());
        ResizableTextKt.m7717ResizableTextIbK3jfQ(builder2.toAnnotatedString(), PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(f4), 0.0f, 0.0f, 13, null), ColorKt.Color(4294967295L), TextUnitKt.getSp(14), FontStyle.m6567boximpl(FontStyle.INSTANCE.m6577getNormal_LCdwA()), new FontWeight(400), null, 0L, null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), 0L, 0, false, 2, 0, null, null, 0, startRestartGroup, 200112, 3072, 253376);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        TextKt.m3014Text4IGK_g(StringResources_androidKt.stringResource(R.string.base_widget_text_then_s_year, new Object[]{" " + this.priceSymbol.getValue() + this.yearPrice.getValue()}, startRestartGroup, 64), SizeKt.fillMaxWidth$default(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(7), 0.0f, 0.0f, 13, null), 0.0f, 1, null), ColorKt.Color(4290624957L), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 3504, 0, 130544);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.guide.memo50741.activity.Vip50741AActivity$PurchaseView$2
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
                Vip50741AActivity.this.PurchaseView(modifier3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ReminderBar(Modifier modifier, final MutableState<Boolean> mutableState, Composer composer, final int i, final int i2) {
        Composer startRestartGroup = composer.startRestartGroup(790598343);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(790598343, i, -1, "com.glority.android.guide.memo50741.activity.Vip50741AActivity.ReminderBar (Vip50741AActivity.kt:505)");
        }
        Modifier m540backgroundbw27NRU$default = BackgroundKt.m540backgroundbw27NRU$default(ClipKt.clip(SizeKt.m1035width3ABfNKs(BorderKt.m551borderxT4_qwU(AlphaKt.alpha(modifier2, mutableState.getValue().booleanValue() ? 1.0f : 0.0f), Dp.m6997constructorimpl((float) 0.5d), ColorKt.Color(2147481334), RoundedCornerShapeKt.RoundedCornerShape(60)), Dp.m6997constructorimpl(330)), RoundedCornerShapeKt.RoundedCornerShape(60)), ColorKt.Color(436207615), null, 2, null);
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        startRestartGroup.startReplaceableGroup(693286680);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m540backgroundbw27NRU$default);
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
        modifierMaterializerOf.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
        float f = 9;
        final Modifier modifier3 = modifier2;
        ResizableTextKt.m7716ResizableText4IGK_g(StringResources_androidKt.stringResource(getReminderOpen() ? R.string.ptandroidzy1_enabledtext_text : R.string.text_reminder_guide, startRestartGroup, 0), RowScope.weight$default(RowScopeInstance.INSTANCE, PaddingKt.m988paddingqDBjuR0(Modifier.INSTANCE, Dp.m6997constructorimpl(12), Dp.m6997constructorimpl(f), Dp.m6997constructorimpl(6), Dp.m6997constructorimpl(f)), 1.0f, false, 2, null), ColorKt.Color(4294967295L), TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, 0, startRestartGroup, 3456, 3072, 122864);
        SwitchKt.Switch(getReminderOpen(), new Function1<Boolean, Unit>() { // from class: com.glority.android.guide.memo50741.activity.Vip50741AActivity$ReminderBar$1$1
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
                Bundle bundle1;
                boolean reminderOpen;
                Vip50741AActivity.this.setReminderOpen(z);
                bundle1 = Vip50741AActivity.this.getBundle1();
                Vip50741AActivity vip50741AActivity = Vip50741AActivity.this;
                reminderOpen = vip50741AActivity.getReminderOpen();
                if (reminderOpen) {
                    try {
                        bundle1.putString("status", NotificationManagerCompat.from(vip50741AActivity).areNotificationsEnabled() ? ExifInterface.GPS_MEASUREMENT_2D : "1");
                    } catch (Throwable unused) {
                        bundle1.putString("status", "error");
                    }
                } else {
                    bundle1.putString("status", "close");
                }
                new VipEventRequest("vip_reminder_click", bundle1).post();
            }
        }, PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m6997constructorimpl(10), 0.0f, 11, null), null, false, null, null, startRestartGroup, 384, 120);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.guide.memo50741.activity.Vip50741AActivity$ReminderBar$2
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
                Vip50741AActivity.this.ReminderBar(modifier3, mutableState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ContinueButton(Modifier modifier, Composer composer, final int i, final int i2) {
        Composer startRestartGroup = composer.startRestartGroup(1802190516);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1802190516, i, -1, "com.glority.android.guide.memo50741.activity.Vip50741AActivity.ContinueButton (Vip50741AActivity.kt:547)");
        }
        LottieCompositionResult rememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m7636boximpl(LottieCompositionSpec.RawRes.m7637constructorimpl(R.raw.lottie_50741)), "images", null, null, null, null, startRestartGroup, 48, 60);
        final Modifier modifier3 = modifier2;
        final LottieAnimationState animateLottieCompositionAsState = AnimateLottieCompositionAsStateKt.animateLottieCompositionAsState(ContinueButton$lambda$22(rememberLottieComposition), false, false, false, null, 0.0f, Integer.MAX_VALUE, null, false, false, startRestartGroup, 1572872, 958);
        LottieCompositionResult rememberLottieComposition2 = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m7636boximpl(LottieCompositionSpec.RawRes.m7637constructorimpl(R.raw.lottie_50741_1)), null, null, null, null, null, startRestartGroup, 0, 62);
        final LottieAnimationState animateLottieCompositionAsState2 = AnimateLottieCompositionAsStateKt.animateLottieCompositionAsState(ContinueButton$lambda$22(rememberLottieComposition), false, false, false, null, 0.0f, Integer.MAX_VALUE, null, false, false, startRestartGroup, 1572872, 958);
        Modifier m573clickableXHw0xAI$default = ClickableKt.m573clickableXHw0xAI$default(SizeKt.wrapContentHeight$default(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(8), 0.0f, 0.0f, 13, null), null, false, 3, null), false, null, null, new Function0<Unit>() { // from class: com.glority.android.guide.memo50741.activity.Vip50741AActivity$ContinueButton$1
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
                Vip50741AActivity.this.startPurchase();
            }
        }, 7, null);
        Alignment center = Alignment.INSTANCE.getCenter();
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m573clickableXHw0xAI$default);
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
        Updater.m4015setimpl(m4008constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        LottieComposition ContinueButton$lambda$24 = ContinueButton$lambda$24(rememberLottieComposition2);
        ContentScale fillWidth = ContentScale.INSTANCE.getFillWidth();
        Modifier m1016height3ABfNKs = SizeKt.m1016height3ABfNKs(SizeKt.m1035width3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(380)), Dp.m6997constructorimpl(74));
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = startRestartGroup.changed(animateLottieCompositionAsState2);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = (Function0) new Function0<Float>() { // from class: com.glority.android.guide.memo50741.activity.Vip50741AActivity$ContinueButton$2$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Float invoke() {
                    float ContinueButton$lambda$25;
                    ContinueButton$lambda$25 = Vip50741AActivity.ContinueButton$lambda$25(LottieAnimationState.this);
                    return Float.valueOf(ContinueButton$lambda$25);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        LottieAnimationKt.LottieAnimation(ContinueButton$lambda$24, (Function0) rememberedValue, m1016height3ABfNKs, false, false, false, null, false, null, null, fillWidth, false, null, null, startRestartGroup, 392, 6, 15352);
        Modifier m539backgroundbw27NRU = BackgroundKt.m539backgroundbw27NRU(SizeKt.m1016height3ABfNKs(SizeKt.m1035width3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(330)), Dp.m6997constructorimpl(50)), ColorKt.Color(4294618905L), RoundedCornerShapeKt.RoundedCornerShape(60));
        Alignment center2 = Alignment.INSTANCE.getCenter();
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m539backgroundbw27NRU);
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
        Updater.m4015setimpl(m4008constructorimpl2, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        TextKt.m3014Text4IGK_g(StringResources_androidKt.stringResource(Intrinsics.areEqual(getCurrentSku(), this.yearlySKU) ? R.string.personal_center_text_try_for_free : R.string.base_widget_text_continue, startRestartGroup, 0), (Modifier) null, ColorKt.Color(4280624421L), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 200064, 0, 131026);
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.md5_61cf8ea30e7e868339468bea798d7190, startRestartGroup, 0), (String) null, PaddingKt.m989paddingqDBjuR0$default(boxScopeInstance2.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterEnd()), 0.0f, 0.0f, Dp.m6997constructorimpl(35), 0.0f, 11, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 56, 120);
        LottieComposition ContinueButton$lambda$22 = ContinueButton$lambda$22(rememberLottieComposition);
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed2 = startRestartGroup.changed(animateLottieCompositionAsState);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (Function0) new Function0<Float>() { // from class: com.glority.android.guide.memo50741.activity.Vip50741AActivity$ContinueButton$2$2$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Float invoke() {
                    float ContinueButton$lambda$23;
                    ContinueButton$lambda$23 = Vip50741AActivity.ContinueButton$lambda$23(LottieAnimationState.this);
                    return Float.valueOf(ContinueButton$lambda$23);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        LottieAnimationKt.LottieAnimation(ContinueButton$lambda$22, (Function0) rememberedValue2, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, false, null, false, null, null, null, false, null, null, startRestartGroup, 392, 0, 16376);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.guide.memo50741.activity.Vip50741AActivity$ContinueButton$3
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
                Vip50741AActivity.this.ContinueButton(modifier3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    private static final LottieComposition ContinueButton$lambda$22(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ContinueButton$lambda$23(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    private static final LottieComposition ContinueButton$lambda$24(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ContinueButton$lambda$25(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if ((r67 & 2) != 0) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void PolicyView(final androidx.compose.foundation.ScrollState r63, androidx.compose.ui.Modifier r64, androidx.compose.runtime.Composer r65, final int r66, final int r67) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.guide.memo50741.activity.Vip50741AActivity.PolicyView(androidx.compose.foundation.ScrollState, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    @Override // com.glority.android.guide.iface.IBillingListener
    public void changePrice() {
        String result = new BillingUIGetCurrencyCodeRequest(this.yearlySKU, null, 2, null).toResult();
        if (result == null) {
            return;
        }
        String result2 = new BillingUIGetPriceBySkuRequest(this.yearlySKU, null, 2, null).toResult();
        if (result2 == null) {
            result2 = "";
        }
        String result3 = new BillingUIGetPriceBySkuRequest(this.monthlySKU, null, 2, null).toResult();
        if (result3 == null) {
            result3 = "";
        }
        String result4 = new BillingUIGetPriceBySkuRequest(this.weeklySKU, null, 2, null).toResult();
        String str = result4 != null ? result4 : "";
        this.yearPrice.setValue(result2);
        this.monthPrice.setValue(result3);
        this.weekPrice.setValue(str);
        this.priceSymbol.setValue(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle getBundle1() {
        String countryCode = Locale.getDefault().getCountry();
        Intrinsics.checkNotNullExpressionValue(countryCode, "countryCode");
        if (countryCode.length() == 0) {
            countryCode = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        return LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("from", getPageFrom()), TuplesKt.to("name", Integer.valueOf(getPageType())), TuplesKt.to("group", getGroup()), TuplesKt.to(LogEventArguments.ARG_STRING_1, getAbtestId()), TuplesKt.to("code", countryCode), TuplesKt.to(LogEventArguments.ARG_STEP, getOpenTimes()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startPurchase() {
        new GuidePurchaseRequest(getCurrentSku(), null, Boolean.valueOf(getReminderOpen() && this.isTrialSkuSelected.getValue().booleanValue()), null, 0, 26, null).post();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LoadingPage$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }
}
