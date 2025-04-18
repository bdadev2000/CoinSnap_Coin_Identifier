package com.google.protobuf;

import java.io.IOException;
import java.util.List;

/* loaded from: classes4.dex */
public final class t0 implements t6 {
    private static final int FIXED32_MULTIPLE_MASK = 3;
    private static final int FIXED64_MULTIPLE_MASK = 7;
    private static final int NEXT_TAG_UNSET = 0;
    private int endGroupTag;
    private final r0 input;
    private int nextTag = 0;
    private int tag;

    private t0(r0 r0Var) {
        r0 r0Var2 = (r0) f4.checkNotNull(r0Var, "input");
        this.input = r0Var2;
        r0Var2.wrapper = this;
    }

    public static t0 forCodedInput(r0 r0Var) {
        t0 t0Var = r0Var.wrapper;
        if (t0Var != null) {
            return t0Var;
        }
        return new t0(r0Var);
    }

    private <T> void mergeGroupFieldInternal(T t5, z6 z6Var, a2 a2Var) throws IOException {
        int i10 = this.endGroupTag;
        this.endGroupTag = z9.makeTag(z9.getTagFieldNumber(this.tag), 4);
        try {
            z6Var.mergeFrom(t5, this, a2Var);
            if (this.tag == this.endGroupTag) {
            } else {
                throw h4.parseFailure();
            }
        } finally {
            this.endGroupTag = i10;
        }
    }

    private <T> void mergeMessageFieldInternal(T t5, z6 z6Var, a2 a2Var) throws IOException {
        int readUInt32 = this.input.readUInt32();
        r0 r0Var = this.input;
        if (r0Var.recursionDepth < r0Var.recursionLimit) {
            int pushLimit = r0Var.pushLimit(readUInt32);
            this.input.recursionDepth++;
            z6Var.mergeFrom(t5, this, a2Var);
            this.input.checkLastTagWas(0);
            r5.recursionDepth--;
            this.input.popLimit(pushLimit);
            return;
        }
        throw h4.recursionLimitExceeded();
    }

    private Object readField(t9 t9Var, Class<?> cls, a2 a2Var) throws IOException {
        switch (s0.$SwitchMap$com$google$protobuf$WireFormat$FieldType[t9Var.ordinal()]) {
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
                return readMessage(cls, a2Var);
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

    private void requirePosition(int i10) throws IOException {
        if (this.input.getTotalBytesRead() == i10) {
        } else {
            throw h4.truncatedMessage();
        }
    }

    private void requireWireType(int i10) throws IOException {
        if (z9.getTagWireType(this.tag) == i10) {
        } else {
            throw h4.invalidWireType();
        }
    }

    private void verifyPackedFixed32Length(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw h4.parseFailure();
        }
    }

    private void verifyPackedFixed64Length(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw h4.parseFailure();
        }
    }

