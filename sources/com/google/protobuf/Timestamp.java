package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class Timestamp extends o3 implements h8 {
    private static final Timestamp DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile m6 PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    static {
        Timestamp timestamp = new Timestamp();
        DEFAULT_INSTANCE = timestamp;
        o3.registerDefaultInstance(Timestamp.class, timestamp);
    }

    private Timestamp() {
    }

    public void clearNanos() {
        this.nanos_ = 0;
    }

    public void clearSeconds() {
        this.seconds_ = 0L;
    }

    public static Timestamp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static g8 newBuilder() {
        return (g8) DEFAULT_INSTANCE.createBuilder();
    }

    public static Timestamp parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Timestamp) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Timestamp parseFrom(ByteBuffer byteBuffer) throws h4 {
        return (Timestamp) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m6 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setNanos(int i10) {
        this.nanos_ = i10;
    }

    public void setSeconds(long j3) {
        this.seconds_ = j3;
    }

    @Override // com.google.protobuf.o3
    public final Object dynamicMethod(n3 n3Var, Object obj, Object obj2) {
        switch (f8.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[n3Var.ordinal()]) {
            case 1:
                return new Timestamp();
            case 2:
                return new g8(null);
            case 3:
                return o3.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m6 m6Var = PARSER;
                if (m6Var == null) {
                    synchronized (Timestamp.class) {
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

    @Override // com.google.protobuf.h8
    public int getNanos() {
        return this.nanos_;
    }

    @Override // com.google.protobuf.h8
    public long getSeconds() {
        return this.seconds_;
    }

    public static g8 newBuilder(Timestamp timestamp) {
        return (g8) DEFAULT_INSTANCE.createBuilder(timestamp);
    }

    public static Timestamp parseDelimitedFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Timestamp) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Timestamp parseFrom(ByteBuffer byteBuffer, a2 a2Var) throws h4 {
        return (Timestamp) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer, a2Var);
    }

    public static Timestamp parseFrom(h0 h0Var) throws h4 {
        return (Timestamp) o3.parseFrom(DEFAULT_INSTANCE, h0Var);
    }

    public static Timestamp parseFrom(h0 h0Var, a2 a2Var) throws h4 {
        return (Timestamp) o3.parseFrom(DEFAULT_INSTANCE, h0Var, a2Var);
    }

    public static Timestamp parseFrom(byte[] bArr) throws h4 {
        return (Timestamp) o3.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Timestamp parseFrom(byte[] bArr, a2 a2Var) throws h4 {
        return (Timestamp) o3.parseFrom(DEFAULT_INSTANCE, bArr, a2Var);
    }

    public static Timestamp parseFrom(InputStream inputStream) throws IOException {
        return (Timestamp) o3.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Timestamp parseFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Timestamp) o3.parseFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Timestamp parseFrom(r0 r0Var) throws IOException {
        return (Timestamp) o3.parseFrom(DEFAULT_INSTANCE, r0Var);
    }

    public static Timestamp parseFrom(r0 r0Var, a2 a2Var) throws IOException {
        return (Timestamp) o3.parseFrom(DEFAULT_INSTANCE, r0Var, a2Var);
    }
}
