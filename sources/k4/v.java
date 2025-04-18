package k4;

import android.content.Context;
import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes.dex */
public final class v implements y {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f20266b;

    public v(Context context, int i10) {
        this.a = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                this.f20266b = context;
                return;
            } else {
                this.f20266b = context.getApplicationContext();
                return;
            }
        }
        this.f20266b = context.getApplicationContext();
    }

    @Override // k4.y
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        switch (this.a) {
            case 0:
                return d((Uri) obj);
            case 1:
                return d((Uri) obj);
            default:
                return d((Uri) obj);
        }
    }

    @Override // k4.y
    public final /* bridge */ /* synthetic */ x b(Object obj, int i10, int i11, e4.m mVar) {
        switch (this.a) {
            case 0:
                return c((Uri) obj, i10, i11, mVar);
            case 1:
                return c((Uri) obj, i10, i11, mVar);
            default:
                return c((Uri) obj, i10, i11, mVar);
        }
    }

    public final x c(Uri uri, int i10, int i11, e4.m mVar) {
        boolean z10;
        boolean z11 = true;
        int i12 = this.a;
        Context context = this.f20266b;
        switch (i12) {
            case 0:
                return new x(new v4.d(uri), new u(context, uri));
            case 1:
                if (i10 == Integer.MIN_VALUE || i11 == Integer.MIN_VALUE || i10 > 512 || i11 > 384) {
                    z11 = false;
                }
                if (!z11) {
                    return null;
                }
                return new x(new v4.d(uri), f4.c.c(context, uri, new f4.a(context.getContentResolver())));
            default:
                if (i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && i10 <= 512 && i11 <= 384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    return null;
                }
                Long l10 = (Long) mVar.c(n4.f0.f22410d);
                if (l10 == null || l10.longValue() != -1) {
                    z11 = false;
                }
                if (!z11) {
                    return null;
                }
                return new x(new v4.d(uri), f4.c.c(context, uri, new f4.b(context.getContentResolver())));
        }
    }

    public final boolean d(Uri uri) {
        switch (this.a) {
            case 0:
                return c6.c.u(uri);
            case 1:
                if (c6.c.u(uri) && !uri.getPathSegments().contains(MimeTypes.BASE_TYPE_VIDEO)) {
                    return true;
                }
                return false;
            default:
                if (c6.c.u(uri) && uri.getPathSegments().contains(MimeTypes.BASE_TYPE_VIDEO)) {
                    return true;
                }
                return false;
        }
    }
}
