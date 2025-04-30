package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f19438a;
    private boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, j> f19439c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private ConcurrentHashMap<String, CopyOnWriteArrayList<Map<String, a>>> f19440d;

    /* renamed from: e, reason: collision with root package name */
    private ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> f19441e;

    /* renamed from: f, reason: collision with root package name */
    private ConcurrentHashMap<String, CopyOnWriteArrayList<a>> f19442f;

    private b() {
    }

    public static b getInstance() {
        if (f19438a == null) {
            synchronized (b.class) {
                try {
                    if (f19438a == null) {
                        f19438a = new b();
                    }
                } finally {
                }
            }
        }
        return f19438a;
    }

    public final a a(String str, String str2) {
        j c9 = c(str);
        if (c9 != null) {
            return c9.a(str2);
        }
        return null;
    }

    public final CopyOnWriteArrayList<a> b(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<a>> concurrentHashMap = this.f19442f;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.f19442f.get(str);
    }

    public final j c(String str) {
        ConcurrentHashMap<String, j> concurrentHashMap = this.f19439c;
        if (concurrentHashMap != null && concurrentHashMap.containsKey(str)) {
            return this.f19439c.get(str);
        }
        return null;
    }

    public j createUnitCache(Context context, String str, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, int i9, com.mbridge.msdk.videocommon.listener.a aVar) {
        j jVar;
        if (TextUtils.isEmpty(str) || copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
            return null;
        }
        if (this.f19439c.containsKey(str)) {
            jVar = this.f19439c.get(str);
            if (jVar == null) {
                jVar = new j(context, copyOnWriteArrayList, str, i9);
                this.f19439c.put(str, jVar);
            }
            if (i9 != 94 && i9 != 287) {
                jVar.a(aVar);
            } else {
                jVar.a(copyOnWriteArrayList.get(0).getRequestId(), aVar);
            }
            jVar.a(copyOnWriteArrayList);
        } else {
            jVar = new j(context, copyOnWriteArrayList, str, i9);
            if (aVar != null) {
                jVar.a(aVar);
            }
            this.f19439c.put(str, jVar);
        }
        return jVar;
    }

    public void load(String str) {
        j c9 = c(str);
        if (c9 != null) {
            c9.a();
        }
    }

    public final CopyOnWriteArrayList<CampaignEx> a(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> concurrentHashMap = this.f19441e;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.f19441e.get(str);
    }

    public final void b(String str, CopyOnWriteArrayList<a> copyOnWriteArrayList) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<a>> concurrentHashMap = this.f19442f;
        if (concurrentHashMap == null) {
            this.f19442f = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap.clear();
        }
        this.f19442f.put(str, copyOnWriteArrayList);
    }

    public final void a(String str, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> concurrentHashMap = this.f19441e;
        if (concurrentHashMap == null) {
            this.f19441e = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap.clear();
        }
        this.f19441e.put(str, copyOnWriteArrayList);
    }

    public final int b(String str, String str2) {
        CopyOnWriteArrayList<Map<String, a>> c9;
        a value;
        CampaignEx l;
        ConcurrentHashMap<String, j> concurrentHashMap = this.f19439c;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, j>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                j value2 = it.next().getValue();
                if (value2 != null && (c9 = value2.c()) != null) {
                    int size = c9.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        Map<String, a> map = c9.get(i9);
                        if (map != null) {
                            Iterator<Map.Entry<String, a>> it2 = map.entrySet().iterator();
                            if (it2.hasNext() && (value = it2.next().getValue()) != null && (l = value.l()) != null) {
                                String videoUrlEncode = l.getVideoUrlEncode();
                                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(videoUrlEncode) && str2.equals(videoUrlEncode)) {
                                    return value.k();
                                }
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    public final boolean a(int i9, String str, boolean z8) {
        try {
            j c9 = c(str);
            if (c9 != null) {
                return c9.a(i9, z8) != null;
            }
            return false;
        } catch (Exception e4) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            e4.printStackTrace();
            return false;
        }
    }

    public j createUnitCache(Context context, String str, CampaignEx campaignEx, int i9, com.mbridge.msdk.videocommon.listener.a aVar) {
        j jVar;
        if (TextUtils.isEmpty(str) || campaignEx == null) {
            return null;
        }
        if (this.f19439c.containsKey(str)) {
            jVar = this.f19439c.get(str);
            if (jVar == null) {
                jVar = new j(context, campaignEx, str, i9);
                this.f19439c.put(str, jVar);
            }
            if (i9 != 94 && i9 != 287) {
                jVar.a(aVar);
            } else {
                jVar.a(campaignEx.getRequestId(), aVar);
            }
            jVar.a(campaignEx);
        } else {
            jVar = new j(context, campaignEx, str, i9);
            if (aVar != null) {
                jVar.a(aVar);
            }
            this.f19439c.put(str, jVar);
        }
        return jVar;
    }

    public final boolean a(int i9, String str, boolean z8, int i10, boolean z9, int i11, List<CampaignEx> list) {
        return a(i9, str, z8, i10, z9, i11, list, false, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x018e, code lost:
    
        if (r4.size() > 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0193, code lost:
    
        r3 = r14.f19440d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0195, code lost:
    
        if (r3 != null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0197, code lost:
    
        r14.f19440d = new java.util.concurrent.ConcurrentHashMap<>();
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01aa, code lost:
    
        r3 = r14.f19442f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01ac, code lost:
    
        if (r3 != null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01ae, code lost:
    
        r14.f19442f = new java.util.concurrent.ConcurrentHashMap<>();
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01c1, code lost:
    
        r3 = r14.f19441e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01c3, code lost:
    
        if (r3 != null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01c5, code lost:
    
        r14.f19441e = new java.util.concurrent.ConcurrentHashMap<>();
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01d8, code lost:
    
        if (r2 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01de, code lost:
    
        if (r2.size() <= 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01e0, code lost:
    
        r3 = new java.util.concurrent.CopyOnWriteArrayList<>();
        r4 = new java.util.concurrent.CopyOnWriteArrayList<>();
        r5 = new java.util.concurrent.CopyOnWriteArrayList<>();
        r2 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01f7, code lost:
    
        if (r2.hasNext() == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01f9, code lost:
    
        r6 = r2.next();
        r7 = new java.util.concurrent.ConcurrentHashMap();
        r8 = r6.l();
        r7.put(r8.getId() + r8.getVideoUrlEncode() + r8.getBidToken(), r6);
        r3.add(r7);
        r4.add(r8);
        r5.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0233, code lost:
    
        r14.f19440d.put(r16, r3);
        r14.f19441e.put(r16, r4);
        r14.f19442f.put(r16, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01d1, code lost:
    
        if (r3.containsKey(r16) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01d3, code lost:
    
        r14.f19441e.remove(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01ba, code lost:
    
        if (r3.containsKey(r16) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01bc, code lost:
    
        r14.f19442f.remove(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01a3, code lost:
    
        if (r3.containsKey(r16) == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x01a5, code lost:
    
        r14.f19440d.remove(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0130, code lost:
    
        if (r5.size() >= r18) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(int r15, java.lang.String r16, boolean r17, int r18, boolean r19, int r20, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r21, boolean r22, com.mbridge.msdk.foundation.same.report.d.d r23) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.b.a(int, java.lang.String, boolean, int, boolean, int, java.util.List, boolean, com.mbridge.msdk.foundation.same.report.d.d):boolean");
    }

    public final void b(boolean z8) {
        if (z8) {
            if (this.b) {
                return;
            }
        } else {
            this.b = false;
        }
        ConcurrentHashMap<String, j> concurrentHashMap = this.f19439c;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, j>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().a();
            }
        }
    }

    public final void a(boolean z8) {
        this.b = z8;
        ConcurrentHashMap<String, j> concurrentHashMap = this.f19439c;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, j>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                j value = it.next().getValue();
                if (value != null) {
                    value.b();
                }
            }
        }
    }

    public final void a() {
        ConcurrentHashMap<String, j> concurrentHashMap = this.f19439c;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, j> entry : concurrentHashMap.entrySet()) {
                j value = entry.getValue();
                String key = entry.getKey();
                try {
                    com.mbridge.msdk.videocommon.d.c a6 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), key);
                    if (a6 != null) {
                        if (a6.w() == 2) {
                            value.b();
                        } else {
                            value.a();
                        }
                    }
                } catch (Exception e4) {
                    ad.b("DownLoadManager", e4.getMessage());
                    try {
                        if (!TextUtils.isEmpty(key)) {
                            k d2 = com.mbridge.msdk.c.h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), key);
                            if (d2 == null) {
                                d2 = k.e(key);
                            }
                            if (d2.k() == 2) {
                                value.b();
                            } else {
                                value.a();
                            }
                        }
                    } catch (Exception e9) {
                        ad.b("DownLoadManager", e9.getMessage());
                    }
                }
            }
        }
    }
}
