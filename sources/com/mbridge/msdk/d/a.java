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

/* loaded from: classes4.dex */
public final class a {
    private long a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f12599b;

    /* renamed from: c, reason: collision with root package name */
    private LinkedList<i> f12600c;

    /* renamed from: d, reason: collision with root package name */
    private LinkedList<i> f12601d;

    /* renamed from: e, reason: collision with root package name */
    private int f12602e;

    /* renamed from: f, reason: collision with root package name */
    private int f12603f;

    /* renamed from: g, reason: collision with root package name */
    private e f12604g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.a f12605h;

    /* renamed from: i, reason: collision with root package name */
    private m f12606i;

    /* renamed from: j, reason: collision with root package name */
    private g f12607j;

    /* renamed from: k, reason: collision with root package name */
    private Handler f12608k;

    /* renamed from: com.mbridge.msdk.d.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0163a {
        static a a = new a();
    }

    public static /* synthetic */ void c(a aVar) {
        try {
            LinkedList<i> linkedList = aVar.f12600c;
            if (linkedList != null && linkedList.size() > 0 && aVar.f12602e < aVar.f12600c.size()) {
                i iVar = aVar.f12600c.get(aVar.f12602e);
                aVar.f12602e++;
                if (aVar.a(iVar)) {
                    aVar.a(iVar.a(), iVar.b(), false);
                }
            } else {
                LinkedList<i> linkedList2 = aVar.f12601d;
                if (linkedList2 != null && linkedList2.size() > 0 && aVar.f12603f < aVar.f12601d.size()) {
                    i iVar2 = aVar.f12601d.get(aVar.f12603f);
                    aVar.f12603f++;
                    if (aVar.a(iVar2)) {
                        aVar.a(iVar2.a(), iVar2.b(), true);
                    }
                }
            }
        } catch (Throwable th2) {
            ad.b("LoopTimer", th2.getMessage(), th2);
        }
    }

