package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import org.objectweb.asm.Opcodes;

/* loaded from: classes4.dex */
public final class LazyLayoutItemContentFactoryKt {
    public static final void a(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj, int i2, Object obj2, Composer composer, int i3) {
        int i4;
        ComposerImpl g2 = composer.g(1439843069);
        if ((i3 & 6) == 0) {
            i4 = (g2.I(lazyLayoutItemProvider) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= g2.I(obj) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= g2.c(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= g2.I(obj2) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i4 & 1171) == 1170 && g2.i()) {
            g2.A();
        } else {
            ((SaveableStateHolder) obj).f(obj2, ComposableLambdaKt.c(980966366, new LazyLayoutItemContentFactoryKt$SkippableItem$1(i2, lazyLayoutItemProvider, obj2), g2), g2, 48);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new LazyLayoutItemContentFactoryKt$SkippableItem$2(lazyLayoutItemProvider, obj, i2, obj2, i3);
        }
    }
}
