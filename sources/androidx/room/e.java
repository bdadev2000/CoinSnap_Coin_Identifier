package androidx.room;

import android.os.Bundle;
import com.applovin.sdk.AppLovinPostbackListener;
import com.facebook.bolts.CancellationToken;
import com.facebook.bolts.Task;
import com.facebook.bolts.TaskCompletionSource;
import com.facebook.login.CustomTabLoginMethodHandler;
import com.facebook.login.LoginClient;
import com.facebook.login.NativeAppLoginMethodHandler;
import com.google.android.gms.common.util.BiConsumer;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.swordfish.libretrodroid.GLRetroView;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.f0;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21406a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21407b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21408c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e(Object obj, int i2, Object obj2, Object obj3) {
        this.f21406a = i2;
        this.f21408c = obj;
        this.f21407b = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f21406a;
        Object obj = this.d;
        Object obj2 = this.f21407b;
        Object obj3 = this.f21408c;
        switch (i2) {
            case 0:
                QueryInterceptorDatabase queryInterceptorDatabase = (QueryInterceptorDatabase) obj3;
                p0.a.s(queryInterceptorDatabase, "this$0");
                p0.a.s((String) obj2, "$sql");
                p0.a.s((List) obj, "$inputArguments");
                queryInterceptorDatabase.f21317c.a();
                return;
            case 1:
                ((com.applovin.impl.adview.a) obj3).a((String) obj2, (String) obj);
                return;
            case 2:
                ((com.applovin.impl.sdk.network.b) obj3).b((com.applovin.impl.sdk.network.d) obj2, (AppLovinPostbackListener) obj);
                return;
            case 3:
                Task.Companion.m497call$lambda2((CancellationToken) obj3, (TaskCompletionSource) obj2, (Callable) obj);
                return;
            case 4:
                CustomTabLoginMethodHandler.b((CustomTabLoginMethodHandler) obj3, (LoginClient.Request) obj2, (Bundle) obj);
                return;
            case 5:
                NativeAppLoginMethodHandler.b((NativeAppLoginMethodHandler) obj3, (LoginClient.Request) obj2, (Bundle) obj);
                return;
            case 6:
                ConfigGetParameterHandler.a((BiConsumer) obj3, (String) obj2, (ConfigContainer) obj);
                return;
            default:
                GLRetroView.m612runOnGLThread$lambda7((f0) obj3, (q0.a) obj2, (CountDownLatch) obj);
                return;
        }
    }
}