    private a() {
        this.f12599b = false;
        this.f12600c = new LinkedList<>();
        this.f12601d = new LinkedList<>();
        this.f12602e = 0;
        this.f12603f = 0;
        this.f12608k = new Handler() { // from class: com.mbridge.msdk.d.a.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                synchronized (a.this) {
                    int i10 = message.what;
                    if (i10 != 1) {
                        if (i10 == 2) {
                            a.c(a.this);
                        }
                    } else {
                        if (a.this.f12599b) {
                            return;
                        }
                        a aVar = a.this;
                        a.a(aVar, aVar.a);
                        sendMessageDelayed(obtainMessage(1), a.this.a);
                    }
                }
            }
        };
    }

    private boolean a(i iVar) {
        boolean z10 = false;
        if (iVar == null || TextUtils.isEmpty(iVar.b())) {
            return false;
        }
        String b3 = iVar.b();
        try {
            if (this.f12604g != null) {
                com.mbridge.msdk.videocommon.d.a aVar = this.f12605h;
                int a = this.f12604g.a(b3, aVar != null ? aVar.f() : 0L);
                if (a != -1) {
                    if (a != 1) {
                    }
                } else if (!TextUtils.isEmpty(b3)) {
                    LinkedList<i> linkedList = this.f12600c;
                    if (linkedList != null && linkedList.contains(b3)) {
                        this.f12600c.remove(b3);
                    } else {
                        LinkedList<i> linkedList2 = this.f12601d;
                        if (linkedList2 != null && linkedList2.contains(b3)) {
                            this.f12601d.remove(b3);
                        }
                    }
                    m mVar = this.f12606i;
                    if (mVar != null) {
                        mVar.a(b3);
                    }
                }
                try {
                    Handler handler = this.f12608k;
                    handler.sendMessage(handler.obtainMessage(2));
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    ad.b("LoopTimer", th.getMessage(), th);
                    return z10;
                }
            }
            return true;
        } catch (Throwable th3) {
            th = th3;
            z10 = true;
        }
    }

    public final void b(String str, String str2) {
        if (this.f12601d.contains(str2)) {
            return;
        }
        this.f12601d.add(new i(str, str2, 287));
        m mVar = this.f12606i;
        if (mVar != null) {
            mVar.a(str, str2, 287);
        }
    }

    private void a(String str, String str2, boolean z10) {
        try {
            Context c10 = c.m().c();
            if (c10 == null) {
                return;
            }
            final com.mbridge.msdk.reward.adapter.c cVar = new com.mbridge.msdk.reward.adapter.c(c10, str, str2);
            cVar.b(z10);
            cVar.a(new com.mbridge.msdk.reward.adapter.a() { // from class: com.mbridge.msdk.d.a.2
                @Override // com.mbridge.msdk.reward.adapter.a
                public final void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.d.b bVar) {
                }

                @Override // com.mbridge.msdk.reward.adapter.a
                public final void a(List<CampaignEx> list, com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
                    a.this.f12608k.sendMessage(a.this.f12608k.obtainMessage(2));
                    cVar.a((com.mbridge.msdk.reward.adapter.a) null);
                }

                @Override // com.mbridge.msdk.reward.adapter.a
                public final void a(String str3, com.mbridge.msdk.foundation.same.report.d.b bVar) {
                    a.this.f12608k.sendMessage(a.this.f12608k.obtainMessage(2));
                    cVar.a((com.mbridge.msdk.reward.adapter.a) null);
                }
            });
            com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            bVar.c(SameMD5.getMD5(ai.d()));
            bVar.d(str2);
            if (z10) {
                bVar.b(287);
            } else {
                bVar.b(94);
            }
            bVar.i("0");
            bVar.b("1");
            cVar.a(1, 8000, false, bVar);
        } catch (Exception e2) {
            ad.b("LoopTimer", e2.getMessage(), e2);
        }
    }

    public final void a(String str, String str2) {
        if (this.f12600c.contains(str2)) {
            return;
        }
        this.f12600c.add(new i(str, str2, 94));
        m mVar = this.f12606i;
        if (mVar != null) {
            mVar.a(str, str2, 94);
        }
    }

    public final void a(long j3) {
        if (this.f12607j == null) {
            this.f12607j = g.a(c.m().c());
        }
        if (this.f12606i == null) {
            this.f12606i = m.a(this.f12607j);
        }
        List<i> a = this.f12606i.a(287);
        if (a != null) {
            this.f12601d.addAll(a);
            for (i iVar : a) {
                b(iVar.a(), iVar.b());
            }
        }
        List<i> a10 = this.f12606i.a(94);
        if (a10 != null) {
            this.f12600c.addAll(a10);
            for (i iVar2 : a10) {
                a(iVar2.a(), iVar2.b());
            }
        }
        if (this.f12604g == null) {
            this.f12604g = e.a(this.f12607j);
        }
        if (this.f12605h == null) {
            this.f12605h = com.mbridge.msdk.videocommon.d.b.a().b();
        }
        this.a = j3;
        this.f12599b = false;
        Handler handler = this.f12608k;
        handler.sendMessageDelayed(handler.obtainMessage(1), this.a);
    }

    public static /* synthetic */ void a(a aVar, long j3) {
        LinkedList<i> linkedList = aVar.f12600c;
        if (linkedList == null || linkedList.size() <= 0 || aVar.f12602e == 0 || aVar.f12600c.size() <= aVar.f12602e) {
            LinkedList<i> linkedList2 = aVar.f12601d;
            if (linkedList2 == null || linkedList2.size() <= 0 || aVar.f12603f == 0 || aVar.f12601d.size() == aVar.f12603f) {
                aVar.f12603f = 0;
                aVar.f12602e = 0;
                Handler handler = aVar.f12608k;
                handler.sendMessage(handler.obtainMessage(2));
            }
        }
    }
}
