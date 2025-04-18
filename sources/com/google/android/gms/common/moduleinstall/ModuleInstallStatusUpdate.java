package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.Class(creator = "ModuleInstallStatusUpdateCreator")
/* loaded from: classes3.dex */
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new zae();

    @SafeParcelable.Field(getter = "getSessionId", id = 1)
    private final int zaa;

    @InstallState
    @SafeParcelable.Field(getter = "getInstallState", id = 2)
    private final int zab;

    @Nullable
    @SafeParcelable.Field(getter = "getBytesDownloaded", id = 3)
    private final Long zac;

    @Nullable
    @SafeParcelable.Field(getter = "getTotalBytesToDownload", id = 4)
    private final Long zad;

    @SafeParcelable.Field(getter = "getErrorCode", id = 5)
    private final int zae;

    @Nullable
    private final ProgressInfo zaf;

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes3.dex */
    public @interface InstallState {
        public static final int STATE_CANCELED = 3;
        public static final int STATE_COMPLETED = 4;
        public static final int STATE_DOWNLOADING = 2;
        public static final int STATE_DOWNLOAD_PAUSED = 7;
        public static final int STATE_FAILED = 5;
        public static final int STATE_INSTALLING = 6;
        public static final int STATE_PENDING = 1;
        public static final int STATE_UNKNOWN = 0;
    }

    /* loaded from: classes3.dex */
    public static class ProgressInfo {
        private final long zaa;
        private final long zab;

        public ProgressInfo(long j3, long j10) {
            Preconditions.checkNotZero(j10);
            this.zaa = j3;
            this.zab = j10;
        }

        public long getBytesDownloaded() {
            return this.zaa;
        }

        public long getTotalBytesToDownload() {
            return this.zab;
        }
    }

    @SafeParcelable.Constructor
    @KeepForSdk
    public ModuleInstallStatusUpdate(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) @InstallState int i11, @Nullable @SafeParcelable.Param(id = 3) Long l10, @Nullable @SafeParcelable.Param(id = 4) Long l11, @SafeParcelable.Param(id = 5) int i12) {
        ProgressInfo progressInfo;
        this.zaa = i10;
        this.zab = i11;
        this.zac = l10;
        this.zad = l11;
        this.zae = i12;
        if (l10 != null && l11 != null && l11.longValue() != 0) {
            progressInfo = new ProgressInfo(l10.longValue(), l11.longValue());
        } else {
            progressInfo = null;
        }
        this.zaf = progressInfo;
    }

    public int getErrorCode() {
        return this.zae;
    }

    @InstallState
    public int getInstallState() {
        return this.zab;
    }

    @Nullable
    public ProgressInfo getProgressInfo() {
        return this.zaf;
    }

    public int getSessionId() {
        return this.zaa;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getSessionId());
        SafeParcelWriter.writeInt(parcel, 2, getInstallState());
        SafeParcelWriter.writeLongObject(parcel, 3, this.zac, false);
        SafeParcelWriter.writeLongObject(parcel, 4, this.zad, false);
        SafeParcelWriter.writeInt(parcel, 5, getErrorCode());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
