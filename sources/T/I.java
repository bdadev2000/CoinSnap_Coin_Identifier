package T;

import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public final class I extends K {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2864e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(int i9, Class cls, int i10, int i11, int i12) {
        super(i9, cls, i10, i11);
        this.f2864e = i12;
    }

    @Override // T.K
    public final Object a(View view) {
        switch (this.f2864e) {
            case 0:
                return Boolean.valueOf(T.d(view));
            case 1:
                return T.b(view);
            case 2:
                return V.b(view);
            default:
                return Boolean.valueOf(T.c(view));
        }
    }

    @Override // T.K
    public final void b(View view, Object obj) {
        switch (this.f2864e) {
            case 0:
                T.j(view, ((Boolean) obj).booleanValue());
                return;
            case 1:
                T.h(view, (CharSequence) obj);
                return;
            case 2:
                V.f(view, (CharSequence) obj);
                return;
            default:
                T.g(view, ((Boolean) obj).booleanValue());
                return;
        }
    }

    @Override // T.K
    public final boolean e(Object obj, Object obj2) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        switch (this.f2864e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                boolean z12 = false;
                if (bool != null && bool.booleanValue()) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (bool2 != null && bool2.booleanValue()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z8 == z9) {
                    z12 = true;
                }
                return !z12;
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            case 2:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                boolean z13 = false;
                if (bool3 != null && bool3.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (bool4 != null && bool4.booleanValue()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    z13 = true;
                }
                return !z13;
        }
    }
}
