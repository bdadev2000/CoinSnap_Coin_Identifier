package com.mbridge.msdk.foundation.same.net;

import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static volatile AtomicInteger f15782a = new AtomicInteger(1);
    private ThreadPoolExecutor b;

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static e f15793a = new e();
    }

    public static e a() {
        return b.f15793a;
    }

    private e() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.net.e.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                newThread.setName("SocketThreadPool");
                return newThread;
            }
        }, new ThreadPoolExecutor.DiscardPolicy());
        this.b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public final String a(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        byte[] bArr2 = new byte[1024];
        while (true) {
            int read = gZIPInputStream.read(bArr2, 0, 1024);
            if (read > 0) {
                byteArrayOutputStream.write(bArr2, 0, read);
            } else {
                gZIPInputStream.close();
                byteArrayInputStream.close();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toString();
            }
        }
    }

    public final void a(String str, int i9, String str2, boolean z8, com.mbridge.msdk.foundation.same.net.b bVar) {
        final a aVar = new a(str, i9, str2, z8, bVar);
        this.b.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.net.e.2
            @Override // java.lang.Runnable
            public final void run() {
                aVar.a();
            }
        });
    }

    /* loaded from: classes3.dex */
    public class a {
        private ByteBuffer b;

        /* renamed from: c, reason: collision with root package name */
        private String f15786c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f15787d;

        /* renamed from: e, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.net.b f15788e;

        /* renamed from: f, reason: collision with root package name */
        private OutputStream f15789f;

        /* renamed from: g, reason: collision with root package name */
        private int f15790g;

        /* renamed from: h, reason: collision with root package name */
        private Socket f15791h;

        /* renamed from: i, reason: collision with root package name */
        private String f15792i;

        public a(String str, int i9, String str2, boolean z8, com.mbridge.msdk.foundation.same.net.b bVar) {
            this.f15786c = str;
            this.f15790g = i9;
            this.f15792i = str2;
            this.f15787d = z8;
            this.f15788e = bVar;
        }

        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Removed duplicated region for block: B:104:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:105:0x0151  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x00c7 A[Catch: all -> 0x0041, TryCatch #5 {all -> 0x0041, blocks: (B:3:0x0010, B:5:0x0030, B:9:0x0045, B:11:0x008d, B:12:0x009f, B:14:0x00b5, B:15:0x010a, B:21:0x0158, B:25:0x018e, B:28:0x019b, B:43:0x01bc, B:55:0x01e5, B:68:0x0207, B:70:0x020b, B:81:0x0219, B:89:0x0296, B:100:0x0280, B:103:0x0293, B:106:0x00c7, B:108:0x00cb, B:111:0x00f4, B:112:0x00d5, B:113:0x00ee, B:114:0x0093, B:117:0x009c, B:84:0x0239, B:85:0x0248, B:87:0x024e, B:88:0x0255, B:97:0x0242), top: B:2:0x0010, outer: #0, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:114:0x0093 A[Catch: all -> 0x0041, TryCatch #5 {all -> 0x0041, blocks: (B:3:0x0010, B:5:0x0030, B:9:0x0045, B:11:0x008d, B:12:0x009f, B:14:0x00b5, B:15:0x010a, B:21:0x0158, B:25:0x018e, B:28:0x019b, B:43:0x01bc, B:55:0x01e5, B:68:0x0207, B:70:0x020b, B:81:0x0219, B:89:0x0296, B:100:0x0280, B:103:0x0293, B:106:0x00c7, B:108:0x00cb, B:111:0x00f4, B:112:0x00d5, B:113:0x00ee, B:114:0x0093, B:117:0x009c, B:84:0x0239, B:85:0x0248, B:87:0x024e, B:88:0x0255, B:97:0x0242), top: B:2:0x0010, outer: #0, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:11:0x008d A[Catch: all -> 0x0041, TryCatch #5 {all -> 0x0041, blocks: (B:3:0x0010, B:5:0x0030, B:9:0x0045, B:11:0x008d, B:12:0x009f, B:14:0x00b5, B:15:0x010a, B:21:0x0158, B:25:0x018e, B:28:0x019b, B:43:0x01bc, B:55:0x01e5, B:68:0x0207, B:70:0x020b, B:81:0x0219, B:89:0x0296, B:100:0x0280, B:103:0x0293, B:106:0x00c7, B:108:0x00cb, B:111:0x00f4, B:112:0x00d5, B:113:0x00ee, B:114:0x0093, B:117:0x009c, B:84:0x0239, B:85:0x0248, B:87:0x024e, B:88:0x0255, B:97:0x0242), top: B:2:0x0010, outer: #0, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00b5 A[Catch: all -> 0x0041, TryCatch #5 {all -> 0x0041, blocks: (B:3:0x0010, B:5:0x0030, B:9:0x0045, B:11:0x008d, B:12:0x009f, B:14:0x00b5, B:15:0x010a, B:21:0x0158, B:25:0x018e, B:28:0x019b, B:43:0x01bc, B:55:0x01e5, B:68:0x0207, B:70:0x020b, B:81:0x0219, B:89:0x0296, B:100:0x0280, B:103:0x0293, B:106:0x00c7, B:108:0x00cb, B:111:0x00f4, B:112:0x00d5, B:113:0x00ee, B:114:0x0093, B:117:0x009c, B:84:0x0239, B:85:0x0248, B:87:0x024e, B:88:0x0255, B:97:0x0242), top: B:2:0x0010, outer: #0, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0155  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x019f  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x01b8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                Method dump skipped, instructions count: 755
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.e.a.a():void");
        }

        private void a(String str) {
            if (this.f15788e != null) {
                if (TextUtils.isEmpty(str)) {
                    str = "Unknown exception";
                }
                this.f15788e.onError(new com.mbridge.msdk.foundation.same.net.a.a(13, new com.mbridge.msdk.foundation.same.net.d.a(404, str.getBytes(), null)));
            }
        }
    }
}
