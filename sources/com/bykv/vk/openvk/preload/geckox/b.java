package com.bykv.vk.openvk.preload.geckox;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import java.io.File;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: q, reason: collision with root package name */
    private static IThreadPoolCallback f13190q;

    /* renamed from: r, reason: collision with root package name */
    private static ThreadPoolExecutor f13191r;

    /* renamed from: a, reason: collision with root package name */
    public final Context f13192a;
    final com.bykv.vk.openvk.preload.geckox.i.a b;

    /* renamed from: c, reason: collision with root package name */
    public final IStatisticMonitor f13193c;

    /* renamed from: d, reason: collision with root package name */
    public final INetWork f13194d;

    /* renamed from: e, reason: collision with root package name */
    public final List<String> f13195e;

    /* renamed from: f, reason: collision with root package name */
    public final List<String> f13196f;

    /* renamed from: g, reason: collision with root package name */
    final com.bykv.vk.openvk.preload.geckox.a.a.a f13197g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f13198h;

    /* renamed from: i, reason: collision with root package name */
    public final String f13199i;

    /* renamed from: j, reason: collision with root package name */
    public final String f13200j;

    /* renamed from: k, reason: collision with root package name */
    public final String f13201k;
    public final String l;
    public final String m;

    /* renamed from: n, reason: collision with root package name */
    public final File f13202n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f13203o;

    /* renamed from: p, reason: collision with root package name */
    public JSONObject f13204p;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        INetWork f13205a;
        List<String> b;

        /* renamed from: c, reason: collision with root package name */
        List<String> f13206c;

        /* renamed from: d, reason: collision with root package name */
        Context f13207d;

        /* renamed from: e, reason: collision with root package name */
        com.bykv.vk.openvk.preload.geckox.i.a f13208e;

        /* renamed from: f, reason: collision with root package name */
        IStatisticMonitor f13209f;

        /* renamed from: g, reason: collision with root package name */
        boolean f13210g = true;

        /* renamed from: h, reason: collision with root package name */
        com.bykv.vk.openvk.preload.geckox.a.a.a f13211h;

        /* renamed from: i, reason: collision with root package name */
        Long f13212i;

        /* renamed from: j, reason: collision with root package name */
        String f13213j;

        /* renamed from: k, reason: collision with root package name */
        String f13214k;
        String l;
        File m;

        /* renamed from: n, reason: collision with root package name */
        String f13215n;

        /* renamed from: o, reason: collision with root package name */
        String f13216o;

        public a(Context context) {
            this.f13207d = context.getApplicationContext();
        }
    }

    public /* synthetic */ b(a aVar, byte b) {
        this(aVar);
    }

    public static Executor a() {
        return c();
    }

    public static Executor b() {
        return c();
    }

    public static ExecutorService c() {
        ExecutorService executorService;
        IThreadPoolCallback iThreadPoolCallback = f13190q;
        if (iThreadPoolCallback != null) {
            executorService = iThreadPoolCallback.getThreadPool();
        } else {
            executorService = null;
        }
        if (executorService != null) {
            return executorService;
        }
        if (f13191r == null) {
            synchronized (b.class) {
                try {
                    if (f13191r == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                        f13191r = threadPoolExecutor;
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    }
                } finally {
                }
            }
        }
        return f13191r;
    }

    private b(a aVar) {
        Context context = aVar.f13207d;
        this.f13192a = context;
        if (context != null) {
            List<String> list = aVar.b;
            this.f13195e = list;
            this.f13196f = aVar.f13206c;
            this.b = aVar.f13208e;
            this.f13197g = aVar.f13211h;
            Long l = aVar.f13212i;
            this.f13198h = l;
            if (TextUtils.isEmpty(aVar.f13213j)) {
                this.f13199i = com.bykv.vk.openvk.preload.geckox.utils.a.a(context);
            } else {
                this.f13199i = aVar.f13213j;
            }
            String str = aVar.f13214k;
            this.f13200j = str;
            this.l = aVar.f13215n;
            this.m = aVar.f13216o;
            File file = aVar.m;
            if (file == null) {
                this.f13202n = new File(context.getFilesDir(), "gecko_offline_res_x");
            } else {
                this.f13202n = file;
            }
            String str2 = aVar.l;
            this.f13201k = str2;
            if (!TextUtils.isEmpty(str2)) {
                if (list == null || list.isEmpty()) {
                    throw new IllegalArgumentException("access key empty");
                }
                if (l != null) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f13194d = aVar.f13205a;
                        this.f13193c = aVar.f13209f;
                        this.f13203o = aVar.f13210g;
                        return;
                    }
                    throw new IllegalArgumentException("deviceId key empty");
                }
                throw new IllegalArgumentException("appId == null");
            }
            throw new IllegalArgumentException("host == null");
        }
        throw new IllegalArgumentException("context == null");
    }

    public static void a(IThreadPoolCallback iThreadPoolCallback) {
        f13190q = iThreadPoolCallback;
    }
}
