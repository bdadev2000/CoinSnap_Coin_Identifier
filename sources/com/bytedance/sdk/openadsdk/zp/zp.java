package com.bytedance.sdk.openadsdk.zp;

import com.bytedance.sdk.component.utils.HWF;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public abstract class zp {
    private final ExecutorService zp = Executors.newSingleThreadExecutor();

    /* renamed from: com.bytedance.sdk.openadsdk.zp.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class CallableC0128zp implements Callable<Void> {
        private final File lMd;

        @Override // java.util.concurrent.Callable
        /* renamed from: zp, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            zp.this.lMd(this.lMd);
            return null;
        }

        private CallableC0128zp(File file) {
            this.lMd = file;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(File file) throws IOException {
        try {
            HWF.lMd(file);
        } catch (Throwable unused) {
        }
        zp(HWF.zp(file.getParentFile()));
    }

    public abstract void zp(List<File> list);

    public abstract boolean zp(long j7, int i9);

    public abstract boolean zp(File file, long j7, int i9);

    public void zp(File file) throws IOException {
        this.zp.submit(new CallableC0128zp(file));
    }

    public long lMd(List<File> list) {
        Iterator<File> it = list.iterator();
        long j7 = 0;
        while (it.hasNext()) {
            j7 += it.next().length();
        }
        return j7;
    }
}
