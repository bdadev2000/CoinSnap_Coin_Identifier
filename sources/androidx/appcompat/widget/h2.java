package androidx.appcompat.widget;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
public final class h2 extends DataSetObserver {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f872b;

    public /* synthetic */ h2(Object obj, int i10) {
        this.a = i10;
        this.f872b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int i10 = this.a;
        Object obj = this.f872b;
        switch (i10) {
            case 0:
                k2 k2Var = (k2) obj;
                if (k2Var.a()) {
                    k2Var.show();
                    return;
                }
                return;
            default:
                u0.b bVar = (u0.b) obj;
                bVar.f25409b = true;
                bVar.notifyDataSetChanged();
                return;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        int i10 = this.a;
        Object obj = this.f872b;
        switch (i10) {
            case 0:
                ((k2) obj).dismiss();
                return;
            default:
                u0.b bVar = (u0.b) obj;
                bVar.f25409b = false;
                bVar.notifyDataSetInvalidated();
                return;
        }
    }
}
