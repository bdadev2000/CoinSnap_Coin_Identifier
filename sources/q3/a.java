package Q3;

import L.c;
import android.graphics.Paint;
import android.graphics.Path;
import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f2498i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f2499j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f2500k = new int[4];
    public static final float[] l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f2501a;
    public final Paint b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f2502c;

    /* renamed from: d, reason: collision with root package name */
    public int f2503d;

    /* renamed from: e, reason: collision with root package name */
    public int f2504e;

    /* renamed from: f, reason: collision with root package name */
    public int f2505f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f2506g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f2507h;

    public a() {
        Paint paint = new Paint();
        this.f2507h = paint;
        Paint paint2 = new Paint();
        this.f2501a = paint2;
        this.f2503d = c.d(ViewCompat.MEASURED_STATE_MASK, 68);
        this.f2504e = c.d(ViewCompat.MEASURED_STATE_MASK, 20);
        this.f2505f = c.d(ViewCompat.MEASURED_STATE_MASK, 0);
        paint2.setColor(this.f2503d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f2502c = new Paint(paint3);
    }
}
