package com.bykv.vk.openvk.preload.geckox.g;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Lock> f13267a = new HashMap();
    private FileLock b;

    /* renamed from: c, reason: collision with root package name */
    private String f13268c;

    private a(String str, FileLock fileLock) {
        this.f13268c = str;
        this.b = fileLock;
    }

    public static a a(String str) throws Exception {
        Map<String, Lock> map = f13267a;
        synchronized (map) {
            try {
                Lock lock = map.get(str);
                if (lock == null) {
                    lock = new ReentrantLock();
                    map.put(str, lock);
                }
                if (!lock.tryLock()) {
                    return null;
                }
                try {
                    FileLock c9 = FileLock.c(str);
                    if (c9 == null) {
                        lock.unlock();
                        return null;
                    }
                    return new a(str, c9);
                } catch (Exception e4) {
                    lock.lock();
                    com.bykv.vk.openvk.preload.geckox.utils.b.a(new RuntimeException(e4));
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        Map<String, Lock> map = f13267a;
        synchronized (map) {
            try {
                try {
                    this.b.a();
                    this.b.b();
                    map.get(this.f13268c).unlock();
                } catch (Throwable th) {
                    f13267a.get(this.f13268c).unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
