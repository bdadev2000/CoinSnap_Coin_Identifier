package com.mbridge.msdk.tracker;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class r {
    private final c a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15526b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15527c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15528d;

    /* renamed from: e, reason: collision with root package name */
    private final k f15529e;

    /* renamed from: i, reason: collision with root package name */
    private Handler f15533i;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicInteger f15530f = new AtomicInteger(0);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicInteger f15531g = new AtomicInteger(0);

    /* renamed from: h, reason: collision with root package name */
    private final Object f15532h = new Object();

    /* renamed from: j, reason: collision with root package name */
    private boolean f15534j = true;

    /* renamed from: k, reason: collision with root package name */
    private long f15535k = 0;

    /* renamed from: l, reason: collision with root package name */
    private volatile boolean f15536l = false;

    /* renamed from: m, reason: collision with root package name */
    private volatile boolean f15537m = false;

    /* loaded from: classes4.dex */
    public static final class b extends Handler {
        private final r a;

        public b(Looper looper, r rVar) {
            super(looper);
            this.a = rVar;
        }

        private void a(String str) {
            Log.d("TrackManager", this.a.f15529e.c() + " " + str + this.a.f15531g.addAndGet(0) + " 数据库记录数：" + this.a.a.a());
        }

        private void b() {
            try {
                removeMessages(1);
                removeMessages(6);
                removeMessages(2);
                removeMessages(3);
            } catch (Exception e2) {
                if (com.mbridge.msdk.tracker.a.a) {
                    Log.e("TrackManager", this.a.f15529e.c() + " removeMessages failed ", e2);
                }
            }
            if (!this.a.f()) {
                try {
                    sendMessageDelayed(Message.obtain(this, 1), y.a(this.a.f15530f.get(), this.a.f15535k, this.a.f15527c));
                } catch (Exception e10) {
                    if (com.mbridge.msdk.tracker.a.a) {
                        Log.e("TrackManager", this.a.f15529e.c() + " sendMessageDelayed failed ", e10);
                    }
                }
            }
        }

        @Override // android.os.Handler
        public final void dispatchMessage(Message message) {
            e eVar;
            super.dispatchMessage(message);
            int i10 = message.what;
            if (i10 != 2 && i10 != 3) {
                if (i10 != 5) {
                    if (i10 != 6) {
                        if (i10 != 7) {
                            b();
                            if (com.mbridge.msdk.tracker.a.a) {
                                a("触发上报（timer）当前 Event 数量：");
                            }
                            a();
                            return;
                        }
                        this.a.c();
                        b();
                        if (com.mbridge.msdk.tracker.a.a) {
                            a("触发上报（flush）当前 Event 数量：");
                        }
                        a();
                        return;
                    }
                    Object obj = message.obj;
                    if (obj instanceof e) {
                        eVar = (e) obj;
                    } else {
                        eVar = null;
                    }
                    boolean z10 = false;
                    if (com.mbridge.msdk.tracker.a.a && !y.a(eVar)) {
                        a(String.format("收到 Event( %s )，当前 Event 数量：", eVar.a()));
                    }
                    if (y.b(eVar) && eVar.c() == 1) {
                        z10 = true;
                    }
                    if (z10 || this.a.e()) {
                        b();
                        if (com.mbridge.msdk.tracker.a.a) {
                            a("触发上报（notice check）当前 Event 数量：");
                        }
                        a();
                        return;
                    }
                    return;
                }
                if (com.mbridge.msdk.tracker.a.a) {
                    a("触发删除 当前 Event 数量：");
                }
                r.a(this.a);
                sendMessageDelayed(Message.obtain(this, 5), 120000L);
                return;
            }
            b();
            if (com.mbridge.msdk.tracker.a.a) {
                a("触发上报（report result）当前 Event 数量：");
            }
            a();
        }

        private synchronized void a() {
            try {
                r.e(this.a);
            } catch (Exception e2) {
                if (com.mbridge.msdk.tracker.a.a) {
                    Log.e("TrackManager", this.a.f15529e.c() + " report failed ", e2);
                }
            }
        }
    }

    public r(k kVar) {
        this.a = kVar.g();
        this.f15526b = kVar.l();
        this.f15527c = kVar.m();
        this.f15528d = kVar.n();
        this.f15529e = kVar;
    }

    public static /* synthetic */ void i(r rVar) {
        rVar.f15530f.set(0);
    }

    public static /* synthetic */ int j(r rVar) {
        return rVar.f15530f.getAndIncrement();
    }

    public final boolean e() {
        return this.f15531g.addAndGet(0) >= this.f15526b;
    }

    public static /* synthetic */ void e(r rVar) {
        if (rVar.f15529e.t()) {
            List<i> a10 = rVar.a.a(rVar.f15526b);
            if (y.a((List<?>) a10)) {
                if (com.mbridge.msdk.tracker.a.a) {
                    Log.d("TrackManager", rVar.f15529e.c() + " report: 没有可以上报的数据");
                    return;
                }
                return;
            }
            rVar.a.a(a10);
            int size = a10.size();
            rVar.f15531g.addAndGet(-size);
            boolean z10 = false;
            if (com.mbridge.msdk.tracker.a.a) {
                Log.d("TrackManager", rVar.f15529e.c() + " report: 上报的数量 = " + size + " 当前剩余事件数 = " + rVar.f15531g.addAndGet(0) + " 数据库中剩余事件数 = " + rVar.a.a());
            }
            try {
                z10 = rVar.f15529e.p();
            } catch (IllegalStateException e2) {
                if (com.mbridge.msdk.tracker.a.a) {
                    Log.e("TrackManager", rVar.f15529e.c() + " report environment check failed ", e2);
                }
            }
            if (!z10) {
                if (com.mbridge.msdk.tracker.a.a) {
                    Log.e("TrackManager", rVar.f15529e.c() + " report 失败，请检查 TrackConfig 配置是否正确");
                    return;
                }
                return;
            }
            n q10 = rVar.f15529e.q();
            q10.a(new a(rVar.f15533i, rVar));
            Map<String, String> hashMap = new HashMap<>();
            try {
                hashMap = rVar.f15529e.j().a(rVar.f15529e.k(), a10, rVar.f15529e.f());
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.a) {
                    Log.e("TrackManager", rVar.f15529e.c() + " report decorate request params failed ", e10);
                }
            }
            q10.a(new s(a10), hashMap, y.b(a10));
        }
    }

    public final void a() {
        HandlerThread handlerThread = new HandlerThread("report_timer");
        handlerThread.start();
        b bVar = new b(handlerThread.getLooper(), this);
        this.f15533i = bVar;
        bVar.sendMessageDelayed(Message.obtain(bVar, 5), DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        Handler handler = this.f15533i;
        handler.sendMessageDelayed(Message.obtain(handler, 1), this.f15527c);
        this.f15534j = false;
    }

    public final void b() {
        this.f15533i.removeMessages(1);
        Handler handler = this.f15533i;
        handler.sendMessage(Message.obtain(handler, 7));
    }

    public final void c() {
        synchronized (this.f15532h) {
            if (!this.f15536l) {
                this.f15536l = true;
                this.a.c();
            }
            if (!this.f15537m) {
                this.f15537m = true;
                this.f15531g.addAndGet(this.a.a());
            }
        }
    }

    public final void d() {
        this.f15531g.incrementAndGet();
    }

    public final boolean f() {
        return this.f15534j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(r rVar, List list) {
        if (y.a((List<?>) list)) {
            return;
        }
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (!y.a(iVar)) {
                byte b3 = !iVar.b() && iVar.d() >= rVar.f15528d;
                boolean z10 = !iVar.a() && iVar.g() < System.currentTimeMillis();
                if (b3 == false && !z10) {
                    iVar.a(iVar.d() + (y.a(rVar.f15529e.e()) ? 1 : 0));
                    iVar.b(3);
                    i10++;
                } else {
                    iVar.b(-1);
                }
            }
        }
        rVar.a.c((List<i>) list);
        rVar.f15531g.addAndGet(i10);
    }

    /* loaded from: classes4.dex */
    public static final class a implements q {
        private final Handler a;

        /* renamed from: b, reason: collision with root package name */
        private final r f15538b;

        public a(Handler handler, r rVar) {
            this.a = handler;
            this.f15538b = rVar;
        }

        @Override // com.mbridge.msdk.tracker.q
        public final void a(s sVar) {
            r.a(this.f15538b, sVar.a());
            r.i(this.f15538b);
            this.f15538b.f15535k = 0L;
            if (this.f15538b.e()) {
                Handler handler = this.a;
                handler.sendMessage(Message.obtain(handler, 2));
            }
            if (com.mbridge.msdk.tracker.a.a) {
                Log.d("TrackManager", this.f15538b.f15529e.c() + " report success " + sVar.a().size() + " 剩余事件数：" + this.f15538b.f15531g.addAndGet(0) + " 个，数据库记录数：" + this.f15538b.a.a() + " 个");
            }
        }

        @Override // com.mbridge.msdk.tracker.q
        public final void a(s sVar, int i10, String str) {
            r.b(this.f15538b, sVar.a());
            this.f15538b.f15535k = System.currentTimeMillis();
            int j3 = r.j(this.f15538b);
            if (j3 <= 10) {
                Handler handler = this.a;
                handler.sendMessageDelayed(Message.obtain(handler, 3), j3 * 1000);
            }
            if (com.mbridge.msdk.tracker.a.a) {
                Log.d("TrackManager", this.f15538b.f15529e.c() + " report failed " + sVar.a().size() + " 剩余事件数：" + this.f15538b.f15531g.addAndGet(0) + " 个，数据库记录数：" + this.f15538b.a.a() + " 个 连续失败次数： " + j3);
            }
        }
    }

    public final void a(e eVar) {
        Handler handler = this.f15533i;
        handler.sendMessage(Message.obtain(handler, 6, eVar));
    }

    public static /* synthetic */ void a(r rVar) {
        if (com.mbridge.msdk.tracker.a.a && com.mbridge.msdk.e.e.f12974b) {
            return;
        }
        int b3 = rVar.a.b();
        if (com.mbridge.msdk.tracker.a.a) {
            Log.d("TrackManager", rVar.f15529e.c() + " 删除无效数据的数量 = " + b3 + " 当前剩余事件数 = " + rVar.f15531g.addAndGet(0) + " 数据库中剩余事件数 = " + rVar.a.a());
        }
    }

    public static /* synthetic */ void a(r rVar, List list) {
        if (y.a((List<?>) list)) {
            return;
        }
        rVar.a.b((List<i>) list);
    }
}
