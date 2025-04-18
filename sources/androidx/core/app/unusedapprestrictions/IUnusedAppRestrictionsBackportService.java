package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes3.dex */
public interface IUnusedAppRestrictionsBackportService extends IInterface {
    public static final String k8 = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService".replace('$', '.');

    /* loaded from: classes3.dex */
    public static class Default implements IUnusedAppRestrictionsBackportService {
        @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
        public final void C(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) {
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IUnusedAppRestrictionsBackportService {

        /* loaded from: classes3.dex */
        public static class Proxy implements IUnusedAppRestrictionsBackportService {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f18478a;

            @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
            public final void C(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IUnusedAppRestrictionsBackportService.k8);
                    obtain.writeStrongInterface(iUnusedAppRestrictionsBackportCallback);
                    this.f18478a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f18478a;
            }
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService, java.lang.Object, androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService$Stub$Proxy] */
        public static IUnusedAppRestrictionsBackportService R(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IUnusedAppRestrictionsBackportService.k8);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IUnusedAppRestrictionsBackportService)) {
                return (IUnusedAppRestrictionsBackportService) queryLocalInterface;
            }
            ?? obj = new Object();
            obj.f18478a = iBinder;
            return obj;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback$Stub$Proxy] */
        @Override // android.os.Binder
        public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback;
            String str = IUnusedAppRestrictionsBackportService.k8;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i2 != 1) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                iUnusedAppRestrictionsBackportCallback = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(IUnusedAppRestrictionsBackportCallback.j8);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof IUnusedAppRestrictionsBackportCallback)) {
                    ?? obj = new Object();
                    obj.f18477a = readStrongBinder;
                    iUnusedAppRestrictionsBackportCallback = obj;
                } else {
                    iUnusedAppRestrictionsBackportCallback = (IUnusedAppRestrictionsBackportCallback) queryLocalInterface;
                }
            }
            C(iUnusedAppRestrictionsBackportCallback);
            return true;
        }
    }

    void C(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback);
}
