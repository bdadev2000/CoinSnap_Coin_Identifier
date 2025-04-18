package l1;

import a4.j;
import androidx.fragment.app.f1;
import androidx.lifecycle.x0;
import r.l;

/* loaded from: classes.dex */
public final class b extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public static final f1 f21111b = new f1(1);
    public final l a = new l();

    @Override // androidx.lifecycle.x0
    public final void onCleared() {
        super.onCleared();
        l lVar = this.a;
        int i10 = lVar.f23959d;
        if (i10 <= 0) {
            Object[] objArr = lVar.f23958c;
            for (int i11 = 0; i11 < i10; i11++) {
                objArr[i11] = null;
            }
            lVar.f23959d = 0;
            return;
        }
        j.t(lVar.f23958c[0]);
        throw null;
    }
}
