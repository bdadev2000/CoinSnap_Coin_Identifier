package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import b1.d0;
import org.objectweb.asm.Opcodes;
import q0.a;
import q0.p;

/* loaded from: classes3.dex */
public final class BasicTooltip_androidKt {
    public static final void a(PopupPositionProvider popupPositionProvider, BasicTooltipState basicTooltipState, d0 d0Var, boolean z2, p pVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-73658727);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(popupPositionProvider) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.I(basicTooltipState) ? 32 : 16;
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
            String a2 = StringResources_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.tooltip_description, g2);
            boolean w = ((i3 & 112) == 32) | g2.w(d0Var);
            Object u2 = g2.u();
            if (w || u2 == Composer.Companion.f13690a) {
                u2 = new BasicTooltip_androidKt$TooltipPopup$1$1(basicTooltipState, d0Var);
                g2.o(u2);
            }
            AndroidPopup_androidKt.a(popupPositionProvider, (a) u2, new PopupProperties(z2, 14), ComposableLambdaKt.c(-1147839433, new BasicTooltip_androidKt$TooltipPopup$2(a2, pVar), g2), g2, (i3 & 14) | 3072, 0);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new BasicTooltip_androidKt$TooltipPopup$3(popupPositionProvider, basicTooltipState, d0Var, z2, pVar, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(boolean r15, androidx.compose.foundation.BasicTooltipState r16, androidx.compose.ui.Modifier r17, q0.p r18, androidx.compose.runtime.Composer r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltip_androidKt.b(boolean, androidx.compose.foundation.BasicTooltipState, androidx.compose.ui.Modifier, q0.p, androidx.compose.runtime.Composer, int, int):void");
    }
}
