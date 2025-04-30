package com.google.android.gms.common.data;

import Q7.n0;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {
    private boolean zaa;
    private ArrayList zab;

    @KeepForSdk
    public EntityBuffer(@NonNull DataHolder dataHolder) {
        super(dataHolder);
        this.zaa = false;
    }

    private final void zab() {
        synchronized (this) {
            try {
                if (!this.zaa) {
                    int count = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                    ArrayList arrayList = new ArrayList();
                    this.zab = arrayList;
                    if (count > 0) {
                        arrayList.add(0);
                        String primaryDataMarkerColumn = getPrimaryDataMarkerColumn();
                        String string = this.mDataHolder.getString(primaryDataMarkerColumn, 0, this.mDataHolder.getWindowIndex(0));
                        for (int i9 = 1; i9 < count; i9++) {
                            int windowIndex = this.mDataHolder.getWindowIndex(i9);
                            String string2 = this.mDataHolder.getString(primaryDataMarkerColumn, i9, windowIndex);
                            if (string2 != null) {
                                if (!string2.equals(string)) {
                                    this.zab.add(Integer.valueOf(i9));
                                    string = string2;
                                }
                            } else {
                                throw new NullPointerException("Missing value for markerColumn: " + primaryDataMarkerColumn + ", at row: " + i9 + ", for window: " + windowIndex);
                            }
                        }
                    }
                    this.zaa = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public final T get(int i9) {
        int intValue;
        int intValue2;
        zab();
        int zaa = zaa(i9);
        int i10 = 0;
        if (i9 >= 0 && i9 != this.zab.size()) {
            if (i9 == this.zab.size() - 1) {
                intValue = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                intValue2 = ((Integer) this.zab.get(i9)).intValue();
            } else {
                intValue = ((Integer) this.zab.get(i9 + 1)).intValue();
                intValue2 = ((Integer) this.zab.get(i9)).intValue();
            }
            int i11 = intValue - intValue2;
            if (i11 == 1) {
                int zaa2 = zaa(i9);
                int windowIndex = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getWindowIndex(zaa2);
                String childDataMarkerColumn = getChildDataMarkerColumn();
                if (childDataMarkerColumn == null || this.mDataHolder.getString(childDataMarkerColumn, zaa2, windowIndex) != null) {
                    i10 = 1;
                }
            } else {
                i10 = i11;
            }
        }
        return getEntry(zaa, i10);
    }

    @Nullable
    @KeepForSdk
    public String getChildDataMarkerColumn() {
        return null;
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @KeepForSdk
    public int getCount() {
        zab();
        return this.zab.size();
    }

    @NonNull
    @KeepForSdk
    public abstract T getEntry(int i9, int i10);

    @NonNull
    @KeepForSdk
    public abstract String getPrimaryDataMarkerColumn();

    public final int zaa(int i9) {
        if (i9 >= 0 && i9 < this.zab.size()) {
            return ((Integer) this.zab.get(i9)).intValue();
        }
        throw new IllegalArgumentException(n0.f(i9, "Position ", " is out of bounds for this buffer"));
    }
}
