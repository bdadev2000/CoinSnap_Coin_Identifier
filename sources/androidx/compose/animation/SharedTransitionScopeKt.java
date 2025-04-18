package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LookaheadScopeKt;
import b1.f0;
import d0.h;
import d0.i;
import q0.r;

/* loaded from: classes.dex */
public final class SharedTransitionScopeKt {

    /* renamed from: a, reason: collision with root package name */
    public static final h f1925a;

    static {
        Rect rect = VisibilityThresholdsKt.f2404a;
        f1925a = f0.s(i.f30133c, SharedTransitionScopeKt$SharedTransitionObserver$2.f1932a);
        new MutableScatterMap();
    }

    public static final void a(r rVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-2093217917);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(rVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && g2.i()) {
            g2.A();
        } else {
            LookaheadScopeKt.a(ComposableLambdaKt.c(-863967934, new SharedTransitionScopeKt$SharedTransitionScope$1(rVar), g2), g2, 6);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new SharedTransitionScopeKt$SharedTransitionScope$2(rVar, i2);
        }
    }

    public static final SnapshotStateObserver b() {
        return (SnapshotStateObserver) f1925a.getValue();
    }
}
