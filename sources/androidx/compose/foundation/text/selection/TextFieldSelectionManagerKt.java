package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import org.objectweb.asm.Opcodes;
import q0.p;

/* loaded from: classes2.dex */
public final class TextFieldSelectionManagerKt {

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7338a;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7338a = iArr;
        }
    }

    public static final void a(final boolean z2, ResolvedTextDirection resolvedTextDirection, final TextFieldSelectionManager textFieldSelectionManager, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-1344558920);
        if ((i2 & 6) == 0) {
            i3 = (g2.a(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.I(resolvedTextDirection) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.w(textFieldSelectionManager) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else {
            int i4 = i3 & 14;
            boolean I = (i4 == 4) | g2.I(textFieldSelectionManager);
            Object u2 = g2.u();
            Object obj = Composer.Companion.f13690a;
            if (I || u2 == obj) {
                textFieldSelectionManager.getClass();
                u2 = new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$handleDragObserver$1
                    @Override // androidx.compose.foundation.text.TextDragObserver
                    public final void a() {
                        TextLayoutResultProxy d;
                        boolean z3 = z2;
                        Handle handle = z3 ? Handle.f5965b : Handle.f5966c;
                        TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                        TextFieldSelectionManager.b(textFieldSelectionManager2, handle);
                        long a2 = SelectionHandlesKt.a(textFieldSelectionManager2.k(z3));
                        LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager2.d;
                        if (legacyTextFieldState == null || (d = legacyTextFieldState.d()) == null) {
                            return;
                        }
                        long e = d.e(a2);
                        textFieldSelectionManager2.f7310m = e;
                        textFieldSelectionManager2.f7314q.setValue(new Offset(e));
                        textFieldSelectionManager2.f7312o = 0L;
                        textFieldSelectionManager2.f7315r = -1;
                        LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager2.d;
                        if (legacyTextFieldState2 != null) {
                            legacyTextFieldState2.f6035q.setValue(Boolean.TRUE);
                        }
                        textFieldSelectionManager2.t(false);
                    }

                    @Override // androidx.compose.foundation.text.TextDragObserver
                    public final void b(long j2) {
                    }

                    @Override // androidx.compose.foundation.text.TextDragObserver
                    public final void c() {
                        TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                        TextFieldSelectionManager.b(textFieldSelectionManager2, null);
                        TextFieldSelectionManager.a(textFieldSelectionManager2, null);
                        textFieldSelectionManager2.t(true);
                    }

                    @Override // androidx.compose.foundation.text.TextDragObserver
                    public final void d(long j2) {
                        TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                        long k2 = Offset.k(textFieldSelectionManager2.f7312o, j2);
                        textFieldSelectionManager2.f7312o = k2;
                        textFieldSelectionManager2.f7314q.setValue(new Offset(Offset.k(textFieldSelectionManager2.f7310m, k2)));
                        TextFieldValue l2 = textFieldSelectionManager2.l();
                        Offset i5 = textFieldSelectionManager2.i();
                        p0.a.p(i5);
                        TextFieldSelectionManager.c(textFieldSelectionManager2, l2, i5.f14913a, false, z2, SelectionAdjustment.Companion.e, true);
                        textFieldSelectionManager2.t(false);
                    }

                    @Override // androidx.compose.foundation.text.TextDragObserver
                    public final void onCancel() {
                    }

                    @Override // androidx.compose.foundation.text.TextDragObserver
                    public final void onStop() {
                        TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                        TextFieldSelectionManager.b(textFieldSelectionManager2, null);
                        TextFieldSelectionManager.a(textFieldSelectionManager2, null);
                        textFieldSelectionManager2.t(true);
                    }
                };
                g2.o(u2);
            }
            TextDragObserver textDragObserver = (TextDragObserver) u2;
            boolean w = g2.w(textFieldSelectionManager) | (i4 == 4);
            Object u3 = g2.u();
            if (w || u3 == obj) {
                u3 = new OffsetProvider() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$1$1
                    @Override // androidx.compose.foundation.text.selection.OffsetProvider
                    public final long a() {
                        return TextFieldSelectionManager.this.k(z2);
                    }
                };
                g2.o(u3);
            }
            OffsetProvider offsetProvider = (OffsetProvider) u3;
            boolean g3 = TextRange.g(textFieldSelectionManager.l().f17362b);
            Modifier.Companion companion = Modifier.Companion.f14687a;
            boolean w2 = g2.w(textDragObserver);
            Object u4 = g2.u();
            if (w2 || u4 == obj) {
                u4 = new TextFieldSelectionManagerKt$TextFieldSelectionHandle$2$1(textDragObserver, null);
                g2.o(u4);
            }
            int i5 = i3 << 3;
            AndroidSelectionHandles_androidKt.b(offsetProvider, z2, resolvedTextDirection, g3, 0L, SuspendingPointerInputFilterKt.b(companion, textDragObserver, (p) u4), g2, (i5 & 896) | (i5 & 112), 16);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new TextFieldSelectionManagerKt$TextFieldSelectionHandle$3(z2, resolvedTextDirection, textFieldSelectionManager, i2);
        }
    }

    public static final boolean b(TextFieldSelectionManager textFieldSelectionManager, boolean z2) {
        LayoutCoordinates c2;
        LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.d;
        if (legacyTextFieldState == null || (c2 = legacyTextFieldState.c()) == null) {
            return false;
        }
        return SelectionManagerKt.a(textFieldSelectionManager.k(z2), SelectionManagerKt.c(c2));
    }
}
