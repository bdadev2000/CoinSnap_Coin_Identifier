package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.applovin.impl.L;
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

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f15925a = "e";
    private static String b = "roas";

    /* renamed from: c, reason: collision with root package name */
    private static volatile e f15926c;

    /* renamed from: d, reason: collision with root package name */
    private AtomicInteger f15927d;

    /* renamed from: e, reason: collision with root package name */
    private BatchReportDao f15928e;

    /* renamed from: f, reason: collision with root package name */
    private int f15929f;

    /* renamed from: g, reason: collision with root package name */
    private long f15930g;

    /* renamed from: h, reason: collision with root package name */
    private String f15931h;

    /* renamed from: i, reason: collision with root package name */
    private volatile int f15932i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f15933j;

    /* renamed from: k, reason: collision with root package name */
    private Executor f15934k = Executors.newSingleThreadExecutor();
    private Handler l;
    private Stack<Long> m;

    /* renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.tracker.m f15935n;

    private e() {
        com.mbridge.msdk.c.a n2;
        boolean z8;
        o oVar;
        String str;
        this.f15929f = 1;
        this.f15930g = 0L;
        this.f15931h = com.mbridge.msdk.foundation.same.net.e.d.f().f15806F;
        this.f15932i = 0;
        this.f15933j = false;
        com.mbridge.msdk.c.g f9 = L.f(com.mbridge.msdk.c.h.a());
        if (f9 != null && (n2 = f9.n()) != null) {
            this.f15929f = n2.a();
            this.f15930g = n2.c() * 1000;
            this.f15931h = com.mbridge.msdk.foundation.same.net.e.d.f().f15806F;
            this.f15932i = n2.b();
            if (n2.d() == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f15933j = z8;
            if (z8 && this.f15932i != 1) {
                int a6 = af.a().a("bcp", "type", af.a().a("t_r_t", 1));
                if (a6 != 0 && a6 != 1) {
                    a6 = 0;
                }
                w.a a9 = new w.a().a(new d()).a(new m());
                if (a6 == 1) {
                    oVar = new o(new l((byte) 2), com.mbridge.msdk.foundation.same.net.e.d.f().f15835k, com.mbridge.msdk.foundation.same.net.e.d.f().f15837o);
                } else {
                    oVar = new o(new com.mbridge.msdk.tracker.network.toolbox.h(), com.mbridge.msdk.foundation.same.net.e.d.f().f15806F, 0);
                }
                this.f15935n = com.mbridge.msdk.tracker.m.a(b, com.mbridge.msdk.foundation.controller.c.m().c(), a9.a(a6, oVar).e(af.a().a("t_m_e_t", 604800000)).a(af.a().a("t_m_e_s", 50)).d(af.a().a("t_m_r_c", 50)).b(af.a().a("t_m_t", DefaultLoadControl.DEFAULT_MIN_BUFFER_MS)).c(af.a().a("t_m_r_t_s", 1)).a());
                JSONObject a10 = c.a();
                try {
                    if (z.v(com.mbridge.msdk.foundation.controller.c.m().c())) {
                        str = "pad";
                    } else {
                        str = "phone";
                    }
                    a10.put("device_type", str);
                    if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_OTHER)) {
                        a10.put(com.mbridge.msdk.foundation.same.net.f.e.f15856g, z.n());
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                this.f15935n.a(a10);
                this.f15935n.a();
            }
        }
        ad.a(f15925a, "初始化批量上报： " + this.f15931h + " " + this.f15929f + " " + this.f15930g + " " + this.f15932i);
        this.f15927d = new AtomicInteger(0);
        this.m = new Stack<>();
        this.f15928e = BatchReportDao.getInstance(com.mbridge.msdk.foundation.controller.c.m().c());
        HandlerThread handlerThread = new HandlerThread("mb_revenue_batch_report_thread");
        handlerThread.start();
        this.l = new Handler(handlerThread.getLooper()) { // from class: com.mbridge.msdk.foundation.same.report.e.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                int i9 = message.what;
                int i10 = 0;
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            if (i9 == 4) {
                                Bundle data = message.getData();
                                if (e.this.l != null && e.this.f15928e != null && data != null && e.this.f15933j) {
                                    e.this.l.removeMessages(4);
                                    ArrayList<BatchReportMessage> batchReportMessages = e.this.f15928e.getBatchReportMessages(System.currentTimeMillis(), 2);
                                    if (batchReportMessages != null && batchReportMessages.size() > 0) {
                                        for (int i11 = 0; i11 < batchReportMessages.size(); i11++) {
                                            BatchReportMessage batchReportMessage = batchReportMessages.get(i11);
                                            e.a(e.this, batchReportMessage.getReportMessage(), batchReportMessage.getTimestamp());
                                        }
                                    }
                                    String str2 = e.f15925a;
                                    StringBuilder sb = new StringBuilder("切换上报lib，需要上报的数据： ");
                                    if (batchReportMessages != null) {
                                        i10 = batchReportMessages.size();
                                    }
                                    sb.append(i10);
                                    ad.a(str2, sb.toString());
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
                    if (e.this.l != null && e.this.f15928e != null && data3 != null) {
                        e.this.l.removeMessages(1);
                        long j7 = data3.getLong("last_report_time");
                        ArrayList<BatchReportMessage> batchReportMessages2 = e.this.f15928e.getBatchReportMessages(j7, 2);
                        e.a(e.this, batchReportMessages2, j7);
                        String str3 = e.f15925a;
                        StringBuilder sb2 = new StringBuilder("队列上报触发了，需要上报的数据： ");
                        if (batchReportMessages2 != null) {
                            i10 = batchReportMessages2.size();
                        }
                        sb2.append(i10);
                        ad.a(str3, sb2.toString());
                        return;
                    }
                    return;
                }
                Bundle data4 = message.getData();
                if (e.this.l != null && e.this.f15928e != null && data4 != null) {
                    e.this.l.removeMessages(2);
                    long currentTimeMillis = System.currentTimeMillis();
                    ArrayList<BatchReportMessage> batchReportMessages3 = e.this.f15928e.getBatchReportMessages(currentTimeMillis, 2);
                    e.a(e.this, batchReportMessages3, currentTimeMillis);
                    e.this.f15927d.set(0);
                    String str4 = e.f15925a;
                    StringBuilder sb3 = new StringBuilder("超时上报触发了，需要上报的数据： ");
                    if (batchReportMessages3 != null) {
                        i10 = batchReportMessages3.size();
                    }
                    sb3.append(i10);
                    ad.a(str4, sb3.toString());
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
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i9, String str) {
        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
        dVar.a("state", Integer.valueOf(i9));
        if (i9 == 2) {
            dVar.a("reason", str);
        }
        com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
        bVar.a("m_ad_rev_s_s", dVar);
        com.mbridge.msdk.foundation.same.report.d.c.a().a("m_ad_rev_s_s", bVar);
    }

    public static synchronized e a() {
        e eVar;
        synchronized (e.class) {
            try {
                if (f15926c == null) {
                    f15926c = new e();
                }
                eVar = f15926c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public final void b() {
        Handler handler = this.l;
        if (handler == null || handler.hasMessages(1) || this.f15932i == 1 || this.f15933j) {
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 1;
        this.l.sendMessageDelayed(obtain, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
    }

    public final synchronized void a(final String str) {
        try {
            if (this.f15932i == 1) {
                return;
            }
            Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.foundation.same.report.e.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (e.this.f15928e != null) {
                        ad.a(e.f15925a, "接收到上报数据： " + str);
                        if (e.this.f15933j) {
                            e.a(e.this, str, 0L);
                            if (((Integer) al.a(com.mbridge.msdk.foundation.controller.c.m().c(), "roas_use_event", 0)).intValue() == 0) {
                                al.b(com.mbridge.msdk.foundation.controller.c.m().c(), "roas_use_event", 1);
                                e.this.l.sendEmptyMessage(4);
                                return;
                            }
                            return;
                        }
                        if (e.this.f15932i != 1) {
                            e.a(e.this, str);
                        }
                    }
                }
            };
            com.mbridge.msdk.foundation.controller.d.a();
            Executor executor = this.f15934k;
            if (executor != null) {
                executor.execute(runnable);
            } else {
                runnable.run();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* synthetic */ void b(e eVar, final ArrayList arrayList, final long j7) {
        if (arrayList != null && arrayList.size() > 0) {
            ad.a(f15925a, "需要上报的数据条数： " + arrayList.size());
            Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
            if (c9 == null) {
                return;
            }
            com.mbridge.msdk.foundation.same.net.f.e a6 = i.a(c9);
            a6.a(MBridgeConstans.APP_ID, com.mbridge.msdk.foundation.controller.c.m().k());
            a6.a("m_sdk", "msdk");
            a6.a("lqswt", String.valueOf(1));
            a6.a("device_type", z.v(c9) ? "pad" : "phone");
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_OTHER)) {
                a6.a(com.mbridge.msdk.foundation.same.net.f.e.f15856g, z.n());
            }
            StringBuilder sb = new StringBuilder();
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                try {
                    BatchReportMessage batchReportMessage = (BatchReportMessage) arrayList.get(i9);
                    if (batchReportMessage != null) {
                        sb.append(batchReportMessage.getReportMessage() + "&ts=" + batchReportMessage.getTimestamp());
                        if (i9 >= 0 && i9 < size - 1) {
                            sb.append("\n");
                        }
                    }
                } catch (Throwable th) {
                    ad.b(f15925a, th.getMessage());
                }
            }
            try {
                String encode = URLEncoder.encode(sb.toString(), "utf-8");
                a6.a(DataSchemeDataSource.SCHEME_DATA, encode);
                ad.a(f15925a, "需要批量上报的数据： " + encode);
                com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(com.mbridge.msdk.foundation.controller.c.m().c());
                eVar.a(0, "");
                aVar.post(0, eVar.f15931h, a6, new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.e.2
                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void a(String str) {
                        ad.a(e.f15925a, "批量上报成功");
                        e.this.a(1, "");
                        try {
                            if (e.this.f15928e != null) {
                                e.this.f15928e.deleteBatchReportMessagesByTimestamp(j7);
                            }
                        } catch (Exception e4) {
                            ad.b(e.f15925a, e4.getMessage());
                        }
                        synchronized (e.this.m) {
                            e.this.m.clear();
                        }
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void b(String str) {
                        Stack stack;
                        L.C("批量上报失败： ", str, e.f15925a);
                        e.this.a(2, str);
                        synchronized (e.this.m) {
                            try {
                                e.this.m.add(Long.valueOf(j7));
                                if (e.this.f15928e != null) {
                                    e.this.f15928e.updateMessagesReportState(arrayList);
                                }
                                if (e.this.m.size() >= 5) {
                                    ad.a(e.f15925a, "批量上报失败，上报失败的数据超过阈值");
                                    try {
                                        try {
                                            e.this.m.pop();
                                            long longValue = ((Long) e.this.m.pop()).longValue();
                                            e.this.m.clear();
                                            if (e.this.f15928e != null) {
                                                e.this.f15928e.deleteBatchReportMessagesByTimestamp(longValue);
                                            }
                                            stack = e.this.m;
                                        } catch (Exception e4) {
                                            ad.b(e.f15925a, e4.getMessage());
                                            stack = e.this.m;
                                        }
                                        stack.clear();
                                    } catch (Throwable th2) {
                                        e.this.m.clear();
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }, "roas", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                return;
            } catch (Exception e4) {
                ad.b(f15925a, e4.getMessage());
                return;
            }
        }
        ad.a(f15925a, "需要上报的数据条数： 0");
    }

    public static /* synthetic */ void a(e eVar, ArrayList arrayList, long j7) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        Message obtain = Message.obtain();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("report_message", arrayList);
        bundle.putLong("last_report_time", j7);
        obtain.setData(bundle);
        obtain.what = 3;
        eVar.l.sendMessage(obtain);
    }

    public static /* synthetic */ void a(e eVar, String str, long j7) {
        if (eVar.f15935n != null) {
            com.mbridge.msdk.tracker.e eVar2 = new com.mbridge.msdk.tracker.e("roas");
            eVar2.a(true);
            if (j7 != 0) {
                eVar2.a(j7);
            }
            eVar2.b(1);
            try {
                eVar2.a(eVar.b(str));
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            eVar.f15935n.a(eVar2);
        }
    }

    public static /* synthetic */ void a(e eVar, String str) {
        eVar.f15928e.addReportMessage(str, 2);
        Handler handler = eVar.l;
        if (handler != null && !handler.hasMessages(1)) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            eVar.l.sendMessageDelayed(obtain, eVar.f15930g);
        }
        if (eVar.f15927d.incrementAndGet() < eVar.f15929f || eVar.l == null) {
            return;
        }
        Message obtain2 = Message.obtain();
        Bundle bundle = new Bundle();
        bundle.putLong("last_report_time", System.currentTimeMillis());
        obtain2.setData(bundle);
        obtain2.what = 2;
        eVar.l.sendMessage(obtain2);
        eVar.f15927d.set(0);
    }
}
