package androidx.compose.material3;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ScrolledOffset {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12636a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TopAppBarScrollBehavior f12637b;

    public /* synthetic */ a(TopAppBarScrollBehavior topAppBarScrollBehavior, int i2) {
        this.f12636a = i2;
        this.f12637b = topAppBarScrollBehavior;
    }

    @Override // androidx.compose.material3.ScrolledOffset
    public final float offset() {
        int i2 = this.f12636a;
        TopAppBarScrollBehavior topAppBarScrollBehavior = this.f12637b;
        switch (i2) {
            case 0:
                if (topAppBarScrollBehavior != null) {
                    topAppBarScrollBehavior.getState();
                }
                return 0.0f;
            default:
                if (topAppBarScrollBehavior != null) {
                    topAppBarScrollBehavior.getState();
                }
                return 0.0f;
        }
    }
}
