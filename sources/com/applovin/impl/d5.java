package com.applovin.impl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.core.app.ActivityOptionsCompat;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.R;
import com.facebook.internal.AnalyticsEvents;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes3.dex */
public class d5 {

    /* renamed from: a */
    private final com.applovin.impl.sdk.j f23417a;

    /* renamed from: b */
    private CustomTabsClient f23418b;

    /* loaded from: classes3.dex */
    public class a extends CustomTabsServiceConnection {
        public a() {
        }

        @Override // androidx.browser.customtabs.CustomTabsServiceConnection
        public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
            d5.this.f23417a.J();
            if (com.applovin.impl.sdk.n.a()) {
                d5.this.f23417a.J().a("CustomTabsManager", "Connection successful: " + componentName);
            }
            d5.this.f23418b = customTabsClient;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            d5.this.f23417a.J();
            if (com.applovin.impl.sdk.n.a()) {
                d5.this.f23417a.J().a("CustomTabsManager", "Service disconnected: " + componentName);
            }
            d5.this.f23418b = null;
        }
    }

    /* loaded from: classes3.dex */
    public class b extends CustomTabsCallback {

        /* renamed from: a */
        private final com.applovin.impl.adview.a f23420a;

        public b(com.applovin.impl.adview.a aVar) {
            this.f23420a = aVar;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onNavigationEvent(int i2, Bundle bundle) {
            com.applovin.impl.sdk.ad.b i3 = this.f23420a.i();
            if (i3 == null) {
                d5.this.f23417a.J();
                if (com.applovin.impl.sdk.n.a()) {
                    d5.this.f23417a.J().b("CustomTabsManager", "Unable to track navigation event (" + i2 + "). No ad specified.");
                    return;
                }
                return;
            }
            switch (i2) {
                case 1:
                    if (i3.R0()) {
                        d5.this.f23417a.i().trackCustomTabsNavigationStarted(i3);
                        return;
                    }
                    return;
                case 2:
                    if (i3.R0()) {
                        d5.this.f23417a.i().trackCustomTabsNavigationFinished(i3);
                        return;
                    }
                    return;
                case 3:
                    if (i3.R0()) {
                        d5.this.f23417a.i().trackCustomTabsNavigationFailed(i3);
                        return;
                    }
                    return;
                case 4:
                    if (i3.R0()) {
                        d5.this.f23417a.i().trackCustomTabsNavigationAborted(i3);
                        return;
                    }
                    return;
                case 5:
                    if (i3.R0()) {
                        d5.this.f23417a.i().trackCustomTabsTabShown(i3);
                    }
                    gc.c(this.f23420a.e(), i3, this.f23420a.k());
                    return;
                case 6:
                    if (i3.R0()) {
                        d5.this.f23417a.i().trackCustomTabsTabHidden(i3);
                    }
                    gc.a(this.f23420a.e(), i3, this.f23420a.k());
                    return;
                default:
                    d5.this.f23417a.J();
                    if (com.applovin.impl.sdk.n.a()) {
                        d5.this.f23417a.J().a("CustomTabsManager", "Unknown navigation event: " + i2);
                        return;
                    }
                    return;
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onRelationshipValidationResult(int i2, Uri uri, boolean z2, Bundle bundle) {
            d5.this.f23417a.J();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n J = d5.this.f23417a.J();
                StringBuilder sb = new StringBuilder("Validation ");
                sb.append(z2 ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : "failed");
                sb.append(" for session-URL relation(");
                sb.append(i2);
                sb.append("), requestedOrigin(");
                sb.append(uri);
                sb.append(")");
                J.a("CustomTabsManager", sb.toString());
            }
        }
    }

    public d5(com.applovin.impl.sdk.j jVar) {
        this.f23417a = jVar;
    }

    public static void safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(CustomTabsIntent p02, Context p12, Uri p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/browser/customtabs/CustomTabsIntent;->launchUrl(Landroid/content/Context;Landroid/net/Uri;)V");
        if (p2 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p2, com.safedk.android.utils.g.f30048a);
        p02.launchUrl(p12, p2);
    }

    public void b(List list, CustomTabsSession customTabsSession) {
        if (list.isEmpty()) {
            return;
        }
        if (customTabsSession == null) {
            this.f23417a.J();
            if (com.applovin.impl.sdk.n.a()) {
                this.f23417a.J().a("CustomTabsManager", "Custom Tabs session is null, cannot warmup urls");
                return;
            }
            return;
        }
        a("warmup urls", new ks(this, 4, list, customTabsSession));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (com.applovin.impl.sdk.n.a() != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.util.LinkedList r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Retrying with next package name..."
            java.lang.String r1 = "CustomTabsManager"
            r2 = 0
            android.content.Context r3 = com.applovin.impl.sdk.j.l()     // Catch: java.lang.Throwable -> L31
            java.lang.Object r4 = r7.poll()     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L31
            com.applovin.impl.d5$a r5 = new com.applovin.impl.d5$a     // Catch: java.lang.Throwable -> L31
            r5.<init>()     // Catch: java.lang.Throwable -> L31
            boolean r2 = androidx.browser.customtabs.CustomTabsClient.a(r3, r4, r5)     // Catch: java.lang.Throwable -> L31
            if (r2 != 0) goto L33
            com.applovin.impl.sdk.j r3 = r6.f23417a     // Catch: java.lang.Throwable -> L31
            r3.J()     // Catch: java.lang.Throwable -> L31
            boolean r3 = com.applovin.impl.sdk.n.a()     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L33
            com.applovin.impl.sdk.j r3 = r6.f23417a     // Catch: java.lang.Throwable -> L31
            com.applovin.impl.sdk.n r3 = r3.J()     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = "Custom Tabs service not available"
            r3.b(r1, r4)     // Catch: java.lang.Throwable -> L31
            goto L33
        L31:
            r3 = move-exception
            goto L47
        L33:
            if (r2 != 0) goto L7f
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L7f
            com.applovin.impl.sdk.j r2 = r6.f23417a
            r2.J()
            boolean r2 = com.applovin.impl.sdk.n.a()
            if (r2 == 0) goto L7c
            goto L73
        L47:
            com.applovin.impl.sdk.j r4 = r6.f23417a     // Catch: java.lang.Throwable -> L5e
            r4.J()     // Catch: java.lang.Throwable -> L5e
            boolean r4 = com.applovin.impl.sdk.n.a()     // Catch: java.lang.Throwable -> L5e
            if (r4 == 0) goto L60
            com.applovin.impl.sdk.j r4 = r6.f23417a     // Catch: java.lang.Throwable -> L5e
            com.applovin.impl.sdk.n r4 = r4.J()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r5 = "Failed to bind to service"
            r4.a(r1, r5, r3)     // Catch: java.lang.Throwable -> L5e
            goto L60
        L5e:
            r3 = move-exception
            goto L80
        L60:
            if (r2 != 0) goto L7f
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L7f
            com.applovin.impl.sdk.j r2 = r6.f23417a
            r2.J()
            boolean r2 = com.applovin.impl.sdk.n.a()
            if (r2 == 0) goto L7c
        L73:
            com.applovin.impl.sdk.j r2 = r6.f23417a
            com.applovin.impl.sdk.n r2 = r2.J()
            r2.a(r1, r0)
        L7c:
            r6.a(r7)
        L7f:
            return
        L80:
            if (r2 != 0) goto L9f
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L9f
            com.applovin.impl.sdk.j r2 = r6.f23417a
            r2.J()
            boolean r2 = com.applovin.impl.sdk.n.a()
            if (r2 == 0) goto L9c
            com.applovin.impl.sdk.j r2 = r6.f23417a
            com.applovin.impl.sdk.n r2 = r2.J()
            r2.a(r1, r0)
        L9c:
            r6.a(r7)
        L9f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.d5.a(java.util.LinkedList):void");
    }

    public void a() {
        if (((Boolean) this.f23417a.a(sj.D6)).booleanValue() && this.f23418b == null) {
            String c2 = CustomTabsClient.c(com.applovin.impl.sdk.j.l(), this.f23417a.c(sj.E6), true);
            String c3 = CustomTabsClient.c(com.applovin.impl.sdk.j.l(), null, false);
            LinkedList linkedList = new LinkedList();
            if (((Boolean) this.f23417a.a(sj.F6)).booleanValue()) {
                CollectionUtils.addUniqueObjectIfExists(c3, linkedList);
                CollectionUtils.addUniqueObjectIfExists(c2, linkedList);
            } else {
                CollectionUtils.addUniqueObjectIfExists(c2, linkedList);
                CollectionUtils.addUniqueObjectIfExists(c3, linkedList);
            }
            if (linkedList.isEmpty()) {
                this.f23417a.J();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f23417a.J().b("CustomTabsManager", "Unable to find a supported Custom Tabs package name");
                    return;
                }
                return;
            }
            a(linkedList);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.browser.customtabs.CustomTabColorSchemeParams$Builder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.browser.customtabs.CustomTabColorSchemeParams$Builder, java.lang.Object] */
    private CustomTabsIntent a(com.applovin.impl.adview.a aVar, Activity activity) {
        this.f23417a.J();
        if (com.applovin.impl.sdk.n.a()) {
            this.f23417a.J().a("CustomTabsManager", "Creating Custom Tabs intent");
        }
        com.applovin.impl.sdk.ad.b i2 = aVar.i();
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(aVar.j());
        e5 w = i2 != null ? i2.w() : null;
        boolean booleanValue = ((Boolean) this.f23417a.a(sj.G6)).booleanValue();
        Intent intent = builder.f1353a;
        if (booleanValue) {
            builder.f1355c = ActivityOptionsCompat.a(activity, R.anim.applovin_slide_up_animation, R.anim.applovin_slide_down_animation).b();
            intent.putExtra(CustomTabsIntent.EXTRA_EXIT_ANIMATION_BUNDLE, ActivityOptionsCompat.a(activity, R.anim.applovin_slide_up_animation, R.anim.applovin_slide_down_animation).b());
        }
        if (w != null) {
            Integer h2 = w.h();
            if (h2 != null) {
                ?? obj = new Object();
                Integer valueOf = Integer.valueOf(h2.intValue() | (-16777216));
                obj.f1332a = valueOf;
                builder.e = new CustomTabColorSchemeParams(valueOf, null, null, null).b();
            }
            Integer a2 = w.a();
            if (a2 != null) {
                ?? obj2 = new Object();
                Integer valueOf2 = Integer.valueOf(a2.intValue() | (-16777216));
                obj2.f1332a = valueOf2;
                CustomTabColorSchemeParams customTabColorSchemeParams = new CustomTabColorSchemeParams(valueOf2, null, null, null);
                if (builder.d == null) {
                    builder.d = new SparseArray();
                }
                builder.d.put(2, customTabColorSchemeParams.b());
            }
            Boolean i3 = w.i();
            if (i3 != null) {
                intent.putExtra(CustomTabsIntent.EXTRA_ENABLE_URLBAR_HIDING, i3.booleanValue());
            }
            Boolean g2 = w.g();
            if (g2 != null) {
                intent.putExtra(CustomTabsIntent.EXTRA_TITLE_VISIBILITY_STATE, g2.booleanValue() ? 1 : 0);
            }
            Boolean c2 = w.c();
            if (c2 != null) {
                builder.f1357g = c2.booleanValue();
            }
            Integer f2 = w.f();
            if (f2 != null) {
                int intValue = f2.intValue();
                if (intValue < 0 || intValue > 2) {
                    throw new IllegalArgumentException("Invalid value for the shareState argument");
                }
                builder.f1356f = intValue;
                if (intValue == 1) {
                    intent.putExtra(CustomTabsIntent.EXTRA_DEFAULT_SHARE_MENU_ITEM, true);
                } else if (intValue == 2) {
                    intent.putExtra(CustomTabsIntent.EXTRA_DEFAULT_SHARE_MENU_ITEM, false);
                } else {
                    intent.removeExtra(CustomTabsIntent.EXTRA_DEFAULT_SHARE_MENU_ITEM);
                }
            }
        }
        CustomTabsIntent a3 = builder.a();
        if (w != null) {
            String d = w.d();
            if (d != null) {
                a3.intent.putExtra("android.intent.extra.REFERRER", Uri.parse(d));
            }
            Bundle r2 = i2.r();
            if (!r2.isEmpty()) {
                a3.intent.putExtra("com.android.browser.headers", r2);
            }
        }
        return a3;
    }

    public /* synthetic */ void a(com.applovin.impl.adview.a aVar, Activity activity, String str) {
        safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(a(aVar, activity), activity, Uri.parse(str));
    }

    public void a(com.applovin.impl.sdk.ad.b bVar, CustomTabsSession customTabsSession) {
        CustomTabsClient customTabsClient = this.f23418b;
        customTabsClient.getClass();
        try {
            customTabsClient.f1333a.E(0L);
        } catch (RemoteException unused) {
        }
        e5 w = bVar.w();
        if (w == null) {
            return;
        }
        Integer e = w.e();
        String b2 = w.b();
        if (e == null || TextUtils.isEmpty(b2)) {
            return;
        }
        if (customTabsSession == null) {
            this.f23417a.J();
            if (com.applovin.impl.sdk.n.a()) {
                this.f23417a.J().b("CustomTabsManager", "Cannot validate session-URL relation because the session is null");
                return;
            }
            return;
        }
        this.f23417a.J();
        if (com.applovin.impl.sdk.n.a()) {
            this.f23417a.J().a("CustomTabsManager", "Validating session-URL relation: " + e + " with digital asset link: " + b2);
        }
        int intValue = e.intValue();
        Uri parse = Uri.parse(b2);
        if (intValue < 1 || intValue > 2) {
            return;
        }
        try {
            customTabsSession.f1359b.A(intValue, parse, customTabsSession.a(), customTabsSession.f1360c);
        } catch (RemoteException unused2) {
        }
    }

    public void a(List list, CustomTabsSession customTabsSession) {
        this.f23417a.J();
        if (com.applovin.impl.sdk.n.a()) {
            this.f23417a.J().a("CustomTabsManager", "Warming up URLs: " + list);
        }
        boolean z2 = false;
        String str = (String) list.remove(0);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.customtabs.otherurls.URL", Uri.parse(str2));
            arrayList.add(bundle);
        }
        try {
            z2 = customTabsSession.f1359b.K(customTabsSession.f1360c, Uri.parse(str), customTabsSession.a(), arrayList);
        } catch (RemoteException unused) {
        }
        this.f23417a.J();
        if (com.applovin.impl.sdk.n.a()) {
            this.f23417a.J().a("CustomTabsManager", "Warmup for URLs ".concat(z2 ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : "failed"));
        }
    }

    public void a(String str, com.applovin.impl.adview.a aVar, Activity activity) {
        a("launch url", new ft(this, aVar, activity, str, 0));
    }

    private void a(String str, Runnable runnable) {
        try {
            this.f23417a.J();
            if (com.applovin.impl.sdk.n.a()) {
                this.f23417a.J().a("CustomTabsManager", "Running operation: " + str);
            }
            runnable.run();
            this.f23417a.J();
            if (com.applovin.impl.sdk.n.a()) {
                this.f23417a.J().a("CustomTabsManager", "Finished operation: " + str);
            }
        } catch (Throwable th) {
            this.f23417a.J();
            if (com.applovin.impl.sdk.n.a()) {
                this.f23417a.J().a("CustomTabsManager", "Failed to run operation: " + str, th);
            }
            this.f23417a.E().a("CustomTabsManager", str, th);
        }
    }

    public CustomTabsSession a(com.applovin.impl.adview.a aVar) {
        if (this.f23418b == null) {
            this.f23417a.J();
            if (com.applovin.impl.sdk.n.a()) {
                this.f23417a.J().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.f23417a.J();
        if (com.applovin.impl.sdk.n.a()) {
            this.f23417a.J().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            CustomTabsSession d = this.f23418b.d(new b(aVar));
            a(d, aVar.i());
            return d;
        } catch (Exception e) {
            this.f23417a.J();
            if (com.applovin.impl.sdk.n.a()) {
                this.f23417a.J().a("CustomTabsManager", "Failed to create Custom Tabs session", e);
            }
            return null;
        }
    }

    private void a(CustomTabsSession customTabsSession, com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null || !bVar.A0()) {
            return;
        }
        a("client warmup", new ks(this, 3, bVar, customTabsSession));
    }
}
