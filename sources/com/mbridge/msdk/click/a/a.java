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
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import z.AbstractC2965e;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static String f14766a = "mtg_retry_report=1";
    public static int b = 10000;

    /* renamed from: c, reason: collision with root package name */
    public static int f14767c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static int f14768d = 50;

    /* renamed from: e, reason: collision with root package name */
    public static int f14769e = 600000;

    /* renamed from: f, reason: collision with root package name */
    public static int f14770f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f14771g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static int f14772h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static int f14773i = 3;

    /* renamed from: j, reason: collision with root package name */
    public static int f14774j = 4;

    /* renamed from: k, reason: collision with root package name */
    public static int f14775k = 5;
    private static String l = "RetryReportControl";

    /* renamed from: o, reason: collision with root package name */
    private static int f14776o;

    /* renamed from: p, reason: collision with root package name */
    private static int f14777p;
    private ConcurrentHashMap<String, com.mbridge.msdk.click.a.b> m;

    /* renamed from: n, reason: collision with root package name */
    private c f14778n;

    /* renamed from: q, reason: collision with root package name */
    private BroadcastReceiver f14779q;

    /* renamed from: r, reason: collision with root package name */
    private final Handler f14780r;

    /* renamed from: com.mbridge.msdk.click.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0150a {

        /* renamed from: a, reason: collision with root package name */
        private static a f14782a = new a();
    }

    /* loaded from: classes3.dex */
    public static class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i9 = message.what;
            if (i9 != 1) {
                if (i9 == 2) {
                    a.a(a.a());
                }
            } else {
                Object obj = message.obj;
                if (obj instanceof String) {
                    a.a().a((String) obj, com.mbridge.msdk.click.a.b.f14783a);
                }
            }
        }
    }

    private a() {
        this.m = new ConcurrentHashMap<>();
        this.f14778n = new c(f14768d);
        this.f14780r = new b(Looper.getMainLooper());
        g a6 = h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
        f14767c = a6.ad();
        b = a6.af() * 1000;
        f14769e = a6.ag() * 1000;
        f14776o = a6.ac();
        f14777p = a6.ae();
        try {
            if (this.f14779q == null) {
                this.f14779q = new BroadcastReceiver() { // from class: com.mbridge.msdk.click.a.a.1
                    @Override // android.content.BroadcastReceiver
                    public final void onReceive(Context context, Intent intent) {
                        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                            a.this.f14780r.sendEmptyMessage(2);
                        }
                    }
                };
                Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
                if (c9 != null) {
                    c9.registerReceiver(this.f14779q, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public static a a() {
        return C0150a.f14782a;
    }

    private boolean b(int i9) {
        return i9 == f14771g || i9 == f14772h;
    }

    private void a(com.mbridge.msdk.click.a.b bVar) {
        String str;
        String str2;
        try {
            CampaignEx f9 = bVar.f();
            if (f9 != null) {
                String requestId = f9.getRequestId();
                str2 = f9.getRequestIdNotice();
                str = requestId;
            } else {
                str = "";
                str2 = str;
            }
            a(com.mbridge.msdk.foundation.controller.c.m().c(), bVar.i().toString(), bVar.g(), str, str2, bVar.d());
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    private static void a(Context context, String str, String str2, String str3, String str4, int i9) {
        f.a().a(context, str, str2, str3, str4, i9);
    }

    private void a(String str) {
        Message obtainMessage = this.f14780r.obtainMessage();
        obtainMessage.what = 1;
        obtainMessage.obj = str;
        this.f14780r.sendMessageDelayed(obtainMessage, b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i9) {
        String sb;
        c cVar = this.f14778n;
        if (cVar != null) {
            com.mbridge.msdk.click.a.b a6 = cVar.a(str);
            this.f14778n.b(str);
            if (a6 == null) {
                com.mbridge.msdk.click.a.b bVar = this.m.get(str);
                if (bVar == null || System.currentTimeMillis() > bVar.j() + f14769e || bVar.h() >= f14767c || i9 == com.mbridge.msdk.click.a.b.b) {
                    return;
                }
                a(str);
                return;
            }
            if (System.currentTimeMillis() <= a6.j() + f14769e) {
                a6.a(i9);
                this.m.put(str, a6);
                if (ao.c(str) == 0) {
                    StringBuilder c9 = AbstractC2965e.c(str, "?");
                    c9.append(f14766a);
                    sb = c9.toString();
                } else {
                    StringBuilder c10 = AbstractC2965e.c(str, "&");
                    c10.append(f14766a);
                    sb = c10.toString();
                }
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), a6.f(), a6.e(), sb, a6.a(), a6.b(), a6.d());
                return;
            }
            if (i9 != com.mbridge.msdk.click.a.b.b) {
                a(a6);
            }
        }
    }

    private boolean a(int i9) {
        return i9 == f14774j || i9 == f14773i;
    }

    public final void a(String str, String str2, CampaignEx campaignEx, String str3, boolean z8, boolean z9, int i9) {
        if ((a(i9) || b(i9) || i9 == f14775k) && !TextUtils.isEmpty(str)) {
            String replace = str.replace("?" + f14766a, "").replace("&" + f14766a, "");
            if (this.m == null) {
                this.m = new ConcurrentHashMap<>();
            }
            com.mbridge.msdk.click.a.b remove = this.m.remove(replace);
            if (remove == null) {
                remove = new com.mbridge.msdk.click.a.b(str, str2);
                remove.b(i9);
                remove.a(z8);
                remove.b(z9);
                remove.a(campaignEx);
                remove.a(str3);
            } else if (remove.c() != com.mbridge.msdk.click.a.b.b) {
                remove.b(str2);
            }
            if ((!a(i9) || f14776o == 0) && ((!b(i9) || f14777p == 0) && i9 != f14775k)) {
                a(remove);
                return;
            }
            if (System.currentTimeMillis() < remove.j() + f14769e) {
                if (this.f14778n == null) {
                    this.f14778n = new c(f14768d);
                }
                this.f14778n.a(replace, remove);
                if (remove.c() == com.mbridge.msdk.click.a.b.f14783a) {
                    if (remove.h() <= f14767c) {
                        a(replace);
                        return;
                    } else {
                        a(remove);
                        return;
                    }
                }
                return;
            }
            if (remove.c() == com.mbridge.msdk.click.a.b.f14783a) {
                a(remove);
            }
        }
    }

    public static /* synthetic */ void a(a aVar) {
        c cVar = aVar.f14778n;
        if (cVar != null) {
            Iterator<String> it = cVar.a().iterator();
            while (it.hasNext()) {
                aVar.a(it.next(), com.mbridge.msdk.click.a.b.b);
            }
        }
    }
}
