package z5;

import android.os.Parcel;
import com.google.vr.dynamite.client.INativeLibraryLoader;

/* renamed from: z5.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2974b extends com.google.ar.core.dependencies.c implements INativeLibraryLoader {
    @Override // com.google.vr.dynamite.client.INativeLibraryLoader
    public final int checkVersion(String str) {
        Parcel a6 = a();
        a6.writeString(str);
        Parcel b = b(2, a6);
        int readInt = b.readInt();
        b.recycle();
        return readInt;
    }

    @Override // com.google.vr.dynamite.client.INativeLibraryLoader
    public final long initializeAndLoadNativeLibrary(String str) {
        Parcel a6 = a();
        a6.writeString(str);
        Parcel b = b(1, a6);
        long readLong = b.readLong();
        b.recycle();
        return readLong;
    }
}
