package com.google.geo.type;

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
import com.google.type.LatLng;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import t5.AbstractC2709a;
import t5.C2710b;
import y5.m;

/* loaded from: classes2.dex */
public final class Viewport extends L2 implements O3 {
    private static final Viewport DEFAULT_INSTANCE;
    public static final int HIGH_FIELD_NUMBER = 2;
    public static final int LOW_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER;
    private LatLng high_;
    private LatLng low_;

    static {
        Viewport viewport = new Viewport();
        DEFAULT_INSTANCE = viewport;
        L2.registerDefaultInstance(Viewport.class, viewport);
    }

    private Viewport() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHigh() {
        this.high_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLow() {
        this.low_ = null;
    }

    public static Viewport getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHigh(LatLng latLng) {
        latLng.getClass();
        LatLng latLng2 = this.high_;
        if (latLng2 != null && latLng2 != LatLng.getDefaultInstance()) {
            this.high_ = (LatLng) ((m) LatLng.newBuilder(this.high_).mergeFrom((L2) latLng)).buildPartial();
        } else {
            this.high_ = latLng;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLow(LatLng latLng) {
        latLng.getClass();
        LatLng latLng2 = this.low_;
        if (latLng2 != null && latLng2 != LatLng.getDefaultInstance()) {
            this.low_ = (LatLng) ((m) LatLng.newBuilder(this.low_).mergeFrom((L2) latLng)).buildPartial();
        } else {
            this.low_ = latLng;
        }
    }

    public static C2710b newBuilder() {
        return (C2710b) DEFAULT_INSTANCE.createBuilder();
    }

    public static Viewport parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Viewport) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Viewport parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Viewport) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHigh(LatLng latLng) {
        latLng.getClass();
        this.high_ = latLng;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLow(LatLng latLng) {
        latLng.getClass();
        this.low_ = latLng;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC2709a.f23011a[k22.ordinal()]) {
            case 1:
                return new Viewport();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"low_", "high_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Viewport.class) {
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

    public LatLng getHigh() {
        LatLng latLng = this.high_;
        if (latLng == null) {
            return LatLng.getDefaultInstance();
        }
        return latLng;
    }

    public LatLng getLow() {
        LatLng latLng = this.low_;
        if (latLng == null) {
            return LatLng.getDefaultInstance();
        }
        return latLng;
    }

    public boolean hasHigh() {
        if (this.high_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasLow() {
        if (this.low_ != null) {
            return true;
        }
        return false;
    }

    public static C2710b newBuilder(Viewport viewport) {
        return (C2710b) DEFAULT_INSTANCE.createBuilder(viewport);
    }

    public static Viewport parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Viewport) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Viewport parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Viewport) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Viewport parseFrom(H h6) throws C1912g3 {
        return (Viewport) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static Viewport parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Viewport) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Viewport parseFrom(byte[] bArr) throws C1912g3 {
        return (Viewport) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Viewport parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Viewport) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Viewport parseFrom(InputStream inputStream) throws IOException {
        return (Viewport) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Viewport parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Viewport) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Viewport parseFrom(S s5) throws IOException {
        return (Viewport) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Viewport parseFrom(S s5, W1 w1) throws IOException {
        return (Viewport) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
