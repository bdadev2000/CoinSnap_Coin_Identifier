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

/* loaded from: classes4.dex */
public class b {
    private static volatile b a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16409b = false;

    /* renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, j> f16410c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private ConcurrentHashMap<String, CopyOnWriteArrayList<Map<String, a>>> f16411d;

    /* renamed from: e, reason: collision with root package name */
    private ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> f16412e;

    /* renamed from: f, reason: collision with root package name */
    private ConcurrentHashMap<String, CopyOnWriteArrayList<a>> f16413f;

    private b() {
    }

    public static b getInstance() {
        if (a == null) {
            synchronized (b.class) {
                if (a == null) {
                    a = new b();
                }
            }
        }
        return a;
    }

    public final a a(String str, String str2) {
        j c10 = c(str);
        if (c10 != null) {
            return c10.a(str2);
        }
        return null;
    }

    public final CopyOnWriteArrayList<a> b(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<a>> concurrentHashMap = this.f16413f;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.f16413f.get(str);
    }

    public final j c(String str) {
        ConcurrentHashMap<String, j> concurrentHashMap = this.f16410c;
        if (concurrentHashMap != null && concurrentHashMap.containsKey(str)) {
            return this.f16410c.get(str);
        }
        return null;
    }

    public j createUnitCache(Context context, String str, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, int i10, com.mbridge.msdk.videocommon.listener.a aVar) {
        j jVar;
        if (TextUtils.isEmpty(str) || copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
            return null;
        }
        if (this.f16410c.containsKey(str)) {
            jVar = this.f16410c.get(str);
            if (jVar == null) {
                jVar = new j(context, copyOnWriteArrayList, str, i10);
                this.f16410c.put(str, jVar);
            }
            if (i10 != 94 && i10 != 287) {
                jVar.a(aVar);
            } else {
                jVar.a(copyOnWriteArrayList.get(0).getRequestId(), aVar);
            }
            jVar.a(copyOnWriteArrayList);
        } else {
            jVar = new j(context, copyOnWriteArrayList, str, i10);
            if (aVar != null) {
                jVar.a(aVar);
            }
            this.f16410c.put(str, jVar);
        }
        return jVar;
    }

    public void load(String str) {
        j c10 = c(str);
        if (c10 != null) {
            c10.a();
        }
    }

    public final CopyOnWriteArrayList<CampaignEx> a(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> concurrentHashMap = this.f16412e;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.f16412e.get(str);
    }

