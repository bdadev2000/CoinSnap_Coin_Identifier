package com.google.zxing.oned.rss;

import android.support.v4.media.d;

/* loaded from: classes3.dex */
public class DataCharacter {
    private final int checksumPortion;
    private final int value;

    public DataCharacter(int i2, int i3) {
        this.value = i2;
        this.checksumPortion = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DataCharacter)) {
            return false;
        }
        DataCharacter dataCharacter = (DataCharacter) obj;
        return this.value == dataCharacter.value && this.checksumPortion == dataCharacter.checksumPortion;
    }

    public final int getChecksumPortion() {
        return this.checksumPortion;
    }

    public final int getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value ^ this.checksumPortion;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.value);
        sb.append("(");
        return d.o(sb, this.checksumPortion, ')');
    }
}
