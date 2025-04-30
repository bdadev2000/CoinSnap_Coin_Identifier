package T1;

import android.content.Context;
import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import i2.C2341d;

/* loaded from: classes.dex */
public final class q implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2989a;
    public final Context b;

    public q(Context context, int i9) {
        this.f2989a = i9;
        switch (i9) {
            case 1:
                this.b = context.getApplicationContext();
                return;
            case 2:
                this.b = context.getApplicationContext();
                return;
            default:
                this.b = context;
                return;
        }
    }

    @Override // T1.u
    public final boolean a(Object obj) {
        switch (this.f2989a) {
            case 0:
                return R2.b.s((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                if (R2.b.s(uri) && !uri.getPathSegments().contains(MimeTypes.BASE_TYPE_VIDEO)) {
                    return true;
                }
                return false;
            default:
                Uri uri2 = (Uri) obj;
                if (R2.b.s(uri2) && uri2.getPathSegments().contains(MimeTypes.BASE_TYPE_VIDEO)) {
                    return true;
                }
                return false;
        }
    }

    @Override // T1.u
    public final t b(Object obj, int i9, int i10, N1.i iVar) {
        Long l;
        switch (this.f2989a) {
            case 0:
                Uri uri = (Uri) obj;
                return new t(new C2341d(uri), new p(0, this.b, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i9 != Integer.MIN_VALUE && i10 != Integer.MIN_VALUE && i9 <= 512 && i10 <= 384) {
                    C2341d c2341d = new C2341d(uri2);
                    Context context = this.b;
                    return new t(c2341d, O1.b.c(context, uri2, new O1.a(context.getContentResolver(), 0)));
                }
                return null;
            default:
                Uri uri3 = (Uri) obj;
                if (i9 != Integer.MIN_VALUE && i10 != Integer.MIN_VALUE && i9 <= 512 && i10 <= 384 && (l = (Long) iVar.c(W1.H.f3563d)) != null && l.longValue() == -1) {
                    C2341d c2341d2 = new C2341d(uri3);
                    Context context2 = this.b;
                    return new t(c2341d2, O1.b.c(context2, uri3, new O1.a(context2.getContentResolver(), 1)));
                }
                return null;
        }
    }
}
