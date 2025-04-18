package com.mbridge.msdk.click.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.f;
import com.mbridge.msdk.foundation.tools.ao;
import eb.j;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class a {
    public static String a = "mtg_retry_report=1";

    /* renamed from: b, reason: collision with root package name */
    public static int f12475b = 10000;

    /* renamed from: c, reason: collision with root package name */
    public static int f12476c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static int f12477d = 50;

    /* renamed from: e, reason: collision with root package name */
    public static int f12478e = 600000;

    /* renamed from: f, reason: collision with root package name */
    public static int f12479f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f12480g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static int f12481h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static int f12482i = 3;

    /* renamed from: j, reason: collision with root package name */
    public static int f12483j = 4;

    /* renamed from: k, reason: collision with root package name */
    public static int f12484k = 5;

    /* renamed from: l, reason: collision with root package name */
    private static String f12485l = "RetryReportControl";

    /* renamed from: o, reason: collision with root package name */
    private static int f12486o;

    /* renamed from: p, reason: collision with root package name */
    private static int f12487p;

    /* renamed from: m, reason: collision with root package name */
    private ConcurrentHashMap<String, com.mbridge.msdk.click.a.b> f12488m;

    /* renamed from: n, reason: collision with root package name */
    private c f12489n;

    /* renamed from: q, reason: collision with root package name */
    private BroadcastReceiver f12490q;

    /* renamed from: r, reason: collision with root package name */
    private final Handler f12491r;

    /* renamed from: com.mbridge.msdk.click.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0162a {
        private static a a = new a();
    }

    /* loaded from: classes4.dex */
    public static class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 == 2) {
                    a.a(a.a());
                }
            } else {
                Object obj = message.obj;
                if (obj instanceof String) {
                    a.a().a((String) obj, com.mbridge.msdk.click.a.b.a);
                }
            }
        }
    }

    private a() {
        this.f12488m = new ConcurrentHashMap<>();
        this.f12489n = new c(f12477d);
        this.f12491r = new b(Looper.getMainLooper());
        g a10 = h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
        f12476c = a10.ad();
        f12475b = a10.af() * 1000;
        f12478e = a10.ag() * 1000;
        f12486o = a10.ac();
        f12487p = a10.ae();
        try {
            if (this.f12490q == null) {
                this.f12490q = new BroadcastReceiver() { // from class: com.mbridge.msdk.click.a.a.1
                    @Override // android.content.BroadcastReceiver
                    public final void onReceive(Context context, Intent intent) {
                        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                            a.this.f12491r.sendEmptyMessage(2);
                        }
                    }
                };
                Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
                if (c10 != null) {
                    c10.registerReceiver(this.f12490q, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static a a() {
        return C0162a.a;
    }

    private boolean b(int i10) {
        return i10 == f12480g || i10 == f12481h;
    }

    private void a(com.mbridge.msdk.click.a.b bVar) {
        String str;
        String str2;
        try {
            CampaignEx f10 = bVar.f();
            if (f10 != null) {
                String requestId = f10.getRequestId();
                str2 = f10.getRequestIdNotice();
                str = requestId;
            } else {
                str = "";
                str2 = str;
            }
            a(com.mbridge.msdk.foundation.controller.c.m().c(), bVar.i().toString(), bVar.g(), str, str2, bVar.d());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static void a(Context context, String str, String str2, String str3, String str4, int i10) {
        f.a().a(context, str, str2, str3, str4, i10);
    }

    private void a(String str) {
        Message obtainMessage = this.f12491r.obtainMessage();
        obtainMessage.what = 1;
        obtainMessage.obj = str;
        this.f12491r.sendMessageDelayed(obtainMessage, f12475b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i10) {
        String sb2;
        c cVar = this.f12489n;
        if (cVar != null) {
            com.mbridge.msdk.click.a.b a10 = cVar.a(str);
            this.f12489n.b(str);
            if (a10 == null) {
                com.mbridge.msdk.click.a.b bVar = this.f12488m.get(str);
                if (bVar == null || System.currentTimeMillis() > bVar.j() + f12478e || bVar.h() >= f12476c || i10 == com.mbridge.msdk.click.a.b.f12492b) {
                    return;
                }
                a(str);
                return;
            }
            if (System.currentTimeMillis() <= a10.j() + f12478e) {
                a10.a(i10);
                this.f12488m.put(str, a10);
                if (ao.c(str) == 0) {
                    StringBuilder n10 = j.n(str, "?");
                    n10.append(a);
                    sb2 = n10.toString();
                } else {
                    StringBuilder n11 = j.n(str, "&");
                    n11.append(a);
                    sb2 = n11.toString();
                }
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), a10.f(), a10.e(), sb2, a10.a(), a10.b(), a10.d());
                return;
            }
            if (i10 != com.mbridge.msdk.click.a.b.f12492b) {
                a(a10);
            }
        }
    }

    private boolean a(int i10) {
        return i10 == f12483j || i10 == f12482i;
    }

    public final void a(String str, String str2, CampaignEx campaignEx, String str3, boolean z10, boolean z11, int i10) {
        if (!(a(i10) || b(i10) || i10 == f12484k) || TextUtils.isEmpty(str)) {
            return;
        }
        String replace = str.replace("?" + a, "").replace("&" + a, "");
        if (this.f12488m == null) {
            this.f12488m = new ConcurrentHashMap<>();
        }
        com.mbridge.msdk.click.a.b remove = this.f12488m.remove(replace);
        if (remove == null) {
            remove = new com.mbridge.msdk.click.a.b(str, str2);
            remove.b(i10);
            remove.a(z10);
            remove.b(z11);
            remove.a(campaignEx);
            remove.a(str3);
        } else if (remove.c() != com.mbridge.msdk.click.a.b.f12492b) {
            remove.b(str2);
        }
        if (!((a(i10) && f12486o != 0) || (b(i10) && f12487p != 0) || i10 == f12484k)) {
            a(remove);
            return;
        }
        if (System.currentTimeMillis() < remove.j() + f12478e) {
            if (this.f12489n == null) {
                this.f12489n = new c(f12477d);
            }
            this.f12489n.a(replace, remove);
            if (remove.c() == com.mbridge.msdk.click.a.b.a) {
                if (remove.h() <= f12476c) {
                    a(replace);
                    return;
                } else {
                    a(remove);
                    return;
                }
            }
            return;
        }
        if (remove.c() == com.mbridge.msdk.click.a.b.a) {
            a(remove);
        }
    }

    public static /* synthetic */ void a(a aVar) {
        c cVar = aVar.f12489n;
        if (cVar != null) {
            Iterator<String> it = cVar.a().iterator();
            while (it.hasNext()) {
                aVar.a(it.next(), com.mbridge.msdk.click.a.b.f12492b);
            }
        }
    }
}
