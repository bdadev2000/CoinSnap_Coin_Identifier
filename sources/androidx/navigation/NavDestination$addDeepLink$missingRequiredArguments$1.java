package androidx.navigation;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class NavDestination$addDeepLink$missingRequiredArguments$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavDeepLink f20445a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavDestination$addDeepLink$missingRequiredArguments$1(NavDeepLink navDeepLink) {
        super(1);
        this.f20445a = navDeepLink;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        p0.a.s((String) obj, SDKConstants.PARAM_KEY);
        return Boolean.valueOf(!this.f20445a.c().contains(r2));
    }
}
