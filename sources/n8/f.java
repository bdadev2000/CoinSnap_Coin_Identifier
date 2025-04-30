package n8;

import G7.j;
import J1.B;
import androidx.core.app.NotificationCompat;
import i8.C;
import i8.I;
import i8.v;
import i8.w;
import java.util.List;
import m8.i;

/* loaded from: classes3.dex */
public final class f implements v {

    /* renamed from: a, reason: collision with root package name */
    public final i f21863a;
    public final List b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21864c;

    /* renamed from: d, reason: collision with root package name */
    public final B f21865d;

    /* renamed from: e, reason: collision with root package name */
    public final C f21866e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21867f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21868g;

    /* renamed from: h, reason: collision with root package name */
    public final int f21869h;

    /* renamed from: i, reason: collision with root package name */
    public int f21870i;

    public f(i iVar, List list, int i9, B b, C c9, int i10, int i11, int i12) {
        j.e(iVar, NotificationCompat.CATEGORY_CALL);
        j.e(list, "interceptors");
        j.e(c9, com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA);
        this.f21863a = iVar;
        this.b = list;
        this.f21864c = i9;
        this.f21865d = b;
        this.f21866e = c9;
        this.f21867f = i10;
        this.f21868g = i11;
        this.f21869h = i12;
    }

    public static f a(f fVar, int i9, B b, C c9, int i10) {
        if ((i10 & 1) != 0) {
            i9 = fVar.f21864c;
        }
        int i11 = i9;
        if ((i10 & 2) != 0) {
            b = fVar.f21865d;
        }
        B b8 = b;
        if ((i10 & 4) != 0) {
            c9 = fVar.f21866e;
        }
        C c10 = c9;
        int i12 = fVar.f21867f;
        int i13 = fVar.f21868g;
        int i14 = fVar.f21869h;
        fVar.getClass();
        j.e(c10, com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA);
        return new f(fVar.f21863a, fVar.b, i11, b8, c10, i12, i13, i14);
    }

    public final I b(C c9) {
        j.e(c9, com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA);
        List list = this.b;
        int size = list.size();
        int i9 = this.f21864c;
        if (i9 < size) {
            this.f21870i++;
            B b = this.f21865d;
            if (b != null) {
                if (((m8.e) b.f1489d).b(c9.f20754a)) {
                    if (this.f21870i != 1) {
                        throw new IllegalStateException(("network interceptor " + list.get(i9 - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + list.get(i9 - 1) + " must retain the same host and port").toString());
                }
            }
            int i10 = i9 + 1;
            f a6 = a(this, i10, null, c9, 58);
            w wVar = (w) list.get(i9);
            I intercept = wVar.intercept(a6);
            if (intercept != null) {
                if (b != null && i10 < list.size() && a6.f21870i != 1) {
                    throw new IllegalStateException(("network interceptor " + wVar + " must call proceed() exactly once").toString());
                }
                if (intercept.f20779i != null) {
                    return intercept;
                }
                throw new IllegalStateException(("interceptor " + wVar + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + wVar + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
