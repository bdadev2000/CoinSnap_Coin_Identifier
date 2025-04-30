package com.google.firebase.perf.v1;

import com.google.protobuf.AbstractC1894e;
import com.google.protobuf.C1877b3;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.InterfaceC1870a3;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.S;
import com.google.protobuf.S2;
import com.google.protobuf.W1;
import com.google.protobuf.Z2;
import i5.C2354i;
import i5.E;
import i5.F;
import i5.G;
import i5.H;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class PerfSession extends L2 implements G {
    private static final PerfSession DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final InterfaceC1870a3 sessionVerbosity_converter_ = new Object();
    private int bitField0_;
    private String sessionId_ = "";
    private Z2 sessionVerbosity_ = L2.emptyIntList();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.protobuf.a3] */
    static {
        PerfSession perfSession = new PerfSession();
        DEFAULT_INSTANCE = perfSession;
        L2.registerDefaultInstance(PerfSession.class, perfSession);
    }

    private PerfSession() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSessionVerbosity(Iterable<? extends H> iterable) {
        ensureSessionVerbosityIsMutable();
        for (H h6 : iterable) {
            ((S2) this.sessionVerbosity_).addInt(h6.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSessionVerbosity(H h6) {
        h6.getClass();
        ensureSessionVerbosityIsMutable();
        ((S2) this.sessionVerbosity_).addInt(h6.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.bitField0_ &= -2;
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionVerbosity() {
        this.sessionVerbosity_ = L2.emptyIntList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureSessionVerbosityIsMutable() {
        Z2 z22 = this.sessionVerbosity_;
        if (!((AbstractC1894e) z22).isModifiable()) {
            this.sessionVerbosity_ = L2.mutableCopy(z22);
        }
    }

    public static PerfSession getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static F newBuilder() {
        return (F) DEFAULT_INSTANCE.createBuilder();
    }

    public static PerfSession parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PerfSession) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerfSession parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (PerfSession) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(com.google.protobuf.H h6) {
        this.sessionId_ = h6.toStringUtf8();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionVerbosity(int i9, H h6) {
        h6.getClass();
        ensureSessionVerbosityIsMutable();
        ((S2) this.sessionVerbosity_).setInt(i9, h6.b);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (E.f20659a[k22.ordinal()]) {
            case 1:
                return new PerfSession();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", C2354i.f20678g});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (PerfSession.class) {
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

    public String getSessionId() {
        return this.sessionId_;
    }

    public com.google.protobuf.H getSessionIdBytes() {
        return com.google.protobuf.H.copyFromUtf8(this.sessionId_);
    }

    public H getSessionVerbosity(int i9) {
        H a6 = H.a(((S2) this.sessionVerbosity_).getInt(i9));
        if (a6 == null) {
            return H.SESSION_VERBOSITY_NONE;
        }
        return a6;
    }

    public int getSessionVerbosityCount() {
        return this.sessionVerbosity_.size();
    }

    public List<H> getSessionVerbosityList() {
        return new C1877b3(this.sessionVerbosity_, sessionVerbosity_converter_);
    }

    public boolean hasSessionId() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    public static F newBuilder(PerfSession perfSession) {
        return (F) DEFAULT_INSTANCE.createBuilder(perfSession);
    }

    public static PerfSession parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (PerfSession) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static PerfSession parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (PerfSession) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static PerfSession parseFrom(com.google.protobuf.H h6) throws C1912g3 {
        return (PerfSession) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static PerfSession parseFrom(com.google.protobuf.H h6, W1 w1) throws C1912g3 {
        return (PerfSession) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static PerfSession parseFrom(byte[] bArr) throws C1912g3 {
        return (PerfSession) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PerfSession parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (PerfSession) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static PerfSession parseFrom(InputStream inputStream) throws IOException {
        return (PerfSession) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerfSession parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (PerfSession) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static PerfSession parseFrom(S s5) throws IOException {
        return (PerfSession) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static PerfSession parseFrom(S s5, W1 w1) throws IOException {
        return (PerfSession) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
