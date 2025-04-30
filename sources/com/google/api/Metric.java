package com.google.api;

import a4.AbstractC0379q0;
import a4.AbstractC0382s0;
import a4.C0380r0;
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
public final class Metric extends L2 implements O3 {
    private static final Metric DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 2;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    private G3 labels_ = G3.emptyMapField();
    private String type_ = "";

    static {
        Metric metric = new Metric();
        DEFAULT_INSTANCE = metric;
        L2.registerDefaultInstance(Metric.class, metric);
    }

    private Metric() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    public static Metric getDefaultInstance() {
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

    public static C0380r0 newBuilder() {
        return (C0380r0) DEFAULT_INSTANCE.createBuilder();
    }

    public static Metric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Metric) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Metric parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Metric) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
        switch (AbstractC0379q0.f4035a[k22.ordinal()]) {
            case 1:
                return new Metric();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0001\u0000\u0000\u00022\u0003Ȉ", new Object[]{"labels_", AbstractC0382s0.f4040a, "type_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Metric.class) {
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

    public static C0380r0 newBuilder(Metric metric) {
        return (C0380r0) DEFAULT_INSTANCE.createBuilder(metric);
    }

    public static Metric parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Metric) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Metric parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Metric) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Metric parseFrom(H h6) throws C1912g3 {
        return (Metric) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static Metric parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Metric) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Metric parseFrom(byte[] bArr) throws C1912g3 {
        return (Metric) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Metric parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Metric) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Metric parseFrom(InputStream inputStream) throws IOException {
        return (Metric) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Metric parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Metric) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Metric parseFrom(S s5) throws IOException {
        return (Metric) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Metric parseFrom(S s5, W1 w1) throws IOException {
        return (Metric) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
