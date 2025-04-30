package com.google.firebase.perf.v1;

import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.O3;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import i5.C2354i;
import i5.N;
import i5.O;
import i5.P;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class TransportInfo extends L2 implements O3 {
    private static final TransportInfo DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    static {
        TransportInfo transportInfo = new TransportInfo();
        DEFAULT_INSTANCE = transportInfo;
        L2.registerDefaultInstance(TransportInfo.class, transportInfo);
    }

    private TransportInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDispatchDestination() {
        this.bitField0_ &= -2;
        this.dispatchDestination_ = 0;
    }

    public static TransportInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static O newBuilder() {
        return (O) DEFAULT_INSTANCE.createBuilder();
    }

    public static TransportInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TransportInfo) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TransportInfo parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (TransportInfo) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDispatchDestination(P p2) {
        this.dispatchDestination_ = p2.b;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (N.f20666a[k22.ordinal()]) {
            case 1:
                return new TransportInfo();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "dispatchDestination_", C2354i.f20679h});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (TransportInfo.class) {
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

    public P getDispatchDestination() {
        P p2;
        int i9 = this.dispatchDestination_;
        P p7 = P.SOURCE_UNKNOWN;
        if (i9 != 0) {
            if (i9 != 1) {
                p2 = null;
            } else {
                p2 = P.FL_LEGACY_V1;
            }
        } else {
            p2 = p7;
        }
        if (p2 != null) {
            return p2;
        }
        return p7;
    }

    public boolean hasDispatchDestination() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    public static O newBuilder(TransportInfo transportInfo) {
        return (O) DEFAULT_INSTANCE.createBuilder(transportInfo);
    }

    public static TransportInfo parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (TransportInfo) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static TransportInfo parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (TransportInfo) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static TransportInfo parseFrom(H h6) throws C1912g3 {
        return (TransportInfo) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static TransportInfo parseFrom(H h6, W1 w1) throws C1912g3 {
        return (TransportInfo) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static TransportInfo parseFrom(byte[] bArr) throws C1912g3 {
        return (TransportInfo) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TransportInfo parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (TransportInfo) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static TransportInfo parseFrom(InputStream inputStream) throws IOException {
        return (TransportInfo) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TransportInfo parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (TransportInfo) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static TransportInfo parseFrom(S s5) throws IOException {
        return (TransportInfo) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static TransportInfo parseFrom(S s5, W1 w1) throws IOException {
        return (TransportInfo) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
