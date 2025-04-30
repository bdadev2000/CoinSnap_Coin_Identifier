package com.google.type;

import com.google.protobuf.C1912g3;
import com.google.protobuf.C2043z2;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.FloatValue;
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
import y5.AbstractC2951a;
import y5.b;

/* loaded from: classes3.dex */
public final class Color extends L2 implements O3 {
    public static final int ALPHA_FIELD_NUMBER = 4;
    public static final int BLUE_FIELD_NUMBER = 3;
    private static final Color DEFAULT_INSTANCE;
    public static final int GREEN_FIELD_NUMBER = 2;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int RED_FIELD_NUMBER = 1;
    private FloatValue alpha_;
    private float blue_;
    private float green_;
    private float red_;

    static {
        Color color = new Color();
        DEFAULT_INSTANCE = color;
        L2.registerDefaultInstance(Color.class, color);
    }

    private Color() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlpha() {
        this.alpha_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBlue() {
        this.blue_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGreen() {
        this.green_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRed() {
        this.red_ = 0.0f;
    }

    public static Color getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlpha(FloatValue floatValue) {
        floatValue.getClass();
        FloatValue floatValue2 = this.alpha_;
        if (floatValue2 != null && floatValue2 != FloatValue.getDefaultInstance()) {
            this.alpha_ = (FloatValue) ((C2043z2) FloatValue.newBuilder(this.alpha_).mergeFrom((L2) floatValue)).buildPartial();
        } else {
            this.alpha_ = floatValue;
        }
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static Color parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Color) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Color parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Color) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlpha(FloatValue floatValue) {
        floatValue.getClass();
        this.alpha_ = floatValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBlue(float f9) {
        this.blue_ = f9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGreen(float f9) {
        this.green_ = f9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRed(float f9) {
        this.red_ = f9;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC2951a.f24432a[k22.ordinal()]) {
            case 1:
                return new Color();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001\u0004\t", new Object[]{"red_", "green_", "blue_", "alpha_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Color.class) {
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

    public FloatValue getAlpha() {
        FloatValue floatValue = this.alpha_;
        if (floatValue == null) {
            return FloatValue.getDefaultInstance();
        }
        return floatValue;
    }

    public float getBlue() {
        return this.blue_;
    }

    public float getGreen() {
        return this.green_;
    }

    public float getRed() {
        return this.red_;
    }

    public boolean hasAlpha() {
        if (this.alpha_ != null) {
            return true;
        }
        return false;
    }

    public static b newBuilder(Color color) {
        return (b) DEFAULT_INSTANCE.createBuilder(color);
    }

    public static Color parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Color) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Color parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Color) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Color parseFrom(H h6) throws C1912g3 {
        return (Color) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static Color parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Color) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Color parseFrom(byte[] bArr) throws C1912g3 {
        return (Color) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Color parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Color) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Color parseFrom(InputStream inputStream) throws IOException {
        return (Color) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Color parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Color) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Color parseFrom(S s5) throws IOException {
        return (Color) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Color parseFrom(S s5, W1 w1) throws IOException {
        return (Color) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
