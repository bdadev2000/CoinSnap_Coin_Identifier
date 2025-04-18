package com.google.android.gms.location;

import a4.j;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@SafeParcelable.Class(creator = "ActivityTransitionRequestCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes3.dex */
public class ActivityTransitionRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new zzh();

    @NonNull
    public static final Comparator<ActivityTransition> IS_SAME_TRANSITION = new zzg();

    @SafeParcelable.Field(getter = "getActivityTransitions", id = 1)
    private final List zza;

    @Nullable
    @SafeParcelable.Field(getter = "getTag", id = 2)
    private final String zzb;

    @SafeParcelable.Field(getter = "getClients", id = 3)
    private final List zzc;

    @Nullable
    @SafeParcelable.Field(defaultValueUnchecked = AbstractJsonLexerKt.NULL, getter = "getContextAttributionTag", id = 4)
    private String zzd;

    public ActivityTransitionRequest(@NonNull List<ActivityTransition> list) {
        this(list, null, null, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            if (Objects.equal(this.zza, activityTransitionRequest.zza) && Objects.equal(this.zzb, activityTransitionRequest.zzb) && Objects.equal(this.zzd, activityTransitionRequest.zzd) && Objects.equal(this.zzc, activityTransitionRequest.zzc)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int hashCode = this.zza.hashCode() * 31;
        String str = this.zzb;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (hashCode + i10) * 31;
        List list = this.zzc;
        if (list != null) {
            i11 = list.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str2 = this.zzd;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return i14 + i12;
    }

    public void serializeToIntentExtra(@NonNull Intent intent) {
        Preconditions.checkNotNull(intent);
        SafeParcelableSerializer.serializeToIntentExtra(this, intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST");
    }

    @NonNull
    public String toString() {
        String valueOf = String.valueOf(this.zza);
        String str = this.zzb;
        return j.k(j.p("ActivityTransitionRequest [mTransitions=", valueOf, ", mTag='", str, "', mClients="), String.valueOf(this.zzc), ", mAttributionTag=", this.zzd, "]");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @NonNull
    public final ActivityTransitionRequest zza(@Nullable String str) {
        this.zzd = str;
        return this;
    }

    @SafeParcelable.Constructor
    public ActivityTransitionRequest(@NonNull @SafeParcelable.Param(id = 1) List list, @Nullable @SafeParcelable.Param(id = 2) String str, @Nullable @SafeParcelable.Param(id = 3) List list2, @Nullable @SafeParcelable.Param(id = 4) String str2) {
        List unmodifiableList;
        Preconditions.checkNotNull(list, "transitions can't be null");
        Preconditions.checkArgument(list.size() > 0, "transitions can't be empty.");
        Preconditions.checkNotNull(list);
        TreeSet treeSet = new TreeSet(IS_SAME_TRANSITION);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ActivityTransition activityTransition = (ActivityTransition) it.next();
            Preconditions.checkArgument(treeSet.add(activityTransition), String.format("Found duplicated transition: %s.", activityTransition));
        }
        this.zza = Collections.unmodifiableList(list);
        this.zzb = str;
        if (list2 == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list2);
        }
        this.zzc = unmodifiableList;
        this.zzd = str2;
    }
}
