package com.google.protobuf;

import java.util.List;

/* renamed from: com.google.protobuf.u3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2009u3 extends AbstractC2016v3 {
    private C2009u3() {
        super();
    }

    public static <E> InterfaceC1891d3 getProtobufList(Object obj, long j7) {
        return (InterfaceC1891d3) C5.getObject(obj, j7);
    }

    @Override // com.google.protobuf.AbstractC2016v3
    public void makeImmutableListAt(Object obj, long j7) {
        ((AbstractC1894e) getProtobufList(obj, j7)).makeImmutable();
    }

    @Override // com.google.protobuf.AbstractC2016v3
    public <E> void mergeListsAt(Object obj, Object obj2, long j7) {
        InterfaceC1891d3 protobufList = getProtobufList(obj, j7);
        InterfaceC1891d3 protobufList2 = getProtobufList(obj2, j7);
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
        C5.putObject(obj, j7, protobufList2);
    }

    @Override // com.google.protobuf.AbstractC2016v3
    public <L> List<L> mutableListAt(Object obj, long j7) {
        int i9;
        InterfaceC1891d3 protobufList = getProtobufList(obj, j7);
        if (!protobufList.isModifiable()) {
            int size = protobufList.size();
            if (size == 0) {
                i9 = 10;
            } else {
                i9 = size * 2;
            }
            InterfaceC1891d3 mutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(i9);
            C5.putObject(obj, j7, mutableCopyWithCapacity);
            return mutableCopyWithCapacity;
        }
        return protobufList;
    }
}
