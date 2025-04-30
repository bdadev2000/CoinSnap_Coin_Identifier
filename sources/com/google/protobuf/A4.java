package com.google.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class A4 {
    private static final int DEFAULT_LOOK_UP_START_NUMBER = 40;
    private static final Class<?> GENERATED_MESSAGE_CLASS = getGeneratedMessageClass();
    private static final AbstractC1990r5 PROTO2_UNKNOWN_FIELD_SET_SCHEMA = getUnknownFieldSetSchema(false);
    private static final AbstractC1990r5 PROTO3_UNKNOWN_FIELD_SET_SCHEMA = getUnknownFieldSetSchema(true);
    private static final AbstractC1990r5 UNKNOWN_FIELD_SET_LITE_SCHEMA = new C2004t5();

    private A4() {
    }

    public static int computeSizeBoolList(int i9, List<?> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z8) {
            return AbstractC1895e0.computeLengthDelimitedFieldSize(size) + AbstractC1895e0.computeTagSize(i9);
        }
        return AbstractC1895e0.computeBoolSize(i9, true) * size;
    }

    public static int computeSizeBoolListNoTag(List<?> list) {
        return list.size();
    }

    public static int computeSizeByteStringList(int i9, List<H> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = AbstractC1895e0.computeTagSize(i9) * size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            computeTagSize += AbstractC1895e0.computeBytesSizeNoTag(list.get(i10));
        }
        return computeTagSize;
    }

    public static int computeSizeEnumList(int i9, List<Integer> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeEnumListNoTag = computeSizeEnumListNoTag(list);
        if (z8) {
            return AbstractC1895e0.computeLengthDelimitedFieldSize(computeSizeEnumListNoTag) + AbstractC1895e0.computeTagSize(i9);
        }
        return (AbstractC1895e0.computeTagSize(i9) * size) + computeSizeEnumListNoTag;
    }

    public static int computeSizeEnumListNoTag(List<Integer> list) {
        int i9;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof S2) {
            S2 s22 = (S2) list;
            i9 = 0;
            while (i10 < size) {
                i9 += AbstractC1895e0.computeEnumSizeNoTag(s22.getInt(i10));
                i10++;
            }
        } else {
            i9 = 0;
            while (i10 < size) {
                i9 += AbstractC1895e0.computeEnumSizeNoTag(list.get(i10).intValue());
                i10++;
            }
        }
        return i9;
    }

    public static int computeSizeFixed32List(int i9, List<?> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z8) {
            return AbstractC1895e0.computeLengthDelimitedFieldSize(size * 4) + AbstractC1895e0.computeTagSize(i9);
        }
        return AbstractC1895e0.computeFixed32Size(i9, 0) * size;
    }

    public static int computeSizeFixed32ListNoTag(List<?> list) {
        return list.size() * 4;
    }

    public static int computeSizeFixed64List(int i9, List<?> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z8) {
            return AbstractC1895e0.computeLengthDelimitedFieldSize(size * 8) + AbstractC1895e0.computeTagSize(i9);
        }
        return AbstractC1895e0.computeFixed64Size(i9, 0L) * size;
    }

    public static int computeSizeFixed64ListNoTag(List<?> list) {
        return list.size() * 8;
    }

    public static int computeSizeGroupList(int i9, List<N3> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += AbstractC1895e0.computeGroupSize(i9, list.get(i11));
        }
        return i10;
    }

    public static int computeSizeInt32List(int i9, List<Integer> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeInt32ListNoTag = computeSizeInt32ListNoTag(list);
        if (z8) {
            return AbstractC1895e0.computeLengthDelimitedFieldSize(computeSizeInt32ListNoTag) + AbstractC1895e0.computeTagSize(i9);
        }
        return (AbstractC1895e0.computeTagSize(i9) * size) + computeSizeInt32ListNoTag;
    }

    public static int computeSizeInt32ListNoTag(List<Integer> list) {
        int i9;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof S2) {
            S2 s22 = (S2) list;
            i9 = 0;
            while (i10 < size) {
                i9 += AbstractC1895e0.computeInt32SizeNoTag(s22.getInt(i10));
                i10++;
            }
        } else {
            i9 = 0;
            while (i10 < size) {
                i9 += AbstractC1895e0.computeInt32SizeNoTag(list.get(i10).intValue());
                i10++;
            }
        }
        return i9;
    }

    public static int computeSizeInt64List(int i9, List<Long> list, boolean z8) {
        if (list.size() == 0) {
            return 0;
        }
        int computeSizeInt64ListNoTag = computeSizeInt64ListNoTag(list);
        if (z8) {
            return AbstractC1895e0.computeLengthDelimitedFieldSize(computeSizeInt64ListNoTag) + AbstractC1895e0.computeTagSize(i9);
        }
        return (AbstractC1895e0.computeTagSize(i9) * list.size()) + computeSizeInt64ListNoTag;
    }

    public static int computeSizeInt64ListNoTag(List<Long> list) {
        int i9;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2044z3) {
            C2044z3 c2044z3 = (C2044z3) list;
            i9 = 0;
            while (i10 < size) {
                i9 += AbstractC1895e0.computeInt64SizeNoTag(c2044z3.getLong(i10));
                i10++;
            }
        } else {
            i9 = 0;
            while (i10 < size) {
                i9 += AbstractC1895e0.computeInt64SizeNoTag(list.get(i10).longValue());
                i10++;
            }
        }
        return i9;
    }

    public static int computeSizeMessage(int i9, Object obj, InterfaceC2038y4 interfaceC2038y4) {
        if (obj instanceof C1961n3) {
            return AbstractC1895e0.computeLazyFieldSize(i9, (C1961n3) obj);
        }
        return AbstractC1895e0.computeMessageSize(i9, (N3) obj, interfaceC2038y4);
    }

    public static int computeSizeMessageList(int i9, List<?> list) {
        int computeMessageSizeNoTag;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = AbstractC1895e0.computeTagSize(i9) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj instanceof C1961n3) {
                computeMessageSizeNoTag = AbstractC1895e0.computeLazyFieldSizeNoTag((C1961n3) obj);
            } else {
                computeMessageSizeNoTag = AbstractC1895e0.computeMessageSizeNoTag((N3) obj);
            }
            computeTagSize = computeMessageSizeNoTag + computeTagSize;
        }
        return computeTagSize;
    }

    public static int computeSizeSInt32List(int i9, List<Integer> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeSInt32ListNoTag = computeSizeSInt32ListNoTag(list);
        if (z8) {
            return AbstractC1895e0.computeLengthDelimitedFieldSize(computeSizeSInt32ListNoTag) + AbstractC1895e0.computeTagSize(i9);
        }
        return (AbstractC1895e0.computeTagSize(i9) * size) + computeSizeSInt32ListNoTag;
    }

    public static int computeSizeSInt32ListNoTag(List<Integer> list) {
        int i9;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof S2) {
            S2 s22 = (S2) list;
            i9 = 0;
            while (i10 < size) {
                i9 += AbstractC1895e0.computeSInt32SizeNoTag(s22.getInt(i10));
                i10++;
            }
        } else {
            i9 = 0;
            while (i10 < size) {
                i9 += AbstractC1895e0.computeSInt32SizeNoTag(list.get(i10).intValue());
                i10++;
            }
        }
        return i9;
    }

    public static int computeSizeSInt64List(int i9, List<Long> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeSInt64ListNoTag = computeSizeSInt64ListNoTag(list);
        if (z8) {
            return AbstractC1895e0.computeLengthDelimitedFieldSize(computeSizeSInt64ListNoTag) + AbstractC1895e0.computeTagSize(i9);
        }
        return (AbstractC1895e0.computeTagSize(i9) * size) + computeSizeSInt64ListNoTag;
    }

    public static int computeSizeSInt64ListNoTag(List<Long> list) {
        int i9;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2044z3) {
            C2044z3 c2044z3 = (C2044z3) list;
            i9 = 0;
            while (i10 < size) {
                i9 += AbstractC1895e0.computeSInt64SizeNoTag(c2044z3.getLong(i10));
                i10++;
            }
        } else {
            i9 = 0;
            while (i10 < size) {
                i9 += AbstractC1895e0.computeSInt64SizeNoTag(list.get(i10).longValue());
                i10++;
            }
        }
        return i9;
    }

    public static int computeSizeStringList(int i9, List<?> list) {
        int computeStringSizeNoTag;
        int computeStringSizeNoTag2;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int computeTagSize = AbstractC1895e0.computeTagSize(i9) * size;
        if (list instanceof InterfaceC1988r3) {
            InterfaceC1988r3 interfaceC1988r3 = (InterfaceC1988r3) list;
            while (i10 < size) {
                Object raw = interfaceC1988r3.getRaw(i10);
                if (raw instanceof H) {
                    computeStringSizeNoTag2 = AbstractC1895e0.computeBytesSizeNoTag((H) raw);
                } else {
                    computeStringSizeNoTag2 = AbstractC1895e0.computeStringSizeNoTag((String) raw);
                }
                computeTagSize = computeStringSizeNoTag2 + computeTagSize;
                i10++;
            }
        } else {
            while (i10 < size) {
                Object obj = list.get(i10);
                if (obj instanceof H) {
                    computeStringSizeNoTag = AbstractC1895e0.computeBytesSizeNoTag((H) obj);
                } else {
                    computeStringSizeNoTag = AbstractC1895e0.computeStringSizeNoTag((String) obj);
                }
                computeTagSize = computeStringSizeNoTag + computeTagSize;
                i10++;
            }
        }
        return computeTagSize;
    }

    public static int computeSizeUInt32List(int i9, List<Integer> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeUInt32ListNoTag = computeSizeUInt32ListNoTag(list);
        if (z8) {
            return AbstractC1895e0.computeLengthDelimitedFieldSize(computeSizeUInt32ListNoTag) + AbstractC1895e0.computeTagSize(i9);
        }
        return (AbstractC1895e0.computeTagSize(i9) * size) + computeSizeUInt32ListNoTag;
    }

    public static int computeSizeUInt32ListNoTag(List<Integer> list) {
        int i9;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof S2) {
            S2 s22 = (S2) list;
            i9 = 0;
            while (i10 < size) {
                i9 += AbstractC1895e0.computeUInt32SizeNoTag(s22.getInt(i10));
                i10++;
            }
        } else {
            i9 = 0;
            while (i10 < size) {
                i9 += AbstractC1895e0.computeUInt32SizeNoTag(list.get(i10).intValue());
                i10++;
            }
        }
        return i9;
    }

    public static int computeSizeUInt64List(int i9, List<Long> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeUInt64ListNoTag = computeSizeUInt64ListNoTag(list);
        if (z8) {
            return AbstractC1895e0.computeLengthDelimitedFieldSize(computeSizeUInt64ListNoTag) + AbstractC1895e0.computeTagSize(i9);
        }
        return (AbstractC1895e0.computeTagSize(i9) * size) + computeSizeUInt64ListNoTag;
    }

    public static int computeSizeUInt64ListNoTag(List<Long> list) {
        int i9;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2044z3) {
            C2044z3 c2044z3 = (C2044z3) list;
            i9 = 0;
            while (i10 < size) {
                i9 += AbstractC1895e0.computeUInt64SizeNoTag(c2044z3.getLong(i10));
                i10++;
            }
        } else {
            i9 = 0;
            while (i10 < size) {
                i9 += AbstractC1895e0.computeUInt64SizeNoTag(list.get(i10).longValue());
                i10++;
            }
        }
        return i9;
    }

    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i9, List<Integer> list, W2 w2, UB ub, AbstractC1990r5 abstractC1990r5) {
        if (w2 == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = list.get(i11);
                int intValue = num.intValue();
                if (w2.findValueByNumber(intValue) != null) {
                    if (i11 != i10) {
                        list.set(i10, num);
                    }
                    i10++;
                } else {
                    ub = (UB) storeUnknownEnum(obj, i9, intValue, ub, abstractC1990r5);
                }
            }
            if (i10 != size) {
                list.subList(i10, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (w2.findValueByNumber(intValue2) == null) {
                    ub = (UB) storeUnknownEnum(obj, i9, intValue2, ub, abstractC1990r5);
                    it.remove();
                }
            }
        }
        return ub;
    }

    private static Class<?> getGeneratedMessageClass() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object getMapDefaultEntry(Class<?> cls, String str) {
        try {
            java.lang.reflect.Field[] declaredFields = Class.forName(cls.getName() + "$" + toCamelCase(str, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return C5.getStaticObject(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + str + " in " + cls.getName());
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    private static AbstractC1990r5 getUnknownFieldSetSchema(boolean z8) {
        try {
            Class<?> unknownFieldSetSchemaClass = getUnknownFieldSetSchemaClass();
            if (unknownFieldSetSchemaClass == null) {
                return null;
            }
            return (AbstractC1990r5) unknownFieldSetSchemaClass.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z8));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> getUnknownFieldSetSchemaClass() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T, FT extends InterfaceC1994s2> void mergeExtensions(X1 x12, T t9, T t10) {
        C2001t2 extensions = x12.getExtensions(t10);
        if (!extensions.isEmpty()) {
            x12.getMutableExtensions(t9).mergeFrom(extensions);
        }
    }

    public static <T> void mergeMap(H3 h32, T t9, T t10, long j7) {
        C5.putObject(t9, j7, ((I3) h32).mergeFrom(C5.getObject(t9, j7), C5.getObject(t10, j7)));
    }

    public static <T, UT, UB> void mergeUnknownFields(AbstractC1990r5 abstractC1990r5, T t9, T t10) {
        abstractC1990r5.setToMessage(t9, abstractC1990r5.merge(abstractC1990r5.getFromMessage(t9), abstractC1990r5.getFromMessage(t10)));
    }

    public static AbstractC1990r5 proto2UnknownFieldSetSchema() {
        return PROTO2_UNKNOWN_FIELD_SET_SCHEMA;
    }

    public static AbstractC1990r5 proto3UnknownFieldSetSchema() {
        return PROTO3_UNKNOWN_FIELD_SET_SCHEMA;
    }

    public static void requireGeneratedMessage(Class<?> cls) {
        Class<?> cls2;
        if (!L2.class.isAssignableFrom(cls) && (cls2 = GENERATED_MESSAGE_CLASS) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    public static boolean safeEquals(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static boolean shouldUseTableSwitch(int i9, int i10, int i11) {
        if (i10 < 40) {
            return true;
        }
        long j7 = i10 - i9;
        long j9 = i11;
        return j7 + 10 <= ((j9 + 3) * 3) + ((2 * j9) + 3);
    }

    public static <UT, UB> UB storeUnknownEnum(Object obj, int i9, int i10, UB ub, AbstractC1990r5 abstractC1990r5) {
        if (ub == null) {
            ub = (UB) abstractC1990r5.getBuilderFromMessage(obj);
        }
        abstractC1990r5.addVarint(ub, i9, i10);
        return ub;
    }

    public static String toCamelCase(String str, boolean z8) {
        StringBuilder sb = new StringBuilder();
        for (int i9 = 0; i9 < str.length(); i9++) {
            char charAt = str.charAt(i9);
            if ('a' <= charAt && charAt <= 'z') {
                if (z8) {
                    sb.append((char) (charAt - ' '));
                } else {
                    sb.append(charAt);
                }
            } else if ('A' <= charAt && charAt <= 'Z') {
                if (i9 == 0 && !z8) {
                    sb.append((char) (charAt + ' '));
                } else {
                    sb.append(charAt);
                }
            } else {
                if ('0' <= charAt && charAt <= '9') {
                    sb.append(charAt);
                }
                z8 = true;
            }
            z8 = false;
        }
        return sb.toString();
    }

    public static AbstractC1990r5 unknownFieldSetLiteSchema() {
        return UNKNOWN_FIELD_SET_LITE_SCHEMA;
    }

    public static void writeBool(int i9, boolean z8, a6 a6Var) throws IOException {
        if (z8) {
            ((C1909g0) a6Var).writeBool(i9, true);
        }
    }

    public static void writeBoolList(int i9, List<Boolean> list, a6 a6Var, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((C1909g0) a6Var).writeBoolList(i9, list, z8);
        }
    }

    public static void writeBytes(int i9, H h6, a6 a6Var) throws IOException {
        if (h6 != null && !h6.isEmpty()) {
            ((C1909g0) a6Var).writeBytes(i9, h6);
        }
    }

    public static void writeBytesList(int i9, List<H> list, a6 a6Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((C1909g0) a6Var).writeBytesList(i9, list);
        }
    }

    public static void writeDouble(int i9, double d2, a6 a6Var) throws IOException {
        if (Double.doubleToRawLongBits(d2) != 0) {
            ((C1909g0) a6Var).writeDouble(i9, d2);
        }
    }

    public static void writeDoubleList(int i9, List<Double> list, a6 a6Var, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((C1909g0) a6Var).writeDoubleList(i9, list, z8);
        }
    }

    public static void writeEnum(int i9, int i10, a6 a6Var) throws IOException {
        if (i10 != 0) {
            ((C1909g0) a6Var).writeEnum(i9, i10);
        }
    }

    public static void writeEnumList(int i9, List<Integer> list, a6 a6Var, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((C1909g0) a6Var).writeEnumList(i9, list, z8);
        }
    }

    public static void writeFixed32(int i9, int i10, a6 a6Var) throws IOException {
        if (i10 != 0) {
            ((C1909g0) a6Var).writeFixed32(i9, i10);
        }
    }

    public static void writeFixed32List(int i9, List<Integer> list, a6 a6Var, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((C1909g0) a6Var).writeFixed32List(i9, list, z8);
        }
    }

    public static void writeFixed64(int i9, long j7, a6 a6Var) throws IOException {
        if (j7 != 0) {
            ((C1909g0) a6Var).writeFixed64(i9, j7);
        }
    }

    public static void writeFixed64List(int i9, List<Long> list, a6 a6Var, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((C1909g0) a6Var).writeFixed64List(i9, list, z8);
        }
    }

    public static void writeFloat(int i9, float f9, a6 a6Var) throws IOException {
        if (Float.floatToRawIntBits(f9) != 0) {
            ((C1909g0) a6Var).writeFloat(i9, f9);
        }
    }

    public static void writeFloatList(int i9, List<Float> list, a6 a6Var, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((C1909g0) a6Var).writeFloatList(i9, list, z8);
        }
    }

    public static void writeGroupList(int i9, List<?> list, a6 a6Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C1909g0) a6Var).writeGroupList(i9, list);
    }

    public static void writeInt32(int i9, int i10, a6 a6Var) throws IOException {
        if (i10 != 0) {
            ((C1909g0) a6Var).writeInt32(i9, i10);
        }
    }

    public static void writeInt32List(int i9, List<Integer> list, a6 a6Var, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((C1909g0) a6Var).writeInt32List(i9, list, z8);
        }
    }

    public static void writeInt64(int i9, long j7, a6 a6Var) throws IOException {
        if (j7 != 0) {
            ((C1909g0) a6Var).writeInt64(i9, j7);
        }
    }

    public static void writeInt64List(int i9, List<Long> list, a6 a6Var, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((C1909g0) a6Var).writeInt64List(i9, list, z8);
        }
    }

    public static void writeLazyFieldList(int i9, List<?> list, a6 a6Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                ((C1961n3) it.next()).writeTo(a6Var, i9);
            }
        }
    }

    public static void writeMessage(int i9, Object obj, a6 a6Var) throws IOException {
        if (obj != null) {
            ((C1909g0) a6Var).writeMessage(i9, obj);
        }
    }

    public static void writeMessageList(int i9, List<?> list, a6 a6Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C1909g0) a6Var).writeMessageList(i9, list);
    }

    public static void writeSFixed32(int i9, int i10, a6 a6Var) throws IOException {
        if (i10 != 0) {
            ((C1909g0) a6Var).writeSFixed32(i9, i10);
        }
    }

    public static void writeSFixed32List(int i9, List<Integer> list, a6 a6Var, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((C1909g0) a6Var).writeSFixed32List(i9, list, z8);
        }
    }

    public static void writeSFixed64(int i9, long j7, a6 a6Var) throws IOException {
        if (j7 != 0) {
            ((C1909g0) a6Var).writeSFixed64(i9, j7);
        }
    }

    public static void writeSFixed64List(int i9, List<Long> list, a6 a6Var, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((C1909g0) a6Var).writeSFixed64List(i9, list, z8);
        }
    }

    public static void writeSInt32(int i9, int i10, a6 a6Var) throws IOException {
        if (i10 != 0) {
            ((C1909g0) a6Var).writeSInt32(i9, i10);
        }
    }

    public static void writeSInt32List(int i9, List<Integer> list, a6 a6Var, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((C1909g0) a6Var).writeSInt32List(i9, list, z8);
        }
    }

    public static void writeSInt64(int i9, long j7, a6 a6Var) throws IOException {
        if (j7 != 0) {
            ((C1909g0) a6Var).writeSInt64(i9, j7);
        }
    }

    public static void writeSInt64List(int i9, List<Long> list, a6 a6Var, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((C1909g0) a6Var).writeSInt64List(i9, list, z8);
        }
    }

    public static void writeString(int i9, Object obj, a6 a6Var) throws IOException {
        if (obj instanceof String) {
            writeStringInternal(i9, (String) obj, a6Var);
        } else {
            writeBytes(i9, (H) obj, a6Var);
        }
    }

    private static void writeStringInternal(int i9, String str, a6 a6Var) throws IOException {
        if (str != null && !str.isEmpty()) {
            ((C1909g0) a6Var).writeString(i9, str);
        }
    }

    public static void writeStringList(int i9, List<String> list, a6 a6Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((C1909g0) a6Var).writeStringList(i9, list);
        }
    }

    public static void writeUInt32(int i9, int i10, a6 a6Var) throws IOException {
        if (i10 != 0) {
            ((C1909g0) a6Var).writeUInt32(i9, i10);
        }
    }

    public static void writeUInt32List(int i9, List<Integer> list, a6 a6Var, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((C1909g0) a6Var).writeUInt32List(i9, list, z8);
        }
    }

    public static void writeUInt64(int i9, long j7, a6 a6Var) throws IOException {
        if (j7 != 0) {
            ((C1909g0) a6Var).writeUInt64(i9, j7);
        }
    }

    public static void writeUInt64List(int i9, List<Long> list, a6 a6Var, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((C1909g0) a6Var).writeUInt64List(i9, list, z8);
        }
    }

    public static boolean shouldUseTableSwitch(C1946l2[] c1946l2Arr) {
        if (c1946l2Arr.length == 0) {
            return false;
        }
        return shouldUseTableSwitch(c1946l2Arr[0].getFieldNumber(), c1946l2Arr[c1946l2Arr.length - 1].getFieldNumber(), c1946l2Arr.length);
    }

    public static int computeSizeGroupList(int i9, List<N3> list, InterfaceC2038y4 interfaceC2038y4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += AbstractC1895e0.computeGroupSize(i9, list.get(i11), interfaceC2038y4);
        }
        return i10;
    }

    public static void writeGroupList(int i9, List<?> list, a6 a6Var, InterfaceC2038y4 interfaceC2038y4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C1909g0) a6Var).writeGroupList(i9, list, interfaceC2038y4);
    }

    public static void writeMessageList(int i9, List<?> list, a6 a6Var, InterfaceC2038y4 interfaceC2038y4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C1909g0) a6Var).writeMessageList(i9, list, interfaceC2038y4);
    }

    public static int computeSizeMessageList(int i9, List<?> list, InterfaceC2038y4 interfaceC2038y4) {
        int computeMessageSizeNoTag;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = AbstractC1895e0.computeTagSize(i9) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj instanceof C1961n3) {
                computeMessageSizeNoTag = AbstractC1895e0.computeLazyFieldSizeNoTag((C1961n3) obj);
            } else {
                computeMessageSizeNoTag = AbstractC1895e0.computeMessageSizeNoTag((N3) obj, interfaceC2038y4);
            }
            computeTagSize = computeMessageSizeNoTag + computeTagSize;
        }
        return computeTagSize;
    }

    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i9, List<Integer> list, X2 x22, UB ub, AbstractC1990r5 abstractC1990r5) {
        if (x22 == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = list.get(i11);
                int intValue = num.intValue();
                if (x22.isInRange(intValue)) {
                    if (i11 != i10) {
                        list.set(i10, num);
                    }
                    i10++;
                } else {
                    ub = (UB) storeUnknownEnum(obj, i9, intValue, ub, abstractC1990r5);
                }
            }
            if (i10 != size) {
                list.subList(i10, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!x22.isInRange(intValue2)) {
                    ub = (UB) storeUnknownEnum(obj, i9, intValue2, ub, abstractC1990r5);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
