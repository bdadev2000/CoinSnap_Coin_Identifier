package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public abstract class o3 extends c {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, o3> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected t8 unknownFields = t8.getDefaultInstance();

    public static /* synthetic */ m3 access$000(w1 w1Var) {
        return checkIsLite(w1Var);
    }

    public static <MessageType extends GeneratedMessageLite$ExtendableMessage<MessageType, BuilderType>, BuilderType, T> m3 checkIsLite(w1 w1Var) {
        if (w1Var.isLite()) {
            return (m3) w1Var;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    private static <T extends o3> T checkMessageInitialized(T t5) throws h4 {
        if (t5 != null && !t5.isInitialized()) {
            throw t5.newUninitializedMessageException().asInvalidProtocolBufferException().setUnfinishedMessage(t5);
        }
        return t5;
    }

    private int computeSerializedSize(z6 z6Var) {
        if (z6Var == null) {
            return p6.getInstance().schemaFor((p6) this).getSerializedSize(this);
        }
        return z6Var.getSerializedSize(this);
    }

    public static w3 emptyBooleanList() {
        return s.emptyList();
    }

    public static x3 emptyDoubleList() {
        return g1.emptyList();
    }

    public static b4 emptyFloatList() {
        return b3.emptyList();
    }

    public static c4 emptyIntList() {
        return v3.emptyList();
    }

    public static d4 emptyLongList() {
        return a5.emptyList();
    }

    public static <E> e4 emptyProtobufList() {
        return q6.emptyList();
    }

    private final void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == t8.getDefaultInstance()) {
            this.unknownFields = t8.newInstance();
        }
    }

    public static <T extends o3> T getDefaultInstance(Class<T> cls) {
        o3 o3Var = defaultInstanceMap.get(cls);
        if (o3Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                o3Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (o3Var == null) {
            o3Var = (T) ((o3) d9.allocateInstance(cls)).getDefaultInstanceForType();
            if (o3Var != null) {
                defaultInstanceMap.put(cls, o3Var);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) o3Var;
    }

    static java.lang.reflect.Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e2);
        }
    }

    public static Object invokeOrDie(java.lang.reflect.Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static c4 mutableCopy(c4 c4Var) {
        int size = c4Var.size();
        return ((v3) c4Var).mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static Object newMessageInfo(o5 o5Var, String str, Object[] objArr) {
        return new s6(o5Var, str, objArr);
    }

    public static <ContainingType extends o5, Type> m3 newRepeatedGeneratedExtension(ContainingType containingtype, o5 o5Var, z3 z3Var, int i10, t9 t9Var, boolean z10, Class cls) {
        return new m3(containingtype, Collections.emptyList(), o5Var, new l3(z3Var, i10, t9Var, true, z10), cls);
    }

    public static <ContainingType extends o5, Type> m3 newSingularGeneratedExtension(ContainingType containingtype, Type type, o5 o5Var, z3 z3Var, int i10, t9 t9Var, Class cls) {
        return new m3(containingtype, type, o5Var, new l3(z3Var, i10, t9Var, false, false), cls);
    }

    public static <T extends o3> T parseDelimitedFrom(T t5, InputStream inputStream) throws h4 {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t5, inputStream, a2.getEmptyRegistry()));
    }

    public static <T extends o3> T parseFrom(T t5, ByteBuffer byteBuffer, a2 a2Var) throws h4 {
        return (T) checkMessageInitialized(parseFrom(t5, r0.newInstance(byteBuffer), a2Var));
    }

    private static <T extends o3> T parsePartialDelimitedFrom(T t5, InputStream inputStream, a2 a2Var) throws h4 {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            r0 newInstance = r0.newInstance(new a(inputStream, r0.readRawVarint32(read, inputStream)));
            T t10 = (T) parsePartialFrom(t5, newInstance, a2Var);
            try {
                newInstance.checkLastTagWas(0);
                return t10;
            } catch (h4 e2) {
                throw e2.setUnfinishedMessage(t10);
            }
        } catch (h4 e10) {
            if (e10.getThrownFromInputStream()) {
                throw new h4((IOException) e10);
            }
            throw e10;
        } catch (IOException e11) {
            throw new h4(e11);
        }
    }

    public static <T extends o3> T parsePartialFrom(T t5, r0 r0Var, a2 a2Var) throws h4 {
        T t10 = (T) t5.newMutableInstance();
        try {
            z6 schemaFor = p6.getInstance().schemaFor((p6) t10);
            schemaFor.mergeFrom(t10, t0.forCodedInput(r0Var), a2Var);
            schemaFor.makeImmutable(t10);
            return t10;
        } catch (h4 e2) {
            e = e2;
            if (e.getThrownFromInputStream()) {
                e = new h4((IOException) e);
            }
            throw e.setUnfinishedMessage(t10);
        } catch (r8 e10) {
            throw e10.asInvalidProtocolBufferException().setUnfinishedMessage(t10);
        } catch (IOException e11) {
            if (e11.getCause() instanceof h4) {
                throw ((h4) e11.getCause());
            }
            throw new h4(e11).setUnfinishedMessage(t10);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof h4) {
                throw ((h4) e12.getCause());
            }
            throw e12;
        }
    }

    public static <T extends o3> void registerDefaultInstance(Class<T> cls, T t5) {
        t5.markImmutable();
        defaultInstanceMap.put(cls, t5);
    }

    public Object buildMessageInfo() throws Exception {
        return dynamicMethod(n3.BUILD_MESSAGE_INFO);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    int computeHashCode() {
        return p6.getInstance().schemaFor((p6) this).hashCode(this);
    }

    public final <MessageType extends o3, BuilderType extends h3> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(n3.NEW_BUILDER);
    }

    public Object dynamicMethod(n3 n3Var, Object obj) {
        return dynamicMethod(n3Var, obj, null);
    }

    public abstract Object dynamicMethod(n3 n3Var, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return p6.getInstance().schemaFor((p6) this).equals(this, (o3) obj);
    }

    int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    @Override // com.google.protobuf.c
    int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.c, com.google.protobuf.o5
    public final m6 getParserForType() {
        return (m6) dynamicMethod(n3.GET_PARSER);
    }

    @Override // com.google.protobuf.c
    public int getSerializedSize(z6 z6Var) {
        if (isMutable()) {
            int computeSerializedSize = computeSerializedSize(z6Var);
            if (computeSerializedSize >= 0) {
                return computeSerializedSize;
            }
            throw new IllegalStateException(eb.j.i("serialized size must be non-negative, was ", computeSerializedSize));
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        int computeSerializedSize2 = computeSerializedSize(z6Var);
        setMemoizedSerializedSize(computeSerializedSize2);
        return computeSerializedSize2;
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    @Override // com.google.protobuf.c, com.google.protobuf.o5, com.google.protobuf.p5
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public boolean isMutable() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public void makeImmutable() {
        p6.getInstance().schemaFor((p6) this).makeImmutable(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public void mergeLengthDelimitedField(int i10, h0 h0Var) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeLengthDelimitedField(i10, h0Var);
    }

    public final void mergeUnknownFields(t8 t8Var) {
        this.unknownFields = t8.mutableCopyOf(this.unknownFields, t8Var);
    }

    public void mergeVarintField(int i10, int i11) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeVarintField(i10, i11);
    }

    public o3 newMutableInstance() {
        return (o3) dynamicMethod(n3.NEW_MUTABLE_INSTANCE);
    }

    public boolean parseUnknownField(int i10, r0 r0Var) throws IOException {
        if (z9.getTagWireType(i10) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.mergeFieldFrom(i10, r0Var);
    }

    void setMemoizedHashCode(int i10) {
        this.memoizedHashCode = i10;
    }

    @Override // com.google.protobuf.c
    void setMemoizedSerializedSize(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException(eb.j.i("serialized size must be non-negative, was ", i10));
    }

    public String toString() {
        return q5.toString(this, super.toString());
    }

    @Override // com.google.protobuf.c, com.google.protobuf.o5
    public void writeTo(d1 d1Var) throws IOException {
        p6.getInstance().schemaFor((p6) this).writeTo(this, f1.forCodedOutput(d1Var));
    }

    public static final <T extends o3> boolean isInitialized(T t5, boolean z10) {
        byte byteValue = ((Byte) t5.dynamicMethod(n3.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean isInitialized = p6.getInstance().schemaFor((p6) t5).isInitialized(t5);
        if (z10) {
            t5.dynamicMethod(n3.SET_MEMOIZED_IS_INITIALIZED, isInitialized ? t5 : null);
        }
        return isInitialized;
    }

    public final <MessageType extends o3, BuilderType extends h3> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().mergeFrom((o3) messagetype);
    }

    public Object dynamicMethod(n3 n3Var) {
        return dynamicMethod(n3Var, null, null);
    }

    @Override // com.google.protobuf.c, com.google.protobuf.o5, com.google.protobuf.p5, com.google.protobuf.k3
    public final o3 getDefaultInstanceForType() {
        return (o3) dynamicMethod(n3.GET_DEFAULT_INSTANCE);
    }

    @Override // com.google.protobuf.c, com.google.protobuf.o5
    public final h3 newBuilderForType() {
        return (h3) dynamicMethod(n3.NEW_BUILDER);
    }

    @Override // com.google.protobuf.c, com.google.protobuf.o5
    public final h3 toBuilder() {
        return ((h3) dynamicMethod(n3.NEW_BUILDER)).mergeFrom(this);
    }

    public static d4 mutableCopy(d4 d4Var) {
        int size = d4Var.size();
        return ((a5) d4Var).mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends o3> T parseFrom(T t5, ByteBuffer byteBuffer) throws h4 {
        return (T) parseFrom(t5, byteBuffer, a2.getEmptyRegistry());
    }

    public static <T extends o3> T parseDelimitedFrom(T t5, InputStream inputStream, a2 a2Var) throws h4 {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t5, inputStream, a2Var));
    }

    public static <T extends o3> T parseFrom(T t5, h0 h0Var) throws h4 {
        return (T) checkMessageInitialized(parseFrom(t5, h0Var, a2.getEmptyRegistry()));
    }

    public static b4 mutableCopy(b4 b4Var) {
        int size = b4Var.size();
        return ((b3) b4Var).mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends o3> T parseFrom(T t5, h0 h0Var, a2 a2Var) throws h4 {
        return (T) checkMessageInitialized(parsePartialFrom(t5, h0Var, a2Var));
    }

    public static x3 mutableCopy(x3 x3Var) {
        int size = x3Var.size();
        return ((g1) x3Var).mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends o3> T parseFrom(T t5, byte[] bArr) throws h4 {
        return (T) checkMessageInitialized(parsePartialFrom(t5, bArr, 0, bArr.length, a2.getEmptyRegistry()));
    }

    public static w3 mutableCopy(w3 w3Var) {
        int size = w3Var.size();
        return ((s) w3Var).mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends o3> T parseFrom(T t5, byte[] bArr, a2 a2Var) throws h4 {
        return (T) checkMessageInitialized(parsePartialFrom(t5, bArr, 0, bArr.length, a2Var));
    }

    public static <E> e4 mutableCopy(e4 e4Var) {
        int size = e4Var.size();
        return e4Var.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends o3> T parseFrom(T t5, InputStream inputStream) throws h4 {
        return (T) checkMessageInitialized(parsePartialFrom(t5, r0.newInstance(inputStream), a2.getEmptyRegistry()));
    }

    @Override // com.google.protobuf.c, com.google.protobuf.o5
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    public static <T extends o3> T parsePartialFrom(T t5, byte[] bArr, int i10, int i11, a2 a2Var) throws h4 {
        T t10 = (T) t5.newMutableInstance();
        try {
            z6 schemaFor = p6.getInstance().schemaFor((p6) t10);
            schemaFor.mergeFrom(t10, bArr, i10, i10 + i11, new n(a2Var));
            schemaFor.makeImmutable(t10);
            return t10;
        } catch (h4 e2) {
            e = e2;
            if (e.getThrownFromInputStream()) {
                e = new h4((IOException) e);
            }
            throw e.setUnfinishedMessage(t10);
        } catch (r8 e10) {
            throw e10.asInvalidProtocolBufferException().setUnfinishedMessage(t10);
        } catch (IOException e11) {
            if (e11.getCause() instanceof h4) {
                throw ((h4) e11.getCause());
            }
            throw new h4(e11).setUnfinishedMessage(t10);
        } catch (IndexOutOfBoundsException unused) {
            throw h4.truncatedMessage().setUnfinishedMessage(t10);
        }
    }

    public static <T extends o3> T parseFrom(T t5, InputStream inputStream, a2 a2Var) throws h4 {
        return (T) checkMessageInitialized(parsePartialFrom(t5, r0.newInstance(inputStream), a2Var));
    }

    public static <T extends o3> T parseFrom(T t5, r0 r0Var) throws h4 {
        return (T) parseFrom(t5, r0Var, a2.getEmptyRegistry());
    }

    public static <T extends o3> T parseFrom(T t5, r0 r0Var, a2 a2Var) throws h4 {
        return (T) checkMessageInitialized(parsePartialFrom(t5, r0Var, a2Var));
    }

    public static <T extends o3> T parsePartialFrom(T t5, r0 r0Var) throws h4 {
        return (T) parsePartialFrom(t5, r0Var, a2.getEmptyRegistry());
    }

    private static <T extends o3> T parsePartialFrom(T t5, h0 h0Var, a2 a2Var) throws h4 {
        r0 newCodedInput = h0Var.newCodedInput();
        T t10 = (T) parsePartialFrom(t5, newCodedInput, a2Var);
        try {
            newCodedInput.checkLastTagWas(0);
            return t10;
        } catch (h4 e2) {
            throw e2.setUnfinishedMessage(t10);
        }
    }
}
