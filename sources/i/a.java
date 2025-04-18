package i;

import android.os.StatFs;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.File;
import okio.FileSystem;
import okio.Path;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public Path f30764a;

    /* renamed from: b, reason: collision with root package name */
    public FileSystem f30765b;

    /* renamed from: c, reason: collision with root package name */
    public double f30766c;
    public long d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public h1.c f30767f;

    public final n a() {
        long j2;
        Path path = this.f30764a;
        if (path == null) {
            throw new IllegalStateException("directory == null".toString());
        }
        double d = this.f30766c;
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            try {
                File file = path.toFile();
                file.mkdir();
                StatFs statFs = new StatFs(file.getAbsolutePath());
                j2 = p0.a.B((long) (d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.d, this.e);
            } catch (Exception unused) {
                j2 = this.d;
            }
        } else {
            j2 = 0;
        }
        return new n(j2, path, this.f30765b, this.f30767f);
    }
}
