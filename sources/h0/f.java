package h0;

import b1.f0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import d0.b0;
import java.io.Serializable;
import q0.p;

/* loaded from: classes4.dex */
public final class f implements l, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final l f30723a;

    /* renamed from: b, reason: collision with root package name */
    public final j f30724b;

    public f(j jVar, l lVar) {
        p0.a.s(lVar, ViewHierarchyConstants.DIMENSION_LEFT_KEY);
        p0.a.s(jVar, "element");
        this.f30723a = lVar;
        this.f30724b = jVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    private final Object writeReplace() {
        int b2 = b();
        l[] lVarArr = new l[b2];
        ?? obj = new Object();
        H(b0.f30125a, new e(lVarArr, obj));
        if (obj.f30925a == b2) {
            return new c(lVarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // h0.l
    public final Object H(Object obj, p pVar) {
        return pVar.invoke(this.f30723a.H(obj, pVar), this.f30724b);
    }

    public final int b() {
        int i2 = 2;
        f fVar = this;
        while (true) {
            l lVar = fVar.f30723a;
            fVar = lVar instanceof f ? (f) lVar : null;
            if (fVar == null) {
                return i2;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (fVar.b() == b()) {
                    f fVar2 = this;
                    while (true) {
                        j jVar = fVar2.f30724b;
                        if (!p0.a.g(fVar.i(jVar.getKey()), jVar)) {
                            break;
                        }
                        l lVar = fVar2.f30723a;
                        if (lVar instanceof f) {
                            fVar2 = (f) lVar;
                        } else {
                            p0.a.q(lVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                            j jVar2 = (j) lVar;
                            if (p0.a.g(fVar.i(jVar2.getKey()), jVar2)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f30724b.hashCode() + this.f30723a.hashCode();
    }

    @Override // h0.l
    public final j i(k kVar) {
        p0.a.s(kVar, SDKConstants.PARAM_KEY);
        f fVar = this;
        while (true) {
            j i2 = fVar.f30724b.i(kVar);
            if (i2 != null) {
                return i2;
            }
            l lVar = fVar.f30723a;
            if (!(lVar instanceof f)) {
                return lVar.i(kVar);
            }
            fVar = (f) lVar;
        }
    }

    @Override // h0.l
    public final l s(k kVar) {
        p0.a.s(kVar, SDKConstants.PARAM_KEY);
        j jVar = this.f30724b;
        j i2 = jVar.i(kVar);
        l lVar = this.f30723a;
        if (i2 != null) {
            return lVar;
        }
        l s2 = lVar.s(kVar);
        return s2 == lVar ? this : s2 == m.f30726a ? jVar : new f(jVar, s2);
    }

    public final String toString() {
        return android.support.v4.media.d.q(new StringBuilder("["), (String) H("", d.f30718b), ']');
    }

    @Override // h0.l
    public final l u(l lVar) {
        return f0.y(this, lVar);
    }
}
