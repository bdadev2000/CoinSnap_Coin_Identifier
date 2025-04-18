package com.mbridge.msdk.tracker.network.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes4.dex */
public final class c {
    protected static final Comparator<byte[]> a = new Comparator<byte[]>() { // from class: com.mbridge.msdk.tracker.network.toolbox.c.1
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private final List<byte[]> f15477b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<byte[]> f15478c = new ArrayList(64);

    /* renamed from: d, reason: collision with root package name */
    private int f15479d = 0;

    /* renamed from: e, reason: collision with root package name */
    private final int f15480e;

    public c(int i10) {
        this.f15480e = i10;
    }

    public final synchronized byte[] a(int i10) {
        for (int i11 = 0; i11 < this.f15478c.size(); i11++) {
            byte[] bArr = this.f15478c.get(i11);
            if (bArr.length >= i10) {
                this.f15479d -= bArr.length;
                this.f15478c.remove(i11);
                this.f15477b.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f15480e) {
                this.f15477b.add(bArr);
                int binarySearch = Collections.binarySearch(this.f15478c, bArr, a);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f15478c.add(binarySearch, bArr);
                this.f15479d += bArr.length;
                a();
            }
        }
    }

    private synchronized void a() {
        while (this.f15479d > this.f15480e) {
            byte[] remove = this.f15477b.remove(0);
            this.f15478c.remove(remove);
            this.f15479d -= remove.length;
        }
    }
}
