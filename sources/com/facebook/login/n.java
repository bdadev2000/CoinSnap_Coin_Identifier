package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.EnumC1828f;
import com.facebook.internal.AbstractC1839h;
import com.facebook.internal.AbstractC1844m;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n extends B {
    public static final Parcelable.Creator<n> CREATOR = new com.facebook.y(6);

    /* renamed from: g, reason: collision with root package name */
    public final String f13735g;

    /* renamed from: h, reason: collision with root package name */
    public final EnumC1828f f13736h;

    public n(t tVar) {
        super(tVar);
        this.f13735g = "instagram_login";
        this.f13736h = EnumC1828f.INSTAGRAM_APPLICATION_WEB;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.z
    public final String f() {
        return this.f13735g;
    }

    @Override // com.facebook.login.z
    public final int l(q qVar) {
        Object obj;
        G7.j.e(qVar, com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        G7.j.d(jSONObject2, "e2e.toString()");
        com.facebook.internal.B b = com.facebook.internal.B.f13569a;
        Context f9 = e().f();
        if (f9 == null) {
            f9 = com.facebook.r.a();
        }
        String str = qVar.f13746f;
        Set set = qVar.f13744c;
        boolean c9 = qVar.c();
        d dVar = qVar.f13745d;
        if (dVar == null) {
            dVar = d.NONE;
        }
        d dVar2 = dVar;
        String d2 = d(qVar.f13747g);
        String str2 = qVar.f13750j;
        String str3 = qVar.l;
        boolean z8 = qVar.m;
        boolean z9 = qVar.f13753o;
        boolean z10 = qVar.f13754p;
        Intent intent = null;
        if (!O2.a.b(com.facebook.internal.B.class)) {
            try {
                G7.j.e(str, "applicationId");
                G7.j.e(set, "permissions");
                G7.j.e(str2, "authType");
                try {
                    Intent c10 = com.facebook.internal.B.f13569a.c(new com.facebook.internal.A(1), str, set, jSONObject2, c9, dVar2, d2, str2, false, str3, z8, A.INSTAGRAM, z9, z10, "");
                    if (!O2.a.b(com.facebook.internal.B.class) && c10 != null) {
                        try {
                            ResolveInfo resolveActivity = f9.getPackageManager().resolveActivity(c10, 0);
                            if (resolveActivity != null) {
                                HashSet hashSet = AbstractC1844m.f13621a;
                                String str4 = resolveActivity.activityInfo.packageName;
                                G7.j.d(str4, "resolveInfo.activityInfo.packageName");
                                if (AbstractC1844m.a(f9, str4)) {
                                    intent = c10;
                                }
                            }
                        } catch (Throwable th) {
                            obj = com.facebook.internal.B.class;
                            try {
                                O2.a.a(obj, th);
                            } catch (Throwable th2) {
                                th = th2;
                                O2.a.a(obj, th);
                                Intent intent2 = intent;
                                a("e2e", jSONObject2);
                                com.facebook.r rVar = com.facebook.r.f13801a;
                                AbstractC1839h.k();
                                return s(intent2) ? 1 : 0;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = com.facebook.internal.B.class;
                }
            } catch (Throwable th4) {
                th = th4;
                obj = com.facebook.internal.B.class;
            }
        }
        Intent intent22 = intent;
        a("e2e", jSONObject2);
        com.facebook.r rVar2 = com.facebook.r.f13801a;
        AbstractC1839h.k();
        return s(intent22) ? 1 : 0;
    }

    @Override // com.facebook.login.B
    public final EnumC1828f o() {
        return this.f13736h;
    }

    @Override // com.facebook.login.z, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        G7.j.e(parcel, "dest");
        super.writeToParcel(parcel, i9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Parcel parcel) {
        super(parcel, 0);
        G7.j.e(parcel, "source");
        this.f13735g = "instagram_login";
        this.f13736h = EnumC1828f.INSTAGRAM_APPLICATION_WEB;
    }
}
