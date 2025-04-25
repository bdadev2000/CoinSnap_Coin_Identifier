package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.base.utils.StatusBarUtils;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: ModalBottomSheet.kt */
@Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u001c\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u0093\u0001\u0010\u000b\u001a\u00020\f2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\f0 ¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a@\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020%2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'2\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00170\u000e2\b\b\u0002\u0010*\u001a\u00020\u0017H\u0007\u001aH\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020%2\u0006\u0010+\u001a\u00020,2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'2\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00170\u000e2\b\b\u0002\u0010*\u001a\u00020\u0017H\u0007\u001a0\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u001c2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\f0 2\u0006\u00100\u001a\u00020\u0017H\u0003ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a9\u00103\u001a\u00020\u00152\u0006\u0010$\u001a\u00020%2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00170\u000eH\u0007¢\u0006\u0002\u00105\u001aE\u00103\u001a\u00020\u00152\u0006\u0010$\u001a\u00020%2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'2\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00170\u000e2\b\b\u0002\u00106\u001a\u00020\u0017H\u0007¢\u0006\u0002\u00107\u001aA\u00103\u001a\u00020\u00152\u0006\u0010$\u001a\u00020%2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u00106\u001a\u00020\u00172\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00170\u000eH\u0007¢\u0006\u0002\u00108\u001a\u001c\u00109\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010:\u001a\u00020(H\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006;²\u0006\n\u0010<\u001a\u00020(X\u008a\u0084\u0002"}, d2 = {"MaxModalBottomSheetWidth", "Landroidx/compose/ui/unit/Dp;", "F", "ModalBottomSheetPositionalThreshold", "ModalBottomSheetVelocityThreshold", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "state", "Landroidx/compose/material/AnchoredDraggableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "ModalBottomSheetLayout", "", "sheetContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "sheetState", "Landroidx/compose/material/ModalBottomSheetState;", "sheetGesturesEnabled", "", "sheetShape", "Landroidx/compose/ui/graphics/Shape;", "sheetElevation", "sheetBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "sheetContentColor", "scrimColor", "content", "Lkotlin/Function0;", "ModalBottomSheetLayout-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ModalBottomSheetState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ModalBottomSheetState", "initialValue", "Landroidx/compose/material/ModalBottomSheetValue;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmValueChange", "isSkipHalfExpanded", "density", "Landroidx/compose/ui/unit/Density;", "Scrim", "color", "onDismiss", "visible", "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "rememberModalBottomSheetState", "confirmStateChange", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "skipHalfExpanded", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "modalBottomSheetAnchors", "fullHeight", "material_release", "alpha"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ModalBottomSheetKt {
    private static final float ModalBottomSheetPositionalThreshold = Dp.m6997constructorimpl(56);
    private static final float ModalBottomSheetVelocityThreshold = Dp.m6997constructorimpl(125);
    private static final float MaxModalBottomSheetWidth = Dp.m6997constructorimpl(640);

    public static final /* synthetic */ float access$getModalBottomSheetPositionalThreshold$p() {
        return ModalBottomSheetPositionalThreshold;
    }

    public static final /* synthetic */ float access$getModalBottomSheetVelocityThreshold$p() {
        return ModalBottomSheetVelocityThreshold;
    }

    public static /* synthetic */ ModalBottomSheetState ModalBottomSheetState$default(ModalBottomSheetValue modalBottomSheetValue, Density density, AnimationSpec animationSpec, Function1 function1, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            animationSpec = AnchoredDraggableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i & 8) != 0) {
            function1 = new Function1<ModalBottomSheetValue, Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetState$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(ModalBottomSheetValue modalBottomSheetValue2) {
                    return true;
                }
            };
        }
        if ((i & 16) != 0) {
            z = false;
        }
        return ModalBottomSheetState(modalBottomSheetValue, density, animationSpec, function1, z);
    }

    public static final ModalBottomSheetState ModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, Density density, AnimationSpec<Float> animationSpec, Function1<? super ModalBottomSheetValue, Boolean> function1, boolean z) {
        ModalBottomSheetState modalBottomSheetState = new ModalBottomSheetState(modalBottomSheetValue, animationSpec, z, function1);
        modalBottomSheetState.setDensity$material_release(density);
        return modalBottomSheetState;
    }

    public static /* synthetic */ ModalBottomSheetState ModalBottomSheetState$default(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec animationSpec, Function1 function1, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            animationSpec = AnchoredDraggableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i & 4) != 0) {
            function1 = new Function1<ModalBottomSheetValue, Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetState$3
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(ModalBottomSheetValue modalBottomSheetValue2) {
                    return true;
                }
            };
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return ModalBottomSheetState(modalBottomSheetValue, animationSpec, function1, z);
    }

    @Deprecated(message = "This constructor is deprecated. Density must be provided by the component. Please use the constructor that provides a [Density].", replaceWith = @ReplaceWith(expression = "\n            ModalBottomSheetState(\n                initialValue = initialValue,\n                density =,\n                animationSpec = animationSpec,\n                isSkipHalfExpanded = isSkipHalfExpanded,\n                confirmStateChange = confirmValueChange\n            )\n            ", imports = {}))
    public static final ModalBottomSheetState ModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec<Float> animationSpec, Function1<? super ModalBottomSheetValue, Boolean> function1, boolean z) {
        return new ModalBottomSheetState(modalBottomSheetValue, animationSpec, z, function1);
    }

    public static final ModalBottomSheetState rememberModalBottomSheetState(final ModalBottomSheetValue modalBottomSheetValue, AnimationSpec<Float> animationSpec, Function1<? super ModalBottomSheetValue, Boolean> function1, boolean z, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-126412120);
        ComposerKt.sourceInformation(composer, "C(rememberModalBottomSheetState)P(2)433@17446L7:ModalBottomSheet.kt#jmzs0o");
        final AnimationSpec<Float> animationSpec2 = (i2 & 2) != 0 ? AnchoredDraggableDefaults.INSTANCE.getAnimationSpec() : animationSpec;
        final Function1<? super ModalBottomSheetValue, Boolean> function12 = (i2 & 4) != 0 ? new Function1<ModalBottomSheetValue, Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt$rememberModalBottomSheetState$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(ModalBottomSheetValue modalBottomSheetValue2) {
                return true;
            }
        } : function1;
        final boolean z2 = (i2 & 8) != 0 ? false : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-126412120, i, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:432)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final Density density = (Density) consume;
        composer.startMovableGroup(170051256, modalBottomSheetValue);
        ComposerKt.sourceInformation(composer, "438@17707L646");
        ModalBottomSheetState modalBottomSheetState = (ModalBottomSheetState) RememberSaveableKt.m4101rememberSaveable(new Object[]{modalBottomSheetValue, animationSpec2, Boolean.valueOf(z2), function12, density}, (Saver) ModalBottomSheetState.INSTANCE.Saver(animationSpec2, function12, z2, density), (String) null, (Function0) new Function0<ModalBottomSheetState>() { // from class: androidx.compose.material.ModalBottomSheetKt$rememberModalBottomSheetState$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ModalBottomSheetState invoke() {
                return ModalBottomSheetKt.ModalBottomSheetState(ModalBottomSheetValue.this, density, animationSpec2, function12, z2);
            }
        }, composer, 72, 4);
        composer.endMovableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modalBottomSheetState;
    }

    @Deprecated(message = "This function is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @ReplaceWith(expression = "rememberModalBottomSheetState(initialValue, animationSpec, confirmStateChange, false)", imports = {}))
    public static final ModalBottomSheetState rememberModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec<Float> animationSpec, boolean z, Function1<? super ModalBottomSheetValue, Boolean> function1, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-409288536);
        ComposerKt.sourceInformation(composer, "C(rememberModalBottomSheetState)P(2!1,3)486@19775L185:ModalBottomSheet.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            animationSpec = AnchoredDraggableDefaults.INSTANCE.getAnimationSpec();
        }
        AnimationSpec<Float> animationSpec2 = animationSpec;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-409288536, i, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:486)");
        }
        ModalBottomSheetState rememberModalBottomSheetState = rememberModalBottomSheetState(modalBottomSheetValue, animationSpec2, function1, z, composer, (i & 14) | 64 | ((i >> 3) & 896) | ((i << 3) & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberModalBottomSheetState;
    }

    @Deprecated(message = "This function is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @ReplaceWith(expression = "rememberModalBottomSheetState(initialValue, animationSpec, confirmValueChange = confirmStateChange)", imports = {}))
    public static final ModalBottomSheetState rememberModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec<Float> animationSpec, Function1<? super ModalBottomSheetValue, Boolean> function1, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1928569212);
        ComposerKt.sourceInformation(composer, "C(rememberModalBottomSheetState)P(2)514@20852L174:ModalBottomSheet.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            animationSpec = AnchoredDraggableDefaults.INSTANCE.getAnimationSpec();
        }
        AnimationSpec<Float> animationSpec2 = animationSpec;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1928569212, i, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:514)");
        }
        ModalBottomSheetState rememberModalBottomSheetState = rememberModalBottomSheetState(modalBottomSheetValue, animationSpec2, function1, false, composer, (i & 14) | 3136 | (i & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberModalBottomSheetState;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018b  */
    /* renamed from: ModalBottomSheetLayout-Gs3lGvM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1900ModalBottomSheetLayoutGs3lGvM(final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r35, androidx.compose.ui.Modifier r36, androidx.compose.material.ModalBottomSheetState r37, boolean r38, androidx.compose.ui.graphics.Shape r39, float r40, long r41, long r43, long r45, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r47, androidx.compose.runtime.Composer r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ModalBottomSheetKt.m1900ModalBottomSheetLayoutGs3lGvM(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, androidx.compose.material.ModalBottomSheetState, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Modifier modalBottomSheetAnchors(Modifier modifier, final ModalBottomSheetState modalBottomSheetState, final float f) {
        return OnRemeasuredModifierKt.onSizeChanged(modifier, new Function1<IntSize, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$modalBottomSheetAnchors$1

            /* compiled from: ModalBottomSheet.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            /* loaded from: classes.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ModalBottomSheetValue.values().length];
                    try {
                        iArr[ModalBottomSheetValue.Hidden.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ModalBottomSheetValue.HalfExpanded.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ModalBottomSheetValue.Expanded.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                m1905invokeozmzZPI(intSize.getPackedValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-ozmzZPI, reason: not valid java name */
            public final void m1905invokeozmzZPI(final long j) {
                ModalBottomSheetValue modalBottomSheetValue;
                final float f2 = f;
                final ModalBottomSheetState modalBottomSheetState2 = ModalBottomSheetState.this;
                DraggableAnchors<ModalBottomSheetValue> DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<ModalBottomSheetValue>, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$modalBottomSheetAnchors$1$newAnchors$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<ModalBottomSheetValue> draggableAnchorsConfig) {
                        invoke2(draggableAnchorsConfig);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DraggableAnchorsConfig<ModalBottomSheetValue> draggableAnchorsConfig) {
                        draggableAnchorsConfig.at(ModalBottomSheetValue.Hidden, f2);
                        float f3 = f2 / 2.0f;
                        if (!modalBottomSheetState2.getIsSkipHalfExpanded() && IntSize.m7166getHeightimpl(j) > f3) {
                            draggableAnchorsConfig.at(ModalBottomSheetValue.HalfExpanded, f3);
                        }
                        if (IntSize.m7166getHeightimpl(j) != 0) {
                            draggableAnchorsConfig.at(ModalBottomSheetValue.Expanded, Math.max(0.0f, f2 - IntSize.m7166getHeightimpl(j)));
                        }
                    }
                });
                boolean z = ModalBottomSheetState.this.getAnchoredDraggableState$material_release().getAnchors().getSize() > 0;
                ModalBottomSheetValue currentValue = ModalBottomSheetState.this.getCurrentValue();
                if (z || !DraggableAnchors.hasAnchorFor(currentValue)) {
                    int i = WhenMappings.$EnumSwitchMapping$0[ModalBottomSheetState.this.getTargetValue().ordinal()];
                    if (i == 1) {
                        currentValue = ModalBottomSheetValue.Hidden;
                    } else if (i == 2 || i == 3) {
                        if (DraggableAnchors.hasAnchorFor(ModalBottomSheetValue.HalfExpanded)) {
                            modalBottomSheetValue = ModalBottomSheetValue.HalfExpanded;
                        } else if (DraggableAnchors.hasAnchorFor(ModalBottomSheetValue.Expanded)) {
                            modalBottomSheetValue = ModalBottomSheetValue.Expanded;
                        } else {
                            modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                        }
                        currentValue = modalBottomSheetValue;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                ModalBottomSheetState.this.getAnchoredDraggableState$material_release().updateAnchors(DraggableAnchors, currentValue);
            }
        });
    }

    /* renamed from: Scrim-3J-VO9M */
    public static final void m1901Scrim3JVO9M(final long j, final Function0<Unit> function0, final boolean z, Composer composer, final int i) {
        int i2;
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(-526532668);
        ComposerKt.sourceInformation(startRestartGroup, "C(Scrim)P(0:c#ui.graphics.Color)714@29494L121,718@29641L29,730@30047L171:ModalBottomSheet.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-526532668, i2, -1, "androidx.compose.material.Scrim (ModalBottomSheet.kt:712)");
            }
            if (j != Color.INSTANCE.m4551getUnspecified0d7_KjU()) {
                final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, startRestartGroup, 48, 28);
                final String m1976getString4foXLRw = Strings_androidKt.m1976getString4foXLRw(Strings.INSTANCE.m1970getCloseSheetUdPEhr4(), startRestartGroup, 6);
                if (z) {
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    startRestartGroup.startReplaceableGroup(358213843);
                    boolean changedInstance = startRestartGroup.changedInstance(function0);
                    ModalBottomSheetKt$Scrim$dismissModifier$1$1 rememberedValue = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new ModalBottomSheetKt$Scrim$dismissModifier$1$1(function0, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, function0, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue);
                    startRestartGroup.startReplaceableGroup(358213933);
                    boolean changed = startRestartGroup.changed(m1976getString4foXLRw) | startRestartGroup.changedInstance(function0);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$2$1
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
                                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, m1976getString4foXLRw);
                                final Function0<Unit> function02 = function0;
                                SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Boolean invoke() {
                                        function02.invoke();
                                        return true;
                                    }
                                }, 1, null);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceableGroup();
                    companion = SemanticsModifierKt.semantics(pointerInput, true, (Function1) rememberedValue2);
                } else {
                    companion = Modifier.INSTANCE;
                }
                Modifier then = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(companion);
                startRestartGroup.startReplaceableGroup(358214221);
                boolean changed2 = startRestartGroup.changed(j) | startRestartGroup.changed(animateFloatAsState);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$1$1
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
                            float Scrim_3J_VO9M$lambda$1;
                            long j2 = j;
                            Scrim_3J_VO9M$lambda$1 = ModalBottomSheetKt.Scrim_3J_VO9M$lambda$1(animateFloatAsState);
                            DrawScope.m5065drawRectnJ9OG0$default(drawScope, j2, 0L, 0L, Scrim_3J_VO9M$lambda$1, null, null, 0, 118, null);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(then, (Function1) rememberedValue3, startRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$2
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
                    ModalBottomSheetKt.m1901Scrim3JVO9M(j, function0, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState<?> anchoredDraggableState, Orientation orientation) {
        return new ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(anchoredDraggableState, orientation);
    }

    public static final float Scrim_3J_VO9M$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }
}
