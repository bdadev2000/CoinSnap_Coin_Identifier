package com.facebook;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e2.C2216d;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class B implements x {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13379a;

    public B() {
        this.f13379a = new ArrayList();
    }

    @Override // com.facebook.x
    public void a(String str, String str2) {
        G7.j.e(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f13379a.add(String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str, URLEncoder.encode(str2, "UTF-8")}, 2)));
    }

    public synchronized N1.l b(Class cls) {
        int size = this.f13379a.size();
        for (int i9 = 0; i9 < size; i9++) {
            C2216d c2216d = (C2216d) this.f13379a.get(i9);
            if (c2216d.f20071a.isAssignableFrom(cls)) {
                return c2216d.b;
            }
        }
        return null;
    }

    public B(ArrayList arrayList) {
        this.f13379a = arrayList;
    }
}
