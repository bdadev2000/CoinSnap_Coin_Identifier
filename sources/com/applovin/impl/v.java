package com.applovin.impl;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.mediation.MaxAdFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class v implements AppLovinCommunicatorSubscriber {
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b */
    private final Object f8443b = new Object();

    /* renamed from: c */
    private final LinkedHashMap f8444c = new a();

    /* renamed from: d */
    private final Set f8445d = Collections.synchronizedSet(new HashSet());

    /* loaded from: classes.dex */
    public class a extends LinkedHashMap {
        public a() {
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > 16;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void onCreativeIdGenerated(String str, String str2);
    }

    public v(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        if (StringUtils.isValidString(b())) {
            AppLovinCommunicator.getInstance(com.applovin.impl.sdk.k.k()).subscribe(this, "safedk_ad_info");
        }
    }

    public static /* synthetic */ void a(v vVar, b bVar, String str, String str2) {
        vVar.a(bVar, str, str2);
    }

    public void b(b bVar) {
        this.f8445d.remove(bVar);
    }

    public void c(String str) {
        this.a.L();
        if (com.applovin.impl.sdk.t.a()) {
            a4.j.v("Removing ad info for serve id: ", str, this.a.L(), "AdReviewManager");
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f8443b) {
            this.f8444c.remove(str);
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "v";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("safedk_ad_info".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle bundle = appLovinCommunicatorMessage.getMessageData().getBundle("public");
            if (bundle == null) {
                this.a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.a.L().k("AdReviewManager", "Received SafeDK ad info without public data");
                    return;
                }
                return;
            }
            Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle("private");
            if (bundle2 == null) {
                this.a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.a.L().k("AdReviewManager", "Received SafeDK ad info without private data");
                    return;
                }
                return;
            }
            if (MaxAdFormat.formatFromString(bundle2.getString("ad_format")) == null) {
                this.a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.a.L().k("AdReviewManager", "Received SafeDK ad info without ad format");
                    return;
                }
                return;
            }
            String string = bundle2.getString("id");
            if (TextUtils.isEmpty(string)) {
                this.a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.a.L().k("AdReviewManager", "Received SafeDK ad info without serve id");
                    return;
                }
                return;
            }
            synchronized (this.f8443b) {
                this.a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.a.L().a("AdReviewManager", "Storing current SafeDK ad info for serve id: " + string + ", public data: " + bundle);
                }
                this.f8444c.put(string, bundle);
            }
            String string2 = bundle.getString("ad_review_creative_id");
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                a4.j.v("Received SafeDK ad info with Ad Review creative id: ", string2, this.a.L(), "AdReviewManager");
            }
            if (StringUtils.isValidString(string2) && !this.f8445d.isEmpty()) {
                HashSet hashSet = new HashSet(this.f8445d);
                this.a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.a.L().a("AdReviewManager", "Notifying listeners: " + this.f8445d);
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    this.a.l0().a((xl) new kn(this.a, "creativeIdGenerated", new c3.b(6, this, (b) it.next(), string, string2)), sm.b.OTHER);
                }
            }
        }
    }

    public static String b() {
        return b("getVersion");
    }

    public Bundle a(String str) {
        Bundle bundle;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f8443b) {
            bundle = (Bundle) this.f8444c.get(str);
        }
        this.a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.a.L().a("AdReviewManager", "Retrieved ad info (" + bundle + ") for serve id: " + str);
        }
        return bundle;
    }

    private static String b(String str) {
        Class<?> cls;
        try {
            try {
                cls = Class.forName("com.applovin.quality.AppLovinQualityService");
            } catch (Throwable unused) {
                cls = Class.forName("com.safedk.android.SafeDK");
            }
            return (String) cls.getMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable unused2) {
            return "";
        }
    }

    public /* synthetic */ void a(b bVar, String str, String str2) {
        this.a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.a.L().a("AdReviewManager", "Notifying Ad Review creative id generated for listener: " + bVar);
        }
        bVar.onCreativeIdGenerated(str, str2);
    }

    public void a(b bVar) {
        this.f8445d.add(bVar);
    }

    public static String a() {
        return b("getSdkKey");
    }
}
