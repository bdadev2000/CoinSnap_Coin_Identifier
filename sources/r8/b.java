package r8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.material.datepicker.n;
import ic.q;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import s8.i;
import s8.j;

/* loaded from: classes3.dex */
public final class b implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z10 = false;
        int i10 = 0;
        Integer num = null;
        Bundle bundle = null;
        switch (this.a) {
            case 0:
                return new c(parcel);
            case 1:
                ArrayList arrayList = new ArrayList();
                parcel.readList(arrayList, d.class.getClassLoader());
                return new e(arrayList);
            case 2:
                return new d(parcel.readLong(), parcel.readLong(), parcel.readInt());
            case 3:
                return new f(parcel);
            case 4:
                return new s8.a(parcel);
            case 5:
                return new s8.e(parcel);
            case 6:
                return new s8.f();
            case 7:
                return new i(parcel);
            case 8:
                return new j(parcel.readLong(), parcel.readLong());
            case 9:
                return new t8.a(parcel);
            case 10:
                return new u8.b(parcel);
            case 11:
                return new y9.b(parcel);
            case 12:
                return new com.google.android.material.datepicker.c((n) parcel.readParcelable(n.class.getClassLoader()), (n) parcel.readParcelable(n.class.getClassLoader()), (com.google.android.material.datepicker.b) parcel.readParcelable(com.google.android.material.datepicker.b.class.getClassLoader()), (n) parcel.readParcelable(n.class.getClassLoader()), parcel.readInt());
            case 13:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 14:
                return n.a(parcel.readInt(), parcel.readInt());
            case 15:
                return new com.google.android.material.timepicker.i(parcel);
            case 16:
                int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader) {
                    int readHeader = SafeParcelReader.readHeader(parcel);
                    if (SafeParcelReader.getFieldId(readHeader) != 2) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader);
                    } else {
                        bundle = SafeParcelReader.createBundle(parcel, readHeader);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
                return new q(bundle);
            case 17:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (true) {
                    int readInt2 = parcel.readInt();
                    if (i10 != readInt) {
                        arrayList2.add(Integer.valueOf(readInt2));
                        i10++;
                    } else {
                        return new rf.a(arrayList2, readInt2, parcel.readInt(), parcel.readInt(), parcel.readInt());
                    }
                }
            default:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                if (parcel.readInt() != 0) {
                    num = Integer.valueOf(parcel.readInt());
                }
                return new dg.e(readString, readString2, z10, num);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new c[i10];
            case 1:
                return new e[i10];
            case 2:
                return new d[i10];
            case 3:
                return new f[i10];
            case 4:
                return new s8.a[i10];
            case 5:
                return new s8.e[i10];
            case 6:
                return new s8.f[i10];
            case 7:
                return new i[i10];
            case 8:
                return new j[i10];
            case 9:
                return new t8.a[i10];
            case 10:
                return new u8.b[i10];
            case 11:
                return new y9.b[i10];
            case 12:
                return new com.google.android.material.datepicker.c[i10];
            case 13:
                return new com.google.android.material.datepicker.d[i10];
            case 14:
                return new n[i10];
            case 15:
                return new com.google.android.material.timepicker.i[i10];
            case 16:
                return new q[i10];
            case 17:
                return new rf.a[i10];
            default:
                return new dg.e[i10];
        }
    }
}
