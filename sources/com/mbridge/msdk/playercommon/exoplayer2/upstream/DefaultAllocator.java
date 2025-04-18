package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class DefaultAllocator implements Allocator {
    private static final int AVAILABLE_EXTRA_CAPACITY = 100;
    private int allocatedCount;
    private Allocation[] availableAllocations;
    private int availableCount;
    private final int individualAllocationSize;
    private final byte[] initialAllocationBlock;
    private final Allocation[] singleAllocationReleaseHolder;
    private int targetBufferSize;
    private final boolean trimOnReset;

    public DefaultAllocator(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator
    public final synchronized Allocation allocate() {
        Allocation allocation;
        this.allocatedCount++;
        int i10 = this.availableCount;
        if (i10 > 0) {
            Allocation[] allocationArr = this.availableAllocations;
            int i11 = i10 - 1;
            this.availableCount = i11;
            allocation = allocationArr[i11];
            allocationArr[i11] = null;
        } else {
            allocation = new Allocation(new byte[this.individualAllocationSize], 0);
        }
        return allocation;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator
    public final int getIndividualAllocationLength() {
        return this.individualAllocationSize;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator
    public final synchronized int getTotalBytesAllocated() {
        return this.allocatedCount * this.individualAllocationSize;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator
    public final synchronized void release(Allocation allocation) {
        Allocation[] allocationArr = this.singleAllocationReleaseHolder;
        allocationArr[0] = allocation;
        release(allocationArr);
    }

    public final synchronized void reset() {
        if (this.trimOnReset) {
            setTargetBufferSize(0);
        }
    }

    public final synchronized void setTargetBufferSize(int i10) {
        boolean z10;
        if (i10 < this.targetBufferSize) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.targetBufferSize = i10;
        if (z10) {
            trim();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator
    public final synchronized void trim() {
        int i10 = 0;
        int max = Math.max(0, Util.ceilDivide(this.targetBufferSize, this.individualAllocationSize) - this.allocatedCount);
        int i11 = this.availableCount;
        if (max >= i11) {
            return;
        }
        if (this.initialAllocationBlock != null) {
            int i12 = i11 - 1;
            while (i10 <= i12) {
                Allocation[] allocationArr = this.availableAllocations;
                Allocation allocation = allocationArr[i10];
                byte[] bArr = allocation.data;
                byte[] bArr2 = this.initialAllocationBlock;
                if (bArr == bArr2) {
                    i10++;
                } else {
                    Allocation allocation2 = allocationArr[i12];
                    if (allocation2.data != bArr2) {
                        i12--;
                    } else {
                        allocationArr[i10] = allocation2;
                        allocationArr[i12] = allocation;
                        i12--;
                        i10++;
                    }
                }
            }
            max = Math.max(max, i10);
            if (max >= this.availableCount) {
                return;
            }
        }
        Arrays.fill(this.availableAllocations, max, this.availableCount, (Object) null);
        this.availableCount = max;
    }

    public DefaultAllocator(boolean z10, int i10, int i11) {
        Assertions.checkArgument(i10 > 0);
        Assertions.checkArgument(i11 >= 0);
        this.trimOnReset = z10;
        this.individualAllocationSize = i10;
        this.availableCount = i11;
        this.availableAllocations = new Allocation[i11 + 100];
        if (i11 > 0) {
            this.initialAllocationBlock = new byte[i11 * i10];
            for (int i12 = 0; i12 < i11; i12++) {
                this.availableAllocations[i12] = new Allocation(this.initialAllocationBlock, i12 * i10);
            }
        } else {
            this.initialAllocationBlock = null;
        }
        this.singleAllocationReleaseHolder = new Allocation[1];
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator
    public final synchronized void release(Allocation[] allocationArr) {
        int i10 = this.availableCount;
        int length = allocationArr.length + i10;
        Allocation[] allocationArr2 = this.availableAllocations;
        if (length >= allocationArr2.length) {
            this.availableAllocations = (Allocation[]) Arrays.copyOf(allocationArr2, Math.max(allocationArr2.length * 2, i10 + allocationArr.length));
        }
        for (Allocation allocation : allocationArr) {
            byte[] bArr = allocation.data;
            if (bArr != this.initialAllocationBlock && bArr.length != this.individualAllocationSize) {
                throw new IllegalArgumentException("Unexpected allocation: " + System.identityHashCode(allocation.data) + ", " + System.identityHashCode(this.initialAllocationBlock) + ", " + allocation.data.length + ", " + this.individualAllocationSize);
            }
            Allocation[] allocationArr3 = this.availableAllocations;
            int i11 = this.availableCount;
            this.availableCount = i11 + 1;
            allocationArr3[i11] = allocation;
        }
        this.allocatedCount -= allocationArr.length;
        notifyAll();
    }
}
