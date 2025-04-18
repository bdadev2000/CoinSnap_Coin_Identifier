package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.ExperimentIds;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class AutoValue_ExperimentIds extends ExperimentIds {
    private final byte[] clearBlob;
    private final byte[] encryptedBlob;

    /* loaded from: classes2.dex */
    public static final class Builder extends ExperimentIds.Builder {
        private byte[] clearBlob;
        private byte[] encryptedBlob;

        @Override // com.google.android.datatransport.cct.internal.ExperimentIds.Builder
        public ExperimentIds build() {
            return new AutoValue_ExperimentIds(this.clearBlob, this.encryptedBlob);
        }

        @Override // com.google.android.datatransport.cct.internal.ExperimentIds.Builder
        public ExperimentIds.Builder setClearBlob(@Nullable byte[] bArr) {
            this.clearBlob = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ExperimentIds.Builder
        public ExperimentIds.Builder setEncryptedBlob(@Nullable byte[] bArr) {
            this.encryptedBlob = bArr;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExperimentIds)) {
            return false;
        }
        ExperimentIds experimentIds = (ExperimentIds) obj;
        boolean z2 = experimentIds instanceof AutoValue_ExperimentIds;
        if (Arrays.equals(this.clearBlob, z2 ? ((AutoValue_ExperimentIds) experimentIds).clearBlob : experimentIds.getClearBlob())) {
            if (Arrays.equals(this.encryptedBlob, z2 ? ((AutoValue_ExperimentIds) experimentIds).encryptedBlob : experimentIds.getEncryptedBlob())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.ExperimentIds
    @Nullable
    public byte[] getClearBlob() {
        return this.clearBlob;
    }

    @Override // com.google.android.datatransport.cct.internal.ExperimentIds
    @Nullable
    public byte[] getEncryptedBlob() {
        return this.encryptedBlob;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.clearBlob) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.encryptedBlob);
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.clearBlob) + ", encryptedBlob=" + Arrays.toString(this.encryptedBlob) + "}";
    }

    private AutoValue_ExperimentIds(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        this.clearBlob = bArr;
        this.encryptedBlob = bArr2;
    }
}
