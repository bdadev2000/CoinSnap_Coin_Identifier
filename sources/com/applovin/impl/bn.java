package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class bn extends xl {

    /* renamed from: h, reason: collision with root package name */
    private final AppLovinAdLoadListener f3914h;

    /* renamed from: i, reason: collision with root package name */
    private final a f3915i;

    /* loaded from: classes.dex */
    public static final class a extends fq {
        public a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
            super(jSONObject, jSONObject2, kVar);
        }

        public void a(fs fsVar) {
            if (fsVar != null) {
                this.f4788b.add(fsVar);
                return;
            }
            throw new IllegalArgumentException("No aggregated vast response specified");
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends bn {

        /* renamed from: j, reason: collision with root package name */
        private final String f3916j;

        public b(String str, fq fqVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(fqVar, appLovinAdLoadListener, kVar);
            this.f3916j = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            fs b3 = b(this.f3916j);
            if (b3 != null) {
                a(b3);
                return;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.b(this.f9060b, "Unable to process XML: " + this.f3916j);
            }
            c(this.f3916j);
            a(gq.XML_PARSING);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends bn {

        /* renamed from: j, reason: collision with root package name */
        private final JSONObject f3917j;

        public c(fq fqVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(fqVar, appLovinAdLoadListener, kVar);
            this.f3917j = fqVar.b();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "Processing SDK JSON response...");
            }
            String string = JsonUtils.getString(this.f3917j, "xml", null);
            if (StringUtils.isValidString(string)) {
                if (string.length() < ((Integer) this.a.a(oj.P4)).intValue()) {
                    fs b3 = b(string);
                    if (b3 != null) {
                        a(b3);
                        return;
                    }
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f9061c.b(this.f9060b, "Unable to process XML: ".concat(string));
                    }
                    c(string);
                    a(gq.XML_PARSING);
                    return;
                }
                if (com.applovin.impl.sdk.t.a()) {
                    this.f9061c.b(this.f9060b, "VAST response is over max length");
                }
                a(gq.XML_PARSING);
                return;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.b(this.f9060b, "No VAST response received.");
            }
            a(gq.NO_WRAPPER_RESPONSE);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends bn {

        /* renamed from: j, reason: collision with root package name */
        private final fs f3918j;

        public d(fs fsVar, fq fqVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(fqVar, appLovinAdLoadListener, kVar);
            if (fsVar != null) {
                if (fqVar != null) {
                    if (appLovinAdLoadListener != null) {
                        this.f3918j = fsVar;
                        return;
                    }
                    throw new IllegalArgumentException("No callback specified.");
                }
                throw new IllegalArgumentException("No context specified.");
            }
            throw new IllegalArgumentException("No response specified.");
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "Processing VAST Wrapper response...");
            }
            a(this.f3918j);
        }
    }

    public bn(fq fqVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessVastResponse", kVar);
        if (fqVar != null) {
            this.f3914h = appLovinAdLoadListener;
            this.f3915i = (a) fqVar;
            return;
        }
        throw new IllegalArgumentException("No context specified.");
    }

    public void a(fs fsVar) {
        int d10 = this.f3915i.d();
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.a(this.f9060b, "Finished parsing XML at depth " + d10);
        }
        this.f3915i.a(fsVar);
        if (nq.b(fsVar)) {
            int intValue = ((Integer) this.a.a(oj.Q4)).intValue();
            if (d10 < intValue) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f9061c.a(this.f9060b, "VAST response is wrapper. Resolving...");
                }
                this.a.l0().a(new in(this.f3915i, this.f3914h, this.a));
                return;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.b(this.f9060b, "Reached beyond max wrapper depth of " + intValue);
            }
            a(gq.WRAPPER_LIMIT_REACHED);
            return;
        }
        if (nq.a(fsVar)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "VAST response is inline. Rendering ad...");
            }
            this.a.l0().a(new dn(this.f3915i, this.f3914h, this.a));
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.b(this.f9060b, "VAST response is an error");
        }
        a(gq.NO_WRAPPER_RESPONSE);
    }

    public fs b(String str) {
        try {
            return gs.a(str, this.a);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "Failed to process VAST response", th2);
            }
            a(gq.XML_PARSING);
            return null;
        }
    }

    public void c(String str) {
        if (str == null) {
            return;
        }
        Iterator<String> it = StringUtils.getRegexMatches(StringUtils.match(str, (String) this.a.a(oj.f6678i5)), 1).iterator();
        while (it.hasNext()) {
            fs b3 = b("<VAST>" + it.next() + "</VAST>");
            if (b3 != null) {
                this.f3915i.a(b3);
            }
        }
    }

    public static bn a(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        return new c(new a(jSONObject, jSONObject2, kVar), appLovinAdLoadListener, kVar);
    }

    public static bn a(String str, JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        return new b(str, new a(jSONObject, jSONObject2, kVar), appLovinAdLoadListener, kVar);
    }

    public static bn a(fs fsVar, fq fqVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        return new d(fsVar, fqVar, appLovinAdLoadListener, kVar);
    }

    public void a(gq gqVar) {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.b(this.f9060b, "Failed to process VAST response due to VAST error code " + gqVar);
        }
        nq.a(this.f3915i, this.f3914h, gqVar, -6, this.a);
    }
}
