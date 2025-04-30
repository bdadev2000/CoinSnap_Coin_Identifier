package q;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
public final class A0 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0 f22507a;

    public A0(C0 c02) {
        this.f22507a = c02;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C0 c02 = this.f22507a;
        if (c02.f22515B.isShowing()) {
            c02.show();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f22507a.dismiss();
    }
}
