package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.r0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ l(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel source) {
        switch (this.a) {
            case 0:
                Intrinsics.checkNotNullParameter(source, "source");
                return new n(source);
            case 1:
                Intrinsics.checkNotNullParameter(source, "source");
                return new o(source);
            case 2:
                Intrinsics.checkNotNullParameter(source, "source");
                return new p(source);
            case 3:
                Intrinsics.checkNotNullParameter(source, "source");
                return new u(source);
            case 4:
                Intrinsics.checkNotNullParameter(source, "source");
                return new r(source);
            case 5:
                Intrinsics.checkNotNullParameter(source, "source");
                return new t(source);
            case 6:
                Intrinsics.checkNotNullParameter(source, "source");
                return new g0(source);
            case 7:
                return new v7.a(source);
            case 8:
                return new v7.b(source);
            case 9:
                return new x7.l(source);
            case 10:
                return new x7.k(source);
            case 11:
                return new l8.b(source);
            case 12:
                String readString = source.readString();
                readString.getClass();
                return new m8.a(source.readInt(), readString);
            case 13:
                return new n8.a(source);
            case 14:
                return new o8.a(source);
            case 15:
                return new o8.b(source);
            case 16:
                return new p8.b(source);
            case 17:
                return new p8.c(source);
            case 18:
                return new q8.a(source);
            case 19:
                return new q8.b(source);
            case 20:
                return new q8.c(source);
            case 21:
                return new q8.d(source);
            case 22:
                return new q8.e(source);
            case 23:
                return new q8.f(source);
            case 24:
                return new q8.k(source);
            case 25:
                return new q8.l(source);
            case 26:
                return new q8.m(source);
            case 27:
                String readString2 = source.readString();
                readString2.getClass();
                String readString3 = source.readString();
                String[] createStringArray = source.createStringArray();
                createStringArray.getClass();
                return new q8.n(readString2, readString3, r0.l(createStringArray));
            case 28:
                return new q8.o(source);
            default:
                return new r8.a(source);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new n[i10];
            case 1:
                return new o[i10];
            case 2:
                return new p[i10];
            case 3:
                return new u[i10];
            case 4:
                return new r[i10];
            case 5:
                return new t[i10];
            case 6:
                return new g0[i10];
            case 7:
                return new v7.a[i10];
            case 8:
                return new v7.b[i10];
            case 9:
                return new x7.l[i10];
            case 10:
                return new x7.k[i10];
            case 11:
                return new l8.b[i10];
            case 12:
                return new m8.a[i10];
            case 13:
                return new n8.a[i10];
            case 14:
                return new o8.a[i10];
            case 15:
                return new o8.b[i10];
            case 16:
                return new p8.b[i10];
            case 17:
                return new p8.c[i10];
            case 18:
                return new q8.a[i10];
            case 19:
                return new q8.b[i10];
            case 20:
                return new q8.c[i10];
            case 21:
                return new q8.d[i10];
            case 22:
                return new q8.e[i10];
            case 23:
                return new q8.f[i10];
            case 24:
                return new q8.k[i10];
            case 25:
                return new q8.l[i10];
            case 26:
                return new q8.m[i10];
            case 27:
                return new q8.n[i10];
            case 28:
                return new q8.o[i10];
            default:
                return new r8.a[i10];
        }
    }
}
