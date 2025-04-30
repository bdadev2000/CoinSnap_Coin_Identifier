package T1;

import i2.C2341d;
import java.io.File;

/* loaded from: classes.dex */
public final class E implements u {
    public static final E b = new E(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2962a;

    public /* synthetic */ E(int i9) {
        this.f2962a = i9;
    }

    @Override // T1.u
    public final boolean a(Object obj) {
        switch (this.f2962a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // T1.u
    public final t b(Object obj, int i9, int i10, N1.i iVar) {
        switch (this.f2962a) {
            case 0:
                return new t(new C2341d(obj), new C0298d(obj, 1));
            case 1:
                File file = (File) obj;
                return new t(new C2341d(file), new C0298d(file, 0));
            default:
                return null;
        }
    }
}
