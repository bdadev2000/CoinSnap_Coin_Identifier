package L4;

import U4.p;
import android.content.Context;
import g4.C2296f;
import o4.C2496b;
import o4.C2499e;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements N4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1808a;
    public final /* synthetic */ Object b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1809c;

    public /* synthetic */ c(int i9, Object obj, Object obj2) {
        this.f1808a = i9;
        this.b = obj;
        this.f1809c = obj2;
    }

    @Override // N4.b
    public final Object get() {
        switch (this.f1808a) {
            case 0:
                return new i((Context) this.b, (String) this.f1809c);
            case 1:
                C2296f c2296f = (C2296f) this.f1809c;
                String d2 = c2296f.d();
                return new S4.a((Context) this.b, d2);
            default:
                C2499e c2499e = (C2499e) this.b;
                c2499e.getClass();
                C2496b c2496b = (C2496b) this.f1809c;
                return c2496b.f21948f.f(new p(c2496b, c2499e));
        }
    }

    public /* synthetic */ c(C2296f c2296f, Context context) {
        this.f1808a = 1;
        this.f1809c = c2296f;
        this.b = context;
    }
}
