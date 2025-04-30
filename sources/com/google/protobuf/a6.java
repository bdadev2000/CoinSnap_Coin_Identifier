package com.google.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface a6 {
    Z5 fieldOrder();

    void writeBool(int i9, boolean z8) throws IOException;

    void writeBoolList(int i9, List<Boolean> list, boolean z8) throws IOException;

    void writeBytes(int i9, H h6) throws IOException;

    void writeBytesList(int i9, List<H> list) throws IOException;

    void writeDouble(int i9, double d2) throws IOException;

    void writeDoubleList(int i9, List<Double> list, boolean z8) throws IOException;

    @Deprecated
    void writeEndGroup(int i9) throws IOException;

    void writeEnum(int i9, int i10) throws IOException;

    void writeEnumList(int i9, List<Integer> list, boolean z8) throws IOException;

    void writeFixed32(int i9, int i10) throws IOException;

    void writeFixed32List(int i9, List<Integer> list, boolean z8) throws IOException;

    void writeFixed64(int i9, long j7) throws IOException;

    void writeFixed64List(int i9, List<Long> list, boolean z8) throws IOException;

    void writeFloat(int i9, float f9) throws IOException;

    void writeFloatList(int i9, List<Float> list, boolean z8) throws IOException;

    @Deprecated
    void writeGroup(int i9, Object obj) throws IOException;

    @Deprecated
    void writeGroup(int i9, Object obj, InterfaceC2038y4 interfaceC2038y4) throws IOException;

    @Deprecated
    void writeGroupList(int i9, List<?> list) throws IOException;

    @Deprecated
    void writeGroupList(int i9, List<?> list, InterfaceC2038y4 interfaceC2038y4) throws IOException;

    void writeInt32(int i9, int i10) throws IOException;

    void writeInt32List(int i9, List<Integer> list, boolean z8) throws IOException;

    void writeInt64(int i9, long j7) throws IOException;

    void writeInt64List(int i9, List<Long> list, boolean z8) throws IOException;

    <K, V> void writeMap(int i9, E3 e32, Map<K, V> map) throws IOException;

    void writeMessage(int i9, Object obj) throws IOException;

    void writeMessage(int i9, Object obj, InterfaceC2038y4 interfaceC2038y4) throws IOException;

    void writeMessageList(int i9, List<?> list) throws IOException;

    void writeMessageList(int i9, List<?> list, InterfaceC2038y4 interfaceC2038y4) throws IOException;

    void writeMessageSetItem(int i9, Object obj) throws IOException;

    void writeSFixed32(int i9, int i10) throws IOException;

    void writeSFixed32List(int i9, List<Integer> list, boolean z8) throws IOException;

    void writeSFixed64(int i9, long j7) throws IOException;

    void writeSFixed64List(int i9, List<Long> list, boolean z8) throws IOException;

    void writeSInt32(int i9, int i10) throws IOException;

    void writeSInt32List(int i9, List<Integer> list, boolean z8) throws IOException;

    void writeSInt64(int i9, long j7) throws IOException;

    void writeSInt64List(int i9, List<Long> list, boolean z8) throws IOException;

    @Deprecated
    void writeStartGroup(int i9) throws IOException;

    void writeString(int i9, String str) throws IOException;

    void writeStringList(int i9, List<String> list) throws IOException;

    void writeUInt32(int i9, int i10) throws IOException;

    void writeUInt32List(int i9, List<Integer> list, boolean z8) throws IOException;

    void writeUInt64(int i9, long j7) throws IOException;

    void writeUInt64List(int i9, List<Long> list, boolean z8) throws IOException;
}
