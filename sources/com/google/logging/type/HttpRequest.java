package com.google.logging.type;

import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.Duration;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.H1;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.O3;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import u5.AbstractC2782a;
import u5.C2783b;

/* loaded from: classes2.dex */
public final class HttpRequest extends L2 implements O3 {
    public static final int CACHE_FILL_BYTES_FIELD_NUMBER = 12;
    public static final int CACHE_HIT_FIELD_NUMBER = 9;
    public static final int CACHE_LOOKUP_FIELD_NUMBER = 11;
    public static final int CACHE_VALIDATED_WITH_ORIGIN_SERVER_FIELD_NUMBER = 10;
    private static final HttpRequest DEFAULT_INSTANCE;
    public static final int LATENCY_FIELD_NUMBER = 14;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 15;
    public static final int REFERER_FIELD_NUMBER = 8;
    public static final int REMOTE_IP_FIELD_NUMBER = 7;
    public static final int REQUEST_METHOD_FIELD_NUMBER = 1;
    public static final int REQUEST_SIZE_FIELD_NUMBER = 3;
    public static final int REQUEST_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_SIZE_FIELD_NUMBER = 5;
    public static final int SERVER_IP_FIELD_NUMBER = 13;
    public static final int STATUS_FIELD_NUMBER = 4;
    public static final int USER_AGENT_FIELD_NUMBER = 6;
    private long cacheFillBytes_;
    private boolean cacheHit_;
    private boolean cacheLookup_;
    private boolean cacheValidatedWithOriginServer_;
    private Duration latency_;
    private long requestSize_;
    private long responseSize_;
    private int status_;
    private String requestMethod_ = "";
    private String requestUrl_ = "";
    private String userAgent_ = "";
    private String remoteIp_ = "";
    private String serverIp_ = "";
    private String referer_ = "";
    private String protocol_ = "";

    static {
        HttpRequest httpRequest = new HttpRequest();
        DEFAULT_INSTANCE = httpRequest;
        L2.registerDefaultInstance(HttpRequest.class, httpRequest);
    }