    public final void b(String str, CopyOnWriteArrayList<a> copyOnWriteArrayList) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<a>> concurrentHashMap = this.f16413f;
        if (concurrentHashMap == null) {
            this.f16413f = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap.clear();
        }
        this.f16413f.put(str, copyOnWriteArrayList);
    }

    public final void a(String str, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> concurrentHashMap = this.f16412e;
        if (concurrentHashMap == null) {
            this.f16412e = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap.clear();
        }
        this.f16412e.put(str, copyOnWriteArrayList);
    }

    public final int b(String str, String str2) {
        CopyOnWriteArrayList<Map<String, a>> c10;
        a value;
        CampaignEx l10;
        ConcurrentHashMap<String, j> concurrentHashMap = this.f16410c;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, j>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                j value2 = it.next().getValue();
                if (value2 != null && (c10 = value2.c()) != null) {
                    int size = c10.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        Map<String, a> map = c10.get(i10);
                        if (map != null) {
                            Iterator<Map.Entry<String, a>> it2 = map.entrySet().iterator();
                            if (it2.hasNext() && (value = it2.next().getValue()) != null && (l10 = value.l()) != null) {
                                String videoUrlEncode = l10.getVideoUrlEncode();
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

    public final boolean a(int i10, String str, boolean z10) {
        try {
            j c10 = c(str);
            if (c10 != null) {
                return c10.a(i10, z10) != null;
            }
            return false;
        } catch (Exception e2) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            e2.printStackTrace();
            return false;
        }
    }

    public j createUnitCache(Context context, String str, CampaignEx campaignEx, int i10, com.mbridge.msdk.videocommon.listener.a aVar) {
        j jVar;
        if (TextUtils.isEmpty(str) || campaignEx == null) {
            return null;
        }
        if (this.f16410c.containsKey(str)) {
            jVar = this.f16410c.get(str);
            if (jVar == null) {
                jVar = new j(context, campaignEx, str, i10);
                this.f16410c.put(str, jVar);
            }
            if (i10 != 94 && i10 != 287) {
                jVar.a(aVar);
            } else {
                jVar.a(campaignEx.getRequestId(), aVar);
            }
            jVar.a(campaignEx);
        } else {
            jVar = new j(context, campaignEx, str, i10);
            if (aVar != null) {
                jVar.a(aVar);
            }
            this.f16410c.put(str, jVar);
        }
        return jVar;
    }

    public final boolean a(int i10, String str, boolean z10, int i11, boolean z11, int i12, List<CampaignEx> list) {
        return a(i10, str, z10, i11, z11, i12, list, false, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x018b, code lost:
    
        if (r4.size() > 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0190, code lost:
    
        r3 = r14.f16411d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0192, code lost:
    
        if (r3 != null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0194, code lost:
    
        r14.f16411d = new java.util.concurrent.ConcurrentHashMap<>();
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01a7, code lost:
    
        r3 = r14.f16413f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01a9, code lost:
    
        if (r3 != null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01ab, code lost:
    
        r14.f16413f = new java.util.concurrent.ConcurrentHashMap<>();
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01be, code lost:
    
        r3 = r14.f16412e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01c0, code lost:
    
        if (r3 != null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01c2, code lost:
    
        r14.f16412e = new java.util.concurrent.ConcurrentHashMap<>();
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01d5, code lost:
    
        if (r2 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01db, code lost:
    
        if (r2.size() <= 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01dd, code lost:
    
        r3 = new java.util.concurrent.CopyOnWriteArrayList<>();
        r4 = new java.util.concurrent.CopyOnWriteArrayList<>();
        r5 = new java.util.concurrent.CopyOnWriteArrayList<>();
        r2 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01f4, code lost:
    
        if (r2.hasNext() == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01f6, code lost:
    
        r6 = r2.next();
        r7 = new java.util.concurrent.ConcurrentHashMap();
        r8 = r6.l();
        r7.put(r8.getId() + r8.getVideoUrlEncode() + r8.getBidToken(), r6);
        r3.add(r7);
        r4.add(r8);
        r5.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0230, code lost:
    
        r14.f16411d.put(r16, r3);
        r14.f16412e.put(r16, r4);
        r14.f16413f.put(r16, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01ce, code lost:
    
        if (r3.containsKey(r16) == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01d0, code lost:
    
        r14.f16412e.remove(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01b7, code lost:
    
        if (r3.containsKey(r16) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01b9, code lost:
    
        r14.f16413f.remove(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01a0, code lost:
    
        if (r3.containsKey(r16) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x01a2, code lost:
    
        r14.f16411d.remove(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0129, code lost:
    
        if (r5.size() >= r18) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(int r15, java.lang.String r16, boolean r17, int r18, boolean r19, int r20, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r21, boolean r22, com.mbridge.msdk.foundation.same.report.d.d r23) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.b.a(int, java.lang.String, boolean, int, boolean, int, java.util.List, boolean, com.mbridge.msdk.foundation.same.report.d.d):boolean");
    }

    public final void b(boolean z10) {
        if (z10) {
            if (this.f16409b) {
                return;
            }
        } else {
            this.f16409b = false;
        }
        ConcurrentHashMap<String, j> concurrentHashMap = this.f16410c;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, j>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().a();
            }
        }
    }

    public final void a(boolean z10) {
        this.f16409b = z10;
        ConcurrentHashMap<String, j> concurrentHashMap = this.f16410c;
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
        ConcurrentHashMap<String, j> concurrentHashMap = this.f16410c;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, j> entry : concurrentHashMap.entrySet()) {
                j value = entry.getValue();
                String key = entry.getKey();
                try {
                    com.mbridge.msdk.videocommon.d.c a10 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), key);
                    if (a10 != null) {
                        if (a10.w() == 2) {
                            value.b();
                        } else {
                            value.a();
                        }
                    }
                } catch (Exception e2) {
                    ad.b("DownLoadManager", e2.getMessage());
                    try {
                        if (!TextUtils.isEmpty(key)) {
                            k d10 = com.mbridge.msdk.c.h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), key);
                            if (d10 == null) {
                                d10 = k.e(key);
                            }
                            if (d10.k() == 2) {
                                value.b();
                            } else {
                                value.a();
                            }
                        }
                    } catch (Exception e10) {
                        ad.b("DownLoadManager", e10.getMessage());
                    }
                }
            }
        }
    }
}
