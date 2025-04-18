package com.plantcare.ai.identifier.plantid.domains;

import a4.j;
import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;
import kotlinx.android.parcel.Parcelize;

@Parcelize
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/domains/GuideModel;", "Landroid/os/Parcelable;", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "img", "I", "getImg", "()I", CampaignEx.JSON_KEY_TITLE, "getTitle", "subText", "getSubText", "<init>", "(III)V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class GuideModel implements Parcelable {
    public static final Parcelable.Creator<GuideModel> CREATOR = new Creator();
    private final int img;
    private final int subText;
    private final int title;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<GuideModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GuideModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GuideModel(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GuideModel[] newArray(int i10) {
            return new GuideModel[i10];
        }
    }

    public GuideModel(int i10, int i11, int i12) {
        this.img = i10;
        this.title = i11;
        this.subText = i12;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuideModel)) {
            return false;
        }
        GuideModel guideModel = (GuideModel) other;
        return this.img == guideModel.img && this.title == guideModel.title && this.subText == guideModel.subText;
    }

    public final int getImg() {
        return this.img;
    }

    public final int getSubText() {
        return this.subText;
    }

    public final int getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Integer.hashCode(this.subText) + a.e(this.title, Integer.hashCode(this.img) * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GuideModel(img=");
        sb2.append(this.img);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", subText=");
        return j.i(sb2, this.subText, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.img);
        parcel.writeInt(this.title);
        parcel.writeInt(this.subText);
    }
}
