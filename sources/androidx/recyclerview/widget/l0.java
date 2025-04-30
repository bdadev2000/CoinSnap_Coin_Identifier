package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public int f5026a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f5027c;

    /* renamed from: d, reason: collision with root package name */
    public int f5028d;

    /* renamed from: e, reason: collision with root package name */
    public int f5029e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5030f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5031g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5032h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5033i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5034j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5035k;
    public int l;
    public long m;

    /* renamed from: n, reason: collision with root package name */
    public int f5036n;

    public final void a(int i9) {
        if ((this.f5028d & i9) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i9) + " but it is " + Integer.toBinaryString(this.f5028d));
    }

    public final int b() {
        if (this.f5031g) {
            return this.b - this.f5027c;
        }
        return this.f5029e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State{mTargetPosition=");
        sb.append(this.f5026a);
        sb.append(", mData=null, mItemCount=");
        sb.append(this.f5029e);
        sb.append(", mIsMeasuring=");
        sb.append(this.f5033i);
        sb.append(", mPreviousLayoutItemCount=");
        sb.append(this.b);
        sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb.append(this.f5027c);
        sb.append(", mStructureChanged=");
        sb.append(this.f5030f);
        sb.append(", mInPreLayout=");
        sb.append(this.f5031g);
        sb.append(", mRunSimpleAnimations=");
        sb.append(this.f5034j);
        sb.append(", mRunPredictiveAnimations=");
        return Q7.n0.n(sb, this.f5035k, '}');
    }
}
