package com.mbridge.msdk.tracker.network.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    protected static final Comparator<byte[]> f18237a = new Comparator<byte[]>() { // from class: com.mbridge.msdk.tracker.network.toolbox.c.1
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    };
    private final List<byte[]> b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<byte[]> f18238c = new ArrayList(64);

    /* renamed from: d, reason: collision with root package name */
    private int f18239d = 0;

    /* renamed from: e, reason: collision with root package name */
    private final int f18240e;

    public c(int i9) {
        this.f18240e = i9;
    }

    public final synchronized byte[] a(int i9) {
        for (int i10 = 0; i10 < this.f18238c.size(); i10++) {
            byte[] bArr = this.f18238c.get(i10);
            if (bArr.length >= i9) {
                this.f18239d -= bArr.length;
                this.f18238c.remove(i10);
                this.b.remove(bArr);
                return bArr;
            }
        }
        return new byte[i9];
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f18240e) {
                this.b.add(bArr);
                int binarySearch = Collections.binarySearch(this.f18238c, bArr, f18237a);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f18238c.add(binarySearch, bArr);
                this.f18239d += bArr.length;
                a();
            }
        }
    }

    private synchronized void a() {
        while (this.f18239d > this.f18240e) {
            byte[] remove = this.b.remove(0);
            this.f18238c.remove(remove);
            this.f18239d -= remove.length;
        }
    }
}
