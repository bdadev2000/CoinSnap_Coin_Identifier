package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.BatchReportDao;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.al;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.tracker.o;
import com.mbridge.msdk.tracker.w;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class e {
    private static final String a = "e";

    /* renamed from: b, reason: collision with root package name */
    private static String f13488b = "roas";

    /* renamed from: c, reason: collision with root package name */
    private static volatile e f13489c;

    /* renamed from: d, reason: collision with root package name */
    private AtomicInteger f13490d;

    /* renamed from: e, reason: collision with root package name */
    private BatchReportDao f13491e;

    /* renamed from: f, reason: collision with root package name */
    private int f13492f;

    /* renamed from: g, reason: collision with root package name */
    private long f13493g;

    /* renamed from: h, reason: collision with root package name */
    private String f13494h;

    /* renamed from: i, reason: collision with root package name */
    private volatile int f13495i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13496j;

    /* renamed from: k, reason: collision with root package name */
    private Executor f13497k = Executors.newSingleThreadExecutor();

    /* renamed from: l, reason: collision with root package name */
    private Handler f13498l;

    /* renamed from: m, reason: collision with root package name */
    private Stack<Long> f13499m;

    /* renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.tracker.m f13500n;

    private e() {
        com.mbridge.msdk.c.a n10;
        boolean z10;
        o oVar;
        String str;
        this.f13492f = 1;
        this.f13493g = 0L;
        this.f13494h = com.mbridge.msdk.foundation.same.net.e.d.f().F;
        this.f13495i = 0;
        this.f13496j = false;
        com.mbridge.msdk.c.g d10 = com.applovin.impl.mediation.ads.e.d(com.mbridge.msdk.c.h.a());
        if (d10 != null && (n10 = d10.n()) != null) {
            this.f13492f = n10.a();
            this.f13493g = n10.c() * 1000;
            this.f13494h = com.mbridge.msdk.foundation.same.net.e.d.f().F;
            this.f13495i = n10.b();
            if (n10.d() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f13496j = z10;
            if (z10 && this.f13495i != 1) {
                int a10 = af.a().a("bcp", "type", af.a().a("t_r_t", 1));
                if (a10 != 0 && a10 != 1) {
                    a10 = 0;
                }
                w.a a11 = new w.a().a(new d()).a(new m());
                if (a10 == 1) {
                    oVar = new o(new l((byte) 2), com.mbridge.msdk.foundation.same.net.e.d.f().f13401k, com.mbridge.msdk.foundation.same.net.e.d.f().f13405o);
                } else {
                    oVar = new o(new com.mbridge.msdk.tracker.network.toolbox.h(), com.mbridge.msdk.foundation.same.net.e.d.f().F, 0);
                }
                this.f13500n = com.mbridge.msdk.tracker.m.a(f13488b, com.mbridge.msdk.foundation.controller.c.m().c(), a11.a(a10, oVar).e(af.a().a("t_m_e_t", 604800000)).a(af.a().a("t_m_e_s", 50)).d(af.a().a("t_m_r_c", 50)).b(af.a().a("t_m_t", DefaultLoadControl.DEFAULT_MIN_BUFFER_MS)).c(af.a().a("t_m_r_t_s", 1)).a());
                JSONObject a12 = c.a();
                try {
                    if (z.v(com.mbridge.msdk.foundation.controller.c.m().c())) {
                        str = "pad";
                    } else {
                        str = "phone";
                    }
                    a12.put("device_type", str);
                    if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_OTHER)) {
                        a12.put(com.mbridge.msdk.foundation.same.net.f.e.f13421g, z.n());
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                this.f13500n.a(a12);
                this.f13500n.a();
            }
        }
        ad.a(a, "初始化批量上报： " + this.f13494h + " " + this.f13492f + " " + this.f13493g + " " + this.f13495i);
        this.f13490d = new AtomicInteger(0);
        this.f13499m = new Stack<>();
        this.f13491e = BatchReportDao.getInstance(com.mbridge.msdk.foundation.controller.c.m().c());
        HandlerThread handlerThread = new HandlerThread("mb_revenue_batch_report_thread");
        handlerThread.start();
        this.f13498l = new Handler(handlerThread.getLooper()) { // from class: com.mbridge.msdk.foundation.same.report.e.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                int i10 = message.what;
                int i11 = 0;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                Bundle data = message.getData();
                                if (e.this.f13498l != null && e.this.f13491e != null && data != null && e.this.f13496j) {
                                    e.this.f13498l.removeMessages(4);
                                    ArrayList<BatchReportMessage> batchReportMessages = e.this.f13491e.getBatchReportMessages(System.currentTimeMillis(), 2);
                                    if (batchReportMessages != null && batchReportMessages.size() > 0) {
                                        for (int i12 = 0; i12 < batchReportMessages.size(); i12++) {
                                            BatchReportMessage batchReportMessage = batchReportMessages.get(i12);
                                            e.a(e.this, batchReportMessage.getReportMessage(), batchReportMessage.getTimestamp());
                                        }
                                    }
                                    String str2 = e.a;
                                    StringBuilder sb2 = new StringBuilder("切换上报lib，需要上报的数据： ");
                                    if (batchReportMessages != null) {
                                        i11 = batchReportMessages.size();
                                    }
                                    sb2.append(i11);
                                    ad.a(str2, sb2.toString());
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        Bundle data2 = message.getData();
                        if (data2 != null) {
                            e.b(e.this, data2.getParcelableArrayList("report_message"), data2.getLong("last_report_time"));
                            return;
                        }
                        return;
                    }
                    Bundle data3 = message.getData();
                    if (e.this.f13498l != null && e.this.f13491e != null && data3 != null) {
                        e.this.f13498l.removeMessages(1);
                        long j3 = data3.getLong("last_report_time");
                        ArrayList<BatchReportMessage> batchReportMessages2 = e.this.f13491e.getBatchReportMessages(j3, 2);
                        e.a(e.this, batchReportMessages2, j3);
                        String str3 = e.a;
                        StringBuilder sb3 = new StringBuilder("队列上报触发了，需要上报的数据： ");
                        if (batchReportMessages2 != null) {
                            i11 = batchReportMessages2.size();
                        }
                        sb3.append(i11);
                        ad.a(str3, sb3.toString());
                        return;
                    }
                    return;
                }
                Bundle data4 = message.getData();
                if (e.this.f13498l != null && e.this.f13491e != null && data4 != null) {
                    e.this.f13498l.removeMessages(2);
                    long currentTimeMillis = System.currentTimeMillis();
                    ArrayList<BatchReportMessage> batchReportMessages3 = e.this.f13491e.getBatchReportMessages(currentTimeMillis, 2);
                    e.a(e.this, batchReportMessages3, currentTimeMillis);
                    e.this.f13490d.set(0);
                    String str4 = e.a;
                    StringBuilder sb4 = new StringBuilder("超时上报触发了，需要上报的数据： ");
                    if (batchReportMessages3 != null) {
                        i11 = batchReportMessages3.size();
                    }
                    sb4.append(i11);
                    ad.a(str4, sb4.toString());
                }
            }
        };
    }

    private JSONObject b(String str) {
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        try {
            for (String str2 : str.split("&")) {
                String[] split = str2.split("=");
                if (split.length == 2) {
                    jSONObject.put(split[0], split[1]);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str) {
        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
        dVar.a("state", Integer.valueOf(i10));
        if (i10 == 2) {
            dVar.a("reason", str);
        }
        com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
        bVar.a("m_ad_rev_s_s", dVar);
        com.mbridge.msdk.foundation.same.report.d.c.a().a("m_ad_rev_s_s", bVar);
    }

    public static synchronized e a() {
        e eVar;
        synchronized (e.class) {
            if (f13489c == null) {
                f13489c = new e();
            }
            eVar = f13489c;
        }
        return eVar;
    }

    public final void b() {
        Handler handler = this.f13498l;
        if (handler == null || handler.hasMessages(1) || this.f13495i == 1 || this.f13496j) {
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 1;
        this.f13498l.sendMessageDelayed(obtain, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
    }

    public final synchronized void a(final String str) {
        if (this.f13495i == 1) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.foundation.same.report.e.3
            @Override // java.lang.Runnable
            public final void run() {
                if (e.this.f13491e != null) {
                    ad.a(e.a, "接收到上报数据： " + str);
                    if (e.this.f13496j) {
                        e.a(e.this, str, 0L);
                        if (((Integer) al.a(com.mbridge.msdk.foundation.controller.c.m().c(), "roas_use_event", 0)).intValue() == 0) {
                            al.b(com.mbridge.msdk.foundation.controller.c.m().c(), "roas_use_event", 1);
                            e.this.f13498l.sendEmptyMessage(4);
                            return;
                        }
                        return;
                    }
                    if (e.this.f13495i != 1) {
                        e.a(e.this, str);
                    }
                }
            }
        };
        com.mbridge.msdk.foundation.controller.d.a();
        Executor executor = this.f13497k;
        if (executor != null) {
            executor.execute(runnable);
        } else {
            runnable.run();
        }
    }

    public static /* synthetic */ void b(e eVar, final ArrayList arrayList, final long j3) {
        if (arrayList != null && arrayList.size() > 0) {
            ad.a(a, "需要上报的数据条数： " + arrayList.size());
            Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
            if (c10 == null) {
                return;
            }
            com.mbridge.msdk.foundation.same.net.f.e a10 = i.a(c10);
            a10.a(MBridgeConstans.APP_ID, com.mbridge.msdk.foundation.controller.c.m().k());
            a10.a("m_sdk", "msdk");
            a10.a("lqswt", String.valueOf(1));
            a10.a("device_type", z.v(c10) ? "pad" : "phone");
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_OTHER)) {
                a10.a(com.mbridge.msdk.foundation.same.net.f.e.f13421g, z.n());
            }
            StringBuilder sb2 = new StringBuilder();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                try {
                    BatchReportMessage batchReportMessage = (BatchReportMessage) arrayList.get(i10);
                    if (batchReportMessage != null) {
                        sb2.append(batchReportMessage.getReportMessage() + "&ts=" + batchReportMessage.getTimestamp());
                        if (i10 >= 0 && i10 < size - 1) {
                            sb2.append("\n");
                        }
                    }
                } catch (Throwable th2) {
                    ad.b(a, th2.getMessage());
                }
            }
            try {
                String encode = URLEncoder.encode(sb2.toString(), "utf-8");
                a10.a(DataSchemeDataSource.SCHEME_DATA, encode);
                ad.a(a, "需要批量上报的数据： " + encode);
                com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(com.mbridge.msdk.foundation.controller.c.m().c());
                eVar.a(0, "");
                aVar.post(0, eVar.f13494h, a10, new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.e.2
                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void a(String str) {
                        ad.a(e.a, "批量上报成功");
                        e.this.a(1, "");
                        try {
                            if (e.this.f13491e != null) {
                                e.this.f13491e.deleteBatchReportMessagesByTimestamp(j3);
                            }
                        } catch (Exception e2) {
                            ad.b(e.a, e2.getMessage());
                        }
                        synchronized (e.this.f13499m) {
                            e.this.f13499m.clear();
                        }
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void b(String str) {
                        e eVar2;
                        com.applovin.impl.mediation.ads.e.A("批量上报失败： ", str, e.a);
                        e.this.a(2, str);
                        synchronized (e.this.f13499m) {
                            e.this.f13499m.add(Long.valueOf(j3));
                            if (e.this.f13491e != null) {
                                e.this.f13491e.updateMessagesReportState(arrayList);
                            }
                            if (e.this.f13499m.size() >= 5) {
                                ad.a(e.a, "批量上报失败，上报失败的数据超过阈值");
                                try {
                                    try {
                                        e.this.f13499m.pop();
                                        long longValue = ((Long) e.this.f13499m.pop()).longValue();
                                        e.this.f13499m.clear();
                                        if (e.this.f13491e != null) {
                                            e.this.f13491e.deleteBatchReportMessagesByTimestamp(longValue);
                                        }
                                        eVar2 = e.this;
                                    } catch (Exception e2) {
                                        ad.b(e.a, e2.getMessage());
                                        eVar2 = e.this;
                                    }
                                    eVar2.f13499m.clear();
                                } catch (Throwable th3) {
                                    e.this.f13499m.clear();
                                    throw th3;
                                }
                            }
                        }
                    }
                }, "roas", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                return;
            } catch (Exception e2) {
                ad.b(a, e2.getMessage());
                return;
            }
        }
        ad.a(a, "需要上报的数据条数： 0");
    }

    public static /* synthetic */ void a(e eVar, ArrayList arrayList, long j3) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        Message obtain = Message.obtain();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("report_message", arrayList);
        bundle.putLong("last_report_time", j3);
        obtain.setData(bundle);
        obtain.what = 3;
        eVar.f13498l.sendMessage(obtain);
    }

    public static /* synthetic */ void a(e eVar, String str, long j3) {
        if (eVar.f13500n != null) {
            com.mbridge.msdk.tracker.e eVar2 = new com.mbridge.msdk.tracker.e("roas");
            eVar2.a(true);
            if (j3 != 0) {
                eVar2.a(j3);
            }
            eVar2.b(1);
            try {
                eVar2.a(eVar.b(str));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            eVar.f13500n.a(eVar2);
        }
    }

    public static /* synthetic */ void a(e eVar, String str) {
        eVar.f13491e.addReportMessage(str, 2);
        Handler handler = eVar.f13498l;
        if (handler != null && !handler.hasMessages(1)) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            eVar.f13498l.sendMessageDelayed(obtain, eVar.f13493g);
        }
        if (eVar.f13490d.incrementAndGet() < eVar.f13492f || eVar.f13498l == null) {
            return;
        }
        Message obtain2 = Message.obtain();
        Bundle bundle = new Bundle();
        bundle.putLong("last_report_time", System.currentTimeMillis());
        obtain2.setData(bundle);
        obtain2.what = 2;
        eVar.f13498l.sendMessage(obtain2);
        eVar.f13490d.set(0);
    }
}
