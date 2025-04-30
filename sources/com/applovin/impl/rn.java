package com.applovin.impl;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class rn implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f10513a;
    private final SharedPreferences b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f10514c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f10515d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f10516e;

    /* renamed from: f, reason: collision with root package name */
    private String f10517f;

    /* renamed from: g, reason: collision with root package name */
    private String f10518g;

    /* renamed from: h, reason: collision with root package name */
    private String f10519h;

    /* renamed from: i, reason: collision with root package name */
    private String f10520i;

    /* renamed from: j, reason: collision with root package name */
    private String f10521j;

    /* renamed from: k, reason: collision with root package name */
    private final List f10522k;

    public rn(com.applovin.impl.sdk.k kVar) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.k.k());
        this.b = defaultSharedPreferences;
        this.f10522k = new ArrayList();
        this.f10513a = kVar;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.f10514c = a(qj.f10378p.a());
        this.f10515d = a(qj.f10379q.a());
        this.f10516e = h();
        this.f10517f = (String) sj.a(qj.f10381s, (Object) null, defaultSharedPreferences, false);
        this.f10518g = (String) sj.a(qj.f10382t, (Object) null, defaultSharedPreferences, false);
        this.f10519h = (String) sj.a(qj.f10383u, (Object) null, defaultSharedPreferences, false);
        this.f10520i = (String) sj.a(qj.f10385w, (Object) null, defaultSharedPreferences, false);
        this.f10521j = (String) sj.a(qj.f10387y, (Object) null, defaultSharedPreferences, false);
        c(this.f10518g);
    }

    private void a() {
        this.f10514c = null;
        this.f10516e = null;
        this.f10517f = null;
        this.f10518g = null;
        this.f10519h = null;
        Iterator it = this.f10522k.iterator();
        while (it.hasNext()) {
            ((sn) it.next()).a(null);
        }
    }

    private Integer h() {
        String a6 = qj.f10380r.a();
        if (this.b.contains(a6)) {
            Integer num = (Integer) sj.a(a6, null, Integer.class, this.b, false);
            if (num != null) {
                if (num.intValue() != 1 && num.intValue() != 0) {
                    this.f10513a.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f10513a.L().b("TcfManager", "Integer value (" + num + ") for " + a6 + " is invalid - setting GDPR Applies to null");
                    }
                    return null;
                }
                return num;
            }
            Long l = (Long) sj.a(a6, null, Long.class, this.b, false);
            if (l != null) {
                if (l.longValue() != 1 && l.longValue() != 0) {
                    this.f10513a.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f10513a.L().b("TcfManager", "Long value (" + l + ") for " + a6 + " is invalid - setting GDPR Applies to null");
                    }
                    return null;
                }
                return Integer.valueOf(l.intValue());
            }
            Boolean bool = (Boolean) sj.a(a6, null, Boolean.class, this.b, false);
            if (bool != null) {
                return Integer.valueOf(bool.booleanValue() ? 1 : 0);
            }
            String str = (String) sj.a(a6, null, String.class, this.b, false);
            if (str != null) {
                if (!"1".equals(str) && !"true".equals(str)) {
                    if (!"0".equals(str) && !"false".equals(str)) {
                        this.f10513a.L();
                        if (com.applovin.impl.sdk.t.a()) {
                            this.f10513a.L().b("TcfManager", Q7.n0.j("String value (", str, ") for ", a6, " is invalid - setting GDPR Applies to null"));
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
        return un.a(this.f10518g);
    }

    public String c() {
        return this.f10518g;
    }

    public String d() {
        return pn.a(this.f10514c);
    }

    public Integer e() {
        return this.f10514c;
    }

    public Integer f() {
        return this.f10515d;
    }

    public Integer g() {
        return this.f10516e;
    }

    public List i() {
        return this.f10522k;
    }

    public String j() {
        return a("CMP Name", d()) + a("CMP SDK ID", this.f10514c) + a("CMP SDK Version", this.f10515d) + a(qj.f10380r.a(), this.f10516e) + a(qj.f10381s.a(), this.f10517f) + a(qj.f10382t.a(), this.f10518g);
    }

    public String k() {
        return this.f10517f;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str == null) {
            this.f10513a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f10513a.L().a("TcfManager", "SharedPreferences are cleared - setting all stored TC data to null");
            }
            a();
            return;
        }
        if (str.equals(qj.f10378p.a())) {
            this.f10514c = a(str);
            this.f10513a.L();
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t L8 = this.f10513a.L();
                StringBuilder n2 = com.mbridge.msdk.foundation.entity.o.n("SharedPreferences entry updated - key: ", str, ", value: ");
                n2.append(this.f10514c);
                L8.a("TcfManager", n2.toString());
            }
            this.f10513a.P0();
            return;
        }
        if (str.equals(qj.f10379q.a())) {
            this.f10515d = a(str);
            this.f10513a.L();
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t L9 = this.f10513a.L();
                StringBuilder n9 = com.mbridge.msdk.foundation.entity.o.n("SharedPreferences entry updated - key: ", str, ", value: ");
                n9.append(this.f10515d);
                L9.a("TcfManager", n9.toString());
                return;
            }
            return;
        }
        if (str.equals(qj.f10380r.a())) {
            this.f10516e = h();
            this.f10513a.L();
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t L10 = this.f10513a.L();
                StringBuilder n10 = com.mbridge.msdk.foundation.entity.o.n("SharedPreferences entry updated - key: ", str, ", value: ");
                n10.append(this.f10516e);
                L10.a("TcfManager", n10.toString());
                return;
            }
            return;
        }
        if (str.equals(qj.f10381s.a())) {
            this.f10517f = (String) sj.a(str, (Object) null, String.class, sharedPreferences);
            this.f10513a.L();
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t L11 = this.f10513a.L();
                StringBuilder n11 = com.mbridge.msdk.foundation.entity.o.n("SharedPreferences entry updated - key: ", str, ", value: ");
                n11.append(this.f10517f);
                L11.a("TcfManager", n11.toString());
            }
            this.f10513a.P0();
            return;
        }
        if (str.equals(qj.f10382t.a())) {
            this.f10518g = (String) sj.a(str, (Object) null, String.class, sharedPreferences);
            this.f10513a.L();
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t L12 = this.f10513a.L();
                StringBuilder n12 = com.mbridge.msdk.foundation.entity.o.n("SharedPreferences entry updated - key: ", str, ", value: ");
                n12.append(this.f10518g);
                L12.a("TcfManager", n12.toString());
            }
            c(this.f10518g);
            b(this.f10518g);
            return;
        }
        if (str.equals(qj.f10383u.a())) {
            this.f10519h = (String) sj.a(str, (Object) null, String.class, sharedPreferences);
            this.f10513a.L();
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t L13 = this.f10513a.L();
                StringBuilder n13 = com.mbridge.msdk.foundation.entity.o.n("SharedPreferences entry updated - key: ", str, ", value: ");
                n13.append(this.f10519h);
                L13.a("TcfManager", n13.toString());
            }
            d(this.f10519h);
            return;
        }
        if (str.equals(qj.f10384v.a())) {
            String str2 = (String) sj.a(str, (Object) null, String.class, sharedPreferences);
            this.f10513a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f10513a.L().a("TcfManager", AbstractC2914a.k("SharedPreferences entry updated - key: ", str, ", value: ", str2));
                return;
            }
            return;
        }
        if (str.equals(qj.f10385w.a())) {
            this.f10520i = (String) sj.a(str, (Object) null, String.class, sharedPreferences);
            this.f10513a.L();
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t L14 = this.f10513a.L();
                StringBuilder n14 = com.mbridge.msdk.foundation.entity.o.n("SharedPreferences entry updated - key: ", str, ", value: ");
                n14.append(this.f10520i);
                L14.a("TcfManager", n14.toString());
                return;
            }
            return;
        }
        if (str.equals(qj.f10386x.a())) {
            String str3 = (String) sj.a(str, (Object) null, String.class, sharedPreferences);
            this.f10513a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f10513a.L().a("TcfManager", AbstractC2914a.k("SharedPreferences entry updated - key: ", str, ", value: ", str3));
                return;
            }
            return;
        }
        if (str.equals(qj.f10387y.a())) {
            this.f10521j = (String) sj.a(str, (Object) null, String.class, sharedPreferences);
            this.f10513a.L();
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t L15 = this.f10513a.L();
                StringBuilder n15 = com.mbridge.msdk.foundation.entity.o.n("SharedPreferences entry updated - key: ", str, ", value: ");
                n15.append(this.f10521j);
                L15.a("TcfManager", n15.toString());
                return;
            }
            return;
        }
        if (str.contains("IABTCF_PublisherRestrictions")) {
            String str4 = (String) sj.a(str, (Object) null, String.class, sharedPreferences);
            this.f10513a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f10513a.L().a("TcfManager", AbstractC2914a.k("SharedPreferences entry updated - key: ", str, ", value: ", str4));
            }
        }
    }

    public Boolean b(int i9) {
        String str = this.f10520i;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(un.a(str, i9 - 1));
    }

    public Boolean c(int i9) {
        String str = this.f10521j;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(un.a(str, i9 - 1));
    }

    public Boolean d(int i9) {
        String str = this.f10519h;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(un.a(str, i9 - 1));
    }

    private void b(String str) {
        for (sn snVar : this.f10522k) {
            if (snVar.f() == sn.a.ATP_NETWORK && snVar.d() != null) {
                snVar.a(un.a(snVar.d().intValue(), str));
            }
        }
    }

    private void c(String str) {
        this.f10513a.L();
        if (com.applovin.impl.sdk.t.a()) {
            Q7.n0.s("Attempting to update consent from Additional Consent string: ", str, this.f10513a.L(), "TcfManager");
        }
        Boolean a6 = un.a(1301, str);
        if (a6 != null) {
            if (a6.booleanValue()) {
                this.f10513a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.f10513a.L().a("TcfManager", "Found AppLovin ID in the list of consented ATP IDs - setting user consent to true");
                }
                y3.b(true, com.applovin.impl.sdk.k.k());
            } else {
                this.f10513a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.f10513a.L().a("TcfManager", "Could not find AppLovin ID in the list of consented ATP IDs - setting user consent to false");
                }
                y3.b(false, com.applovin.impl.sdk.k.k());
            }
            this.f10513a.P0();
            return;
        }
        this.f10513a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f10513a.L().a("TcfManager", "AC string is not valid or AppLovin was not listed on the CMP flow - no consent update");
        }
    }

    private void d(String str) {
        if (str != null) {
            for (sn snVar : this.f10522k) {
                if (snVar.f() == sn.a.TCF_VENDOR && snVar.d() != null) {
                    snVar.a(Boolean.valueOf(un.a(str, snVar.d().intValue() - 1)));
                }
            }
            return;
        }
        Iterator it = this.f10522k.iterator();
        while (it.hasNext()) {
            ((sn) it.next()).a(null);
        }
    }

    public Boolean a(int i9) {
        return un.a(i9, this.f10518g);
    }

    private String a(String str, Object obj) {
        StringBuilder n2 = com.mbridge.msdk.foundation.entity.o.n("\n", str, " - ");
        n2.append(obj != null ? obj.toString() : "No value set");
        return n2.toString();
    }

    private Integer a(String str) {
        if (this.b.contains(str)) {
            Integer num = (Integer) sj.a(str, null, Integer.class, this.b, false);
            if (num != null) {
                return num;
            }
            Long l = (Long) sj.a(str, null, Long.class, this.b, false);
            if (l != null && l.longValue() >= -2147483648L && l.longValue() <= 2147483647L) {
                return Integer.valueOf(l.intValue());
            }
            String str2 = (String) sj.a(str, null, String.class, this.b, false);
            if (str2 != null) {
                if (StringUtils.isNumeric(str2)) {
                    return Integer.valueOf(Integer.parseInt(str2));
                }
                this.f10513a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.f10513a.L().b("TcfManager", Q7.n0.j("String value (", str2, ") for ", str, " is not numeric - storing value as null"));
                }
            }
        }
        return null;
    }

    public void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f10522k.add(((fe) it.next()).t());
        }
        d(this.f10519h);
        b(this.f10518g);
    }
}
