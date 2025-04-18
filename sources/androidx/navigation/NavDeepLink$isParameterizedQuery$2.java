package androidx.navigation;

import android.net.Uri;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class NavDeepLink$isParameterizedQuery$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavDeepLink f20423a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavDeepLink$isParameterizedQuery$2(NavDeepLink navDeepLink) {
        super(0);
        this.f20423a = navDeepLink;
    }

    @Override // q0.a
    public final Object invoke() {
        String str = this.f20423a.f20400a;
        return Boolean.valueOf((str == null || Uri.parse(str).getQuery() == null) ? false : true);
    }
}
