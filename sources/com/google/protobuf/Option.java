package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class Option extends o3 implements l6 {
    private static final Option DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile m6 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String name_ = "";
    private Any value_;

    static {
        Option option = new Option();
        DEFAULT_INSTANCE = option;
        o3.registerDefaultInstance(Option.class, option);
    }

    private Option() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = null;
    }

    public static Option getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeValue(Any any) {
        any.getClass();
        Any any2 = this.value_;
        if (any2 != null && any2 != Any.getDefaultInstance()) {
            this.value_ = (Any) ((h) Any.newBuilder(this.value_).mergeFrom((o3) any)).buildPartial();
        } else {
            this.value_ = any;
        }
    }

    public static k6 newBuilder() {
        return (k6) DEFAULT_INSTANCE.createBuilder();
    }

    public static Option parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Option) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Option parseFrom(ByteBuffer byteBuffer) throws h4 {
        return (Option) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m6 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(h0 h0Var) {
        c.checkByteStringIsUtf8(h0Var);
        this.name_ = h0Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(Any any) {
        any.getClass();
        this.value_ = any;
    }

    @Override // com.google.protobuf.o3
    public final Object dynamicMethod(n3 n3Var, Object obj, Object obj2) {
        j6 j6Var = null;
        switch (j6.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[n3Var.ordinal()]) {
            case 1:
                return new Option();
            case 2:
                return new k6(j6Var);
            case 3:
                return o3.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m6 m6Var = PARSER;
                if (m6Var == null) {
                    synchronized (Option.class) {
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

    @Override // com.google.protobuf.l6
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.l6
    public h0 getNameBytes() {
        return h0.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.l6
    public Any getValue() {
        Any any = this.value_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    @Override // com.google.protobuf.l6
    public boolean hasValue() {
        return this.value_ != null;
    }

    public static k6 newBuilder(Option option) {
        return (k6) DEFAULT_INSTANCE.createBuilder(option);
    }

    public static Option parseDelimitedFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Option) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Option parseFrom(ByteBuffer byteBuffer, a2 a2Var) throws h4 {
        return (Option) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer, a2Var);
    }

    public static Option parseFrom(h0 h0Var) throws h4 {
        return (Option) o3.parseFrom(DEFAULT_INSTANCE, h0Var);
    }

    public static Option parseFrom(h0 h0Var, a2 a2Var) throws h4 {
        return (Option) o3.parseFrom(DEFAULT_INSTANCE, h0Var, a2Var);
    }

    public static Option parseFrom(byte[] bArr) throws h4 {
        return (Option) o3.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Option parseFrom(byte[] bArr, a2 a2Var) throws h4 {
        return (Option) o3.parseFrom(DEFAULT_INSTANCE, bArr, a2Var);
    }

    public static Option parseFrom(InputStream inputStream) throws IOException {
        return (Option) o3.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Option parseFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Option) o3.parseFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Option parseFrom(r0 r0Var) throws IOException {
        return (Option) o3.parseFrom(DEFAULT_INSTANCE, r0Var);
    }

    public static Option parseFrom(r0 r0Var, a2 a2Var) throws IOException {
        return (Option) o3.parseFrom(DEFAULT_INSTANCE, r0Var, a2Var);
    }
}
