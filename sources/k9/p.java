package k9;

import v8.i1;

/* loaded from: classes3.dex */
public final class p {
    public final i1 a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f20470b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20471c;

    public p(int i10, i1 i1Var, int[] iArr) {
        if (iArr.length == 0) {
            n9.o.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = i1Var;
        this.f20470b = iArr;
        this.f20471c = i10;
    }
}
