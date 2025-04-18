package androidx.navigation;

import android.os.Bundle;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class NavDestination$hasRequiredArguments$missingRequiredArguments$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f20446a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavDestination$hasRequiredArguments$missingRequiredArguments$1(Bundle bundle) {
        super(1);
        this.f20446a = bundle;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        p0.a.s((String) obj, SDKConstants.PARAM_KEY);
        return Boolean.valueOf(!this.f20446a.containsKey(r2));
    }
}
