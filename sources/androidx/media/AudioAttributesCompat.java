package androidx.media;

import O0.c;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements c {
    public static final /* synthetic */ int b = 0;

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributesImpl f4912a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f4912a;
        if (audioAttributesImpl == null) {
            if (audioAttributesCompat.f4912a != null) {
                return false;
            }
            return true;
        }
        return audioAttributesImpl.equals(audioAttributesCompat.f4912a);
    }

    public final int hashCode() {
        return this.f4912a.hashCode();
    }

    public final String toString() {
        return this.f4912a.toString();
    }
}
