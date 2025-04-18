package com.bykv.vk.openvk.preload.geckox.g;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class b {
    private static final Map<String, Lock> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static ReentrantLock f10093b = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    private String f10094c;

    /* renamed from: d, reason: collision with root package name */
    private FileLock f10095d;

    private b(String str, FileLock fileLock) {
        this.f10094c = str;
        this.f10095d = fileLock;
    }

    public static b a(String str) throws Exception {
        f10093b.lock();
        try {
            FileLock a10 = FileLock.a(str);
            Map<String, Lock> map = a;
            Lock lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
            lock.lock();
            return new b(str, a10);
        } catch (Exception e2) {
            f10093b.unlock();
            throw e2;
        }
    }

    public final void a() {
        try {
            this.f10095d.a();
            this.f10095d.b();
            Lock lock = a.get(this.f10094c);
            if (lock != null) {
                lock.unlock();
            }
        } finally {
            f10093b.unlock();
        }
    }
}
