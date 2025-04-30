package T;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import j5.C2400c;
import java.util.Objects;

/* loaded from: classes.dex */
public final class X implements OnReceiveContentListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0293y f2872a;

    public X(InterfaceC0293y interfaceC0293y) {
        this.f2872a = interfaceC0293y;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0268f c0268f = new C0268f(new C2400c(contentInfo));
        C0268f a6 = ((Z.r) this.f2872a).a(view, c0268f);
        if (a6 == null) {
            return null;
        }
        if (a6 == c0268f) {
            return contentInfo;
        }
        ContentInfo g9 = a6.f2885a.g();
        Objects.requireNonNull(g9);
        return B3.a.n(g9);
    }
}
