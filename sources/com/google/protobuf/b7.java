package com.google.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class b7 {
    private static final int DEFAULT_LOOK_UP_START_NUMBER = 40;
    private static final Class<?> GENERATED_MESSAGE_CLASS = getGeneratedMessageClass();
    private static final s8 PROTO2_UNKNOWN_FIELD_SET_SCHEMA = getUnknownFieldSetSchema(false);
    private static final s8 PROTO3_UNKNOWN_FIELD_SET_SCHEMA = getUnknownFieldSetSchema(true);
    private static final s8 UNKNOWN_FIELD_SET_LITE_SCHEMA = new u8();

    private b7() {
    }

    public static int computeSizeBoolList(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z10) {
            return d1.computeLengthDelimitedFieldSize(size) + d1.computeTagSize(i10);
        }
        return d1.computeBoolSize(i10, true) * size;
    }

    public static int computeSizeBoolListNoTag(List<?> list) {
        return list.size();
    }

    public static int computeSizeByteStringList(int i10, List<h0> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = d1.computeTagSize(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            computeTagSize += d1.computeBytesSizeNoTag(list.get(i11));
        }
        return computeTagSize;
    }

    public static int computeSizeEnumList(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeEnumListNoTag = computeSizeEnumListNoTag(list);
        if (z10) {
            return d1.computeLengthDelimitedFieldSize(computeSizeEnumListNoTag) + d1.computeTagSize(i10);
        }
        return (d1.computeTagSize(i10) * size) + computeSizeEnumListNoTag;
    }

    public static int computeSizeEnumListNoTag(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof v3) {
            v3 v3Var = (v3) list;
            i10 = 0;
            while (i11 < size) {
                i10 += d1.computeEnumSizeNoTag(v3Var.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += d1.computeEnumSizeNoTag(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int computeSizeFixed32List(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z10) {
            return d1.computeLengthDelimitedFieldSize(size * 4) + d1.computeTagSize(i10);
        }
        return d1.computeFixed32Size(i10, 0) * size;
    }

    public static int computeSizeFixed32ListNoTag(List<?> list) {
        return list.size() * 4;
    }

    public static int computeSizeFixed64List(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z10) {
            return d1.computeLengthDelimitedFieldSize(size * 8) + d1.computeTagSize(i10);
        }
        return d1.computeFixed64Size(i10, 0L) * size;
    }

    public static int computeSizeFixed64ListNoTag(List<?> list) {
        return list.size() * 8;
    }

    public static int computeSizeGroupList(int i10, List<o5> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += d1.computeGroupSize(i10, list.get(i12));
        }
        return i11;
    }

    public static int computeSizeInt32List(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeInt32ListNoTag = computeSizeInt32ListNoTag(list);
        if (z10) {
            return d1.computeLengthDelimitedFieldSize(computeSizeInt32ListNoTag) + d1.computeTagSize(i10);
        }
        return (d1.computeTagSize(i10) * size) + computeSizeInt32ListNoTag;
    }

    public static int computeSizeInt32ListNoTag(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof v3) {
            v3 v3Var = (v3) list;
            i10 = 0;
            while (i11 < size) {
                i10 += d1.computeInt32SizeNoTag(v3Var.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += d1.computeInt32SizeNoTag(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int computeSizeInt64List(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int computeSizeInt64ListNoTag = computeSizeInt64ListNoTag(list);
        if (z10) {
            return d1.computeLengthDelimitedFieldSize(computeSizeInt64ListNoTag) + d1.computeTagSize(i10);
        }
        return (d1.computeTagSize(i10) * list.size()) + computeSizeInt64ListNoTag;
    }

    public static int computeSizeInt64ListNoTag(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof a5) {
            a5 a5Var = (a5) list;
            i10 = 0;
            while (i11 < size) {
                i10 += d1.computeInt64SizeNoTag(a5Var.getLong(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += d1.computeInt64SizeNoTag(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int computeSizeMessage(int i10, Object obj, z6 z6Var) {
        if (obj instanceof o4) {
            return d1.computeLazyFieldSize(i10, (o4) obj);
        }
        return d1.computeMessageSize(i10, (o5) obj, z6Var);
    }

    public static int computeSizeMessageList(int i10, List<?> list) {
        int computeMessageSizeNoTag;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = d1.computeTagSize(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof o4) {
                computeMessageSizeNoTag = d1.computeLazyFieldSizeNoTag((o4) obj);
            } else {
                computeMessageSizeNoTag = d1.computeMessageSizeNoTag((o5) obj);
            }
            computeTagSize = computeMessageSizeNoTag + computeTagSize;
        }
        return computeTagSize;
    }

    public static int computeSizeSInt32List(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeSInt32ListNoTag = computeSizeSInt32ListNoTag(list);
        if (z10) {
            return d1.computeLengthDelimitedFieldSize(computeSizeSInt32ListNoTag) + d1.computeTagSize(i10);
        }
        return (d1.computeTagSize(i10) * size) + computeSizeSInt32ListNoTag;
    }

    public static int computeSizeSInt32ListNoTag(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof v3) {
            v3 v3Var = (v3) list;
            i10 = 0;
            while (i11 < size) {
                i10 += d1.computeSInt32SizeNoTag(v3Var.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += d1.computeSInt32SizeNoTag(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int computeSizeSInt64List(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeSInt64ListNoTag = computeSizeSInt64ListNoTag(list);
        if (z10) {
            return d1.computeLengthDelimitedFieldSize(computeSizeSInt64ListNoTag) + d1.computeTagSize(i10);
        }
        return (d1.computeTagSize(i10) * size) + computeSizeSInt64ListNoTag;
    }

    public static int computeSizeSInt64ListNoTag(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof a5) {
            a5 a5Var = (a5) list;
            i10 = 0;
            while (i11 < size) {
                i10 += d1.computeSInt64SizeNoTag(a5Var.getLong(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += d1.computeSInt64SizeNoTag(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int computeSizeStringList(int i10, List<?> list) {
        int computeStringSizeNoTag;
        int computeStringSizeNoTag2;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int computeTagSize = d1.computeTagSize(i10) * size;
        if (list instanceof s4) {
            s4 s4Var = (s4) list;
            while (i11 < size) {
                Object raw = s4Var.getRaw(i11);
                if (raw instanceof h0) {
                    computeStringSizeNoTag2 = d1.computeBytesSizeNoTag((h0) raw);
                } else {
                    computeStringSizeNoTag2 = d1.computeStringSizeNoTag((String) raw);
                }
                computeTagSize = computeStringSizeNoTag2 + computeTagSize;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof h0) {
                    computeStringSizeNoTag = d1.computeBytesSizeNoTag((h0) obj);
                } else {
                    computeStringSizeNoTag = d1.computeStringSizeNoTag((String) obj);
                }
                computeTagSize = computeStringSizeNoTag + computeTagSize;
                i11++;
            }
        }
        return computeTagSize;
    }

    public static int computeSizeUInt32List(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeUInt32ListNoTag = computeSizeUInt32ListNoTag(list);
        if (z10) {
            return d1.computeLengthDelimitedFieldSize(computeSizeUInt32ListNoTag) + d1.computeTagSize(i10);
        }
        return (d1.computeTagSize(i10) * size) + computeSizeUInt32ListNoTag;
    }

    public static int computeSizeUInt32ListNoTag(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof v3) {
            v3 v3Var = (v3) list;
            i10 = 0;
            while (i11 < size) {
                i10 += d1.computeUInt32SizeNoTag(v3Var.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += d1.computeUInt32SizeNoTag(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int computeSizeUInt64List(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeUInt64ListNoTag = computeSizeUInt64ListNoTag(list);
        if (z10) {
            return d1.computeLengthDelimitedFieldSize(computeSizeUInt64ListNoTag) + d1.computeTagSize(i10);
        }
        return (d1.computeTagSize(i10) * size) + computeSizeUInt64ListNoTag;
    }

    public static int computeSizeUInt64ListNoTag(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof a5) {
            a5 a5Var = (a5) list;
            i10 = 0;
            while (i11 < size) {
                i10 += d1.computeUInt64SizeNoTag(a5Var.getLong(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += d1.computeUInt64SizeNoTag(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i10, List<Integer> list, z3 z3Var, UB ub2, s8 s8Var) {
        if (z3Var == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (z3Var.findValueByNumber(intValue) != null) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) storeUnknownEnum(obj, i10, intValue, ub2, s8Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (z3Var.findValueByNumber(intValue2) == null) {
                    ub2 = (UB) storeUnknownEnum(obj, i10, intValue2, ub2, s8Var);
                    it.remove();
                }
            }
        }
        return ub2;
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
                return d9.getStaticObject(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + str + " in " + cls.getName());
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    private static s8 getUnknownFieldSetSchema(boolean z10) {
        try {
            Class<?> unknownFieldSetSchemaClass = getUnknownFieldSetSchemaClass();
            if (unknownFieldSetSchemaClass == null) {
                return null;
            }
            return (s8) unknownFieldSetSchemaClass.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
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

    public static <T, FT extends w2> void mergeExtensions(b2 b2Var, T t5, T t10) {
        x2 extensions = b2Var.getExtensions(t10);
        if (!extensions.isEmpty()) {
            b2Var.getMutableExtensions(t5).mergeFrom(extensions);
        }
    }

    public static <T> void mergeMap(i5 i5Var, T t5, T t10, long j3) {
        d9.putObject(t5, j3, ((j5) i5Var).mergeFrom(d9.getObject(t5, j3), d9.getObject(t10, j3)));
    }

    public static <T, UT, UB> void mergeUnknownFields(s8 s8Var, T t5, T t10) {
        s8Var.setToMessage(t5, s8Var.merge(s8Var.getFromMessage(t5), s8Var.getFromMessage(t10)));
    }

    public static s8 proto2UnknownFieldSetSchema() {
        return PROTO2_UNKNOWN_FIELD_SET_SCHEMA;
    }

    public static s8 proto3UnknownFieldSetSchema() {
        return PROTO3_UNKNOWN_FIELD_SET_SCHEMA;
    }

    public static void requireGeneratedMessage(Class<?> cls) {
        Class<?> cls2;
        if (!o3.class.isAssignableFrom(cls) && (cls2 = GENERATED_MESSAGE_CLASS) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    public static boolean safeEquals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean shouldUseTableSwitch(int i10, int i11, int i12) {
        if (i11 < 40) {
            return true;
        }
        long j3 = (i11 - i10) + 1;
        long j10 = i12;
        return j3 + 9 <= ((j10 + 3) * 3) + ((2 * j10) + 3);
    }

    public static <UT, UB> UB storeUnknownEnum(Object obj, int i10, int i11, UB ub2, s8 s8Var) {
        if (ub2 == null) {
            ub2 = (UB) s8Var.getBuilderFromMessage(obj);
        }
        s8Var.addVarint(ub2, i10, i11);
        return ub2;
    }

    public static String toCamelCase(String str, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if ('a' <= charAt && charAt <= 'z') {
                if (z10) {
                    sb2.append((char) (charAt - ' '));
                } else {
                    sb2.append(charAt);
                }
            } else if ('A' <= charAt && charAt <= 'Z') {
                if (i10 == 0 && !z10) {
                    sb2.append((char) (charAt + ' '));
                } else {
                    sb2.append(charAt);
                }
            } else {
                if ('0' <= charAt && charAt <= '9') {
                    sb2.append(charAt);
                }
                z10 = true;
            }
            z10 = false;
        }
        return sb2.toString();
    }

    public static s8 unknownFieldSetLiteSchema() {
        return UNKNOWN_FIELD_SET_LITE_SCHEMA;
    }

    public static void writeBool(int i10, boolean z10, ba baVar) throws IOException {
        if (z10) {
            ((f1) baVar).writeBool(i10, true);
        }
    }

    public static void writeBoolList(int i10, List<Boolean> list, ba baVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((f1) baVar).writeBoolList(i10, list, z10);
        }
    }

    public static void writeBytes(int i10, h0 h0Var, ba baVar) throws IOException {
        if (h0Var != null && !h0Var.isEmpty()) {
            ((f1) baVar).writeBytes(i10, h0Var);
        }
    }

    public static void writeBytesList(int i10, List<h0> list, ba baVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((f1) baVar).writeBytesList(i10, list);
        }
    }

    public static void writeDouble(int i10, double d10, ba baVar) throws IOException {
        if (Double.doubleToRawLongBits(d10) != 0) {
            ((f1) baVar).writeDouble(i10, d10);
        }
    }

    public static void writeDoubleList(int i10, List<Double> list, ba baVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((f1) baVar).writeDoubleList(i10, list, z10);
        }
    }

    public static void writeEnum(int i10, int i11, ba baVar) throws IOException {
        if (i11 != 0) {
            ((f1) baVar).writeEnum(i10, i11);
        }
    }

    public static void writeEnumList(int i10, List<Integer> list, ba baVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((f1) baVar).writeEnumList(i10, list, z10);
        }
    }

    public static void writeFixed32(int i10, int i11, ba baVar) throws IOException {
        if (i11 != 0) {
            ((f1) baVar).writeFixed32(i10, i11);
        }
    }

    public static void writeFixed32List(int i10, List<Integer> list, ba baVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((f1) baVar).writeFixed32List(i10, list, z10);
        }
    }

    public static void writeFixed64(int i10, long j3, ba baVar) throws IOException {
        if (j3 != 0) {
            ((f1) baVar).writeFixed64(i10, j3);
        }
    }

    public static void writeFixed64List(int i10, List<Long> list, ba baVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((f1) baVar).writeFixed64List(i10, list, z10);
        }
    }

    public static void writeFloat(int i10, float f10, ba baVar) throws IOException {
        if (Float.floatToRawIntBits(f10) != 0) {
            ((f1) baVar).writeFloat(i10, f10);
        }
    }

    public static void writeFloatList(int i10, List<Float> list, ba baVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((f1) baVar).writeFloatList(i10, list, z10);
        }
    }

    public static void writeGroupList(int i10, List<?> list, ba baVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((f1) baVar).writeGroupList(i10, list);
    }

    public static void writeInt32(int i10, int i11, ba baVar) throws IOException {
        if (i11 != 0) {
            ((f1) baVar).writeInt32(i10, i11);
        }
    }

    public static void writeInt32List(int i10, List<Integer> list, ba baVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((f1) baVar).writeInt32List(i10, list, z10);
        }
    }

    public static void writeInt64(int i10, long j3, ba baVar) throws IOException {
        if (j3 != 0) {
            ((f1) baVar).writeInt64(i10, j3);
        }
    }

    public static void writeInt64List(int i10, List<Long> list, ba baVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((f1) baVar).writeInt64List(i10, list, z10);
        }
    }

    public static void writeLazyFieldList(int i10, List<?> list, ba baVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                ((o4) it.next()).writeTo(baVar, i10);
            }
        }
    }

    public static void writeMessage(int i10, Object obj, ba baVar) throws IOException {
        if (obj != null) {
            ((f1) baVar).writeMessage(i10, obj);
        }
    }

    public static void writeMessageList(int i10, List<?> list, ba baVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((f1) baVar).writeMessageList(i10, list);
    }

    public static void writeSFixed32(int i10, int i11, ba baVar) throws IOException {
        if (i11 != 0) {
            ((f1) baVar).writeSFixed32(i10, i11);
        }
    }

    public static void writeSFixed32List(int i10, List<Integer> list, ba baVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((f1) baVar).writeSFixed32List(i10, list, z10);
        }
    }

    public static void writeSFixed64(int i10, long j3, ba baVar) throws IOException {
        if (j3 != 0) {
            ((f1) baVar).writeSFixed64(i10, j3);
        }
    }

    public static void writeSFixed64List(int i10, List<Long> list, ba baVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((f1) baVar).writeSFixed64List(i10, list, z10);
        }
    }

    public static void writeSInt32(int i10, int i11, ba baVar) throws IOException {
        if (i11 != 0) {
            ((f1) baVar).writeSInt32(i10, i11);
        }
    }

    public static void writeSInt32List(int i10, List<Integer> list, ba baVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((f1) baVar).writeSInt32List(i10, list, z10);
        }
    }

    public static void writeSInt64(int i10, long j3, ba baVar) throws IOException {
        if (j3 != 0) {
            ((f1) baVar).writeSInt64(i10, j3);
        }
    }

    public static void writeSInt64List(int i10, List<Long> list, ba baVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((f1) baVar).writeSInt64List(i10, list, z10);
        }
    }

    public static void writeString(int i10, Object obj, ba baVar) throws IOException {
        if (obj instanceof String) {
            writeStringInternal(i10, (String) obj, baVar);
        } else {
            writeBytes(i10, (h0) obj, baVar);
        }
    }

    private static void writeStringInternal(int i10, String str, ba baVar) throws IOException {
        if (str != null && !str.isEmpty()) {
            ((f1) baVar).writeString(i10, str);
        }
    }

    public static void writeStringList(int i10, List<String> list, ba baVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((f1) baVar).writeStringList(i10, list);
        }
    }

    public static void writeUInt32(int i10, int i11, ba baVar) throws IOException {
        if (i11 != 0) {
            ((f1) baVar).writeUInt32(i10, i11);
        }
    }

    public static void writeUInt32List(int i10, List<Integer> list, ba baVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((f1) baVar).writeUInt32List(i10, list, z10);
        }
    }

    public static void writeUInt64(int i10, long j3, ba baVar) throws IOException {
        if (j3 != 0) {
            ((f1) baVar).writeUInt64(i10, j3);
        }
    }

    public static void writeUInt64List(int i10, List<Long> list, ba baVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            ((f1) baVar).writeUInt64List(i10, list, z10);
        }
    }

    public static boolean shouldUseTableSwitch(p2[] p2VarArr) {
        if (p2VarArr.length == 0) {
            return false;
        }
        return shouldUseTableSwitch(p2VarArr[0].getFieldNumber(), p2VarArr[p2VarArr.length - 1].getFieldNumber(), p2VarArr.length);
    }

    public static int computeSizeGroupList(int i10, List<o5> list, z6 z6Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += d1.computeGroupSize(i10, list.get(i12), z6Var);
        }
        return i11;
    }

    public static void writeGroupList(int i10, List<?> list, ba baVar, z6 z6Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((f1) baVar).writeGroupList(i10, list, z6Var);
    }

    public static void writeMessageList(int i10, List<?> list, ba baVar, z6 z6Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((f1) baVar).writeMessageList(i10, list, z6Var);
    }

    public static int computeSizeMessageList(int i10, List<?> list, z6 z6Var) {
        int computeMessageSizeNoTag;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = d1.computeTagSize(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof o4) {
                computeMessageSizeNoTag = d1.computeLazyFieldSizeNoTag((o4) obj);
            } else {
                computeMessageSizeNoTag = d1.computeMessageSizeNoTag((o5) obj, z6Var);
            }
            computeTagSize = computeMessageSizeNoTag + computeTagSize;
        }
        return computeTagSize;
    }

    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i10, List<Integer> list, a4 a4Var, UB ub2, s8 s8Var) {
        if (a4Var == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (a4Var.isInRange(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) storeUnknownEnum(obj, i10, intValue, ub2, s8Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!a4Var.isInRange(intValue2)) {
                    ub2 = (UB) storeUnknownEnum(obj, i10, intValue2, ub2, s8Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }
}
