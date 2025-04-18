package bi;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public final IOException f2505b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f2506c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(IOException firstConnectException) {
        super(firstConnectException);
        Intrinsics.checkNotNullParameter(firstConnectException, "firstConnectException");
        this.f2505b = firstConnectException;
        this.f2506c = firstConnectException;
    }
}
