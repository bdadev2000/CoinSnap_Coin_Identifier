package b1;

/* loaded from: classes4.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final k0 f22326a;

    static {
        String str;
        k0 k0Var;
        int i2 = g1.b0.f30594a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null || !Boolean.parseBoolean(str)) {
            k0Var = g0.f22320k;
        } else {
            h1.d dVar = o0.f22355a;
            h0.i iVar = g1.u.f30639a;
            c1.e eVar = ((c1.e) iVar).f22411g;
            k0Var = !(iVar instanceof k0) ? g0.f22320k : (k0) iVar;
        }
        f22326a = k0Var;
    }
}
