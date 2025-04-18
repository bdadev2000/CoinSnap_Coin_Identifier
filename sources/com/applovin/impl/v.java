package com.applovin.impl;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.tm;
import com.applovin.mediation.MaxAdFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class v implements AppLovinCommunicatorSubscriber {

    /* renamed from: a */
    private final com.applovin.impl.sdk.j f27442a;

    /* renamed from: b */
    private final Object f27443b = new Object();

    /* renamed from: c */
    private final LinkedHashMap f27444c = new a();
    private final Set d = Collections.synchronizedSet(new HashSet());

    /* loaded from: classes2.dex */
    public class a extends LinkedHashMap {
        public a() {
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > 16;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void onCreativeIdGenerated(String str, String str2);
    }

    public v(com.applovin.impl.sdk.j jVar) {
        this.f27442a = jVar;
        if (StringUtils.isValidString(b())) {
            AppLovinCommunicator.getInstance(com.applovin.impl.sdk.j.l()).subscribe(this, "safedk_ad_info");
        }
    }

    public static /* synthetic */ void a(v vVar, b bVar, String str, String str2) {
        vVar.a(bVar, str, str2);
    }

    public void b(b bVar) {
        this.d.remove(bVar);
    }

    public void c(String str) {
        this.f27442a.J();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.adview.t.v("Removing ad info for serve id: ", str, this.f27442a.J(), "AdReviewManager");
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f27443b) {
            this.f27444c.remove(str);
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
                this.f27442a.J();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f27442a.J().k("AdReviewManager", "Received SafeDK ad info without public data");
                    return;
                }
                return;
            }
            Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle("private");
            if (bundle2 == null) {
                this.f27442a.J();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f27442a.J().k("AdReviewManager", "Received SafeDK ad info without private data");
                    return;
                }
                return;
            }
            if (MaxAdFormat.formatFromString(bundle2.getString("ad_format")) == null) {
                this.f27442a.J();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f27442a.J().k("AdReviewManager", "Received SafeDK ad info without ad format");
                    return;
                }
                return;
            }
            String string = bundle2.getString("id");
            if (TextUtils.isEmpty(string)) {
                this.f27442a.J();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f27442a.J().k("AdReviewManager", "Received SafeDK ad info without serve id");
                    return;
                }
                return;
            }
            synchronized (this.f27443b) {
                try {
                    this.f27442a.J();
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f27442a.J().a("AdReviewManager", "Storing current SafeDK ad info for serve id: " + string + ", public data: " + bundle);
                    }
                    this.f27444c.put(string, bundle);
                } catch (Throwable th) {
                    throw th;
                }
            }
            String string2 = bundle.getString("ad_review_creative_id");
            this.f27442a.J();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.adview.t.v("Received SafeDK ad info with Ad Review creative id: ", string2, this.f27442a.J(), "AdReviewManager");
            }
            if (!StringUtils.isValidString(string2) || this.d.isEmpty()) {
                return;
            }
            HashSet hashSet = new HashSet(this.d);
            this.f27442a.J();
            if (com.applovin.impl.sdk.n.a()) {
                this.f27442a.J().a("AdReviewManager", "Notifying listeners: " + this.d);
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                this.f27442a.j0().a((yl) new jn(this.f27442a, "creativeIdGenerated", new ft(this, (b) it.next(), string, string2)), tm.b.OTHER);
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
        synchronized (this.f27443b) {
            bundle = (Bundle) this.f27444c.get(str);
        }
        this.f27442a.J();
        if (com.applovin.impl.sdk.n.a()) {
            this.f27442a.J().a("AdReviewManager", "Retrieved ad info (" + bundle + ") for serve id: " + str);
        }
        return bundle;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:325)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:51)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    private static java.lang.String b(java.lang.String r3) {
        /*
            java.lang.Class<com.applovin.quality.AppLovinQualityService> r0 = com.applovin.quality.AppLovinQualityService.class
            goto L9
        L3:
            java.lang.String r0 = "com.safedk.android.SafeDK"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L1a
        L9:
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L1a
            java.lang.reflect.Method r3 = r0.getMethod(r3, r2)     // Catch: java.lang.Throwable -> L1a
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L1a
            r1 = 0
            java.lang.Object r3 = r3.invoke(r1, r0)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L1a
            return r3
        L1a:
            java.lang.String r3 = ""
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.v.b(java.lang.String):java.lang.String");
    }

    public /* synthetic */ void a(b bVar, String str, String str2) {
        this.f27442a.J();
        if (com.applovin.impl.sdk.n.a()) {
            this.f27442a.J().a("AdReviewManager", "Notifying Ad Review creative id generated for listener: " + bVar);
        }
        bVar.onCreativeIdGenerated(str, str2);
    }

    public void a(b bVar) {
        this.d.add(bVar);
    }

    public static String a() {
        return b("getSdkKey");
    }
}
