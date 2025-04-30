package z5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.vr.dynamite.client.ILoadedInstanceCreator;
import com.google.vr.dynamite.client.INativeLibraryLoader;
import com.google.vr.dynamite.client.IObjectWrapper;

/* renamed from: z5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2973a extends com.google.ar.core.dependencies.c implements ILoadedInstanceCreator {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.vr.dynamite.client.INativeLibraryLoader] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // com.google.vr.dynamite.client.ILoadedInstanceCreator
    public final INativeLibraryLoader newNativeLibraryLoader(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        ?? cVar;
        Parcel a6 = a();
        com.google.ar.core.dependencies.e.c(a6, iObjectWrapper);
        com.google.ar.core.dependencies.e.c(a6, iObjectWrapper2);
        Parcel b = b(1, a6);
        IBinder readStrongBinder = b.readStrongBinder();
        if (readStrongBinder == null) {
            cVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.dynamite.client.INativeLibraryLoader");
            if (queryLocalInterface instanceof INativeLibraryLoader) {
                cVar = (INativeLibraryLoader) queryLocalInterface;
            } else {
                cVar = new com.google.ar.core.dependencies.c(readStrongBinder, "com.google.vr.dynamite.client.INativeLibraryLoader");
            }
        }
        b.recycle();
        return cVar;
    }
}
