package androidx.media;

import h2.a;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = aVar.f(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.f1852b = aVar.f(audioAttributesImplBase.f1852b, 2);
        audioAttributesImplBase.f1853c = aVar.f(audioAttributesImplBase.f1853c, 3);
        audioAttributesImplBase.f1854d = aVar.f(audioAttributesImplBase.f1854d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.getClass();
        aVar.j(audioAttributesImplBase.a, 1);
        aVar.j(audioAttributesImplBase.f1852b, 2);
        aVar.j(audioAttributesImplBase.f1853c, 3);
        aVar.j(audioAttributesImplBase.f1854d, 4);
    }
}
