package ic;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes3.dex */
public final class q extends AbstractSafeParcelable {
    public static final Parcelable.Creator<q> CREATOR = new r8.b(16);

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f19570b;

    public q(Bundle bundle) {
        this.f19570b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.f19570b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
