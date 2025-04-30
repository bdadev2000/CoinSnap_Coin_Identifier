package androidx.media;

import O0.a;
import O0.b;
import android.media.AudioAttributes;

/* loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f4913a = (AudioAttributes) aVar.g(audioAttributesImplApi21.f4913a, 1);
        audioAttributesImplApi21.b = aVar.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, a aVar) {
        aVar.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.f4913a;
        aVar.i(1);
        ((b) aVar).f2140e.writeParcelable(audioAttributes, 0);
        aVar.j(audioAttributesImplApi21.b, 2);
    }
}
