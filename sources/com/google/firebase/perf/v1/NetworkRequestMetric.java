package com.google.firebase.perf.v1;

import androidx.core.app.NotificationCompat;
import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.G3;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1891d3;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.O3;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import i5.C2354i;
import i5.G;
import i5.v;
import i5.w;
import i5.x;
import i5.y;
import i5.z;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class NetworkRequestMetric extends L2 implements O3 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final NetworkRequestMetric DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private G3 customAttributes_ = G3.emptyMapField();
    private String url_ = "";
    private String responseContentType_ = "";
    private InterfaceC1891d3 perfSessions_ = L2.emptyProtobufList();

    static {
        NetworkRequestMetric networkRequestMetric = new NetworkRequestMetric();
        DEFAULT_INSTANCE = networkRequestMetric;
        L2.registerDefaultInstance(NetworkRequestMetric.class, networkRequestMetric);
    }

    private NetworkRequestMetric() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPerfSessions(Iterable<? extends PerfSession> iterable) {
        ensurePerfSessionsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPerfSessions(PerfSession perfSession) {
        perfSession.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.add(perfSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientStartTimeUs() {
        this.bitField0_ &= -129;
        this.clientStartTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttpMethod() {
        this.bitField0_ &= -3;
        this.httpMethod_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttpResponseCode() {
        this.bitField0_ &= -33;
        this.httpResponseCode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkClientErrorReason() {
        this.bitField0_ &= -17;
        this.networkClientErrorReason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPerfSessions() {
        this.perfSessions_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestPayloadBytes() {
        this.bitField0_ &= -5;
        this.requestPayloadBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseContentType() {
        this.bitField0_ &= -65;
        this.responseContentType_ = getDefaultInstance().getResponseContentType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponsePayloadBytes() {
        this.bitField0_ &= -9;
        this.responsePayloadBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeToRequestCompletedUs() {
        this.bitField0_ &= -257;
        this.timeToRequestCompletedUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeToResponseCompletedUs() {
        this.bitField0_ &= -1025;
        this.timeToResponseCompletedUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeToResponseInitiatedUs() {
        this.bitField0_ &= -513;
        this.timeToResponseInitiatedUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.bitField0_ &= -2;
        this.url_ = getDefaultInstance().getUrl();
    }

    private void ensurePerfSessionsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.perfSessions_;
        if (!interfaceC1891d3.isModifiable()) {
            this.perfSessions_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static NetworkRequestMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableCustomAttributesMap() {
        return internalGetMutableCustomAttributes();
    }

    private G3 internalGetCustomAttributes() {
        return this.customAttributes_;
    }

    private G3 internalGetMutableCustomAttributes() {
        if (!this.customAttributes_.isMutable()) {
            this.customAttributes_ = this.customAttributes_.mutableCopy();
        }
        return this.customAttributes_;
    }

    public static w newBuilder() {
        return (w) DEFAULT_INSTANCE.createBuilder();
    }

    public static NetworkRequestMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NetworkRequestMetric) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NetworkRequestMetric parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (NetworkRequestMetric) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePerfSessions(int i9) {
        ensurePerfSessionsIsMutable();
        this.perfSessions_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientStartTimeUs(long j7) {
        this.bitField0_ |= 128;
        this.clientStartTimeUs_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttpMethod(y yVar) {
        this.httpMethod_ = yVar.b;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttpResponseCode(int i9) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkClientErrorReason(z zVar) {
        this.networkClientErrorReason_ = zVar.b;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPerfSessions(int i9, PerfSession perfSession) {
        perfSession.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.set(i9, perfSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestPayloadBytes(long j7) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseContentType(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseContentTypeBytes(H h6) {
        this.responseContentType_ = h6.toStringUtf8();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponsePayloadBytes(long j7) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToRequestCompletedUs(long j7) {
        this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
        this.timeToRequestCompletedUs_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToResponseCompletedUs(long j7) {
        this.bitField0_ |= 1024;
        this.timeToResponseCompletedUs_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToResponseInitiatedUs(long j7) {
        this.bitField0_ |= 512;
        this.timeToResponseInitiatedUs_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(H h6) {
        this.url_ = h6.toStringUtf8();
        this.bitField0_ |= 1;
    }

    public boolean containsCustomAttributes(String str) {
        str.getClass();
        return internalGetCustomAttributes().containsKey(str);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (v.f20728a[k22.ordinal()]) {
            case 1:
                return new NetworkRequestMetric();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဌ\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", C2354i.f20676e, "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", C2354i.f20677f, "customAttributes_", x.f20729a, "perfSessions_", PerfSession.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (NetworkRequestMetric.class) {
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

    public long getClientStartTimeUs() {
        return this.clientStartTimeUs_;
    }

    @Deprecated
    public Map<String, String> getCustomAttributes() {
        return getCustomAttributesMap();
    }

    public int getCustomAttributesCount() {
        return internalGetCustomAttributes().size();
    }

    public Map<String, String> getCustomAttributesMap() {
        return Collections.unmodifiableMap(internalGetCustomAttributes());
    }

    public String getCustomAttributesOrDefault(String str, String str2) {
        str.getClass();
        G3 internalGetCustomAttributes = internalGetCustomAttributes();
        if (internalGetCustomAttributes.containsKey(str)) {
            return (String) internalGetCustomAttributes.get(str);
        }
        return str2;
    }

    public String getCustomAttributesOrThrow(String str) {
        str.getClass();
        G3 internalGetCustomAttributes = internalGetCustomAttributes();
        if (internalGetCustomAttributes.containsKey(str)) {
            return (String) internalGetCustomAttributes.get(str);
        }
        throw new IllegalArgumentException();
    }

    public y getHttpMethod() {
        y a6 = y.a(this.httpMethod_);
        if (a6 == null) {
            return y.HTTP_METHOD_UNKNOWN;
        }
        return a6;
    }

    public int getHttpResponseCode() {
        return this.httpResponseCode_;
    }

    public z getNetworkClientErrorReason() {
        z zVar;
        int i9 = this.networkClientErrorReason_;
        z zVar2 = z.NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
        if (i9 != 0) {
            if (i9 != 1) {
                zVar = null;
            } else {
                zVar = z.GENERIC_CLIENT_ERROR;
            }
        } else {
            zVar = zVar2;
        }
        if (zVar != null) {
            return zVar;
        }
        return zVar2;
    }

    public PerfSession getPerfSessions(int i9) {
        return (PerfSession) this.perfSessions_.get(i9);
    }

    public int getPerfSessionsCount() {
        return this.perfSessions_.size();
    }

    public List<PerfSession> getPerfSessionsList() {
        return this.perfSessions_;
    }

    public G getPerfSessionsOrBuilder(int i9) {
        return (G) this.perfSessions_.get(i9);
    }

    public List<? extends G> getPerfSessionsOrBuilderList() {
        return this.perfSessions_;
    }

    public long getRequestPayloadBytes() {
        return this.requestPayloadBytes_;
    }

    public String getResponseContentType() {
        return this.responseContentType_;
    }

    public H getResponseContentTypeBytes() {
        return H.copyFromUtf8(this.responseContentType_);
    }

    public long getResponsePayloadBytes() {
        return this.responsePayloadBytes_;
    }

    public long getTimeToRequestCompletedUs() {
        return this.timeToRequestCompletedUs_;
    }

    public long getTimeToResponseCompletedUs() {
        return this.timeToResponseCompletedUs_;
    }

    public long getTimeToResponseInitiatedUs() {
        return this.timeToResponseInitiatedUs_;
    }

    public String getUrl() {
        return this.url_;
    }

    public H getUrlBytes() {
        return H.copyFromUtf8(this.url_);
    }

    public boolean hasClientStartTimeUs() {
        if ((this.bitField0_ & 128) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasHttpMethod() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasHttpResponseCode() {
        if ((this.bitField0_ & 32) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasNetworkClientErrorReason() {
        if ((this.bitField0_ & 16) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasRequestPayloadBytes() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasResponseContentType() {
        if ((this.bitField0_ & 64) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasResponsePayloadBytes() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasTimeToRequestCompletedUs() {
        if ((this.bitField0_ & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasTimeToResponseCompletedUs() {
        if ((this.bitField0_ & 1024) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasTimeToResponseInitiatedUs() {
        if ((this.bitField0_ & 512) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasUrl() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    public static w newBuilder(NetworkRequestMetric networkRequestMetric) {
        return (w) DEFAULT_INSTANCE.createBuilder(networkRequestMetric);
    }

    public static NetworkRequestMetric parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (NetworkRequestMetric) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static NetworkRequestMetric parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (NetworkRequestMetric) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static NetworkRequestMetric parseFrom(H h6) throws C1912g3 {
        return (NetworkRequestMetric) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPerfSessions(int i9, PerfSession perfSession) {
        perfSession.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.add(i9, perfSession);
    }

    public static NetworkRequestMetric parseFrom(H h6, W1 w1) throws C1912g3 {
        return (NetworkRequestMetric) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static NetworkRequestMetric parseFrom(byte[] bArr) throws C1912g3 {
        return (NetworkRequestMetric) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NetworkRequestMetric parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (NetworkRequestMetric) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static NetworkRequestMetric parseFrom(InputStream inputStream) throws IOException {
        return (NetworkRequestMetric) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NetworkRequestMetric parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (NetworkRequestMetric) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static NetworkRequestMetric parseFrom(S s5) throws IOException {
        return (NetworkRequestMetric) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static NetworkRequestMetric parseFrom(S s5, W1 w1) throws IOException {
        return (NetworkRequestMetric) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
