package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class L2 extends AbstractC1880c {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, L2> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected C1997s5 unknownFields = C1997s5.getDefaultInstance();

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends GeneratedMessageLite$ExtendableMessage<MessageType, BuilderType>, BuilderType extends F2, T> J2 checkIsLite(S1 s1) {
        if (s1.isLite()) {
            return (J2) s1;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    private static <T extends L2> T checkMessageInitialized(T t9) throws C1912g3 {
        if (t9 != null && !t9.isInitialized()) {
            throw t9.newUninitializedMessageException().asInvalidProtocolBufferException().setUnfinishedMessage(t9);
        }
        return t9;
    }

    private int computeSerializedSize(InterfaceC2038y4 interfaceC2038y4) {
        if (interfaceC2038y4 == null) {
            return C1969o4.getInstance().schemaFor((C1969o4) this).getSerializedSize(this);
        }
        return interfaceC2038y4.getSerializedSize(this);
    }

    public static T2 emptyBooleanList() {
        return C1991s.emptyList();
    }

    public static U2 emptyDoubleList() {
        return C1.emptyList();
    }

    public static Y2 emptyFloatList() {
        return C2029x2.emptyList();
    }

    public static Z2 emptyIntList() {
        return S2.emptyList();
    }

    public static InterfaceC1884c3 emptyLongList() {
        return C2044z3.emptyList();
    }

    public static <E> InterfaceC1891d3 emptyProtobufList() {
        return C1976p4.emptyList();
    }

    private final void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == C1997s5.getDefaultInstance()) {
            this.unknownFields = C1997s5.newInstance();
        }
    }

    public static <T extends L2> T getDefaultInstance(Class<T> cls) {
        L2 l2 = defaultInstanceMap.get(cls);
        if (l2 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                l2 = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (l2 == null) {
            l2 = (T) ((L2) C5.allocateInstance(cls)).getDefaultInstanceForType();
            if (l2 != null) {
                defaultInstanceMap.put(cls, l2);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) l2;
    }

    public static java.lang.reflect.Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e4);
        }
    }

    public static Object invokeOrDie(java.lang.reflect.Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e4);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static Z2 mutableCopy(Z2 z22) {
        int size = z22.size();
        return ((S2) z22).mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static Object newMessageInfo(N3 n32, String str, Object[] objArr) {
        return new C1989r4(n32, str, objArr);
    }

    public static <ContainingType extends N3, Type> J2 newRepeatedGeneratedExtension(ContainingType containingtype, N3 n32, W2 w2, int i9, S5 s5, boolean z8, Class cls) {
        return new J2(containingtype, Collections.emptyList(), n32, new I2(w2, i9, s5, true, z8), cls);
    }

    public static <ContainingType extends N3, Type> J2 newSingularGeneratedExtension(ContainingType containingtype, Type type, N3 n32, W2 w2, int i9, S5 s5, Class cls) {
        return new J2(containingtype, type, n32, new I2(w2, i9, s5, false, false), cls);
    }

    public static <T extends L2> T parseDelimitedFrom(T t9, InputStream inputStream) throws C1912g3 {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t9, inputStream, W1.getEmptyRegistry()));
    }

    public static <T extends L2> T parseFrom(T t9, ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (T) checkMessageInitialized(parseFrom(t9, S.newInstance(byteBuffer), w1));
    }

    private static <T extends L2> T parsePartialDelimitedFrom(T t9, InputStream inputStream, W1 w1) throws C1912g3 {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            S newInstance = S.newInstance(new C1866a(inputStream, S.readRawVarint32(read, inputStream)));
            T t10 = (T) parsePartialFrom(t9, newInstance, w1);
            try {
                newInstance.checkLastTagWas(0);
                return t10;
            } catch (C1912g3 e4) {
                throw e4.setUnfinishedMessage(t10);
            }
        } catch (C1912g3 e9) {
            if (e9.getThrownFromInputStream()) {
                throw new C1912g3((IOException) e9);
            }
            throw e9;
        } catch (IOException e10) {
            throw new C1912g3(e10);
        }
    }

    public static <T extends L2> T parsePartialFrom(T t9, S s5, W1 w1) throws C1912g3 {
        T t10 = (T) t9.newMutableInstance();
        try {
            InterfaceC2038y4 schemaFor = C1969o4.getInstance().schemaFor((C1969o4) t10);
            schemaFor.mergeFrom(t10, U.forCodedInput(s5), w1);
            schemaFor.makeImmutable(t10);
            return t10;
        } catch (C1912g3 e4) {
            e = e4;
            if (e.getThrownFromInputStream()) {
                e = new C1912g3((IOException) e);
            }
            throw e.setUnfinishedMessage(t10);
        } catch (C1984q5 e9) {
            throw e9.asInvalidProtocolBufferException().setUnfinishedMessage(t10);
        } catch (IOException e10) {
            if (e10.getCause() instanceof C1912g3) {
                throw ((C1912g3) e10.getCause());
            }
            throw new C1912g3(e10).setUnfinishedMessage(t10);
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof C1912g3) {
                throw ((C1912g3) e11.getCause());
            }
            throw e11;
        }
    }

    public static <T extends L2> void registerDefaultInstance(Class<T> cls, T t9) {
        t9.markImmutable();
        defaultInstanceMap.put(cls, t9);
    }

    public Object buildMessageInfo() throws Exception {
        return dynamicMethod(K2.BUILD_MESSAGE_INFO);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public int computeHashCode() {
        return C1969o4.getInstance().schemaFor((C1969o4) this).hashCode(this);
    }

    public final <MessageType extends L2, BuilderType extends D2> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(K2.NEW_BUILDER);
    }

    public Object dynamicMethod(K2 k22, Object obj) {
        return dynamicMethod(k22, obj, null);
    }

    public abstract Object dynamicMethod(K2 k22, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C1969o4.getInstance().schemaFor((C1969o4) this).equals(this, (L2) obj);
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    @Override // com.google.protobuf.AbstractC1880c
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.AbstractC1880c, com.google.protobuf.N3
    public final InterfaceC1948l4 getParserForType() {
        return (InterfaceC1948l4) dynamicMethod(K2.GET_PARSER);
    }

    @Override // com.google.protobuf.AbstractC1880c
    public int getSerializedSize(InterfaceC2038y4 interfaceC2038y4) {
        if (isMutable()) {
            int computeSerializedSize = computeSerializedSize(interfaceC2038y4);
            if (computeSerializedSize >= 0) {
                return computeSerializedSize;
            }
            throw new IllegalStateException(com.mbridge.msdk.foundation.entity.o.h(computeSerializedSize, "serialized size must be non-negative, was "));
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        int computeSerializedSize2 = computeSerializedSize(interfaceC2038y4);
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

    public boolean hashCodeIsNotMemoized() {
        if (getMemoizedHashCode() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractC1880c, com.google.protobuf.N3, com.google.protobuf.O3
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public boolean isMutable() {
        if ((this.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public void makeImmutable() {
        C1969o4.getInstance().schemaFor((C1969o4) this).makeImmutable(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public void mergeLengthDelimitedField(int i9, H h6) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeLengthDelimitedField(i9, h6);
    }

    public final void mergeUnknownFields(C1997s5 c1997s5) {
        this.unknownFields = C1997s5.mutableCopyOf(this.unknownFields, c1997s5);
    }

    public void mergeVarintField(int i9, int i10) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeVarintField(i9, i10);
    }

    public L2 newMutableInstance() {
        return (L2) dynamicMethod(K2.NEW_MUTABLE_INSTANCE);
    }

    public boolean parseUnknownField(int i9, S s5) throws IOException {
        if (Y5.getTagWireType(i9) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.mergeFieldFrom(i9, s5);
    }

    public void setMemoizedHashCode(int i9) {
        this.memoizedHashCode = i9;
    }

    @Override // com.google.protobuf.AbstractC1880c
    public void setMemoizedSerializedSize(int i9) {
        if (i9 >= 0) {
            this.memoizedSerializedSize = (i9 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException(com.mbridge.msdk.foundation.entity.o.h(i9, "serialized size must be non-negative, was "));
    }

    public String toString() {
        return P3.toString(this, super.toString());
    }

    @Override // com.google.protobuf.AbstractC1880c, com.google.protobuf.N3
    public void writeTo(AbstractC1895e0 abstractC1895e0) throws IOException {
        C1969o4.getInstance().schemaFor((C1969o4) this).writeTo(this, C1909g0.forCodedOutput(abstractC1895e0));
    }

    public static final <T extends L2> boolean isInitialized(T t9, boolean z8) {
        byte byteValue = ((Byte) t9.dynamicMethod(K2.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean isInitialized = C1969o4.getInstance().schemaFor((C1969o4) t9).isInitialized(t9);
        if (z8) {
            t9.dynamicMethod(K2.SET_MEMOIZED_IS_INITIALIZED, isInitialized ? t9 : null);
        }
        return isInitialized;
    }

    public final <MessageType extends L2, BuilderType extends D2> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().mergeFrom((L2) messagetype);
    }

    public Object dynamicMethod(K2 k22) {
        return dynamicMethod(k22, null, null);
    }

    @Override // com.google.protobuf.AbstractC1880c, com.google.protobuf.N3, com.google.protobuf.O3
    public final L2 getDefaultInstanceForType() {
        return (L2) dynamicMethod(K2.GET_DEFAULT_INSTANCE);
    }

    @Override // com.google.protobuf.AbstractC1880c, com.google.protobuf.N3
    public final D2 newBuilderForType() {
        return (D2) dynamicMethod(K2.NEW_BUILDER);
    }

    @Override // com.google.protobuf.AbstractC1880c, com.google.protobuf.N3
    public final D2 toBuilder() {
        return ((D2) dynamicMethod(K2.NEW_BUILDER)).mergeFrom(this);
    }

    public static InterfaceC1884c3 mutableCopy(InterfaceC1884c3 interfaceC1884c3) {
        int size = interfaceC1884c3.size();
        return ((C2044z3) interfaceC1884c3).mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends L2> T parseFrom(T t9, ByteBuffer byteBuffer) throws C1912g3 {
        return (T) parseFrom(t9, byteBuffer, W1.getEmptyRegistry());
    }

    public static <T extends L2> T parseDelimitedFrom(T t9, InputStream inputStream, W1 w1) throws C1912g3 {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t9, inputStream, w1));
    }

    public static <T extends L2> T parseFrom(T t9, H h6) throws C1912g3 {
        return (T) checkMessageInitialized(parseFrom(t9, h6, W1.getEmptyRegistry()));
    }

    public static Y2 mutableCopy(Y2 y22) {
        int size = y22.size();
        return ((C2029x2) y22).mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends L2> T parseFrom(T t9, H h6, W1 w1) throws C1912g3 {
        return (T) checkMessageInitialized(parsePartialFrom(t9, h6, w1));
    }

    public static U2 mutableCopy(U2 u22) {
        int size = u22.size();
        return ((C1) u22).mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends L2> T parseFrom(T t9, byte[] bArr) throws C1912g3 {
        return (T) checkMessageInitialized(parsePartialFrom(t9, bArr, 0, bArr.length, W1.getEmptyRegistry()));
    }

    public static T2 mutableCopy(T2 t22) {
        int size = t22.size();
        return ((C1991s) t22).mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends L2> T parseFrom(T t9, byte[] bArr, W1 w1) throws C1912g3 {
        return (T) checkMessageInitialized(parsePartialFrom(t9, bArr, 0, bArr.length, w1));
    }

    public static <E> InterfaceC1891d3 mutableCopy(InterfaceC1891d3 interfaceC1891d3) {
        int size = interfaceC1891d3.size();
        return interfaceC1891d3.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends L2> T parseFrom(T t9, InputStream inputStream) throws C1912g3 {
        return (T) checkMessageInitialized(parsePartialFrom(t9, S.newInstance(inputStream), W1.getEmptyRegistry()));
    }

    @Override // com.google.protobuf.AbstractC1880c, com.google.protobuf.N3
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends L2> T parsePartialFrom(T t9, byte[] bArr, int i9, int i10, W1 w1) throws C1912g3 {
        T t10 = (T) t9.newMutableInstance();
        try {
            InterfaceC2038y4 schemaFor = C1969o4.getInstance().schemaFor((C1969o4) t10);
            schemaFor.mergeFrom(t10, bArr, i9, i9 + i10, new C1957n(w1));
            schemaFor.makeImmutable(t10);
            return t10;
        } catch (C1912g3 e4) {
            e = e4;
            if (e.getThrownFromInputStream()) {
                e = new C1912g3((IOException) e);
            }
            throw e.setUnfinishedMessage(t10);
        } catch (C1984q5 e9) {
            throw e9.asInvalidProtocolBufferException().setUnfinishedMessage(t10);
        } catch (IOException e10) {
            if (e10.getCause() instanceof C1912g3) {
                throw ((C1912g3) e10.getCause());
            }
            throw new C1912g3(e10).setUnfinishedMessage(t10);
        } catch (IndexOutOfBoundsException unused) {
            throw C1912g3.truncatedMessage().setUnfinishedMessage(t10);
        }
    }

    public static <T extends L2> T parseFrom(T t9, InputStream inputStream, W1 w1) throws C1912g3 {
        return (T) checkMessageInitialized(parsePartialFrom(t9, S.newInstance(inputStream), w1));
    }

    public static <T extends L2> T parseFrom(T t9, S s5) throws C1912g3 {
        return (T) parseFrom(t9, s5, W1.getEmptyRegistry());
    }

    public static <T extends L2> T parseFrom(T t9, S s5, W1 w1) throws C1912g3 {
        return (T) checkMessageInitialized(parsePartialFrom(t9, s5, w1));
    }

    public static <T extends L2> T parsePartialFrom(T t9, S s5) throws C1912g3 {
        return (T) parsePartialFrom(t9, s5, W1.getEmptyRegistry());
    }

    private static <T extends L2> T parsePartialFrom(T t9, H h6, W1 w1) throws C1912g3 {
        S newCodedInput = h6.newCodedInput();
        T t10 = (T) parsePartialFrom(t9, newCodedInput, w1);
        try {
            newCodedInput.checkLastTagWas(0);
            return t10;
        } catch (C1912g3 e4) {
            throw e4.setUnfinishedMessage(t10);
        }
    }
}
