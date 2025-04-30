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
import y5.r;
import y5.s;

/* loaded from: classes3.dex */
public final class Quaternion extends L2 implements O3 {
    private static final Quaternion DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int W_FIELD_NUMBER = 4;
    public static final int X_FIELD_NUMBER = 1;
    public static final int Y_FIELD_NUMBER = 2;
    public static final int Z_FIELD_NUMBER = 3;
    private double w_;
    private double x_;
    private double y_;
    private double z_;

    static {
        Quaternion quaternion = new Quaternion();
        DEFAULT_INSTANCE = quaternion;
        L2.registerDefaultInstance(Quaternion.class, quaternion);
    }

    private Quaternion() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearW() {
        this.w_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearX() {
        this.x_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearY() {
        this.y_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZ() {
        this.z_ = 0.0d;
    }

    public static Quaternion getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static s newBuilder() {
        return (s) DEFAULT_INSTANCE.createBuilder();
    }

    public static Quaternion parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Quaternion) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Quaternion parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Quaternion) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setW(double d2) {
        this.w_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setX(double d2) {
        this.x_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setY(double d2) {
        this.y_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZ(double d2) {
        this.z_ = d2;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (r.f24443a[k22.ordinal()]) {
            case 1:
                return new Quaternion();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003\u0000\u0004\u0000", new Object[]{"x_", "y_", "z_", "w_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Quaternion.class) {
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

    public double getW() {
        return this.w_;
    }

    public double getX() {
        return this.x_;
    }

    public double getY() {
        return this.y_;
    }

    public double getZ() {
        return this.z_;
    }

    public static s newBuilder(Quaternion quaternion) {
        return (s) DEFAULT_INSTANCE.createBuilder(quaternion);
    }

    public static Quaternion parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Quaternion) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Quaternion parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Quaternion) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Quaternion parseFrom(H h6) throws C1912g3 {
        return (Quaternion) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static Quaternion parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Quaternion) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Quaternion parseFrom(byte[] bArr) throws C1912g3 {
        return (Quaternion) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Quaternion parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Quaternion) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Quaternion parseFrom(InputStream inputStream) throws IOException {
        return (Quaternion) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Quaternion parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Quaternion) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Quaternion parseFrom(S s5) throws IOException {
        return (Quaternion) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Quaternion parseFrom(S s5, W1 w1) throws IOException {
        return (Quaternion) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
