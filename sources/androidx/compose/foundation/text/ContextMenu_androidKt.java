package androidx.compose.foundation.text;

import androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import org.objectweb.asm.Opcodes;
import q0.p;

/* loaded from: classes4.dex */
public final class ContextMenu_androidKt {
    public static final void a(TextFieldSelectionState textFieldSelectionState, boolean z2, p pVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(2103477555);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(textFieldSelectionState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.a(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.w(pVar) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else {
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (u2 == composer$Companion$Empty$1) {
                u2 = new ContextMenuState();
                g2.o(u2);
            }
            ContextMenuState contextMenuState = (ContextMenuState) u2;
            Object u3 = g2.u();
            if (u3 == composer$Companion$Empty$1) {
                u3 = new ContextMenu_androidKt$ContextMenuArea$3$1(contextMenuState);
                g2.o(u3);
            }
            int i4 = i3 << 9;
            ContextMenuArea_androidKt.b(contextMenuState, (q0.a) u3, TextFieldSelectionState_androidKt.a(contextMenuState, textFieldSelectionState), null, z2, pVar, g2, (57344 & i4) | 54 | (i4 & Opcodes.ASM7), 8);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ContextMenu_androidKt$ContextMenuArea$4(textFieldSelectionState, z2, pVar, i2);
        }
    }

    public static final void b(SelectionManager selectionManager, p pVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(605522716);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(selectionManager) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.w(pVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && g2.i()) {
            g2.A();
        } else {
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (u2 == composer$Companion$Empty$1) {
                u2 = new ContextMenuState();
                g2.o(u2);
            }
            ContextMenuState contextMenuState = (ContextMenuState) u2;
            Object u3 = g2.u();
            if (u3 == composer$Companion$Empty$1) {
                u3 = new ContextMenu_androidKt$ContextMenuArea$5$1(contextMenuState);
                g2.o(u3);
            }
            ContextMenuArea_androidKt.b(contextMenuState, (q0.a) u3, SelectionManager_androidKt.a(contextMenuState, selectionManager), null, false, pVar, g2, ((i3 << 12) & Opcodes.ASM7) | 54, 24);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ContextMenu_androidKt$ContextMenuArea$6(selectionManager, pVar, i2);
        }
    }

    public static final void c(TextFieldSelectionManager textFieldSelectionManager, p pVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-1985516685);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(textFieldSelectionManager) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.w(pVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && g2.i()) {
            g2.A();
        } else {
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (u2 == composer$Companion$Empty$1) {
                u2 = new ContextMenuState();
                g2.o(u2);
            }
            ContextMenuState contextMenuState = (ContextMenuState) u2;
            Object u3 = g2.u();
            if (u3 == composer$Companion$Empty$1) {
                u3 = new ContextMenu_androidKt$ContextMenuArea$1$1(contextMenuState);
                g2.o(u3);
            }
            ContextMenuArea_androidKt.b(contextMenuState, (q0.a) u3, TextFieldSelectionManager_androidKt.a(contextMenuState, textFieldSelectionManager), null, textFieldSelectionManager.j(), pVar, g2, ((i3 << 12) & Opcodes.ASM7) | 54, 8);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ContextMenu_androidKt$ContextMenuArea$2(textFieldSelectionManager, pVar, i2);
        }
    }
}
