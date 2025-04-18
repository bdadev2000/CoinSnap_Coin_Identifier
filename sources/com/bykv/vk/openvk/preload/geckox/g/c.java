package com.bykv.vk.openvk.preload.geckox.g;

import android.os.Process;
import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class c {
    private static final Map<String, Pair<FileLock, AtomicLong>> a = new HashMap();

    public static void a(String str) throws Exception {
        Map<String, Pair<FileLock, AtomicLong>> map = a;
        synchronized (map) {
            Pair<FileLock, AtomicLong> pair = map.get(str);
            if (pair == null) {
                Pair<FileLock, AtomicLong> pair2 = new Pair<>(FileLock.a(str, Process.myPid()), new AtomicLong(0L));
                map.put(str, pair2);
                pair = pair2;
            }
            ((AtomicLong) pair.second).incrementAndGet();
        }
    }

    public static void b(String str) throws Exception {
        Map<String, Pair<FileLock, AtomicLong>> map = a;
        synchronized (map) {
            Pair<FileLock, AtomicLong> pair = map.get(str);
            if (pair != null) {
                long decrementAndGet = ((AtomicLong) pair.second).decrementAndGet();
                if (decrementAndGet >= 0) {
                    if (decrementAndGet == 0) {
                        ((FileLock) pair.first).a();
                        map.remove(str);
                    }
                } else {
                    throw new RuntimeException("using.lock count illegal");
                }
            } else {
                throw new RuntimeException("using.lock illegal state");
            }
        }
    }

    public static void c(String str) throws Exception {
        Map<String, Pair<FileLock, AtomicLong>> map = a;
        synchronized (map) {
            FileLock b3 = FileLock.b(str);
            if (b3 == null) {
                return;
            }
            Pair<FileLock, AtomicLong> pair = map.get(str);
            if (pair != null && ((AtomicLong) pair.second).get() != 0) {
                b3.a();
                FileLock.a(str, Process.myPid());
                return;
            }
            File parentFile = new File(str).getParentFile();
            final File file = new File(parentFile.getAbsolutePath() + "--pending-delete");
            if (parentFile.renameTo(file)) {
                b3.a();
                b3.b();
                e.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.g.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.bykv.vk.openvk.preload.geckox.utils.c.a(file);
                    }
                });
            }
        }
    }
}
