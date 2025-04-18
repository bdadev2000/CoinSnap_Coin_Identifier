package h0;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.io.Serializable;
import q0.p;

/* loaded from: classes4.dex */
public final class m implements l, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final m f30726a = new Object();
    private static final long serialVersionUID = 0;

    private final Object readResolve() {
        return f30726a;
    }

    @Override // h0.l
    public final Object H(Object obj, p pVar) {
        return obj;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // h0.l
    public final j i(k kVar) {
        p0.a.s(kVar, SDKConstants.PARAM_KEY);
        return null;
    }

    @Override // h0.l
    public final l s(k kVar) {
        p0.a.s(kVar, SDKConstants.PARAM_KEY);
        return this;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // h0.l
    public final l u(l lVar) {
        p0.a.s(lVar, "context");
        return lVar;
    }
}
