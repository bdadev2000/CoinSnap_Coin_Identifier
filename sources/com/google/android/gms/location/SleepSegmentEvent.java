package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;

@SafeParcelable.Class(creator = "SleepSegmentEventCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes3.dex */
public class SleepSegmentEvent extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SleepSegmentEvent> CREATOR = new zzag();
    public static final int STATUS_MISSING_DATA = 1;
    public static final int STATUS_NOT_DETECTED = 2;
    public static final int STATUS_SUCCESSFUL = 0;

    @SafeParcelable.Field(getter = "getStartTimeMillis", id = 1)
    private final long zza;

    @SafeParcelable.Field(getter = "getEndTimeMillis", id = 2)
    private final long zzb;

    @SafeParcelable.Field(getter = "getStatus", id = 3)
    private final int zzc;

    @SafeParcelable.Field(getter = "getMissingDataDurationMinutes", id = 4)
    private final int zzd;

    @SafeParcelable.Field(getter = "getNinetiethPctConfidence", id = 5)
    private final int zze;

    @ShowFirstParty
    @SafeParcelable.Constructor
    public SleepSegmentEvent(@SafeParcelable.Param(id = 1) long j3, @SafeParcelable.Param(id = 2) long j10, @SafeParcelable.Param(id = 3) int i10, @SafeParcelable.Param(id = 4) int i11, @SafeParcelable.Param(id = 5) int i12) {
        boolean z10;
        if (j3 <= j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "endTimeMillis must be greater than or equal to startTimeMillis");
        this.zza = j3;
        this.zzb = j10;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
    }

    @NonNull
    public static List<SleepSegmentEvent> extractEvents(@NonNull Intent intent) {
        Preconditions.checkNotNull(intent);
        if (!hasEvents(intent)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT");
        if (arrayList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            byte[] bArr = (byte[]) arrayList.get(i10);
            Preconditions.checkNotNull(bArr);
            arrayList2.add((SleepSegmentEvent) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR));
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public static boolean hasEvents(@Nullable Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT");
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof SleepSegmentEvent) {
            SleepSegmentEvent sleepSegmentEvent = (SleepSegmentEvent) obj;
            if (this.zza == sleepSegmentEvent.getStartTimeMillis() && this.zzb == sleepSegmentEvent.getEndTimeMillis() && this.zzc == sleepSegmentEvent.getStatus() && this.zzd == sleepSegmentEvent.zzd && this.zze == sleepSegmentEvent.zze) {
                return true;
            }
        }
        return false;
    }

    public long getEndTimeMillis() {
        return this.zzb;
    }

    public long getSegmentDurationMillis() {
        return this.zzb - this.zza;
    }

    public long getStartTimeMillis() {
        return this.zza;
    }

    public int getStatus() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    @NonNull
    public String toString() {
        long j3 = this.zza;
        long j10 = this.zzb;
        int i10 = this.zzc;
        StringBuilder o10 = a.o("startMillis=", j3, ", endMillis=");
        o10.append(j10);
        o10.append(", status=");
        o10.append(i10);
        return o10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getStartTimeMillis());
        SafeParcelWriter.writeLong(parcel, 2, getEndTimeMillis());
        SafeParcelWriter.writeInt(parcel, 3, getStatus());
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
