package com.bykv.vk.openvk.preload.geckox.d;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.model.ComponentModel;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.mbridge.msdk.foundation.entity.o;
import java.io.File;
import java.io.FileFilter;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class c extends com.bykv.vk.openvk.preload.b.d<Map<String, List<Pair<String, Long>>>, List<UpdatePackage>> {

    /* renamed from: g, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.b f13243g;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, Map<String, Object>> f13244h;

    /* renamed from: i, reason: collision with root package name */
    private Map<String, List<CheckRequestBodyModel.TargetChannel>> f13245i;

    /* renamed from: j, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.e.a f13246j;

    /* renamed from: k, reason: collision with root package name */
    private String f13247k;
    private com.bykv.vk.openvk.preload.geckox.statistic.model.b l = new com.bykv.vk.openvk.preload.geckox.statistic.model.b();

    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends RuntimeException {
        public b(String str, Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: com.bykv.vk.openvk.preload.geckox.d.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0061c extends RuntimeException {
        public C0061c(String str, Throwable th) {
            super(str, th);
        }
    }

    private static void b(List<Pair<String, com.bykv.vk.openvk.preload.geckox.g.a>> list) {
        if (list == null) {
            return;
        }
        Iterator<Pair<String, com.bykv.vk.openvk.preload.geckox.g.a>> it = list.iterator();
        while (it.hasNext()) {
            try {
                ((com.bykv.vk.openvk.preload.geckox.g.a) it.next().second).a();
            } catch (Exception e4) {
                GeckoLogger.e("gecko-debug-tag", "releaseLock:", e4);
            }
        }
    }

    private List<Pair<String, com.bykv.vk.openvk.preload.geckox.g.a>> c(List<UpdatePackage> list) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (UpdatePackage updatePackage : list) {
            try {
                File file = new File(new File(this.f13243g.f13202n, updatePackage.getAccessKey()), updatePackage.getChannel());
                if (file.isFile()) {
                    com.bykv.vk.openvk.preload.geckox.utils.c.a(file);
                }
                if (!file.mkdirs() && !file.isDirectory()) {
                    GeckoLogger.d("gecko-debug-tag", "can not create channel dir：", file.getAbsolutePath());
                    throw new RuntimeException("can not create channel dir:" + file.getAbsolutePath());
                    break;
                }
                com.bykv.vk.openvk.preload.geckox.g.a a6 = com.bykv.vk.openvk.preload.geckox.g.a.a(file.getAbsolutePath() + File.separator + "update.lock");
                if (a6 != null) {
                    arrayList.add(new Pair(updatePackage.getChannel(), a6));
                    arrayList2.add(updatePackage);
                } else {
                    com.bykv.vk.openvk.preload.geckox.e.a aVar = this.f13246j;
                    updatePackage.getChannel();
                }
            } catch (Exception e4) {
                GeckoLogger.e("gecko-debug-tag", "filterChannel:", e4);
                updatePackage.getChannel();
                com.bykv.vk.openvk.preload.geckox.e.a aVar2 = this.f13246j;
            }
        }
        list.clear();
        list.addAll(arrayList2);
        return arrayList;
    }

    @Override // com.bykv.vk.openvk.preload.b.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.f13243g = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
        this.f13244h = (Map) objArr[1];
        this.f13245i = (Map) objArr[2];
        this.f13246j = (com.bykv.vk.openvk.preload.geckox.e.a) objArr[3];
        this.f13247k = (String) objArr[4];
    }

    private String b(Map<String, List<Pair<String, Long>>> map) {
        List<CheckRequestBodyModel.TargetChannel> list;
        CheckRequestBodyModel checkRequestBodyModel = new CheckRequestBodyModel();
        com.bykv.vk.openvk.preload.geckox.b bVar = this.f13243g;
        Context context = bVar.f13192a;
        long longValue = bVar.f13198h.longValue();
        com.bykv.vk.openvk.preload.geckox.b bVar2 = this.f13243g;
        String str = bVar2.f13199i;
        String str2 = bVar2.f13200j;
        String b8 = com.bykv.vk.openvk.preload.geckox.utils.a.b(context);
        String a6 = com.bykv.vk.openvk.preload.geckox.utils.h.a(context);
        com.bykv.vk.openvk.preload.geckox.b bVar3 = this.f13243g;
        checkRequestBodyModel.setCommon(new Common(longValue, str, str2, b8, a6, bVar3.m, bVar3.l));
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<Pair<String, Long>>> entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Pair<String, Long> pair : entry.getValue()) {
                CheckRequestBodyModel.LocalChannel localChannel = new CheckRequestBodyModel.LocalChannel();
                localChannel.localVersion = (Long) pair.second;
                hashMap2.put(pair.first, localChannel);
            }
            hashMap.put(entry.getKey(), hashMap2);
        }
        try {
            com.bykv.vk.openvk.preload.a.f fVar = com.bykv.vk.openvk.preload.geckox.c.b.a().f13232a;
            this.l.f13321a = fVar.a(hashMap);
            checkRequestBodyModel.setLocal(hashMap);
            HashMap hashMap3 = new HashMap();
            for (String str3 : this.f13243g.f13195e) {
                CheckRequestBodyModel.Group group = new CheckRequestBodyModel.Group();
                group.groupName = this.f13247k;
                Map<String, List<CheckRequestBodyModel.TargetChannel>> map2 = this.f13245i;
                if (map2 != null && !map2.isEmpty() && (list = this.f13245i.get(str3)) != null && !list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    group.targetChannels = arrayList;
                    arrayList.addAll(list);
                }
                hashMap3.put(str3, group);
            }
            this.l.b = fVar.a(hashMap3);
            checkRequestBodyModel.setDeployments(hashMap3);
            Map<String, Map<String, Object>> map3 = this.f13244h;
            if (map3 != null) {
                this.l.f13322c = fVar.a(map3);
                checkRequestBodyModel.setCustom(this.f13244h);
            }
            return fVar.a(checkRequestBodyModel);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.b.d
    public Object a(com.bykv.vk.openvk.preload.b.b<List<UpdatePackage>> bVar, Map<String, List<Pair<String, Long>>> map) throws Throwable {
        List<Pair<String, com.bykv.vk.openvk.preload.geckox.g.a>> list;
        GeckoLogger.d("gecko-debug-tag", "start get server channel version[v3]... local channel version:", map);
        Map<String, List<UpdatePackage>> a6 = a(map);
        com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.f13243g, this.l);
        Iterator<Map.Entry<String, List<UpdatePackage>>> it = a6.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<UpdatePackage> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                UpdatePackage next = it2.next();
                long localVersion = next.getLocalVersion();
                long version = next.getVersion();
                if (version < localVersion) {
                    GeckoLogger.d("gecko-debug-tag", next.getChannel(), "rollback：", Long.valueOf(localVersion), "->", Long.valueOf(version));
                    File[] listFiles = new File(this.f13243g.f13202n, next.getAccessKey() + File.separator + next.getChannel()).listFiles(new FileFilter() { // from class: com.bykv.vk.openvk.preload.geckox.d.c.1
                        @Override // java.io.FileFilter
                        public final boolean accept(File file) {
                            return file.isDirectory();
                        }
                    });
                    if (listFiles != null && listFiles.length != 0) {
                        for (File file : listFiles) {
                            try {
                                long parseLong = Long.parseLong(file.getName());
                                if (parseLong > version) {
                                    final File file2 = new File(file.getParent(), file.getName() + "--pending-delete");
                                    file.renameTo(file2);
                                    com.bykv.vk.openvk.preload.geckox.utils.e.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.d.c.2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            com.bykv.vk.openvk.preload.geckox.utils.c.a(file2);
                                        }
                                    });
                                } else if (parseLong == version) {
                                    it2.remove();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, List<UpdatePackage>>> it3 = a6.entrySet().iterator();
        while (it3.hasNext()) {
            arrayList.addAll(it3.next().getValue());
        }
        Object obj = null;
        try {
            list = c(arrayList);
            try {
                obj = bVar.a((com.bykv.vk.openvk.preload.b.b<List<UpdatePackage>>) arrayList);
                b(list);
                GeckoLogger.d("gecko-debug-tag", "all channel update finished");
            } catch (Throwable th) {
                th = th;
                try {
                    GeckoLogger.e("gecko-debug-tag", "filterChannel:", th);
                    a(arrayList);
                    return obj;
                } finally {
                    b(list);
                    GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                }
            }
        } catch (Throwable th2) {
            th = th2;
            list = null;
        }
        a(arrayList);
        return obj;
    }

    private void a(List<UpdatePackage> list) {
        if (list.isEmpty()) {
            return;
        }
        for (UpdatePackage updatePackage : list) {
            com.bykv.vk.openvk.preload.geckox.a.c.a(new File(new File(this.f13243g.f13202n, updatePackage.getAccessKey()), updatePackage.getChannel()).getAbsolutePath());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Map<String, List<UpdatePackage>> a(Map<String, List<Pair<String, Long>>> map) throws Exception {
        Object a6;
        String b8 = b(map);
        String h6 = AbstractC2914a.h(new StringBuilder("https://"), this.f13243g.f13201k, "/gecko/server/v3/package");
        try {
            this.l.f13325f = com.bykv.vk.openvk.preload.geckox.utils.h.a(this.f13243g.f13192a);
            Response doPost = this.f13243g.f13194d.doPost(h6, b8);
            com.bykv.vk.openvk.preload.geckox.statistic.model.b bVar = this.l;
            bVar.f13326g = doPost.code;
            bVar.f13323d = doPost.msg;
            Map<String, String> map2 = doPost.headers;
            String str = "";
            if (map2 != null && !map2.isEmpty()) {
                String str2 = map2.get("x-tt-logid");
                if (TextUtils.isEmpty(str2)) {
                    str2 = map2.get("X-Tt-Logid");
                    if (TextUtils.isEmpty(str2)) {
                        String str3 = map2.get("X-TT-LOGID");
                        if (!TextUtils.isEmpty(str3)) {
                            str = str3;
                        }
                    }
                }
                str = str2;
            }
            bVar.f13324e = str;
            if (doPost.code == 200) {
                String str4 = doPost.body;
                GeckoLogger.d("gecko-debug-tag", "response:", str4);
                try {
                    Type type = new com.bykv.vk.openvk.preload.a.c.a<com.bykv.vk.openvk.preload.geckox.model.Response<ComponentModel>>() { // from class: com.bykv.vk.openvk.preload.geckox.d.c.3
                    }.f13052c;
                    com.bykv.vk.openvk.preload.a.f fVar = com.bykv.vk.openvk.preload.geckox.c.b.a().f13232a;
                    if (str4 == null) {
                        a6 = null;
                    } else {
                        com.bykv.vk.openvk.preload.a.d.a aVar = new com.bykv.vk.openvk.preload.a.d.a(new StringReader(str4));
                        aVar.f13060a = fVar.f13101j;
                        a6 = fVar.a(aVar, type);
                        com.bykv.vk.openvk.preload.a.f.a(a6, aVar);
                    }
                    com.bykv.vk.openvk.preload.geckox.model.Response response = (com.bykv.vk.openvk.preload.geckox.model.Response) a6;
                    int i9 = response.status;
                    if (i9 != 0) {
                        if (i9 == 2000) {
                            com.bykv.vk.openvk.preload.geckox.a.a.a(this.f13243g);
                            return new HashMap();
                        }
                        String str5 = "check update error，unknow status code，response.status：" + response.status;
                        com.bykv.vk.openvk.preload.geckox.statistic.model.b bVar2 = this.l;
                        bVar2.f13323d = str5;
                        com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.f13243g, bVar2);
                        throw new a(str5);
                    }
                    T t9 = response.data;
                    if (t9 != 0) {
                        com.bykv.vk.openvk.preload.geckox.a.a.a(this.f13243g.f13192a, ((ComponentModel) t9).getUniversalStrategies(), this.f13243g.f13202n, this.f13246j);
                        Map<String, List<UpdatePackage>> packages = ((ComponentModel) response.data).getPackages();
                        if (packages != null && !packages.isEmpty()) {
                            for (String str6 : this.f13243g.f13195e) {
                                List<UpdatePackage> list = packages.get(str6);
                                if (list != null && !list.isEmpty()) {
                                    for (UpdatePackage updatePackage : list) {
                                        updatePackage.setAccessKey(str6);
                                        updatePackage.setLocalVersion(a(map.get(str6), updatePackage.getChannel()));
                                    }
                                }
                            }
                            return packages;
                        }
                        com.bykv.vk.openvk.preload.geckox.a.a.a(this.f13243g);
                        return new HashMap();
                    }
                    com.bykv.vk.openvk.preload.geckox.statistic.model.b bVar3 = this.l;
                    bVar3.f13323d = "check update error：response.data==null";
                    com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.f13243g, bVar3);
                    throw new a("check update error：response.data==null");
                } catch (Throwable th) {
                    this.l.f13323d = "json parse failed：" + th.getMessage();
                    com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.f13243g, this.l);
                    StringBuilder n2 = o.n("json parse failed：", str4, " caused by:");
                    n2.append(th.getMessage());
                    throw new b(n2.toString(), th);
                }
            }
            throw new NetworkErrorException("net work get failed, code: " + doPost.code + ", url:" + h6);
        } catch (Exception e4) {
            com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.f13243g, this.l);
            StringBuilder n9 = o.n("request failed：url:", h6, ", caused by:");
            n9.append(e4.getMessage());
            throw new C0061c(n9.toString(), e4);
        }
    }

    private static long a(List<Pair<String, Long>> list, String str) {
        for (Pair<String, Long> pair : list) {
            if (((String) pair.first).equals(str)) {
                return ((Long) pair.second).longValue();
            }
        }
        return 0L;
    }
}
