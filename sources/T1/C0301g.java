package T1;

import android.content.Context;
import android.content.res.Resources;
import java.io.InputStream;

/* renamed from: T1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0301g implements v, i {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2971c;

    public /* synthetic */ C0301g(Context context, int i9) {
        this.b = i9;
        this.f2971c = context;
    }

    @Override // T1.i
    public Class a() {
        return InputStream.class;
    }

    @Override // T1.i
    public Object c(Resources resources, int i9, Resources.Theme theme) {
        return resources.openRawResource(i9);
    }

    @Override // T1.i
    public void e(Object obj) {
        ((InputStream) obj).close();
    }

    @Override // T1.v
    public final u i(A a6) {
        switch (this.b) {
            case 0:
                return new C0296b(this.f2971c, this);
            default:
                return new q(this.f2971c, 2);
        }
    }
}
