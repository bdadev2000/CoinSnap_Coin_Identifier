package com.glority.network.eventListener;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: EventListenerFactory.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u001b\u0012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u001c\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/glority/network/eventListener/EventListenerFactory;", "Lokhttp3/EventListener$Factory;", "listeners", "", "Ljava/lang/Class;", "Lcom/glority/network/eventListener/BaseEventListener;", "(Ljava/util/Set;)V", "create", "Lokhttp3/EventListener;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", "Companion", "DispatcherEventListener", "fwk-network_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public final class EventListenerFactory implements EventListener.Factory {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final AtomicLong nextCallId = new AtomicLong(1);
    private final Set<Class<? extends BaseEventListener>> listeners;

    /* compiled from: EventListenerFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/network/eventListener/EventListenerFactory$Companion;", "", "()V", "nextCallId", "Ljava/util/concurrent/atomic/AtomicLong;", "getNextCallId", "()Ljava/util/concurrent/atomic/AtomicLong;", "fwk-network_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AtomicLong getNextCallId() {
            return EventListenerFactory.nextCallId;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EventListenerFactory(Set<? extends Class<? extends BaseEventListener>> listeners) {
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        this.listeners = listeners;
    }

    @Override // okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        long andIncrement = nextCallId.getAndIncrement();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Class<? extends BaseEventListener>> it = this.listeners.iterator();
        while (it.hasNext()) {
            BaseEventListener newInstance = it.next().newInstance();
            newInstance.setCallId$fwk_network_release(andIncrement);
            String httpUrl = call.request().url().toString();
            Intrinsics.checkNotNullExpressionValue(httpUrl, "toString(...)");
            newInstance.setUrl$fwk_network_release(httpUrl);
            Intrinsics.checkNotNull(newInstance);
            linkedHashSet.add(newInstance);
        }
        return new DispatcherEventListener(linkedHashSet);
    }

    /* compiled from: EventListenerFactory.kt */
    @Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J0\u0010\u0010\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J:\u0010\u0017\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J&\u0010\u0018\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001c\u0010\u0019\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001c\u0010\u001c\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J.\u0010\u001d\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0010\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\"\u0018\u00010!H\u0016J\u001c\u0010#\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010$\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010%\u001a\u00020&H\u0016J\u0012\u0010'\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010(\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0012\u0010+\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010,\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010%\u001a\u00020&H\u0016J\u0012\u0010-\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010.\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0012\u00101\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u00102\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0012\u00105\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u00066"}, d2 = {"Lcom/glority/network/eventListener/EventListenerFactory$DispatcherEventListener;", "Lokhttp3/EventListener;", "listeners", "", "Lcom/glority/network/eventListener/BaseEventListener;", "(Ljava/util/Set;)V", "getListeners", "()Ljava/util/Set;", "callEnd", "", NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", "callFailed", "ioe", "Ljava/io/IOException;", "callStart", "connectEnd", "inetSocketAddress", "Ljava/net/InetSocketAddress;", "proxy", "Ljava/net/Proxy;", "protocol", "Lokhttp3/Protocol;", "connectFailed", "connectStart", "connectionAcquired", "connection", "Lokhttp3/Connection;", "connectionReleased", "dnsEnd", "domainName", "", "inetAddressList", "", "Ljava/net/InetAddress;", "dnsStart", "requestBodyEnd", "byteCount", "", "requestBodyStart", "requestHeadersEnd", "request", "Lokhttp3/Request;", "requestHeadersStart", "responseBodyEnd", "responseBodyStart", "responseHeadersEnd", "response", "Lokhttp3/Response;", "responseHeadersStart", "secureConnectEnd", "handshake", "Lokhttp3/Handshake;", "secureConnectStart", "fwk-network_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes9.dex */
    public static final class DispatcherEventListener extends EventListener {
        private final Set<BaseEventListener> listeners;

        public final Set<BaseEventListener> getListeners() {
            return this.listeners;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DispatcherEventListener(Set<? extends BaseEventListener> listeners) {
            Intrinsics.checkNotNullParameter(listeners, "listeners");
            this.listeners = listeners;
        }

        @Override // okhttp3.EventListener
        public void callStart(Call call) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((BaseEventListener) it.next()).callStart(call);
            }
        }

        @Override // okhttp3.EventListener
        public void dnsStart(Call call, String domainName) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((BaseEventListener) it.next()).dnsStart(call, domainName);
            }
        }

        @Override // okhttp3.EventListener
        public void dnsEnd(Call call, String domainName, List<? extends InetAddress> inetAddressList) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((BaseEventListener) it.next()).dnsEnd(call, domainName, inetAddressList);
            }
        }

        @Override // okhttp3.EventListener
        public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((BaseEventListener) it.next()).connectStart(call, inetSocketAddress, proxy);
            }
        }

        @Override // okhttp3.EventListener
        public void secureConnectStart(Call call) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((BaseEventListener) it.next()).secureConnectStart(call);
            }
        }

        @Override // okhttp3.EventListener
        public void secureConnectEnd(Call call, Handshake handshake) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((BaseEventListener) it.next()).secureConnectEnd(call, handshake);
            }
        }

        @Override // okhttp3.EventListener
        public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((BaseEventListener) it.next()).connectEnd(call, inetSocketAddress, proxy, protocol);
            }
        }

        @Override // okhttp3.EventListener
        public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException ioe) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((BaseEventListener) it.next()).connectFailed(call, inetSocketAddress, proxy, protocol, ioe);
            }
        }

        @Override // okhttp3.EventListener
        public void connectionAcquired(Call call, Connection connection) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((BaseEventListener) it.next()).connectionAcquired(call, connection);
            }
        }

        @Override // okhttp3.EventListener
        public void connectionReleased(Call call, Connection connection) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((BaseEventListener) it.next()).connectionReleased(call, connection);
            }
        }

        @Override // okhttp3.EventListener
        public void requestHeadersStart(Call call) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((BaseEventListener) it.next()).requestHeadersStart(call);
            }
        }

        @Override // okhttp3.EventListener
        public void requestHeadersEnd(Call call, Request request) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((BaseEventListener) it.next()).requestHeadersEnd(call, request);
            }
        }

        @Override // okhttp3.EventListener
        public void requestBodyStart(Call call) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((BaseEventListener) it.next()).requestBodyStart(call);
            }
        }

        @Override // okhttp3.EventListener
        public void requestBodyEnd(Call call, long byteCount) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((BaseEventListener) it.next()).requestBodyEnd(call, byteCount);
            }
        }

        @Override // okhttp3.EventListener
        public void responseHeadersStart(Call call) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((BaseEventListener) it.next()).responseHeadersStart(call);
            }
        }

        @Override // okhttp3.EventListener
        public void responseHeadersEnd(Call call, Response response) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((BaseEventListener) it.next()).responseHeadersEnd(call, response);
            }
        }

        @Override // okhttp3.EventListener
        public void responseBodyStart(Call call) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((BaseEventListener) it.next()).responseBodyStart(call);
            }
        }

        @Override // okhttp3.EventListener
        public void responseBodyEnd(Call call, long byteCount) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((BaseEventListener) it.next()).responseBodyEnd(call, byteCount);
            }
        }

        @Override // okhttp3.EventListener
        public void callEnd(Call call) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((BaseEventListener) it.next()).callEnd(call);
            }
        }

        @Override // okhttp3.EventListener
        public void callFailed(Call call, IOException ioe) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((BaseEventListener) it.next()).callFailed(call, ioe);
            }
        }
    }
}
