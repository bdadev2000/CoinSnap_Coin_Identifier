package n0;

import android.view.View;

/* loaded from: classes.dex */
public final class m0 extends o0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22319e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(int i10, int i11) {
        super(i10, Boolean.class, 0, 28);
        this.f22319e = i11;
    }

    public final Boolean d(View view) {
        switch (this.f22319e) {
            case 0:
                return Boolean.valueOf(y0.d(view));
            default:
                return Boolean.valueOf(y0.c(view));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i10, int i11, int i12, int i13) {
        super(i10, CharSequence.class, i11, i12);
        this.f22319e = i13;
    }
}
