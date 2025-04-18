package com.vungle.ads.internal.network;

import com.vungle.ads.h3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KTypeProjection;
import kotlin.text.Regex;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;

/* loaded from: classes4.dex */
public final class l {
    public static final k Companion = new k(null);
    private static final String FAILED_TPATS = "FAILED_TPATS";
    private static final int MAX_RETRIES = 5;
    private static final String TAG = "TpatSender";
    private final String creativeId;
    private final String eventId;
    private final String placementId;
    private final com.vungle.ads.internal.signals.j signalManager;
    private final eh.b tpatFilePreferences;
    private final y vungleApiClient;

    public l(y vungleApiClient, String str, String str2, String str3, Executor ioExecutor, com.vungle.ads.internal.util.x pathProvider, com.vungle.ads.internal.signals.j jVar) {
        Intrinsics.checkNotNullParameter(vungleApiClient, "vungleApiClient");
        Intrinsics.checkNotNullParameter(ioExecutor, "ioExecutor");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.vungleApiClient = vungleApiClient;
        this.placementId = str;
        this.creativeId = str2;
        this.eventId = str3;
        this.signalManager = jVar;
        this.tpatFilePreferences = eh.b.Companion.get(ioExecutor, pathProvider, eh.b.TPAT_FAILED_FILENAME);
    }

    public static /* synthetic */ void b(l lVar, String str) {
        m42sendWinNotification$lambda0(lVar, str);
    }

    private final HashMap<String, Integer> getStoredTpats() {
        HashMap<String, Integer> hashMap;
        String string = this.tpatFilePreferences.getString(FAILED_TPATS);
        try {
            if (string != null) {
                Json.Companion companion = Json.INSTANCE;
                SerializersModule serializersModule = companion.getSerializersModule();
                KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
                KSerializer<Object> serializer = SerializersKt.serializer(serializersModule, Reflection.typeOf(HashMap.class, companion2.invariant(Reflection.typeOf(String.class)), companion2.invariant(Reflection.typeOf(Integer.TYPE))));
                Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                hashMap = (HashMap) companion.decodeFromString(serializer, string);
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
            eh.b bVar = this.tpatFilePreferences;
            Json.Companion companion = Json.INSTANCE;
            SerializersModule serializersModule = companion.getSerializersModule();
            KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
            KSerializer<Object> serializer = SerializersKt.serializer(serializersModule, Reflection.typeOf(HashMap.class, companion2.invariant(Reflection.typeOf(String.class)), companion2.invariant(Reflection.typeOf(Integer.TYPE))));
            Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            bVar.put(FAILED_TPATS, companion.encodeToString(serializer, hashMap)).apply();
        } catch (Exception unused) {
            com.vungle.ads.internal.util.v.Companion.e(TAG, "Failed to encode the about to storing tpats: " + hashMap);
        }
    }

    /* renamed from: sendTpat$lambda-2 */
    public static final void m41sendTpat$lambda2(l this$0, String url, String urlWithSessionId) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(url, "$url");
        Intrinsics.checkNotNullParameter(urlWithSessionId, "$urlWithSessionId");
        HashMap<String, Integer> storedTpats = this$0.getStoredTpats();
        Integer num = storedTpats.get(url);
        if (num == null) {
            num = 0;
        }
        int intValue = num.intValue();
        com.vungle.ads.internal.load.d pingTPAT = this$0.vungleApiClient.pingTPAT(urlWithSessionId);
        if (pingTPAT == null) {
            if (intValue != 0) {
                storedTpats.remove(urlWithSessionId);
                this$0.saveStoredTpats(storedTpats);
                return;
            }
            return;
        }
        if (!pingTPAT.getErrorIsTerminal()) {
            if (intValue >= 5) {
                storedTpats.remove(url);
                this$0.saveStoredTpats(storedTpats);
                new h3(urlWithSessionId).logErrorNoReturnValue$vungle_ads_release();
            } else {
                storedTpats.put(url, Integer.valueOf(intValue + 1));
                this$0.saveStoredTpats(storedTpats);
            }
        }
        com.vungle.ads.internal.util.v.Companion.e(TAG, "TPAT failed with " + pingTPAT.getDescription() + ", url:" + urlWithSessionId);
        if (pingTPAT.getReason() == 29) {
            com.vungle.ads.s.INSTANCE.logMetric$vungle_ads_release(com.vungle.ads.internal.protos.n.NOTIFICATION_REDIRECT, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : this$0.placementId, (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? null : null, (r15 & 32) == 0 ? urlWithSessionId : null);
            return;
        }
        com.vungle.ads.s sVar = com.vungle.ads.s.INSTANCE;
        com.vungle.ads.internal.protos.g gVar = com.vungle.ads.internal.protos.g.TPAT_ERROR;
        StringBuilder o10 = a4.j.o("Fail to send ", urlWithSessionId, ", error: ");
        o10.append(pingTPAT.getDescription());
        sVar.logError$vungle_ads_release(gVar, o10.toString(), this$0.placementId, this$0.creativeId, this$0.eventId);
    }

    /* renamed from: sendWinNotification$lambda-0 */
    public static final void m42sendWinNotification$lambda0(l this$0, String url) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(url, "$url");
        com.vungle.ads.internal.load.d pingTPAT = this$0.vungleApiClient.pingTPAT(url);
        if (pingTPAT != null) {
            com.vungle.ads.s sVar = com.vungle.ads.s.INSTANCE;
            com.vungle.ads.internal.protos.g gVar = com.vungle.ads.internal.protos.g.AD_WIN_NOTIFICATION_ERROR;
            StringBuilder o10 = a4.j.o("Fail to send ", url, ", error: ");
            o10.append(pingTPAT.getDescription());
            sVar.logError$vungle_ads_release(gVar, o10.toString(), this$0.placementId, this$0.creativeId, this$0.eventId);
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

    public final String injectSessionIdToUrl(String url) {
        String str;
        boolean z10;
        Intrinsics.checkNotNullParameter(url, "url");
        com.vungle.ads.internal.signals.j jVar = this.signalManager;
        if (jVar == null || (str = jVar.getUuid()) == null) {
            str = "";
        }
        if (str.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            String quote = Pattern.quote("{{{session_id}}}");
            Intrinsics.checkNotNullExpressionValue(quote, "quote(Constants.SESSION_ID)");
            return new Regex(quote).replace(url, str);
        }
        return url;
    }

    public final void resendStoredTpats$vungle_ads_release(Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Iterator<Map.Entry<String, Integer>> it = getStoredTpats().entrySet().iterator();
        while (it.hasNext()) {
            sendTpat(it.next().getKey(), executor);
        }
    }

    public final void sendTpat(String url, Executor executor) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(executor, "executor");
        executor.execute(new androidx.emoji2.text.n(24, this, url, injectSessionIdToUrl(url)));
    }

    public final void sendTpats(Iterable<String> urls, Executor executor) {
        Intrinsics.checkNotNullParameter(urls, "urls");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Iterator<String> it = urls.iterator();
        while (it.hasNext()) {
            sendTpat(it.next(), executor);
        }
    }

    public final void sendWinNotification(String urlString, Executor executor) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        Intrinsics.checkNotNullParameter(executor, "executor");
        executor.execute(new jb.j(13, this, injectSessionIdToUrl(urlString)));
    }

    public /* synthetic */ l(y yVar, String str, String str2, String str3, Executor executor, com.vungle.ads.internal.util.x xVar, com.vungle.ads.internal.signals.j jVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(yVar, str, str2, str3, executor, xVar, (i10 & 64) != 0 ? null : jVar);
    }
}
