package u1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25436b;

    /* renamed from: c, reason: collision with root package name */
    public final long f25437c;

    /* renamed from: d, reason: collision with root package name */
    public final long f25438d;

    public i(int i10, int i11, long j3, long j10) {
        this.a = i10;
        this.f25436b = i11;
        this.f25437c = j3;
        this.f25438d = j10;
    }

    public static i a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            i iVar = new i(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return iVar;
        } catch (Throwable th2) {
            try {
                dataInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.a);
            dataOutputStream.writeInt(this.f25436b);
            dataOutputStream.writeLong(this.f25437c);
            dataOutputStream.writeLong(this.f25438d);
            dataOutputStream.close();
        } catch (Throwable th2) {
            try {
                dataOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f25436b == iVar.f25436b && this.f25437c == iVar.f25437c && this.a == iVar.a && this.f25438d == iVar.f25438d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f25436b), Long.valueOf(this.f25437c), Integer.valueOf(this.a), Long.valueOf(this.f25438d));
    }
}
