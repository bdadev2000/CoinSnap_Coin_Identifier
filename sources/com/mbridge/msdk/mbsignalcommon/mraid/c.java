package com.mbridge.msdk.mbsignalcommon.mraid;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.mbsignalcommon.mraid.a;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c {
    private static volatile ConcurrentHashMap<String, String> a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static ArrayList<String> f14121b = new ArrayList<>();

    public static com.mbridge.msdk.mbsignalcommon.windvane.a a(WindVaneWebView windVaneWebView, String str) {
        Set<String> unmodifiableSet;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.contains(CampaignEx.JSON_KEY_MRAID)) {
            return null;
        }
        com.mbridge.msdk.mbsignalcommon.windvane.a aVar = new com.mbridge.msdk.mbsignalcommon.windvane.a();
        aVar.f14148d = x.a("n+ztLkxpVTzBLkxgHN==");
        aVar.f14149e = parse.getHost();
        int i10 = 0;
        if (f14121b.size() == 0) {
            for (Method method : b.class.getDeclaredMethods()) {
                f14121b.add(method.getName());
            }
        }
        if (!f14121b.contains(aVar.f14149e) && windVaneWebView != null) {
            String campaignId = windVaneWebView.getCampaignId();
            String str2 = aVar.f14149e;
            if (!TextUtils.isEmpty(campaignId)) {
                if (a.containsKey(campaignId)) {
                    String str3 = a.get(campaignId);
                    if (!TextUtils.isEmpty(str2) && !str3.contains(str2)) {
                        if (str3.length() > 0) {
                            str3 = str3.concat(",");
                        }
                        a.put(campaignId, str3.concat(str2));
                    }
                } else {
                    a.put(campaignId, str2);
                }
            }
            a.C0182a.a.a(windVaneWebView, aVar.f14149e);
            a.C0182a.a.a(windVaneWebView, aVar.f14149e, "Specified command is not implemented");
            return null;
        }
        String encodedQuery = parse.getEncodedQuery();
        if (encodedQuery == null) {
            unmodifiableSet = Collections.emptySet();
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            do {
                int indexOf = encodedQuery.indexOf(38, i10);
                if (indexOf == -1) {
                    indexOf = encodedQuery.length();
                }
                int indexOf2 = encodedQuery.indexOf(61, i10);
                if (indexOf2 > indexOf || indexOf2 == -1) {
                    indexOf2 = indexOf;
                }
                linkedHashSet.add(Uri.decode(encodedQuery.substring(i10, indexOf2)));
                i10 = indexOf + 1;
            } while (i10 < encodedQuery.length());
            unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str4 : unmodifiableSet) {
                jSONObject.put(str4, parse.getQueryParameter(str4));
            }
            aVar.f14150f = jSONObject.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return aVar;
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a.remove(str);
    }

    public static String a(String str) {
        if (a.containsKey(str)) {
            return a.get(str);
        }
        return null;
    }
}
