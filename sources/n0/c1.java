package n0;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c1 implements OnReceiveContentListener {
    public final a0 a;

    public c1(a0 a0Var) {
        this.a = a0Var;
    }

    @Override // android.view.OnReceiveContentListener
    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        g gVar = new g(new v3.c(contentInfo));
        g a = ((t0.q) this.a).a(view, gVar);
        if (a == null) {
            return null;
        }
        if (a == gVar) {
            return contentInfo;
        }
        ContentInfo m10 = a.a.m();
        Objects.requireNonNull(m10);
        return com.google.android.gms.internal.ads.b.m(m10);
    }
}
