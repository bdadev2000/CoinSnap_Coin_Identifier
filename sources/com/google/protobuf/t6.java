package com.google.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public interface t6 {
    public static final int READ_DONE = Integer.MAX_VALUE;
    public static final int TAG_UNKNOWN = 0;

    int getFieldNumber() throws IOException;

    int getTag();

    <T> void mergeGroupField(T t5, z6 z6Var, a2 a2Var) throws IOException;

    <T> void mergeMessageField(T t5, z6 z6Var, a2 a2Var) throws IOException;

    boolean readBool() throws IOException;

    void readBoolList(List<Boolean> list) throws IOException;

    h0 readBytes() throws IOException;

    void readBytesList(List<h0> list) throws IOException;

    double readDouble() throws IOException;

    void readDoubleList(List<Double> list) throws IOException;

    int readEnum() throws IOException;

    void readEnumList(List<Integer> list) throws IOException;

    int readFixed32() throws IOException;

    void readFixed32List(List<Integer> list) throws IOException;

    long readFixed64() throws IOException;

    void readFixed64List(List<Long> list) throws IOException;

    float readFloat() throws IOException;

    void readFloatList(List<Float> list) throws IOException;

    @Deprecated
    <T> T readGroup(Class<T> cls, a2 a2Var) throws IOException;

    @Deprecated
    <T> T readGroupBySchemaWithCheck(z6 z6Var, a2 a2Var) throws IOException;

    @Deprecated
    <T> void readGroupList(List<T> list, z6 z6Var, a2 a2Var) throws IOException;

    @Deprecated
    <T> void readGroupList(List<T> list, Class<T> cls, a2 a2Var) throws IOException;

    int readInt32() throws IOException;

    void readInt32List(List<Integer> list) throws IOException;

    long readInt64() throws IOException;

    void readInt64List(List<Long> list) throws IOException;

    <K, V> void readMap(Map<K, V> map, f5 f5Var, a2 a2Var) throws IOException;

    <T> T readMessage(Class<T> cls, a2 a2Var) throws IOException;

    <T> T readMessageBySchemaWithCheck(z6 z6Var, a2 a2Var) throws IOException;

    <T> void readMessageList(List<T> list, z6 z6Var, a2 a2Var) throws IOException;

    <T> void readMessageList(List<T> list, Class<T> cls, a2 a2Var) throws IOException;

    int readSFixed32() throws IOException;

    void readSFixed32List(List<Integer> list) throws IOException;

    long readSFixed64() throws IOException;

    void readSFixed64List(List<Long> list) throws IOException;

    int readSInt32() throws IOException;

    void readSInt32List(List<Integer> list) throws IOException;

    long readSInt64() throws IOException;

    void readSInt64List(List<Long> list) throws IOException;

    String readString() throws IOException;

    void readStringList(List<String> list) throws IOException;

    void readStringListRequireUtf8(List<String> list) throws IOException;

    String readStringRequireUtf8() throws IOException;

    int readUInt32() throws IOException;

    void readUInt32List(List<Integer> list) throws IOException;

    long readUInt64() throws IOException;

    void readUInt64List(List<Long> list) throws IOException;

    boolean shouldDiscardUnknownFields();

    boolean skipField() throws IOException;
}
