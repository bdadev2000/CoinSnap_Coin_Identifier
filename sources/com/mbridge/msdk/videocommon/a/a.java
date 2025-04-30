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

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19322a = "com.mbridge.msdk.videocommon.a.a";
    private static a b;

    /* renamed from: c, reason: collision with root package name */
    private e f19323c;

    private a() {
        try {
            Context c9 = c.m().c();
            if (c9 != null) {
                this.f19323c = e.a(g.a(c9));
            } else {
                ad.b(f19322a, "RewardCampaignCache get Context is null");
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public static a a() {
        if (b == null) {
            synchronized (a.class) {
                try {
                    if (b == null) {
                        b = new a();
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final int b(String str, int i9, boolean z8, String str2) {
        List<CampaignEx> a6;
        try {
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            ArrayList arrayList = new ArrayList();
            if (z8) {
                a6 = this.f19323c.a(str, 0, 0, i9, str2);
            } else {
                a6 = this.f19323c.a(str, 0, 0, i9, false);
            }
            if (a6 == null) {
                return 0;
            }
            for (CampaignEx campaignEx : a6) {
                if (campaignEx != null && campaignEx.getReadyState() == 0) {
                    arrayList.add(campaignEx);
                }
            }
            return arrayList.size();
        } catch (Exception e4) {
            e4.printStackTrace();
            return 0;
        }
    }

    public final List<CampaignEx> c(String str, int i9, boolean z8, String str2) {
        long aa;
        List<CampaignEx> a6;
        ArrayList arrayList = null;
        try {
            com.mbridge.msdk.c.g b8 = h.a().b(c.m().k());
            if (b8 != null) {
                aa = b8.aa();
            } else {
                h.a();
                aa = i.a().aa();
            }
            long j7 = aa * 1000;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (z8) {
                a6 = this.f19323c.a(str, 0, 0, i9, str2);
            } else {
                a6 = this.f19323c.a(str, 0, 0, i9, false);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (a6 == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                for (CampaignEx campaignEx : a6) {
                    if (campaignEx != null && campaignEx.getReadyState() == 0) {
                        long plctb = campaignEx.getPlctb() * 1000;
                        long timestamp = currentTimeMillis - campaignEx.getTimestamp();
                        if ((plctb <= 0 && j7 >= timestamp) || (plctb > 0 && plctb >= timestamp)) {
                            arrayList2.add(campaignEx);
                        }
                    }
                }
                return arrayList2;
            } catch (Exception e4) {
                e = e4;
                arrayList = arrayList2;
                e.printStackTrace();
                return arrayList;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    public final CopyOnWriteArrayList<CampaignEx> a(String str, int i9) {
        List<CampaignEx> a6;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = null;
        try {
            if (TextUtils.isEmpty(str) || (a6 = this.f19323c.a(str, 0, 0, i9)) == null) {
                return null;
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
            try {
                for (CampaignEx campaignEx : a6) {
                    if (campaignEx != null) {
                        copyOnWriteArrayList2.add(campaignEx);
                    }
                }
                return copyOnWriteArrayList2;
            } catch (Exception e4) {
                e = e4;
                copyOnWriteArrayList = copyOnWriteArrayList2;
                e.printStackTrace();
                return copyOnWriteArrayList;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    public final List<CampaignEx> b(String str, int i9, boolean z8) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return this.f19323c.a(str, 0, 0, i9, z8);
        } catch (Exception e4) {
            ad.b(f19322a, e4.getLocalizedMessage());
            return null;
        }
    }

    public final void a(String str, List<CampaignEx> list, String str2, int i9) {
        e eVar;
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0 || TextUtils.isEmpty(str2) || (eVar = this.f19323c) == null) {
            return;
        }
        eVar.a(str, list, str2, i9);
    }

    public final void b(String str) {
        ConcurrentHashMap<String, com.mbridge.msdk.foundation.entity.c> f9;
        try {
            if (TextUtils.isEmpty(str) || (f9 = this.f19323c.f(str)) == null || f9.size() <= 0) {
                return;
            }
            com.mbridge.msdk.c.g b8 = h.a().b(c.m().k());
            if (b8 == null) {
                h.a();
                b8 = i.a();
            }
            long aa = b8 != null ? b8.aa() : 0L;
            long currentTimeMillis = System.currentTimeMillis();
            for (com.mbridge.msdk.foundation.entity.c cVar : f9.values()) {
                if (cVar != null) {
                    long e4 = cVar.e();
                    if (e4 <= 0) {
                        e4 = aa;
                    }
                    if ((e4 * 1000) + cVar.f() < currentTimeMillis && !TextUtils.isEmpty(cVar.a())) {
                        ad.b("HBOPTIMIZE", "不在有效期范围内 删除" + cVar.a());
                        c(str, cVar.a());
                    }
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final void a(String str, List<CampaignEx> list) {
        e eVar;
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0 || (eVar = this.f19323c) == null) {
            return;
        }
        eVar.b(str, list);
    }

    public final void a(String str, List<CampaignEx> list, String str2) {
        e eVar;
        try {
            if (TextUtils.isEmpty(str) || list == null || list.size() <= 0 || (eVar = this.f19323c) == null) {
                return;
            }
            eVar.a(str, list, str2);
        } catch (Exception e4) {
            ad.b(f19322a, e4.getMessage());
        }
    }

    public final synchronized void c(String str, String str2) {
        try {
            this.f19323c.c(str2, str);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public final void a(String str, String str2) {
        if (this.f19323c == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f19323c.f(str, str2);
    }

    public final synchronized void c(String str, int i9) {
        int j7;
        try {
            try {
                com.mbridge.msdk.c.g b8 = h.a().b(c.m().k());
                if (b8 == null) {
                    h.a();
                    b8 = i.a();
                }
                j7 = b8.j();
            } catch (Exception e4) {
                ad.b(f19322a, e4.getMessage());
            }
            if (j7 == 0) {
                return;
            }
            List<CampaignEx> b9 = this.f19323c.b(str, i9, j7 == 2);
            if (b9 != null && b9.size() > 0) {
                for (CampaignEx campaignEx : b9) {
                    String requestIdNotice = campaignEx.getRequestIdNotice();
                    String id = campaignEx.getId();
                    com.mbridge.msdk.videocommon.a.b(campaignEx.getCampaignUnitId() + "_" + id + "_" + requestIdNotice + "_" + campaignEx.getCMPTEntryUrl());
                }
            }
            this.f19323c.a(str, i9, j7 == 2);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final List<CampaignEx> a(String str, int i9, boolean z8) {
        return a(str, i9, z8, "");
    }

    public final CopyOnWriteArrayList<CampaignEx> a(String str, int i9, boolean z8, String str2) {
        List<CampaignEx> a6;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = null;
        try {
            com.mbridge.msdk.videocommon.d.a b8 = b.a().b();
            long f9 = b8 != null ? b8.f() : 0L;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (z8) {
                a6 = this.f19323c.a(str, 0, 0, i9, str2);
            } else {
                a6 = this.f19323c.a(str, 0, 0, i9, false);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (a6 == null) {
                return null;
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
            try {
                for (CampaignEx campaignEx : a6) {
                    if (campaignEx != null) {
                        if (campaignEx.getReadyState() != 0 && campaignEx.getLoadTimeoutState() != 1) {
                        }
                        long plct = campaignEx.getPlct() * 1000;
                        long timestamp = currentTimeMillis - campaignEx.getTimestamp();
                        if ((plct > 0 && plct >= timestamp) || (plct <= 0 && f9 >= timestamp)) {
                            copyOnWriteArrayList2.add(campaignEx);
                        }
                    }
                }
                return copyOnWriteArrayList2;
            } catch (Exception e4) {
                e = e4;
                copyOnWriteArrayList = copyOnWriteArrayList2;
                e.printStackTrace();
                return copyOnWriteArrayList;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    public final void b(String str, String str2) {
        e eVar = this.f19323c;
        if (eVar != null) {
            eVar.e(str, str2);
        }
    }

    public final void b(String str, int i9) {
        int size;
        try {
            List<com.mbridge.msdk.foundation.entity.c> d2 = this.f19323c.d(str);
            if (d2 == null || d2.size() <= 0 || (size = d2.size() - i9) <= 0) {
                return;
            }
            for (int i10 = 0; i10 < size; i10++) {
                c(str, d2.get(i10).a());
                com.mbridge.msdk.foundation.same.a.b.c(str, d2.get(i10).a());
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public final List<CampaignEx> a(List<CampaignEx> list) {
        ArrayList arrayList = null;
        if (list == null) {
            return null;
        }
        try {
            com.mbridge.msdk.videocommon.d.a b8 = b.a().b();
            long f9 = b8 != null ? b8.f() : 0L;
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
                        if ((plct > 0 && plct >= timestamp) || (plct <= 0 && f9 >= timestamp)) {
                            arrayList2.add(campaignEx);
                        }
                    }
                }
                return arrayList2;
            } catch (Exception e4) {
                e = e4;
                arrayList = arrayList2;
                e.printStackTrace();
                return arrayList;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    public final List<com.mbridge.msdk.foundation.entity.c> a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return this.f19323c.d(str);
        } catch (Exception e4) {
            e4.printStackTrace();
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
                this.f19323c.a(campaignEx.getId(), str, campaignEx.isBidCampaign(), campaignEx.getRequestId());
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    public final void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getId())) {
                    return;
                }
                this.f19323c.b(campaignEx.getId(), campaignEx.getRequestId());
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    public final void a(String str, String str2, List<CampaignEx> list) {
        try {
            if (TextUtils.isEmpty(str2) || list == null || list.size() <= 0) {
                return;
            }
            this.f19323c.a(list, str, str2, 0);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public final synchronized void a(long j7, String str) {
        try {
            this.f19323c.a(j7, str);
        } catch (Exception e4) {
            e4.printStackTrace();
            ad.b(f19322a, e4.getMessage());
        }
    }
}
