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
public final class Sdk$SDKMetric extends o3 implements o {
    public static final int CONNECTIONTYPEDETAIL_FIELD_NUMBER = 9;
    public static final int CONNECTIONTYPE_FIELD_NUMBER = 8;
    public static final int CREATIVEID_FIELD_NUMBER = 11;
    private static final Sdk$SDKMetric DEFAULT_INSTANCE;
    public static final int EVENTID_FIELD_NUMBER = 12;
    public static final int MAKE_FIELD_NUMBER = 4;
    public static final int META_FIELD_NUMBER = 3;
    public static final int MODEL_FIELD_NUMBER = 5;
    public static final int OSVERSION_FIELD_NUMBER = 7;
    public static final int OS_FIELD_NUMBER = 6;
    private static volatile m6 PARSER = null;
    public static final int PLACEMENTREFERENCEID_FIELD_NUMBER = 10;
    public static final int SESSIONID_FIELD_NUMBER = 13;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int type_;
    private long value_;
    private String meta_ = "";
    private String make_ = "";
    private String model_ = "";
    private String os_ = "";
    private String osVersion_ = "";
    private String connectionType_ = "";
    private String connectionTypeDetail_ = "";
    private String placementReferenceId_ = "";
    private String creativeId_ = "";
    private String eventId_ = "";
    private String sessionId_ = "";

    static {
        Sdk$SDKMetric sdk$SDKMetric = new Sdk$SDKMetric();
        DEFAULT_INSTANCE = sdk$SDKMetric;
        o3.registerDefaultInstance(Sdk$SDKMetric.class, sdk$SDKMetric);
    }

