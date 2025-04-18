package k4;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class i implements z, l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20240b;

    /* renamed from: c, reason: collision with root package name */
    public Context f20241c;

    public i() {
        this.f20240b = 2;
    }

    @Override // k4.l
    public final Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // k4.l
    public final void b(Object obj) {
        ((AssetFileDescriptor) obj).close();
    }

    @Override // k4.z
    public final y c(d0 d0Var) {
        switch (this.f20240b) {
            case 0:
                return new m(this.f20241c, this);
            default:
                return new v(this.f20241c, 1);
        }
    }

    @Override // k4.l
    public final Object e(Resources resources, int i10, Resources.Theme theme) {
        return resources.openRawResourceFd(i10);
    }

    public /* synthetic */ i(Context context, int i10) {
        this.f20240b = i10;
        this.f20241c = context;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10) {
        this();
        this.f20240b = 2;
    }
}
