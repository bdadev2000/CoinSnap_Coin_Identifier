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
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes4.dex */
public final class e {
    private static volatile AtomicInteger a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    private ThreadPoolExecutor f13371b;

    /* loaded from: classes4.dex */
    public static final class b {
        private static e a = new e();
    }

    public static e a() {
        return b.a;
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
        this.f13371b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public final String a(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        byte[] bArr2 = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
        while (true) {
            int read = gZIPInputStream.read(bArr2, 0, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
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

    public final void a(String str, int i10, String str2, boolean z10, com.mbridge.msdk.foundation.same.net.b bVar) {
        final a aVar = new a(str, i10, str2, z10, bVar);
        this.f13371b.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.net.e.2
            @Override // java.lang.Runnable
            public final void run() {
                aVar.a();
            }
        });
    }

    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: b, reason: collision with root package name */
        private ByteBuffer f13373b;

        /* renamed from: c, reason: collision with root package name */
        private String f13374c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f13375d;

        /* renamed from: e, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.net.b f13376e;

        /* renamed from: f, reason: collision with root package name */
        private OutputStream f13377f;

        /* renamed from: g, reason: collision with root package name */
        private int f13378g;

        /* renamed from: h, reason: collision with root package name */
        private Socket f13379h;

        /* renamed from: i, reason: collision with root package name */
        private String f13380i;

        public a(String str, int i10, String str2, boolean z10, com.mbridge.msdk.foundation.same.net.b bVar) {
            this.f13374c = str;
            this.f13378g = i10;
            this.f13380i = str2;
            this.f13375d = z10;
            this.f13376e = bVar;
        }

        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Removed duplicated region for block: B:103:0x0153  */
        /* JADX WARN: Removed duplicated region for block: B:104:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:105:0x00c4 A[Catch: all -> 0x02a4, TryCatch #2 {all -> 0x02a4, blocks: (B:3:0x0010, B:5:0x0030, B:9:0x0042, B:11:0x008a, B:12:0x009c, B:14:0x00b2, B:15:0x0107, B:21:0x0154, B:25:0x018a, B:28:0x0197, B:43:0x01b8, B:55:0x01e1, B:68:0x0203, B:70:0x0207, B:81:0x0215, B:89:0x0291, B:99:0x027b, B:102:0x028e, B:105:0x00c4, B:107:0x00c8, B:110:0x00f1, B:111:0x00d2, B:112:0x00eb, B:113:0x0090, B:116:0x0099, B:84:0x0235, B:85:0x0242, B:87:0x0248, B:88:0x024f, B:97:0x023c), top: B:2:0x0010, outer: #7, inners: #6 }] */
        /* JADX WARN: Removed duplicated region for block: B:113:0x0090 A[Catch: all -> 0x02a4, TryCatch #2 {all -> 0x02a4, blocks: (B:3:0x0010, B:5:0x0030, B:9:0x0042, B:11:0x008a, B:12:0x009c, B:14:0x00b2, B:15:0x0107, B:21:0x0154, B:25:0x018a, B:28:0x0197, B:43:0x01b8, B:55:0x01e1, B:68:0x0203, B:70:0x0207, B:81:0x0215, B:89:0x0291, B:99:0x027b, B:102:0x028e, B:105:0x00c4, B:107:0x00c8, B:110:0x00f1, B:111:0x00d2, B:112:0x00eb, B:113:0x0090, B:116:0x0099, B:84:0x0235, B:85:0x0242, B:87:0x0248, B:88:0x024f, B:97:0x023c), top: B:2:0x0010, outer: #7, inners: #6 }] */
        /* JADX WARN: Removed duplicated region for block: B:11:0x008a A[Catch: all -> 0x02a4, TryCatch #2 {all -> 0x02a4, blocks: (B:3:0x0010, B:5:0x0030, B:9:0x0042, B:11:0x008a, B:12:0x009c, B:14:0x00b2, B:15:0x0107, B:21:0x0154, B:25:0x018a, B:28:0x0197, B:43:0x01b8, B:55:0x01e1, B:68:0x0203, B:70:0x0207, B:81:0x0215, B:89:0x0291, B:99:0x027b, B:102:0x028e, B:105:0x00c4, B:107:0x00c8, B:110:0x00f1, B:111:0x00d2, B:112:0x00eb, B:113:0x0090, B:116:0x0099, B:84:0x0235, B:85:0x0242, B:87:0x0248, B:88:0x024f, B:97:0x023c), top: B:2:0x0010, outer: #7, inners: #6 }] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00b2 A[Catch: all -> 0x02a4, TryCatch #2 {all -> 0x02a4, blocks: (B:3:0x0010, B:5:0x0030, B:9:0x0042, B:11:0x008a, B:12:0x009c, B:14:0x00b2, B:15:0x0107, B:21:0x0154, B:25:0x018a, B:28:0x0197, B:43:0x01b8, B:55:0x01e1, B:68:0x0203, B:70:0x0207, B:81:0x0215, B:89:0x0291, B:99:0x027b, B:102:0x028e, B:105:0x00c4, B:107:0x00c8, B:110:0x00f1, B:111:0x00d2, B:112:0x00eb, B:113:0x0090, B:116:0x0099, B:84:0x0235, B:85:0x0242, B:87:0x0248, B:88:0x024f, B:97:0x023c), top: B:2:0x0010, outer: #7, inners: #6 }] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x014b  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0151  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x019b  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x01b4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                Method dump skipped, instructions count: 751
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.e.a.a():void");
        }

        private void a(String str) {
            if (this.f13376e != null) {
                if (TextUtils.isEmpty(str)) {
                    str = "Unknown exception";
                }
                this.f13376e.onError(new com.mbridge.msdk.foundation.same.net.a.a(13, new com.mbridge.msdk.foundation.same.net.d.a(404, str.getBytes(), null)));
            }
        }
    }
}
