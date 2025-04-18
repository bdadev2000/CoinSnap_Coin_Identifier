package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import java.util.LinkedHashMap;
import java.util.Map;

@Immutable
/* loaded from: classes2.dex */
public abstract class ExitTransition {

    /* renamed from: a, reason: collision with root package name */
    public static final ExitTransition f1877a = new ExitTransitionImpl(new TransitionData(null, null, null, null, false, null, 63));

    /* renamed from: b, reason: collision with root package name */
    public static final ExitTransition f1878b = new ExitTransitionImpl(new TransitionData(null, null, null, null, true, null, 47));

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public abstract TransitionData a();

    public final ExitTransition b(ExitTransition exitTransition) {
        Fade fade = exitTransition.a().f1973a;
        if (fade == null) {
            fade = a().f1973a;
        }
        Fade fade2 = fade;
        Slide slide = exitTransition.a().f1974b;
        if (slide == null) {
            slide = a().f1974b;
        }
        Slide slide2 = slide;
        ChangeSize changeSize = exitTransition.a().f1975c;
        if (changeSize == null) {
            changeSize = a().f1975c;
        }
        ChangeSize changeSize2 = changeSize;
        Scale scale = exitTransition.a().d;
        if (scale == null) {
            scale = a().d;
        }
        Scale scale2 = scale;
        boolean z2 = exitTransition.a().e || a().e;
        Map map = a().f1976f;
        Map map2 = exitTransition.a().f1976f;
        p0.a.s(map, "<this>");
        p0.a.s(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new ExitTransitionImpl(new TransitionData(fade2, slide2, changeSize2, scale2, z2, linkedHashMap));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ExitTransition) && p0.a.g(((ExitTransition) obj).a(), a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        if (p0.a.g(this, f1877a)) {
            return "ExitTransition.None";
        }
        if (p0.a.g(this, f1878b)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        TransitionData a2 = a();
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
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
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(a2.e);
        return sb.toString();
    }
}
