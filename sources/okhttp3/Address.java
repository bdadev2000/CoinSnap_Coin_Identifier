package okhttp3;

import android.support.v4.media.d;
import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import com.safedk.android.analytics.brandsafety.creatives.e;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes4.dex */
public final class Address {

    @Nullable
    private final CertificatePinner certificatePinner;

    @NotNull
    private final List<ConnectionSpec> connectionSpecs;

    @NotNull
    private final Dns dns;

    @Nullable
    private final HostnameVerifier hostnameVerifier;

    @NotNull
    private final List<Protocol> protocols;

    @Nullable
    private final Proxy proxy;

    @NotNull
    private final Authenticator proxyAuthenticator;

    @NotNull
    private final ProxySelector proxySelector;

    @NotNull
    private final SocketFactory socketFactory;

    @Nullable
    private final SSLSocketFactory sslSocketFactory;

    @NotNull
    private final HttpUrl url;

    public Address(@NotNull String str, int i2, @NotNull Dns dns, @NotNull SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable CertificatePinner certificatePinner, @NotNull Authenticator authenticator, @Nullable Proxy proxy, @NotNull List<? extends Protocol> list, @NotNull List<ConnectionSpec> list2, @NotNull ProxySelector proxySelector) {
        a.s(str, "uriHost");
        a.s(dns, "dns");
        a.s(socketFactory, "socketFactory");
        a.s(authenticator, "proxyAuthenticator");
        a.s(list, "protocols");
        a.s(list2, "connectionSpecs");
        a.s(proxySelector, "proxySelector");
        this.dns = dns;
        this.socketFactory = socketFactory;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = certificatePinner;
        this.proxyAuthenticator = authenticator;
        this.proxy = proxy;
        this.proxySelector = proxySelector;
        this.url = new HttpUrl.Builder().scheme(sSLSocketFactory != null ? TournamentShareDialogURIBuilder.scheme : e.e).host(str).port(i2).build();
        this.protocols = Util.toImmutableList(list);
        this.connectionSpecs = Util.toImmutableList(list2);
    }

    @d0.a
    @Nullable
    /* renamed from: -deprecated_certificatePinner, reason: not valid java name */
    public final CertificatePinner m630deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final List<ConnectionSpec> m631deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_dns, reason: not valid java name */
    public final Dns m632deprecated_dns() {
        return this.dns;
    }

    @d0.a
    @Nullable
    /* renamed from: -deprecated_hostnameVerifier, reason: not valid java name */
    public final HostnameVerifier m633deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_protocols, reason: not valid java name */
    public final List<Protocol> m634deprecated_protocols() {
        return this.protocols;
    }

    @d0.a
    @Nullable
    /* renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m635deprecated_proxy() {
        return this.proxy;
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_proxyAuthenticator, reason: not valid java name */
    public final Authenticator m636deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_proxySelector, reason: not valid java name */
    public final ProxySelector m637deprecated_proxySelector() {
        return this.proxySelector;
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_socketFactory, reason: not valid java name */
    public final SocketFactory m638deprecated_socketFactory() {
        return this.socketFactory;
    }

    @d0.a
    @Nullable
    /* renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final SSLSocketFactory m639deprecated_sslSocketFactory() {
        return this.sslSocketFactory;
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final HttpUrl m640deprecated_url() {
        return this.url;
    }

    @Nullable
    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    @NotNull
    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    @NotNull
    public final Dns dns() {
        return this.dns;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Address) {
            Address address = (Address) obj;
            if (a.g(this.url, address.url) && equalsNonHost$okhttp(address)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equalsNonHost$okhttp(@NotNull Address address) {
        a.s(address, "that");
        return a.g(this.dns, address.dns) && a.g(this.proxyAuthenticator, address.proxyAuthenticator) && a.g(this.protocols, address.protocols) && a.g(this.connectionSpecs, address.connectionSpecs) && a.g(this.proxySelector, address.proxySelector) && a.g(this.proxy, address.proxy) && a.g(this.sslSocketFactory, address.sslSocketFactory) && a.g(this.hostnameVerifier, address.hostnameVerifier) && a.g(this.certificatePinner, address.certificatePinner) && this.url.port() == address.url.port();
    }

    public int hashCode() {
        return Objects.hashCode(this.certificatePinner) + ((Objects.hashCode(this.hostnameVerifier) + ((Objects.hashCode(this.sslSocketFactory) + ((Objects.hashCode(this.proxy) + ((this.proxySelector.hashCode() + d.f(this.connectionSpecs, d.f(this.protocols, (this.proxyAuthenticator.hashCode() + ((this.dns.hashCode() + ((this.url.hashCode() + 527) * 31)) * 31)) * 31, 31), 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Nullable
    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @NotNull
    public final List<Protocol> protocols() {
        return this.protocols;
    }

    @Nullable
    public final Proxy proxy() {
        return this.proxy;
    }

    @NotNull
    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @NotNull
    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    @NotNull
    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    @Nullable
    public final SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder("Address{");
        sb2.append(this.url.host());
        sb2.append(':');
        sb2.append(this.url.port());
        sb2.append(", ");
        if (this.proxy != null) {
            sb = new StringBuilder("proxy=");
            obj = this.proxy;
        } else {
            sb = new StringBuilder("proxySelector=");
            obj = this.proxySelector;
        }
        sb.append(obj);
        return d.q(sb2, sb.toString(), '}');
    }

    @NotNull
    public final HttpUrl url() {
        return this.url;
    }
}
