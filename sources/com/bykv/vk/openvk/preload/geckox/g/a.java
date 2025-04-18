package com.bykv.vk.openvk.preload.geckox.g;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class a {
    private static final Map<String, Lock> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private FileLock f10091b;

    /* renamed from: c, reason: collision with root package name */
    private String f10092c;

    private a(String str, FileLock fileLock) {
        this.f10092c = str;
        this.f10091b = fileLock;
    }

    public static a a(String str) throws Exception {
        Map<String, Lock> map = a;
        synchronized (map) {
            Lock lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
            if (!lock.tryLock()) {
                return null;
            }
            try {
                FileLock c10 = FileLock.c(str);
                if (c10 == null) {
                    lock.unlock();
                    return null;
                }
                return new a(str, c10);
            } catch (Exception e2) {
                lock.lock();
                com.bykv.vk.openvk.preload.geckox.utils.b.a(new RuntimeException(e2));
                return null;
            }
        }
    }

    public final void a() {
        Map<String, Lock> map = a;
        synchronized (map) {
            try {
                this.f10091b.a();
                this.f10091b.b();
                map.get(this.f10092c).unlock();
            } catch (Throwable th2) {
                a.get(this.f10092c).unlock();
                throw th2;
            }
        }
    }
}
