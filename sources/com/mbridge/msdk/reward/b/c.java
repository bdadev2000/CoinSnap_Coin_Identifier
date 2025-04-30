package com.mbridge.msdk.reward.b;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.o;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.b.e;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17687a;
    private final String b;

    public c(Context context, String str) {
        this.f17687a = context;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CopyOnWriteArrayList<CampaignEx> a6;
        if (this.f17687a != null && !TextUtils.isEmpty(this.b)) {
            try {
                Context context = this.f17687a;
                String str = this.b;
                if (context != null) {
                    try {
                        o a9 = o.a(g.a(context));
                        if (!TextUtils.isEmpty(str) && a9 != null && a9.a() > 0) {
                            List<n> a10 = a9.a("m_download_end");
                            List<n> a11 = a9.a("2000021");
                            List<n> a12 = a9.a("2000039");
                            List<n> a13 = a9.a("m_download_end");
                            List<n> a14 = a9.a("m_download_end");
                            List<n> a15 = a9.a("2000044");
                            String e4 = n.e(a11);
                            String a16 = n.a(a10);
                            String c9 = n.c(a12);
                            String b = n.b(a13);
                            String f9 = n.f(a14);
                            String d2 = n.d(a15);
                            StringBuilder sb = new StringBuilder();
                            if (!TextUtils.isEmpty(e4)) {
                                sb.append(e4);
                            }
                            if (!TextUtils.isEmpty(a16)) {
                                sb.append(a16);
                            }
                            if (!TextUtils.isEmpty(c9)) {
                                sb.append(c9);
                            }
                            if (!TextUtils.isEmpty(b)) {
                                sb.append(b);
                            }
                            if (!TextUtils.isEmpty(f9)) {
                                sb.append(f9);
                            }
                            if (!TextUtils.isEmpty(d2)) {
                                sb.append(d2);
                            }
                            if (!TextUtils.isEmpty(sb.toString())) {
                                com.mbridge.msdk.foundation.same.report.d.c.a().d(sb.toString());
                            }
                        }
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
                ab.a();
                ab.a(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_RES));
                ab.a(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_HTML));
                com.mbridge.msdk.videocommon.d.b.a().c(this.b);
                if (!af.a().a("c_d_v_w_i", false) && !TextUtils.isEmpty(this.b) && (a6 = com.mbridge.msdk.videocommon.a.a.a().a(this.b, 1)) != null && a6.size() > 0) {
                    com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.f17687a, this.b, a6, 94, (com.mbridge.msdk.videocommon.listener.a) null);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoControllerInitTask", "initRewardVideoController task ", e10);
                }
            }
        }
    }
}
