package b2;

import android.util.Log;
import eb.j;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f2277e = new HashMap();
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final File f2278b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f2279c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f2280d;

    public a(File file, String name) {
        File file2;
        Lock lock;
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = false;
        if (file != null) {
            file2 = new File(file, j.k(name, ".lck"));
        } else {
            file2 = null;
        }
        this.f2278b = file2;
        HashMap hashMap = f2277e;
        synchronized (hashMap) {
            Object obj = hashMap.get(name);
            if (obj == null) {
                obj = new ReentrantLock();
                hashMap.put(name, obj);
            }
            lock = (Lock) obj;
        }
        this.f2279c = lock;
    }

    public final void a(boolean z10) {
        this.f2279c.lock();
        if (z10) {
            File file = this.f2278b;
            try {
                if (file != null) {
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    FileChannel channel = new FileOutputStream(file).getChannel();
                    channel.lock();
                    this.f2280d = channel;
                    return;
                }
                throw new IOException("No lock directory was provided.");
            } catch (IOException e2) {
                this.f2280d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e2);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f2280d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f2279c.unlock();
    }
}
