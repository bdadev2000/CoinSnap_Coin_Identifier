package com.applovin.impl;

import android.os.Process;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class zf {

    /* renamed from: a, reason: collision with root package name */
    private final PriorityBlockingQueue f12554a = new PriorityBlockingQueue();
    private final com.applovin.impl.sdk.k b;

    /* loaded from: classes.dex */
    public static class b extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private final BlockingQueue f12555a;
        private final com.applovin.impl.sdk.k b;

        private b(BlockingQueue blockingQueue, int i9, com.applovin.impl.sdk.k kVar) {
            super("AppLovinSdk:network");
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            }
            if (kVar != null) {
                this.f12555a = blockingQueue;
                this.b = kVar;
                setPriority(((Integer) kVar.a(oj.f9675T)).intValue());
                return;
            }
            throw new IllegalArgumentException("No sdk specified");
        }

        private HttpURLConnection a(c cVar) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(cVar.f12557a).openConnection()));
            httpURLConnection.setRequestMethod(cVar.b);
            httpURLConnection.setConnectTimeout(cVar.f12560f);
            httpURLConnection.setReadTimeout(cVar.f12560f);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!cVar.f12558c.isEmpty()) {
                for (Map.Entry entry : cVar.f12558c.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void b(c cVar, d dVar) {
            cVar.f12561g.accept(dVar);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:58:0x00d7 A[Catch: all -> 0x00e1, TRY_LEAVE, TryCatch #4 {all -> 0x00e1, blocks: (B:56:0x00c8, B:58:0x00d7), top: B:55:0x00c8 }] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void b(final com.applovin.impl.zf.c r18) {
            /*
                Method dump skipped, instructions count: 553
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.zf.b.b(com.applovin.impl.zf$c):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a(c cVar, d dVar) {
            cVar.f12561g.accept(dVar);
        }

        private void a() {
            b((c) this.f12555a.take());
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Comparable {

        /* renamed from: j, reason: collision with root package name */
        private static final AtomicInteger f12556j = new AtomicInteger();

        /* renamed from: a, reason: collision with root package name */
        private final String f12557a;
        private final String b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f12558c;

        /* renamed from: d, reason: collision with root package name */
        private final byte[] f12559d;

        /* renamed from: f, reason: collision with root package name */
        private final int f12560f;

        /* renamed from: g, reason: collision with root package name */
        private final S.a f12561g;

        /* renamed from: h, reason: collision with root package name */
        private final Executor f12562h;

        /* renamed from: i, reason: collision with root package name */
        private final int f12563i;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private String f12564a;
            private String b;

            /* renamed from: c, reason: collision with root package name */
            private Map f12565c = new HashMap();

            /* renamed from: d, reason: collision with root package name */
            private byte[] f12566d;

            /* renamed from: e, reason: collision with root package name */
            private int f12567e;

            /* renamed from: f, reason: collision with root package name */
            private S.a f12568f;

            /* renamed from: g, reason: collision with root package name */
            private Executor f12569g;

            public a a(byte[] bArr) {
                this.f12566d = bArr;
                return this;
            }

            public a b(String str) {
                this.b = str;
                return this;
            }

            public a a(String str) {
                this.f12564a = str;
                return this;
            }

            public a a(String str, String str2) {
                this.f12565c.put(str, str2);
                return this;
            }

            public a a(Map map) {
                if (map == null) {
                    map = new HashMap();
                }
                this.f12565c = map;
                return this;
            }

            public a a(S.a aVar) {
                this.f12568f = aVar;
                return this;
            }

            public a a(Executor executor) {
                this.f12569g = executor;
                return this;
            }

            public a a(int i9) {
                this.f12567e = i9;
                return this;
            }

            public c a() {
                return new c(this);
            }
        }

        private c(a aVar) {
            this.f12557a = aVar.f12564a;
            this.b = aVar.b;
            this.f12558c = aVar.f12565c != null ? aVar.f12565c : Collections.emptyMap();
            this.f12559d = aVar.f12566d;
            this.f12560f = aVar.f12567e;
            this.f12561g = aVar.f12568f;
            this.f12562h = aVar.f12569g;
            this.f12563i = f12556j.incrementAndGet();
        }

        @Override // java.lang.Comparable
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return this.f12563i - cVar.f12563i;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final int f12570a;
        private final byte[] b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f12571c;

        /* renamed from: d, reason: collision with root package name */
        private final long f12572d;

        /* renamed from: e, reason: collision with root package name */
        private final Throwable f12573e;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private int f12574a;
            private byte[] b;

            /* renamed from: c, reason: collision with root package name */
            private byte[] f12575c;

            /* renamed from: d, reason: collision with root package name */
            private long f12576d;

            /* renamed from: e, reason: collision with root package name */
            private Throwable f12577e;

            public a a(int i9) {
                this.f12574a = i9;
                return this;
            }

            public a b(byte[] bArr) {
                this.f12575c = bArr;
                return this;
            }

            public a a(byte[] bArr) {
                this.b = bArr;
                return this;
            }

            public a a(long j7) {
                this.f12576d = j7;
                return this;
            }

            public a a(Throwable th) {
                this.f12577e = th;
                return this;
            }

            public d a() {
                return new d(this);
            }
        }

        private d(a aVar) {
            this.f12570a = aVar.f12574a;
            this.b = aVar.b;
            this.f12571c = aVar.f12575c;
            this.f12572d = aVar.f12576d;
            this.f12573e = aVar.f12577e;
        }

        public static a a() {
            return new a();
        }

        public int b() {
            return this.f12570a;
        }

        public int c() {
            Throwable th = this.f12573e;
            if (th == null) {
                return this.f12570a;
            }
            throw th;
        }

        public byte[] d() {
            Throwable th = this.f12573e;
            if (th == null) {
                return this.b;
            }
            throw th;
        }

        public long e() {
            return this.f12572d;
        }

        public byte[] f() {
            return this.f12571c;
        }
    }

    public zf(com.applovin.impl.sdk.k kVar) {
        this.b = kVar;
    }

    public void a(c cVar) {
        if (cVar != null) {
            this.f12554a.add(cVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }

    public void a() {
        for (int i9 = 0; i9 < ((Integer) this.b.a(oj.f9668S)).intValue(); i9++) {
            new b(this.f12554a, i9, this.b).start();
        }
    }
}
