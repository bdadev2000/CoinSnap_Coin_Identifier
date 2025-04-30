package com.google.type;

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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import y5.l;
import y5.m;

/* loaded from: classes3.dex */
public final class LatLng extends L2 implements O3 {
    private static final LatLng DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile InterfaceC1948l4 PARSER;
    private double latitude_;
    private double longitude_;

    static {
        LatLng latLng = new LatLng();
        DEFAULT_INSTANCE = latLng;
        L2.registerDefaultInstance(LatLng.class, latLng);
    }

    private LatLng() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatitude() {
        this.latitude_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongitude() {
        this.longitude_ = 0.0d;
    }

    public static LatLng getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static m newBuilder() {
        return (m) DEFAULT_INSTANCE.createBuilder();
    }

    public static LatLng parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LatLng) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LatLng parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (LatLng) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatitude(double d2) {
        this.latitude_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongitude(double d2) {
        this.longitude_ = d2;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (l.f24440a[k22.ordinal()]) {
            case 1:
                return new LatLng();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"latitude_", "longitude_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (LatLng.class) {
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

    public double getLatitude() {
        return this.latitude_;
    }

    public double getLongitude() {
        return this.longitude_;
    }

    public static m newBuilder(LatLng latLng) {
        return (m) DEFAULT_INSTANCE.createBuilder(latLng);
    }

    public static LatLng parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (LatLng) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static LatLng parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (LatLng) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static LatLng parseFrom(H h6) throws C1912g3 {
        return (LatLng) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static LatLng parseFrom(H h6, W1 w1) throws C1912g3 {
        return (LatLng) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static LatLng parseFrom(byte[] bArr) throws C1912g3 {
        return (LatLng) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LatLng parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (LatLng) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static LatLng parseFrom(InputStream inputStream) throws IOException {
        return (LatLng) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LatLng parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (LatLng) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static LatLng parseFrom(S s5) throws IOException {
        return (LatLng) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static LatLng parseFrom(S s5, W1 w1) throws IOException {
        return (LatLng) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
