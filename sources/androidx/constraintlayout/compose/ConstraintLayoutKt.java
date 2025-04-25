package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.base.utils.StatusBarUtils;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* compiled from: ConstraintLayout.kt */
@Metadata(d1 = {"\u0000º\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001af\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0010\b\n\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00182\u001e\b\u0004\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\b\u001c¢\u0006\u0002\b\u001dH\u0087\b¢\u0006\u0002\u0010\u001e\u001an\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u001f\u001a\u00020\u00012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0010\b\n\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00182\u001e\b\u0004\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\b\u001c¢\u0006\u0002\b\u001dH\u0087\b¢\u0006\u0002\u0010!\u001ac\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0010\b\n\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00182\u0013\b\u0004\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u000f0\u0018¢\u0006\u0002\b\u001cH\u0087\b¢\u0006\u0002\u0010$\u001ak\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u001f\u001a\u00020\u00012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0010\b\n\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00182\u0013\b\u0004\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u000f0\u0018¢\u0006\u0002\b\u001cH\u0087\b¢\u0006\u0002\u0010%\u001a'\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020#2\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\b\u001d\u001a\u0018\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020#2\b\b\u0001\u0010*\u001a\u00020+\u001a\u001f\u0010&\u001a\u00020#2\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\b\u001d\u001a\u0010\u0010&\u001a\u00020#2\b\b\u0001\u0010*\u001a\u00020+\u001a#\u0010&\u001a\u00020#2\b\b\u0001\u0010\u0019\u001a\u00020+2\n\b\u0003\u0010,\u001a\u0004\u0018\u00010+H\u0007¢\u0006\u0002\u0010-\u001a\u001e\u0010.\u001a\u00020\u000f2\u0006\u0010/\u001a\u0002002\f\u00101\u001a\b\u0012\u0004\u0012\u00020302H\u0000\u001a\b\u00104\u001a\u000205H\u0000\u001a\u001c\u00106\u001a\u00020\u0003*\u00020\u00042\u0006\u00107\u001a\u000208ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a\u001c\u00106\u001a\u00020\u0007*\u00020\b2\u0006\u00107\u001a\u000208ø\u0001\u0000¢\u0006\u0004\b9\u0010;\u001a\u001e\u0010\u0002\u001a\u00020\u0007*\u00020\b2\u0006\u00107\u001a\u000208H\u0007ø\u0001\u0000¢\u0006\u0004\b<\u0010;\u001a\u001c\u0010=\u001a\u00020\b*\u00020\u00042\u0006\u00107\u001a\u000208ø\u0001\u0000¢\u0006\u0004\b>\u0010?\u001a\u001c\u0010=\u001a\u00020\u0007*\u00020\u00032\u0006\u00107\u001a\u000208ø\u0001\u0000¢\u0006\u0004\b>\u0010@\u001a0\u0010A\u001a\u00020\u000f*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\b\b\u0002\u0010G\u001a\u00020HH\u0000ø\u0001\u0000¢\u0006\u0004\bI\u0010J\u001a\f\u0010K\u001a\u00020+*\u00020LH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0015\u0010\u0002\u001a\u00020\u0007*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\t\"\u0015\u0010\n\u001a\u00020\b*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0015\u0010\n\u001a\u00020\u0007*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\r*\f\b\u0000\u0010M\"\u00020N2\u00020N*\f\b\u0000\u0010O\"\u00020P2\u00020P\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Q²\u0006\n\u0010R\u001a\u00020#X\u008a\u008e\u0002²\u0006\n\u0010S\u001a\u00020#X\u008a\u008e\u0002"}, d2 = {"DEBUG", "", "atLeastWrapContent", "Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "Landroidx/constraintlayout/compose/Dimension$Coercible;", "getAtLeastWrapContent", "(Landroidx/constraintlayout/compose/Dimension$Coercible;)Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "Landroidx/constraintlayout/compose/Dimension;", "Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "(Landroidx/constraintlayout/compose/Dimension$MinCoercible;)Landroidx/constraintlayout/compose/Dimension;", "atMostWrapContent", "getAtMostWrapContent", "(Landroidx/constraintlayout/compose/Dimension$Coercible;)Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "(Landroidx/constraintlayout/compose/Dimension$MaxCoercible;)Landroidx/constraintlayout/compose/Dimension;", "ConstraintLayout", "", "modifier", "Landroidx/compose/ui/Modifier;", "optimizationLevel", "", "animateChangesSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "finishedAnimationListener", "Lkotlin/Function0;", "content", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;ILandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "animateChanges", "animationSpec", "(Landroidx/compose/ui/Modifier;IZLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "constraintSet", "Landroidx/constraintlayout/compose/ConstraintSet;", "(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/compose/ui/Modifier;ILandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/compose/ui/Modifier;IZLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ConstraintSet", "extendConstraintSet", "description", "Landroidx/constraintlayout/compose/ConstraintSetScope;", "jsonContent", "", "overrideVariables", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/constraintlayout/compose/ConstraintSet;", "buildMapping", "state", "Landroidx/constraintlayout/compose/State;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "createId", "", "atLeast", "dp", "Landroidx/compose/ui/unit/Dp;", "atLeast-3ABfNKs", "(Landroidx/constraintlayout/compose/Dimension$Coercible;F)Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "(Landroidx/constraintlayout/compose/Dimension$MinCoercible;F)Landroidx/constraintlayout/compose/Dimension;", "atLeastWrapContent-3ABfNKs", "atMost", "atMost-3ABfNKs", "(Landroidx/constraintlayout/compose/Dimension$Coercible;F)Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "(Landroidx/constraintlayout/compose/Dimension$MaxCoercible;F)Landroidx/constraintlayout/compose/Dimension;", "placeWithFrameTransform", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placeable", "Landroidx/compose/ui/layout/Placeable;", TypedValues.AttributesType.S_FRAME, "Landroidx/constraintlayout/core/state/WidgetFrame;", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/unit/IntOffset;", "placeWithFrameTransform-Ktjjmr4", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;Landroidx/constraintlayout/core/state/WidgetFrame;J)V", "toDebugString", "Landroidx/constraintlayout/core/widgets/ConstraintWidget;", "SolverDimension", "Landroidx/constraintlayout/core/state/Dimension;", "SolverState", "Landroidx/constraintlayout/core/state/State;", "constraintlayout-compose_release", "startConstraint", "endConstraint"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class ConstraintLayoutKt {
    private static final boolean DEBUG = false;

    public static final void ConstraintLayout(Modifier modifier, int i, AnimationSpec<Float> animationSpec, Function0<Unit> function0, Function3<? super ConstraintLayoutScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i2, int i3) {
        MutableState mutableState;
        ConstraintSetForInlineDsl constraintSetForInlineDsl;
        MutableState mutableState2;
        Object obj;
        composer.startReplaceGroup(-1003410150);
        ComposerKt.sourceInformation(composer, "CC(ConstraintLayout)P(3,4!1,2)414@18758L7,415@18785L30,416@18832L36,417@18903L34,418@18962L45,419@19033L53,421@19112L652,440@19793L288,449@20174L33,451@20266L729,448@20116L885:ConstraintLayout.kt#fysre8");
        Modifier modifier2 = (i3 & 1) != 0 ? Modifier.INSTANCE : modifier;
        int i4 = (i3 & 2) != 0 ? 257 : i;
        AnimationSpec<Float> animationSpec2 = (i3 & 4) != 0 ? null : animationSpec;
        Function0<Unit> function02 = (i3 & 8) != 0 ? null : function0;
        composer.startReplaceGroup(212064437);
        ComposerKt.sourceInformation(composer, "359@16265L33,360@16347L33,361@16401L70,362@16501L53,363@16587L101,366@16711L54,368@16821L1432,399@18263L441");
        if (animationSpec2 != null) {
            ComposerKt.sourceInformationMarkerStart(composer, 212064614, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState3 = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212067238, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState4 = (MutableState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212069003, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue3 = composer.rememberedValue();
            Object obj2 = rememberedValue3;
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                ConstraintLayoutScope constraintLayoutScope = new ConstraintLayoutScope();
                constraintLayoutScope.setAnimateChanges(true);
                composer.updateRememberedValue(constraintLayoutScope);
                obj2 = constraintLayoutScope;
            }
            ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) obj2;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212072186, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                composer.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState5 = (MutableState) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212074986, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue5 = composer.rememberedValue();
            Object obj3 = rememberedValue5;
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Ref ref = new Ref();
                ref.setValue(CompositionSource.Unknown);
                composer.updateRememberedValue(ref);
                obj3 = ref;
            }
            Ref ref2 = (Ref) obj3;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212078907, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue6 = composer.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = ChannelKt.Channel$default(-1, null, null, 6, null);
                composer.updateRememberedValue(rememberedValue6);
            }
            Channel channel = (Channel) rememberedValue6;
            ComposerKt.sourceInformationMarkerEnd(composer);
            LateMotionLayoutKt.LateMotionLayout(mutableState3, mutableState4, animationSpec2, channel, mutableState5, ref2, i4, function02, modifier2, ComposableLambdaKt.rememberComposableLambda(-74958949, true, new ConstraintLayoutKt$ConstraintLayout$contentDelegate$1(mutableState5, ref2, constraintLayoutScope2, function3, channel, mutableState3, mutableState4), composer, 54), composer, (i2 & 896) | 805330998 | (Ref.$stable << 15) | ((i2 << 15) & 3670016) | ((i2 << 12) & 29360128) | ((i2 << 24) & 234881024));
            composer.endReplaceGroup();
            composer.endReplaceGroup();
            return;
        }
        composer.endReplaceGroup();
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) consume;
        ComposerKt.sourceInformationMarkerStart(composer, 212145251, "CC(remember):ConstraintLayout.kt#9igjgp");
        Object rememberedValue7 = composer.rememberedValue();
        if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
            rememberedValue7 = new Measurer(density);
            composer.updateRememberedValue(rememberedValue7);
        }
        Measurer measurer = (Measurer) rememberedValue7;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 212146761, "CC(remember):ConstraintLayout.kt#9igjgp");
        Object rememberedValue8 = composer.rememberedValue();
        if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
            rememberedValue8 = new ConstraintLayoutScope();
            composer.updateRememberedValue(rememberedValue8);
        }
        ConstraintLayoutScope constraintLayoutScope3 = (ConstraintLayoutScope) rememberedValue8;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 212149031, "CC(remember):ConstraintLayout.kt#9igjgp");
        Object rememberedValue9 = composer.rememberedValue();
        if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
            rememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composer.updateRememberedValue(rememberedValue9);
        }
        MutableState mutableState6 = (MutableState) rememberedValue9;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 212150930, "CC(remember):ConstraintLayout.kt#9igjgp");
        Object rememberedValue10 = composer.rememberedValue();
        if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
            rememberedValue10 = new ConstraintSetForInlineDsl(constraintLayoutScope3);
            composer.updateRememberedValue(rememberedValue10);
        }
        ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) rememberedValue10;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 212153210, "CC(remember):ConstraintLayout.kt#9igjgp");
        Object rememberedValue11 = composer.rememberedValue();
        if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
            rememberedValue11 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
            composer.updateRememberedValue(rememberedValue11);
        }
        MutableState mutableState7 = (MutableState) rememberedValue11;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 212156337, "CC(remember):ConstraintLayout.kt#9igjgp");
        boolean changedInstance = ((((i2 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) ^ 48) > 32 && composer.changed(i4)) || (i2 & 48) == 32) | composer.changedInstance(measurer);
        Object rememberedValue12 = composer.rememberedValue();
        if (changedInstance || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
            mutableState = mutableState7;
            constraintSetForInlineDsl = constraintSetForInlineDsl2;
            mutableState2 = mutableState6;
            obj = (MeasurePolicy) new ConstraintLayoutKt$ConstraintLayout$measurePolicy$1$1(mutableState7, measurer, constraintSetForInlineDsl2, i4, mutableState6);
            composer.updateRememberedValue(obj);
        } else {
            obj = rememberedValue12;
            mutableState = mutableState7;
            constraintSetForInlineDsl = constraintSetForInlineDsl2;
            mutableState2 = mutableState6;
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) obj;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 212177765, "CC(remember):ConstraintLayout.kt#9igjgp");
        Object rememberedValue13 = composer.rememberedValue();
        if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
            rememberedValue13 = (Function0) new ConstraintLayoutKt$ConstraintLayout$onHelpersChanged$1$1(mutableState2, constraintSetForInlineDsl);
            composer.updateRememberedValue(rememberedValue13);
        }
        Function0 function03 = (Function0) rememberedValue13;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 212189702, "CC(remember):ConstraintLayout.kt#9igjgp");
        boolean changedInstance2 = composer.changedInstance(measurer);
        Object rememberedValue14 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
            rememberedValue14 = (Function1) new ConstraintLayoutKt$ConstraintLayout$1$1(measurer);
            composer.updateRememberedValue(rememberedValue14);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, (Function1) rememberedValue14, 1, null), ComposableLambdaKt.rememberComposableLambda(1200550679, true, new ConstraintLayoutKt$ConstraintLayout$2(mutableState, constraintLayoutScope3, function3, function03), composer, 54), measurePolicy, composer, 48, 0);
        composer.endReplaceGroup();
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Prefer version that takes a nullable AnimationSpec to animate changes.", replaceWith = @ReplaceWith(expression = "ConstraintLayout(modifier = modifier, optimizationLevel = optimizationLevel, animateChangesSpec = animationSpec, finishedAnimationListener = finishedAnimationListener) { content() }", imports = {}))
    public static final void ConstraintLayout(Modifier modifier, int i, boolean z, AnimationSpec<Float> animationSpec, Function0<Unit> function0, Function3<? super ConstraintLayoutScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i2, int i3) {
        MutableState mutableState;
        ConstraintSetForInlineDsl constraintSetForInlineDsl;
        MutableState mutableState2;
        ComposerKt.sourceInformationMarkerStart(composer, -2033384074, "CC(ConstraintLayout)P(4,5!2,3)490@21869L262:ConstraintLayout.kt#fysre8");
        Modifier modifier2 = (i3 & 1) != 0 ? Modifier.INSTANCE : modifier;
        int i4 = (i3 & 2) != 0 ? 257 : i;
        boolean z2 = (i3 & 4) != 0 ? false : z;
        TweenSpec tween$default = (i3 & 8) != 0 ? AnimationSpecKt.tween$default(0, 0, null, 7, null) : animationSpec;
        Function0<Unit> function02 = (i3 & 16) != 0 ? null : function0;
        AnimationSpec<Float> animationSpec2 = z2 ? tween$default : null;
        int i5 = i2 >> 3;
        int i6 = (i2 & 14) | (i2 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | (i5 & 7168) | (i5 & 57344);
        composer.startReplaceGroup(-1003410150);
        ComposerKt.sourceInformation(composer, "CC(ConstraintLayout)P(3,4!1,2)414@18758L7,415@18785L30,416@18832L36,417@18903L34,418@18962L45,419@19033L53,421@19112L652,440@19793L288,449@20174L33,451@20266L729,448@20116L885:ConstraintLayout.kt#fysre8");
        composer.startReplaceGroup(212064437);
        ComposerKt.sourceInformation(composer, "359@16265L33,360@16347L33,361@16401L70,362@16501L53,363@16587L101,366@16711L54,368@16821L1432,399@18263L441");
        if (animationSpec2 != null) {
            ComposerKt.sourceInformationMarkerStart(composer, 212064614, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState3 = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212067238, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState4 = (MutableState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212069003, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue3 = composer.rememberedValue();
            Object obj = rememberedValue3;
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                ConstraintLayoutScope constraintLayoutScope = new ConstraintLayoutScope();
                constraintLayoutScope.setAnimateChanges(true);
                composer.updateRememberedValue(constraintLayoutScope);
                obj = constraintLayoutScope;
            }
            ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) obj;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212072186, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                composer.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState5 = (MutableState) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212074986, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue5 = composer.rememberedValue();
            Object obj2 = rememberedValue5;
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Ref ref = new Ref();
                ref.setValue(CompositionSource.Unknown);
                composer.updateRememberedValue(ref);
                obj2 = ref;
            }
            Ref ref2 = (Ref) obj2;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212078907, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue6 = composer.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = ChannelKt.Channel$default(-1, null, null, 6, null);
                composer.updateRememberedValue(rememberedValue6);
            }
            Channel channel = (Channel) rememberedValue6;
            ComposerKt.sourceInformationMarkerEnd(composer);
            LateMotionLayoutKt.LateMotionLayout(mutableState3, mutableState4, animationSpec2, channel, mutableState5, ref2, i4, function02, modifier2, ComposableLambdaKt.rememberComposableLambda(-74958949, true, new ConstraintLayoutKt$ConstraintLayout$contentDelegate$1(mutableState5, ref2, constraintLayoutScope2, function3, channel, mutableState3, mutableState4), composer, 54), composer, (Ref.$stable << 15) | 805330998 | ((i6 << 15) & 3670016) | ((i6 << 12) & 29360128) | ((i6 << 24) & 234881024));
            composer.endReplaceGroup();
            composer.endReplaceGroup();
        } else {
            composer.endReplaceGroup();
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(composer, 212145251, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue7 = composer.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new Measurer(density);
                composer.updateRememberedValue(rememberedValue7);
            }
            Measurer measurer = (Measurer) rememberedValue7;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212146761, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue8 = composer.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new ConstraintLayoutScope();
                composer.updateRememberedValue(rememberedValue8);
            }
            ConstraintLayoutScope constraintLayoutScope3 = (ConstraintLayoutScope) rememberedValue8;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212149031, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue9 = composer.rememberedValue();
            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composer.updateRememberedValue(rememberedValue9);
            }
            MutableState mutableState6 = (MutableState) rememberedValue9;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212150930, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue10 = composer.rememberedValue();
            if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = new ConstraintSetForInlineDsl(constraintLayoutScope3);
                composer.updateRememberedValue(rememberedValue10);
            }
            ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) rememberedValue10;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212153210, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue11 = composer.rememberedValue();
            if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                composer.updateRememberedValue(rememberedValue11);
            }
            MutableState mutableState7 = (MutableState) rememberedValue11;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212156337, "CC(remember):ConstraintLayout.kt#9igjgp");
            boolean changedInstance = ((((i6 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) ^ 48) > 32 && composer.changed(i4)) || (i6 & 48) == 32) | composer.changedInstance(measurer);
            Object rememberedValue12 = composer.rememberedValue();
            if (changedInstance || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                mutableState = mutableState7;
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                mutableState2 = mutableState6;
                rememberedValue12 = (MeasurePolicy) new ConstraintLayoutKt$ConstraintLayout$measurePolicy$1$1(mutableState7, measurer, constraintSetForInlineDsl2, i4, mutableState2);
                composer.updateRememberedValue(rememberedValue12);
            } else {
                mutableState = mutableState7;
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                mutableState2 = mutableState6;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue12;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212177765, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue13 = composer.rememberedValue();
            if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                rememberedValue13 = (Function0) new ConstraintLayoutKt$ConstraintLayout$onHelpersChanged$1$1(mutableState2, constraintSetForInlineDsl);
                composer.updateRememberedValue(rememberedValue13);
            }
            Function0 function03 = (Function0) rememberedValue13;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212189702, "CC(remember):ConstraintLayout.kt#9igjgp");
            boolean changedInstance2 = composer.changedInstance(measurer);
            Object rememberedValue14 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                rememberedValue14 = (Function1) new ConstraintLayoutKt$ConstraintLayout$1$1(measurer);
                composer.updateRememberedValue(rememberedValue14);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, (Function1) rememberedValue14, 1, null), ComposableLambdaKt.rememberComposableLambda(1200550679, true, new ConstraintLayoutKt$ConstraintLayout$2(mutableState, constraintLayoutScope3, function3, function03), composer, 54), measurePolicy, composer, 48, 0);
            composer.endReplaceGroup();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void ConstraintLayout(ConstraintSet constraintSet, Modifier modifier, int i, AnimationSpec<Float> animationSpec, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, 2055379008, "CC(ConstraintLayout)P(1,4,5!1,3):ConstraintLayout.kt#fysre8");
        Modifier modifier2 = (i3 & 2) != 0 ? Modifier.INSTANCE : modifier;
        int i4 = (i3 & 4) != 0 ? 257 : i;
        AnimationSpec<Float> animationSpec2 = (i3 & 8) != 0 ? null : animationSpec;
        Function0<Unit> function02 = (i3 & 16) != 0 ? null : function0;
        if (animationSpec2 != null) {
            composer.startReplaceGroup(-2000511133);
            ComposerKt.sourceInformation(composer, "764@31799L42,765@31871L42,766@31937L29,767@31989L54,768@32068L33,770@32122L34,770@32111L45,772@32190L794,772@32166L818,789@32993L201");
            ComposerKt.sourceInformationMarkerStart(composer, 212561711, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(constraintSet, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212564015, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(constraintSet, null, 2, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212566114, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composer.updateRememberedValue(rememberedValue3);
            }
            Animatable animatable = (Animatable) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212567803, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = ChannelKt.Channel$default(-1, null, null, 6, null);
                composer.updateRememberedValue(rememberedValue4);
            }
            Channel channel = (Channel) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212570310, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = SnapshotIntStateKt.mutableIntStateOf(1);
                composer.updateRememberedValue(rememberedValue5);
            }
            MutableIntState mutableIntState = (MutableIntState) rememberedValue5;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212572039, "CC(remember):ConstraintLayout.kt#9igjgp");
            boolean changedInstance = composer.changedInstance(channel) | ((((i2 & 14) ^ 6) > 4 && composer.changed(constraintSet)) || (i2 & 6) == 4);
            Object rememberedValue6 = composer.rememberedValue();
            if (changedInstance || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = (Function0) new ConstraintLayoutKt$ConstraintLayout$3$1(channel, constraintSet);
                composer.updateRememberedValue(rememberedValue6);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            EffectsKt.SideEffect((Function0) rememberedValue6, composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, 212574975, "CC(remember):ConstraintLayout.kt#9igjgp");
            boolean changedInstance2 = composer.changedInstance(channel) | composer.changedInstance(animatable) | composer.changedInstance(animationSpec2) | ((((57344 & i2) ^ 24576) > 16384 && composer.changed(function02)) || (i2 & 24576) == 16384);
            Object rememberedValue7 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = (Function2) new ConstraintLayoutKt$ConstraintLayout$4$1(channel, mutableIntState, animatable, animationSpec2, function02, mutableState, mutableState2, null);
                composer.updateRememberedValue(rememberedValue7);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            EffectsKt.LaunchedEffect(channel, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue7, composer, 0);
            ConstraintSet m7328ConstraintLayout$lambda17 = m7328ConstraintLayout$lambda17(mutableState);
            ConstraintSet m7330ConstraintLayout$lambda20 = m7330ConstraintLayout$lambda20(mutableState2);
            float floatValue = ((Number) animatable.getValue()).floatValue();
            int i5 = (i2 << 6) & 7168;
            ComposerKt.sourceInformationMarkerStart(composer, -531105279, "CC(MotionLayout)P(7,2,6,4,8,1:androidx.constraintlayout.compose.DebugFlags,5,3)143@6062L53,144@6144L93,149@6399L627,164@7031L556:MotionLayout.kt#fysre8");
            int m7356getNonebfy_xzQ = DebugFlags.INSTANCE.m7356getNonebfy_xzQ();
            InvalidationStrategy defaultInvalidationStrategy = InvalidationStrategy.INSTANCE.getDefaultInvalidationStrategy();
            ComposerKt.sourceInformationMarkerStart(composer, 1692700147, "CC(remember):MotionLayout.kt#9igjgp");
            Object rememberedValue8 = composer.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                composer.updateRememberedValue(rememberedValue8);
            }
            MutableState mutableState3 = (MutableState) rememberedValue8;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 1692702811, "CC(remember):MotionLayout.kt#9igjgp");
            Object rememberedValue9 = composer.rememberedValue();
            Object obj = rememberedValue9;
            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                Ref ref = new Ref();
                ref.setValue(CompositionSource.Unknown);
                composer.updateRememberedValue(ref);
                obj = ref;
            }
            Ref ref2 = (Ref) obj;
            ComposerKt.sourceInformationMarkerEnd(composer);
            MotionLayoutKt.MotionLayoutCore(m7328ConstraintLayout$lambda17, m7330ConstraintLayout$lambda20, null, floatValue, null, 257, DebugFlags.m7349getShowBoundsimpl(m7356getNonebfy_xzQ), DebugFlags.m7351getShowPathsimpl(m7356getNonebfy_xzQ), DebugFlags.m7350getShowKeyPositionsimpl(m7356getNonebfy_xzQ), modifier2, mutableState3, ref2, defaultInvalidationStrategy, ComposableLambdaKt.rememberComposableLambda(284503157, true, new ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayoutT3LJ6Qw$1(mutableState3, defaultInvalidationStrategy, ref2, function2, i2), composer, 54), composer, 24576 | ((i5 << 18) & 1879048192), (Ref.$stable << 3) | 3078);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceGroup();
        } else {
            Modifier modifier3 = modifier2;
            composer.startReplaceGroup(-1999053668);
            ComposerKt.sourceInformation(composer, "797@33234L35,799@33300L53,800@33389L7,801@33420L30,802@33459L108,806@33596L484");
            ComposerKt.sourceInformationMarkerStart(composer, 212607624, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue10 = composer.rememberedValue();
            if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = SnapshotLongStateKt.mutableLongStateOf(0L);
                composer.updateRememberedValue(rememberedValue10);
            }
            MutableLongState mutableLongState = (MutableLongState) rememberedValue10;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212609754, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue11 = composer.rememberedValue();
            if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                composer.updateRememberedValue(rememberedValue11);
            }
            MutableState mutableState4 = (MutableState) rememberedValue11;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(composer, 212613571, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue12 = composer.rememberedValue();
            if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                rememberedValue12 = new Measurer(density);
                composer.updateRememberedValue(rememberedValue12);
            }
            Measurer measurer = (Measurer) rememberedValue12;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212614897, "CC(remember):ConstraintLayout.kt#9igjgp");
            int i6 = (i2 & 14) ^ 6;
            boolean z = (i6 > 4 && composer.changed(constraintSet)) || (i2 & 6) == 4;
            Object rememberedValue13 = composer.rememberedValue();
            if (z || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                measurer.parseDesignElements(constraintSet);
                rememberedValue13 = true;
                composer.updateRememberedValue(rememberedValue13);
            }
            ((Boolean) rememberedValue13).booleanValue();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212619657, "CC(remember):ConstraintLayout.kt#9igjgp");
            boolean changedInstance3 = ((((i2 & 896) ^ 384) > 256 && composer.changed(i4)) || (i2 & 384) == 256) | ((i6 > 4 && composer.changed(constraintSet)) || (i2 & 6) == 4) | composer.changedInstance(measurer);
            Object rememberedValue14 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                rememberedValue14 = (MeasurePolicy) new ConstraintLayoutKt$ConstraintLayout$measurePolicy$2$1(mutableState4, measurer, constraintSet, i4);
                composer.updateRememberedValue(rememberedValue14);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue14;
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (constraintSet instanceof EditableJSONLayout) {
                ((EditableJSONLayout) constraintSet).setUpdateFlag(mutableLongState);
            }
            measurer.addLayoutInformationReceiver(constraintSet instanceof LayoutInformationReceiver ? (LayoutInformationReceiver) constraintSet : null);
            float forcedScaleFactor = measurer.getForcedScaleFactor();
            if (!Float.isNaN(forcedScaleFactor)) {
                composer.startReplaceGroup(-1997939559);
                ComposerKt.sourceInformation(composer, "828@34465L459");
                Modifier scale = ScaleKt.scale(modifier3, measurer.getForcedScaleFactor());
                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
                Updater.m4015setimpl(m4008constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -2074840520, "C831@34593L33,833@34709L113,830@34528L312:ConstraintLayout.kt#fysre8");
                ComposerKt.sourceInformationMarkerStart(composer, -1729495323, "CC(remember):ConstraintLayout.kt#9igjgp");
                boolean changedInstance4 = composer.changedInstance(measurer);
                Object rememberedValue15 = composer.rememberedValue();
                if (changedInstance4 || rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue15 = (Function1) new ConstraintLayoutKt$ConstraintLayout$7$1$1(measurer);
                    composer.updateRememberedValue(rememberedValue15);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(scale, false, (Function1) rememberedValue15, 1, null), ComposableLambdaKt.rememberComposableLambda(1131308473, true, new ConstraintLayoutKt$ConstraintLayout$7$2(measurer, function2), composer, 54), measurePolicy, composer, 48, 0);
                composer.startReplaceGroup(-1729486855);
                ComposerKt.sourceInformation(composer, "*838@34874L34");
                measurer.drawDebugBounds(boxScopeInstance, forcedScaleFactor, composer, 6);
                Unit unit = Unit.INSTANCE;
                composer.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1997387480);
                ComposerKt.sourceInformation(composer, "843@35057L33,845@35165L380,842@34991L568");
                ComposerKt.sourceInformationMarkerStart(composer, 212665958, "CC(remember):ConstraintLayout.kt#9igjgp");
                boolean changedInstance5 = composer.changedInstance(measurer);
                Object rememberedValue16 = composer.rememberedValue();
                if (changedInstance5 || rememberedValue16 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue16 = (Function1) new ConstraintLayoutKt$ConstraintLayout$8$1(measurer);
                    composer.updateRememberedValue(rememberedValue16);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier3, false, (Function1) rememberedValue16, 1, null), ComposableLambdaKt.rememberComposableLambda(-207512644, true, new ConstraintLayoutKt$ConstraintLayout$9(mutableState4, measurer, function2), composer, 54), measurePolicy, composer, 48, 0);
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    /* renamed from: ConstraintLayout$lambda-17 */
    public static final ConstraintSet m7328ConstraintLayout$lambda17(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    /* renamed from: ConstraintLayout$lambda-20 */
    public static final ConstraintSet m7330ConstraintLayout$lambda20(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated(level = DeprecationLevel.WARNING, message = "Prefer version that takes a nullable AnimationSpec to animate changes.", replaceWith = @ReplaceWith(expression = "ConstraintLayout(constraintSet = constraintSet, modifier = modifier, optimizationLevel = optimizationLevel, animateChangesSpec = animationSpec, finishedAnimationListener = finishedAnimationListener) { content() }", imports = {}))
    public static final void ConstraintLayout(ConstraintSet constraintSet, Modifier modifier, int i, boolean z, AnimationSpec<Float> animationSpec, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, 136894876, "CC(ConstraintLayout)P(2,5,6!2,4)882@36507L301:ConstraintLayout.kt#fysre8");
        Modifier modifier2 = (i3 & 2) != 0 ? Modifier.INSTANCE : modifier;
        int i4 = (i3 & 4) != 0 ? 257 : i;
        boolean z2 = (i3 & 8) != 0 ? false : z;
        TweenSpec tween$default = (i3 & 16) != 0 ? AnimationSpecKt.tween$default(0, 0, null, 7, null) : animationSpec;
        Function0<Unit> function02 = (i3 & 32) != 0 ? null : function0;
        if (!z2) {
            tween$default = null;
        }
        int i5 = i2 >> 3;
        int i6 = (i5 & 458752) | (i2 & 14) | (i2 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | (i2 & 896) | (i5 & 57344);
        ComposerKt.sourceInformationMarkerStart(composer, 2055379008, "CC(ConstraintLayout)P(1,4,5!1,3):ConstraintLayout.kt#fysre8");
        if (tween$default != null) {
            composer.startReplaceGroup(-2000511133);
            ComposerKt.sourceInformation(composer, "764@31799L42,765@31871L42,766@31937L29,767@31989L54,768@32068L33,770@32122L34,770@32111L45,772@32190L794,772@32166L818,789@32993L201");
            ComposerKt.sourceInformationMarkerStart(composer, 212561711, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(constraintSet, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212564015, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(constraintSet, null, 2, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212566114, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composer.updateRememberedValue(rememberedValue3);
            }
            Animatable animatable = (Animatable) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212567803, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = ChannelKt.Channel$default(-1, null, null, 6, null);
                composer.updateRememberedValue(rememberedValue4);
            }
            Channel channel = (Channel) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212570310, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = SnapshotIntStateKt.mutableIntStateOf(1);
                composer.updateRememberedValue(rememberedValue5);
            }
            MutableIntState mutableIntState = (MutableIntState) rememberedValue5;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212572039, "CC(remember):ConstraintLayout.kt#9igjgp");
            boolean changedInstance = composer.changedInstance(channel) | ((((i6 & 14) ^ 6) > 4 && composer.changed(constraintSet)) || (i6 & 6) == 4);
            Object rememberedValue6 = composer.rememberedValue();
            if (changedInstance || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = (Function0) new ConstraintLayoutKt$ConstraintLayout$3$1(channel, constraintSet);
                composer.updateRememberedValue(rememberedValue6);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            EffectsKt.SideEffect((Function0) rememberedValue6, composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, 212574975, "CC(remember):ConstraintLayout.kt#9igjgp");
            boolean changedInstance2 = composer.changedInstance(channel) | composer.changedInstance(animatable) | composer.changedInstance(tween$default) | ((((57344 & i6) ^ 24576) > 16384 && composer.changed(function02)) || (i6 & 24576) == 16384);
            Object rememberedValue7 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = (Function2) new ConstraintLayoutKt$ConstraintLayout$4$1(channel, mutableIntState, animatable, tween$default, function02, mutableState, mutableState2, null);
                composer.updateRememberedValue(rememberedValue7);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            EffectsKt.LaunchedEffect(channel, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue7, composer, 0);
            ConstraintSet m7328ConstraintLayout$lambda17 = m7328ConstraintLayout$lambda17(mutableState);
            ConstraintSet m7330ConstraintLayout$lambda20 = m7330ConstraintLayout$lambda20(mutableState2);
            float floatValue = ((Number) animatable.getValue()).floatValue();
            int i7 = (i6 << 6) & 7168;
            ComposerKt.sourceInformationMarkerStart(composer, -531105279, "CC(MotionLayout)P(7,2,6,4,8,1:androidx.constraintlayout.compose.DebugFlags,5,3)143@6062L53,144@6144L93,149@6399L627,164@7031L556:MotionLayout.kt#fysre8");
            int m7356getNonebfy_xzQ = DebugFlags.INSTANCE.m7356getNonebfy_xzQ();
            InvalidationStrategy defaultInvalidationStrategy = InvalidationStrategy.INSTANCE.getDefaultInvalidationStrategy();
            ComposerKt.sourceInformationMarkerStart(composer, 1692700147, "CC(remember):MotionLayout.kt#9igjgp");
            Object rememberedValue8 = composer.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                composer.updateRememberedValue(rememberedValue8);
            }
            MutableState mutableState3 = (MutableState) rememberedValue8;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 1692702811, "CC(remember):MotionLayout.kt#9igjgp");
            Object rememberedValue9 = composer.rememberedValue();
            Object obj = rememberedValue9;
            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                Ref ref = new Ref();
                ref.setValue(CompositionSource.Unknown);
                composer.updateRememberedValue(ref);
                obj = ref;
            }
            Ref ref2 = (Ref) obj;
            ComposerKt.sourceInformationMarkerEnd(composer);
            MotionLayoutKt.MotionLayoutCore(m7328ConstraintLayout$lambda17, m7330ConstraintLayout$lambda20, null, floatValue, null, 257, DebugFlags.m7349getShowBoundsimpl(m7356getNonebfy_xzQ), DebugFlags.m7351getShowPathsimpl(m7356getNonebfy_xzQ), DebugFlags.m7350getShowKeyPositionsimpl(m7356getNonebfy_xzQ), modifier2, mutableState3, ref2, defaultInvalidationStrategy, ComposableLambdaKt.rememberComposableLambda(284503157, true, new ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayoutT3LJ6Qw$1(mutableState3, defaultInvalidationStrategy, ref2, function2, i6), composer, 54), composer, 24576 | ((i7 << 18) & 1879048192), (Ref.$stable << 3) | 3078);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1999053668);
            ComposerKt.sourceInformation(composer, "797@33234L35,799@33300L53,800@33389L7,801@33420L30,802@33459L108,806@33596L484");
            ComposerKt.sourceInformationMarkerStart(composer, 212607624, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue10 = composer.rememberedValue();
            if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = SnapshotLongStateKt.mutableLongStateOf(0L);
                composer.updateRememberedValue(rememberedValue10);
            }
            MutableLongState mutableLongState = (MutableLongState) rememberedValue10;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212609754, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue11 = composer.rememberedValue();
            if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                composer.updateRememberedValue(rememberedValue11);
            }
            MutableState mutableState4 = (MutableState) rememberedValue11;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(composer, 212613571, "CC(remember):ConstraintLayout.kt#9igjgp");
            Object rememberedValue12 = composer.rememberedValue();
            if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                rememberedValue12 = new Measurer(density);
                composer.updateRememberedValue(rememberedValue12);
            }
            Measurer measurer = (Measurer) rememberedValue12;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212614897, "CC(remember):ConstraintLayout.kt#9igjgp");
            int i8 = (i6 & 14) ^ 6;
            boolean z3 = (i8 > 4 && composer.changed(constraintSet)) || (i6 & 6) == 4;
            Object rememberedValue13 = composer.rememberedValue();
            if (z3 || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                measurer.parseDesignElements(constraintSet);
                rememberedValue13 = true;
                composer.updateRememberedValue(rememberedValue13);
            }
            ((Boolean) rememberedValue13).booleanValue();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 212619657, "CC(remember):ConstraintLayout.kt#9igjgp");
            boolean changedInstance3 = ((i8 > 4 && composer.changed(constraintSet)) || (i6 & 6) == 4) | composer.changedInstance(measurer) | ((((i6 & 896) ^ 384) > 256 && composer.changed(i4)) || (i6 & 384) == 256);
            Object rememberedValue14 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                rememberedValue14 = (MeasurePolicy) new ConstraintLayoutKt$ConstraintLayout$measurePolicy$2$1(mutableState4, measurer, constraintSet, i4);
                composer.updateRememberedValue(rememberedValue14);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue14;
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (constraintSet instanceof EditableJSONLayout) {
                ((EditableJSONLayout) constraintSet).setUpdateFlag(mutableLongState);
            }
            measurer.addLayoutInformationReceiver(constraintSet instanceof LayoutInformationReceiver ? (LayoutInformationReceiver) constraintSet : null);
            float forcedScaleFactor = measurer.getForcedScaleFactor();
            if (Float.isNaN(forcedScaleFactor)) {
                composer.startReplaceGroup(-1997387480);
                ComposerKt.sourceInformation(composer, "843@35057L33,845@35165L380,842@34991L568");
                ComposerKt.sourceInformationMarkerStart(composer, 212665958, "CC(remember):ConstraintLayout.kt#9igjgp");
                boolean changedInstance4 = composer.changedInstance(measurer);
                Object rememberedValue15 = composer.rememberedValue();
                if (changedInstance4 || rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue15 = (Function1) new ConstraintLayoutKt$ConstraintLayout$8$1(measurer);
                    composer.updateRememberedValue(rememberedValue15);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, (Function1) rememberedValue15, 1, null), ComposableLambdaKt.rememberComposableLambda(-207512644, true, new ConstraintLayoutKt$ConstraintLayout$9(mutableState4, measurer, function2), composer, 54), measurePolicy, composer, 48, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1997939559);
                ComposerKt.sourceInformation(composer, "828@34465L459");
                Modifier scale = ScaleKt.scale(modifier2, measurer.getForcedScaleFactor());
                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
                Updater.m4015setimpl(m4008constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -2074840520, "C831@34593L33,833@34709L113,830@34528L312:ConstraintLayout.kt#fysre8");
                ComposerKt.sourceInformationMarkerStart(composer, -1729495323, "CC(remember):ConstraintLayout.kt#9igjgp");
                boolean changedInstance5 = composer.changedInstance(measurer);
                Object rememberedValue16 = composer.rememberedValue();
                if (changedInstance5 || rememberedValue16 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue16 = (Function1) new ConstraintLayoutKt$ConstraintLayout$7$1$1(measurer);
                    composer.updateRememberedValue(rememberedValue16);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(scale, false, (Function1) rememberedValue16, 1, null), ComposableLambdaKt.rememberComposableLambda(1131308473, true, new ConstraintLayoutKt$ConstraintLayout$7$2(measurer, function2), composer, 54), measurePolicy, composer, 48, 0);
                composer.startReplaceGroup(-1729486855);
                ComposerKt.sourceInformation(composer, "*838@34874L34");
                measurer.drawDebugBounds(boxScopeInstance, forcedScaleFactor, composer, 6);
                Unit unit = Unit.INSTANCE;
                composer.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    public static final Object createId() {
        return new Object() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$createId$1
        };
    }

    public static final Dimension.MaxCoercible getAtLeastWrapContent(Dimension.Coercible coercible) {
        Intrinsics.checkNotNull(coercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) coercible;
        dimensionDescription.getMin().update("wrap");
        return dimensionDescription;
    }

    /* renamed from: atLeast-3ABfNKs */
    public static final Dimension.MaxCoercible m7336atLeast3ABfNKs(Dimension.Coercible coercible, float f) {
        Intrinsics.checkNotNull(coercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) coercible;
        dimensionDescription.getMin().m7359update0680j_4(f);
        return dimensionDescription;
    }

    /* renamed from: atMost-3ABfNKs */
    public static final Dimension.MinCoercible m7339atMost3ABfNKs(Dimension.Coercible coercible, float f) {
        Intrinsics.checkNotNull(coercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) coercible;
        dimensionDescription.getMax().m7359update0680j_4(f);
        return dimensionDescription;
    }

    public static final Dimension.MinCoercible getAtMostWrapContent(Dimension.Coercible coercible) {
        Intrinsics.checkNotNull(coercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) coercible;
        dimensionDescription.getMax().update("wrap");
        return dimensionDescription;
    }

    @Deprecated(message = "Unintended method name, use atLeast(dp) instead", replaceWith = @ReplaceWith(expression = "this.atLeast(dp)", imports = {"androidx.constraintlayout.compose.atLeast"}))
    /* renamed from: atLeastWrapContent-3ABfNKs */
    public static final Dimension m7338atLeastWrapContent3ABfNKs(Dimension.MinCoercible minCoercible, float f) {
        Intrinsics.checkNotNull(minCoercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) minCoercible;
        dimensionDescription.getMin().m7359update0680j_4(f);
        return dimensionDescription;
    }

    /* renamed from: atLeast-3ABfNKs */
    public static final Dimension m7337atLeast3ABfNKs(Dimension.MinCoercible minCoercible, float f) {
        Intrinsics.checkNotNull(minCoercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) minCoercible;
        dimensionDescription.getMin().m7359update0680j_4(f);
        return dimensionDescription;
    }

    public static final Dimension getAtLeastWrapContent(Dimension.MinCoercible minCoercible) {
        Intrinsics.checkNotNull(minCoercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) minCoercible;
        dimensionDescription.getMin().update("wrap");
        return dimensionDescription;
    }

    /* renamed from: atMost-3ABfNKs */
    public static final Dimension m7340atMost3ABfNKs(Dimension.MaxCoercible maxCoercible, float f) {
        Intrinsics.checkNotNull(maxCoercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) maxCoercible;
        dimensionDescription.getMax().m7359update0680j_4(f);
        return dimensionDescription;
    }

    public static final Dimension getAtMostWrapContent(Dimension.MaxCoercible maxCoercible) {
        Intrinsics.checkNotNull(maxCoercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) maxCoercible;
        dimensionDescription.getMax().update("wrap");
        return dimensionDescription;
    }

    public static final ConstraintSet ConstraintSet(String str, String str2, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1420317079, "C(ConstraintSet)1346@54787L86:ConstraintLayout.kt#fysre8");
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1420317079, i, -1, "androidx.constraintlayout.compose.ConstraintSet (ConstraintLayout.kt:1344)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1304135421, "CC(remember):ConstraintLayout.kt#9igjgp");
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(str)) || (i & 6) == 4) | ((((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) ^ 48) > 32 && composer.changed(str3)) || (i & 48) == 32);
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new JSONConstraintSet(str, str3, null, 4, null);
            composer.updateRememberedValue(rememberedValue);
        }
        JSONConstraintSet jSONConstraintSet = (JSONConstraintSet) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return jSONConstraintSet;
    }

    public static final ConstraintSet ConstraintSet(String str) {
        return new JSONConstraintSet(str, null, null, 6, null);
    }

    public static final ConstraintSet ConstraintSet(ConstraintSet constraintSet, String str) {
        return new JSONConstraintSet(str, null, constraintSet, 2, null);
    }

    public static final ConstraintSet ConstraintSet(Function1<? super ConstraintSetScope, Unit> function1) {
        return new DslConstraintSet(function1, null, 2, null);
    }

    public static final ConstraintSet ConstraintSet(ConstraintSet constraintSet, Function1<? super ConstraintSetScope, Unit> function1) {
        return new DslConstraintSet(function1, constraintSet);
    }

    /* renamed from: placeWithFrameTransform-Ktjjmr4$default */
    public static /* synthetic */ void m7342placeWithFrameTransformKtjjmr4$default(Placeable.PlacementScope placementScope, Placeable placeable, WidgetFrame widgetFrame, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = IntOffset.INSTANCE.m7135getZeronOccac();
        }
        m7341placeWithFrameTransformKtjjmr4(placementScope, placeable, widgetFrame, j);
    }

    /* renamed from: placeWithFrameTransform-Ktjjmr4 */
    public static final void m7341placeWithFrameTransformKtjjmr4(Placeable.PlacementScope placementScope, Placeable placeable, final WidgetFrame widgetFrame, long j) {
        if (widgetFrame.visibility == 8) {
            if (DEBUG) {
                Log.d("CCL", "Widget: " + widgetFrame.getId() + " is Gone. Skipping placement.");
            }
        } else if (widgetFrame.isDefaultTransform()) {
            Placeable.PlacementScope.m5915place70tqf50$default(placementScope, placeable, IntOffsetKt.IntOffset(widgetFrame.left - IntOffset.m7125getXimpl(j), widgetFrame.top - IntOffset.m7126getYimpl(j)), 0.0f, 2, null);
        } else {
            placementScope.placeWithLayer(placeable, widgetFrame.left - IntOffset.m7125getXimpl(j), widgetFrame.top - IntOffset.m7126getYimpl(j), Float.isNaN(widgetFrame.translationZ) ? 0.0f : widgetFrame.translationZ, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$placeWithFrameTransform$layerBlock$1
                /* JADX INFO: Access modifiers changed from: package-private */
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
                    if (!Float.isNaN(WidgetFrame.this.pivotX) || !Float.isNaN(WidgetFrame.this.pivotY)) {
                        graphicsLayerScope.mo4708setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(Float.isNaN(WidgetFrame.this.pivotX) ? 0.5f : WidgetFrame.this.pivotX, Float.isNaN(WidgetFrame.this.pivotY) ? 0.5f : WidgetFrame.this.pivotY));
                    }
                    if (!Float.isNaN(WidgetFrame.this.rotationX)) {
                        graphicsLayerScope.setRotationX(WidgetFrame.this.rotationX);
                    }
                    if (!Float.isNaN(WidgetFrame.this.rotationY)) {
                        graphicsLayerScope.setRotationY(WidgetFrame.this.rotationY);
                    }
                    if (!Float.isNaN(WidgetFrame.this.rotationZ)) {
                        graphicsLayerScope.setRotationZ(WidgetFrame.this.rotationZ);
                    }
                    if (!Float.isNaN(WidgetFrame.this.translationX)) {
                        graphicsLayerScope.setTranslationX(WidgetFrame.this.translationX);
                    }
                    if (!Float.isNaN(WidgetFrame.this.translationY)) {
                        graphicsLayerScope.setTranslationY(WidgetFrame.this.translationY);
                    }
                    if (!Float.isNaN(WidgetFrame.this.translationZ)) {
                        graphicsLayerScope.setShadowElevation(WidgetFrame.this.translationZ);
                    }
                    if (!Float.isNaN(WidgetFrame.this.scaleX) || !Float.isNaN(WidgetFrame.this.scaleY)) {
                        graphicsLayerScope.setScaleX(Float.isNaN(WidgetFrame.this.scaleX) ? 1.0f : WidgetFrame.this.scaleX);
                        graphicsLayerScope.setScaleY(Float.isNaN(WidgetFrame.this.scaleY) ? 1.0f : WidgetFrame.this.scaleY);
                    }
                    if (Float.isNaN(WidgetFrame.this.alpha)) {
                        return;
                    }
                    graphicsLayerScope.setAlpha(WidgetFrame.this.alpha);
                }
            });
        }
    }

    public static final String toDebugString(ConstraintWidget constraintWidget) {
        StringBuilder sb = new StringBuilder();
        sb.append(constraintWidget.getDebugName()).append(" width ").append(constraintWidget.getWidth()).append(" minWidth ").append(constraintWidget.getMinWidth()).append(" maxWidth ").append(constraintWidget.getMaxWidth()).append(" height ").append(constraintWidget.getHeight()).append(" minHeight ").append(constraintWidget.getMinHeight()).append(" maxHeight ").append(constraintWidget.getMaxHeight()).append(" HDB ").append(constraintWidget.getHorizontalDimensionBehaviour()).append(" VDB ").append(constraintWidget.getVerticalDimensionBehaviour()).append(" MCW ").append(constraintWidget.mMatchConstraintDefaultWidth).append(" MCH ").append(constraintWidget.mMatchConstraintDefaultHeight).append(" percentW ").append(constraintWidget.mMatchConstraintPercentWidth);
        sb.append(" percentH ").append(constraintWidget.mMatchConstraintPercentHeight);
        return sb.toString();
    }

    public static final void buildMapping(State state, List<? extends Measurable> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Measurable measurable = list.get(i);
            Object layoutId = LayoutIdKt.getLayoutId(measurable);
            if (layoutId == null && (layoutId = ConstraintLayoutTagKt.getConstraintLayoutId(measurable)) == null) {
                layoutId = createId();
            }
            state.map(layoutId.toString(), measurable);
            Object constraintLayoutTag = ConstraintLayoutTagKt.getConstraintLayoutTag(measurable);
            if (constraintLayoutTag != null && (constraintLayoutTag instanceof String) && (layoutId instanceof String)) {
                state.setTag((String) layoutId, (String) constraintLayoutTag);
            }
        }
    }
}
