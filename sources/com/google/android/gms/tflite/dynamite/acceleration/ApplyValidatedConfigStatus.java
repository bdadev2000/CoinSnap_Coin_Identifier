package com.google.android.gms.tflite.dynamite.acceleration;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-tflite-impl@@16.1.0 */
/* loaded from: classes12.dex */
public enum ApplyValidatedConfigStatus implements Parcelable {
    SUCCESS(0),
    FAILURE_BENCHMARK_RUN_NOT_COMPLETED(1),
    FAILURE_HAS_NOT_PASSED_ACCURACY_CHECK(2);

    public static final Parcelable.Creator<ApplyValidatedConfigStatus> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.tflite.dynamite.acceleration.zzb
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return ApplyValidatedConfigStatus.zza(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new ApplyValidatedConfigStatus[i];
        }
    };
    private final int zzb;

    ApplyValidatedConfigStatus(int i) {
        this.zzb = i;
    }

    public static ApplyValidatedConfigStatus zza(int i) {
        for (ApplyValidatedConfigStatus applyValidatedConfigStatus : values()) {
            if (applyValidatedConfigStatus.zzb == i) {
                return applyValidatedConfigStatus;
            }
        }
        throw new IllegalArgumentException("Invalid enum value: " + i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzb);
    }
}
