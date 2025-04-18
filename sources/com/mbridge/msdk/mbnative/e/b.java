package com.mbridge.msdk.mbnative.e;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbnative.controller.NativeController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class b {
    public static synchronized void a(CampaignEx campaignEx, Context context, String str, com.mbridge.msdk.mbnative.d.a aVar) {
        boolean z10;
        int i10;
        synchronized (b.class) {
            if (campaignEx == null) {
                return;
            }
            g a = h.a().a(c.m().k());
            if (a != null) {
                z10 = a.r() == 1;
            } else {
                z10 = true;
            }
            if (!campaignEx.isReport()) {
                campaignEx.setReport(true);
                a(campaignEx, context, str);
                a(campaignEx, context, str, aVar, z10);
                List<String> a10 = a(campaignEx);
                if (a10 != null && a10.size() != 0) {
                    int i11 = 0;
                    while (i11 < a10.size()) {
                        String str2 = a10.get(i11);
                        if (TextUtils.isEmpty(str2)) {
                            i10 = i11;
                        } else {
                            i10 = i11;
                            com.mbridge.msdk.click.a.a(context, campaignEx, str, str2, false, false);
                        }
                        i11 = i10 + 1;
                    }
                }
                b(campaignEx, context, str);
            }
            if (aVar != null && !campaignEx.isCallBackImpression()) {
                if (!z10) {
                    try {
                        aVar.onLoggingImpression(campaignEx.getType());
                    } catch (Exception e2) {
                        Log.e("NativeReportUtils", e2.getMessage());
                    }
                }
                campaignEx.setCallBackImpression(true);
            }
        }
    }

    private static synchronized void b(CampaignEx campaignEx, Context context, String str) {
        synchronized (b.class) {
            if (campaignEx != null) {
                try {
                    List<String> pv_urls = campaignEx.getPv_urls();
                    if (pv_urls != null && pv_urls.size() > 0) {
                        Iterator<String> it = pv_urls.iterator();
                        while (it.hasNext()) {
                            com.mbridge.msdk.click.a.a(context, campaignEx, str, it.next(), false, true);
                        }
                    }
                } finally {
                }
            }
        }
    }

    private static synchronized void a(final CampaignEx campaignEx, final Context context, String str) {
        synchronized (b.class) {
            c.m().a(context);
            if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
                com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.mbnative.e.b.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            j.a(com.mbridge.msdk.foundation.db.g.a(context)).a(campaignEx.getId());
                        } catch (Exception unused) {
                            ad.b("NativeReportUtils", "campain can't insert db");
                        }
                    }
                });
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.a.a.f12480g);
            }
            if (!TextUtils.isEmpty(str) && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().p() != null) {
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().p(), false, false);
            }
        }
    }

    private static synchronized void a(CampaignEx campaignEx, Context context, String str, com.mbridge.msdk.mbnative.d.a aVar, boolean z10) {
        Map<String, Long> map;
        synchronized (b.class) {
            if (!TextUtils.isEmpty(campaignEx.getOnlyImpressionURL()) && (map = NativeController.f13928b) != null && !map.containsKey(campaignEx.getOnlyImpressionURL())) {
                if (z10 && aVar != null) {
                    try {
                        aVar.onLoggingImpression(campaignEx.getAdType());
                    } catch (Exception e2) {
                        Log.e("NativeReportUtils", e2.getMessage());
                    }
                }
                NativeController.f13928b.put(campaignEx.getOnlyImpressionURL(), Long.valueOf(System.currentTimeMillis()));
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.a.a.f12481h);
            }
        }
    }

    private static List<String> a(CampaignEx campaignEx) {
        ArrayList arrayList = new ArrayList();
        if (campaignEx == null) {
            return arrayList;
        }
        String ad_url_list = campaignEx.getAd_url_list();
        if (TextUtils.isEmpty(ad_url_list)) {
            return arrayList;
        }
        try {
            JSONArray jSONArray = new JSONArray(ad_url_list);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add((String) jSONArray.get(i10));
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return arrayList;
    }
}
