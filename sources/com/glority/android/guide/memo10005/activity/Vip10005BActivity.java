package com.glority.android.guide.memo10005.activity;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.FrameLayout;
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
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
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
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.location.LocationRequestCompat;
import androidx.core.os.EnvironmentCompat;
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
import com.glority.android.picturexx.business.R;
import com.glority.android.xx.constants.Args;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.audio.WavUtil;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Vip10005BActivity.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J!\u0010$\u001a\u00020!2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020!0&H\u0007¢\u0006\u0002\u0010(J\r\u0010)\u001a\u00020!H\u0003¢\u0006\u0002\u0010*J\r\u0010+\u001a\u00020!H\u0003¢\u0006\u0002\u0010*J\r\u0010,\u001a\u00020!H\u0007¢\u0006\u0002\u0010*J\r\u0010-\u001a\u00020!H\u0003¢\u0006\u0002\u0010*J\u0017\u0010.\u001a\u00020!2\b\b\u0002\u0010/\u001a\u000200H\u0007¢\u0006\u0002\u00101J%\u00102\u001a\u00020!2\b\b\u0002\u0010/\u001a\u0002002\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0003¢\u0006\u0002\u00104J\u0017\u00105\u001a\u00020!2\b\b\u0002\u0010/\u001a\u000200H\u0003¢\u0006\u0002\u00101J\u001f\u00106\u001a\u00020!2\u0006\u00107\u001a\u0002082\b\b\u0002\u0010/\u001a\u000200H\u0007¢\u0006\u0002\u00109J\b\u0010:\u001a\u00020\u0012H\u0014J\b\u0010;\u001a\u00020!H\u0016J\b\u0010<\u001a\u00020#H\u0002J\b\u0010=\u001a\u00020!H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00128B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006>²\u0006\n\u0010?\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010@\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010A\u001a\u00020'X\u008a\u0084\u0002²\u0006\f\u0010B\u001a\u0004\u0018\u00010CX\u008a\u0084\u0002²\u0006\n\u0010D\u001a\u00020'X\u008a\u0084\u0002²\u0006\f\u0010E\u001a\u0004\u0018\u00010CX\u008a\u0084\u0002²\u0006\n\u0010F\u001a\u00020'X\u008a\u0084\u0002"}, d2 = {"Lcom/glority/android/guide/memo10005/activity/Vip10005BActivity;", "Lcom/glority/android/guide/base/BasePurchaseActivity;", "<init>", "()V", "yearlySKU", "", "monthlySKU", "weeklySKU", "<set-?>", "currentSku", "getCurrentSku", "()Ljava/lang/String;", "setCurrentSku", "(Ljava/lang/String;)V", "currentSku$delegate", "Landroidx/compose/runtime/MutableState;", "isTrialSkuSelected", "Landroidx/compose/runtime/MutableState;", "", "reminderOpen", "getReminderOpen", "()Z", "setReminderOpen", "(Z)V", "reminderOpen$delegate", "yearPrice", "monthPrice", "weekPrice", "priceSymbol", "infoTexts", "", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "LoadingPage", "finishedListener", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "purchasePage", "(Landroidx/compose/runtime/Composer;I)V", "restoreAndCloseBar", "HeaderImage", "DescriptionView", "PurchaseView", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ReminderBar", "visible", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;II)V", "ContinueButton", "PolicyView", "scrollState", "Landroidx/compose/foundation/ScrollState;", "(Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "showBackPressedCloseRetain", "changePrice", "getBundle1", "startPurchase", "businessMod_release", Args.pageName, "enabled", "scale", "composition", "Lcom/airbnb/lottie/LottieComposition;", "progress", "composition1", "progress1"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes13.dex */
public final class Vip10005BActivity extends BasePurchaseActivity {
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
    private String yearlySKU = "sub_yearly_7dt";
    private String monthlySKU = "sub_month";
    private String weeklySKU = "sub_week";

    @Override // com.glority.android.guide.base.BasePurchaseActivity
    protected boolean showBackPressedCloseRetain() {
        return true;
    }

