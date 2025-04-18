package k4;

import android.content.res.AssetManager;
import android.net.Uri;

/* loaded from: classes.dex */
public final class b implements y {
    public final AssetManager a;

    /* renamed from: b, reason: collision with root package name */
    public final a f20214b;

    public b(AssetManager assetManager, a aVar) {
        this.a = assetManager;
        this.f20214b = aVar;
    }

    @Override // k4.y
    public final boolean a(Object obj) {
        Uri uri = (Uri) obj;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    @Override // k4.y
    public final x b(Object obj, int i10, int i11, e4.m mVar) {
        Uri uri = (Uri) obj;
        return new x(new v4.d(uri), this.f20214b.o(this.a, uri.toString().substring(22)));
    }
}
