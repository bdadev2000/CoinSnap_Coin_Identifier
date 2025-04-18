package v1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z extends Binder implements p {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f25969c = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f25970b;

    public z(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f25970b = multiInstanceInvalidationService;
        attachInterface(this, p.f25929i8);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // v1.p
    public final int b(n callback, String str) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        int i10 = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f25970b;
        synchronized (multiInstanceInvalidationService.f2101d) {
            int i11 = multiInstanceInvalidationService.f2099b + 1;
            multiInstanceInvalidationService.f2099b = i11;
            if (multiInstanceInvalidationService.f2101d.register(callback, Integer.valueOf(i11))) {
                multiInstanceInvalidationService.f2100c.put(Integer.valueOf(i11), str);
                i10 = i11;
            } else {
                multiInstanceInvalidationService.f2099b--;
            }
        }
        return i10;
    }

    @Override // v1.p
    public final void c(int i10, String[] tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f25970b;
        synchronized (multiInstanceInvalidationService.f2101d) {
            String str = (String) multiInstanceInvalidationService.f2100c.get(Integer.valueOf(i10));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int beginBroadcast = multiInstanceInvalidationService.f2101d.beginBroadcast();
            for (int i11 = 0; i11 < beginBroadcast; i11++) {
                try {
                    Object broadcastCookie = multiInstanceInvalidationService.f2101d.getBroadcastCookie(i11);
                    Intrinsics.checkNotNull(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                    int intValue = ((Integer) broadcastCookie).intValue();
                    String str2 = (String) multiInstanceInvalidationService.f2100c.get(Integer.valueOf(intValue));
                    if (i10 != intValue && Intrinsics.areEqual(str, str2)) {
                        try {
                            ((n) multiInstanceInvalidationService.f2101d.getBroadcastItem(i11)).a(tables);
                        } catch (RemoteException e2) {
                            Log.w("ROOM", "Error invoking a remote callback", e2);
                        }
                    }
                } catch (Throwable th2) {
                    multiInstanceInvalidationService.f2101d.finishBroadcast();
                    throw th2;
                }
            }
            multiInstanceInvalidationService.f2101d.finishBroadcast();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // android.os.Binder
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String str = p.f25929i8;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i10 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        n callback = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                c(parcel.readInt(), parcel.createStringArray());
            } else {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(n.f25927h8);
                    if (queryLocalInterface != null && (queryLocalInterface instanceof n)) {
                        callback = (n) queryLocalInterface;
                    } else {
                        callback = new m(readStrongBinder);
                    }
                }
                int readInt = parcel.readInt();
                Intrinsics.checkNotNullParameter(callback, "callback");
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f25970b;
                synchronized (multiInstanceInvalidationService.f2101d) {
                    multiInstanceInvalidationService.f2101d.unregister(callback);
                }
                parcel2.writeNoException();
            }
        } else {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(n.f25927h8);
                if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof n)) {
                    callback = (n) queryLocalInterface2;
                } else {
                    callback = new m(readStrongBinder2);
                }
            }
            int b3 = b(callback, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(b3);
        }
        return true;
    }
}
