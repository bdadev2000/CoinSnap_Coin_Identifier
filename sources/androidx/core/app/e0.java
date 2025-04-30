package androidx.core.app;

import android.app.Notification;
import android.os.Parcel;
import d.C2153a;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class e0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4388a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4389c;

    /* renamed from: d, reason: collision with root package name */
    public final Notification f4390d;

    public e0(String str, int i9, String str2, Notification notification) {
        this.f4388a = str;
        this.b = i9;
        this.f4389c = str2;
        this.f4390d = notification;
    }

    public final void a(d.c cVar) {
        String str = this.f4388a;
        int i9 = this.b;
        String str2 = this.f4389c;
        C2153a c2153a = (C2153a) cVar;
        c2153a.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(d.c.f19778d8);
            obtain.writeString(str);
            obtain.writeInt(i9);
            obtain.writeString(str2);
            Notification notification = this.f4390d;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            c2153a.b.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.f4388a);
        sb.append(", id:");
        sb.append(this.b);
        sb.append(", tag:");
        return AbstractC2914a.h(sb, this.f4389c, "]");
    }
}
