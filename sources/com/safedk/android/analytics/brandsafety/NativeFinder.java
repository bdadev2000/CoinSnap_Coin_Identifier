package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.StatsReporter;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.ScreenshotHelper;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.LinkedHashSetWithItemLimit;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class NativeFinder extends b {
    public static final int F = 5;
    protected static final long G = 1000;
    protected static final long H = 500;
    private static final String I = "NativeFinder";
    private static final long J = 10;
    private static final Map<String, WeakReference<MaxNativeAdView>> N = new HashMap();
    private static final Map<String, WeakReference<MaxNativeAdView>> O = new HashMap();
    private static final Map<String, String> P = new HashMap();
    private final LinkedHashSetWithItemLimit<String> K;
    private final Map<d, s> L;
    private final Map<String, o> M;

    public NativeFinder(int maxAttemptsToCaptureImage) {
        super(BrandSafetyUtils.AdType.NATIVE, Collections.singletonList("NATIVE"), I, maxAttemptsToCaptureImage);
        this.K = new LinkedHashSetWithItemLimit<>(J);
        this.L = new HashMap();
        this.M = new HashMap();
    }

    @Override // com.safedk.android.analytics.brandsafety.b
    protected c a(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        return new s(str, str2, str3, screenShotOrientation, str4, str5);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage message) {
        String string;
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o() && SafeDK.getInstance() != null && SafeDK.getInstance().q()) {
            try {
                Bundle messageData = message.getMessageData();
                if (messageData.containsKey("revenue_event") && messageData.containsKey("ad_format") && this.f29367b.contains(messageData.getString("ad_format"))) {
                    Logger.d(I, "Revenue event detected : " + messageData);
                    string = "revenue_event";
                } else {
                    string = messageData.getString("type");
                }
                String string2 = messageData.getString("ad_format");
                String string3 = messageData.getString(BrandSafetyEvent.f29784k);
                String string4 = messageData.getString(BrandSafetyEvent.f29785l);
                String l2 = BrandSafetyUtils.l(messageData.getString("ad_view"));
                String string5 = messageData.getString("id", null);
                if (string5 == null) {
                    Logger.d(I, "No eventId in data bundle, cannot match");
                }
                String string6 = messageData.getString(BrandSafetyEvent.ad);
                String b2 = CreativeInfoManager.b(string6);
                long currentTimeMillis = System.currentTimeMillis();
                long b3 = com.safedk.android.utils.k.b(currentTimeMillis);
                String str = null;
                if (messageData.containsKey("creative_id")) {
                    str = messageData.getString("creative_id");
                }
                if (this.f29367b.contains(string2)) {
                    Logger.d(I, "Max message received, package: " + b2 + ", ts (seconds): " + b3 + ", message received: " + message.getMessageData() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                    d dVar = new d(string4, string3, string5, b2, string6, BrandSafetyUtils.AdType.NATIVE);
                    if ("WILL_DISPLAY".equals(string)) {
                        if (b2 != null && g(string6, b2)) {
                            Logger.d(I, "WILL_DISPLAY event for package=" + b2 + ", key=" + dVar + ", view address=" + l2 + ", slot count=" + this.d);
                            CreativeInfoManager.a(b2, string3, str, string5, string2);
                            a(string5, ImpressionLog.f29254f, new ImpressionLog.a(ImpressionLog.G, BrandSafetyUtils.l(messageData.getString("ad_view"))));
                        }
                        a(string6, b2, str, dVar, l2, messageData, currentTimeMillis);
                        return;
                    }
                    if ("revenue_event".equals(string)) {
                        if (b2 != null && g(string6, b2)) {
                            Logger.d(I, "REVENUE_EVENT event for package=" + b2 + ", key=" + dVar + ", view address=" + l2 + ", slot count=" + this.d);
                            a(string5, ImpressionLog.f29259k, new ImpressionLog.a(ImpressionLog.F, messageData.getString("revenue_event")));
                        }
                        a(string6, b2, str, dVar, l2, messageData);
                        return;
                    }
                    if ("DID_CLICKED".equals(string)) {
                        if (g(string6, b2)) {
                            a(string5, ImpressionLog.f29256h, new ImpressionLog.a[0]);
                            if (this.L.get(dVar) != null) {
                                StringBuilder append = new StringBuilder().append("DID_CLICKED event for package=");
                                if (b2 != null) {
                                    string6 = b2;
                                }
                                Logger.d(I, append.append(string6).append(", slot count=").append(this.d).toString());
                                c(dVar);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if ("WILL_LOAD".equals(string)) {
                        if (b2 != null && g(string6, b2)) {
                            Logger.d(I, "WILL_LOAD event for package=" + b2 + ", key=" + dVar + ", slot count=" + this.d);
                            a(string5, ImpressionLog.d, new ImpressionLog.a(ImpressionLog.I, string6));
                            com.safedk.android.analytics.brandsafety.creatives.e.b(b2, string3);
                            return;
                        }
                        return;
                    }
                    if ("DID_HIDE".equals(string)) {
                        if (b2 != null && g(string6, b2)) {
                            Logger.d(I, "DID_HIDE event for package=" + b2 + ", key=" + dVar + ", slot count=" + this.d);
                            a(string5, ImpressionLog.f29257i, new ImpressionLog.a[0]);
                            a(dVar);
                            return;
                        }
                        return;
                    }
                    if ("DID_LOAD".equals(string)) {
                        if (b2 != null && g(string6, b2)) {
                            Logger.d(I, "DID_LOAD event for package=" + b2 + ", key=" + dVar + ", slot count=" + this.d);
                            a(string5, ImpressionLog.e, new ImpressionLog.a(ImpressionLog.I, string6));
                            return;
                        }
                        return;
                    }
                    if ("DID_DISPLAY".equals(string)) {
                        if (b2 != null && g(string6, b2)) {
                            Logger.d(I, "DID_DISPLAY event for package=" + b2 + ", key=" + dVar + ", slot count=" + this.d);
                            a(string5, ImpressionLog.f29255g, new ImpressionLog.a[0]);
                            a(b2, dVar, str, messageData, currentTimeMillis);
                            return;
                        }
                        return;
                    }
                    if ("DID_FAIL_DISPLAY".equals(string) && b2 != null && g(string6, b2)) {
                        Logger.d(I, "DID_FAIL_DISPLAY event for package=" + b2 + ", key=" + dVar + ", slot count=" + this.d);
                        a(string5, ImpressionLog.f29258j, new ImpressionLog.a[0]);
                        b(dVar);
                    }
                }
            } catch (Throwable th) {
                Logger.e(I, "on message received exception", th);
            }
        }
    }

    private void a(String str, String str2, String str3, d dVar, String str4, Bundle bundle, long j2) {
        s sVar;
        if (this.K.contains(dVar.f29647c)) {
            Logger.d(I, "handle WILL_DISPLAY - impression with id " + dVar.f29647c + " has already been reported, ignoring.");
            return;
        }
        Activity foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
        Logger.d(I, "handle WILL_DISPLAY - image count for " + this.f29368c.name() + " is " + BrandSafetyUtils.b(this.f29368c) + ", impressions to report(" + this.B.keySet().size() + ") = " + this.B.keySet());
        if (g(str, str2)) {
            synchronized (this.L) {
                s sVar2 = this.L.get(dVar);
                if (sVar2 == null) {
                    s a2 = a(foregroundActivity, str2, dVar.f29647c, bundle);
                    this.L.put(dVar, a2);
                    Logger.d(I, "New activity native created for " + str2 + ", native key is " + dVar + ", current activity native size is " + this.L.size());
                    sVar = a2;
                } else {
                    if (sVar2.A == null) {
                        sVar2.A = bundle;
                    }
                    if (sVar2.B == null || sVar2.C == null) {
                        sVar2.a(a(foregroundActivity));
                    }
                    sVar = sVar2;
                }
            }
            sVar.K = TextUtils.isEmpty(str4) ? null : str4;
            sVar.V = true;
            sVar.ab = true;
            sVar.ac = j2;
            a(sVar, false, "handleWillDisplay");
            sVar.Z = this.D.scheduleAtFixedRate(new a(sVar, dVar, this.e), H, G, TimeUnit.MILLISECONDS);
            a(sVar, dVar);
            a(sVar, dVar, (WeakReference<MaxNativeAdView>) a(dVar, str4, false).first);
            return;
        }
        this.d++;
    }

    private o a(s sVar, d dVar, WeakReference<MaxNativeAdView> weakReference) {
        o oVar = null;
        if (weakReference != null && weakReference.get() != null) {
            sVar.ag = true;
            synchronized (this.M) {
                oVar = this.M.remove(sVar.K);
                if (oVar != null) {
                    Logger.d(I, "try setting pending info - found pending CI by view address: " + sVar.K + " matching info: " + oVar);
                    a(dVar.f29645a, dVar.e, oVar);
                }
            }
        }
        return oVar;
    }

    private Pair<WeakReference<MaxNativeAdView>, String> a(d dVar, String str, boolean z2) {
        WeakReference<MaxNativeAdView> weakReference;
        synchronized (NativeFinder.class) {
            weakReference = N.get(dVar.f29647c);
            if (TextUtils.isEmpty(str) && weakReference != null && weakReference.get() != null) {
                str = BrandSafetyUtils.a(weakReference.get());
            }
            if (!TextUtils.isEmpty(str) && (weakReference == null || weakReference.get() == null)) {
                WeakReference<MaxNativeAdView> remove = z2 ? O.remove(str) : O.get(str);
                if (remove == null || remove.get() == null) {
                    weakReference = remove;
                } else {
                    Logger.d(I, "get ad view ref - native ad view found: " + remove.get() + " for event ID: " + dVar.f29647c);
                    a(dVar.f29647c, dVar.d, remove.get());
                    weakReference = remove;
                }
            } else if (z2) {
                O.remove(str);
            }
        }
        return new Pair<>(weakReference, str);
    }

    private void a(String str, String str2, String str3, d dVar, String str4, Bundle bundle) {
        s sVar;
        AdNetworkDiscovery h2;
        Activity foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
        if (this.K.contains(dVar.f29647c)) {
            Logger.d(I, "handle REVENUE_EVENT - impression with id " + dVar.f29647c + " has already been reported, ignoring.");
            return;
        }
        Pair<WeakReference<MaxNativeAdView>, String> a2 = a(dVar, str4, true);
        WeakReference<MaxNativeAdView> weakReference = (WeakReference) a2.first;
        String str5 = (String) a2.second;
        a(str5, dVar);
        if (g(str, str2)) {
            synchronized (this.L) {
                s sVar2 = this.L.get(dVar);
                if (sVar2 == null) {
                    s a3 = a(foregroundActivity, str2, dVar.f29647c, bundle);
                    this.L.put(dVar, a3);
                    Logger.d(I, "New activity native created for " + str2 + ", native key is " + dVar + ", current activity natives size is " + this.L.size());
                    sVar = a3;
                } else {
                    if (sVar2.A == null) {
                        sVar2.A = bundle;
                    }
                    if (sVar2.B == null || sVar2.C == null) {
                        sVar2.a(a(foregroundActivity));
                    }
                    sVar = sVar2;
                }
            }
            if (bundle.getString("revenue_event") != null) {
                sVar.P = bundle.getString("revenue_event");
            } else {
                sVar.P = "unknown";
            }
            if (sVar.K == null) {
                sVar.K = TextUtils.isEmpty(str5) ? null : str5;
                synchronized (NativeFinder.class) {
                    P.put(str5, str2);
                }
            }
            sVar.M = str3;
            o a4 = a(sVar, dVar, weakReference);
            if (a4 == null && (h2 = CreativeInfoManager.h(dVar.d)) != null) {
                CreativeInfo a5 = h2.a((Object) dVar.f29647c);
                Logger.d(I, "set CI details - matched ci: " + a5);
                if (a5 != null) {
                    a4 = new o(a5, CreativeInfo.f29625m, dVar.f29647c);
                    Logger.d(I, "set CI details - try to match by event ID: " + dVar.f29647c + " matching info: " + a4);
                    a(dVar.f29645a, dVar.e, a4);
                }
            }
            if (a4 == null) {
                a(sVar, false, "handleRevenueEvent");
            }
            Logger.d(I, "Revenue event set to " + bundle.getString("revenue_event") + " for eventId " + dVar.f29647c);
            sVar.V = true;
            return;
        }
        this.d++;
    }

    private void a(String str, d dVar, String str2, Bundle bundle, long j2) {
        s sVar;
        if (this.K.contains(dVar.f29647c)) {
            Logger.d(I, "handle DID_DISPLAY - impression with id " + dVar.f29647c + " has already been reported, ignoring. ");
            return;
        }
        Logger.d(I, "handle DID_DISPLAY package=" + str + " key=" + dVar);
        Activity foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
        synchronized (this.L) {
            sVar = this.L.get(dVar);
            if (sVar != null) {
                Logger.d(I, "Native info already exists, package=" + str + " activity native=" + sVar);
                sVar.f29390z = this.d;
                if (sVar.B == null || sVar.C == null) {
                    sVar.a(a(foregroundActivity));
                }
            } else {
                sVar = a(foregroundActivity, str, dVar.f29647c, bundle);
                this.L.put(dVar, sVar);
                Logger.d(I, "New activity native created for " + str + ", key=" + dVar + ", current activity ads size=" + this.L.size());
            }
        }
        sVar.M = str2;
        sVar.ad = j2;
        a(sVar, false, "handleDidDisplay");
    }

    private void a(d dVar) {
        synchronized (this.L) {
            s remove = this.L.remove(dVar);
            if (remove != null) {
                Logger.d(I, "handle DID_HIDE, placementId=" + dVar.f29646b);
                remove.X = true;
            }
        }
    }

    private void b(d dVar) {
        synchronized (this.L) {
            s sVar = this.L.get(dVar);
            if (sVar != null) {
                sVar.N = true;
            }
        }
    }

    private void c(d dVar) {
        s sVar;
        Logger.d(I, "handle DID_CLICKED started");
        synchronized (this.L) {
            sVar = this.L.get(dVar);
        }
        if (sVar != null) {
            sVar.a(true);
            a(sVar, false, "handleDidClicked");
        }
    }

    private s a(Activity activity, String str, String str2, Bundle bundle) {
        String lowerCase = BrandSafetyUtils.c().name().toLowerCase();
        this.d++;
        Logger.d(I, "slot number incremented to " + this.d + ", eventId is " + str2 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        s sVar = new s(a(activity), str, this.d, lowerCase, bundle, str2);
        sVar.aa = new WeakReference<>(activity);
        return sVar;
    }

    protected boolean g(String str, String str2) {
        boolean a2 = CreativeInfoManager.a(str2, AdNetworkConfiguration.SUPPORTS_NATIVE_IMPRESSION_TRACKING, false);
        String a3 = CreativeInfoManager.a(str2, AdNetworkConfiguration.AD_NETWORK_TO_IGNORE, (String) null);
        Logger.d(I, "sdk " + str2 + ": config item SUPPORTS_NATIVE_IMPRESSION_TRACKING is " + a2 + ", config item AD_NETWORK_TO_IGNORE is " + a3 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (a2 && !str.equals(a3)) {
            return true;
        }
        Logger.d(I, "Native ads tracking is not supported for this ad network (" + str + ")");
        return false;
    }

    public void a(final String str, final String str2, final MaxNativeAdView maxNativeAdView) {
        if (com.safedk.android.utils.k.c()) {
            this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.NativeFinder.1
                @Override // java.lang.Runnable
                public void run() {
                    NativeFinder.this.b(str, str2, maxNativeAdView);
                }
            });
        } else {
            b(str, str2, maxNativeAdView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2, MaxNativeAdView maxNativeAdView) {
        if (str != null && str2 != null && maxNativeAdView != null) {
            String a2 = BrandSafetyUtils.a(maxNativeAdView);
            synchronized (NativeFinder.class) {
                if (!N.containsKey(str)) {
                    a(str, ImpressionLog.f29260l, new ImpressionLog.a(ImpressionLog.G, a2));
                }
                N.put(str, new WeakReference<>(maxNativeAdView));
                P.put(a2, str2);
            }
            Logger.d(I, "add native ad view: " + maxNativeAdView + ", eventId: " + str + ", adViewAddress: " + a2 + ", sdk: " + str2 + ", list size: " + N.size() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        }
    }

    public void a(final MaxNativeAdView maxNativeAdView) {
        if (com.safedk.android.utils.k.c()) {
            this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.NativeFinder.2
                @Override // java.lang.Runnable
                public void run() {
                    NativeFinder.this.c(maxNativeAdView);
                }
            });
        } else {
            c(maxNativeAdView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(MaxNativeAdView maxNativeAdView) {
        String a2 = BrandSafetyUtils.a(maxNativeAdView);
        synchronized (NativeFinder.class) {
            O.put(a2, new WeakReference<>(maxNativeAdView));
        }
        Logger.d(I, "add native ad view: " + maxNativeAdView + ", list size: " + O.size());
    }

    private void a(String str, d dVar) {
        boolean z2;
        Logger.d(I, "report completed event started, view address: " + str + ", key: " + dVar);
        synchronized (this.L) {
            Iterator<Map.Entry<d, s>> it = this.L.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<d, s> next = it.next();
                d key = next.getKey();
                if (key.f29645a.equals(dVar.f29645a) && !key.f29647c.equals(dVar.f29647c)) {
                    s value = next.getValue();
                    if (value.K != null && value.K.equals(str)) {
                        Logger.d(I, "report completed event, same view address: " + value.K + ", event id: " + key.f29647c);
                        z2 = true;
                    } else {
                        synchronized (NativeFinder.class) {
                            WeakReference<MaxNativeAdView> weakReference = N.get(key.f29647c);
                            if (weakReference == null || weakReference.get() == null || weakReference.get().getParent() == null) {
                                Logger.d(I, "report completed event, closed view address: " + value.K + ", event id: " + key.f29647c);
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                    }
                    if (z2) {
                        value.a(ImpressionLog.C, new ImpressionLog.a[0]);
                        value.U = true;
                        a(value, true, "reportCompletedEvents");
                        a(value);
                        it.remove();
                    } else {
                        Logger.d(I, "report completed event skipped, view address: " + value.K + ", event id: " + key.f29647c);
                    }
                }
            }
        }
    }

    private void a(final s sVar, final d dVar) {
        sVar.Y = this.D.schedule(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.NativeFinder.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (NativeFinder.this.L) {
                    NativeFinder.this.a(sVar, true, "handleWillDisplay:reportTimeout");
                    NativeFinder.this.L.remove(dVar);
                    NativeFinder.this.a(sVar);
                }
            }
        }, 5L, TimeUnit.MINUTES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(s sVar) {
        try {
            Logger.d(I, "clean started, currentActivityAds size is " + this.L.size() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            if (sVar != null) {
                Logger.d(I, "clean, adding to reported impressions map. id =  " + sVar.L);
                this.K.add(sVar.L);
                sVar.X = true;
                if (sVar.Y != null) {
                    sVar.Y.cancel(false);
                }
                if (sVar.Z != null) {
                    sVar.Z.cancel(false);
                }
                for (l lVar : sVar.g()) {
                    if (lVar.f29740b != null && lVar.f29740b.f29692b != null) {
                        lVar.f29741c = lVar.f29740b.f29692b;
                        Logger.d(I, "clean, set last impression screenshot filename to " + lVar.f29740b.f29692b);
                    }
                }
                synchronized (NativeFinder.class) {
                    N.remove(sVar.L);
                }
                b(sVar);
            }
        } catch (Throwable th) {
            Logger.e(I, "Error in clean " + th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(s sVar, boolean z2, String str) {
        boolean z3 = !sVar.E;
        boolean z4 = !sVar.F && sVar.d();
        long j2 = 0;
        if (sVar.ac > 0 && sVar.ad > 0) {
            j2 = sVar.ac - sVar.ad;
        }
        ArrayList arrayList = new ArrayList();
        if (sVar.j().isEmpty()) {
            Logger.d(I, "reporting event started, root=" + str + ", isMature=" + z2 + ", adInfo=" + sVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            arrayList.add(a(sVar, sVar.h(), z2, z4, j2, (String) null));
        } else {
            for (l lVar : sVar.g()) {
                if (lVar.e() != null && lVar.e().V() == null) {
                    Logger.d(I, "reporting event - don't report CI as it was matched only by eventId and not by webview resources");
                    lVar.a((CreativeInfo) null);
                }
                String str2 = null;
                if (z2 && lVar.f29740b != null && lVar.f29740b.f29691a != null) {
                    str2 = lVar.f29740b.f29691a + "_" + lVar.f29739a;
                    Logger.d(I, "reporting event - imageFileIsValid filename = " + BrandSafetyUtils.a(sVar.f29382p, lVar.f29740b.f29691a, sVar.c(), lVar.f29739a, lVar.f29740b.f29694f));
                }
                Logger.d(I, "reporting event started, root=" + str + ", isMature=" + z2 + ", info=" + sVar + ", uniformity=" + (lVar.f29740b != null ? lVar.f29740b.a(com.safedk.android.internal.d.f29936c) : 0.0f));
                arrayList.add(a(sVar, lVar, z2, z4, j2, str2));
                if (z2 && lVar.e() != null && lVar.f29740b != null) {
                    if (this.B.size() <= SafeDK.getInstance().H()) {
                        Logger.d(I, "reporting event waiting to report file " + lVar.f29740b.f29692b);
                        a(sVar, lVar);
                    } else {
                        Logger.d(I, "reporting event no open slot for " + this.f29368c + ", " + lVar.f29740b.f29691a);
                        BrandSafetyUtils.d(lVar.f29740b.f29692b);
                    }
                }
            }
        }
        if (!z2 && sVar.U) {
            Logger.w(I, "reporting event - ad finished, should discard brand safety event: " + arrayList);
        } else if (StatsCollector.c() != null) {
            StatsCollector.c().a(arrayList);
        } else {
            Logger.w(I, "reporting event - stats collector instance is null, cannot report brand safety event");
        }
        if (z3) {
            sVar.b(true);
        }
        if (z4) {
            sVar.c(true);
        }
    }

    private static BrandSafetyEvent a(s sVar, l lVar, boolean z2, boolean z3, long j2, String str) {
        return new BrandSafetyEvent(sVar.c(), sVar.q(), str, z3, sVar.d() ? sVar.e() : null, lVar.e(), sVar.a(), sVar.p(), lVar.f29739a != null ? lVar.f29739a : "", sVar.D, z2, sVar.r(), lVar.f29740b != null ? lVar.f29740b.f29694f : null, lVar.f29740b != null ? lVar.f29740b.f29693c : 0L, lVar.f29740b != null ? lVar.f29740b.a(com.safedk.android.internal.d.f29936c) : 0.0f, lVar.f29740b != null ? lVar.f29740b.e : 0, sVar.ab, sVar.ag, j2, sVar.ae, sVar.af, SafeDK.getInstance().e(), sVar.w(), sVar.M, sVar.N, sVar.P, sVar.Q, b(sVar, lVar).toString());
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void a(String str) {
        Iterator<s> it = this.L.values().iterator();
        while (it.hasNext()) {
            it.next().X = true;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> a(String str, String str2) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> c(String str, String str2) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public c b(String str) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
    
        com.safedk.android.utils.Logger.d(com.safedk.android.analytics.brandsafety.NativeFinder.I, "set CI details - adding as pending, view address: " + r3.af() + " matching info: " + r9);
        r1 = r8.M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c6, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c7, code lost:
    
        r8.M.put(r3.af(), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d1, code lost:
    
        r0 = true;
     */
    @Override // com.safedk.android.analytics.brandsafety.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(com.safedk.android.analytics.brandsafety.o r9) {
        /*
            r8 = this;
            r2 = 1
            java.lang.String r0 = "NativeFinder"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld6
            r1.<init>()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r3 = "set CI details started. matchingInfo = "
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r3 = r9.toString()     // Catch: java.lang.Throwable -> Ld6
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Ld6
            com.safedk.android.utils.k.b(r0, r1)     // Catch: java.lang.Throwable -> Ld6
            com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo r3 = r9.f29758a     // Catch: java.lang.Throwable -> Ld6
            if (r3 == 0) goto Lf3
            java.lang.String r0 = "NativeFinder"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld6
            r1.<init>()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r4 = "set CI details - CI exists in matchingInfo, sdk = "
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r4 = r3.Q()     // Catch: java.lang.Throwable -> Ld6
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Ld6
            com.safedk.android.utils.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> Ld6
            com.safedk.android.analytics.brandsafety.BrandSafetyUtils$ScreenShotOrientation r0 = com.safedk.android.analytics.brandsafety.BrandSafetyUtils.ScreenShotOrientation.PORTRAIT     // Catch: java.lang.Throwable -> Ld6
            com.safedk.android.analytics.brandsafety.BrandSafetyUtils$ScreenShotOrientation r1 = com.safedk.android.analytics.brandsafety.BrandSafetyUtils.c()     // Catch: java.lang.Throwable -> Ld6
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> Ld6
            r3.g(r0)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r0 = "NativeFinder"
            java.lang.String r1 = "set CI details - starting to iterate over current activity ads"
            com.safedk.android.utils.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> Ld6
            java.util.Map<com.safedk.android.analytics.brandsafety.d, com.safedk.android.analytics.brandsafety.s> r4 = r8.L     // Catch: java.lang.Throwable -> Ld6
            monitor-enter(r4)     // Catch: java.lang.Throwable -> Ld6
            java.util.Map<com.safedk.android.analytics.brandsafety.d, com.safedk.android.analytics.brandsafety.s> r0 = r8.L     // Catch: java.lang.Throwable -> Ld3
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> Ld3
            java.util.Iterator r5 = r0.iterator()     // Catch: java.lang.Throwable -> Ld3
        L5e:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> Ld3
            if (r0 == 0) goto L9d
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> Ld3
            com.safedk.android.analytics.brandsafety.d r0 = (com.safedk.android.analytics.brandsafety.d) r0     // Catch: java.lang.Throwable -> Ld3
            java.util.Map<com.safedk.android.analytics.brandsafety.d, com.safedk.android.analytics.brandsafety.s> r1 = r8.L     // Catch: java.lang.Throwable -> Ld3
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> Ld3
            com.safedk.android.analytics.brandsafety.s r1 = (com.safedk.android.analytics.brandsafety.s) r1     // Catch: java.lang.Throwable -> Ld3
            boolean r1 = r8.a(r3, r1)     // Catch: java.lang.Throwable -> Ld3
            if (r1 == 0) goto L5e
            java.lang.String r1 = "NativeFinder"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld3
            r6.<init>()     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r7 = "set CI details - matched by webView/eventID, CI: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> Ld3
            java.lang.StringBuilder r6 = r6.append(r3)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Ld3
            com.safedk.android.utils.Logger.d(r1, r6)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r1 = r0.f29645a     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r0 = r0.e     // Catch: java.lang.Throwable -> Ld3
            boolean r0 = r8.a(r1, r0, r9)     // Catch: java.lang.Throwable -> Ld3
            if (r0 == 0) goto L5e
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Ld3
            r0 = r2
        L9c:
            return r0
        L9d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r0 = "NativeFinder"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld6
            r1.<init>()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r4 = "set CI details - adding as pending, view address: "
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r4 = r3.af()     // Catch: java.lang.Throwable -> Ld6
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r4 = " matching info: "
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.lang.Throwable -> Ld6
            java.lang.StringBuilder r1 = r1.append(r9)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Ld6
            com.safedk.android.utils.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> Ld6
            java.util.Map<java.lang.String, com.safedk.android.analytics.brandsafety.o> r1 = r8.M     // Catch: java.lang.Throwable -> Ld6
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Ld6
            java.util.Map<java.lang.String, com.safedk.android.analytics.brandsafety.o> r0 = r8.M     // Catch: java.lang.Throwable -> Lf5
            java.lang.String r3 = r3.af()     // Catch: java.lang.Throwable -> Lf5
            r0.put(r3, r9)     // Catch: java.lang.Throwable -> Lf5
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf5
            r0 = r2
            goto L9c
        Ld3:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Ld3
            throw r0     // Catch: java.lang.Throwable -> Ld6
        Ld6:
            r0 = move-exception
            java.lang.String r1 = "NativeFinder"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "set CI details exception: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r0.getMessage()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.safedk.android.utils.Logger.e(r1, r2, r0)
        Lf3:
            r0 = 0
            goto L9c
        Lf5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf5
            throw r0     // Catch: java.lang.Throwable -> Ld6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.NativeFinder.a(com.safedk.android.analytics.brandsafety.o):boolean");
    }

    private boolean a(CreativeInfo creativeInfo, s sVar) {
        if (sVar == null || creativeInfo == null) {
            Logger.d(I, "verify matching - object is null, nativeInfo: " + sVar + ", creativeInfo: " + creativeInfo);
            return false;
        }
        String Q = creativeInfo.Q();
        if (sVar.f29388v == null || !sVar.f29388v.equals(Q)) {
            Logger.d(I, "verify matching - sdks does not match, ci sdk is: " + Q + " and native sdk is: " + sVar.f29388v);
            return false;
        }
        Logger.d(I, "verify matching - ci sdk is: " + Q + ", native info: " + sVar);
        if (sVar.L != null && creativeInfo.m() != null && !sVar.L.equals(creativeInfo.m())) {
            Logger.d(I, "verify matching - incompatible event ID, ci: " + creativeInfo.m() + ", info: " + sVar.L);
            return false;
        }
        String af = creativeInfo.af();
        if (sVar.K != null && sVar.K.equals(af)) {
            Logger.d(I, "verify matching object done, event ID: " + sVar.L + ", object address: " + af + ", view address: " + sVar.K);
            return true;
        }
        Logger.d(I, "verify matching object failed, event ID: " + sVar.L + ", object address: " + af + ", view address: " + sVar.K);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str, String str2, o oVar) {
        s sVar;
        com.safedk.android.utils.k.b(I, "set CI started, adUnitId=" + str + " matchingInfo=" + (oVar == null ? "null" : oVar.toString()));
        if (oVar == null) {
            Logger.d(I, "set CI - no matching info");
            return false;
        }
        CreativeInfo creativeInfo = oVar.f29758a;
        if (creativeInfo != null) {
            d dVar = new d(str, creativeInfo.F(), creativeInfo.m(), creativeInfo.Q(), str2, BrandSafetyUtils.AdType.NATIVE);
            Logger.d(I, "set CI - activity key: " + dVar);
            synchronized (this.L) {
                sVar = this.L.get(dVar);
            }
            com.safedk.android.utils.k.b(I, "set CI - current activity ad: " + (sVar == null ? "null" : sVar) + ", current activity ad keys: " + this.L.keySet());
            if (sVar != null) {
                if (!sVar.W && StatsReporter.b().a(creativeInfo, sVar)) {
                    sVar.W = true;
                }
                CreativeInfo i2 = sVar.i();
                if (i2 != null) {
                    Logger.d(I, "set CI - previous CI id: " + i2.L());
                    if (i2.L().equals(creativeInfo.L())) {
                        CreativeInfoManager.b(i2);
                        com.safedk.android.utils.k.b(I, "set CI - already matched, same ad ID. current match: " + creativeInfo.X() + ", previous match: " + i2.X());
                    }
                }
                creativeInfo.a(oVar.f29759b, oVar.f29760c);
                sVar.a(creativeInfo);
                Logger.d(I, "set CI - CI is set for activity native " + dVar + ". CI : " + creativeInfo);
                b(sVar, creativeInfo);
                a(sVar, false, "setCreativeInfo");
                return true;
            }
            com.safedk.android.utils.k.b(I, "set CI - no activity ad, cannot set CI. current activity ads: " + this.L);
        } else {
            Logger.d(I, "set CI - no CI");
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, String str2, String str3) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void b(String str, String str2, String str3) {
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void c(String str) {
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public c a(String str, RedirectDetails redirectDetails, m mVar, boolean z2, boolean z3) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean c(String str, String str2, String str3) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, String str2, boolean z2) {
        return false;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.f
    public void b(l lVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i2) {
        boolean c2 = BrandSafetyUtils.c(i2);
        Logger.d(I, "should stop sampling, max uniformed pixels count=" + i2 + ", return value=" + c2);
        return c2;
    }

    @Override // com.safedk.android.internal.a
    public void g() {
        if (this.L != null) {
            for (s sVar : this.L.values()) {
                if (sVar.V) {
                    sVar.a(ImpressionLog.f29272z, new ImpressionLog.a[0]);
                    a(sVar, false, "onBackground");
                }
            }
        }
    }

    @Override // com.safedk.android.internal.a
    public void h() {
        if (this.L != null) {
            for (s sVar : this.L.values()) {
                if (sVar.V) {
                    sVar.a(ImpressionLog.A, new ImpressionLog.a[0]);
                    a(sVar, false, "onForeground");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        s f29319a;

        /* renamed from: b, reason: collision with root package name */
        d f29320b;
        int d;

        /* renamed from: c, reason: collision with root package name */
        int f29321c = 0;
        boolean e = false;

        public a(s sVar, d dVar, int i2) {
            this.f29320b = dVar;
            this.f29319a = sVar;
            this.d = i2;
        }

        private void a(View view) {
            if (view != null) {
                Logger.d(NativeFinder.I, "handle native ad reflection - root= " + view + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                AdNetworkDiscovery h2 = CreativeInfoManager.h(this.f29320b.d);
                if (h2 != null) {
                    View h3 = h2.h(view);
                    Logger.d(NativeFinder.I, "handle native ad reflection - native view= " + h3);
                    if (h3 != null) {
                        List<CreativeInfo> a2 = h2.a(new WeakReference<>(h3), this.f29319a.M, true);
                        Logger.d(NativeFinder.I, "handle native ad reflection - CIs generated: " + a2);
                        if (a2 != null) {
                            for (CreativeInfo creativeInfo : a2) {
                                creativeInfo.a((Object) view);
                                creativeInfo.a(NativeFinder.this.f29368c);
                                creativeInfo.f(this.f29320b.f29647c);
                                creativeInfo.h(this.f29320b.f29646b);
                                Logger.d(NativeFinder.I, "handle native ad reflection - setting ci: " + creativeInfo);
                                NativeFinder.this.a(this.f29320b.f29645a, this.f29320b.e, new o(creativeInfo, CreativeInfo.f29625m, this.f29320b.f29647c));
                            }
                        }
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference weakReference;
            try {
                this.f29321c++;
                if (this.f29319a != null) {
                    synchronized (NativeFinder.class) {
                        weakReference = (WeakReference) NativeFinder.N.get(this.f29320b.f29647c);
                    }
                    if (weakReference != null && weakReference.get() != null) {
                        MaxNativeAdView maxNativeAdView = (MaxNativeAdView) weakReference.get();
                        if (CreativeInfoManager.a(this.f29320b.d, AdNetworkConfiguration.SHOULD_SCAN_OBJECT_USING_REFLECTION, false) && !this.e) {
                            a(maxNativeAdView);
                            this.e = true;
                        }
                        if (maxNativeAdView.getWidth() > 0 && maxNativeAdView.getHeight() > 0) {
                            this.f29319a.ae = maxNativeAdView.getWidth() / maxNativeAdView.getHeight();
                            Logger.d(NativeFinder.I, "native impression task - view size: " + maxNativeAdView.getWidth() + "x" + maxNativeAdView.getHeight() + ", proportion: " + this.f29319a.ae);
                        }
                        if (this.f29321c >= this.d || this.f29319a.X) {
                            Logger.d(NativeFinder.I, "Going to report native ad, eventId=" + this.f29319a.L + ", stop timer? " + this.f29319a.X + ", image counter=" + this.f29321c + ", max attempts=" + this.d + ", isImpressionReported=" + this.f29319a.E + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                            if (!this.f29319a.E) {
                                NativeFinder.this.a(this.f29319a, false, "NativeImpressionTask");
                            }
                            this.f29319a.Z.cancel(false);
                            return;
                        }
                        if (this.f29319a.aa != null && this.f29319a.aa.get() != null) {
                            a(this.f29319a, (View) weakReference.get());
                        }
                    }
                }
            } catch (Throwable th) {
                Logger.e(NativeFinder.I, "Error in NativeImpressionTask: ", th);
            }
        }

        private void a(final s sVar, final View view) {
            if (sVar != null && view != null) {
                try {
                    Logger.d(NativeFinder.I, "Taking screenshot, view=" + view + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                    sVar.c();
                    sVar.aa.get().runOnUiThread(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.NativeFinder.a.1
                        @Override // java.lang.Runnable
                        public void run() {
                            final Bitmap a2 = ScreenshotHelper.a(view, SafeDK.getInstance().V());
                            NativeFinder.this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.NativeFinder.a.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    a.this.a(sVar, a2, a.this.f29321c);
                                }
                            });
                        }
                    });
                } catch (Throwable th) {
                    Logger.e(NativeFinder.I, "Error while taking screenshot", th);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(s sVar, Bitmap bitmap, int i2) {
            if (bitmap != null) {
                String c2 = sVar.c();
                BrandSafetyUtils.a b2 = BrandSafetyUtils.b(c2, bitmap);
                int a2 = b2.a();
                BrandSafetyUtils.ScreenshotValidity c3 = BrandSafetyUtils.c(c2, b2);
                if (c3 == BrandSafetyUtils.ScreenshotValidity.VALID) {
                    String a3 = BrandSafetyUtils.a(bitmap);
                    BrandSafetyUtils.ScreenShotOrientation b3 = BrandSafetyUtils.b(bitmap);
                    l h2 = sVar.h();
                    String a4 = BrandSafetyUtils.a(bitmap, NativeFinder.this.f29368c, a3, c2, h2.f29739a, b3);
                    Logger.d(NativeFinder.I, "process screenshot - screenshot file created, filename = " + a4 + ", hash = " + a3);
                    long c4 = BrandSafetyUtils.c(a4);
                    Logger.d(NativeFinder.I, "process screenshot - hash " + a3 + ", stored file size is " + c4 + " bytes, counter is " + i2 + ", uniform pixel count is " + a2 + " (" + ((a2 / 500.0f) * 100.0f) + "%)");
                    int size = NativeFinder.this.B.size();
                    if (!NativeFinder.this.e(a3, h2.f29739a)) {
                        if (size <= SafeDK.getInstance().H()) {
                            if (h2.f29740b != null && h2.f29740b.f29691a != null && !h2.f29740b.f29691a.equals(a3)) {
                                Logger.d(NativeFinder.I, "process screenshot - removing ad file " + h2.f29740b.f29692b);
                                BrandSafetyUtils.d(h2.f29740b.f29692b);
                            }
                            h2.b(ImpressionLog.f29268t, new ImpressionLog.a(ImpressionLog.F, ImpressionLog.N));
                            Logger.d(NativeFinder.I, "process screenshot - setting data hash = " + a3 + ", file name = " + a4 + ", file size = " + c4);
                            h2.f29740b = new j(a3, a4, c4, a2, i2, b3, false);
                            NativeFinder.this.a(sVar, false, "processScreenshot");
                        } else if (!NativeFinder.this.d(a3, h2.f29739a)) {
                            Logger.d(NativeFinder.I, "process screenshot - No open slot for " + a3 + "_" + h2.f29739a);
                            BrandSafetyUtils.d(a4);
                        } else {
                            Logger.d(NativeFinder.I, "process screenshot - Image " + a3 + "_" + h2.f29739a + " is already scheduled for upload");
                        }
                    } else {
                        Logger.d(NativeFinder.I, "process screenshot - not saving file for " + a3 + "_" + h2.f29739a);
                        BrandSafetyUtils.d(a4);
                    }
                    if (NativeFinder.this.a(a2)) {
                        if (!TextUtils.isEmpty(a3)) {
                            sVar.d(true);
                            sVar.X = true;
                        }
                        h2.a(ImpressionLog.f29268t, new ImpressionLog.a(ImpressionLog.F, ImpressionLog.O));
                        NativeFinder.this.a(sVar, false, "processScreenshot");
                        return;
                    }
                    return;
                }
                Logger.d(NativeFinder.I, "process screenshot - screenshot is not valid: " + c3.name() + ", pixel count: " + a2 + ", counter = " + i2 + ", try again...");
            }
        }
    }

    public static String b(MaxNativeAdView maxNativeAdView) {
        String str;
        String a2 = BrandSafetyUtils.a(maxNativeAdView);
        synchronized (NativeFinder.class) {
            str = P.get(a2);
        }
        return str;
    }
}
