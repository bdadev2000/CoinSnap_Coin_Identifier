package ei;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes5.dex */
public final class m extends ai.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f17435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f17436f = false;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e0 f17437g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, n nVar, e0 e0Var) {
        super(str, true);
        this.f17435e = nVar;
        this.f17437g = e0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, ei.e0] */
    /* JADX WARN: Type inference failed for: r2v3 */
    @Override // ai.a
    public final long a() {
        ?? r22;
        long a;
        int i10;
        a0[] a0VarArr;
        n nVar = this.f17435e;
        boolean z10 = this.f17436f;
        e0 settings = this.f17437g;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(settings, "settings");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        t tVar = nVar.f17439c;
        synchronized (tVar.A) {
            synchronized (tVar) {
                e0 e0Var = tVar.u;
                if (z10) {
                    r22 = settings;
                } else {
                    e0 e0Var2 = new e0();
                    e0Var2.b(e0Var);
                    e0Var2.b(settings);
                    r22 = e0Var2;
                }
                objectRef.element = r22;
                a = r22.a() - e0Var.a();
                i10 = 0;
                if (a != 0 && !tVar.f17458d.isEmpty()) {
                    Object[] array = tVar.f17458d.values().toArray(new a0[0]);
                    if (array != null) {
                        a0VarArr = (a0[]) array;
                        e0 e0Var3 = (e0) objectRef.element;
                        Intrinsics.checkNotNullParameter(e0Var3, "<set-?>");
                        tVar.u = e0Var3;
                        tVar.f17466m.c(new k(Intrinsics.stringPlus(tVar.f17459f, " onSettings"), tVar, objectRef, 0), 0L);
                        Unit unit = Unit.INSTANCE;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                }
                a0VarArr = null;
                e0 e0Var32 = (e0) objectRef.element;
                Intrinsics.checkNotNullParameter(e0Var32, "<set-?>");
                tVar.u = e0Var32;
                tVar.f17466m.c(new k(Intrinsics.stringPlus(tVar.f17459f, " onSettings"), tVar, objectRef, 0), 0L);
                Unit unit2 = Unit.INSTANCE;
            }
            try {
                tVar.A.d((e0) objectRef.element);
            } catch (IOException e2) {
                tVar.g(e2);
            }
            Unit unit3 = Unit.INSTANCE;
        }
        if (a0VarArr != null) {
            int length = a0VarArr.length;
            while (i10 < length) {
                a0 a0Var = a0VarArr[i10];
                i10++;
                synchronized (a0Var) {
                    a0Var.f17366f += a;
                    if (a > 0) {
                        a0Var.notifyAll();
                    }
                    Unit unit4 = Unit.INSTANCE;
                }
            }
            return -1L;
        }
        return -1L;
    }
}
