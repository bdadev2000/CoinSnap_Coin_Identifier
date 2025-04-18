package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class ComposeRuntimeError extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    public final String f13689a;

    public ComposeRuntimeError(String str) {
        this.f13689a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f13689a;
    }
}
