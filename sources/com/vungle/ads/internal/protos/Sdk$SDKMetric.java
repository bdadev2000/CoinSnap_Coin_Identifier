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
public final class Sdk$SDKMetric extends L2 implements o {
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
    private static volatile InterfaceC1948l4 PARSER = null;
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
        L2.registerDefaultInstance(Sdk$SDKMetric.class, sdk$SDKMetric);
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
        return (Sdk$SDKMetric) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$SDKMetric parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Sdk$SDKMetric) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setMeta(String str) {
        str.getClass();
        this.meta_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetaBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.meta_ = h6.toStringUtf8();
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
    public void setSessionId(String str) {
        str.getClass();
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.sessionId_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(n nVar) {
        this.type_ = nVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i9) {
        this.type_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(long j7) {
        this.value_ = j7;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        a aVar = null;
        switch (a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new Sdk$SDKMetric();
            case 2:
                return new k(aVar);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0000\u0000\u0001\f\u0002\u0002\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\fȈ\rȈ", new Object[]{"type_", "value_", "meta_", "make_", "model_", "os_", "osVersion_", "connectionType_", "connectionTypeDetail_", "placementReferenceId_", "creativeId_", "eventId_", "sessionId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Sdk$SDKMetric.class) {
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

    @Override // com.vungle.ads.internal.protos.o
    public String getConnectionType() {
        return this.connectionType_;
    }

    @Override // com.vungle.ads.internal.protos.o
    public H getConnectionTypeBytes() {
        return H.copyFromUtf8(this.connectionType_);
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getConnectionTypeDetail() {
        return this.connectionTypeDetail_;
    }

    @Override // com.vungle.ads.internal.protos.o
    public H getConnectionTypeDetailBytes() {
        return H.copyFromUtf8(this.connectionTypeDetail_);
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getCreativeId() {
        return this.creativeId_;
    }

    @Override // com.vungle.ads.internal.protos.o
    public H getCreativeIdBytes() {
        return H.copyFromUtf8(this.creativeId_);
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getEventId() {
        return this.eventId_;
    }

    @Override // com.vungle.ads.internal.protos.o
    public H getEventIdBytes() {
        return H.copyFromUtf8(this.eventId_);
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getMake() {
        return this.make_;
    }

    @Override // com.vungle.ads.internal.protos.o
    public H getMakeBytes() {
        return H.copyFromUtf8(this.make_);
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getMeta() {
        return this.meta_;
    }

    @Override // com.vungle.ads.internal.protos.o
    public H getMetaBytes() {
        return H.copyFromUtf8(this.meta_);
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getModel() {
        return this.model_;
    }

    @Override // com.vungle.ads.internal.protos.o
    public H getModelBytes() {
        return H.copyFromUtf8(this.model_);
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getOs() {
        return this.os_;
    }

    @Override // com.vungle.ads.internal.protos.o
    public H getOsBytes() {
        return H.copyFromUtf8(this.os_);
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getOsVersion() {
        return this.osVersion_;
    }

    @Override // com.vungle.ads.internal.protos.o
    public H getOsVersionBytes() {
        return H.copyFromUtf8(this.osVersion_);
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getPlacementReferenceId() {
        return this.placementReferenceId_;
    }

    @Override // com.vungle.ads.internal.protos.o
    public H getPlacementReferenceIdBytes() {
        return H.copyFromUtf8(this.placementReferenceId_);
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.vungle.ads.internal.protos.o
    public H getSessionIdBytes() {
        return H.copyFromUtf8(this.sessionId_);
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

    public static Sdk$SDKMetric parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Sdk$SDKMetric) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Sdk$SDKMetric parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Sdk$SDKMetric) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Sdk$SDKMetric parseFrom(H h6) throws C1912g3 {
        return (Sdk$SDKMetric) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static Sdk$SDKMetric parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Sdk$SDKMetric) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Sdk$SDKMetric parseFrom(byte[] bArr) throws C1912g3 {
        return (Sdk$SDKMetric) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Sdk$SDKMetric parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Sdk$SDKMetric) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Sdk$SDKMetric parseFrom(InputStream inputStream) throws IOException {
        return (Sdk$SDKMetric) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$SDKMetric parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Sdk$SDKMetric) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Sdk$SDKMetric parseFrom(S s5) throws IOException {
        return (Sdk$SDKMetric) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Sdk$SDKMetric parseFrom(S s5, W1 w1) throws IOException {
        return (Sdk$SDKMetric) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
