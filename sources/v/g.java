package v;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.facebook.share.internal.ShareInternalUtility;
import com.google.android.gms.common.api.Api;
import e0.u;
import java.io.Closeable;
import java.io.File;
import okhttp3.Headers;

/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Bitmap.Config[] f31378a = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};

    /* renamed from: b, reason: collision with root package name */
    public static final Bitmap.Config f31379b = Bitmap.Config.HARDWARE;

    /* renamed from: c, reason: collision with root package name */
    public static final Headers f31380c = new Headers.Builder().build();

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || z0.m.Z0(str)) {
            return null;
        }
        String x1 = z0.m.x1(z0.m.x1(str, '#'), '?');
        return mimeTypeMap.getMimeTypeFromExtension(z0.m.u1(z0.m.u1(x1, '/', x1), '.', ""));
    }

    public static final File c(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            throw new IllegalStateException("cacheDir == null".toString());
        }
        cacheDir.mkdirs();
        return cacheDir;
    }

    public static final boolean d(Uri uri) {
        return p0.a.g(uri.getScheme(), ShareInternalUtility.STAGING_PARAM) && p0.a.g((String) u.F0(uri.getPathSegments()), "android_asset");
    }

    public static final int e(p0.a aVar, r.f fVar) {
        if (aVar instanceof r.a) {
            return ((r.a) aVar).f31339a;
        }
        int ordinal = fVar.ordinal();
        if (ordinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (ordinal == 1) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        throw new RuntimeException();
    }
}
