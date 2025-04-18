package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {
    public AudioAttributes a;

    /* renamed from: b, reason: collision with root package name */
    public int f1851b = -1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.a.equals(((AudioAttributesImplApi21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.a;
    }
}
