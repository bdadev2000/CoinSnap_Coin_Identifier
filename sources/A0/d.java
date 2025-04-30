package A0;

import F2.h;
import G7.j;
import P.g;
import Q7.C0238f;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.RequiresPermission;
import t7.y;
import x7.EnumC2928a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final MeasurementManager f1a;

    public d(Context context) {
        j.e(context, "context");
        Object systemService = context.getSystemService((Class<Object>) b.m());
        j.d(systemService, "context.getSystemService…:class.java\n            )");
        MeasurementManager c9 = b.c(systemService);
        j.e(c9, "mMeasurementManager");
        this.f1a = c9;
    }

    public Object a(a aVar, w7.f fVar) {
        new C0238f(1, h.x(fVar)).t();
        b.q();
        throw null;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public Object b(w7.f fVar) {
        C0238f c0238f = new C0238f(1, h.x(fVar));
        c0238f.t();
        this.f1a.getMeasurementApiStatus(new c(0), new g(c0238f));
        return c0238f.s();
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public Object c(Uri uri, InputEvent inputEvent, w7.f fVar) {
        C0238f c0238f = new C0238f(1, h.x(fVar));
        c0238f.t();
        this.f1a.registerSource(uri, inputEvent, new c(0), new g(c0238f));
        Object s5 = c0238f.s();
        if (s5 == EnumC2928a.b) {
            return s5;
        }
        return y.f23029a;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public Object d(Uri uri, w7.f fVar) {
        C0238f c0238f = new C0238f(1, h.x(fVar));
        c0238f.t();
        this.f1a.registerTrigger(uri, new c(0), new g(c0238f));
        Object s5 = c0238f.s();
        if (s5 == EnumC2928a.b) {
            return s5;
        }
        return y.f23029a;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public Object e(e eVar, w7.f fVar) {
        new C0238f(1, h.x(fVar)).t();
        b.B();
        throw null;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public Object f(f fVar, w7.f fVar2) {
        new C0238f(1, h.x(fVar2)).t();
        b.D();
        throw null;
    }
}
