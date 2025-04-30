package com.vungle.ads.internal.protos;

import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1912g3;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class Sdk$SDKError extends L2 implements j {
    public static final int AT_FIELD_NUMBER = 1;
    public static final int CONNECTIONTYPEDETAILANDROID_FIELD_NUMBER = 101;
    public static final int CONNECTIONTYPEDETAIL_FIELD_NUMBER = 10;
    public static final int CONNECTIONTYPE_FIELD_NUMBER = 9;
    public static final int CREATIVEID_FIELD_NUMBER = 12;
    private static final Sdk$SDKError DEFAULT_INSTANCE;
    public static final int EVENTID_FIELD_NUMBER = 4;
    public static final int MAKE_FIELD_NUMBER = 5;
    public static final int MESSAGE_FIELD_NUMBER = 3;
    public static final int MODEL_FIELD_NUMBER = 6;
    public static final int OSVERSION_FIELD_NUMBER = 8;
    public static final int OS_FIELD_NUMBER = 7;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int PLACEMENTREFERENCEID_FIELD_NUMBER = 11;
    public static final int REASON_FIELD_NUMBER = 2;
    public static final int SESSIONID_FIELD_NUMBER = 13;
    private long at_;
    private int reason_;
    private String message_ = "";
    private String eventId_ = "";
    private String make_ = "";
    private String model_ = "";
    private String os_ = "";
    private String osVersion_ = "";
    private String connectionType_ = "";
    private String connectionTypeDetail_ = "";
    private String placementReferenceId_ = "";
    private String creativeId_ = "";
    private String sessionId_ = "";
    private String connectionTypeDetailAndroid_ = "";

    static {
        Sdk$SDKError sdk$SDKError = new Sdk$SDKError();
        DEFAULT_INSTANCE = sdk$SDKError;
        L2.registerDefaultInstance(Sdk$SDKError.class, sdk$SDKError);
    }

    private Sdk$SDKError() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAt() {
        this.at_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectionType() {
        this.connectionType_ = getDefaultInstance().getConnectionType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectionTypeDetail() {
        this.connectionTypeDetail_ = getDefaultInstance().getConnectionTypeDetail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectionTypeDetailAndroid() {
        this.connectionTypeDetailAndroid_ = getDefaultInstance().getConnectionTypeDetailAndroid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreativeId() {
        this.creativeId_ = getDefaultInstance().getCreativeId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventId() {
        this.eventId_ = getDefaultInstance().getEventId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMake() {
        this.make_ = getDefaultInstance().getMake();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModel() {
        this.model_ = getDefaultInstance().getModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOs() {
        this.os_ = getDefaultInstance().getOs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsVersion() {
        this.osVersion_ = getDefaultInstance().getOsVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlacementReferenceId() {
        this.placementReferenceId_ = getDefaultInstance().getPlacementReferenceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.reason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    public static Sdk$SDKError getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static d newBuilder() {
        return (d) DEFAULT_INSTANCE.createBuilder();
    }

    public static Sdk$SDKError parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Sdk$SDKError) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$SDKError parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Sdk$SDKError) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAt(long j7) {
        this.at_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionType(String str) {
        str.getClass();
        this.connectionType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionTypeBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.connectionType_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionTypeDetail(String str) {
        str.getClass();
        this.connectionTypeDetail_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionTypeDetailAndroid(String str) {
        str.getClass();
        this.connectionTypeDetailAndroid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionTypeDetailAndroidBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.connectionTypeDetailAndroid_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionTypeDetailBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.connectionTypeDetail_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreativeId(String str) {
        str.getClass();
        this.creativeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreativeIdBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.creativeId_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventId(String str) {
        str.getClass();
        this.eventId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventIdBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.eventId_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMake(String str) {
        str.getClass();
        this.make_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMakeBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.make_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.message_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModel(String str) {
        str.getClass();
        this.model_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModelBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.model_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOs(String str) {
        str.getClass();
        this.os_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.os_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersion(String str) {
        str.getClass();
        this.osVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersionBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.osVersion_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlacementReferenceId(String str) {
        str.getClass();
        this.placementReferenceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlacementReferenceIdBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.placementReferenceId_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(g gVar) {
        this.reason_ = gVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonValue(int i9) {
        this.reason_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.sessionId_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        a aVar = null;
        switch (a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new Sdk$SDKError();
            case 2:
                return new d(aVar);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0000\u0001e\u000e\u0000\u0000\u0000\u0001\u0002\u0002\f\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\fȈ\rȈeȈ", new Object[]{"at_", "reason_", "message_", "eventId_", "make_", "model_", "os_", "osVersion_", "connectionType_", "connectionTypeDetail_", "placementReferenceId_", "creativeId_", "sessionId_", "connectionTypeDetailAndroid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Sdk$SDKError.class) {
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

    @Override // com.vungle.ads.internal.protos.j
    public long getAt() {
        return this.at_;
    }

    @Override // com.vungle.ads.internal.protos.j
    public String getConnectionType() {
        return this.connectionType_;
    }

    @Override // com.vungle.ads.internal.protos.j
    public H getConnectionTypeBytes() {
        return H.copyFromUtf8(this.connectionType_);
    }

    @Override // com.vungle.ads.internal.protos.j
    public String getConnectionTypeDetail() {
        return this.connectionTypeDetail_;
    }

    @Override // com.vungle.ads.internal.protos.j
    public String getConnectionTypeDetailAndroid() {
        return this.connectionTypeDetailAndroid_;
    }

    @Override // com.vungle.ads.internal.protos.j
    public H getConnectionTypeDetailAndroidBytes() {
        return H.copyFromUtf8(this.connectionTypeDetailAndroid_);
    }

    @Override // com.vungle.ads.internal.protos.j
    public H getConnectionTypeDetailBytes() {
        return H.copyFromUtf8(this.connectionTypeDetail_);
    }

    @Override // com.vungle.ads.internal.protos.j
    public String getCreativeId() {
        return this.creativeId_;
    }

    @Override // com.vungle.ads.internal.protos.j
    public H getCreativeIdBytes() {
        return H.copyFromUtf8(this.creativeId_);
    }

    @Override // com.vungle.ads.internal.protos.j
    public String getEventId() {
        return this.eventId_;
    }

    @Override // com.vungle.ads.internal.protos.j
    public H getEventIdBytes() {
        return H.copyFromUtf8(this.eventId_);
    }

    @Override // com.vungle.ads.internal.protos.j
    public String getMake() {
        return this.make_;
    }

    @Override // com.vungle.ads.internal.protos.j
    public H getMakeBytes() {
        return H.copyFromUtf8(this.make_);
    }

    @Override // com.vungle.ads.internal.protos.j
    public String getMessage() {
        return this.message_;
    }

    @Override // com.vungle.ads.internal.protos.j
    public H getMessageBytes() {
        return H.copyFromUtf8(this.message_);
    }

    @Override // com.vungle.ads.internal.protos.j
    public String getModel() {
        return this.model_;
    }

    @Override // com.vungle.ads.internal.protos.j
    public H getModelBytes() {
        return H.copyFromUtf8(this.model_);
    }

    @Override // com.vungle.ads.internal.protos.j
    public String getOs() {
        return this.os_;
    }

    @Override // com.vungle.ads.internal.protos.j
    public H getOsBytes() {
        return H.copyFromUtf8(this.os_);
    }

    @Override // com.vungle.ads.internal.protos.j
    public String getOsVersion() {
        return this.osVersion_;
    }

    @Override // com.vungle.ads.internal.protos.j
    public H getOsVersionBytes() {
        return H.copyFromUtf8(this.osVersion_);
    }

    @Override // com.vungle.ads.internal.protos.j
    public String getPlacementReferenceId() {
        return this.placementReferenceId_;
    }

    @Override // com.vungle.ads.internal.protos.j
    public H getPlacementReferenceIdBytes() {
        return H.copyFromUtf8(this.placementReferenceId_);
    }

    @Override // com.vungle.ads.internal.protos.j
    public g getReason() {
        g forNumber = g.forNumber(this.reason_);
        if (forNumber == null) {
            return g.UNRECOGNIZED;
        }
        return forNumber;
    }

    @Override // com.vungle.ads.internal.protos.j
    public int getReasonValue() {
        return this.reason_;
    }

    @Override // com.vungle.ads.internal.protos.j
    public String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.vungle.ads.internal.protos.j
    public H getSessionIdBytes() {
        return H.copyFromUtf8(this.sessionId_);
    }

    public static d newBuilder(Sdk$SDKError sdk$SDKError) {
        return (d) DEFAULT_INSTANCE.createBuilder(sdk$SDKError);
    }

    public static Sdk$SDKError parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Sdk$SDKError) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Sdk$SDKError parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Sdk$SDKError) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Sdk$SDKError parseFrom(H h6) throws C1912g3 {
        return (Sdk$SDKError) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static Sdk$SDKError parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Sdk$SDKError) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Sdk$SDKError parseFrom(byte[] bArr) throws C1912g3 {
        return (Sdk$SDKError) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Sdk$SDKError parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Sdk$SDKError) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Sdk$SDKError parseFrom(InputStream inputStream) throws IOException {
        return (Sdk$SDKError) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$SDKError parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Sdk$SDKError) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Sdk$SDKError parseFrom(S s5) throws IOException {
        return (Sdk$SDKError) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Sdk$SDKError parseFrom(S s5, W1 w1) throws IOException {
        return (Sdk$SDKError) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
