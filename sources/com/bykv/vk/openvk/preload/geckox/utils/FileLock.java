package com.bykv.vk.openvk.preload.geckox.utils;

import android.os.Process;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class FileLock {
    private static final Map<String, Integer> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final int f10142b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10143c;

    static {
        System.loadLibrary("file_lock_pg");
    }

    private FileLock(String str, int i10) {
        this.f10143c = str;
        this.f10142b = i10;
    }

    public static FileLock a(String str) {
        try {
            int d10 = d(str);
            nLockFile(d10);
            return new FileLock(str, d10);
        } catch (Exception e2) {
            StringBuilder o10 = a4.j.o("lock failed, file:", str, ", pid:");
            o10.append(Process.myPid());
            o10.append(" caused by:");
            o10.append(e2.getMessage());
            throw new RuntimeException(o10.toString());
        }
    }

    public static FileLock b(String str) {
        try {
            int d10 = d(str);
            if (nTryLock(d10)) {
                return new FileLock(str, d10);
            }
            return null;
        } catch (Exception e2) {
            StringBuilder o10 = a4.j.o("try lock failed, file:", str, " caused by:");
            o10.append(e2.getMessage());
            throw new RuntimeException(o10.toString());
        }
    }

    public static FileLock c(String str) throws Exception {
        try {
            int d10 = d(str);
            if (!nTryLock(d10)) {
                new FileLock(str, d10).b();
                return null;
            }
            return new FileLock(str, d10);
        } catch (Exception e2) {
            StringBuilder o10 = a4.j.o("try lock failed, file:", str, " caused by:");
            o10.append(e2.getMessage());
            throw new RuntimeException(o10.toString());
        }
    }

    private static int d(String str) throws Exception {
        Integer num;
        Map<String, Integer> map = a;
        synchronized (map) {
            num = map.get(str);
            if (num == null) {
                new File(str).getParentFile().mkdirs();
                num = Integer.valueOf(nGetFD(str));
                map.put(str, num);
            }
        }
        return num.intValue();
    }

    private static native int nGetFD(String str) throws Exception;

    private static native void nLockFile(int i10) throws Exception;

    private static native void nLockFileSegment(int i10, int i11) throws Exception;

    private static native void nRelease(int i10) throws Exception;

    private static native boolean nTryLock(int i10) throws Exception;

    private static native void nUnlockFile(int i10) throws Exception;

    public static FileLock a(String str, int i10) {
        try {
            int d10 = d(str);
            nLockFileSegment(d10, i10);
            return new FileLock(str, d10);
        } catch (Exception e2) {
            StringBuilder o10 = a4.j.o("lock segment failed, file:", str, " caused by:");
            o10.append(e2.getMessage());
            throw new RuntimeException(o10.toString());
        }
    }

    public final void b() {
        Integer remove;
        Map<String, Integer> map = a;
        synchronized (map) {
            remove = map.remove(this.f10143c);
        }
        try {
            nRelease(remove.intValue());
        } catch (Exception e2) {
            throw new RuntimeException("release lock failed, file:" + this.f10143c + " caused by:" + e2.getMessage());
        }
    }

    public final void a() {
        try {
            nUnlockFile(this.f10142b);
        } catch (Exception unused) {
            throw new RuntimeException("release lock failed，path:" + this.f10143c);
        }
    }
}
