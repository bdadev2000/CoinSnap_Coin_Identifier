package androidx.sqlite.util;

import android.util.Log;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@RestrictTo
/* loaded from: classes3.dex */
public final class ProcessLock {
    public static final HashMap e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21497a;

    /* renamed from: b, reason: collision with root package name */
    public final File f21498b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f21499c;
    public FileChannel d;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public ProcessLock(String str, File file, boolean z2) {
        Lock lock;
        this.f21497a = z2;
        this.f21498b = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap hashMap = e;
        synchronized (hashMap) {
            try {
                Object obj = hashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    hashMap.put(str, obj);
                }
                lock = (Lock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f21499c = lock;
    }

    public final void a(boolean z2) {
        this.f21499c.lock();
        if (z2) {
            File file = this.f21498b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.d = channel;
            } catch (IOException e2) {
                this.d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e2);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f21499c.unlock();
    }
}
