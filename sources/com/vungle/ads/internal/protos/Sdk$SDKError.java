package com.vungle.ads.internal.protos;

import com.google.protobuf.a2;
import com.google.protobuf.h0;
import com.google.protobuf.h4;
import com.google.protobuf.i3;
import com.google.protobuf.m6;
import com.google.protobuf.n3;
import com.google.protobuf.o3;
import com.google.protobuf.r0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class Sdk$SDKError extends o3 implements j {
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
    private static volatile m6 PARSER = null;
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
        o3.registerDefaultInstance(Sdk$SDKError.class, sdk$SDKError);
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
        return (Sdk$SDKError) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$SDKError parseFrom(ByteBuffer byteBuffer) throws h4 {
        return (Sdk$SDKError) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m6 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAt(long j3) {
        this.at_ = j3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionType(String str) {
        str.getClass();
        this.connectionType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionTypeBytes(h0 h0Var) {
        com.google.protobuf.c.checkByteStringIsUtf8(h0Var);
        this.connectionType_ = h0Var.toStringUtf8();
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
    public void setConnectionTypeDetailAndroidBytes(h0 h0Var) {
        com.google.protobuf.c.checkByteStringIsUtf8(h0Var);
        this.connectionTypeDetailAndroid_ = h0Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionTypeDetailBytes(h0 h0Var) {
        com.google.protobuf.c.checkByteStringIsUtf8(h0Var);
        this.connectionTypeDetail_ = h0Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreativeId(String str) {
        str.getClass();
        this.creativeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreativeIdBytes(h0 h0Var) {
        com.google.protobuf.c.checkByteStringIsUtf8(h0Var);
        this.creativeId_ = h0Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventId(String str) {
        str.getClass();
        this.eventId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventIdBytes(h0 h0Var) {
        com.google.protobuf.c.checkByteStringIsUtf8(h0Var);
        this.eventId_ = h0Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMake(String str) {
        str.getClass();
        this.make_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMakeBytes(h0 h0Var) {
        com.google.protobuf.c.checkByteStringIsUtf8(h0Var);
        this.make_ = h0Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(h0 h0Var) {
        com.google.protobuf.c.checkByteStringIsUtf8(h0Var);
        this.message_ = h0Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModel(String str) {
        str.getClass();
        this.model_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModelBytes(h0 h0Var) {
        com.google.protobuf.c.checkByteStringIsUtf8(h0Var);
        this.model_ = h0Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOs(String str) {
        str.getClass();
        this.os_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsBytes(h0 h0Var) {
        com.google.protobuf.c.checkByteStringIsUtf8(h0Var);
        this.os_ = h0Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersion(String str) {
        str.getClass();
        this.osVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersionBytes(h0 h0Var) {
        com.google.protobuf.c.checkByteStringIsUtf8(h0Var);
        this.osVersion_ = h0Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlacementReferenceId(String str) {
        str.getClass();
        this.placementReferenceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlacementReferenceIdBytes(h0 h0Var) {
        com.google.protobuf.c.checkByteStringIsUtf8(h0Var);
        this.placementReferenceId_ = h0Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(g gVar) {
        this.reason_ = gVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonValue(int i10) {
        this.reason_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(h0 h0Var) {
        com.google.protobuf.c.checkByteStringIsUtf8(h0Var);
        this.sessionId_ = h0Var.toStringUtf8();
    }

    @Override // com.google.protobuf.o3
    public final Object dynamicMethod(n3 n3Var, Object obj, Object obj2) {
        a aVar = null;
        switch (a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[n3Var.ordinal()]) {
            case 1:
                return new Sdk$SDKError();
            case 2:
                return new d(aVar);
            case 3:
                return o3.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0000\u0001e\u000e\u0000\u0000\u0000\u0001\u0002\u0002\f\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\fȈ\rȈeȈ", new Object[]{"at_", "reason_", "message_", "eventId_", "make_", "model_", "os_", "osVersion_", "connectionType_", "connectionTypeDetail_", "placementReferenceId_", "creativeId_", "sessionId_", "connectionTypeDetailAndroid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m6 m6Var = PARSER;
                if (m6Var == null) {
                    synchronized (Sdk$SDKError.class) {
                        m6Var = PARSER;
                        if (m6Var == null) {
                            m6Var = new i3(DEFAULT_INSTANCE);
                            PARSER = m6Var;
                        }
                    }
                }
                return m6Var;
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
    public h0 getConnectionTypeBytes() {
        return h0.copyFromUtf8(this.connectionType_);
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
    public h0 getConnectionTypeDetailAndroidBytes() {
        return h0.copyFromUtf8(this.connectionTypeDetailAndroid_);
    }

    @Override // com.vungle.ads.internal.protos.j
    public h0 getConnectionTypeDetailBytes() {
        return h0.copyFromUtf8(this.connectionTypeDetail_);
    }

    @Override // com.vungle.ads.internal.protos.j
    public String getCreativeId() {
        return this.creativeId_;
    }

    @Override // com.vungle.ads.internal.protos.j
    public h0 getCreativeIdBytes() {
        return h0.copyFromUtf8(this.creativeId_);
    }

    @Override // com.vungle.ads.internal.protos.j
    public String getEventId() {
        return this.eventId_;
    }

    @Override // com.vungle.ads.internal.protos.j
    public h0 getEventIdBytes() {
        return h0.copyFromUtf8(this.eventId_);
    }

    @Override // com.vungle.ads.internal.protos.j
    public String getMake() {
        return this.make_;
    }

    @Override // com.vungle.ads.internal.protos.j
    public h0 getMakeBytes() {
        return h0.copyFromUtf8(this.make_);
    }

    @Override // com.vungle.ads.internal.protos.j
    public String getMessage() {
        return this.message_;
    }

    @Override // com.vungle.ads.internal.protos.j
    public h0 getMessageBytes() {
        return h0.copyFromUtf8(this.message_);
    }

    @Override // com.vungle.ads.internal.protos.j
    public String getModel() {
        return this.model_;
    }

    @Override // com.vungle.ads.internal.protos.j
    public h0 getModelBytes() {
        return h0.copyFromUtf8(this.model_);
    }

    @Override // com.vungle.ads.internal.protos.j
    public String getOs() {
        return this.os_;
    }

    @Override // com.vungle.ads.internal.protos.j
    public h0 getOsBytes() {
        return h0.copyFromUtf8(this.os_);
    }

    @Override // com.vungle.ads.internal.protos.j
    public String getOsVersion() {
        return this.osVersion_;
    }

    @Override // com.vungle.ads.internal.protos.j
    public h0 getOsVersionBytes() {
        return h0.copyFromUtf8(this.osVersion_);
    }

    @Override // com.vungle.ads.internal.protos.j
    public String getPlacementReferenceId() {
        return this.placementReferenceId_;
    }

    @Override // com.vungle.ads.internal.protos.j
    public h0 getPlacementReferenceIdBytes() {
        return h0.copyFromUtf8(this.placementReferenceId_);
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
    public h0 getSessionIdBytes() {
        return h0.copyFromUtf8(this.sessionId_);
    }

    public static d newBuilder(Sdk$SDKError sdk$SDKError) {
        return (d) DEFAULT_INSTANCE.createBuilder(sdk$SDKError);
    }

    public static Sdk$SDKError parseDelimitedFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Sdk$SDKError) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Sdk$SDKError parseFrom(ByteBuffer byteBuffer, a2 a2Var) throws h4 {
        return (Sdk$SDKError) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer, a2Var);
    }

    public static Sdk$SDKError parseFrom(h0 h0Var) throws h4 {
        return (Sdk$SDKError) o3.parseFrom(DEFAULT_INSTANCE, h0Var);
    }

    public static Sdk$SDKError parseFrom(h0 h0Var, a2 a2Var) throws h4 {
        return (Sdk$SDKError) o3.parseFrom(DEFAULT_INSTANCE, h0Var, a2Var);
    }

    public static Sdk$SDKError parseFrom(byte[] bArr) throws h4 {
        return (Sdk$SDKError) o3.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Sdk$SDKError parseFrom(byte[] bArr, a2 a2Var) throws h4 {
        return (Sdk$SDKError) o3.parseFrom(DEFAULT_INSTANCE, bArr, a2Var);
    }

    public static Sdk$SDKError parseFrom(InputStream inputStream) throws IOException {
        return (Sdk$SDKError) o3.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$SDKError parseFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Sdk$SDKError) o3.parseFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Sdk$SDKError parseFrom(r0 r0Var) throws IOException {
        return (Sdk$SDKError) o3.parseFrom(DEFAULT_INSTANCE, r0Var);
    }

    public static Sdk$SDKError parseFrom(r0 r0Var, a2 a2Var) throws IOException {
        return (Sdk$SDKError) o3.parseFrom(DEFAULT_INSTANCE, r0Var, a2Var);
    }
}
