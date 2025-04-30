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
import i5.r;
import i5.s;
import i5.t;
import i5.u;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class NetworkConnectionInfo extends L2 implements O3 {
    private static final NetworkConnectionInfo DEFAULT_INSTANCE;
    public static final int MOBILE_SUBTYPE_FIELD_NUMBER = 2;
    public static final int NETWORK_TYPE_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER;
    private int bitField0_;
    private int mobileSubtype_;
    private int networkType_ = -1;

    static {
        NetworkConnectionInfo networkConnectionInfo = new NetworkConnectionInfo();
        DEFAULT_INSTANCE = networkConnectionInfo;
        L2.registerDefaultInstance(NetworkConnectionInfo.class, networkConnectionInfo);
    }

    private NetworkConnectionInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMobileSubtype() {
        this.bitField0_ &= -3;
        this.mobileSubtype_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkType() {
        this.bitField0_ &= -2;
        this.networkType_ = -1;
    }

    public static NetworkConnectionInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static s newBuilder() {
        return (s) DEFAULT_INSTANCE.createBuilder();
    }

    public static NetworkConnectionInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NetworkConnectionInfo) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NetworkConnectionInfo parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (NetworkConnectionInfo) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMobileSubtype(t tVar) {
        this.mobileSubtype_ = tVar.b;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkType(u uVar) {
        this.networkType_ = uVar.b;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (r.f20689a[k22.ordinal()]) {
            case 1:
                return new NetworkConnectionInfo();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "networkType_", C2354i.f20675d, "mobileSubtype_", C2354i.f20674c});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (NetworkConnectionInfo.class) {
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

    public t getMobileSubtype() {
        t a6 = t.a(this.mobileSubtype_);
        if (a6 == null) {
            return t.UNKNOWN_MOBILE_SUBTYPE;
        }
        return a6;
    }

    public u getNetworkType() {
        u a6 = u.a(this.networkType_);
        if (a6 == null) {
            return u.NONE;
        }
        return a6;
    }

    public boolean hasMobileSubtype() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasNetworkType() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    public static s newBuilder(NetworkConnectionInfo networkConnectionInfo) {
        return (s) DEFAULT_INSTANCE.createBuilder(networkConnectionInfo);
    }

    public static NetworkConnectionInfo parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (NetworkConnectionInfo) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static NetworkConnectionInfo parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (NetworkConnectionInfo) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static NetworkConnectionInfo parseFrom(H h6) throws C1912g3 {
        return (NetworkConnectionInfo) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static NetworkConnectionInfo parseFrom(H h6, W1 w1) throws C1912g3 {
        return (NetworkConnectionInfo) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static NetworkConnectionInfo parseFrom(byte[] bArr) throws C1912g3 {
        return (NetworkConnectionInfo) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NetworkConnectionInfo parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (NetworkConnectionInfo) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static NetworkConnectionInfo parseFrom(InputStream inputStream) throws IOException {
        return (NetworkConnectionInfo) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NetworkConnectionInfo parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (NetworkConnectionInfo) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static NetworkConnectionInfo parseFrom(S s5) throws IOException {
        return (NetworkConnectionInfo) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static NetworkConnectionInfo parseFrom(S s5, W1 w1) throws IOException {
        return (NetworkConnectionInfo) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
