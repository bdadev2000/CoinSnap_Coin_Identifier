package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

/* loaded from: classes.dex */
public final class SelectionContainerKt {
    public static final void a(Modifier modifier, Selection selection, l lVar, p pVar, Composer composer, int i2, int i3) {
        Modifier modifier2;
        int i4;
        Modifier modifier3;
        ComposerImpl g2 = composer.g(2078139907);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= g2.I(selection) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= g2.w(lVar) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= g2.w(pVar) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i4 & 1171) == 1170 && g2.i()) {
            g2.A();
            modifier3 = modifier2;
        } else {
            modifier3 = i5 != 0 ? Modifier.Companion.f14687a : modifier2;
            SelectionRegistrarImpl selectionRegistrarImpl = (SelectionRegistrarImpl) RememberSaveableKt.c(new Object[0], SelectionRegistrarImpl.f7274m, null, SelectionContainerKt$SelectionContainer$registrarImpl$1.f7126a, g2, 3072, 4);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (u2 == composer$Companion$Empty$1) {
                u2 = new SelectionManager(selectionRegistrarImpl);
                g2.o(u2);
            }
            SelectionManager selectionManager = (SelectionManager) u2;
            selectionManager.e = (HapticFeedback) g2.K(CompositionLocalsKt.f16438j);
            selectionManager.f7218f = (ClipboardManager) g2.K(CompositionLocalsKt.d);
            selectionManager.f7219g = (TextToolbar) g2.K(CompositionLocalsKt.f16443o);
            selectionManager.d = new SelectionManager$onSelectionChange$2(selectionManager, lVar);
            selectionManager.m(selection);
            ContextMenu_androidKt.b(selectionManager, ComposableLambdaKt.c(-123806316, new SelectionContainerKt$SelectionContainer$3(selectionRegistrarImpl, modifier3, selectionManager, pVar), g2), g2, 48);
            boolean w = g2.w(selectionManager);
            Object u3 = g2.u();
            if (w || u3 == composer$Companion$Empty$1) {
                u3 = new SelectionContainerKt$SelectionContainer$4$1(selectionManager);
                g2.o(u3);
            }
            EffectsKt.c(selectionManager, (l) u3, g2);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new SelectionContainerKt$SelectionContainer$5(modifier3, selection, lVar, pVar, i2, i3);
        }
    }
}
