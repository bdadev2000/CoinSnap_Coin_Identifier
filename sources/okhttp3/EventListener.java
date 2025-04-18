package okhttp3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes2.dex */
public abstract class EventListener {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final EventListener NONE = new EventListener() { // from class: okhttp3.EventListener$Companion$NONE$1
    };

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public interface Factory {
        @NotNull
        EventListener create(@NotNull Call call);
    }

    public void cacheConditionalHit(@NotNull Call call, @NotNull Response response) {
        a.s(call, "call");
        a.s(response, "cachedResponse");
    }

    public void cacheHit(@NotNull Call call, @NotNull Response response) {
        a.s(call, "call");
        a.s(response, "response");
    }

    public void cacheMiss(@NotNull Call call) {
        a.s(call, "call");
    }

    public void callEnd(@NotNull Call call) {
        a.s(call, "call");
    }

    public void callFailed(@NotNull Call call, @NotNull IOException iOException) {
        a.s(call, "call");
        a.s(iOException, "ioe");
    }

    public void callStart(@NotNull Call call) {
        a.s(call, "call");
    }

    public void canceled(@NotNull Call call) {
        a.s(call, "call");
    }

    public void connectEnd(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol) {
        a.s(call, "call");
        a.s(inetSocketAddress, "inetSocketAddress");
        a.s(proxy, "proxy");
    }

    public void connectFailed(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol, @NotNull IOException iOException) {
        a.s(call, "call");
        a.s(inetSocketAddress, "inetSocketAddress");
        a.s(proxy, "proxy");
        a.s(iOException, "ioe");
    }

    public void connectStart(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        a.s(call, "call");
        a.s(inetSocketAddress, "inetSocketAddress");
        a.s(proxy, "proxy");
    }

    public void connectionAcquired(@NotNull Call call, @NotNull Connection connection) {
        a.s(call, "call");
        a.s(connection, "connection");
    }

    public void connectionReleased(@NotNull Call call, @NotNull Connection connection) {
        a.s(call, "call");
        a.s(connection, "connection");
    }

    public void dnsEnd(@NotNull Call call, @NotNull String str, @NotNull List<InetAddress> list) {
        a.s(call, "call");
        a.s(str, "domainName");
        a.s(list, "inetAddressList");
    }

    public void dnsStart(@NotNull Call call, @NotNull String str) {
        a.s(call, "call");
        a.s(str, "domainName");
    }

    public void proxySelectEnd(@NotNull Call call, @NotNull HttpUrl httpUrl, @NotNull List<Proxy> list) {
        a.s(call, "call");
        a.s(httpUrl, "url");
        a.s(list, "proxies");
    }

    public void proxySelectStart(@NotNull Call call, @NotNull HttpUrl httpUrl) {
        a.s(call, "call");
        a.s(httpUrl, "url");
    }

    public void requestBodyEnd(@NotNull Call call, long j2) {
        a.s(call, "call");
    }

    public void requestBodyStart(@NotNull Call call) {
        a.s(call, "call");
    }

    public void requestFailed(@NotNull Call call, @NotNull IOException iOException) {
        a.s(call, "call");
        a.s(iOException, "ioe");
    }

    public void requestHeadersEnd(@NotNull Call call, @NotNull Request request) {
        a.s(call, "call");
        a.s(request, "request");
    }

    public void requestHeadersStart(@NotNull Call call) {
        a.s(call, "call");
    }

    public void responseBodyEnd(@NotNull Call call, long j2) {
        a.s(call, "call");
    }

    public void responseBodyStart(@NotNull Call call) {
        a.s(call, "call");
    }

    public void responseFailed(@NotNull Call call, @NotNull IOException iOException) {
        a.s(call, "call");
        a.s(iOException, "ioe");
    }

    public void responseHeadersEnd(@NotNull Call call, @NotNull Response response) {
        a.s(call, "call");
        a.s(response, "response");
    }

    public void responseHeadersStart(@NotNull Call call) {
        a.s(call, "call");
    }

    public void satisfactionFailure(@NotNull Call call, @NotNull Response response) {
        a.s(call, "call");
        a.s(response, "response");
    }

    public void secureConnectEnd(@NotNull Call call, @Nullable Handshake handshake) {
        a.s(call, "call");
    }

    public void secureConnectStart(@NotNull Call call) {
        a.s(call, "call");
    }
}
