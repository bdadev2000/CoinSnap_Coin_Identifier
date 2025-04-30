package com.google.api;

import a4.A0;
import a4.B0;
import a4.C0;
import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.G3;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.O3;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class MonitoredResource extends L2 implements O3 {
    private static final MonitoredResource DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 2;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private G3 labels_ = G3.emptyMapField();
    private String type_ = "";

    static {
        MonitoredResource monitoredResource = new MonitoredResource();
        DEFAULT_INSTANCE = monitoredResource;
        L2.registerDefaultInstance(MonitoredResource.class, monitoredResource);
    }

    private MonitoredResource() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    public static MonitoredResource getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableLabelsMap() {
        return internalGetMutableLabels();
    }

    private G3 internalGetLabels() {
        return this.labels_;
    }

    private G3 internalGetMutableLabels() {
        if (!this.labels_.isMutable()) {
            this.labels_ = this.labels_.mutableCopy();
        }
        return this.labels_;
    }

    public static B0 newBuilder() {
        return (B0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MonitoredResource parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MonitoredResource) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MonitoredResource parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (MonitoredResource) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.type_ = h6.toStringUtf8();
    }

    public boolean containsLabels(String str) {
        str.getClass();
        return internalGetLabels().containsKey(str);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (A0.f3960a[k22.ordinal()]) {
            case 1:
                return new MonitoredResource();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001Ȉ\u00022", new Object[]{"type_", "labels_", C0.f3962a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (MonitoredResource.class) {
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

    @Deprecated
    public Map<String, String> getLabels() {
        return getLabelsMap();
    }

    public int getLabelsCount() {
        return internalGetLabels().size();
    }

    public Map<String, String> getLabelsMap() {
        return Collections.unmodifiableMap(internalGetLabels());
    }

    public String getLabelsOrDefault(String str, String str2) {
        str.getClass();
        G3 internalGetLabels = internalGetLabels();
        if (internalGetLabels.containsKey(str)) {
            return (String) internalGetLabels.get(str);
        }
        return str2;
    }

    public String getLabelsOrThrow(String str) {
        str.getClass();
        G3 internalGetLabels = internalGetLabels();
        if (internalGetLabels.containsKey(str)) {
            return (String) internalGetLabels.get(str);
        }
        throw new IllegalArgumentException();
    }

    public String getType() {
        return this.type_;
    }

    public H getTypeBytes() {
        return H.copyFromUtf8(this.type_);
    }

    public static B0 newBuilder(MonitoredResource monitoredResource) {
        return (B0) DEFAULT_INSTANCE.createBuilder(monitoredResource);
    }

    public static MonitoredResource parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (MonitoredResource) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static MonitoredResource parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (MonitoredResource) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static MonitoredResource parseFrom(H h6) throws C1912g3 {
        return (MonitoredResource) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static MonitoredResource parseFrom(H h6, W1 w1) throws C1912g3 {
        return (MonitoredResource) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static MonitoredResource parseFrom(byte[] bArr) throws C1912g3 {
        return (MonitoredResource) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MonitoredResource parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (MonitoredResource) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static MonitoredResource parseFrom(InputStream inputStream) throws IOException {
        return (MonitoredResource) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MonitoredResource parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (MonitoredResource) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static MonitoredResource parseFrom(S s5) throws IOException {
        return (MonitoredResource) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static MonitoredResource parseFrom(S s5, W1 w1) throws IOException {
        return (MonitoredResource) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
