package T1;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;

/* renamed from: T1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0299e implements v, i {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2969c;

    public /* synthetic */ C0299e(Context context, int i9) {
        this.b = i9;
        this.f2969c = context;
    }

    @Override // T1.i
    public Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // T1.i
    public Object c(Resources resources, int i9, Resources.Theme theme) {
        return resources.openRawResourceFd(i9);
    }

    @Override // T1.i
    public void e(Object obj) {
        ((AssetFileDescriptor) obj).close();
    }

    @Override // T1.v
    public u i(A a6) {
        switch (this.b) {
            case 0:
                return new C0296b(this.f2969c, this);
            case 1:
                return new q(this.f2969c, 0);
            default:
                return new C0296b(this.f2969c, a6.b(Integer.class, AssetFileDescriptor.class));
        }
    }
}
