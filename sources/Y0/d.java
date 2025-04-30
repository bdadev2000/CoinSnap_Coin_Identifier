package y0;

import A0.f;
import G7.j;
import Q7.AbstractC0255x;
import Q7.F;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.RequiresPermission;
import com.vungle.ads.internal.ui.i;

/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: a, reason: collision with root package name */
    public final A0.d f24284a;

    public d(A0.d dVar) {
        this.f24284a = dVar;
    }

    @Override // y0.e
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public f4.c b() {
        return y8.a.b(AbstractC0255x.b(AbstractC0255x.a(F.f2529a), new C2940a(this, null)));
    }

    @Override // y0.e
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public f4.c c(Uri uri, InputEvent inputEvent) {
        j.e(uri, "attributionSource");
        return y8.a.b(AbstractC0255x.b(AbstractC0255x.a(F.f2529a), new C2941b(this, uri, inputEvent, null)));
    }

    @Override // y0.e
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public f4.c d(Uri uri) {
        j.e(uri, "trigger");
        return y8.a.b(AbstractC0255x.b(AbstractC0255x.a(F.f2529a), new c(this, uri, null)));
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public f4.c e(A0.a aVar) {
        j.e(aVar, "deletionRequest");
        throw null;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public f4.c f(A0.e eVar) {
        j.e(eVar, i.REQUEST_KEY_EXTRA);
        throw null;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public f4.c g(f fVar) {
        j.e(fVar, i.REQUEST_KEY_EXTRA);
        throw null;
    }
}
