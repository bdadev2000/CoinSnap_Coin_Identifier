package com.google.api;

import a4.j1;
import a4.k1;
import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.Any;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1891d3;
import com.google.protobuf.InterfaceC1922i;
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

/* loaded from: classes2.dex */
public final class SourceInfo extends L2 implements O3 {
    private static final SourceInfo DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int SOURCE_FILES_FIELD_NUMBER = 1;
    private InterfaceC1891d3 sourceFiles_ = L2.emptyProtobufList();

    static {
        SourceInfo sourceInfo = new SourceInfo();
        DEFAULT_INSTANCE = sourceInfo;
        L2.registerDefaultInstance(SourceInfo.class, sourceInfo);
    }

    private SourceInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSourceFiles(Iterable<? extends Any> iterable) {
        ensureSourceFilesIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.sourceFiles_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSourceFiles(Any any) {
        any.getClass();
        ensureSourceFilesIsMutable();
        this.sourceFiles_.add(any);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceFiles() {
        this.sourceFiles_ = L2.emptyProtobufList();
    }

    private void ensureSourceFilesIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.sourceFiles_;
        if (!interfaceC1891d3.isModifiable()) {
            this.sourceFiles_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static SourceInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static k1 newBuilder() {
        return (k1) DEFAULT_INSTANCE.createBuilder();
    }

    public static SourceInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SourceInfo) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SourceInfo parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (SourceInfo) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSourceFiles(int i9) {
        ensureSourceFilesIsMutable();
        this.sourceFiles_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceFiles(int i9, Any any) {
        any.getClass();
        ensureSourceFilesIsMutable();
        this.sourceFiles_.set(i9, any);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (j1.f4019a[k22.ordinal()]) {
            case 1:
                return new SourceInfo();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"sourceFiles_", Any.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (SourceInfo.class) {
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

    public Any getSourceFiles(int i9) {
        return (Any) this.sourceFiles_.get(i9);
    }

    public int getSourceFilesCount() {
        return this.sourceFiles_.size();
    }

    public List<Any> getSourceFilesList() {
        return this.sourceFiles_;
    }

    public InterfaceC1922i getSourceFilesOrBuilder(int i9) {
        return (InterfaceC1922i) this.sourceFiles_.get(i9);
    }

    public List<? extends InterfaceC1922i> getSourceFilesOrBuilderList() {
        return this.sourceFiles_;
    }

    public static k1 newBuilder(SourceInfo sourceInfo) {
        return (k1) DEFAULT_INSTANCE.createBuilder(sourceInfo);
    }

    public static SourceInfo parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (SourceInfo) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static SourceInfo parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (SourceInfo) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static SourceInfo parseFrom(H h6) throws C1912g3 {
        return (SourceInfo) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSourceFiles(int i9, Any any) {
        any.getClass();
        ensureSourceFilesIsMutable();
        this.sourceFiles_.add(i9, any);
    }

    public static SourceInfo parseFrom(H h6, W1 w1) throws C1912g3 {
        return (SourceInfo) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static SourceInfo parseFrom(byte[] bArr) throws C1912g3 {
        return (SourceInfo) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SourceInfo parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (SourceInfo) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static SourceInfo parseFrom(InputStream inputStream) throws IOException {
        return (SourceInfo) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SourceInfo parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (SourceInfo) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static SourceInfo parseFrom(S s5) throws IOException {
        return (SourceInfo) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static SourceInfo parseFrom(S s5, W1 w1) throws IOException {
        return (SourceInfo) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
