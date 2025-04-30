package com.google.rpc;

import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1891d3;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.O3;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import w5.AbstractC2907a;
import w5.InterfaceC2908b;

/* loaded from: classes3.dex */
public final class BadRequest extends L2 implements O3 {
    private static final BadRequest DEFAULT_INSTANCE;
    public static final int FIELD_VIOLATIONS_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER;
    private InterfaceC1891d3 fieldViolations_ = L2.emptyProtobufList();

    /* loaded from: classes3.dex */
    public static final class FieldViolation extends L2 implements InterfaceC2908b {
        private static final FieldViolation DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        public static final int FIELD_FIELD_NUMBER = 1;
        private static volatile InterfaceC1948l4 PARSER;
        private String field_ = "";
        private String description_ = "";

        static {
            FieldViolation fieldViolation = new FieldViolation();
            DEFAULT_INSTANCE = fieldViolation;
            L2.registerDefaultInstance(FieldViolation.class, fieldViolation);
        }

        private FieldViolation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDescription() {
            this.description_ = getDefaultInstance().getDescription();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearField() {
            this.field_ = getDefaultInstance().getField();
        }

        public static FieldViolation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static b newBuilder() {
            return (b) DEFAULT_INSTANCE.createBuilder();
        }

        public static FieldViolation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FieldViolation) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FieldViolation parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
            return (FieldViolation) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
        public void setField(String str) {
            str.getClass();
            this.field_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFieldBytes(H h6) {
            AbstractC1880c.checkByteStringIsUtf8(h6);
            this.field_ = h6.toStringUtf8();
        }

        @Override // com.google.protobuf.L2
        public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
            switch (AbstractC2907a.f23982a[k22.ordinal()]) {
                case 1:
                    return new FieldViolation();
                case 2:
                    return new D2(DEFAULT_INSTANCE);
                case 3:
                    return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"field_", "description_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC1948l4 interfaceC1948l4 = PARSER;
                    if (interfaceC1948l4 == null) {
                        synchronized (FieldViolation.class) {
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

        public String getField() {
            return this.field_;
        }

        public H getFieldBytes() {
            return H.copyFromUtf8(this.field_);
        }

        public static b newBuilder(FieldViolation fieldViolation) {
            return (b) DEFAULT_INSTANCE.createBuilder(fieldViolation);
        }

        public static FieldViolation parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
            return (FieldViolation) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static FieldViolation parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
            return (FieldViolation) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
        }

        public static FieldViolation parseFrom(H h6) throws C1912g3 {
            return (FieldViolation) L2.parseFrom(DEFAULT_INSTANCE, h6);
        }

        public static FieldViolation parseFrom(H h6, W1 w1) throws C1912g3 {
            return (FieldViolation) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
        }

        public static FieldViolation parseFrom(byte[] bArr) throws C1912g3 {
            return (FieldViolation) L2.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FieldViolation parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
            return (FieldViolation) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
        }

        public static FieldViolation parseFrom(InputStream inputStream) throws IOException {
            return (FieldViolation) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FieldViolation parseFrom(InputStream inputStream, W1 w1) throws IOException {
            return (FieldViolation) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static FieldViolation parseFrom(S s5) throws IOException {
            return (FieldViolation) L2.parseFrom(DEFAULT_INSTANCE, s5);
        }

        public static FieldViolation parseFrom(S s5, W1 w1) throws IOException {
            return (FieldViolation) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
        }
    }

    static {
        BadRequest badRequest = new BadRequest();
        DEFAULT_INSTANCE = badRequest;
        L2.registerDefaultInstance(BadRequest.class, badRequest);
    }

    private BadRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFieldViolations(Iterable<? extends FieldViolation> iterable) {
        ensureFieldViolationsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.fieldViolations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFieldViolations(FieldViolation fieldViolation) {
        fieldViolation.getClass();
        ensureFieldViolationsIsMutable();
        this.fieldViolations_.add(fieldViolation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFieldViolations() {
        this.fieldViolations_ = L2.emptyProtobufList();
    }

    private void ensureFieldViolationsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.fieldViolations_;
        if (!interfaceC1891d3.isModifiable()) {
            this.fieldViolations_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static BadRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static BadRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BadRequest) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BadRequest parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (BadRequest) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFieldViolations(int i9) {
        ensureFieldViolationsIsMutable();
        this.fieldViolations_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFieldViolations(int i9, FieldViolation fieldViolation) {
        fieldViolation.getClass();
        ensureFieldViolationsIsMutable();
        this.fieldViolations_.set(i9, fieldViolation);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC2907a.f23982a[k22.ordinal()]) {
            case 1:
                return new BadRequest();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"fieldViolations_", FieldViolation.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (BadRequest.class) {
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

    public FieldViolation getFieldViolations(int i9) {
        return (FieldViolation) this.fieldViolations_.get(i9);
    }

    public int getFieldViolationsCount() {
        return this.fieldViolations_.size();
    }

    public List<FieldViolation> getFieldViolationsList() {
        return this.fieldViolations_;
    }

    public InterfaceC2908b getFieldViolationsOrBuilder(int i9) {
        return (InterfaceC2908b) this.fieldViolations_.get(i9);
    }

    public List<? extends InterfaceC2908b> getFieldViolationsOrBuilderList() {
        return this.fieldViolations_;
    }

    public static a newBuilder(BadRequest badRequest) {
        return (a) DEFAULT_INSTANCE.createBuilder(badRequest);
    }

    public static BadRequest parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (BadRequest) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static BadRequest parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (BadRequest) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static BadRequest parseFrom(H h6) throws C1912g3 {
        return (BadRequest) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFieldViolations(int i9, FieldViolation fieldViolation) {
        fieldViolation.getClass();
        ensureFieldViolationsIsMutable();
        this.fieldViolations_.add(i9, fieldViolation);
    }

    public static BadRequest parseFrom(H h6, W1 w1) throws C1912g3 {
        return (BadRequest) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static BadRequest parseFrom(byte[] bArr) throws C1912g3 {
        return (BadRequest) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BadRequest parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (BadRequest) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static BadRequest parseFrom(InputStream inputStream) throws IOException {
        return (BadRequest) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BadRequest parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (BadRequest) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static BadRequest parseFrom(S s5) throws IOException {
        return (BadRequest) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static BadRequest parseFrom(S s5, W1 w1) throws IOException {
        return (BadRequest) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
