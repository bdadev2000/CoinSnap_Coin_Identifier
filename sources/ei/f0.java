package ei;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public final b f17417b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(b errorCode) {
        super(Intrinsics.stringPlus("stream was reset: ", errorCode));
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f17417b = errorCode;
    }
}
