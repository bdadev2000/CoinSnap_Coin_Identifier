package com.bykv.vk.openvk.preload.geckox.g;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Lock> f13269a = new HashMap();
    private static ReentrantLock b = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    private String f13270c;

    /* renamed from: d, reason: collision with root package name */
    private FileLock f13271d;

    private b(String str, FileLock fileLock) {
        this.f13270c = str;
        this.f13271d = fileLock;
    }

    public static b a(String str) throws Exception {
        b.lock();
        try {
            FileLock a6 = FileLock.a(str);
            Map<String, Lock> map = f13269a;
            Lock lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
            lock.lock();
            return new b(str, a6);
        } catch (Exception e4) {
            b.unlock();
            throw e4;
        }
    }

    public final void a() {
        try {
            this.f13271d.a();
            this.f13271d.b();
            Lock lock = f13269a.get(this.f13270c);
            if (lock != null) {
                lock.unlock();
            }
        } finally {
            b.unlock();
        }
    }
}
