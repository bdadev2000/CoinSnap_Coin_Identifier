package com.mbridge.msdk.playercommon.exoplayer2.upstream;

/* loaded from: classes3.dex */
public interface Allocator {
    Allocation allocate();

    int getIndividualAllocationLength();

    int getTotalBytesAllocated();

    void release(Allocation allocation);

    void release(Allocation[] allocationArr);

    void trim();
}