    public Vip10005BActivity() {
        MutableState mutableStateOf$default;
        MutableState<Boolean> mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState<String> mutableStateOf$default4;
        MutableState<String> mutableStateOf$default5;
        MutableState<String> mutableStateOf$default6;
        MutableState<String> mutableStateOf$default7;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("sub_yearly_7dt", null, 2, null);
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
        this.infoTexts = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.string.conversionpage_foreigncatalog_caption_spec1), Integer.valueOf(R.string.conversionpage_foreigncatalog_caption_spec2), Integer.valueOf(R.string.conversionpage_foreigncatalog_caption_spec3), Integer.valueOf(R.string.conversionpage_foreigncatalog_caption_spec4)});
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
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1685501565, true, new Vip10005BActivity$onCreate$1(this)), 1, null);
    }

    public final void LoadingPage(final Function1<? super Float, Unit> finishedListener, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(finishedListener, "finishedListener");
        Composer startRestartGroup = composer.startRestartGroup(-110352699);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(finishedListener) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-110352699, i2, -1, "com.glority.android.guide.memo10005.activity.Vip10005BActivity.LoadingPage (Vip10005BActivity.kt:151)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            MutableState mutableState = (MutableState) rememberedValue;
            final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(LoadingPage$lambda$1(mutableState) ? 1.0f : 2.2f, AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: com.glority.android.guide.memo10005.activity.Vip10005BActivity$LoadingPage$scale$2
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
            startRestartGroup.startReplaceableGroup(1780991658);
            boolean changed = startRestartGroup.changed(animateFloatAsState);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: com.glority.android.guide.memo10005.activity.Vip10005BActivity$LoadingPage$1$1
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
                        LoadingPage$lambda$3 = Vip10005BActivity.LoadingPage$lambda$3(animateFloatAsState);
                        graphicsLayer.setScaleY(LoadingPage$lambda$3);
                        LoadingPage$lambda$32 = Vip10005BActivity.LoadingPage$lambda$3(animateFloatAsState);
                        graphicsLayer.setScaleX(LoadingPage$lambda$32);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(fillMaxSize$default, (Function1) rememberedValue2);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, graphicsLayer);
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
            SpacerKt.Spacer(SizeKt.fillMaxHeight(Modifier.INSTANCE, 0.4f), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-817489890);
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
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Unit unit = Unit.INSTANCE;
            composer2.startReplaceableGroup(1780992898);
            boolean changed2 = composer2.changed(mutableState);
            Vip10005BActivity$LoadingPage$3$1 rememberedValue3 = composer2.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Vip10005BActivity$LoadingPage$3$1(mutableState, null);
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
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.guide.memo10005.activity.Vip10005BActivity$LoadingPage$4
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
                    Vip10005BActivity.this.LoadingPage(finishedListener, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadingPage$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @PreviewUi
    public final void purchasePage(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(784976801);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(784976801, i, -1, "com.glority.android.guide.memo10005.activity.Vip10005BActivity.purchasePage (Vip10005BActivity.kt:200)");
        }
        final ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
        ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localConfiguration);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Dp.m6997constructorimpl(Dp.m6997constructorimpl(((Configuration) consume).screenHeightDp) * 0.364f);
        MaterialThemeKt.MaterialTheme(ColorScheme.m2209copyCXl9yA$default(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable), ColorKt.Color(4294618905L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -2, 15, null), null, null, ComposableLambdaKt.composableLambda(startRestartGroup, -938155915, true, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.guide.memo10005.activity.Vip10005BActivity$purchasePage$1
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
                        ComposerKt.traceEventStart(-938155915, i2, -1, "com.glority.android.guide.memo10005.activity.Vip10005BActivity.purchasePage.<anonymous> (Vip10005BActivity.kt:205)");
                    }
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    ScrollState scrollState = ScrollState.this;
                    Vip10005BActivity vip10005BActivity = this;
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
                    Modifier verticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(BackgroundKt.m540backgroundbw27NRU$default(Modifier.INSTANCE, Color.INSTANCE.m4541getBlack0d7_KjU(), null, 2, null), 0.0f, 1, null), scrollState, false, null, false, 14, null);
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, verticalScroll$default);
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
                    Updater.m4015setimpl(m4008constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion);
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
                    Updater.m4015setimpl(m4008constructorimpl3, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4015setimpl(m4008constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4008constructorimpl3.getInserting() || !Intrinsics.areEqual(m4008constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        m4008constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m4008constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m4015setimpl(m4008constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    vip10005BActivity.HeaderImage(composer2, 8);
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.md5_2b8f2c7bb292da76a0f2906980f81c48, composer2, 0), (String) null, SizeKt.m1035width3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(158)), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composer2, 25016, LocationRequestCompat.QUALITY_LOW_POWER);
                    vip10005BActivity.DescriptionView(composer2, 8);
                    vip10005BActivity.PurchaseView(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(16), 0.0f, 0.0f, 13, null), composer2, 70, 0);
                    float f = 10;
                    Modifier m989paddingqDBjuR0$default = PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(f), 0.0f, 0.0f, 13, null);
                    mutableState = vip10005BActivity.isTrialSkuSelected;
                    vip10005BActivity.ReminderBar(m989paddingqDBjuR0$default, mutableState, composer2, 518, 0);
                    vip10005BActivity.ContinueButton(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(f), 0.0f, 0.0f, 13, null), composer2, 70, 0);
                    SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer2, 0);
                    vip10005BActivity.PolicyView(scrollState, null, composer2, 512, 2);
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
                    vip10005BActivity.restoreAndCloseBar(composer2, 8);
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
        }), startRestartGroup, 3072, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.guide.memo10005.activity.Vip10005BActivity$purchasePage$2
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
                    Vip10005BActivity.this.purchasePage(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restoreAndCloseBar(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(2041845069);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2041845069, i, -1, "com.glority.android.guide.memo10005.activity.Vip10005BActivity.restoreAndCloseBar (Vip10005BActivity.kt:239)");
        }
        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
        float f = 16;
        Modifier m989paddingqDBjuR0$default = PaddingKt.m989paddingqDBjuR0$default(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null)), Dp.m6997constructorimpl(f), 0.0f, Dp.m6997constructorimpl(f), 0.0f, 10, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
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
        ResizableTextKt.m7716ResizableText4IGK_g(StringResources_androidKt.stringResource(R.string.base_widget_text_restore, startRestartGroup, 0), ClickableKt.m573clickableXHw0xAI$default(SizeKt.m1037widthInVpY3zN4$default(AlphaKt.alpha(Modifier.INSTANCE, 0.5f), Dp.m6997constructorimpl(160), 0.0f, 2, null), false, null, null, new Function0<Unit>() { // from class: com.glority.android.guide.memo10005.activity.Vip10005BActivity$restoreAndCloseBar$1$1
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
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.md5_6a2d1ce47e05102d914a6d21126966ac, startRestartGroup, 0), "", ClickableKt.m573clickableXHw0xAI$default(AlphaKt.alpha(rowScopeInstance.align(SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(12)), Alignment.INSTANCE.getCenterVertically()), 0.5f), false, null, null, new Function0<Unit>() { // from class: com.glority.android.guide.memo10005.activity.Vip10005BActivity$restoreAndCloseBar$1$2
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
                Vip10005BActivity.this.trackClose();
                Vip10005BActivity.this.postUiCloseRequest();
            }
        }, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 56, 120);
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
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.guide.memo10005.activity.Vip10005BActivity$restoreAndCloseBar$2
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
                    Vip10005BActivity.this.restoreAndCloseBar(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public final void HeaderImage(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1523186881);
        if ((i & 1) != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1523186881, i, -1, "com.glority.android.guide.memo10005.activity.Vip10005BActivity.HeaderImage (Vip10005BActivity.kt:276)");
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
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Context context = (Context) consume3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            Object obj = rememberedValue;
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                SimpleExoPlayer build = new SimpleExoPlayer.Builder(context).build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                MediaItem fromUri = MediaItem.fromUri(RawResourceDataSource.buildRawResourceUri(R.raw.video_100052));
                Intrinsics.checkNotNullExpressionValue(fromUri, "fromUri(...)");
                build.setMediaItem(fromUri);
                build.prepare();
                build.setPlayWhenReady(true);
                build.setRepeatMode(2);
                startRestartGroup.updateRememberedValue(build);
                obj = build;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final SimpleExoPlayer simpleExoPlayer = (SimpleExoPlayer) obj;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
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
            AndroidView_androidKt.AndroidView(new Function1<Context, PlayerView>() { // from class: com.glority.android.guide.memo10005.activity.Vip10005BActivity$HeaderImage$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final PlayerView invoke(Context context2) {
                    Intrinsics.checkNotNullParameter(context2, "context");
                    PlayerView playerView = new PlayerView(context2);
                    SimpleExoPlayer simpleExoPlayer2 = SimpleExoPlayer.this;
                    playerView.hideController();
                    playerView.setUseController(false);
                    playerView.setPlayer(simpleExoPlayer2);
                    playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    return playerView;
                }
            }, SizeKt.fillMaxWidth$default(SizeKt.m1016height3ABfNKs(Modifier.INSTANCE, m7011unboximpl), 0.0f, 1, null), null, startRestartGroup, 0, 4);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.DisposableEffect(Unit.INSTANCE, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.glority.android.guide.memo10005.activity.Vip10005BActivity$HeaderImage$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                    final SimpleExoPlayer simpleExoPlayer2 = SimpleExoPlayer.this;
                    return new DisposableEffectResult() { // from class: com.glority.android.guide.memo10005.activity.Vip10005BActivity$HeaderImage$2$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            SimpleExoPlayer.this.release();
                        }
                    };
                }
            }, startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.guide.memo10005.activity.Vip10005BActivity$HeaderImage$3
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
                    Vip10005BActivity.this.HeaderImage(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void DescriptionView(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(2059023276);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2059023276, i, -1, "com.glority.android.guide.memo10005.activity.Vip10005BActivity.DescriptionView (Vip10005BActivity.kt:311)");
        }
        Modifier m989paddingqDBjuR0$default = PaddingKt.m989paddingqDBjuR0$default(SizeKt.m1035width3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(340)), 0.0f, Dp.m6997constructorimpl(6), 0.0f, 0.0f, 13, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        int i2 = 0;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        int i3 = -1323940314;
        String str = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m989paddingqDBjuR0$default);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        int i4 = -692256719;
        String str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
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
        startRestartGroup.startReplaceableGroup(-965492823);
        Iterator<T> it = this.infoTexts.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            Modifier m989paddingqDBjuR0$default2 = PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(2), 0.0f, 0.0f, 13, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), startRestartGroup, i2);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, i3, str);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i2);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m989paddingqDBjuR0$default2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, i4, str2);
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
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.md5_7b9ba6119966d71e264394066b53d66a, startRestartGroup, i2), "", SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(20)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 440, 120);
            Composer composer2 = startRestartGroup;
            TextKt.m3014Text4IGK_g(StringResources_androidKt.stringResource(intValue, startRestartGroup, i2), PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6997constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), ColorKt.Color(4294967295L), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3504, 6, 130032);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            str2 = str2;
            i4 = i4;
            str = str;
            i3 = -1323940314;
            i2 = i2;
            startRestartGroup = composer2;
        }
        Composer composer3 = startRestartGroup;
        composer3.endReplaceableGroup();
        ComposerKt.sourceInformationMarkerEnd(composer3);
        composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.guide.memo10005.activity.Vip10005BActivity$DescriptionView$2
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
                    Vip10005BActivity.this.DescriptionView(composer4, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public final void PurchaseView(Modifier modifier, Composer composer, final int i, final int i2) {
        long m4550getTransparent0d7_KjU;
        long m4550getTransparent0d7_KjU2;
        Composer startRestartGroup = composer.startRestartGroup(2098773026);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2098773026, i, -1, "com.glority.android.guide.memo10005.activity.Vip10005BActivity.PurchaseView (Vip10005BActivity.kt:341)");
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
        Modifier align = ColumnScopeInstance.INSTANCE.align(SizeKt.m1035width3ABfNKs(modifier2, Dp.m6997constructorimpl(340)), Alignment.INSTANCE.getCenterHorizontally());
        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, align);
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
        Modifier m573clickableXHw0xAI$default = ClickableKt.m573clickableXHw0xAI$default(BackgroundKt.m540backgroundbw27NRU$default(ClipKt.clip(BorderKt.m551borderxT4_qwU(weight$default, m6997constructorimpl, m4550getTransparent0d7_KjU, RoundedCornerShapeKt.RoundedCornerShape(10)), RoundedCornerShapeKt.RoundedCornerShape(10)), ColorKt.Color(818201796), null, 2, null), false, null, null, new Function0<Unit>() { // from class: com.glority.android.guide.memo10005.activity.Vip10005BActivity$PurchaseView$1$1$1
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
                Vip10005BActivity vip10005BActivity = Vip10005BActivity.this;
                str = vip10005BActivity.weeklySKU;
                vip10005BActivity.setCurrentSku(str);
                mutableState = Vip10005BActivity.this.isTrialSkuSelected;
                mutableState.setValue(false);
                Vip10005BActivity.this.startPurchase();
            }
        }, 7, null);
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(center2, centerHorizontally, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m573clickableXHw0xAI$default);
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
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        ResizableTextKt.m7716ResizableText4IGK_g(StringResources_androidKt.stringResource(R.string.base_widget_text_weekly, startRestartGroup, 0), PaddingKt.m987paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6997constructorimpl(f3), 0.0f, 2, null), ColorKt.Color(4294967295L), TextUnitKt.getSp(14), null, new FontWeight(700), null, 0L, null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), 0L, 0, false, 1, 0, null, 0, startRestartGroup, 200112, 3072, 122320);
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        String str = ((Object) this.priceSymbol.getValue()) + " " + ((Object) this.weekPrice.getValue());
        builder.append(str);
        String str2 = str;
        builder.addStyle(new SpanStyle(0L, 0L, new FontWeight(700), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null), StringsKt.indexOf$default((CharSequence) str2, this.weekPrice.getValue(), 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) str2, this.weekPrice.getValue(), 0, false, 6, (Object) null) + this.weekPrice.getValue().length());
        float f4 = 4;
        ResizableTextKt.m7717ResizableTextIbK3jfQ(builder.toAnnotatedString(), PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(f4), 0.0f, 0.0f, 13, null), ColorKt.Color(4294967295L), TextUnitKt.getSp(14), FontStyle.m6567boximpl(FontStyle.INSTANCE.m6577getNormal_LCdwA()), new FontWeight(400), null, 0L, null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), 0L, 0, false, 2, 0, null, null, 0, startRestartGroup, 200112, 3072, 253376);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier m573clickableXHw0xAI$default2 = ClickableKt.m573clickableXHw0xAI$default(BackgroundKt.m540backgroundbw27NRU$default(ClipKt.clip(RowScope.weight$default(rowScopeInstance, BorderKt.m551borderxT4_qwU(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6997constructorimpl(f), 0.0f, Dp.m6997constructorimpl(f), 0.0f, 10, null), Dp.m6997constructorimpl(f3), Intrinsics.areEqual(getCurrentSku(), this.yearlySKU) ? ColorKt.Color(4294618905L) : ColorKt.Color(4290624957L), RoundedCornerShapeKt.RoundedCornerShape(10)), 120.0f, false, 2, null), RoundedCornerShapeKt.RoundedCornerShape(10)), ColorKt.Color(818201796), null, 2, null), false, null, null, new Function0<Unit>() { // from class: com.glority.android.guide.memo10005.activity.Vip10005BActivity$PurchaseView$1$1$3
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
                Vip10005BActivity vip10005BActivity = Vip10005BActivity.this;
                str3 = vip10005BActivity.yearlySKU;
                vip10005BActivity.setCurrentSku(str3);
                mutableState = Vip10005BActivity.this.isTrialSkuSelected;
                mutableState.setValue(true);
                Vip10005BActivity.this.startPurchase();
            }
        }, 7, null);
        Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, m573clickableXHw0xAI$default2);
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
        Updater.m4015setimpl(m4008constructorimpl4, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4015setimpl(m4008constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4008constructorimpl4.getInserting() || !Intrinsics.areEqual(m4008constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            m4008constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m4008constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
        }
        Updater.m4015setimpl(m4008constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        ResizableTextKt.m7716ResizableText4IGK_g(StringResources_androidKt.stringResource(R.string.base_widget_text_most_popular, startRestartGroup, 0), PaddingKt.m986paddingVpY3zN4(BackgroundKt.m540backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Intrinsics.areEqual(getCurrentSku(), this.yearlySKU) ? ColorKt.Color(4294618905L) : ColorKt.Color(4290624957L), null, 2, null), Dp.m6997constructorimpl(f4), Dp.m6997constructorimpl((float) 2.5d)), ColorKt.Color(4280624421L), TextUnitKt.getSp(12), null, new FontWeight(700), null, 0L, null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), 0L, 0, false, 2, 0, null, 0, startRestartGroup, 200064, 3072, 122320);
        Modifier m1018heightInVpY3zN4$default = SizeKt.m1018heightInVpY3zN4$default(Modifier.INSTANCE, Dp.m6997constructorimpl(110), 0.0f, 2, null);
        Alignment center3 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center3, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, m1018heightInVpY3zN4$default);
        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
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
        Updater.m4015setimpl(m4008constructorimpl5, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4015setimpl(m4008constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4008constructorimpl5.getInserting() || !Intrinsics.areEqual(m4008constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
            m4008constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
            m4008constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
        }
        Updater.m4015setimpl(m4008constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ResizableTextKt.m7716ResizableText4IGK_g(StringResources_androidKt.stringResource(R.string.base_widget_text_7_day_free_trial, startRestartGroup, 0), PaddingKt.m985padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6997constructorimpl(f4)), ColorKt.Color(4294967295L), TextUnitKt.getSp(17), null, new FontWeight(700), null, 0L, null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), 0L, 0, false, 3, 0, null, 0, startRestartGroup, 200112, 3072, 122320);
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
        Modifier weight$default2 = RowScope.weight$default(rowScopeInstance, SizeKt.m1018heightInVpY3zN4$default(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6997constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), Dp.m6997constructorimpl(f2), 0.0f, 2, null), 102.0f, false, 2, null);
        float m6997constructorimpl2 = Dp.m6997constructorimpl(f3);
        if (Intrinsics.areEqual(getCurrentSku(), this.monthlySKU)) {
            m4550getTransparent0d7_KjU2 = ColorKt.Color(4294618905L);
        } else {
            m4550getTransparent0d7_KjU2 = Color.INSTANCE.m4550getTransparent0d7_KjU();
        }
        Modifier m573clickableXHw0xAI$default3 = ClickableKt.m573clickableXHw0xAI$default(BackgroundKt.m539backgroundbw27NRU(ClipKt.clip(BorderKt.m551borderxT4_qwU(weight$default2, m6997constructorimpl2, m4550getTransparent0d7_KjU2, RoundedCornerShapeKt.RoundedCornerShape(10)), RoundedCornerShapeKt.RoundedCornerShape(10)), ColorKt.Color(818201796), RoundedCornerShapeKt.RoundedCornerShape(10)), false, null, null, new Function0<Unit>() { // from class: com.glority.android.guide.memo10005.activity.Vip10005BActivity$PurchaseView$1$1$5
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
                Vip10005BActivity vip10005BActivity = Vip10005BActivity.this;
                str3 = vip10005BActivity.monthlySKU;
                vip10005BActivity.setCurrentSku(str3);
                mutableState = Vip10005BActivity.this.isTrialSkuSelected;
                mutableState.setValue(false);
                Vip10005BActivity.this.startPurchase();
            }
        }, 7, null);
        Alignment.Horizontal centerHorizontally3 = Alignment.INSTANCE.getCenterHorizontally();
        Arrangement.HorizontalOrVertical center4 = Arrangement.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(center4, centerHorizontally3, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(startRestartGroup, m573clickableXHw0xAI$default3);
        Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
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
        Updater.m4015setimpl(m4008constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
        ResizableTextKt.m7716ResizableText4IGK_g(StringResources_androidKt.stringResource(R.string.base_widget_text_monthly, startRestartGroup, 0), PaddingKt.m987paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6997constructorimpl(f3), 0.0f, 2, null), ColorKt.Color(4294967295L), TextUnitKt.getSp(14), null, new FontWeight(700), null, 0L, null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), 0L, 0, false, 1, 0, null, 0, startRestartGroup, 200112, 3072, 122320);
        AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
        String str3 = ((Object) this.priceSymbol.getValue()) + " " + ((Object) this.monthPrice.getValue());
        builder2.append(str3);
        String str4 = str3;
        builder2.addStyle(new SpanStyle(0L, 0L, new FontWeight(700), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null), StringsKt.indexOf$default((CharSequence) str4, this.monthPrice.getValue(), 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) str4, this.monthPrice.getValue(), 0, false, 6, (Object) null) + this.monthPrice.getValue().length());
        ResizableTextKt.m7717ResizableTextIbK3jfQ(builder2.toAnnotatedString(), PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(f4), 0.0f, 0.0f, 13, null), ColorKt.Color(4294967295L), TextUnitKt.getSp(14), FontStyle.m6567boximpl(FontStyle.INSTANCE.m6577getNormal_LCdwA()), new FontWeight(400), null, 0L, null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), 0L, 0, false, 2, 0, null, null, 0, startRestartGroup, 200112, 3072, 253376);
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
        TextKt.m3014Text4IGK_g(StringResources_androidKt.stringResource(R.string.base_widget_text_then_s_year, new Object[]{" " + ((Object) this.priceSymbol.getValue()) + ((Object) this.yearPrice.getValue())}, startRestartGroup, 64), SizeKt.fillMaxWidth$default(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(7), 0.0f, 0.0f, 13, null), 0.0f, 1, null), ColorKt.Color(4290624957L), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 3504, 0, 130544);
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
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.guide.memo10005.activity.Vip10005BActivity$PurchaseView$2
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
                    Vip10005BActivity.this.PurchaseView(modifier3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ReminderBar(Modifier modifier, final MutableState<Boolean> mutableState, Composer composer, final int i, final int i2) {
        Composer startRestartGroup = composer.startRestartGroup(-1782722398);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1782722398, i, -1, "com.glority.android.guide.memo10005.activity.Vip10005BActivity.ReminderBar (Vip10005BActivity.kt:523)");
        }
        Modifier m540backgroundbw27NRU$default = BackgroundKt.m540backgroundbw27NRU$default(ClipKt.clip(SizeKt.m1035width3ABfNKs(BorderKt.m551borderxT4_qwU(AlphaKt.alpha(modifier2, mutableState.getValue().booleanValue() ? 1.0f : 0.0f), Dp.m6997constructorimpl((float) 0.5d), ColorKt.Color(2147481334), RoundedCornerShapeKt.RoundedCornerShape(60)), Dp.m6997constructorimpl(330)), RoundedCornerShapeKt.RoundedCornerShape(60)), ColorKt.Color(436207615), null, 2, null);
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m540backgroundbw27NRU$default);
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
        float f = 9;
        final Modifier modifier3 = modifier2;
        ResizableTextKt.m7716ResizableText4IGK_g(StringResources_androidKt.stringResource(getReminderOpen() ? R.string.ptandroidzy1_enabledtext_text : R.string.text_reminder_guide, startRestartGroup, 0), RowScope.weight$default(RowScopeInstance.INSTANCE, PaddingKt.m988paddingqDBjuR0(Modifier.INSTANCE, Dp.m6997constructorimpl(12), Dp.m6997constructorimpl(f), Dp.m6997constructorimpl(6), Dp.m6997constructorimpl(f)), 1.0f, false, 2, null), ColorKt.Color(4294967295L), TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, 0, startRestartGroup, 3456, 3072, 122864);
        SwitchKt.Switch(getReminderOpen(), new Function1<Boolean, Unit>() { // from class: com.glority.android.guide.memo10005.activity.Vip10005BActivity$ReminderBar$1$1
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
                Vip10005BActivity.this.setReminderOpen(z);
                bundle1 = Vip10005BActivity.this.getBundle1();
                Vip10005BActivity vip10005BActivity = Vip10005BActivity.this;
                reminderOpen = vip10005BActivity.getReminderOpen();
                if (reminderOpen) {
                    try {
                        bundle1.putString("status", NotificationManagerCompat.from(vip10005BActivity).areNotificationsEnabled() ? ExifInterface.GPS_MEASUREMENT_2D : "1");
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
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.guide.memo10005.activity.Vip10005BActivity$ReminderBar$2
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
                    Vip10005BActivity.this.ReminderBar(modifier3, mutableState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ContinueButton(Modifier modifier, Composer composer, final int i, final int i2) {
        Composer startRestartGroup = composer.startRestartGroup(-771130225);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-771130225, i, -1, "com.glority.android.guide.memo10005.activity.Vip10005BActivity.ContinueButton (Vip10005BActivity.kt:565)");
        }
        LottieCompositionResult rememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m7636boximpl(LottieCompositionSpec.RawRes.m7637constructorimpl(R.raw.lottie_10005)), "10005_images", null, null, null, null, startRestartGroup, 48, 60);
        final Modifier modifier3 = modifier2;
        final LottieAnimationState animateLottieCompositionAsState = AnimateLottieCompositionAsStateKt.animateLottieCompositionAsState(ContinueButton$lambda$23(rememberLottieComposition), false, false, false, null, 0.0f, Integer.MAX_VALUE, null, false, false, startRestartGroup, 1572872, 958);
        LottieCompositionResult rememberLottieComposition2 = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m7636boximpl(LottieCompositionSpec.RawRes.m7637constructorimpl(R.raw.lottie_10005_1)), null, null, null, null, null, startRestartGroup, 0, 62);
        final LottieAnimationState animateLottieCompositionAsState2 = AnimateLottieCompositionAsStateKt.animateLottieCompositionAsState(ContinueButton$lambda$23(rememberLottieComposition), false, false, false, null, 0.0f, Integer.MAX_VALUE, null, false, false, startRestartGroup, 1572872, 958);
        Modifier m573clickableXHw0xAI$default = ClickableKt.m573clickableXHw0xAI$default(SizeKt.wrapContentHeight$default(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(8), 0.0f, 0.0f, 13, null), null, false, 3, null), false, null, null, new Function0<Unit>() { // from class: com.glority.android.guide.memo10005.activity.Vip10005BActivity$ContinueButton$1
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
                Vip10005BActivity.this.startPurchase();
            }
        }, 7, null);
        Alignment center = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m573clickableXHw0xAI$default);
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
        LottieComposition ContinueButton$lambda$25 = ContinueButton$lambda$25(rememberLottieComposition2);
        ContentScale fillWidth = ContentScale.INSTANCE.getFillWidth();
        Modifier m1016height3ABfNKs = SizeKt.m1016height3ABfNKs(SizeKt.m1035width3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(380)), Dp.m6997constructorimpl(74));
        startRestartGroup.startReplaceableGroup(1781009184);
        boolean changed = startRestartGroup.changed(animateLottieCompositionAsState2);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = (Function0) new Function0<Float>() { // from class: com.glority.android.guide.memo10005.activity.Vip10005BActivity$ContinueButton$2$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Float invoke() {
                    float ContinueButton$lambda$26;
                    ContinueButton$lambda$26 = Vip10005BActivity.ContinueButton$lambda$26(LottieAnimationState.this);
                    return Float.valueOf(ContinueButton$lambda$26);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        LottieAnimationKt.LottieAnimation(ContinueButton$lambda$25, (Function0) rememberedValue, m1016height3ABfNKs, false, false, false, null, false, null, null, fillWidth, false, null, null, startRestartGroup, 392, 6, 15352);
        Modifier m539backgroundbw27NRU = BackgroundKt.m539backgroundbw27NRU(SizeKt.m1016height3ABfNKs(SizeKt.m1035width3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(330)), Dp.m6997constructorimpl(50)), ColorKt.Color(4294618905L), RoundedCornerShapeKt.RoundedCornerShape(60));
        Alignment center2 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m539backgroundbw27NRU);
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
        Updater.m4015setimpl(m4008constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        TextKt.m3014Text4IGK_g(StringResources_androidKt.stringResource(Intrinsics.areEqual(getCurrentSku(), this.yearlySKU) ? R.string.personal_center_text_try_for_free : R.string.base_widget_text_continue, startRestartGroup, 0), (Modifier) null, ColorKt.Color(4280624421L), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 200064, 0, 131026);
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.md5_61cf8ea30e7e868339468bea798d7190, startRestartGroup, 0), (String) null, PaddingKt.m989paddingqDBjuR0$default(boxScopeInstance2.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterEnd()), 0.0f, 0.0f, Dp.m6997constructorimpl(35), 0.0f, 11, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 56, 120);
        LottieComposition ContinueButton$lambda$23 = ContinueButton$lambda$23(rememberLottieComposition);
        startRestartGroup.startReplaceableGroup(1781010359);
        boolean changed2 = startRestartGroup.changed(animateLottieCompositionAsState);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (Function0) new Function0<Float>() { // from class: com.glority.android.guide.memo10005.activity.Vip10005BActivity$ContinueButton$2$2$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Float invoke() {
                    float ContinueButton$lambda$24;
                    ContinueButton$lambda$24 = Vip10005BActivity.ContinueButton$lambda$24(LottieAnimationState.this);
                    return Float.valueOf(ContinueButton$lambda$24);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        LottieAnimationKt.LottieAnimation(ContinueButton$lambda$23, (Function0) rememberedValue2, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, false, null, false, null, null, null, false, null, null, startRestartGroup, 392, 0, 16376);
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
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.guide.memo10005.activity.Vip10005BActivity$ContinueButton$3
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
                    Vip10005BActivity.this.ContinueButton(modifier3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        if ((r67 & 2) != 0) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void PolicyView(final androidx.compose.foundation.ScrollState r63, androidx.compose.ui.Modifier r64, androidx.compose.runtime.Composer r65, final int r66, final int r67) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.guide.memo10005.activity.Vip10005BActivity.PolicyView(androidx.compose.foundation.ScrollState, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
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
        String country = Locale.getDefault().getCountry();
        Intrinsics.checkNotNull(country);
        if (country.length() == 0) {
            country = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        return LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("from", getPageFrom()), TuplesKt.to("name", Integer.valueOf(getPageType())), TuplesKt.to("group", getGroup()), TuplesKt.to(LogEventArguments.ARG_STRING_1, getAbtestId()), TuplesKt.to("code", country), TuplesKt.to(LogEventArguments.ARG_STEP, getOpenTimes()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startPurchase() {
        new GuidePurchaseRequest(getCurrentSku(), null, Boolean.valueOf(getReminderOpen() && this.isTrialSkuSelected.getValue().booleanValue()), null, 0, 26, null).post();
    }

    private static final boolean LoadingPage$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LoadingPage$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final LottieComposition ContinueButton$lambda$23(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ContinueButton$lambda$24(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    private static final LottieComposition ContinueButton$lambda$25(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ContinueButton$lambda$26(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }
}
