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
    private final fe f5147f;

    /* renamed from: g, reason: collision with root package name */
    private List f5148g;

    /* renamed from: h, reason: collision with root package name */
    private final List f5149h;

    /* renamed from: i, reason: collision with root package name */
    private final List f5150i;

    /* renamed from: j, reason: collision with root package name */
    private final List f5151j;

    /* renamed from: k, reason: collision with root package name */
    private final List f5152k;

    /* renamed from: l, reason: collision with root package name */
    private SpannedString f5153l;

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
        this.f5147f = feVar;
        if (feVar.q() == fe.a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.f5153l = new SpannedString(spannableString);
        } else {
            this.f5153l = new SpannedString("");
        }
        this.f5148g = g();
        this.f5149h = b(feVar.n());
        this.f5150i = e();
        this.f5151j = a(feVar.f());
        this.f5152k = j();
        notifyDataSetChanged();
    }

    private yb a(String str, String str2, boolean z10, boolean z11) {
        return yb.a(z10 ? yb.c.RIGHT_DETAIL : yb.c.DETAIL).d(str).a(z10 ? null : this.f5153l).b("Instructions").a(str2).a(z10 ? R.drawable.applovin_ic_check_mark_bordered : c(z11)).b(z10 ? r3.a(R.color.applovin_sdk_checkmarkColor, this.a) : d(z11)).a(!z10).a();
    }

    private int b(boolean z10) {
        return r3.a(z10 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.a);
    }

    private int c(boolean z10) {
        return z10 ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning;
    }

    private yb d() {
        yb.b c10 = yb.a().d("Adapter").c(this.f5147f.c());
        if (TextUtils.isEmpty(this.f5147f.c())) {
            c10.a(a(this.f5147f.y())).b(b(this.f5147f.y()));
        }
        return c10.a();
    }

    private List e() {
        ArrayList arrayList = new ArrayList(1);
        if (this.f5147f.B()) {
            arrayList.add(a("Java 8", "For optimal performance, please enable Java 8 support. See: https://developers.applovin.com/en/android/overview/integration", com.applovin.impl.sdk.k.B0(), true));
        }
        return arrayList;
    }

    private yb f() {
        if (this.f5147f.F()) {
            return null;
        }
        return yb.a().d("Initialization Status").c(f(this.f5147f.i())).a(false).a();
    }

    private List g() {
        ArrayList arrayList = new ArrayList(3);
        CollectionUtils.addObjectIfExists(i(), arrayList);
        CollectionUtils.addObjectIfExists(d(), arrayList);
        CollectionUtils.addObjectIfExists(f(), arrayList);
        return arrayList;
    }

    private yb i() {
        yb.b c10 = yb.a().d("SDK").c(this.f5147f.p());
        if (TextUtils.isEmpty(this.f5147f.p())) {
            c10.a(a(this.f5147f.C())).b(b(this.f5147f.C()));
        }
        return c10.a();
    }

    private List j() {
        boolean z10;
        ArrayList arrayList = new ArrayList(3);
        if (StringUtils.isValidString(this.f5147f.u())) {
            arrayList.add(yb.a(yb.c.DETAIL).d(this.f5147f.u()).a());
        }
        if (this.f5147f.x() == fe.b.NOT_SUPPORTED) {
            return arrayList;
        }
        if (this.f5147f.s() != null) {
            arrayList.add(c(this.f5147f.s()));
        }
        if (this.f5147f.D()) {
            if (!AppLovinPrivacySettings.isAgeRestrictedUser(this.a) && AppLovinPrivacySettings.isAgeRestrictedUserSet(this.a)) {
                z10 = true;
            } else {
                z10 = false;
            }
            arrayList.add(a("Not an Age Restricted User", "Test mode requires Age Restricted User (COPPA) to be set to false.", z10, false));
        }
        arrayList.add(a(this.f5147f.x()));
        return arrayList;
    }

    public fe h() {
        return this.f5147f;
    }

    public void k() {
        this.f5148g = g();
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
    public List c(int i10) {
        if (i10 == a.INTEGRATIONS.ordinal()) {
            return this.f5148g;
        }
        if (i10 == a.PERMISSIONS.ordinal()) {
            return this.f5149h;
        }
        if (i10 == a.CONFIGURATION.ordinal()) {
            return this.f5150i;
        }
        if (i10 == a.DEPENDENCIES.ordinal()) {
            return this.f5151j;
        }
        return this.f5152k;
    }

    @Override // com.applovin.impl.zb
    public yb e(int i10) {
        if (i10 == a.INTEGRATIONS.ordinal()) {
            return new bj("INTEGRATIONS");
        }
        if (i10 == a.PERMISSIONS.ordinal()) {
            return new bj("PERMISSIONS");
        }
        if (i10 == a.CONFIGURATION.ordinal()) {
            return new bj("CONFIGURATION");
        }
        if (i10 == a.DEPENDENCIES.ordinal()) {
            return new bj("DEPENDENCIES");
        }
        return new bj("TEST ADS");
    }

    private String f(int i10) {
        return (MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() == i10 || MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() == i10 || MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() == i10) ? "Initialized" : MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i10 ? "Failure" : MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i10 ? "Initializing..." : "Not Initialized";
    }

    private int d(boolean z10) {
        return r3.a(z10 ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor, this.a);
    }

    @Override // com.applovin.impl.zb
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.zb
    public int d(int i10) {
        if (i10 == a.INTEGRATIONS.ordinal()) {
            return this.f5148g.size();
        }
        if (i10 == a.PERMISSIONS.ordinal()) {
            return this.f5149h.size();
        }
        if (i10 == a.CONFIGURATION.ordinal()) {
            return this.f5150i.size();
        }
        if (i10 == a.DEPENDENCIES.ordinal()) {
            return this.f5151j.size();
        }
        return this.f5152k.size();
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

    private int a(boolean z10) {
        return z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark;
    }

    private yb a(fe.b bVar) {
        yb.b a10 = yb.a();
        if (bVar == fe.b.READY) {
            a10.a(this.a);
        }
        return a10.d("Test Mode").c(bVar.c()).c(bVar.d()).b("Restart Required").a(bVar.b()).a(true).a();
    }

    public boolean a(hb hbVar) {
        return hbVar.b() == a.TEST_ADS.ordinal() && hbVar.a() == this.f5152k.size() - 1;
    }
}
