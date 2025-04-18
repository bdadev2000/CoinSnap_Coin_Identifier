package v9;

import android.view.View;

/* loaded from: classes3.dex */
public final class e extends b {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26354b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.f26354b = obj;
    }

    @Override // v9.b
    public final void b(View view) {
    }

    @Override // v9.b
    public final void c(int i10, View view) {
        int i11 = this.a;
        Object obj = this.f26354b;
        switch (i11) {
            case 0:
                if (i10 == 5) {
                    ((g) obj).cancel();
                    return;
                }
                return;
            default:
                if (i10 == 5) {
                    int i12 = h.f26369b;
                    ((h) obj).c();
                    return;
                }
                return;
        }
    }
}
