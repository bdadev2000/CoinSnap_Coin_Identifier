package androidx.compose.material3;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.base.utils.StatusBarUtils;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;

/* compiled from: NavigationDrawer.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001at\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001al\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aQ\u0010\u001f\u001a\u00020\t2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\t0!¢\u0006\u0002\b\u00192\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020#2\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\t0!¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010$\u001at\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001at\u0010*\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010\u001c\u001al\u0010*\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010\u001e\u001a`\u0010-\u001a\u00020\t2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\t0!¢\u0006\u0002\b\u00192\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010.\u001a\u00020\u00112\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\t0!¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a\u008e\u0001\u00101\u001a\u00020\t2\u0011\u00102\u001a\r\u0012\u0004\u0012\u00020\t0!¢\u0006\u0002\b\u00192\u0006\u00103\u001a\u00020#2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\t0!2\b\b\u0002\u0010\f\u001a\u00020\r2\u0015\b\u0002\u00105\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010!¢\u0006\u0002\b\u00192\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010!¢\u0006\u0002\b\u00192\b\b\u0002\u00107\u001a\u00020\u000f2\b\b\u0002\u00108\u001a\u0002092\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;H\u0007¢\u0006\u0002\u0010<\u001al\u0010=\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b>\u0010\u001e\u001a=\u0010?\u001a\u00020\t2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\t0!¢\u0006\u0002\b\u00192\b\b\u0002\u0010\f\u001a\u00020\r2\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\t0!¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010@\u001a>\u0010A\u001a\u00020\t2\u0006\u0010B\u001a\u00020#2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\t0!2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00020!2\u0006\u0010E\u001a\u00020\u0011H\u0003ø\u0001\u0000¢\u0006\u0004\bF\u0010G\u001a \u0010H\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\u00022\u0006\u0010J\u001a\u00020\u00022\u0006\u0010K\u001a\u00020\u0002H\u0002\u001a+\u0010L\u001a\u00020\u000b2\u0006\u0010M\u001a\u00020N2\u0014\b\u0002\u0010O\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020#0\u0017H\u0007¢\u0006\u0002\u0010P\u001a\u0014\u0010Q\u001a\u00020\u0002*\u00020R2\u0006\u0010&\u001a\u00020'H\u0002\u001a\u0014\u0010S\u001a\u00020\u0002*\u00020R2\u0006\u0010&\u001a\u00020'H\u0002\u001a\u001c\u0010T\u001a\u00020\r*\u00020\r2\u0006\u0010&\u001a\u00020'2\u0006\u0010U\u001a\u00020#H\u0002\u001a\u001c\u0010V\u001a\u00020\r*\u00020\r2\u0006\u0010&\u001a\u00020'2\u0006\u0010U\u001a\u00020#H\u0002\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0002X\u0082D¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u0010\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006W²\u0006\n\u0010X\u001a\u00020#X\u008a\u008e\u0002²\u0006\n\u0010Y\u001a\u00020\u0002X\u008a\u008e\u0002²\u0006\n\u0010X\u001a\u00020#X\u008a\u008e\u0002"}, d2 = {"AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "DrawerPositionalThreshold", "DrawerVelocityThreshold", "Landroidx/compose/ui/unit/Dp;", "F", "MinimumDrawerWidth", "DismissibleDrawerSheet", "", "drawerState", "Landroidx/compose/material3/DrawerState;", "modifier", "Landroidx/compose/ui/Modifier;", "drawerShape", "Landroidx/compose/ui/graphics/Shape;", "drawerContainerColor", "Landroidx/compose/ui/graphics/Color;", "drawerContentColor", "drawerTonalElevation", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "DismissibleDrawerSheet-Snr_uVM", "(Landroidx/compose/material3/DrawerState;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DismissibleDrawerSheet-afqeVBk", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DismissibleNavigationDrawer", "drawerContent", "Lkotlin/Function0;", "gesturesEnabled", "", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "DrawerSheet", "drawerPredictiveBackState", "Landroidx/compose/material3/DrawerPredictiveBackState;", "DrawerSheet-7zSek6w", "(Landroidx/compose/material3/DrawerPredictiveBackState;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ModalDrawerSheet", "ModalDrawerSheet-Snr_uVM", "ModalDrawerSheet-afqeVBk", "ModalNavigationDrawer", "scrimColor", "ModalNavigationDrawer-FHprtrg", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "NavigationDrawerItem", Constants.ScionAnalytics.PARAM_LABEL, "selected", "onClick", "icon", "badge", "shape", "colors", "Landroidx/compose/material3/NavigationDrawerItemColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/NavigationDrawerItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "PermanentDrawerSheet", "PermanentDrawerSheet-afqeVBk", "PermanentNavigationDrawer", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Scrim", "open", "onClose", "fraction", "color", "Scrim-Bx497Mc", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V", "calculateFraction", "a", "b", "pos", "rememberDrawerState", "initialValue", "Landroidx/compose/material3/DrawerValue;", "confirmStateChange", "(Landroidx/compose/material3/DrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DrawerState;", "calculatePredictiveBackScaleX", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "calculatePredictiveBackScaleY", "predictiveBackDrawerChild", "isRtl", "predictiveBackDrawerContainer", "material3_release", "anchorsInitialized", "minValue"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class NavigationDrawerKt {
    private static final float DrawerPositionalThreshold = 0.5f;
    private static final float DrawerVelocityThreshold = Dp.m6997constructorimpl(400);
    private static final float MinimumDrawerWidth = Dp.m6997constructorimpl(PsExtractor.VIDEO_STREAM_MASK);
    private static final TweenSpec<Float> AnimationSpec = new TweenSpec<>(256, 0, null, 6, null);

    public static final DrawerState rememberDrawerState(final DrawerValue drawerValue, final Function1<? super DrawerValue, Boolean> function1, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 2098699222, "C(rememberDrawerState)P(1)286@11488L61,286@11424L125:NavigationDrawer.kt#uh7d8r");
        if ((i2 & 2) != 0) {
            function1 = new Function1<DrawerValue, Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt$rememberDrawerState$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(DrawerValue drawerValue2) {
                    return true;
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2098699222, i, -1, "androidx.compose.material3.rememberDrawerState (NavigationDrawer.kt:285)");
        }
        Object[] objArr = new Object[0];
        Saver<DrawerState, DrawerValue> Saver = DrawerState.INSTANCE.Saver(function1);
        ComposerKt.sourceInformationMarkerStart(composer, -666801427, "CC(remember):NavigationDrawer.kt#9igjgp");
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(drawerValue)) || (i & 6) == 4) | ((((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) ^ 48) > 32 && composer.changed(function1)) || (i & 48) == 32);
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = (Function0) new Function0<DrawerState>() { // from class: androidx.compose.material3.NavigationDrawerKt$rememberDrawerState$2$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final DrawerState invoke() {
                    return new DrawerState(DrawerValue.this, function1);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        DrawerState drawerState = (DrawerState) RememberSaveableKt.m4101rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) rememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return drawerState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e9, code lost:
    
        if ((r37 & 16) != 0) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0375  */
    /* renamed from: ModalNavigationDrawer-FHprtrg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2606ModalNavigationDrawerFHprtrg(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r28, androidx.compose.ui.Modifier r29, androidx.compose.material3.DrawerState r30, boolean r31, long r32, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 1545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m2606ModalNavigationDrawerFHprtrg(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, androidx.compose.material3.DrawerState, boolean, long, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ModalNavigationDrawer_FHprtrg$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ModalNavigationDrawer_FHprtrg$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ModalNavigationDrawer_FHprtrg$lambda$5(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x037b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void DismissibleNavigationDrawer(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r24, androidx.compose.ui.Modifier r25, androidx.compose.material3.DrawerState r26, boolean r27, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 1385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.DismissibleNavigationDrawer(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, androidx.compose.material3.DrawerState, boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DismissibleNavigationDrawer$lambda$16(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DismissibleNavigationDrawer$lambda$17(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void PermanentNavigationDrawer(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r16, androidx.compose.ui.Modifier r17, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.PermanentNavigationDrawer(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00c1  */
    /* renamed from: ModalDrawerSheet-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2605ModalDrawerSheetafqeVBk(androidx.compose.ui.Modifier r24, androidx.compose.ui.graphics.Shape r25, long r26, long r28, float r30, androidx.compose.foundation.layout.WindowInsets r31, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m2605ModalDrawerSheetafqeVBk(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0180  */
    /* renamed from: ModalDrawerSheet-Snr_uVM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2604ModalDrawerSheetSnr_uVM(final androidx.compose.material3.DrawerState r27, androidx.compose.ui.Modifier r28, androidx.compose.ui.graphics.Shape r29, long r30, long r32, float r34, androidx.compose.foundation.layout.WindowInsets r35, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m2604ModalDrawerSheetSnr_uVM(androidx.compose.material3.DrawerState, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00b4  */
    /* renamed from: DismissibleDrawerSheet-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2602DismissibleDrawerSheetafqeVBk(androidx.compose.ui.Modifier r26, androidx.compose.ui.graphics.Shape r27, long r28, long r30, float r32, androidx.compose.foundation.layout.WindowInsets r33, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m2602DismissibleDrawerSheetafqeVBk(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00d9  */
    /* renamed from: DismissibleDrawerSheet-Snr_uVM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2601DismissibleDrawerSheetSnr_uVM(final androidx.compose.material3.DrawerState r27, androidx.compose.ui.Modifier r28, androidx.compose.ui.graphics.Shape r29, long r30, long r32, float r34, androidx.compose.foundation.layout.WindowInsets r35, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m2601DismissibleDrawerSheetSnr_uVM(androidx.compose.material3.DrawerState, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00bf  */
    /* renamed from: PermanentDrawerSheet-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2607PermanentDrawerSheetafqeVBk(androidx.compose.ui.Modifier r26, androidx.compose.ui.graphics.Shape r27, long r28, long r30, float r32, androidx.compose.foundation.layout.WindowInsets r33, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m2607PermanentDrawerSheetafqeVBk(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00bc  */
    /* renamed from: DrawerSheet-7zSek6w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2603DrawerSheet7zSek6w(final androidx.compose.material3.DrawerPredictiveBackState r28, final androidx.compose.foundation.layout.WindowInsets r29, androidx.compose.ui.Modifier r30, androidx.compose.ui.graphics.Shape r31, long r32, long r34, float r36, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m2603DrawerSheet7zSek6w(androidx.compose.material3.DrawerPredictiveBackState, androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final Modifier predictiveBackDrawerContainer(Modifier modifier, final DrawerPredictiveBackState drawerPredictiveBackState, final boolean z) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$predictiveBackDrawerContainer$1
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
            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                float calculatePredictiveBackScaleX;
                float calculatePredictiveBackScaleY;
                calculatePredictiveBackScaleX = NavigationDrawerKt.calculatePredictiveBackScaleX(graphicsLayerScope, DrawerPredictiveBackState.this);
                graphicsLayerScope.setScaleX(calculatePredictiveBackScaleX);
                calculatePredictiveBackScaleY = NavigationDrawerKt.calculatePredictiveBackScaleY(graphicsLayerScope, DrawerPredictiveBackState.this);
                graphicsLayerScope.setScaleY(calculatePredictiveBackScaleY);
                graphicsLayerScope.mo4708setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(z ? 1.0f : 0.0f, 0.5f));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier predictiveBackDrawerChild(Modifier modifier, final DrawerPredictiveBackState drawerPredictiveBackState, final boolean z) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$predictiveBackDrawerChild$1
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
            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                float calculatePredictiveBackScaleX;
                float calculatePredictiveBackScaleY;
                calculatePredictiveBackScaleX = NavigationDrawerKt.calculatePredictiveBackScaleX(graphicsLayerScope, DrawerPredictiveBackState.this);
                calculatePredictiveBackScaleY = NavigationDrawerKt.calculatePredictiveBackScaleY(graphicsLayerScope, DrawerPredictiveBackState.this);
                graphicsLayerScope.setScaleX(calculatePredictiveBackScaleX == 0.0f ? 1.0f : calculatePredictiveBackScaleY / calculatePredictiveBackScaleX);
                graphicsLayerScope.mo4708setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(z ? 0.0f : 1.0f, 0.0f));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackScaleX(GraphicsLayerScope graphicsLayerScope, DrawerPredictiveBackState drawerPredictiveBackState) {
        float m4343getWidthimpl = Size.m4343getWidthimpl(graphicsLayerScope.getSize());
        if (Float.isNaN(m4343getWidthimpl) || m4343getWidthimpl == 0.0f) {
            return 1.0f;
        }
        return 1.0f + ((drawerPredictiveBackState.getScaleXDistance() * (drawerPredictiveBackState.getSwipeEdgeMatchesDrawer() ? 1 : -1)) / m4343getWidthimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackScaleY(GraphicsLayerScope graphicsLayerScope, DrawerPredictiveBackState drawerPredictiveBackState) {
        float m4340getHeightimpl = Size.m4340getHeightimpl(graphicsLayerScope.getSize());
        if (Float.isNaN(m4340getHeightimpl) || m4340getHeightimpl == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (drawerPredictiveBackState.getScaleYDistance() / m4340getHeightimpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void NavigationDrawerItem(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r35, final boolean r36, final kotlin.jvm.functions.Function0<kotlin.Unit> r37, androidx.compose.ui.Modifier r38, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r39, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r40, androidx.compose.ui.graphics.Shape r41, androidx.compose.material3.NavigationDrawerItemColors r42, androidx.compose.foundation.interaction.MutableInteractionSource r43, androidx.compose.runtime.Composer r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.NavigationDrawerItem(kotlin.jvm.functions.Function2, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.NavigationDrawerItemColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateFraction(float f, float f2, float f3) {
        return RangesKt.coerceIn((f3 - f) / (f2 - f), 0.0f, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim-Bx497Mc, reason: not valid java name */
    public static final void m2608ScrimBx497Mc(final boolean z, final Function0<Unit> function0, final Function0<Float> function02, final long j, Composer composer, final int i) {
        int i2;
        int i3;
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(2106487387);
        ComposerKt.sourceInformation(startRestartGroup, "C(Scrim)P(3,2,1,0:c#ui.graphics.Color)1142@46950L30,1157@47448L39,1157@47397L90:NavigationDrawer.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(j) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2106487387, i2, -1, "androidx.compose.material3.Scrim (NavigationDrawer.kt:1141)");
            }
            Strings.Companion companion2 = Strings.INSTANCE;
            final String m3296getString2EP1pXo = Strings_androidKt.m3296getString2EP1pXo(Strings.m3226constructorimpl(androidx.compose.ui.R.string.close_drawer), startRestartGroup, 0);
            startRestartGroup.startReplaceGroup(-1784743395);
            ComposerKt.sourceInformation(startRestartGroup, "1145@47068L35,1146@47156L187");
            if (z) {
                Modifier.Companion companion3 = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1784741978, "CC(remember):NavigationDrawer.kt#9igjgp");
                int i4 = i2 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA;
                boolean z2 = i4 == 32;
                NavigationDrawerKt$Scrim$dismissDrawer$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new NavigationDrawerKt$Scrim$dismissDrawer$1$1(function0, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion3, function0, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1784739010, "CC(remember):NavigationDrawer.kt#9igjgp");
                boolean changed = (i4 == 32) | startRestartGroup.changed(m3296getString2EP1pXo);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$dismissDrawer$2$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, m3296getString2EP1pXo);
                            final Function0<Unit> function03 = function0;
                            SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$dismissDrawer$2$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    function03.invoke();
                                    return true;
                                }
                            }, 1, null);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                i3 = 1;
                companion = SemanticsModifierKt.semantics(pointerInput, true, (Function1) rememberedValue2);
            } else {
                i3 = 1;
                companion = Modifier.INSTANCE;
            }
            startRestartGroup.endReplaceGroup();
            Modifier then = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, i3, null).then(companion);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1784729814, "CC(remember):NavigationDrawer.kt#9igjgp");
            int i5 = ((i2 & 7168) == 2048 ? i3 : 0) | ((i2 & 896) == 256 ? i3 : 0);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (i5 != 0 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        DrawScope.m5065drawRectnJ9OG0$default(drawScope, j, 0L, 0L, function02.invoke().floatValue(), null, null, 0, 118, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CanvasKt.Canvas(then, (Function1) rememberedValue3, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$2
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

                public final void invoke(Composer composer2, int i6) {
                    NavigationDrawerKt.m2608ScrimBx497Mc(z, function0, function02, j, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
