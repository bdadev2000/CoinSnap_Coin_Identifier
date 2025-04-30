package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class DescriptorProtos$SourceCodeInfo extends L2 implements InterfaceC2028x1 {
    private static final DescriptorProtos$SourceCodeInfo DEFAULT_INSTANCE;
    public static final int LOCATION_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER;
    private InterfaceC1891d3 location_ = L2.emptyProtobufList();

    /* loaded from: classes3.dex */
    public static final class Location extends L2 implements InterfaceC2021w1 {
        private static final Location DEFAULT_INSTANCE;
        public static final int LEADING_COMMENTS_FIELD_NUMBER = 3;
        public static final int LEADING_DETACHED_COMMENTS_FIELD_NUMBER = 6;
        private static volatile InterfaceC1948l4 PARSER = null;
        public static final int PATH_FIELD_NUMBER = 1;
        public static final int SPAN_FIELD_NUMBER = 2;
        public static final int TRAILING_COMMENTS_FIELD_NUMBER = 4;
        private int bitField0_;
        private int pathMemoizedSerializedSize = -1;
        private int spanMemoizedSerializedSize = -1;
        private Z2 path_ = L2.emptyIntList();
        private Z2 span_ = L2.emptyIntList();
        private String leadingComments_ = "";
        private String trailingComments_ = "";
        private InterfaceC1891d3 leadingDetachedComments_ = L2.emptyProtobufList();

        static {
            Location location = new Location();
            DEFAULT_INSTANCE = location;
            L2.registerDefaultInstance(Location.class, location);
        }

        private Location() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLeadingDetachedComments(Iterable<String> iterable) {
            ensureLeadingDetachedCommentsIsMutable();
            AbstractC1880c.addAll((Iterable) iterable, (List) this.leadingDetachedComments_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPath(Iterable<? extends Integer> iterable) {
            ensurePathIsMutable();
            AbstractC1880c.addAll((Iterable) iterable, (List) this.path_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSpan(Iterable<? extends Integer> iterable) {
            ensureSpanIsMutable();
            AbstractC1880c.addAll((Iterable) iterable, (List) this.span_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLeadingDetachedComments(String str) {
            str.getClass();
            ensureLeadingDetachedCommentsIsMutable();
            this.leadingDetachedComments_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLeadingDetachedCommentsBytes(H h6) {
            ensureLeadingDetachedCommentsIsMutable();
            this.leadingDetachedComments_.add(h6.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPath(int i9) {
            ensurePathIsMutable();
            ((S2) this.path_).addInt(i9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSpan(int i9) {
            ensureSpanIsMutable();
            ((S2) this.span_).addInt(i9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLeadingComments() {
            this.bitField0_ &= -2;
            this.leadingComments_ = getDefaultInstance().getLeadingComments();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLeadingDetachedComments() {
            this.leadingDetachedComments_ = L2.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPath() {
            this.path_ = L2.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSpan() {
            this.span_ = L2.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrailingComments() {
            this.bitField0_ &= -3;
            this.trailingComments_ = getDefaultInstance().getTrailingComments();
        }

        private void ensureLeadingDetachedCommentsIsMutable() {
            InterfaceC1891d3 interfaceC1891d3 = this.leadingDetachedComments_;
            if (!interfaceC1891d3.isModifiable()) {
                this.leadingDetachedComments_ = L2.mutableCopy(interfaceC1891d3);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void ensurePathIsMutable() {
            Z2 z22 = this.path_;
            if (!((AbstractC1894e) z22).isModifiable()) {
                this.path_ = L2.mutableCopy(z22);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void ensureSpanIsMutable() {
            Z2 z22 = this.span_;
            if (!((AbstractC1894e) z22).isModifiable()) {
                this.span_ = L2.mutableCopy(z22);
            }
        }

        public static Location getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C2014v1 newBuilder() {
            return (C2014v1) DEFAULT_INSTANCE.createBuilder();
        }

        public static Location parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Location) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Location parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
            return (Location) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static InterfaceC1948l4 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLeadingComments(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.leadingComments_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLeadingCommentsBytes(H h6) {
            this.leadingComments_ = h6.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLeadingDetachedComments(int i9, String str) {
            str.getClass();
            ensureLeadingDetachedCommentsIsMutable();
            this.leadingDetachedComments_.set(i9, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPath(int i9, int i10) {
            ensurePathIsMutable();
            ((S2) this.path_).setInt(i9, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpan(int i9, int i10) {
            ensureSpanIsMutable();
            ((S2) this.span_).setInt(i9, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrailingComments(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.trailingComments_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrailingCommentsBytes(H h6) {
            this.trailingComments_ = h6.toStringUtf8();
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.L2
        public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
            AbstractC1916h0 abstractC1916h0 = null;
            switch (AbstractC1916h0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
                case 1:
                    return new Location();
                case 2:
                    return new C2014v1(abstractC1916h0);
                case 3:
                    return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0003\u0000\u0001'\u0002'\u0003ဈ\u0000\u0004ဈ\u0001\u0006\u001a", new Object[]{"bitField0_", "path_", "span_", "leadingComments_", "trailingComments_", "leadingDetachedComments_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC1948l4 interfaceC1948l4 = PARSER;
                    if (interfaceC1948l4 == null) {
                        synchronized (Location.class) {
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

        @Override // com.google.protobuf.InterfaceC2021w1
        public String getLeadingComments() {
            return this.leadingComments_;
        }

        @Override // com.google.protobuf.InterfaceC2021w1
        public H getLeadingCommentsBytes() {
            return H.copyFromUtf8(this.leadingComments_);
        }

        @Override // com.google.protobuf.InterfaceC2021w1
        public String getLeadingDetachedComments(int i9) {
            return (String) this.leadingDetachedComments_.get(i9);
        }

        @Override // com.google.protobuf.InterfaceC2021w1
        public H getLeadingDetachedCommentsBytes(int i9) {
            return H.copyFromUtf8((String) this.leadingDetachedComments_.get(i9));
        }

        @Override // com.google.protobuf.InterfaceC2021w1
        public int getLeadingDetachedCommentsCount() {
            return this.leadingDetachedComments_.size();
        }

        @Override // com.google.protobuf.InterfaceC2021w1
        public List<String> getLeadingDetachedCommentsList() {
            return this.leadingDetachedComments_;
        }

        @Override // com.google.protobuf.InterfaceC2021w1
        public int getPath(int i9) {
            return ((S2) this.path_).getInt(i9);
        }

        @Override // com.google.protobuf.InterfaceC2021w1
        public int getPathCount() {
            return this.path_.size();
        }

        @Override // com.google.protobuf.InterfaceC2021w1
        public List<Integer> getPathList() {
            return this.path_;
        }

        @Override // com.google.protobuf.InterfaceC2021w1
        public int getSpan(int i9) {
            return ((S2) this.span_).getInt(i9);
        }

        @Override // com.google.protobuf.InterfaceC2021w1
        public int getSpanCount() {
            return this.span_.size();
        }

        @Override // com.google.protobuf.InterfaceC2021w1
        public List<Integer> getSpanList() {
            return this.span_;
        }

        @Override // com.google.protobuf.InterfaceC2021w1
        public String getTrailingComments() {
            return this.trailingComments_;
        }

        @Override // com.google.protobuf.InterfaceC2021w1
        public H getTrailingCommentsBytes() {
            return H.copyFromUtf8(this.trailingComments_);
        }

        @Override // com.google.protobuf.InterfaceC2021w1
        public boolean hasLeadingComments() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.InterfaceC2021w1
        public boolean hasTrailingComments() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        public static C2014v1 newBuilder(Location location) {
            return (C2014v1) DEFAULT_INSTANCE.createBuilder(location);
        }

        public static Location parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
            return (Location) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static Location parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
            return (Location) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
        }

        public static Location parseFrom(H h6) throws C1912g3 {
            return (Location) L2.parseFrom(DEFAULT_INSTANCE, h6);
        }

        public static Location parseFrom(H h6, W1 w1) throws C1912g3 {
            return (Location) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
        }

        public static Location parseFrom(byte[] bArr) throws C1912g3 {
            return (Location) L2.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Location parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
            return (Location) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
        }

        public static Location parseFrom(InputStream inputStream) throws IOException {
            return (Location) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Location parseFrom(InputStream inputStream, W1 w1) throws IOException {
            return (Location) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static Location parseFrom(S s5) throws IOException {
            return (Location) L2.parseFrom(DEFAULT_INSTANCE, s5);
        }

        public static Location parseFrom(S s5, W1 w1) throws IOException {
            return (Location) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
        }
    }

    static {
        DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo = new DescriptorProtos$SourceCodeInfo();
        DEFAULT_INSTANCE = descriptorProtos$SourceCodeInfo;
        L2.registerDefaultInstance(DescriptorProtos$SourceCodeInfo.class, descriptorProtos$SourceCodeInfo);
    }

    private DescriptorProtos$SourceCodeInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLocation(Iterable<? extends Location> iterable) {
        ensureLocationIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.location_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLocation(Location location) {
        location.getClass();
        ensureLocationIsMutable();
        this.location_.add(location);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.location_ = L2.emptyProtobufList();
    }

    private void ensureLocationIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.location_;
        if (!interfaceC1891d3.isModifiable()) {
            this.location_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static DescriptorProtos$SourceCodeInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C2007u1 newBuilder() {
        return (C2007u1) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$SourceCodeInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$SourceCodeInfo) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (DescriptorProtos$SourceCodeInfo) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLocation(int i9) {
        ensureLocationIsMutable();
        this.location_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocation(int i9, Location location) {
        location.getClass();
        ensureLocationIsMutable();
        this.location_.set(i9, location);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        AbstractC1916h0 abstractC1916h0 = null;
        switch (AbstractC1916h0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new DescriptorProtos$SourceCodeInfo();
            case 2:
                return new C2007u1(abstractC1916h0);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"location_", Location.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (DescriptorProtos$SourceCodeInfo.class) {
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

    @Override // com.google.protobuf.InterfaceC2028x1
    public Location getLocation(int i9) {
        return (Location) this.location_.get(i9);
    }

    @Override // com.google.protobuf.InterfaceC2028x1
    public int getLocationCount() {
        return this.location_.size();
    }

    @Override // com.google.protobuf.InterfaceC2028x1
    public List<Location> getLocationList() {
        return this.location_;
    }

    public InterfaceC2021w1 getLocationOrBuilder(int i9) {
        return (InterfaceC2021w1) this.location_.get(i9);
    }

    public List<? extends InterfaceC2021w1> getLocationOrBuilderList() {
        return this.location_;
    }

    public static C2007u1 newBuilder(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
        return (C2007u1) DEFAULT_INSTANCE.createBuilder(descriptorProtos$SourceCodeInfo);
    }

    public static DescriptorProtos$SourceCodeInfo parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$SourceCodeInfo) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (DescriptorProtos$SourceCodeInfo) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(H h6) throws C1912g3 {
        return (DescriptorProtos$SourceCodeInfo) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLocation(int i9, Location location) {
        location.getClass();
        ensureLocationIsMutable();
        this.location_.add(i9, location);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(H h6, W1 w1) throws C1912g3 {
        return (DescriptorProtos$SourceCodeInfo) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(byte[] bArr) throws C1912g3 {
        return (DescriptorProtos$SourceCodeInfo) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (DescriptorProtos$SourceCodeInfo) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$SourceCodeInfo) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$SourceCodeInfo) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(S s5) throws IOException {
        return (DescriptorProtos$SourceCodeInfo) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(S s5, W1 w1) throws IOException {
        return (DescriptorProtos$SourceCodeInfo) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
