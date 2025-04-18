package androidx.navigation;

import android.os.Bundle;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class NavGraphNavigator$navigate$missingRequiredArgs$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f20471a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphNavigator$navigate$missingRequiredArgs$1(f0 f0Var) {
        super(1);
        this.f20471a = f0Var;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        String str = (String) obj;
        p0.a.s(str, SDKConstants.PARAM_KEY);
        Object obj2 = this.f20471a.f30930a;
        boolean z2 = true;
        if (obj2 != null && ((Bundle) obj2).containsKey(str)) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
