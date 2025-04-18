package s7;

/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements n9.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24306b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f24307c;

    public /* synthetic */ c0(boolean z10, int i10) {
        this.f24306b = i10;
        this.f24307c = z10;
    }

    @Override // n9.l
    public final void invoke(Object obj) {
        int i10 = this.f24306b;
        boolean z10 = this.f24307c;
        switch (i10) {
            case 0:
                ((f2) obj).onShuffleModeEnabledChanged(z10);
                return;
            default:
                ((f2) obj).o(z10);
                return;
        }
    }
}
