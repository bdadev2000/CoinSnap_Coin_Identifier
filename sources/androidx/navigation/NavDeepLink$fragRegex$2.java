package androidx.navigation;

import d0.k;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavDeepLink$fragRegex$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavDeepLink f20421a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavDeepLink$fragRegex$2(NavDeepLink navDeepLink) {
        super(0);
        this.f20421a = navDeepLink;
    }

    @Override // q0.a
    public final Object invoke() {
        k kVar = (k) this.f20421a.f20407j.getValue();
        if (kVar != null) {
            return (String) kVar.f30135b;
        }
        return null;
    }
}
