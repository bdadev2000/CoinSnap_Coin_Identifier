package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class zm extends yl {

    /* renamed from: h, reason: collision with root package name */
    private final AppLovinAdLoadListener f28369h;

    /* renamed from: i, reason: collision with root package name */
    private final a f28370i;

    /* loaded from: classes.dex */
    public static final class a extends eq {
        public a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
            super(jSONObject, jSONObject2, jVar);
        }

        public void a(es esVar) {
            if (esVar == null) {
                throw new IllegalArgumentException("No aggregated vast response specified");
            }
            this.f23742b.add(esVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends zm {

        /* renamed from: j, reason: collision with root package name */
        private final String f28371j;

        public b(String str, eq eqVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
            super(eqVar, appLovinAdLoadListener, jVar);
            this.f28371j = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            es b2 = b(this.f28371j);
            if (b2 != null) {
                a(b2);
                return;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.b(this.f28217b, "Unable to process XML: " + this.f28371j);
            }
            c(this.f28371j);
            a(fq.XML_PARSING);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends zm {

        /* renamed from: j, reason: collision with root package name */
        private final JSONObject f28372j;

        public c(eq eqVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
            super(eqVar, appLovinAdLoadListener, jVar);
            this.f28372j = eqVar.b();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Processing SDK JSON response...");
            }
            String string = JsonUtils.getString(this.f28372j, "xml", null);
            if (!StringUtils.isValidString(string)) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f28218c.b(this.f28217b, "No VAST response received.");
                }
                a(fq.NO_WRAPPER_RESPONSE);
            } else {
                if (string.length() >= ((Integer) this.f28216a.a(sj.T4)).intValue()) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f28218c.b(this.f28217b, "VAST response is over max length");
                    }
                    a(fq.XML_PARSING);
                    return;
                }
                es b2 = b(string);
                if (b2 != null) {
                    a(b2);
                    return;
                }
                if (com.applovin.impl.sdk.n.a()) {
                    this.f28218c.b(this.f28217b, "Unable to process XML: ".concat(string));
                }
                c(string);
                a(fq.XML_PARSING);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends zm {

        /* renamed from: j, reason: collision with root package name */
        private final es f28373j;

        public d(es esVar, eq eqVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
            super(eqVar, appLovinAdLoadListener, jVar);
            if (esVar == null) {
                throw new IllegalArgumentException("No response specified.");
            }
            if (eqVar == null) {
                throw new IllegalArgumentException("No context specified.");
            }
            if (appLovinAdLoadListener == null) {
                throw new IllegalArgumentException("No callback specified.");
            }
            this.f28373j = esVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Processing VAST Wrapper response...");
            }
            a(this.f28373j);
        }
    }

    public zm(eq eqVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super("TaskProcessVastResponse", jVar);
        if (eqVar == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        this.f28369h = appLovinAdLoadListener;
        this.f28370i = (a) eqVar;
    }

    public void a(es esVar) {
        int d2 = this.f28370i.d();
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "Finished parsing XML at depth " + d2);
        }
        this.f28370i.a(esVar);
        if (mq.b(esVar)) {
            int intValue = ((Integer) this.f28216a.a(sj.U4)).intValue();
            if (d2 < intValue) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f28218c.a(this.f28217b, "VAST response is wrapper. Resolving...");
                }
                this.f28216a.j0().a(new hn(this.f28370i, this.f28369h, this.f28216a));
                return;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.b(this.f28217b, "Reached beyond max wrapper depth of " + intValue);
            }
            a(fq.WRAPPER_LIMIT_REACHED);
            return;
        }
        if (mq.a(esVar)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "VAST response is inline. Rendering ad...");
            }
            this.f28216a.j0().a(new cn(this.f28370i, this.f28369h, this.f28216a));
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.b(this.f28217b, "VAST response is an error");
        }
        a(fq.NO_WRAPPER_RESPONSE);
    }

    public es b(String str) {
        try {
            return fs.a(str, this.f28216a);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Failed to process VAST response", th);
            }
            a(fq.XML_PARSING);
            return null;
        }
    }

    public void c(String str) {
        if (str == null) {
            return;
        }
        Iterator<String> it = StringUtils.getRegexMatches(StringUtils.match(str, (String) this.f28216a.a(sj.n5)), 1).iterator();
        while (it.hasNext()) {
            es b2 = b("<VAST>" + it.next() + "</VAST>");
            if (b2 != null) {
                this.f28370i.a(b2);
            }
        }
    }

    public static zm a(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        return new c(new a(jSONObject, jSONObject2, jVar), appLovinAdLoadListener, jVar);
    }

    public static zm a(String str, JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        return new b(str, new a(jSONObject, jSONObject2, jVar), appLovinAdLoadListener, jVar);
    }

    public static zm a(es esVar, eq eqVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        return new d(esVar, eqVar, appLovinAdLoadListener, jVar);
    }

    public void a(fq fqVar) {
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.b(this.f28217b, "Failed to process VAST response due to VAST error code " + fqVar);
        }
        mq.a(this.f28370i, this.f28369h, fqVar, -6, this.f28216a);
    }
}
