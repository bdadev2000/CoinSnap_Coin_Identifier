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
import y5.v;
import y5.w;

/* loaded from: classes3.dex */
public final class TimeZone extends L2 implements O3 {
    private static final TimeZone DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private String id_ = "";
    private String version_ = "";

    static {
        TimeZone timeZone = new TimeZone();
        DEFAULT_INSTANCE = timeZone;
        L2.registerDefaultInstance(TimeZone.class, timeZone);
    }

    private TimeZone() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    public static TimeZone getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static w newBuilder() {
        return (w) DEFAULT_INSTANCE.createBuilder();
    }

    public static TimeZone parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TimeZone) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TimeZone parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (TimeZone) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.id_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(String str) {
        str.getClass();
        this.version_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.version_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (v.f24445a[k22.ordinal()]) {
            case 1:
                return new TimeZone();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"id_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (TimeZone.class) {
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

    public String getId() {
        return this.id_;
    }

    public H getIdBytes() {
        return H.copyFromUtf8(this.id_);
    }

    public String getVersion() {
        return this.version_;
    }

    public H getVersionBytes() {
        return H.copyFromUtf8(this.version_);
    }

    public static w newBuilder(TimeZone timeZone) {
        return (w) DEFAULT_INSTANCE.createBuilder(timeZone);
    }

    public static TimeZone parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (TimeZone) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static TimeZone parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (TimeZone) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static TimeZone parseFrom(H h6) throws C1912g3 {
        return (TimeZone) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static TimeZone parseFrom(H h6, W1 w1) throws C1912g3 {
        return (TimeZone) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static TimeZone parseFrom(byte[] bArr) throws C1912g3 {
        return (TimeZone) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TimeZone parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (TimeZone) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static TimeZone parseFrom(InputStream inputStream) throws IOException {
        return (TimeZone) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TimeZone parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (TimeZone) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static TimeZone parseFrom(S s5) throws IOException {
        return (TimeZone) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static TimeZone parseFrom(S s5, W1 w1) throws IOException {
        return (TimeZone) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
