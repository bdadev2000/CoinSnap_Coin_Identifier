package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class DescriptorProtos$GeneratedCodeInfo extends L2 implements InterfaceC1882c1 {
    public static final int ANNOTATION_FIELD_NUMBER = 1;
    private static final DescriptorProtos$GeneratedCodeInfo DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER;
    private InterfaceC1891d3 annotation_ = L2.emptyProtobufList();

    /* loaded from: classes3.dex */
    public static final class Annotation extends L2 implements InterfaceC1868a1 {
        public static final int BEGIN_FIELD_NUMBER = 3;
        private static final Annotation DEFAULT_INSTANCE;
        public static final int END_FIELD_NUMBER = 4;
        private static volatile InterfaceC1948l4 PARSER = null;
        public static final int PATH_FIELD_NUMBER = 1;
        public static final int SOURCE_FILE_FIELD_NUMBER = 2;
        private int begin_;
        private int bitField0_;
        private int end_;
        private int pathMemoizedSerializedSize = -1;
        private Z2 path_ = L2.emptyIntList();
        private String sourceFile_ = "";

        static {
            Annotation annotation = new Annotation();
            DEFAULT_INSTANCE = annotation;
            L2.registerDefaultInstance(Annotation.class, annotation);
        }

        private Annotation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPath(Iterable<? extends Integer> iterable) {
            ensurePathIsMutable();
            AbstractC1880c.addAll((Iterable) iterable, (List) this.path_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPath(int i9) {
            ensurePathIsMutable();
            ((S2) this.path_).addInt(i9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBegin() {
            this.bitField0_ &= -3;
            this.begin_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnd() {
            this.bitField0_ &= -5;
            this.end_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPath() {
            this.path_ = L2.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSourceFile() {
            this.bitField0_ &= -2;
            this.sourceFile_ = getDefaultInstance().getSourceFile();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void ensurePathIsMutable() {
            Z2 z22 = this.path_;
            if (!((AbstractC1894e) z22).isModifiable()) {
                this.path_ = L2.mutableCopy(z22);
            }
        }

        public static Annotation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Z0 newBuilder() {
            return (Z0) DEFAULT_INSTANCE.createBuilder();
        }

        public static Annotation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Annotation) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Annotation parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
            return (Annotation) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static InterfaceC1948l4 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBegin(int i9) {
            this.bitField0_ |= 2;
            this.begin_ = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnd(int i9) {
            this.bitField0_ |= 4;
            this.end_ = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPath(int i9, int i10) {
            ensurePathIsMutable();
            ((S2) this.path_).setInt(i9, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceFile(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.sourceFile_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceFileBytes(H h6) {
            this.sourceFile_ = h6.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.L2
        public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
            AbstractC1916h0 abstractC1916h0 = null;
            switch (AbstractC1916h0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
                case 1:
                    return new Annotation();
                case 2:
                    return new Z0(abstractC1916h0);
                case 3:
                    return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001'\u0002ဈ\u0000\u0003င\u0001\u0004င\u0002", new Object[]{"bitField0_", "path_", "sourceFile_", "begin_", "end_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC1948l4 interfaceC1948l4 = PARSER;
                    if (interfaceC1948l4 == null) {
                        synchronized (Annotation.class) {
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

        @Override // com.google.protobuf.InterfaceC1868a1
        public int getBegin() {
            return this.begin_;
        }

        @Override // com.google.protobuf.InterfaceC1868a1
        public int getEnd() {
            return this.end_;
        }

        @Override // com.google.protobuf.InterfaceC1868a1
        public int getPath(int i9) {
            return ((S2) this.path_).getInt(i9);
        }

        @Override // com.google.protobuf.InterfaceC1868a1
        public int getPathCount() {
            return this.path_.size();
        }

        @Override // com.google.protobuf.InterfaceC1868a1
        public List<Integer> getPathList() {
            return this.path_;
        }

        @Override // com.google.protobuf.InterfaceC1868a1
        public String getSourceFile() {
            return this.sourceFile_;
        }

        @Override // com.google.protobuf.InterfaceC1868a1
        public H getSourceFileBytes() {
            return H.copyFromUtf8(this.sourceFile_);
        }

        @Override // com.google.protobuf.InterfaceC1868a1
        public boolean hasBegin() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.InterfaceC1868a1
        public boolean hasEnd() {
            if ((this.bitField0_ & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.InterfaceC1868a1
        public boolean hasSourceFile() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        public static Z0 newBuilder(Annotation annotation) {
            return (Z0) DEFAULT_INSTANCE.createBuilder(annotation);
        }

        public static Annotation parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
            return (Annotation) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static Annotation parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
            return (Annotation) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
        }

        public static Annotation parseFrom(H h6) throws C1912g3 {
            return (Annotation) L2.parseFrom(DEFAULT_INSTANCE, h6);
        }

        public static Annotation parseFrom(H h6, W1 w1) throws C1912g3 {
            return (Annotation) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
        }

        public static Annotation parseFrom(byte[] bArr) throws C1912g3 {
            return (Annotation) L2.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Annotation parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
            return (Annotation) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
        }

        public static Annotation parseFrom(InputStream inputStream) throws IOException {
            return (Annotation) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Annotation parseFrom(InputStream inputStream, W1 w1) throws IOException {
            return (Annotation) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static Annotation parseFrom(S s5) throws IOException {
            return (Annotation) L2.parseFrom(DEFAULT_INSTANCE, s5);
        }

        public static Annotation parseFrom(S s5, W1 w1) throws IOException {
            return (Annotation) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
        }
    }

    static {
        DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo = new DescriptorProtos$GeneratedCodeInfo();
        DEFAULT_INSTANCE = descriptorProtos$GeneratedCodeInfo;
        L2.registerDefaultInstance(DescriptorProtos$GeneratedCodeInfo.class, descriptorProtos$GeneratedCodeInfo);
    }

    private DescriptorProtos$GeneratedCodeInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAnnotation(Iterable<? extends Annotation> iterable) {
        ensureAnnotationIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.annotation_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAnnotation(Annotation annotation) {
        annotation.getClass();
        ensureAnnotationIsMutable();
        this.annotation_.add(annotation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnnotation() {
        this.annotation_ = L2.emptyProtobufList();
    }

    private void ensureAnnotationIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.annotation_;
        if (!interfaceC1891d3.isModifiable()) {
            this.annotation_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static DescriptorProtos$GeneratedCodeInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C1875b1 newBuilder() {
        return (C1875b1) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$GeneratedCodeInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$GeneratedCodeInfo) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (DescriptorProtos$GeneratedCodeInfo) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAnnotation(int i9) {
        ensureAnnotationIsMutable();
        this.annotation_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnnotation(int i9, Annotation annotation) {
        annotation.getClass();
        ensureAnnotationIsMutable();
        this.annotation_.set(i9, annotation);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        AbstractC1916h0 abstractC1916h0 = null;
        switch (AbstractC1916h0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new DescriptorProtos$GeneratedCodeInfo();
            case 2:
                return new C1875b1(abstractC1916h0);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"annotation_", Annotation.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (DescriptorProtos$GeneratedCodeInfo.class) {
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

    @Override // com.google.protobuf.InterfaceC1882c1
    public Annotation getAnnotation(int i9) {
        return (Annotation) this.annotation_.get(i9);
    }

    @Override // com.google.protobuf.InterfaceC1882c1
    public int getAnnotationCount() {
        return this.annotation_.size();
    }

    @Override // com.google.protobuf.InterfaceC1882c1
    public List<Annotation> getAnnotationList() {
        return this.annotation_;
    }

    public InterfaceC1868a1 getAnnotationOrBuilder(int i9) {
        return (InterfaceC1868a1) this.annotation_.get(i9);
    }

    public List<? extends InterfaceC1868a1> getAnnotationOrBuilderList() {
        return this.annotation_;
    }

    public static C1875b1 newBuilder(DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo) {
        return (C1875b1) DEFAULT_INSTANCE.createBuilder(descriptorProtos$GeneratedCodeInfo);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$GeneratedCodeInfo) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (DescriptorProtos$GeneratedCodeInfo) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(H h6) throws C1912g3 {
        return (DescriptorProtos$GeneratedCodeInfo) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAnnotation(int i9, Annotation annotation) {
        annotation.getClass();
        ensureAnnotationIsMutable();
        this.annotation_.add(i9, annotation);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(H h6, W1 w1) throws C1912g3 {
        return (DescriptorProtos$GeneratedCodeInfo) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(byte[] bArr) throws C1912g3 {
        return (DescriptorProtos$GeneratedCodeInfo) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (DescriptorProtos$GeneratedCodeInfo) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$GeneratedCodeInfo) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$GeneratedCodeInfo) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(S s5) throws IOException {
        return (DescriptorProtos$GeneratedCodeInfo) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(S s5, W1 w1) throws IOException {
        return (DescriptorProtos$GeneratedCodeInfo) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
