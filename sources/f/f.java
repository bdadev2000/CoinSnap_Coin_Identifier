package f;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.content.ContextCompat;
import b1.o0;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import e0.e0;
import kotlin.jvm.internal.r;
import okio.FileSystem;
import okio.Path;

/* loaded from: classes.dex */
public final class f extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30384a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f30385b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, int i2) {
        super(0);
        this.f30384a = i2;
        this.f30385b = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [o.m] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, i.a] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // q0.a
    public final Object invoke() {
        o.l aVar;
        int i2;
        i.n nVar;
        int i3 = 0;
        switch (this.f30384a) {
            case 0:
                Context context = this.f30385b.f30387a;
                o.b bVar = new o.b(context);
                ?? kVar = bVar.f31166c ? new o.k() : new Object();
                if (bVar.f31165b) {
                    double d = bVar.f31164a;
                    if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        Bitmap.Config[] configArr = v.g.f31378a;
                        try {
                            Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
                            p0.a.p(systemService);
                            ActivityManager activityManager = (ActivityManager) systemService;
                            i2 = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                        } catch (Exception unused) {
                            i2 = 256;
                        }
                        double d2 = d * i2;
                        double d3 = 1024;
                        i3 = (int) (d2 * d3 * d3);
                    }
                    aVar = i3 > 0 ? new o.i(i3, kVar) : new o.a(kVar);
                } else {
                    aVar = new o.a(kVar);
                }
                return new o.f(aVar, kVar);
            default:
                v.m mVar = v.m.f31390a;
                Context context2 = this.f30385b.f30387a;
                synchronized (mVar) {
                    nVar = v.m.f31391b;
                    if (nVar == null) {
                        ?? obj = new Object();
                        obj.f30765b = FileSystem.SYSTEM;
                        obj.f30766c = 0.02d;
                        obj.d = 10485760L;
                        obj.e = 262144000L;
                        obj.f30767f = o0.f22356b;
                        obj.f30764a = Path.Companion.get$default(Path.Companion, e0.v(v.g.c(context2)), false, 1, (Object) null);
                        nVar = obj.a();
                        v.m.f31391b = nVar;
                    }
                }
                return nVar;
        }
    }
}
