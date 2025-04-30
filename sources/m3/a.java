package M3;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import com.tools.arruler.photomeasure.camera.ruler.R;
import y2.AbstractC2947c;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final TimeInterpolator f1987a;
    public final View b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1988c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1989d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1990e;

    /* renamed from: f, reason: collision with root package name */
    public f.b f1991f;

    public a(View view) {
        this.b = view;
        Context context = view.getContext();
        this.f1987a = AbstractC2947c.v(context, R.attr.motionEasingStandardDecelerateInterpolator, V.a.b(0.0f, 0.0f, 0.0f, 1.0f));
        this.f1988c = AbstractC2947c.u(context, R.attr.motionDurationMedium2, 300);
        this.f1989d = AbstractC2947c.u(context, R.attr.motionDurationShort3, 150);
        this.f1990e = AbstractC2947c.u(context, R.attr.motionDurationShort2, 100);
    }
}
