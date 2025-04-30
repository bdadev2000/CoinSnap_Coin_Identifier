package com.google.protobuf;

import java.util.List;

/* renamed from: com.google.protobuf.a1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1868a1 extends O3 {
    int getBegin();

    @Override // com.google.protobuf.O3
    /* synthetic */ N3 getDefaultInstanceForType();

    int getEnd();

    int getPath(int i9);

    int getPathCount();

    List<Integer> getPathList();

    String getSourceFile();

    H getSourceFileBytes();

    boolean hasBegin();

    boolean hasEnd();

    boolean hasSourceFile();

    @Override // com.google.protobuf.O3
    /* synthetic */ boolean isInitialized();
}
