package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import com.applovin.impl.mediation.ads.e;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import eb.j;
import java.util.NoSuchElementException;

@KeepForSdk
/* loaded from: classes3.dex */
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {
    private Object zac;

    public SingleRefDataBufferIterator(@NonNull DataBuffer dataBuffer) {
        super(dataBuffer);
    }

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    @NonNull
    public final Object next() {
        if (hasNext()) {
            int i10 = this.zab + 1;
            this.zab = i10;
            if (i10 == 0) {
                Object checkNotNull = Preconditions.checkNotNull(this.zaa.get(0));
                this.zac = checkNotNull;
                if (!(checkNotNull instanceof DataBufferRef)) {
                    throw new IllegalStateException(e.f("DataBuffer reference of type ", String.valueOf(checkNotNull.getClass()), " is not movable"));
                }
            } else {
                ((DataBufferRef) Preconditions.checkNotNull(this.zac)).zaa(this.zab);
            }
            return this.zac;
        }
        throw new NoSuchElementException(j.i("Cannot advance the iterator beyond ", this.zab));
    }
}
