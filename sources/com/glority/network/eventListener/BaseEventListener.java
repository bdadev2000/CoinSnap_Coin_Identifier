package com.glority.network.eventListener;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: BaseEventListener.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J0\u0010\u001a\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J:\u0010!\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J&\u0010\"\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001c\u0010#\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001c\u0010&\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J.\u0010'\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010(\u001a\u0004\u0018\u00010\r2\u0010\u0010)\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010+\u0018\u00010*H\u0016J\u001c\u0010,\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010(\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010-\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010.\u001a\u00020\u0004H\u0016J\u0012\u0010/\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001c\u00100\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0012\u00103\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u00104\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010.\u001a\u00020\u0004H\u0016J\u0012\u00105\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001c\u00106\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0012\u00109\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001c\u0010:\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0012\u0010=\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006>"}, d2 = {"Lcom/glority/network/eventListener/BaseEventListener;", "Lokhttp3/EventListener;", "()V", "callId", "", "getCallId$fwk_network_release", "()J", "setCallId$fwk_network_release", "(J)V", "isOpen", "", "()Z", "url", "", "getUrl$fwk_network_release", "()Ljava/lang/String;", "setUrl$fwk_network_release", "(Ljava/lang/String;)V", "callEnd", "", NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", "callFailed", "ioe", "Ljava/io/IOException;", "callStart", "connectEnd", "inetSocketAddress", "Ljava/net/InetSocketAddress;", "proxy", "Ljava/net/Proxy;", "protocol", "Lokhttp3/Protocol;", "connectFailed", "connectStart", "connectionAcquired", "connection", "Lokhttp3/Connection;", "connectionReleased", "dnsEnd", "domainName", "inetAddressList", "", "Ljava/net/InetAddress;", "dnsStart", "requestBodyEnd", "byteCount", "requestBodyStart", "requestHeadersEnd", "request", "Lokhttp3/Request;", "requestHeadersStart", "responseBodyEnd", "responseBodyStart", "responseHeadersEnd", "response", "Lokhttp3/Response;", "responseHeadersStart", "secureConnectEnd", "handshake", "Lokhttp3/Handshake;", "secureConnectStart", "fwk-network_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public abstract class BaseEventListener extends EventListener {
    private long callId;
    private String url = "";

    @Override // okhttp3.EventListener
    public void callEnd(Call call) {
    }

    @Override // okhttp3.EventListener
    public void callFailed(Call call, IOException ioe) {
    }

    @Override // okhttp3.EventListener
    public void callStart(Call call) {
    }

    @Override // okhttp3.EventListener
    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
    }

    @Override // okhttp3.EventListener
    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException ioe) {
    }

    @Override // okhttp3.EventListener
    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(Call call, Connection connection) {
    }

    @Override // okhttp3.EventListener
    public void connectionReleased(Call call, Connection connection) {
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(Call call, String domainName, List<? extends InetAddress> inetAddressList) {
    }

    @Override // okhttp3.EventListener
    public void dnsStart(Call call, String domainName) {
    }

    public abstract boolean isOpen();

    @Override // okhttp3.EventListener
    public void requestBodyEnd(Call call, long byteCount) {
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(Call call) {
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(Call call, Request request) {
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(Call call) {
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(Call call, long byteCount) {
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(Call call) {
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(Call call, Response response) {
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(Call call) {
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(Call call, Handshake handshake) {
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(Call call) {
    }

    /* renamed from: getCallId$fwk_network_release, reason: from getter */
    public final long getCallId() {
        return this.callId;
    }

    public final void setCallId$fwk_network_release(long j) {
        this.callId = j;
    }

    /* renamed from: getUrl$fwk_network_release, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final void setUrl$fwk_network_release(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }
}
