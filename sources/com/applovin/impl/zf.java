package com.applovin.impl;

import android.os.Process;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class zf {
    private final PriorityBlockingQueue a = new PriorityBlockingQueue();

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f9371b;

    /* loaded from: classes.dex */
    public static class b extends Thread {
        private final BlockingQueue a;

        /* renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f9372b;

        private b(BlockingQueue blockingQueue, int i10, com.applovin.impl.sdk.k kVar) {
            super("AppLovinSdk:network");
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            }
            if (kVar != null) {
                this.a = blockingQueue;
                this.f9372b = kVar;
                setPriority(((Integer) kVar.a(oj.T)).intValue());
                return;
            }
            throw new IllegalArgumentException("No sdk specified");
        }

        private HttpURLConnection a(c cVar) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(cVar.a).openConnection();
            httpURLConnection.setRequestMethod(cVar.f9374b);
            httpURLConnection.setConnectTimeout(cVar.f9377f);
            httpURLConnection.setReadTimeout(cVar.f9377f);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!cVar.f9375c.isEmpty()) {
                for (Map.Entry entry : cVar.f9375c.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void b(c cVar, d dVar) {
            cVar.f9378g.accept(dVar);
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

        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Removed duplicated region for block: B:145:0x01ba A[Catch: all -> 0x0217, TRY_LEAVE, TryCatch #14 {all -> 0x0217, blocks: (B:143:0x01ab, B:145:0x01ba), top: B:142:0x01ab }] */
        /* JADX WARN: Removed duplicated region for block: B:148:0x01d9  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00d7 A[Catch: all -> 0x014c, TRY_LEAVE, TryCatch #6 {all -> 0x014c, blocks: (B:58:0x00c8, B:60:0x00d7), top: B:57:0x00c8 }] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void b(final com.applovin.impl.zf.c r17) {
            /*
                Method dump skipped, instructions count: 553
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.zf.b.b(com.applovin.impl.zf$c):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a(c cVar, d dVar) {
            cVar.f9378g.accept(dVar);
        }

        private void a() {
            b((c) this.a.take());
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Comparable {

        /* renamed from: j, reason: collision with root package name */
        private static final AtomicInteger f9373j = new AtomicInteger();
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        private final String f9374b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f9375c;

        /* renamed from: d, reason: collision with root package name */
        private final byte[] f9376d;

        /* renamed from: f, reason: collision with root package name */
        private final int f9377f;

        /* renamed from: g, reason: collision with root package name */
        private final m0.a f9378g;

        /* renamed from: h, reason: collision with root package name */
        private final Executor f9379h;

        /* renamed from: i, reason: collision with root package name */
        private final int f9380i;

        /* loaded from: classes.dex */
        public static class a {
            private String a;

            /* renamed from: b, reason: collision with root package name */
            private String f9381b;

            /* renamed from: c, reason: collision with root package name */
            private Map f9382c = new HashMap();

            /* renamed from: d, reason: collision with root package name */
            private byte[] f9383d;

            /* renamed from: e, reason: collision with root package name */
            private int f9384e;

            /* renamed from: f, reason: collision with root package name */
            private m0.a f9385f;

            /* renamed from: g, reason: collision with root package name */
            private Executor f9386g;

            public a a(byte[] bArr) {
                this.f9383d = bArr;
                return this;
            }

            public a b(String str) {
                this.f9381b = str;
                return this;
            }

            public a a(String str) {
                this.a = str;
                return this;
            }

            public a a(String str, String str2) {
                this.f9382c.put(str, str2);
                return this;
            }

            public a a(Map map) {
                if (map == null) {
                    map = new HashMap();
                }
                this.f9382c = map;
                return this;
            }

            public a a(m0.a aVar) {
                this.f9385f = aVar;
                return this;
            }

            public a a(Executor executor) {
                this.f9386g = executor;
                return this;
            }

            public a a(int i10) {
                this.f9384e = i10;
                return this;
            }

            public c a() {
                return new c(this);
            }
        }

        private c(a aVar) {
            this.a = aVar.a;
            this.f9374b = aVar.f9381b;
            this.f9375c = aVar.f9382c != null ? aVar.f9382c : Collections.emptyMap();
            this.f9376d = aVar.f9383d;
            this.f9377f = aVar.f9384e;
            this.f9378g = aVar.f9385f;
            this.f9379h = aVar.f9386g;
            this.f9380i = f9373j.incrementAndGet();
        }

        @Override // java.lang.Comparable
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return this.f9380i - cVar.f9380i;
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        private final int a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f9387b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f9388c;

        /* renamed from: d, reason: collision with root package name */
        private final long f9389d;

        /* renamed from: e, reason: collision with root package name */
        private final Throwable f9390e;

        /* loaded from: classes.dex */
        public static class a {
            private int a;

            /* renamed from: b, reason: collision with root package name */
            private byte[] f9391b;

            /* renamed from: c, reason: collision with root package name */
            private byte[] f9392c;

            /* renamed from: d, reason: collision with root package name */
            private long f9393d;

            /* renamed from: e, reason: collision with root package name */
            private Throwable f9394e;

            public a a(int i10) {
                this.a = i10;
                return this;
            }

            public a b(byte[] bArr) {
                this.f9392c = bArr;
                return this;
            }

            public a a(byte[] bArr) {
                this.f9391b = bArr;
                return this;
            }

            public a a(long j3) {
                this.f9393d = j3;
                return this;
            }

            public a a(Throwable th2) {
                this.f9394e = th2;
                return this;
            }

            public d a() {
                return new d(this);
            }
        }

        private d(a aVar) {
            this.a = aVar.a;
            this.f9387b = aVar.f9391b;
            this.f9388c = aVar.f9392c;
            this.f9389d = aVar.f9393d;
            this.f9390e = aVar.f9394e;
        }

        public static a a() {
            return new a();
        }

        public int b() {
            return this.a;
        }

        public int c() {
            Throwable th2 = this.f9390e;
            if (th2 == null) {
                return this.a;
            }
            throw th2;
        }

        public byte[] d() {
            Throwable th2 = this.f9390e;
            if (th2 == null) {
                return this.f9387b;
            }
            throw th2;
        }

        public long e() {
            return this.f9389d;
        }

        public byte[] f() {
            return this.f9388c;
        }
    }

    public zf(com.applovin.impl.sdk.k kVar) {
        this.f9371b = kVar;
    }

    public void a(c cVar) {
        if (cVar != null) {
            this.a.add(cVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }

    public void a() {
        for (int i10 = 0; i10 < ((Integer) this.f9371b.a(oj.S)).intValue(); i10++) {
            new b(this.a, i10, this.f9371b).start();
        }
    }
}
