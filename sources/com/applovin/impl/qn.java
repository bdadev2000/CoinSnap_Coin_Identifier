package com.applovin.impl;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.applovin.impl.rn;
import com.applovin.impl.sdk.utils.StringUtils;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class qn implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f26194a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f26195b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f26196c;
    private Integer d;
    private Integer e;

    /* renamed from: f, reason: collision with root package name */
    private String f26197f;

    /* renamed from: g, reason: collision with root package name */
    private String f26198g;

    /* renamed from: h, reason: collision with root package name */
    private String f26199h;

    /* renamed from: i, reason: collision with root package name */
    private String f26200i;

    /* renamed from: j, reason: collision with root package name */
    private String f26201j;

    /* renamed from: k, reason: collision with root package name */
    private final List f26202k;

    public qn(com.applovin.impl.sdk.j jVar) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.j.l());
        this.f26195b = defaultSharedPreferences;
        this.f26202k = new ArrayList();
        this.f26194a = jVar;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.f26196c = a(uj.f27341p.a());
        this.d = a(uj.f27342q.a());
        this.e = h();
        this.f26197f = (String) vj.a(uj.f27344s, (Object) null, defaultSharedPreferences, false);
        this.f26198g = (String) vj.a(uj.f27345t, (Object) null, defaultSharedPreferences, false);
        this.f26199h = (String) vj.a(uj.f27346u, (Object) null, defaultSharedPreferences, false);
        this.f26200i = (String) vj.a(uj.w, (Object) null, defaultSharedPreferences, false);
        this.f26201j = (String) vj.a(uj.f27348y, (Object) null, defaultSharedPreferences, false);
        c(this.f26198g);
    }

    private String a(String str, Object obj) {
        StringBuilder v2 = android.support.v4.media.d.v("\n", str, " - ");
        v2.append(obj != null ? obj.toString() : "No value set");
        return v2.toString();
    }

    private Integer h() {
        String a2 = uj.f27343r.a();
        if (this.f26195b.contains(a2)) {
            Integer num = (Integer) vj.a(a2, null, Integer.class, this.f26195b, false);
            if (num != null) {
                if (num.intValue() == 1 || num.intValue() == 0) {
                    return num;
                }
                this.f26194a.J();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f26194a.J().b("TcfManager", "Integer value (" + num + ") for " + a2 + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Long l2 = (Long) vj.a(a2, null, Long.class, this.f26195b, false);
            if (l2 != null) {
                if (l2.longValue() == 1 || l2.longValue() == 0) {
                    return Integer.valueOf(l2.intValue());
                }
                this.f26194a.J();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f26194a.J().b("TcfManager", "Long value (" + l2 + ") for " + a2 + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Boolean bool = (Boolean) vj.a(a2, null, Boolean.class, this.f26195b, false);
            if (bool != null) {
                return Integer.valueOf(bool.booleanValue() ? 1 : 0);
            }
            String str = (String) vj.a(a2, null, String.class, this.f26195b, false);
            if (str != null) {
                if (AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(str) || ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(str)) {
                    return 1;
                }
                if (AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(str) || "false".equals(str)) {
                    return 0;
                }
                this.f26194a.J();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f26194a.J().b("TcfManager", androidx.compose.foundation.text.input.a.m("String value (", str, ") for ", a2, " is invalid - setting GDPR Applies to null"));
                }
                return null;
            }
        }
        return null;
    }

    public boolean b() {
        return tn.a(this.f26198g);
    }

    public String c() {
        return this.f26198g;
    }

    public String d() {
        return on.a(this.f26196c);
    }

    public Integer e() {
        return this.f26196c;
    }

    public Integer f() {
        return this.d;
    }

    public Integer g() {
        return this.e;
    }

    public List i() {
        return this.f26202k;
    }

    public String j() {
        return a("CMP Name", d()) + a("CMP SDK ID", this.f26196c) + a("CMP SDK Version", this.d) + a(uj.f27343r.a(), this.e) + a(uj.f27344s.a(), this.f26197f) + a(uj.f27345t.a(), this.f26198g);
    }

    public String k() {
        return this.f26197f;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str == null) {
            this.f26194a.J();
            if (com.applovin.impl.sdk.n.a()) {
                this.f26194a.J().a("TcfManager", "SharedPreferences are cleared - setting all stored TC data to null");
            }
            a();
            return;
        }
        if (str.equals(uj.f27341p.a())) {
            this.f26196c = a(str);
            this.f26194a.J();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n J = this.f26194a.J();
                StringBuilder v2 = android.support.v4.media.d.v("SharedPreferences entry updated - key: ", str, ", value: ");
                v2.append(this.f26196c);
                J.a("TcfManager", v2.toString());
            }
            this.f26194a.M0();
            return;
        }
        if (str.equals(uj.f27342q.a())) {
            this.d = a(str);
            this.f26194a.J();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n J2 = this.f26194a.J();
                StringBuilder v3 = android.support.v4.media.d.v("SharedPreferences entry updated - key: ", str, ", value: ");
                v3.append(this.d);
                J2.a("TcfManager", v3.toString());
                return;
            }
            return;
        }
        if (str.equals(uj.f27343r.a())) {
            this.e = h();
            this.f26194a.J();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n J3 = this.f26194a.J();
                StringBuilder v4 = android.support.v4.media.d.v("SharedPreferences entry updated - key: ", str, ", value: ");
                v4.append(this.e);
                J3.a("TcfManager", v4.toString());
                return;
            }
            return;
        }
        if (str.equals(uj.f27344s.a())) {
            this.f26197f = (String) vj.a(str, (Object) null, String.class, sharedPreferences);
            this.f26194a.J();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n J4 = this.f26194a.J();
                StringBuilder v5 = android.support.v4.media.d.v("SharedPreferences entry updated - key: ", str, ", value: ");
                v5.append(this.f26197f);
                J4.a("TcfManager", v5.toString());
            }
            this.f26194a.M0();
            return;
        }
        if (str.equals(uj.f27345t.a())) {
            this.f26198g = (String) vj.a(str, (Object) null, String.class, sharedPreferences);
            this.f26194a.J();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n J5 = this.f26194a.J();
                StringBuilder v6 = android.support.v4.media.d.v("SharedPreferences entry updated - key: ", str, ", value: ");
                v6.append(this.f26198g);
                J5.a("TcfManager", v6.toString());
            }
            c(this.f26198g);
            b(this.f26198g);
            return;
        }
        if (str.equals(uj.f27346u.a())) {
            this.f26199h = (String) vj.a(str, (Object) null, String.class, sharedPreferences);
            this.f26194a.J();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n J6 = this.f26194a.J();
                StringBuilder v7 = android.support.v4.media.d.v("SharedPreferences entry updated - key: ", str, ", value: ");
                v7.append(this.f26199h);
                J6.a("TcfManager", v7.toString());
            }
            d(this.f26199h);
            return;
        }
        if (str.equals(uj.f27347v.a())) {
            String str2 = (String) vj.a(str, (Object) null, String.class, sharedPreferences);
            this.f26194a.J();
            if (com.applovin.impl.sdk.n.a()) {
                this.f26194a.J().a("TcfManager", androidx.compose.foundation.text.input.a.l("SharedPreferences entry updated - key: ", str, ", value: ", str2));
                return;
            }
            return;
        }
        if (str.equals(uj.w.a())) {
            this.f26200i = (String) vj.a(str, (Object) null, String.class, sharedPreferences);
            this.f26194a.J();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n J7 = this.f26194a.J();
                StringBuilder v8 = android.support.v4.media.d.v("SharedPreferences entry updated - key: ", str, ", value: ");
                v8.append(this.f26200i);
                J7.a("TcfManager", v8.toString());
                return;
            }
            return;
        }
        if (str.equals(uj.x.a())) {
            String str3 = (String) vj.a(str, (Object) null, String.class, sharedPreferences);
            this.f26194a.J();
            if (com.applovin.impl.sdk.n.a()) {
                this.f26194a.J().a("TcfManager", androidx.compose.foundation.text.input.a.l("SharedPreferences entry updated - key: ", str, ", value: ", str3));
                return;
            }
            return;
        }
        if (!str.equals(uj.f27348y.a())) {
            if (str.contains("IABTCF_PublisherRestrictions")) {
                String str4 = (String) vj.a(str, (Object) null, String.class, sharedPreferences);
                this.f26194a.J();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f26194a.J().a("TcfManager", androidx.compose.foundation.text.input.a.l("SharedPreferences entry updated - key: ", str, ", value: ", str4));
                    return;
                }
                return;
            }
            return;
        }
        this.f26201j = (String) vj.a(str, (Object) null, String.class, sharedPreferences);
        this.f26194a.J();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n J8 = this.f26194a.J();
            StringBuilder v9 = android.support.v4.media.d.v("SharedPreferences entry updated - key: ", str, ", value: ");
            v9.append(this.f26201j);
            J8.a("TcfManager", v9.toString());
        }
    }

    public Boolean b(int i2) {
        String str = this.f26200i;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(tn.a(str, i2 - 1));
    }

    public Boolean c(int i2) {
        String str = this.f26201j;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(tn.a(str, i2 - 1));
    }

    public Boolean d(int i2) {
        String str = this.f26199h;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(tn.a(str, i2 - 1));
    }

    private void b(String str) {
        for (rn rnVar : this.f26202k) {
            if (rnVar.f() == rn.a.ATP_NETWORK && rnVar.d() != null) {
                rnVar.a(tn.a(rnVar.d().intValue(), str));
            }
        }
    }

    private void c(String str) {
        this.f26194a.J();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.adview.t.v("Attempting to update consent from Additional Consent string: ", str, this.f26194a.J(), "TcfManager");
        }
        Boolean a2 = tn.a(1301, str);
        if (a2 != null) {
            if (a2.booleanValue()) {
                this.f26194a.J();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f26194a.J().a("TcfManager", "Found AppLovin ID in the list of consented ATP IDs - setting user consent to true");
                }
                a4.b(true, com.applovin.impl.sdk.j.l());
            } else {
                this.f26194a.J();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f26194a.J().a("TcfManager", "Could not find AppLovin ID in the list of consented ATP IDs - setting user consent to false");
                }
                a4.b(false, com.applovin.impl.sdk.j.l());
            }
            this.f26194a.M0();
            return;
        }
        this.f26194a.J();
        if (com.applovin.impl.sdk.n.a()) {
            this.f26194a.J().a("TcfManager", "AC string is not valid or AppLovin was not listed on the CMP flow - no consent update");
        }
    }

    private void d(String str) {
        if (str != null) {
            for (rn rnVar : this.f26202k) {
                if (rnVar.f() == rn.a.TCF_VENDOR && rnVar.d() != null) {
                    rnVar.a(Boolean.valueOf(tn.a(str, rnVar.d().intValue() - 1)));
                }
            }
            return;
        }
        Iterator it = this.f26202k.iterator();
        while (it.hasNext()) {
            ((rn) it.next()).a(null);
        }
    }

    private void a() {
        this.f26196c = null;
        this.e = null;
        this.f26197f = null;
        this.f26198g = null;
        this.f26199h = null;
        Iterator it = this.f26202k.iterator();
        while (it.hasNext()) {
            ((rn) it.next()).a(null);
        }
    }

    public Boolean a(int i2) {
        return tn.a(i2, this.f26198g);
    }

    private Integer a(String str) {
        if (this.f26195b.contains(str)) {
            Integer num = (Integer) vj.a(str, null, Integer.class, this.f26195b, false);
            if (num != null) {
                return num;
            }
            Long l2 = (Long) vj.a(str, null, Long.class, this.f26195b, false);
            if (l2 != null && l2.longValue() >= -2147483648L && l2.longValue() <= 2147483647L) {
                return Integer.valueOf(l2.intValue());
            }
            String str2 = (String) vj.a(str, null, String.class, this.f26195b, false);
            if (str2 != null) {
                if (StringUtils.isNumeric(str2)) {
                    return Integer.valueOf(Integer.parseInt(str2));
                }
                this.f26194a.J();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f26194a.J().b("TcfManager", androidx.compose.foundation.text.input.a.m("String value (", str2, ") for ", str, " is not numeric - storing value as null"));
                }
            }
        }
        return null;
    }

    public void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f26202k.add(((ke) it.next()).t());
        }
        d(this.f26199h);
        b(this.f26198g);
    }
}
