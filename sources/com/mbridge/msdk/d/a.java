package com.mbridge.msdk.d;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.i;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private long f14894a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private LinkedList<i> f14895c;

    /* renamed from: d, reason: collision with root package name */
    private LinkedList<i> f14896d;

    /* renamed from: e, reason: collision with root package name */
    private int f14897e;

    /* renamed from: f, reason: collision with root package name */
    private int f14898f;

    /* renamed from: g, reason: collision with root package name */
    private e f14899g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.a f14900h;

    /* renamed from: i, reason: collision with root package name */
    private m f14901i;

    /* renamed from: j, reason: collision with root package name */
    private g f14902j;

    /* renamed from: k, reason: collision with root package name */
    private Handler f14903k;

    /* renamed from: com.mbridge.msdk.d.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0151a {

        /* renamed from: a, reason: collision with root package name */
        static a f14906a = new a();
    }

    public static /* synthetic */ void c(a aVar) {
        try {
            LinkedList<i> linkedList = aVar.f14895c;
            if (linkedList != null && linkedList.size() > 0 && aVar.f14897e < aVar.f14895c.size()) {
                i iVar = aVar.f14895c.get(aVar.f14897e);
                aVar.f14897e++;
                if (aVar.a(iVar)) {
                    aVar.a(iVar.a(), iVar.b(), false);
                }
            } else {
                LinkedList<i> linkedList2 = aVar.f14896d;
                if (linkedList2 != null && linkedList2.size() > 0 && aVar.f14898f < aVar.f14896d.size()) {
                    i iVar2 = aVar.f14896d.get(aVar.f14898f);
                    aVar.f14898f++;
                    if (aVar.a(iVar2)) {
                        aVar.a(iVar2.a(), iVar2.b(), true);
                    }
                }
            }
        } catch (Throwable th) {
            ad.b("LoopTimer", th.getMessage(), th);
        }
    }

    private a() {
        this.b = false;
        this.f14895c = new LinkedList<>();
        this.f14896d = new LinkedList<>();
        this.f14897e = 0;
        this.f14898f = 0;
        this.f14903k = new Handler() { // from class: com.mbridge.msdk.d.a.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                synchronized (a.this) {
                    try {
                        int i9 = message.what;
                        if (i9 != 1) {
                            if (i9 == 2) {
                                a.c(a.this);
                            }
                        } else {
                            if (a.this.b) {
                                return;
                            }
                            a aVar = a.this;
                            a.a(aVar, aVar.f14894a);
                            sendMessageDelayed(obtainMessage(1), a.this.f14894a);
                        }
                    } finally {
                    }
                }
            }
        };
    }

    private boolean a(i iVar) {
        boolean z8 = false;
        if (iVar == null || TextUtils.isEmpty(iVar.b())) {
            return false;
        }
        String b = iVar.b();
        try {
            if (this.f14899g != null) {
                com.mbridge.msdk.videocommon.d.a aVar = this.f14900h;
                int a6 = this.f14899g.a(b, aVar != null ? aVar.f() : 0L);
                if (a6 != -1) {
                    if (a6 != 1) {
                    }
                } else if (!TextUtils.isEmpty(b)) {
                    LinkedList<i> linkedList = this.f14895c;
                    if (linkedList != null && linkedList.contains(b)) {
                        this.f14895c.remove(b);
                    } else {
                        LinkedList<i> linkedList2 = this.f14896d;
                        if (linkedList2 != null && linkedList2.contains(b)) {
                            this.f14896d.remove(b);
                        }
                    }
                    m mVar = this.f14901i;
                    if (mVar != null) {
                        mVar.a(b);
                    }
                }
                try {
                    Handler handler = this.f14903k;
                    handler.sendMessage(handler.obtainMessage(2));
                    return false;
                } catch (Throwable th) {
                    th = th;
                    ad.b("LoopTimer", th.getMessage(), th);
                    return z8;
                }
            }
            return true;
        } catch (Throwable th2) {
            th = th2;
            z8 = true;
        }
    }

    public final void b(String str, String str2) {
        if (this.f14896d.contains(str2)) {
            return;
        }
        this.f14896d.add(new i(str, str2, 287));
        m mVar = this.f14901i;
        if (mVar != null) {
            mVar.a(str, str2, 287);
        }
    }

    private void a(String str, String str2, boolean z8) {
        try {
            Context c9 = c.m().c();
            if (c9 == null) {
                return;
            }
            final com.mbridge.msdk.reward.adapter.c cVar = new com.mbridge.msdk.reward.adapter.c(c9, str, str2);
            cVar.b(z8);
            cVar.a(new com.mbridge.msdk.reward.adapter.a() { // from class: com.mbridge.msdk.d.a.2
                @Override // com.mbridge.msdk.reward.adapter.a
                public final void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.d.b bVar) {
                }

                @Override // com.mbridge.msdk.reward.adapter.a
                public final void a(List<CampaignEx> list, com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
                    a.this.f14903k.sendMessage(a.this.f14903k.obtainMessage(2));
                    cVar.a((com.mbridge.msdk.reward.adapter.a) null);
                }

                @Override // com.mbridge.msdk.reward.adapter.a
                public final void a(String str3, com.mbridge.msdk.foundation.same.report.d.b bVar) {
                    a.this.f14903k.sendMessage(a.this.f14903k.obtainMessage(2));
                    cVar.a((com.mbridge.msdk.reward.adapter.a) null);
                }
            });
            com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            bVar.c(SameMD5.getMD5(ai.d()));
            bVar.d(str2);
            if (z8) {
                bVar.b(287);
            } else {
                bVar.b(94);
            }
            bVar.i("0");
            bVar.b("1");
            cVar.a(1, 8000, false, bVar);
        } catch (Exception e4) {
            ad.b("LoopTimer", e4.getMessage(), e4);
        }
    }

    public final void a(String str, String str2) {
        if (this.f14895c.contains(str2)) {
            return;
        }
        this.f14895c.add(new i(str, str2, 94));
        m mVar = this.f14901i;
        if (mVar != null) {
            mVar.a(str, str2, 94);
        }
    }

    public final void a(long j7) {
        if (this.f14902j == null) {
            this.f14902j = g.a(c.m().c());
        }
        if (this.f14901i == null) {
            this.f14901i = m.a(this.f14902j);
        }
        List<i> a6 = this.f14901i.a(287);
        if (a6 != null) {
            this.f14896d.addAll(a6);
            for (i iVar : a6) {
                b(iVar.a(), iVar.b());
            }
        }
        List<i> a9 = this.f14901i.a(94);
        if (a9 != null) {
            this.f14895c.addAll(a9);
            for (i iVar2 : a9) {
                a(iVar2.a(), iVar2.b());
            }
        }
        if (this.f14899g == null) {
            this.f14899g = e.a(this.f14902j);
        }
        if (this.f14900h == null) {
            this.f14900h = com.mbridge.msdk.videocommon.d.b.a().b();
        }
        this.f14894a = j7;
        this.b = false;
        Handler handler = this.f14903k;
        handler.sendMessageDelayed(handler.obtainMessage(1), this.f14894a);
    }

    public static /* synthetic */ void a(a aVar, long j7) {
        LinkedList<i> linkedList = aVar.f14895c;
        if (linkedList == null || linkedList.size() <= 0 || aVar.f14897e == 0 || aVar.f14895c.size() <= aVar.f14897e) {
            LinkedList<i> linkedList2 = aVar.f14896d;
            if (linkedList2 == null || linkedList2.size() <= 0 || aVar.f14898f == 0 || aVar.f14896d.size() == aVar.f14898f) {
                aVar.f14898f = 0;
                aVar.f14897e = 0;
                Handler handler = aVar.f14903k;
                handler.sendMessage(handler.obtainMessage(2));
            }
        }
    }
}
