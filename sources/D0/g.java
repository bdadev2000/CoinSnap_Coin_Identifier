package D0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class g extends Binder implements IInterface {
    public final /* synthetic */ MultiInstanceInvalidationService b;

    public g(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.b = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    public final void b(int i9, String[] strArr) {
        synchronized (this.b.f5147d) {
            try {
                String str = (String) this.b.f5146c.get(Integer.valueOf(i9));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = this.b.f5147d.beginBroadcast();
                for (int i10 = 0; i10 < beginBroadcast; i10++) {
                    try {
                        Integer num = (Integer) this.b.f5147d.getBroadcastCookie(i10);
                        int intValue = num.intValue();
                        String str2 = (String) this.b.f5146c.get(num);
                        if (i9 != intValue && str.equals(str2)) {
                            try {
                                ((b) this.b.f5147d.getBroadcastItem(i10)).b(strArr);
                            } catch (RemoteException e4) {
                                Log.w("ROOM", "Error invoking a remote callback", e4);
                            }
                        }
                    } finally {
                        this.b.f5147d.finishBroadcast();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int c(b bVar, String str) {
        if (str == null) {
            return 0;
        }
        synchronized (this.b.f5147d) {
            try {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.b;
                int i9 = multiInstanceInvalidationService.b + 1;
                multiInstanceInvalidationService.b = i9;
                if (multiInstanceInvalidationService.f5147d.register(bVar, Integer.valueOf(i9))) {
                    this.b.f5146c.put(Integer.valueOf(i9), str);
                    return i9;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.b;
                multiInstanceInvalidationService2.b--;
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, D0.b] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, D0.b] */
    @Override // android.os.Binder
    public final boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
        b bVar = null;
        b bVar2 = null;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 1598968902) {
                        return super.onTransact(i9, parcel, parcel2, i10);
                    }
                    parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                    return true;
                }
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                b(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                    bVar2 = (b) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.b = readStrongBinder;
                    bVar2 = obj;
                }
            }
            int readInt = parcel.readInt();
            synchronized (this.b.f5147d) {
                this.b.f5147d.unregister(bVar2);
                this.b.f5146c.remove(Integer.valueOf(readInt));
            }
            parcel2.writeNoException();
            return true;
        }
        parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof b)) {
                bVar = (b) queryLocalInterface2;
            } else {
                ?? obj2 = new Object();
                obj2.b = readStrongBinder2;
                bVar = obj2;
            }
        }
        int c9 = c(bVar, parcel.readString());
        parcel2.writeNoException();
        parcel2.writeInt(c9);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
