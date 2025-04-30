package R5;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final X5.a f2746a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final O5.g f2747c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2748d = null;

    /* JADX WARN: Type inference failed for: r0v0, types: [X5.a, java.lang.ref.WeakReference] */
    public f(View view, O5.g gVar) {
        this.f2746a = new WeakReference(view);
        this.b = view.getClass().getCanonicalName();
        this.f2747c = gVar;
    }
}
