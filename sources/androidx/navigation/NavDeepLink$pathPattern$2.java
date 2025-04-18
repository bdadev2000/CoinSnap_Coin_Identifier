package androidx.navigation;

import java.util.regex.Pattern;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavDeepLink$pathPattern$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavDeepLink f20425a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavDeepLink$pathPattern$2(NavDeepLink navDeepLink) {
        super(0);
        this.f20425a = navDeepLink;
    }

    @Override // q0.a
    public final Object invoke() {
        String str = this.f20425a.e;
        if (str != null) {
            return Pattern.compile(str, 2);
        }
        return null;
    }
}
