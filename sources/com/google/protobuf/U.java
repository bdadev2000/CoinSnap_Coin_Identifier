package com.google.protobuf;

import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class U implements InterfaceC1996s4 {
    private static final int FIXED32_MULTIPLE_MASK = 3;
    private static final int FIXED64_MULTIPLE_MASK = 7;
    private static final int NEXT_TAG_UNSET = 0;
    private int endGroupTag;
    private final S input;
    private int nextTag = 0;
    private int tag;

    private U(S s5) {
        S s9 = (S) C1898e3.checkNotNull(s5, "input");
        this.input = s9;
        s9.wrapper = this;
    }

    public static U forCodedInput(S s5) {
        U u8 = s5.wrapper;
        if (u8 != null) {
            return u8;
        }
        return new U(s5);
    }

    private <T> void mergeGroupFieldInternal(T t9, InterfaceC2038y4 interfaceC2038y4, W1 w1) throws IOException {
        int i9 = this.endGroupTag;
        this.endGroupTag = Y5.makeTag(Y5.getTagFieldNumber(this.tag), 4);
        try {
            interfaceC2038y4.mergeFrom(t9, this, w1);
            if (this.tag == this.endGroupTag) {
            } else {
                throw C1912g3.parseFailure();
            }
        } finally {
            this.endGroupTag = i9;
        }
    }

    private <T> void mergeMessageFieldInternal(T t9, InterfaceC2038y4 interfaceC2038y4, W1 w1) throws IOException {
        int readUInt32 = this.input.readUInt32();
        S s5 = this.input;
        if (s5.recursionDepth < s5.recursionLimit) {
            int pushLimit = s5.pushLimit(readUInt32);
            this.input.recursionDepth++;
            interfaceC2038y4.mergeFrom(t9, this, w1);
            this.input.checkLastTagWas(0);
            r5.recursionDepth--;
            this.input.popLimit(pushLimit);
            return;
        }
        throw C1912g3.recursionLimitExceeded();
    }

    private Object readField(S5 s5, Class<?> cls, W1 w1) throws IOException {
        switch (T.$SwitchMap$com$google$protobuf$WireFormat$FieldType[s5.ordinal()]) {
            case 1:
                return Boolean.valueOf(readBool());
            case 2:
                return readBytes();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(readEnum());
            case 5:
                return Integer.valueOf(readFixed32());
            case 6:
                return Long.valueOf(readFixed64());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(readInt32());
            case 9:
                return Long.valueOf(readInt64());
            case 10:
                return readMessage(cls, w1);
            case 11:
                return Integer.valueOf(readSFixed32());
            case 12:
                return Long.valueOf(readSFixed64());
            case 13:
                return Integer.valueOf(readSInt32());
            case 14:
                return Long.valueOf(readSInt64());
            case 15:
                return readStringRequireUtf8();
            case 16:
                return Integer.valueOf(readUInt32());
            case 17:
                return Long.valueOf(readUInt64());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private void requirePosition(int i9) throws IOException {
        if (this.input.getTotalBytesRead() == i9) {
        } else {
            throw C1912g3.truncatedMessage();
        }
    }

    private void requireWireType(int i9) throws IOException {
        if (Y5.getTagWireType(this.tag) == i9) {
        } else {
            throw C1912g3.invalidWireType();
        }
    }

    private void verifyPackedFixed32Length(int i9) throws IOException {
        if ((i9 & 3) == 0) {
        } else {
            throw C1912g3.parseFailure();
        }
    }

    private void verifyPackedFixed64Length(int i9) throws IOException {
        if ((i9 & 7) == 0) {
        } else {
            throw C1912g3.parseFailure();
        }
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public int getFieldNumber() throws IOException {
        int i9 = this.nextTag;
        if (i9 != 0) {
            this.tag = i9;
            this.nextTag = 0;
        } else {
            this.tag = this.input.readTag();
        }
        int i10 = this.tag;
        if (i10 != 0 && i10 != this.endGroupTag) {
            return Y5.getTagFieldNumber(i10);
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public int getTag() {
        return this.tag;
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public <T> void mergeGroupField(T t9, InterfaceC2038y4 interfaceC2038y4, W1 w1) throws IOException {
        requireWireType(3);
        mergeGroupFieldInternal(t9, interfaceC2038y4, w1);
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public <T> void mergeMessageField(T t9, InterfaceC2038y4 interfaceC2038y4, W1 w1) throws IOException {
        requireWireType(2);
        mergeMessageFieldInternal(t9, interfaceC2038y4, w1);
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public boolean readBool() throws IOException {
        requireWireType(0);
        return this.input.readBool();
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public void readBoolList(List<Boolean> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof C1991s) {
            C1991s c1991s = (C1991s) list;
            int tagWireType = Y5.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        c1991s.addBoolean(this.input.readBool());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw C1912g3.invalidWireType();
            }
            do {
                c1991s.addBoolean(this.input.readBool());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = Y5.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Boolean.valueOf(this.input.readBool()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw C1912g3.invalidWireType();
        }
        do {
            list.add(Boolean.valueOf(this.input.readBool()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public H readBytes() throws IOException {
        requireWireType(2);
        return this.input.readBytes();
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public void readBytesList(List<H> list) throws IOException {
        int readTag;
        if (Y5.getTagWireType(this.tag) != 2) {
            throw C1912g3.invalidWireType();
        }
        do {
            list.add(readBytes());
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public double readDouble() throws IOException {
        requireWireType(1);
        return this.input.readDouble();
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public void readDoubleList(List<Double> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof C1) {
            C1 c12 = (C1) list;
            int tagWireType = Y5.getTagWireType(this.tag);
            if (tagWireType != 1) {
                if (tagWireType == 2) {
                    int readUInt32 = this.input.readUInt32();
                    verifyPackedFixed64Length(readUInt32);
                    int totalBytesRead = this.input.getTotalBytesRead() + readUInt32;
                    do {
                        c12.addDouble(this.input.readDouble());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    return;
                }
                throw C1912g3.invalidWireType();
            }
            do {
                c12.addDouble(this.input.readDouble());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = Y5.getTagWireType(this.tag);
        if (tagWireType2 != 1) {
            if (tagWireType2 == 2) {
                int readUInt322 = this.input.readUInt32();
                verifyPackedFixed64Length(readUInt322);
                int totalBytesRead2 = this.input.getTotalBytesRead() + readUInt322;
                do {
                    list.add(Double.valueOf(this.input.readDouble()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                return;
            }
            throw C1912g3.invalidWireType();
        }
        do {
            list.add(Double.valueOf(this.input.readDouble()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public int readEnum() throws IOException {
        requireWireType(0);
        return this.input.readEnum();
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public void readEnumList(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof S2) {
            S2 s22 = (S2) list;
            int tagWireType = Y5.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        s22.addInt(this.input.readEnum());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw C1912g3.invalidWireType();
            }
            do {
                s22.addInt(this.input.readEnum());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = Y5.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Integer.valueOf(this.input.readEnum()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw C1912g3.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(this.input.readEnum()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public int readFixed32() throws IOException {
        requireWireType(5);
        return this.input.readFixed32();
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public void readFixed32List(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof S2) {
            S2 s22 = (S2) list;
            int tagWireType = Y5.getTagWireType(this.tag);
            if (tagWireType != 2) {
                if (tagWireType != 5) {
                    throw C1912g3.invalidWireType();
                }
                do {
                    s22.addInt(this.input.readFixed32());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.input.readTag();
                    }
                } while (readTag2 == this.tag);
                this.nextTag = readTag2;
                return;
            }
            int readUInt32 = this.input.readUInt32();
            verifyPackedFixed32Length(readUInt32);
            int totalBytesRead = this.input.getTotalBytesRead() + readUInt32;
            do {
                s22.addInt(this.input.readFixed32());
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            return;
        }
        int tagWireType2 = Y5.getTagWireType(this.tag);
        if (tagWireType2 != 2) {
            if (tagWireType2 != 5) {
                throw C1912g3.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.input.readFixed32()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        int readUInt322 = this.input.readUInt32();
        verifyPackedFixed32Length(readUInt322);
        int totalBytesRead2 = this.input.getTotalBytesRead() + readUInt322;
        do {
            list.add(Integer.valueOf(this.input.readFixed32()));
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public long readFixed64() throws IOException {
        requireWireType(1);
        return this.input.readFixed64();
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public void readFixed64List(List<Long> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof C2044z3) {
            C2044z3 c2044z3 = (C2044z3) list;
            int tagWireType = Y5.getTagWireType(this.tag);
            if (tagWireType != 1) {
                if (tagWireType == 2) {
                    int readUInt32 = this.input.readUInt32();
                    verifyPackedFixed64Length(readUInt32);
                    int totalBytesRead = this.input.getTotalBytesRead() + readUInt32;
                    do {
                        c2044z3.addLong(this.input.readFixed64());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    return;
                }
                throw C1912g3.invalidWireType();
            }
            do {
                c2044z3.addLong(this.input.readFixed64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = Y5.getTagWireType(this.tag);
        if (tagWireType2 != 1) {
            if (tagWireType2 == 2) {
                int readUInt322 = this.input.readUInt32();
                verifyPackedFixed64Length(readUInt322);
                int totalBytesRead2 = this.input.getTotalBytesRead() + readUInt322;
                do {
                    list.add(Long.valueOf(this.input.readFixed64()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                return;
            }
            throw C1912g3.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.input.readFixed64()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public float readFloat() throws IOException {
        requireWireType(5);
        return this.input.readFloat();
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public void readFloatList(List<Float> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof C2029x2) {
            C2029x2 c2029x2 = (C2029x2) list;
            int tagWireType = Y5.getTagWireType(this.tag);
            if (tagWireType != 2) {
                if (tagWireType != 5) {
                    throw C1912g3.invalidWireType();
                }
                do {
                    c2029x2.addFloat(this.input.readFloat());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.input.readTag();
                    }
                } while (readTag2 == this.tag);
                this.nextTag = readTag2;
                return;
            }
            int readUInt32 = this.input.readUInt32();
            verifyPackedFixed32Length(readUInt32);
            int totalBytesRead = this.input.getTotalBytesRead() + readUInt32;
            do {
                c2029x2.addFloat(this.input.readFloat());
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            return;
        }
        int tagWireType2 = Y5.getTagWireType(this.tag);
        if (tagWireType2 != 2) {
            if (tagWireType2 != 5) {
                throw C1912g3.invalidWireType();
            }
            do {
                list.add(Float.valueOf(this.input.readFloat()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        int readUInt322 = this.input.readUInt32();
        verifyPackedFixed32Length(readUInt322);
        int totalBytesRead2 = this.input.getTotalBytesRead() + readUInt322;
        do {
            list.add(Float.valueOf(this.input.readFloat()));
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    @Deprecated
    public <T> T readGroup(Class<T> cls, W1 w1) throws IOException {
        requireWireType(3);
        return (T) readGroup(C1969o4.getInstance().schemaFor((Class) cls), w1);
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    @Deprecated
    public <T> T readGroupBySchemaWithCheck(InterfaceC2038y4 interfaceC2038y4, W1 w1) throws IOException {
        requireWireType(3);
        return (T) readGroup(interfaceC2038y4, w1);
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    @Deprecated
    public <T> void readGroupList(List<T> list, Class<T> cls, W1 w1) throws IOException {
        readGroupList(list, C1969o4.getInstance().schemaFor((Class) cls), w1);
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public int readInt32() throws IOException {
        requireWireType(0);
        return this.input.readInt32();
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public void readInt32List(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof S2) {
            S2 s22 = (S2) list;
            int tagWireType = Y5.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        s22.addInt(this.input.readInt32());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw C1912g3.invalidWireType();
            }
            do {
                s22.addInt(this.input.readInt32());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = Y5.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Integer.valueOf(this.input.readInt32()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw C1912g3.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(this.input.readInt32()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public long readInt64() throws IOException {
        requireWireType(0);
        return this.input.readInt64();
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public void readInt64List(List<Long> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof C2044z3) {
            C2044z3 c2044z3 = (C2044z3) list;
            int tagWireType = Y5.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        c2044z3.addLong(this.input.readInt64());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw C1912g3.invalidWireType();
            }
            do {
                c2044z3.addLong(this.input.readInt64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = Y5.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Long.valueOf(this.input.readInt64()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw C1912g3.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.input.readInt64()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0061, code lost:
    
        r7.input.popLimit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.InterfaceC1996s4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <K, V> void readMap(java.util.Map<K, V> r8, com.google.protobuf.E3 r9, com.google.protobuf.W1 r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.requireWireType(r0)
            com.google.protobuf.S r1 = r7.input
            int r1 = r1.readUInt32()
            com.google.protobuf.S r2 = r7.input
            int r1 = r2.pushLimit(r1)
            java.lang.Object r2 = r9.defaultKey
            java.lang.Object r3 = r9.defaultValue
        L14:
            int r4 = r7.getFieldNumber()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            com.google.protobuf.S r5 = r7.input     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.isAtEnd()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.skipField()     // Catch: java.lang.Throwable -> L3a com.google.protobuf.C1905f3 -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            com.google.protobuf.g3 r4 = new com.google.protobuf.g3     // Catch: java.lang.Throwable -> L3a com.google.protobuf.C1905f3 -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.C1905f3 -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a com.google.protobuf.C1905f3 -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            com.google.protobuf.S5 r4 = r9.valueType     // Catch: java.lang.Throwable -> L3a com.google.protobuf.C1905f3 -> L51
            java.lang.Object r5 = r9.defaultValue     // Catch: java.lang.Throwable -> L3a com.google.protobuf.C1905f3 -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a com.google.protobuf.C1905f3 -> L51
            java.lang.Object r3 = r7.readField(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.C1905f3 -> L51
            goto L14
        L49:
            com.google.protobuf.S5 r4 = r9.keyType     // Catch: java.lang.Throwable -> L3a com.google.protobuf.C1905f3 -> L51
            r5 = 0
            java.lang.Object r2 = r7.readField(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.C1905f3 -> L51
            goto L14
        L51:
            boolean r4 = r7.skipField()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            com.google.protobuf.g3 r8 = new com.google.protobuf.g3     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            com.google.protobuf.S r8 = r7.input
            r8.popLimit(r1)
            return
        L67:
            com.google.protobuf.S r9 = r7.input
            r9.popLimit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.U.readMap(java.util.Map, com.google.protobuf.E3, com.google.protobuf.W1):void");
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public <T> T readMessage(Class<T> cls, W1 w1) throws IOException {
        requireWireType(2);
        return (T) readMessage(C1969o4.getInstance().schemaFor((Class) cls), w1);
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public <T> T readMessageBySchemaWithCheck(InterfaceC2038y4 interfaceC2038y4, W1 w1) throws IOException {
        requireWireType(2);
        return (T) readMessage(interfaceC2038y4, w1);
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public <T> void readMessageList(List<T> list, Class<T> cls, W1 w1) throws IOException {
        readMessageList(list, C1969o4.getInstance().schemaFor((Class) cls), w1);
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public int readSFixed32() throws IOException {
        requireWireType(5);
        return this.input.readSFixed32();
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public void readSFixed32List(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof S2) {
            S2 s22 = (S2) list;
            int tagWireType = Y5.getTagWireType(this.tag);
            if (tagWireType != 2) {
                if (tagWireType != 5) {
                    throw C1912g3.invalidWireType();
                }
                do {
                    s22.addInt(this.input.readSFixed32());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.input.readTag();
                    }
                } while (readTag2 == this.tag);
                this.nextTag = readTag2;
                return;
            }
            int readUInt32 = this.input.readUInt32();
            verifyPackedFixed32Length(readUInt32);
            int totalBytesRead = this.input.getTotalBytesRead() + readUInt32;
            do {
                s22.addInt(this.input.readSFixed32());
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            return;
        }
        int tagWireType2 = Y5.getTagWireType(this.tag);
        if (tagWireType2 != 2) {
            if (tagWireType2 != 5) {
                throw C1912g3.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.input.readSFixed32()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        int readUInt322 = this.input.readUInt32();
        verifyPackedFixed32Length(readUInt322);
        int totalBytesRead2 = this.input.getTotalBytesRead() + readUInt322;
        do {
            list.add(Integer.valueOf(this.input.readSFixed32()));
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public long readSFixed64() throws IOException {
        requireWireType(1);
        return this.input.readSFixed64();
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public void readSFixed64List(List<Long> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof C2044z3) {
            C2044z3 c2044z3 = (C2044z3) list;
            int tagWireType = Y5.getTagWireType(this.tag);
            if (tagWireType != 1) {
                if (tagWireType == 2) {
                    int readUInt32 = this.input.readUInt32();
                    verifyPackedFixed64Length(readUInt32);
                    int totalBytesRead = this.input.getTotalBytesRead() + readUInt32;
                    do {
                        c2044z3.addLong(this.input.readSFixed64());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    return;
                }
                throw C1912g3.invalidWireType();
            }
            do {
                c2044z3.addLong(this.input.readSFixed64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = Y5.getTagWireType(this.tag);
        if (tagWireType2 != 1) {
            if (tagWireType2 == 2) {
                int readUInt322 = this.input.readUInt32();
                verifyPackedFixed64Length(readUInt322);
                int totalBytesRead2 = this.input.getTotalBytesRead() + readUInt322;
                do {
                    list.add(Long.valueOf(this.input.readSFixed64()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                return;
            }
            throw C1912g3.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.input.readSFixed64()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public int readSInt32() throws IOException {
        requireWireType(0);
        return this.input.readSInt32();
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public void readSInt32List(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof S2) {
            S2 s22 = (S2) list;
            int tagWireType = Y5.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        s22.addInt(this.input.readSInt32());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw C1912g3.invalidWireType();
            }
            do {
                s22.addInt(this.input.readSInt32());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = Y5.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Integer.valueOf(this.input.readSInt32()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw C1912g3.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(this.input.readSInt32()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public long readSInt64() throws IOException {
        requireWireType(0);
        return this.input.readSInt64();
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public void readSInt64List(List<Long> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof C2044z3) {
            C2044z3 c2044z3 = (C2044z3) list;
            int tagWireType = Y5.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        c2044z3.addLong(this.input.readSInt64());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw C1912g3.invalidWireType();
            }
            do {
                c2044z3.addLong(this.input.readSInt64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = Y5.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Long.valueOf(this.input.readSInt64()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw C1912g3.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.input.readSInt64()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public String readString() throws IOException {
        requireWireType(2);
        return this.input.readString();
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public void readStringList(List<String> list) throws IOException {
        readStringListInternal(list, false);
    }

    public void readStringListInternal(List<String> list, boolean z8) throws IOException {
        String readString;
        int readTag;
        int readTag2;
        if (Y5.getTagWireType(this.tag) == 2) {
            if ((list instanceof InterfaceC1988r3) && !z8) {
                InterfaceC1988r3 interfaceC1988r3 = (InterfaceC1988r3) list;
                do {
                    interfaceC1988r3.add(readBytes());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.input.readTag();
                    }
                } while (readTag2 == this.tag);
                this.nextTag = readTag2;
                return;
            }
            do {
                if (z8) {
                    readString = readStringRequireUtf8();
                } else {
                    readString = readString();
                }
                list.add(readString);
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        throw C1912g3.invalidWireType();
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public void readStringListRequireUtf8(List<String> list) throws IOException {
        readStringListInternal(list, true);
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public String readStringRequireUtf8() throws IOException {
        requireWireType(2);
        return this.input.readStringRequireUtf8();
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public int readUInt32() throws IOException {
        requireWireType(0);
        return this.input.readUInt32();
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public void readUInt32List(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof S2) {
            S2 s22 = (S2) list;
            int tagWireType = Y5.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        s22.addInt(this.input.readUInt32());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw C1912g3.invalidWireType();
            }
            do {
                s22.addInt(this.input.readUInt32());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = Y5.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Integer.valueOf(this.input.readUInt32()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw C1912g3.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(this.input.readUInt32()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public long readUInt64() throws IOException {
        requireWireType(0);
        return this.input.readUInt64();
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public void readUInt64List(List<Long> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof C2044z3) {
            C2044z3 c2044z3 = (C2044z3) list;
            int tagWireType = Y5.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        c2044z3.addLong(this.input.readUInt64());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw C1912g3.invalidWireType();
            }
            do {
                c2044z3.addLong(this.input.readUInt64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = Y5.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Long.valueOf(this.input.readUInt64()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw C1912g3.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.input.readUInt64()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public boolean shouldDiscardUnknownFields() {
        return this.input.shouldDiscardUnknownFields();
    }

    @Override // com.google.protobuf.InterfaceC1996s4
    public boolean skipField() throws IOException {
        int i9;
        if (!this.input.isAtEnd() && (i9 = this.tag) != this.endGroupTag) {
            return this.input.skipField(i9);
        }
        return false;
    }

    private <T> T readGroup(InterfaceC2038y4 interfaceC2038y4, W1 w1) throws IOException {
        T t9 = (T) interfaceC2038y4.newInstance();
        mergeGroupFieldInternal(t9, interfaceC2038y4, w1);
        interfaceC2038y4.makeImmutable(t9);
        return t9;
    }

    private <T> T readMessage(InterfaceC2038y4 interfaceC2038y4, W1 w1) throws IOException {
        T t9 = (T) interfaceC2038y4.newInstance();
        mergeMessageFieldInternal(t9, interfaceC2038y4, w1);
        interfaceC2038y4.makeImmutable(t9);
        return t9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.InterfaceC1996s4
    @Deprecated
    public <T> void readGroupList(List<T> list, InterfaceC2038y4 interfaceC2038y4, W1 w1) throws IOException {
        int readTag;
        if (Y5.getTagWireType(this.tag) == 3) {
            int i9 = this.tag;
            do {
                list.add(readGroup(interfaceC2038y4, w1));
                if (this.input.isAtEnd() || this.nextTag != 0) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == i9);
            this.nextTag = readTag;
            return;
        }
        throw C1912g3.invalidWireType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.InterfaceC1996s4
    public <T> void readMessageList(List<T> list, InterfaceC2038y4 interfaceC2038y4, W1 w1) throws IOException {
        int readTag;
        if (Y5.getTagWireType(this.tag) == 2) {
            int i9 = this.tag;
            do {
                list.add(readMessage(interfaceC2038y4, w1));
                if (this.input.isAtEnd() || this.nextTag != 0) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == i9);
            this.nextTag = readTag;
            return;
        }
        throw C1912g3.invalidWireType();
    }
}
