package com.glority.android.cmsui2.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GradeEntity.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0002J\n\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0002J\u0006\u0010 \u001a\u00020!J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR \u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR \u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018¨\u0006'"}, d2 = {"Lcom/glority/android/cmsui2/bean/GradeEntity;", "Landroid/os/Parcelable;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "highPrice", "getHighPrice", "setHighPrice", "lowPrice", "getLowPrice", "setLowPrice", "currencySymbol", "getCurrencySymbol", "setCurrencySymbol", "highPriceWithoutSymbol", "", "getHighPriceWithoutSymbol", "()Ljava/lang/Double;", "setHighPriceWithoutSymbol", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "lowPriceWithoutSymbol", "getLowPriceWithoutSymbol", "setLowPriceWithoutSymbol", "getPriceRange", "getRealHighPrice", "getRealLowPrice", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes14.dex */
public final class GradeEntity implements Parcelable {
    public static final Parcelable.Creator<GradeEntity> CREATOR = new Creator();

    @SerializedName("currency_symbol")
    private String currencySymbol;

    @SerializedName("high_price")
    private String highPrice;

    @SerializedName("high_price_without_symbol")
    private Double highPriceWithoutSymbol;

    @SerializedName("low_price")
    private String lowPrice;

    @SerializedName("low_price_without_symbol")
    private Double lowPriceWithoutSymbol;

    @SerializedName("grade_name")
    private String name;

    /* compiled from: GradeEntity.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes14.dex */
    public static final class Creator implements Parcelable.Creator<GradeEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GradeEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return new GradeEntity();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GradeEntity[] newArray(int i) {
            return new GradeEntity[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final String getHighPrice() {
        return this.highPrice;
    }

    public final void setHighPrice(String str) {
        this.highPrice = str;
    }

    public final String getLowPrice() {
        return this.lowPrice;
    }

    public final void setLowPrice(String str) {
        this.lowPrice = str;
    }

    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public final void setCurrencySymbol(String str) {
        this.currencySymbol = str;
    }

    public final Double getHighPriceWithoutSymbol() {
        return this.highPriceWithoutSymbol;
    }

    public final void setHighPriceWithoutSymbol(Double d) {
        this.highPriceWithoutSymbol = d;
    }

    public final Double getLowPriceWithoutSymbol() {
        return this.lowPriceWithoutSymbol;
    }

    public final void setLowPriceWithoutSymbol(Double d) {
        this.lowPriceWithoutSymbol = d;
    }

    public final String getPriceRange() {
        if (Intrinsics.areEqual(getRealLowPrice(), getRealHighPrice())) {
            return this.lowPrice;
        }
        if (getRealHighPrice() != null && getRealLowPrice() != null) {
            return this.lowPrice + " - " + this.highPrice;
        }
        if (getRealHighPrice() != null) {
            return this.highPrice;
        }
        return this.lowPrice;
    }

    private final String getRealHighPrice() {
        if (Intrinsics.areEqual(this.highPrice, "-")) {
            return null;
        }
        return this.highPrice;
    }

    private final String getRealLowPrice() {
        if (Intrinsics.areEqual(this.lowPrice, "-")) {
            return null;
        }
        return this.lowPrice;
    }
}
