package com.bykv.vk.openvk.preload.geckox.d;

import a4.j;
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

/* loaded from: classes.dex */
public class c extends com.bykv.vk.openvk.preload.b.d<Map<String, List<Pair<String, Long>>>, List<UpdatePackage>> {

    /* renamed from: g, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.b f10070g;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, Map<String, Object>> f10071h;

    /* renamed from: i, reason: collision with root package name */
    private Map<String, List<CheckRequestBodyModel.TargetChannel>> f10072i;

    /* renamed from: j, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.e.a f10073j;

    /* renamed from: k, reason: collision with root package name */
    private String f10074k;

    /* renamed from: l, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.statistic.model.b f10075l = new com.bykv.vk.openvk.preload.geckox.statistic.model.b();

    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends RuntimeException {
        public b(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* renamed from: com.bykv.vk.openvk.preload.geckox.d.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0053c extends RuntimeException {
        public C0053c(String str, Throwable th2) {
            super(str, th2);
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
            } catch (Exception e2) {
                GeckoLogger.e("gecko-debug-tag", "releaseLock:", e2);
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
                File file = new File(new File(this.f10070g.f10029n, updatePackage.getAccessKey()), updatePackage.getChannel());
                if (file.isFile()) {
                    com.bykv.vk.openvk.preload.geckox.utils.c.a(file);
                }
                if (!file.mkdirs() && !file.isDirectory()) {
                    GeckoLogger.d("gecko-debug-tag", "can not create channel dir：", file.getAbsolutePath());
                    throw new RuntimeException("can not create channel dir:" + file.getAbsolutePath());
                    break;
                }
                com.bykv.vk.openvk.preload.geckox.g.a a10 = com.bykv.vk.openvk.preload.geckox.g.a.a(file.getAbsolutePath() + File.separator + "update.lock");
                if (a10 != null) {
                    arrayList.add(new Pair(updatePackage.getChannel(), a10));
                    arrayList2.add(updatePackage);
                } else {
                    com.bykv.vk.openvk.preload.geckox.e.a aVar = this.f10073j;
                    updatePackage.getChannel();
                }
            } catch (Exception e2) {
                GeckoLogger.e("gecko-debug-tag", "filterChannel:", e2);
                updatePackage.getChannel();
                com.bykv.vk.openvk.preload.geckox.e.a aVar2 = this.f10073j;
            }
        }
        list.clear();
        list.addAll(arrayList2);
        return arrayList;
    }

    @Override // com.bykv.vk.openvk.preload.b.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.f10070g = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
        this.f10071h = (Map) objArr[1];
        this.f10072i = (Map) objArr[2];
        this.f10073j = (com.bykv.vk.openvk.preload.geckox.e.a) objArr[3];
        this.f10074k = (String) objArr[4];
    }

    private String b(Map<String, List<Pair<String, Long>>> map) {
        List<CheckRequestBodyModel.TargetChannel> list;
        CheckRequestBodyModel checkRequestBodyModel = new CheckRequestBodyModel();
        com.bykv.vk.openvk.preload.geckox.b bVar = this.f10070g;
        Context context = bVar.a;
        long longValue = bVar.f10023h.longValue();
        com.bykv.vk.openvk.preload.geckox.b bVar2 = this.f10070g;
        String str = bVar2.f10024i;
        String str2 = bVar2.f10025j;
        String b3 = com.bykv.vk.openvk.preload.geckox.utils.a.b(context);
        String a10 = com.bykv.vk.openvk.preload.geckox.utils.h.a(context);
        com.bykv.vk.openvk.preload.geckox.b bVar3 = this.f10070g;
        checkRequestBodyModel.setCommon(new Common(longValue, str, str2, b3, a10, bVar3.f10028m, bVar3.f10027l));
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
            com.bykv.vk.openvk.preload.a.f fVar = com.bykv.vk.openvk.preload.geckox.c.b.a().a;
            this.f10075l.a = fVar.a(hashMap);
            checkRequestBodyModel.setLocal(hashMap);
            HashMap hashMap3 = new HashMap();
            for (String str3 : this.f10070g.f10020e) {
                CheckRequestBodyModel.Group group = new CheckRequestBodyModel.Group();
                group.groupName = this.f10074k;
                Map<String, List<CheckRequestBodyModel.TargetChannel>> map2 = this.f10072i;
                if (map2 != null && !map2.isEmpty() && (list = this.f10072i.get(str3)) != null && !list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    group.targetChannels = arrayList;
                    arrayList.addAll(list);
                }
                hashMap3.put(str3, group);
            }
            this.f10075l.f10136b = fVar.a(hashMap3);
            checkRequestBodyModel.setDeployments(hashMap3);
            Map<String, Map<String, Object>> map3 = this.f10071h;
            if (map3 != null) {
                this.f10075l.f10137c = fVar.a(map3);
                checkRequestBodyModel.setCustom(this.f10071h);
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
        char c10 = 2;
        int i10 = 0;
        char c11 = 1;
        GeckoLogger.d("gecko-debug-tag", "start get server channel version[v3]... local channel version:", map);
        Map<String, List<UpdatePackage>> a10 = a(map);
        com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.f10070g, this.f10075l);
        Iterator<Map.Entry<String, List<UpdatePackage>>> it = a10.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<UpdatePackage> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                UpdatePackage next = it2.next();
                long localVersion = next.getLocalVersion();
                long version = next.getVersion();
                if (version < localVersion) {
                    Object[] objArr = new Object[5];
                    objArr[i10] = next.getChannel();
                    objArr[c11] = "rollback：";
                    objArr[c10] = Long.valueOf(localVersion);
                    objArr[3] = "->";
                    objArr[4] = Long.valueOf(version);
                    GeckoLogger.d("gecko-debug-tag", objArr);
                    File[] listFiles = new File(this.f10070g.f10029n, next.getAccessKey() + File.separator + next.getChannel()).listFiles(new FileFilter() { // from class: com.bykv.vk.openvk.preload.geckox.d.c.1
                        @Override // java.io.FileFilter
                        public final boolean accept(File file) {
                            return file.isDirectory();
                        }
                    });
                    if (listFiles == null || listFiles.length == 0) {
                        c10 = 2;
                        c11 = 1;
                        i10 = 0;
                    } else {
                        int length = listFiles.length;
                        int i11 = i10;
                        while (i11 < length) {
                            File file = listFiles[i11];
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
                            i11++;
                            c10 = 2;
                            c11 = 1;
                            i10 = 0;
                        }
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, List<UpdatePackage>>> it3 = a10.entrySet().iterator();
        while (it3.hasNext()) {
            arrayList.addAll(it3.next().getValue());
        }
        Object obj = null;
        try {
            list = c(arrayList);
        } catch (Throwable th2) {
            th = th2;
            list = null;
        }
        try {
            obj = bVar.a((com.bykv.vk.openvk.preload.b.b<List<UpdatePackage>>) arrayList);
            b(list);
            GeckoLogger.d("gecko-debug-tag", "all channel update finished");
        } catch (Throwable th3) {
            th = th3;
            try {
                GeckoLogger.e("gecko-debug-tag", "filterChannel:", th);
                b(list);
                GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                a(arrayList);
                return obj;
            } catch (Throwable th4) {
                b(list);
                GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                throw th4;
            }
        }
        a(arrayList);
        return obj;
    }

    private void a(List<UpdatePackage> list) {
        if (list.isEmpty()) {
            return;
        }
        for (UpdatePackage updatePackage : list) {
            com.bykv.vk.openvk.preload.geckox.a.c.a(new File(new File(this.f10070g.f10029n, updatePackage.getAccessKey()), updatePackage.getChannel()).getAbsolutePath());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Map<String, List<UpdatePackage>> a(Map<String, List<Pair<String, Long>>> map) throws Exception {
        Object a10;
        String b3 = b(map);
        String h10 = vd.e.h(new StringBuilder("https://"), this.f10070g.f10026k, "/gecko/server/v3/package");
        try {
            this.f10075l.f10140f = com.bykv.vk.openvk.preload.geckox.utils.h.a(this.f10070g.a);
            Response doPost = this.f10070g.f10019d.doPost(h10, b3);
            com.bykv.vk.openvk.preload.geckox.statistic.model.b bVar = this.f10075l;
            bVar.f10141g = doPost.code;
            bVar.f10138d = doPost.msg;
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
            bVar.f10139e = str;
            if (doPost.code == 200) {
                String str4 = doPost.body;
                GeckoLogger.d("gecko-debug-tag", "response:", str4);
                try {
                    Type type = new com.bykv.vk.openvk.preload.a.c.a<com.bykv.vk.openvk.preload.geckox.model.Response<ComponentModel>>() { // from class: com.bykv.vk.openvk.preload.geckox.d.c.3
                    }.f9889c;
                    com.bykv.vk.openvk.preload.a.f fVar = com.bykv.vk.openvk.preload.geckox.c.b.a().a;
                    if (str4 == null) {
                        a10 = null;
                    } else {
                        com.bykv.vk.openvk.preload.a.d.a aVar = new com.bykv.vk.openvk.preload.a.d.a(new StringReader(str4));
                        aVar.a = fVar.f9940j;
                        a10 = fVar.a(aVar, type);
                        com.bykv.vk.openvk.preload.a.f.a(a10, aVar);
                    }
                    com.bykv.vk.openvk.preload.geckox.model.Response response = (com.bykv.vk.openvk.preload.geckox.model.Response) a10;
                    int i10 = response.status;
                    if (i10 != 0) {
                        if (i10 == 2000) {
                            com.bykv.vk.openvk.preload.geckox.a.a.a(this.f10070g);
                            return new HashMap();
                        }
                        String str5 = "check update error，unknow status code，response.status：" + response.status;
                        com.bykv.vk.openvk.preload.geckox.statistic.model.b bVar2 = this.f10075l;
                        bVar2.f10138d = str5;
                        com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.f10070g, bVar2);
                        throw new a(str5);
                    }
                    T t5 = response.data;
                    if (t5 != 0) {
                        com.bykv.vk.openvk.preload.geckox.a.a.a(this.f10070g.a, ((ComponentModel) t5).getUniversalStrategies(), this.f10070g.f10029n, this.f10073j);
                        Map<String, List<UpdatePackage>> packages = ((ComponentModel) response.data).getPackages();
                        if (packages != null && !packages.isEmpty()) {
                            for (String str6 : this.f10070g.f10020e) {
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
                        com.bykv.vk.openvk.preload.geckox.a.a.a(this.f10070g);
                        return new HashMap();
                    }
                    com.bykv.vk.openvk.preload.geckox.statistic.model.b bVar3 = this.f10075l;
                    bVar3.f10138d = "check update error：response.data==null";
                    com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.f10070g, bVar3);
                    throw new a("check update error：response.data==null");
                } catch (Throwable th2) {
                    this.f10075l.f10138d = "json parse failed：" + th2.getMessage();
                    com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.f10070g, this.f10075l);
                    StringBuilder o10 = j.o("json parse failed：", str4, " caused by:");
                    o10.append(th2.getMessage());
                    throw new b(o10.toString(), th2);
                }
            }
            throw new NetworkErrorException("net work get failed, code: " + doPost.code + ", url:" + h10);
        } catch (Exception e2) {
            com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.f10070g, this.f10075l);
            StringBuilder o11 = j.o("request failed：url:", h10, ", caused by:");
            o11.append(e2.getMessage());
            throw new C0053c(o11.toString(), e2);
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
