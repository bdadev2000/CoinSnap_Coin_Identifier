package androidx.media;

import android.media.AudioAttributes;
import h2.a;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) aVar.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.f1851b = aVar.f(audioAttributesImplApi21.f1851b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, a aVar) {
        aVar.getClass();
        aVar.k(audioAttributesImplApi21.a, 1);
        aVar.j(audioAttributesImplApi21.f1851b, 2);
    }
}
