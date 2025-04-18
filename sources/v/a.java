package v;

import com.google.android.gms.common.api.Api;

/* loaded from: classes3.dex */
public abstract class a {
    public static final int a(p0.a aVar, r.f fVar) {
        if (aVar instanceof r.a) {
            return ((r.a) aVar).f31339a;
        }
        int ordinal = fVar.ordinal();
        if (ordinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (ordinal == 1) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        throw new RuntimeException();
    }
}
