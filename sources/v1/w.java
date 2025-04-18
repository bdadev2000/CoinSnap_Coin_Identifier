package v1;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w extends Binder implements n {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f25955c = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f25956b;

    public w(y yVar) {
        this.f25956b = yVar;
        attachInterface(this, n.f25927h8);
    }

    @Override // v1.n
    public final void a(String[] tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        y yVar = this.f25956b;
        yVar.f25960c.execute(new h.o0(6, yVar, tables));
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String str = n.f25927h8;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i10 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i10 != 1) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        a(parcel.createStringArray());
        return true;
    }
}
