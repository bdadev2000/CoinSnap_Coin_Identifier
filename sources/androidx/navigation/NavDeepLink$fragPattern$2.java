package androidx.navigation;

import java.util.regex.Pattern;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class NavDeepLink$fragPattern$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavDeepLink f20420a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavDeepLink$fragPattern$2(NavDeepLink navDeepLink) {
        super(0);
        this.f20420a = navDeepLink;
    }

    @Override // q0.a
    public final Object invoke() {
        String str = (String) this.f20420a.f20409l.getValue();
        if (str != null) {
            return Pattern.compile(str, 2);
        }
        return null;
    }
}
