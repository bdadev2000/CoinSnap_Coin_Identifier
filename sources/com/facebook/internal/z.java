package com.facebook.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: c, reason: collision with root package name */
    public static final L4.f f13680c = new L4.f(22);

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f13681d = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String f13682a;
    public StringBuilder b;

    public z() {
        AbstractC1839h.j("Request", "tag");
        this.f13682a = G7.j.j("Request", "FacebookSDK.");
        this.b = new StringBuilder();
    }

    public final void a(Object obj, String str) {
        G7.j.e(str, "key");
        G7.j.e(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        b();
    }

    public final void b() {
        com.facebook.r rVar = com.facebook.r.f13801a;
        com.facebook.r.h(com.facebook.H.b);
    }
}
