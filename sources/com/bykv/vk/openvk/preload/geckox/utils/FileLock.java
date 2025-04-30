package com.bykv.vk.openvk.preload.geckox.utils;

import android.os.Process;
import com.mbridge.msdk.foundation.entity.o;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class FileLock {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Integer> f13327a = new HashMap();
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13328c;

    static {
        System.loadLibrary("file_lock_pg");
    }

    private FileLock(String str, int i9) {
        this.f13328c = str;
        this.b = i9;
    }

    public static FileLock a(String str) {
        try {
            int d2 = d(str);
            nLockFile(d2);
            return new FileLock(str, d2);
        } catch (Exception e4) {
            StringBuilder n2 = o.n("lock failed, file:", str, ", pid:");
            n2.append(Process.myPid());
            n2.append(" caused by:");
            n2.append(e4.getMessage());
            throw new RuntimeException(n2.toString());
        }
    }

    public static FileLock b(String str) {
        try {
            int d2 = d(str);
            if (nTryLock(d2)) {
                return new FileLock(str, d2);
            }
            return null;
        } catch (Exception e4) {
            StringBuilder n2 = o.n("try lock failed, file:", str, " caused by:");
            n2.append(e4.getMessage());
            throw new RuntimeException(n2.toString());
        }
    }

    public static FileLock c(String str) throws Exception {
        try {
            int d2 = d(str);
            if (!nTryLock(d2)) {
                new FileLock(str, d2).b();
                return null;
            }
            return new FileLock(str, d2);
        } catch (Exception e4) {
            StringBuilder n2 = o.n("try lock failed, file:", str, " caused by:");
            n2.append(e4.getMessage());
            throw new RuntimeException(n2.toString());
        }
    }

    private static int d(String str) throws Exception {
        Integer num;
        Map<String, Integer> map = f13327a;
        synchronized (map) {
            try {
                num = map.get(str);
                if (num == null) {
                    new File(str).getParentFile().mkdirs();
                    num = Integer.valueOf(nGetFD(str));
                    map.put(str, num);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return num.intValue();
    }

    private static native int nGetFD(String str) throws Exception;

    private static native void nLockFile(int i9) throws Exception;

    private static native void nLockFileSegment(int i9, int i10) throws Exception;

    private static native void nRelease(int i9) throws Exception;

    private static native boolean nTryLock(int i9) throws Exception;

    private static native void nUnlockFile(int i9) throws Exception;

    public static FileLock a(String str, int i9) {
        try {
            int d2 = d(str);
            nLockFileSegment(d2, i9);
            return new FileLock(str, d2);
        } catch (Exception e4) {
            StringBuilder n2 = o.n("lock segment failed, file:", str, " caused by:");
            n2.append(e4.getMessage());
            throw new RuntimeException(n2.toString());
        }
    }

    public final void b() {
        Integer remove;
        Map<String, Integer> map = f13327a;
        synchronized (map) {
            remove = map.remove(this.f13328c);
        }
        try {
            nRelease(remove.intValue());
        } catch (Exception e4) {
            throw new RuntimeException("release lock failed, file:" + this.f13328c + " caused by:" + e4.getMessage());
        }
    }

    public final void a() {
        try {
            nUnlockFile(this.b);
        } catch (Exception unused) {
            throw new RuntimeException("release lock failed，path:" + this.f13328c);
        }
    }
}
