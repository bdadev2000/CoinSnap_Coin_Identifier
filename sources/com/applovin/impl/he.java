package com.applovin.impl;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.applovin.impl.fe;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.yb;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class he extends zb {

    /* renamed from: f, reason: collision with root package name */
    private final fe f8125f;

    /* renamed from: g, reason: collision with root package name */
    private List f8126g;

    /* renamed from: h, reason: collision with root package name */
    private final List f8127h;

    /* renamed from: i, reason: collision with root package name */
    private final List f8128i;

    /* renamed from: j, reason: collision with root package name */
    private final List f8129j;

    /* renamed from: k, reason: collision with root package name */
    private final List f8130k;
    private SpannedString l;

    /* loaded from: classes.dex */
    public enum a {
        INTEGRATIONS,
        PERMISSIONS,
        CONFIGURATION,
        DEPENDENCIES,
        TEST_ADS,
        COUNT
    }

    public he(fe feVar, Context context) {
        super(context);
        this.f8125f = feVar;
        if (feVar.q() == fe.a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.l = new SpannedString(spannableString);
        } else {
            this.l = new SpannedString("");
        }
        this.f8126g = g();
        this.f8127h = b(feVar.n());
        this.f8128i = e();
        this.f8129j = a(feVar.f());
        this.f8130k = j();
        notifyDataSetChanged();
    }

    private yb a(String str, String str2, boolean z8, boolean z9) {
        return yb.a(z8 ? yb.c.RIGHT_DETAIL : yb.c.DETAIL).d(str).a(z8 ? null : this.l).b("Instructions").a(str2).a(z8 ? R.drawable.applovin_ic_check_mark_bordered : c(z9)).b(z8 ? r3.a(R.color.applovin_sdk_checkmarkColor, this.f12545a) : d(z9)).a(!z8).a();
    }

    private int b(boolean z8) {
        return r3.a(z8 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f12545a);
    }

    private int c(boolean z8) {
        return z8 ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning;
    }

    private yb d() {
        yb.b c9 = yb.a().d("Adapter").c(this.f8125f.c());
        if (TextUtils.isEmpty(this.f8125f.c())) {
            c9.a(a(this.f8125f.y())).b(b(this.f8125f.y()));
        }
        return c9.a();
    }

    private List e() {
        ArrayList arrayList = new ArrayList(1);
        if (this.f8125f.B()) {
            arrayList.add(a("Java 8", "For optimal performance, please enable Java 8 support. See: https://developers.applovin.com/en/android/overview/integration", com.applovin.impl.sdk.k.B0(), true));
        }
        return arrayList;
    }

    private yb f() {
        if (this.f8125f.F()) {
            return null;
        }
        return yb.a().d("Initialization Status").c(f(this.f8125f.i())).a(false).a();
    }

    private List g() {
        ArrayList arrayList = new ArrayList(3);
        CollectionUtils.addObjectIfExists(i(), arrayList);
        CollectionUtils.addObjectIfExists(d(), arrayList);
        CollectionUtils.addObjectIfExists(f(), arrayList);
        return arrayList;
    }

    private yb i() {
        yb.b c9 = yb.a().d("SDK").c(this.f8125f.p());
        if (TextUtils.isEmpty(this.f8125f.p())) {
            c9.a(a(this.f8125f.C())).b(b(this.f8125f.C()));
        }
        return c9.a();
    }

    private List j() {
        boolean z8;
        ArrayList arrayList = new ArrayList(3);
        if (StringUtils.isValidString(this.f8125f.u())) {
            arrayList.add(yb.a(yb.c.DETAIL).d(this.f8125f.u()).a());
        }
        if (this.f8125f.x() == fe.b.NOT_SUPPORTED) {
            return arrayList;
        }
        if (this.f8125f.s() != null) {
            arrayList.add(c(this.f8125f.s()));
        }
        if (this.f8125f.D()) {
            if (!AppLovinPrivacySettings.isAgeRestrictedUser(this.f12545a) && AppLovinPrivacySettings.isAgeRestrictedUserSet(this.f12545a)) {
                z8 = true;
            } else {
                z8 = false;
            }
            arrayList.add(a("Not an Age Restricted User", "Test mode requires Age Restricted User (COPPA) to be set to false.", z8, false));
        }
        arrayList.add(a(this.f8125f.x()));
        return arrayList;
    }

    public fe h() {
        return this.f8125f;
    }

    public void k() {
        this.f8126g = g();
    }

    public String toString() {
        return "MediatedNetworkListAdapter{}";
    }

    private List b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                eh ehVar = (eh) it.next();
                arrayList.add(a(ehVar.b(), ehVar.a(), ehVar.c(), true));
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.zb
    public List c(int i9) {
        if (i9 == a.INTEGRATIONS.ordinal()) {
            return this.f8126g;
        }
        if (i9 == a.PERMISSIONS.ordinal()) {
            return this.f8127h;
        }
        if (i9 == a.CONFIGURATION.ordinal()) {
            return this.f8128i;
        }
        if (i9 == a.DEPENDENCIES.ordinal()) {
            return this.f8129j;
        }
        return this.f8130k;
    }

    @Override // com.applovin.impl.zb
    public yb e(int i9) {
        if (i9 == a.INTEGRATIONS.ordinal()) {
            return new bj("INTEGRATIONS");
        }
        if (i9 == a.PERMISSIONS.ordinal()) {
            return new bj("PERMISSIONS");
        }
        if (i9 == a.CONFIGURATION.ordinal()) {
            return new bj("CONFIGURATION");
        }
        if (i9 == a.DEPENDENCIES.ordinal()) {
            return new bj("DEPENDENCIES");
        }
        return new bj("TEST ADS");
    }

    private String f(int i9) {
        if (MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() != i9 && MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() != i9 && MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() != i9) {
            if (MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i9) {
                return "Failure";
            }
            if (MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i9) {
                return "Initializing...";
            }
            return "Not Initialized";
        }
        return "Initialized";
    }

    private int d(boolean z8) {
        return r3.a(z8 ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor, this.f12545a);
    }

    @Override // com.applovin.impl.zb
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.zb
    public int d(int i9) {
        if (i9 == a.INTEGRATIONS.ordinal()) {
            return this.f8126g.size();
        }
        if (i9 == a.PERMISSIONS.ordinal()) {
            return this.f8127h.size();
        }
        if (i9 == a.CONFIGURATION.ordinal()) {
            return this.f8128i.size();
        }
        if (i9 == a.DEPENDENCIES.ordinal()) {
            return this.f8129j.size();
        }
        return this.f8130k.size();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                n6 n6Var = (n6) it.next();
                arrayList.add(a(n6Var.b(), n6Var.a(), n6Var.c(), true));
            }
        }
        return arrayList;
    }

    private yb c(List list) {
        return yb.a().d("Region/VPN Required").c(CollectionUtils.implode(list, ", ", list.size())).a();
    }

    private int a(boolean z8) {
        return z8 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark;
    }

    private yb a(fe.b bVar) {
        yb.b a6 = yb.a();
        if (bVar == fe.b.READY) {
            a6.a(this.f12545a);
        }
        return a6.d("Test Mode").c(bVar.c()).c(bVar.d()).b("Restart Required").a(bVar.b()).a(true).a();
    }

    public boolean a(hb hbVar) {
        return hbVar.b() == a.TEST_ADS.ordinal() && hbVar.a() == this.f8130k.size() - 1;
    }
}
