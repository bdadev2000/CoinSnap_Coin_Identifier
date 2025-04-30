package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class Option extends L2 implements InterfaceC1941k4 {
    private static final Option DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String name_ = "";
    private Any value_;

    static {
        Option option = new Option();
        DEFAULT_INSTANCE = option;
        L2.registerDefaultInstance(Option.class, option);
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
            this.value_ = (Any) ((C1915h) Any.newBuilder(this.value_).mergeFrom((L2) any)).buildPartial();
        } else {
            this.value_ = any;
        }
    }

    public static C1934j4 newBuilder() {
        return (C1934j4) DEFAULT_INSTANCE.createBuilder();
    }

    public static Option parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Option) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Option parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Option) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.name_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(Any any) {
        any.getClass();
        this.value_ = any;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        AbstractC1927i4 abstractC1927i4 = null;
        switch (AbstractC1927i4.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new Option();
            case 2:
                return new C1934j4(abstractC1927i4);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Option.class) {
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

    @Override // com.google.protobuf.InterfaceC1941k4
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.InterfaceC1941k4
    public H getNameBytes() {
        return H.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.InterfaceC1941k4
    public Any getValue() {
        Any any = this.value_;
        if (any == null) {
            return Any.getDefaultInstance();
        }
        return any;
    }

    @Override // com.google.protobuf.InterfaceC1941k4
    public boolean hasValue() {
        if (this.value_ != null) {
            return true;
        }
        return false;
    }

    public static C1934j4 newBuilder(Option option) {
        return (C1934j4) DEFAULT_INSTANCE.createBuilder(option);
    }

    public static Option parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Option) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Option parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Option) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Option parseFrom(H h6) throws C1912g3 {
        return (Option) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static Option parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Option) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Option parseFrom(byte[] bArr) throws C1912g3 {
        return (Option) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Option parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Option) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Option parseFrom(InputStream inputStream) throws IOException {
        return (Option) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Option parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Option) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Option parseFrom(S s5) throws IOException {
        return (Option) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Option parseFrom(S s5, W1 w1) throws IOException {
        return (Option) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
