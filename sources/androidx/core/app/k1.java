package androidx.core.app;

import android.app.Notification;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class k1 implements o1 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1202b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1203c;

    /* renamed from: d, reason: collision with root package name */
    public final Notification f1204d;

    public k1(String str, int i10, String str2, Notification notification) {
        this.a = str;
        this.f1202b = i10;
        this.f1203c = str2;
        this.f1204d = notification;
    }

    public final void a(c.c cVar) {
        String str = this.a;
        int i10 = this.f1202b;
        String str2 = this.f1203c;
        c.a aVar = (c.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(c.c.X7);
            obtain.writeString(str);
            obtain.writeInt(i10);
            obtain.writeString(str2);
            Notification notification = this.f1204d;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            aVar.f2514b.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.a);
        sb2.append(", id:");
        sb2.append(this.f1202b);
        sb2.append(", tag:");
        return vd.e.h(sb2, this.f1203c, "]");
    }
}
