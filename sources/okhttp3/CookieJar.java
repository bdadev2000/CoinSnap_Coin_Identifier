package okhttp3;

import e0.w;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes2.dex */
public interface CookieJar {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @NotNull
    public static final CookieJar NO_COOKIES = new Companion.NoCookies();

    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* loaded from: classes2.dex */
        public static final class NoCookies implements CookieJar {
            @Override // okhttp3.CookieJar
            @NotNull
            public List<Cookie> loadForRequest(@NotNull HttpUrl httpUrl) {
                a.s(httpUrl, "url");
                return w.f30218a;
            }

            @Override // okhttp3.CookieJar
            public void saveFromResponse(@NotNull HttpUrl httpUrl, @NotNull List<Cookie> list) {
                a.s(httpUrl, "url");
                a.s(list, "cookies");
            }
        }

        private Companion() {
        }
    }

    @NotNull
    List<Cookie> loadForRequest(@NotNull HttpUrl httpUrl);

    void saveFromResponse(@NotNull HttpUrl httpUrl, @NotNull List<Cookie> list);
}
