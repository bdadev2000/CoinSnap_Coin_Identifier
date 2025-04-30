package com.google.protobuf;

import java.util.List;

/* renamed from: com.google.protobuf.w1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2021w1 extends O3 {
    @Override // com.google.protobuf.O3
    /* synthetic */ N3 getDefaultInstanceForType();

    String getLeadingComments();

    H getLeadingCommentsBytes();

    String getLeadingDetachedComments(int i9);

    H getLeadingDetachedCommentsBytes(int i9);

    int getLeadingDetachedCommentsCount();

    List<String> getLeadingDetachedCommentsList();

    int getPath(int i9);

    int getPathCount();

    List<Integer> getPathList();

    int getSpan(int i9);

    int getSpanCount();

    List<Integer> getSpanList();

    String getTrailingComments();

    H getTrailingCommentsBytes();

    boolean hasLeadingComments();

    boolean hasTrailingComments();

    @Override // com.google.protobuf.O3
    /* synthetic */ boolean isInitialized();
}
