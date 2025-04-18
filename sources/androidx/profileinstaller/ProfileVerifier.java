package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.ResolvableFuture;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ProfileVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final ResolvableFuture f20895a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f20896b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static CompilationStatus f20897c = null;

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api33Impl {
        @DoNotInline
        public static PackageInfo a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    @RestrictTo
    /* loaded from: classes2.dex */
    public static class Cache {

        /* renamed from: a, reason: collision with root package name */
        public final int f20898a;

        /* renamed from: b, reason: collision with root package name */
        public final int f20899b;

        /* renamed from: c, reason: collision with root package name */
        public final long f20900c;
        public final long d;

        public Cache(int i2, int i3, long j2, long j3) {
            this.f20898a = i2;
            this.f20899b = i3;
            this.f20900c = j2;
            this.d = j3;
        }

        public static Cache a(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                Cache cache = new Cache(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return cache;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public final void b(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f20898a);
                dataOutputStream.writeInt(this.f20899b);
                dataOutputStream.writeLong(this.f20900c);
                dataOutputStream.writeLong(this.d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof Cache)) {
                return false;
            }
            Cache cache = (Cache) obj;
            return this.f20899b == cache.f20899b && this.f20900c == cache.f20900c && this.f20898a == cache.f20898a && this.d == cache.d;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.f20899b), Long.valueOf(this.f20900c), Integer.valueOf(this.f20898a), Long.valueOf(this.d));
        }
    }

    /* loaded from: classes2.dex */
    public static class CompilationStatus {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        /* loaded from: classes2.dex */
        public @interface ResultCode {
        }
    }

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? Api33Impl.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.profileinstaller.ProfileVerifier$CompilationStatus] */
    public static CompilationStatus b() {
        ?? obj = new Object();
        f20897c = obj;
        f20895a.set(obj);
        return f20897c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:24|25|26|(2:64|65)(1:28)|29|(8:36|(1:40)|(1:59)(1:47)|48|(2:55|56)|52|53|54)|(1:63)|(1:40)|(1:42)|59|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009d, code lost:
    
        r4 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.ProfileVerifier.c(android.content.Context, boolean):void");
    }
}
