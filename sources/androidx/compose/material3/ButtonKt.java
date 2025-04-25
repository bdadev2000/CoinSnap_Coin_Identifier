package androidx.compose.material3;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u008f\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008f\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008f\u0001\u0010\u001b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008f\u0001\u0010\u001c\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008f\u0001\u0010\u001d\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019¨\u0006\u001e"}, d2 = {"Button", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/ButtonColors;", "elevation", "Landroidx/compose/material3/ButtonElevation;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ElevatedButton", "FilledTonalButton", "OutlinedButton", "TextButton", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class ButtonKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018f  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Button(final kotlin.jvm.functions.Function0<kotlin.Unit> r31, androidx.compose.ui.Modifier r32, boolean r33, androidx.compose.ui.graphics.Shape r34, androidx.compose.material3.ButtonColors r35, androidx.compose.material3.ButtonElevation r36, androidx.compose.foundation.BorderStroke r37, androidx.compose.foundation.layout.PaddingValues r38, androidx.compose.foundation.interaction.MutableInteractionSource r39, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ButtonKt.Button(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ButtonColors, androidx.compose.material3.ButtonElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ElevatedButton(final kotlin.jvm.functions.Function0<kotlin.Unit> r26, androidx.compose.ui.Modifier r27, boolean r28, androidx.compose.ui.graphics.Shape r29, androidx.compose.material3.ButtonColors r30, androidx.compose.material3.ButtonElevation r31, androidx.compose.foundation.BorderStroke r32, androidx.compose.foundation.layout.PaddingValues r33, androidx.compose.foundation.interaction.MutableInteractionSource r34, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ButtonKt.ElevatedButton(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ButtonColors, androidx.compose.material3.ButtonElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void FilledTonalButton(final kotlin.jvm.functions.Function0<kotlin.Unit> r26, androidx.compose.ui.Modifier r27, boolean r28, androidx.compose.ui.graphics.Shape r29, androidx.compose.material3.ButtonColors r30, androidx.compose.material3.ButtonElevation r31, androidx.compose.foundation.BorderStroke r32, androidx.compose.foundation.layout.PaddingValues r33, androidx.compose.foundation.interaction.MutableInteractionSource r34, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ButtonKt.FilledTonalButton(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ButtonColors, androidx.compose.material3.ButtonElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void OutlinedButton(final kotlin.jvm.functions.Function0<kotlin.Unit> r27, androidx.compose.ui.Modifier r28, boolean r29, androidx.compose.ui.graphics.Shape r30, androidx.compose.material3.ButtonColors r31, androidx.compose.material3.ButtonElevation r32, androidx.compose.foundation.BorderStroke r33, androidx.compose.foundation.layout.PaddingValues r34, androidx.compose.foundation.interaction.MutableInteractionSource r35, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ButtonKt.OutlinedButton(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ButtonColors, androidx.compose.material3.ButtonElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void TextButton(final kotlin.jvm.functions.Function0<kotlin.Unit> r26, androidx.compose.ui.Modifier r27, boolean r28, androidx.compose.ui.graphics.Shape r29, androidx.compose.material3.ButtonColors r30, androidx.compose.material3.ButtonElevation r31, androidx.compose.foundation.BorderStroke r32, androidx.compose.foundation.layout.PaddingValues r33, androidx.compose.foundation.interaction.MutableInteractionSource r34, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ButtonKt.TextButton(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ButtonColors, androidx.compose.material3.ButtonElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }
}
