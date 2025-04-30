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
import w5.n;
import w5.o;

/* loaded from: classes3.dex */
public final class QuotaFailure extends L2 implements O3 {
    private static final QuotaFailure DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int VIOLATIONS_FIELD_NUMBER = 1;
    private InterfaceC1891d3 violations_ = L2.emptyProtobufList();

    /* loaded from: classes3.dex */
    public static final class Violation extends L2 implements o {
        private static final Violation DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        private static volatile InterfaceC1948l4 PARSER = null;
        public static final int SUBJECT_FIELD_NUMBER = 1;
        private String subject_ = "";
        private String description_ = "";

        static {
            Violation violation = new Violation();
            DEFAULT_INSTANCE = violation;
            L2.registerDefaultInstance(Violation.class, violation);
        }

        private Violation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDescription() {
            this.description_ = getDefaultInstance().getDescription();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubject() {
            this.subject_ = getDefaultInstance().getSubject();
        }

        public static Violation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static h newBuilder() {
            return (h) DEFAULT_INSTANCE.createBuilder();
        }

        public static Violation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Violation) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Violation parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
            return (Violation) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
        public void setSubject(String str) {
            str.getClass();
            this.subject_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubjectBytes(H h6) {
            AbstractC1880c.checkByteStringIsUtf8(h6);
            this.subject_ = h6.toStringUtf8();
        }

        @Override // com.google.protobuf.L2
        public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
            switch (n.f23989a[k22.ordinal()]) {
                case 1:
                    return new Violation();
                case 2:
                    return new D2(DEFAULT_INSTANCE);
                case 3:
                    return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"subject_", "description_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC1948l4 interfaceC1948l4 = PARSER;
                    if (interfaceC1948l4 == null) {
                        synchronized (Violation.class) {
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

        public String getSubject() {
            return this.subject_;
        }

        public H getSubjectBytes() {
            return H.copyFromUtf8(this.subject_);
        }

        public static h newBuilder(Violation violation) {
            return (h) DEFAULT_INSTANCE.createBuilder(violation);
        }

        public static Violation parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
            return (Violation) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static Violation parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
            return (Violation) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
        }

        public static Violation parseFrom(H h6) throws C1912g3 {
            return (Violation) L2.parseFrom(DEFAULT_INSTANCE, h6);
        }

        public static Violation parseFrom(H h6, W1 w1) throws C1912g3 {
            return (Violation) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
        }

        public static Violation parseFrom(byte[] bArr) throws C1912g3 {
            return (Violation) L2.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Violation parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
            return (Violation) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
        }

        public static Violation parseFrom(InputStream inputStream) throws IOException {
            return (Violation) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Violation parseFrom(InputStream inputStream, W1 w1) throws IOException {
            return (Violation) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static Violation parseFrom(S s5) throws IOException {
            return (Violation) L2.parseFrom(DEFAULT_INSTANCE, s5);
        }

        public static Violation parseFrom(S s5, W1 w1) throws IOException {
            return (Violation) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
        }
    }

    static {
        QuotaFailure quotaFailure = new QuotaFailure();
        DEFAULT_INSTANCE = quotaFailure;
        L2.registerDefaultInstance(QuotaFailure.class, quotaFailure);
    }

    private QuotaFailure() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllViolations(Iterable<? extends Violation> iterable) {
        ensureViolationsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.violations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addViolations(Violation violation) {
        violation.getClass();
        ensureViolationsIsMutable();
        this.violations_.add(violation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearViolations() {
        this.violations_ = L2.emptyProtobufList();
    }

    private void ensureViolationsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.violations_;
        if (!interfaceC1891d3.isModifiable()) {
            this.violations_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static QuotaFailure getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static g newBuilder() {
        return (g) DEFAULT_INSTANCE.createBuilder();
    }

    public static QuotaFailure parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (QuotaFailure) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QuotaFailure parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (QuotaFailure) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeViolations(int i9) {
        ensureViolationsIsMutable();
        this.violations_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViolations(int i9, Violation violation) {
        violation.getClass();
        ensureViolationsIsMutable();
        this.violations_.set(i9, violation);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (n.f23989a[k22.ordinal()]) {
            case 1:
                return new QuotaFailure();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"violations_", Violation.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (QuotaFailure.class) {
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

    public Violation getViolations(int i9) {
        return (Violation) this.violations_.get(i9);
    }

    public int getViolationsCount() {
        return this.violations_.size();
    }

    public List<Violation> getViolationsList() {
        return this.violations_;
    }

    public o getViolationsOrBuilder(int i9) {
        return (o) this.violations_.get(i9);
    }

    public List<? extends o> getViolationsOrBuilderList() {
        return this.violations_;
    }

    public static g newBuilder(QuotaFailure quotaFailure) {
        return (g) DEFAULT_INSTANCE.createBuilder(quotaFailure);
    }

    public static QuotaFailure parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (QuotaFailure) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static QuotaFailure parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (QuotaFailure) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static QuotaFailure parseFrom(H h6) throws C1912g3 {
        return (QuotaFailure) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addViolations(int i9, Violation violation) {
        violation.getClass();
        ensureViolationsIsMutable();
        this.violations_.add(i9, violation);
    }

    public static QuotaFailure parseFrom(H h6, W1 w1) throws C1912g3 {
        return (QuotaFailure) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static QuotaFailure parseFrom(byte[] bArr) throws C1912g3 {
        return (QuotaFailure) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static QuotaFailure parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (QuotaFailure) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static QuotaFailure parseFrom(InputStream inputStream) throws IOException {
        return (QuotaFailure) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QuotaFailure parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (QuotaFailure) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static QuotaFailure parseFrom(S s5) throws IOException {
        return (QuotaFailure) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static QuotaFailure parseFrom(S s5, W1 w1) throws IOException {
        return (QuotaFailure) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
