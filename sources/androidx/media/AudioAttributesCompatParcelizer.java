package androidx.media;

import O0.a;
import O0.c;

/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        c cVar = audioAttributesCompat.f4912a;
        if (aVar.e(1)) {
            cVar = aVar.h();
        }
        audioAttributesCompat.f4912a = (AudioAttributesImpl) cVar;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a aVar) {
        aVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f4912a;
        aVar.i(1);
        aVar.k(audioAttributesImpl);
    }
}
