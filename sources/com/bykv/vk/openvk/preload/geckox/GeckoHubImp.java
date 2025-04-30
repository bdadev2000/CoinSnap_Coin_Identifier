package com.bykv.vk.openvk.preload.geckox;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.a.a.a;
import com.bykv.vk.openvk.preload.geckox.b;
import com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import com.bykv.vk.openvk.preload.geckox.utils.f;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class GeckoHubImp {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static GeckoHubImp f13163a = new GeckoHubImp();
    }

    public static GeckoHubImp inst(Context context) {
        c.a(context);
        return a.f13163a;
    }

    public static void setRandomHost(String str) {
        c.a(str);
    }

    public static void setThreadPoolExecutorCallback(IThreadPoolCallback iThreadPoolCallback) {
        b.a(iThreadPoolCallback);
    }

    public WebResourceResponse findRes(ILoader iLoader, String str, String str2) {
        return c.a().a(iLoader, str, str2).getWebResourceResponse();
    }

    public WebResourceResponseModel findResAndMsg(ILoader iLoader, String str, String str2) {
        return c.a().a(iLoader, str, str2);
    }

    public com.bykv.vk.openvk.preload.falconx.loader.a getGeckoResLoader() {
        c.a();
        return c.b();
    }

    public int getResCount(ILoader iLoader, String str) {
        c.a();
        return c.a(iLoader, str);
    }

    public void preload(String str, IStatisticMonitor iStatisticMonitor, Set<String> set, INetWork iNetWork) {
        c a6 = c.a();
        if (!TextUtils.isEmpty(str)) {
            b.a aVar = new b.a(c.b);
            aVar.b = Arrays.asList("cca47107bfcbdb211d88f3385aeede40");
            aVar.f13206c = Arrays.asList("cca47107bfcbdb211d88f3385aeede40");
            aVar.f13212i = 38L;
            aVar.f13214k = str;
            aVar.f13213j = "9999999.0.0";
            a.C0060a c0060a = new a.C0060a();
            c0060a.f13180a = 20;
            com.bykv.vk.openvk.preload.geckox.a.a.b bVar = com.bykv.vk.openvk.preload.geckox.a.a.b.f13183c;
            if (bVar == null) {
                bVar = com.bykv.vk.openvk.preload.geckox.a.a.b.f13182a;
            }
            c0060a.b = bVar;
            aVar.f13211h = new com.bykv.vk.openvk.preload.geckox.a.a.a(c0060a, (byte) 0);
            aVar.m = c.f13224a;
            aVar.f13210g = false;
            aVar.l = c.f13225c;
            aVar.f13209f = iStatisticMonitor;
            aVar.f13205a = iNetWork;
            b bVar2 = new b(aVar, (byte) 0);
            a6.f13227d = iNetWork;
            List<String> list = bVar2.f13195e;
            if (list != null && !list.isEmpty()) {
                Context context = bVar2.f13192a;
                if (context != null) {
                    f.f13333a = context;
                }
                com.bykv.vk.openvk.preload.geckox.a aVar2 = new com.bykv.vk.openvk.preload.geckox.a(bVar2);
                HashMap hashMap = new HashMap();
                LinkedList linkedList = new LinkedList();
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    linkedList.add(new CheckRequestBodyModel.TargetChannel(it.next()));
                }
                hashMap.put("cca47107bfcbdb211d88f3385aeede40", linkedList);
                if (!TextUtils.isEmpty("default")) {
                    if (aVar2.a()) {
                        if (aVar2.a(hashMap)) {
                            b.b().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.1

                                /* renamed from: a */
                                final /* synthetic */ String f13168a;
                                final /* synthetic */ com.bykv.vk.openvk.preload.geckox.e.a b = null;

                                /* renamed from: c */
                                final /* synthetic */ Map f13169c = null;

                                /* renamed from: d */
                                final /* synthetic */ Map f13170d;

                                public AnonymousClass1(String str2, Map hashMap2) {
                                    r2 = str2;
                                    r3 = hashMap2;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:29:0x05d1 A[Catch: all -> 0x05e6, TryCatch #3 {all -> 0x05e6, blocks: (B:27:0x05c1, B:29:0x05d1, B:33:0x05d7, B:35:0x05e1), top: B:26:0x05c1 }] */
                                /* JADX WARN: Removed duplicated region for block: B:50:0x0599  */
                                /* JADX WARN: Removed duplicated region for block: B:56:0x05ec  */
                                @Override // java.lang.Runnable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final void run() {
                                    /*
                                        Method dump skipped, instructions count: 1538
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.geckox.a.AnonymousClass1.run():void");
                                }
                            });
                            return;
                        }
                        throw new IllegalArgumentException("target keys not in deployments keys");
                    }
                    throw new IllegalArgumentException("deployments keys not in local keys");
                }
                throw new IllegalArgumentException("groupType == null");
            }
            throw new IllegalArgumentException("access key empty");
        }
    }

    public void releaseGeckoResLoader(ILoader iLoader) {
        c.a();
        c.a(iLoader);
    }

    private GeckoHubImp() {
    }
}
