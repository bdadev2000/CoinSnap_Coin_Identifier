package com.google.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.s4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1996s4 {
    public static final int READ_DONE = Integer.MAX_VALUE;
    public static final int TAG_UNKNOWN = 0;

    int getFieldNumber() throws IOException;

    int getTag();

    <T> void mergeGroupField(T t9, InterfaceC2038y4 interfaceC2038y4, W1 w1) throws IOException;

    <T> void mergeMessageField(T t9, InterfaceC2038y4 interfaceC2038y4, W1 w1) throws IOException;

    boolean readBool() throws IOException;

    void readBoolList(List<Boolean> list) throws IOException;

    H readBytes() throws IOException;

    void readBytesList(List<H> list) throws IOException;

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
    <T> T readGroup(Class<T> cls, W1 w1) throws IOException;

    @Deprecated
    <T> T readGroupBySchemaWithCheck(InterfaceC2038y4 interfaceC2038y4, W1 w1) throws IOException;

    @Deprecated
    <T> void readGroupList(List<T> list, InterfaceC2038y4 interfaceC2038y4, W1 w1) throws IOException;

    @Deprecated
    <T> void readGroupList(List<T> list, Class<T> cls, W1 w1) throws IOException;

    int readInt32() throws IOException;

    void readInt32List(List<Integer> list) throws IOException;

    long readInt64() throws IOException;

    void readInt64List(List<Long> list) throws IOException;

    <K, V> void readMap(Map<K, V> map, E3 e32, W1 w1) throws IOException;

    <T> T readMessage(Class<T> cls, W1 w1) throws IOException;

    <T> T readMessageBySchemaWithCheck(InterfaceC2038y4 interfaceC2038y4, W1 w1) throws IOException;

    <T> void readMessageList(List<T> list, InterfaceC2038y4 interfaceC2038y4, W1 w1) throws IOException;

    <T> void readMessageList(List<T> list, Class<T> cls, W1 w1) throws IOException;

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
