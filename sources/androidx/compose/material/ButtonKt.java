package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.base.utils.StatusBarUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a\u008d\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008d\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008d\u0001\u0010\u001b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019¨\u0006\u001c²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002"}, d2 = {"Button", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "elevation", "Landroidx/compose/material/ButtonElevation;", "shape", "Landroidx/compose/ui/graphics/Shape;", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "colors", "Landroidx/compose/material/ButtonColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/ButtonElevation;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ButtonColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "OutlinedButton", "TextButton", "material_release", "contentColor", "Landroidx/compose/ui/graphics/Color;"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Button(final kotlin.jvm.functions.Function0<kotlin.Unit> r42, androidx.compose.ui.Modifier r43, boolean r44, androidx.compose.foundation.interaction.MutableInteractionSource r45, androidx.compose.material.ButtonElevation r46, androidx.compose.ui.graphics.Shape r47, androidx.compose.foundation.BorderStroke r48, androidx.compose.material.ButtonColors r49, androidx.compose.foundation.layout.PaddingValues r50, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r51, androidx.compose.runtime.Composer r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 819
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ButtonKt.Button(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.ButtonElevation, androidx.compose.ui.graphics.Shape, androidx.compose.foundation.BorderStroke, androidx.compose.material.ButtonColors, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void OutlinedButton(Function0<Unit> function0, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i, int i2) {
        MutableInteractionSource mutableInteractionSource2;
        composer.startReplaceableGroup(-1776134358);
        ComposerKt.sourceInformation(composer, "C(OutlinedButton)P(8,7,5,6,4,9!2,3)170@8081L39,172@8195L6,173@8252L14,174@8310L22,177@8450L270:Button.kt#jmzs0o");
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        if ((i2 & 8) != 0) {
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        ButtonElevation buttonElevation2 = (i2 & 16) != 0 ? null : buttonElevation;
        Shape small = (i2 & 32) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall() : shape;
        BorderStroke outlinedBorder = (i2 & 64) != 0 ? ButtonDefaults.INSTANCE.getOutlinedBorder(composer, 6) : borderStroke;
        ButtonColors m1772outlinedButtonColorsRGew2ao = (i2 & 128) != 0 ? ButtonDefaults.INSTANCE.m1772outlinedButtonColorsRGew2ao(0L, 0L, 0L, composer, 3072, 7) : buttonColors;
        PaddingValues contentPadding = (i2 & 256) != 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1776134358, i, -1, "androidx.compose.material.OutlinedButton (Button.kt:177)");
        }
        Button(function0, modifier2, z2, mutableInteractionSource2, buttonElevation2, small, outlinedBorder, m1772outlinedButtonColorsRGew2ao, contentPadding, function3, composer, (i & 14) | (i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (3670016 & i) | (29360128 & i) | (234881024 & i) | (1879048192 & i), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    public static final void TextButton(Function0<Unit> function0, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i, int i2) {
        MutableInteractionSource mutableInteractionSource2;
        composer.startReplaceableGroup(288797557);
        ComposerKt.sourceInformation(composer, "C(TextButton)P(8,7,5,6,4,9!2,3)224@10652L39,226@10766L6,228@10856L18,231@11002L270:Button.kt#jmzs0o");
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        if ((i2 & 8) != 0) {
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        ButtonElevation buttonElevation2 = (i2 & 16) != 0 ? null : buttonElevation;
        Shape small = (i2 & 32) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall() : shape;
        BorderStroke borderStroke2 = (i2 & 64) != 0 ? null : borderStroke;
        ButtonColors m1773textButtonColorsRGew2ao = (i2 & 128) != 0 ? ButtonDefaults.INSTANCE.m1773textButtonColorsRGew2ao(0L, 0L, 0L, composer, 3072, 7) : buttonColors;
        PaddingValues textButtonContentPadding = (i2 & 256) != 0 ? ButtonDefaults.INSTANCE.getTextButtonContentPadding() : paddingValues;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(288797557, i, -1, "androidx.compose.material.TextButton (Button.kt:231)");
        }
        Button(function0, modifier2, z2, mutableInteractionSource2, buttonElevation2, small, borderStroke2, m1773textButtonColorsRGew2ao, textButtonContentPadding, function3, composer, (i & 14) | (i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (3670016 & i) | (29360128 & i) | (234881024 & i) | (1879048192 & i), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long Button$lambda$1(State<Color> state) {
        return state.getValue().m4525unboximpl();
    }
}
