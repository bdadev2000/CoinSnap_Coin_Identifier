package k4;

import android.content.Context;
import android.content.res.Resources;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class j implements z, l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20243b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f20244c;

    public /* synthetic */ j(Context context, int i10) {
        this.f20243b = i10;
        this.f20244c = context;
    }

    @Override // k4.l
    public final Class a() {
        return InputStream.class;
    }

    @Override // k4.l
    public final void b(Object obj) {
        ((InputStream) obj).close();
    }

    @Override // k4.z
    public final y c(d0 d0Var) {
        int i10 = this.f20243b;
        Context context = this.f20244c;
        switch (i10) {
            case 0:
                return new m(context, this);
            default:
                return new m(context, d0Var.b(Integer.class, InputStream.class));
        }
    }

    @Override // k4.l
    public final Object e(Resources resources, int i10, Resources.Theme theme) {
        return resources.openRawResource(i10);
    }
}
