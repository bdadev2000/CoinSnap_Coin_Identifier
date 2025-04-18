package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.viewpoint.core.C0506Dx;
import com.instagram.common.viewpoint.core.Dz;
import com.instagram.common.viewpoint.core.I4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new C0506Dx();
    public final List<Dz> A00;

    public SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Dz.A01(parcel));
        }
        this.A00 = Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, C0506Dx c0506Dx) {
        this(parcel);
    }

    public SpliceScheduleCommand(List<Dz> list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    public static SpliceScheduleCommand A00(I4 i4) {
        int A0E = i4.A0E();
        ArrayList arrayList = new ArrayList(A0E);
        for (int i2 = 0; i2 < A0E; i2++) {
            arrayList.add(Dz.A03(i4));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int size = this.A00.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            Dz.A05(this.A00.get(i3), parcel);
        }
    }
}
