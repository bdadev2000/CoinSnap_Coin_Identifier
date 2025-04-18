package s8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class i extends b {
    public static final Parcelable.Creator<i> CREATOR = new r8.b(7);

    /* renamed from: b, reason: collision with root package name */
    public final List f24930b;

    public i(ArrayList arrayList) {
        this.f24930b = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f24930b;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = (h) list.get(i11);
            parcel.writeLong(hVar.a);
            parcel.writeByte(hVar.f24920b ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f24921c ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f24922d ? (byte) 1 : (byte) 0);
            List list2 = hVar.f24924f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i12 = 0; i12 < size2; i12++) {
                g gVar = (g) list2.get(i12);
                parcel.writeInt(gVar.a);
                parcel.writeLong(gVar.f24919b);
            }
            parcel.writeLong(hVar.f24923e);
            parcel.writeByte(hVar.f24925g ? (byte) 1 : (byte) 0);
            parcel.writeLong(hVar.f24926h);
            parcel.writeInt(hVar.f24927i);
            parcel.writeInt(hVar.f24928j);
            parcel.writeInt(hVar.f24929k);
        }
    }

    public i(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new h(parcel));
        }
        this.f24930b = Collections.unmodifiableList(arrayList);
    }
}
