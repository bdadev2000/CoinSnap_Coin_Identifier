package com.google.api;

import a4.G0;
import a4.H0;
import a4.I0;
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
import com.google.protobuf.S4;
import com.google.protobuf.Struct;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class MonitoredResourceMetadata extends L2 implements O3 {
    private static final MonitoredResourceMetadata DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int SYSTEM_LABELS_FIELD_NUMBER = 1;
    public static final int USER_LABELS_FIELD_NUMBER = 2;
    private Struct systemLabels_;
    private G3 userLabels_ = G3.emptyMapField();

    static {
        MonitoredResourceMetadata monitoredResourceMetadata = new MonitoredResourceMetadata();
        DEFAULT_INSTANCE = monitoredResourceMetadata;
        L2.registerDefaultInstance(MonitoredResourceMetadata.class, monitoredResourceMetadata);
    }

    private MonitoredResourceMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSystemLabels() {
        this.systemLabels_ = null;
    }

    public static MonitoredResourceMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableUserLabelsMap() {
        return internalGetMutableUserLabels();
    }

    private G3 internalGetMutableUserLabels() {
        if (!this.userLabels_.isMutable()) {
            this.userLabels_ = this.userLabels_.mutableCopy();
        }
        return this.userLabels_;
    }

    private G3 internalGetUserLabels() {
        return this.userLabels_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSystemLabels(Struct struct) {
        struct.getClass();
        Struct struct2 = this.systemLabels_;
        if (struct2 != null && struct2 != Struct.getDefaultInstance()) {
            this.systemLabels_ = (Struct) ((S4) Struct.newBuilder(this.systemLabels_).mergeFrom((L2) struct)).buildPartial();
        } else {
            this.systemLabels_ = struct;
        }
    }

    public static H0 newBuilder() {
        return (H0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MonitoredResourceMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MonitoredResourceMetadata) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MonitoredResourceMetadata parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (MonitoredResourceMetadata) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemLabels(Struct struct) {
        struct.getClass();
        this.systemLabels_ = struct;
    }

    public boolean containsUserLabels(String str) {
        str.getClass();
        return internalGetUserLabels().containsKey(str);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (G0.f3965a[k22.ordinal()]) {
            case 1:
                return new MonitoredResourceMetadata();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\t\u00022", new Object[]{"systemLabels_", "userLabels_", I0.f3967a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (MonitoredResourceMetadata.class) {
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

    public Struct getSystemLabels() {
        Struct struct = this.systemLabels_;
        if (struct == null) {
            return Struct.getDefaultInstance();
        }
        return struct;
    }

    @Deprecated
    public Map<String, String> getUserLabels() {
        return getUserLabelsMap();
    }

    public int getUserLabelsCount() {
        return internalGetUserLabels().size();
    }

    public Map<String, String> getUserLabelsMap() {
        return Collections.unmodifiableMap(internalGetUserLabels());
    }

    public String getUserLabelsOrDefault(String str, String str2) {
        str.getClass();
        G3 internalGetUserLabels = internalGetUserLabels();
        if (internalGetUserLabels.containsKey(str)) {
            return (String) internalGetUserLabels.get(str);
        }
        return str2;
    }

    public String getUserLabelsOrThrow(String str) {
        str.getClass();
        G3 internalGetUserLabels = internalGetUserLabels();
        if (internalGetUserLabels.containsKey(str)) {
            return (String) internalGetUserLabels.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean hasSystemLabels() {
        if (this.systemLabels_ != null) {
            return true;
        }
        return false;
    }

    public static H0 newBuilder(MonitoredResourceMetadata monitoredResourceMetadata) {
        return (H0) DEFAULT_INSTANCE.createBuilder(monitoredResourceMetadata);
    }

    public static MonitoredResourceMetadata parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (MonitoredResourceMetadata) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static MonitoredResourceMetadata parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (MonitoredResourceMetadata) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static MonitoredResourceMetadata parseFrom(H h6) throws C1912g3 {
        return (MonitoredResourceMetadata) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static MonitoredResourceMetadata parseFrom(H h6, W1 w1) throws C1912g3 {
        return (MonitoredResourceMetadata) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static MonitoredResourceMetadata parseFrom(byte[] bArr) throws C1912g3 {
        return (MonitoredResourceMetadata) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MonitoredResourceMetadata parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (MonitoredResourceMetadata) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static MonitoredResourceMetadata parseFrom(InputStream inputStream) throws IOException {
        return (MonitoredResourceMetadata) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MonitoredResourceMetadata parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (MonitoredResourceMetadata) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static MonitoredResourceMetadata parseFrom(S s5) throws IOException {
        return (MonitoredResourceMetadata) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static MonitoredResourceMetadata parseFrom(S s5, W1 w1) throws IOException {
        return (MonitoredResourceMetadata) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
