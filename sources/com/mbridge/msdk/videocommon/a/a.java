package com.mbridge.msdk.videocommon.a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.videocommon.d.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class a {
    private static final String a = "com.mbridge.msdk.videocommon.a.a";

    /* renamed from: b, reason: collision with root package name */
    private static a f16334b;

    /* renamed from: c, reason: collision with root package name */
    private e f16335c;

    private a() {
        try {
            Context c10 = c.m().c();
            if (c10 != null) {
                this.f16335c = e.a(g.a(c10));
            } else {
                ad.b(a, "RewardCampaignCache get Context is null");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static a a() {
        if (f16334b == null) {
            synchronized (a.class) {
                if (f16334b == null) {
                    f16334b = new a();
                }
            }
        }
        return f16334b;
    }

    public final int b(String str, int i10, boolean z10, String str2) {
        List<CampaignEx> a10;
        try {
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            ArrayList arrayList = new ArrayList();
            if (z10) {
                a10 = this.f16335c.a(str, 0, 0, i10, str2);
            } else {
                a10 = this.f16335c.a(str, 0, 0, i10, false);
            }
            if (a10 == null) {
                return 0;
            }
            for (CampaignEx campaignEx : a10) {
                if (campaignEx != null && campaignEx.getReadyState() == 0) {
                    arrayList.add(campaignEx);
                }
            }
            return arrayList.size();
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public final List<CampaignEx> c(String str, int i10, boolean z10, String str2) {
        long aa2;
        List<CampaignEx> a10;
        ArrayList arrayList = null;
        try {
            com.mbridge.msdk.c.g b3 = h.a().b(c.m().k());
            if (b3 != null) {
                aa2 = b3.aa();
            } else {
                h.a();
                aa2 = i.a().aa();
            }
            long j3 = aa2 * 1000;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (z10) {
                a10 = this.f16335c.a(str, 0, 0, i10, str2);
            } else {
                a10 = this.f16335c.a(str, 0, 0, i10, false);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (a10 == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                for (CampaignEx campaignEx : a10) {
                    if (campaignEx != null && campaignEx.getReadyState() == 0) {
                        long plctb = campaignEx.getPlctb() * 1000;
                        long timestamp = currentTimeMillis - campaignEx.getTimestamp();
                        if ((plctb <= 0 && j3 >= timestamp) || (plctb > 0 && plctb >= timestamp)) {
                            arrayList2.add(campaignEx);
                        }
                    }
                }
                return arrayList2;
            } catch (Exception e2) {
                e = e2;
                arrayList = arrayList2;
                e.printStackTrace();
                return arrayList;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    public final CopyOnWriteArrayList<CampaignEx> a(String str, int i10) {
        List<CampaignEx> a10;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = null;
        try {
            if (TextUtils.isEmpty(str) || (a10 = this.f16335c.a(str, 0, 0, i10)) == null) {
                return null;
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
            try {
                for (CampaignEx campaignEx : a10) {
                    if (campaignEx != null) {
                        copyOnWriteArrayList2.add(campaignEx);
                    }
                }
                return copyOnWriteArrayList2;
            } catch (Exception e2) {
                e = e2;
                copyOnWriteArrayList = copyOnWriteArrayList2;
                e.printStackTrace();
                return copyOnWriteArrayList;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    public final List<CampaignEx> b(String str, int i10, boolean z10) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return this.f16335c.a(str, 0, 0, i10, z10);
        } catch (Exception e2) {
            ad.b(a, e2.getLocalizedMessage());
            return null;
        }
    }

    public final void a(String str, List<CampaignEx> list, String str2, int i10) {
        e eVar;
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0 || TextUtils.isEmpty(str2) || (eVar = this.f16335c) == null) {
            return;
        }
        eVar.a(str, list, str2, i10);
    }

    public final void b(String str) {
        ConcurrentHashMap<String, com.mbridge.msdk.foundation.entity.c> f10;
        try {
            if (TextUtils.isEmpty(str) || (f10 = this.f16335c.f(str)) == null || f10.size() <= 0) {
                return;
            }
            com.mbridge.msdk.c.g b3 = h.a().b(c.m().k());
            if (b3 == null) {
                h.a();
                b3 = i.a();
            }
            long aa2 = b3 != null ? b3.aa() : 0L;
            long currentTimeMillis = System.currentTimeMillis();
            for (com.mbridge.msdk.foundation.entity.c cVar : f10.values()) {
                if (cVar != null) {
                    long e2 = cVar.e();
                    if (e2 <= 0) {
                        e2 = aa2;
                    }
                    if ((e2 * 1000) + cVar.f() < currentTimeMillis && !TextUtils.isEmpty(cVar.a())) {
                        ad.b("HBOPTIMIZE", "不在有效期范围内 删除" + cVar.a());
                        c(str, cVar.a());
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void a(String str, List<CampaignEx> list) {
        e eVar;
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0 || (eVar = this.f16335c) == null) {
            return;
        }
        eVar.b(str, list);
    }

    public final void a(String str, List<CampaignEx> list, String str2) {
        e eVar;
        try {
            if (TextUtils.isEmpty(str) || list == null || list.size() <= 0 || (eVar = this.f16335c) == null) {
                return;
            }
            eVar.a(str, list, str2);
        } catch (Exception e2) {
            ad.b(a, e2.getMessage());
        }
    }

    public final synchronized void c(String str, String str2) {
        try {
            this.f16335c.c(str2, str);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void a(String str, String str2) {
        if (this.f16335c == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f16335c.f(str, str2);
    }

    public final synchronized void c(String str, int i10) {
        int j3;
        try {
            com.mbridge.msdk.c.g b3 = h.a().b(c.m().k());
            if (b3 == null) {
                h.a();
                b3 = i.a();
            }
            j3 = b3.j();
        } catch (Exception e2) {
            ad.b(a, e2.getMessage());
        }
        if (j3 == 0) {
            return;
        }
        boolean z10 = true;
        List<CampaignEx> b10 = this.f16335c.b(str, i10, j3 == 2);
        if (b10 != null && b10.size() > 0) {
            for (CampaignEx campaignEx : b10) {
                String requestIdNotice = campaignEx.getRequestIdNotice();
                String id2 = campaignEx.getId();
                com.mbridge.msdk.videocommon.a.b(campaignEx.getCampaignUnitId() + "_" + id2 + "_" + requestIdNotice + "_" + campaignEx.getCMPTEntryUrl());
            }
        }
        e eVar = this.f16335c;
        if (j3 != 2) {
            z10 = false;
        }
        eVar.a(str, i10, z10);
    }

    public final List<CampaignEx> a(String str, int i10, boolean z10) {
        return a(str, i10, z10, "");
    }

    public final CopyOnWriteArrayList<CampaignEx> a(String str, int i10, boolean z10, String str2) {
        List<CampaignEx> a10;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = null;
        try {
            com.mbridge.msdk.videocommon.d.a b3 = b.a().b();
            long f10 = b3 != null ? b3.f() : 0L;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (z10) {
                a10 = this.f16335c.a(str, 0, 0, i10, str2);
            } else {
                a10 = this.f16335c.a(str, 0, 0, i10, false);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (a10 == null) {
                return null;
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
            try {
                for (CampaignEx campaignEx : a10) {
                    if (campaignEx != null && (campaignEx.getReadyState() == 0 || campaignEx.getLoadTimeoutState() == 1)) {
                        long plct = campaignEx.getPlct() * 1000;
                        long timestamp = currentTimeMillis - campaignEx.getTimestamp();
                        if ((plct > 0 && plct >= timestamp) || (plct <= 0 && f10 >= timestamp)) {
                            copyOnWriteArrayList2.add(campaignEx);
                        }
                    }
                }
                return copyOnWriteArrayList2;
            } catch (Exception e2) {
                e = e2;
                copyOnWriteArrayList = copyOnWriteArrayList2;
                e.printStackTrace();
                return copyOnWriteArrayList;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    public final void b(String str, String str2) {
        e eVar = this.f16335c;
        if (eVar != null) {
            eVar.e(str, str2);
        }
    }

    public final void b(String str, int i10) {
        int size;
        try {
            List<com.mbridge.msdk.foundation.entity.c> d10 = this.f16335c.d(str);
            if (d10 == null || d10.size() <= 0 || (size = d10.size() - i10) <= 0) {
                return;
            }
            for (int i11 = 0; i11 < size; i11++) {
                c(str, d10.get(i11).a());
                com.mbridge.msdk.foundation.same.a.b.c(str, d10.get(i11).a());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final List<CampaignEx> a(List<CampaignEx> list) {
        ArrayList arrayList = null;
        if (list == null) {
            return null;
        }
        try {
            com.mbridge.msdk.videocommon.d.a b3 = b.a().b();
            long f10 = b3 != null ? b3.f() : 0L;
            long currentTimeMillis = System.currentTimeMillis();
            if (list.size() <= 0) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                for (CampaignEx campaignEx : list) {
                    if (campaignEx != null) {
                        long plct = campaignEx.getPlct() * 1000;
                        long timestamp = currentTimeMillis - campaignEx.getTimestamp();
                        if ((plct > 0 && plct >= timestamp) || (plct <= 0 && f10 >= timestamp)) {
                            arrayList2.add(campaignEx);
                        }
                    }
                }
                return arrayList2;
            } catch (Exception e2) {
                e = e2;
                arrayList = arrayList2;
                e.printStackTrace();
                return arrayList;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    public final List<com.mbridge.msdk.foundation.entity.c> a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return this.f16335c.d(str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final void a(CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (campaignEx.isBidCampaign()) {
                    com.mbridge.msdk.foundation.same.a.b.c(str, campaignEx.getRequestId());
                }
                this.f16335c.a(campaignEx.getId(), str, campaignEx.isBidCampaign(), campaignEx.getRequestId());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getId())) {
                    return;
                }
                this.f16335c.b(campaignEx.getId(), campaignEx.getRequestId());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void a(String str, String str2, List<CampaignEx> list) {
        try {
            if (TextUtils.isEmpty(str2) || list == null || list.size() <= 0) {
                return;
            }
            this.f16335c.a(list, str, str2, 0);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final synchronized void a(long j3, String str) {
        try {
            this.f16335c.a(j3, str);
        } catch (Exception e2) {
            e2.printStackTrace();
            ad.b(a, e2.getMessage());
        }
    }
}
