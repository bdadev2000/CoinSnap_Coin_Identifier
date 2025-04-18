package com.applovin.impl;

import android.os.Process;
import androidx.core.util.Consumer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class eg {

    /* renamed from: a, reason: collision with root package name */
    private final PriorityBlockingQueue f23685a = new PriorityBlockingQueue();

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f23686b;

    /* loaded from: classes2.dex */
    public static class b extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private final BlockingQueue f23687a;

        /* renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.j f23688b;

        private b(BlockingQueue blockingQueue, int i2, com.applovin.impl.sdk.j jVar) {
            super("AppLovinSdk:network");
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            }
            if (jVar != null) {
                this.f23687a = blockingQueue;
                this.f23688b = jVar;
                setPriority(((Integer) jVar.a(sj.W)).intValue());
                return;
            }
            throw new IllegalArgumentException("No sdk specified");
        }

        private HttpURLConnection a(c cVar) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(cVar.f23690a).openConnection();
            httpURLConnection.setRequestMethod(cVar.f23691b);
            httpURLConnection.setConnectTimeout(cVar.f23693f);
            httpURLConnection.setReadTimeout(cVar.f23693f);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!cVar.f23692c.isEmpty()) {
                for (Map.Entry entry : cVar.f23692c.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void b(c cVar, d dVar) {
            cVar.f23694g.accept(dVar);
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

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:163:0x0251 A[Catch: all -> 0x025b, TRY_LEAVE, TryCatch #23 {all -> 0x025b, blocks: (B:161:0x0239, B:163:0x0251), top: B:160:0x0239 }] */
        /* JADX WARN: Removed duplicated region for block: B:166:0x02a5  */
        /* JADX WARN: Removed duplicated region for block: B:167:0x0262 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00ef A[Catch: all -> 0x00f9, TRY_LEAVE, TryCatch #10 {all -> 0x00f9, blocks: (B:59:0x00d7, B:61:0x00ef, B:74:0x0125), top: B:58:0x00d7 }] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0140  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void b(final com.applovin.impl.eg.c r21) {
            /*
                Method dump skipped, instructions count: 755
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.eg.b.b(com.applovin.impl.eg$c):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a(c cVar, d dVar) {
            cVar.f23694g.accept(dVar);
        }

        private void a() {
            b((c) this.f23687a.take());
        }
    }

    /* loaded from: classes2.dex */
    public static class c implements Comparable {

        /* renamed from: j, reason: collision with root package name */
        private static final AtomicInteger f23689j = new AtomicInteger();

        /* renamed from: a, reason: collision with root package name */
        private final String f23690a;

        /* renamed from: b, reason: collision with root package name */
        private final String f23691b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f23692c;
        private final byte[] d;

        /* renamed from: f, reason: collision with root package name */
        private final int f23693f;

        /* renamed from: g, reason: collision with root package name */
        private final Consumer f23694g;

        /* renamed from: h, reason: collision with root package name */
        private final Executor f23695h;

        /* renamed from: i, reason: collision with root package name */
        private final int f23696i;

        /* loaded from: classes2.dex */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private String f23697a;

            /* renamed from: b, reason: collision with root package name */
            private String f23698b;

            /* renamed from: c, reason: collision with root package name */
            private Map f23699c = new HashMap();
            private byte[] d;
            private int e;

            /* renamed from: f, reason: collision with root package name */
            private Consumer f23700f;

            /* renamed from: g, reason: collision with root package name */
            private Executor f23701g;

            public a a(int i2) {
                this.e = i2;
                return this;
            }

            public a b(String str) {
                this.f23698b = str;
                return this;
            }

            public a a(Consumer consumer) {
                this.f23700f = consumer;
                return this;
            }

            public a a(String str) {
                this.f23697a = str;
                return this;
            }

            public a a(Executor executor) {
                this.f23701g = executor;
                return this;
            }

            public a a(byte[] bArr) {
                this.d = bArr;
                return this;
            }

            public a a(String str, String str2) {
                this.f23699c.put(str, str2);
                return this;
            }

            public a a(Map map) {
                if (map == null) {
                    map = new HashMap();
                }
                this.f23699c = map;
                return this;
            }

            public c a() {
                return new c(this);
            }
        }

        private c(a aVar) {
            this.f23690a = aVar.f23697a;
            this.f23691b = aVar.f23698b;
            this.f23692c = aVar.f23699c != null ? aVar.f23699c : Collections.emptyMap();
            this.d = aVar.d;
            this.f23693f = aVar.e;
            this.f23694g = aVar.f23700f;
            this.f23695h = aVar.f23701g;
            this.f23696i = f23689j.incrementAndGet();
        }

        @Override // java.lang.Comparable
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return this.f23696i - cVar.f23696i;
        }
    }

    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final int f23702a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f23703b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f23704c;
        private final long d;
        private final Throwable e;

        /* loaded from: classes2.dex */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private int f23705a;

            /* renamed from: b, reason: collision with root package name */
            private byte[] f23706b;

            /* renamed from: c, reason: collision with root package name */
            private byte[] f23707c;
            private long d;
            private Throwable e;

            public a a(int i2) {
                this.f23705a = i2;
                return this;
            }

            public a b(byte[] bArr) {
                this.f23707c = bArr;
                return this;
            }

            public a a(long j2) {
                this.d = j2;
                return this;
            }

            public a a(Throwable th) {
                this.e = th;
                return this;
            }

            public a a(byte[] bArr) {
                this.f23706b = bArr;
                return this;
            }

            public d a() {
                return new d(this);
            }
        }

        private d(a aVar) {
            this.f23702a = aVar.f23705a;
            this.f23703b = aVar.f23706b;
            this.f23704c = aVar.f23707c;
            this.d = aVar.d;
            this.e = aVar.e;
        }

        public static a a() {
            return new a();
        }

        public int b() {
            return this.f23702a;
        }

        public int c() {
            Throwable th = this.e;
            if (th == null) {
                return this.f23702a;
            }
            throw th;
        }

        public byte[] d() {
            Throwable th = this.e;
            if (th == null) {
                return this.f23703b;
            }
            throw th;
        }

        public long e() {
            return this.d;
        }

        public byte[] f() {
            return this.f23704c;
        }
    }

    public eg(com.applovin.impl.sdk.j jVar) {
        this.f23686b = jVar;
    }

    public void a(c cVar) {
        if (cVar != null) {
            this.f23685a.add(cVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }

    public void a() {
        for (int i2 = 0; i2 < ((Integer) this.f23686b.a(sj.V)).intValue(); i2++) {
            new b(this.f23685a, i2, this.f23686b).start();
        }
    }
}
