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

/* loaded from: classes4.dex */
public final class c implements Runnable {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15022b;

    public c(Context context, String str) {
        this.a = context;
        this.f15022b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CopyOnWriteArrayList<CampaignEx> a;
        if (this.a != null && !TextUtils.isEmpty(this.f15022b)) {
            try {
                Context context = this.a;
                String str = this.f15022b;
                if (context != null) {
                    try {
                        o a10 = o.a(g.a(context));
                        if (!TextUtils.isEmpty(str) && a10 != null && a10.a() > 0) {
                            List<n> a11 = a10.a("m_download_end");
                            List<n> a12 = a10.a("2000021");
                            List<n> a13 = a10.a("2000039");
                            List<n> a14 = a10.a("m_download_end");
                            List<n> a15 = a10.a("m_download_end");
                            List<n> a16 = a10.a("2000044");
                            String e2 = n.e(a12);
                            String a17 = n.a(a11);
                            String c10 = n.c(a13);
                            String b3 = n.b(a14);
                            String f10 = n.f(a15);
                            String d10 = n.d(a16);
                            StringBuilder sb2 = new StringBuilder();
                            if (!TextUtils.isEmpty(e2)) {
                                sb2.append(e2);
                            }
                            if (!TextUtils.isEmpty(a17)) {
                                sb2.append(a17);
                            }
                            if (!TextUtils.isEmpty(c10)) {
                                sb2.append(c10);
                            }
                            if (!TextUtils.isEmpty(b3)) {
                                sb2.append(b3);
                            }
                            if (!TextUtils.isEmpty(f10)) {
                                sb2.append(f10);
                            }
                            if (!TextUtils.isEmpty(d10)) {
                                sb2.append(d10);
                            }
                            if (!TextUtils.isEmpty(sb2.toString())) {
                                com.mbridge.msdk.foundation.same.report.d.c.a().d(sb2.toString());
                            }
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                ab.a();
                ab.a(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_RES));
                ab.a(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_HTML));
                com.mbridge.msdk.videocommon.d.b.a().c(this.f15022b);
                if (!af.a().a("c_d_v_w_i", false) && !TextUtils.isEmpty(this.f15022b) && (a = com.mbridge.msdk.videocommon.a.a.a().a(this.f15022b, 1)) != null && a.size() > 0) {
                    com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.a, this.f15022b, a, 94, (com.mbridge.msdk.videocommon.listener.a) null);
                }
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoControllerInitTask", "initRewardVideoController task ", e11);
                }
            }
        }
    }
}
