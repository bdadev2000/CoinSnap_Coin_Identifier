package com.google.protobuf;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.g0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1909g0 implements a6 {
    private final AbstractC1895e0 output;

    private C1909g0(AbstractC1895e0 abstractC1895e0) {
        AbstractC1895e0 abstractC1895e02 = (AbstractC1895e0) C1898e3.checkNotNull(abstractC1895e0, "output");
        this.output = abstractC1895e02;
        abstractC1895e02.wrapper = this;
    }

    public static C1909g0 forCodedOutput(AbstractC1895e0 abstractC1895e0) {
        C1909g0 c1909g0 = abstractC1895e0.wrapper;
        if (c1909g0 != null) {
            return c1909g0;
        }
        return new C1909g0(abstractC1895e0);
    }

    private <V> void writeDeterministicBooleanMapEntry(int i9, boolean z8, V v6, E3 e32) throws IOException {
        this.output.writeTag(i9, 2);
        this.output.writeUInt32NoTag(F3.computeSerializedSize(e32, Boolean.valueOf(z8), v6));
        F3.writeTo(this.output, e32, Boolean.valueOf(z8), v6);
    }

    private <V> void writeDeterministicIntegerMap(int i9, E3 e32, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        Arrays.sort(iArr);
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = iArr[i11];
            V v6 = map.get(Integer.valueOf(i12));
            this.output.writeTag(i9, 2);
            this.output.writeUInt32NoTag(F3.computeSerializedSize(e32, Integer.valueOf(i12), v6));
            F3.writeTo(this.output, e32, Integer.valueOf(i12), v6);
        }
    }

    private <V> void writeDeterministicLongMap(int i9, E3 e32, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        Arrays.sort(jArr);
        for (int i11 = 0; i11 < size; i11++) {
            long j7 = jArr[i11];
            V v6 = map.get(Long.valueOf(j7));
            this.output.writeTag(i9, 2);
            this.output.writeUInt32NoTag(F3.computeSerializedSize(e32, Long.valueOf(j7), v6));
            F3.writeTo(this.output, e32, Long.valueOf(j7), v6);
        }
    }

    private <K, V> void writeDeterministicMap(int i9, E3 e32, Map<K, V> map) throws IOException {
        switch (AbstractC1902f0.$SwitchMap$com$google$protobuf$WireFormat$FieldType[e32.keyType.ordinal()]) {
            case 1:
                V v6 = map.get(Boolean.FALSE);
                if (v6 != null) {
                    writeDeterministicBooleanMapEntry(i9, false, v6, e32);
                }
                V v9 = map.get(Boolean.TRUE);
                if (v9 != null) {
                    writeDeterministicBooleanMapEntry(i9, true, v9, e32);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                writeDeterministicIntegerMap(i9, e32, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                writeDeterministicLongMap(i9, e32, map);
                return;
            case 12:
                writeDeterministicStringMap(i9, e32, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + e32.keyType);
        }
    }

    private <V> void writeDeterministicStringMap(int i9, E3 e32, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            strArr[i10] = it.next();
            i10++;
        }
        Arrays.sort(strArr);
        for (int i11 = 0; i11 < size; i11++) {
            String str = strArr[i11];
            V v6 = map.get(str);
            this.output.writeTag(i9, 2);
            this.output.writeUInt32NoTag(F3.computeSerializedSize(e32, str, v6));
            F3.writeTo(this.output, e32, str, v6);
        }
    }

    private void writeLazyString(int i9, Object obj) throws IOException {
        if (obj instanceof String) {
            this.output.writeString(i9, (String) obj);
        } else {
            this.output.writeBytes(i9, (H) obj);
        }
    }

    @Override // com.google.protobuf.a6
    public Z5 fieldOrder() {
        return Z5.ASCENDING;
    }

    public int getTotalBytesWritten() {
        return this.output.getTotalBytesWritten();
    }

    @Override // com.google.protobuf.a6
    public void writeBool(int i9, boolean z8) throws IOException {
        this.output.writeBool(i9, z8);
    }

    @Override // com.google.protobuf.a6
    public void writeBoolList(int i9, List<Boolean> list, boolean z8) throws IOException {
        int i10 = 0;
        if (z8) {
            this.output.writeTag(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += AbstractC1895e0.computeBoolSizeNoTag(list.get(i12).booleanValue());
            }
            this.output.writeUInt32NoTag(i11);
            while (i10 < list.size()) {
                this.output.writeBoolNoTag(list.get(i10).booleanValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.output.writeBool(i9, list.get(i10).booleanValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.a6
    public void writeBytes(int i9, H h6) throws IOException {
        this.output.writeBytes(i9, h6);
    }

    @Override // com.google.protobuf.a6
    public void writeBytesList(int i9, List<H> list) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.output.writeBytes(i9, list.get(i10));
        }
    }

    @Override // com.google.protobuf.a6
    public void writeDouble(int i9, double d2) throws IOException {
        this.output.writeDouble(i9, d2);
    }

    @Override // com.google.protobuf.a6
    public void writeDoubleList(int i9, List<Double> list, boolean z8) throws IOException {
        int i10 = 0;
        if (z8) {
            this.output.writeTag(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += AbstractC1895e0.computeDoubleSizeNoTag(list.get(i12).doubleValue());
            }
            this.output.writeUInt32NoTag(i11);
            while (i10 < list.size()) {
                this.output.writeDoubleNoTag(list.get(i10).doubleValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.output.writeDouble(i9, list.get(i10).doubleValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.a6
    @Deprecated
    public void writeEndGroup(int i9) throws IOException {
        this.output.writeTag(i9, 4);
    }

    @Override // com.google.protobuf.a6
    public void writeEnum(int i9, int i10) throws IOException {
        this.output.writeEnum(i9, i10);
    }

    @Override // com.google.protobuf.a6
    public void writeEnumList(int i9, List<Integer> list, boolean z8) throws IOException {
        int i10 = 0;
        if (z8) {
            this.output.writeTag(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += AbstractC1895e0.computeEnumSizeNoTag(list.get(i12).intValue());
            }
            this.output.writeUInt32NoTag(i11);
            while (i10 < list.size()) {
                this.output.writeEnumNoTag(list.get(i10).intValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.output.writeEnum(i9, list.get(i10).intValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.a6
    public void writeFixed32(int i9, int i10) throws IOException {
        this.output.writeFixed32(i9, i10);
    }

    @Override // com.google.protobuf.a6
    public void writeFixed32List(int i9, List<Integer> list, boolean z8) throws IOException {
        int i10 = 0;
        if (z8) {
            this.output.writeTag(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += AbstractC1895e0.computeFixed32SizeNoTag(list.get(i12).intValue());
            }
            this.output.writeUInt32NoTag(i11);
            while (i10 < list.size()) {
                this.output.writeFixed32NoTag(list.get(i10).intValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.output.writeFixed32(i9, list.get(i10).intValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.a6
    public void writeFixed64(int i9, long j7) throws IOException {
        this.output.writeFixed64(i9, j7);
    }

    @Override // com.google.protobuf.a6
    public void writeFixed64List(int i9, List<Long> list, boolean z8) throws IOException {
        int i10 = 0;
        if (z8) {
            this.output.writeTag(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += AbstractC1895e0.computeFixed64SizeNoTag(list.get(i12).longValue());
            }
            this.output.writeUInt32NoTag(i11);
            while (i10 < list.size()) {
                this.output.writeFixed64NoTag(list.get(i10).longValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.output.writeFixed64(i9, list.get(i10).longValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.a6
    public void writeFloat(int i9, float f9) throws IOException {
        this.output.writeFloat(i9, f9);
    }

    @Override // com.google.protobuf.a6
    public void writeFloatList(int i9, List<Float> list, boolean z8) throws IOException {
        int i10 = 0;
        if (z8) {
            this.output.writeTag(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += AbstractC1895e0.computeFloatSizeNoTag(list.get(i12).floatValue());
            }
            this.output.writeUInt32NoTag(i11);
            while (i10 < list.size()) {
                this.output.writeFloatNoTag(list.get(i10).floatValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.output.writeFloat(i9, list.get(i10).floatValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.a6
    @Deprecated
    public void writeGroup(int i9, Object obj) throws IOException {
        this.output.writeGroup(i9, (N3) obj);
    }

    @Override // com.google.protobuf.a6
    @Deprecated
    public void writeGroupList(int i9, List<?> list) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            writeGroup(i9, list.get(i10));
        }
    }

    @Override // com.google.protobuf.a6
    public void writeInt32(int i9, int i10) throws IOException {
        this.output.writeInt32(i9, i10);
    }

    @Override // com.google.protobuf.a6
    public void writeInt32List(int i9, List<Integer> list, boolean z8) throws IOException {
        int i10 = 0;
        if (z8) {
            this.output.writeTag(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += AbstractC1895e0.computeInt32SizeNoTag(list.get(i12).intValue());
            }
            this.output.writeUInt32NoTag(i11);
            while (i10 < list.size()) {
                this.output.writeInt32NoTag(list.get(i10).intValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.output.writeInt32(i9, list.get(i10).intValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.a6
    public void writeInt64(int i9, long j7) throws IOException {
        this.output.writeInt64(i9, j7);
    }

    @Override // com.google.protobuf.a6
    public void writeInt64List(int i9, List<Long> list, boolean z8) throws IOException {
        int i10 = 0;
        if (z8) {
            this.output.writeTag(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += AbstractC1895e0.computeInt64SizeNoTag(list.get(i12).longValue());
            }
            this.output.writeUInt32NoTag(i11);
            while (i10 < list.size()) {
                this.output.writeInt64NoTag(list.get(i10).longValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.output.writeInt64(i9, list.get(i10).longValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.a6
    public <K, V> void writeMap(int i9, E3 e32, Map<K, V> map) throws IOException {
        if (this.output.isSerializationDeterministic()) {
            writeDeterministicMap(i9, e32, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.output.writeTag(i9, 2);
            this.output.writeUInt32NoTag(F3.computeSerializedSize(e32, entry.getKey(), entry.getValue()));
            F3.writeTo(this.output, e32, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.a6
    public void writeMessage(int i9, Object obj) throws IOException {
        this.output.writeMessage(i9, (N3) obj);
    }

    @Override // com.google.protobuf.a6
    public void writeMessageList(int i9, List<?> list) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            writeMessage(i9, list.get(i10));
        }
    }

    @Override // com.google.protobuf.a6
    public final void writeMessageSetItem(int i9, Object obj) throws IOException {
        if (obj instanceof H) {
            this.output.writeRawMessageSetExtension(i9, (H) obj);
        } else {
            this.output.writeMessageSetExtension(i9, (N3) obj);
        }
    }

    @Override // com.google.protobuf.a6
    public void writeSFixed32(int i9, int i10) throws IOException {
        this.output.writeSFixed32(i9, i10);
    }

    @Override // com.google.protobuf.a6
    public void writeSFixed32List(int i9, List<Integer> list, boolean z8) throws IOException {
        int i10 = 0;
        if (z8) {
            this.output.writeTag(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += AbstractC1895e0.computeSFixed32SizeNoTag(list.get(i12).intValue());
            }
            this.output.writeUInt32NoTag(i11);
            while (i10 < list.size()) {
                this.output.writeSFixed32NoTag(list.get(i10).intValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.output.writeSFixed32(i9, list.get(i10).intValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.a6
    public void writeSFixed64(int i9, long j7) throws IOException {
        this.output.writeSFixed64(i9, j7);
    }

    @Override // com.google.protobuf.a6
    public void writeSFixed64List(int i9, List<Long> list, boolean z8) throws IOException {
        int i10 = 0;
        if (z8) {
            this.output.writeTag(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += AbstractC1895e0.computeSFixed64SizeNoTag(list.get(i12).longValue());
            }
            this.output.writeUInt32NoTag(i11);
            while (i10 < list.size()) {
                this.output.writeSFixed64NoTag(list.get(i10).longValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.output.writeSFixed64(i9, list.get(i10).longValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.a6
    public void writeSInt32(int i9, int i10) throws IOException {
        this.output.writeSInt32(i9, i10);
    }

    @Override // com.google.protobuf.a6
    public void writeSInt32List(int i9, List<Integer> list, boolean z8) throws IOException {
        int i10 = 0;
        if (z8) {
            this.output.writeTag(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += AbstractC1895e0.computeSInt32SizeNoTag(list.get(i12).intValue());
            }
            this.output.writeUInt32NoTag(i11);
            while (i10 < list.size()) {
                this.output.writeSInt32NoTag(list.get(i10).intValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.output.writeSInt32(i9, list.get(i10).intValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.a6
    public void writeSInt64(int i9, long j7) throws IOException {
        this.output.writeSInt64(i9, j7);
    }

    @Override // com.google.protobuf.a6
    public void writeSInt64List(int i9, List<Long> list, boolean z8) throws IOException {
        int i10 = 0;
        if (z8) {
            this.output.writeTag(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += AbstractC1895e0.computeSInt64SizeNoTag(list.get(i12).longValue());
            }
            this.output.writeUInt32NoTag(i11);
            while (i10 < list.size()) {
                this.output.writeSInt64NoTag(list.get(i10).longValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.output.writeSInt64(i9, list.get(i10).longValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.a6
    @Deprecated
    public void writeStartGroup(int i9) throws IOException {
        this.output.writeTag(i9, 3);
    }

    @Override // com.google.protobuf.a6
    public void writeString(int i9, String str) throws IOException {
        this.output.writeString(i9, str);
    }

    @Override // com.google.protobuf.a6
    public void writeStringList(int i9, List<String> list) throws IOException {
        int i10 = 0;
        if (list instanceof InterfaceC1988r3) {
            InterfaceC1988r3 interfaceC1988r3 = (InterfaceC1988r3) list;
            while (i10 < list.size()) {
                writeLazyString(i9, interfaceC1988r3.getRaw(i10));
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.output.writeString(i9, list.get(i10));
            i10++;
        }
    }

    @Override // com.google.protobuf.a6
    public void writeUInt32(int i9, int i10) throws IOException {
        this.output.writeUInt32(i9, i10);
    }

    @Override // com.google.protobuf.a6
    public void writeUInt32List(int i9, List<Integer> list, boolean z8) throws IOException {
        int i10 = 0;
        if (z8) {
            this.output.writeTag(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += AbstractC1895e0.computeUInt32SizeNoTag(list.get(i12).intValue());
            }
            this.output.writeUInt32NoTag(i11);
            while (i10 < list.size()) {
                this.output.writeUInt32NoTag(list.get(i10).intValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.output.writeUInt32(i9, list.get(i10).intValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.a6
    public void writeUInt64(int i9, long j7) throws IOException {
        this.output.writeUInt64(i9, j7);
    }

    @Override // com.google.protobuf.a6
    public void writeUInt64List(int i9, List<Long> list, boolean z8) throws IOException {
        int i10 = 0;
        if (z8) {
            this.output.writeTag(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += AbstractC1895e0.computeUInt64SizeNoTag(list.get(i12).longValue());
            }
            this.output.writeUInt32NoTag(i11);
            while (i10 < list.size()) {
                this.output.writeUInt64NoTag(list.get(i10).longValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.output.writeUInt64(i9, list.get(i10).longValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.a6
    public void writeGroup(int i9, Object obj, InterfaceC2038y4 interfaceC2038y4) throws IOException {
        this.output.writeGroup(i9, (N3) obj, interfaceC2038y4);
    }

    @Override // com.google.protobuf.a6
    public void writeMessage(int i9, Object obj, InterfaceC2038y4 interfaceC2038y4) throws IOException {
        this.output.writeMessage(i9, (N3) obj, interfaceC2038y4);
    }

    @Override // com.google.protobuf.a6
    public void writeGroupList(int i9, List<?> list, InterfaceC2038y4 interfaceC2038y4) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            writeGroup(i9, list.get(i10), interfaceC2038y4);
        }
    }

    @Override // com.google.protobuf.a6
    public void writeMessageList(int i9, List<?> list, InterfaceC2038y4 interfaceC2038y4) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            writeMessage(i9, list.get(i10), interfaceC2038y4);
        }
    }
}
