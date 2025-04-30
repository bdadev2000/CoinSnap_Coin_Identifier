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
import w5.AbstractC2909c;

/* loaded from: classes3.dex */
public final class DebugInfo extends L2 implements O3 {
    private static final DebugInfo DEFAULT_INSTANCE;
    public static final int DETAIL_FIELD_NUMBER = 2;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int STACK_ENTRIES_FIELD_NUMBER = 1;
    private InterfaceC1891d3 stackEntries_ = L2.emptyProtobufList();
    private String detail_ = "";

    static {
        DebugInfo debugInfo = new DebugInfo();
        DEFAULT_INSTANCE = debugInfo;
        L2.registerDefaultInstance(DebugInfo.class, debugInfo);
    }

    private DebugInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStackEntries(Iterable<String> iterable) {
        ensureStackEntriesIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.stackEntries_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStackEntries(String str) {
        str.getClass();
        ensureStackEntriesIsMutable();
        this.stackEntries_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStackEntriesBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        ensureStackEntriesIsMutable();
        this.stackEntries_.add(h6.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetail() {
        this.detail_ = getDefaultInstance().getDetail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStackEntries() {
        this.stackEntries_ = L2.emptyProtobufList();
    }

    private void ensureStackEntriesIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.stackEntries_;
        if (!interfaceC1891d3.isModifiable()) {
            this.stackEntries_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static DebugInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static w5.d newBuilder() {
        return (w5.d) DEFAULT_INSTANCE.createBuilder();
    }

    public static DebugInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DebugInfo) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DebugInfo parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (DebugInfo) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetail(String str) {
        str.getClass();
        this.detail_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetailBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.detail_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStackEntries(int i9, String str) {
        str.getClass();
        ensureStackEntriesIsMutable();
        this.stackEntries_.set(i9, str);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC2909c.f23983a[k22.ordinal()]) {
            case 1:
                return new DebugInfo();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002Ȉ", new Object[]{"stackEntries_", "detail_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (DebugInfo.class) {
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

    public String getDetail() {
        return this.detail_;
    }

    public H getDetailBytes() {
        return H.copyFromUtf8(this.detail_);
    }

    public String getStackEntries(int i9) {
        return (String) this.stackEntries_.get(i9);
    }

    public H getStackEntriesBytes(int i9) {
        return H.copyFromUtf8((String) this.stackEntries_.get(i9));
    }

    public int getStackEntriesCount() {
        return this.stackEntries_.size();
    }

    public List<String> getStackEntriesList() {
        return this.stackEntries_;
    }

    public static w5.d newBuilder(DebugInfo debugInfo) {
        return (w5.d) DEFAULT_INSTANCE.createBuilder(debugInfo);
    }

    public static DebugInfo parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DebugInfo) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DebugInfo parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (DebugInfo) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static DebugInfo parseFrom(H h6) throws C1912g3 {
        return (DebugInfo) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static DebugInfo parseFrom(H h6, W1 w1) throws C1912g3 {
        return (DebugInfo) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static DebugInfo parseFrom(byte[] bArr) throws C1912g3 {
        return (DebugInfo) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DebugInfo parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (DebugInfo) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static DebugInfo parseFrom(InputStream inputStream) throws IOException {
        return (DebugInfo) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DebugInfo parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DebugInfo) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DebugInfo parseFrom(S s5) throws IOException {
        return (DebugInfo) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static DebugInfo parseFrom(S s5, W1 w1) throws IOException {
        return (DebugInfo) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
