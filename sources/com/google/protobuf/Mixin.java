package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class Mixin extends o3 implements z5 {
    private static final Mixin DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile m6 PARSER = null;
    public static final int ROOT_FIELD_NUMBER = 2;
    private String name_ = "";
    private String root_ = "";

    static {
        Mixin mixin = new Mixin();
        DEFAULT_INSTANCE = mixin;
        o3.registerDefaultInstance(Mixin.class, mixin);
    }

    private Mixin() {
    }

    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public void clearRoot() {
        this.root_ = getDefaultInstance().getRoot();
    }

    public static Mixin getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static y5 newBuilder() {
        return (y5) DEFAULT_INSTANCE.createBuilder();
    }

    public static Mixin parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Mixin) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Mixin parseFrom(ByteBuffer byteBuffer) throws h4 {
        return (Mixin) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m6 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    public void setNameBytes(h0 h0Var) {
        c.checkByteStringIsUtf8(h0Var);
        this.name_ = h0Var.toStringUtf8();
    }

    public void setRoot(String str) {
        str.getClass();
        this.root_ = str;
    }

    public void setRootBytes(h0 h0Var) {
        c.checkByteStringIsUtf8(h0Var);
        this.root_ = h0Var.toStringUtf8();
    }

    @Override // com.google.protobuf.o3
    public final Object dynamicMethod(n3 n3Var, Object obj, Object obj2) {
        switch (x5.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[n3Var.ordinal()]) {
            case 1:
                return new Mixin();
            case 2:
                return new y5(null);
            case 3:
                return o3.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "root_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m6 m6Var = PARSER;
                if (m6Var == null) {
                    synchronized (Mixin.class) {
                        m6Var = PARSER;
                        if (m6Var == null) {
                            m6Var = new i3(DEFAULT_INSTANCE);
                            PARSER = m6Var;
                        }
                    }
                }
                return m6Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.z5
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.z5
    public h0 getNameBytes() {
        return h0.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.z5
    public String getRoot() {
        return this.root_;
    }

    @Override // com.google.protobuf.z5
    public h0 getRootBytes() {
        return h0.copyFromUtf8(this.root_);
    }

    public static y5 newBuilder(Mixin mixin) {
        return (y5) DEFAULT_INSTANCE.createBuilder(mixin);
    }

    public static Mixin parseDelimitedFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Mixin) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Mixin parseFrom(ByteBuffer byteBuffer, a2 a2Var) throws h4 {
        return (Mixin) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer, a2Var);
    }

    public static Mixin parseFrom(h0 h0Var) throws h4 {
        return (Mixin) o3.parseFrom(DEFAULT_INSTANCE, h0Var);
    }

    public static Mixin parseFrom(h0 h0Var, a2 a2Var) throws h4 {
        return (Mixin) o3.parseFrom(DEFAULT_INSTANCE, h0Var, a2Var);
    }

    public static Mixin parseFrom(byte[] bArr) throws h4 {
        return (Mixin) o3.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Mixin parseFrom(byte[] bArr, a2 a2Var) throws h4 {
        return (Mixin) o3.parseFrom(DEFAULT_INSTANCE, bArr, a2Var);
    }

    public static Mixin parseFrom(InputStream inputStream) throws IOException {
        return (Mixin) o3.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Mixin parseFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Mixin) o3.parseFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Mixin parseFrom(r0 r0Var) throws IOException {
        return (Mixin) o3.parseFrom(DEFAULT_INSTANCE, r0Var);
    }

    public static Mixin parseFrom(r0 r0Var, a2 a2Var) throws IOException {
        return (Mixin) o3.parseFrom(DEFAULT_INSTANCE, r0Var, a2Var);
    }
}
