package androidx.compose.runtime;

import h0.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ProduceFrameSignal {

    /* renamed from: a, reason: collision with root package name */
    public Object f13856a;

    public final g a() {
        Object obj = this.f13856a;
        if (obj instanceof g) {
            this.f13856a = RecomposerKt.f13963b;
            return (g) obj;
        }
        Object obj2 = RecomposerKt.f13962a;
        if (!p0.a.g(obj, obj2) && !p0.a.g(obj, RecomposerKt.f13963b)) {
            if (obj != null) {
                throw new IllegalStateException(("invalid pendingFrameContinuation " + obj).toString());
            }
            this.f13856a = obj2;
        }
        return null;
    }
}
