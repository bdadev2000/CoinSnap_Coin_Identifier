package a2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public final f f52b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f53c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f callbackName, Throwable cause) {
        super(cause);
        Intrinsics.checkNotNullParameter(callbackName, "callbackName");
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f52b = callbackName;
        this.f53c = cause;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f53c;
    }
}