    private HttpRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCacheFillBytes() {
        this.cacheFillBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCacheHit() {
        this.cacheHit_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCacheLookup() {
        this.cacheLookup_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCacheValidatedWithOriginServer() {
        this.cacheValidatedWithOriginServer_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatency() {
        this.latency_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProtocol() {
        this.protocol_ = getDefaultInstance().getProtocol();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReferer() {
        this.referer_ = getDefaultInstance().getReferer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemoteIp() {
        this.remoteIp_ = getDefaultInstance().getRemoteIp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestMethod() {
        this.requestMethod_ = getDefaultInstance().getRequestMethod();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestSize() {
        this.requestSize_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestUrl() {
        this.requestUrl_ = getDefaultInstance().getRequestUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseSize() {
        this.responseSize_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerIp() {
        this.serverIp_ = getDefaultInstance().getServerIp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserAgent() {
        this.userAgent_ = getDefaultInstance().getUserAgent();
    }

    public static HttpRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLatency(Duration duration) {
        duration.getClass();
        Duration duration2 = this.latency_;
        if (duration2 != null && duration2 != Duration.getDefaultInstance()) {
            this.latency_ = (Duration) ((H1) Duration.newBuilder(this.latency_).mergeFrom((L2) duration)).buildPartial();
        } else {
            this.latency_ = duration;
        }
    }

    public static C2783b newBuilder() {
        return (C2783b) DEFAULT_INSTANCE.createBuilder();
    }

    public static HttpRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HttpRequest) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpRequest parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (HttpRequest) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCacheFillBytes(long j7) {
        this.cacheFillBytes_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCacheHit(boolean z8) {
        this.cacheHit_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCacheLookup(boolean z8) {
        this.cacheLookup_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCacheValidatedWithOriginServer(boolean z8) {
        this.cacheValidatedWithOriginServer_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatency(Duration duration) {
        duration.getClass();
        this.latency_ = duration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtocol(String str) {
        str.getClass();
        this.protocol_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtocolBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.protocol_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReferer(String str) {
        str.getClass();
        this.referer_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRefererBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.referer_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoteIp(String str) {
        str.getClass();
        this.remoteIp_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoteIpBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.remoteIp_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestMethod(String str) {
        str.getClass();
        this.requestMethod_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestMethodBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.requestMethod_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestSize(long j7) {
        this.requestSize_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestUrl(String str) {
        str.getClass();
        this.requestUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestUrlBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.requestUrl_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseSize(long j7) {
        this.responseSize_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerIp(String str) {
        str.getClass();
        this.serverIp_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerIpBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.serverIp_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(int i9) {
        this.status_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgent(String str) {
        str.getClass();
        this.userAgent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgentBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.userAgent_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC2782a.f23186a[k22.ordinal()]) {
            case 1:
                return new HttpRequest();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0004\u0005\u0002\u0006Ȉ\u0007Ȉ\bȈ\t\u0007\n\u0007\u000b\u0007\f\u0002\rȈ\u000e\t\u000fȈ", new Object[]{"requestMethod_", "requestUrl_", "requestSize_", "status_", "responseSize_", "userAgent_", "remoteIp_", "referer_", "cacheHit_", "cacheValidatedWithOriginServer_", "cacheLookup_", "cacheFillBytes_", "serverIp_", "latency_", "protocol_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (HttpRequest.class) {
                        try {
                            interfaceC1948l4 = PARSER;
                            if (interfaceC1948l4 == null) {
                                interfaceC1948l4 = new E2(DEFAULT_INSTANCE);
                                PARSER = interfaceC1948l4;
                            }
                        } finally {
                        }
                    }
                }
                return interfaceC1948l4;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public long getCacheFillBytes() {
        return this.cacheFillBytes_;
    }

    public boolean getCacheHit() {
        return this.cacheHit_;
    }

    public boolean getCacheLookup() {
        return this.cacheLookup_;
    }

    public boolean getCacheValidatedWithOriginServer() {
        return this.cacheValidatedWithOriginServer_;
    }

    public Duration getLatency() {
        Duration duration = this.latency_;
        if (duration == null) {
            return Duration.getDefaultInstance();
        }
        return duration;
    }

    public String getProtocol() {
        return this.protocol_;
    }

    public H getProtocolBytes() {
        return H.copyFromUtf8(this.protocol_);
    }

    public String getReferer() {
        return this.referer_;
    }

    public H getRefererBytes() {
        return H.copyFromUtf8(this.referer_);
    }

    public String getRemoteIp() {
        return this.remoteIp_;
    }

    public H getRemoteIpBytes() {
        return H.copyFromUtf8(this.remoteIp_);
    }

    public String getRequestMethod() {
        return this.requestMethod_;
    }

    public H getRequestMethodBytes() {
        return H.copyFromUtf8(this.requestMethod_);
    }

    public long getRequestSize() {
        return this.requestSize_;
    }

    public String getRequestUrl() {
        return this.requestUrl_;
    }

    public H getRequestUrlBytes() {
        return H.copyFromUtf8(this.requestUrl_);
    }

    public long getResponseSize() {
        return this.responseSize_;
    }

    public String getServerIp() {
        return this.serverIp_;
    }

    public H getServerIpBytes() {
        return H.copyFromUtf8(this.serverIp_);
    }

    public int getStatus() {
        return this.status_;
    }

    public String getUserAgent() {
        return this.userAgent_;
    }

    public H getUserAgentBytes() {
        return H.copyFromUtf8(this.userAgent_);
    }

    public boolean hasLatency() {
        if (this.latency_ != null) {
            return true;
        }
        return false;
    }

    public static C2783b newBuilder(HttpRequest httpRequest) {
        return (C2783b) DEFAULT_INSTANCE.createBuilder(httpRequest);
    }

    public static HttpRequest parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (HttpRequest) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static HttpRequest parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (HttpRequest) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static HttpRequest parseFrom(H h6) throws C1912g3 {
        return (HttpRequest) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static HttpRequest parseFrom(H h6, W1 w1) throws C1912g3 {
        return (HttpRequest) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static HttpRequest parseFrom(byte[] bArr) throws C1912g3 {
        return (HttpRequest) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HttpRequest parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (HttpRequest) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static HttpRequest parseFrom(InputStream inputStream) throws IOException {
        return (HttpRequest) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpRequest parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (HttpRequest) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static HttpRequest parseFrom(S s5) throws IOException {
        return (HttpRequest) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static HttpRequest parseFrom(S s5, W1 w1) throws IOException {
        return (HttpRequest) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
