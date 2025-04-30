package com.google.type;

import com.google.protobuf.AbstractC1880c;
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
import y5.h;
import y5.i;

/* loaded from: classes3.dex */
public final class Expr extends L2 implements O3 {
    private static final Expr DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int EXPRESSION_FIELD_NUMBER = 1;
    public static final int LOCATION_FIELD_NUMBER = 4;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String expression_ = "";
    private String title_ = "";
    private String description_ = "";
    private String location_ = "";

    static {
        Expr expr = new Expr();
        DEFAULT_INSTANCE = expr;
        L2.registerDefaultInstance(Expr.class, expr);
    }

    private Expr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExpression() {
        this.expression_ = getDefaultInstance().getExpression();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.location_ = getDefaultInstance().getLocation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static Expr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static i newBuilder() {
        return (i) DEFAULT_INSTANCE.createBuilder();
    }

    public static Expr parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Expr) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Expr parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Expr) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.description_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpression(String str) {
        str.getClass();
        this.expression_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpressionBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.expression_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocation(String str) {
        str.getClass();
        this.location_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.location_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.title_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (h.f24438a[k22.ordinal()]) {
            case 1:
                return new Expr();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"expression_", "title_", "description_", "location_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Expr.class) {
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

    public String getDescription() {
        return this.description_;
    }

    public H getDescriptionBytes() {
        return H.copyFromUtf8(this.description_);
    }

    public String getExpression() {
        return this.expression_;
    }

    public H getExpressionBytes() {
        return H.copyFromUtf8(this.expression_);
    }

    public String getLocation() {
        return this.location_;
    }

    public H getLocationBytes() {
        return H.copyFromUtf8(this.location_);
    }

    public String getTitle() {
        return this.title_;
    }

    public H getTitleBytes() {
        return H.copyFromUtf8(this.title_);
    }

    public static i newBuilder(Expr expr) {
        return (i) DEFAULT_INSTANCE.createBuilder(expr);
    }

    public static Expr parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Expr) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Expr parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Expr) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Expr parseFrom(H h6) throws C1912g3 {
        return (Expr) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static Expr parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Expr) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Expr parseFrom(byte[] bArr) throws C1912g3 {
        return (Expr) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Expr parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Expr) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Expr parseFrom(InputStream inputStream) throws IOException {
        return (Expr) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Expr parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Expr) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Expr parseFrom(S s5) throws IOException {
        return (Expr) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Expr parseFrom(S s5, W1 w1) throws IOException {
        return (Expr) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
