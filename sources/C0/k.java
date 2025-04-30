package C0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f414a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final long f415c;

    /* renamed from: d, reason: collision with root package name */
    public final long f416d;

    public k(int i9, int i10, long j7, long j9) {
        this.f414a = i9;
        this.b = i10;
        this.f415c = j7;
        this.f416d = j9;
    }

    public static k a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            k kVar = new k(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return kVar;
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
            dataOutputStream.writeInt(this.f414a);
            dataOutputStream.writeInt(this.b);
            dataOutputStream.writeLong(this.f415c);
            dataOutputStream.writeLong(this.f416d);
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
        if (obj == null || !(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.b == kVar.b && this.f415c == kVar.f415c && this.f414a == kVar.f414a && this.f416d == kVar.f416d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Long.valueOf(this.f415c), Integer.valueOf(this.f414a), Long.valueOf(this.f416d));
    }
}
