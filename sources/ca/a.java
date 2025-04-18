package ca;

import android.content.Context;
import c6.k;
import com.plantcare.ai.identifier.plantid.R;
import v8.u0;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f2775f = (int) Math.round(5.1000000000000005d);
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2776b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2777c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2778d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2779e;

    public a(Context context) {
        boolean w10 = k.w(context, R.attr.elevationOverlayEnabled, false);
        int y4 = u0.y(context, R.attr.elevationOverlayColor, 0);
        int y10 = u0.y(context, R.attr.elevationOverlayAccentColor, 0);
        int y11 = u0.y(context, R.attr.colorSurface, 0);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.a = w10;
        this.f2776b = y4;
        this.f2777c = y10;
        this.f2778d = y11;
        this.f2779e = f10;
    }
}
