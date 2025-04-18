package okhttp3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public interface Interceptor {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes2.dex */
    public interface Chain {
        @NotNull
        Call call();

        int connectTimeoutMillis();

        @Nullable
        Connection connection();

        @NotNull
        Response proceed(@NotNull Request request) throws IOException;

        int readTimeoutMillis();

        @NotNull
        Request request();

        @NotNull
        Chain withConnectTimeout(int i2, @NotNull TimeUnit timeUnit);

        @NotNull
        Chain withReadTimeout(int i2, @NotNull TimeUnit timeUnit);

        @NotNull
        Chain withWriteTimeout(int i2, @NotNull TimeUnit timeUnit);

        int writeTimeoutMillis();
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final Interceptor invoke(@NotNull final l lVar) {
            a.s(lVar, "block");
            return new Interceptor() { // from class: okhttp3.Interceptor$Companion$invoke$1
                @Override // okhttp3.Interceptor
                @NotNull
                public final Response intercept(@NotNull Interceptor.Chain chain) {
                    a.s(chain, "it");
                    return (Response) l.this.invoke(chain);
                }
            };
        }
    }

    @NotNull
    Response intercept(@NotNull Chain chain) throws IOException;
}
