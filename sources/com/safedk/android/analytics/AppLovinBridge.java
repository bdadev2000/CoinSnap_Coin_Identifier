package com.safedk.android.analytics;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.k;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class AppLovinBridge {
    private static Context L = null;

    /* renamed from: a, reason: collision with root package name */
    public static final String f29081a = "SafeDK";

    /* renamed from: b, reason: collision with root package name */
    public static final String f29082b = "v1/events";

    /* renamed from: c, reason: collision with root package name */
    public static final String f29083c = "v1/image_uploaded";
    public static final String d = "v1/resolved";

    /* renamed from: f, reason: collision with root package name */
    public static final String f29084f = "package";

    /* renamed from: g, reason: collision with root package name */
    public static final String f29085g = "android";

    /* renamed from: h, reason: collision with root package name */
    public static final String f29086h = "body";

    /* renamed from: j, reason: collision with root package name */
    private static final String f29088j = "AppLovinBridge";

    /* renamed from: k, reason: collision with root package name */
    private static final String f29089k = "max_ad_events";

    /* renamed from: l, reason: collision with root package name */
    private static final String f29090l = "safedk_init";

    /* renamed from: m, reason: collision with root package name */
    private static final String f29091m = "user_info";

    /* renamed from: n, reason: collision with root package name */
    private static final String f29092n = "send_http_request";

    /* renamed from: o, reason: collision with root package name */
    private static final String f29093o = "receive_http_response";

    /* renamed from: p, reason: collision with root package name */
    private static final String f29094p = "safedk_ad_info";

    /* renamed from: q, reason: collision with root package name */
    private static final String f29095q = "max_revenue_events";

    /* renamed from: r, reason: collision with root package name */
    private static final String f29096r = "url";

    /* renamed from: s, reason: collision with root package name */
    private static final String f29097s = "backup_url";

    /* renamed from: t, reason: collision with root package name */
    private static final String f29098t = "post_body";

    /* renamed from: u, reason: collision with root package name */
    private static final String f29099u = "report";

    /* renamed from: v, reason: collision with root package name */
    private static final String f29100v = "metadata";
    private static final String w = "events";
    private static final String x = "public";

    /* renamed from: y, reason: collision with root package name */
    private static final String f29101y = "private";

    /* renamed from: z, reason: collision with root package name */
    private static final String f29102z = "ad_review_creative_id";
    private static String A = "https://edge.safedk.com/v1/events";
    private static String B = "https://edge.safedk.com/v1/events";
    private static String C = "https://edge.safedk.com/v1/image_uploaded";
    private static String D = "https://edge.safedk.com/v1/image_uploaded";
    private static String E = "https://edge.safedk.com/v1/resolved";
    private static String F = "https://edge.safedk.com/v1/resolved";
    public static final String e = "platform";
    private static final String[] G = {e};
    private static final String[] H = {"sdk_uuid", "impression_id", "ad_format_type", "timestamp"};
    private static final String[] I = {k.f29698c};
    private static final String[] J = {k.f29697b};
    private static HashMap<String, ArrayList<b>> K = new HashMap<>();

    /* renamed from: i, reason: collision with root package name */
    static AppLovinCommunicatorSubscriber f29087i = new AppLovinCommunicatorSubscriber() { // from class: com.safedk.android.analytics.AppLovinBridge.1
        @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
        public void onMessageReceived(AppLovinCommunicatorMessage message) {
            Logger.d(AppLovinBridge.f29088j, "Response received " + message.getMessageData() + ", topic=" + message.getTopic() + ", url=" + message.getMessageData().getString("url"));
            Bundle messageData = message.getMessageData();
            String string = message.getMessageData().getString("url");
            if (string.endsWith(AppLovinBridge.f29082b)) {
                AppLovinBridge.b(AppLovinBridge.f29082b, messageData.getBundle("body"));
            } else if (string.endsWith(AppLovinBridge.f29083c)) {
                AppLovinBridge.b(AppLovinBridge.f29083c, messageData.getBundle("body"));
            } else if (string.endsWith(AppLovinBridge.d)) {
                AppLovinBridge.b(AppLovinBridge.d, messageData.getBundle("body"));
            }
        }

        @Override // com.applovin.communicator.AppLovinCommunicatorEntity
        public String getCommunicatorId() {
            return AppLovinBridge.f29081a;
        }
    };

    public static void init(Context context) {
        L = context;
        registerToReceiveResponse(f29087i);
    }

    public static void receiveEdgeUrls(String url, String backupUrl) {
        Logger.d(f29088j, "receive edge urls, url=" + url + ", backupUrl=" + backupUrl);
        if (!TextUtils.isEmpty(url)) {
            A = url + RemoteSettings.FORWARD_SLASH_STRING + f29082b;
            Logger.d(f29088j, "receive edge urls, edgeBrandSafetyReportUrl updated to " + A);
            C = url + RemoteSettings.FORWARD_SLASH_STRING + f29083c;
            Logger.d(f29088j, "receive edge urls, ImageUploadedUrl updated to " + C);
            E = url + RemoteSettings.FORWARD_SLASH_STRING + d;
            Logger.d(f29088j, "receive edge urls, resolvedUrl updated to " + E);
        }
        if (!TextUtils.isEmpty(backupUrl)) {
            B = backupUrl + RemoteSettings.FORWARD_SLASH_STRING + f29082b;
            Logger.d(f29088j, "Backup edgeBackupBrandSafetyReportUrl updated to " + B);
            D = backupUrl + RemoteSettings.FORWARD_SLASH_STRING + f29083c;
            Logger.d(f29088j, "Backup ImageUploadedUrl updated to " + D);
            F = backupUrl + RemoteSettings.FORWARD_SLASH_STRING + d;
            Logger.d(f29088j, "Backup resolvedUrl updated to " + F);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(ArrayList<Bundle> arrayList, AppLovinCommunicatorPublisher appLovinCommunicatorPublisher) {
        com.safedk.android.utils.k.b(f29088j, "report stats events start " + arrayList.size() + " events. edgeUrl=" + A + ", events : " + arrayList.toString());
        Bundle bundle = new Bundle();
        bundle.putString("url", A);
        bundle.putString(f29097s, B);
        Bundle bundle2 = new Bundle();
        Bundle c2 = SafeDK.getInstance().w().c();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        Iterator<Bundle> it = arrayList.iterator();
        while (it.hasNext()) {
            Bundle next = it.next();
            if ("impression".equals(next.getString(StatsEvent.f29841z))) {
                if (a(next, H, "stats event") || !a(next)) {
                    Logger.d(f29088j, "report stats events, skipping event with missing fields.");
                } else {
                    arrayList2.add(next);
                }
            }
        }
        if (arrayList2.isEmpty() || a(c2, G, f29100v)) {
            Logger.d(f29088j, "report stats events not completed. there are missing fields.");
            return;
        }
        bundle2.putBundle(f29100v, c2);
        bundle2.putParcelableArrayList("events", arrayList2);
        Bundle bundle3 = new Bundle();
        bundle3.putBundle("report", bundle2);
        bundle.putBundle(f29098t, bundle3);
        AppLovinCommunicatorMessage appLovinCommunicatorMessage = new AppLovinCommunicatorMessage(bundle, f29092n, appLovinCommunicatorPublisher);
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(L);
        Logger.d(f29088j, "publishing message with " + arrayList.size() + " events");
        appLovinCommunicator.getMessagingService().publish(appLovinCommunicatorMessage);
    }

    public static void reportImageUploadEvent(Bundle data, AppLovinCommunicatorPublisher callback) {
        Logger.d(f29088j, "report image upload event start. Data=" + data.toString());
        Bundle bundle = new Bundle();
        bundle.putString("url", C);
        bundle.putString(f29097s, D);
        Bundle c2 = SafeDK.getInstance().w().c();
        data.putBundle(f29100v, c2);
        bundle.putBundle(f29098t, data);
        if (a(data, I, "image uploaded") || a(c2, G, f29100v)) {
            Logger.d(f29088j, "report image upload event not completed. there are missing fields.");
            return;
        }
        AppLovinCommunicatorMessage appLovinCommunicatorMessage = new AppLovinCommunicatorMessage(bundle, f29092n, callback);
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(L);
        Logger.d(f29088j, "publishing message. body=" + data.toString());
        appLovinCommunicator.getMessagingService().publish(appLovinCommunicatorMessage);
    }

    public static void reportClickUrlResolvedEvent(Bundle data, AppLovinCommunicatorPublisher callback) {
        Logger.d(f29088j, "report click url resolved event start");
        Bundle bundle = new Bundle();
        bundle.putString("url", E);
        bundle.putString(f29097s, F);
        Bundle c2 = SafeDK.getInstance().w().c();
        data.putBundle(f29100v, c2);
        bundle.putBundle(f29098t, data);
        if (a(data, J, "resolved") || a(c2, G, f29100v)) {
            Logger.d(f29088j, "report image upload event not completed. there are missing fields.");
            return;
        }
        AppLovinCommunicatorMessage appLovinCommunicatorMessage = new AppLovinCommunicatorMessage(bundle, f29092n, callback);
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(L);
        Logger.d(f29088j, "publishing message. body=" + data.toString());
        appLovinCommunicator.getMessagingService().publish(appLovinCommunicatorMessage);
    }

    public static void reportMaxCreativeId(Bundle appLovinMaxBundle, String creativeId, AppLovinCommunicatorPublisher callback) {
        Logger.d(f29088j, "report max creative ID start, creative ID=" + creativeId + ", appLovin max bundle=" + appLovinMaxBundle.toString());
        Bundle bundle = new Bundle();
        bundle.putString(f29102z, creativeId);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(x, bundle);
        bundle2.putBundle(f29101y, appLovinMaxBundle);
        AppLovinCommunicatorMessage appLovinCommunicatorMessage = new AppLovinCommunicatorMessage(bundle2, f29094p, callback);
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(L);
        Logger.d(f29088j, "report max creative ID, publishing message. body=" + bundle2.toString());
        appLovinCommunicator.getMessagingService().publish(appLovinCommunicatorMessage);
    }

    private static boolean a(Bundle bundle) {
        return SdksMapping.getSdkPackageByPackageUUID(bundle.getString("sdk_uuid")) != null;
    }

    private static boolean a(Bundle bundle, String[] strArr, String str) {
        if (strArr == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (String str2 : strArr) {
            if (!bundle.containsKey(str2)) {
                hashSet.add(str2);
            }
        }
        if (hashSet.isEmpty()) {
            return false;
        }
        Logger.d(f29088j, "missing fields in " + str + " data: " + hashSet);
        return true;
    }

    public static void registerToReceiveMaxEvents(AppLovinCommunicatorSubscriber subscriber) {
        a(subscriber, f29089k);
    }

    public static void registerToReceiveResponse(AppLovinCommunicatorSubscriber subscriber) {
        a(subscriber, f29093o);
    }

    public static void registerToReceiveSafeDKSettings(AppLovinCommunicatorSubscriber subscriber) {
        a(subscriber, f29090l);
    }

    public static void registerToReceiveMaxRevenueEvents(AppLovinCommunicatorSubscriber subscriber) {
        a(subscriber, f29095q);
    }

    public static void registerToReceiveUserInfo(AppLovinCommunicatorSubscriber subscriber) {
        a(subscriber, f29091m);
    }

    private static void a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        AppLovinCommunicator.getInstance(L).subscribe(appLovinCommunicatorSubscriber, Arrays.asList(str));
    }

    public static void registerListener(String requestName, b listener) {
        try {
            Logger.d(f29088j, "register listener started, request name=" + requestName);
            if (!K.containsKey(requestName)) {
                Logger.d(f29088j, "register listener, listener list created for request name=" + requestName);
                K.put(requestName, new ArrayList<>());
            }
            ArrayList<b> arrayList = K.get(requestName);
            Logger.d(f29088j, "register listener, listener added for request name=" + requestName + "," + listener);
            arrayList.add(listener);
        } catch (Throwable th) {
            Logger.e(f29088j, "register listener failed. request name:" + requestName + ", listener: " + listener, th);
            new CrashReporter().caughtException(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, Bundle bundle) {
        try {
            Logger.d(f29088j, "notify listeners started, request name=" + str + ", data=" + bundle.toString());
            ArrayList<b> arrayList = K.get(str);
            if (arrayList != null) {
                Iterator<b> it = arrayList.iterator();
                while (it.hasNext()) {
                    b next = it.next();
                    Logger.d(f29088j, "Invoking handler for request name '" + str + "', Bundle : " + bundle.toString());
                    next.a(str, bundle);
                }
            }
        } catch (Throwable th) {
            Logger.e(f29088j, "Failed to read response", th);
        }
    }
}
