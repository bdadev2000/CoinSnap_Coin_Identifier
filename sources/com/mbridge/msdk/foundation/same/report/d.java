package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class d implements com.mbridge.msdk.tracker.d {
    @Override // com.mbridge.msdk.tracker.d
    public final Map<String, String> a(com.mbridge.msdk.tracker.m mVar, List<com.mbridge.msdk.tracker.i> list, JSONObject jSONObject) {
        HashMap hashMap;
        if (list != null && list.size() != 0) {
            try {
                c.a(jSONObject);
                if (jSONObject == null) {
                    hashMap = null;
                } else {
                    hashMap = new HashMap();
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, String.valueOf(jSONObject.opt(next)));
                    }
                }
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                StringBuilder a6 = a(list);
                hashMap.put("tun", String.valueOf(z.r()));
                hashMap.put(DataSchemeDataSource.SCHEME_DATA, a6.toString());
                return hashMap;
            } catch (Exception unused) {
            } catch (OutOfMemoryError unused2) {
                if (mVar != null) {
                    mVar.i();
                }
            } catch (Throwable unused3) {
                return null;
            }
        }
        return null;
    }

    private static StringBuilder a(List<com.mbridge.msdk.tracker.i> list) {
        com.mbridge.msdk.tracker.e c9;
        StringBuilder sb = new StringBuilder();
        for (int i9 = 0; i9 < list.size(); i9++) {
            com.mbridge.msdk.tracker.i iVar = list.get(i9);
            if (iVar != null && (c9 = iVar.c()) != null) {
                JSONObject d2 = c9.d();
                c.a(d2);
                if (d2 == null) {
                    d2 = new JSONObject();
                }
                try {
                    try {
                        d2.put(CampaignEx.JSON_KEY_ST_TS, c9.f());
                        d2.put("rts", System.currentTimeMillis());
                        int d9 = iVar.d() - 1;
                        if (d9 >= 1) {
                            d2.put("retryed", d9);
                        }
                        long g9 = c9.g();
                        if (g9 > 0) {
                            d2.put("duration", g9);
                        }
                    } catch (Exception e4) {
                        if (com.mbridge.msdk.tracker.a.f18098a) {
                            Log.e("TrackManager", "decorateRequestParams: ", e4);
                        }
                    }
                    sb.append(a(d2));
                    if (i9 < list.size() - 1) {
                        sb.append("\n");
                    }
                } catch (Throwable th) {
                    sb.append(a(d2));
                    throw th;
                }
            }
        }
        return sb;
    }

    private static String a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> keys = jSONObject.keys();
        int i9 = 0;
        while (keys.hasNext()) {
            String next = keys.next();
            i9++;
            if (i9 <= jSONObject.length() - 1) {
                sb.append(next);
                sb.append("=");
                sb.append(a(String.valueOf(jSONObject.opt(next))));
                sb.append("&");
            } else {
                sb.append(next);
                sb.append("=");
                sb.append(a(String.valueOf(jSONObject.opt(next))));
            }
        }
        return sb.toString();
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (Exception unused) {
            return str;
        }
    }
}
