package a4;

import android.content.Context;

/* loaded from: classes.dex */
public final class c {
    public volatile p a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f85b;

    /* renamed from: c, reason: collision with root package name */
    public volatile x f86c;

    public /* synthetic */ c(Context context) {
        this.f85b = context;
    }

    public final d a() {
        if (this.f85b != null) {
            if (this.f86c != null) {
                if (this.a != null && this.a.a) {
                    if (this.f86c != null) {
                        return new d(this.a, this.f85b, this.f86c);
                    }
                    return new d(this.a, this.f85b);
                }
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }
        throw new IllegalArgumentException("Please provide a valid Context.");
    }

    public final void b() {
        p pVar = new p();
        pVar.a = true;
        this.a = new p(pVar.f154b);
    }
}
