package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import eb.j;
import java.util.Iterator;
import java.util.NoSuchElementException;

@KeepForSdk
/* loaded from: classes3.dex */
public class DataBufferIterator<T> implements Iterator<T> {

    @NonNull
    protected final DataBuffer zaa;
    protected int zab = -1;

    public DataBufferIterator(@NonNull DataBuffer dataBuffer) {
        this.zaa = (DataBuffer) Preconditions.checkNotNull(dataBuffer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zab < this.zaa.getCount() + (-1);
    }

    @Override // java.util.Iterator
    @NonNull
    public Object next() {
        if (hasNext()) {
            DataBuffer dataBuffer = this.zaa;
            int i10 = this.zab + 1;
            this.zab = i10;
            return dataBuffer.get(i10);
        }
        throw new NoSuchElementException(j.i("Cannot advance the iterator beyond ", this.zab));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
