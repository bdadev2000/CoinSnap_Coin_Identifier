package androidx.compose.material3.internal;

import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import b1.d0;
import com.cooldev.gba.emulator.gameboy.R;
import org.objectweb.asm.Opcodes;
import q0.p;

/* loaded from: classes.dex */
public final class BasicTooltip_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.window.PopupPositionProvider r20, q0.p r21, androidx.compose.material3.TooltipState r22, androidx.compose.ui.Modifier r23, boolean r24, boolean r25, q0.p r26, androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltip_androidKt.a(androidx.compose.ui.window.PopupPositionProvider, q0.p, androidx.compose.material3.TooltipState, androidx.compose.ui.Modifier, boolean, boolean, q0.p, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(PopupPositionProvider popupPositionProvider, TooltipState tooltipState, d0 d0Var, boolean z2, p pVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-273292979);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(popupPositionProvider) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? g2.I(tooltipState) : g2.w(tooltipState) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.w(d0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g2.a(z2) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= g2.w(pVar) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && g2.i()) {
            g2.A();
        } else {
            String a2 = StringResources_androidKt.a(R.string.tooltip_description, g2);
            boolean w = ((i3 & 112) == 32 || ((i3 & 64) != 0 && g2.w(tooltipState))) | g2.w(d0Var);
            Object u2 = g2.u();
            if (w || u2 == Composer.Companion.f13690a) {
                u2 = new BasicTooltip_androidKt$TooltipPopup$1$1(tooltipState, d0Var);
                g2.o(u2);
            }
            AndroidPopup_androidKt.a(popupPositionProvider, (q0.a) u2, new PopupProperties(z2, 14), ComposableLambdaKt.c(610617071, new BasicTooltip_androidKt$TooltipPopup$2(a2, pVar), g2), g2, (i3 & 14) | 3072, 0);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new BasicTooltip_androidKt$TooltipPopup$3(popupPositionProvider, tooltipState, d0Var, z2, pVar, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(boolean r15, androidx.compose.material3.TooltipState r16, androidx.compose.ui.Modifier r17, q0.p r18, androidx.compose.runtime.Composer r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltip_androidKt.c(boolean, androidx.compose.material3.TooltipState, androidx.compose.ui.Modifier, q0.p, androidx.compose.runtime.Composer, int, int):void");
    }
}
