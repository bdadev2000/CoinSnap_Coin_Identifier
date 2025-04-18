package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
final class Count implements Serializable {
    private int value;

    public Count(int i2) {
        this.value = i2;
    }

    public void add(int i2) {
        this.value += i2;
    }

    public int addAndGet(int i2) {
        int i3 = this.value + i2;
        this.value = i3;
        return i3;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Count) && ((Count) obj).value == this.value;
    }

    public int get() {
        return this.value;
    }

    public int getAndSet(int i2) {
        int i3 = this.value;
        this.value = i2;
        return i3;
    }

    public int hashCode() {
        return this.value;
    }

    public void set(int i2) {
        this.value = i2;
    }

    public String toString() {
        return Integer.toString(this.value);
    }
}
