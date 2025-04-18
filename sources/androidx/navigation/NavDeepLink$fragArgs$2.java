package androidx.navigation;

import d0.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class NavDeepLink$fragArgs$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavDeepLink f20418a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavDeepLink$fragArgs$2(NavDeepLink navDeepLink) {
        super(0);
        this.f20418a = navDeepLink;
    }

    @Override // q0.a
    public final Object invoke() {
        List list;
        k kVar = (k) this.f20418a.f20407j.getValue();
        return (kVar == null || (list = (List) kVar.f30134a) == null) ? new ArrayList() : list;
    }
}
