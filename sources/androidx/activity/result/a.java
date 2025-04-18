package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class a implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new android.support.v4.media.a(5);

    /* renamed from: b, reason: collision with root package name */
    public final int f595b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f596c;

    public a(int i10, Intent intent) {
        this.f595b = i10;
        this.f596c = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ActivityResult{resultCode=");
        int i10 = this.f595b;
        if (i10 != -1) {
            if (i10 != 0) {
                str = String.valueOf(i10);
            } else {
                str = "RESULT_CANCELED";
            }
        } else {
            str = "RESULT_OK";
        }
        sb2.append(str);
        sb2.append(", data=");
        sb2.append(this.f596c);
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeInt(this.f595b);
        Intent intent = this.f596c;
        if (intent == null) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        parcel.writeInt(i11);
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }

    public a(Parcel parcel) {
        this.f595b = parcel.readInt();
        this.f596c = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
