package com.bytedance.sdk.openadsdk.Sg;

import com.bytedance.sdk.component.utils.vc;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public abstract class YFl {
    protected boolean YFl = false;
    private final ExecutorService Sg = Executors.newSingleThreadExecutor();

    /* renamed from: com.bytedance.sdk.openadsdk.Sg.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class CallableC0103YFl implements Callable<Void> {
        private final File Sg;

        @Override // java.util.concurrent.Callable
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            YFl.this.Sg(this.Sg);
            return null;
        }

        private CallableC0103YFl(File file) {
            this.Sg = file;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(File file) throws IOException {
        if (this.YFl) {
            List<File> YFl = vc.YFl(file);
            YFl.toString();
            YFl(YFl);
        } else {
            try {
                vc.Sg(file);
            } catch (Throwable unused) {
            }
            YFl(vc.YFl(file.getParentFile()));
        }
    }

    public abstract void YFl(List<File> list);

    public abstract boolean YFl(long j3, int i10);

    public abstract boolean YFl(File file, long j3, int i10);

    public void YFl(File file) throws IOException {
        this.Sg.submit(new CallableC0103YFl(file));
    }

    public long Sg(List<File> list) {
        Iterator<File> it = list.iterator();
        long j3 = 0;
        while (it.hasNext()) {
            j3 += it.next().length();
        }
        return j3;
    }
}
