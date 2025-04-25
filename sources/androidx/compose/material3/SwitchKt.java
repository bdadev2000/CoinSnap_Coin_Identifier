package androidx.compose.material3;

import androidx.compose.animation.core.SnapSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.base.utils.StatusBarUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Switch.kt */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001al\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0018¢\u0006\u0002\b\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0002\u0010\u001f\u001aR\u0010 \u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0006\u0010\u001d\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0003¢\u0006\u0002\u0010$\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007\"\u0010\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007\"\u0016\u0010\t\u001a\u00020\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\n\u0010\u000b\"\u0010\u0010\f\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007\"\u0016\u0010\r\u001a\u00020\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000e\u0010\u000b¨\u0006%"}, d2 = {"AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "SnapSpec", "Landroidx/compose/animation/core/SnapSpec;", "SwitchHeight", "Landroidx/compose/ui/unit/Dp;", "F", "SwitchWidth", "ThumbDiameter", "getThumbDiameter", "()F", "ThumbPadding", "UncheckedThumbDiameter", "getUncheckedThumbDiameter", "Switch", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "thumbContent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "enabled", "colors", "Landroidx/compose/material3/SwitchColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/SwitchColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "SwitchImpl", "Landroidx/compose/foundation/interaction/InteractionSource;", "thumbShape", "Landroidx/compose/ui/graphics/Shape;", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/material3/SwitchColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class SwitchKt {
    private static final TweenSpec<Float> AnimationSpec;
    private static final SnapSpec<Float> SnapSpec;
    private static final float SwitchHeight;
    private static final float SwitchWidth;
    private static final float ThumbDiameter;
    private static final float ThumbPadding;
    private static final float UncheckedThumbDiameter;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Switch(final boolean r22, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r23, androidx.compose.ui.Modifier r24, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, boolean r26, androidx.compose.material3.SwitchColors r27, androidx.compose.foundation.interaction.MutableInteractionSource r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwitchKt.Switch(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, boolean, androidx.compose.material3.SwitchColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SwitchImpl(final Modifier modifier, final boolean z, final boolean z2, final SwitchColors switchColors, final Function2<? super Composer, ? super Integer, Unit> function2, final InteractionSource interactionSource, final Shape shape, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1594099146);
        ComposerKt.sourceInformation(startRestartGroup, "C(SwitchImpl)P(4!1,2!1,5)147@6165L5,149@6176L1114:Switch.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(switchColors) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(interactionSource) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(shape) ? 1048576 : 524288;
        }
        int i3 = i2;
        if ((599187 & i3) != 599186 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1594099146, i3, -1, "androidx.compose.material3.SwitchImpl (Switch.kt:144)");
            }
            long m2895trackColorWaAFU9c$material3_release = switchColors.m2895trackColorWaAFU9c$material3_release(z2, z);
            long m2894thumbColorWaAFU9c$material3_release = switchColors.m2894thumbColorWaAFU9c$material3_release(z2, z);
            Shape value = ShapesKt.getValue(SwitchTokens.INSTANCE.getTrackShape(), startRestartGroup, 6);
            Modifier m539backgroundbw27NRU = BackgroundKt.m539backgroundbw27NRU(BorderKt.m551borderxT4_qwU(modifier, SwitchTokens.INSTANCE.m3846getTrackOutlineWidthD9Ej5fM(), switchColors.m2875borderColorWaAFU9c$material3_release(z2, z), value), m2895trackColorWaAFU9c$material3_release, value);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m539backgroundbw27NRU);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -249502072, "C161@6662L183,154@6351L933:Switch.kt#uh7d8r");
            Modifier m539backgroundbw27NRU2 = BackgroundKt.m539backgroundbw27NRU(IndicationKt.indication(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()).then(new ThumbElement(interactionSource, z)), interactionSource, RippleKt.m2728rippleOrFallbackImplementation9IZ8Weo(false, Dp.m6997constructorimpl(SwitchTokens.INSTANCE.m3844getStateLayerSizeD9Ej5fM() / 2), 0L, startRestartGroup, 54, 4)), m2894thumbColorWaAFU9c$material3_release, shape);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m539backgroundbw27NRU2);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1707453249, "C:Switch.kt#uh7d8r");
            startRestartGroup.startReplaceGroup(1163457794);
            ComposerKt.sourceInformation(startRestartGroup, "171@7116L144");
            composer2 = startRestartGroup;
            if (function2 != null) {
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4505boximpl(switchColors.m2893iconColorWaAFU9c$material3_release(z2, z))), function2, composer2, ProvidedValue.$stable | ((i3 >> 9) & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA));
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
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
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SwitchKt$SwitchImpl$2
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

                public final void invoke(Composer composer3, int i4) {
                    SwitchKt.SwitchImpl(Modifier.this, z, z2, switchColors, function2, interactionSource, shape, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    static {
        float m3842getSelectedHandleWidthD9Ej5fM = SwitchTokens.INSTANCE.m3842getSelectedHandleWidthD9Ej5fM();
        ThumbDiameter = m3842getSelectedHandleWidthD9Ej5fM;
        UncheckedThumbDiameter = SwitchTokens.INSTANCE.m3849getUnselectedHandleWidthD9Ej5fM();
        SwitchWidth = SwitchTokens.INSTANCE.m3847getTrackWidthD9Ej5fM();
        float m3845getTrackHeightD9Ej5fM = SwitchTokens.INSTANCE.m3845getTrackHeightD9Ej5fM();
        SwitchHeight = m3845getTrackHeightD9Ej5fM;
        ThumbPadding = Dp.m6997constructorimpl(Dp.m6997constructorimpl(m3845getTrackHeightD9Ej5fM - m3842getSelectedHandleWidthD9Ej5fM) / 2);
        SnapSpec = new SnapSpec<>(0, 1, null);
        AnimationSpec = new TweenSpec<>(100, 0, null, 6, null);
    }

    public static final float getThumbDiameter() {
        return ThumbDiameter;
    }

    public static final float getUncheckedThumbDiameter() {
        return UncheckedThumbDiameter;
    }
}
