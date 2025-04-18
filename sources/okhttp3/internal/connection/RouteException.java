package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes4.dex */
public final class RouteException extends RuntimeException {

    @NotNull
    private final IOException firstConnectException;

    @NotNull
    private IOException lastConnectException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(@NotNull IOException iOException) {
        super(iOException);
        a.s(iOException, "firstConnectException");
        this.firstConnectException = iOException;
        this.lastConnectException = iOException;
    }

    public final void addConnectException(@NotNull IOException iOException) {
        a.s(iOException, "e");
        q.a(this.firstConnectException, iOException);
        this.lastConnectException = iOException;
    }

    @NotNull
    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    @NotNull
    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }
}
