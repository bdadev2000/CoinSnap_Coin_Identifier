package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class NavDeepLink$getMatchingArguments$missingRequiredArguments$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f20422a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavDeepLink$getMatchingArguments$missingRequiredArguments$1(Bundle bundle) {
        super(1);
        this.f20422a = bundle;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        p0.a.s((String) obj, "argName");
        return Boolean.valueOf(!this.f20422a.containsKey(r2));
    }
}
