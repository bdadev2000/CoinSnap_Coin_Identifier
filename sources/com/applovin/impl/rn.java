package com.applovin.impl;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class rn implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f7376b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f7377c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f7378d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f7379e;

    /* renamed from: f, reason: collision with root package name */
    private String f7380f;

    /* renamed from: g, reason: collision with root package name */
    private String f7381g;

    /* renamed from: h, reason: collision with root package name */
    private String f7382h;

    /* renamed from: i, reason: collision with root package name */
    private String f7383i;

    /* renamed from: j, reason: collision with root package name */
    private String f7384j;

    /* renamed from: k, reason: collision with root package name */
    private final List f7385k;

    public rn(com.applovin.impl.sdk.k kVar) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.k.k());
        this.f7376b = defaultSharedPreferences;
        this.f7385k = new ArrayList();
        this.a = kVar;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.f7377c = a(qj.f7235p.a());
        this.f7378d = a(qj.f7236q.a());
        this.f7379e = h();
        this.f7380f = (String) sj.a(qj.f7238s, (Object) null, defaultSharedPreferences, false);
        this.f7381g = (String) sj.a(qj.f7239t, (Object) null, defaultSharedPreferences, false);
        this.f7382h = (String) sj.a(qj.u, (Object) null, defaultSharedPreferences, false);
        this.f7383i = (String) sj.a(qj.f7241w, (Object) null, defaultSharedPreferences, false);
        this.f7384j = (String) sj.a(qj.f7243y, (Object) null, defaultSharedPreferences, false);
        c(this.f7381g);
    }

    private String a(String str, Object obj) {
        StringBuilder o10 = a4.j.o("\n", str, " - ");
        o10.append(obj != null ? obj.toString() : "No value set");
        return o10.toString();
    }

    private Integer h() {
        String a = qj.f7237r.a();
        if (this.f7376b.contains(a)) {
            Integer num = (Integer) sj.a(a, null, Integer.class, this.f7376b, false);
            if (num != null) {
                if (num.intValue() != 1 && num.intValue() != 0) {
                    this.a.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        this.a.L().b("TcfManager", "Integer value (" + num + ") for " + a + " is invalid - setting GDPR Applies to null");
                    }
                    return null;
                }
                return num;
            }
            Long l10 = (Long) sj.a(a, null, Long.class, this.f7376b, false);
            if (l10 != null) {
                if (l10.longValue() != 1 && l10.longValue() != 0) {
                    this.a.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        this.a.L().b("TcfManager", "Long value (" + l10 + ") for " + a + " is invalid - setting GDPR Applies to null");
                    }
                    return null;
                }
                return Integer.valueOf(l10.intValue());
            }
            Boolean bool = (Boolean) sj.a(a, null, Boolean.class, this.f7376b, false);
            if (bool != null) {
                return Integer.valueOf(bool.booleanValue() ? 1 : 0);
            }
            String str = (String) sj.a(a, null, String.class, this.f7376b, false);
            if (str != null) {
                if (!"1".equals(str) && !"true".equals(str)) {
                    if (!"0".equals(str) && !"false".equals(str)) {
                        this.a.L();
                        if (com.applovin.impl.sdk.t.a()) {
                            this.a.L().b("TcfManager", a4.j.h("String value (", str, ") for ", a, " is invalid - setting GDPR Applies to null"));
                        }
                        return null;
                    }
                    return 0;
                }
                return 1;
            }
        }
        return null;
    }

    public boolean b() {
        return un.a(this.f7381g);
    }

    public String c() {
        return this.f7381g;
    }

    public String d() {
        return pn.a(this.f7377c);
    }

    public Integer e() {
        return this.f7377c;
    }

    public Integer f() {
        return this.f7378d;
    }

    public Integer g() {
        return this.f7379e;
    }

    public List i() {
        return this.f7385k;
    }

    public String j() {
        return a("CMP Name", d()) + a("CMP SDK ID", this.f7377c) + a("CMP SDK Version", this.f7378d) + a(qj.f7237r.a(), this.f7379e) + a(qj.f7238s.a(), this.f7380f) + a(qj.f7239t.a(), this.f7381g);
    }

    public String k() {
        return this.f7380f;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str == null) {
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.a.L().a("TcfManager", "SharedPreferences are cleared - setting all stored TC data to null");
            }
            a();
            return;
        }
        if (str.equals(qj.f7235p.a())) {
            this.f7377c = a(str);
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t L = this.a.L();
                StringBuilder o10 = a4.j.o("SharedPreferences entry updated - key: ", str, ", value: ");
                o10.append(this.f7377c);
                L.a("TcfManager", o10.toString());
            }
            this.a.P0();
            return;
        }
        if (str.equals(qj.f7236q.a())) {
            this.f7378d = a(str);
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t L2 = this.a.L();
                StringBuilder o11 = a4.j.o("SharedPreferences entry updated - key: ", str, ", value: ");
                o11.append(this.f7378d);
                L2.a("TcfManager", o11.toString());
                return;
            }
            return;
        }
        if (str.equals(qj.f7237r.a())) {
            this.f7379e = h();
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t L3 = this.a.L();
                StringBuilder o12 = a4.j.o("SharedPreferences entry updated - key: ", str, ", value: ");
                o12.append(this.f7379e);
                L3.a("TcfManager", o12.toString());
                return;
            }
            return;
        }
        if (str.equals(qj.f7238s.a())) {
            this.f7380f = (String) sj.a(str, (Object) null, String.class, sharedPreferences);
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t L4 = this.a.L();
                StringBuilder o13 = a4.j.o("SharedPreferences entry updated - key: ", str, ", value: ");
                o13.append(this.f7380f);
                L4.a("TcfManager", o13.toString());
            }
            this.a.P0();
            return;
        }
        if (str.equals(qj.f7239t.a())) {
            this.f7381g = (String) sj.a(str, (Object) null, String.class, sharedPreferences);
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t L5 = this.a.L();
                StringBuilder o14 = a4.j.o("SharedPreferences entry updated - key: ", str, ", value: ");
                o14.append(this.f7381g);
                L5.a("TcfManager", o14.toString());
            }
            c(this.f7381g);
            b(this.f7381g);
            return;
        }
        if (str.equals(qj.u.a())) {
            this.f7382h = (String) sj.a(str, (Object) null, String.class, sharedPreferences);
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t L6 = this.a.L();
                StringBuilder o15 = a4.j.o("SharedPreferences entry updated - key: ", str, ", value: ");
                o15.append(this.f7382h);
                L6.a("TcfManager", o15.toString());
            }
            d(this.f7382h);
            return;
        }
        if (str.equals(qj.f7240v.a())) {
            String str2 = (String) sj.a(str, (Object) null, String.class, sharedPreferences);
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.a.L().a("TcfManager", eb.j.l("SharedPreferences entry updated - key: ", str, ", value: ", str2));
                return;
            }
            return;
        }
        if (str.equals(qj.f7241w.a())) {
            this.f7383i = (String) sj.a(str, (Object) null, String.class, sharedPreferences);
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t L7 = this.a.L();
                StringBuilder o16 = a4.j.o("SharedPreferences entry updated - key: ", str, ", value: ");
                o16.append(this.f7383i);
                L7.a("TcfManager", o16.toString());
                return;
            }
            return;
        }
        if (str.equals(qj.f7242x.a())) {
            String str3 = (String) sj.a(str, (Object) null, String.class, sharedPreferences);
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.a.L().a("TcfManager", eb.j.l("SharedPreferences entry updated - key: ", str, ", value: ", str3));
                return;
            }
            return;
        }
        if (str.equals(qj.f7243y.a())) {
            this.f7384j = (String) sj.a(str, (Object) null, String.class, sharedPreferences);
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t L8 = this.a.L();
                StringBuilder o17 = a4.j.o("SharedPreferences entry updated - key: ", str, ", value: ");
                o17.append(this.f7384j);
                L8.a("TcfManager", o17.toString());
                return;
            }
            return;
        }
        if (str.contains("IABTCF_PublisherRestrictions")) {
            String str4 = (String) sj.a(str, (Object) null, String.class, sharedPreferences);
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.a.L().a("TcfManager", eb.j.l("SharedPreferences entry updated - key: ", str, ", value: ", str4));
            }
        }
    }

    public Boolean b(int i10) {
        String str = this.f7383i;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(un.a(str, i10 - 1));
    }

    public Boolean c(int i10) {
        String str = this.f7384j;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(un.a(str, i10 - 1));
    }

    public Boolean d(int i10) {
        String str = this.f7382h;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(un.a(str, i10 - 1));
    }

    private void b(String str) {
        for (sn snVar : this.f7385k) {
            if (snVar.f() == sn.a.ATP_NETWORK && snVar.d() != null) {
                snVar.a(un.a(snVar.d().intValue(), str));
            }
        }
    }

    private void c(String str) {
        this.a.L();
        if (com.applovin.impl.sdk.t.a()) {
            a4.j.v("Attempting to update consent from Additional Consent string: ", str, this.a.L(), "TcfManager");
        }
        Boolean a = un.a(1301, str);
        if (a != null) {
            if (a.booleanValue()) {
                this.a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.a.L().a("TcfManager", "Found AppLovin ID in the list of consented ATP IDs - setting user consent to true");
                }
                y3.b(true, com.applovin.impl.sdk.k.k());
            } else {
                this.a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.a.L().a("TcfManager", "Could not find AppLovin ID in the list of consented ATP IDs - setting user consent to false");
                }
                y3.b(false, com.applovin.impl.sdk.k.k());
            }
            this.a.P0();
            return;
        }
        this.a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.a.L().a("TcfManager", "AC string is not valid or AppLovin was not listed on the CMP flow - no consent update");
        }
    }

    private void d(String str) {
        if (str != null) {
            for (sn snVar : this.f7385k) {
                if (snVar.f() == sn.a.TCF_VENDOR && snVar.d() != null) {
                    snVar.a(Boolean.valueOf(un.a(str, snVar.d().intValue() - 1)));
                }
            }
            return;
        }
        Iterator it = this.f7385k.iterator();
        while (it.hasNext()) {
            ((sn) it.next()).a(null);
        }
    }

    private void a() {
        this.f7377c = null;
        this.f7379e = null;
        this.f7380f = null;
        this.f7381g = null;
        this.f7382h = null;
        Iterator it = this.f7385k.iterator();
        while (it.hasNext()) {
            ((sn) it.next()).a(null);
        }
    }

    public Boolean a(int i10) {
        return un.a(i10, this.f7381g);
    }

    private Integer a(String str) {
        if (this.f7376b.contains(str)) {
            Integer num = (Integer) sj.a(str, null, Integer.class, this.f7376b, false);
            if (num != null) {
                return num;
            }
            Long l10 = (Long) sj.a(str, null, Long.class, this.f7376b, false);
            if (l10 != null && l10.longValue() >= -2147483648L && l10.longValue() <= 2147483647L) {
                return Integer.valueOf(l10.intValue());
            }
            String str2 = (String) sj.a(str, null, String.class, this.f7376b, false);
            if (str2 != null) {
                if (StringUtils.isNumeric(str2)) {
                    return Integer.valueOf(Integer.parseInt(str2));
                }
                this.a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.a.L().b("TcfManager", a4.j.h("String value (", str2, ") for ", str, " is not numeric - storing value as null"));
                }
            }
        }
        return null;
    }

    public void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f7385k.add(((fe) it.next()).t());
        }
        d(this.f7382h);
        b(this.f7381g);
    }
}
