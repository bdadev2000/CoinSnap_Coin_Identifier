package n7;

import a5.C0398b;
import androidx.lifecycle.b0;
import androidx.lifecycle.d0;
import java.util.Map;
import r0.C2655c;
import r7.C2682b;

/* renamed from: n7.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2487e implements d0 {

    /* renamed from: d, reason: collision with root package name */
    public static final C0398b f21855d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Map f21856a;
    public final d0 b;

    /* renamed from: c, reason: collision with root package name */
    public final C2485c f21857c;

    public C2487e(C2682b c2682b, d0 d0Var, k8.c cVar) {
        this.f21856a = c2682b;
        this.b = d0Var;
        this.f21857c = new C2485c(cVar, 0);
    }

    @Override // androidx.lifecycle.d0
    public final b0 a(Class cls) {
        if (!this.f21856a.containsKey(cls)) {
            return this.b.a(cls);
        }
        this.f21857c.getClass();
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    @Override // androidx.lifecycle.d0
    public final b0 b(Class cls, C2655c c2655c) {
        if (this.f21856a.containsKey(cls)) {
            return this.f21857c.b(cls, c2655c);
        }
        return this.b.b(cls, c2655c);
    }
}
