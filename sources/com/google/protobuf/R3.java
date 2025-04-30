package com.google.protobuf;

import androidx.core.view.MotionEventCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class R3 implements InterfaceC2038y4 {
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int INTS_PER_FIELD = 3;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_MASK = 268435456;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final N3 defaultInstance;
    private final X1 extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final AbstractC2016v3 listFieldSchema;
    private final boolean lite;
    private final H3 mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final Z3 newInstanceSchema;
    private final Object[] objects;
    private final boolean proto3;
    private final int repeatedFieldOffsetStart;
    private final AbstractC1990r5 unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = C5.getUnsafe();

    private R3(int[] iArr, Object[] objArr, int i9, int i10, N3 n32, boolean z8, boolean z9, int[] iArr2, int i11, int i12, Z3 z32, AbstractC2016v3 abstractC2016v3, AbstractC1990r5 abstractC1990r5, X1 x12, H3 h32) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i9;
        this.maxFieldNumber = i10;
        this.lite = n32 instanceof L2;
        this.proto3 = z8;
        this.hasExtensions = x12 != null && x12.hasExtensions(n32);
        this.useCachedSizeField = z9;
        this.intArray = iArr2;
        this.checkInitializedCount = i11;
        this.repeatedFieldOffsetStart = i12;
        this.newInstanceSchema = z32;
        this.listFieldSchema = abstractC2016v3;
        this.unknownFieldSchema = abstractC1990r5;
        this.extensionSchema = x12;
        this.defaultInstance = n32;
        this.mapFieldSchema = h32;
    }

    private boolean arePresentForEquals(Object obj, Object obj2, int i9) {
        if (isFieldPresent(obj, i9) == isFieldPresent(obj2, i9)) {
            return true;
        }
        return false;
    }

    private static <T> boolean booleanAt(T t9, long j7) {
        return C5.getBoolean(t9, j7);
    }

    private static void checkMutable(Object obj) {
        if (isMutable(obj)) {
        } else {
            throw new IllegalArgumentException(com.applovin.impl.L.i(obj, "Mutating immutable message: "));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.Map, java.util.Map<K, V>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    private <K, V> int decodeMapEntry(byte[] bArr, int i9, int i10, E3 e32, Map<K, V> map, C1957n c1957n) throws IOException {
        int i11;
        int decodeVarint32 = C1964o.decodeVarint32(bArr, i9, c1957n);
        int i12 = c1957n.int1;
        if (i12 >= 0 && i12 <= i10 - decodeVarint32) {
            int i13 = decodeVarint32 + i12;
            Object obj = e32.defaultKey;
            Object obj2 = e32.defaultValue;
            while (decodeVarint32 < i13) {
                int i14 = decodeVarint32 + 1;
                byte b = bArr[decodeVarint32];
                if (b < 0) {
                    i11 = C1964o.decodeVarint32(b, bArr, i14, c1957n);
                    b = c1957n.int1;
                } else {
                    i11 = i14;
                }
                int i15 = b >>> 3;
                int i16 = b & 7;
                if (i15 != 1) {
                    if (i15 == 2 && i16 == e32.valueType.getWireType()) {
                        decodeVarint32 = decodeMapEntryValue(bArr, i11, i10, e32.valueType, e32.defaultValue.getClass(), c1957n);
                        obj2 = c1957n.object1;
                    }
                    decodeVarint32 = C1964o.skipField(b, bArr, i11, i10, c1957n);
                } else if (i16 == e32.keyType.getWireType()) {
                    decodeVarint32 = decodeMapEntryValue(bArr, i11, i10, e32.keyType, null, c1957n);
                    obj = c1957n.object1;
                } else {
                    decodeVarint32 = C1964o.skipField(b, bArr, i11, i10, c1957n);
                }
            }
            if (decodeVarint32 == i13) {
                map.put(obj, obj2);
                return i13;
            }
            throw C1912g3.parseFailure();
        }
        throw C1912g3.truncatedMessage();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    private int decodeMapEntryValue(byte[] bArr, int i9, int i10, S5 s5, Class<?> cls, C1957n c1957n) throws IOException {
        boolean z8;
        switch (Q3.$SwitchMap$com$google$protobuf$WireFormat$FieldType[s5.ordinal()]) {
            case 1:
                int decodeVarint64 = C1964o.decodeVarint64(bArr, i9, c1957n);
                if (c1957n.long1 != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                c1957n.object1 = Boolean.valueOf(z8);
                return decodeVarint64;
            case 2:
                return C1964o.decodeBytes(bArr, i9, c1957n);
            case 3:
                c1957n.object1 = Double.valueOf(C1964o.decodeDouble(bArr, i9));
                return i9 + 8;
            case 4:
            case 5:
                c1957n.object1 = Integer.valueOf(C1964o.decodeFixed32(bArr, i9));
                return i9 + 4;
            case 6:
            case 7:
                c1957n.object1 = Long.valueOf(C1964o.decodeFixed64(bArr, i9));
                return i9 + 8;
            case 8:
                c1957n.object1 = Float.valueOf(C1964o.decodeFloat(bArr, i9));
                return i9 + 4;
            case 9:
            case 10:
            case 11:
                int decodeVarint32 = C1964o.decodeVarint32(bArr, i9, c1957n);
                c1957n.object1 = Integer.valueOf(c1957n.int1);
                return decodeVarint32;
            case 12:
            case 13:
                int decodeVarint642 = C1964o.decodeVarint64(bArr, i9, c1957n);
                c1957n.object1 = Long.valueOf(c1957n.long1);
                return decodeVarint642;
            case 14:
                return C1964o.decodeMessageField(C1969o4.getInstance().schemaFor((Class) cls), bArr, i9, i10, c1957n);
            case 15:
                int decodeVarint322 = C1964o.decodeVarint32(bArr, i9, c1957n);
                c1957n.object1 = Integer.valueOf(S.decodeZigZag32(c1957n.int1));
                return decodeVarint322;
            case 16:
                int decodeVarint643 = C1964o.decodeVarint64(bArr, i9, c1957n);
                c1957n.object1 = Long.valueOf(S.decodeZigZag64(c1957n.long1));
                return decodeVarint643;
            case 17:
                return C1964o.decodeStringRequireUtf8(bArr, i9, c1957n);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T t9, long j7) {
        return C5.getDouble(t9, j7);
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i9, UB ub, AbstractC1990r5 abstractC1990r5, Object obj2) {
        int numberAt = numberAt(i9);
        Object object = C5.getObject(obj, offset(typeAndOffsetAt(i9)));
        if (object == null) {
            return ub;
        }
        X2 enumFieldVerifier = getEnumFieldVerifier(i9);
        if (enumFieldVerifier == null) {
            return ub;
        }
        return (UB) filterUnknownEnumMap(i9, numberAt, ((I3) this.mapFieldSchema).forMutableMapData(object), enumFieldVerifier, ub, abstractC1990r5, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i9, int i10, Map<K, V> map, X2 x22, UB ub, AbstractC1990r5 abstractC1990r5, Object obj) {
        E3 forMapMetadata = ((I3) this.mapFieldSchema).forMapMetadata(getMapFieldDefaultEntry(i9));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!x22.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = (UB) abstractC1990r5.getBuilderFromMessage(obj);
                }
                C newCodedBuilder = H.newCodedBuilder(F3.computeSerializedSize(forMapMetadata, next.getKey(), next.getValue()));
                try {
                    F3.writeTo(newCodedBuilder.getCodedOutput(), forMapMetadata, next.getKey(), next.getValue());
                    abstractC1990r5.addLengthDelimited(ub, i10, newCodedBuilder.build());
                    it.remove();
                } catch (IOException e4) {
                    throw new RuntimeException(e4);
                }
            }
        }
        return ub;
    }

    private static <T> float floatAt(T t9, long j7) {
        return C5.getFloat(t9, j7);
    }

    private X2 getEnumFieldVerifier(int i9) {
        return (X2) this.objects[((i9 / 3) * 2) + 1];
    }

    private Object getMapFieldDefaultEntry(int i9) {
        return this.objects[(i9 / 3) * 2];
    }

    private InterfaceC2038y4 getMessageFieldSchema(int i9) {
        int i10 = (i9 / 3) * 2;
        InterfaceC2038y4 interfaceC2038y4 = (InterfaceC2038y4) this.objects[i10];
        if (interfaceC2038y4 != null) {
            return interfaceC2038y4;
        }
        InterfaceC2038y4 schemaFor = C1969o4.getInstance().schemaFor((Class) this.objects[i10 + 1]);
        this.objects[i10] = schemaFor;
        return schemaFor;
    }

    public static C1997s5 getMutableUnknownFields(Object obj) {
        L2 l2 = (L2) obj;
        C1997s5 c1997s5 = l2.unknownFields;
        if (c1997s5 == C1997s5.getDefaultInstance()) {
            C1997s5 newInstance = C1997s5.newInstance();
            l2.unknownFields = newInstance;
            return newInstance;
        }
        return c1997s5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x005e. Please report as an issue. */
    private int getSerializedSizeProto2(Object obj) {
        int i9;
        int i10;
        int computeDoubleSize;
        int computeBoolSize;
        int computeStringSize;
        int computeSFixed32Size;
        boolean z8;
        int computeSizeFixed32List;
        Unsafe unsafe = UNSAFE;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < this.buffer.length) {
            int typeAndOffsetAt = typeAndOffsetAt(i13);
            int numberAt = numberAt(i13);
            int type = type(typeAndOffsetAt);
            if (type <= 17) {
                i9 = this.buffer[i13 + 2];
                int i16 = i9 & i11;
                i10 = 1 << (i9 >>> 20);
                if (i16 != i12) {
                    i15 = unsafe.getInt(obj, i16);
                    i12 = i16;
                }
            } else {
                if (this.useCachedSizeField && type >= EnumC2022w2.DOUBLE_LIST_PACKED.id() && type <= EnumC2022w2.SINT64_LIST_PACKED.id()) {
                    i9 = this.buffer[i13 + 2] & i11;
                } else {
                    i9 = 0;
                }
                i10 = 0;
            }
            long offset = offset(typeAndOffsetAt);
            switch (type) {
                case 0:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        computeDoubleSize = AbstractC1895e0.computeDoubleSize(numberAt, 0.0d);
                        i14 += computeDoubleSize;
                        break;
                    }
                case 1:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        computeDoubleSize = AbstractC1895e0.computeFloatSize(numberAt, 0.0f);
                        i14 += computeDoubleSize;
                        break;
                    }
                case 2:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        computeDoubleSize = AbstractC1895e0.computeInt64Size(numberAt, unsafe.getLong(obj, offset));
                        i14 += computeDoubleSize;
                        break;
                    }
                case 3:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        computeDoubleSize = AbstractC1895e0.computeUInt64Size(numberAt, unsafe.getLong(obj, offset));
                        i14 += computeDoubleSize;
                        break;
                    }
                case 4:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        computeDoubleSize = AbstractC1895e0.computeInt32Size(numberAt, unsafe.getInt(obj, offset));
                        i14 += computeDoubleSize;
                        break;
                    }
                case 5:
                    if ((i15 & i10) == 0) {
                        break;
                    } else {
                        computeDoubleSize = AbstractC1895e0.computeFixed64Size(numberAt, 0L);
                        i14 += computeDoubleSize;
                        break;
                    }
                case 6:
                    if ((i15 & i10) != 0) {
                        computeDoubleSize = AbstractC1895e0.computeFixed32Size(numberAt, 0);
                        i14 += computeDoubleSize;
                        break;
                    }
                    break;
                case 7:
                    if ((i15 & i10) != 0) {
                        computeBoolSize = AbstractC1895e0.computeBoolSize(numberAt, true);
                        i14 += computeBoolSize;
                    }
                    break;
                case 8:
                    if ((i15 & i10) != 0) {
                        Object object = unsafe.getObject(obj, offset);
                        if (object instanceof H) {
                            computeStringSize = AbstractC1895e0.computeBytesSize(numberAt, (H) object);
                        } else {
                            computeStringSize = AbstractC1895e0.computeStringSize(numberAt, (String) object);
                        }
                        i14 = computeStringSize + i14;
                    }
                    break;
                case 9:
                    if ((i15 & i10) != 0) {
                        computeBoolSize = A4.computeSizeMessage(numberAt, unsafe.getObject(obj, offset), getMessageFieldSchema(i13));
                        i14 += computeBoolSize;
                    }
                    break;
                case 10:
                    if ((i15 & i10) != 0) {
                        computeBoolSize = AbstractC1895e0.computeBytesSize(numberAt, (H) unsafe.getObject(obj, offset));
                        i14 += computeBoolSize;
                    }
                    break;
                case 11:
                    if ((i15 & i10) != 0) {
                        computeBoolSize = AbstractC1895e0.computeUInt32Size(numberAt, unsafe.getInt(obj, offset));
                        i14 += computeBoolSize;
                    }
                    break;
                case 12:
                    if ((i15 & i10) != 0) {
                        computeBoolSize = AbstractC1895e0.computeEnumSize(numberAt, unsafe.getInt(obj, offset));
                        i14 += computeBoolSize;
                    }
                    break;
                case 13:
                    if ((i15 & i10) != 0) {
                        computeSFixed32Size = AbstractC1895e0.computeSFixed32Size(numberAt, 0);
                        i14 += computeSFixed32Size;
                    }
                    break;
                case 14:
                    if ((i15 & i10) != 0) {
                        computeBoolSize = AbstractC1895e0.computeSFixed64Size(numberAt, 0L);
                        i14 += computeBoolSize;
                    }
                    break;
                case 15:
                    if ((i15 & i10) != 0) {
                        computeBoolSize = AbstractC1895e0.computeSInt32Size(numberAt, unsafe.getInt(obj, offset));
                        i14 += computeBoolSize;
                    }
                    break;
                case 16:
                    if ((i15 & i10) != 0) {
                        computeBoolSize = AbstractC1895e0.computeSInt64Size(numberAt, unsafe.getLong(obj, offset));
                        i14 += computeBoolSize;
                    }
                    break;
                case 17:
                    if ((i15 & i10) != 0) {
                        computeBoolSize = AbstractC1895e0.computeGroupSize(numberAt, (N3) unsafe.getObject(obj, offset), getMessageFieldSchema(i13));
                        i14 += computeBoolSize;
                    }
                    break;
                case 18:
                    computeBoolSize = A4.computeSizeFixed64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i14 += computeBoolSize;
                    break;
                case 19:
                    z8 = false;
                    computeSizeFixed32List = A4.computeSizeFixed32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i14 += computeSizeFixed32List;
                    break;
                case 20:
                    z8 = false;
                    computeSizeFixed32List = A4.computeSizeInt64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i14 += computeSizeFixed32List;
                    break;
                case 21:
                    z8 = false;
                    computeSizeFixed32List = A4.computeSizeUInt64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i14 += computeSizeFixed32List;
                    break;
                case 22:
                    z8 = false;
                    computeSizeFixed32List = A4.computeSizeInt32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i14 += computeSizeFixed32List;
                    break;
                case 23:
                    z8 = false;
                    computeSizeFixed32List = A4.computeSizeFixed64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i14 += computeSizeFixed32List;
                    break;
                case 24:
                    z8 = false;
                    computeSizeFixed32List = A4.computeSizeFixed32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i14 += computeSizeFixed32List;
                    break;
                case 25:
                    z8 = false;
                    computeSizeFixed32List = A4.computeSizeBoolList(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i14 += computeSizeFixed32List;
                    break;
                case 26:
                    computeBoolSize = A4.computeSizeStringList(numberAt, (List) unsafe.getObject(obj, offset));
                    i14 += computeBoolSize;
                    break;
                case 27:
                    computeBoolSize = A4.computeSizeMessageList(numberAt, (List) unsafe.getObject(obj, offset), getMessageFieldSchema(i13));
                    i14 += computeBoolSize;
                    break;
                case 28:
                    computeBoolSize = A4.computeSizeByteStringList(numberAt, (List) unsafe.getObject(obj, offset));
                    i14 += computeBoolSize;
                    break;
                case 29:
                    computeBoolSize = A4.computeSizeUInt32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i14 += computeBoolSize;
                    break;
                case AD_PLAY_RESET_ON_DEINIT_VALUE:
                    z8 = false;
                    computeSizeFixed32List = A4.computeSizeEnumList(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i14 += computeSizeFixed32List;
                    break;
                case 31:
                    z8 = false;
                    computeSizeFixed32List = A4.computeSizeFixed32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i14 += computeSizeFixed32List;
                    break;
                case 32:
                    z8 = false;
                    computeSizeFixed32List = A4.computeSizeFixed64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i14 += computeSizeFixed32List;
                    break;
                case 33:
                    z8 = false;
                    computeSizeFixed32List = A4.computeSizeSInt32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i14 += computeSizeFixed32List;
                    break;
                case 34:
                    z8 = false;
                    computeSizeFixed32List = A4.computeSizeSInt64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i14 += computeSizeFixed32List;
                    break;
                case 35:
                    int computeSizeFixed64ListNoTag = A4.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i9, computeSizeFixed64ListNoTag);
                        }
                        i14 = com.applovin.impl.L.c(computeSizeFixed64ListNoTag, AbstractC1895e0.computeTagSize(numberAt), computeSizeFixed64ListNoTag, i14);
                    }
                    break;
                case 36:
                    int computeSizeFixed32ListNoTag = A4.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i9, computeSizeFixed32ListNoTag);
                        }
                        i14 = com.applovin.impl.L.c(computeSizeFixed32ListNoTag, AbstractC1895e0.computeTagSize(numberAt), computeSizeFixed32ListNoTag, i14);
                    }
                    break;
                case 37:
                    int computeSizeInt64ListNoTag = A4.computeSizeInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i9, computeSizeInt64ListNoTag);
                        }
                        i14 = com.applovin.impl.L.c(computeSizeInt64ListNoTag, AbstractC1895e0.computeTagSize(numberAt), computeSizeInt64ListNoTag, i14);
                    }
                    break;
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    int computeSizeUInt64ListNoTag = A4.computeSizeUInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeUInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i9, computeSizeUInt64ListNoTag);
                        }
                        i14 = com.applovin.impl.L.c(computeSizeUInt64ListNoTag, AbstractC1895e0.computeTagSize(numberAt), computeSizeUInt64ListNoTag, i14);
                    }
                    break;
                case 39:
                    int computeSizeInt32ListNoTag = A4.computeSizeInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeInt32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i9, computeSizeInt32ListNoTag);
                        }
                        i14 = com.applovin.impl.L.c(computeSizeInt32ListNoTag, AbstractC1895e0.computeTagSize(numberAt), computeSizeInt32ListNoTag, i14);
                    }
                    break;
                case 40:
                    int computeSizeFixed64ListNoTag2 = A4.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag2 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i9, computeSizeFixed64ListNoTag2);
                        }
                        i14 = com.applovin.impl.L.c(computeSizeFixed64ListNoTag2, AbstractC1895e0.computeTagSize(numberAt), computeSizeFixed64ListNoTag2, i14);
                    }
                    break;
                case 41:
                    int computeSizeFixed32ListNoTag2 = A4.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed32ListNoTag2 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i9, computeSizeFixed32ListNoTag2);
                        }
                        i14 = com.applovin.impl.L.c(computeSizeFixed32ListNoTag2, AbstractC1895e0.computeTagSize(numberAt), computeSizeFixed32ListNoTag2, i14);
                    }
                    break;
                case 42:
                    int computeSizeBoolListNoTag = A4.computeSizeBoolListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeBoolListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i9, computeSizeBoolListNoTag);
                        }
                        i14 = com.applovin.impl.L.c(computeSizeBoolListNoTag, AbstractC1895e0.computeTagSize(numberAt), computeSizeBoolListNoTag, i14);
                    }
                    break;
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                    int computeSizeUInt32ListNoTag = A4.computeSizeUInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeUInt32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i9, computeSizeUInt32ListNoTag);
                        }
                        i14 = com.applovin.impl.L.c(computeSizeUInt32ListNoTag, AbstractC1895e0.computeTagSize(numberAt), computeSizeUInt32ListNoTag, i14);
                    }
                    break;
                case 44:
                    int computeSizeEnumListNoTag = A4.computeSizeEnumListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeEnumListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i9, computeSizeEnumListNoTag);
                        }
                        i14 = com.applovin.impl.L.c(computeSizeEnumListNoTag, AbstractC1895e0.computeTagSize(numberAt), computeSizeEnumListNoTag, i14);
                    }
                    break;
                case 45:
                    int computeSizeFixed32ListNoTag3 = A4.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed32ListNoTag3 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i9, computeSizeFixed32ListNoTag3);
                        }
                        i14 = com.applovin.impl.L.c(computeSizeFixed32ListNoTag3, AbstractC1895e0.computeTagSize(numberAt), computeSizeFixed32ListNoTag3, i14);
                    }
                    break;
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                    int computeSizeFixed64ListNoTag3 = A4.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag3 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i9, computeSizeFixed64ListNoTag3);
                        }
                        i14 = com.applovin.impl.L.c(computeSizeFixed64ListNoTag3, AbstractC1895e0.computeTagSize(numberAt), computeSizeFixed64ListNoTag3, i14);
                    }
                    break;
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                    int computeSizeSInt32ListNoTag = A4.computeSizeSInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeSInt32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i9, computeSizeSInt32ListNoTag);
                        }
                        i14 = com.applovin.impl.L.c(computeSizeSInt32ListNoTag, AbstractC1895e0.computeTagSize(numberAt), computeSizeSInt32ListNoTag, i14);
                    }
                    break;
                case 48:
                    int computeSizeSInt64ListNoTag = A4.computeSizeSInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i9, computeSizeSInt64ListNoTag);
                        }
                        i14 = com.applovin.impl.L.c(computeSizeSInt64ListNoTag, AbstractC1895e0.computeTagSize(numberAt), computeSizeSInt64ListNoTag, i14);
                    }
                    break;
                case 49:
                    computeBoolSize = A4.computeSizeGroupList(numberAt, (List) unsafe.getObject(obj, offset), getMessageFieldSchema(i13));
                    i14 += computeBoolSize;
                    break;
                case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                    computeBoolSize = ((I3) this.mapFieldSchema).getSerializedSize(numberAt, unsafe.getObject(obj, offset), getMapFieldDefaultEntry(i13));
                    i14 += computeBoolSize;
                    break;
                case ONEOF_TYPE_OFFSET /* 51 */:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        computeBoolSize = AbstractC1895e0.computeDoubleSize(numberAt, 0.0d);
                        i14 += computeBoolSize;
                    }
                    break;
                case 52:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        computeBoolSize = AbstractC1895e0.computeFloatSize(numberAt, 0.0f);
                        i14 += computeBoolSize;
                    }
                    break;
                case 53:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        computeBoolSize = AbstractC1895e0.computeInt64Size(numberAt, oneofLongAt(obj, offset));
                        i14 += computeBoolSize;
                    }
                    break;
                case 54:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        computeBoolSize = AbstractC1895e0.computeUInt64Size(numberAt, oneofLongAt(obj, offset));
                        i14 += computeBoolSize;
                    }
                    break;
                case 55:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        computeBoolSize = AbstractC1895e0.computeInt32Size(numberAt, oneofIntAt(obj, offset));
                        i14 += computeBoolSize;
                    }
                    break;
                case 56:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        computeBoolSize = AbstractC1895e0.computeFixed64Size(numberAt, 0L);
                        i14 += computeBoolSize;
                    }
                    break;
                case 57:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        computeSFixed32Size = AbstractC1895e0.computeFixed32Size(numberAt, 0);
                        i14 += computeSFixed32Size;
                    }
                    break;
                case 58:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        computeBoolSize = AbstractC1895e0.computeBoolSize(numberAt, true);
                        i14 += computeBoolSize;
                    }
                    break;
                case 59:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        Object object2 = unsafe.getObject(obj, offset);
                        if (object2 instanceof H) {
                            computeStringSize = AbstractC1895e0.computeBytesSize(numberAt, (H) object2);
                        } else {
                            computeStringSize = AbstractC1895e0.computeStringSize(numberAt, (String) object2);
                        }
                        i14 = computeStringSize + i14;
                    }
                    break;
                case 60:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        computeBoolSize = A4.computeSizeMessage(numberAt, unsafe.getObject(obj, offset), getMessageFieldSchema(i13));
                        i14 += computeBoolSize;
                    }
                    break;
                case 61:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        computeBoolSize = AbstractC1895e0.computeBytesSize(numberAt, (H) unsafe.getObject(obj, offset));
                        i14 += computeBoolSize;
                    }
                    break;
                case 62:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        computeBoolSize = AbstractC1895e0.computeUInt32Size(numberAt, oneofIntAt(obj, offset));
                        i14 += computeBoolSize;
                    }
                    break;
                case 63:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        computeBoolSize = AbstractC1895e0.computeEnumSize(numberAt, oneofIntAt(obj, offset));
                        i14 += computeBoolSize;
                    }
                    break;
                case 64:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        computeSFixed32Size = AbstractC1895e0.computeSFixed32Size(numberAt, 0);
                        i14 += computeSFixed32Size;
                    }
                    break;
                case 65:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        computeBoolSize = AbstractC1895e0.computeSFixed64Size(numberAt, 0L);
                        i14 += computeBoolSize;
                    }
                    break;
                case 66:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        computeBoolSize = AbstractC1895e0.computeSInt32Size(numberAt, oneofIntAt(obj, offset));
                        i14 += computeBoolSize;
                    }
                    break;
                case 67:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        computeBoolSize = AbstractC1895e0.computeSInt64Size(numberAt, oneofLongAt(obj, offset));
                        i14 += computeBoolSize;
                    }
                    break;
                case 68:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        computeBoolSize = AbstractC1895e0.computeGroupSize(numberAt, (N3) unsafe.getObject(obj, offset), getMessageFieldSchema(i13));
                        i14 += computeBoolSize;
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
        int unknownFieldsSerializedSize = i14 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, obj);
        if (this.hasExtensions) {
            return unknownFieldsSerializedSize + this.extensionSchema.getExtensions(obj).getSerializedSize();
        }
        return unknownFieldsSerializedSize;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x003d. Please report as an issue. */
    private int getSerializedSizeProto3(Object obj) {
        int i9;
        int computeDoubleSize;
        int computeStringSize;
        Unsafe unsafe = UNSAFE;
        int i10 = 0;
        for (int i11 = 0; i11 < this.buffer.length; i11 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i11);
            int type = type(typeAndOffsetAt);
            int numberAt = numberAt(i11);
            long offset = offset(typeAndOffsetAt);
            if (type >= EnumC2022w2.DOUBLE_LIST_PACKED.id() && type <= EnumC2022w2.SINT64_LIST_PACKED.id()) {
                i9 = this.buffer[i11 + 2] & 1048575;
            } else {
                i9 = 0;
            }
            switch (type) {
                case 0:
                    if (isFieldPresent(obj, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeDoubleSize(numberAt, 0.0d);
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (isFieldPresent(obj, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeFloatSize(numberAt, 0.0f);
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (isFieldPresent(obj, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeInt64Size(numberAt, C5.getLong(obj, offset));
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (isFieldPresent(obj, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeUInt64Size(numberAt, C5.getLong(obj, offset));
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (isFieldPresent(obj, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeInt32Size(numberAt, C5.getInt(obj, offset));
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (isFieldPresent(obj, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeFixed64Size(numberAt, 0L);
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (isFieldPresent(obj, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeFixed32Size(numberAt, 0);
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (isFieldPresent(obj, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeBoolSize(numberAt, true);
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (isFieldPresent(obj, i11)) {
                        Object object = C5.getObject(obj, offset);
                        if (object instanceof H) {
                            computeStringSize = AbstractC1895e0.computeBytesSize(numberAt, (H) object);
                        } else {
                            computeStringSize = AbstractC1895e0.computeStringSize(numberAt, (String) object);
                        }
                        i10 = computeStringSize + i10;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (isFieldPresent(obj, i11)) {
                        computeDoubleSize = A4.computeSizeMessage(numberAt, C5.getObject(obj, offset), getMessageFieldSchema(i11));
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (isFieldPresent(obj, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeBytesSize(numberAt, (H) C5.getObject(obj, offset));
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (isFieldPresent(obj, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeUInt32Size(numberAt, C5.getInt(obj, offset));
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (isFieldPresent(obj, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeEnumSize(numberAt, C5.getInt(obj, offset));
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (isFieldPresent(obj, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeSFixed32Size(numberAt, 0);
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (isFieldPresent(obj, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeSFixed64Size(numberAt, 0L);
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (isFieldPresent(obj, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeSInt32Size(numberAt, C5.getInt(obj, offset));
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (isFieldPresent(obj, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeSInt64Size(numberAt, C5.getLong(obj, offset));
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (isFieldPresent(obj, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeGroupSize(numberAt, (N3) C5.getObject(obj, offset), getMessageFieldSchema(i11));
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    computeDoubleSize = A4.computeSizeFixed64List(numberAt, listAt(obj, offset), false);
                    i10 += computeDoubleSize;
                    break;
                case 19:
                    computeDoubleSize = A4.computeSizeFixed32List(numberAt, listAt(obj, offset), false);
                    i10 += computeDoubleSize;
                    break;
                case 20:
                    computeDoubleSize = A4.computeSizeInt64List(numberAt, listAt(obj, offset), false);
                    i10 += computeDoubleSize;
                    break;
                case 21:
                    computeDoubleSize = A4.computeSizeUInt64List(numberAt, listAt(obj, offset), false);
                    i10 += computeDoubleSize;
                    break;
                case 22:
                    computeDoubleSize = A4.computeSizeInt32List(numberAt, listAt(obj, offset), false);
                    i10 += computeDoubleSize;
                    break;
                case 23:
                    computeDoubleSize = A4.computeSizeFixed64List(numberAt, listAt(obj, offset), false);
                    i10 += computeDoubleSize;
                    break;
                case 24:
                    computeDoubleSize = A4.computeSizeFixed32List(numberAt, listAt(obj, offset), false);
                    i10 += computeDoubleSize;
                    break;
                case 25:
                    computeDoubleSize = A4.computeSizeBoolList(numberAt, listAt(obj, offset), false);
                    i10 += computeDoubleSize;
                    break;
                case 26:
                    computeDoubleSize = A4.computeSizeStringList(numberAt, listAt(obj, offset));
                    i10 += computeDoubleSize;
                    break;
                case 27:
                    computeDoubleSize = A4.computeSizeMessageList(numberAt, listAt(obj, offset), getMessageFieldSchema(i11));
                    i10 += computeDoubleSize;
                    break;
                case 28:
                    computeDoubleSize = A4.computeSizeByteStringList(numberAt, listAt(obj, offset));
                    i10 += computeDoubleSize;
                    break;
                case 29:
                    computeDoubleSize = A4.computeSizeUInt32List(numberAt, listAt(obj, offset), false);
                    i10 += computeDoubleSize;
                    break;
                case AD_PLAY_RESET_ON_DEINIT_VALUE:
                    computeDoubleSize = A4.computeSizeEnumList(numberAt, listAt(obj, offset), false);
                    i10 += computeDoubleSize;
                    break;
                case 31:
                    computeDoubleSize = A4.computeSizeFixed32List(numberAt, listAt(obj, offset), false);
                    i10 += computeDoubleSize;
                    break;
                case 32:
                    computeDoubleSize = A4.computeSizeFixed64List(numberAt, listAt(obj, offset), false);
                    i10 += computeDoubleSize;
                    break;
                case 33:
                    computeDoubleSize = A4.computeSizeSInt32List(numberAt, listAt(obj, offset), false);
                    i10 += computeDoubleSize;
                    break;
                case 34:
                    computeDoubleSize = A4.computeSizeSInt64List(numberAt, listAt(obj, offset), false);
                    i10 += computeDoubleSize;
                    break;
                case 35:
                    int computeSizeFixed64ListNoTag = A4.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i9, computeSizeFixed64ListNoTag);
                        }
                        i10 = com.applovin.impl.L.c(computeSizeFixed64ListNoTag, AbstractC1895e0.computeTagSize(numberAt), computeSizeFixed64ListNoTag, i10);
                        break;
                    }
                case 36:
                    int computeSizeFixed32ListNoTag = A4.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed32ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i9, computeSizeFixed32ListNoTag);
                        }
                        i10 = com.applovin.impl.L.c(computeSizeFixed32ListNoTag, AbstractC1895e0.computeTagSize(numberAt), computeSizeFixed32ListNoTag, i10);
                        break;
                    }
                case 37:
                    int computeSizeInt64ListNoTag = A4.computeSizeInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeInt64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i9, computeSizeInt64ListNoTag);
                        }
                        i10 = com.applovin.impl.L.c(computeSizeInt64ListNoTag, AbstractC1895e0.computeTagSize(numberAt), computeSizeInt64ListNoTag, i10);
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    int computeSizeUInt64ListNoTag = A4.computeSizeUInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeUInt64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i9, computeSizeUInt64ListNoTag);
                        }
                        i10 = com.applovin.impl.L.c(computeSizeUInt64ListNoTag, AbstractC1895e0.computeTagSize(numberAt), computeSizeUInt64ListNoTag, i10);
                        break;
                    }
                case 39:
                    int computeSizeInt32ListNoTag = A4.computeSizeInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeInt32ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i9, computeSizeInt32ListNoTag);
                        }
                        i10 = com.applovin.impl.L.c(computeSizeInt32ListNoTag, AbstractC1895e0.computeTagSize(numberAt), computeSizeInt32ListNoTag, i10);
                        break;
                    }
                case 40:
                    int computeSizeFixed64ListNoTag2 = A4.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag2 <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i9, computeSizeFixed64ListNoTag2);
                        }
                        i10 = com.applovin.impl.L.c(computeSizeFixed64ListNoTag2, AbstractC1895e0.computeTagSize(numberAt), computeSizeFixed64ListNoTag2, i10);
                        break;
                    }
                case 41:
                    int computeSizeFixed32ListNoTag2 = A4.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed32ListNoTag2 <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i9, computeSizeFixed32ListNoTag2);
                        }
                        i10 = com.applovin.impl.L.c(computeSizeFixed32ListNoTag2, AbstractC1895e0.computeTagSize(numberAt), computeSizeFixed32ListNoTag2, i10);
                        break;
                    }
                case 42:
                    int computeSizeBoolListNoTag = A4.computeSizeBoolListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeBoolListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i9, computeSizeBoolListNoTag);
                        }
                        i10 = com.applovin.impl.L.c(computeSizeBoolListNoTag, AbstractC1895e0.computeTagSize(numberAt), computeSizeBoolListNoTag, i10);
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                    int computeSizeUInt32ListNoTag = A4.computeSizeUInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeUInt32ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i9, computeSizeUInt32ListNoTag);
                        }
                        i10 = com.applovin.impl.L.c(computeSizeUInt32ListNoTag, AbstractC1895e0.computeTagSize(numberAt), computeSizeUInt32ListNoTag, i10);
                        break;
                    }
                case 44:
                    int computeSizeEnumListNoTag = A4.computeSizeEnumListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeEnumListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i9, computeSizeEnumListNoTag);
                        }
                        i10 = com.applovin.impl.L.c(computeSizeEnumListNoTag, AbstractC1895e0.computeTagSize(numberAt), computeSizeEnumListNoTag, i10);
                        break;
                    }
                case 45:
                    int computeSizeFixed32ListNoTag3 = A4.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed32ListNoTag3 <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i9, computeSizeFixed32ListNoTag3);
                        }
                        i10 = com.applovin.impl.L.c(computeSizeFixed32ListNoTag3, AbstractC1895e0.computeTagSize(numberAt), computeSizeFixed32ListNoTag3, i10);
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                    int computeSizeFixed64ListNoTag3 = A4.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag3 <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i9, computeSizeFixed64ListNoTag3);
                        }
                        i10 = com.applovin.impl.L.c(computeSizeFixed64ListNoTag3, AbstractC1895e0.computeTagSize(numberAt), computeSizeFixed64ListNoTag3, i10);
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                    int computeSizeSInt32ListNoTag = A4.computeSizeSInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeSInt32ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i9, computeSizeSInt32ListNoTag);
                        }
                        i10 = com.applovin.impl.L.c(computeSizeSInt32ListNoTag, AbstractC1895e0.computeTagSize(numberAt), computeSizeSInt32ListNoTag, i10);
                        break;
                    }
                case 48:
                    int computeSizeSInt64ListNoTag = A4.computeSizeSInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeSInt64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i9, computeSizeSInt64ListNoTag);
                        }
                        i10 = com.applovin.impl.L.c(computeSizeSInt64ListNoTag, AbstractC1895e0.computeTagSize(numberAt), computeSizeSInt64ListNoTag, i10);
                        break;
                    }
                case 49:
                    computeDoubleSize = A4.computeSizeGroupList(numberAt, listAt(obj, offset), getMessageFieldSchema(i11));
                    i10 += computeDoubleSize;
                    break;
                case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                    computeDoubleSize = ((I3) this.mapFieldSchema).getSerializedSize(numberAt, C5.getObject(obj, offset), getMapFieldDefaultEntry(i11));
                    i10 += computeDoubleSize;
                    break;
                case ONEOF_TYPE_OFFSET /* 51 */:
                    if (isOneofPresent(obj, numberAt, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeDoubleSize(numberAt, 0.0d);
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(obj, numberAt, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeFloatSize(numberAt, 0.0f);
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(obj, numberAt, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeInt64Size(numberAt, oneofLongAt(obj, offset));
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(obj, numberAt, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeUInt64Size(numberAt, oneofLongAt(obj, offset));
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(obj, numberAt, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeInt32Size(numberAt, oneofIntAt(obj, offset));
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(obj, numberAt, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeFixed64Size(numberAt, 0L);
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(obj, numberAt, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeFixed32Size(numberAt, 0);
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(obj, numberAt, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeBoolSize(numberAt, true);
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(obj, numberAt, i11)) {
                        Object object2 = C5.getObject(obj, offset);
                        if (object2 instanceof H) {
                            computeStringSize = AbstractC1895e0.computeBytesSize(numberAt, (H) object2);
                        } else {
                            computeStringSize = AbstractC1895e0.computeStringSize(numberAt, (String) object2);
                        }
                        i10 = computeStringSize + i10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(obj, numberAt, i11)) {
                        computeDoubleSize = A4.computeSizeMessage(numberAt, C5.getObject(obj, offset), getMessageFieldSchema(i11));
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(obj, numberAt, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeBytesSize(numberAt, (H) C5.getObject(obj, offset));
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(obj, numberAt, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeUInt32Size(numberAt, oneofIntAt(obj, offset));
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(obj, numberAt, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeEnumSize(numberAt, oneofIntAt(obj, offset));
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(obj, numberAt, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeSFixed32Size(numberAt, 0);
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(obj, numberAt, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeSFixed64Size(numberAt, 0L);
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(obj, numberAt, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeSInt32Size(numberAt, oneofIntAt(obj, offset));
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(obj, numberAt, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeSInt64Size(numberAt, oneofLongAt(obj, offset));
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(obj, numberAt, i11)) {
                        computeDoubleSize = AbstractC1895e0.computeGroupSize(numberAt, (N3) C5.getObject(obj, offset), getMessageFieldSchema(i11));
                        i10 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i10 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, obj);
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(AbstractC1990r5 abstractC1990r5, Object obj) {
        return abstractC1990r5.getSerializedSize(abstractC1990r5.getFromMessage(obj));
    }

    private static <T> int intAt(T t9, long j7) {
        return C5.getInt(t9, j7);
    }

    private static boolean isEnforceUtf8(int i9) {
        return (i9 & ENFORCE_UTF8_MASK) != 0;
    }

    private boolean isFieldPresent(Object obj, int i9, int i10, int i11, int i12) {
        if (i10 == 1048575) {
            return isFieldPresent(obj, i9);
        }
        return (i11 & i12) != 0;
    }

    private <N> boolean isListInitialized(Object obj, int i9, int i10) {
        List list = (List) C5.getObject(obj, offset(i9));
        if (list.isEmpty()) {
            return true;
        }
        InterfaceC2038y4 messageFieldSchema = getMessageFieldSchema(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (!messageFieldSchema.isInitialized(list.get(i11))) {
                return false;
            }
        }
        return true;
    }

    private boolean isMapInitialized(Object obj, int i9, int i10) {
        Map<?, ?> forMapData = ((I3) this.mapFieldSchema).forMapData(C5.getObject(obj, offset(i9)));
        if (forMapData.isEmpty()) {
            return true;
        }
        if (((I3) this.mapFieldSchema).forMapMetadata(getMapFieldDefaultEntry(i10)).valueType.getJavaType() != T5.MESSAGE) {
            return true;
        }
        InterfaceC2038y4 interfaceC2038y4 = null;
        for (Object obj2 : forMapData.values()) {
            if (interfaceC2038y4 == null) {
                interfaceC2038y4 = C1969o4.getInstance().schemaFor((Class) obj2.getClass());
            }
            if (!interfaceC2038y4.isInitialized(obj2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMutable(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof L2) {
            return ((L2) obj).isMutable();
        }
        return true;
    }

    private boolean isOneofCaseEqual(Object obj, Object obj2, int i9) {
        long presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i9) & 1048575;
        if (C5.getInt(obj, presenceMaskAndOffsetAt) == C5.getInt(obj2, presenceMaskAndOffsetAt)) {
            return true;
        }
        return false;
    }

    private boolean isOneofPresent(Object obj, int i9, int i10) {
        if (C5.getInt(obj, presenceMaskAndOffsetAt(i10) & 1048575) == i9) {
            return true;
        }
        return false;
    }

    private static boolean isRequired(int i9) {
        return (i9 & REQUIRED_MASK) != 0;
    }

    private static List<?> listAt(Object obj, long j7) {
        return (List) C5.getObject(obj, j7);
    }

    private static <T> long longAt(T t9, long j7) {
        return C5.getLong(t9, j7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:214:0x0094, code lost:
    
        r0 = r18.checkInitializedCount;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0098, code lost:
    
        if (r0 >= r18.repeatedFieldOffsetStart) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x009a, code lost:
    
        r6 = filterMapUnknownEnumValues(r21, r18.intArray[r0], r6, r19, r21);
        r0 = r0 + 1;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x00b0, code lost:
    
        r10 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x00b1, code lost:
    
        if (r6 == null) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x00b3, code lost:
    
        r7.setBuilderToMessage(r10, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x00b6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:?, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x00c5. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0613 A[Catch: all -> 0x0641, TRY_LEAVE, TryCatch #1 {all -> 0x0641, blocks: (B:36:0x060d, B:38:0x0613, B:51:0x063b, B:52:0x0643), top: B:35:0x060d }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x067f A[LOOP:4: B:68:0x067b->B:70:0x067f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0694  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <UT, UB, ET extends com.google.protobuf.InterfaceC1994s2> void mergeFromHelper(com.google.protobuf.AbstractC1990r5 r19, com.google.protobuf.X1 r20, java.lang.Object r21, com.google.protobuf.InterfaceC1996s4 r22, com.google.protobuf.W1 r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.R3.mergeFromHelper(com.google.protobuf.r5, com.google.protobuf.X1, java.lang.Object, com.google.protobuf.s4, com.google.protobuf.W1):void");
    }

    private final <K, V> void mergeMap(Object obj, int i9, Object obj2, W1 w1, InterfaceC1996s4 interfaceC1996s4) throws IOException {
        long offset = offset(typeAndOffsetAt(i9));
        Object object = C5.getObject(obj, offset);
        if (object == null) {
            object = ((I3) this.mapFieldSchema).newMapField(obj2);
            C5.putObject(obj, offset, object);
        } else if (((I3) this.mapFieldSchema).isImmutable(object)) {
            Object newMapField = ((I3) this.mapFieldSchema).newMapField(obj2);
            ((I3) this.mapFieldSchema).mergeFrom(newMapField, object);
            C5.putObject(obj, offset, newMapField);
            object = newMapField;
        }
        ((U) interfaceC1996s4).readMap(((I3) this.mapFieldSchema).forMutableMapData(object), ((I3) this.mapFieldSchema).forMapMetadata(obj2), w1);
    }

    private void mergeMessage(Object obj, Object obj2, int i9) {
        if (!isFieldPresent(obj2, i9)) {
            return;
        }
        long offset = offset(typeAndOffsetAt(i9));
        Unsafe unsafe = UNSAFE;
        Object object = unsafe.getObject(obj2, offset);
        if (object != null) {
            InterfaceC2038y4 messageFieldSchema = getMessageFieldSchema(i9);
            if (!isFieldPresent(obj, i9)) {
                if (!isMutable(object)) {
                    unsafe.putObject(obj, offset, object);
                } else {
                    Object newInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(newInstance, object);
                    unsafe.putObject(obj, offset, newInstance);
                }
                setFieldPresent(obj, i9);
                return;
            }
            Object object2 = unsafe.getObject(obj, offset);
            if (!isMutable(object2)) {
                Object newInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(newInstance2, object2);
                unsafe.putObject(obj, offset, newInstance2);
                object2 = newInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + numberAt(i9) + " is present but null: " + obj2);
    }

    private void mergeOneofMessage(Object obj, Object obj2, int i9) {
        int numberAt = numberAt(i9);
        if (!isOneofPresent(obj2, numberAt, i9)) {
            return;
        }
        long offset = offset(typeAndOffsetAt(i9));
        Unsafe unsafe = UNSAFE;
        Object object = unsafe.getObject(obj2, offset);
        if (object != null) {
            InterfaceC2038y4 messageFieldSchema = getMessageFieldSchema(i9);
            if (!isOneofPresent(obj, numberAt, i9)) {
                if (!isMutable(object)) {
                    unsafe.putObject(obj, offset, object);
                } else {
                    Object newInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(newInstance, object);
                    unsafe.putObject(obj, offset, newInstance);
                }
                setOneofPresent(obj, numberAt, i9);
                return;
            }
            Object object2 = unsafe.getObject(obj, offset);
            if (!isMutable(object2)) {
                Object newInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(newInstance2, object2);
                unsafe.putObject(obj, offset, newInstance2);
                object2 = newInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + numberAt(i9) + " is present but null: " + obj2);
    }

    private void mergeSingleField(Object obj, Object obj2, int i9) {
        int typeAndOffsetAt = typeAndOffsetAt(i9);
        long offset = offset(typeAndOffsetAt);
        int numberAt = numberAt(i9);
        switch (type(typeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(obj2, i9)) {
                    C5.putDouble(obj, offset, C5.getDouble(obj2, offset));
                    setFieldPresent(obj, i9);
                    return;
                }
                return;
            case 1:
                if (isFieldPresent(obj2, i9)) {
                    C5.putFloat(obj, offset, C5.getFloat(obj2, offset));
                    setFieldPresent(obj, i9);
                    return;
                }
                return;
            case 2:
                if (isFieldPresent(obj2, i9)) {
                    C5.putLong(obj, offset, C5.getLong(obj2, offset));
                    setFieldPresent(obj, i9);
                    return;
                }
                return;
            case 3:
                if (isFieldPresent(obj2, i9)) {
                    C5.putLong(obj, offset, C5.getLong(obj2, offset));
                    setFieldPresent(obj, i9);
                    return;
                }
                return;
            case 4:
                if (isFieldPresent(obj2, i9)) {
                    C5.putInt(obj, offset, C5.getInt(obj2, offset));
                    setFieldPresent(obj, i9);
                    return;
                }
                return;
            case 5:
                if (isFieldPresent(obj2, i9)) {
                    C5.putLong(obj, offset, C5.getLong(obj2, offset));
                    setFieldPresent(obj, i9);
                    return;
                }
                return;
            case 6:
                if (isFieldPresent(obj2, i9)) {
                    C5.putInt(obj, offset, C5.getInt(obj2, offset));
                    setFieldPresent(obj, i9);
                    return;
                }
                return;
            case 7:
                if (isFieldPresent(obj2, i9)) {
                    C5.putBoolean(obj, offset, C5.getBoolean(obj2, offset));
                    setFieldPresent(obj, i9);
                    return;
                }
                return;
            case 8:
                if (isFieldPresent(obj2, i9)) {
                    C5.putObject(obj, offset, C5.getObject(obj2, offset));
                    setFieldPresent(obj, i9);
                    return;
                }
                return;
            case 9:
                mergeMessage(obj, obj2, i9);
                return;
            case 10:
                if (isFieldPresent(obj2, i9)) {
                    C5.putObject(obj, offset, C5.getObject(obj2, offset));
                    setFieldPresent(obj, i9);
                    return;
                }
                return;
            case 11:
                if (isFieldPresent(obj2, i9)) {
                    C5.putInt(obj, offset, C5.getInt(obj2, offset));
                    setFieldPresent(obj, i9);
                    return;
                }
                return;
            case 12:
                if (isFieldPresent(obj2, i9)) {
                    C5.putInt(obj, offset, C5.getInt(obj2, offset));
                    setFieldPresent(obj, i9);
                    return;
                }
                return;
            case 13:
                if (isFieldPresent(obj2, i9)) {
                    C5.putInt(obj, offset, C5.getInt(obj2, offset));
                    setFieldPresent(obj, i9);
                    return;
                }
                return;
            case 14:
                if (isFieldPresent(obj2, i9)) {
                    C5.putLong(obj, offset, C5.getLong(obj2, offset));
                    setFieldPresent(obj, i9);
                    return;
                }
                return;
            case 15:
                if (isFieldPresent(obj2, i9)) {
                    C5.putInt(obj, offset, C5.getInt(obj2, offset));
                    setFieldPresent(obj, i9);
                    return;
                }
                return;
            case 16:
                if (isFieldPresent(obj2, i9)) {
                    C5.putLong(obj, offset, C5.getLong(obj2, offset));
                    setFieldPresent(obj, i9);
                    return;
                }
                return;
            case 17:
                mergeMessage(obj, obj2, i9);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case AD_PLAY_RESET_ON_DEINIT_VALUE:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
            case 39:
            case 40:
            case 41:
            case 42:
            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
            case 44:
            case 45:
            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(obj, obj2, offset);
                return;
            case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                A4.mergeMap(this.mapFieldSchema, obj, obj2, offset);
                return;
            case ONEOF_TYPE_OFFSET /* 51 */:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(obj2, numberAt, i9)) {
                    C5.putObject(obj, offset, C5.getObject(obj2, offset));
                    setOneofPresent(obj, numberAt, i9);
                    return;
                }
                return;
            case 60:
                mergeOneofMessage(obj, obj2, i9);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(obj2, numberAt, i9)) {
                    C5.putObject(obj, offset, C5.getObject(obj2, offset));
                    setOneofPresent(obj, numberAt, i9);
                    return;
                }
                return;
            case 68:
                mergeOneofMessage(obj, obj2, i9);
                return;
            default:
                return;
        }
    }

    private Object mutableMessageFieldForMerge(Object obj, int i9) {
        InterfaceC2038y4 messageFieldSchema = getMessageFieldSchema(i9);
        long offset = offset(typeAndOffsetAt(i9));
        if (!isFieldPresent(obj, i9)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(obj, offset);
        if (isMutable(object)) {
            return object;
        }
        Object newInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    private Object mutableOneofMessageFieldForMerge(Object obj, int i9, int i10) {
        InterfaceC2038y4 messageFieldSchema = getMessageFieldSchema(i10);
        if (!isOneofPresent(obj, i9, i10)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(obj, offset(typeAndOffsetAt(i10)));
        if (isMutable(object)) {
            return object;
        }
        Object newInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    public static <T> R3 newSchema(Class<T> cls, K3 k32, Z3 z32, AbstractC2016v3 abstractC2016v3, AbstractC1990r5 abstractC1990r5, X1 x12, H3 h32) {
        if (k32 instanceof C1989r4) {
            return newSchemaForRawMessageInfo((C1989r4) k32, z32, abstractC2016v3, abstractC1990r5, x12, h32);
        }
        return newSchemaForMessageInfo((W4) k32, z32, abstractC2016v3, abstractC1990r5, x12, h32);
    }

    public static <T> R3 newSchemaForMessageInfo(W4 w42, Z3 z32, AbstractC2016v3 abstractC2016v3, AbstractC1990r5 abstractC1990r5, X1 x12, H3 h32) {
        boolean z8;
        int fieldNumber;
        int fieldNumber2;
        int[] iArr;
        int i9;
        if (w42.getSyntax() == EnumC1962n4.PROTO3) {
            z8 = true;
        } else {
            z8 = false;
        }
        C1946l2[] fields = w42.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr2 = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i10 = 0;
        int i11 = 0;
        for (C1946l2 c1946l2 : fields) {
            if (c1946l2.getType() == EnumC2022w2.MAP) {
                i10++;
            } else if (c1946l2.getType().id() >= 18 && c1946l2.getType().id() <= 49) {
                i11++;
            }
        }
        int[] iArr3 = null;
        if (i10 > 0) {
            iArr = new int[i10];
        } else {
            iArr = null;
        }
        if (i11 > 0) {
            iArr3 = new int[i11];
        }
        int[] checkInitialized = w42.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i12 < fields.length) {
            C1946l2 c1946l22 = fields[i12];
            int fieldNumber3 = c1946l22.getFieldNumber();
            storeFieldData(c1946l22, iArr2, i13, objArr);
            if (i14 < checkInitialized.length && checkInitialized[i14] == fieldNumber3) {
                checkInitialized[i14] = i13;
                i14++;
            }
            if (c1946l22.getType() == EnumC2022w2.MAP) {
                iArr[i15] = i13;
                i15++;
            } else if (c1946l22.getType().id() >= 18 && c1946l22.getType().id() <= 49) {
                i9 = i13;
                iArr3[i16] = (int) C5.objectFieldOffset(c1946l22.getField());
                i16++;
                i12++;
                i13 = i9 + 3;
            }
            i9 = i13;
            i12++;
            i13 = i9 + 3;
        }
        if (iArr == null) {
            iArr = EMPTY_INT_ARRAY;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr, 0, iArr4, checkInitialized.length, iArr.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr.length, iArr3.length);
        return new R3(iArr2, objArr, fieldNumber, fieldNumber2, w42.getDefaultInstance(), z8, true, iArr4, checkInitialized.length, checkInitialized.length + iArr.length, z32, abstractC2016v3, abstractC1990r5, x12, h32);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0255  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> com.google.protobuf.R3 newSchemaForRawMessageInfo(com.google.protobuf.C1989r4 r32, com.google.protobuf.Z3 r33, com.google.protobuf.AbstractC2016v3 r34, com.google.protobuf.AbstractC1990r5 r35, com.google.protobuf.X1 r36, com.google.protobuf.H3 r37) {
        /*
            Method dump skipped, instructions count: 990
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.R3.newSchemaForRawMessageInfo(com.google.protobuf.r4, com.google.protobuf.Z3, com.google.protobuf.v3, com.google.protobuf.r5, com.google.protobuf.X1, com.google.protobuf.H3):com.google.protobuf.R3");
    }

    private int numberAt(int i9) {
        return this.buffer[i9];
    }

    private static long offset(int i9) {
        return i9 & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T t9, long j7) {
        return ((Boolean) C5.getObject(t9, j7)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t9, long j7) {
        return ((Double) C5.getObject(t9, j7)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t9, long j7) {
        return ((Float) C5.getObject(t9, j7)).floatValue();
    }

    private static <T> int oneofIntAt(T t9, long j7) {
        return ((Integer) C5.getObject(t9, j7)).intValue();
    }

    private static <T> long oneofLongAt(T t9, long j7) {
        return ((Long) C5.getObject(t9, j7)).longValue();
    }

    private <K, V> int parseMapField(Object obj, byte[] bArr, int i9, int i10, int i11, long j7, C1957n c1957n) throws IOException {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i11);
        Object object = unsafe.getObject(obj, j7);
        if (((I3) this.mapFieldSchema).isImmutable(object)) {
            Object newMapField = ((I3) this.mapFieldSchema).newMapField(mapFieldDefaultEntry);
            ((I3) this.mapFieldSchema).mergeFrom(newMapField, object);
            unsafe.putObject(obj, j7, newMapField);
            object = newMapField;
        }
        return decodeMapEntry(bArr, i9, i10, ((I3) this.mapFieldSchema).forMapMetadata(mapFieldDefaultEntry), ((I3) this.mapFieldSchema).forMutableMapData(object), c1957n);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0023. Please report as an issue. */
    private int parseOneofField(Object obj, byte[] bArr, int i9, int i10, int i11, int i12, int i13, int i14, int i15, long j7, int i16, C1957n c1957n) throws IOException {
        Unsafe unsafe = UNSAFE;
        long j9 = this.buffer[i16 + 2] & 1048575;
        switch (i15) {
            case ONEOF_TYPE_OFFSET /* 51 */:
                if (i13 == 1) {
                    unsafe.putObject(obj, j7, Double.valueOf(C1964o.decodeDouble(bArr, i9)));
                    int i17 = i9 + 8;
                    unsafe.putInt(obj, j9, i12);
                    return i17;
                }
                return i9;
            case 52:
                if (i13 == 5) {
                    unsafe.putObject(obj, j7, Float.valueOf(C1964o.decodeFloat(bArr, i9)));
                    int i18 = i9 + 4;
                    unsafe.putInt(obj, j9, i12);
                    return i18;
                }
                return i9;
            case 53:
            case 54:
                if (i13 == 0) {
                    int decodeVarint64 = C1964o.decodeVarint64(bArr, i9, c1957n);
                    unsafe.putObject(obj, j7, Long.valueOf(c1957n.long1));
                    unsafe.putInt(obj, j9, i12);
                    return decodeVarint64;
                }
                return i9;
            case 55:
            case 62:
                if (i13 == 0) {
                    int decodeVarint32 = C1964o.decodeVarint32(bArr, i9, c1957n);
                    unsafe.putObject(obj, j7, Integer.valueOf(c1957n.int1));
                    unsafe.putInt(obj, j9, i12);
                    return decodeVarint32;
                }
                return i9;
            case 56:
            case 65:
                if (i13 == 1) {
                    unsafe.putObject(obj, j7, Long.valueOf(C1964o.decodeFixed64(bArr, i9)));
                    int i19 = i9 + 8;
                    unsafe.putInt(obj, j9, i12);
                    return i19;
                }
                return i9;
            case 57:
            case 64:
                if (i13 == 5) {
                    unsafe.putObject(obj, j7, Integer.valueOf(C1964o.decodeFixed32(bArr, i9)));
                    int i20 = i9 + 4;
                    unsafe.putInt(obj, j9, i12);
                    return i20;
                }
                return i9;
            case 58:
                if (i13 == 0) {
                    int decodeVarint642 = C1964o.decodeVarint64(bArr, i9, c1957n);
                    unsafe.putObject(obj, j7, Boolean.valueOf(c1957n.long1 != 0));
                    unsafe.putInt(obj, j9, i12);
                    return decodeVarint642;
                }
                return i9;
            case 59:
                if (i13 == 2) {
                    int decodeVarint322 = C1964o.decodeVarint32(bArr, i9, c1957n);
                    int i21 = c1957n.int1;
                    if (i21 == 0) {
                        unsafe.putObject(obj, j7, "");
                    } else {
                        if ((i14 & ENFORCE_UTF8_MASK) != 0 && !I5.isValidUtf8(bArr, decodeVarint322, decodeVarint322 + i21)) {
                            throw C1912g3.invalidUtf8();
                        }
                        unsafe.putObject(obj, j7, new String(bArr, decodeVarint322, i21, C1898e3.UTF_8));
                        decodeVarint322 += i21;
                    }
                    unsafe.putInt(obj, j9, i12);
                    return decodeVarint322;
                }
                return i9;
            case 60:
                if (i13 == 2) {
                    Object mutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(obj, i12, i16);
                    int mergeMessageField = C1964o.mergeMessageField(mutableOneofMessageFieldForMerge, getMessageFieldSchema(i16), bArr, i9, i10, c1957n);
                    storeOneofMessageField(obj, i12, i16, mutableOneofMessageFieldForMerge);
                    return mergeMessageField;
                }
                return i9;
            case 61:
                if (i13 == 2) {
                    int decodeBytes = C1964o.decodeBytes(bArr, i9, c1957n);
                    unsafe.putObject(obj, j7, c1957n.object1);
                    unsafe.putInt(obj, j9, i12);
                    return decodeBytes;
                }
                return i9;
            case 63:
                if (i13 == 0) {
                    int decodeVarint323 = C1964o.decodeVarint32(bArr, i9, c1957n);
                    int i22 = c1957n.int1;
                    X2 enumFieldVerifier = getEnumFieldVerifier(i16);
                    if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i22)) {
                        getMutableUnknownFields(obj).storeField(i11, Long.valueOf(i22));
                    } else {
                        unsafe.putObject(obj, j7, Integer.valueOf(i22));
                        unsafe.putInt(obj, j9, i12);
                    }
                    return decodeVarint323;
                }
                return i9;
            case 66:
                if (i13 == 0) {
                    int decodeVarint324 = C1964o.decodeVarint32(bArr, i9, c1957n);
                    unsafe.putObject(obj, j7, Integer.valueOf(S.decodeZigZag32(c1957n.int1)));
                    unsafe.putInt(obj, j9, i12);
                    return decodeVarint324;
                }
                return i9;
            case 67:
                if (i13 == 0) {
                    int decodeVarint643 = C1964o.decodeVarint64(bArr, i9, c1957n);
                    unsafe.putObject(obj, j7, Long.valueOf(S.decodeZigZag64(c1957n.long1)));
                    unsafe.putInt(obj, j9, i12);
                    return decodeVarint643;
                }
                return i9;
            case 68:
                if (i13 == 3) {
                    Object mutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(obj, i12, i16);
                    int mergeGroupField = C1964o.mergeGroupField(mutableOneofMessageFieldForMerge2, getMessageFieldSchema(i16), bArr, i9, i10, (i11 & (-8)) | 4, c1957n);
                    storeOneofMessageField(obj, i12, i16, mutableOneofMessageFieldForMerge2);
                    return mergeGroupField;
                }
                return i9;
            default:
                return i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0298, code lost:
    
        if (r0 != r10) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x029a, code lost:
    
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r1 = r18;
        r8 = r19;
        r7 = r22;
        r6 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02b2, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02e8, code lost:
    
        if (r0 != r15) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0307, code lost:
    
        if (r0 != r15) goto L99;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0089. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int parseProto3Message(java.lang.Object r30, byte[] r31, int r32, int r33, com.google.protobuf.C1957n r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 876
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.R3.parseProto3Message(java.lang.Object, byte[], int, int, com.google.protobuf.n):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002f. Please report as an issue. */
    private int parseRepeatedField(Object obj, byte[] bArr, int i9, int i10, int i11, int i12, int i13, int i14, long j7, int i15, long j9, C1957n c1957n) throws IOException {
        int decodeVarint32List;
        Unsafe unsafe = UNSAFE;
        InterfaceC1891d3 interfaceC1891d3 = (InterfaceC1891d3) unsafe.getObject(obj, j9);
        if (!interfaceC1891d3.isModifiable()) {
            int size = interfaceC1891d3.size();
            interfaceC1891d3 = interfaceC1891d3.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j9, interfaceC1891d3);
        }
        switch (i15) {
            case 18:
            case 35:
                if (i13 == 2) {
                    return C1964o.decodePackedDoubleList(bArr, i9, interfaceC1891d3, c1957n);
                }
                if (i13 == 1) {
                    return C1964o.decodeDoubleList(i11, bArr, i9, i10, interfaceC1891d3, c1957n);
                }
                return i9;
            case 19:
            case 36:
                if (i13 == 2) {
                    return C1964o.decodePackedFloatList(bArr, i9, interfaceC1891d3, c1957n);
                }
                if (i13 == 5) {
                    return C1964o.decodeFloatList(i11, bArr, i9, i10, interfaceC1891d3, c1957n);
                }
                return i9;
            case 20:
            case 21:
            case 37:
            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                if (i13 == 2) {
                    return C1964o.decodePackedVarint64List(bArr, i9, interfaceC1891d3, c1957n);
                }
                if (i13 == 0) {
                    return C1964o.decodeVarint64List(i11, bArr, i9, i10, interfaceC1891d3, c1957n);
                }
                return i9;
            case 22:
            case 29:
            case 39:
            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                if (i13 == 2) {
                    return C1964o.decodePackedVarint32List(bArr, i9, interfaceC1891d3, c1957n);
                }
                if (i13 == 0) {
                    return C1964o.decodeVarint32List(i11, bArr, i9, i10, interfaceC1891d3, c1957n);
                }
                return i9;
            case 23:
            case 32:
            case 40:
            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                if (i13 == 2) {
                    return C1964o.decodePackedFixed64List(bArr, i9, interfaceC1891d3, c1957n);
                }
                if (i13 == 1) {
                    return C1964o.decodeFixed64List(i11, bArr, i9, i10, interfaceC1891d3, c1957n);
                }
                return i9;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i13 == 2) {
                    return C1964o.decodePackedFixed32List(bArr, i9, interfaceC1891d3, c1957n);
                }
                if (i13 == 5) {
                    return C1964o.decodeFixed32List(i11, bArr, i9, i10, interfaceC1891d3, c1957n);
                }
                return i9;
            case 25:
            case 42:
                if (i13 == 2) {
                    return C1964o.decodePackedBoolList(bArr, i9, interfaceC1891d3, c1957n);
                }
                if (i13 == 0) {
                    return C1964o.decodeBoolList(i11, bArr, i9, i10, interfaceC1891d3, c1957n);
                }
                return i9;
            case 26:
                if (i13 == 2) {
                    if ((j7 & 536870912) == 0) {
                        return C1964o.decodeStringList(i11, bArr, i9, i10, interfaceC1891d3, c1957n);
                    }
                    return C1964o.decodeStringListRequireUtf8(i11, bArr, i9, i10, interfaceC1891d3, c1957n);
                }
                return i9;
            case 27:
                if (i13 == 2) {
                    return C1964o.decodeMessageList(getMessageFieldSchema(i14), i11, bArr, i9, i10, interfaceC1891d3, c1957n);
                }
                return i9;
            case 28:
                if (i13 == 2) {
                    return C1964o.decodeBytesList(i11, bArr, i9, i10, interfaceC1891d3, c1957n);
                }
                return i9;
            case AD_PLAY_RESET_ON_DEINIT_VALUE:
            case 44:
                if (i13 != 2) {
                    if (i13 == 0) {
                        decodeVarint32List = C1964o.decodeVarint32List(i11, bArr, i9, i10, interfaceC1891d3, c1957n);
                    }
                    return i9;
                }
                decodeVarint32List = C1964o.decodePackedVarint32List(bArr, i9, interfaceC1891d3, c1957n);
                A4.filterUnknownEnumList(obj, i12, interfaceC1891d3, getEnumFieldVerifier(i14), (Object) null, this.unknownFieldSchema);
                return decodeVarint32List;
            case 33:
            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                if (i13 == 2) {
                    return C1964o.decodePackedSInt32List(bArr, i9, interfaceC1891d3, c1957n);
                }
                if (i13 == 0) {
                    return C1964o.decodeSInt32List(i11, bArr, i9, i10, interfaceC1891d3, c1957n);
                }
                return i9;
            case 34:
            case 48:
                if (i13 == 2) {
                    return C1964o.decodePackedSInt64List(bArr, i9, interfaceC1891d3, c1957n);
                }
                if (i13 == 0) {
                    return C1964o.decodeSInt64List(i11, bArr, i9, i10, interfaceC1891d3, c1957n);
                }
                return i9;
            case 49:
                if (i13 == 3) {
                    return C1964o.decodeGroupList(getMessageFieldSchema(i14), i11, bArr, i9, i10, interfaceC1891d3, c1957n);
                }
                return i9;
            default:
                return i9;
        }
    }

    private int positionForFieldNumber(int i9) {
        if (i9 < this.minFieldNumber || i9 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i9, 0);
    }

    private int presenceMaskAndOffsetAt(int i9) {
        return this.buffer[i9 + 2];
    }

    private <E> void readGroupList(Object obj, long j7, InterfaceC1996s4 interfaceC1996s4, InterfaceC2038y4 interfaceC2038y4, W1 w1) throws IOException {
        ((U) interfaceC1996s4).readGroupList(this.listFieldSchema.mutableListAt(obj, j7), interfaceC2038y4, w1);
    }

    private <E> void readMessageList(Object obj, int i9, InterfaceC1996s4 interfaceC1996s4, InterfaceC2038y4 interfaceC2038y4, W1 w1) throws IOException {
        U u8 = (U) interfaceC1996s4;
        u8.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i9)), interfaceC2038y4, w1);
    }

    private void readString(Object obj, int i9, InterfaceC1996s4 interfaceC1996s4) throws IOException {
        if (isEnforceUtf8(i9)) {
            C5.putObject(obj, offset(i9), ((U) interfaceC1996s4).readStringRequireUtf8());
        } else if (this.lite) {
            C5.putObject(obj, offset(i9), ((U) interfaceC1996s4).readString());
        } else {
            C5.putObject(obj, offset(i9), ((U) interfaceC1996s4).readBytes());
        }
    }

    private void readStringList(Object obj, int i9, InterfaceC1996s4 interfaceC1996s4) throws IOException {
        if (isEnforceUtf8(i9)) {
            ((U) interfaceC1996s4).readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i9)));
        } else {
            ((U) interfaceC1996s4).readStringList(this.listFieldSchema.mutableListAt(obj, offset(i9)));
        }
    }

    private static java.lang.reflect.Field reflectField(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder n2 = com.mbridge.msdk.foundation.entity.o.n("Field ", str, " for ");
            n2.append(cls.getName());
            n2.append(" not found. Known fields are ");
            n2.append(Arrays.toString(declaredFields));
            throw new RuntimeException(n2.toString());
        }
    }

    private void setFieldPresent(Object obj, int i9) {
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i9);
        long j7 = 1048575 & presenceMaskAndOffsetAt;
        if (j7 == 1048575) {
            return;
        }
        C5.putInt(obj, j7, (1 << (presenceMaskAndOffsetAt >>> 20)) | C5.getInt(obj, j7));
    }

    private void setOneofPresent(Object obj, int i9, int i10) {
        C5.putInt(obj, presenceMaskAndOffsetAt(i10) & 1048575, i9);
    }

    private int slowPositionForFieldNumber(int i9, int i10) {
        int length = (this.buffer.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int numberAt = numberAt(i12);
            if (i9 == numberAt) {
                return i12;
            }
            if (i9 < numberAt) {
                length = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void storeFieldData(com.google.protobuf.C1946l2 r8, int[] r9, int r10, java.lang.Object[] r11) {
        /*
            com.google.protobuf.h4 r0 = r8.getOneof()
            r1 = 0
            if (r0 == 0) goto L25
            com.google.protobuf.w2 r2 = r8.getType()
            int r2 = r2.id()
            int r2 = r2 + 51
            java.lang.reflect.Field r3 = r0.getValueField()
            long r3 = com.google.protobuf.C5.objectFieldOffset(r3)
            int r3 = (int) r3
            java.lang.reflect.Field r0 = r0.getCaseField()
            long r4 = com.google.protobuf.C5.objectFieldOffset(r0)
        L22:
            int r0 = (int) r4
            r4 = r1
            goto L6c
        L25:
            com.google.protobuf.w2 r0 = r8.getType()
            java.lang.reflect.Field r2 = r8.getField()
            long r2 = com.google.protobuf.C5.objectFieldOffset(r2)
            int r3 = (int) r2
            int r2 = r0.id()
            boolean r4 = r0.isList()
            if (r4 != 0) goto L5a
            boolean r0 = r0.isMap()
            if (r0 != 0) goto L5a
            java.lang.reflect.Field r0 = r8.getPresenceField()
            if (r0 != 0) goto L4c
            r0 = 1048575(0xfffff, float:1.469367E-39)
            goto L51
        L4c:
            long r4 = com.google.protobuf.C5.objectFieldOffset(r0)
            int r0 = (int) r4
        L51:
            int r4 = r8.getPresenceMask()
            int r4 = java.lang.Integer.numberOfTrailingZeros(r4)
            goto L6c
        L5a:
            java.lang.reflect.Field r0 = r8.getCachedSizeField()
            if (r0 != 0) goto L63
            r0 = r1
            r4 = r0
            goto L6c
        L63:
            java.lang.reflect.Field r0 = r8.getCachedSizeField()
            long r4 = com.google.protobuf.C5.objectFieldOffset(r0)
            goto L22
        L6c:
            int r5 = r8.getFieldNumber()
            r9[r10] = r5
            int r5 = r10 + 1
            boolean r6 = r8.isEnforceUtf8()
            if (r6 == 0) goto L7d
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            goto L7e
        L7d:
            r6 = r1
        L7e:
            boolean r7 = r8.isRequired()
            if (r7 == 0) goto L86
            r1 = 268435456(0x10000000, float:2.524355E-29)
        L86:
            r1 = r1 | r6
            int r2 = r2 << 20
            r1 = r1 | r2
            r1 = r1 | r3
            r9[r5] = r1
            int r1 = r10 + 2
            int r2 = r4 << 20
            r0 = r0 | r2
            r9[r1] = r0
            java.lang.Class r9 = r8.getMessageFieldClass()
            java.lang.Object r0 = r8.getMapDefaultEntry()
            if (r0 == 0) goto Lbe
            int r10 = r10 / 3
            int r10 = r10 * 2
            java.lang.Object r0 = r8.getMapDefaultEntry()
            r11[r10] = r0
            if (r9 == 0) goto Laf
            int r10 = r10 + 1
            r11[r10] = r9
            goto Ldb
        Laf:
            com.google.protobuf.X2 r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Ldb
            int r10 = r10 + 1
            com.google.protobuf.X2 r8 = r8.getEnumVerifier()
            r11[r10] = r8
            goto Ldb
        Lbe:
            if (r9 == 0) goto Lc9
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            r11[r10] = r9
            goto Ldb
        Lc9:
            com.google.protobuf.X2 r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Ldb
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            com.google.protobuf.X2 r8 = r8.getEnumVerifier()
            r11[r10] = r8
        Ldb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.R3.storeFieldData(com.google.protobuf.l2, int[], int, java.lang.Object[]):void");
    }

    private void storeMessageField(Object obj, int i9, Object obj2) {
        UNSAFE.putObject(obj, offset(typeAndOffsetAt(i9)), obj2);
        setFieldPresent(obj, i9);
    }

    private void storeOneofMessageField(Object obj, int i9, int i10, Object obj2) {
        UNSAFE.putObject(obj, offset(typeAndOffsetAt(i10)), obj2);
        setOneofPresent(obj, i9, i10);
    }

    private static int type(int i9) {
        return (i9 & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int i9) {
        return this.buffer[i9 + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInAscendingOrderProto2(java.lang.Object r18, com.google.protobuf.a6 r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.R3.writeFieldsInAscendingOrderProto2(java.lang.Object, com.google.protobuf.a6):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInAscendingOrderProto3(java.lang.Object r13, com.google.protobuf.a6 r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.R3.writeFieldsInAscendingOrderProto3(java.lang.Object, com.google.protobuf.a6):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInDescendingOrder(java.lang.Object r11, com.google.protobuf.a6 r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.R3.writeFieldsInDescendingOrder(java.lang.Object, com.google.protobuf.a6):void");
    }

    private <K, V> void writeMapHelper(a6 a6Var, int i9, Object obj, int i10) throws IOException {
        if (obj != null) {
            C1909g0 c1909g0 = (C1909g0) a6Var;
            c1909g0.writeMap(i9, ((I3) this.mapFieldSchema).forMapMetadata(getMapFieldDefaultEntry(i10)), ((I3) this.mapFieldSchema).forMapData(obj));
        }
    }

    private void writeString(int i9, Object obj, a6 a6Var) throws IOException {
        if (obj instanceof String) {
            ((C1909g0) a6Var).writeString(i9, (String) obj);
        } else {
            ((C1909g0) a6Var).writeBytes(i9, (H) obj);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(AbstractC1990r5 abstractC1990r5, Object obj, a6 a6Var) throws IOException {
        abstractC1990r5.writeTo(abstractC1990r5.getFromMessage(obj), a6Var);
    }

    @Override // com.google.protobuf.InterfaceC2038y4
    public boolean equals(Object obj, Object obj2) {
        int length = this.buffer.length;
        for (int i9 = 0; i9 < length; i9 += 3) {
            if (!equals(obj, obj2, i9)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(obj).equals(this.unknownFieldSchema.getFromMessage(obj2))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(obj).equals(this.extensionSchema.getExtensions(obj2));
        }
        return true;
    }

    public int getSchemaSize() {
        return this.buffer.length * 3;
    }

    @Override // com.google.protobuf.InterfaceC2038y4
    public int getSerializedSize(Object obj) {
        if (this.proto3) {
            return getSerializedSizeProto3(obj);
        }
        return getSerializedSizeProto2(obj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0019. Please report as an issue. */
    @Override // com.google.protobuf.InterfaceC2038y4
    public int hashCode(Object obj) {
        int i9;
        int hashLong;
        int i10;
        int oneofIntAt;
        int length = this.buffer.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i12);
            int numberAt = numberAt(i12);
            long offset = offset(typeAndOffsetAt);
            int i13 = 37;
            switch (type(typeAndOffsetAt)) {
                case 0:
                    i9 = i11 * 53;
                    hashLong = C1898e3.hashLong(Double.doubleToLongBits(C5.getDouble(obj, offset)));
                    i11 = hashLong + i9;
                    break;
                case 1:
                    i9 = i11 * 53;
                    hashLong = Float.floatToIntBits(C5.getFloat(obj, offset));
                    i11 = hashLong + i9;
                    break;
                case 2:
                    i9 = i11 * 53;
                    hashLong = C1898e3.hashLong(C5.getLong(obj, offset));
                    i11 = hashLong + i9;
                    break;
                case 3:
                    i9 = i11 * 53;
                    hashLong = C1898e3.hashLong(C5.getLong(obj, offset));
                    i11 = hashLong + i9;
                    break;
                case 4:
                    i9 = i11 * 53;
                    hashLong = C5.getInt(obj, offset);
                    i11 = hashLong + i9;
                    break;
                case 5:
                    i9 = i11 * 53;
                    hashLong = C1898e3.hashLong(C5.getLong(obj, offset));
                    i11 = hashLong + i9;
                    break;
                case 6:
                    i9 = i11 * 53;
                    hashLong = C5.getInt(obj, offset);
                    i11 = hashLong + i9;
                    break;
                case 7:
                    i9 = i11 * 53;
                    hashLong = C1898e3.hashBoolean(C5.getBoolean(obj, offset));
                    i11 = hashLong + i9;
                    break;
                case 8:
                    i9 = i11 * 53;
                    hashLong = ((String) C5.getObject(obj, offset)).hashCode();
                    i11 = hashLong + i9;
                    break;
                case 9:
                    Object object = C5.getObject(obj, offset);
                    if (object != null) {
                        i13 = object.hashCode();
                    }
                    i11 = (i11 * 53) + i13;
                    break;
                case 10:
                    i9 = i11 * 53;
                    hashLong = C5.getObject(obj, offset).hashCode();
                    i11 = hashLong + i9;
                    break;
                case 11:
                    i9 = i11 * 53;
                    hashLong = C5.getInt(obj, offset);
                    i11 = hashLong + i9;
                    break;
                case 12:
                    i9 = i11 * 53;
                    hashLong = C5.getInt(obj, offset);
                    i11 = hashLong + i9;
                    break;
                case 13:
                    i9 = i11 * 53;
                    hashLong = C5.getInt(obj, offset);
                    i11 = hashLong + i9;
                    break;
                case 14:
                    i9 = i11 * 53;
                    hashLong = C1898e3.hashLong(C5.getLong(obj, offset));
                    i11 = hashLong + i9;
                    break;
                case 15:
                    i9 = i11 * 53;
                    hashLong = C5.getInt(obj, offset);
                    i11 = hashLong + i9;
                    break;
                case 16:
                    i9 = i11 * 53;
                    hashLong = C1898e3.hashLong(C5.getLong(obj, offset));
                    i11 = hashLong + i9;
                    break;
                case 17:
                    Object object2 = C5.getObject(obj, offset);
                    if (object2 != null) {
                        i13 = object2.hashCode();
                    }
                    i11 = (i11 * 53) + i13;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case AD_PLAY_RESET_ON_DEINIT_VALUE:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                case 39:
                case 40:
                case 41:
                case 42:
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                case 44:
                case 45:
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                case 48:
                case 49:
                    i9 = i11 * 53;
                    hashLong = C5.getObject(obj, offset).hashCode();
                    i11 = hashLong + i9;
                    break;
                case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                    i9 = i11 * 53;
                    hashLong = C5.getObject(obj, offset).hashCode();
                    i11 = hashLong + i9;
                    break;
                case ONEOF_TYPE_OFFSET /* 51 */:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        i9 = i11 * 53;
                        hashLong = C1898e3.hashLong(Double.doubleToLongBits(oneofDoubleAt(obj, offset)));
                        i11 = hashLong + i9;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        i9 = i11 * 53;
                        hashLong = Float.floatToIntBits(oneofFloatAt(obj, offset));
                        i11 = hashLong + i9;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        i9 = i11 * 53;
                        hashLong = C1898e3.hashLong(oneofLongAt(obj, offset));
                        i11 = hashLong + i9;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        i9 = i11 * 53;
                        hashLong = C1898e3.hashLong(oneofLongAt(obj, offset));
                        i11 = hashLong + i9;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        i10 = i11 * 53;
                        oneofIntAt = oneofIntAt(obj, offset);
                        i11 = i10 + oneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        i9 = i11 * 53;
                        hashLong = C1898e3.hashLong(oneofLongAt(obj, offset));
                        i11 = hashLong + i9;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        i10 = i11 * 53;
                        oneofIntAt = oneofIntAt(obj, offset);
                        i11 = i10 + oneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        i9 = i11 * 53;
                        hashLong = C1898e3.hashBoolean(oneofBooleanAt(obj, offset));
                        i11 = hashLong + i9;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        i9 = i11 * 53;
                        hashLong = ((String) C5.getObject(obj, offset)).hashCode();
                        i11 = hashLong + i9;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        i9 = i11 * 53;
                        hashLong = C5.getObject(obj, offset).hashCode();
                        i11 = hashLong + i9;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        i9 = i11 * 53;
                        hashLong = C5.getObject(obj, offset).hashCode();
                        i11 = hashLong + i9;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        i10 = i11 * 53;
                        oneofIntAt = oneofIntAt(obj, offset);
                        i11 = i10 + oneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        i10 = i11 * 53;
                        oneofIntAt = oneofIntAt(obj, offset);
                        i11 = i10 + oneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        i10 = i11 * 53;
                        oneofIntAt = oneofIntAt(obj, offset);
                        i11 = i10 + oneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        i9 = i11 * 53;
                        hashLong = C1898e3.hashLong(oneofLongAt(obj, offset));
                        i11 = hashLong + i9;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        i10 = i11 * 53;
                        oneofIntAt = oneofIntAt(obj, offset);
                        i11 = i10 + oneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        i9 = i11 * 53;
                        hashLong = C1898e3.hashLong(oneofLongAt(obj, offset));
                        i11 = hashLong + i9;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        i9 = i11 * 53;
                        hashLong = C5.getObject(obj, offset).hashCode();
                        i11 = hashLong + i9;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.unknownFieldSchema.getFromMessage(obj).hashCode() + (i11 * 53);
        if (this.hasExtensions) {
            return (hashCode * 53) + this.extensionSchema.getExtensions(obj).hashCode();
        }
        return hashCode;
    }

    @Override // com.google.protobuf.InterfaceC2038y4
    public final boolean isInitialized(Object obj) {
        int i9;
        int i10;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (i13 < this.checkInitializedCount) {
            int i14 = this.intArray[i13];
            int numberAt = numberAt(i14);
            int typeAndOffsetAt = typeAndOffsetAt(i14);
            int i15 = this.buffer[i14 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i11) {
                if (i16 != 1048575) {
                    i12 = UNSAFE.getInt(obj, i16);
                }
                i10 = i12;
                i9 = i16;
            } else {
                i9 = i11;
                i10 = i12;
            }
            if (isRequired(typeAndOffsetAt) && !isFieldPresent(obj, i14, i9, i10, i17)) {
                return false;
            }
            int type = type(typeAndOffsetAt);
            if (type != 9 && type != 17) {
                if (type != 27) {
                    if (type == 60 || type == 68) {
                        if (isOneofPresent(obj, numberAt, i14) && !isInitialized(obj, typeAndOffsetAt, getMessageFieldSchema(i14))) {
                            return false;
                        }
                    } else if (type != 49) {
                        if (type == 50 && !isMapInitialized(obj, typeAndOffsetAt, i14)) {
                            return false;
                        }
                    }
                }
                if (!isListInitialized(obj, typeAndOffsetAt, i14)) {
                    return false;
                }
            } else if (isFieldPresent(obj, i14, i9, i10, i17) && !isInitialized(obj, typeAndOffsetAt, getMessageFieldSchema(i14))) {
                return false;
            }
            i13++;
            i11 = i9;
            i12 = i10;
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(obj).isInitialized();
    }

    @Override // com.google.protobuf.InterfaceC2038y4
    public void makeImmutable(Object obj) {
        if (!isMutable(obj)) {
            return;
        }
        if (obj instanceof L2) {
            L2 l2 = (L2) obj;
            l2.clearMemoizedSerializedSize();
            l2.clearMemoizedHashCode();
            l2.markImmutable();
        }
        int length = this.buffer.length;
        for (int i9 = 0; i9 < length; i9 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i9);
            long offset = offset(typeAndOffsetAt);
            int type = type(typeAndOffsetAt);
            if (type != 9) {
                switch (type) {
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case AD_PLAY_RESET_ON_DEINIT_VALUE:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                    case 44:
                    case 45:
                    case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                    case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                    case 48:
                    case 49:
                        this.listFieldSchema.makeImmutableListAt(obj, offset);
                        break;
                    case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                        Unsafe unsafe = UNSAFE;
                        Object object = unsafe.getObject(obj, offset);
                        if (object != null) {
                            unsafe.putObject(obj, offset, ((I3) this.mapFieldSchema).toImmutable(object));
                            break;
                        } else {
                            break;
                        }
                }
            }
            if (isFieldPresent(obj, i9)) {
                getMessageFieldSchema(i9).makeImmutable(UNSAFE.getObject(obj, offset));
            }
        }
        this.unknownFieldSchema.makeImmutable(obj);
        if (this.hasExtensions) {
            this.extensionSchema.makeImmutable(obj);
        }
    }

    @Override // com.google.protobuf.InterfaceC2038y4
    public void mergeFrom(Object obj, Object obj2) {
        checkMutable(obj);
        obj2.getClass();
        for (int i9 = 0; i9 < this.buffer.length; i9 += 3) {
            mergeSingleField(obj, obj2, i9);
        }
        A4.mergeUnknownFields(this.unknownFieldSchema, obj, obj2);
        if (this.hasExtensions) {
            A4.mergeExtensions(this.extensionSchema, obj, obj2);
        }
    }

    @Override // com.google.protobuf.InterfaceC2038y4
    public Object newInstance() {
        return ((C1871a4) this.newInstanceSchema).newInstance(this.defaultInstance);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:98:0x0090. Please report as an issue. */
    public int parseProto2Message(Object obj, byte[] bArr, int i9, int i10, int i11, C1957n c1957n) throws IOException {
        Unsafe unsafe;
        int i12;
        R3 r32;
        int i13;
        int i14;
        int i15;
        int i16;
        Object obj2;
        int i17;
        int positionForFieldNumber;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        byte[] bArr2;
        int decodeVarint64;
        boolean z8;
        int i28;
        int i29;
        int i30;
        R3 r33 = this;
        Object obj3 = obj;
        byte[] bArr3 = bArr;
        int i31 = i10;
        int i32 = i11;
        C1957n c1957n2 = c1957n;
        checkMutable(obj);
        Unsafe unsafe2 = UNSAFE;
        int i33 = i9;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = -1;
        int i38 = 1048575;
        while (true) {
            if (i33 < i31) {
                int i39 = i33 + 1;
                byte b = bArr3[i33];
                if (b < 0) {
                    int decodeVarint32 = C1964o.decodeVarint32(b, bArr3, i39, c1957n2);
                    i17 = c1957n2.int1;
                    i39 = decodeVarint32;
                } else {
                    i17 = b;
                }
                int i40 = i17 >>> 3;
                int i41 = i17 & 7;
                if (i40 > i37) {
                    positionForFieldNumber = r33.positionForFieldNumber(i40, i34 / 3);
                } else {
                    positionForFieldNumber = r33.positionForFieldNumber(i40);
                }
                int i42 = positionForFieldNumber;
                if (i42 == -1) {
                    i18 = i40;
                    i19 = i39;
                    i14 = i17;
                    i20 = i36;
                    i21 = i38;
                    unsafe = unsafe2;
                    i12 = i32;
                    i22 = 0;
                } else {
                    int i43 = r33.buffer[i42 + 1];
                    int type = type(i43);
                    long offset = offset(i43);
                    int i44 = i17;
                    if (type <= 17) {
                        int i45 = r33.buffer[i42 + 2];
                        int i46 = 1 << (i45 >>> 20);
                        int i47 = i45 & 1048575;
                        if (i47 != i38) {
                            if (i38 != 1048575) {
                                unsafe2.putInt(obj3, i38, i36);
                            }
                            i24 = i47;
                            i23 = unsafe2.getInt(obj3, i47);
                        } else {
                            i23 = i36;
                            i24 = i38;
                        }
                        switch (type) {
                            case 0:
                                bArr2 = bArr;
                                i18 = i40;
                                i27 = i42;
                                i25 = i24;
                                i26 = i44;
                                if (i41 == 1) {
                                    C5.putDouble(obj3, offset, C1964o.decodeDouble(bArr2, i39));
                                    i33 = i39 + 8;
                                    i36 = i23 | i46;
                                    i32 = i11;
                                    i34 = i27;
                                    i35 = i26;
                                    i37 = i18;
                                    i38 = i25;
                                    bArr3 = bArr2;
                                } else {
                                    i21 = i25;
                                    i12 = i11;
                                    i19 = i39;
                                    i22 = i27;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i26;
                                    break;
                                }
                            case 1:
                                bArr2 = bArr;
                                i18 = i40;
                                i27 = i42;
                                i25 = i24;
                                i26 = i44;
                                if (i41 == 5) {
                                    C5.putFloat(obj3, offset, C1964o.decodeFloat(bArr2, i39));
                                    i33 = i39 + 4;
                                    i36 = i23 | i46;
                                    i32 = i11;
                                    i34 = i27;
                                    i35 = i26;
                                    i37 = i18;
                                    i38 = i25;
                                    bArr3 = bArr2;
                                } else {
                                    i21 = i25;
                                    i12 = i11;
                                    i19 = i39;
                                    i22 = i27;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i26;
                                    break;
                                }
                            case 2:
                            case 3:
                                bArr2 = bArr;
                                i18 = i40;
                                i27 = i42;
                                i25 = i24;
                                i26 = i44;
                                if (i41 == 0) {
                                    decodeVarint64 = C1964o.decodeVarint64(bArr2, i39, c1957n2);
                                    unsafe2.putLong(obj, offset, c1957n2.long1);
                                    i36 = i23 | i46;
                                    i32 = i11;
                                    i34 = i27;
                                    i33 = decodeVarint64;
                                    i35 = i26;
                                    i37 = i18;
                                    i38 = i25;
                                    bArr3 = bArr2;
                                } else {
                                    i21 = i25;
                                    i12 = i11;
                                    i19 = i39;
                                    i22 = i27;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i26;
                                    break;
                                }
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i18 = i40;
                                i27 = i42;
                                i25 = i24;
                                i26 = i44;
                                if (i41 == 0) {
                                    i33 = C1964o.decodeVarint32(bArr2, i39, c1957n2);
                                    unsafe2.putInt(obj3, offset, c1957n2.int1);
                                    i36 = i23 | i46;
                                    i32 = i11;
                                    i34 = i27;
                                    i35 = i26;
                                    i37 = i18;
                                    i38 = i25;
                                    bArr3 = bArr2;
                                } else {
                                    i21 = i25;
                                    i12 = i11;
                                    i19 = i39;
                                    i22 = i27;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i26;
                                    break;
                                }
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i18 = i40;
                                i27 = i42;
                                i25 = i24;
                                i26 = i44;
                                if (i41 == 1) {
                                    unsafe2.putLong(obj, offset, C1964o.decodeFixed64(bArr2, i39));
                                    i33 = i39 + 8;
                                    i36 = i23 | i46;
                                    i32 = i11;
                                    i34 = i27;
                                    i35 = i26;
                                    i37 = i18;
                                    i38 = i25;
                                    bArr3 = bArr2;
                                } else {
                                    i21 = i25;
                                    i12 = i11;
                                    i19 = i39;
                                    i22 = i27;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i26;
                                    break;
                                }
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i18 = i40;
                                i27 = i42;
                                i25 = i24;
                                i26 = i44;
                                if (i41 == 5) {
                                    unsafe2.putInt(obj3, offset, C1964o.decodeFixed32(bArr2, i39));
                                    i33 = i39 + 4;
                                    i36 = i23 | i46;
                                    i32 = i11;
                                    i34 = i27;
                                    i35 = i26;
                                    i37 = i18;
                                    i38 = i25;
                                    bArr3 = bArr2;
                                } else {
                                    i21 = i25;
                                    i12 = i11;
                                    i19 = i39;
                                    i22 = i27;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i26;
                                    break;
                                }
                            case 7:
                                bArr2 = bArr;
                                i18 = i40;
                                i27 = i42;
                                i25 = i24;
                                i26 = i44;
                                if (i41 == 0) {
                                    i33 = C1964o.decodeVarint64(bArr2, i39, c1957n2);
                                    if (c1957n2.long1 != 0) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    C5.putBoolean(obj3, offset, z8);
                                    i36 = i23 | i46;
                                    i32 = i11;
                                    i34 = i27;
                                    i35 = i26;
                                    i37 = i18;
                                    i38 = i25;
                                    bArr3 = bArr2;
                                } else {
                                    i21 = i25;
                                    i12 = i11;
                                    i19 = i39;
                                    i22 = i27;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i26;
                                    break;
                                }
                            case 8:
                                bArr2 = bArr;
                                i18 = i40;
                                i27 = i42;
                                i25 = i24;
                                i26 = i44;
                                if (i41 == 2) {
                                    if ((ENFORCE_UTF8_MASK & i43) == 0) {
                                        i33 = C1964o.decodeString(bArr2, i39, c1957n2);
                                    } else {
                                        i33 = C1964o.decodeStringRequireUtf8(bArr2, i39, c1957n2);
                                    }
                                    unsafe2.putObject(obj3, offset, c1957n2.object1);
                                    i36 = i23 | i46;
                                    i32 = i11;
                                    i34 = i27;
                                    i35 = i26;
                                    i37 = i18;
                                    i38 = i25;
                                    bArr3 = bArr2;
                                } else {
                                    i21 = i25;
                                    i12 = i11;
                                    i19 = i39;
                                    i22 = i27;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i26;
                                    break;
                                }
                            case 9:
                                bArr2 = bArr;
                                i18 = i40;
                                i27 = i42;
                                i25 = i24;
                                i26 = i44;
                                if (i41 == 2) {
                                    Object mutableMessageFieldForMerge = r33.mutableMessageFieldForMerge(obj3, i27);
                                    i33 = C1964o.mergeMessageField(mutableMessageFieldForMerge, r33.getMessageFieldSchema(i27), bArr, i39, i10, c1957n);
                                    r33.storeMessageField(obj3, i27, mutableMessageFieldForMerge);
                                    i36 = i23 | i46;
                                    i32 = i11;
                                    i34 = i27;
                                    i35 = i26;
                                    i37 = i18;
                                    i38 = i25;
                                    bArr3 = bArr2;
                                } else {
                                    i21 = i25;
                                    i12 = i11;
                                    i19 = i39;
                                    i22 = i27;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i26;
                                    break;
                                }
                            case 10:
                                bArr2 = bArr;
                                i18 = i40;
                                i27 = i42;
                                i25 = i24;
                                i26 = i44;
                                if (i41 == 2) {
                                    i33 = C1964o.decodeBytes(bArr2, i39, c1957n2);
                                    unsafe2.putObject(obj3, offset, c1957n2.object1);
                                    i36 = i23 | i46;
                                    i32 = i11;
                                    i34 = i27;
                                    i35 = i26;
                                    i37 = i18;
                                    i38 = i25;
                                    bArr3 = bArr2;
                                } else {
                                    i21 = i25;
                                    i12 = i11;
                                    i19 = i39;
                                    i22 = i27;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i26;
                                    break;
                                }
                            case 12:
                                bArr2 = bArr;
                                i18 = i40;
                                i27 = i42;
                                i25 = i24;
                                i26 = i44;
                                if (i41 == 0) {
                                    i33 = C1964o.decodeVarint32(bArr2, i39, c1957n2);
                                    int i48 = c1957n2.int1;
                                    X2 enumFieldVerifier = r33.getEnumFieldVerifier(i27);
                                    if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i48)) {
                                        getMutableUnknownFields(obj).storeField(i26, Long.valueOf(i48));
                                        i34 = i27;
                                        i36 = i23;
                                        i35 = i26;
                                        i37 = i18;
                                        i38 = i25;
                                        i32 = i11;
                                        bArr3 = bArr2;
                                    } else {
                                        unsafe2.putInt(obj3, offset, i48);
                                        i36 = i23 | i46;
                                        i32 = i11;
                                        i34 = i27;
                                        i35 = i26;
                                        i37 = i18;
                                        i38 = i25;
                                        bArr3 = bArr2;
                                    }
                                } else {
                                    i21 = i25;
                                    i12 = i11;
                                    i19 = i39;
                                    i22 = i27;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i26;
                                    break;
                                }
                                break;
                            case 15:
                                bArr2 = bArr;
                                i18 = i40;
                                i27 = i42;
                                i25 = i24;
                                i26 = i44;
                                if (i41 == 0) {
                                    i33 = C1964o.decodeVarint32(bArr2, i39, c1957n2);
                                    unsafe2.putInt(obj3, offset, S.decodeZigZag32(c1957n2.int1));
                                    i36 = i23 | i46;
                                    i32 = i11;
                                    i34 = i27;
                                    i35 = i26;
                                    i37 = i18;
                                    i38 = i25;
                                    bArr3 = bArr2;
                                } else {
                                    i21 = i25;
                                    i12 = i11;
                                    i19 = i39;
                                    i22 = i27;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i26;
                                    break;
                                }
                            case 16:
                                i18 = i40;
                                i27 = i42;
                                i25 = i24;
                                i26 = i44;
                                bArr2 = bArr;
                                if (i41 == 0) {
                                    decodeVarint64 = C1964o.decodeVarint64(bArr2, i39, c1957n2);
                                    unsafe2.putLong(obj, offset, S.decodeZigZag64(c1957n2.long1));
                                    i36 = i23 | i46;
                                    i32 = i11;
                                    i34 = i27;
                                    i33 = decodeVarint64;
                                    i35 = i26;
                                    i37 = i18;
                                    i38 = i25;
                                    bArr3 = bArr2;
                                } else {
                                    i21 = i25;
                                    i12 = i11;
                                    i19 = i39;
                                    i22 = i27;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i26;
                                    break;
                                }
                            case 17:
                                if (i41 == 3) {
                                    Object mutableMessageFieldForMerge2 = r33.mutableMessageFieldForMerge(obj3, i42);
                                    i33 = C1964o.mergeGroupField(mutableMessageFieldForMerge2, r33.getMessageFieldSchema(i42), bArr, i39, i10, (i40 << 3) | 4, c1957n);
                                    r33.storeMessageField(obj3, i42, mutableMessageFieldForMerge2);
                                    i36 = i23 | i46;
                                    i38 = i24;
                                    i32 = i11;
                                    i34 = i42;
                                    i35 = i44;
                                    i37 = i40;
                                    bArr3 = bArr;
                                } else {
                                    i18 = i40;
                                    i25 = i24;
                                    i26 = i44;
                                    i27 = i42;
                                    i21 = i25;
                                    i12 = i11;
                                    i19 = i39;
                                    i22 = i27;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i26;
                                    break;
                                }
                            default:
                                i18 = i40;
                                i27 = i42;
                                i25 = i24;
                                i26 = i44;
                                i21 = i25;
                                i12 = i11;
                                i19 = i39;
                                i22 = i27;
                                unsafe = unsafe2;
                                i20 = i23;
                                i14 = i26;
                                break;
                        }
                    } else {
                        i18 = i40;
                        i21 = i38;
                        i20 = i36;
                        if (type == 27) {
                            if (i41 == 2) {
                                InterfaceC1891d3 interfaceC1891d3 = (InterfaceC1891d3) unsafe2.getObject(obj3, offset);
                                if (!interfaceC1891d3.isModifiable()) {
                                    int size = interfaceC1891d3.size();
                                    if (size == 0) {
                                        i30 = 10;
                                    } else {
                                        i30 = size * 2;
                                    }
                                    interfaceC1891d3 = interfaceC1891d3.mutableCopyWithCapacity(i30);
                                    unsafe2.putObject(obj3, offset, interfaceC1891d3);
                                }
                                i33 = C1964o.decodeMessageList(r33.getMessageFieldSchema(i42), i44, bArr, i39, i10, interfaceC1891d3, c1957n);
                                i34 = i42;
                                i35 = i44;
                                i38 = i21;
                                i36 = i20;
                                i37 = i18;
                                bArr3 = bArr;
                                i32 = i11;
                            } else {
                                i28 = i39;
                                unsafe = unsafe2;
                                i22 = i42;
                                i29 = i44;
                                i12 = i11;
                                i19 = i28;
                            }
                        } else if (type <= 49) {
                            int i49 = i39;
                            unsafe = unsafe2;
                            i22 = i42;
                            i29 = i44;
                            i33 = parseRepeatedField(obj, bArr, i39, i10, i44, i18, i41, i42, i43, type, offset, c1957n);
                            if (i33 != i49) {
                                r33 = this;
                                obj3 = obj;
                                bArr3 = bArr;
                                i31 = i10;
                                i32 = i11;
                                c1957n2 = c1957n;
                                i38 = i21;
                                i36 = i20;
                                i34 = i22;
                                i35 = i29;
                                i37 = i18;
                                unsafe2 = unsafe;
                            } else {
                                i12 = i11;
                                i19 = i33;
                            }
                        } else {
                            i28 = i39;
                            unsafe = unsafe2;
                            i22 = i42;
                            i29 = i44;
                            if (type == 50) {
                                if (i41 == 2) {
                                    i33 = parseMapField(obj, bArr, i28, i10, i22, offset, c1957n);
                                    if (i33 != i28) {
                                        r33 = this;
                                        obj3 = obj;
                                        bArr3 = bArr;
                                        i31 = i10;
                                        i32 = i11;
                                        c1957n2 = c1957n;
                                        i38 = i21;
                                        i36 = i20;
                                        i34 = i22;
                                        i35 = i29;
                                        i37 = i18;
                                        unsafe2 = unsafe;
                                    } else {
                                        i12 = i11;
                                        i19 = i33;
                                    }
                                } else {
                                    i12 = i11;
                                    i19 = i28;
                                }
                            } else {
                                i33 = parseOneofField(obj, bArr, i28, i10, i29, i18, i41, i43, type, offset, i22, c1957n);
                                if (i33 != i28) {
                                    r33 = this;
                                    obj3 = obj;
                                    bArr3 = bArr;
                                    i31 = i10;
                                    i32 = i11;
                                    c1957n2 = c1957n;
                                    i38 = i21;
                                    i36 = i20;
                                    i34 = i22;
                                    i35 = i29;
                                    i37 = i18;
                                    unsafe2 = unsafe;
                                } else {
                                    i12 = i11;
                                    i19 = i33;
                                }
                            }
                        }
                        i14 = i29;
                    }
                }
                if (i14 == i12 && i12 != 0) {
                    i16 = 1048575;
                    r32 = this;
                    i13 = i19;
                    i15 = i21;
                    i36 = i20;
                } else {
                    if (this.hasExtensions && c1957n.extensionRegistry != W1.getEmptyRegistry()) {
                        i33 = C1964o.decodeExtensionOrUnknownField(i14, bArr, i19, i10, obj, this.defaultInstance, this.unknownFieldSchema, c1957n);
                    } else {
                        i33 = C1964o.decodeUnknownField(i14, bArr, i19, i10, getMutableUnknownFields(obj), c1957n);
                    }
                    obj3 = obj;
                    bArr3 = bArr;
                    i31 = i10;
                    i35 = i14;
                    r33 = this;
                    c1957n2 = c1957n;
                    i38 = i21;
                    i36 = i20;
                    i34 = i22;
                    i37 = i18;
                    unsafe2 = unsafe;
                    i32 = i12;
                }
            } else {
                int i50 = i38;
                unsafe = unsafe2;
                i12 = i32;
                r32 = r33;
                i13 = i33;
                i14 = i35;
                i15 = i50;
                i16 = 1048575;
            }
        }
        if (i15 != i16) {
            obj2 = obj;
            unsafe.putInt(obj2, i15, i36);
        } else {
            obj2 = obj;
        }
        C1997s5 c1997s5 = null;
        for (int i51 = r32.checkInitializedCount; i51 < r32.repeatedFieldOffsetStart; i51++) {
            c1997s5 = (C1997s5) filterMapUnknownEnumValues(obj, r32.intArray[i51], c1997s5, r32.unknownFieldSchema, obj);
        }
        if (c1997s5 != null) {
            r32.unknownFieldSchema.setBuilderToMessage(obj2, c1997s5);
        }
        if (i12 == 0) {
            if (i13 != i10) {
                throw C1912g3.parseFailure();
            }
        } else if (i13 > i10 || i14 != i12) {
            throw C1912g3.parseFailure();
        }
        return i13;
    }

    @Override // com.google.protobuf.InterfaceC2038y4
    public void writeTo(Object obj, a6 a6Var) throws IOException {
        C1909g0 c1909g0 = (C1909g0) a6Var;
        if (c1909g0.fieldOrder() == Z5.DESCENDING) {
            writeFieldsInDescendingOrder(obj, c1909g0);
        } else if (this.proto3) {
            writeFieldsInAscendingOrderProto3(obj, c1909g0);
        } else {
            writeFieldsInAscendingOrderProto2(obj, c1909g0);
        }
    }

    private boolean isFieldPresent(Object obj, int i9) {
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i9);
        long j7 = 1048575 & presenceMaskAndOffsetAt;
        if (j7 != 1048575) {
            return (C5.getInt(obj, j7) & (1 << (presenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int typeAndOffsetAt = typeAndOffsetAt(i9);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(C5.getDouble(obj, offset)) != 0;
            case 1:
                return Float.floatToRawIntBits(C5.getFloat(obj, offset)) != 0;
            case 2:
                return C5.getLong(obj, offset) != 0;
            case 3:
                return C5.getLong(obj, offset) != 0;
            case 4:
                return C5.getInt(obj, offset) != 0;
            case 5:
                return C5.getLong(obj, offset) != 0;
            case 6:
                return C5.getInt(obj, offset) != 0;
            case 7:
                return C5.getBoolean(obj, offset);
            case 8:
                Object object = C5.getObject(obj, offset);
                if (object instanceof String) {
                    return !((String) object).isEmpty();
                }
                if (object instanceof H) {
                    return !H.EMPTY.equals(object);
                }
                throw new IllegalArgumentException();
            case 9:
                return C5.getObject(obj, offset) != null;
            case 10:
                return !H.EMPTY.equals(C5.getObject(obj, offset));
            case 11:
                return C5.getInt(obj, offset) != 0;
            case 12:
                return C5.getInt(obj, offset) != 0;
            case 13:
                return C5.getInt(obj, offset) != 0;
            case 14:
                return C5.getLong(obj, offset) != 0;
            case 15:
                return C5.getInt(obj, offset) != 0;
            case 16:
                return C5.getLong(obj, offset) != 0;
            case 17:
                return C5.getObject(obj, offset) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private int positionForFieldNumber(int i9, int i10) {
        if (i9 < this.minFieldNumber || i9 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i9, i10);
    }

    @Override // com.google.protobuf.InterfaceC2038y4
    public void mergeFrom(Object obj, InterfaceC1996s4 interfaceC1996s4, W1 w1) throws IOException {
        w1.getClass();
        checkMutable(obj);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, obj, interfaceC1996s4, w1);
    }

    private boolean equals(Object obj, Object obj2, int i9) {
        int typeAndOffsetAt = typeAndOffsetAt(i9);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                return arePresentForEquals(obj, obj2, i9) && Double.doubleToLongBits(C5.getDouble(obj, offset)) == Double.doubleToLongBits(C5.getDouble(obj2, offset));
            case 1:
                return arePresentForEquals(obj, obj2, i9) && Float.floatToIntBits(C5.getFloat(obj, offset)) == Float.floatToIntBits(C5.getFloat(obj2, offset));
            case 2:
                return arePresentForEquals(obj, obj2, i9) && C5.getLong(obj, offset) == C5.getLong(obj2, offset);
            case 3:
                return arePresentForEquals(obj, obj2, i9) && C5.getLong(obj, offset) == C5.getLong(obj2, offset);
            case 4:
                return arePresentForEquals(obj, obj2, i9) && C5.getInt(obj, offset) == C5.getInt(obj2, offset);
            case 5:
                return arePresentForEquals(obj, obj2, i9) && C5.getLong(obj, offset) == C5.getLong(obj2, offset);
            case 6:
                return arePresentForEquals(obj, obj2, i9) && C5.getInt(obj, offset) == C5.getInt(obj2, offset);
            case 7:
                return arePresentForEquals(obj, obj2, i9) && C5.getBoolean(obj, offset) == C5.getBoolean(obj2, offset);
            case 8:
                return arePresentForEquals(obj, obj2, i9) && A4.safeEquals(C5.getObject(obj, offset), C5.getObject(obj2, offset));
            case 9:
                return arePresentForEquals(obj, obj2, i9) && A4.safeEquals(C5.getObject(obj, offset), C5.getObject(obj2, offset));
            case 10:
                return arePresentForEquals(obj, obj2, i9) && A4.safeEquals(C5.getObject(obj, offset), C5.getObject(obj2, offset));
            case 11:
                return arePresentForEquals(obj, obj2, i9) && C5.getInt(obj, offset) == C5.getInt(obj2, offset);
            case 12:
                return arePresentForEquals(obj, obj2, i9) && C5.getInt(obj, offset) == C5.getInt(obj2, offset);
            case 13:
                return arePresentForEquals(obj, obj2, i9) && C5.getInt(obj, offset) == C5.getInt(obj2, offset);
            case 14:
                return arePresentForEquals(obj, obj2, i9) && C5.getLong(obj, offset) == C5.getLong(obj2, offset);
            case 15:
                return arePresentForEquals(obj, obj2, i9) && C5.getInt(obj, offset) == C5.getInt(obj2, offset);
            case 16:
                return arePresentForEquals(obj, obj2, i9) && C5.getLong(obj, offset) == C5.getLong(obj2, offset);
            case 17:
                return arePresentForEquals(obj, obj2, i9) && A4.safeEquals(C5.getObject(obj, offset), C5.getObject(obj2, offset));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case AD_PLAY_RESET_ON_DEINIT_VALUE:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
            case 39:
            case 40:
            case 41:
            case 42:
            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
            case 44:
            case 45:
            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
            case 48:
            case 49:
                return A4.safeEquals(C5.getObject(obj, offset), C5.getObject(obj2, offset));
            case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                return A4.safeEquals(C5.getObject(obj, offset), C5.getObject(obj2, offset));
            case ONEOF_TYPE_OFFSET /* 51 */:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return isOneofCaseEqual(obj, obj2, i9) && A4.safeEquals(C5.getObject(obj, offset), C5.getObject(obj2, offset));
            default:
                return true;
        }
    }

    @Override // com.google.protobuf.InterfaceC2038y4
    public void mergeFrom(Object obj, byte[] bArr, int i9, int i10, C1957n c1957n) throws IOException {
        if (this.proto3) {
            parseProto3Message(obj, bArr, i9, i10, c1957n);
        } else {
            parseProto2Message(obj, bArr, i9, i10, 0, c1957n);
        }
    }

    private static boolean isInitialized(Object obj, int i9, InterfaceC2038y4 interfaceC2038y4) {
        return interfaceC2038y4.isInitialized(C5.getObject(obj, offset(i9)));
    }
}
