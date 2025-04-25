package androidx.compose.material3;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* compiled from: IconButton.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ab\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001ap\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00152\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u0016\u001ab\u0010\u0017\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001ap\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00152\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u0016\u001aX\u0010\u0019\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u001a\u001af\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00152\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u001c\u001an\u0010\u001d\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010 \u001a|\u0010!\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00152\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\"¨\u0006#"}, d2 = {"FilledIconButton", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/IconButtonColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "FilledIconToggleButton", "checked", "onCheckedChange", "Lkotlin/Function1;", "Landroidx/compose/material3/IconToggleButtonColors;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "FilledTonalIconButton", "FilledTonalIconToggleButton", "IconButton", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "IconToggleButton", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "OutlinedIconButton", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "OutlinedIconToggleButton", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class IconButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void IconButton(final kotlin.jvm.functions.Function0<kotlin.Unit> r24, androidx.compose.ui.Modifier r25, boolean r26, androidx.compose.material3.IconButtonColors r27, androidx.compose.foundation.interaction.MutableInteractionSource r28, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconButtonKt.IconButton(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.IconButtonColors, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void IconToggleButton(final boolean r20, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r21, androidx.compose.ui.Modifier r22, boolean r23, androidx.compose.material3.IconToggleButtonColors r24, androidx.compose.foundation.interaction.MutableInteractionSource r25, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconButtonKt.IconToggleButton(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.IconToggleButtonColors, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void FilledIconButton(final kotlin.jvm.functions.Function0<kotlin.Unit> r28, androidx.compose.ui.Modifier r29, boolean r30, androidx.compose.ui.graphics.Shape r31, androidx.compose.material3.IconButtonColors r32, androidx.compose.foundation.interaction.MutableInteractionSource r33, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconButtonKt.FilledIconButton(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.IconButtonColors, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void FilledTonalIconButton(final kotlin.jvm.functions.Function0<kotlin.Unit> r28, androidx.compose.ui.Modifier r29, boolean r30, androidx.compose.ui.graphics.Shape r31, androidx.compose.material3.IconButtonColors r32, androidx.compose.foundation.interaction.MutableInteractionSource r33, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconButtonKt.FilledTonalIconButton(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.IconButtonColors, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void FilledIconToggleButton(final boolean r24, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r25, androidx.compose.ui.Modifier r26, boolean r27, androidx.compose.ui.graphics.Shape r28, androidx.compose.material3.IconToggleButtonColors r29, androidx.compose.foundation.interaction.MutableInteractionSource r30, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconButtonKt.FilledIconToggleButton(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.IconToggleButtonColors, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void FilledTonalIconToggleButton(final boolean r24, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r25, androidx.compose.ui.Modifier r26, boolean r27, androidx.compose.ui.graphics.Shape r28, androidx.compose.material3.IconToggleButtonColors r29, androidx.compose.foundation.interaction.MutableInteractionSource r30, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconButtonKt.FilledTonalIconToggleButton(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.IconToggleButtonColors, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void OutlinedIconButton(final kotlin.jvm.functions.Function0<kotlin.Unit> r28, androidx.compose.ui.Modifier r29, boolean r30, androidx.compose.ui.graphics.Shape r31, androidx.compose.material3.IconButtonColors r32, androidx.compose.foundation.BorderStroke r33, androidx.compose.foundation.interaction.MutableInteractionSource r34, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconButtonKt.OutlinedIconButton(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.IconButtonColors, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void OutlinedIconToggleButton(final boolean r25, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r26, androidx.compose.ui.Modifier r27, boolean r28, androidx.compose.ui.graphics.Shape r29, androidx.compose.material3.IconToggleButtonColors r30, androidx.compose.foundation.BorderStroke r31, androidx.compose.foundation.interaction.MutableInteractionSource r32, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconButtonKt.OutlinedIconToggleButton(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.IconToggleButtonColors, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }
}
