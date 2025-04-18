package vd;

import android.view.View;
import androidx.emoji2.text.t;

/* loaded from: classes4.dex */
public abstract class b {
    public static i a(t tVar, android.support.v4.media.d dVar) {
        if (com.facebook.appevents.g.f10941f.b()) {
            return new i(tVar, dVar);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void b();

    public abstract void c(View view);

    public abstract void d();
}
