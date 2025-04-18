package ki;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public class w extends o {
    @Override // ki.o
    public void a(b0 source, b0 target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        if (source.e().renameTo(target.e())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r0.f19953c == true) goto L10;
     */
    @Override // ki.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(ki.b0 r4) {
        /*
            r3 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.io.File r0 = r4.e()
            boolean r0 = r0.mkdir()
            if (r0 != 0) goto L33
            jb.t r0 = r3.e(r4)
            if (r0 == 0) goto L1b
            boolean r0 = r0.f19953c
            r1 = 1
            if (r0 != r1) goto L1b
            goto L1c
        L1b:
            r1 = 0
        L1c:
            if (r1 == 0) goto L1f
            return
        L1f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "failed to create directory: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.w.b(ki.b0):void");
    }

    @Override // ki.o
    public final void c(b0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (!Thread.interrupted()) {
            File e2 = path.e();
            if (!e2.delete() && e2.exists()) {
                throw new IOException("failed to delete " + path);
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    @Override // ki.o
    public jb.t e(b0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File e2 = path.e();
        boolean isFile = e2.isFile();
        boolean isDirectory = e2.isDirectory();
        long lastModified = e2.lastModified();
        long length = e2.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !e2.exists()) {
            return null;
        }
        return new jb.t(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null);
    }

    @Override // ki.o
    public final v f(b0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return new v(false, new RandomAccessFile(file.e(), CampaignEx.JSON_KEY_AD_R));
    }

    @Override // ki.o
    public final v g(b0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return new v(true, new RandomAccessFile(file.e(), "rw"));
    }

    @Override // ki.o
    public final k0 h(b0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return a6.k.M(file.e());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
