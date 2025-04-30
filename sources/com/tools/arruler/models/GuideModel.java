package com.tools.arruler.models;

import G7.f;
import G7.j;
import android.os.Parcel;
import android.os.Parcelable;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class GuideModel implements Parcelable {
    public static final Parcelable.Creator<GuideModel> CREATOR = new Creator();
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19631c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19632d;

    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<GuideModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GuideModel createFromParcel(Parcel parcel) {
            j.e(parcel, "parcel");
            return new GuideModel(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GuideModel[] newArray(int i9) {
            return new GuideModel[i9];
        }
    }

    public GuideModel() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ GuideModel copy$default(GuideModel guideModel, int i9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i9 = guideModel.b;
        }
        if ((i12 & 2) != 0) {
            i10 = guideModel.f19631c;
        }
        if ((i12 & 4) != 0) {
            i11 = guideModel.f19632d;
        }
        return guideModel.copy(i9, i10, i11);
    }

    public final int component1() {
        return this.b;
    }

    public final int component2() {
        return this.f19631c;
    }

    public final int component3() {
        return this.f19632d;
    }

    public final GuideModel copy(int i9, int i10, int i11) {
        return new GuideModel(i9, i10, i11);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuideModel)) {
            return false;
        }
        GuideModel guideModel = (GuideModel) obj;
        return this.b == guideModel.b && this.f19631c == guideModel.f19631c && this.f19632d == guideModel.f19632d;
    }

    public final int getImg() {
        return this.b;
    }

    public final int getSubText() {
        return this.f19632d;
    }

    public final int getTitle() {
        return this.f19631c;
    }

    public int hashCode() {
        return Integer.hashCode(this.f19632d) + ((Integer.hashCode(this.f19631c) + (Integer.hashCode(this.b) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GuideModel(img=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.f19631c);
        sb.append(", subText=");
        return AbstractC2914a.g(sb, this.f19632d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        j.e(parcel, "dest");
        parcel.writeInt(this.b);
        parcel.writeInt(this.f19631c);
        parcel.writeInt(this.f19632d);
    }

    public GuideModel(int i9, int i10, int i11) {
        this.b = i9;
        this.f19631c = i10;
        this.f19632d = i11;
    }

    public /* synthetic */ GuideModel(int i9, int i10, int i11, int i12, f fVar) {
        this((i12 & 1) != 0 ? 0 : i9, (i12 & 2) != 0 ? -1 : i10, (i12 & 4) != 0 ? -1 : i11);
    }
}
