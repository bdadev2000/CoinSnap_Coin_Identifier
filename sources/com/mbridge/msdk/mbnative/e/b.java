package com.mbridge.msdk.mbnative.e;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.g;
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

/* loaded from: classes3.dex */
public final class b {
    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:8:0x0007, B:10:0x001b, B:14:0x0027, B:16:0x002d, B:18:0x003c, B:21:0x0043, B:23:0x0049, B:25:0x0056, B:27:0x005e, B:30:0x0061, B:32:0x0066, B:38:0x006e, B:35:0x0080, B:41:0x0077), top: B:7:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void a(com.mbridge.msdk.foundation.entity.CampaignEx r12, android.content.Context r13, java.lang.String r14, com.mbridge.msdk.mbnative.d.a r15) {
        /*
            java.lang.Class<com.mbridge.msdk.mbnative.e.b> r0 = com.mbridge.msdk.mbnative.e.b.class
            monitor-enter(r0)
            if (r12 != 0) goto L7
            monitor-exit(r0)
            return
        L7:
            com.mbridge.msdk.c.h r1 = com.mbridge.msdk.c.h.a()     // Catch: java.lang.Throwable -> L24
            com.mbridge.msdk.foundation.controller.c r2 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = r2.k()     // Catch: java.lang.Throwable -> L24
            com.mbridge.msdk.c.g r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L24
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L26
            int r1 = r1.r()     // Catch: java.lang.Throwable -> L24
            if (r1 != r3) goto L22
            goto L26
        L22:
            r1 = r2
            goto L27
        L24:
            r12 = move-exception
            goto L85
        L26:
            r1 = r3
        L27:
            boolean r4 = r12.isReport()     // Catch: java.lang.Throwable -> L24
            if (r4 != 0) goto L64
            r12.setReport(r3)     // Catch: java.lang.Throwable -> L24
            a(r12, r13, r14)     // Catch: java.lang.Throwable -> L24
            a(r12, r13, r14, r15, r1)     // Catch: java.lang.Throwable -> L24
            java.util.List r4 = a(r12)     // Catch: java.lang.Throwable -> L24
            if (r4 == 0) goto L61
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L24
            if (r5 != 0) goto L43
            goto L61
        L43:
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L24
            if (r2 >= r5) goto L61
            java.lang.Object r5 = r4.get(r2)     // Catch: java.lang.Throwable -> L24
            r9 = r5
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L24
            boolean r5 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L24
            if (r5 != 0) goto L5e
            r10 = 0
            r11 = 0
            r6 = r13
            r7 = r12
            r8 = r14
            com.mbridge.msdk.click.a.a(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L24
        L5e:
            int r2 = r2 + 1
            goto L43
        L61:
            b(r12, r13, r14)     // Catch: java.lang.Throwable -> L24
        L64:
            if (r15 == 0) goto L83
            boolean r13 = r12.isCallBackImpression()     // Catch: java.lang.Throwable -> L24
            if (r13 != 0) goto L83
            if (r1 != 0) goto L80
            int r13 = r12.getType()     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L76
            r15.onLoggingImpression(r13)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L76
            goto L80
        L76:
            r13 = move-exception
            java.lang.String r14 = "NativeReportUtils"
            java.lang.String r13 = r13.getMessage()     // Catch: java.lang.Throwable -> L24
            android.util.Log.e(r14, r13)     // Catch: java.lang.Throwable -> L24
        L80:
            r12.setCallBackImpression(r3)     // Catch: java.lang.Throwable -> L24
        L83:
            monitor-exit(r0)
            return
        L85:
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.e.b.a(com.mbridge.msdk.foundation.entity.CampaignEx, android.content.Context, java.lang.String, com.mbridge.msdk.mbnative.d.a):void");
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
            try {
                c.m().a(context);
                if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
                    com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.mbnative.e.b.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                j.a(g.a(context)).a(campaignEx.getId());
                            } catch (Exception unused) {
                                ad.b("NativeReportUtils", "campain can't insert db");
                            }
                        }
                    });
                    com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.a.a.f14771g);
                }
                if (!TextUtils.isEmpty(str) && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().p() != null) {
                    com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().p(), false, false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static synchronized void a(CampaignEx campaignEx, Context context, String str, com.mbridge.msdk.mbnative.d.a aVar, boolean z8) {
        Map<String, Long> map;
        synchronized (b.class) {
            if (!TextUtils.isEmpty(campaignEx.getOnlyImpressionURL()) && (map = NativeController.b) != null && !map.containsKey(campaignEx.getOnlyImpressionURL())) {
                if (z8 && aVar != null) {
                    try {
                        aVar.onLoggingImpression(campaignEx.getAdType());
                    } catch (Exception e4) {
                        Log.e("NativeReportUtils", e4.getMessage());
                    }
                }
                NativeController.b.put(campaignEx.getOnlyImpressionURL(), Long.valueOf(System.currentTimeMillis()));
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.a.a.f14772h);
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
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                arrayList.add((String) jSONArray.get(i9));
            }
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
        return arrayList;
    }
}
