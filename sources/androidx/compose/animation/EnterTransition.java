package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import java.util.LinkedHashMap;
import java.util.Map;

@Immutable
/* loaded from: classes3.dex */
public abstract class EnterTransition {

    /* renamed from: a, reason: collision with root package name */
    public static final EnterTransition f1875a = new EnterTransitionImpl(new TransitionData(null, null, null, null, false, null, 63));

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public abstract TransitionData a();

    public final EnterTransition b(EnterTransition enterTransition) {
        Fade fade = enterTransition.a().f1973a;
        if (fade == null) {
            fade = a().f1973a;
        }
        Fade fade2 = fade;
        Slide slide = enterTransition.a().f1974b;
        if (slide == null) {
            slide = a().f1974b;
        }
        Slide slide2 = slide;
        ChangeSize changeSize = enterTransition.a().f1975c;
        if (changeSize == null) {
            changeSize = a().f1975c;
        }
        ChangeSize changeSize2 = changeSize;
        Scale scale = enterTransition.a().d;
        if (scale == null) {
            scale = a().d;
        }
        Scale scale2 = scale;
        Map map = a().f1976f;
        Map map2 = enterTransition.a().f1976f;
        p0.a.s(map, "<this>");
        p0.a.s(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new EnterTransitionImpl(new TransitionData(fade2, slide2, changeSize2, scale2, false, linkedHashMap, 16));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof EnterTransition) && p0.a.g(((EnterTransition) obj).a(), a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        if (p0.a.g(this, f1875a)) {
            return "EnterTransition.None";
        }
        TransitionData a2 = a();
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        Fade fade = a2.f1973a;
        sb.append(fade != null ? fade.toString() : null);
        sb.append(",\nSlide - ");
        Slide slide = a2.f1974b;
        sb.append(slide != null ? slide.toString() : null);
        sb.append(",\nShrink - ");
        ChangeSize changeSize = a2.f1975c;
        sb.append(changeSize != null ? changeSize.toString() : null);
        sb.append(",\nScale - ");
        Scale scale = a2.d;
        sb.append(scale != null ? scale.toString() : null);
        return sb.toString();
    }
}
