package androidx.media;

import O0.a;

/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f4914a = aVar.f(audioAttributesImplBase.f4914a, 1);
        audioAttributesImplBase.b = aVar.f(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.f4915c = aVar.f(audioAttributesImplBase.f4915c, 3);
        audioAttributesImplBase.f4916d = aVar.f(audioAttributesImplBase.f4916d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.getClass();
        aVar.j(audioAttributesImplBase.f4914a, 1);
        aVar.j(audioAttributesImplBase.b, 2);
        aVar.j(audioAttributesImplBase.f4915c, 3);
        aVar.j(audioAttributesImplBase.f4916d, 4);
    }
}
