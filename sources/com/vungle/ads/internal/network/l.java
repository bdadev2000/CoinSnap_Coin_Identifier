package com.vungle.ads.internal.network;

import U4.RunnableC0311g;
import a.AbstractC0325a;
import a5.C0398b;
import com.vungle.ads.C2137s;
import com.vungle.ads.i1;
import f7.C2275b;
import f8.C2276a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class l {
    public static final k Companion = new k(null);
    private static final String FAILED_TPATS = "FAILED_TPATS";
    private static final int MAX_RETRIES = 5;
    private static final String TAG = "TpatSender";
    private final String creativeId;
    private final String eventId;
    private final String placementId;
    private final com.vungle.ads.internal.signals.j signalManager;
    private final C2275b tpatFilePreferences;
    private final y vungleApiClient;

    public l(y yVar, String str, String str2, String str3, Executor executor, com.vungle.ads.internal.util.x xVar, com.vungle.ads.internal.signals.j jVar) {
        G7.j.e(yVar, "vungleApiClient");
        G7.j.e(executor, "ioExecutor");
        G7.j.e(xVar, "pathProvider");
        this.vungleApiClient = yVar;
        this.placementId = str;
        this.creativeId = str2;
        this.eventId = str3;
        this.signalManager = jVar;
        this.tpatFilePreferences = C2275b.Companion.get(executor, xVar, C2275b.TPAT_FAILED_FILENAME);
    }

    public static /* synthetic */ void a(l lVar, String str) {
        m62sendWinNotification$lambda0(lVar, str);
    }

    public static /* synthetic */ void b(l lVar, String str, String str2) {
        m61sendTpat$lambda2(lVar, str, str2);
    }

    private final HashMap<String, Integer> getStoredTpats() {
        HashMap<String, Integer> hashMap;
        String string = this.tpatFilePreferences.getString(FAILED_TPATS);
        try {
            if (string != null) {
                C2276a c2276a = f8.b.f20369d;
                C0398b c0398b = c2276a.b;
                int i9 = M7.f.f2011c;
                M7.f q9 = y8.a.q(G7.s.b(String.class));
                M7.f q10 = y8.a.q(G7.s.b(Integer.TYPE));
                G7.e a6 = G7.s.a(HashMap.class);
                List asList = Arrays.asList(q9, q10);
                G7.s.f1335a.getClass();
                hashMap = (HashMap) c2276a.a(AbstractC0325a.q(c0398b, new G7.x(a6, asList)), string);
            } else {
                hashMap = new HashMap<>();
            }
            return hashMap;
        } catch (Exception unused) {
            com.vungle.ads.internal.util.v.Companion.e(TAG, "Failed to decode stored tpats: " + string);
            return new HashMap<>();
        }
    }

    private final void saveStoredTpats(HashMap<String, Integer> hashMap) {
        try {
            C2275b c2275b = this.tpatFilePreferences;
            C2276a c2276a = f8.b.f20369d;
            C0398b c0398b = c2276a.b;
            int i9 = M7.f.f2011c;
            M7.f q9 = y8.a.q(G7.s.b(String.class));
            M7.f q10 = y8.a.q(G7.s.b(Integer.TYPE));
            G7.e a6 = G7.s.a(HashMap.class);
            List asList = Arrays.asList(q9, q10);
            G7.s.f1335a.getClass();
            c2275b.put(FAILED_TPATS, c2276a.b(AbstractC0325a.q(c0398b, new G7.x(a6, asList)), hashMap)).apply();
        } catch (Exception unused) {
            com.vungle.ads.internal.util.v.Companion.e(TAG, "Failed to encode the about to storing tpats: " + hashMap);
        }
    }

    /* renamed from: sendTpat$lambda-2 */
    public static final void m61sendTpat$lambda2(l lVar, String str, String str2) {
        G7.j.e(lVar, "this$0");
        G7.j.e(str, "$url");
        G7.j.e(str2, "$urlWithSessionId");
        HashMap<String, Integer> storedTpats = lVar.getStoredTpats();
        Integer num = storedTpats.get(str);
        if (num == null) {
            num = 0;
        }
        int intValue = num.intValue();
        com.vungle.ads.internal.load.d pingTPAT = lVar.vungleApiClient.pingTPAT(str2);
        if (pingTPAT == null) {
            if (intValue != 0) {
                storedTpats.remove(str2);
                lVar.saveStoredTpats(storedTpats);
                return;
            }
            return;
        }
        if (!pingTPAT.getErrorIsTerminal()) {
            if (intValue >= 5) {
                storedTpats.remove(str);
                lVar.saveStoredTpats(storedTpats);
                new i1(str2).logErrorNoReturnValue$vungle_ads_release();
            } else {
                storedTpats.put(str, Integer.valueOf(intValue + 1));
                lVar.saveStoredTpats(storedTpats);
            }
        }
        com.vungle.ads.internal.util.v.Companion.e(TAG, "TPAT failed with " + pingTPAT.getDescription() + ", url:" + str2);
        if (pingTPAT.getReason() == 29) {
            C2137s.INSTANCE.logMetric$vungle_ads_release(com.vungle.ads.internal.protos.n.NOTIFICATION_REDIRECT, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : lVar.placementId, (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? null : null, (r15 & 32) == 0 ? str2 : null);
            return;
        }
        C2137s c2137s = C2137s.INSTANCE;
        com.vungle.ads.internal.protos.g gVar = com.vungle.ads.internal.protos.g.TPAT_ERROR;
        StringBuilder n2 = com.mbridge.msdk.foundation.entity.o.n("Fail to send ", str2, ", error: ");
        n2.append(pingTPAT.getDescription());
        c2137s.logError$vungle_ads_release(gVar, n2.toString(), lVar.placementId, lVar.creativeId, lVar.eventId);
    }

    /* renamed from: sendWinNotification$lambda-0 */
    public static final void m62sendWinNotification$lambda0(l lVar, String str) {
        G7.j.e(lVar, "this$0");
        G7.j.e(str, "$url");
        com.vungle.ads.internal.load.d pingTPAT = lVar.vungleApiClient.pingTPAT(str);
        if (pingTPAT != null) {
            C2137s c2137s = C2137s.INSTANCE;
            com.vungle.ads.internal.protos.g gVar = com.vungle.ads.internal.protos.g.AD_WIN_NOTIFICATION_ERROR;
            StringBuilder n2 = com.mbridge.msdk.foundation.entity.o.n("Fail to send ", str, ", error: ");
            n2.append(pingTPAT.getDescription());
            c2137s.logError$vungle_ads_release(gVar, n2.toString(), lVar.placementId, lVar.creativeId, lVar.eventId);
        }
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final com.vungle.ads.internal.signals.j getSignalManager() {
        return this.signalManager;
    }

    public final y getVungleApiClient() {
        return this.vungleApiClient;
    }

    public final String injectSessionIdToUrl(String str) {
        String str2;
        G7.j.e(str, "url");
        com.vungle.ads.internal.signals.j jVar = this.signalManager;
        if (jVar == null || (str2 = jVar.getUuid()) == null) {
            str2 = "";
        }
        if (str2.length() > 0) {
            String quote = Pattern.quote("{{{session_id}}}");
            G7.j.d(quote, "quote(Constants.SESSION_ID)");
            Pattern compile = Pattern.compile(quote);
            G7.j.d(compile, "compile(...)");
            String replaceAll = compile.matcher(str).replaceAll(str2);
            G7.j.d(replaceAll, "replaceAll(...)");
            return replaceAll;
        }
        return str;
    }

    public final void resendStoredTpats$vungle_ads_release(Executor executor) {
        G7.j.e(executor, "executor");
        Iterator<Map.Entry<String, Integer>> it = getStoredTpats().entrySet().iterator();
        while (it.hasNext()) {
            sendTpat(it.next().getKey(), executor);
        }
    }

    public final void sendTpat(String str, Executor executor) {
        G7.j.e(str, "url");
        G7.j.e(executor, "executor");
        executor.execute(new RunnableC0311g(this, str, injectSessionIdToUrl(str), 13));
    }

    public final void sendTpats(Iterable<String> iterable, Executor executor) {
        G7.j.e(iterable, "urls");
        G7.j.e(executor, "executor");
        Iterator<String> it = iterable.iterator();
        while (it.hasNext()) {
            sendTpat(it.next(), executor);
        }
    }

    public final void sendWinNotification(String str, Executor executor) {
        G7.j.e(str, "urlString");
        G7.j.e(executor, "executor");
        executor.execute(new com.facebook.appevents.k(7, this, injectSessionIdToUrl(str)));
    }

    public /* synthetic */ l(y yVar, String str, String str2, String str3, Executor executor, com.vungle.ads.internal.util.x xVar, com.vungle.ads.internal.signals.j jVar, int i9, G7.f fVar) {
        this(yVar, str, str2, str3, executor, xVar, (i9 & 64) != 0 ? null : jVar);
    }
}
