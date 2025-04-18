package kd;

import android.view.View;
import androidx.emoji2.text.t;

/* loaded from: classes4.dex */
public abstract class b {
    public static i b(t tVar, android.support.v4.media.d dVar) {
        if (com.facebook.appevents.i.f10946b.b()) {
            return new i(tVar, dVar);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void a(View view, e eVar);

    public abstract void c();

    public abstract void d(View view);

    public abstract void e();

    public abstract void f();
}
