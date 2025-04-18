package k4;

import java.io.File;

/* loaded from: classes.dex */
public final class g implements y {
    public final /* synthetic */ int a;

    public /* synthetic */ g(int i10) {
        this.a = i10;
    }

    @Override // k4.y
    public final boolean a(Object obj) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // k4.y
    public final x b(Object obj, int i10, int i11, e4.m mVar) {
        switch (this.a) {
            case 0:
                File file = (File) obj;
                return new x(new v4.d(file), new f(file, 0));
            default:
                return null;
        }
    }
}
