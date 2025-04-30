package r4;

import android.util.Log;
import com.applovin.impl.V1;
import java.util.concurrent.atomic.AtomicReference;
import o4.o;
import w4.C2891m0;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final d f22837c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final o f22838a;
    public final AtomicReference b = new AtomicReference(null);

    public a(o oVar) {
        this.f22838a = oVar;
        oVar.a(new F2.d(this, 28));
    }

    public final d a(String str) {
        a aVar = (a) this.b.get();
        if (aVar == null) {
            return f22837c;
        }
        return aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.b.get();
        if (aVar != null && aVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        a aVar = (a) this.b.get();
        if (aVar != null && aVar.c(str)) {
            return true;
        }
        return false;
    }

    public final void d(String str, long j7, C2891m0 c2891m0) {
        String d2 = AbstractC2914a.d("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", d2, null);
        }
        this.f22838a.a(new V1(str, j7, c2891m0));
    }
}
