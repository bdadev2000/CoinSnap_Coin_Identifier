package com.applovin.impl;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.applovin.impl.dc;
import com.applovin.impl.ke;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class me extends ec {

    /* renamed from: f, reason: collision with root package name */
    private final ke f25243f;

    /* renamed from: g, reason: collision with root package name */
    private List f25244g;

    /* renamed from: h, reason: collision with root package name */
    private final List f25245h;

    /* renamed from: i, reason: collision with root package name */
    private final List f25246i;

    /* renamed from: j, reason: collision with root package name */
    private final List f25247j;

    /* renamed from: k, reason: collision with root package name */
    private final List f25248k;

    /* renamed from: l, reason: collision with root package name */
    private SpannedString f25249l;

    /* loaded from: classes.dex */
    public enum a {
        INTEGRATIONS,
        PERMISSIONS,
        CONFIGURATION,
        DEPENDENCIES,
        TEST_ADS,
        COUNT
    }

    public me(ke keVar, Context context) {
        super(context);
        this.f25243f = keVar;
        if (keVar.q() == ke.a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.f25249l = new SpannedString(spannableString);
        } else {
            this.f25249l = new SpannedString("");
        }
        this.f25244g = g();
        this.f25245h = b(keVar.n());
        this.f25246i = e();
        this.f25247j = a(keVar.f());
        this.f25248k = j();
        notifyDataSetChanged();
    }

    private int a(boolean z2) {
        return z2 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark;
    }

    private int b(boolean z2) {
        return t3.a(z2 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f23676a);
    }

    private int c(boolean z2) {
        return z2 ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning;
    }

    private dc d() {
        dc.b c2 = dc.a().d("Adapter").c(this.f25243f.c());
        if (TextUtils.isEmpty(this.f25243f.c())) {
            c2.a(a(this.f25243f.z())).b(b(this.f25243f.z()));
        }
        return c2.a();
    }

    private List e() {
        ArrayList arrayList = new ArrayList(1);
        if (this.f25243f.C()) {
            arrayList.add(a("Java 8", "For optimal performance, please enable Java 8 support. See: https://developers.applovin.com/en/android/overview/integration", com.applovin.impl.sdk.j.y0(), true));
        }
        return arrayList;
    }

    private dc f() {
        if (this.f25243f.F()) {
            return null;
        }
        return dc.a().d("Initialization Status").c(f(this.f25243f.i())).a(false).a();
    }

    private List g() {
        ArrayList arrayList = new ArrayList(3);
        CollectionUtils.addObjectIfExists(i(), arrayList);
        CollectionUtils.addObjectIfExists(d(), arrayList);
        CollectionUtils.addObjectIfExists(f(), arrayList);
        return arrayList;
    }

    private dc i() {
        dc.b c2 = dc.a().d("SDK").c(this.f25243f.p());
        if (TextUtils.isEmpty(this.f25243f.p())) {
            c2.a(a(this.f25243f.D())).b(b(this.f25243f.D()));
        }
        return c2.a();
    }

    private List j() {
        ArrayList arrayList = new ArrayList(3);
        if (StringUtils.isValidString(this.f25243f.v())) {
            arrayList.add(dc.a(dc.c.DETAIL).d(this.f25243f.v()).a());
        }
        if (this.f25243f.y() == ke.b.NOT_SUPPORTED) {
            return arrayList;
        }
        if (this.f25243f.s() != null) {
            arrayList.add(c(this.f25243f.s()));
        }
        arrayList.add(a(this.f25243f.y()));
        return arrayList;
    }

    public ke h() {
        return this.f25243f;
    }

    public void k() {
        this.f25244g = g();
    }

    public String toString() {
        return "MediatedNetworkListAdapter{}";
    }

    private dc a(String str, String str2, boolean z2, boolean z3) {
        return dc.a(z2 ? dc.c.RIGHT_DETAIL : dc.c.DETAIL).d(str).a(z2 ? null : this.f25249l).b("Instructions").a(str2).a(z2 ? R.drawable.applovin_ic_check_mark_bordered : c(z3)).b(z2 ? t3.a(R.color.applovin_sdk_checkmarkColor, this.f23676a) : d(z3)).a(!z2).a();
    }

    private List b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hh hhVar = (hh) it.next();
                arrayList.add(a(hhVar.b(), hhVar.a(), hhVar.c(), true));
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.ec
    public List c(int i2) {
        return i2 == a.INTEGRATIONS.ordinal() ? this.f25244g : i2 == a.PERMISSIONS.ordinal() ? this.f25245h : i2 == a.CONFIGURATION.ordinal() ? this.f25246i : i2 == a.DEPENDENCIES.ordinal() ? this.f25247j : this.f25248k;
    }

    @Override // com.applovin.impl.ec
    public dc e(int i2) {
        if (i2 == a.INTEGRATIONS.ordinal()) {
            return new fj("INTEGRATIONS");
        }
        if (i2 == a.PERMISSIONS.ordinal()) {
            return new fj("PERMISSIONS");
        }
        if (i2 == a.CONFIGURATION.ordinal()) {
            return new fj("CONFIGURATION");
        }
        if (i2 == a.DEPENDENCIES.ordinal()) {
            return new fj("DEPENDENCIES");
        }
        return new fj("TEST ADS");
    }

    private dc c(List list) {
        return dc.a().d("Region/VPN Required").c(CollectionUtils.implode(list, ", ", list.size())).a();
    }

    private String f(int i2) {
        return (MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() == i2 || MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() == i2 || MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() == i2) ? "Initialized" : MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i2 ? "Failure" : MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i2 ? "Initializing..." : "Not Initialized";
    }

    private int d(boolean z2) {
        return t3.a(z2 ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor, this.f23676a);
    }

    @Override // com.applovin.impl.ec
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.ec
    public int d(int i2) {
        if (i2 == a.INTEGRATIONS.ordinal()) {
            return this.f25244g.size();
        }
        if (i2 == a.PERMISSIONS.ordinal()) {
            return this.f25245h.size();
        }
        if (i2 == a.CONFIGURATION.ordinal()) {
            return this.f25246i.size();
        }
        if (i2 == a.DEPENDENCIES.ordinal()) {
            return this.f25247j.size();
        }
        return this.f25248k.size();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                p6 p6Var = (p6) it.next();
                arrayList.add(a(p6Var.b(), p6Var.a(), p6Var.c(), true));
            }
        }
        return arrayList;
    }

    private dc a(ke.b bVar) {
        dc.b a2 = dc.a();
        if (bVar == ke.b.READY) {
            a2.a(this.f23676a);
        }
        return a2.d("Test Mode").c(bVar.c()).c(bVar.d()).b("Restart Required").a(bVar.b()).a(true).a();
    }

    public boolean a(lb lbVar) {
        return lbVar.b() == a.TEST_ADS.ordinal() && lbVar.a() == this.f25248k.size() - 1;
    }
}