    @Override // com.google.protobuf.t6
    public int getFieldNumber() throws IOException {
        int i10 = this.nextTag;
        if (i10 != 0) {
            this.tag = i10;
            this.nextTag = 0;
        } else {
            this.tag = this.input.readTag();
        }
        int i11 = this.tag;
        if (i11 != 0 && i11 != this.endGroupTag) {
            return z9.getTagFieldNumber(i11);
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.t6
    public int getTag() {
        return this.tag;
    }

    @Override // com.google.protobuf.t6
    public <T> void mergeGroupField(T t5, z6 z6Var, a2 a2Var) throws IOException {
        requireWireType(3);
        mergeGroupFieldInternal(t5, z6Var, a2Var);
    }

    @Override // com.google.protobuf.t6
    public <T> void mergeMessageField(T t5, z6 z6Var, a2 a2Var) throws IOException {
        requireWireType(2);
        mergeMessageFieldInternal(t5, z6Var, a2Var);
    }

    @Override // com.google.protobuf.t6
    public boolean readBool() throws IOException {
        requireWireType(0);
        return this.input.readBool();
    }

    @Override // com.google.protobuf.t6
    public void readBoolList(List<Boolean> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof s) {
            s sVar = (s) list;
            int tagWireType = z9.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        sVar.addBoolean(this.input.readBool());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw h4.invalidWireType();
            }
            do {
                sVar.addBoolean(this.input.readBool());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = z9.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Boolean.valueOf(this.input.readBool()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw h4.invalidWireType();
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

    @Override // com.google.protobuf.t6
    public h0 readBytes() throws IOException {
        requireWireType(2);
        return this.input.readBytes();
    }

    @Override // com.google.protobuf.t6
    public void readBytesList(List<h0> list) throws IOException {
        int readTag;
        if (z9.getTagWireType(this.tag) != 2) {
            throw h4.invalidWireType();
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

    @Override // com.google.protobuf.t6
    public double readDouble() throws IOException {
        requireWireType(1);
        return this.input.readDouble();
    }

    @Override // com.google.protobuf.t6
    public void readDoubleList(List<Double> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof g1) {
            g1 g1Var = (g1) list;
            int tagWireType = z9.getTagWireType(this.tag);
            if (tagWireType != 1) {
                if (tagWireType == 2) {
                    int readUInt32 = this.input.readUInt32();
                    verifyPackedFixed64Length(readUInt32);
                    int totalBytesRead = this.input.getTotalBytesRead() + readUInt32;
                    do {
                        g1Var.addDouble(this.input.readDouble());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    return;
                }
                throw h4.invalidWireType();
            }
            do {
                g1Var.addDouble(this.input.readDouble());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = z9.getTagWireType(this.tag);
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
            throw h4.invalidWireType();
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

    @Override // com.google.protobuf.t6
    public int readEnum() throws IOException {
        requireWireType(0);
        return this.input.readEnum();
    }

    @Override // com.google.protobuf.t6
    public void readEnumList(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof v3) {
            v3 v3Var = (v3) list;
            int tagWireType = z9.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        v3Var.addInt(this.input.readEnum());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw h4.invalidWireType();
            }
            do {
                v3Var.addInt(this.input.readEnum());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = z9.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Integer.valueOf(this.input.readEnum()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw h4.invalidWireType();
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

    @Override // com.google.protobuf.t6
    public int readFixed32() throws IOException {
        requireWireType(5);
        return this.input.readFixed32();
    }

    @Override // com.google.protobuf.t6
    public void readFixed32List(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof v3) {
            v3 v3Var = (v3) list;
            int tagWireType = z9.getTagWireType(this.tag);
            if (tagWireType != 2) {
                if (tagWireType != 5) {
                    throw h4.invalidWireType();
                }
                do {
                    v3Var.addInt(this.input.readFixed32());
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
                v3Var.addInt(this.input.readFixed32());
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            return;
        }
        int tagWireType2 = z9.getTagWireType(this.tag);
        if (tagWireType2 != 2) {
            if (tagWireType2 != 5) {
                throw h4.invalidWireType();
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

    @Override // com.google.protobuf.t6
    public long readFixed64() throws IOException {
        requireWireType(1);
        return this.input.readFixed64();
    }

    @Override // com.google.protobuf.t6
    public void readFixed64List(List<Long> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof a5) {
            a5 a5Var = (a5) list;
            int tagWireType = z9.getTagWireType(this.tag);
            if (tagWireType != 1) {
                if (tagWireType == 2) {
                    int readUInt32 = this.input.readUInt32();
                    verifyPackedFixed64Length(readUInt32);
                    int totalBytesRead = this.input.getTotalBytesRead() + readUInt32;
                    do {
                        a5Var.addLong(this.input.readFixed64());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    return;
                }
                throw h4.invalidWireType();
            }
            do {
                a5Var.addLong(this.input.readFixed64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = z9.getTagWireType(this.tag);
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
            throw h4.invalidWireType();
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

    @Override // com.google.protobuf.t6
    public float readFloat() throws IOException {
        requireWireType(5);
        return this.input.readFloat();
    }

    @Override // com.google.protobuf.t6
    public void readFloatList(List<Float> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof b3) {
            b3 b3Var = (b3) list;
            int tagWireType = z9.getTagWireType(this.tag);
            if (tagWireType != 2) {
                if (tagWireType != 5) {
                    throw h4.invalidWireType();
                }
                do {
                    b3Var.addFloat(this.input.readFloat());
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
                b3Var.addFloat(this.input.readFloat());
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            return;
        }
        int tagWireType2 = z9.getTagWireType(this.tag);
        if (tagWireType2 != 2) {
            if (tagWireType2 != 5) {
                throw h4.invalidWireType();
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

    @Override // com.google.protobuf.t6
    @Deprecated
    public <T> T readGroup(Class<T> cls, a2 a2Var) throws IOException {
        requireWireType(3);
        return (T) readGroup(p6.getInstance().schemaFor((Class) cls), a2Var);
    }

    @Override // com.google.protobuf.t6
    @Deprecated
    public <T> T readGroupBySchemaWithCheck(z6 z6Var, a2 a2Var) throws IOException {
        requireWireType(3);
        return (T) readGroup(z6Var, a2Var);
    }

    @Override // com.google.protobuf.t6
    @Deprecated
    public <T> void readGroupList(List<T> list, Class<T> cls, a2 a2Var) throws IOException {
        readGroupList(list, p6.getInstance().schemaFor((Class) cls), a2Var);
    }

    @Override // com.google.protobuf.t6
    public int readInt32() throws IOException {
        requireWireType(0);
        return this.input.readInt32();
    }

    @Override // com.google.protobuf.t6
    public void readInt32List(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof v3) {
            v3 v3Var = (v3) list;
            int tagWireType = z9.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        v3Var.addInt(this.input.readInt32());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw h4.invalidWireType();
            }
            do {
                v3Var.addInt(this.input.readInt32());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = z9.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Integer.valueOf(this.input.readInt32()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw h4.invalidWireType();
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

    @Override // com.google.protobuf.t6
    public long readInt64() throws IOException {
        requireWireType(0);
        return this.input.readInt64();
    }

    @Override // com.google.protobuf.t6
    public void readInt64List(List<Long> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof a5) {
            a5 a5Var = (a5) list;
            int tagWireType = z9.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        a5Var.addLong(this.input.readInt64());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw h4.invalidWireType();
            }
            do {
                a5Var.addLong(this.input.readInt64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = z9.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Long.valueOf(this.input.readInt64()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw h4.invalidWireType();
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

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005c, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.t6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <K, V> void readMap(java.util.Map<K, V> r8, com.google.protobuf.f5 r9, com.google.protobuf.a2 r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.requireWireType(r0)
            com.google.protobuf.r0 r1 = r7.input
            int r1 = r1.readUInt32()
            com.google.protobuf.r0 r2 = r7.input
            int r1 = r2.pushLimit(r1)
            java.lang.Object r2 = r9.defaultKey
            java.lang.Object r3 = r9.defaultValue
        L14:
            int r4 = r7.getFieldNumber()     // Catch: java.lang.Throwable -> L65
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5c
            com.google.protobuf.r0 r5 = r7.input     // Catch: java.lang.Throwable -> L65
            boolean r5 = r5.isAtEnd()     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L26
            goto L5c
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L47
            if (r4 == r0) goto L3a
            boolean r4 = r7.skipField()     // Catch: com.google.protobuf.g4 -> L4f java.lang.Throwable -> L65
            if (r4 == 0) goto L34
            goto L14
        L34:
            com.google.protobuf.h4 r4 = new com.google.protobuf.h4     // Catch: com.google.protobuf.g4 -> L4f java.lang.Throwable -> L65
            r4.<init>(r6)     // Catch: com.google.protobuf.g4 -> L4f java.lang.Throwable -> L65
            throw r4     // Catch: com.google.protobuf.g4 -> L4f java.lang.Throwable -> L65
        L3a:
            com.google.protobuf.t9 r4 = r9.valueType     // Catch: com.google.protobuf.g4 -> L4f java.lang.Throwable -> L65
            java.lang.Object r5 = r9.defaultValue     // Catch: com.google.protobuf.g4 -> L4f java.lang.Throwable -> L65
            java.lang.Class r5 = r5.getClass()     // Catch: com.google.protobuf.g4 -> L4f java.lang.Throwable -> L65
            java.lang.Object r3 = r7.readField(r4, r5, r10)     // Catch: com.google.protobuf.g4 -> L4f java.lang.Throwable -> L65
            goto L14
        L47:
            com.google.protobuf.t9 r4 = r9.keyType     // Catch: com.google.protobuf.g4 -> L4f java.lang.Throwable -> L65
            r5 = 0
            java.lang.Object r2 = r7.readField(r4, r5, r5)     // Catch: com.google.protobuf.g4 -> L4f java.lang.Throwable -> L65
            goto L14
        L4f:
            boolean r4 = r7.skipField()     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L56
            goto L14
        L56:
            com.google.protobuf.h4 r8 = new com.google.protobuf.h4     // Catch: java.lang.Throwable -> L65
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L5c:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L65
            com.google.protobuf.r0 r8 = r7.input
            r8.popLimit(r1)
            return
        L65:
            r8 = move-exception
            com.google.protobuf.r0 r9 = r7.input
            r9.popLimit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.t0.readMap(java.util.Map, com.google.protobuf.f5, com.google.protobuf.a2):void");
    }

    @Override // com.google.protobuf.t6
    public <T> T readMessage(Class<T> cls, a2 a2Var) throws IOException {
        requireWireType(2);
        return (T) readMessage(p6.getInstance().schemaFor((Class) cls), a2Var);
    }

    @Override // com.google.protobuf.t6
    public <T> T readMessageBySchemaWithCheck(z6 z6Var, a2 a2Var) throws IOException {
        requireWireType(2);
        return (T) readMessage(z6Var, a2Var);
    }

    @Override // com.google.protobuf.t6
    public <T> void readMessageList(List<T> list, Class<T> cls, a2 a2Var) throws IOException {
        readMessageList(list, p6.getInstance().schemaFor((Class) cls), a2Var);
    }

    @Override // com.google.protobuf.t6
    public int readSFixed32() throws IOException {
        requireWireType(5);
        return this.input.readSFixed32();
    }

    @Override // com.google.protobuf.t6
    public void readSFixed32List(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof v3) {
            v3 v3Var = (v3) list;
            int tagWireType = z9.getTagWireType(this.tag);
            if (tagWireType != 2) {
                if (tagWireType != 5) {
                    throw h4.invalidWireType();
                }
                do {
                    v3Var.addInt(this.input.readSFixed32());
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
                v3Var.addInt(this.input.readSFixed32());
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            return;
        }
        int tagWireType2 = z9.getTagWireType(this.tag);
        if (tagWireType2 != 2) {
            if (tagWireType2 != 5) {
                throw h4.invalidWireType();
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

    @Override // com.google.protobuf.t6
    public long readSFixed64() throws IOException {
        requireWireType(1);
        return this.input.readSFixed64();
    }

    @Override // com.google.protobuf.t6
    public void readSFixed64List(List<Long> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof a5) {
            a5 a5Var = (a5) list;
            int tagWireType = z9.getTagWireType(this.tag);
            if (tagWireType != 1) {
                if (tagWireType == 2) {
                    int readUInt32 = this.input.readUInt32();
                    verifyPackedFixed64Length(readUInt32);
                    int totalBytesRead = this.input.getTotalBytesRead() + readUInt32;
                    do {
                        a5Var.addLong(this.input.readSFixed64());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    return;
                }
                throw h4.invalidWireType();
            }
            do {
                a5Var.addLong(this.input.readSFixed64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = z9.getTagWireType(this.tag);
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
            throw h4.invalidWireType();
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

    @Override // com.google.protobuf.t6
    public int readSInt32() throws IOException {
        requireWireType(0);
        return this.input.readSInt32();
    }

    @Override // com.google.protobuf.t6
    public void readSInt32List(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof v3) {
            v3 v3Var = (v3) list;
            int tagWireType = z9.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        v3Var.addInt(this.input.readSInt32());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw h4.invalidWireType();
            }
            do {
                v3Var.addInt(this.input.readSInt32());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = z9.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Integer.valueOf(this.input.readSInt32()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw h4.invalidWireType();
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

    @Override // com.google.protobuf.t6
    public long readSInt64() throws IOException {
        requireWireType(0);
        return this.input.readSInt64();
    }

    @Override // com.google.protobuf.t6
    public void readSInt64List(List<Long> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof a5) {
            a5 a5Var = (a5) list;
            int tagWireType = z9.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        a5Var.addLong(this.input.readSInt64());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw h4.invalidWireType();
            }
            do {
                a5Var.addLong(this.input.readSInt64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = z9.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Long.valueOf(this.input.readSInt64()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw h4.invalidWireType();
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

    @Override // com.google.protobuf.t6
    public String readString() throws IOException {
        requireWireType(2);
        return this.input.readString();
    }

    @Override // com.google.protobuf.t6
    public void readStringList(List<String> list) throws IOException {
        readStringListInternal(list, false);
    }

    public void readStringListInternal(List<String> list, boolean z10) throws IOException {
        String readString;
        int readTag;
        int readTag2;
        if (z9.getTagWireType(this.tag) == 2) {
            if ((list instanceof s4) && !z10) {
                s4 s4Var = (s4) list;
                do {
                    s4Var.add(readBytes());
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
                if (z10) {
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
        throw h4.invalidWireType();
    }

    @Override // com.google.protobuf.t6
    public void readStringListRequireUtf8(List<String> list) throws IOException {
        readStringListInternal(list, true);
    }

    @Override // com.google.protobuf.t6
    public String readStringRequireUtf8() throws IOException {
        requireWireType(2);
        return this.input.readStringRequireUtf8();
    }

    @Override // com.google.protobuf.t6
    public int readUInt32() throws IOException {
        requireWireType(0);
        return this.input.readUInt32();
    }

    @Override // com.google.protobuf.t6
    public void readUInt32List(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof v3) {
            v3 v3Var = (v3) list;
            int tagWireType = z9.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        v3Var.addInt(this.input.readUInt32());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw h4.invalidWireType();
            }
            do {
                v3Var.addInt(this.input.readUInt32());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = z9.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Integer.valueOf(this.input.readUInt32()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw h4.invalidWireType();
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

    @Override // com.google.protobuf.t6
    public long readUInt64() throws IOException {
        requireWireType(0);
        return this.input.readUInt64();
    }

    @Override // com.google.protobuf.t6
    public void readUInt64List(List<Long> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof a5) {
            a5 a5Var = (a5) list;
            int tagWireType = z9.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        a5Var.addLong(this.input.readUInt64());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw h4.invalidWireType();
            }
            do {
                a5Var.addLong(this.input.readUInt64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = z9.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Long.valueOf(this.input.readUInt64()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw h4.invalidWireType();
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

    @Override // com.google.protobuf.t6
    public boolean shouldDiscardUnknownFields() {
        return this.input.shouldDiscardUnknownFields();
    }

    @Override // com.google.protobuf.t6
    public boolean skipField() throws IOException {
        int i10;
        if (!this.input.isAtEnd() && (i10 = this.tag) != this.endGroupTag) {
            return this.input.skipField(i10);
        }
        return false;
    }

    private <T> T readGroup(z6 z6Var, a2 a2Var) throws IOException {
        T t5 = (T) z6Var.newInstance();
        mergeGroupFieldInternal(t5, z6Var, a2Var);
        z6Var.makeImmutable(t5);
        return t5;
    }

    private <T> T readMessage(z6 z6Var, a2 a2Var) throws IOException {
        T t5 = (T) z6Var.newInstance();
        mergeMessageFieldInternal(t5, z6Var, a2Var);
        z6Var.makeImmutable(t5);
        return t5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.t6
    @Deprecated
    public <T> void readGroupList(List<T> list, z6 z6Var, a2 a2Var) throws IOException {
        int readTag;
        if (z9.getTagWireType(this.tag) == 3) {
            int i10 = this.tag;
            do {
                list.add(readGroup(z6Var, a2Var));
                if (this.input.isAtEnd() || this.nextTag != 0) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == i10);
            this.nextTag = readTag;
            return;
        }
        throw h4.invalidWireType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.t6
    public <T> void readMessageList(List<T> list, z6 z6Var, a2 a2Var) throws IOException {
        int readTag;
        if (z9.getTagWireType(this.tag) == 2) {
            int i10 = this.tag;
            do {
                list.add(readMessage(z6Var, a2Var));
                if (this.input.isAtEnd() || this.nextTag != 0) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == i10);
            this.nextTag = readTag;
            return;
        }
        throw h4.invalidWireType();
    }
}
