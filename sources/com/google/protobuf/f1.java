package com.google.protobuf;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class f1 implements ba {
    private final d1 output;

    private f1(d1 d1Var) {
        d1 d1Var2 = (d1) f4.checkNotNull(d1Var, "output");
        this.output = d1Var2;
        d1Var2.wrapper = this;
    }

    public static f1 forCodedOutput(d1 d1Var) {
        f1 f1Var = d1Var.wrapper;
        if (f1Var != null) {
            return f1Var;
        }
        return new f1(d1Var);
    }

    private <V> void writeDeterministicBooleanMapEntry(int i10, boolean z10, V v10, f5 f5Var) throws IOException {
        this.output.writeTag(i10, 2);
        this.output.writeUInt32NoTag(g5.computeSerializedSize(f5Var, Boolean.valueOf(z10), v10));
        g5.writeTo(this.output, f5Var, Boolean.valueOf(z10), v10);
    }

    private <V> void writeDeterministicIntegerMap(int i10, f5 f5Var, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = it.next().intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            V v10 = map.get(Integer.valueOf(i13));
            this.output.writeTag(i10, 2);
            this.output.writeUInt32NoTag(g5.computeSerializedSize(f5Var, Integer.valueOf(i13), v10));
            g5.writeTo(this.output, f5Var, Integer.valueOf(i13), v10);
        }
    }

    private <V> void writeDeterministicLongMap(int i10, f5 f5Var, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = it.next().longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j3 = jArr[i12];
            V v10 = map.get(Long.valueOf(j3));
            this.output.writeTag(i10, 2);
            this.output.writeUInt32NoTag(g5.computeSerializedSize(f5Var, Long.valueOf(j3), v10));
            g5.writeTo(this.output, f5Var, Long.valueOf(j3), v10);
        }
    }

    private <K, V> void writeDeterministicMap(int i10, f5 f5Var, Map<K, V> map) throws IOException {
        switch (e1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[f5Var.keyType.ordinal()]) {
            case 1:
                V v10 = map.get(Boolean.FALSE);
                if (v10 != null) {
                    writeDeterministicBooleanMapEntry(i10, false, v10, f5Var);
                }
                V v11 = map.get(Boolean.TRUE);
                if (v11 != null) {
                    writeDeterministicBooleanMapEntry(i10, true, v11, f5Var);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                writeDeterministicIntegerMap(i10, f5Var, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                writeDeterministicLongMap(i10, f5Var, map);
                return;
            case 12:
                writeDeterministicStringMap(i10, f5Var, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + f5Var.keyType);
        }
    }

    private <V> void writeDeterministicStringMap(int i10, f5 f5Var, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            strArr[i11] = it.next();
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str = strArr[i12];
            V v10 = map.get(str);
            this.output.writeTag(i10, 2);
            this.output.writeUInt32NoTag(g5.computeSerializedSize(f5Var, str, v10));
            g5.writeTo(this.output, f5Var, str, v10);
        }
    }

    private void writeLazyString(int i10, Object obj) throws IOException {
        if (obj instanceof String) {
            this.output.writeString(i10, (String) obj);
        } else {
            this.output.writeBytes(i10, (h0) obj);
        }
    }

    @Override // com.google.protobuf.ba
    public aa fieldOrder() {
        return aa.ASCENDING;
    }

    public int getTotalBytesWritten() {
        return this.output.getTotalBytesWritten();
    }

    @Override // com.google.protobuf.ba
    public void writeBool(int i10, boolean z10) throws IOException {
        this.output.writeBool(i10, z10);
    }

    @Override // com.google.protobuf.ba
    public void writeBoolList(int i10, List<Boolean> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.output.writeTag(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += d1.computeBoolSizeNoTag(list.get(i13).booleanValue());
            }
            this.output.writeUInt32NoTag(i12);
            while (i11 < list.size()) {
                this.output.writeBoolNoTag(list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.output.writeBool(i10, list.get(i11).booleanValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.ba
    public void writeBytes(int i10, h0 h0Var) throws IOException {
        this.output.writeBytes(i10, h0Var);
    }

    @Override // com.google.protobuf.ba
    public void writeBytesList(int i10, List<h0> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.output.writeBytes(i10, list.get(i11));
        }
    }

    @Override // com.google.protobuf.ba
    public void writeDouble(int i10, double d10) throws IOException {
        this.output.writeDouble(i10, d10);
    }

    @Override // com.google.protobuf.ba
    public void writeDoubleList(int i10, List<Double> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.output.writeTag(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += d1.computeDoubleSizeNoTag(list.get(i13).doubleValue());
            }
            this.output.writeUInt32NoTag(i12);
            while (i11 < list.size()) {
                this.output.writeDoubleNoTag(list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.output.writeDouble(i10, list.get(i11).doubleValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.ba
    @Deprecated
    public void writeEndGroup(int i10) throws IOException {
        this.output.writeTag(i10, 4);
    }

    @Override // com.google.protobuf.ba
    public void writeEnum(int i10, int i11) throws IOException {
        this.output.writeEnum(i10, i11);
    }

    @Override // com.google.protobuf.ba
    public void writeEnumList(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.output.writeTag(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += d1.computeEnumSizeNoTag(list.get(i13).intValue());
            }
            this.output.writeUInt32NoTag(i12);
            while (i11 < list.size()) {
                this.output.writeEnumNoTag(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.output.writeEnum(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.ba
    public void writeFixed32(int i10, int i11) throws IOException {
        this.output.writeFixed32(i10, i11);
    }

    @Override // com.google.protobuf.ba
    public void writeFixed32List(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.output.writeTag(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += d1.computeFixed32SizeNoTag(list.get(i13).intValue());
            }
            this.output.writeUInt32NoTag(i12);
            while (i11 < list.size()) {
                this.output.writeFixed32NoTag(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.output.writeFixed32(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.ba
    public void writeFixed64(int i10, long j3) throws IOException {
        this.output.writeFixed64(i10, j3);
    }

    @Override // com.google.protobuf.ba
    public void writeFixed64List(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.output.writeTag(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += d1.computeFixed64SizeNoTag(list.get(i13).longValue());
            }
            this.output.writeUInt32NoTag(i12);
            while (i11 < list.size()) {
                this.output.writeFixed64NoTag(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.output.writeFixed64(i10, list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.ba
    public void writeFloat(int i10, float f10) throws IOException {
        this.output.writeFloat(i10, f10);
    }

    @Override // com.google.protobuf.ba
    public void writeFloatList(int i10, List<Float> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.output.writeTag(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += d1.computeFloatSizeNoTag(list.get(i13).floatValue());
            }
            this.output.writeUInt32NoTag(i12);
            while (i11 < list.size()) {
                this.output.writeFloatNoTag(list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.output.writeFloat(i10, list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.ba
    @Deprecated
    public void writeGroup(int i10, Object obj) throws IOException {
        this.output.writeGroup(i10, (o5) obj);
    }

    @Override // com.google.protobuf.ba
    @Deprecated
    public void writeGroupList(int i10, List<?> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            writeGroup(i10, list.get(i11));
        }
    }

    @Override // com.google.protobuf.ba
    public void writeInt32(int i10, int i11) throws IOException {
        this.output.writeInt32(i10, i11);
    }

    @Override // com.google.protobuf.ba
    public void writeInt32List(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.output.writeTag(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += d1.computeInt32SizeNoTag(list.get(i13).intValue());
            }
            this.output.writeUInt32NoTag(i12);
            while (i11 < list.size()) {
                this.output.writeInt32NoTag(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.output.writeInt32(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.ba
    public void writeInt64(int i10, long j3) throws IOException {
        this.output.writeInt64(i10, j3);
    }

    @Override // com.google.protobuf.ba
    public void writeInt64List(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.output.writeTag(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += d1.computeInt64SizeNoTag(list.get(i13).longValue());
            }
            this.output.writeUInt32NoTag(i12);
            while (i11 < list.size()) {
                this.output.writeInt64NoTag(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.output.writeInt64(i10, list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.ba
    public <K, V> void writeMap(int i10, f5 f5Var, Map<K, V> map) throws IOException {
        if (this.output.isSerializationDeterministic()) {
            writeDeterministicMap(i10, f5Var, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.output.writeTag(i10, 2);
            this.output.writeUInt32NoTag(g5.computeSerializedSize(f5Var, entry.getKey(), entry.getValue()));
            g5.writeTo(this.output, f5Var, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.ba
    public void writeMessage(int i10, Object obj) throws IOException {
        this.output.writeMessage(i10, (o5) obj);
    }

    @Override // com.google.protobuf.ba
    public void writeMessageList(int i10, List<?> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            writeMessage(i10, list.get(i11));
        }
    }

    @Override // com.google.protobuf.ba
    public final void writeMessageSetItem(int i10, Object obj) throws IOException {
        if (obj instanceof h0) {
            this.output.writeRawMessageSetExtension(i10, (h0) obj);
        } else {
            this.output.writeMessageSetExtension(i10, (o5) obj);
        }
    }

    @Override // com.google.protobuf.ba
    public void writeSFixed32(int i10, int i11) throws IOException {
        this.output.writeSFixed32(i10, i11);
    }

    @Override // com.google.protobuf.ba
    public void writeSFixed32List(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.output.writeTag(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += d1.computeSFixed32SizeNoTag(list.get(i13).intValue());
            }
            this.output.writeUInt32NoTag(i12);
            while (i11 < list.size()) {
                this.output.writeSFixed32NoTag(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.output.writeSFixed32(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.ba
    public void writeSFixed64(int i10, long j3) throws IOException {
        this.output.writeSFixed64(i10, j3);
    }

    @Override // com.google.protobuf.ba
    public void writeSFixed64List(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.output.writeTag(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += d1.computeSFixed64SizeNoTag(list.get(i13).longValue());
            }
            this.output.writeUInt32NoTag(i12);
            while (i11 < list.size()) {
                this.output.writeSFixed64NoTag(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.output.writeSFixed64(i10, list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.ba
    public void writeSInt32(int i10, int i11) throws IOException {
        this.output.writeSInt32(i10, i11);
    }

    @Override // com.google.protobuf.ba
    public void writeSInt32List(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.output.writeTag(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += d1.computeSInt32SizeNoTag(list.get(i13).intValue());
            }
            this.output.writeUInt32NoTag(i12);
            while (i11 < list.size()) {
                this.output.writeSInt32NoTag(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.output.writeSInt32(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.ba
    public void writeSInt64(int i10, long j3) throws IOException {
        this.output.writeSInt64(i10, j3);
    }

    @Override // com.google.protobuf.ba
    public void writeSInt64List(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.output.writeTag(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += d1.computeSInt64SizeNoTag(list.get(i13).longValue());
            }
            this.output.writeUInt32NoTag(i12);
            while (i11 < list.size()) {
                this.output.writeSInt64NoTag(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.output.writeSInt64(i10, list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.ba
    @Deprecated
    public void writeStartGroup(int i10) throws IOException {
        this.output.writeTag(i10, 3);
    }

    @Override // com.google.protobuf.ba
    public void writeString(int i10, String str) throws IOException {
        this.output.writeString(i10, str);
    }

    @Override // com.google.protobuf.ba
    public void writeStringList(int i10, List<String> list) throws IOException {
        int i11 = 0;
        if (list instanceof s4) {
            s4 s4Var = (s4) list;
            while (i11 < list.size()) {
                writeLazyString(i10, s4Var.getRaw(i11));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.output.writeString(i10, list.get(i11));
            i11++;
        }
    }

    @Override // com.google.protobuf.ba
    public void writeUInt32(int i10, int i11) throws IOException {
        this.output.writeUInt32(i10, i11);
    }

    @Override // com.google.protobuf.ba
    public void writeUInt32List(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.output.writeTag(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += d1.computeUInt32SizeNoTag(list.get(i13).intValue());
            }
            this.output.writeUInt32NoTag(i12);
            while (i11 < list.size()) {
                this.output.writeUInt32NoTag(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.output.writeUInt32(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.ba
    public void writeUInt64(int i10, long j3) throws IOException {
        this.output.writeUInt64(i10, j3);
    }

    @Override // com.google.protobuf.ba
    public void writeUInt64List(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.output.writeTag(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += d1.computeUInt64SizeNoTag(list.get(i13).longValue());
            }
            this.output.writeUInt32NoTag(i12);
            while (i11 < list.size()) {
                this.output.writeUInt64NoTag(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.output.writeUInt64(i10, list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.ba
    public void writeGroup(int i10, Object obj, z6 z6Var) throws IOException {
        this.output.writeGroup(i10, (o5) obj, z6Var);
    }

    @Override // com.google.protobuf.ba
    public void writeMessage(int i10, Object obj, z6 z6Var) throws IOException {
        this.output.writeMessage(i10, (o5) obj, z6Var);
    }

    @Override // com.google.protobuf.ba
    public void writeGroupList(int i10, List<?> list, z6 z6Var) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            writeGroup(i10, list.get(i11), z6Var);
        }
    }

    @Override // com.google.protobuf.ba
    public void writeMessageList(int i10, List<?> list, z6 z6Var) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            writeMessage(i10, list.get(i11), z6Var);
        }
    }
}
