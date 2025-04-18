package androidx.compose.animation;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import e0.x;
import java.util.LinkedHashMap;
import java.util.Map;

@Immutable
/* loaded from: classes2.dex */
public final class TransitionData {

    /* renamed from: a, reason: collision with root package name */
    public final Fade f1973a;

    /* renamed from: b, reason: collision with root package name */
    public final Slide f1974b;

    /* renamed from: c, reason: collision with root package name */
    public final ChangeSize f1975c;
    public final Scale d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f1976f;

    public TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, boolean z2, Map map) {
        this.f1973a = fade;
        this.f1974b = slide;
        this.f1975c = changeSize;
        this.d = scale;
        this.e = z2;
        this.f1976f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransitionData)) {
            return false;
        }
        TransitionData transitionData = (TransitionData) obj;
        return p0.a.g(this.f1973a, transitionData.f1973a) && p0.a.g(this.f1974b, transitionData.f1974b) && p0.a.g(this.f1975c, transitionData.f1975c) && p0.a.g(this.d, transitionData.d) && this.e == transitionData.e && p0.a.g(this.f1976f, transitionData.f1976f);
    }

    public final int hashCode() {
        Fade fade = this.f1973a;
        int hashCode = (fade == null ? 0 : fade.hashCode()) * 31;
        Slide slide = this.f1974b;
        int hashCode2 = (hashCode + (slide == null ? 0 : slide.hashCode())) * 31;
        ChangeSize changeSize = this.f1975c;
        int hashCode3 = (hashCode2 + (changeSize == null ? 0 : changeSize.hashCode())) * 31;
        Scale scale = this.d;
        return this.f1976f.hashCode() + d.g(this.e, (hashCode3 + (scale != null ? scale.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f1973a + ", slide=" + this.f1974b + ", changeSize=" + this.f1975c + ", scale=" + this.d + ", hold=" + this.e + ", effectsMap=" + this.f1976f + ')';
    }

    public /* synthetic */ TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, boolean z2, LinkedHashMap linkedHashMap, int i2) {
        this((i2 & 1) != 0 ? null : fade, (i2 & 2) != 0 ? null : slide, (i2 & 4) != 0 ? null : changeSize, (i2 & 8) == 0 ? scale : null, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? x.f30219a : linkedHashMap);
    }
}
