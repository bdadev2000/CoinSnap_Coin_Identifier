package androidx.media;

import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public class AudioAttributesCompat implements VersionedParcelable {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f20283b = 0;

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributesImpl f20284a;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface AttributeContentType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface AttributeUsage {
    }

    /* loaded from: classes2.dex */
    public static abstract class AudioManagerHidden {
    }

    /* loaded from: classes2.dex */
    public static class Builder {
    }

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
        AudioAttributesImpl audioAttributesImpl = this.f20284a;
        return audioAttributesImpl == null ? audioAttributesCompat.f20284a == null : audioAttributesImpl.equals(audioAttributesCompat.f20284a);
    }

    public final int hashCode() {
        return this.f20284a.hashCode();
    }

    public final String toString() {
        return this.f20284a.toString();
    }
}
