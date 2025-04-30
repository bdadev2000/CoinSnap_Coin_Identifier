package U1;

import N1.i;
import T1.t;
import T1.u;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import i2.C2341d;

/* loaded from: classes.dex */
public final class e implements u {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3123a;
    public final u b;

    /* renamed from: c, reason: collision with root package name */
    public final u f3124c;

    /* renamed from: d, reason: collision with root package name */
    public final Class f3125d;

    public e(Context context, u uVar, u uVar2, Class cls) {
        this.f3123a = context.getApplicationContext();
        this.b = uVar;
        this.f3124c = uVar2;
        this.f3125d = cls;
    }

    @Override // T1.u
    public final boolean a(Object obj) {
        Uri uri = (Uri) obj;
        if (Build.VERSION.SDK_INT >= 29 && R2.b.s(uri)) {
            return true;
        }
        return false;
    }

    @Override // T1.u
    public final t b(Object obj, int i9, int i10, i iVar) {
        Uri uri = (Uri) obj;
        return new t(new C2341d(uri), new d(this.f3123a, this.b, this.f3124c, uri, i9, i10, iVar, this.f3125d));
    }
}
