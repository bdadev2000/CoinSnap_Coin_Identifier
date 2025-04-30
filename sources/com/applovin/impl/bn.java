package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class bn extends xl {

    /* renamed from: h, reason: collision with root package name */
    private final AppLovinAdLoadListener f6896h;

    /* renamed from: i, reason: collision with root package name */
    private final a f6897i;

    /* loaded from: classes.dex */
    public static final class a extends fq {
        public a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
            super(jSONObject, jSONObject2, kVar);
        }

        public void a(fs fsVar) {
            if (fsVar != null) {
                this.b.add(fsVar);
                return;
            }
            throw new IllegalArgumentException("No aggregated vast response specified");
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends bn {

        /* renamed from: j, reason: collision with root package name */
        private final String f6898j;

        public b(String str, fq fqVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(fqVar, appLovinAdLoadListener, kVar);
            this.f6898j = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            fs b = b(this.f6898j);
            if (b != null) {
                a(b);
                return;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.b(this.b, "Unable to process XML: " + this.f6898j);
            }
            c(this.f6898j);
            a(gq.XML_PARSING);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends bn {

        /* renamed from: j, reason: collision with root package name */
        private final JSONObject f6899j;

        public c(fq fqVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(fqVar, appLovinAdLoadListener, kVar);
            this.f6899j = fqVar.b();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.a(this.b, "Processing SDK JSON response...");
            }
            String string = JsonUtils.getString(this.f6899j, "xml", null);
            if (StringUtils.isValidString(string)) {
                if (string.length() < ((Integer) this.f12278a.a(oj.f9653P4)).intValue()) {
                    fs b = b(string);
                    if (b != null) {
                        a(b);
                        return;
                    }
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f12279c.b(this.b, "Unable to process XML: ".concat(string));
                    }
                    c(string);
                    a(gq.XML_PARSING);
                    return;
                }
                if (com.applovin.impl.sdk.t.a()) {
                    this.f12279c.b(this.b, "VAST response is over max length");
                }
                a(gq.XML_PARSING);
                return;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.b(this.b, "No VAST response received.");
            }
            a(gq.NO_WRAPPER_RESPONSE);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends bn {

        /* renamed from: j, reason: collision with root package name */
        private final fs f6900j;

        public d(fs fsVar, fq fqVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(fqVar, appLovinAdLoadListener, kVar);
            if (fsVar != null) {
                if (fqVar != null) {
                    if (appLovinAdLoadListener != null) {
                        this.f6900j = fsVar;
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
                this.f12279c.a(this.b, "Processing VAST Wrapper response...");
            }
            a(this.f6900j);
        }
    }

    public bn(fq fqVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessVastResponse", kVar);
        if (fqVar != null) {
            this.f6896h = appLovinAdLoadListener;
            this.f6897i = (a) fqVar;
            return;
        }
        throw new IllegalArgumentException("No context specified.");
    }

    public void a(fs fsVar) {
        int d2 = this.f6897i.d();
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.a(this.b, "Finished parsing XML at depth " + d2);
        }
        this.f6897i.a(fsVar);
        if (nq.b(fsVar)) {
            int intValue = ((Integer) this.f12278a.a(oj.f9660Q4)).intValue();
            if (d2 < intValue) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f12279c.a(this.b, "VAST response is wrapper. Resolving...");
                }
                this.f12278a.l0().a(new in(this.f6897i, this.f6896h, this.f12278a));
                return;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.b(this.b, "Reached beyond max wrapper depth of " + intValue);
            }
            a(gq.WRAPPER_LIMIT_REACHED);
            return;
        }
        if (nq.a(fsVar)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.a(this.b, "VAST response is inline. Rendering ad...");
            }
            this.f12278a.l0().a(new dn(this.f6897i, this.f6896h, this.f12278a));
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.b(this.b, "VAST response is an error");
        }
        a(gq.NO_WRAPPER_RESPONSE);
    }

    public fs b(String str) {
        try {
            return gs.a(str, this.f12278a);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.a(this.b, "Failed to process VAST response", th);
            }
            a(gq.XML_PARSING);
            return null;
        }
    }

    public void c(String str) {
        if (str == null) {
            return;
        }
        Iterator<String> it = StringUtils.getRegexMatches(StringUtils.match(str, (String) this.f12278a.a(oj.f9782i5)), 1).iterator();
        while (it.hasNext()) {
            fs b8 = b("<VAST>" + it.next() + "</VAST>");
            if (b8 != null) {
                this.f6897i.a(b8);
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
            this.f12279c.b(this.b, "Failed to process VAST response due to VAST error code " + gqVar);
        }
        nq.a(this.f6897i, this.f6896h, gqVar, -6, this.f12278a);
    }
}
