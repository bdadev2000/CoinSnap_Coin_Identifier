package androidx.navigation;

import android.net.Uri;
import d0.k;
import java.util.ArrayList;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class NavDeepLink$fragArgsAndRegex$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavDeepLink f20419a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavDeepLink$fragArgsAndRegex$2(NavDeepLink navDeepLink) {
        super(0);
        this.f20419a = navDeepLink;
    }

    @Override // q0.a
    public final Object invoke() {
        String str = this.f20419a.f20400a;
        if (str == null || Uri.parse(str).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = Uri.parse(str).getFragment();
        StringBuilder sb = new StringBuilder();
        p0.a.p(fragment);
        NavDeepLink.a(fragment, arrayList, sb);
        String sb2 = sb.toString();
        p0.a.r(sb2, "fragRegex.toString()");
        return new k(arrayList, sb2);
    }
}
