package com.google.protobuf;

import java.util.List;

/* loaded from: classes4.dex */
public final class v4 extends w4 {
    private v4() {
        super();
    }

    public static <E> e4 getProtobufList(Object obj, long j3) {
        return (e4) d9.getObject(obj, j3);
    }

    @Override // com.google.protobuf.w4
    public void makeImmutableListAt(Object obj, long j3) {
        ((e) getProtobufList(obj, j3)).makeImmutable();
    }

    @Override // com.google.protobuf.w4
    public <E> void mergeListsAt(Object obj, Object obj2, long j3) {
        e4 protobufList = getProtobufList(obj, j3);
        e4 protobufList2 = getProtobufList(obj2, j3);
        int size = protobufList.size();
        int size2 = protobufList2.size();
        if (size > 0 && size2 > 0) {
            if (!protobufList.isModifiable()) {
                protobufList = protobufList.mutableCopyWithCapacity(size2 + size);
            }
            protobufList.addAll(protobufList2);
        }
        if (size > 0) {
            protobufList2 = protobufList;
        }
        d9.putObject(obj, j3, protobufList2);
    }

    @Override // com.google.protobuf.w4
    public <L> List<L> mutableListAt(Object obj, long j3) {
        int i10;
        e4 protobufList = getProtobufList(obj, j3);
        if (!protobufList.isModifiable()) {
            int size = protobufList.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size * 2;
            }
            e4 mutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(i10);
            d9.putObject(obj, j3, mutableCopyWithCapacity);
            return mutableCopyWithCapacity;
        }
        return protobufList;
    }
}
