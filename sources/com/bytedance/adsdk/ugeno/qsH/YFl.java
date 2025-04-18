package com.bytedance.adsdk.ugeno.qsH;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class YFl implements Parcelable {
    private final Parcelable Sg;
    public static final YFl YFl = new YFl() { // from class: com.bytedance.adsdk.ugeno.qsH.YFl.1
    };
    public static final Parcelable.Creator<YFl> CREATOR = new Parcelable.ClassLoaderCreator<YFl>() { // from class: com.bytedance.adsdk.ugeno.qsH.YFl.2
        @Override // android.os.Parcelable.Creator
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public YFl createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public YFl createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return YFl.YFl;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public YFl[] newArray(int i10) {
            return new YFl[i10];
        }
    };

    public final Parcelable YFl() {
        return this.Sg;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.Sg, i10);
    }

    private YFl() {
        this.Sg = null;
    }

    public YFl(Parcelable parcelable) {
        if (parcelable != null) {
            this.Sg = parcelable == YFl ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public YFl(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.Sg = readParcelable == null ? YFl : readParcelable;
    }
}
