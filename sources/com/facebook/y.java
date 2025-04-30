package com.facebook;

import android.content.Intent;
import android.content.IntentSender;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.facebook.login.C1851b;
import e.BinderC2197c;
import e.C2198d;
import e.InterfaceC2196b;
import e5.C2221a;
import h.C2310a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import u7.AbstractC2829t;
import v1.C2845f;

/* loaded from: classes.dex */
public final class y implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13845a;

    public /* synthetic */ y(int i9) {
        this.f13845a = i9;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, e.d] */
    /* JADX WARN: Type inference failed for: r0v28, types: [android.view.View$BaseSavedState, q.M, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [android.view.View$BaseSavedState, v1.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.facebook.login.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.facebook.login.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [e.a, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        LinkedHashMap d02;
        com.facebook.login.z zVar;
        LinkedHashMap linkedHashMap = null;
        Intent intent = null;
        InterfaceC2196b interfaceC2196b = null;
        boolean z8 = false;
        switch (this.f13845a) {
            case 0:
                G7.j.e(parcel, "source");
                return new z(parcel);
            case 1:
                G7.j.e(parcel, "source");
                return new I(parcel);
            case 2:
                G7.j.e(parcel, "source");
                return new C1851b(parcel);
            case 3:
                G7.j.e(parcel, "parcel");
                ?? obj = new Object();
                obj.b = parcel.readString();
                obj.f13710c = parcel.readString();
                obj.f13711d = parcel.readString();
                obj.f13712f = parcel.readLong();
                obj.f13713g = parcel.readLong();
                return obj;
            case 4:
                G7.j.e(parcel, "source");
                return new com.facebook.login.k(parcel);
            case 5:
                G7.j.e(parcel, "source");
                return new com.facebook.login.m(parcel);
            case 6:
                G7.j.e(parcel, "source");
                return new com.facebook.login.n(parcel);
            case 7:
                G7.j.e(parcel, "source");
                return new com.facebook.login.o(parcel);
            case 8:
                G7.j.e(parcel, "source");
                ?? obj2 = new Object();
                obj2.f13770c = -1;
                Parcelable[] readParcelableArray = parcel.readParcelableArray(com.facebook.login.z.class.getClassLoader());
                if (readParcelableArray == null) {
                    readParcelableArray = new Parcelable[0];
                }
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : readParcelableArray) {
                    if (parcelable instanceof com.facebook.login.z) {
                        zVar = (com.facebook.login.z) parcelable;
                    } else {
                        zVar = null;
                    }
                    if (zVar != null) {
                        zVar.f13788c = obj2;
                    }
                    if (zVar != null) {
                        arrayList.add(zVar);
                    }
                }
                Object[] array = arrayList.toArray(new com.facebook.login.z[0]);
                if (array != null) {
                    obj2.b = (com.facebook.login.z[]) array;
                    obj2.f13770c = parcel.readInt();
                    obj2.f13775i = (com.facebook.login.q) parcel.readParcelable(com.facebook.login.q.class.getClassLoader());
                    HashMap I5 = com.facebook.internal.H.I(parcel);
                    if (I5 == null) {
                        d02 = null;
                    } else {
                        d02 = AbstractC2829t.d0(I5);
                    }
                    obj2.f13776j = d02;
                    HashMap I7 = com.facebook.internal.H.I(parcel);
                    if (I7 != null) {
                        linkedHashMap = AbstractC2829t.d0(I7);
                    }
                    obj2.f13777k = linkedHashMap;
                    return obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            case 9:
                G7.j.e(parcel, "source");
                return new com.facebook.login.q(parcel);
            case 10:
                G7.j.e(parcel, "source");
                return new com.facebook.login.s(parcel);
            case 11:
                G7.j.e(parcel, "source");
                return new com.facebook.login.C(parcel);
            case 12:
                return new com.google.android.material.datepicker.b((com.google.android.material.datepicker.m) parcel.readParcelable(com.google.android.material.datepicker.m.class.getClassLoader()), (com.google.android.material.datepicker.m) parcel.readParcelable(com.google.android.material.datepicker.m.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (com.google.android.material.datepicker.m) parcel.readParcelable(com.google.android.material.datepicker.m.class.getClassLoader()), parcel.readInt());
            case 13:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 14:
                return com.google.android.material.datepicker.m.a(parcel.readInt(), parcel.readInt());
            case 15:
                ?? obj3 = new Object();
                IBinder readStrongBinder = parcel.readStrongBinder();
                int i9 = BinderC2197c.f19921c;
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(InterfaceC2196b.f19920e8);
                    if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC2196b)) {
                        interfaceC2196b = (InterfaceC2196b) queryLocalInterface;
                    } else {
                        ?? obj4 = new Object();
                        obj4.b = readStrongBinder;
                        interfaceC2196b = obj4;
                    }
                }
                obj3.b = interfaceC2196b;
                return obj3;
            case 16:
                return new C2221a(parcel);
            case 17:
                G7.j.e(parcel, "parcel");
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
                }
                return new C2310a(readInt, intent);
            case 18:
                G7.j.e(parcel, "inParcel");
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                G7.j.b(readParcelable);
                return new h.k((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 19:
                return new h5.i(parcel.readLong(), parcel.readLong());
            case 20:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                if (parcel.readByte() != 0) {
                    z8 = true;
                }
                baseSavedState.b = z8;
                return baseSavedState;
            case 21:
                ?? baseSavedState2 = new View.BaseSavedState(parcel);
                baseSavedState2.b = parcel.readString();
                baseSavedState2.f23472d = parcel.readFloat();
                if (parcel.readInt() == 1) {
                    z8 = true;
                }
                baseSavedState2.f23473f = z8;
                baseSavedState2.f23474g = parcel.readString();
                baseSavedState2.f23475h = parcel.readInt();
                baseSavedState2.f23476i = parcel.readInt();
                return baseSavedState2;
            default:
                return new WrappedParcelable(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i9) {
        switch (this.f13845a) {
            case 0:
                return new z[i9];
            case 1:
                return new I[i9];
            case 2:
                return new C1851b[i9];
            case 3:
                return new com.facebook.login.h[i9];
            case 4:
                return new com.facebook.login.k[i9];
            case 5:
                return new com.facebook.login.m[i9];
            case 6:
                return new com.facebook.login.n[i9];
            case 7:
                return new com.facebook.login.o[i9];
            case 8:
                return new com.facebook.login.t[i9];
            case 9:
                return new com.facebook.login.q[i9];
            case 10:
                return new com.facebook.login.s[i9];
            case 11:
                return new com.facebook.login.C[i9];
            case 12:
                return new com.google.android.material.datepicker.b[i9];
            case 13:
                return new com.google.android.material.datepicker.d[i9];
            case 14:
                return new com.google.android.material.datepicker.m[i9];
            case 15:
                return new C2198d[i9];
            case 16:
                return new C2221a[i9];
            case 17:
                return new C2310a[i9];
            case 18:
                return new h.k[i9];
            case 19:
                return new h5.i[i9];
            case 20:
                return new q.M[i9];
            case 21:
                return new C2845f[i9];
            default:
                return new WrappedParcelable[i9];
        }
    }
}
