package com.glority.imagepicker.bean;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.glority.component.generatedAPI.kotlinAPI.enums.PhotoFrom;
import java.util.Objects;

/* loaded from: classes6.dex */
public class ResultImage implements Parcelable {
    public static final Parcelable.Creator<ResultImage> CREATOR = new Parcelable.Creator<ResultImage>() { // from class: com.glority.imagepicker.bean.ResultImage.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ResultImage createFromParcel(Parcel parcel) {
            return new ResultImage(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ResultImage[] newArray(int i) {
            return new ResultImage[i];
        }
    };
    public final Uri imageUri;
    public final PhotoFrom photoFrom;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ResultImage(Uri uri, PhotoFrom photoFrom) {
        this.imageUri = uri;
        this.photoFrom = photoFrom;
    }

    protected ResultImage(Parcel parcel) {
        PhotoFrom photoFrom;
        this.imageUri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        try {
            photoFrom = PhotoFrom.INSTANCE.fromValue(parcel.readInt());
        } catch (Exception unused) {
            photoFrom = PhotoFrom.ALBUM;
        }
        this.photoFrom = photoFrom;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.imageUri, i);
        parcel.writeInt(this.photoFrom.getValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResultImage resultImage = (ResultImage) obj;
        return Objects.equals(this.imageUri, resultImage.imageUri) && this.photoFrom == resultImage.photoFrom;
    }

    public int hashCode() {
        return Objects.hash(this.imageUri, this.photoFrom);
    }
}