    private Sdk$SDKMetric() {
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
    public void clearMeta() {
        this.meta_ = getDefaultInstance().getMeta();
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
    public void clearSessionId() {
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0L;
    }

    public static Sdk$SDKMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static k newBuilder() {
        return (k) DEFAULT_INSTANCE.createBuilder();
    }

    public static Sdk$SDKMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Sdk$SDKMetric) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$SDKMetric parseFrom(ByteBuffer byteBuffer) throws h4 {
        return (Sdk$SDKMetric) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m6 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setMeta(String str) {
        str.getClass();
        this.meta_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetaBytes(h0 h0Var) {
        com.google.protobuf.c.checkByteStringIsUtf8(h0Var);
        this.meta_ = h0Var.toStringUtf8();
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
    public void setSessionId(String str) {
        str.getClass();
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(h0 h0Var) {
        com.google.protobuf.c.checkByteStringIsUtf8(h0Var);
        this.sessionId_ = h0Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(n nVar) {
        this.type_ = nVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i10) {
        this.type_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(long j3) {
        this.value_ = j3;
    }

    @Override // com.google.protobuf.o3
    public final Object dynamicMethod(n3 n3Var, Object obj, Object obj2) {
        a aVar = null;
        switch (a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[n3Var.ordinal()]) {
            case 1:
                return new Sdk$SDKMetric();
            case 2:
                return new k(aVar);
            case 3:
                return o3.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0000\u0000\u0001\f\u0002\u0002\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\fȈ\rȈ", new Object[]{"type_", "value_", "meta_", "make_", "model_", "os_", "osVersion_", "connectionType_", "connectionTypeDetail_", "placementReferenceId_", "creativeId_", "eventId_", "sessionId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m6 m6Var = PARSER;
                if (m6Var == null) {
                    synchronized (Sdk$SDKMetric.class) {
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

    @Override // com.vungle.ads.internal.protos.o
    public String getConnectionType() {
        return this.connectionType_;
    }

    @Override // com.vungle.ads.internal.protos.o
    public h0 getConnectionTypeBytes() {
        return h0.copyFromUtf8(this.connectionType_);
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getConnectionTypeDetail() {
        return this.connectionTypeDetail_;
    }

    @Override // com.vungle.ads.internal.protos.o
    public h0 getConnectionTypeDetailBytes() {
        return h0.copyFromUtf8(this.connectionTypeDetail_);
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getCreativeId() {
        return this.creativeId_;
    }

    @Override // com.vungle.ads.internal.protos.o
    public h0 getCreativeIdBytes() {
        return h0.copyFromUtf8(this.creativeId_);
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getEventId() {
        return this.eventId_;
    }

    @Override // com.vungle.ads.internal.protos.o
    public h0 getEventIdBytes() {
        return h0.copyFromUtf8(this.eventId_);
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getMake() {
        return this.make_;
    }

    @Override // com.vungle.ads.internal.protos.o
    public h0 getMakeBytes() {
        return h0.copyFromUtf8(this.make_);
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getMeta() {
        return this.meta_;
    }

    @Override // com.vungle.ads.internal.protos.o
    public h0 getMetaBytes() {
        return h0.copyFromUtf8(this.meta_);
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getModel() {
        return this.model_;
    }

    @Override // com.vungle.ads.internal.protos.o
    public h0 getModelBytes() {
        return h0.copyFromUtf8(this.model_);
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getOs() {
        return this.os_;
    }

    @Override // com.vungle.ads.internal.protos.o
    public h0 getOsBytes() {
        return h0.copyFromUtf8(this.os_);
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getOsVersion() {
        return this.osVersion_;
    }

    @Override // com.vungle.ads.internal.protos.o
    public h0 getOsVersionBytes() {
        return h0.copyFromUtf8(this.osVersion_);
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getPlacementReferenceId() {
        return this.placementReferenceId_;
    }

    @Override // com.vungle.ads.internal.protos.o
    public h0 getPlacementReferenceIdBytes() {
        return h0.copyFromUtf8(this.placementReferenceId_);
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.vungle.ads.internal.protos.o
    public h0 getSessionIdBytes() {
        return h0.copyFromUtf8(this.sessionId_);
    }

    @Override // com.vungle.ads.internal.protos.o
    public n getType() {
        n forNumber = n.forNumber(this.type_);
        if (forNumber == null) {
            return n.UNRECOGNIZED;
        }
        return forNumber;
    }

    @Override // com.vungle.ads.internal.protos.o
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.vungle.ads.internal.protos.o
    public long getValue() {
        return this.value_;
    }

    public static k newBuilder(Sdk$SDKMetric sdk$SDKMetric) {
        return (k) DEFAULT_INSTANCE.createBuilder(sdk$SDKMetric);
    }

    public static Sdk$SDKMetric parseDelimitedFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Sdk$SDKMetric) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Sdk$SDKMetric parseFrom(ByteBuffer byteBuffer, a2 a2Var) throws h4 {
        return (Sdk$SDKMetric) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer, a2Var);
    }

    public static Sdk$SDKMetric parseFrom(h0 h0Var) throws h4 {
        return (Sdk$SDKMetric) o3.parseFrom(DEFAULT_INSTANCE, h0Var);
    }

    public static Sdk$SDKMetric parseFrom(h0 h0Var, a2 a2Var) throws h4 {
        return (Sdk$SDKMetric) o3.parseFrom(DEFAULT_INSTANCE, h0Var, a2Var);
    }

    public static Sdk$SDKMetric parseFrom(byte[] bArr) throws h4 {
        return (Sdk$SDKMetric) o3.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Sdk$SDKMetric parseFrom(byte[] bArr, a2 a2Var) throws h4 {
        return (Sdk$SDKMetric) o3.parseFrom(DEFAULT_INSTANCE, bArr, a2Var);
    }

    public static Sdk$SDKMetric parseFrom(InputStream inputStream) throws IOException {
        return (Sdk$SDKMetric) o3.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$SDKMetric parseFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Sdk$SDKMetric) o3.parseFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Sdk$SDKMetric parseFrom(r0 r0Var) throws IOException {
        return (Sdk$SDKMetric) o3.parseFrom(DEFAULT_INSTANCE, r0Var);
    }

    public static Sdk$SDKMetric parseFrom(r0 r0Var, a2 a2Var) throws IOException {
        return (Sdk$SDKMetric) o3.parseFrom(DEFAULT_INSTANCE, r0Var, a2Var);
    }
}
