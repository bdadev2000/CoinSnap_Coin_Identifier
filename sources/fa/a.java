package fa;

import android.content.Context;
import android.view.View;
import android.view.animation.Interpolator;
import com.plantcare.ai.identifier.plantid.R;
import v8.u0;

/* loaded from: classes3.dex */
public abstract class a {
    public final Interpolator a = p0.a.b(0.1f, 0.1f, 0.0f, 1.0f);

    /* renamed from: b, reason: collision with root package name */
    public final View f17754b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17755c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17756d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17757e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.activity.b f17758f;

    public a(View view) {
        this.f17754b = view;
        Context context = view.getContext();
        this.f17755c = u0.g0(context, R.attr.motionDurationMedium2, 300);
        this.f17756d = u0.g0(context, R.attr.motionDurationShort3, 150);
        this.f17757e = u0.g0(context, R.attr.motionDurationShort2, 100);
    }
}
