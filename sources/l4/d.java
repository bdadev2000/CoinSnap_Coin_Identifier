package l4;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import e4.m;
import k4.x;
import k4.y;

/* loaded from: classes.dex */
public final class d implements y {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final y f21135b;

    /* renamed from: c, reason: collision with root package name */
    public final y f21136c;

    /* renamed from: d, reason: collision with root package name */
    public final Class f21137d;

    public d(Context context, y yVar, y yVar2, Class cls) {
        this.a = context.getApplicationContext();
        this.f21135b = yVar;
        this.f21136c = yVar2;
        this.f21137d = cls;
    }

    @Override // k4.y
    public final boolean a(Object obj) {
        Uri uri = (Uri) obj;
        if (Build.VERSION.SDK_INT >= 29 && c6.c.u(uri)) {
            return true;
        }
        return false;
    }

    @Override // k4.y
    public final x b(Object obj, int i10, int i11, m mVar) {
        Uri uri = (Uri) obj;
        return new x(new v4.d(uri), new c(this.a, this.f21135b, this.f21136c, uri, i10, i11, mVar, this.f21137d));
    }
}
