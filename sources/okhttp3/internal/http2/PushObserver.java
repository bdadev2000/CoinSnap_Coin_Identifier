package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes2.dex */
public interface PushObserver {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @NotNull
    public static final PushObserver CANCEL = new Companion.PushObserverCancel();

    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* loaded from: classes2.dex */
        public static final class PushObserverCancel implements PushObserver {
            @Override // okhttp3.internal.http2.PushObserver
            public boolean onData(int i2, @NotNull BufferedSource bufferedSource, int i3, boolean z2) throws IOException {
                a.s(bufferedSource, "source");
                bufferedSource.skip(i3);
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onHeaders(int i2, @NotNull List<Header> list, boolean z2) {
                a.s(list, "responseHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onRequest(int i2, @NotNull List<Header> list) {
                a.s(list, "requestHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public void onReset(int i2, @NotNull ErrorCode errorCode) {
                a.s(errorCode, "errorCode");
            }
        }

        private Companion() {
        }
    }

    boolean onData(int i2, @NotNull BufferedSource bufferedSource, int i3, boolean z2) throws IOException;

    boolean onHeaders(int i2, @NotNull List<Header> list, boolean z2);

    boolean onRequest(int i2, @NotNull List<Header> list);

    void onReset(int i2, @NotNull ErrorCode errorCode);
}
