package com.google.protobuf;

import androidx.core.view.MotionEventCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public final class s5 implements z6 {
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
    private final o5 defaultInstance;
    private final b2 extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final w4 listFieldSchema;
    private final boolean lite;
    private final i5 mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final a6 newInstanceSchema;
    private final Object[] objects;
    private final boolean proto3;
    private final int repeatedFieldOffsetStart;
    private final s8 unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = d9.getUnsafe();

    private s5(int[] iArr, Object[] objArr, int i10, int i11, o5 o5Var, boolean z10, boolean z11, int[] iArr2, int i12, int i13, a6 a6Var, w4 w4Var, s8 s8Var, b2 b2Var, i5 i5Var) {
        boolean z12;
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i10;
        this.maxFieldNumber = i11;
        this.lite = o5Var instanceof o3;
        this.proto3 = z10;
        if (b2Var != null && b2Var.hasExtensions(o5Var)) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.hasExtensions = z12;
        this.useCachedSizeField = z11;
        this.intArray = iArr2;
        this.checkInitializedCount = i12;
        this.repeatedFieldOffsetStart = i13;
        this.newInstanceSchema = a6Var;
        this.listFieldSchema = w4Var;
        this.unknownFieldSchema = s8Var;
        this.extensionSchema = b2Var;
        this.defaultInstance = o5Var;
        this.mapFieldSchema = i5Var;
    }

    private boolean arePresentForEquals(Object obj, Object obj2, int i10) {
        return isFieldPresent(obj, i10) == isFieldPresent(obj2, i10);
    }

    private static <T> boolean booleanAt(T t5, long j3) {
        return d9.getBoolean(t5, j3);
    }

    private static void checkMutable(Object obj) {
        if (isMutable(obj)) {
        } else {
            throw new IllegalArgumentException(eb.j.j("Mutating immutable message: ", obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.Map, java.util.Map<K, V>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    private <K, V> int decodeMapEntry(byte[] bArr, int i10, int i11, f5 f5Var, Map<K, V> map, n nVar) throws IOException {
        int i12;
        int decodeVarint32 = o.decodeVarint32(bArr, i10, nVar);
        int i13 = nVar.int1;
        if (i13 >= 0 && i13 <= i11 - decodeVarint32) {
            int i14 = decodeVarint32 + i13;
            Object obj = f5Var.defaultKey;
            Object obj2 = f5Var.defaultValue;
            while (decodeVarint32 < i14) {
                int i15 = decodeVarint32 + 1;
                byte b3 = bArr[decodeVarint32];
                if (b3 < 0) {
                    i12 = o.decodeVarint32(b3, bArr, i15, nVar);
                    b3 = nVar.int1;
                } else {
                    i12 = i15;
                }
                int i16 = b3 >>> 3;
                int i17 = b3 & 7;
                if (i16 != 1) {
                    if (i16 == 2 && i17 == f5Var.valueType.getWireType()) {
                        decodeVarint32 = decodeMapEntryValue(bArr, i12, i11, f5Var.valueType, f5Var.defaultValue.getClass(), nVar);
                        obj2 = nVar.object1;
                    }
                    decodeVarint32 = o.skipField(b3, bArr, i12, i11, nVar);
                } else if (i17 == f5Var.keyType.getWireType()) {
                    decodeVarint32 = decodeMapEntryValue(bArr, i12, i11, f5Var.keyType, null, nVar);
                    obj = nVar.object1;
                } else {
                    decodeVarint32 = o.skipField(b3, bArr, i12, i11, nVar);
                }
            }
            if (decodeVarint32 == i14) {
                map.put(obj, obj2);
                return i14;
            }
            throw h4.parseFailure();
        }
        throw h4.truncatedMessage();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    private int decodeMapEntryValue(byte[] bArr, int i10, int i11, t9 t9Var, Class<?> cls, n nVar) throws IOException {
        boolean z10;
        switch (r5.$SwitchMap$com$google$protobuf$WireFormat$FieldType[t9Var.ordinal()]) {
            case 1:
                int decodeVarint64 = o.decodeVarint64(bArr, i10, nVar);
                if (nVar.long1 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                nVar.object1 = Boolean.valueOf(z10);
                return decodeVarint64;
            case 2:
                return o.decodeBytes(bArr, i10, nVar);
            case 3:
                nVar.object1 = Double.valueOf(o.decodeDouble(bArr, i10));
                return i10 + 8;
            case 4:
            case 5:
                nVar.object1 = Integer.valueOf(o.decodeFixed32(bArr, i10));
                return i10 + 4;
            case 6:
            case 7:
                nVar.object1 = Long.valueOf(o.decodeFixed64(bArr, i10));
                return i10 + 8;
            case 8:
                nVar.object1 = Float.valueOf(o.decodeFloat(bArr, i10));
                return i10 + 4;
            case 9:
            case 10:
            case 11:
                int decodeVarint32 = o.decodeVarint32(bArr, i10, nVar);
                nVar.object1 = Integer.valueOf(nVar.int1);
                return decodeVarint32;
            case 12:
            case 13:
                int decodeVarint642 = o.decodeVarint64(bArr, i10, nVar);
                nVar.object1 = Long.valueOf(nVar.long1);
                return decodeVarint642;
            case 14:
                return o.decodeMessageField(p6.getInstance().schemaFor((Class) cls), bArr, i10, i11, nVar);
            case 15:
                int decodeVarint322 = o.decodeVarint32(bArr, i10, nVar);
                nVar.object1 = Integer.valueOf(r0.decodeZigZag32(nVar.int1));
                return decodeVarint322;
            case 16:
                int decodeVarint643 = o.decodeVarint64(bArr, i10, nVar);
                nVar.object1 = Long.valueOf(r0.decodeZigZag64(nVar.long1));
                return decodeVarint643;
            case 17:
                return o.decodeStringRequireUtf8(bArr, i10, nVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T t5, long j3) {
        return d9.getDouble(t5, j3);
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i10, UB ub2, s8 s8Var, Object obj2) {
        int numberAt = numberAt(i10);
        Object object = d9.getObject(obj, offset(typeAndOffsetAt(i10)));
        if (object == null) {
            return ub2;
        }
        a4 enumFieldVerifier = getEnumFieldVerifier(i10);
        if (enumFieldVerifier == null) {
            return ub2;
        }
        return (UB) filterUnknownEnumMap(i10, numberAt, ((j5) this.mapFieldSchema).forMutableMapData(object), enumFieldVerifier, ub2, s8Var, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i10, int i11, Map<K, V> map, a4 a4Var, UB ub2, s8 s8Var, Object obj) {
        f5 forMapMetadata = ((j5) this.mapFieldSchema).forMapMetadata(getMapFieldDefaultEntry(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!a4Var.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = (UB) s8Var.getBuilderFromMessage(obj);
                }
                c0 newCodedBuilder = h0.newCodedBuilder(g5.computeSerializedSize(forMapMetadata, next.getKey(), next.getValue()));
                try {
                    g5.writeTo(newCodedBuilder.getCodedOutput(), forMapMetadata, next.getKey(), next.getValue());
                    s8Var.addLengthDelimited(ub2, i11, newCodedBuilder.build());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub2;
    }

    private static <T> float floatAt(T t5, long j3) {
        return d9.getFloat(t5, j3);
    }

    private a4 getEnumFieldVerifier(int i10) {
        return (a4) this.objects[((i10 / 3) * 2) + 1];
    }

    private Object getMapFieldDefaultEntry(int i10) {
        return this.objects[(i10 / 3) * 2];
    }

    private z6 getMessageFieldSchema(int i10) {
        int i11 = (i10 / 3) * 2;
        z6 z6Var = (z6) this.objects[i11];
        if (z6Var != null) {
            return z6Var;
        }
        z6 schemaFor = p6.getInstance().schemaFor((Class) this.objects[i11 + 1]);
        this.objects[i11] = schemaFor;
        return schemaFor;
    }

    public static t8 getMutableUnknownFields(Object obj) {
        o3 o3Var = (o3) obj;
        t8 t8Var = o3Var.unknownFields;
        if (t8Var == t8.getDefaultInstance()) {
            t8 newInstance = t8.newInstance();
            o3Var.unknownFields = newInstance;
            return newInstance;
        }
        return t8Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x005f. Please report as an issue. */
    private int getSerializedSizeProto2(Object obj) {
        int i10;
        int i11;
        int i12;
        int computeDoubleSize;
        int computeStringSize;
        int computeSizeFixed64ListNoTag;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        Unsafe unsafe = UNSAFE;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1048575;
        while (i16 < this.buffer.length) {
            int typeAndOffsetAt = typeAndOffsetAt(i16);
            int numberAt = numberAt(i16);
            int type = type(typeAndOffsetAt);
            if (type <= 17) {
                i11 = this.buffer[i16 + 2];
                int i18 = i13 & i11;
                i12 = 1 << (i11 >>> 20);
                if (i18 != i17) {
                    i14 = unsafe.getInt(obj, i18);
                    i17 = i18;
                }
            } else {
                if (this.useCachedSizeField && type >= a3.DOUBLE_LIST_PACKED.id() && type <= a3.SINT64_LIST_PACKED.id()) {
                    i10 = i13 & this.buffer[i16 + 2];
                } else {
                    i10 = 0;
                }
                i11 = i10;
                i12 = 0;
            }
            long offset = offset(typeAndOffsetAt);
            int i19 = i17;
            switch (type) {
                case 0:
                    if ((i14 & i12) == 0) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeDoubleSize(numberAt, 0.0d);
                        i15 += computeDoubleSize;
                        break;
                    }
                case 1:
                    if ((i14 & i12) == 0) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeFloatSize(numberAt, 0.0f);
                        i15 += computeDoubleSize;
                        break;
                    }
                case 2:
                    if ((i14 & i12) == 0) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeInt64Size(numberAt, unsafe.getLong(obj, offset));
                        i15 += computeDoubleSize;
                        break;
                    }
                case 3:
                    if ((i14 & i12) == 0) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeUInt64Size(numberAt, unsafe.getLong(obj, offset));
                        i15 += computeDoubleSize;
                        break;
                    }
                case 4:
                    if ((i14 & i12) == 0) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeInt32Size(numberAt, unsafe.getInt(obj, offset));
                        i15 += computeDoubleSize;
                        break;
                    }
                case 5:
                    if ((i14 & i12) == 0) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeFixed64Size(numberAt, 0L);
                        i15 += computeDoubleSize;
                        break;
                    }
                case 6:
                    if ((i14 & i12) == 0) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeFixed32Size(numberAt, 0);
                        i15 += computeDoubleSize;
                        break;
                    }
                case 7:
                    if ((i14 & i12) == 0) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeBoolSize(numberAt, true);
                        i15 += computeDoubleSize;
                        break;
                    }
                case 8:
                    if ((i14 & i12) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, offset);
                        if (object instanceof h0) {
                            computeStringSize = d1.computeBytesSize(numberAt, (h0) object);
                        } else {
                            computeStringSize = d1.computeStringSize(numberAt, (String) object);
                        }
                        i15 += computeStringSize;
                        break;
                    }
                case 9:
                    if ((i14 & i12) == 0) {
                        break;
                    } else {
                        computeDoubleSize = b7.computeSizeMessage(numberAt, unsafe.getObject(obj, offset), getMessageFieldSchema(i16));
                        i15 += computeDoubleSize;
                        break;
                    }
                case 10:
                    if ((i14 & i12) == 0) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeBytesSize(numberAt, (h0) unsafe.getObject(obj, offset));
                        i15 += computeDoubleSize;
                        break;
                    }
                case 11:
                    if ((i14 & i12) == 0) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeUInt32Size(numberAt, unsafe.getInt(obj, offset));
                        i15 += computeDoubleSize;
                        break;
                    }
                case 12:
                    if ((i14 & i12) == 0) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeEnumSize(numberAt, unsafe.getInt(obj, offset));
                        i15 += computeDoubleSize;
                        break;
                    }
                case 13:
                    if ((i14 & i12) == 0) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeSFixed32Size(numberAt, 0);
                        i15 += computeDoubleSize;
                        break;
                    }
                case 14:
                    if ((i14 & i12) == 0) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeSFixed64Size(numberAt, 0L);
                        i15 += computeDoubleSize;
                        break;
                    }
                case 15:
                    if ((i14 & i12) == 0) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeSInt32Size(numberAt, unsafe.getInt(obj, offset));
                        i15 += computeDoubleSize;
                        break;
                    }
                case 16:
                    if ((i14 & i12) == 0) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeSInt64Size(numberAt, unsafe.getLong(obj, offset));
                        i15 += computeDoubleSize;
                        break;
                    }
                case 17:
                    if ((i14 & i12) == 0) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeGroupSize(numberAt, (o5) unsafe.getObject(obj, offset), getMessageFieldSchema(i16));
                        i15 += computeDoubleSize;
                        break;
                    }
                case 18:
                    computeDoubleSize = b7.computeSizeFixed64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i15 += computeDoubleSize;
                    break;
                case 19:
                    computeDoubleSize = b7.computeSizeFixed32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i15 += computeDoubleSize;
                    break;
                case 20:
                    computeDoubleSize = b7.computeSizeInt64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i15 += computeDoubleSize;
                    break;
                case 21:
                    computeDoubleSize = b7.computeSizeUInt64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i15 += computeDoubleSize;
                    break;
                case 22:
                    computeDoubleSize = b7.computeSizeInt32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i15 += computeDoubleSize;
                    break;
                case 23:
                    computeDoubleSize = b7.computeSizeFixed64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i15 += computeDoubleSize;
                    break;
                case 24:
                    computeDoubleSize = b7.computeSizeFixed32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i15 += computeDoubleSize;
                    break;
                case 25:
                    computeDoubleSize = b7.computeSizeBoolList(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i15 += computeDoubleSize;
                    break;
                case 26:
                    computeDoubleSize = b7.computeSizeStringList(numberAt, (List) unsafe.getObject(obj, offset));
                    i15 += computeDoubleSize;
                    break;
                case 27:
                    computeDoubleSize = b7.computeSizeMessageList(numberAt, (List) unsafe.getObject(obj, offset), getMessageFieldSchema(i16));
                    i15 += computeDoubleSize;
                    break;
                case 28:
                    computeDoubleSize = b7.computeSizeByteStringList(numberAt, (List) unsafe.getObject(obj, offset));
                    i15 += computeDoubleSize;
                    break;
                case NOTIFICATION_REDIRECT_VALUE:
                    computeDoubleSize = b7.computeSizeUInt32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i15 += computeDoubleSize;
                    break;
                case 30:
                    computeDoubleSize = b7.computeSizeEnumList(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i15 += computeDoubleSize;
                    break;
                case TEMPLATE_HTML_SIZE_VALUE:
                    computeDoubleSize = b7.computeSizeFixed32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i15 += computeDoubleSize;
                    break;
                case 32:
                    computeDoubleSize = b7.computeSizeFixed64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i15 += computeDoubleSize;
                    break;
                case 33:
                    computeDoubleSize = b7.computeSizeSInt32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i15 += computeDoubleSize;
                    break;
                case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                    computeDoubleSize = b7.computeSizeSInt64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i15 += computeDoubleSize;
                    break;
                case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                    computeSizeFixed64ListNoTag = b7.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = d1.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i15 = a4.j.a(computeUInt32SizeNoTag, computeTagSize, computeSizeFixed64ListNoTag, i15);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    computeSizeFixed64ListNoTag = b7.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = d1.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i15 = a4.j.a(computeUInt32SizeNoTag, computeTagSize, computeSizeFixed64ListNoTag, i15);
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                    computeSizeFixed64ListNoTag = b7.computeSizeInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = d1.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i15 = a4.j.a(computeUInt32SizeNoTag, computeTagSize, computeSizeFixed64ListNoTag, i15);
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    computeSizeFixed64ListNoTag = b7.computeSizeUInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = d1.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i15 = a4.j.a(computeUInt32SizeNoTag, computeTagSize, computeSizeFixed64ListNoTag, i15);
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                    computeSizeFixed64ListNoTag = b7.computeSizeInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = d1.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i15 = a4.j.a(computeUInt32SizeNoTag, computeTagSize, computeSizeFixed64ListNoTag, i15);
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                    computeSizeFixed64ListNoTag = b7.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = d1.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i15 = a4.j.a(computeUInt32SizeNoTag, computeTagSize, computeSizeFixed64ListNoTag, i15);
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                    computeSizeFixed64ListNoTag = b7.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = d1.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i15 = a4.j.a(computeUInt32SizeNoTag, computeTagSize, computeSizeFixed64ListNoTag, i15);
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                    computeSizeFixed64ListNoTag = b7.computeSizeBoolListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = d1.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i15 = a4.j.a(computeUInt32SizeNoTag, computeTagSize, computeSizeFixed64ListNoTag, i15);
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                    computeSizeFixed64ListNoTag = b7.computeSizeUInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = d1.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i15 = a4.j.a(computeUInt32SizeNoTag, computeTagSize, computeSizeFixed64ListNoTag, i15);
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                    computeSizeFixed64ListNoTag = b7.computeSizeEnumListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = d1.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i15 = a4.j.a(computeUInt32SizeNoTag, computeTagSize, computeSizeFixed64ListNoTag, i15);
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                    computeSizeFixed64ListNoTag = b7.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = d1.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i15 = a4.j.a(computeUInt32SizeNoTag, computeTagSize, computeSizeFixed64ListNoTag, i15);
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                    computeSizeFixed64ListNoTag = b7.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = d1.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i15 = a4.j.a(computeUInt32SizeNoTag, computeTagSize, computeSizeFixed64ListNoTag, i15);
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                    computeSizeFixed64ListNoTag = b7.computeSizeSInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = d1.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i15 = a4.j.a(computeUInt32SizeNoTag, computeTagSize, computeSizeFixed64ListNoTag, i15);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    computeSizeFixed64ListNoTag = b7.computeSizeSInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i11, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = d1.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i15 = a4.j.a(computeUInt32SizeNoTag, computeTagSize, computeSizeFixed64ListNoTag, i15);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    computeDoubleSize = b7.computeSizeGroupList(numberAt, (List) unsafe.getObject(obj, offset), getMessageFieldSchema(i16));
                    i15 += computeDoubleSize;
                    break;
                case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                    computeDoubleSize = ((j5) this.mapFieldSchema).getSerializedSize(numberAt, unsafe.getObject(obj, offset), getMapFieldDefaultEntry(i16));
                    i15 += computeDoubleSize;
                    break;
                case ONEOF_TYPE_OFFSET /* 51 */:
                    if (!isOneofPresent(obj, numberAt, i16)) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeDoubleSize(numberAt, 0.0d);
                        i15 += computeDoubleSize;
                        break;
                    }
                case 52:
                    if (!isOneofPresent(obj, numberAt, i16)) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeFloatSize(numberAt, 0.0f);
                        i15 += computeDoubleSize;
                        break;
                    }
                case 53:
                    if (!isOneofPresent(obj, numberAt, i16)) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeInt64Size(numberAt, oneofLongAt(obj, offset));
                        i15 += computeDoubleSize;
                        break;
                    }
                case 54:
                    if (!isOneofPresent(obj, numberAt, i16)) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeUInt64Size(numberAt, oneofLongAt(obj, offset));
                        i15 += computeDoubleSize;
                        break;
                    }
                case 55:
                    if (!isOneofPresent(obj, numberAt, i16)) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeInt32Size(numberAt, oneofIntAt(obj, offset));
                        i15 += computeDoubleSize;
                        break;
                    }
                case 56:
                    if (!isOneofPresent(obj, numberAt, i16)) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeFixed64Size(numberAt, 0L);
                        i15 += computeDoubleSize;
                        break;
                    }
                case 57:
                    if (!isOneofPresent(obj, numberAt, i16)) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeFixed32Size(numberAt, 0);
                        i15 += computeDoubleSize;
                        break;
                    }
                case 58:
                    if (!isOneofPresent(obj, numberAt, i16)) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeBoolSize(numberAt, true);
                        i15 += computeDoubleSize;
                        break;
                    }
                case 59:
                    if (!isOneofPresent(obj, numberAt, i16)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(obj, offset);
                        if (object2 instanceof h0) {
                            computeStringSize = d1.computeBytesSize(numberAt, (h0) object2);
                        } else {
                            computeStringSize = d1.computeStringSize(numberAt, (String) object2);
                        }
                        i15 += computeStringSize;
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (!isOneofPresent(obj, numberAt, i16)) {
                        break;
                    } else {
                        computeDoubleSize = b7.computeSizeMessage(numberAt, unsafe.getObject(obj, offset), getMessageFieldSchema(i16));
                        i15 += computeDoubleSize;
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (!isOneofPresent(obj, numberAt, i16)) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeBytesSize(numberAt, (h0) unsafe.getObject(obj, offset));
                        i15 += computeDoubleSize;
                        break;
                    }
                case 62:
                    if (!isOneofPresent(obj, numberAt, i16)) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeUInt32Size(numberAt, oneofIntAt(obj, offset));
                        i15 += computeDoubleSize;
                        break;
                    }
                case 63:
                    if (!isOneofPresent(obj, numberAt, i16)) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeEnumSize(numberAt, oneofIntAt(obj, offset));
                        i15 += computeDoubleSize;
                        break;
                    }
                case 64:
                    if (!isOneofPresent(obj, numberAt, i16)) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeSFixed32Size(numberAt, 0);
                        i15 += computeDoubleSize;
                        break;
                    }
                case 65:
                    if (!isOneofPresent(obj, numberAt, i16)) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeSFixed64Size(numberAt, 0L);
                        i15 += computeDoubleSize;
                        break;
                    }
                case 66:
                    if (!isOneofPresent(obj, numberAt, i16)) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeSInt32Size(numberAt, oneofIntAt(obj, offset));
                        i15 += computeDoubleSize;
                        break;
                    }
                case 67:
                    if (!isOneofPresent(obj, numberAt, i16)) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeSInt64Size(numberAt, oneofLongAt(obj, offset));
                        i15 += computeDoubleSize;
                        break;
                    }
                case 68:
                    if (!isOneofPresent(obj, numberAt, i16)) {
                        break;
                    } else {
                        computeDoubleSize = d1.computeGroupSize(numberAt, (o5) unsafe.getObject(obj, offset), getMessageFieldSchema(i16));
                        i15 += computeDoubleSize;
                        break;
                    }
            }
            i16 += 3;
            i13 = 1048575;
            i17 = i19;
        }
        int unknownFieldsSerializedSize = i15 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, obj);
        if (this.hasExtensions) {
            return unknownFieldsSerializedSize + this.extensionSchema.getExtensions(obj).getSerializedSize();
        }
        return unknownFieldsSerializedSize;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x003a. Please report as an issue. */
    private int getSerializedSizeProto3(Object obj) {
        int i10;
        int computeDoubleSize;
        int computeStringSize;
        int computeSizeFixed64ListNoTag;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        Unsafe unsafe = UNSAFE;
        int i11 = 0;
        for (int i12 = 0; i12 < this.buffer.length; i12 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i12);
            int type = type(typeAndOffsetAt);
            int numberAt = numberAt(i12);
            long offset = offset(typeAndOffsetAt);
            if (type >= a3.DOUBLE_LIST_PACKED.id() && type <= a3.SINT64_LIST_PACKED.id()) {
                i10 = this.buffer[i12 + 2] & 1048575;
            } else {
                i10 = 0;
            }
            switch (type) {
                case 0:
                    if (isFieldPresent(obj, i12)) {
                        computeDoubleSize = d1.computeDoubleSize(numberAt, 0.0d);
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (isFieldPresent(obj, i12)) {
                        computeDoubleSize = d1.computeFloatSize(numberAt, 0.0f);
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (isFieldPresent(obj, i12)) {
                        computeDoubleSize = d1.computeInt64Size(numberAt, d9.getLong(obj, offset));
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (isFieldPresent(obj, i12)) {
                        computeDoubleSize = d1.computeUInt64Size(numberAt, d9.getLong(obj, offset));
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (isFieldPresent(obj, i12)) {
                        computeDoubleSize = d1.computeInt32Size(numberAt, d9.getInt(obj, offset));
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (isFieldPresent(obj, i12)) {
                        computeDoubleSize = d1.computeFixed64Size(numberAt, 0L);
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (isFieldPresent(obj, i12)) {
                        computeDoubleSize = d1.computeFixed32Size(numberAt, 0);
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (isFieldPresent(obj, i12)) {
                        computeDoubleSize = d1.computeBoolSize(numberAt, true);
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (isFieldPresent(obj, i12)) {
                        Object object = d9.getObject(obj, offset);
                        if (object instanceof h0) {
                            computeStringSize = d1.computeBytesSize(numberAt, (h0) object);
                        } else {
                            computeStringSize = d1.computeStringSize(numberAt, (String) object);
                        }
                        i11 += computeStringSize;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (isFieldPresent(obj, i12)) {
                        computeDoubleSize = b7.computeSizeMessage(numberAt, d9.getObject(obj, offset), getMessageFieldSchema(i12));
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (isFieldPresent(obj, i12)) {
                        computeDoubleSize = d1.computeBytesSize(numberAt, (h0) d9.getObject(obj, offset));
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (isFieldPresent(obj, i12)) {
                        computeDoubleSize = d1.computeUInt32Size(numberAt, d9.getInt(obj, offset));
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (isFieldPresent(obj, i12)) {
                        computeDoubleSize = d1.computeEnumSize(numberAt, d9.getInt(obj, offset));
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (isFieldPresent(obj, i12)) {
                        computeDoubleSize = d1.computeSFixed32Size(numberAt, 0);
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (isFieldPresent(obj, i12)) {
                        computeDoubleSize = d1.computeSFixed64Size(numberAt, 0L);
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (isFieldPresent(obj, i12)) {
                        computeDoubleSize = d1.computeSInt32Size(numberAt, d9.getInt(obj, offset));
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (isFieldPresent(obj, i12)) {
                        computeDoubleSize = d1.computeSInt64Size(numberAt, d9.getLong(obj, offset));
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (isFieldPresent(obj, i12)) {
                        computeDoubleSize = d1.computeGroupSize(numberAt, (o5) d9.getObject(obj, offset), getMessageFieldSchema(i12));
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    computeDoubleSize = b7.computeSizeFixed64List(numberAt, listAt(obj, offset), false);
                    i11 += computeDoubleSize;
                    break;
                case 19:
                    computeDoubleSize = b7.computeSizeFixed32List(numberAt, listAt(obj, offset), false);
                    i11 += computeDoubleSize;
                    break;
                case 20:
                    computeDoubleSize = b7.computeSizeInt64List(numberAt, listAt(obj, offset), false);
                    i11 += computeDoubleSize;
                    break;
                case 21:
                    computeDoubleSize = b7.computeSizeUInt64List(numberAt, listAt(obj, offset), false);
                    i11 += computeDoubleSize;
                    break;
                case 22:
                    computeDoubleSize = b7.computeSizeInt32List(numberAt, listAt(obj, offset), false);
                    i11 += computeDoubleSize;
                    break;
                case 23:
                    computeDoubleSize = b7.computeSizeFixed64List(numberAt, listAt(obj, offset), false);
                    i11 += computeDoubleSize;
                    break;
                case 24:
                    computeDoubleSize = b7.computeSizeFixed32List(numberAt, listAt(obj, offset), false);
                    i11 += computeDoubleSize;
                    break;
                case 25:
                    computeDoubleSize = b7.computeSizeBoolList(numberAt, listAt(obj, offset), false);
                    i11 += computeDoubleSize;
                    break;
                case 26:
                    computeDoubleSize = b7.computeSizeStringList(numberAt, listAt(obj, offset));
                    i11 += computeDoubleSize;
                    break;
                case 27:
                    computeDoubleSize = b7.computeSizeMessageList(numberAt, listAt(obj, offset), getMessageFieldSchema(i12));
                    i11 += computeDoubleSize;
                    break;
                case 28:
                    computeDoubleSize = b7.computeSizeByteStringList(numberAt, listAt(obj, offset));
                    i11 += computeDoubleSize;
                    break;
                case NOTIFICATION_REDIRECT_VALUE:
                    computeDoubleSize = b7.computeSizeUInt32List(numberAt, listAt(obj, offset), false);
                    i11 += computeDoubleSize;
                    break;
                case 30:
                    computeDoubleSize = b7.computeSizeEnumList(numberAt, listAt(obj, offset), false);
                    i11 += computeDoubleSize;
                    break;
                case TEMPLATE_HTML_SIZE_VALUE:
                    computeDoubleSize = b7.computeSizeFixed32List(numberAt, listAt(obj, offset), false);
                    i11 += computeDoubleSize;
                    break;
                case 32:
                    computeDoubleSize = b7.computeSizeFixed64List(numberAt, listAt(obj, offset), false);
                    i11 += computeDoubleSize;
                    break;
                case 33:
                    computeDoubleSize = b7.computeSizeSInt32List(numberAt, listAt(obj, offset), false);
                    i11 += computeDoubleSize;
                    break;
                case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                    computeDoubleSize = b7.computeSizeSInt64List(numberAt, listAt(obj, offset), false);
                    i11 += computeDoubleSize;
                    break;
                case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                    computeSizeFixed64ListNoTag = b7.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = d1.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i11 = a4.j.a(computeUInt32SizeNoTag, computeTagSize, computeSizeFixed64ListNoTag, i11);
                        break;
                    }
                case 36:
                    computeSizeFixed64ListNoTag = b7.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = d1.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i11 = a4.j.a(computeUInt32SizeNoTag, computeTagSize, computeSizeFixed64ListNoTag, i11);
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                    computeSizeFixed64ListNoTag = b7.computeSizeInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = d1.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i11 = a4.j.a(computeUInt32SizeNoTag, computeTagSize, computeSizeFixed64ListNoTag, i11);
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    computeSizeFixed64ListNoTag = b7.computeSizeUInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = d1.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i11 = a4.j.a(computeUInt32SizeNoTag, computeTagSize, computeSizeFixed64ListNoTag, i11);
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                    computeSizeFixed64ListNoTag = b7.computeSizeInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = d1.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i11 = a4.j.a(computeUInt32SizeNoTag, computeTagSize, computeSizeFixed64ListNoTag, i11);
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                    computeSizeFixed64ListNoTag = b7.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = d1.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i11 = a4.j.a(computeUInt32SizeNoTag, computeTagSize, computeSizeFixed64ListNoTag, i11);
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                    computeSizeFixed64ListNoTag = b7.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = d1.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i11 = a4.j.a(computeUInt32SizeNoTag, computeTagSize, computeSizeFixed64ListNoTag, i11);
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                    computeSizeFixed64ListNoTag = b7.computeSizeBoolListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = d1.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i11 = a4.j.a(computeUInt32SizeNoTag, computeTagSize, computeSizeFixed64ListNoTag, i11);
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                    computeSizeFixed64ListNoTag = b7.computeSizeUInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = d1.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i11 = a4.j.a(computeUInt32SizeNoTag, computeTagSize, computeSizeFixed64ListNoTag, i11);
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                    computeSizeFixed64ListNoTag = b7.computeSizeEnumListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = d1.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i11 = a4.j.a(computeUInt32SizeNoTag, computeTagSize, computeSizeFixed64ListNoTag, i11);
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                    computeSizeFixed64ListNoTag = b7.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = d1.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i11 = a4.j.a(computeUInt32SizeNoTag, computeTagSize, computeSizeFixed64ListNoTag, i11);
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                    computeSizeFixed64ListNoTag = b7.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = d1.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i11 = a4.j.a(computeUInt32SizeNoTag, computeTagSize, computeSizeFixed64ListNoTag, i11);
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                    computeSizeFixed64ListNoTag = b7.computeSizeSInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = d1.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i11 = a4.j.a(computeUInt32SizeNoTag, computeTagSize, computeSizeFixed64ListNoTag, i11);
                        break;
                    }
                case 48:
                    computeSizeFixed64ListNoTag = b7.computeSizeSInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = d1.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = d1.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i11 = a4.j.a(computeUInt32SizeNoTag, computeTagSize, computeSizeFixed64ListNoTag, i11);
                        break;
                    }
                case 49:
                    computeDoubleSize = b7.computeSizeGroupList(numberAt, listAt(obj, offset), getMessageFieldSchema(i12));
                    i11 += computeDoubleSize;
                    break;
                case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                    computeDoubleSize = ((j5) this.mapFieldSchema).getSerializedSize(numberAt, d9.getObject(obj, offset), getMapFieldDefaultEntry(i12));
                    i11 += computeDoubleSize;
                    break;
                case ONEOF_TYPE_OFFSET /* 51 */:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        computeDoubleSize = d1.computeDoubleSize(numberAt, 0.0d);
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        computeDoubleSize = d1.computeFloatSize(numberAt, 0.0f);
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        computeDoubleSize = d1.computeInt64Size(numberAt, oneofLongAt(obj, offset));
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        computeDoubleSize = d1.computeUInt64Size(numberAt, oneofLongAt(obj, offset));
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        computeDoubleSize = d1.computeInt32Size(numberAt, oneofIntAt(obj, offset));
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        computeDoubleSize = d1.computeFixed64Size(numberAt, 0L);
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        computeDoubleSize = d1.computeFixed32Size(numberAt, 0);
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        computeDoubleSize = d1.computeBoolSize(numberAt, true);
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        Object object2 = d9.getObject(obj, offset);
                        if (object2 instanceof h0) {
                            computeStringSize = d1.computeBytesSize(numberAt, (h0) object2);
                        } else {
                            computeStringSize = d1.computeStringSize(numberAt, (String) object2);
                        }
                        i11 += computeStringSize;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        computeDoubleSize = b7.computeSizeMessage(numberAt, d9.getObject(obj, offset), getMessageFieldSchema(i12));
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        computeDoubleSize = d1.computeBytesSize(numberAt, (h0) d9.getObject(obj, offset));
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        computeDoubleSize = d1.computeUInt32Size(numberAt, oneofIntAt(obj, offset));
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        computeDoubleSize = d1.computeEnumSize(numberAt, oneofIntAt(obj, offset));
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        computeDoubleSize = d1.computeSFixed32Size(numberAt, 0);
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        computeDoubleSize = d1.computeSFixed64Size(numberAt, 0L);
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        computeDoubleSize = d1.computeSInt32Size(numberAt, oneofIntAt(obj, offset));
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        computeDoubleSize = d1.computeSInt64Size(numberAt, oneofLongAt(obj, offset));
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(obj, numberAt, i12)) {
                        computeDoubleSize = d1.computeGroupSize(numberAt, (o5) d9.getObject(obj, offset), getMessageFieldSchema(i12));
                        i11 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i11 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, obj);
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(s8 s8Var, Object obj) {
        return s8Var.getSerializedSize(s8Var.getFromMessage(obj));
    }

    private static <T> int intAt(T t5, long j3) {
        return d9.getInt(t5, j3);
    }

    private static boolean isEnforceUtf8(int i10) {
        return (i10 & ENFORCE_UTF8_MASK) != 0;
    }

    private boolean isFieldPresent(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return isFieldPresent(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    private <N> boolean isListInitialized(Object obj, int i10, int i11) {
        List list = (List) d9.getObject(obj, offset(i10));
        if (list.isEmpty()) {
            return true;
        }
        z6 messageFieldSchema = getMessageFieldSchema(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!messageFieldSchema.isInitialized(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    private boolean isMapInitialized(Object obj, int i10, int i11) {
        Map<?, ?> forMapData = ((j5) this.mapFieldSchema).forMapData(d9.getObject(obj, offset(i10)));
        if (forMapData.isEmpty()) {
            return true;
        }
        if (((j5) this.mapFieldSchema).forMapMetadata(getMapFieldDefaultEntry(i11)).valueType.getJavaType() != u9.MESSAGE) {
            return true;
        }
        z6 z6Var = null;
        for (Object obj2 : forMapData.values()) {
            if (z6Var == null) {
                z6Var = p6.getInstance().schemaFor((Class) obj2.getClass());
            }
            if (!z6Var.isInitialized(obj2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMutable(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof o3) {
            return ((o3) obj).isMutable();
        }
        return true;
    }

    private boolean isOneofCaseEqual(Object obj, Object obj2, int i10) {
        long presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10) & 1048575;
        if (d9.getInt(obj, presenceMaskAndOffsetAt) == d9.getInt(obj2, presenceMaskAndOffsetAt)) {
            return true;
        }
        return false;
    }

    private boolean isOneofPresent(Object obj, int i10, int i11) {
        if (d9.getInt(obj, presenceMaskAndOffsetAt(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    private static boolean isRequired(int i10) {
        return (i10 & REQUIRED_MASK) != 0;
    }

    private static List<?> listAt(Object obj, long j3) {
        return (List) d9.getObject(obj, j3);
    }

    private static <T> long longAt(T t5, long j3) {
        return d9.getLong(t5, j3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:213:0x008d, code lost:
    
        r0 = r18.checkInitializedCount;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0091, code lost:
    
        if (r0 >= r18.repeatedFieldOffsetStart) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0093, code lost:
    
        r6 = filterMapUnknownEnumValues(r21, r18.intArray[r0], r6, r19, r21);
        r0 = r0 + 1;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x00a9, code lost:
    
        r10 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x00aa, code lost:
    
        if (r6 == null) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x00ac, code lost:
    
        r7.setBuilderToMessage(r10, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x00af, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:?, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x00c3. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x067a A[LOOP:2: B:37:0x0676->B:39:0x067a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x060b A[Catch: all -> 0x0662, TRY_LEAVE, TryCatch #0 {all -> 0x0662, blocks: (B:18:0x05dd, B:45:0x0605, B:47:0x060b, B:60:0x0633, B:61:0x0638), top: B:17:0x05dd }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0631  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <UT, UB, ET extends com.google.protobuf.w2> void mergeFromHelper(com.google.protobuf.s8 r19, com.google.protobuf.b2 r20, java.lang.Object r21, com.google.protobuf.t6 r22, com.google.protobuf.a2 r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1826
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.s5.mergeFromHelper(com.google.protobuf.s8, com.google.protobuf.b2, java.lang.Object, com.google.protobuf.t6, com.google.protobuf.a2):void");
    }

    private final <K, V> void mergeMap(Object obj, int i10, Object obj2, a2 a2Var, t6 t6Var) throws IOException {
        long offset = offset(typeAndOffsetAt(i10));
        Object object = d9.getObject(obj, offset);
        if (object == null) {
            object = ((j5) this.mapFieldSchema).newMapField(obj2);
            d9.putObject(obj, offset, object);
        } else if (((j5) this.mapFieldSchema).isImmutable(object)) {
            Object newMapField = ((j5) this.mapFieldSchema).newMapField(obj2);
            ((j5) this.mapFieldSchema).mergeFrom(newMapField, object);
            d9.putObject(obj, offset, newMapField);
            object = newMapField;
        }
        ((t0) t6Var).readMap(((j5) this.mapFieldSchema).forMutableMapData(object), ((j5) this.mapFieldSchema).forMapMetadata(obj2), a2Var);
    }

    private void mergeMessage(Object obj, Object obj2, int i10) {
        if (!isFieldPresent(obj2, i10)) {
            return;
        }
        long offset = offset(typeAndOffsetAt(i10));
        Unsafe unsafe = UNSAFE;
        Object object = unsafe.getObject(obj2, offset);
        if (object != null) {
            z6 messageFieldSchema = getMessageFieldSchema(i10);
            if (!isFieldPresent(obj, i10)) {
                if (!isMutable(object)) {
                    unsafe.putObject(obj, offset, object);
                } else {
                    Object newInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(newInstance, object);
                    unsafe.putObject(obj, offset, newInstance);
                }
                setFieldPresent(obj, i10);
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
        throw new IllegalStateException("Source subfield " + numberAt(i10) + " is present but null: " + obj2);
    }

    private void mergeOneofMessage(Object obj, Object obj2, int i10) {
        int numberAt = numberAt(i10);
        if (!isOneofPresent(obj2, numberAt, i10)) {
            return;
        }
        long offset = offset(typeAndOffsetAt(i10));
        Unsafe unsafe = UNSAFE;
        Object object = unsafe.getObject(obj2, offset);
        if (object != null) {
            z6 messageFieldSchema = getMessageFieldSchema(i10);
            if (!isOneofPresent(obj, numberAt, i10)) {
                if (!isMutable(object)) {
                    unsafe.putObject(obj, offset, object);
                } else {
                    Object newInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(newInstance, object);
                    unsafe.putObject(obj, offset, newInstance);
                }
                setOneofPresent(obj, numberAt, i10);
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
        throw new IllegalStateException("Source subfield " + numberAt(i10) + " is present but null: " + obj2);
    }

    private void mergeSingleField(Object obj, Object obj2, int i10) {
        int typeAndOffsetAt = typeAndOffsetAt(i10);
        long offset = offset(typeAndOffsetAt);
        int numberAt = numberAt(i10);
        switch (type(typeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(obj2, i10)) {
                    d9.putDouble(obj, offset, d9.getDouble(obj2, offset));
                    setFieldPresent(obj, i10);
                    return;
                }
                return;
            case 1:
                if (isFieldPresent(obj2, i10)) {
                    d9.putFloat(obj, offset, d9.getFloat(obj2, offset));
                    setFieldPresent(obj, i10);
                    return;
                }
                return;
            case 2:
                if (isFieldPresent(obj2, i10)) {
                    d9.putLong(obj, offset, d9.getLong(obj2, offset));
                    setFieldPresent(obj, i10);
                    return;
                }
                return;
            case 3:
                if (isFieldPresent(obj2, i10)) {
                    d9.putLong(obj, offset, d9.getLong(obj2, offset));
                    setFieldPresent(obj, i10);
                    return;
                }
                return;
            case 4:
                if (isFieldPresent(obj2, i10)) {
                    d9.putInt(obj, offset, d9.getInt(obj2, offset));
                    setFieldPresent(obj, i10);
                    return;
                }
                return;
            case 5:
                if (isFieldPresent(obj2, i10)) {
                    d9.putLong(obj, offset, d9.getLong(obj2, offset));
                    setFieldPresent(obj, i10);
                    return;
                }
                return;
            case 6:
                if (isFieldPresent(obj2, i10)) {
                    d9.putInt(obj, offset, d9.getInt(obj2, offset));
                    setFieldPresent(obj, i10);
                    return;
                }
                return;
            case 7:
                if (isFieldPresent(obj2, i10)) {
                    d9.putBoolean(obj, offset, d9.getBoolean(obj2, offset));
                    setFieldPresent(obj, i10);
                    return;
                }
                return;
            case 8:
                if (isFieldPresent(obj2, i10)) {
                    d9.putObject(obj, offset, d9.getObject(obj2, offset));
                    setFieldPresent(obj, i10);
                    return;
                }
                return;
            case 9:
                mergeMessage(obj, obj2, i10);
                return;
            case 10:
                if (isFieldPresent(obj2, i10)) {
                    d9.putObject(obj, offset, d9.getObject(obj2, offset));
                    setFieldPresent(obj, i10);
                    return;
                }
                return;
            case 11:
                if (isFieldPresent(obj2, i10)) {
                    d9.putInt(obj, offset, d9.getInt(obj2, offset));
                    setFieldPresent(obj, i10);
                    return;
                }
                return;
            case 12:
                if (isFieldPresent(obj2, i10)) {
                    d9.putInt(obj, offset, d9.getInt(obj2, offset));
                    setFieldPresent(obj, i10);
                    return;
                }
                return;
            case 13:
                if (isFieldPresent(obj2, i10)) {
                    d9.putInt(obj, offset, d9.getInt(obj2, offset));
                    setFieldPresent(obj, i10);
                    return;
                }
                return;
            case 14:
                if (isFieldPresent(obj2, i10)) {
                    d9.putLong(obj, offset, d9.getLong(obj2, offset));
                    setFieldPresent(obj, i10);
                    return;
                }
                return;
            case 15:
                if (isFieldPresent(obj2, i10)) {
                    d9.putInt(obj, offset, d9.getInt(obj2, offset));
                    setFieldPresent(obj, i10);
                    return;
                }
                return;
            case 16:
                if (isFieldPresent(obj2, i10)) {
                    d9.putLong(obj, offset, d9.getLong(obj2, offset));
                    setFieldPresent(obj, i10);
                    return;
                }
                return;
            case 17:
                mergeMessage(obj, obj2, i10);
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
            case NOTIFICATION_REDIRECT_VALUE:
            case 30:
            case TEMPLATE_HTML_SIZE_VALUE:
            case 32:
            case 33:
            case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
            case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
            case 36:
            case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
            case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
            case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
            case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
            case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
            case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(obj, obj2, offset);
                return;
            case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                b7.mergeMap(this.mapFieldSchema, obj, obj2, offset);
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
                if (isOneofPresent(obj2, numberAt, i10)) {
                    d9.putObject(obj, offset, d9.getObject(obj2, offset));
                    setOneofPresent(obj, numberAt, i10);
                    return;
                }
                return;
            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                mergeOneofMessage(obj, obj2, i10);
                return;
            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(obj2, numberAt, i10)) {
                    d9.putObject(obj, offset, d9.getObject(obj2, offset));
                    setOneofPresent(obj, numberAt, i10);
                    return;
                }
                return;
            case 68:
                mergeOneofMessage(obj, obj2, i10);
                return;
            default:
                return;
        }
    }

    private Object mutableMessageFieldForMerge(Object obj, int i10) {
        z6 messageFieldSchema = getMessageFieldSchema(i10);
        long offset = offset(typeAndOffsetAt(i10));
        if (!isFieldPresent(obj, i10)) {
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

    private Object mutableOneofMessageFieldForMerge(Object obj, int i10, int i11) {
        z6 messageFieldSchema = getMessageFieldSchema(i11);
        if (!isOneofPresent(obj, i10, i11)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(obj, offset(typeAndOffsetAt(i11)));
        if (isMutable(object)) {
            return object;
        }
        Object newInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    public static <T> s5 newSchema(Class<T> cls, l5 l5Var, a6 a6Var, w4 w4Var, s8 s8Var, b2 b2Var, i5 i5Var) {
        if (l5Var instanceof s6) {
            return newSchemaForRawMessageInfo((s6) l5Var, a6Var, w4Var, s8Var, b2Var, i5Var);
        }
        return newSchemaForMessageInfo((x7) l5Var, a6Var, w4Var, s8Var, b2Var, i5Var);
    }

    public static <T> s5 newSchemaForMessageInfo(x7 x7Var, a6 a6Var, w4 w4Var, s8 s8Var, b2 b2Var, i5 i5Var) {
        boolean z10;
        int fieldNumber;
        int fieldNumber2;
        int[] iArr;
        int i10;
        if (x7Var.getSyntax() == o6.PROTO3) {
            z10 = true;
        } else {
            z10 = false;
        }
        p2[] fields = x7Var.getFields();
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
        int i11 = 0;
        int i12 = 0;
        for (p2 p2Var : fields) {
            if (p2Var.getType() == a3.MAP) {
                i11++;
            } else if (p2Var.getType().id() >= 18 && p2Var.getType().id() <= 49) {
                i12++;
            }
        }
        int[] iArr3 = null;
        if (i11 > 0) {
            iArr = new int[i11];
        } else {
            iArr = null;
        }
        if (i12 > 0) {
            iArr3 = new int[i12];
        }
        int[] checkInitialized = x7Var.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i13 < fields.length) {
            p2 p2Var2 = fields[i13];
            int fieldNumber3 = p2Var2.getFieldNumber();
            storeFieldData(p2Var2, iArr2, i14, objArr);
            if (i15 < checkInitialized.length && checkInitialized[i15] == fieldNumber3) {
                checkInitialized[i15] = i14;
                i15++;
            }
            if (p2Var2.getType() == a3.MAP) {
                iArr[i16] = i14;
                i16++;
            } else if (p2Var2.getType().id() >= 18 && p2Var2.getType().id() <= 49) {
                i10 = i14;
                iArr3[i17] = (int) d9.objectFieldOffset(p2Var2.getField());
                i17++;
                i13++;
                i14 = i10 + 3;
            }
            i10 = i14;
            i13++;
            i14 = i10 + 3;
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
        return new s5(iArr2, objArr, fieldNumber, fieldNumber2, x7Var.getDefaultInstance(), z10, true, iArr4, checkInitialized.length, checkInitialized.length + iArr.length, a6Var, w4Var, s8Var, b2Var, i5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0251  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> com.google.protobuf.s5 newSchemaForRawMessageInfo(com.google.protobuf.s6 r34, com.google.protobuf.a6 r35, com.google.protobuf.w4 r36, com.google.protobuf.s8 r37, com.google.protobuf.b2 r38, com.google.protobuf.i5 r39) {
        /*
            Method dump skipped, instructions count: 996
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.s5.newSchemaForRawMessageInfo(com.google.protobuf.s6, com.google.protobuf.a6, com.google.protobuf.w4, com.google.protobuf.s8, com.google.protobuf.b2, com.google.protobuf.i5):com.google.protobuf.s5");
    }

    private int numberAt(int i10) {
        return this.buffer[i10];
    }

    private static long offset(int i10) {
        return i10 & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T t5, long j3) {
        return ((Boolean) d9.getObject(t5, j3)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t5, long j3) {
        return ((Double) d9.getObject(t5, j3)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t5, long j3) {
        return ((Float) d9.getObject(t5, j3)).floatValue();
    }

    private static <T> int oneofIntAt(T t5, long j3) {
        return ((Integer) d9.getObject(t5, j3)).intValue();
    }

    private static <T> long oneofLongAt(T t5, long j3) {
        return ((Long) d9.getObject(t5, j3)).longValue();
    }

    private <K, V> int parseMapField(Object obj, byte[] bArr, int i10, int i11, int i12, long j3, n nVar) throws IOException {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i12);
        Object object = unsafe.getObject(obj, j3);
        if (((j5) this.mapFieldSchema).isImmutable(object)) {
            Object newMapField = ((j5) this.mapFieldSchema).newMapField(mapFieldDefaultEntry);
            ((j5) this.mapFieldSchema).mergeFrom(newMapField, object);
            unsafe.putObject(obj, j3, newMapField);
            object = newMapField;
        }
        return decodeMapEntry(bArr, i10, i11, ((j5) this.mapFieldSchema).forMapMetadata(mapFieldDefaultEntry), ((j5) this.mapFieldSchema).forMutableMapData(object), nVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0023. Please report as an issue. */
    private int parseOneofField(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j3, int i17, n nVar) throws IOException {
        Unsafe unsafe = UNSAFE;
        long j10 = this.buffer[i17 + 2] & 1048575;
        switch (i16) {
            case ONEOF_TYPE_OFFSET /* 51 */:
                if (i14 == 1) {
                    unsafe.putObject(obj, j3, Double.valueOf(o.decodeDouble(bArr, i10)));
                    int i18 = i10 + 8;
                    unsafe.putInt(obj, j10, i13);
                    return i18;
                }
                return i10;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj, j3, Float.valueOf(o.decodeFloat(bArr, i10)));
                    int i19 = i10 + 4;
                    unsafe.putInt(obj, j10, i13);
                    return i19;
                }
                return i10;
            case 53:
            case 54:
                if (i14 == 0) {
                    int decodeVarint64 = o.decodeVarint64(bArr, i10, nVar);
                    unsafe.putObject(obj, j3, Long.valueOf(nVar.long1));
                    unsafe.putInt(obj, j10, i13);
                    return decodeVarint64;
                }
                return i10;
            case 55:
            case 62:
                if (i14 == 0) {
                    int decodeVarint32 = o.decodeVarint32(bArr, i10, nVar);
                    unsafe.putObject(obj, j3, Integer.valueOf(nVar.int1));
                    unsafe.putInt(obj, j10, i13);
                    return decodeVarint32;
                }
                return i10;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(obj, j3, Long.valueOf(o.decodeFixed64(bArr, i10)));
                    int i20 = i10 + 8;
                    unsafe.putInt(obj, j10, i13);
                    return i20;
                }
                return i10;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj, j3, Integer.valueOf(o.decodeFixed32(bArr, i10)));
                    int i21 = i10 + 4;
                    unsafe.putInt(obj, j10, i13);
                    return i21;
                }
                return i10;
            case 58:
                if (i14 == 0) {
                    int decodeVarint642 = o.decodeVarint64(bArr, i10, nVar);
                    unsafe.putObject(obj, j3, Boolean.valueOf(nVar.long1 != 0));
                    unsafe.putInt(obj, j10, i13);
                    return decodeVarint642;
                }
                return i10;
            case 59:
                if (i14 == 2) {
                    int decodeVarint322 = o.decodeVarint32(bArr, i10, nVar);
                    int i22 = nVar.int1;
                    if (i22 == 0) {
                        unsafe.putObject(obj, j3, "");
                    } else {
                        if ((i15 & ENFORCE_UTF8_MASK) != 0 && !j9.isValidUtf8(bArr, decodeVarint322, decodeVarint322 + i22)) {
                            throw h4.invalidUtf8();
                        }
                        unsafe.putObject(obj, j3, new String(bArr, decodeVarint322, i22, f4.UTF_8));
                        decodeVarint322 += i22;
                    }
                    unsafe.putInt(obj, j10, i13);
                    return decodeVarint322;
                }
                return i10;
            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                if (i14 == 2) {
                    Object mutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(obj, i13, i17);
                    int mergeMessageField = o.mergeMessageField(mutableOneofMessageFieldForMerge, getMessageFieldSchema(i17), bArr, i10, i11, nVar);
                    storeOneofMessageField(obj, i13, i17, mutableOneofMessageFieldForMerge);
                    return mergeMessageField;
                }
                return i10;
            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                if (i14 == 2) {
                    int decodeBytes = o.decodeBytes(bArr, i10, nVar);
                    unsafe.putObject(obj, j3, nVar.object1);
                    unsafe.putInt(obj, j10, i13);
                    return decodeBytes;
                }
                return i10;
            case 63:
                if (i14 == 0) {
                    int decodeVarint323 = o.decodeVarint32(bArr, i10, nVar);
                    int i23 = nVar.int1;
                    a4 enumFieldVerifier = getEnumFieldVerifier(i17);
                    if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i23)) {
                        getMutableUnknownFields(obj).storeField(i12, Long.valueOf(i23));
                    } else {
                        unsafe.putObject(obj, j3, Integer.valueOf(i23));
                        unsafe.putInt(obj, j10, i13);
                    }
                    return decodeVarint323;
                }
                return i10;
            case 66:
                if (i14 == 0) {
                    int decodeVarint324 = o.decodeVarint32(bArr, i10, nVar);
                    unsafe.putObject(obj, j3, Integer.valueOf(r0.decodeZigZag32(nVar.int1)));
                    unsafe.putInt(obj, j10, i13);
                    return decodeVarint324;
                }
                return i10;
            case 67:
                if (i14 == 0) {
                    int decodeVarint643 = o.decodeVarint64(bArr, i10, nVar);
                    unsafe.putObject(obj, j3, Long.valueOf(r0.decodeZigZag64(nVar.long1)));
                    unsafe.putInt(obj, j10, i13);
                    return decodeVarint643;
                }
                return i10;
            case 68:
                if (i14 == 3) {
                    Object mutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(obj, i13, i17);
                    int mergeGroupField = o.mergeGroupField(mutableOneofMessageFieldForMerge2, getMessageFieldSchema(i17), bArr, i10, i11, (i12 & (-8)) | 4, nVar);
                    storeOneofMessageField(obj, i13, i17, mutableOneofMessageFieldForMerge2);
                    return mergeGroupField;
                }
                return i10;
            default:
                return i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x029c, code lost:
    
        if (r0 != r10) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x029e, code lost:
    
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r1 = r18;
        r2 = r19;
        r7 = r22;
        r6 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0307, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02e1, code lost:
    
        if (r0 != r15) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0304, code lost:
    
        if (r0 != r15) goto L99;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0088. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int parseProto3Message(java.lang.Object r30, byte[] r31, int r32, int r33, com.google.protobuf.n r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 880
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.s5.parseProto3Message(java.lang.Object, byte[], int, int, com.google.protobuf.n):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002f. Please report as an issue. */
    private int parseRepeatedField(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j3, int i16, long j10, n nVar) throws IOException {
        int decodeVarint32List;
        Unsafe unsafe = UNSAFE;
        e4 e4Var = (e4) unsafe.getObject(obj, j10);
        if (!e4Var.isModifiable()) {
            int size = e4Var.size();
            e4Var = e4Var.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j10, e4Var);
        }
        switch (i16) {
            case 18:
            case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                if (i14 == 2) {
                    return o.decodePackedDoubleList(bArr, i10, e4Var, nVar);
                }
                if (i14 == 1) {
                    return o.decodeDoubleList(i12, bArr, i10, i11, e4Var, nVar);
                }
                return i10;
            case 19:
            case 36:
                if (i14 == 2) {
                    return o.decodePackedFloatList(bArr, i10, e4Var, nVar);
                }
                if (i14 == 5) {
                    return o.decodeFloatList(i12, bArr, i10, i11, e4Var, nVar);
                }
                return i10;
            case 20:
            case 21:
            case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                if (i14 == 2) {
                    return o.decodePackedVarint64List(bArr, i10, e4Var, nVar);
                }
                if (i14 == 0) {
                    return o.decodeVarint64List(i12, bArr, i10, i11, e4Var, nVar);
                }
                return i10;
            case 22:
            case NOTIFICATION_REDIRECT_VALUE:
            case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                if (i14 == 2) {
                    return o.decodePackedVarint32List(bArr, i10, e4Var, nVar);
                }
                if (i14 == 0) {
                    return o.decodeVarint32List(i12, bArr, i10, i11, e4Var, nVar);
                }
                return i10;
            case 23:
            case 32:
            case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                if (i14 == 2) {
                    return o.decodePackedFixed64List(bArr, i10, e4Var, nVar);
                }
                if (i14 == 1) {
                    return o.decodeFixed64List(i12, bArr, i10, i11, e4Var, nVar);
                }
                return i10;
            case 24:
            case TEMPLATE_HTML_SIZE_VALUE:
            case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
            case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                if (i14 == 2) {
                    return o.decodePackedFixed32List(bArr, i10, e4Var, nVar);
                }
                if (i14 == 5) {
                    return o.decodeFixed32List(i12, bArr, i10, i11, e4Var, nVar);
                }
                return i10;
            case 25:
            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                if (i14 == 2) {
                    return o.decodePackedBoolList(bArr, i10, e4Var, nVar);
                }
                if (i14 == 0) {
                    return o.decodeBoolList(i12, bArr, i10, i11, e4Var, nVar);
                }
                return i10;
            case 26:
                if (i14 == 2) {
                    if ((j3 & 536870912) == 0) {
                        return o.decodeStringList(i12, bArr, i10, i11, e4Var, nVar);
                    }
                    return o.decodeStringListRequireUtf8(i12, bArr, i10, i11, e4Var, nVar);
                }
                return i10;
            case 27:
                if (i14 == 2) {
                    return o.decodeMessageList(getMessageFieldSchema(i15), i12, bArr, i10, i11, e4Var, nVar);
                }
                return i10;
            case 28:
                if (i14 == 2) {
                    return o.decodeBytesList(i12, bArr, i10, i11, e4Var, nVar);
                }
                return i10;
            case 30:
            case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                if (i14 != 2) {
                    if (i14 == 0) {
                        decodeVarint32List = o.decodeVarint32List(i12, bArr, i10, i11, e4Var, nVar);
                    }
                    return i10;
                }
                decodeVarint32List = o.decodePackedVarint32List(bArr, i10, e4Var, nVar);
                b7.filterUnknownEnumList(obj, i13, e4Var, getEnumFieldVerifier(i15), (Object) null, this.unknownFieldSchema);
                return decodeVarint32List;
            case 33:
            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                if (i14 == 2) {
                    return o.decodePackedSInt32List(bArr, i10, e4Var, nVar);
                }
                if (i14 == 0) {
                    return o.decodeSInt32List(i12, bArr, i10, i11, e4Var, nVar);
                }
                return i10;
            case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
            case 48:
                if (i14 == 2) {
                    return o.decodePackedSInt64List(bArr, i10, e4Var, nVar);
                }
                if (i14 == 0) {
                    return o.decodeSInt64List(i12, bArr, i10, i11, e4Var, nVar);
                }
                return i10;
            case 49:
                if (i14 == 3) {
                    return o.decodeGroupList(getMessageFieldSchema(i15), i12, bArr, i10, i11, e4Var, nVar);
                }
                return i10;
            default:
                return i10;
        }
    }

    private int positionForFieldNumber(int i10) {
        if (i10 < this.minFieldNumber || i10 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i10, 0);
    }

    private int presenceMaskAndOffsetAt(int i10) {
        return this.buffer[i10 + 2];
    }

    private <E> void readGroupList(Object obj, long j3, t6 t6Var, z6 z6Var, a2 a2Var) throws IOException {
        ((t0) t6Var).readGroupList(this.listFieldSchema.mutableListAt(obj, j3), z6Var, a2Var);
    }

    private <E> void readMessageList(Object obj, int i10, t6 t6Var, z6 z6Var, a2 a2Var) throws IOException {
        t0 t0Var = (t0) t6Var;
        t0Var.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i10)), z6Var, a2Var);
    }

    private void readString(Object obj, int i10, t6 t6Var) throws IOException {
        if (isEnforceUtf8(i10)) {
            d9.putObject(obj, offset(i10), ((t0) t6Var).readStringRequireUtf8());
        } else if (this.lite) {
            d9.putObject(obj, offset(i10), ((t0) t6Var).readString());
        } else {
            d9.putObject(obj, offset(i10), ((t0) t6Var).readBytes());
        }
    }

    private void readStringList(Object obj, int i10, t6 t6Var) throws IOException {
        if (isEnforceUtf8(i10)) {
            ((t0) t6Var).readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i10)));
        } else {
            ((t0) t6Var).readStringList(this.listFieldSchema.mutableListAt(obj, offset(i10)));
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
            StringBuilder o10 = a4.j.o("Field ", str, " for ");
            o10.append(cls.getName());
            o10.append(" not found. Known fields are ");
            o10.append(Arrays.toString(declaredFields));
            throw new RuntimeException(o10.toString());
        }
    }

    private void setFieldPresent(Object obj, int i10) {
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10);
        long j3 = 1048575 & presenceMaskAndOffsetAt;
        if (j3 == 1048575) {
            return;
        }
        d9.putInt(obj, j3, (1 << (presenceMaskAndOffsetAt >>> 20)) | d9.getInt(obj, j3));
    }

    private void setOneofPresent(Object obj, int i10, int i11) {
        d9.putInt(obj, presenceMaskAndOffsetAt(i11) & 1048575, i10);
    }

    private int slowPositionForFieldNumber(int i10, int i11) {
        int length = (this.buffer.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int numberAt = numberAt(i13);
            if (i10 == numberAt) {
                return i13;
            }
            if (i10 < numberAt) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
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
    private static void storeFieldData(com.google.protobuf.p2 r8, int[] r9, int r10, java.lang.Object[] r11) {
        /*
            com.google.protobuf.i6 r0 = r8.getOneof()
            r1 = 0
            if (r0 == 0) goto L25
            com.google.protobuf.a3 r2 = r8.getType()
            int r2 = r2.id()
            int r2 = r2 + 51
            java.lang.reflect.Field r3 = r0.getValueField()
            long r3 = com.google.protobuf.d9.objectFieldOffset(r3)
            int r3 = (int) r3
            java.lang.reflect.Field r0 = r0.getCaseField()
            long r4 = com.google.protobuf.d9.objectFieldOffset(r0)
        L22:
            int r0 = (int) r4
            r4 = r1
            goto L6c
        L25:
            com.google.protobuf.a3 r0 = r8.getType()
            java.lang.reflect.Field r2 = r8.getField()
            long r2 = com.google.protobuf.d9.objectFieldOffset(r2)
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
            long r4 = com.google.protobuf.d9.objectFieldOffset(r0)
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
            long r4 = com.google.protobuf.d9.objectFieldOffset(r0)
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
            com.google.protobuf.a4 r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Ldb
            int r10 = r10 + 1
            com.google.protobuf.a4 r8 = r8.getEnumVerifier()
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
            com.google.protobuf.a4 r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Ldb
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            com.google.protobuf.a4 r8 = r8.getEnumVerifier()
            r11[r10] = r8
        Ldb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.s5.storeFieldData(com.google.protobuf.p2, int[], int, java.lang.Object[]):void");
    }

    private void storeMessageField(Object obj, int i10, Object obj2) {
        UNSAFE.putObject(obj, offset(typeAndOffsetAt(i10)), obj2);
        setFieldPresent(obj, i10);
    }

    private void storeOneofMessageField(Object obj, int i10, int i11, Object obj2) {
        UNSAFE.putObject(obj, offset(typeAndOffsetAt(i11)), obj2);
        setOneofPresent(obj, i10, i11);
    }

    private static int type(int i10) {
        return (i10 & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int i10) {
        return this.buffer[i10 + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInAscendingOrderProto2(java.lang.Object r18, com.google.protobuf.ba r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.s5.writeFieldsInAscendingOrderProto2(java.lang.Object, com.google.protobuf.ba):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInAscendingOrderProto3(java.lang.Object r13, com.google.protobuf.ba r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.s5.writeFieldsInAscendingOrderProto3(java.lang.Object, com.google.protobuf.ba):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInDescendingOrder(java.lang.Object r11, com.google.protobuf.ba r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.s5.writeFieldsInDescendingOrder(java.lang.Object, com.google.protobuf.ba):void");
    }

    private <K, V> void writeMapHelper(ba baVar, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            f1 f1Var = (f1) baVar;
            f1Var.writeMap(i10, ((j5) this.mapFieldSchema).forMapMetadata(getMapFieldDefaultEntry(i11)), ((j5) this.mapFieldSchema).forMapData(obj));
        }
    }

    private void writeString(int i10, Object obj, ba baVar) throws IOException {
        if (obj instanceof String) {
            ((f1) baVar).writeString(i10, (String) obj);
        } else {
            ((f1) baVar).writeBytes(i10, (h0) obj);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(s8 s8Var, Object obj, ba baVar) throws IOException {
        s8Var.writeTo(s8Var.getFromMessage(obj), baVar);
    }

    @Override // com.google.protobuf.z6
    public boolean equals(Object obj, Object obj2) {
        int length = this.buffer.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!equals(obj, obj2, i10)) {
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

    @Override // com.google.protobuf.z6
    public int getSerializedSize(Object obj) {
        return this.proto3 ? getSerializedSizeProto3(obj) : getSerializedSizeProto2(obj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0019. Please report as an issue. */
    @Override // com.google.protobuf.z6
    public int hashCode(Object obj) {
        int i10;
        int hashLong;
        int i11;
        int oneofIntAt;
        int length = this.buffer.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i13);
            int numberAt = numberAt(i13);
            long offset = offset(typeAndOffsetAt);
            int i14 = 37;
            switch (type(typeAndOffsetAt)) {
                case 0:
                    i10 = i12 * 53;
                    hashLong = f4.hashLong(Double.doubleToLongBits(d9.getDouble(obj, offset)));
                    i12 = hashLong + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    hashLong = Float.floatToIntBits(d9.getFloat(obj, offset));
                    i12 = hashLong + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    hashLong = f4.hashLong(d9.getLong(obj, offset));
                    i12 = hashLong + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    hashLong = f4.hashLong(d9.getLong(obj, offset));
                    i12 = hashLong + i10;
                    break;
                case 4:
                    i10 = i12 * 53;
                    hashLong = d9.getInt(obj, offset);
                    i12 = hashLong + i10;
                    break;
                case 5:
                    i10 = i12 * 53;
                    hashLong = f4.hashLong(d9.getLong(obj, offset));
                    i12 = hashLong + i10;
                    break;
                case 6:
                    i10 = i12 * 53;
                    hashLong = d9.getInt(obj, offset);
                    i12 = hashLong + i10;
                    break;
                case 7:
                    i10 = i12 * 53;
                    hashLong = f4.hashBoolean(d9.getBoolean(obj, offset));
                    i12 = hashLong + i10;
                    break;
                case 8:
                    i10 = i12 * 53;
                    hashLong = ((String) d9.getObject(obj, offset)).hashCode();
                    i12 = hashLong + i10;
                    break;
                case 9:
                    Object object = d9.getObject(obj, offset);
                    if (object != null) {
                        i14 = object.hashCode();
                    }
                    i12 = (i12 * 53) + i14;
                    break;
                case 10:
                    i10 = i12 * 53;
                    hashLong = d9.getObject(obj, offset).hashCode();
                    i12 = hashLong + i10;
                    break;
                case 11:
                    i10 = i12 * 53;
                    hashLong = d9.getInt(obj, offset);
                    i12 = hashLong + i10;
                    break;
                case 12:
                    i10 = i12 * 53;
                    hashLong = d9.getInt(obj, offset);
                    i12 = hashLong + i10;
                    break;
                case 13:
                    i10 = i12 * 53;
                    hashLong = d9.getInt(obj, offset);
                    i12 = hashLong + i10;
                    break;
                case 14:
                    i10 = i12 * 53;
                    hashLong = f4.hashLong(d9.getLong(obj, offset));
                    i12 = hashLong + i10;
                    break;
                case 15:
                    i10 = i12 * 53;
                    hashLong = d9.getInt(obj, offset);
                    i12 = hashLong + i10;
                    break;
                case 16:
                    i10 = i12 * 53;
                    hashLong = f4.hashLong(d9.getLong(obj, offset));
                    i12 = hashLong + i10;
                    break;
                case 17:
                    Object object2 = d9.getObject(obj, offset);
                    if (object2 != null) {
                        i14 = object2.hashCode();
                    }
                    i12 = (i12 * 53) + i14;
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
                case NOTIFICATION_REDIRECT_VALUE:
                case 30:
                case TEMPLATE_HTML_SIZE_VALUE:
                case 32:
                case 33:
                case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                case 36:
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                case 48:
                case 49:
                    i10 = i12 * 53;
                    hashLong = d9.getObject(obj, offset).hashCode();
                    i12 = hashLong + i10;
                    break;
                case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                    i10 = i12 * 53;
                    hashLong = d9.getObject(obj, offset).hashCode();
                    i12 = hashLong + i10;
                    break;
                case ONEOF_TYPE_OFFSET /* 51 */:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        i10 = i12 * 53;
                        hashLong = f4.hashLong(Double.doubleToLongBits(oneofDoubleAt(obj, offset)));
                        i12 = hashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        i10 = i12 * 53;
                        hashLong = Float.floatToIntBits(oneofFloatAt(obj, offset));
                        i12 = hashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        i10 = i12 * 53;
                        hashLong = f4.hashLong(oneofLongAt(obj, offset));
                        i12 = hashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        i10 = i12 * 53;
                        hashLong = f4.hashLong(oneofLongAt(obj, offset));
                        i12 = hashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        i11 = i12 * 53;
                        oneofIntAt = oneofIntAt(obj, offset);
                        i12 = i11 + oneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        i10 = i12 * 53;
                        hashLong = f4.hashLong(oneofLongAt(obj, offset));
                        i12 = hashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        i11 = i12 * 53;
                        oneofIntAt = oneofIntAt(obj, offset);
                        i12 = i11 + oneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        i10 = i12 * 53;
                        hashLong = f4.hashBoolean(oneofBooleanAt(obj, offset));
                        i12 = hashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        i10 = i12 * 53;
                        hashLong = ((String) d9.getObject(obj, offset)).hashCode();
                        i12 = hashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        i10 = i12 * 53;
                        hashLong = d9.getObject(obj, offset).hashCode();
                        i12 = hashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        i10 = i12 * 53;
                        hashLong = d9.getObject(obj, offset).hashCode();
                        i12 = hashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        i11 = i12 * 53;
                        oneofIntAt = oneofIntAt(obj, offset);
                        i12 = i11 + oneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        i11 = i12 * 53;
                        oneofIntAt = oneofIntAt(obj, offset);
                        i12 = i11 + oneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        i11 = i12 * 53;
                        oneofIntAt = oneofIntAt(obj, offset);
                        i12 = i11 + oneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        i10 = i12 * 53;
                        hashLong = f4.hashLong(oneofLongAt(obj, offset));
                        i12 = hashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        i11 = i12 * 53;
                        oneofIntAt = oneofIntAt(obj, offset);
                        i12 = i11 + oneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        i10 = i12 * 53;
                        hashLong = f4.hashLong(oneofLongAt(obj, offset));
                        i12 = hashLong + i10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(obj, numberAt, i13)) {
                        i10 = i12 * 53;
                        hashLong = d9.getObject(obj, offset).hashCode();
                        i12 = hashLong + i10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.unknownFieldSchema.getFromMessage(obj).hashCode() + (i12 * 53);
        if (this.hasExtensions) {
            return (hashCode * 53) + this.extensionSchema.getExtensions(obj).hashCode();
        }
        return hashCode;
    }

    @Override // com.google.protobuf.z6
    public final boolean isInitialized(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.checkInitializedCount) {
            int i15 = this.intArray[i14];
            int numberAt = numberAt(i15);
            int typeAndOffsetAt = typeAndOffsetAt(i15);
            int i16 = this.buffer[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i13 = UNSAFE.getInt(obj, i17);
                }
                i11 = i13;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if (isRequired(typeAndOffsetAt) && !isFieldPresent(obj, i15, i10, i11, i18)) {
                return false;
            }
            int type = type(typeAndOffsetAt);
            if (type != 9 && type != 17) {
                if (type != 27) {
                    if (type == 60 || type == 68) {
                        if (isOneofPresent(obj, numberAt, i15) && !isInitialized(obj, typeAndOffsetAt, getMessageFieldSchema(i15))) {
                            return false;
                        }
                    } else if (type != 49) {
                        if (type == 50 && !isMapInitialized(obj, typeAndOffsetAt, i15)) {
                            return false;
                        }
                    }
                }
                if (!isListInitialized(obj, typeAndOffsetAt, i15)) {
                    return false;
                }
            } else if (isFieldPresent(obj, i15, i10, i11, i18) && !isInitialized(obj, typeAndOffsetAt, getMessageFieldSchema(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(obj).isInitialized();
    }

    @Override // com.google.protobuf.z6
    public void makeImmutable(Object obj) {
        if (!isMutable(obj)) {
            return;
        }
        if (obj instanceof o3) {
            o3 o3Var = (o3) obj;
            o3Var.clearMemoizedSerializedSize();
            o3Var.clearMemoizedHashCode();
            o3Var.markImmutable();
        }
        int length = this.buffer.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i10);
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
                    case NOTIFICATION_REDIRECT_VALUE:
                    case 30:
                    case TEMPLATE_HTML_SIZE_VALUE:
                    case 32:
                    case 33:
                    case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                    case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                    case 36:
                    case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                    case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                    case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                    case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                    case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                    case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                    case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                    case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
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
                            unsafe.putObject(obj, offset, ((j5) this.mapFieldSchema).toImmutable(object));
                            break;
                        } else {
                            break;
                        }
                }
            }
            if (isFieldPresent(obj, i10)) {
                getMessageFieldSchema(i10).makeImmutable(UNSAFE.getObject(obj, offset));
            }
        }
        this.unknownFieldSchema.makeImmutable(obj);
        if (this.hasExtensions) {
            this.extensionSchema.makeImmutable(obj);
        }
    }

    @Override // com.google.protobuf.z6
    public void mergeFrom(Object obj, Object obj2) {
        checkMutable(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.buffer.length; i10 += 3) {
            mergeSingleField(obj, obj2, i10);
        }
        b7.mergeUnknownFields(this.unknownFieldSchema, obj, obj2);
        if (this.hasExtensions) {
            b7.mergeExtensions(this.extensionSchema, obj, obj2);
        }
    }

    @Override // com.google.protobuf.z6
    public Object newInstance() {
        return ((b6) this.newInstanceSchema).newInstance(this.defaultInstance);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:98:0x008f. Please report as an issue. */
    public int parseProto2Message(Object obj, byte[] bArr, int i10, int i11, int i12, n nVar) throws IOException {
        Unsafe unsafe;
        int i13;
        s5 s5Var;
        int i14;
        int i15;
        int i16;
        int i17;
        Object obj2;
        int i18;
        int positionForFieldNumber;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        byte[] bArr2;
        int decodeVarint64;
        int i29;
        int i30;
        s5 s5Var2 = this;
        Object obj3 = obj;
        byte[] bArr3 = bArr;
        int i31 = i11;
        int i32 = i12;
        n nVar2 = nVar;
        checkMutable(obj);
        Unsafe unsafe2 = UNSAFE;
        int i33 = i10;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = -1;
        int i38 = 1048575;
        while (true) {
            if (i33 < i31) {
                int i39 = i33 + 1;
                byte b3 = bArr3[i33];
                if (b3 < 0) {
                    int decodeVarint32 = o.decodeVarint32(b3, bArr3, i39, nVar2);
                    i18 = nVar2.int1;
                    i39 = decodeVarint32;
                } else {
                    i18 = b3;
                }
                int i40 = i18 >>> 3;
                int i41 = i18 & 7;
                if (i40 > i37) {
                    positionForFieldNumber = s5Var2.positionForFieldNumber(i40, i34 / 3);
                } else {
                    positionForFieldNumber = s5Var2.positionForFieldNumber(i40);
                }
                int i42 = positionForFieldNumber;
                if (i42 == -1) {
                    i19 = i40;
                    i20 = i39;
                    i15 = i18;
                    i21 = i36;
                    i22 = i38;
                    unsafe = unsafe2;
                    i13 = i32;
                    i23 = 0;
                } else {
                    int i43 = s5Var2.buffer[i42 + 1];
                    int type = type(i43);
                    long offset = offset(i43);
                    int i44 = i18;
                    if (type <= 17) {
                        int i45 = s5Var2.buffer[i42 + 2];
                        int i46 = 1 << (i45 >>> 20);
                        int i47 = i45 & 1048575;
                        if (i47 != i38) {
                            if (i38 != 1048575) {
                                unsafe2.putInt(obj3, i38, i36);
                            }
                            i25 = i47;
                            i24 = unsafe2.getInt(obj3, i47);
                        } else {
                            i24 = i36;
                            i25 = i38;
                        }
                        switch (type) {
                            case 0:
                                bArr2 = bArr;
                                i19 = i40;
                                i28 = i42;
                                i26 = i25;
                                i27 = i44;
                                if (i41 != 1) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i39;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    d9.putDouble(obj3, offset, o.decodeDouble(bArr2, i39));
                                    i33 = i39 + 8;
                                    i36 = i24 | i46;
                                    i32 = i12;
                                    i34 = i28;
                                    i35 = i27;
                                    i37 = i19;
                                    i38 = i26;
                                    bArr3 = bArr2;
                                }
                            case 1:
                                bArr2 = bArr;
                                i19 = i40;
                                i28 = i42;
                                i26 = i25;
                                i27 = i44;
                                if (i41 != 5) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i39;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    d9.putFloat(obj3, offset, o.decodeFloat(bArr2, i39));
                                    i33 = i39 + 4;
                                    i36 = i24 | i46;
                                    i32 = i12;
                                    i34 = i28;
                                    i35 = i27;
                                    i37 = i19;
                                    i38 = i26;
                                    bArr3 = bArr2;
                                }
                            case 2:
                            case 3:
                                bArr2 = bArr;
                                i19 = i40;
                                i28 = i42;
                                i26 = i25;
                                i27 = i44;
                                if (i41 != 0) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i39;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    decodeVarint64 = o.decodeVarint64(bArr2, i39, nVar2);
                                    unsafe2.putLong(obj, offset, nVar2.long1);
                                    i36 = i24 | i46;
                                    i32 = i12;
                                    i34 = i28;
                                    i33 = decodeVarint64;
                                    i35 = i27;
                                    i37 = i19;
                                    i38 = i26;
                                    bArr3 = bArr2;
                                }
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i19 = i40;
                                i28 = i42;
                                i26 = i25;
                                i27 = i44;
                                if (i41 != 0) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i39;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    i33 = o.decodeVarint32(bArr2, i39, nVar2);
                                    unsafe2.putInt(obj3, offset, nVar2.int1);
                                    i36 = i24 | i46;
                                    i32 = i12;
                                    i34 = i28;
                                    i35 = i27;
                                    i37 = i19;
                                    i38 = i26;
                                    bArr3 = bArr2;
                                }
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i19 = i40;
                                i28 = i42;
                                i26 = i25;
                                i27 = i44;
                                if (i41 != 1) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i39;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    unsafe2.putLong(obj, offset, o.decodeFixed64(bArr2, i39));
                                    i33 = i39 + 8;
                                    i36 = i24 | i46;
                                    i32 = i12;
                                    i34 = i28;
                                    i35 = i27;
                                    i37 = i19;
                                    i38 = i26;
                                    bArr3 = bArr2;
                                }
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i19 = i40;
                                i28 = i42;
                                i26 = i25;
                                i27 = i44;
                                if (i41 != 5) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i39;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    unsafe2.putInt(obj3, offset, o.decodeFixed32(bArr2, i39));
                                    i33 = i39 + 4;
                                    i36 = i24 | i46;
                                    i32 = i12;
                                    i34 = i28;
                                    i35 = i27;
                                    i37 = i19;
                                    i38 = i26;
                                    bArr3 = bArr2;
                                }
                            case 7:
                                bArr2 = bArr;
                                i19 = i40;
                                i28 = i42;
                                i26 = i25;
                                i27 = i44;
                                if (i41 != 0) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i39;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    i33 = o.decodeVarint64(bArr2, i39, nVar2);
                                    d9.putBoolean(obj3, offset, nVar2.long1 != 0);
                                    i36 = i24 | i46;
                                    i32 = i12;
                                    i34 = i28;
                                    i35 = i27;
                                    i37 = i19;
                                    i38 = i26;
                                    bArr3 = bArr2;
                                }
                            case 8:
                                bArr2 = bArr;
                                i19 = i40;
                                i28 = i42;
                                i26 = i25;
                                i27 = i44;
                                if (i41 != 2) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i39;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    if ((ENFORCE_UTF8_MASK & i43) == 0) {
                                        i33 = o.decodeString(bArr2, i39, nVar2);
                                    } else {
                                        i33 = o.decodeStringRequireUtf8(bArr2, i39, nVar2);
                                    }
                                    unsafe2.putObject(obj3, offset, nVar2.object1);
                                    i36 = i24 | i46;
                                    i32 = i12;
                                    i34 = i28;
                                    i35 = i27;
                                    i37 = i19;
                                    i38 = i26;
                                    bArr3 = bArr2;
                                }
                            case 9:
                                bArr2 = bArr;
                                i19 = i40;
                                i28 = i42;
                                i26 = i25;
                                i27 = i44;
                                if (i41 != 2) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i39;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    Object mutableMessageFieldForMerge = s5Var2.mutableMessageFieldForMerge(obj3, i28);
                                    i33 = o.mergeMessageField(mutableMessageFieldForMerge, s5Var2.getMessageFieldSchema(i28), bArr, i39, i11, nVar);
                                    s5Var2.storeMessageField(obj3, i28, mutableMessageFieldForMerge);
                                    i36 = i24 | i46;
                                    i32 = i12;
                                    i34 = i28;
                                    i35 = i27;
                                    i37 = i19;
                                    i38 = i26;
                                    bArr3 = bArr2;
                                }
                            case 10:
                                bArr2 = bArr;
                                i19 = i40;
                                i28 = i42;
                                i26 = i25;
                                i27 = i44;
                                if (i41 != 2) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i39;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    i33 = o.decodeBytes(bArr2, i39, nVar2);
                                    unsafe2.putObject(obj3, offset, nVar2.object1);
                                    i36 = i24 | i46;
                                    i32 = i12;
                                    i34 = i28;
                                    i35 = i27;
                                    i37 = i19;
                                    i38 = i26;
                                    bArr3 = bArr2;
                                }
                            case 12:
                                bArr2 = bArr;
                                i19 = i40;
                                i28 = i42;
                                i26 = i25;
                                i27 = i44;
                                if (i41 != 0) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i39;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    i33 = o.decodeVarint32(bArr2, i39, nVar2);
                                    int i48 = nVar2.int1;
                                    a4 enumFieldVerifier = s5Var2.getEnumFieldVerifier(i28);
                                    if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i48)) {
                                        getMutableUnknownFields(obj).storeField(i27, Long.valueOf(i48));
                                        i34 = i28;
                                        i36 = i24;
                                        i35 = i27;
                                        i37 = i19;
                                        i38 = i26;
                                        i32 = i12;
                                        bArr3 = bArr2;
                                    } else {
                                        unsafe2.putInt(obj3, offset, i48);
                                        i36 = i24 | i46;
                                        i32 = i12;
                                        i34 = i28;
                                        i35 = i27;
                                        i37 = i19;
                                        i38 = i26;
                                        bArr3 = bArr2;
                                    }
                                }
                                break;
                            case 15:
                                bArr2 = bArr;
                                i19 = i40;
                                i28 = i42;
                                i26 = i25;
                                i27 = i44;
                                if (i41 != 0) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i39;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    i33 = o.decodeVarint32(bArr2, i39, nVar2);
                                    unsafe2.putInt(obj3, offset, r0.decodeZigZag32(nVar2.int1));
                                    i36 = i24 | i46;
                                    i32 = i12;
                                    i34 = i28;
                                    i35 = i27;
                                    i37 = i19;
                                    i38 = i26;
                                    bArr3 = bArr2;
                                }
                            case 16:
                                i19 = i40;
                                i28 = i42;
                                i26 = i25;
                                i27 = i44;
                                bArr2 = bArr;
                                if (i41 != 0) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i39;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    decodeVarint64 = o.decodeVarint64(bArr2, i39, nVar2);
                                    unsafe2.putLong(obj, offset, r0.decodeZigZag64(nVar2.long1));
                                    i36 = i24 | i46;
                                    i32 = i12;
                                    i34 = i28;
                                    i33 = decodeVarint64;
                                    i35 = i27;
                                    i37 = i19;
                                    i38 = i26;
                                    bArr3 = bArr2;
                                }
                            case 17:
                                if (i41 != 3) {
                                    i19 = i40;
                                    i26 = i25;
                                    i27 = i44;
                                    i28 = i42;
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i39;
                                    i23 = i28;
                                    unsafe = unsafe2;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    Object mutableMessageFieldForMerge2 = s5Var2.mutableMessageFieldForMerge(obj3, i42);
                                    i33 = o.mergeGroupField(mutableMessageFieldForMerge2, s5Var2.getMessageFieldSchema(i42), bArr, i39, i11, (i40 << 3) | 4, nVar);
                                    s5Var2.storeMessageField(obj3, i42, mutableMessageFieldForMerge2);
                                    i36 = i24 | i46;
                                    i38 = i25;
                                    i32 = i12;
                                    i34 = i42;
                                    i35 = i44;
                                    i37 = i40;
                                    bArr3 = bArr;
                                }
                            default:
                                i19 = i40;
                                i28 = i42;
                                i26 = i25;
                                i27 = i44;
                                i22 = i26;
                                i13 = i12;
                                i20 = i39;
                                i23 = i28;
                                unsafe = unsafe2;
                                i21 = i24;
                                i15 = i27;
                                break;
                        }
                    } else {
                        i19 = i40;
                        i22 = i38;
                        i21 = i36;
                        if (type == 27) {
                            if (i41 == 2) {
                                e4 e4Var = (e4) unsafe2.getObject(obj3, offset);
                                if (!e4Var.isModifiable()) {
                                    int size = e4Var.size();
                                    e4Var = e4Var.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
                                    unsafe2.putObject(obj3, offset, e4Var);
                                }
                                i33 = o.decodeMessageList(s5Var2.getMessageFieldSchema(i42), i44, bArr, i39, i11, e4Var, nVar);
                                i34 = i42;
                                i35 = i44;
                                i38 = i22;
                                i36 = i21;
                                i37 = i19;
                                bArr3 = bArr;
                                i32 = i12;
                            } else {
                                i29 = i39;
                                unsafe = unsafe2;
                                i23 = i42;
                                i30 = i44;
                                i13 = i12;
                                i20 = i29;
                            }
                        } else if (type <= 49) {
                            int i49 = i39;
                            unsafe = unsafe2;
                            i23 = i42;
                            i30 = i44;
                            i33 = parseRepeatedField(obj, bArr, i39, i11, i44, i19, i41, i42, i43, type, offset, nVar);
                            if (i33 != i49) {
                                s5Var2 = this;
                                obj3 = obj;
                                bArr3 = bArr;
                                i31 = i11;
                                i32 = i12;
                                nVar2 = nVar;
                                i38 = i22;
                                i36 = i21;
                                i34 = i23;
                                i35 = i30;
                                i37 = i19;
                                unsafe2 = unsafe;
                            } else {
                                i13 = i12;
                                i20 = i33;
                            }
                        } else {
                            i29 = i39;
                            unsafe = unsafe2;
                            i23 = i42;
                            i30 = i44;
                            if (type != 50) {
                                i33 = parseOneofField(obj, bArr, i29, i11, i30, i19, i41, i43, type, offset, i23, nVar);
                                if (i33 != i29) {
                                    s5Var2 = this;
                                    obj3 = obj;
                                    bArr3 = bArr;
                                    i31 = i11;
                                    i32 = i12;
                                    nVar2 = nVar;
                                    i38 = i22;
                                    i36 = i21;
                                    i34 = i23;
                                    i35 = i30;
                                    i37 = i19;
                                    unsafe2 = unsafe;
                                } else {
                                    i13 = i12;
                                    i20 = i33;
                                }
                            } else if (i41 == 2) {
                                i33 = parseMapField(obj, bArr, i29, i11, i23, offset, nVar);
                                if (i33 != i29) {
                                    s5Var2 = this;
                                    obj3 = obj;
                                    bArr3 = bArr;
                                    i31 = i11;
                                    i32 = i12;
                                    nVar2 = nVar;
                                    i38 = i22;
                                    i36 = i21;
                                    i34 = i23;
                                    i35 = i30;
                                    i37 = i19;
                                    unsafe2 = unsafe;
                                } else {
                                    i13 = i12;
                                    i20 = i33;
                                }
                            } else {
                                i13 = i12;
                                i20 = i29;
                            }
                        }
                        i15 = i30;
                    }
                }
                if (i15 != i13 || i13 == 0) {
                    if (this.hasExtensions && nVar.extensionRegistry != a2.getEmptyRegistry()) {
                        i33 = o.decodeExtensionOrUnknownField(i15, bArr, i20, i11, obj, this.defaultInstance, this.unknownFieldSchema, nVar);
                    } else {
                        i33 = o.decodeUnknownField(i15, bArr, i20, i11, getMutableUnknownFields(obj), nVar);
                    }
                    obj3 = obj;
                    bArr3 = bArr;
                    i31 = i11;
                    i35 = i15;
                    s5Var2 = this;
                    nVar2 = nVar;
                    i38 = i22;
                    i36 = i21;
                    i34 = i23;
                    i37 = i19;
                    unsafe2 = unsafe;
                    i32 = i13;
                } else {
                    i17 = 1048575;
                    s5Var = this;
                    i14 = i20;
                    i16 = i22;
                    i36 = i21;
                }
            } else {
                int i50 = i38;
                unsafe = unsafe2;
                i13 = i32;
                s5Var = s5Var2;
                i14 = i33;
                i15 = i35;
                i16 = i50;
                i17 = 1048575;
            }
        }
        if (i16 != i17) {
            obj2 = obj;
            unsafe.putInt(obj2, i16, i36);
        } else {
            obj2 = obj;
        }
        t8 t8Var = null;
        for (int i51 = s5Var.checkInitializedCount; i51 < s5Var.repeatedFieldOffsetStart; i51++) {
            t8Var = (t8) filterMapUnknownEnumValues(obj, s5Var.intArray[i51], t8Var, s5Var.unknownFieldSchema, obj);
        }
        if (t8Var != null) {
            s5Var.unknownFieldSchema.setBuilderToMessage(obj2, t8Var);
        }
        if (i13 == 0) {
            if (i14 != i11) {
                throw h4.parseFailure();
            }
        } else if (i14 > i11 || i15 != i13) {
            throw h4.parseFailure();
        }
        return i14;
    }

    @Override // com.google.protobuf.z6
    public void writeTo(Object obj, ba baVar) throws IOException {
        f1 f1Var = (f1) baVar;
        if (f1Var.fieldOrder() == aa.DESCENDING) {
            writeFieldsInDescendingOrder(obj, f1Var);
        } else if (this.proto3) {
            writeFieldsInAscendingOrderProto3(obj, f1Var);
        } else {
            writeFieldsInAscendingOrderProto2(obj, f1Var);
        }
    }

    private boolean isFieldPresent(Object obj, int i10) {
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10);
        long j3 = 1048575 & presenceMaskAndOffsetAt;
        if (j3 != 1048575) {
            return (d9.getInt(obj, j3) & (1 << (presenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int typeAndOffsetAt = typeAndOffsetAt(i10);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(d9.getDouble(obj, offset)) != 0;
            case 1:
                return Float.floatToRawIntBits(d9.getFloat(obj, offset)) != 0;
            case 2:
                return d9.getLong(obj, offset) != 0;
            case 3:
                return d9.getLong(obj, offset) != 0;
            case 4:
                return d9.getInt(obj, offset) != 0;
            case 5:
                return d9.getLong(obj, offset) != 0;
            case 6:
                return d9.getInt(obj, offset) != 0;
            case 7:
                return d9.getBoolean(obj, offset);
            case 8:
                Object object = d9.getObject(obj, offset);
                if (object instanceof String) {
                    return !((String) object).isEmpty();
                }
                if (object instanceof h0) {
                    return !h0.EMPTY.equals(object);
                }
                throw new IllegalArgumentException();
            case 9:
                return d9.getObject(obj, offset) != null;
            case 10:
                return !h0.EMPTY.equals(d9.getObject(obj, offset));
            case 11:
                return d9.getInt(obj, offset) != 0;
            case 12:
                return d9.getInt(obj, offset) != 0;
            case 13:
                return d9.getInt(obj, offset) != 0;
            case 14:
                return d9.getLong(obj, offset) != 0;
            case 15:
                return d9.getInt(obj, offset) != 0;
            case 16:
                return d9.getLong(obj, offset) != 0;
            case 17:
                return d9.getObject(obj, offset) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private int positionForFieldNumber(int i10, int i11) {
        if (i10 < this.minFieldNumber || i10 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i10, i11);
    }

    @Override // com.google.protobuf.z6
    public void mergeFrom(Object obj, t6 t6Var, a2 a2Var) throws IOException {
        a2Var.getClass();
        checkMutable(obj);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, obj, t6Var, a2Var);
    }

    private boolean equals(Object obj, Object obj2, int i10) {
        int typeAndOffsetAt = typeAndOffsetAt(i10);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                return arePresentForEquals(obj, obj2, i10) && Double.doubleToLongBits(d9.getDouble(obj, offset)) == Double.doubleToLongBits(d9.getDouble(obj2, offset));
            case 1:
                return arePresentForEquals(obj, obj2, i10) && Float.floatToIntBits(d9.getFloat(obj, offset)) == Float.floatToIntBits(d9.getFloat(obj2, offset));
            case 2:
                return arePresentForEquals(obj, obj2, i10) && d9.getLong(obj, offset) == d9.getLong(obj2, offset);
            case 3:
                return arePresentForEquals(obj, obj2, i10) && d9.getLong(obj, offset) == d9.getLong(obj2, offset);
            case 4:
                return arePresentForEquals(obj, obj2, i10) && d9.getInt(obj, offset) == d9.getInt(obj2, offset);
            case 5:
                return arePresentForEquals(obj, obj2, i10) && d9.getLong(obj, offset) == d9.getLong(obj2, offset);
            case 6:
                return arePresentForEquals(obj, obj2, i10) && d9.getInt(obj, offset) == d9.getInt(obj2, offset);
            case 7:
                return arePresentForEquals(obj, obj2, i10) && d9.getBoolean(obj, offset) == d9.getBoolean(obj2, offset);
            case 8:
                return arePresentForEquals(obj, obj2, i10) && b7.safeEquals(d9.getObject(obj, offset), d9.getObject(obj2, offset));
            case 9:
                return arePresentForEquals(obj, obj2, i10) && b7.safeEquals(d9.getObject(obj, offset), d9.getObject(obj2, offset));
            case 10:
                return arePresentForEquals(obj, obj2, i10) && b7.safeEquals(d9.getObject(obj, offset), d9.getObject(obj2, offset));
            case 11:
                return arePresentForEquals(obj, obj2, i10) && d9.getInt(obj, offset) == d9.getInt(obj2, offset);
            case 12:
                return arePresentForEquals(obj, obj2, i10) && d9.getInt(obj, offset) == d9.getInt(obj2, offset);
            case 13:
                return arePresentForEquals(obj, obj2, i10) && d9.getInt(obj, offset) == d9.getInt(obj2, offset);
            case 14:
                return arePresentForEquals(obj, obj2, i10) && d9.getLong(obj, offset) == d9.getLong(obj2, offset);
            case 15:
                return arePresentForEquals(obj, obj2, i10) && d9.getInt(obj, offset) == d9.getInt(obj2, offset);
            case 16:
                return arePresentForEquals(obj, obj2, i10) && d9.getLong(obj, offset) == d9.getLong(obj2, offset);
            case 17:
                return arePresentForEquals(obj, obj2, i10) && b7.safeEquals(d9.getObject(obj, offset), d9.getObject(obj2, offset));
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
            case NOTIFICATION_REDIRECT_VALUE:
            case 30:
            case TEMPLATE_HTML_SIZE_VALUE:
            case 32:
            case 33:
            case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
            case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
            case 36:
            case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
            case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
            case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
            case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
            case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
            case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
            case 48:
            case 49:
                return b7.safeEquals(d9.getObject(obj, offset), d9.getObject(obj2, offset));
            case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                return b7.safeEquals(d9.getObject(obj, offset), d9.getObject(obj2, offset));
            case ONEOF_TYPE_OFFSET /* 51 */:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return isOneofCaseEqual(obj, obj2, i10) && b7.safeEquals(d9.getObject(obj, offset), d9.getObject(obj2, offset));
            default:
                return true;
        }
    }

    @Override // com.google.protobuf.z6
    public void mergeFrom(Object obj, byte[] bArr, int i10, int i11, n nVar) throws IOException {
        if (this.proto3) {
            parseProto3Message(obj, bArr, i10, i11, nVar);
        } else {
            parseProto2Message(obj, bArr, i10, i11, 0, nVar);
        }
    }

    private static boolean isInitialized(Object obj, int i10, z6 z6Var) {
        return z6Var.isInitialized(d9.getObject(obj, offset(i10)));
    }
}
