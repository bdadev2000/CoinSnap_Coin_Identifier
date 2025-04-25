package androidx.compose.material3;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.xx.constants.Args;
import kotlin.Metadata;

/* compiled from: AndroidAlertDialog.android.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aß\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"AlertDialog", "", "onDismissRequest", "Lkotlin/Function0;", "confirmButton", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "dismissButton", "icon", Args.title, "text", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "iconContentColor", "titleContentColor", "textContentColor", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "properties", "Landroidx/compose/ui/window/DialogProperties;", "AlertDialog-Oix01E0", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJJJFLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;III)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class AndroidAlertDialog_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:109:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e2  */
    /* renamed from: AlertDialog-Oix01E0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2082AlertDialogOix01E0(final kotlin.jvm.functions.Function0<kotlin.Unit> r46, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r47, androidx.compose.ui.Modifier r48, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r49, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r50, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r51, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, androidx.compose.ui.graphics.Shape r53, long r54, long r56, long r58, long r60, float r62, androidx.compose.ui.window.DialogProperties r63, androidx.compose.runtime.Composer r64, final int r65, final int r66, final int r67) {
        /*
            Method dump skipped, instructions count: 869
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AndroidAlertDialog_androidKt.m2082AlertDialogOix01E0(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, long, long, long, long, float, androidx.compose.ui.window.DialogProperties, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
