package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import org.objectweb.asm.Opcodes;
import q0.a;
import q0.p;

/* loaded from: classes2.dex */
public final class LazyLayoutKt {
    public static final void a(a aVar, Modifier modifier, LazyLayoutPrefetchState lazyLayoutPrefetchState, p pVar, Composer composer, int i2, int i3) {
        int i4;
        ComposerImpl g2 = composer.g(2002163445);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (g2.w(aVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= g2.I(modifier) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= g2.I(lazyLayoutPrefetchState) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= g2.w(pVar) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i4 & 1171) == 1170 && g2.i()) {
            g2.A();
        } else {
            if (i5 != 0) {
                modifier = Modifier.Companion.f14687a;
            }
            if (i6 != 0) {
                lazyLayoutPrefetchState = null;
            }
            LazySaveableStateHolderKt.a(ComposableLambdaKt.c(-1488997347, new LazyLayoutKt$LazyLayout$3(lazyLayoutPrefetchState, modifier, pVar, SnapshotStateKt.k(aVar, g2)), g2), g2, 6);
        }
        Modifier modifier2 = modifier;
        LazyLayoutPrefetchState lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new LazyLayoutKt$LazyLayout$4(aVar, modifier2, lazyLayoutPrefetchState2, pVar, i2, i3);
        }
    }
}
