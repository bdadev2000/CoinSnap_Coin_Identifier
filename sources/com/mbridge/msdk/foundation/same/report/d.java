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

/* loaded from: classes4.dex */
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
                StringBuilder a = a(list);
                hashMap.put("tun", String.valueOf(z.r()));
                hashMap.put(DataSchemeDataSource.SCHEME_DATA, a.toString());
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
        com.mbridge.msdk.tracker.e c10;
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.mbridge.msdk.tracker.i iVar = list.get(i10);
            if (iVar != null && (c10 = iVar.c()) != null) {
                JSONObject d10 = c10.d();
                c.a(d10);
                if (d10 == null) {
                    d10 = new JSONObject();
                }
                try {
                    try {
                        d10.put(CampaignEx.JSON_KEY_ST_TS, c10.f());
                        d10.put("rts", System.currentTimeMillis());
                        int d11 = iVar.d() - 1;
                        if (d11 >= 1) {
                            d10.put("retryed", d11);
                        }
                        long g10 = c10.g();
                        if (g10 > 0) {
                            d10.put("duration", g10);
                        }
                    } catch (Exception e2) {
                        if (com.mbridge.msdk.tracker.a.a) {
                            Log.e("TrackManager", "decorateRequestParams: ", e2);
                        }
                    }
                    sb2.append(a(d10));
                    if (i10 < list.size() - 1) {
                        sb2.append("\n");
                    }
                } catch (Throwable th2) {
                    sb2.append(a(d10));
                    throw th2;
                }
            }
        }
        return sb2;
    }

    private static String a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> keys = jSONObject.keys();
        int i10 = 0;
        while (keys.hasNext()) {
            String next = keys.next();
            i10++;
            if (i10 <= jSONObject.length() - 1) {
                sb2.append(next);
                sb2.append("=");
                sb2.append(a(String.valueOf(jSONObject.opt(next))));
                sb2.append("&");
            } else {
                sb2.append(next);
                sb2.append("=");
                sb2.append(a(String.valueOf(jSONObject.opt(next))));
            }
        }
        return sb2.toString();
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
