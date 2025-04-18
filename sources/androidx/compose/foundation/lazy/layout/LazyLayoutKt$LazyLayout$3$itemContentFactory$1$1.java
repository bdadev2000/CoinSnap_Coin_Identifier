package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.State;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes3.dex */
final class LazyLayoutKt$LazyLayout$3$itemContentFactory$1$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ State f4811a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutKt$LazyLayout$3$itemContentFactory$1$1(State state) {
        super(0);
        this.f4811a = state;
    }

    @Override // q0.a
    public final Object invoke() {
        return (LazyLayoutItemProvider) ((a) this.f4811a.getValue()).invoke();
    }
}
