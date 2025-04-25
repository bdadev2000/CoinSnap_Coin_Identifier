package androidx.compose.material;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* compiled from: RadioButton.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aM\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004¨\u0006\u0018"}, d2 = {"RadioAnimationDuration", "", "RadioButtonDotSize", "Landroidx/compose/ui/unit/Dp;", "F", "RadioButtonPadding", "RadioButtonRippleRadius", "RadioButtonSize", "RadioRadius", "RadioStrokeWidth", "RadioButton", "", "selected", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/RadioButtonColors;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/RadioButtonColors;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class RadioButtonKt {
    private static final int RadioAnimationDuration = 100;
    private static final float RadioButtonDotSize;
    private static final float RadioButtonPadding;
    private static final float RadioButtonRippleRadius = Dp.m6997constructorimpl(24);
    private static final float RadioButtonSize;
    private static final float RadioRadius;
    private static final float RadioStrokeWidth;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0066  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void RadioButton(final boolean r22, final kotlin.jvm.functions.Function0<kotlin.Unit> r23, androidx.compose.ui.Modifier r24, boolean r25, androidx.compose.foundation.interaction.MutableInteractionSource r26, androidx.compose.material.RadioButtonColors r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.RadioButtonKt.RadioButton(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.RadioButtonColors, androidx.compose.runtime.Composer, int, int):void");
    }

    static {
        float f = 2;
        RadioButtonPadding = Dp.m6997constructorimpl(f);
        float m6997constructorimpl = Dp.m6997constructorimpl(20);
        RadioButtonSize = m6997constructorimpl;
        RadioRadius = Dp.m6997constructorimpl(m6997constructorimpl / f);
        RadioButtonDotSize = Dp.m6997constructorimpl(12);
        RadioStrokeWidth = Dp.m6997constructorimpl(f);
    }
}
