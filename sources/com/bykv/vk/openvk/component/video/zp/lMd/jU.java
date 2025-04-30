package com.bykv.vk.openvk.component.video.zp.lMd;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.bykv.vk.openvk.component.video.zp.lMd.YW;
import com.bykv.vk.openvk.component.video.zp.lMd.lMd;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class jU {
    private static volatile jU COT;
    private volatile KS Bj;
    private volatile com.bykv.vk.openvk.component.video.zp.lMd.lMd.KS HWF;
    private final lMd<Runnable> KS;
    private volatile com.bykv.vk.openvk.component.video.zp.lMd.zp.KS QR;
    private final HashSet<zp> YW;
    private final lMd.InterfaceC0055lMd dT;
    private final ExecutorService jU;
    private volatile com.bykv.vk.openvk.component.video.zp.lMd.zp.lMd ku;
    private final SparseArray<Map<String, com.bykv.vk.openvk.component.video.zp.lMd.lMd>> lMd;
    private volatile boolean rV;
    private volatile String tG;
    private volatile KS vDp;
    private volatile int zp = 163840;

    /* loaded from: classes.dex */
    public static final class lMd<T> extends LinkedBlockingDeque<T> {
        private ThreadPoolExecutor zp;

        private lMd() {
        }

        @Override // java.util.concurrent.LinkedBlockingDeque, java.util.Queue, java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue, java.util.Deque
        public boolean offer(T t9) {
            synchronized (this) {
                try {
                    int poolSize = this.zp.getPoolSize();
                    int activeCount = this.zp.getActiveCount();
                    int maximumPoolSize = this.zp.getMaximumPoolSize();
                    if (activeCount >= poolSize && poolSize < maximumPoolSize) {
                        if (COT.KS) {
                            Log.i("TAG_PROXY_TT", "create new preloader thread");
                        }
                        return false;
                    }
                    return offerFirst(t9);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void zp(ThreadPoolExecutor threadPoolExecutor) {
            synchronized (this) {
                try {
                    if (this.zp == null) {
                        if (threadPoolExecutor != null) {
                            this.zp = threadPoolExecutor;
                        } else {
                            throw new NullPointerException("executor argument can't be null!");
                        }
                    } else {
                        throw new IllegalStateException("You can only call setExecutor() once!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class zp {
        final Map<String, String> COT;
        final String[] HWF;
        final int KS;
        final String jU;
        final boolean lMd;
        final boolean zp;

        public zp(boolean z8, boolean z9, int i9, String str, Map<String, String> map, String[] strArr) {
            this.zp = z8;
            this.lMd = z9;
            this.KS = i9;
            this.jU = str;
            this.COT = map;
            this.HWF = strArr;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || zp.class != obj.getClass()) {
                return false;
            }
            zp zpVar = (zp) obj;
            if (this.zp != zpVar.zp || this.lMd != zpVar.lMd || this.KS != zpVar.KS) {
                return false;
            }
            return this.jU.equals(zpVar.jU);
        }

        public int hashCode() {
            return this.jU.hashCode() + ((((((this.zp ? 1 : 0) * 31) + (this.lMd ? 1 : 0)) * 31) + this.KS) * 31);
        }
    }

    private jU() {
        SparseArray<Map<String, com.bykv.vk.openvk.component.video.zp.lMd.lMd>> sparseArray = new SparseArray<>(2);
        this.lMd = sparseArray;
        this.YW = new HashSet<>();
        this.dT = new lMd.InterfaceC0055lMd() { // from class: com.bykv.vk.openvk.component.video.zp.lMd.jU.1
            @Override // com.bykv.vk.openvk.component.video.zp.lMd.lMd.InterfaceC0055lMd
            public void zp(com.bykv.vk.openvk.component.video.zp.lMd.lMd lmd) {
                int HWF = lmd.HWF();
                synchronized (jU.this.lMd) {
                    try {
                        Map map = (Map) jU.this.lMd.get(HWF);
                        if (map != null) {
                            map.remove(lmd.ku);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (COT.KS) {
                    Log.d("TAG_PROXY_Preloader", "afterExecute, key: " + lmd.ku);
                }
            }
        };
        lMd<Runnable> lmd = new lMd<>();
        this.KS = lmd;
        ExecutorService zp2 = zp(lmd);
        this.jU = zp2;
        lmd.zp((ThreadPoolExecutor) zp2);
        sparseArray.put(0, new HashMap());
        sparseArray.put(1, new HashMap());
    }

    public static jU KS() {
        if (COT == null) {
            synchronized (jU.class) {
                try {
                    if (COT == null) {
                        COT = new jU();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return COT;
    }

    public void jU() {
        com.bykv.vk.openvk.component.video.zp.KS.zp.zp(new com.bytedance.sdk.component.ku.ku("cancelAll") { // from class: com.bykv.vk.openvk.component.video.zp.lMd.jU.3
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList();
                synchronized (jU.this.lMd) {
                    try {
                        int size = jU.this.lMd.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            Map map = (Map) jU.this.lMd.get(jU.this.lMd.keyAt(i9));
                            if (map != null) {
                                arrayList.addAll(map.values());
                                map.clear();
                            }
                        }
                        jU.this.KS.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.bykv.vk.openvk.component.video.zp.lMd.lMd lmd = (com.bykv.vk.openvk.component.video.zp.lMd.lMd) it.next();
                    lmd.zp();
                    if (COT.KS) {
                        Log.w("TAG_PROXY_Preloader", "PreloadTask: " + lmd + ", canceled!!!");
                    }
                }
            }
        });
    }

    public KS lMd() {
        return this.vDp;
    }

    public void zp(com.bykv.vk.openvk.component.video.zp.lMd.zp.KS ks) {
        this.QR = ks;
    }

    public void zp(com.bykv.vk.openvk.component.video.zp.lMd.lMd.KS ks) {
        this.HWF = ks;
    }

    public void zp(int i9) {
        if (i9 > 0) {
            this.zp = i9;
        }
        if (COT.KS) {
            Log.i("TAG_PROXY_Preloader", "MaxPreloadSize: ".concat(String.valueOf(i9)));
        }
    }

    public KS zp() {
        return this.Bj;
    }

    public void zp(boolean z8, String str) {
        com.bykv.vk.openvk.component.video.zp.lMd.lMd remove;
        this.tG = str;
        this.rV = z8;
        if (COT.KS) {
            Log.i("TAG_PROXY_Preloader", "setCurrentPlayKey, ".concat(String.valueOf(str)));
        }
        HashSet hashSet = null;
        HashSet hashSet2 = null;
        if (str == null) {
            synchronized (this.YW) {
                try {
                    if (!this.YW.isEmpty()) {
                        hashSet2 = new HashSet(this.YW);
                        this.YW.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    zp zpVar = (zp) it.next();
                    zp(zpVar.zp, zpVar.lMd, zpVar.KS, zpVar.jU, zpVar.COT, zpVar.HWF);
                    if (COT.KS) {
                        Log.i("TAG_PROXY_Preloader", "setCurrentPlayKey, resume preload: " + zpVar.jU);
                    }
                }
                return;
            }
            return;
        }
        int i9 = COT.ku;
        if (i9 != 3 && i9 != 2) {
            if (i9 == 1) {
                synchronized (this.lMd) {
                    try {
                        Map<String, com.bykv.vk.openvk.component.video.zp.lMd.lMd> map = this.lMd.get(com.bykv.vk.openvk.component.video.zp.lMd.lMd.lMd.zp(z8));
                        remove = map != null ? map.remove(str) : null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (remove != null) {
                    remove.zp();
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this.lMd) {
            try {
                int size = this.lMd.size();
                for (int i10 = 0; i10 < size; i10++) {
                    SparseArray<Map<String, com.bykv.vk.openvk.component.video.zp.lMd.lMd>> sparseArray = this.lMd;
                    Map<String, com.bykv.vk.openvk.component.video.zp.lMd.lMd> map2 = sparseArray.get(sparseArray.keyAt(i10));
                    if (map2 != null) {
                        Collection<com.bykv.vk.openvk.component.video.zp.lMd.lMd> values = map2.values();
                        if (values != null && !values.isEmpty()) {
                            if (hashSet == null) {
                                hashSet = new HashSet();
                            }
                            hashSet.addAll(values);
                        }
                        map2.clear();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (hashSet == null || hashSet.isEmpty()) {
            return;
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            com.bykv.vk.openvk.component.video.zp.lMd.lMd lmd = (com.bykv.vk.openvk.component.video.zp.lMd.lMd) it2.next();
            lmd.zp();
            if (COT.KS) {
                Log.i("TAG_PROXY_Preloader", "setCurrentPlayKey, cancel preload: " + lmd.QR);
            }
        }
        if (i9 == 3) {
            synchronized (this.YW) {
                try {
                    Iterator it3 = hashSet.iterator();
                    while (it3.hasNext()) {
                        zp zpVar2 = (zp) ((com.bykv.vk.openvk.component.video.zp.lMd.lMd) it3.next()).rV;
                        if (zpVar2 != null) {
                            this.YW.add(zpVar2);
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    public void zp(boolean z8, boolean z9, int i9, String str, String... strArr) {
        zp(z8, z9, i9, str, null, strArr);
    }

    public void zp(boolean z8, boolean z9, int i9, String str, Map<String, String> map, String... strArr) {
        SparseArray<Map<String, com.bykv.vk.openvk.component.video.zp.lMd.lMd>> sparseArray;
        ArrayList arrayList;
        boolean z10 = COT.KS;
        if (z10) {
            Log.d("TAG_PROXY_Preloader", "preload start ！！！！");
        }
        com.bykv.vk.openvk.component.video.zp.lMd.zp.zp zpVar = z8 ? this.ku : this.QR;
        com.bykv.vk.openvk.component.video.zp.lMd.lMd.KS ks = this.HWF;
        if (zpVar == null || ks == null) {
            if (z10) {
                Log.e("TAG_PROXY_Preloader", "cache or videoProxyDB null in Preloader!!!");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length <= 0) {
            return;
        }
        int i10 = i9 <= 0 ? this.zp : i9;
        String zp2 = z9 ? str : com.bykv.vk.openvk.component.video.api.HWF.lMd.zp(str);
        File jU = zpVar.jU(zp2);
        if (jU != null && jU.length() >= i10) {
            if (z10) {
                Log.i("TAG_PROXY_Preloader", "no need preload, file size: " + jU.length() + ", need preload size: " + i10);
                return;
            }
            return;
        }
        if (HWF.zp().zp(com.bykv.vk.openvk.component.video.zp.lMd.lMd.lMd.zp(z8), zp2)) {
            if (z10) {
                Log.w("TAG_PROXY_Preloader", "has running proxy task, skip preload for key: ".concat(String.valueOf(str)));
                return;
            }
            return;
        }
        SparseArray<Map<String, com.bykv.vk.openvk.component.video.zp.lMd.lMd>> sparseArray2 = this.lMd;
        synchronized (sparseArray2) {
            try {
                Map<String, com.bykv.vk.openvk.component.video.zp.lMd.lMd> map2 = this.lMd.get(z8 ? 1 : 0);
                if (!map2.containsKey(zp2)) {
                    int i11 = i10;
                    sparseArray = sparseArray2;
                    try {
                        zp zpVar2 = new zp(z8, z9, i10, str, map, strArr);
                        String str2 = this.tG;
                        if (str2 != null) {
                            int i12 = COT.ku;
                            if (i12 == 3) {
                                synchronized (this.YW) {
                                    this.YW.add(zpVar2);
                                }
                                if (z10) {
                                    Log.w("TAG_PROXY_Preloader", "cancel preload: " + str + ", add to pending queue");
                                }
                                return;
                            }
                            if (i12 == 2) {
                                if (z10) {
                                    Log.w("TAG_PROXY_Preloader", "cancel preload: ".concat(String.valueOf(str)));
                                }
                                return;
                            } else if (i12 == 1 && this.rV == z8 && str2.equals(zp2)) {
                                if (z10) {
                                    Log.w("TAG_PROXY_Preloader", "cancel preload: " + str + ", it is playing");
                                }
                                return;
                            }
                        }
                        List<YW.lMd> zp3 = com.bykv.vk.openvk.component.video.zp.KS.zp.zp(com.bykv.vk.openvk.component.video.zp.KS.zp.zp(map));
                        if (zp3 != null) {
                            arrayList = new ArrayList(zp3.size());
                            int size = zp3.size();
                            for (int i13 = 0; i13 < size; i13++) {
                                YW.lMd lmd = zp3.get(i13);
                                if (lmd != null) {
                                    arrayList.add(new YW.lMd(lmd.zp, lmd.lMd));
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        com.bykv.vk.openvk.component.video.zp.lMd.lMd zp4 = new lMd.zp().zp(zpVar).zp(ks).zp(str).lMd(zp2).zp(new vDp(com.bykv.vk.openvk.component.video.zp.KS.zp.zp(strArr))).zp((List<YW.lMd>) arrayList).zp(i11).zp(this.dT).zp(zpVar2).zp();
                        map2.put(zp2, zp4);
                        this.jU.execute(zp4);
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                sparseArray = sparseArray2;
            }
        }
    }

    public void zp(String str) {
        zp(false, false, str);
    }

    public void zp(final boolean z8, final boolean z9, final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bykv.vk.openvk.component.video.zp.KS.zp.zp(new com.bytedance.sdk.component.ku.ku("cancel b b S") { // from class: com.bykv.vk.openvk.component.video.zp.lMd.jU.2
            @Override // java.lang.Runnable
            public void run() {
                com.bykv.vk.openvk.component.video.zp.lMd.lMd lmd;
                String zp2;
                synchronized (jU.this.lMd) {
                    try {
                        Map map = (Map) jU.this.lMd.get(com.bykv.vk.openvk.component.video.zp.lMd.lMd.lMd.zp(z8));
                        if (map != null) {
                            if (z9) {
                                zp2 = str;
                            } else {
                                zp2 = com.bykv.vk.openvk.component.video.api.HWF.lMd.zp(str);
                            }
                            lmd = (com.bykv.vk.openvk.component.video.zp.lMd.lMd) map.remove(zp2);
                        } else {
                            lmd = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (lmd != null) {
                    lmd.zp();
                }
            }
        });
    }

    private static ExecutorService zp(final lMd<Runnable> lmd) {
        int i9;
        int zp2 = com.bykv.vk.openvk.component.video.zp.KS.zp.zp();
        if (zp2 <= 0) {
            zp2 = 1;
        } else if (zp2 > 4) {
            i9 = 4;
            return new ThreadPoolExecutor(0, i9, 60L, TimeUnit.SECONDS, lmd, new ThreadFactory() { // from class: com.bykv.vk.openvk.component.video.zp.lMd.jU.4
                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable) { // from class: com.bykv.vk.openvk.component.video.zp.lMd.jU.4.1
                        @Override // java.lang.Thread, java.lang.Runnable
                        public void run() {
                            try {
                                Process.setThreadPriority(10);
                            } catch (Throwable unused) {
                            }
                            super.run();
                        }
                    };
                    thread.setName("csj_video_preload_" + thread.getId());
                    thread.setDaemon(true);
                    if (COT.KS) {
                        Log.i("TAG_PROXY_Preloader", "new preload thead: " + thread.getName());
                    }
                    return thread;
                }
            }, new RejectedExecutionHandler() { // from class: com.bykv.vk.openvk.component.video.zp.lMd.jU.5
                @Override // java.util.concurrent.RejectedExecutionHandler
                public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                    try {
                        lMd.this.offerFirst(runnable);
                        if (COT.KS) {
                            Log.i("TAG_PROXY_TT", "task rejected in preloader, put first!!!");
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
        i9 = zp2;
        return new ThreadPoolExecutor(0, i9, 60L, TimeUnit.SECONDS, lmd, new ThreadFactory() { // from class: com.bykv.vk.openvk.component.video.zp.lMd.jU.4
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable) { // from class: com.bykv.vk.openvk.component.video.zp.lMd.jU.4.1
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        try {
                            Process.setThreadPriority(10);
                        } catch (Throwable unused) {
                        }
                        super.run();
                    }
                };
                thread.setName("csj_video_preload_" + thread.getId());
                thread.setDaemon(true);
                if (COT.KS) {
                    Log.i("TAG_PROXY_Preloader", "new preload thead: " + thread.getName());
                }
                return thread;
            }
        }, new RejectedExecutionHandler() { // from class: com.bykv.vk.openvk.component.video.zp.lMd.jU.5
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                try {
                    lMd.this.offerFirst(runnable);
                    if (COT.KS) {
                        Log.i("TAG_PROXY_TT", "task rejected in preloader, put first!!!");
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }
}
