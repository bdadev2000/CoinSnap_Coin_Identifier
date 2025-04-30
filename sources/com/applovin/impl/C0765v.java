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

/* renamed from: com.applovin.impl.v */
/* loaded from: classes.dex */
public class C0765v implements AppLovinCommunicatorSubscriber {

    /* renamed from: a */
    private final com.applovin.impl.sdk.k f11649a;
    private final Object b = new Object();

    /* renamed from: c */
    private final LinkedHashMap f11650c = new a();

    /* renamed from: d */
    private final Set f11651d = Collections.synchronizedSet(new HashSet());

    /* renamed from: com.applovin.impl.v$a */
    /* loaded from: classes.dex */
    public class a extends LinkedHashMap {
        public a() {
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            if (size() > 16) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.applovin.impl.v$b */
    /* loaded from: classes.dex */
    public interface b {
        void onCreativeIdGenerated(String str, String str2);
    }

    public C0765v(com.applovin.impl.sdk.k kVar) {
        this.f11649a = kVar;
        if (StringUtils.isValidString(b())) {
            AppLovinCommunicator.getInstance(com.applovin.impl.sdk.k.k()).subscribe(this, "safedk_ad_info");
        }
    }

    public static /* synthetic */ void a(C0765v c0765v, b bVar, String str, String str2) {
        c0765v.a(bVar, str, str2);
    }

    public void b(b bVar) {
        this.f11651d.remove(bVar);
    }

    public void c(String str) {
        this.f11649a.L();
        if (com.applovin.impl.sdk.t.a()) {
            Q7.n0.s("Removing ad info for serve id: ", str, this.f11649a.L(), "AdReviewManager");
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.b) {
            this.f11650c.remove(str);
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
                this.f11649a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.f11649a.L().k("AdReviewManager", "Received SafeDK ad info without public data");
                    return;
                }
                return;
            }
            Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle("private");
            if (bundle2 == null) {
                this.f11649a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.f11649a.L().k("AdReviewManager", "Received SafeDK ad info without private data");
                    return;
                }
                return;
            }
            if (MaxAdFormat.formatFromString(bundle2.getString("ad_format")) == null) {
                this.f11649a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.f11649a.L().k("AdReviewManager", "Received SafeDK ad info without ad format");
                    return;
                }
                return;
            }
            String string = bundle2.getString("id");
            if (TextUtils.isEmpty(string)) {
                this.f11649a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.f11649a.L().k("AdReviewManager", "Received SafeDK ad info without serve id");
                    return;
                }
                return;
            }
            synchronized (this.b) {
                try {
                    this.f11649a.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f11649a.L().a("AdReviewManager", "Storing current SafeDK ad info for serve id: " + string + ", public data: " + bundle);
                    }
                    this.f11650c.put(string, bundle);
                } catch (Throwable th) {
                    throw th;
                }
            }
            String string2 = bundle.getString("ad_review_creative_id");
            this.f11649a.L();
            if (com.applovin.impl.sdk.t.a()) {
                Q7.n0.s("Received SafeDK ad info with Ad Review creative id: ", string2, this.f11649a.L(), "AdReviewManager");
            }
            if (StringUtils.isValidString(string2) && !this.f11651d.isEmpty()) {
                HashSet hashSet = new HashSet(this.f11651d);
                this.f11649a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.f11649a.L().a("AdReviewManager", "Notifying listeners: " + this.f11651d);
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    this.f11649a.l0().a((xl) new kn(this.f11649a, "creativeIdGenerated", new I2.f(this, (b) it.next(), string, string2)), sm.b.OTHER);
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
        synchronized (this.b) {
            bundle = (Bundle) this.f11650c.get(str);
        }
        this.f11649a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f11649a.L().a("AdReviewManager", "Retrieved ad info (" + bundle + ") for serve id: " + str);
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
            return (String) cls.getMethod(str, null).invoke(null, null);
        } catch (Throwable unused2) {
            return "";
        }
    }

    public /* synthetic */ void a(b bVar, String str, String str2) {
        this.f11649a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f11649a.L().a("AdReviewManager", "Notifying Ad Review creative id generated for listener: " + bVar);
        }
        bVar.onCreativeIdGenerated(str, str2);
    }

    public void a(b bVar) {
        this.f11651d.add(bVar);
    }

    public static String a() {
        return b("getSdkKey");
    }
}
