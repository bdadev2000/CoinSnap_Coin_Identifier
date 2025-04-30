package androidx.recyclerview.widget;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public int f5090a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5091c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5092d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5093e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f5094f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f5095g;

    public t0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f5095g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f5090a = -1;
        this.b = Integer.MIN_VALUE;
        this.f5091c = false;
        this.f5092d = false;
        this.f5093e = false;
        int[] iArr = this.f5094f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
