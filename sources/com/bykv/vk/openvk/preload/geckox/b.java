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
    private static IThreadPoolCallback f10015q;

    /* renamed from: r, reason: collision with root package name */
    private static ThreadPoolExecutor f10016r;
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    final com.bykv.vk.openvk.preload.geckox.i.a f10017b;

    /* renamed from: c, reason: collision with root package name */
    public final IStatisticMonitor f10018c;

    /* renamed from: d, reason: collision with root package name */
    public final INetWork f10019d;

    /* renamed from: e, reason: collision with root package name */
    public final List<String> f10020e;

    /* renamed from: f, reason: collision with root package name */
    public final List<String> f10021f;

    /* renamed from: g, reason: collision with root package name */
    final com.bykv.vk.openvk.preload.geckox.a.a.a f10022g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f10023h;

    /* renamed from: i, reason: collision with root package name */
    public final String f10024i;

    /* renamed from: j, reason: collision with root package name */
    public final String f10025j;

    /* renamed from: k, reason: collision with root package name */
    public final String f10026k;

    /* renamed from: l, reason: collision with root package name */
    public final String f10027l;

    /* renamed from: m, reason: collision with root package name */
    public final String f10028m;

    /* renamed from: n, reason: collision with root package name */
    public final File f10029n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f10030o;

    /* renamed from: p, reason: collision with root package name */
    public JSONObject f10031p;

    /* loaded from: classes.dex */
    public static class a {
        INetWork a;

        /* renamed from: b, reason: collision with root package name */
        List<String> f10032b;

        /* renamed from: c, reason: collision with root package name */
        List<String> f10033c;

        /* renamed from: d, reason: collision with root package name */
        Context f10034d;

        /* renamed from: e, reason: collision with root package name */
        com.bykv.vk.openvk.preload.geckox.i.a f10035e;

        /* renamed from: f, reason: collision with root package name */
        IStatisticMonitor f10036f;

        /* renamed from: g, reason: collision with root package name */
        boolean f10037g = true;

        /* renamed from: h, reason: collision with root package name */
        com.bykv.vk.openvk.preload.geckox.a.a.a f10038h;

        /* renamed from: i, reason: collision with root package name */
        Long f10039i;

        /* renamed from: j, reason: collision with root package name */
        String f10040j;

        /* renamed from: k, reason: collision with root package name */
        String f10041k;

        /* renamed from: l, reason: collision with root package name */
        String f10042l;

        /* renamed from: m, reason: collision with root package name */
        File f10043m;

        /* renamed from: n, reason: collision with root package name */
        String f10044n;

        /* renamed from: o, reason: collision with root package name */
        String f10045o;

        public a(Context context) {
            this.f10034d = context.getApplicationContext();
        }
    }

    public /* synthetic */ b(a aVar, byte b3) {
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
        IThreadPoolCallback iThreadPoolCallback = f10015q;
        if (iThreadPoolCallback != null) {
            executorService = iThreadPoolCallback.getThreadPool();
        } else {
            executorService = null;
        }
        if (executorService != null) {
            return executorService;
        }
        if (f10016r == null) {
            synchronized (b.class) {
                if (f10016r == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    f10016r = threadPoolExecutor;
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f10016r;
    }

    private b(a aVar) {
        Context context = aVar.f10034d;
        this.a = context;
        if (context != null) {
            List<String> list = aVar.f10032b;
            this.f10020e = list;
            this.f10021f = aVar.f10033c;
            this.f10017b = aVar.f10035e;
            this.f10022g = aVar.f10038h;
            Long l10 = aVar.f10039i;
            this.f10023h = l10;
            if (TextUtils.isEmpty(aVar.f10040j)) {
                this.f10024i = com.bykv.vk.openvk.preload.geckox.utils.a.a(context);
            } else {
                this.f10024i = aVar.f10040j;
            }
            String str = aVar.f10041k;
            this.f10025j = str;
            this.f10027l = aVar.f10044n;
            this.f10028m = aVar.f10045o;
            File file = aVar.f10043m;
            if (file == null) {
                this.f10029n = new File(context.getFilesDir(), "gecko_offline_res_x");
            } else {
                this.f10029n = file;
            }
            String str2 = aVar.f10042l;
            this.f10026k = str2;
            if (!TextUtils.isEmpty(str2)) {
                if (list == null || list.isEmpty()) {
                    throw new IllegalArgumentException("access key empty");
                }
                if (l10 != null) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f10019d = aVar.a;
                        this.f10018c = aVar.f10036f;
                        this.f10030o = aVar.f10037g;
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
        f10015q = iThreadPoolCallback;
    }
}
