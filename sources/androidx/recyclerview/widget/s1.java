package androidx.recyclerview.widget;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class s1 {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f2033b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2034c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2035d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2036e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2037f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2038g;

    public s1(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2038g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.a = -1;
        this.f2033b = Integer.MIN_VALUE;
        this.f2034c = false;
        this.f2035d = false;
        this.f2036e = false;
        int[] iArr = this.f2037f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
