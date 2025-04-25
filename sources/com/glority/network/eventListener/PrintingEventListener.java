package com.glority.network.eventListener;

import android.os.Bundle;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.route.network.GetTrackingAPIsRequest;
import com.glority.network.util.HttpState;
import com.glority.network.util.NetworkLogEvents;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: PrintingEventListener.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001c\u0010\u0018\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J0\u0010\u001c\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J:\u0010#\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J&\u0010$\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001c\u0010%\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u001c\u0010(\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J.\u0010)\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010*\u001a\u0004\u0018\u00010\u000e2\u0010\u0010+\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010,\u0018\u00010\u0010H\u0016J\u001c\u0010-\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010*\u001a\u0004\u0018\u00010\u000eH\u0016J,\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\u000e2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u00103\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u000eH\u0002J\u001a\u00105\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u00106\u001a\u00020\u0006H\u0016J\u0012\u00107\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001c\u00108\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\u0012\u0010;\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010<\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u00106\u001a\u00020\u0006H\u0016J\u0012\u0010=\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001c\u0010>\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u0012\u0010A\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001c\u0010B\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J\u0012\u0010E\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0007\u0010\tR\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\rX\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012¨\u0006F"}, d2 = {"Lcom/glority/network/eventListener/PrintingEventListener;", "Lcom/glority/network/eventListener/BaseEventListener;", "()V", "bd", "Landroid/os/Bundle;", "callStartNanos", "", "isOpen", "", "()Z", "isOpen$delegate", "Lkotlin/Lazy;", "timestampMap", "", "", "trackingAPIUrls", "", "getTrackingAPIUrls", "()Ljava/util/List;", "trackingAPIUrls$delegate", "callEnd", "", NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", "callFailed", "ioe", "Ljava/io/IOException;", "callStart", "connectEnd", "inetSocketAddress", "Ljava/net/InetSocketAddress;", "proxy", "Ljava/net/Proxy;", "protocol", "Lokhttp3/Protocol;", "connectFailed", "connectStart", "connectionAcquired", "connection", "Lokhttp3/Connection;", "connectionReleased", "dnsEnd", "domainName", "inetAddressList", "Ljava/net/InetAddress;", "dnsStart", "logEventIfNeeded", "startKey", "endKey", "eventArgKey", "state", "printEvent", "name", "requestBodyEnd", "byteCount", "requestBodyStart", "requestHeadersEnd", "request", "Lokhttp3/Request;", "requestHeadersStart", "responseBodyEnd", "responseBodyStart", "responseHeadersEnd", "response", "Lokhttp3/Response;", "responseHeadersStart", "secureConnectEnd", "handshake", "Lokhttp3/Handshake;", "secureConnectStart", "fwk-network_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public final class PrintingEventListener extends BaseEventListener {
    private long callStartNanos;
    private final Map<String, Long> timestampMap = new LinkedHashMap();
    private final Bundle bd = new Bundle();

    /* renamed from: trackingAPIUrls$delegate, reason: from kotlin metadata */
    private final Lazy trackingAPIUrls = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<List<? extends String>>() { // from class: com.glority.network.eventListener.PrintingEventListener$trackingAPIUrls$2
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends String> invoke() {
            List<? extends String> result = new GetTrackingAPIsRequest().toResult();
            return result == null ? CollectionsKt.emptyList() : result;
        }
    });

    /* renamed from: isOpen$delegate, reason: from kotlin metadata */
    private final Lazy isOpen = LazyKt.lazy(new Function0<Boolean>() { // from class: com.glority.network.eventListener.PrintingEventListener$isOpen$2
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            List trackingAPIUrls;
            trackingAPIUrls = PrintingEventListener.this.getTrackingAPIUrls();
            PrintingEventListener printingEventListener = PrintingEventListener.this;
            Iterator it = trackingAPIUrls.iterator();
            while (it.hasNext()) {
                if (StringsKt.contains$default((CharSequence) printingEventListener.getUrl(), (CharSequence) it.next(), false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public final List<String> getTrackingAPIUrls() {
        return (List) this.trackingAPIUrls.getValue();
    }

    private final void printEvent(String name) {
        long nanoTime = System.nanoTime() - this.callStartNanos;
        this.timestampMap.put(name, Long.valueOf(nanoTime));
        System.out.printf("%04d %.3f %s%n", Long.valueOf(getCallId()), Double.valueOf(nanoTime / 1.0E9d), name);
    }

    static /* synthetic */ void logEventIfNeeded$default(PrintingEventListener printingEventListener, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        printingEventListener.logEventIfNeeded(str, str2, str3, str4);
    }

    private final void logEventIfNeeded(String startKey, String endKey, String eventArgKey, String state) {
        if (isOpen()) {
            Long l = this.timestampMap.get(startKey);
            Long l2 = this.timestampMap.get(endKey);
            if (l != null && l2 != null) {
                this.bd.putDouble(eventArgKey, (l2.longValue() - l.longValue()) / 1.0E9d);
            }
            if (state != null) {
                this.bd.putString("status", state);
            }
            if (Intrinsics.areEqual(endKey, "callEnd") || Intrinsics.areEqual(endKey, "callFailed")) {
                this.bd.putString("id", getUrl());
                Log.d("PrintingEventListener", endKey + ": " + this.bd);
                new LogEventRequest(NetworkLogEvents.API_WORKFLOW_TIME, this.bd).post();
            }
        }
    }

    @Override // com.glority.network.eventListener.BaseEventListener
    public boolean isOpen() {
        return ((Boolean) this.isOpen.getValue()).booleanValue();
    }

    @Override // com.glority.network.eventListener.BaseEventListener, okhttp3.EventListener
    public void callStart(Call call) {
        this.callStartNanos = System.nanoTime();
        printEvent("callStart");
    }

    @Override // com.glority.network.eventListener.BaseEventListener, okhttp3.EventListener
    public void dnsStart(Call call, String domainName) {
        printEvent("dnsStart");
    }

    @Override // com.glority.network.eventListener.BaseEventListener, okhttp3.EventListener
    public void dnsEnd(Call call, String domainName, List<? extends InetAddress> inetAddressList) {
        printEvent("dnsEnd");
        logEventIfNeeded$default(this, "dnsStart", "dnsEnd", "double1", null, 8, null);
    }

    @Override // com.glority.network.eventListener.BaseEventListener, okhttp3.EventListener
    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        printEvent("connectStart");
    }

    @Override // com.glority.network.eventListener.BaseEventListener, okhttp3.EventListener
    public void secureConnectStart(Call call) {
        printEvent("secureConnectStart");
    }

    @Override // com.glority.network.eventListener.BaseEventListener, okhttp3.EventListener
    public void secureConnectEnd(Call call, Handshake handshake) {
        printEvent("secureConnectEnd");
    }

    @Override // com.glority.network.eventListener.BaseEventListener, okhttp3.EventListener
    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        printEvent("connectEnd");
    }

    @Override // com.glority.network.eventListener.BaseEventListener, okhttp3.EventListener
    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException ioe) {
        printEvent("connectFailed");
    }

    @Override // com.glority.network.eventListener.BaseEventListener, okhttp3.EventListener
    public void connectionAcquired(Call call, Connection connection) {
        printEvent("connectionAcquired");
        logEventIfNeeded$default(this, "callStart", "connectionAcquired", "double2", null, 8, null);
    }

    @Override // com.glority.network.eventListener.BaseEventListener, okhttp3.EventListener
    public void connectionReleased(Call call, Connection connection) {
        printEvent("connectReleased");
    }

    @Override // com.glority.network.eventListener.BaseEventListener, okhttp3.EventListener
    public void requestHeadersStart(Call call) {
        printEvent("requestHeadersStart");
    }

    @Override // com.glority.network.eventListener.BaseEventListener, okhttp3.EventListener
    public void requestHeadersEnd(Call call, Request request) {
        printEvent("requestHeadersEnd");
    }

    @Override // com.glority.network.eventListener.BaseEventListener, okhttp3.EventListener
    public void requestBodyStart(Call call) {
        printEvent("requestBodyStart");
    }

    @Override // com.glority.network.eventListener.BaseEventListener, okhttp3.EventListener
    public void requestBodyEnd(Call call, long byteCount) {
        printEvent("requestBodyEnd");
    }

    @Override // com.glority.network.eventListener.BaseEventListener, okhttp3.EventListener
    public void responseHeadersStart(Call call) {
        printEvent("responseHeadersStart");
    }

    @Override // com.glority.network.eventListener.BaseEventListener, okhttp3.EventListener
    public void responseHeadersEnd(Call call, Response response) {
        printEvent("responseHeadersEnd");
        logEventIfNeeded$default(this, "responseHeadersStart", "responseHeadersEnd", "double3", null, 8, null);
    }

    @Override // com.glority.network.eventListener.BaseEventListener, okhttp3.EventListener
    public void responseBodyStart(Call call) {
        printEvent("responseBodyStart");
    }

    @Override // com.glority.network.eventListener.BaseEventListener, okhttp3.EventListener
    public void responseBodyEnd(Call call, long byteCount) {
        printEvent("responseBodyEnd");
        logEventIfNeeded$default(this, "responseBodyStart", "responseBodyEnd", "double4", null, 8, null);
    }

    @Override // com.glority.network.eventListener.BaseEventListener, okhttp3.EventListener
    public void callEnd(Call call) {
        printEvent("callEnd");
        logEventIfNeeded("callStart", "callEnd", "time", "success");
    }

    @Override // com.glority.network.eventListener.BaseEventListener, okhttp3.EventListener
    public void callFailed(Call call, IOException ioe) {
        printEvent("callFailed");
        String str = HttpState.TIMEOUT;
        boolean z = false;
        if (ioe != null) {
            System.out.printf("callFailed. ioe: %s", ioe.getMessage());
            if (ioe.getMessage() != null) {
                String message = ioe.getMessage();
                Intrinsics.checkNotNull(message);
                if (StringsKt.contains$default((CharSequence) message, (CharSequence) HttpState.TIMEOUT, false, 2, (Object) null)) {
                    z = true;
                }
            }
        }
        if (!z) {
            str = HttpState.FAIL;
        }
        logEventIfNeeded("callStart", "callFailed", "time", str);
    }
}
