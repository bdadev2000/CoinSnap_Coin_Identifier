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
import x0.AbstractC2914a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final c f18291a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18292c;

    /* renamed from: d, reason: collision with root package name */
    private final int f18293d;

    /* renamed from: e, reason: collision with root package name */
    private final k f18294e;

    /* renamed from: i, reason: collision with root package name */
    private Handler f18298i;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicInteger f18295f = new AtomicInteger(0);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicInteger f18296g = new AtomicInteger(0);

    /* renamed from: h, reason: collision with root package name */
    private final Object f18297h = new Object();

    /* renamed from: j, reason: collision with root package name */
    private boolean f18299j = true;

    /* renamed from: k, reason: collision with root package name */
    private long f18300k = 0;
    private volatile boolean l = false;
    private volatile boolean m = false;

    /* loaded from: classes3.dex */
    public static final class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final r f18302a;

        public b(Looper looper, r rVar) {
            super(looper);
            this.f18302a = rVar;
        }

        private void a(String str) {
            Log.d("TrackManager", this.f18302a.f18294e.c() + " " + str + this.f18302a.f18296g.addAndGet(0) + " 数据库记录数：" + this.f18302a.f18291a.a());
        }

        private void b() {
            try {
                removeMessages(1);
                removeMessages(6);
                removeMessages(2);
                removeMessages(3);
            } catch (Exception e4) {
                if (com.mbridge.msdk.tracker.a.f18098a) {
                    Log.e("TrackManager", this.f18302a.f18294e.c() + " removeMessages failed ", e4);
                }
            }
            if (!this.f18302a.f()) {
                try {
                    sendMessageDelayed(Message.obtain(this, 1), y.a(this.f18302a.f18295f.get(), this.f18302a.f18300k, this.f18302a.f18292c));
                } catch (Exception e9) {
                    if (com.mbridge.msdk.tracker.a.f18098a) {
                        Log.e("TrackManager", this.f18302a.f18294e.c() + " sendMessageDelayed failed ", e9);
                    }
                }
            }
        }

        @Override // android.os.Handler
        public final void dispatchMessage(Message message) {
            e eVar;
            super.dispatchMessage(message);
            int i9 = message.what;
            if (i9 != 2 && i9 != 3) {
                if (i9 != 5) {
                    if (i9 != 6) {
                        if (i9 != 7) {
                            b();
                            if (com.mbridge.msdk.tracker.a.f18098a) {
                                a("触发上报（timer）当前 Event 数量：");
                            }
                            a();
                            return;
                        }
                        this.f18302a.c();
                        b();
                        if (com.mbridge.msdk.tracker.a.f18098a) {
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
                    if (com.mbridge.msdk.tracker.a.f18098a && !y.a(eVar)) {
                        a(AbstractC2914a.e("收到 Event( ", eVar.a(), " )，当前 Event 数量："));
                    }
                    if ((y.b(eVar) && eVar.c() == 1) || this.f18302a.e()) {
                        b();
                        if (com.mbridge.msdk.tracker.a.f18098a) {
                            a("触发上报（notice check）当前 Event 数量：");
                        }
                        a();
                        return;
                    }
                    return;
                }
                if (com.mbridge.msdk.tracker.a.f18098a) {
                    a("触发删除 当前 Event 数量：");
                }
                r.a(this.f18302a);
                sendMessageDelayed(Message.obtain(this, 5), 120000L);
                return;
            }
            b();
            if (com.mbridge.msdk.tracker.a.f18098a) {
                a("触发上报（report result）当前 Event 数量：");
            }
            a();
        }

        private synchronized void a() {
            try {
                r.e(this.f18302a);
            } catch (Exception e4) {
                if (com.mbridge.msdk.tracker.a.f18098a) {
                    Log.e("TrackManager", this.f18302a.f18294e.c() + " report failed ", e4);
                }
            }
        }
    }

    public r(k kVar) {
        this.f18291a = kVar.g();
        this.b = kVar.l();
        this.f18292c = kVar.m();
        this.f18293d = kVar.n();
        this.f18294e = kVar;
    }

    public static /* synthetic */ void i(r rVar) {
        rVar.f18295f.set(0);
    }

    public static /* synthetic */ int j(r rVar) {
        return rVar.f18295f.getAndIncrement();
    }

    public final boolean e() {
        return this.f18296g.addAndGet(0) >= this.b;
    }

    public static /* synthetic */ void e(r rVar) {
        if (rVar.f18294e.t()) {
            List<i> a6 = rVar.f18291a.a(rVar.b);
            if (y.a((List<?>) a6)) {
                if (com.mbridge.msdk.tracker.a.f18098a) {
                    Log.d("TrackManager", rVar.f18294e.c() + " report: 没有可以上报的数据");
                    return;
                }
                return;
            }
            rVar.f18291a.a(a6);
            int size = a6.size();
            rVar.f18296g.addAndGet(-size);
            boolean z8 = false;
            if (com.mbridge.msdk.tracker.a.f18098a) {
                Log.d("TrackManager", rVar.f18294e.c() + " report: 上报的数量 = " + size + " 当前剩余事件数 = " + rVar.f18296g.addAndGet(0) + " 数据库中剩余事件数 = " + rVar.f18291a.a());
            }
            try {
                z8 = rVar.f18294e.p();
            } catch (IllegalStateException e4) {
                if (com.mbridge.msdk.tracker.a.f18098a) {
                    Log.e("TrackManager", rVar.f18294e.c() + " report environment check failed ", e4);
                }
            }
            if (!z8) {
                if (com.mbridge.msdk.tracker.a.f18098a) {
                    Log.e("TrackManager", rVar.f18294e.c() + " report 失败，请检查 TrackConfig 配置是否正确");
                    return;
                }
                return;
            }
            n q9 = rVar.f18294e.q();
            q9.a(new a(rVar.f18298i, rVar));
            Map<String, String> hashMap = new HashMap<>();
            try {
                hashMap = rVar.f18294e.j().a(rVar.f18294e.k(), a6, rVar.f18294e.f());
            } catch (Exception e9) {
                if (com.mbridge.msdk.tracker.a.f18098a) {
                    Log.e("TrackManager", rVar.f18294e.c() + " report decorate request params failed ", e9);
                }
            }
            q9.a(new s(a6), hashMap, y.b(a6));
        }
    }

    public final void a() {
        HandlerThread handlerThread = new HandlerThread("report_timer");
        handlerThread.start();
        b bVar = new b(handlerThread.getLooper(), this);
        this.f18298i = bVar;
        bVar.sendMessageDelayed(Message.obtain(bVar, 5), DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        Handler handler = this.f18298i;
        handler.sendMessageDelayed(Message.obtain(handler, 1), this.f18292c);
        this.f18299j = false;
    }

    public final void b() {
        this.f18298i.removeMessages(1);
        Handler handler = this.f18298i;
        handler.sendMessage(Message.obtain(handler, 7));
    }

    public final void c() {
        synchronized (this.f18297h) {
            try {
                if (!this.l) {
                    this.l = true;
                    this.f18291a.c();
                }
                if (!this.m) {
                    this.m = true;
                    this.f18296g.addAndGet(this.f18291a.a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        this.f18296g.incrementAndGet();
    }

    public final boolean f() {
        return this.f18299j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(r rVar, List list) {
        if (y.a((List<?>) list)) {
            return;
        }
        Iterator it = list.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (!y.a(iVar)) {
                byte b8 = !iVar.b() && iVar.d() >= rVar.f18293d;
                boolean z8 = !iVar.a() && iVar.g() < System.currentTimeMillis();
                if (b8 == false && !z8) {
                    iVar.a(iVar.d() + (y.a(rVar.f18294e.e()) ? 1 : 0));
                    iVar.b(3);
                    i9++;
                } else {
                    iVar.b(-1);
                }
            }
        }
        rVar.f18291a.c((List<i>) list);
        rVar.f18296g.addAndGet(i9);
    }

    /* loaded from: classes3.dex */
    public static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f18301a;
        private final r b;

        public a(Handler handler, r rVar) {
            this.f18301a = handler;
            this.b = rVar;
        }

        @Override // com.mbridge.msdk.tracker.q
        public final void a(s sVar) {
            r.a(this.b, sVar.a());
            r.i(this.b);
            this.b.f18300k = 0L;
            if (this.b.e()) {
                Handler handler = this.f18301a;
                handler.sendMessage(Message.obtain(handler, 2));
            }
            if (com.mbridge.msdk.tracker.a.f18098a) {
                Log.d("TrackManager", this.b.f18294e.c() + " report success " + sVar.a().size() + " 剩余事件数：" + this.b.f18296g.addAndGet(0) + " 个，数据库记录数：" + this.b.f18291a.a() + " 个");
            }
        }

        @Override // com.mbridge.msdk.tracker.q
        public final void a(s sVar, int i9, String str) {
            r.b(this.b, sVar.a());
            this.b.f18300k = System.currentTimeMillis();
            int j7 = r.j(this.b);
            if (j7 <= 10) {
                Handler handler = this.f18301a;
                handler.sendMessageDelayed(Message.obtain(handler, 3), j7 * 1000);
            }
            if (com.mbridge.msdk.tracker.a.f18098a) {
                Log.d("TrackManager", this.b.f18294e.c() + " report failed " + sVar.a().size() + " 剩余事件数：" + this.b.f18296g.addAndGet(0) + " 个，数据库记录数：" + this.b.f18291a.a() + " 个 连续失败次数： " + j7);
            }
        }
    }

    public final void a(e eVar) {
        Handler handler = this.f18298i;
        handler.sendMessage(Message.obtain(handler, 6, eVar));
    }

    public static /* synthetic */ void a(r rVar) {
        if (com.mbridge.msdk.tracker.a.f18098a && com.mbridge.msdk.e.e.b) {
            return;
        }
        int b8 = rVar.f18291a.b();
        if (com.mbridge.msdk.tracker.a.f18098a) {
            Log.d("TrackManager", rVar.f18294e.c() + " 删除无效数据的数量 = " + b8 + " 当前剩余事件数 = " + rVar.f18296g.addAndGet(0) + " 数据库中剩余事件数 = " + rVar.f18291a.a());
        }
    }

    public static /* synthetic */ void a(r rVar, List list) {
        if (y.a((List<?>) list)) {
            return;
        }
        rVar.f18291a.b((List<i>) list);
    }
}
