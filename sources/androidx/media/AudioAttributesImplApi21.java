package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
/* loaded from: classes4.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f20285a;

    /* renamed from: b, reason: collision with root package name */
    public int f20286b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f20285a.equals(((AudioAttributesImplApi21) obj).f20285a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20285a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f20285a;
    }
}
