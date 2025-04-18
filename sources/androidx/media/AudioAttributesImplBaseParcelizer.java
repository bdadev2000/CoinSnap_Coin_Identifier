package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo
/* loaded from: classes4.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f20287a = versionedParcel.l(audioAttributesImplBase.f20287a, 1);
        audioAttributesImplBase.f20288b = versionedParcel.l(audioAttributesImplBase.f20288b, 2);
        audioAttributesImplBase.f20289c = versionedParcel.l(audioAttributesImplBase.f20289c, 3);
        audioAttributesImplBase.d = versionedParcel.l(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.q(false, false);
        versionedParcel.v(audioAttributesImplBase.f20287a, 1);
        versionedParcel.v(audioAttributesImplBase.f20288b, 2);
        versionedParcel.v(audioAttributesImplBase.f20289c, 3);
        versionedParcel.v(audioAttributesImplBase.d, 4);
    }
}
