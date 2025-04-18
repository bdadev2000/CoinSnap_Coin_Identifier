package z0;

import e0.r;

/* loaded from: classes3.dex */
public final class k extends r {

    /* renamed from: a, reason: collision with root package name */
    public int f31478a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CharSequence f31479b;

    public k(CharSequence charSequence) {
        this.f31479b = charSequence;
    }

    @Override // e0.r
    public final char b() {
        int i2 = this.f31478a;
        this.f31478a = i2 + 1;
        return this.f31479b.charAt(i2);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31478a < this.f31479b.length();
    }
}
