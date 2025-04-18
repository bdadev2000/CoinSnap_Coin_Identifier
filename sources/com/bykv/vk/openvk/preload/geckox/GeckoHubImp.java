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
        private static GeckoHubImp a = new GeckoHubImp();
    }

    public static GeckoHubImp inst(Context context) {
        c.a(context);
        return a.a;
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
        c a10 = c.a();
        if (!TextUtils.isEmpty(str)) {
            b.a aVar = new b.a(c.f10053b);
            aVar.f10032b = Arrays.asList("cca47107bfcbdb211d88f3385aeede40");
            aVar.f10033c = Arrays.asList("cca47107bfcbdb211d88f3385aeede40");
            aVar.f10039i = 38L;
            aVar.f10041k = str;
            aVar.f10040j = "9999999.0.0";
            a.C0052a c0052a = new a.C0052a();
            c0052a.a = 20;
            com.bykv.vk.openvk.preload.geckox.a.a.b bVar = com.bykv.vk.openvk.preload.geckox.a.a.b.f10011c;
            if (bVar == null) {
                bVar = com.bykv.vk.openvk.preload.geckox.a.a.b.a;
            }
            c0052a.f10008b = bVar;
            byte b3 = 0;
            aVar.f10038h = new com.bykv.vk.openvk.preload.geckox.a.a.a(c0052a, b3);
            aVar.f10043m = c.a;
            aVar.f10037g = false;
            aVar.f10042l = c.f10054c;
            aVar.f10036f = iStatisticMonitor;
            aVar.a = iNetWork;
            b bVar2 = new b(aVar, b3);
            a10.f10056d = iNetWork;
            List<String> list = bVar2.f10020e;
            if (list != null && !list.isEmpty()) {
                Context context = bVar2.a;
                if (context != null) {
                    f.a = context;
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
                                final /* synthetic */ String a;

                                /* renamed from: b */
                                final /* synthetic */ com.bykv.vk.openvk.preload.geckox.e.a f9996b = null;

                                /* renamed from: c */
                                final /* synthetic */ Map f9997c = null;

                                /* renamed from: d */
                                final /* synthetic */ Map f9998d;

                                public AnonymousClass1(String str2, Map hashMap2) {
                                    r2 = str2;
                                    r3 = hashMap2;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:25:0x0668 A[Catch: all -> 0x067d, TryCatch #9 {all -> 0x067d, blocks: (B:23:0x0658, B:25:0x0668, B:29:0x066e, B:31:0x0678), top: B:22:0x0658 }] */
                                /* JADX WARN: Removed duplicated region for block: B:47:0x062e  */
                                /* JADX WARN: Removed duplicated region for block: B:53:0x0683  */
                                @Override // java.lang.Runnable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final void run() {
                                    /*
                                        Method dump skipped, instructions count: 1691
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
